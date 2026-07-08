package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.model.UrlStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SummarySourceUser implements Serializable {

    @C09CT("avatar_larger")
    public final UrlStruct avatarLarger;

    @C09CT("avatar_medium")
    public final UrlStruct avatarMedium;

    @C09CT("avatar_thumb")
    public final UrlStruct avatarThumb;

    @C09CT("gender")
    public final Integer gender;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("short_id")
    public final String shortId;

    @C09CT("signature")
    public final String signature;

    @C09CT("uid")
    public final String uid;

    public SummarySourceUser() {
        this(null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummarySourceUser)) {
            return false;
        }
        SummarySourceUser summarySourceUser = (SummarySourceUser) obj;
        return Intrinsics.LJFF(this.uid, summarySourceUser.uid) && Intrinsics.LJFF(this.shortId, summarySourceUser.shortId) && Intrinsics.LJFF(this.nickname, summarySourceUser.nickname) && Intrinsics.LJFF(this.gender, summarySourceUser.gender) && Intrinsics.LJFF(this.signature, summarySourceUser.signature) && Intrinsics.LJFF(this.avatarLarger, summarySourceUser.avatarLarger) && Intrinsics.LJFF(this.avatarThumb, summarySourceUser.avatarThumb) && Intrinsics.LJFF(this.avatarMedium, summarySourceUser.avatarMedium);
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shortId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.gender;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.signature;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlStruct urlStruct = this.avatarLarger;
        int iHashCode6 = (iHashCode5 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
        UrlStruct urlStruct2 = this.avatarThumb;
        int iHashCode7 = (iHashCode6 + (urlStruct2 == null ? 0 : urlStruct2.hashCode())) * 31;
        UrlStruct urlStruct3 = this.avatarMedium;
        return iHashCode7 + (urlStruct3 != null ? urlStruct3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummarySourceUser(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", shortId=");
        sbLIZ.append(this.shortId);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", gender=");
        sbLIZ.append(this.gender);
        sbLIZ.append(", signature=");
        sbLIZ.append(this.signature);
        sbLIZ.append(", avatarLarger=");
        sbLIZ.append(this.avatarLarger);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(", avatarMedium=");
        sbLIZ.append(this.avatarMedium);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SummarySourceUser(String str, String str2, String str3, Integer num, String str4, UrlStruct urlStruct, UrlStruct urlStruct2, UrlStruct urlStruct3) {
        this.uid = str;
        this.shortId = str2;
        this.nickname = str3;
        this.gender = num;
        this.signature = str4;
        this.avatarLarger = urlStruct;
        this.avatarThumb = urlStruct2;
        this.avatarMedium = urlStruct3;
    }
}
