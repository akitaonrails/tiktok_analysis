package com.ss.android.ugc.aweme.poi.reviews.preload;

import X.C080U;
import X.C0C64;
import X.C1187090gzr;
import X.C11NZ;
import X.C125300dn;
import X.C1499810p8F;
import X.EnumC1156330gCF;
import X.EnumC1175520ghC;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.net.preload.PreloadExtraData;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewListPreload implements InterfaceC727570SgN<PoiReviewsApi, C11NZ<PoiReviewsApi.PoiReviewListResponse>> {
    public static final C1187090gzr Companion = new Object() { // from class: X.0gzr
    };

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        String string;
        if (bundle != null) {
            string = bundle.getString("preload_flag");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "poi_review_touch_preload")) {
            return C125300dn.LIZ(bundle.getString("enter_method"));
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "poi_review_client_performance_optimization", true, false)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        String string;
        if (bundle != null) {
            string = bundle.getString("preload_flag");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "poi_review_touch_preload")) {
            return new C1499810p8F(false, Api.LIZ, "/tiktok/poi/review/get/v1", 20000, true, 4);
        }
        return new C1499810p8F(false, Api.LIZ, null, 20000, false, 28);
    }

    public final String getPreloadUrl$poi_release(String str) {
        if (Intrinsics.LJFF(str, "poi_review_touch_preload")) {
            return "/tiktok/poi/review/get/preload/v1";
        }
        return "/tiktok/poi/review/get/v1";
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<PoiReviewsApi.PoiReviewListResponse> preload2(Bundle bundle, Function1<? super Class<PoiReviewsApi>, ? extends PoiReviewsApi> function1) {
        String string;
        ArrayList<String> stringArrayList;
        String string2;
        String string3;
        String string4;
        String string5;
        ArrayList arrayList;
        PreloadExtraData preloadExtraData;
        List<String> listSingletonList = null;
        if (bundle == null || (string = bundle.getString("poi_id")) == null) {
            string = "";
        }
        if (bundle != null) {
            stringArrayList = bundle.getStringArrayList("pin_review_ids");
            string2 = bundle.getString("tag_id");
            string3 = bundle.getString("enter_from");
            string4 = bundle.getString("enter_method");
            string5 = bundle.getString("preload_flag");
        } else {
            stringArrayList = null;
            string2 = null;
            string3 = null;
            string4 = null;
            string5 = null;
        }
        if (Intrinsics.LJFF(string5, "poi_review_touch_preload")) {
            arrayList = new ArrayList();
            arrayList.add(new C080U("check_preload", "true"));
            arrayList.add(new C080U("check_preload_cache", "true"));
        } else {
            arrayList = null;
        }
        if (string5 != null && string5.length() > 0) {
            preloadExtraData = new PreloadExtraData(false, null, false, string5, 6);
        } else {
            preloadExtraData = null;
        }
        PoiReviewsApi poiReviewsApiInvoke = function1.invoke(PoiReviewsApi.class);
        String preloadUrl$poi_release = getPreloadUrl$poi_release(string5);
        int value = EnumC1175520ghC.POI_REVIEW_LANDING_2TAB.getValue();
        if (string2 != null && string2.length() != 0) {
            string2.toString();
            listSingletonList = Collections.singletonList(string2);
        }
        return poiReviewsApiInvoke.getPoiReviewsList(preloadUrl$poi_release, string, value, 20, 0L, stringArrayList, listSingletonList, EnumC1156330gCF.POI_REVIEW_SORT_TYPE_DEFAULT.getValue(), null, string3, Boolean.TRUE, string4, arrayList, preloadExtraData);
    }
}
