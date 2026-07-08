package com.ss.android.ugc.aweme.ecommerce.search.lynx.core.viewmodel;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class BulletUtils {
    public static final BulletUtils LIZ = new BulletUtils();

    public final boolean isSearchIntermediate(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        boolean zLJJIIZI = false;
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel")) != null) {
                zLJJIIZI = a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "fe_tiktok_lynx_search_transfer", false);
                return zLJJIIZI;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zLJJIIZI;
    }
}
