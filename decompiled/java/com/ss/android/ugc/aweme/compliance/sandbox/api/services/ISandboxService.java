package com.ss.android.ugc.aweme.compliance.sandbox.api.services;

import X.C0X52;
import X.C1494590ozp;
import X.EnumC847160XLe;
import X.InterfaceC1294060jmO;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.google.gson.n;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public interface ISandboxService {
    void LIZ(Context context);

    void LIZIZ(EnumC847160XLe enumC847160XLe);

    InterfaceC1904907d9 LIZJ();

    @InterfaceC1294060jmO
    void LIZLLL();

    boolean LJ();

    void LJFF(n nVar);

    Bundle appendDataFlowId(Bundle bundle, String str);

    void appendDataFlowId(Intent intent, int i);

    void appendDataFlowId(Intent intent, String str);

    void appendDataFlowId(WebView webView, String str);

    void appendDataFlowId(HashMap<String, String> map, String str);

    InterfaceC1904907d9 dataFlowIDInterceptor(String str);

    boolean needInterceptBySandbox(Intent intent, int i);

    /* JADX INFO: loaded from: classes29.dex */
    public static final class DefaultImpls {
        public static void appendDataFlowId(ISandboxService iSandboxService, Intent intent, int i) {
        }

        public static void appendDataFlowId(ISandboxService iSandboxService, Intent intent, String str) {
        }

        public static void appendDataFlowId(ISandboxService iSandboxService, WebView webView, String str) {
        }

        public static void appendDataFlowId(ISandboxService iSandboxService, HashMap<String, String> map, String str) {
        }

        public static boolean needInterceptBySandbox(ISandboxService iSandboxService, Intent intent, int i) {
            return false;
        }

        public static InterfaceC1904907d9 dataFlowIDInterceptor(ISandboxService iSandboxService, String str) {
            return new InterfaceC1904907d9() { // from class: com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService.dataFlowIDInterceptor.1
                @Override // X.InterfaceC1904907d9
                public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
                    C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
                    return c1494590ozp.LIZ(c1494590ozp.LIZJ);
                }
            };
        }

        public static Bundle appendDataFlowId(ISandboxService iSandboxService, Bundle bundle, String str) {
            if (bundle == null) {
                return new Bundle();
            }
            return bundle;
        }
    }
}
