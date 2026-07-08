package com.ss.android.ugc.aweme.specact;

import X.C098200Yq;
import X.C10GR;
import X.C1668306g5;
import X.C189200o6;
import X.C19EG;
import X.C2421209eE;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.FeedSupportRouteAction;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedSupportRouteAction implements IRouteAction {
    public static final boolean open$showSupport(final Uri uri) {
        final C19EG c19eg;
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
            if (iTouchPointModuleService != null) {
                iTouchPointModuleService.LJIIIIZZ();
            }
            PopupManager.LJIIZILJ(new C10GR(c19eg, uri) { // from class: X.0zUd
                public final C19EG LL;
                public final Uri LLILLJJLI;
                public final int LLILLL = 221;

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg2 = this.LL;
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILLL;
                }

                {
                    this.LL = c19eg;
                    this.LLILLJJLI = uri;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) throws JSONException {
                    int iIntValue;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    Integer numLJIIJJI;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LLILLJJLI, "showSupportResult");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
                        iIntValue = numLJIIJJI.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (String str : UriProtector.getQueryParameterNames(this.LLILLJJLI)) {
                        if (!Intrinsics.LJFF(str, "showSupportResult") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LLILLJJLI, str)) != null) {
                            jSONObject.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                    }
                    String strJ3 = C786410Ut5.J3(jSONObject);
                    ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                    if (iTouchPointModuleService2 == null) {
                        c20656615sK.LIZ();
                    } else {
                        iTouchPointModuleService2.LIZLLL("feed", iIntValue, strJ3, new InterfaceC1893920zNu() { // from class: X.0zUe
                            @Override // X.InterfaceC1893920zNu
                            public final void LIZ(C1875750yub c1875750yub) {
                                PopupManager.LIZJ(C1898090zUd.class);
                                c20656615sK.LIZ();
                            }
                        });
                    }
                }
            }, new C1668306g5("ug_feed_support_popup_trigger"));
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Boolean open(Context context, String str, Bundle bundle) {
        boolean z;
        Object c098200Yq;
        Object obj = null;
        if (context != null) {
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    c098200Yq = UriProtector.parse(str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                final Uri uri = (Uri) obj;
                if (uri == null) {
                    return Boolean.FALSE;
                }
                OpenResultCallback openResultCallback = new OpenResultCallback() { // from class: X.0ze9
                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onActionResult(Object obj2) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final /* synthetic */ void onEmpty() {
                        C1951107kb.LIZ(this);
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onFail(String str2, String str3) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onIntercept(String str2) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onMatched(String str2) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onMissed(String str2) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final /* synthetic */ void onOpen(Intent intent) {
                        C1951107kb.LIZIZ(this, intent);
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onSuccess(Intent intent) {
                        FeedSupportRouteAction.open$showSupport(uri);
                    }
                };
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
                smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                smartRouteBuildRoute.addFlags(67108864);
                smartRouteBuildRoute.addFlags(536870912);
                smartRouteBuildRoute.withCallback(openResultCallback);
                smartRouteBuildRoute.open();
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
