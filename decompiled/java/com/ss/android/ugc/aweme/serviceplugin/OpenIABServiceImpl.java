package com.ss.android.ugc.aweme.serviceplugin;

import X.AbstractC1549150qPp;
import X.C1068950dvJ;
import X.C1068990dvN;
import X.C1205860hU8;
import X.C1544770qIl;
import X.C1697810uHb;
import X.C1B3M;
import X.C2196041Ax8;
import X.C2196051Ax9;
import X.InterfaceC1069010dvP;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.autofill.settings.OpenAutofillSettingsSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.experiment.SparkIframeInjectionAllowListConfigSettings;
import com.ss.android.ugc.aweme.opensdkservice.IOpenIABService;
import defpackage.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenIABServiceImpl implements IOpenIABService {
    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenIABService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
        return C1697810uHb.LJIIJJI(C1205860hU8.class, C2196041Ax8.class, C2196051Ax9.class);
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenIABService
    public final void LIZJ() {
        C1544770qIl.LIZJ(new m0() { // from class: X.0dvK
            public final C1068950dvJ LIZ = new C1068950dvJ(OpenAutofillSettingsSettings.LIZ().allowedDomains, null, OpenAutofillSettingsSettings.LIZ().ttopDFIDCheckEnabled, null, 8);

            @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
            public final boolean LIZIZ(String str) {
                return LJIIL(str);
            }

            public final boolean LJIIL(String str) {
                String host;
                if (!((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIL() || (host = UriProtector.parse(str).getHost()) == null) {
                    return true;
                }
                List<String> list = this.LIZ.LIZ;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (a0.LJJIIZI(host, it2.next(), true)) {
                            ArrayList<SparkIframeInjectionAllowListConfigSettings.IframeInnerConfigModel> arrayList = SparkIframeInjectionAllowListConfigSettings.LIZ().config;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                Iterator<SparkIframeInjectionAllowListConfigSettings.IframeInnerConfigModel> it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    List<String> list2 = it3.next().mainFrameAllowList;
                                    if (list2 != null && !list2.isEmpty()) {
                                        Iterator<String> it4 = list2.iterator();
                                        while (it4.hasNext()) {
                                            if (a0.LJJIIZI(host, it4.next(), true)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                return true;
            }

            @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
            public final boolean LIZJ(WebView webView, String str, String str2, JSInjectConfig jSInjectConfig, Integer num) {
                if (this.LIZ.LIZJ && num != null && num.intValue() != 402685961) {
                    return true;
                }
                return LJIIL(str);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenIABService
    public final InterfaceC1069010dvP LIZLLL() {
        return new C1B3M();
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenIABService
    public final C1068990dvN LIZIZ(final SparkContext sparkContext, final C1068950dvJ c1068950dvJ) {
        return new C1068990dvN(sparkContext, c1068950dvJ) { // from class: X.0dvI
            {
                sparkContext.LJJJJZI(new AbstractC1542200qEc(c1068950dvJ) { // from class: X.0dvH
                    public final C1068950dvJ LLILLJJLI;
                    public final C1068910dvF LLILLL;
                    public final C1068920dvG LLILZ;

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dvF] */
                    /* JADX WARN: Type inference failed for: r0v1, types: [X.0dvG] */
                    {
                        this.LLILLJJLI = c1068950dvJ;
                        this.LLILLL = new C0X7Z(c1068950dvJ) { // from class: X.0dvF
                            public final C1068950dvJ LIZ;

                            {
                                this.LIZ = c1068950dvJ;
                            }

                            @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                            public final boolean LIZIZ(String str) {
                                return LJIIL(str);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final boolean LJIIL(java.lang.String r6) {
                                /*
                                    r5 = this;
                                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                                    java.lang.Class<com.ss.android.ugc.aweme.autofill.IAdAutofillService> r0 = com.ss.android.ugc.aweme.autofill.IAdAutofillService.class
                                    java.lang.Object r0 = r1.getService(r0)
                                    com.ss.android.ugc.aweme.autofill.IAdAutofillService r0 = (com.ss.android.ugc.aweme.autofill.IAdAutofillService) r0
                                    boolean r4 = r0.LJIIL()
                                    android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
                                    java.lang.String r3 = r0.getHost()
                                    r2 = 1
                                    if (r3 == 0) goto L29
                                    X.0dvJ r0 = r5.LIZ
                                    java.util.List<java.lang.String> r1 = r0.LIZ
                                    boolean r0 = r1 instanceof java.util.Collection
                                    if (r0 == 0) goto L30
                                    boolean r0 = r1.isEmpty()
                                    if (r0 == 0) goto L30
                                L29:
                                    r0 = 0
                                L2a:
                                    if (r4 == 0) goto L2f
                                    if (r0 == 0) goto L2f
                                    r2 = 0
                                L2f:
                                    return r2
                                L30:
                                    java.util.Iterator r1 = r1.iterator()
                                L34:
                                    boolean r0 = r1.hasNext()
                                    if (r0 == 0) goto L29
                                    java.lang.Object r0 = r1.next()
                                    java.lang.String r0 = (java.lang.String) r0
                                    boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r2)
                                    if (r0 == 0) goto L34
                                    r0 = 1
                                    goto L2a
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1068910dvF.LJIIL(java.lang.String):boolean");
                            }

                            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                            public final String LJFF(Uri uri, WebView webView) throws JSONException {
                                C1068840dv8.LIZ.getClass();
                                Object objLIZIZ = C1068840dv8.LIZIZ();
                                if (objLIZIZ == null) {
                                    objLIZIZ = "[]";
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("autoFillField", objLIZIZ);
                                jSONObject.put("canAutoFill", 1);
                                return C786410Ut5.J3(jSONObject);
                            }

                            @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                            public final boolean LIZJ(WebView webView, String str, String str2, JSInjectConfig jSInjectConfig, Integer num) {
                                if (this.LIZ.LIZJ && num != null && num.intValue() != 402685961) {
                                    return true;
                                }
                                return LJIIL(str);
                            }
                        };
                        this.LLILZ = new AbstractC843480X7a(c1068950dvJ) { // from class: X.0dvG
                            public final C1068950dvJ LIZ;

                            @Override // X.AbstractC1544900qIy
                            public final void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
                            }

                            {
                                this.LIZ = c1068950dvJ;
                            }

                            @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                            public final boolean LIZIZ(String str) {
                                return LJIIL(str);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final boolean LJIIL(java.lang.String r6) {
                                /*
                                    r5 = this;
                                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                                    java.lang.Class<com.ss.android.ugc.aweme.autofill.IAdAutofillService> r0 = com.ss.android.ugc.aweme.autofill.IAdAutofillService.class
                                    java.lang.Object r0 = r1.getService(r0)
                                    com.ss.android.ugc.aweme.autofill.IAdAutofillService r0 = (com.ss.android.ugc.aweme.autofill.IAdAutofillService) r0
                                    boolean r4 = r0.LJIIL()
                                    android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
                                    java.lang.String r3 = r0.getHost()
                                    r2 = 1
                                    if (r3 == 0) goto L29
                                    X.0dvJ r0 = r5.LIZ
                                    java.util.List<java.lang.String> r1 = r0.LIZ
                                    boolean r0 = r1 instanceof java.util.Collection
                                    if (r0 == 0) goto L30
                                    boolean r0 = r1.isEmpty()
                                    if (r0 == 0) goto L30
                                L29:
                                    r0 = 0
                                L2a:
                                    if (r4 == 0) goto L2f
                                    if (r0 == 0) goto L2f
                                    r2 = 0
                                L2f:
                                    return r2
                                L30:
                                    java.util.Iterator r1 = r1.iterator()
                                L34:
                                    boolean r0 = r1.hasNext()
                                    if (r0 == 0) goto L29
                                    java.lang.Object r0 = r1.next()
                                    java.lang.String r0 = (java.lang.String) r0
                                    boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r2)
                                    if (r0 == 0) goto L34
                                    r0 = 1
                                    goto L2a
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1068920dvG.LJIIL(java.lang.String):boolean");
                            }

                            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                            public final String LJFF(Uri uri, WebView webView) throws JSONException {
                                String str;
                                C1068840dv8.LIZ.getClass();
                                Object objLIZIZ = C1068840dv8.LIZIZ();
                                if (objLIZIZ == null) {
                                    objLIZIZ = "[]";
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("autoFillField", objLIZIZ);
                                jSONObject.put("canAutoFill", 1);
                                C1068980dvM c1068980dvM = this.LIZ.LIZLLL;
                                if (c1068980dvM == null || (str = c1068980dvM.LIZ) == null) {
                                    str = "";
                                }
                                jSONObject.put("eventParams", str);
                                return C786410Ut5.J3(jSONObject);
                            }

                            @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
                            public final boolean LIZJ(WebView webView, String str, String str2, JSInjectConfig jSInjectConfig, Integer num) {
                                if (this.LIZ.LIZJ && num != null && num.intValue() != 402685961) {
                                    return true;
                                }
                                return LJIIL(str);
                            }
                        };
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        WebView webView = null;
                        if ((interfaceC1541990qEH instanceof WebKitView) && interfaceC1541990qEH != 0) {
                            webView = (WebView) interfaceC1541990qEH;
                        }
                        if (!((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJFF().booleanValue() && webView != null) {
                            String url = webView.getUrl();
                            C1068910dvF c1068910dvF = this.LLILLL;
                            C1068840dv8.LIZIZ = url;
                            C1068840dv8.LIZJ = new WeakReference<>(webView);
                            C1544770qIl.LIZ(webView, c1068910dvF);
                            C1068980dvM c1068980dvM = this.LLILLJJLI.LIZLLL;
                            if (c1068980dvM != null && c1068980dvM.LIZIZ) {
                                C1068920dvG c1068920dvG = this.LLILZ;
                                C1068840dv8.LIZIZ = url;
                                C1068840dv8.LIZJ = new WeakReference<>(webView);
                                C1544770qIl.LIZ(webView, c1068920dvG);
                            }
                        }
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                        C1544770qIl.LIZJ(this.LLILLL);
                        C1068980dvM c1068980dvM = this.LLILLJJLI.LIZLLL;
                        if (c1068980dvM != null && c1068980dvM.LIZIZ) {
                            C1544770qIl.LIZJ(this.LLILZ);
                        }
                    }
                });
                sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0dvB
                    @Override // X.InterfaceC2217701Bqy
                    public final Context LIZJ(Context context) {
                        return context;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIILLIIL(boolean z) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIL(Activity activity, Context context) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIJIIJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJLL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJZI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                        return false;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLJLI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void finish() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onActivityResult(int i, int i2, Intent intent) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onRestoreInstanceState(Bundle bundle) {
                    }

                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                        C1543490qGh.LIZIZ(C1068830dv7.class, null, 6);
                        C1543490qGh.LIZIZ(C1068820dv6.class, null, 6);
                        ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIJI(EnumC1059300dfk.TTOP);
                    }
                });
            }
        };
    }
}
