package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C0X96;
import X.C1697810uHb;
import X.C19264010Yc;
import X.C1950707kX;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class FeedAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final ArrayList<Integer> LJ() {
        return C1697810uHb.LJ(67108864, 268435456);
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        boolean zBooleanValue;
        HashMap map2 = new HashMap();
        Uri uri = UriProtector.parse(str);
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_from_notification");
        if (objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            zBooleanValue = ((Boolean) objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).booleanValue();
        } else {
            zBooleanValue = false;
        }
        C0X96.LIZ.getClass();
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ().isEnabled();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        try {
            int i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            map2.put("tab", Integer.valueOf(i));
            if (i != 1) {
                if (i == 2) {
                    C19264010Yc.LIZIZ.LIZIZ(uri, "homepage_fresh", zBooleanValue);
                }
            } else {
                C19264010Yc.LIZIZ.LIZIZ(uri, "homepage_hot", zBooleanValue);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        map2.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        return new Pair<>("aweme://main", map2);
    }
}
