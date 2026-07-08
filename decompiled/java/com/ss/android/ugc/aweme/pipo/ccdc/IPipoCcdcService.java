package com.ss.android.ugc.aweme.pipo.ccdc;

import X.AbstractC905603gM;
import X.C1722550uvV;
import X.C1723850uxb;
import X.C1723860uxc;
import X.C19EG;
import X.InterfaceC1063710dmr;
import X.InterfaceC1294060jmO;
import X.InterfaceC1722230uuz;
import X.InterfaceC1722540uvU;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface IPipoCcdcService {
    @InterfaceC1294060jmO
    void LIZ(C1723860uxc c1723860uxc, AbstractC905603gM abstractC905603gM, InterfaceC1722230uuz interfaceC1722230uuz, String str, String str2, Map<String, ? extends Object> map);

    void LIZIZ(C1723850uxb c1723850uxb, InterfaceC1722230uuz interfaceC1722230uuz, Map<String, ? extends Object> map);

    boolean LIZJ();

    void LIZLLL();

    void LJ(Activity activity);

    boolean LJFF(String str);

    void LJI();

    void LJII(String str);

    boolean LJIIIIZZ(Context context, String str);

    boolean LJIIIZ(String str);

    boolean LJIIJ(String str);

    boolean LJIIJJI(String str);

    boolean LJIIL(Context context);

    C1722550uvV LJIILIIL(C19EG c19eg, LifecycleOwner lifecycleOwner, InterfaceC1722540uvU interfaceC1722540uvU);

    List<Class<? extends InterfaceC1063710dmr>> provideXBridgetIDLMethodList();
}
