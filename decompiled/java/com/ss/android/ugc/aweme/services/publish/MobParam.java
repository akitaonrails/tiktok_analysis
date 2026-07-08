package com.ss.android.ugc.aweme.services.publish;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes19.dex */
public final class MobParam {

    @C09CT("content_source")
    public final String contentSource;

    @C09CT("content_type")
    public final String contentType;

    @C09CT("creation_duration")
    public final Integer creationDuration;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("effect_id")
    public final String effectIds;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("hashtag_list")
    public final String hashtagList;

    @C09CT("is_multi_content")
    public final boolean isMultiContent;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("rec_poi_id_list")
    public final String poiReTagRecPoiList;

    @C09CT("post_after_days")
    public final String postAfterDays;

    @C09CT("prop_id")
    public final String propIds;

    @C09CT("retag_enter_method")
    public final String retagEnterMethod;

    @C09CT("shoot_enter_method")
    public final String shootEnterMethod;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("tab_name")
    public final String tabName;

    public MobParam() {
        this(null, null, null, "", "", false, "", "", null, null, null, null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shootWay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creationId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shootEnterMethod;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.contentSource;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.isMultiContent)) * 31;
        String str6 = this.contentType;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.tabName.hashCode()) * 31;
        String str7 = this.musicId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.effectIds;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.hashtagList;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.creationDuration;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.propIds;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.retagEnterMethod;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.postAfterDays;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.poiReTagRecPoiList;
        return iHashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final boolean isMultiContent() {
        return this.isMultiContent;
    }

    public MobParam(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, String str13, String str14) {
        this.enterFrom = str;
        this.shootWay = str2;
        this.creationId = str3;
        this.shootEnterMethod = str4;
        this.contentSource = str5;
        this.isMultiContent = z;
        this.contentType = str6;
        this.tabName = str7;
        this.musicId = str8;
        this.effectIds = str9;
        this.hashtagList = str10;
        this.creationDuration = num;
        this.propIds = str11;
        this.retagEnterMethod = str12;
        this.postAfterDays = str13;
        this.poiReTagRecPoiList = str14;
    }
}
