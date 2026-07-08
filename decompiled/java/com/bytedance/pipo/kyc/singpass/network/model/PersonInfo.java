package com.bytedance.pipo.kyc.singpass.network.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class PersonInfo {

    @C09CT("AliasName")
    public final String aliasName;

    @C09CT("DateOfBirth")
    public final String dateOfBirth;

    @C09CT("EmailAddress")
    public final String emailAddress;

    @C09CT("CPFEmployerHistory")
    public final Map<String, String> employerHistory;

    @C09CT("HanYuPinYinAliasName")
    public final String hanYuPinYinAliasName;

    @C09CT("HanYuPinYinName")
    public final String hanYuPinYinName;

    @C09CT("MaritalStatus")
    public final int maritalStatus;

    @C09CT("MarriedName")
    public final String marriedName;

    @C09CT("MobileNumber")
    public final String mobileNumber;

    @C09CT("NRICOrFIN")
    public final String nRICOrFIN;

    @C09CT("Nationality")
    public final String nationality;

    @C09CT("PrincipalName")
    public final String principalName;

    @C09CT("RegisteredAddress")
    public final String registeredAddress;

    @C09CT("Sex")
    public final String sex;

    public PersonInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map<String, String> map, int i) {
        this.principalName = str;
        this.aliasName = str2;
        this.hanYuPinYinName = str3;
        this.hanYuPinYinAliasName = str4;
        this.marriedName = str5;
        this.dateOfBirth = str6;
        this.nationality = str7;
        this.registeredAddress = str8;
        this.nRICOrFIN = str9;
        this.mobileNumber = str10;
        this.emailAddress = str11;
        this.sex = str12;
        this.employerHistory = map;
        this.maritalStatus = i;
    }
}
