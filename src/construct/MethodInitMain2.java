package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"user1",15,90);

//        member1.name="user1";
//        member1.age=15;
//        member1.grade=90;

        MemberInit member2 = new MemberInit();
        initMember(member2,"user2",16,80);
//        member2.name="user2";
//        member2.age=16;
//        member2.grade=80;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members){
            System.out.println("이름:"+member.name+"나이:"+member.age+"성적:"+member.grade);
        }
    }
        static void initMember(MemberInit member, String name, int age, int grade ){
            member.name = name;
            member.age = age;
            member.grade =grade;
        }

}
