package com.ss.android.ugc.profile.platform.framework.aweme.profile.arg;

import X.C1252480ihK;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.arg.UserProfileArg;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileArg implements IRouteArg {
    public final String afAdsetId;
    public final String afCampaignId;
    public final String aid;
    public final Bundle bundle;
    public final String compatiblSecUserId;
    public final String enterFrom;
    public final String enterMethod;
    public final Integer enterpriseType;
    public final String eventType;
    public String extraSecUserId;
    public String extraUserId;
    public final String fromRequestId;
    public final String iD;
    public final boolean isDDL;
    public final boolean isFromLiveRecord;
    public int isFromPush;
    public final String isFromSocialAvatarPage;
    public final String label;
    public final C1252480ihK liveFollowReportParams;
    public final String liveRequestId;
    public final String liveRoomId;
    public final String liveRoomOwnerId;
    public final String liveType;
    public final HashMap<String, String> logExtra;
    public final String mediaSource;
    public final String noticeType;
    public final String position;
    public final String preEnterFrom;
    public final String previousPage;
    public final String profileFromScene;
    public final String profileFromSceneV2;
    public String pushId;
    public String pushType;
    public final String relationFrom;
    public final String returnLive;
    public final String sceneId;
    public final String searchRequestId;
    public final String sourceAid;
    public final String stickyContent;
    public final String teenSecUserId;
    public final String trackParams;
    public final String type;
    public final String uniqueId;
    public static final Parcelable.Creator<UserProfileArg> CREATOR = new Parcelable.Creator<UserProfileArg>() { // from class: X.0ilJ
        @Override // android.os.Parcelable.Creator
        public final UserProfileArg createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            HashMap map;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            Bundle bundle = parcel.readBundle(UserProfileArg.class.getClassLoader());
            String string31 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                map = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new UserProfileArg(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, numValueOf, string12, string13, string14, string15, string16, string17, string18, z, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, bundle, string31, map, string32, string33, string34, z2, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserProfileArg[] newArray(int i) {
            return new UserProfileArg[i];
        }
    };
    public static final int $stable = 8;

    public UserProfileArg() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public final UserProfileArg copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map, String str32, String str33, String str34, boolean z2, int i, String str35, String str36) {
        return new UserProfileArg(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, map, str32, str33, str34, z2, i, str35, str36);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileArg)) {
            return false;
        }
        UserProfileArg userProfileArg = (UserProfileArg) obj;
        return Intrinsics.LJFF(this.extraUserId, userProfileArg.extraUserId) && Intrinsics.LJFF(this.iD, userProfileArg.iD) && Intrinsics.LJFF(this.teenSecUserId, userProfileArg.teenSecUserId) && Intrinsics.LJFF(this.extraSecUserId, userProfileArg.extraSecUserId) && Intrinsics.LJFF(this.compatiblSecUserId, userProfileArg.compatiblSecUserId) && Intrinsics.LJFF(this.profileFromScene, userProfileArg.profileFromScene) && Intrinsics.LJFF(this.profileFromSceneV2, userProfileArg.profileFromSceneV2) && Intrinsics.LJFF(this.uniqueId, userProfileArg.uniqueId) && Intrinsics.LJFF(this.label, userProfileArg.label) && Intrinsics.LJFF(this.aid, userProfileArg.aid) && Intrinsics.LJFF(this.type, userProfileArg.type) && Intrinsics.LJFF(this.enterpriseType, userProfileArg.enterpriseType) && Intrinsics.LJFF(this.enterMethod, userProfileArg.enterMethod) && Intrinsics.LJFF(this.liveRequestId, userProfileArg.liveRequestId) && Intrinsics.LJFF(this.liveRoomId, userProfileArg.liveRoomId) && Intrinsics.LJFF(this.fromRequestId, userProfileArg.fromRequestId) && Intrinsics.LJFF(this.returnLive, userProfileArg.returnLive) && Intrinsics.LJFF(this.liveRoomOwnerId, userProfileArg.liveRoomOwnerId) && Intrinsics.LJFF(this.liveType, userProfileArg.liveType) && this.isFromLiveRecord == userProfileArg.isFromLiveRecord && Intrinsics.LJFF(this.sceneId, userProfileArg.sceneId) && Intrinsics.LJFF(this.enterFrom, userProfileArg.enterFrom) && Intrinsics.LJFF(this.preEnterFrom, userProfileArg.preEnterFrom) && Intrinsics.LJFF(this.eventType, userProfileArg.eventType) && Intrinsics.LJFF(this.previousPage, userProfileArg.previousPage) && Intrinsics.LJFF(this.isFromSocialAvatarPage, userProfileArg.isFromSocialAvatarPage) && Intrinsics.LJFF(this.relationFrom, userProfileArg.relationFrom) && Intrinsics.LJFF(this.sourceAid, userProfileArg.sourceAid) && Intrinsics.LJFF(this.trackParams, userProfileArg.trackParams) && Intrinsics.LJFF(this.position, userProfileArg.position) && Intrinsics.LJFF(this.searchRequestId, userProfileArg.searchRequestId) && Intrinsics.LJFF(this.stickyContent, userProfileArg.stickyContent) && Intrinsics.LJFF(this.bundle, userProfileArg.bundle) && Intrinsics.LJFF(this.noticeType, userProfileArg.noticeType) && Intrinsics.LJFF(this.logExtra, userProfileArg.logExtra) && Intrinsics.LJFF(this.afCampaignId, userProfileArg.afCampaignId) && Intrinsics.LJFF(this.afAdsetId, userProfileArg.afAdsetId) && Intrinsics.LJFF(this.mediaSource, userProfileArg.mediaSource) && this.isDDL == userProfileArg.isDDL && this.isFromPush == userProfileArg.isFromPush && Intrinsics.LJFF(this.pushType, userProfileArg.pushType) && Intrinsics.LJFF(this.pushId, userProfileArg.pushId);
    }

    public int hashCode() {
        String str = this.extraUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iD;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.teenSecUserId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extraSecUserId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.compatiblSecUserId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.profileFromScene;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.profileFromSceneV2;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.uniqueId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.label;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.aid;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.type;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.enterpriseType;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str12 = this.enterMethod;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.liveRequestId;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.liveRoomId;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.fromRequestId;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.returnLive;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.liveRoomOwnerId;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.liveType;
        int iHashCode19 = (((iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31) + C786410Ut5.Z2(this.isFromLiveRecord)) * 31;
        String str19 = this.sceneId;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.enterFrom;
        int iHashCode21 = (((iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31) + this.preEnterFrom.hashCode()) * 31;
        String str21 = this.eventType;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.previousPage;
        int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.isFromSocialAvatarPage;
        int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.relationFrom;
        int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.sourceAid;
        int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.trackParams;
        int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.position;
        int iHashCode28 = (iHashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.searchRequestId;
        int iHashCode29 = (iHashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.stickyContent;
        int iHashCode30 = (iHashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Bundle bundle = this.bundle;
        int iHashCode31 = (((iHashCode30 + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.noticeType.hashCode()) * 31;
        HashMap<String, String> map = this.logExtra;
        int iHashCode32 = (iHashCode31 + (map == null ? 0 : map.hashCode())) * 31;
        String str30 = this.afCampaignId;
        int iHashCode33 = (iHashCode32 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.afAdsetId;
        int iHashCode34 = (iHashCode33 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.mediaSource;
        int iHashCode35 = (((((iHashCode34 + (str32 == null ? 0 : str32.hashCode())) * 31) + C786410Ut5.Z2(this.isDDL)) * 31) + this.isFromPush) * 31;
        String str33 = this.pushType;
        int iHashCode36 = (iHashCode35 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.pushId;
        return iHashCode36 + (str34 != null ? str34.hashCode() : 0);
    }

    public String toString() {
        return "UserProfileArg(extraUserId=" + this.extraUserId + ", iD=" + this.iD + ", teenSecUserId=" + this.teenSecUserId + ", extraSecUserId=" + this.extraSecUserId + ", compatiblSecUserId=" + this.compatiblSecUserId + ", profileFromScene=" + this.profileFromScene + ", profileFromSceneV2=" + this.profileFromSceneV2 + ", uniqueId=" + this.uniqueId + ", label=" + this.label + ", aid=" + this.aid + ", type=" + this.type + ", enterpriseType=" + this.enterpriseType + ", enterMethod=" + this.enterMethod + ", liveRequestId=" + this.liveRequestId + ", liveRoomId=" + this.liveRoomId + ", fromRequestId=" + this.fromRequestId + ", returnLive=" + this.returnLive + ", liveRoomOwnerId=" + this.liveRoomOwnerId + ", liveType=" + this.liveType + ", isFromLiveRecord=" + this.isFromLiveRecord + ", sceneId=" + this.sceneId + ", enterFrom=" + this.enterFrom + ", preEnterFrom=" + this.preEnterFrom + ", eventType=" + this.eventType + ", previousPage=" + this.previousPage + ", isFromSocialAvatarPage=" + this.isFromSocialAvatarPage + ", relationFrom=" + this.relationFrom + ", sourceAid=" + this.sourceAid + ", trackParams=" + this.trackParams + ", position=" + this.position + ", searchRequestId=" + this.searchRequestId + ", stickyContent=" + this.stickyContent + ", bundle=" + this.bundle + ", noticeType=" + this.noticeType + ", logExtra=" + this.logExtra + ", afCampaignId=" + this.afCampaignId + ", afAdsetId=" + this.afAdsetId + ", mediaSource=" + this.mediaSource + ", isDDL=" + this.isDDL + ", isFromPush=" + this.isFromPush + ", pushType=" + this.pushType + ", pushId=" + this.pushId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.extraUserId);
        parcel.writeString(this.iD);
        parcel.writeString(this.teenSecUserId);
        parcel.writeString(this.extraSecUserId);
        parcel.writeString(this.compatiblSecUserId);
        parcel.writeString(this.profileFromScene);
        parcel.writeString(this.profileFromSceneV2);
        parcel.writeString(this.uniqueId);
        parcel.writeString(this.label);
        parcel.writeString(this.aid);
        parcel.writeString(this.type);
        Integer num = this.enterpriseType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.liveRequestId);
        parcel.writeString(this.liveRoomId);
        parcel.writeString(this.fromRequestId);
        parcel.writeString(this.returnLive);
        parcel.writeString(this.liveRoomOwnerId);
        parcel.writeString(this.liveType);
        parcel.writeInt(this.isFromLiveRecord ? 1 : 0);
        parcel.writeString(this.sceneId);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.preEnterFrom);
        parcel.writeString(this.eventType);
        parcel.writeString(this.previousPage);
        parcel.writeString(this.isFromSocialAvatarPage);
        parcel.writeString(this.relationFrom);
        parcel.writeString(this.sourceAid);
        parcel.writeString(this.trackParams);
        parcel.writeString(this.position);
        parcel.writeString(this.searchRequestId);
        parcel.writeString(this.stickyContent);
        parcel.writeBundle(this.bundle);
        parcel.writeString(this.noticeType);
        HashMap<String, String> map = this.logExtra;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.afCampaignId);
        parcel.writeString(this.afAdsetId);
        parcel.writeString(this.mediaSource);
        parcel.writeInt(this.isDDL ? 1 : 0);
        parcel.writeInt(this.isFromPush);
        parcel.writeString(this.pushType);
        parcel.writeString(this.pushId);
    }

    public final String getSecUid() {
        String str = this.extraSecUserId;
        return (str == null || str.length() == 0) ? this.compatiblSecUserId : str;
    }

    public final String getUserId() {
        String str = this.extraUserId;
        return (str == null || str.length() == 0) ? this.iD : str;
    }

    public final String getAfAdsetId() {
        return this.afAdsetId;
    }

    public final String getAfCampaignId() {
        return this.afCampaignId;
    }

    public final String getAid() {
        return this.aid;
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final String getCompatiblSecUserId() {
        return this.compatiblSecUserId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Integer getEnterpriseType() {
        return this.enterpriseType;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getExtraSecUserId() {
        return this.extraSecUserId;
    }

    public final String getExtraUserId() {
        return this.extraUserId;
    }

    public final String getFromRequestId() {
        return this.fromRequestId;
    }

    public final String getID() {
        return this.iD;
    }

    public final String getLabel() {
        return this.label;
    }

    public final C1252480ihK getLiveFollowReportParams() {
        return this.liveFollowReportParams;
    }

    public final String getLiveRequestId() {
        return this.liveRequestId;
    }

    public final String getLiveRoomId() {
        return this.liveRoomId;
    }

    public final String getLiveRoomOwnerId() {
        return this.liveRoomOwnerId;
    }

    public final String getLiveType() {
        return this.liveType;
    }

    public final HashMap<String, String> getLogExtra() {
        return this.logExtra;
    }

    public final String getMediaSource() {
        return this.mediaSource;
    }

    public final String getNoticeType() {
        return this.noticeType;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getPreEnterFrom() {
        return this.preEnterFrom;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getProfileFromScene() {
        return this.profileFromScene;
    }

    public final String getProfileFromSceneV2() {
        return this.profileFromSceneV2;
    }

    public final String getPushId() {
        return this.pushId;
    }

    public final String getPushType() {
        return this.pushType;
    }

    public final String getRelationFrom() {
        return this.relationFrom;
    }

    public final String getReturnLive() {
        return this.returnLive;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final String getSearchRequestId() {
        return this.searchRequestId;
    }

    public final String getSourceAid() {
        return this.sourceAid;
    }

    public final String getStickyContent() {
        return this.stickyContent;
    }

    public final String getTeenSecUserId() {
        return this.teenSecUserId;
    }

    public final String getTrackParams() {
        return this.trackParams;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final boolean isDDL() {
        return this.isDDL;
    }

    public final boolean isFromLiveRecord() {
        return this.isFromLiveRecord;
    }

    public final int isFromPush() {
        return this.isFromPush;
    }

    public final String isFromSocialAvatarPage() {
        return this.isFromSocialAvatarPage;
    }

    public UserProfileArg(String str) {
        this(str, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public static UserProfileArg __fromBundle(Bundle bundle) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Integer num;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        Boolean bool;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        int i2;
        Bundle bundle2;
        String str30;
        HashMap map;
        String str31;
        String str32;
        String str33;
        Boolean bool2;
        Integer num2;
        String str34;
        String str35;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        int iIntValue;
        String str36 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("uid")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("uid"), String.class);
            i = 0;
        } else {
            str = null;
            i = 1;
        }
        if (bundle.containsKey(FollowStatusChangeMethod.PARAM_UID)) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get(FollowStatusChangeMethod.PARAM_UID), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("teen_sec_user_id")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("teen_sec_user_id"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("sec_user_id")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_user_id"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("sec_uid")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_uid"), String.class);
        } else {
            i += 16;
            str5 = null;
        }
        if (bundle.containsKey("from_scene")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("from_scene"), String.class);
        } else {
            i += 32;
            str6 = null;
        }
        if (bundle.containsKey("profile_from_scene")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("profile_from_scene"), String.class);
        } else {
            i += 64;
            str7 = null;
        }
        if (bundle.containsKey("unique_id")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("unique_id"), String.class);
        } else {
            i += 128;
            str8 = null;
        }
        if (bundle.containsKey("profile_from")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("profile_from"), String.class);
        } else {
            i += 256;
            str9 = null;
        }
        if (bundle.containsKey("video_id")) {
            str36 = (String) RouteParser.INSTANCE.parse(bundle.get("video_id"), String.class);
        } else {
            i += 512;
        }
        if (bundle.containsKey("type")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("type"), String.class);
        } else {
            i += 1024;
            str10 = null;
        }
        if (bundle.containsKey("profile_enterprise_type")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("profile_enterprise_type"), Integer.class);
        } else {
            i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            num = null;
        }
        if (bundle.containsKey("enter_method")) {
            str11 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            str11 = null;
        }
        if (bundle.containsKey("request_id")) {
            str12 = (String) RouteParser.INSTANCE.parse(bundle.get("request_id"), String.class);
        } else {
            i += 8192;
            str12 = null;
        }
        if (bundle.containsKey("room_id")) {
            str13 = (String) RouteParser.INSTANCE.parse(bundle.get("room_id"), String.class);
        } else {
            i += 16384;
            str13 = null;
        }
        if (bundle.containsKey("from_request_id")) {
            str14 = (String) RouteParser.INSTANCE.parse(bundle.get("from_request_id"), String.class);
        } else {
            i += 32768;
            str14 = null;
        }
        if (bundle.containsKey("return_live")) {
            str15 = (String) RouteParser.INSTANCE.parse(bundle.get("return_live"), String.class);
        } else {
            i += 65536;
            str15 = null;
        }
        if (bundle.containsKey("room_owner_id")) {
            str16 = (String) RouteParser.INSTANCE.parse(bundle.get("room_owner_id"), String.class);
        } else {
            i += 131072;
            str16 = null;
        }
        if (bundle.containsKey("user_type")) {
            str17 = (String) RouteParser.INSTANCE.parse(bundle.get("user_type"), String.class);
        } else {
            i += 262144;
            str17 = null;
        }
        if (bundle.containsKey("is_live_record")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_live_record"), Boolean.class);
            if (bool == null) {
                i += 524288;
            }
        } else {
            i += 524288;
            bool = null;
        }
        if (bundle.containsKey("scene_id")) {
            str18 = (String) RouteParser.INSTANCE.parse(bundle.get("scene_id"), String.class);
        } else {
            i += 1048576;
            str18 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str19 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 2097152;
            str19 = null;
        }
        if (bundle.containsKey("extra_from_event_enter_from")) {
            str20 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_event_enter_from"), String.class);
        } else {
            i += 4194304;
            str20 = null;
        }
        if (bundle.containsKey("extra_from_event_type")) {
            str21 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_event_type"), String.class);
        } else {
            i += 8388608;
            str21 = null;
        }
        if (bundle.containsKey("extra_from_pre_page")) {
            str22 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_pre_page"), String.class);
        } else {
            i += 16777216;
            str22 = null;
        }
        if (bundle.containsKey("extra_from_social_avatar_download_page")) {
            str23 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_social_avatar_download_page"), String.class);
        } else {
            i += 33554432;
            str23 = null;
        }
        if (bundle.containsKey("extra_from_pre_relation_from")) {
            str24 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_pre_relation_from"), String.class);
        } else {
            i += 67108864;
            str24 = null;
        }
        if (bundle.containsKey("source_aid")) {
            str25 = (String) RouteParser.INSTANCE.parse(bundle.get("source_aid"), String.class);
        } else {
            i += 134217728;
            str25 = null;
        }
        if (bundle.containsKey("trackParams")) {
            str26 = (String) RouteParser.INSTANCE.parse(bundle.get("trackParams"), String.class);
        } else {
            i += 268435456;
            str26 = null;
        }
        if (bundle.containsKey("position")) {
            str27 = (String) RouteParser.INSTANCE.parse(bundle.get("position"), String.class);
        } else {
            i += 536870912;
            str27 = null;
        }
        if (bundle.containsKey("search_request_id")) {
            str28 = (String) RouteParser.INSTANCE.parse(bundle.get("search_request_id"), String.class);
        } else {
            i += 1073741824;
            str28 = null;
        }
        if (bundle.containsKey("sticky_content")) {
            str29 = (String) RouteParser.INSTANCE.parse(bundle.get("sticky_content"), String.class);
        } else {
            i -= Integer.MIN_VALUE;
            str29 = null;
        }
        if (bundle.containsKey("bundle")) {
            bundle2 = (Bundle) RouteParser.INSTANCE.parse(bundle.get("bundle"), Bundle.class);
            i2 = 0;
        } else {
            i2 = 1;
            bundle2 = null;
        }
        if (bundle.containsKey("notice_type")) {
            str30 = (String) RouteParser.INSTANCE.parse(bundle.get("notice_type"), String.class);
        } else {
            i2 += 2;
            str30 = null;
        }
        if (bundle.containsKey("inbox_log_extra")) {
            map = (HashMap) RouteParser.INSTANCE.parse(bundle.get("inbox_log_extra"), HashMap.class);
        } else {
            i2 += 4;
            map = null;
        }
        if (bundle.containsKey("af_c_id")) {
            str31 = (String) RouteParser.INSTANCE.parse(bundle.get("af_c_id"), String.class);
        } else {
            i2 += 8;
            str31 = null;
        }
        if (bundle.containsKey("af_adset_id")) {
            str32 = (String) RouteParser.INSTANCE.parse(bundle.get("af_adset_id"), String.class);
        } else {
            i2 += 16;
            str32 = null;
        }
        if (bundle.containsKey("media_source")) {
            str33 = (String) RouteParser.INSTANCE.parse(bundle.get("media_source"), String.class);
        } else {
            i2 += 32;
            str33 = null;
        }
        if (bundle.containsKey("is_ddl")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_ddl"), Boolean.class);
            if (bool2 == null) {
                i2 += 64;
            }
        } else {
            i2 += 64;
            bool2 = null;
        }
        if (bundle.containsKey("is_from_push")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("is_from_push"), Integer.class);
            if (num2 == null) {
                i2 += 128;
            }
        } else {
            i2 += 128;
            num2 = null;
        }
        if (bundle.containsKey("push_type")) {
            str34 = (String) RouteParser.INSTANCE.parse(bundle.get("push_type"), String.class);
        } else {
            i2 += 256;
            str34 = null;
        }
        if (bundle.containsKey("push_id")) {
            str35 = (String) RouteParser.INSTANCE.parse(bundle.get("push_id"), String.class);
        } else {
            i2 += 512;
            str35 = null;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = null;
        }
        if ((i & 512) != 0) {
            str36 = null;
        }
        if ((i & 1024) != 0) {
            str10 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = null;
        }
        if ((i & 8192) != 0) {
            str12 = null;
        }
        if ((i & 16384) != 0) {
            str13 = null;
        }
        if ((32768 & i) != 0) {
            str14 = null;
        }
        if ((65536 & i) != 0) {
            str15 = null;
        }
        if ((131072 & i) != 0) {
            str16 = null;
        }
        if ((262144 & i) != 0) {
            str17 = null;
        }
        if ((524288 & i) != 0) {
            zBooleanValue = false;
        }
        if ((1048576 & i) != 0) {
            str18 = null;
        }
        if ((2097152 & i) != 0) {
            str19 = null;
        }
        String str37 = "";
        if ((4194304 & i) != 0) {
            str20 = "";
        }
        if ((8388608 & i) != 0) {
            str21 = null;
        }
        if ((16777216 & i) != 0) {
            str22 = null;
        }
        if ((33554432 & i) != 0) {
            str23 = null;
        }
        if ((67108864 & i) != 0) {
            str24 = null;
        }
        if ((134217728 & i) != 0) {
            str25 = null;
        }
        if ((268435456 & i) != 0) {
            str26 = null;
        }
        if ((536870912 & i) != 0) {
            str27 = null;
        }
        if ((1073741824 & i) != 0) {
            str28 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            str29 = null;
        }
        if ((i2 & 1) != 0) {
            bundle2 = null;
        }
        if ((i2 & 2) == 0) {
            str37 = str30;
        }
        if ((i2 & 4) != 0) {
            map = null;
        }
        if ((i2 & 8) != 0) {
            str31 = null;
        }
        if ((i2 & 16) != 0) {
            str32 = null;
        }
        if ((i2 & 32) != 0) {
            str33 = null;
        }
        if ((i2 & 64) != 0) {
            zBooleanValue2 = false;
        }
        if ((i2 & 128) != 0) {
            iIntValue = 0;
        }
        if ((i2 & 256) != 0) {
            str34 = null;
        }
        if ((i2 & 512) != 0) {
            str35 = null;
        }
        return new UserProfileArg(str, str2, str3, str4, str5, str6, str7, str8, str9, str36, str10, num, str11, str12, str13, str14, str15, str16, str17, zBooleanValue, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, bundle2, str37, map, str31, str32, str33, zBooleanValue2, iIntValue, str34, str35);
    }

    public final void setExtraSecUserId(String str) {
        this.extraSecUserId = str;
    }

    public final void setExtraUserId(String str) {
        this.extraUserId = str;
    }

    public final void setFromPush(int i) {
        this.isFromPush = i;
    }

    public final void setPushId(String str) {
        this.pushId = str;
    }

    public final void setPushType(String str) {
        this.pushType = str;
    }

    public final void setSecUid(String str) {
        this.extraSecUserId = str;
    }

    public final void setUserId(String str) {
        this.extraUserId = str;
    }

    public UserProfileArg(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, null, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, null, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, 0, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, null, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, null, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, null, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, null, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, null, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, null, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, null, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, false, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, null, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, null, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, "", null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, null, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, null, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, null, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, null, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, null, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, null, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, null, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, null, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, null, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, "", null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, null, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, map, null, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map, String str32) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, map, str32, null, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map, String str32, String str33) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, map, str32, str33, null, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map, String str32, String str33, String str34) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, map, str32, str33, str34, false, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map, String str32, String str33, String str34, boolean z2) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, map, str32, str33, str34, z2, 0, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map, String str32, String str33, String str34, boolean z2, int i) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, map, str32, str33, str34, z2, i, null, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map, String str32, String str33, String str34, boolean z2, int i, String str35) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, bundle, str31, map, str32, str33, str34, z2, i, str35, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Bundle bundle, String str31, HashMap<String, String> map, String str32, String str33, String str34, boolean z2, int i, String str35, String str36) {
        this.extraUserId = str;
        this.iD = str2;
        this.teenSecUserId = str3;
        this.extraSecUserId = str4;
        this.compatiblSecUserId = str5;
        this.profileFromScene = str6;
        this.profileFromSceneV2 = str7;
        this.uniqueId = str8;
        this.label = str9;
        this.aid = str10;
        this.type = str11;
        this.enterpriseType = num;
        this.enterMethod = str12;
        this.liveRequestId = str13;
        this.liveRoomId = str14;
        this.fromRequestId = str15;
        this.returnLive = str16;
        this.liveRoomOwnerId = str17;
        this.liveType = str18;
        this.isFromLiveRecord = z;
        this.sceneId = str19;
        this.enterFrom = str20;
        this.preEnterFrom = str21;
        this.eventType = str22;
        this.previousPage = str23;
        this.isFromSocialAvatarPage = str24;
        this.relationFrom = str25;
        this.sourceAid = str26;
        this.trackParams = str27;
        this.position = str28;
        this.searchRequestId = str29;
        this.stickyContent = str30;
        this.bundle = bundle;
        this.noticeType = str31;
        this.logExtra = map;
        this.afCampaignId = str32;
        this.afAdsetId = str33;
        this.mediaSource = str34;
        this.isDDL = z2;
        this.isFromPush = i;
        this.pushType = str35;
        this.pushId = str36;
        this.liveFollowReportParams = new C1252480ihK(null, null, false, null, null, null, null, null, null, null, null);
    }
}
