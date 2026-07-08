package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.EnumC797670VQv;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class ShowcaseProductListRequest {

    @C09CT("multiverse_bizcodes")
    public final List<String> bizCodes;

    @C09CT("creator_id")
    public final String creatorId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("exposed_product_id_list")
    public final List<String> exposedProductIdList;

    @C09CT("page_size")
    public final int pageSize;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("recommend_context")
    public final String recommendContext;

    @C09CT("scroll_param")
    public final String scrollParam;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("sort_field")
    public final int sortField;

    @C09CT("sort_order")
    public final int sortOrder;

    public ShowcaseProductListRequest() {
        this(null, 0, 0, 0, null, null, null, null, null, null, null, 2047, null);
    }

    public ShowcaseProductListRequest(String str, int i, int i2, int i3, String str2, List<String> list, String str3, String str4, String str5, String str6, List<String> list2) {
        this.creatorId = str;
        this.sortField = i;
        this.sortOrder = i2;
        this.pageSize = i3;
        this.scrollParam = str2;
        this.exposedProductIdList = list;
        this.sessionId = str3;
        this.enterFrom = str4;
        this.recommendContext = str5;
        this.pageSourceInfo = str6;
        this.bizCodes = list2;
    }

    public ShowcaseProductListRequest(String str, int i, int i2, int i3, String str2, List list, String str3, String str4, String str5, String str6, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 1 : i, (i4 & 4) != 0 ? EnumC797670VQv.ASC.getValue() : i2, (i4 & 8) != 0 ? 10 : i3, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? C13BV.INSTANCE : list, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? "" : str4, (i4 & 256) != 0 ? "" : str5, (i4 & 512) == 0 ? str6 : "", (i4 & 1024) != 0 ? C1697810uHb.LJIIJJI("Showcase.Homepage_Feeds.Double", "Showcase.Homepage_Feeds.Single") : list2);
    }
}
