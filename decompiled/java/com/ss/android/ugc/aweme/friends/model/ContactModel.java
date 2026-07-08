package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import X.C09DE;
import X.C19837412jU;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ContactModel {

    @C09DE(deserialize = false, serialize = false)
    public String firstName;

    @C09CT("invited")
    @C09DE
    public boolean isInvited;

    @C09DE(deserialize = false, serialize = false)
    public String lastName;

    @C09CT("name")
    @C09DE
    public String name;

    @C09DE(deserialize = false, serialize = false)
    public int originIndex;

    @C09CT("phone_number")
    @C09DE
    public String phoneNumber;
    public transient String photoUri;

    @C09CT("region_code")
    @C09DE
    public String regionCode;

    @C09DE(deserialize = false, serialize = false)
    public String section;

    @C09DE(deserialize = false, serialize = false)
    public String url;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public ContactModel() {
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOriginIndex() {
        return this.originIndex;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isInvited() {
        return this.isInvited;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(ContactModel.class, obj.getClass())) {
            return false;
        }
        ContactModel contactModel = (ContactModel) obj;
        if (C19837412jU.LIZ(this.phoneNumber, contactModel.phoneNumber) && C19837412jU.LIZ(this.name, contactModel.name)) {
            return true;
        }
        return false;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setInvited(boolean z) {
        this.isInvited = z;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOriginIndex(int i) {
        this.originIndex = i;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public final void setPhotoUri(String str) {
        this.photoUri = str;
    }

    public final void setRegionCode(String str) {
        this.regionCode = str;
    }

    public final void setSection(String str) {
        this.section = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public ContactModel(String str, String str2) {
        this.phoneNumber = str;
        this.name = str2;
    }
}
