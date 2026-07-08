package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.AnonymousClass0564;
import X.C09CT;
import X.C0VR3;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductListRequestBody {

    @C09CT("click_product_id_list")
    public final List<String> clickProductIdList;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("exposed_product_id_list")
    public final List<String> exposedProductIds;

    @C09CT("gecko_version")
    public final Long geckoVersion;

    @C09CT("insert_items")
    public final List<InsertItem> insertItems;

    @C09CT("last_expo_item_id")
    public final String lastExpoItemId;

    @C09CT("multiverse_bizcodes")
    public final List<String> multiverseBizCodes;

    @C09CT("need_bmsm")
    public final int needBmsm;

    @C09CT("need_server_calibration_column")
    public final Integer needServerCalibrationColumn;

    @C09CT("page_name")
    public final String pageName;

    @C09CT("page_size")
    public final int pageSize;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("expo_product_id_list")
    public final List<String> pdpExpoProductIds;

    @C09CT("ec_common_api_preload")
    public final int prefetchReq;

    @C09CT("product_id")
    public final String productId;

    @C09CT("protocol_version")
    public final Integer protocolVersion;

    @C09CT("recommend_context")
    public final String recommendContext;

    @C09CT("related_product_id_list")
    public final List<String> relatedProductIdList;

    @C09CT("scroll_param")
    public final String scrollParam;

    @C09CT("search_card_live_product_id_list")
    public final List<String> searchCardLiveProductIds;

    @C09CT("search_card_no_live_product_id_list")
    public final List<String> searchCardNoLiveProductIds;

    @C09CT("search_query")
    public final List<String> searchQuery;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("sort_field")
    public final int sortField;

    @C09CT("sort_order")
    public final int sortOrder;

    @C09CT("source_previous_page")
    public final String sourcePreviousPage;

    @C09CT("traffic_source_list")
    public final int[] trafficSourceList;

    @C09CT("ug_top_product_id")
    public final String ug_top_product_id;

    @C09CT("video_id")
    public final String videoId;

    @C09CT("video_product_id")
    public final List<String> videoProductIds;

    @C09CT("voucher_type_ids")
    public final List<String> voucherTypeIds;

    @C09CT("with_header")
    public final Boolean withHeader;

    public ProductListRequestBody(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6, String str7, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, String str8, int[] iArr, List<String> list8, String str9, String str10, String str11, String str12, List<InsertItem> list9, int i4, int i5, Integer num, List<String> list10, String str13, List<String> list11, Boolean bool, Integer num2, Long l) {
        this.sellerId = str;
        this.productId = str2;
        this.sortField = i;
        this.sortOrder = i2;
        this.pageSize = i3;
        this.sessionId = str3;
        this.enterFrom = str4;
        this.sourcePreviousPage = str5;
        this.enterMethod = str6;
        this.pageName = str7;
        this.exposedProductIds = list;
        this.pdpExpoProductIds = list2;
        this.clickProductIdList = list3;
        this.relatedProductIdList = list4;
        this.searchCardLiveProductIds = list5;
        this.searchCardNoLiveProductIds = list6;
        this.searchQuery = list7;
        this.scrollParam = str8;
        this.trafficSourceList = iArr;
        this.voucherTypeIds = list8;
        this.ug_top_product_id = str9;
        this.recommendContext = str10;
        this.pageSourceInfo = str11;
        this.lastExpoItemId = str12;
        this.insertItems = list9;
        this.prefetchReq = i4;
        this.needBmsm = i5;
        this.protocolVersion = num;
        this.multiverseBizCodes = list10;
        this.videoId = str13;
        this.videoProductIds = list11;
        this.withHeader = bool;
        this.needServerCalibrationColumn = num2;
        this.geckoVersion = l;
    }

    public ProductListRequestBody(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, List list5, List list6, List list7, String str8, int[] iArr, List list8, String str9, String str10, String str11, String str12, List list9, int i4, int i5, Integer num, List list10, String str13, List list11, Boolean bool, Integer num2, Long l, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? AnonymousClass0564.SORT_FIELD_POPULAR.getValue() : i, (i6 & 8) != 0 ? C0VR3.UNEXPECTED.getValue() : i2, (i6 & 16) != 0 ? 20 : i3, str3, str4, (i6 & 128) != 0 ? "" : str5, (i6 & 256) != 0 ? "" : str6, (i6 & 512) != 0 ? "" : str7, (i6 & 1024) != 0 ? C13BV.INSTANCE : list, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list2, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list3, (i6 & 8192) != 0 ? C13BV.INSTANCE : list4, (i6 & 16384) != 0 ? C13BV.INSTANCE : list5, (32768 & i6) != 0 ? C13BV.INSTANCE : list6, (65536 & i6) != 0 ? C13BV.INSTANCE : list7, (131072 & i6) != 0 ? "" : str8, iArr, (524288 & i6) != 0 ? C13BV.INSTANCE : list8, (1048576 & i6) == 0 ? str9 : "", (2097152 & i6) != 0 ? null : str10, (4194304 & i6) != 0 ? null : str11, (8388608 & i6) != 0 ? null : str12, (16777216 & i6) != 0 ? C13BV.INSTANCE : list9, (33554432 & i6) != 0 ? 0 : i4, (67108864 & i6) != 0 ? 0 : i5, (134217728 & i6) != 0 ? null : num, (268435456 & i6) != 0 ? null : list10, (536870912 & i6) != 0 ? null : str13, (1073741824 & i6) != 0 ? null : list11, (i6 & Integer.MIN_VALUE) != 0 ? null : bool, (i7 & 1) != 0 ? null : num2, (i7 & 2) == 0 ? l : null);
    }
}
