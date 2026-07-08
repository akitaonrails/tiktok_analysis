package com.ss.android.ugc.incentive.crossplatform.headless;

import X.C01U6;
import X.C09CT;
import X.C0DUP;
import X.C1545590qK5;
import X.C1893940zNw;
import X.C1893960zNy;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1893950zNx;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.incentive.crossplatform.experiment.IncentiveJsLogicModuleConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS23S1110000_28;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class PrefetchUtils {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX INFO: loaded from: classes13.dex */
    public static final class ApiCacheModel {

        @C09CT("expireTime")
        public final long expiredTime;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiCacheModel) && this.expiredTime == ((ApiCacheModel) obj).expiredTime;
        }

        public final int hashCode() {
            return C786410Ut5.Y2(this.expiredTime);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ApiCacheModel(expiredTime=");
            sbLIZ.append(this.expiredTime);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ApiCacheModel() {
            this(0L);
        }

        public ApiCacheModel(long j) {
            this.expiredTime = j;
        }
    }

    public static void LIZ(List list) {
        String path;
        String strLIZ;
        if (!((IncentiveJsLogicModuleConfig) C1893960zNy.LIZIZ.getValue()).enable) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = (String) it2.next();
            C1545590qK5 c1545590qK5 = C1545590qK5.LIZIZ;
            if (c1545590qK5.LIZLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = c1545590qK5.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, C2097608Jq.LJ());
            }
            if (u.LJJIIJZLJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "aweme://lynx", false)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), "url");
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (path = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getPath()) != null && (strLIZ = C0DUP.LIZ(path, true)) != null && strLIZ.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC1893950zNx.TOUCH_POINT_WILL_SHOW.getValue());
                sbLIZ.append('_');
                sbLIZ.append(strLIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1893940zNw value = C1893940zNw.LJI.getValue();
                value.getClass();
                C01U6.LIZJ(new AwS23S1110000_28(value, false, strLIZIZ, 0));
            }
        }
    }
}
