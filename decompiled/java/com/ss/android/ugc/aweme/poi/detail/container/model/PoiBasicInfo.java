package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBasicInfo {

    @C09CT("formatted_address")
    public final String address;

    @C09CT("category_name")
    public final String categoryName;

    @C09CT("city_code")
    public final String cityCode;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("father_poi")
    public final FatherPoiModel fatherPoi;

    @C09CT("poi_id")
    public final String id;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("poi_name")
    public final String name;

    @C09CT("poi_info_source")
    public final String poiInfoSource;

    @C09CT("location")
    public final PoiLocation poiLocation;

    @C09CT("region_code")
    public final String regionCode;

    @C09CT("type_level")
    public final String typeLevel;

    @C09CT("video_count")
    public final Long videoCount;

    public PoiBasicInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public PoiBasicInfo(String str, String str2, String str3, Long l, UrlModel urlModel, Boolean bool, String str4, String str5, FatherPoiModel fatherPoiModel, String str6, String str7, String str8, PoiLocation poiLocation, String str9) {
        this.id = str;
        this.name = str2;
        this.address = str3;
        this.videoCount = l;
        this.cover = urlModel;
        this.isCollected = bool;
        this.collectInfo = str4;
        this.typeLevel = str5;
        this.fatherPoi = fatherPoiModel;
        this.cityCode = str6;
        this.regionCode = str7;
        this.poiInfoSource = str8;
        this.poiLocation = poiLocation;
        this.categoryName = str9;
    }
}
