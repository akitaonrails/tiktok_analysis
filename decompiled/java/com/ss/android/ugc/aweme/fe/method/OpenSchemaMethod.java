package com.ss.android.ugc.aweme.fe.method;

import X.C01GW;
import X.C098200Yq;
import X.C1554300qY8;
import X.C1886207a8;
import X.C189200o6;
import X.C1ER1;
import X.C212367188v;
import X.C21244318Bt;
import X.C2198811B3v;
import X.C2211631BhB;
import X.C2214201BlK;
import X.C452501pT;
import X.C828330WeV;
import X.InterfaceC1041760dDS;
import X.InterfaceC1541990qEH;
import X.InterfaceC828360WeY;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.settings.PnsOpenThirdWebModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenSchemaMethod extends BaseCommonJavaMethod {
    public final C01GW LLILLL;

    public OpenSchemaMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenSchemaMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(173));
    }

    public final boolean LIZ(Context context, String str) {
        String scheme;
        String scheme2;
        if (str == null || str.length() == 0) {
            return false;
        }
        final AwS165S1100000_16 awS165S1100000_16 = new AwS165S1100000_16(context, str, 19);
        if (!u.LJJIIJZLJL(str, "aweme://lynxview", false)) {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                scheme = uri.getScheme();
            } else {
                scheme = null;
            }
            if (!Intrinsics.LJFF(scheme, "http")) {
                if (uri != null) {
                    scheme2 = uri.getScheme();
                } else {
                    scheme2 = null;
                }
                if (!Intrinsics.LJFF(scheme2, "https")) {
                    uri = (uri == null || UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url") == null) ? null : UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"));
                }
            }
            if (context != null && uri != null) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                PnsOpenThirdWebModel pnsOpenThirdWebModel = C1886207a8.LIZ;
                PnsOpenThirdWebModel pnsOpenThirdWebModel2 = (PnsOpenThirdWebModel) settingsManagerLIZLLL.LJIIIIZZ("pns_openthirdweb", PnsOpenThirdWebModel.class, pnsOpenThirdWebModel);
                if (pnsOpenThirdWebModel2 == null) {
                    pnsOpenThirdWebModel2 = pnsOpenThirdWebModel;
                }
                if (C1886207a8.LIZ(uri, pnsOpenThirdWebModel2.sysDomainList)) {
                    new C828330WeV(new ThirdPartyBizCert(0)).LIZIZ(context, uri.toString(), new InterfaceC828360WeY() { // from class: X.0dpw
                        @Override // X.InterfaceC828360WeY
                        public final void LIZ(Context context2, String str2) {
                            awS165S1100000_16.invoke();
                        }
                    }, null);
                    return true;
                }
                PnsOpenThirdWebModel pnsOpenThirdWebModel3 = (PnsOpenThirdWebModel) SettingsManager.LIZLLL().LJIIIIZZ("pns_openthirdweb", PnsOpenThirdWebModel.class, pnsOpenThirdWebModel);
                if (pnsOpenThirdWebModel3 != null) {
                    pnsOpenThirdWebModel = pnsOpenThirdWebModel3;
                }
                if (C1886207a8.LIZ(uri, pnsOpenThirdWebModel.iabDomainList)) {
                    SparkThirdContext sparkThirdContext = new SparkThirdContext();
                    sparkThirdContext.url = uri.toString();
                    sparkThirdContext.bizCert = new ThirdPartyBizCert(0);
                    C1554300qY8.LIZIZ(context, sparkThirdContext);
                    return true;
                }
            }
        }
        return ((Boolean) awS165S1100000_16.invoke()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strLJJIFFI;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject2;
        ContextWrapper contextWrapper;
        String strOptString;
        int iHashCode;
        LifecycleOwner lifecycleOwner;
        WebView webView;
        WebView webView2;
        JSONObject jSONObjectOptJSONObject2;
        Object c098200Yq;
        Object c098200Yq2;
        C2198811B3v c2198811B3v;
        InterfaceC1541990qEH interfaceC1541990qEH;
        View viewE1;
        if (jSONObject != null) {
            strLJJIFFI = jSONObject.optString("schema");
            jSONObjectOptJSONObject = jSONObject.optJSONObject("log_params");
        } else {
            strLJJIFFI = null;
            jSONObjectOptJSONObject = null;
        }
        if (((IECommerceArchService) ServiceManager.get().getService(IECommerceArchService.class)).LIZ()) {
            Uri uri = UriProtector.parse(strLJJIFFI);
            try {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_c_code");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str = (String) c098200Yq;
            try {
                c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_d_code");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            String str2 = (String) c098200Yq2;
            WeakReference<C2198811B3v> weakReference = this.LL;
            if (weakReference != null && (c2198811B3v = weakReference.get()) != null && (interfaceC1541990qEH = (InterfaceC1541990qEH) c2198811B3v.LIZ(InterfaceC1541990qEH.class)) != null && (viewE1 = interfaceC1541990qEH.e1()) != null) {
                if (str == null) {
                    if (str2 != null) {
                        str = "c0";
                    }
                } else if (str2 == null) {
                    str2 = "d0";
                }
                C2211631BhB.LJIJ(viewE1, str, str2, null, null);
            }
        }
        if (jSONObject == null || (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extra")) == null || (jSONObject2 = jSONObjectOptJSONObject2.optJSONObject("btm_params")) == null) {
            jSONObject2 = new JSONObject();
        }
        String strOptString2 = jSONObject2.optString("btm");
        if (strOptString2 != null && strOptString2.length() != 0) {
            JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("bcm");
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = strOptString2;
            IESJsBridge iESJsBridge = this.LLILLJJLI;
            if (iESJsBridge != null) {
                webView2 = iESJsBridge.LIZ;
            } else {
                webView2 = null;
            }
            c21244318Bt.LIZIZ = PageFinder.via((View) webView2);
            BcmParams.Companion.getClass();
            c21244318Bt.LIZJ = C212367188v.LIZIZ(jSONObjectOptJSONObject3);
            String strCreateJumpSourceBtmTokenForJSB = btmSDK.createJumpSourceBtmTokenForJSB(c21244318Bt);
            if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                Uri.Builder builderBuildUpon = UriProtector.parse(strLJJIFFI).buildUpon();
                builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
                strLJJIFFI = builderBuildUpon.build().toString();
            }
        }
        if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("from_card_type")) != null && ((iHashCode = strOptString.hashCode()) == -157761233 ? strOptString.equals("music_card_shot") : iHashCode == 745819626 ? strOptString.equals("trending_card") : !(iHashCode != 1563961651 || !strOptString.equals("related_search_card")))) {
            ComponentCallbacks2 componentCallbacks2LJFF = C2214201BlK.LJFF();
            if ((componentCallbacks2LJFF instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) componentCallbacks2LJFF) != null) {
                C1ER1 c1er1 = C1ER1.LIZIZ;
                IESJsBridge iESJsBridge2 = this.LLILLJJLI;
                if (iESJsBridge2 != null) {
                    webView = iESJsBridge2.LIZ;
                } else {
                    webView = null;
                }
                c1er1.LLZLL(webView, lifecycleOwner);
            }
        }
        if (this.LLILLJJLI != null) {
            if (this.mContextRef.get() != null) {
                Context baseContext = this.mContextRef.get();
                if (!(baseContext instanceof Activity) || baseContext == null) {
                    if ((baseContext instanceof MutableContextWrapper) && (contextWrapper = (ContextWrapper) baseContext) != null) {
                        baseContext = contextWrapper.getBaseContext();
                    } else {
                        baseContext = null;
                    }
                    if (!(baseContext instanceof Activity)) {
                        baseContext = null;
                    }
                }
                if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O5().LIZLLL(baseContext, strLJJIFFI).booleanValue() && !LIZ(baseContext, strLJJIFFI)) {
                    if (!TextUtils.isEmpty(strLJJIFFI) && a0.LJJIIZI(strLJJIFFI, "shoutouts/publish", false)) {
                        strLJJIFFI = u.LJJIII(strLJJIFFI, "aweme", "sslocal", false);
                    } else if (!((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LJI(strLJJIFFI)) {
                        if (strLJJIFFI != null) {
                            strLJJIFFI = u.LJJIFFI(strLJJIFFI, "aweme", "sslocal", false);
                        } else {
                            strLJJIFFI = null;
                        }
                    }
                    ICommercializeFromMainOutService iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LLILLL.getValue();
                    if (iCommercializeFromMainOutService != null) {
                        iCommercializeFromMainOutService.LJFF(this.mContextRef.get(), strLJJIFFI, null, false);
                        return;
                    }
                    return;
                }
                return;
            }
            LIZ(null, strLJJIFFI);
        }
    }
}
