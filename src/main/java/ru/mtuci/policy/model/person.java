package ru.mtuci.policy.model;

import java.sql.Timestamp;

public class person extends AbstractBaseEntity {
    private String lastname;
    private String firstname;
    private String patronymic;
    private Timestamp datebirth;
    private String placebirth;
    private int docid;
    private String docnumber;
    private String phone;
    private String email;
}
