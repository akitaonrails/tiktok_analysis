package com.bytedance.pia.core.bridge.channel;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1287700jc8;
import X.C1BPD;
import X.C1BQC;
import X.C1C7U;
import X.C2204481BPq;
import X.InterfaceC1530550pvp;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes35.dex */
public final class WebViewPort implements C1BQC {
    public final C1BPD<n> LIZ = new C1BPD<>();
    public final C1BPD<String> LIZIZ;
    public WebMessagePort LIZJ;
    public final WeakReference<WebView> LIZLLL;

    @Override // X.C1BQC
    public final void close() {
        C1BPD<n> c1bpd = this.LIZ;
        c1bpd.LIZLLL = true;
        c1bpd.LIZIZ();
        c1bpd.LIZ.set(null);
        C1BPD<String> c1bpd2 = this.LIZIZ;
        c1bpd2.LIZLLL = true;
        c1bpd2.LIZIZ();
        c1bpd2.LIZ.set(null);
        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BQA
            @Override // java.lang.Runnable
            public final void run() {
                WebMessagePort webMessagePort = this.LL.LIZJ;
                if (webMessagePort != null) {
                    webMessagePort.close();
                }
            }
        });
    }

    public static class JSInterface {
        public static final WeakHashMap<WebView, JSInterface> LIZJ = new WeakHashMap<>();
        public final AtomicReference<C1BPD<String>> LIZ = new AtomicReference<>(null);
        public C1BPD<String> LIZIZ = null;

        public static /* synthetic */ void LIZ(WebView webView) {
            C1C7U.LIZ("WebViewPort$JSInterface@afbd.initialize$1L");
            if (LIZJ.get(webView) != null) {
                C1C7U.LIZIZ("WebViewPort$JSInterface@afbd.initialize$1L");
                return;
            }
            JSInterface jSInterface = new JSInterface();
            webView.addJavascriptInterface(jSInterface, "pia_bridge");
            LIZJ.put(webView, jSInterface);
            C1C7U.LIZIZ("WebViewPort$JSInterface@afbd.initialize$1L");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @JavascriptInterface
        public void postMessage(String str) throws Throwable {
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/pia/core/bridge/channel/WebViewPort$JSInterface", "postMessage", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyUb+fKyhgISWMjPx9TyxqoRfhdrNSf1R+MyzEVpz52y8jOMA==", null)));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            Object obj = str;
            if (objArr != null) {
                Object obj2 = objArr[0];
                obj = str;
                if (obj2 != null) {
                    obj = obj2;
                }
            }
            if ("__port_init__".equals(obj) || "__port_init_next__".equals(obj)) {
                AtomicReference<C1BPD<String>> atomicReference = this.LIZ;
                C1BPD<String> c1bpd = new C1BPD<>();
                while (true) {
                    if (atomicReference.compareAndSet(null, c1bpd)) {
                        this.LIZIZ = this.LIZ.get();
                        break;
                    } else if (atomicReference.get() != null) {
                        this.LIZIZ = this.LIZ.getAndSet(null);
                        break;
                    }
                }
            }
            C1BPD<String> c1bpd2 = this.LIZIZ;
            if (c1bpd2 != 0) {
                c1bpd2.LIZ(obj);
            }
        }
    }

    @Override // X.C1BQC
    public final void LIZ(final C2204481BPq c2204481BPq) {
        this.LIZIZ.LIZJ(new InterfaceC1530550pvp() { // from class: X.1BPr
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                final WebViewPort webViewPort = this.LIZ;
                final InterfaceC1530550pvp interfaceC1530550pvp = c2204481BPq;
                final String str = (String) obj;
                webViewPort.getClass();
                C1287700jc8.LIZJ(new Runnable() { // from class: X.1BPE
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebViewPort webViewPort2 = webViewPort;
                        String str2 = str;
                        InterfaceC1530550pvp interfaceC1530550pvp2 = interfaceC1530550pvp;
                        webViewPort2.getClass();
                        if ("__port_init__".equals(str2)) {
                            webViewPort2.LIZ.LIZJ(new C2204441BPm(webViewPort2, Boolean.FALSE));
                            return;
                        }
                        if ("__port_init_next__".equals(str2)) {
                            webViewPort2.LIZ.LIZJ(new C2204441BPm(webViewPort2, Boolean.TRUE));
                            return;
                        }
                        try {
                            GsonUtils.LIZIZ.getClass();
                            n nVar = (n) p.LIZJ(str2);
                            if (nVar.LJJIJIIJIL("data")) {
                                k kVarLJJIIZ = nVar.LJJIIZ("data");
                                kVarLJJIIZ.getClass();
                                if (!(kVarLJJIIZ instanceof n)) {
                                    nVar.LJJIFFI("data", p.LIZJ(nVar.LJJIIZ("data").LJIILJJIL().LJIL()));
                                }
                            }
                            interfaceC1530550pvp2.accept(nVar);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1BPP.LIZJ(4, "[Bridge] onMessage error:", th);
                        }
                    }
                });
            }
        });
    }

    @Override // X.C1BQC
    public final void LIZIZ(n nVar) {
        this.LIZ.LIZ(nVar);
    }

    public WebViewPort(WebView webView, C1BPD<String> c1bpd) {
        this.LIZIZ = c1bpd;
        this.LIZLLL = new WeakReference<>(webView);
    }
}
