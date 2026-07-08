package com.facebook;

import X.C0W7K;
import X.C2340609Fc;
import X.C778860Ugu;
import X.C786410Ut5;
import X.C821420WKe;
import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthenticationTokenClaims implements Parcelable {
    public final String aud;
    public final String email;
    public final long exp;
    public final String familyName;
    public final String givenName;
    public final long iat;
    public final String iss;
    public final String jti;
    public final String middleName;
    public final String name;
    public final String nonce;
    public final String picture;
    public final String sub;
    public final Map<String, Integer> userAgeRange;
    public final String userBirthday;
    public final Set<String> userFriends;
    public final String userGender;
    public final Map<String, String> userHometown;
    public final String userLink;
    public final Map<String, String> userLocation;
    public static final C821420WKe Companion = new C821420WKe();
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new C854630Xfp(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.jti);
        jSONObject.put("iss", this.iss);
        jSONObject.put("aud", this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put("exp", this.exp);
        jSONObject.put("iat", this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put("user_age_range", new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put("user_hometown", new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put("user_location", new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((527 + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + C786410Ut5.Y2(this.exp)) * 31) + C786410Ut5.Y2(this.iat)) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.familyName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picture;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.userFriends;
        int iHashCode8 = (iHashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.userBirthday;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.userHometown;
        int iHashCode11 = (iHashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.userLocation;
        int iHashCode12 = (iHashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.userGender;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userLink;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        return C786410Ut5.J3(LIZ());
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        Set<String> setUnmodifiableSet;
        Map<String, Integer> mapUnmodifiableMap;
        Map<String, String> mapUnmodifiableMap2;
        String string = parcel.readString();
        C0W7K.LJ(string, "jti");
        this.jti = string;
        String string2 = parcel.readString();
        C0W7K.LJ(string2, "iss");
        this.iss = string2;
        String string3 = parcel.readString();
        C0W7K.LJ(string3, "aud");
        this.aud = string3;
        String string4 = parcel.readString();
        C0W7K.LJ(string4, "nonce");
        this.nonce = string4;
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        String string5 = parcel.readString();
        C0W7K.LJ(string5, "sub");
        this.sub = string5;
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        Map<String, String> mapUnmodifiableMap3 = null;
        if (arrayListCreateStringArrayList != null) {
            setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList));
        } else {
            setUnmodifiableSet = null;
        }
        this.userFriends = setUnmodifiableSet;
        this.userBirthday = parcel.readString();
        HashMap hashMap = parcel.readHashMap(C2340609Fc.LIZ.getClass().getClassLoader());
        if ((hashMap instanceof HashMap) && hashMap != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(hashMap);
        } else {
            mapUnmodifiableMap = null;
        }
        this.userAgeRange = mapUnmodifiableMap;
        HashMap hashMap2 = parcel.readHashMap(C778860Ugu.LIZ.getClass().getClassLoader());
        if ((hashMap2 instanceof HashMap) && hashMap2 != null) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
        } else {
            mapUnmodifiableMap2 = null;
        }
        this.userHometown = mapUnmodifiableMap2;
        HashMap hashMap3 = parcel.readHashMap(C778860Ugu.class.getClassLoader());
        if ((hashMap3 instanceof HashMap) && hashMap3 != null) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(hashMap3);
        }
        this.userLocation = mapUnmodifiableMap3;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        if (Intrinsics.LJFF(this.jti, authenticationTokenClaims.jti) && Intrinsics.LJFF(this.iss, authenticationTokenClaims.iss) && Intrinsics.LJFF(this.aud, authenticationTokenClaims.aud) && Intrinsics.LJFF(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && Intrinsics.LJFF(this.sub, authenticationTokenClaims.sub) && Intrinsics.LJFF(this.name, authenticationTokenClaims.name) && Intrinsics.LJFF(this.givenName, authenticationTokenClaims.givenName) && Intrinsics.LJFF(this.middleName, authenticationTokenClaims.middleName) && Intrinsics.LJFF(this.familyName, authenticationTokenClaims.familyName) && Intrinsics.LJFF(this.email, authenticationTokenClaims.email) && Intrinsics.LJFF(this.picture, authenticationTokenClaims.picture) && Intrinsics.LJFF(this.userFriends, authenticationTokenClaims.userFriends) && Intrinsics.LJFF(this.userBirthday, authenticationTokenClaims.userBirthday) && Intrinsics.LJFF(this.userAgeRange, authenticationTokenClaims.userAgeRange) && Intrinsics.LJFF(this.userHometown, authenticationTokenClaims.userHometown) && Intrinsics.LJFF(this.userLocation, authenticationTokenClaims.userLocation) && Intrinsics.LJFF(this.userGender, authenticationTokenClaims.userGender) && Intrinsics.LJFF(this.userLink, authenticationTokenClaims.userLink)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AuthenticationTokenClaims(java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.jti);
        parcel.writeString(this.iss);
        parcel.writeString(this.aud);
        parcel.writeString(this.nonce);
        parcel.writeLong(this.exp);
        parcel.writeLong(this.iat);
        parcel.writeString(this.sub);
        parcel.writeString(this.name);
        parcel.writeString(this.givenName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.familyName);
        parcel.writeString(this.email);
        parcel.writeString(this.picture);
        if (this.userFriends == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(this.userFriends));
        }
        parcel.writeString(this.userBirthday);
        parcel.writeMap(this.userAgeRange);
        parcel.writeMap(this.userHometown);
        parcel.writeMap(this.userLocation);
        parcel.writeString(this.userGender);
        parcel.writeString(this.userLink);
    }
}
