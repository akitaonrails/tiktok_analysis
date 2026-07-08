package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PoiAnchorInfo implements Serializable {

    @C09CT("anchor_exp_time")
    public Integer anchorExpTime;

    @C09CT("anchor_exp_type")
    public Integer anchorExpType;

    @C09CT("biz_thumbnail")
    public UrlModel bizThumbnail;

    @C09CT("has_sub_arrow")
    public boolean hasSubArrow;

    @C09CT("poi_anchor_button")
    public PoiAnchorButtonInfo poiAnchorButton;

    @C09CT("poi_card")
    public PoiAnchorCard poiAnchorCard;

    @C09CT("schema")
    public String schema;

    @C09CT("style")
    public Integer style;

    @C09CT("sub_tag_exp_time")
    public Integer subTagExpTime;

    @C09CT("sub_tag_exp_type")
    public Integer subTagExpType;

    @C09CT("sub_tags")
    public List<PoiSubTag> subTags;

    @C09CT("suffix")
    public String suffix;

    @C09CT("title")
    public String title;

    @C09CT("hide_list")
    public List<Integer> tooLongHideList;

    @C09CT("track_info")
    public String trackInfo;

    @C09CT("transaction_suffix")
    public String transactionSuffix;

    public PoiAnchorInfo() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSubTagExpTime$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSubTagExpType$annotations() {
    }

    public int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.suffix;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PoiSubTag> list = this.subTags;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.subTagExpType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.subTagExpTime;
        int iHashCode5 = (((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.hasSubArrow)) * 31;
        String str3 = this.trackInfo;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Integer> list2 = this.tooLongHideList;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PoiAnchorCard poiAnchorCard = this.poiAnchorCard;
        int iHashCode9 = (iHashCode8 + (poiAnchorCard == null ? 0 : poiAnchorCard.hashCode())) * 31;
        PoiAnchorButtonInfo poiAnchorButtonInfo = this.poiAnchorButton;
        int iHashCode10 = (iHashCode9 + (poiAnchorButtonInfo == null ? 0 : poiAnchorButtonInfo.hashCode())) * 31;
        Integer num3 = this.anchorExpType;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.anchorExpTime;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.transactionSuffix;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UrlModel urlModel = this.bizThumbnail;
        int iHashCode14 = (iHashCode13 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num5 = this.style;
        return iHashCode14 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        return "PoiAnchorInfo(schema=" + this.schema + ", suffix=" + this.suffix + ", subTags=" + this.subTags + ", subTagExpType=" + this.subTagExpType + ", subTagExpTime=" + this.subTagExpTime + ", hasSubArrow=" + this.hasSubArrow + ", trackInfo=" + this.trackInfo + ", tooLongHideList=" + this.tooLongHideList + ", title=" + this.title + ", poiAnchorCard=" + this.poiAnchorCard + ", poiAnchorButton=" + this.poiAnchorButton + ", anchorExpType=" + this.anchorExpType + ", anchorExpTime=" + this.anchorExpTime + ", transactionSuffix=" + this.transactionSuffix + ", bizThumbnail=" + this.bizThumbnail + ", style=" + this.style + ')';
    }

    public PoiAnchorInfo(String str, String str2, List<PoiSubTag> list, Integer num, Integer num2, boolean z, String str3, List<Integer> list2, String str4, PoiAnchorCard poiAnchorCard, PoiAnchorButtonInfo poiAnchorButtonInfo, Integer num3, Integer num4, String str5, UrlModel urlModel, Integer num5) {
        this.schema = str;
        this.suffix = str2;
        this.subTags = list;
        this.subTagExpType = num;
        this.subTagExpTime = num2;
        this.hasSubArrow = z;
        this.trackInfo = str3;
        this.tooLongHideList = list2;
        this.title = str4;
        this.poiAnchorCard = poiAnchorCard;
        this.poiAnchorButton = poiAnchorButtonInfo;
        this.anchorExpType = num3;
        this.anchorExpTime = num4;
        this.transactionSuffix = str5;
        this.bizThumbnail = urlModel;
        this.style = num5;
    }
}
