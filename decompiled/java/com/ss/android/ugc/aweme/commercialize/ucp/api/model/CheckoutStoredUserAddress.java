package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C13LP;
import X.C13LQ;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutStoredUserAddress implements Serializable {

    @C09CT("city")
    public final String city;

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("created_at")
    public final Long createdAt;

    @C09CT("delivery_instructions")
    public final String deliveryInstructions;

    @C09CT("email")
    public final String email;

    @C09CT("extended_address")
    public final String extendedAddress;

    @C09CT("first_name")
    public final String firstName;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_default")
    public final Boolean isDefault;

    @C09CT("last_name")
    public final String lastName;

    @C09CT("phone_country_calling_code")
    public final String phoneCountryCallingCode;

    @C09CT("phone_number")
    public final String phoneNumber;

    @C09CT("state")
    public final String state;

    @C09CT("street_address")
    public final String streetAddress;

    @C09CT("zip_code")
    public final String zipCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutStoredUserAddress)) {
            return false;
        }
        CheckoutStoredUserAddress checkoutStoredUserAddress = (CheckoutStoredUserAddress) obj;
        return Intrinsics.LJFF(this.id, checkoutStoredUserAddress.id) && Intrinsics.LJFF(this.firstName, checkoutStoredUserAddress.firstName) && Intrinsics.LJFF(this.lastName, checkoutStoredUserAddress.lastName) && Intrinsics.LJFF(this.streetAddress, checkoutStoredUserAddress.streetAddress) && Intrinsics.LJFF(this.extendedAddress, checkoutStoredUserAddress.extendedAddress) && Intrinsics.LJFF(this.city, checkoutStoredUserAddress.city) && Intrinsics.LJFF(this.state, checkoutStoredUserAddress.state) && Intrinsics.LJFF(this.zipCode, checkoutStoredUserAddress.zipCode) && Intrinsics.LJFF(this.countryCode, checkoutStoredUserAddress.countryCode) && Intrinsics.LJFF(this.phoneCountryCallingCode, checkoutStoredUserAddress.phoneCountryCallingCode) && Intrinsics.LJFF(this.phoneNumber, checkoutStoredUserAddress.phoneNumber) && Intrinsics.LJFF(this.email, checkoutStoredUserAddress.email) && Intrinsics.LJFF(this.isDefault, checkoutStoredUserAddress.isDefault) && Intrinsics.LJFF(this.deliveryInstructions, checkoutStoredUserAddress.deliveryInstructions) && Intrinsics.LJFF(this.createdAt, checkoutStoredUserAddress.createdAt);
    }

    public final String getFormattedLine2() {
        List listLJIJI = C13LQ.LJIJI(new String[]{this.city, this.state});
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJIJI) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList.add(obj);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
        String str = this.zipCode;
        if (str == null || a0.LJJJIL(str)) {
            return strLJJLIIIJ;
        }
        if (a0.LJJJIL(strLJJLIIIJ)) {
            String str2 = this.zipCode;
            return str2 != null ? str2 : "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(' ');
        String str3 = this.zipCode;
        sbLIZ.append(str3 != null ? str3 : "");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.streetAddress;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extendedAddress;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.zipCode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.countryCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.phoneCountryCallingCode;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.phoneNumber;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.email;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str13 = this.deliveryInstructions;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l = this.createdAt;
        return iHashCode14 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "CheckoutStoredUserAddress(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", streetAddress=" + this.streetAddress + ", extendedAddress=" + this.extendedAddress + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", countryCode=" + this.countryCode + ", phoneCountryCallingCode=" + this.phoneCountryCallingCode + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", isDefault=" + this.isDefault + ", deliveryInstructions=" + this.deliveryInstructions + ", createdAt=" + this.createdAt + ')';
    }

    public final String getFormattedLine1() {
        String str = this.extendedAddress;
        if (str == null || a0.LJJJIL(str)) {
            String str2 = this.streetAddress;
            return str2 != null ? str2 : "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str3 = this.streetAddress;
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(' ');
        String str4 = this.extendedAddress;
        sbLIZ.append(str4 != null ? str4 : "");
        return a0.LJLIIIL(C2188811AlT.LIZIZ(sbLIZ)).toString();
    }

    public final String getFormattedPhoneNumber() {
        String str = this.phoneCountryCallingCode;
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '+' || Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        String str2 = this.phoneNumber;
        String str3 = str2 != null ? str2 : "";
        StringBuilder sb2 = new StringBuilder();
        int length2 = str3.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt2 = str3.charAt(i2);
            if (Character.isDigit(cCharAt2)) {
                sb2.append(cCharAt2);
            }
        }
        String string2 = sb2.toString();
        if (string.length() == 0) {
            return string2;
        }
        if (string2.length() == 0) {
            return string;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(string2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getFullName() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = this.firstName;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(' ');
        String str2 = this.lastName;
        sbLIZ.append(str2 != null ? str2 : "");
        return a0.LJLIIIL(C2188811AlT.LIZIZ(sbLIZ)).toString();
    }

    public final Boolean isDefault() {
        return this.isDefault;
    }

    public CheckoutStoredUserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, String str13, Long l) {
        this.id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.streetAddress = str4;
        this.extendedAddress = str5;
        this.city = str6;
        this.state = str7;
        this.zipCode = str8;
        this.countryCode = str9;
        this.phoneCountryCallingCode = str10;
        this.phoneNumber = str11;
        this.email = str12;
        this.isDefault = bool;
        this.deliveryInstructions = str13;
        this.createdAt = l;
    }
}
