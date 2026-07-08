package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C735490St9;
import X.InterfaceC1294060jmO;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class PoiAnchorData implements Serializable {
    public static final C735490St9 Companion = new C735490St9();
    public static final HashMap<String, PoiAnchorData> store = new HashMap<>();

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("description")
    public final String description;

    @C09CT("fav_cnt")
    public final Long favCnt;

    @C09CT("from_group_id")
    public final String fromGroupId;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("is_tt_key_category")
    public final Integer isTtKeyCategory;

    @C09CT("city_name")
    public final String poiCity;

    @C09CT("city_code")
    public final String poiCityCode;

    @C09CT("poi_device_samecity")
    public final Integer poiDeviceSameCity;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_info_source")
    public final String poiInfoSource;

    @C09CT("keyword")
    public final String poiName;

    @C09CT("region_code")
    public final String poiRegionCode;

    @C09CT("video_count")
    public final Long videoCount;

    public final PoiAnchorData copy(String str, String str2, String str3, String str4, Integer num, String str5, Long l, String str6, String str7, String str8, UrlModel urlModel, String str9, Long l2, Integer num2) {
        return new PoiAnchorData(str, str2, str3, str4, num, str5, l, str6, str7, str8, urlModel, str9, l2, num2);
    }

    public final Integer isTtKeyCategory() {
        return this.isTtKeyCategory;
    }

    public PoiAnchorData(String str, String str2, String str3, String str4, Integer num, String str5, Long l, String str6, String str7, String str8, UrlModel urlModel, String str9, Long l2, Integer num2) {
        this.poiId = str;
        this.poiName = str2;
        this.poiCity = str3;
        this.description = str4;
        this.poiDeviceSameCity = num;
        this.poiCityCode = str5;
        this.videoCount = l;
        this.poiRegionCode = str6;
        this.poiInfoSource = str7;
        this.fromGroupId = str8;
        this.icon = urlModel;
        this.collectInfo = str9;
        this.favCnt = l2;
        this.isTtKeyCategory = num2;
    }
}
