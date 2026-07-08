package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class ProductListModel implements Serializable {

    @C09CT("aid")
    public final String aid;

    @C09CT("anchor_custom_data")
    public final AnchorCustomData anchorCustomData;

    @C09CT("anchors")
    public final List<AnchorCommonStruct> anchors;

    @C09CT("author")
    public final User author;

    @C09CT("author_uid")
    public final String authorUid;

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("aweme_extra_params")
    public final Map<String, String> awemeExtraParams;

    @C09CT("aweme_raw_ad")
    public final AwemeRawAd awemeRawAd;

    @C09CT("aweme_raw_ad_id_str")
    public final String awemeRawAdIdStr;

    @C09CT("enter_list_form")
    public final String enterListForm;

    @C09CT("entrance_form")
    public final String entranceForm;

    @C09CT("event_type")
    public final String eventType;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("is_ad")
    public final Boolean isAd;

    @C09CT("is_photo_mode")
    public final Boolean isPhotoMode;

    @C09CT("is_single_anchor")
    public final Boolean isSingleAnchor;

    @C09CT("mob_params")
    public final HashMap<String, String> mobParams;

    @C09CT("page_name")
    public final String pageName;

    @C09CT("panel_config")
    public final AnchorPanelConfig panelConfig;

    @C09CT("products")
    public final List<AnchorProductInfoModel> products;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("shop_ad_struct")
    public final ShopAdStruct shopAdStruct;

    @C09CT("start_click_time")
    public Long startClickTime;

    @C09CT("track_params")
    public final Map<String, Object> trackParams;

    public ProductListModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap()), null, null, null, new LinkedHashMap());
    }

    public final Boolean isAd() {
        return this.isAd;
    }

    public final Boolean isPhotoMode() {
        return this.isPhotoMode;
    }

    public final Boolean isSingleAnchor() {
        return this.isSingleAnchor;
    }

    public final void setStartClickTime(Long l) {
        this.startClickTime = l;
    }

    public ProductListModel(String str, String str2, String str3, List<AnchorCommonStruct> list, List<AnchorProductInfoModel> list2, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map<String, String> map, HashMap<String, String> map2, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct, Aweme aweme, Boolean bool2, Boolean bool3, AnchorPanelConfig anchorPanelConfig, String str7, String str8, String str9, Map<String, Object> map3) {
        this.aid = str;
        this.groupId = str2;
        this.requestId = str3;
        this.anchors = list;
        this.products = list2;
        this.authorUid = str4;
        this.author = user;
        this.awemeRawAdIdStr = str5;
        this.anchorCustomData = anchorCustomData;
        this.awemeExtraParams = map;
        this.mobParams = map2;
        this.isAd = bool;
        this.awemeRawAd = awemeRawAd;
        this.eventType = str6;
        this.startClickTime = l;
        this.shopAdStruct = shopAdStruct;
        this.aweme = aweme;
        this.isPhotoMode = bool2;
        this.isSingleAnchor = bool3;
        this.panelConfig = anchorPanelConfig;
        this.entranceForm = str7;
        this.pageName = str8;
        this.enterListForm = str9;
        this.trackParams = map3;
    }
}
