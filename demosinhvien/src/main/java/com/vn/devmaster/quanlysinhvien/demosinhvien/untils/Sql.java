package com.vn.devmaster.quanlysinhvien.demosinhvien.untils;

public class Sql {
    public static final String STUDENT_FILTER_BY_CLASS = "" +
            "select S.id id,concat(first_name,' ',last_name) as name,c.nameClasses className,s1.nameSubject subjectName,ss.point point from student s\n" +
            "left join `manage-student`.student_subject ss on s.id = ss.id_student\n" +
            "left join `manage-student`.classes c on c.id = s.classes_id\n" +
            "left join `manage-student`.subject s1 on ss.id_subject = s1.id\n" +
            "where c.nameClasses='DEV02';";

    public static final String SYTUDENT_POINT_AVG = "" +
            "select S.id id,concat(first_name,' ',last_name) as name,c.nameClasses className ,avg(ss.point) avg from student s\n" +
            "left join `manage-student`.student_subject ss on s.id = ss.id_student\n" +
            "left join `manage-student`.classes c on c.id = s.classes_id\n" +
            "group by S.id ,concat(first_name,' ',last_name) ,c.nameClasses ";

    public static final String STUDENT_AVG_8 = "" +
            "select S.id id,concat(first_name,' ',last_name) as name,c.nameClasses className ,avg(ss.point) avg from student s\n" +
            "left join `manage-student`.student_subject ss on s.id = ss.id_student\n" +
            "left join `manage-student`.classes c on c.id = s.classes_id\n" +
            "group by S.id ,concat(first_name,' ',last_name) ,c.nameClasses\n" +
            "having avg(ss.point) >= 8";

    public static final String SUBJECT_AVG = "" +
            "select sub.id id,sub.nameSubject subjectName,avg(ss.point) avg from subject sub\n" +
            "    inner join `manage-student`.student_subject ss on sub.id = ss.id_subject\n" +
            "group by sub.id, sub.nameSubject";

    public static final String STUDENT_MAX_POINT = "" +
            "select concat(s.first_name,' ',s.last_name) name,max(ss.point) maxPoint from student s\n" +
            "    inner join `manage-student`.student_subject ss on s.id = ss.id_student\n" +
            "group by concat(s.first_name,' ',s.last_name)";

    public static final String CLASS_AVG_MAX = "" +
            "select  classes.nameClasses ClassName,concat(s.first_name,' ',s.last_name) name,avg(ss.point) point from classes\n" +
            "    inner join `manage-student`.student s on classes.id = s.classes_id\n" +
            "    inner join `manage-student`.student_subject ss on s.id = ss.id_student\n" +
            "    inner join `manage-student`.subject s2 on ss.id_subject = s2.id\n" +
            "group by classes.nameClasses, concat(s.first_name,' ',s.last_name)\n" +
            "having avg(ss.point) >8\n" +
            "order by avg(ss.point) desc\n" +
            "LIMIT 1";
}
