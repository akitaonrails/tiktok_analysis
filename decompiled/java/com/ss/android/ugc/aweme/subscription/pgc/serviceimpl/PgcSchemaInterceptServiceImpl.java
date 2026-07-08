package com.ss.android.ugc.aweme.subscription.pgc.serviceimpl;

import X.AbstractC490360JKw;
import X.C098200Yq;
import X.C0JK4;
import X.C0JKQ;
import X.C0K6P;
import X.C0K77;
import X.C189200o6;
import X.C1931507hR;
import X.C1954807lC;
import X.C490370JKx;
import X.C511530K4h;
import X.C511540K4i;
import X.C511550K4j;
import X.C511560K4k;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PgcSchemaInterceptService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class PgcSchemaInterceptServiceImpl implements PgcSchemaInterceptService {
    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PgcSchemaInterceptService
    public final Context LIZIZ() {
        Object c098200Yq;
        try {
            c098200Yq = C1931507hR.LIZ().getTopContext();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Context) c098200Yq;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.PgcSchemaInterceptService
    public final boolean LIZ(C0K6P c0k6p) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Unit unit;
        String string;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Map<String, C511550K4j> map = C511530K4h.LIZ;
        String path = c0k6p.LIZJ.getPath();
        if (path != null && !a0.LJJJIL(path)) {
            Unit unit2 = null;
            String string2 = null;
            C511550K4j c511550K4j = (C511550K4j) ((LinkedHashMap) C511530K4h.LIZ).get(path);
            if (c511550K4j != null) {
                C490370JKx c490370JKx = AbstractC490360JKw.LIZ;
                Uri uri = c0k6p.LIZJ;
                List<C0JK4> list = c511550K4j.LIZIZ;
                c490370JKx.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C0JK4 c0jk4 : list) {
                    int i = C0JKQ.LIZ[c0jk4.LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2 && (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, c0jk4.LIZ)) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0)) {
                            arrayList2.add(c0jk4.LIZ);
                        }
                    } else if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, c0jk4.LIZ)) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0) {
                        arrayList.add(c0jk4.LIZ);
                        AbstractC490360JKw.LIZ.getClass();
                        try {
                            C0K77 c0k77LIZ = C490370JKx.LIZ();
                            if (c0k77LIZ != null) {
                                if (uri == null) {
                                    string = null;
                                } else {
                                    string = uri.toString();
                                }
                                c0k77LIZ.LJJJJL(string);
                                unit = Unit.LIZ;
                            } else {
                                unit = null;
                            }
                            C189200o6.m2constructorimpl(unit);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    try {
                        C0K77 c0k77LIZ2 = C490370JKx.LIZ();
                        if (c0k77LIZ2 != null) {
                            if (uri != null) {
                                string2 = uri.toString();
                            }
                            c0k77LIZ2.LJIIZILJ(string2);
                            unit2 = Unit.LIZ;
                        }
                        C189200o6.m2constructorimpl(unit2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
                C511540K4i c511540K4i = C511540K4i.LIZ;
                Context context = c0k6p.LIZ;
                Uri uri2 = c0k6p.LIZJ;
                Map<String, String> map2 = c0k6p.LJ;
                c511540K4i.getClass();
                int i2 = C511560K4k.LIZ[C511540K4i.LIZ(context, uri2, map2).ordinal()];
                if (i2 == 1) {
                    return false;
                }
                if (i2 != 2 && i2 != 3) {
                    throw new C1954807lC();
                }
                return true;
            }
        }
        return false;
    }
}
