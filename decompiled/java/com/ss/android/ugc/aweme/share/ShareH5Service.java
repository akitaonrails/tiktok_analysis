package com.ss.android.ugc.aweme.share;

import X.AbstractC1968807nS;
import X.C1038660d8S;
import X.C1051660dTQ;
import X.C1075640e66;
import X.C1968907nT;
import X.C19EG;
import X.InterfaceC1037450d6V;
import X.InterfaceC1039110d9B;
import X.InterfaceC1063710dmr;
import X.InterfaceC1969407nY;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShareSearchMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface ShareH5Service {
    public static final C1038660d8S LIZ = C1038660d8S.LIZ;

    void LIZ(InterfaceC1039110d9B interfaceC1039110d9B, String str);

    Map<String, Class<?>> LIZIZ();

    void LIZJ(AbstractC1968807nS abstractC1968807nS, WebView webView);

    void LIZLLL(InterfaceC1039110d9B interfaceC1039110d9B, String str);

    void LJ(InterfaceC1039110d9B interfaceC1039110d9B, boolean z);

    void LJFF(InterfaceC1969407nY interfaceC1969407nY, WebView webView);

    void LJI(InterfaceC1039110d9B interfaceC1039110d9B);

    Map<String, Object> LJII(InterfaceC1969407nY interfaceC1969407nY);

    List<Class<? extends InterfaceC1063710dmr>> LJIIIIZZ();

    void LJIIIZ(AbstractC1968807nS abstractC1968807nS, Map map);

    ShareMethod LJIIJ(C1051660dTQ c1051660dTQ);

    void LJIIJJI(InterfaceC1969407nY interfaceC1969407nY, boolean z);

    void LJIIL(C1968907nT c1968907nT, InterfaceC1037450d6V interfaceC1037450d6V, int i);

    void LJIILIIL(InterfaceC1039110d9B interfaceC1039110d9B, WebKitView webKitView);

    void LJIILJJIL(C1968907nT c1968907nT, int i);

    void LJIILL(InterfaceC1969407nY interfaceC1969407nY, String str);

    void LJIILLIIL(C19EG c19eg, C1075640e66 c1075640e66);

    void LJIIZILJ();

    com.ss.android.ugc.aweme.fe.method.ShareMethod LJIJ(IESJsBridge iESJsBridge);

    void LJIJI(InterfaceC1039110d9B interfaceC1039110d9B, WebKitView webKitView);

    void LJIJJ(C1968907nT c1968907nT, InterfaceC1037450d6V interfaceC1037450d6V, int i);

    void LJIJJLI(AbstractC1968807nS abstractC1968807nS);

    ShareSearchMethod LJIL(C1051660dTQ c1051660dTQ);
}
