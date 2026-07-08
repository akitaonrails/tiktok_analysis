package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C1030170cul;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLiveEnterRoomConfig implements Parcelable {

    @C09CT("ad_id")
    public final String adId;

    @C09CT("report_info")
    public final String adReportInfo;

    @C09CT("adv_id")
    public final String advId;

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("creative_id")
    public final String creativeId;

    @C09CT("dislike_info")
    public final String dislikeInfo;

    @C09CT("enter_from_ad")
    public boolean enterFromAd = true;

    @C09CT("follow_status")
    public String followStatus;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("is_leads_ads_traffic")
    public final Boolean isLeadsAdsTraffic;

    @C09CT("is_pseudo_ad")
    public final String isPseudoAd;

    @C09CT("live_ad_scene")
    public final String liveAdScene;

    @C09CT("live_ad_type")
    public final String liveAdType;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("traffic_from_position")
    public final int trafficFromPosition;

    @C09CT("ttclid")
    public final String ttclId;

    @C09CT("value")
    public final String value;
    public static final C1030170cul Companion = new Object() { // from class: X.0cul
    };
    public static final Parcelable.Creator<AdLiveEnterRoomConfig> CREATOR = new Parcelable.Creator<AdLiveEnterRoomConfig>() { // from class: X.0cuk
        @Override // android.os.Parcelable.Creator
        public final AdLiveEnterRoomConfig createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new AdLiveEnterRoomConfig(string, string2, string3, string4, string5, i, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AdLiveEnterRoomConfig[] newArray(int i) {
            return new AdLiveEnterRoomConfig[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdLiveEnterRoomConfig)) {
            return false;
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = (AdLiveEnterRoomConfig) obj;
        return Intrinsics.LJFF(this.liveAdType, adLiveEnterRoomConfig.liveAdType) && Intrinsics.LJFF(this.creativeId, adLiveEnterRoomConfig.creativeId) && Intrinsics.LJFF(this.value, adLiveEnterRoomConfig.value) && Intrinsics.LJFF(this.logExtra, adLiveEnterRoomConfig.logExtra) && Intrinsics.LJFF(this.groupId, adLiveEnterRoomConfig.groupId) && this.trafficFromPosition == adLiveEnterRoomConfig.trafficFromPosition && Intrinsics.LJFF(this.aid, adLiveEnterRoomConfig.aid) && Intrinsics.LJFF(this.adId, adLiveEnterRoomConfig.adId) && Intrinsics.LJFF(this.advId, adLiveEnterRoomConfig.advId) && Intrinsics.LJFF(this.roomId, adLiveEnterRoomConfig.roomId) && Intrinsics.LJFF(this.authorId, adLiveEnterRoomConfig.authorId) && Intrinsics.LJFF(this.dislikeInfo, adLiveEnterRoomConfig.dislikeInfo) && Intrinsics.LJFF(this.isPseudoAd, adLiveEnterRoomConfig.isPseudoAd) && Intrinsics.LJFF(this.liveAdScene, adLiveEnterRoomConfig.liveAdScene) && Intrinsics.LJFF(this.ttclId, adLiveEnterRoomConfig.ttclId) && Intrinsics.LJFF(this.adReportInfo, adLiveEnterRoomConfig.adReportInfo) && Intrinsics.LJFF(this.isLeadsAdsTraffic, adLiveEnterRoomConfig.isLeadsAdsTraffic);
    }

    public final int hashCode() {
        String str = this.liveAdType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.creativeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logExtra;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupId;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.trafficFromPosition) * 31;
        String str6 = this.aid;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.adId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.advId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.roomId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.authorId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dislikeInfo;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.isPseudoAd;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.liveAdScene;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.ttclId;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.adReportInfo;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool = this.isLeadsAdsTraffic;
        return iHashCode15 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdLiveEnterRoomConfig(liveAdType=" + this.liveAdType + ", creativeId=" + this.creativeId + ", value=" + this.value + ", logExtra=" + this.logExtra + ", groupId=" + this.groupId + ", trafficFromPosition=" + this.trafficFromPosition + ", aid=" + this.aid + ", adId=" + this.adId + ", advId=" + this.advId + ", roomId=" + this.roomId + ", authorId=" + this.authorId + ", dislikeInfo=" + this.dislikeInfo + ", isPseudoAd=" + this.isPseudoAd + ", liveAdScene=" + this.liveAdScene + ", ttclId=" + this.ttclId + ", adReportInfo=" + this.adReportInfo + ", isLeadsAdsTraffic=" + this.isLeadsAdsTraffic + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.liveAdType);
        parcel.writeString(this.creativeId);
        parcel.writeString(this.value);
        parcel.writeString(this.logExtra);
        parcel.writeString(this.groupId);
        parcel.writeInt(this.trafficFromPosition);
        parcel.writeString(this.aid);
        parcel.writeString(this.adId);
        parcel.writeString(this.advId);
        parcel.writeString(this.roomId);
        parcel.writeString(this.authorId);
        parcel.writeString(this.dislikeInfo);
        parcel.writeString(this.isPseudoAd);
        parcel.writeString(this.liveAdScene);
        parcel.writeString(this.ttclId);
        parcel.writeString(this.adReportInfo);
        Boolean bool = this.isLeadsAdsTraffic;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public final Map<String, Object> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("traffic_from_position", Integer.valueOf(this.trafficFromPosition));
        String str = this.roomId;
        if (str != null) {
            linkedHashMap.put("room_id", str);
        }
        String str2 = this.authorId;
        if (str2 != null) {
            linkedHashMap.put("anchor_id", str2);
        }
        return linkedHashMap;
    }

    public final HashMap<String, String> LIZIZ() {
        HashMap<String, String> map = new HashMap<>();
        String str = this.value;
        if (str != null) {
            map.put("value", str);
        }
        String str2 = this.creativeId;
        if (str2 != null) {
            map.put("creative_id", str2);
        }
        String str3 = this.logExtra;
        if (str3 != null) {
            map.put("log_extra", str3);
        }
        String str4 = this.groupId;
        if (str4 != null) {
            map.put("group_id", str4);
        }
        map.put("traffic_from_position", String.valueOf(this.trafficFromPosition));
        String str5 = this.isPseudoAd;
        if (str5 != null) {
            map.put("is_pseudo_ad", str5);
        }
        return map;
    }

    public AdLiveEnterRoomConfig(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool) {
        this.liveAdType = str;
        this.creativeId = str2;
        this.value = str3;
        this.logExtra = str4;
        this.groupId = str5;
        this.trafficFromPosition = i;
        this.aid = str6;
        this.adId = str7;
        this.advId = str8;
        this.roomId = str9;
        this.authorId = str10;
        this.dislikeInfo = str11;
        this.isPseudoAd = str12;
        this.liveAdScene = str13;
        this.ttclId = str14;
        this.adReportInfo = str15;
        this.isLeadsAdsTraffic = bool;
    }
}
