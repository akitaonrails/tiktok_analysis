package com.ss.android.ugc.aweme.minis.feed.instantplay.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedSubcardInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("asset_type")
    public final Integer assetType;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("dedup_id")
    public final String dedupId;

    @C09CT("extra_params")
    public final Map<String, String> extraParams;

    @C09CT("fyf_card_id")
    public final String fyfCardId;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("metadata_id")
    public final String metadataId;

    @C09CT("minis_schema")
    public final String minisSchema;

    @C09CT("name")
    public final String name;

    @C09CT("open_id")
    public final String openId;

    @C09CT("preview_image_url")
    public final String previewImageUrl;

    @C09CT("sub_icon_url")
    public final String subIconUrl;

    @C09CT("subtext")
    public final String subtext;

    @C09CT("text")
    public final String text;

    @C09CT("title")
    public final String title;

    @C09CT("tns_id")
    public final String tnsId;

    @C09CT("token")
    public final String token;

    @C09CT("type")
    public final Integer type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSubcardInfo)) {
            return false;
        }
        FeedSubcardInfo feedSubcardInfo = (FeedSubcardInfo) obj;
        return Intrinsics.LJFF(this.clientKey, feedSubcardInfo.clientKey) && Intrinsics.LJFF(this.type, feedSubcardInfo.type) && Intrinsics.LJFF(this.name, feedSubcardInfo.name) && Intrinsics.LJFF(this.iconUrl, feedSubcardInfo.iconUrl) && Intrinsics.LJFF(this.previewImageUrl, feedSubcardInfo.previewImageUrl) && Intrinsics.LJFF(this.text, feedSubcardInfo.text) && Intrinsics.LJFF(this.subtext, feedSubcardInfo.subtext) && Intrinsics.LJFF(this.minisSchema, feedSubcardInfo.minisSchema) && Intrinsics.LJFF(this.subIconUrl, feedSubcardInfo.subIconUrl) && Intrinsics.LJFF(this.title, feedSubcardInfo.title) && Intrinsics.LJFF(this.token, feedSubcardInfo.token) && Intrinsics.LJFF(this.dedupId, feedSubcardInfo.dedupId) && Intrinsics.LJFF(this.openId, feedSubcardInfo.openId) && Intrinsics.LJFF(this.metadataId, feedSubcardInfo.metadataId) && Intrinsics.LJFF(this.tnsId, feedSubcardInfo.tnsId) && Intrinsics.LJFF(this.assetType, feedSubcardInfo.assetType) && Intrinsics.LJFF(this.fyfCardId, feedSubcardInfo.fyfCardId) && Intrinsics.LJFF(this.extraParams, feedSubcardInfo.extraParams);
    }

    public int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.previewImageUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.text;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtext;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.minisSchema;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subIconUrl;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.title;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.token;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dedupId;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.openId;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.metadataId;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.tnsId;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num2 = this.assetType;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str15 = this.fyfCardId;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Map<String, String> map = this.extraParams;
        return iHashCode17 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "FeedSubcardInfo(clientKey=" + this.clientKey + ", type=" + this.type + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", previewImageUrl=" + this.previewImageUrl + ", text=" + this.text + ", subtext=" + this.subtext + ", minisSchema=" + this.minisSchema + ", subIconUrl=" + this.subIconUrl + ", title=" + this.title + ", token=" + this.token + ", dedupId=" + this.dedupId + ", openId=" + this.openId + ", metadataId=" + this.metadataId + ", tnsId=" + this.tnsId + ", assetType=" + this.assetType + ", fyfCardId=" + this.fyfCardId + ", extraParams=" + this.extraParams + ')';
    }

    public FeedSubcardInfo(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num2, String str15, Map<String, String> map) {
        this.clientKey = str;
        this.type = num;
        this.name = str2;
        this.iconUrl = str3;
        this.previewImageUrl = str4;
        this.text = str5;
        this.subtext = str6;
        this.minisSchema = str7;
        this.subIconUrl = str8;
        this.title = str9;
        this.token = str10;
        this.dedupId = str11;
        this.openId = str12;
        this.metadataId = str13;
        this.tnsId = str14;
        this.assetType = num2;
        this.fyfCardId = str15;
        this.extraParams = map;
    }
}
