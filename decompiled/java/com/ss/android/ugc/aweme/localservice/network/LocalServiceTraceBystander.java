package com.ss.android.ugc.aweme.localservice.network;

import X.C0X52;
import X.C13BV;
import X.C2188811AlT;
import X.C842780X4i;
import android.net.Uri;
import android.util.LruCache;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.TTKLSUserTraceConfig;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public final class LocalServiceTraceBystander implements NetworkPartner.Bystander {
    public static final LocalServiceTraceBystander LIZ = new LocalServiceTraceBystander();
    public static final List<String> LIZIZ;
    public static final LruCache<String, C842780X4i> LIZJ;
    public static final LruCache<String, Unit> LIZLLL;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    static {
        List<String> list = TTKLSUserTraceConfig.LIZ().networkPaths;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        LIZIZ = list;
        LIZJ = new LruCache<>(10);
        LIZLLL = new LruCache<>(128);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.String> LJ(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r1 = "code"
            boolean r0 = r5.has(r1)
            r3 = -1
            if (r0 == 0) goto L1b
            int r3 = r5.optInt(r1, r3)
        Ld:
            if (r3 != 0) goto L28
            java.lang.String r2 = "success"
        L11:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.<init>(r0, r2)
            return r1
        L1b:
            java.lang.String r1 = "status_code"
            boolean r0 = r5.has(r1)
            if (r0 == 0) goto L28
            int r3 = r5.optInt(r1, r3)
            goto Ld
        L28:
            java.lang.String r1 = "message"
            boolean r0 = r5.has(r1)
            java.lang.String r2 = "unknown"
            if (r0 == 0) goto L37
            java.lang.String r2 = r5.optString(r1, r2)
            goto L11
        L37:
            java.lang.String r1 = "msg"
            boolean r0 = r5.has(r1)
            if (r0 == 0) goto L44
            java.lang.String r2 = r5.optString(r1, r2)
            goto L11
        L44:
            java.lang.String r1 = "status_msg"
            boolean r0 = r5.has(r1)
            if (r0 == 0) goto L11
            java.lang.String r2 = r5.optString(r1, r2)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.localservice.network.LocalServiceTraceBystander.LJ(org.json.JSONObject):kotlin.Pair");
    }

    public final String LJIILIIL(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri = UriProtector.parse(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getPath());
        sbLIZ.append("?_rticket=");
        try {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_rticket");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Double LIZIZ(Number number, Number number2) {
        if (number != null && number2 != null) {
            return Double.valueOf(number.doubleValue() - number2.doubleValue());
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        String path = request.getPath();
        List<String> list = LIZIZ;
        if ((!list.isEmpty()) && list.contains(path)) {
            if (request.isResponseStreaming()) {
                String strLJIILIIL = LJIILIIL(request.getUrl());
                if (LIZLLL.remove(strLJIILIIL) != null) {
                    LJIIL(request, c0x52, null);
                    return;
                } else {
                    LIZJ.put(strLJIILIIL, new C842780X4i(request, c0x52));
                    return;
                }
            }
            LJIIL(request, c0x52, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01f4 A[Catch: all -> 0x03c0, TryCatch #0 {all -> 0x03c0, blocks: (B:113:0x020c, B:115:0x0210, B:116:0x0212, B:118:0x0216, B:134:0x028e, B:136:0x02ef, B:137:0x02f5, B:139:0x02f9, B:144:0x0307, B:146:0x0316, B:147:0x031f, B:133:0x0283, B:148:0x03b4, B:86:0x019f, B:88:0x01b7, B:106:0x01e7, B:108:0x01f4, B:109:0x01f8, B:83:0x0195, B:92:0x01c3, B:94:0x01ca, B:96:0x01d2, B:97:0x01d6, B:102:0x01df, B:120:0x021a, B:122:0x022d, B:124:0x0231, B:126:0x026a, B:127:0x026e, B:131:0x027e), top: B:155:0x012a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.bytedance.retrofit2.client.Request r17, X.C0X52<?> r18, java.lang.Throwable r19) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.localservice.network.LocalServiceTraceBystander.LJIIL(com.bytedance.retrofit2.client.Request, X.0X52, java.lang.Throwable):void");
    }
}
