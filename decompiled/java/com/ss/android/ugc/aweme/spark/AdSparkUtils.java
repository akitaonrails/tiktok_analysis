package com.ss.android.ugc.aweme.spark;

import X.AbstractC1028360crq;
import X.AbstractC1076640e7i;
import X.AbstractC1542100qES;
import X.C01GW;
import X.C04TD;
import X.C0BXA;
import X.C0WOV;
import X.C1020460cf6;
import X.C1025720cna;
import X.C1026310coX;
import X.C1028090crP;
import X.C1028100crQ;
import X.C1028380crs;
import X.C1029740cu4;
import X.C1039010d91;
import X.C1039050d95;
import X.C1039100d9A;
import X.C1039230d9N;
import X.C1049260dPY;
import X.C1051290dSp;
import X.C1388190mED;
import X.C1541950qED;
import X.C19EG;
import X.C292440BdC;
import X.C452501pT;
import X.C811103Ev;
import X.EnumC1000680c9C;
import X.EnumC1036160d4Q;
import X.InterfaceC1056670dbV;
import X.InterfaceC1057870ddR;
import X.InterfaceC1542790qFZ;
import X.InterfaceC2217701Bqy;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.WalletBusiness;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.spark.AdSparkBizWebViewClientDelegate;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.CommonSparkBizWebChromeDelegate;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdSparkUtils implements IAdSparkUtils {
    public static final C01GW<IAdLandingPagePopUpService> LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(275));

    public static IAdSparkUtils LJFF() {
        Object objLIZ = C04TD.LIZ(IAdSparkUtils.class, false);
        if (objLIZ != null) {
            return (IAdSparkUtils) objLIZ;
        }
        if (C04TD.u5 == null) {
            synchronized (IAdSparkUtils.class) {
                if (C04TD.u5 == null) {
                    C04TD.u5 = new AdSparkUtils();
                }
            }
        }
        return C04TD.u5;
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final AdSparkFragment LIZIZ(boolean z) {
        return new AdSparkFragment(z);
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final void LIZLLL(SparkContext sparkContext, final String str) {
        if (str == null || a0.LJJJIL(str)) {
            C811103Ev.LIZ(null);
            if (str == null) {
                return;
            }
        }
        sparkContext.LJJJZ("access_key", str);
        sparkContext.LJJ(AbstractC1076640e7i.class, new AbstractC1076640e7i() { // from class: X.0dTD
            @Override // X.AbstractC1076640e7i
            public final C1533560q0g LIZ(C1533560q0g c1533560q0g) {
                String str2 = str;
                C1533570q0h c1533570q0h = c1533560q0g.LIZIZ;
                if (c1533570q0h != null) {
                    c1533570q0h.LIZ = str2;
                }
                return c1533560q0g;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final void LJ(SparkContext sparkContext, Bundle bundle) {
        Object obj;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                if (!Intrinsics.LJFF("url", str)) {
                    try {
                        obj = bundle.get(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    }
                    if (obj instanceof Boolean) {
                        sparkContext.LJJL(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        sparkContext.LJJJLL(((Number) obj).doubleValue(), str);
                    } else if (obj instanceof Integer) {
                        sparkContext.LJJJLZIJ(((Number) obj).intValue(), str);
                    } else if (obj instanceof String) {
                        sparkContext.LJJJZ(str, (String) obj);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final AdSparkContext LIZJ(final Context context, final String str, final Bundle bundle, final Map<String, String> map, boolean z) {
        final C1039050d95 c1039050d95 = new C1039050d95(0);
        final AdSparkContext adSparkContext = new AdSparkContext();
        if (str != null) {
            adSparkContext.LJJLIIJ(str);
        }
        adSparkContext.LJJLJ(new AbstractC1542100qES(context, bundle) { // from class: X.0dT2
            public final /* synthetic */ Bundle LLILLJJLI;

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(final InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                final C1051660dTQ c1051660dTQ;
                final C1075770e6J c1075770e6J;
                final View viewE1;
                EnumC1062400dkk enumC1062400dkk;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                C1537480q70 hybridContext;
                AdSparkUtils adSparkUtils = this.LL;
                Bundle bundle2 = this.LLILLJJLI;
                adSparkUtils.getClass();
                if (interfaceC1541990qEH == null || (hybridContext = interfaceC1541990qEH.getHybridContext()) == null || (c1051660dTQ = (C1051660dTQ) hybridContext.LJFF(C1051660dTQ.class)) == null) {
                    c1051660dTQ = new C1051660dTQ();
                    if (interfaceC1541990qEH == null) {
                        return;
                    }
                }
                C1537480q70 hybridContext2 = interfaceC1541990qEH.getHybridContext();
                if (hybridContext2 != null) {
                    hybridContext2.LJJ(C1051660dTQ.class, c1051660dTQ);
                }
                C1537480q70 hybridContext3 = interfaceC1541990qEH.getHybridContext();
                if (hybridContext3 != null && (c1075770e6J = (C1075770e6J) hybridContext3.LJFF(C1075770e6J.class)) != null && (viewE1 = interfaceC1541990qEH.e1()) != null) {
                    new C1020270cen();
                    c1051660dTQ.LIZIZ = interfaceC1541990qEH.getHybridContext();
                    c1051660dTQ.LJ(Context.class, viewE1.getContext());
                    c1051660dTQ.LJ(View.class, viewE1);
                    C1029700cu0 c1029700cu0 = (C1029700cu0) interfaceC1541990qEH.getHybridContext().LJFF(C1029700cu0.class);
                    if (c1029700cu0 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1029700cu0.LIZ.get()) != null) {
                        c1051660dTQ.LJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.class, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                    }
                    if (viewE1 instanceof WebView) {
                        c1051660dTQ.LJ(IESJsBridge.class, new IESJsBridge((WebView) viewE1));
                    }
                    c1051660dTQ.LIZJ(Bundle.class, bundle2);
                    AbstractC1047280dMM abstractC1047280dMM = new AbstractC1047280dMM() { // from class: X.0dMP
                        @Override // X.AbstractC1047280dMM, X.InterfaceC1028200cra
                        public final Uri LIZJ() {
                            Uri uriLIZ;
                            InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
                            if (interfaceC1531560pxS != null && (uriLIZ = interfaceC1531560pxS.LIZ()) != null) {
                                return uriLIZ;
                            }
                            C1537480q70 hybridContext4 = interfaceC1541990qEH.getHybridContext();
                            String strLJIJI = null;
                            if ((hybridContext4 instanceof SparkContext) && hybridContext4 != null) {
                                strLJIJI = hybridContext4.LJIJI();
                            }
                            return UriProtector.parse(strLJIJI);
                        }

                        @Override // X.InterfaceC1028200cra
                        public final EnumC1054630dYD LJ() {
                            return viewE1 instanceof LynxView ? EnumC1054630dYD.LYNX : EnumC1054630dYD.WEB;
                        }

                        @Override // X.AbstractC1047280dMM, X.InterfaceC1028200cra
                        public final C1047290dMN getSessionInfo() {
                            String str3;
                            C1537480q70 c1537480q70 = c1051660dTQ.LIZIZ;
                            if (c1537480q70 == null || (str3 = c1537480q70.containerId) == null) {
                                str3 = "";
                            }
                            return new C1047290dMN(str3);
                        }

                        @Override // X.AbstractC1047280dMM, X.InterfaceC1028200cra
                        public void onEvent(InterfaceC1047320dMQ interfaceC1047320dMQ) {
                            c1075770e6J.sendEvent(interfaceC1047320dMQ.getName(), (JSONObject) interfaceC1047320dMQ.getParams());
                        }
                    };
                    c1051660dTQ.LIZJ(InterfaceC1028200cra.class, abstractC1047280dMM);
                    interfaceC1541990qEH.getHybridContext().LJJ(InterfaceC1028200cra.class, abstractC1047280dMM);
                    for (final InterfaceC1051730dTX interfaceC1051730dTX : (ArrayList) C1020270cen.LIZ(c1051660dTQ)) {
                        if (!C1544000qHW.LJIIZILJ) {
                            C650250Pex c650250Pex = new C650250Pex();
                            c650250Pex.LIZ = interfaceC1051730dTX.getName();
                            int i = C1051440dT4.LIZ[interfaceC1051730dTX.getAccess().ordinal()];
                            if (i != 1) {
                                if (i == 2 || i != 3) {
                                    enumC1062400dkk = EnumC1062400dkk.PUBLIC;
                                } else {
                                    enumC1062400dkk = EnumC1062400dkk.PROTECT;
                                }
                            } else {
                                enumC1062400dkk = EnumC1062400dkk.PRIVATE;
                            }
                            c650250Pex.LIZIZ = enumC1062400dkk;
                            interfaceC1051730dTX.getNeedCallback();
                            c650250Pex.LIZLLL = new C1543340qGS() { // from class: X.0dTc
                                @Override // X.C1543340qGS
                                public final void LIZLLL() {
                                    interfaceC1051730dTX.release();
                                }

                                @Override // X.C1543340qGS
                                public final void LIZIZ(Object obj, final C1543350qGT c1543350qGT) {
                                    JSONObject jSONObject;
                                    if (!(obj instanceof String)) {
                                        return;
                                    }
                                    try {
                                        jSONObject = new JSONObject((String) obj);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C1AF0.LJ(e);
                                        if (Intrinsics.LJFF(a0.LJLIIIL((String) obj).toString(), "")) {
                                            jSONObject = new JSONObject();
                                        } else {
                                            c1543350qGT.LIZ(-1, null, "params illegal, params = " + ((String) obj));
                                            return;
                                        }
                                    }
                                    interfaceC1051730dTX.handle(jSONObject, new InterfaceC1058710den() { // from class: X.0dTe
                                        @Override // X.InterfaceC1058710den
                                        public final void LIZ(JSONObject jSONObject2) {
                                            c1543350qGT.LIZ(1, jSONObject2, "success");
                                        }

                                        @Override // X.InterfaceC1058710den
                                        public final void onError(int i2, String str3) {
                                            c1543350qGT.LIZ(i2, null, str3);
                                        }

                                        @Override // X.InterfaceC1058710den
                                        public final void LIZIZ(int i2, String str3, JSONObject jSONObject2) {
                                            c1543350qGT.LIZ(i2, jSONObject2, str3);
                                        }
                                    });
                                }
                            };
                            c1075770e6J.LJIILJJIL(c650250Pex);
                        }
                    }
                }
            }

            {
                this.LLILLJJLI = bundle;
            }
        });
        adSparkContext.LJJLJ(c1039050d95);
        adSparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0d9M
            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context2) {
                return context2;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle2) {
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
            public final void onRestoreInstanceState(Bundle bundle2) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) throws JSONException {
                c1039050d95.LJZ("onPause");
                C1039050d95 c1039050d952 = c1039050d95;
                WebKitView webKitView = c1039050d952.LLIZ;
                if (webKitView != null) {
                    webKitView.onPause();
                    if (c1039050d952.LJLLLLLL()) {
                        webKitView.pauseTimers();
                    }
                }
                PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) c1039050d95.LL.LIZIZ(PassBackWebInfoBusiness.class);
                if (passBackWebInfoBusiness != null) {
                    passBackWebInfoBusiness.LIZ();
                }
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null) {
                    C1039050d95 c1039050d953 = c1039050d95;
                    C1028210crb.LJJIJIIJIL(c1039050d953.LLJJI, c1039050d953.LLIZ);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1039050d95 c1039050d954 = c1039050d95;
                long j = jCurrentTimeMillis - c1039050d954.LLJJIJIL;
                c1039050d954.LLJJIJIL = 0L;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(j, "duration");
                C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
                c1039050d95.LJZL(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
                c1039050d95.LLLILZ();
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null) {
                    C1028210crb.LIZLLL(c1039050d95.LLIZ);
                }
                c1039050d95.LJZI();
                c1039050d95.LJZ("onDestroy");
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
                c1039050d95.LJZ("onStop");
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                c1039050d95.LJZ("onStart");
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                c1039050d95.LJZ("onResume");
                WebKitView webKitView = c1039050d95.LLIZ;
                if (webKitView != null) {
                    webKitView.onResume();
                    webKitView.resumeTimers();
                }
                c1039050d95.LL.LIZIZ(WalletBusiness.class);
                c1039050d95.LLJJIJIL = System.currentTimeMillis();
                C1039050d95 c1039050d952 = c1039050d95;
                c1039050d952.getClass();
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null) {
                    C1028210crb.LIZIZ(c1039050d952, c1039050d952.LLIZ);
                }
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle2) {
                c1039050d95.LL.LJIIIZ(sparkActivity);
                c1039050d95.LLLILZJ();
                c1039050d95.getClass();
                c1039050d95.LJZ("onCreate");
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) throws Exception {
                C1039050d95 c1039050d952 = c1039050d95;
                if (Build.VERSION.SDK_INT >= 30) {
                    C0IKF.LIZ.getClass();
                    C465320IMo.LIZ();
                    C19738412Ko c19738412KoLIZ = C19738212Km.LIZ(sparkActivity);
                    C20244914Jj c20244914JjLIZIZ = c19738412KoLIZ.LIZIZ.LIZIZ(WindowInsets.Type.systemBars());
                    Rect rectLIZ = c19738412KoLIZ.LIZ();
                    int iWidth = (rectLIZ.width() - c20244914JjLIZIZ.LIZ) - c20244914JjLIZIZ.LIZJ;
                    int iHeight = (rectLIZ.height() - c20244914JjLIZIZ.LIZIZ) - c20244914JjLIZIZ.LIZLLL;
                    ViewOnClickListenerC1041980dDo viewOnClickListenerC1041980dDo = c1039050d952.LLILZLL;
                    if (viewOnClickListenerC1041980dDo != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iWidth, iHeight);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnClickListenerC1041980dDo);
                        viewOnClickListenerC1041980dDo.setLayoutParams(layoutParams);
                        return;
                    }
                    return;
                }
                ViewOnClickListenerC1041980dDo viewOnClickListenerC1041980dDo2 = c1039050d952.LLILZLL;
                if (viewOnClickListenerC1041980dDo2 == null) {
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C12ES.LIZJ(configuration.screenWidthDp, sparkActivity), (int) C12ES.LIZJ(configuration.screenHeightDp, sparkActivity));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnClickListenerC1041980dDo2);
                viewOnClickListenerC1041980dDo2.setLayoutParams(layoutParams2);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
                if (c1039050d95.LL.LIZIZ(WalletBusiness.class) != null) {
                    WalletBusiness.LIZ(c1039050d95.LLJIJIL, i, i2, intent);
                }
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                C1886700zCG.LIZ(sparkActivity, i, iArr);
            }
        });
        if (!z) {
            adSparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0ctv
                @Override // X.InterfaceC1163130gND
                public final void release() {
                }

                @Override // X.InterfaceC1542790qFZ
                public final C1725480v0E LJJJJI() {
                    return new C1725480v0E(R.anim.b2, 0);
                }

                @Override // X.InterfaceC1542790qFZ
                public final C1725480v0E LJJLI() {
                    return new C1725480v0E(0, R.anim.b1);
                }
            });
        }
        adSparkContext.LJJ(InterfaceC1056670dbV.class, c1039050d95);
        adSparkContext.LJJ(Bundle.class, bundle);
        adSparkContext.LJJ(InterfaceC1057870ddR.class, new InterfaceC1057870ddR() { // from class: X.0d9b
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                String str2 = "";
                if (interfaceC1531560pxS instanceof C1541480qDS) {
                    AdSparkContext adSparkContext2 = adSparkContext;
                    String str3 = str;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    Uri uri = UriProtector.parse(str2);
                    Bundle bundle2 = bundle;
                    C1038730d8Z c1038730d8Z = new C1038730d8Z();
                    C1041690dDL.LIZ(uri, bundle2, c1038730d8Z);
                    adSparkContext2.LJJ(C1038730d8Z.class, c1038730d8Z);
                    C1541480qDS c1541480qDS = (C1541480qDS) interfaceC1531560pxS;
                    c1541480qDS.LIZLLL = new CommonSparkBizWebChromeDelegate(c1039050d95);
                    c1541480qDS.LIZJ = new AdSparkBizWebViewClientDelegate(c1039050d95);
                    if (!c1039050d95.LLJJLIIIJLLLLLLLZ) {
                        c1541480qDS.LJII(C1BW2.class, AFwS252S0000000_16.get$arr$(337));
                    }
                    final Map<String, String> map2 = map;
                    if (map2 != null) {
                        c1541480qDS.LJIIJJI = new InterfaceC1047700dN2() { // from class: X.0d9c
                            @Override // X.InterfaceC1047700dN2
                            public final C1040730dBn LIZ(C1040730dBn c1040730dBn) {
                                c1040730dBn.LIZIZ = map2;
                                return c1040730dBn;
                            }
                        };
                        return;
                    }
                    return;
                }
                if (!(interfaceC1531560pxS instanceof C1537910q7h)) {
                    return;
                }
                if (C0BNL.LIZ() == 1 || C0BNL.LIZ() == 3) {
                    C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                    c1537910q7h.LJIJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(context), 1073741824));
                    c1537910q7h.LJIIZILJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
                    C649560Pdq c649560Pdq = new C649560Pdq();
                    c649560Pdq.LIZIZ = Integer.valueOf(EnumC665490Q8l.PART_ON_LAYOUT.id());
                    c649560Pdq.LIZ = Boolean.TRUE;
                    c1537910q7h.LJIJJ(c649560Pdq);
                }
                C1537910q7h c1537910q7h2 = (C1537910q7h) interfaceC1531560pxS;
                this.getClass();
                c1537910q7h2.LJJII = AFwS252S0000000_16.get$arr$(745);
                AdSparkContext adSparkContext3 = adSparkContext;
                String str4 = str;
                if (str4 != null) {
                    str2 = str4;
                }
                Uri uri2 = UriProtector.parse(str2);
                Bundle bundle3 = bundle;
                C1027760cqs c1027760cqs = new C1027760cqs();
                C1041690dDL.LIZ(uri2, bundle3, c1027760cqs);
                adSparkContext3.LJJ(C1027760cqs.class, c1027760cqs);
                c1537910q7h2.LJIIIIZZ(new C1035640d3a(c1039050d95.LL));
            }
        });
        adSparkContext.LJJLIIIJLLLLLLLZ(c1039050d95);
        return adSparkContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v4, types: [X.0d4b, android.widget.FrameLayout, java.lang.String, kotlin.jvm.functions.Function1] */
    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final void LIZ(Context context, String str, Bundle bundle, String str2, boolean z, boolean z2, Aweme aweme, Object obj, Function1<? super Boolean, Unit> function1) {
        AwemeRawAd awemeRawAd;
        Boolean boolValueOf;
        C1026310coX c1026310coX;
        Boolean boolValueOf2;
        Bundle bundle2;
        String string;
        String string2;
        String string3;
        Integer numValueOf;
        Integer numValueOf2;
        String ak;
        int iIntValue;
        Integer lynxPresentationStyle;
        List<Fragment> listLJJLIIIJL;
        Dialog dialog;
        EnumC1036160d4Q enumC1036160d4Q;
        AdlpExtraModel adlpExtraModel;
        Integer lynxPresentationStyle2;
        C1026310coX c1026310coX2;
        IAdLandingPagePopUpService value;
        if (!C292440BdC.LIZ()) {
            AdSparkContext adSparkContextLIZJ = LIZJ(context, str, bundle, null, z2);
            LJ(adSparkContextLIZJ, bundle);
            if (z) {
                adSparkContextLIZJ.LJJL("use_forest", true);
            }
            LIZLLL(adSparkContextLIZJ, str2);
            C1541950qED.LIZJ.getClass();
            new C1541950qED(context, adSparkContextLIZJ).LIZIZ();
            return;
        }
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        String str3 = null;
        C1026310coX c1026310coX3 = new C1026310coX(null, awemeRawAd, C1028090crP.LIZ(aweme, null, 0, "", null, null, null, null), false, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), null);
        C01GW<IAdLandingPagePopUpService> c01gw = LIZ;
        IAdLandingPagePopUpService value2 = c01gw.getValue();
        if (value2 != null) {
            boolValueOf = Boolean.valueOf(value2.LJIIJJI(c1026310coX3, Boolean.TRUE));
        } else {
            boolValueOf = null;
        }
        c1026310coX3.setPopUpCustomConfig(new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, false, false, Boolean.TRUE, boolValueOf, null, null, null, false, false, false, false, null, Boolean.FALSE));
        if (aweme != null && awemeRawAd != null && c19egLIZIZ != null && (value = c01gw.getValue()) != null && value.LJIIJJI(c1026310coX3, Boolean.TRUE)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZIZ, "//commercialize/ad_landing_page/fullscreen");
            smartRouteBuildRoute.withParam("keyAdWebModel", c1026310coX3);
            smartRouteBuildRoute.withParam("keyFromScene", EnumC1036160d4Q.FROM_FEED_AD_FLING);
            smartRouteBuildRoute.open();
            return;
        }
        if ((obj instanceof C1026310coX) && (c1026310coX2 = (C1026310coX) obj) != null && c1026310coX2.getAwemeRawAd() != null) {
            c1026310coX = (C1026310coX) obj;
        } else {
            str3 = null;
            c1026310coX = new C1026310coX(str, awemeRawAd, C1028090crP.LIZ(aweme, null, 0, "", null, null, null, null), true, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), null);
        }
        IAdLandingPagePopUpService value3 = c01gw.getValue();
        if (value3 != null) {
            boolValueOf2 = Boolean.valueOf(value3.LJIIJJI(c1026310coX, Boolean.TRUE));
        } else {
            boolValueOf2 = null;
        }
        String str4 = str3;
        Integer num = str3;
        String str5 = str3;
        ?? r17 = str3;
        c1026310coX.setPopUpCustomConfig(new C1028100crQ(Boolean.FALSE, r17, Boolean.FALSE, false, false, Boolean.TRUE, boolValueOf2, str2, str4, num, false, false, false, false, str5, Boolean.FALSE));
        if (c19egLIZIZ != null && (C0BXA.LIZ() || ((adlpExtraModel = c1026310coX.getAdlpExtraModel()) != null && (lynxPresentationStyle2 = adlpExtraModel.getLynxPresentationStyle()) != null && lynxPresentationStyle2.intValue() == 1))) {
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            if (supportFragmentManager != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && !listLJJLIIIJL.isEmpty()) {
                for (Fragment fragment : listLJJLIIIJL) {
                    if ((fragment instanceof DialogFragment) && (dialog = ((DialogFragment) fragment).getDialog()) != null && dialog.isShowing()) {
                        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(c19egLIZIZ, "//commercialize/ad_landing_page/fullscreen");
                        smartRouteBuildRoute2.withParam("keyAdWebModel", c1026310coX);
                        if (z2) {
                            enumC1036160d4Q = EnumC1036160d4Q.DEFAULT;
                        } else {
                            enumC1036160d4Q = EnumC1036160d4Q.FROM_FEED_AD_FLING;
                        }
                        smartRouteBuildRoute2.withParam("keyFromScene", enumC1036160d4Q);
                        smartRouteBuildRoute2.open();
                        return;
                    }
                }
            }
            IAdLynxLandPageUtils iAdLynxLandPageUtils = (IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class);
            String strLJFF = ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LJFF(c1026310coX, c19egLIZIZ, str);
            EnumC1036160d4Q enumC1036160d4Q2 = EnumC1036160d4Q.DEFAULT;
            C1028100crQ popUpCustomConfig = c1026310coX.getPopUpCustomConfig();
            if (popUpCustomConfig != null) {
                ak = popUpCustomConfig.getAk();
            } else {
                ak = null;
            }
            Fragment fragmentLIZIZ = iAdLynxLandPageUtils.LIZIZ(c19egLIZIZ, strLJFF, c1026310coX, true, enumC1036160d4Q2, -1, ak, false, r17);
            if (function1 != null) {
                IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
                Boolean boolValueOf3 = Boolean.valueOf(z2);
                AdlpExtraModel adlpExtraModel2 = c1026310coX.getAdlpExtraModel();
                if (adlpExtraModel2 != null && (lynxPresentationStyle = adlpExtraModel2.getLynxPresentationStyle()) != null) {
                    iIntValue = lynxPresentationStyle.intValue();
                } else {
                    iIntValue = 0;
                }
                iAdWebUtils.pv(true, c19egLIZIZ, fragmentLIZIZ, boolValueOf3, r17, iIntValue, true, true, true, r17, function1);
                return;
            }
            ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).pv(true, c19egLIZIZ, fragmentLIZIZ, Boolean.valueOf(z2), r17, 0, true, true, true, r17, AFwS231S0000000_3.get$arr$(304));
            return;
        }
        C1039050d95 c1039050d95 = new C1039050d95(0);
        EnumC1000680c9C enumC1000680c9C = EnumC1000680c9C.ONLY_RENDER;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        C1051290dSp c1051290dSp = new C1051290dSp(enumC1000680c9C, "", 0, false, new C1049260dPY("landing_page_1p", str, bundle2, str2, new C1020460cf6(c1039050d95), false, null, false, null, null, null, null, 16352), null, z2, false, 348);
        IAdHybridContainerManager iAdHybridContainerManager = (IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class);
        C0WOV c0wov = C0WOV.SPARK;
        if (bundle != null) {
            string = bundle.getString("aweme_creative_id");
            string2 = bundle.getString("bundle_download_app_log_extra");
            string3 = bundle.getString("aweme_group_id");
            numValueOf = Integer.valueOf(bundle.getInt("charge_type"));
            numValueOf2 = Integer.valueOf(bundle.getInt("ad_system_origin"));
        } else {
            string = null;
            string2 = null;
            string3 = null;
            numValueOf = null;
            numValueOf2 = null;
        }
        AbstractC1028360crq abstractC1028360crqLIZLLL = iAdHybridContainerManager.LIZLLL(new C1028380crs("landing_page_1p", c0wov, context, new C1029740cu4(string, string2, string3, numValueOf, numValueOf2, null, false, 96)), c1051290dSp);
        abstractC1028360crqLIZLLL.LJIIZILJ(new C1039230d9N(c1039050d95));
        abstractC1028360crqLIZLLL.LJIJJ(new C1039010d91(c1039050d95));
        abstractC1028360crqLIZLLL.LJIJ(new C1039100d9A(c1039050d95));
        abstractC1028360crqLIZLLL.LJJI(c1051290dSp);
    }
}
