package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import X.C19837412jU;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ContactModelV2 {
    public static final int $stable = 8;

    @C09CT("addresses")
    public List<String> addresses;

    @C09CT("birthday")
    public String birthday;

    @C09CT("department_name")
    public String department;

    @C09CT("emails")
    public List<String> emails;
    public String familyName;
    public String givenName;

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("instant_message_addresses")
    public Map<String, String> instantMessageAddresses;

    @C09CT("job_desc")
    public String jobDesc;

    @C09CT("modification_date")
    public String modificationDate;

    @C09CT("name")
    public String name;

    @C09CT("nick_name")
    public String nickName;

    @C09CT("note")
    public String note;

    @C09CT("organization_name")
    public String organization;

    @C09CT("phone_number")
    public List<String> phoneNumber;
    public transient String photoUri;
    public String section;

    @C09CT("urls")
    public List<String> urls;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public final List<String> getAddresses() {
        return this.addresses;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getDepartment() {
        return this.department;
    }

    public final List<String> getEmails() {
        return this.emails;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Map<String, String> getInstantMessageAddresses() {
        return this.instantMessageAddresses;
    }

    public final String getJobDesc() {
        return this.jobDesc;
    }

    public final String getModificationDate() {
        return this.modificationDate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getOrganization() {
        return this.organization;
    }

    public final List<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final String getSection() {
        return this.section;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(ContactModelV2.class, obj.getClass())) {
            return false;
        }
        ContactModelV2 contactModelV2 = (ContactModelV2) obj;
        if (C19837412jU.LIZ(this.phoneNumber, contactModelV2.phoneNumber) && C19837412jU.LIZ(this.name, contactModelV2.name)) {
            return true;
        }
        return false;
    }

    public final void setAddresses(List<String> list) {
        this.addresses = list;
    }

    public final void setBirthday(String str) {
        this.birthday = str;
    }

    public final void setDepartment(String str) {
        this.department = str;
    }

    public final void setEmails(List<String> list) {
        this.emails = list;
    }

    public final void setFamilyName(String str) {
        this.familyName = str;
    }

    public final void setGivenName(String str) {
        this.givenName = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setInstantMessageAddresses(Map<String, String> map) {
        this.instantMessageAddresses = map;
    }

    public final void setJobDesc(String str) {
        this.jobDesc = str;
    }

    public final void setModificationDate(String str) {
        this.modificationDate = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final void setOrganization(String str) {
        this.organization = str;
    }

    public final void setPhoneNumber(List<String> list) {
        this.phoneNumber = list;
    }

    public final void setPhotoUri(String str) {
        this.photoUri = str;
    }

    public final void setSection(String str) {
        this.section = str;
    }

    public final void setUrls(List<String> list) {
        this.urls = list;
    }
}
