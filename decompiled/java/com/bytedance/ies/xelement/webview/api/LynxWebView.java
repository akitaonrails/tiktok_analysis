package com.bytedance.ies.xelement.webview.api;

import X.C1289960jfm;
import X.C1298720jtu;
import X.C1312960kGs;
import X.C14BI;
import X.C1C7U;
import X.C2178161AMk;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC2178151AMj;
import X.InterfaceC844240X9y;
import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.webview.api.LynxWebView;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxWebView extends UISimpleView<C1312960kGs> {
    public static final C2178161AMk Companion = new Object() { // from class: X.1AMk
    };
    public static final String DEFAULT = "default";
    public String html;
    public boolean htmlChanged;
    public C14BI provider;
    public String type;
    public String url;
    public boolean urlChanged;
    public WebView webView;
    public HashMap<String, Object> webViewParams;
    public InterfaceC2178151AMj webViewService;

    /* JADX INFO: renamed from: lambda$semisugar$onNodeReady$lambda-1$0, reason: not valid java name */
    public static /* synthetic */ void m132lambda$semisugar$onNodeReady$lambda1$0(LynxWebView lynxWebView) {
        C1C7U.LIZ("LynxWebView@cccd.onNodeReady$1L");
        m134onNodeReady$lambda1(lynxWebView);
        C1C7U.LIZIZ("LynxWebView@cccd.onNodeReady$1L");
    }

    /* JADX INFO: renamed from: lambda$semisugar$onNodeReady$lambda-2$0, reason: not valid java name */
    public static /* synthetic */ void m133lambda$semisugar$onNodeReady$lambda2$0(LynxWebView lynxWebView) {
        C1C7U.LIZ("LynxWebView@cccd.onNodeReady$2L");
        m135onNodeReady$lambda2(lynxWebView);
        C1C7U.LIZIZ("LynxWebView@cccd.onNodeReady$2L");
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        InterfaceC2178151AMj interfaceC2178151AMj = this.webViewService;
        if (interfaceC2178151AMj != null) {
            interfaceC2178151AMj.destroy();
        }
        this.webViewService = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.1AMi] */
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
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onNodeReady() {
        super.onNodeReady();
        if (this.webViewService == null) {
            C14BI c14bi = this.provider;
            InterfaceC2178151AMj interfaceC2178151AMjLIZ = c14bi != null ? c14bi.LIZ(this.mContext, this.type) : null;
            this.webViewService = interfaceC2178151AMjLIZ;
            if (interfaceC2178151AMjLIZ != null) {
                interfaceC2178151AMjLIZ.setParams(this.webViewParams);
            }
            InterfaceC2178151AMj interfaceC2178151AMj = this.webViewService;
            if (interfaceC2178151AMj != null) {
                interfaceC2178151AMj.LJJI();
            }
            InterfaceC2178151AMj interfaceC2178151AMj2 = this.webViewService;
            if (interfaceC2178151AMj2 != 0) {
                interfaceC2178151AMj2.LJJII(new InterfaceC844240X9y() { // from class: X.1AMi
                    @Override // X.InterfaceC844240X9y
                    public final void LJ() {
                        InterfaceC2178151AMj interfaceC2178151AMj3 = this.LIZ.webViewService;
                        if (interfaceC2178151AMj3 != null) {
                            interfaceC2178151AMj3.LJJIFFI("(function() {   window.addEventListener('message', function(event) {       window.LynxWebViewBridge.onMessageReceived(event.data);   });})();");
                        }
                        LynxWebView lynxWebView = this.LIZ;
                        lynxWebView.mContext.LLIZ.LIZIZ(new C1289960jfm(lynxWebView.getSign(), "load"));
                    }

                    @Override // X.InterfaceC844240X9y
                    public final void LIZ(String str) {
                        LynxWebView lynxWebView = this.LIZ;
                        C1298720jtu c1298720jtu = lynxWebView.mContext.LLIZ;
                        C1289960jfm c1289960jfm = new C1289960jfm(lynxWebView.getSign(), "message");
                        c1289960jfm.LIZIZ(str, "msg");
                        c1298720jtu.LIZIZ(c1289960jfm);
                    }

                    @Override // X.InterfaceC844240X9y
                    public final void LIZIZ(int i, String str) {
                        LynxWebView lynxWebView = this.LIZ;
                        C1298720jtu c1298720jtu = lynxWebView.mContext.LLIZ;
                        C1289960jfm c1289960jfm = new C1289960jfm(lynxWebView.getSign(), "error");
                        c1289960jfm.LIZIZ(Integer.valueOf(i), "errorCode");
                        c1289960jfm.LIZIZ(str, "errorMsg");
                        c1298720jtu.LIZIZ(c1289960jfm);
                    }
                });
            }
            InterfaceC2178151AMj interfaceC2178151AMj3 = this.webViewService;
            WebView webViewLIZ = interfaceC2178151AMj3 != null ? interfaceC2178151AMj3.LIZ() : null;
            this.webView = webViewLIZ;
            if (webViewLIZ != null) {
                webViewLIZ.setBackgroundColor(0);
                ((ViewGroup) this.mView).addView(webViewLIZ, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.urlChanged || this.htmlChanged) {
            String str = this.url;
            boolean z = str != null && str.length() > 0;
            String str2 = this.html;
            boolean z2 = str2 != null && str2.length() > 0;
            if (z && this.urlChanged) {
                HandlerHook.viewPost(this.mView, new ARunnableS133S0100000_33(this, 94));
            } else if (z2) {
                if (!z) {
                    HandlerHook.viewPost(this.mView, new ARunnableS133S0100000_33(this, 95));
                }
            } else if (!z && !z2) {
                C1298720jtu c1298720jtu = this.mContext.LLIZ;
                C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "error");
                c1289960jfm.LIZIZ(-1, "errorCode");
                c1289960jfm.LIZIZ("invalid input: src and html are empty", "errorMsg");
                c1298720jtu.LIZIZ(c1289960jfm);
            }
            this.urlChanged = false;
            this.htmlChanged = false;
        }
    }

    public final String getHtml() {
        return this.html;
    }

    public final C14BI getProvider() {
        return this.provider;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public LynxWebView(s sVar) {
        this(sVar, null);
    }

    /* JADX INFO: renamed from: onNodeReady$lambda-1, reason: not valid java name */
    public static final void m134onNodeReady$lambda1(LynxWebView lynxWebView) {
        InterfaceC2178151AMj interfaceC2178151AMj = lynxWebView.webViewService;
        if (interfaceC2178151AMj != null) {
            interfaceC2178151AMj.LJJ(lynxWebView.url);
        }
    }

    /* JADX INFO: renamed from: onNodeReady$lambda-2, reason: not valid java name */
    public static final void m135onNodeReady$lambda2(LynxWebView lynxWebView) {
        InterfaceC2178151AMj interfaceC2178151AMj = lynxWebView.webViewService;
        if (interfaceC2178151AMj != null) {
            interfaceC2178151AMj.LJJIII(lynxWebView.html);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0kGs] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public C1312960kGs createView(final Context context) {
        if (context == null) {
            return null;
        }
        return new AndroidView(context) { // from class: X.0kGs
            {
                new LinkedHashMap();
            }

            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (getChildCount() > 0) {
                    getChildAt(0).measure(i, i2);
                }
            }

            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                if (getChildCount() > 0) {
                    getChildAt(0).layout(0, 0, getWidth(), getHeight());
                }
            }
        };
    }

    @InterfaceC1312540kGC(name = "enable-debug")
    public final void setDebug(boolean z) {
        if (!LynxEnv.inst().isDevtoolEnabled()) {
            s sVar = this.mContext;
            if (sVar != null) {
                sVar.LJIILLIIL(new LynxError(229800, "Not allow to set enable-debug if devtool is not enabled, please enable Lynx Devtool.", "", "warn"));
                return;
            }
            return;
        }
        WebView.setWebContentsDebuggingEnabled(z);
    }

    public final void setHtml(String str) {
        this.html = str;
    }

    @InterfaceC1312540kGC(name = "html")
    public final void setHtmlString(String str) {
        this.html = str;
        this.htmlChanged = true;
    }

    @InterfaceC1312540kGC(name = "params")
    public final void setParams(ReadableMap readableMap) {
        HashMap<String, Object> mapAsHashMap;
        if (readableMap != null) {
            mapAsHashMap = readableMap.asHashMap();
        } else {
            mapAsHashMap = null;
        }
        this.webViewParams = mapAsHashMap;
    }

    public final void setProvider(C14BI c14bi) {
        this.provider = c14bi;
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        this.url = str;
        this.urlChanged = true;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @InterfaceC1312540kGC(name = "webview-type")
    public final void setWebViewType(String str) {
        this.type = str;
    }

    public LynxWebView(s sVar, Object obj) {
        super(sVar, obj);
        this.type = "default";
    }

    @InterfaceC1967107nB
    public final void eval(ReadableMap readableMap, Callback callback) {
        String string = readableMap.getString("func");
        if (string != null) {
            InterfaceC2178151AMj interfaceC2178151AMj = this.webViewService;
            if (interfaceC2178151AMj != null) {
                interfaceC2178151AMj.LJJIFFI(string);
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(4, "params error");
    }

    @InterfaceC1967107nB
    public final void reload(ReadableMap readableMap, Callback callback) {
        InterfaceC2178151AMj interfaceC2178151AMj = this.webViewService;
        if (interfaceC2178151AMj != null) {
            interfaceC2178151AMj.reload();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }
}
