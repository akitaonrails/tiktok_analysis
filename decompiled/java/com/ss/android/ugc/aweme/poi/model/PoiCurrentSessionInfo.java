package com.ss.android.ugc.aweme.poi.model;

import X.C09CT;
import com.ss.android.ugc.aweme.slash.data.AnchorComponentInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCurrentSessionInfo implements Serializable {

    @C09CT("album_session_id")
    public final String albumSessionId;

    @C09CT("anchor_module_list")
    public final List<AnchorComponentInfo> anchorModuleList;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("poi_secondary_page_bottom_bar_enable")
    public final Boolean enableBottomBar;

    @C09CT("enter_gallery_from")
    public final String enterGalleryFrom;

    @C09CT("initial_poi_enter_from")
    public final String initialPoiEnterFrom;

    @C09CT("initial_poi_enter_method")
    public final String initialPoiEnterMethod;

    @C09CT("initial_poi_from_group_id")
    public final String initialPoiFromGroupId;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("poi_address")
    public final String poiAddress;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("poi_session_id")
    public final String poiSessionId;

    @C09CT("region_code")
    public final String regionCode;

    @C09CT("search_params")
    public final String searchParams;

    public PoiCurrentSessionInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PoiCurrentSessionInfo copy(List<AnchorComponentInfo> list, Boolean bool, String str, String str2, String str3, String str4, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return new PoiCurrentSessionInfo(list, bool, str, str2, str3, str4, str5, bool2, str6, str7, str8, str9, str10, str11, str12);
    }

    public final Boolean isCollected() {
        return this.isCollected;
    }

    public PoiCurrentSessionInfo(List<AnchorComponentInfo> list, Boolean bool, String str, String str2, String str3, String str4, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.anchorModuleList = list;
        this.enableBottomBar = bool;
        this.poiSessionId = str;
        this.poiId = str2;
        this.albumSessionId = str3;
        this.poiName = str4;
        this.poiAddress = str5;
        this.isCollected = bool2;
        this.initialPoiFromGroupId = str6;
        this.initialPoiEnterFrom = str7;
        this.initialPoiEnterMethod = str8;
        this.collectInfo = str9;
        this.searchParams = str10;
        this.enterGalleryFrom = str11;
        this.regionCode = str12;
    }
}
