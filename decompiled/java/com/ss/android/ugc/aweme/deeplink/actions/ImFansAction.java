package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.AbstractC848400XPy;
import X.C0WZX;
import X.C0XQ7;
import X.C1701330uNH;
import X.C19264010Yc;
import X.C1950707kX;
import X.C2188811AlT;
import X.C2204961BRm;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.IPreLoginHandleService;
import com.ss.android.ugc.aweme.account.PreLoginHandleService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ImFansAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        Uri uri = UriProtector.parse(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        boolean zBooleanValue;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_account_push_uid");
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_from_notification");
        if (objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            zBooleanValue = ((Boolean) objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).booleanValue();
        } else {
            zBooleanValue = false;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        intent.putExtra("from_where", 0);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label");
        C19264010Yc.LIZIZ.LIZIZ(uri, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, zBooleanValue);
        if (TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "check_profile")) {
            intent.putExtra("push", true);
        }
        if (context instanceof Activity) {
            IPreLoginHandleService iPreLoginHandleServiceLIZIZ = PreLoginHandleService.LIZIZ();
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                iPreLoginHandleServiceLIZIZ.LIZ((Activity) context, intent, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } else {
                Activity activity = (Activity) context;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+l2qfrAVuOOGn+5NMwuk1Q3BKxuS", null));
                return true;
            }
        }
        return false;
    }
}
