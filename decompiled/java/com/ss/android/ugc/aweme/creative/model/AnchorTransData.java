package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C1430560nKY;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AnchorTransData implements Serializable {
    public static final C1430560nKY Companion = new C1430560nKY();

    @C09CT(alternate = {"u"}, value = "add_mode")
    public final String addMode;

    @C09CT(alternate = {"k"}, value = "add_time")
    public Long addTime;

    @C09CT(alternate = {"b"}, value = "anchor_content")
    public String anchorContent;

    @C09CT(alternate = {"g"}, value = "anchor_icon")
    public final UrlModel anchorIcon;

    @C09CT(alternate = {"v"}, value = "anchor_icon_raw")
    public final Integer anchorIconRaw;

    @C09CT(alternate = {"d"}, value = "anchor_tag")
    public final String anchorTag;

    @C09CT(alternate = {"a"}, value = "business_type")
    public final int businessType;

    @C09CT(alternate = {"h"}, value = "can_delete")
    public final boolean canDelete;

    @C09CT(alternate = {"t"}, value = "add_click_action")
    public final int clickAction;

    @C09CT(alternate = {"n"}, value = "display")
    public final boolean display;

    @C09CT(alternate = {"l"}, value = "extra")
    public final String extra;

    @C09CT(alternate = {"s"}, value = "general_type")
    public final int generalType;

    @C09CT(alternate = {"q"}, value = "hashtags")
    public final List<String> hashtags;

    @C09CT(alternate = {"f"}, value = FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT(alternate = {"j"}, value = "language")
    public final String language;

    @C09CT(alternate = {"r"}, value = "minis_infos")
    public final String minisInfos;

    @C09CT(alternate = {"p"}, value = "plugin_info")
    public final String pluginInfo;

    @C09CT(alternate = {"o"}, value = "series_category")
    public final SeriesCategory seriesCategory;

    @C09CT(alternate = {"e"}, value = "source")
    public final Integer source;

    @C09CT(alternate = {"m"}, value = "subtype")
    public String subtype;

    @C09CT(alternate = {"c"}, value = "title")
    public final String title;

    @C09CT(alternate = {"i"}, value = "url")
    public final String url;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorTransData)) {
            return false;
        }
        AnchorTransData anchorTransData = (AnchorTransData) obj;
        return this.businessType == anchorTransData.businessType && Intrinsics.LJFF(this.anchorContent, anchorTransData.anchorContent) && Intrinsics.LJFF(this.title, anchorTransData.title) && Intrinsics.LJFF(this.anchorTag, anchorTransData.anchorTag) && Intrinsics.LJFF(this.source, anchorTransData.source) && Intrinsics.LJFF(this.id, anchorTransData.id) && Intrinsics.LJFF(this.anchorIcon, anchorTransData.anchorIcon) && this.canDelete == anchorTransData.canDelete && Intrinsics.LJFF(this.url, anchorTransData.url) && Intrinsics.LJFF(this.language, anchorTransData.language) && Intrinsics.LJFF(this.addTime, anchorTransData.addTime) && Intrinsics.LJFF(this.extra, anchorTransData.extra) && Intrinsics.LJFF(this.subtype, anchorTransData.subtype) && this.display == anchorTransData.display && Intrinsics.LJFF(this.pluginInfo, anchorTransData.pluginInfo) && Intrinsics.LJFF(this.minisInfos, anchorTransData.minisInfos) && this.seriesCategory == anchorTransData.seriesCategory && Intrinsics.LJFF(this.hashtags, anchorTransData.hashtags) && this.generalType == anchorTransData.generalType && this.clickAction == anchorTransData.clickAction && Intrinsics.LJFF(this.addMode, anchorTransData.addMode) && Intrinsics.LJFF(this.anchorIconRaw, anchorTransData.anchorIconRaw);
    }

    public final void setAddTime(Long l) {
        this.addTime = l;
    }

    public final void setAnchorContent(String str) {
        this.anchorContent = str;
    }

    public final void setSubtype(String str) {
        this.subtype = str;
    }

    public AnchorTransData(int i, String str) {
        this(i, str, "", "", 0, "", null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2) {
        this(i, str, str2, "", 0, "", null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, 0, "", null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num) {
        this(i, str, str2, str3, num, "", null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4) {
        this(i, str, str2, str3, num, str4, null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel) {
        this(i, str, str2, str3, num, str4, urlModel, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z) {
        this(i, str, str2, str3, num, str4, urlModel, z, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, "", "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, "", true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, true, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, z2, null, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2, String str9) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, z2, str9, null, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2, String str9, String str10) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, z2, str9, str10, null, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2, String str9, String str10, SeriesCategory seriesCategory) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, z2, str9, str10, seriesCategory, null, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2, String str9, String str10, SeriesCategory seriesCategory, List<String> list) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, z2, str9, str10, seriesCategory, list, 0, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2, String str9, String str10, SeriesCategory seriesCategory, List<String> list, int i2) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, z2, str9, str10, seriesCategory, list, i2, -1, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2, String str9, String str10, SeriesCategory seriesCategory, List<String> list, int i2, int i3) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, z2, str9, str10, seriesCategory, list, i2, i3, null, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2, String str9, String str10, SeriesCategory seriesCategory, List<String> list, int i2, int i3, String str11) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, z2, str9, str10, seriesCategory, list, i2, i3, str11, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, boolean z2, String str9, String str10, SeriesCategory seriesCategory, List<String> list, int i2, int i3, String str11, Integer num2) {
        this.businessType = i;
        this.anchorContent = str;
        this.title = str2;
        this.anchorTag = str3;
        this.source = num;
        this.id = str4;
        this.anchorIcon = urlModel;
        this.canDelete = z;
        this.url = str5;
        this.language = str6;
        this.addTime = l;
        this.extra = str7;
        this.subtype = str8;
        this.display = z2;
        this.pluginInfo = str9;
        this.minisInfos = str10;
        this.seriesCategory = seriesCategory;
        this.hashtags = list;
        this.generalType = i2;
        this.clickAction = i3;
        this.addMode = str11;
        this.anchorIconRaw = num2;
    }
}
