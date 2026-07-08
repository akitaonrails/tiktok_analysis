package com.ss.android.ugc.aweme.challenge.model;

import X.C01GW;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class ChallengeDetailParam implements Serializable, IRouteArg {
    public static final Parcelable.Creator<ChallengeDetailParam> CREATOR = new Creator();
    public String awemeId;
    public String bannerId;
    public String challengeFrom;
    public int challengeType;
    public int clickReason;
    public final C01GW enterFrom$delegate;
    public String enterpriseUid;
    public String extra_challenge_id;
    public String extra_cid;
    public String from;
    public String fromToken;
    public Integer isBundled;
    public String isCommerce;
    public boolean isHashTag;
    public String parentTagId;
    public String previewToken;
    public String processId;
    public String shootEnterFrom;
    public int showTabIndex;

    public static final class Creator implements Parcelable.Creator<ChallengeDetailParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeDetailParam createFromParcel(Parcel parcel) {
            return new ChallengeDetailParam(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeDetailParam[] newArray(int i) {
            return new ChallengeDetailParam[i];
        }
    }

    public final ChallengeDetailParam copy(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13) {
        return new ChallengeDetailParam(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, str12, str13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeDetailParam)) {
            return false;
        }
        ChallengeDetailParam challengeDetailParam = (ChallengeDetailParam) obj;
        return Intrinsics.LJFF(this.extra_challenge_id, challengeDetailParam.extra_challenge_id) && Intrinsics.LJFF(this.challengeFrom, challengeDetailParam.challengeFrom) && this.challengeType == challengeDetailParam.challengeType && Intrinsics.LJFF(this.parentTagId, challengeDetailParam.parentTagId) && Intrinsics.LJFF(this.awemeId, challengeDetailParam.awemeId) && Intrinsics.LJFF(this.shootEnterFrom, challengeDetailParam.shootEnterFrom) && Intrinsics.LJFF(this.bannerId, challengeDetailParam.bannerId) && Intrinsics.LJFF(this.isBundled, challengeDetailParam.isBundled) && Intrinsics.LJFF(this.from, challengeDetailParam.from) && Intrinsics.LJFF(this.extra_cid, challengeDetailParam.extra_cid) && Intrinsics.LJFF(this.fromToken, challengeDetailParam.fromToken) && this.isHashTag == challengeDetailParam.isHashTag && this.clickReason == challengeDetailParam.clickReason && Intrinsics.LJFF(this.enterpriseUid, challengeDetailParam.enterpriseUid) && this.showTabIndex == challengeDetailParam.showTabIndex && Intrinsics.LJFF(this.isCommerce, challengeDetailParam.isCommerce) && Intrinsics.LJFF(this.previewToken, challengeDetailParam.previewToken) && Intrinsics.LJFF(this.processId, challengeDetailParam.processId);
    }

    public int hashCode() {
        String str = this.extra_challenge_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.challengeFrom;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.challengeType) * 31;
        String str3 = this.parentTagId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.awemeId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shootEnterFrom;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bannerId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.isBundled;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.from;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.extra_cid;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fromToken;
        int iHashCode10 = (((((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + C786410Ut5.Z2(this.isHashTag)) * 31) + this.clickReason) * 31;
        String str10 = this.enterpriseUid;
        int iHashCode11 = (((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.showTabIndex) * 31;
        String str11 = this.isCommerce;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.previewToken;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.processId;
        return iHashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeDetailParam(extra_challenge_id=" + this.extra_challenge_id + ", challengeFrom=" + this.challengeFrom + ", challengeType=" + this.challengeType + ", parentTagId=" + this.parentTagId + ", awemeId=" + this.awemeId + ", shootEnterFrom=" + this.shootEnterFrom + ", bannerId=" + this.bannerId + ", isBundled=" + this.isBundled + ", from=" + this.from + ", extra_cid=" + this.extra_cid + ", fromToken=" + this.fromToken + ", isHashTag=" + this.isHashTag + ", clickReason=" + this.clickReason + ", enterpriseUid=" + this.enterpriseUid + ", showTabIndex=" + this.showTabIndex + ", isCommerce=" + this.isCommerce + ", previewToken=" + this.previewToken + ", processId=" + this.processId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.extra_challenge_id);
        parcel.writeString(this.challengeFrom);
        parcel.writeInt(this.challengeType);
        parcel.writeString(this.parentTagId);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.bannerId);
        Integer num = this.isBundled;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.from);
        parcel.writeString(this.extra_cid);
        parcel.writeString(this.fromToken);
        parcel.writeInt(this.isHashTag ? 1 : 0);
        parcel.writeInt(this.clickReason);
        parcel.writeString(this.enterpriseUid);
        parcel.writeInt(this.showTabIndex);
        parcel.writeString(this.isCommerce);
        parcel.writeString(this.previewToken);
        parcel.writeString(this.processId);
    }

    public ChallengeDetailParam() {
        this("", "", 0, "", "", "", "", 0, "", "", "", false, 0, "", -1, null, null, "");
    }

    public final String getCid() {
        String str = this.extra_challenge_id;
        return (str == null || str.length() == 0) ? this.extra_cid : this.extra_challenge_id;
    }

    public final String getEnterFrom() {
        return (String) this.enterFrom$delegate.getValue();
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final String getChallengeFrom() {
        return this.challengeFrom;
    }

    public final int getChallengeType() {
        return this.challengeType;
    }

    public final int getClickReason() {
        return this.clickReason;
    }

    public final String getEnterpriseUid() {
        return this.enterpriseUid;
    }

    public final String getExtra_challenge_id() {
        return this.extra_challenge_id;
    }

    public final String getExtra_cid() {
        return this.extra_cid;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getFromToken() {
        return this.fromToken;
    }

    public final String getParentTagId() {
        return this.parentTagId;
    }

    public final String getPreviewToken() {
        return this.previewToken;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final int getShowTabIndex() {
        return this.showTabIndex;
    }

    public final Integer isBundled() {
        return this.isBundled;
    }

    public final String isCommerce() {
        return this.isCommerce;
    }

    public final boolean isHashTag() {
        return this.isHashTag;
    }

    public ChallengeDetailParam(String str) {
        this(str, "", 0, "", "", "", "", 0, "", "", "", false, 0, "", -1, null, null, "");
    }

    public static ChallengeDetailParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num2;
        String str7;
        String str8;
        Boolean bool;
        Integer num3;
        String str9;
        Integer num4;
        String str10;
        String str11;
        String str12;
        int iIntValue;
        boolean zBooleanValue;
        int iIntValue2;
        int iIntValue3;
        String str13 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey(FollowStatusChangeMethod.PARAM_UID)) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get(FollowStatusChangeMethod.PARAM_UID), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("extra_challenge_from")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_challenge_from"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE"), Integer.class);
            if (num == null) {
                i += 4;
            }
        } else {
            i += 4;
            num = null;
        }
        if (bundle.containsKey("extra_parent_tag_id")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_parent_tag_id"), String.class);
        } else {
            i += 8;
            str3 = null;
        }
        if (bundle.containsKey("aweme_id")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("aweme_id"), String.class);
        } else {
            i += 16;
            str4 = null;
        }
        if (bundle.containsKey("shoot_enter_from")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("shoot_enter_from"), String.class);
        } else {
            i += 32;
            str5 = null;
        }
        if (bundle.containsKey("banner_id")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("banner_id"), String.class);
        } else {
            i += 64;
            str6 = null;
        }
        if (bundle.containsKey("is_bundled")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("is_bundled"), Integer.class);
        } else {
            i += 128;
            num2 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 256;
            str7 = null;
        }
        if (bundle.containsKey("cid")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("cid"), String.class);
        } else {
            i += 512;
            str8 = null;
        }
        if (bundle.containsKey("from_token")) {
            str13 = (String) RouteParser.INSTANCE.parse(bundle.get("from_token"), String.class);
        } else {
            i += 1024;
        }
        if (bundle.containsKey("extra_challenge_is_hashtag")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("extra_challenge_is_hashtag"), Boolean.class);
            if (bool == null) {
                i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            }
        } else {
            i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            bool = null;
        }
        if (bundle.containsKey("click_reason")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("click_reason"), Integer.class);
            if (num3 == null) {
                i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            }
        } else {
            i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            num3 = null;
        }
        if (bundle.containsKey("extra_enterprise_challenge_uid")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_enterprise_challenge_uid"), String.class);
        } else {
            i += 8192;
            str9 = null;
        }
        if (bundle.containsKey("show_tab_index")) {
            num4 = (Integer) RouteParser.INSTANCE.parse(bundle.get("show_tab_index"), Integer.class);
            if (num4 == null) {
                i += 16384;
            }
        } else {
            i += 16384;
            num4 = null;
        }
        if (bundle.containsKey("is_commerce")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("is_commerce"), String.class);
        } else {
            i += 32768;
            str10 = null;
        }
        if (bundle.containsKey("preview_token")) {
            str11 = (String) RouteParser.INSTANCE.parse(bundle.get("preview_token"), String.class);
        } else {
            i += 65536;
            str11 = null;
        }
        if (bundle.containsKey("process_id")) {
            str12 = (String) RouteParser.INSTANCE.parse(bundle.get("process_id"), String.class);
        } else {
            i += 131072;
            str12 = null;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (num3 != null) {
            iIntValue2 = num3.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (num4 != null) {
            iIntValue3 = num4.intValue();
        } else {
            iIntValue3 = 0;
        }
        String str14 = null;
        String str15 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        int i2 = 0;
        if ((i & 4) != 0) {
            iIntValue = 0;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        if ((i & 32) != 0) {
            str5 = "";
        }
        if ((i & 64) != 0) {
            str6 = "";
        }
        if ((i & 128) != 0) {
            num2 = 0;
        }
        if ((i & 256) != 0) {
            str7 = "";
        }
        if ((i & 512) != 0) {
            str8 = "";
        }
        if ((i & 1024) != 0) {
            str13 = "";
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            zBooleanValue = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
            i2 = iIntValue2;
        }
        if ((i & 8192) != 0) {
            str9 = "";
        }
        if ((i & 16384) != 0) {
            iIntValue3 = -1;
        }
        String str16 = null;
        if ((32768 & i) == 0) {
            str14 = str10;
        }
        if ((65536 & i) == 0) {
            str16 = str11;
        }
        if ((i & 131072) == 0) {
            str15 = str12;
        }
        return new ChallengeDetailParam(str, str2, iIntValue, str3, str4, str5, str6, num2, str7, str8, str13, zBooleanValue, i2, str9, iIntValue3, str14, str16, str15);
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setBannerId(String str) {
        this.bannerId = str;
    }

    public final void setBundled(Integer num) {
        this.isBundled = num;
    }

    public final void setChallengeFrom(String str) {
        this.challengeFrom = str;
    }

    public final void setChallengeType(int i) {
        this.challengeType = i;
    }

    public final void setCid(String str) {
        this.extra_challenge_id = str;
    }

    public final void setClickReason(int i) {
        this.clickReason = i;
    }

    public final void setCommerce(String str) {
        this.isCommerce = str;
    }

    public final void setEnterpriseUid(String str) {
        this.enterpriseUid = str;
    }

    public final void setExtra_challenge_id(String str) {
        this.extra_challenge_id = str;
    }

    public final void setExtra_cid(String str) {
        this.extra_cid = str;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setFromToken(String str) {
        this.fromToken = str;
    }

    public final void setHashTag(boolean z) {
        this.isHashTag = z;
    }

    public final void setParentTagId(String str) {
        this.parentTagId = str;
    }

    public final void setPreviewToken(String str) {
        this.previewToken = str;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShowTabIndex(int i) {
        this.showTabIndex = i;
    }

    public ChallengeDetailParam(String str, String str2) {
        this(str, str2, 0, "", "", "", "", 0, "", "", "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i) {
        this(str, str2, i, "", "", "", "", 0, "", "", "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3) {
        this(str, str2, i, str3, "", "", "", 0, "", "", "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4) {
        this(str, str2, i, str3, str4, "", "", 0, "", "", "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5) {
        this(str, str2, i, str3, str4, str5, "", 0, "", "", "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this(str, str2, i, str3, str4, str5, str6, 0, "", "", "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num) {
        this(str, str2, i, str3, str4, str5, str6, num, "", "", "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, "", "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, "", false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, false, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, 0, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, "", -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, -1, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, null, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, null, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, str12, "");
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13) {
        this.extra_challenge_id = str;
        this.challengeFrom = str2;
        this.challengeType = i;
        this.parentTagId = str3;
        this.awemeId = str4;
        this.shootEnterFrom = str5;
        this.bannerId = str6;
        this.isBundled = num;
        this.from = str7;
        this.extra_cid = str8;
        this.fromToken = str9;
        this.isHashTag = z;
        this.clickReason = i2;
        this.enterpriseUid = str10;
        this.showTabIndex = i3;
        this.isCommerce = str11;
        this.previewToken = str12;
        this.processId = str13;
        this.enterFrom$delegate = C452501pT.LIZIZ(new AwS565S0100000_21(this, 100));
        if (TextUtils.equals(this.isCommerce, "1") || u.LJIJI("true", this.isCommerce, true)) {
            ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIL(getCid());
        }
    }
}
