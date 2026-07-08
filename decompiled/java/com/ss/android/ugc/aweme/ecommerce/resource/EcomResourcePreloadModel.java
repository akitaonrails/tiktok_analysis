package com.ss.android.ugc.aweme.ecommerce.resource;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomResourcePreloadModel {

    @C09CT("api")
    public final String api;

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT("images")
    public final List<EcomResourceImageModel> images;

    @C09CT("is_webview_resource")
    public final Integer isWebViewResource;

    @C09CT("merge_model")
    public final EcomResourceMergeModel mergeModel;

    @C09CT("page_name")
    public final String pageName;

    public EcomResourcePreloadModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public EcomResourcePreloadModel(String str, String str2, String str3, Integer num, List<EcomResourceImageModel> list, EcomResourceMergeModel ecomResourceMergeModel) {
        this.api = str;
        this.pageName = str2;
        this.btmCode = str3;
        this.isWebViewResource = num;
        this.images = list;
        this.mergeModel = ecomResourceMergeModel;
    }

    public EcomResourcePreloadModel(String str, String str2, String str3, Integer num, List list, EcomResourceMergeModel ecomResourceMergeModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) == 0 ? ecomResourceMergeModel : null);
    }
}
