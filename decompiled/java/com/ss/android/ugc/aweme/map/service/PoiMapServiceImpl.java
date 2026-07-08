package com.ss.android.ugc.aweme.map.service;

import X.C0V4W;
import X.C0WZX;
import X.C1176580giu;
import X.C1177960gl8;
import X.C1203050hPb;
import X.C1205490hTX;
import X.C1701330uNH;
import X.C1BTQ;
import X.C1EMR;
import X.C2204961BRm;
import X.C2204971BRn;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1176690gj5;
import X.InterfaceC1176890gjP;
import X.InterfaceC1177070gjh;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiDynamicMapSettings;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class PoiMapServiceImpl implements IPoiMapService {
    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final InterfaceC1176890gjP LIZLLL() {
        return new InterfaceC1176890gjP() { // from class: X.0Gu7
            @Override // X.InterfaceC1176890gjP
            public final Bitmap LIZ(View view) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE);
                view.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, 0, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, 0, view.getLayoutParams().height));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), view);
                return bitmapCreateBitmap;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final boolean LJFF() {
        PoiDynamicMapSettings.Config config = (PoiDynamicMapSettings.Config) SettingsManager.LIZLLL().LJIIIIZZ("poi_dynamic_map_config", PoiDynamicMapSettings.Config.class, null);
        if (config == null) {
            config = null;
        }
        if (config == null || !config.enable) {
            C1205490hTX.LIZ.LJ(C1EMR.DYNAMIC_MAP_DISABLE, null);
            return false;
        }
        if (C0V4W.LIZ()) {
            return true;
        }
        C1205490hTX.LIZ.LJ(C1EMR.GOOGLE_PLAY_SERVICE_DISABLE, null);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final boolean googleServiceEnable() {
        return C0V4W.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final C1176580giu LIZ(List<C1177960gl8> list) throws Throwable {
        C2204971BRn c2204971BRn = new C2204971BRn();
        for (C1177960gl8 c1177960gl8 : list) {
            C2204961BRm.LLLLLLZZ(c2204971BRn, new LatLng(c1177960gl8.lat, c1177960gl8.lon), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9Hd2SD+qEozjMxp3gY4jtOcxqqlNhmEOXQR", null));
        }
        LatLngBounds latLngBoundsLIZ = c2204971BRn.LIZ();
        LatLng latLng = latLngBoundsLIZ.southwest;
        C1177960gl8 c1177960gl82 = new C1177960gl8(latLng.latitude, latLng.longitude);
        LatLng latLng2 = latLngBoundsLIZ.northeast;
        return new C1176580giu(c1177960gl82, new C1177960gl8(latLng2.latitude, latLng2.longitude));
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final void LIZIZ(Activity activity) throws Throwable {
        int iB4;
        Intent errorResolutionIntent;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (activity != null && (iB4 = C786410Ut5.b4(googleApiAvailability, activity)) != 0 && googleApiAvailability.isUserResolvableError(iB4) && (errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(iB4)) != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, errorResolutionIntent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(errorResolutionIntent, activity);
            C2204961BRm.LJIIZILJ(20251210, activity, errorResolutionIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9Hd2SD+qEozjMxp3gY4jtOcxqqlNhmEOXQR", null));
        }
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final InterfaceC1177070gjh LIZJ(final float f) {
        return new InterfaceC1177070gjh(f) { // from class: X.1BS5
            public final C1BS6 LIZ;

            {
                this.LIZ = new C1BS6(((double) 256) * Math.pow(2.0d, f));
            }

            @Override // X.InterfaceC1177070gjh
            public final C1177080gji LIZ(C1177960gl8 c1177960gl8) {
                C1BSB c1bsbLIZIZ = this.LIZ.LIZIZ(new LatLng(c1177960gl8.lat, c1177960gl8.lon));
                return new C1177080gji(c1bsbLIZIZ.LIZ, c1bsbLIZIZ.LIZIZ);
            }

            @Override // X.InterfaceC1177070gjh
            public final C1177960gl8 LIZIZ(C1177080gji c1177080gji) {
                LatLng latLngLIZ = this.LIZ.LIZ(new C1BS7(c1177080gji.LIZ, c1177080gji.LIZIZ));
                return new C1177960gl8(latLngLIZ.latitude, latLngLIZ.longitude);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final String LJ(Context context) throws IOException {
        int i;
        Resources resources;
        InputStream inputStreamOpenRawResource;
        if (context != null) {
            if (C960203pA.LIZIZ(context)) {
                i = R.raw.nearby_discovery_map_dark_style;
            } else {
                i = R.raw.nearby_discovery_map_style;
            }
            if (context != null && (resources = context.getResources()) != null && (inputStreamOpenRawResource = resources.openRawResource(i)) != null) {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr, Charset.defaultCharset());
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final InterfaceC1176690gj5 getIMapManager(C1203050hPb c1203050hPb) {
        return new C1BTQ(c1203050hPb);
    }
}
