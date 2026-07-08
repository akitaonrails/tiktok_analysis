package com.ss.android.ugc.aweme.mapapi.service;

import X.C1176580giu;
import X.C1177960gl8;
import X.C1203050hPb;
import X.InterfaceC1176690gj5;
import X.InterfaceC1176890gjP;
import X.InterfaceC1177070gjh;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public final class PoiMapServiceEmptylmpl implements IPoiMapService {
    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final C1176580giu LIZ(List<C1177960gl8> list) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final void LIZIZ(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final String LJ(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final boolean LJFF() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final boolean googleServiceEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final InterfaceC1176890gjP LIZLLL() {
        return new InterfaceC1176890gjP() { // from class: X.19IM
            @Override // X.InterfaceC1176890gjP
            public final Bitmap LIZ(View view) {
                return Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final InterfaceC1177070gjh LIZJ(float f) {
        return new InterfaceC1177070gjh() { // from class: X.19IL
            @Override // X.InterfaceC1177070gjh
            public final C1177080gji LIZ(C1177960gl8 c1177960gl8) {
                return new C1177080gji(0.0d, 0.0d);
            }

            @Override // X.InterfaceC1177070gjh
            public final C1177960gl8 LIZIZ(C1177080gji c1177080gji) {
                return new C1177960gl8(0.0d, 0.0d);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.mapapi.IPoiMapService
    public final InterfaceC1176690gj5 getIMapManager(C1203050hPb c1203050hPb) {
        return new InterfaceC1176690gj5() { // from class: X.19IK
            @Override // X.InterfaceC1176690gj5
            public final View LIZ(Context context, LifecycleOwner lifecycleOwner) {
                return null;
            }

            @Override // X.InterfaceC1176690gj5
            public final Fragment LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC1176690gj5
            public final void X(Function1<? super InterfaceC1177250gjz, Unit> function1) {
            }
        };
    }
}
