SELECT id, name FROM student INNER JOIN class
 ON student.class_title = class.class_title,
 WHERE class.teacher_name = 'Ms. LoveLace';

/**
SELECT s.id, s.student_name
FROM student s
JOIN class c ON s.class_title = c.class_title
WHERE c.teacher_name = 'Ms. Lovelace';
