package com.ss.android.ugc.aweme.mapapi;

import X.C1176580giu;
import X.C1177960gl8;
import X.C1203050hPb;
import X.InterfaceC1176690gj5;
import X.InterfaceC1176890gjP;
import X.InterfaceC1177070gjh;
import android.app.Activity;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface IPoiMapService {
    C1176580giu LIZ(List<C1177960gl8> list);

    void LIZIZ(Activity activity);

    InterfaceC1177070gjh LIZJ(float f);

    InterfaceC1176890gjP LIZLLL();

    String LJ(Context context);

    boolean LJFF();

    InterfaceC1176690gj5 getIMapManager(C1203050hPb c1203050hPb);

    boolean googleServiceEnable();
}
