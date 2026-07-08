package com.ss.android.ugc.aweme.poi.map;

import X.C1181330gqZ;
import X.C11NZ;
import X.C1202730hP5;
import X.C1499810p8F;
import X.C286740BLs;
import X.InterfaceC1186540gyy;
import X.InterfaceC20153313tL;
import X.InterfaceC727570SgN;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailPreloadHandler implements InterfaceC1186540gyy, InterfaceC727570SgN<PoiListApi, C11NZ<PoiListApi.PoiDetailResponse>> {
    @Override // X.InterfaceC1186540gyy
    public void doPreload(Context context, RouteIntent routeIntent) {
    }

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC1186540gyy
    public List<C1202730hP5> getImagePreloadConfig(Context context, RouteIntent routeIntent) {
        return null;
    }

    @Override // X.InterfaceC1186540gyy
    public List<Class<? extends InterfaceC20153313tL>> getNetPreloadConfig(Context context, RouteIntent routeIntent) {
        return null;
    }

    @Override // X.InterfaceC1186540gyy
    public List<String> supportedUri() {
        return Collections.singletonList("//poi/map");
    }

    @Override // X.InterfaceC1186540gyy
    public boolean isEnabled() {
        return C286740BLs.LIZ();
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 20000, true, 20);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    @Override // X.InterfaceC1186540gyy
    public List<C1181330gqZ> getXmlPreloadConfig(Context context, RouteIntent routeIntent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1181330gqZ(1, 1, Integer.valueOf(R.layout.e4n), 1, "poi_map_fra_location_detail"));
        return arrayList;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<PoiListApi.PoiDetailResponse> preload2(Bundle bundle, Function1<? super Class<PoiListApi>, ? extends PoiListApi> function1) {
        String string;
        if (bundle != null) {
            string = bundle.getString("poi_id");
        } else {
            string = null;
        }
        PoiListApi poiListApiInvoke = function1.invoke(PoiListApi.class);
        if (string == null) {
            string = "";
        }
        return poiListApiInvoke.LIZ(string);
    }
}
