package com.ss.android.ugc.aweme.poi.osp;

import X.C1390920mIc;
import X.C1976907ol;
import X.C19EG;
import X.C299110Bnx;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class PoiOrderSubmitInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "//poi/order/submit", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (routeIntent != null) {
            Uri uri = routeIntent.getUri();
            Bundle extras = null;
            if (uri != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_by_sheet");
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
            if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                new Object() { // from class: X.0dqP
                }.getClass();
                if (context != null) {
                    PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment = new PoiOrderSubmitSlashFragment();
                    Intent extra = routeIntent.getExtra();
                    if (extra != null) {
                        try {
                            extras = extra.getExtras();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    poiOrderSubmitSlashFragment.setArguments(extras);
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LJIIIIZZ(3);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = poiOrderSubmitSlashFragment;
                    tuxSheet.LLJLLL = true;
                    if (C299110Bnx.LIZ()) {
                        c1390920mIc.LIZ.LLLIIIIL = new TuxOspSheetBehavior();
                    } else {
                        c1390920mIc.LIZ.LLLIIII = new OspBottomSheetBehavior();
                    }
                    TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                    tuxSheet2.LLJLILLLLZIIL = false;
                    tuxSheet2.LLJLL = true;
                    tuxSheet2.LLILLL = true;
                    c1390920mIc.LJI(32);
                    c1390920mIc.LIZ.show(((C19EG) context).getSupportFragmentManager(), "osp fragment sheet");
                }
                return true;
            }
        }
        return false;
    }
}
