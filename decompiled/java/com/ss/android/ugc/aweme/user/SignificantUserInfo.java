package com.ss.android.ugc.aweme.user;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SignificantUserInfo {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("avatar_url")
    public String avatarUrl;

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("short_id")
    public final String shortId;

    @C09CT("store_country")
    public final String storeCountry;

    @C09CT("uid")
    public final String uid;

    @C09CT("unique_id")
    public final String uniqueId;

    @C09CT("vdc")
    public final String vdc;

    public SignificantUserInfo() {
        this("", "", "", "", "", "", "", "", "");
    }

    public final String LIZIZ() {
        String str = this.uniqueId;
        return (str == null || str.length() == 0) ? this.shortId : this.uniqueId;
    }

    public final SignificantUserInfo LIZ(SignificantUserInfo significantUserInfo) {
        if (significantUserInfo != null && Intrinsics.LJFF(significantUserInfo.uid, this.uid)) {
            String str = this.uid;
            String str2 = this.shortId;
            if (str2.length() == 0) {
                str2 = significantUserInfo.shortId;
            }
            String str3 = this.uniqueId;
            if (str3.length() == 0) {
                str3 = significantUserInfo.uniqueId;
            }
            String str4 = this.nickname;
            if (str4.length() == 0) {
                str4 = significantUserInfo.nickname;
            }
            String str5 = this.avatarUrl;
            if (str5.length() == 0) {
                str5 = significantUserInfo.avatarUrl;
            }
            String str6 = this.secUid;
            if (str6.length() == 0) {
                str6 = significantUserInfo.secUid;
            }
            String str7 = this.storeCountry;
            if (str7.length() == 0) {
                str7 = significantUserInfo.storeCountry;
            }
            String str8 = this.vdc;
            if (str8.length() == 0) {
                str8 = significantUserInfo.vdc;
            }
            String str9 = this.sessionId;
            if (str9.length() == 0) {
                str9 = significantUserInfo.sessionId;
            }
            return new SignificantUserInfo(str, str2, str3, str4, str5, str6, str7, str8, str9);
        }
        return this;
    }

    public SignificantUserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.uid = str;
        this.shortId = str2;
        this.uniqueId = str3;
        this.nickname = str4;
        this.avatarUrl = str5;
        this.secUid = str6;
        this.storeCountry = str7;
        this.vdc = str8;
        this.sessionId = str9;
    }
}
