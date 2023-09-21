package com.vn.devmaster.quanlysinhvien.demosinhvien.projection;

public interface Subject_avg {
//    Cho biết trung bình điểm thi theo từng môn,
//    gồm các thông tin: Mã môn, Tên  môn, Trung bình điểm thi
    Integer getId();
    String getSubjectName();
    Float getAvg();
}
