package com.ss.android.ugc.aweme.poi.album;

import X.AnonymousClass0957;
import X.C0PEM;
import X.C1181330gqZ;
import X.C1185410gx9;
import X.C1186140gyK;
import X.C1202730hP5;
import X.C1499810p8F;
import X.C2296808zG;
import X.C23250099c;
import X.C279330Ax9;
import X.C286730BLr;
import X.InterfaceC1186540gyy;
import X.InterfaceC20153313tL;
import X.InterfaceC727570SgN;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumPreloadHandler implements InterfaceC1186540gyy, InterfaceC727570SgN<PoiAlbumPageApi, AnonymousClass0957<? extends PoiAlbumPageApi.PoiAlbumResponse>> {
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
        return Collections.singletonList("//poi/album");
    }

    @Override // X.InterfaceC1186540gyy
    public boolean isEnabled() {
        return C286730BLr.LIZ();
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
        if (((Number) C279330Ax9.LIZ.getValue()).intValue() == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1181330gqZ(1, 1, Integer.valueOf(R.layout.dyh), 1, "poi_album_page_layout"));
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public AnonymousClass0957<? extends PoiAlbumPageApi.PoiAlbumResponse> preload2(Bundle bundle, Function1<? super Class<PoiAlbumPageApi>, ? extends PoiAlbumPageApi> function1) {
        String string;
        Serializable serializable;
        C1185410gx9 c1185410gx9;
        if (bundle == null || (string = bundle.getString("poi_id")) == null) {
            string = "";
        }
        if (bundle != null) {
            serializable = bundle.getSerializable("poi_detail_params");
        } else {
            serializable = null;
        }
        if (serializable instanceof C1185410gx9) {
            c1185410gx9 = (C1185410gx9) serializable;
        } else {
            c1185410gx9 = null;
        }
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1186140gyK(function1, string, c1185410gx9, null), 3);
    }
}
