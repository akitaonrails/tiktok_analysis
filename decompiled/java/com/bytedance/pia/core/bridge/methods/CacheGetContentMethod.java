package com.bytedance.pia.core.bridge.methods;

import X.C098200Yq;
import X.C09CT;
import X.C1287700jc8;
import X.C189200o6;
import X.C1953107kv;
import X.C1BP0;
import X.C1BP1;
import X.C1BP6;
import X.C1BPO;
import X.C1BQ0;
import X.C2204431BPl;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.bridge.methods.CacheGetContentMethod;
import com.bytedance.pia.core.cache.IPiaCacheProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class CacheGetContentMethod implements InterfaceC2204471BPp<Params, Result> {
    public static final C1BP1<Params, Result> LIZ = new C1BP1<>("pia.internal.cache.getContent", C1BP0.All, new InterfaceC1537230q6b() { // from class: X.1BOu
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new CacheGetContentMethod();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static final class Result {

        @C09CT("content")
        public final String content;

        public Result(String str) {
            this.content = str;
        }
    }

    public static final class Params {

        @C09CT("extraVary")
        public final List<String> extraVary;

        @C09CT("url")
        public final String url;

        public Params(String str, List<String> list) {
            this.url = str;
            this.extraVary = list;
        }
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, final C1BPO c1bpo, final C2204431BPl c2204431BPl) {
        Object c098200Yq;
        Params params = (Params) obj;
        if (TextUtils.isEmpty(params.url)) {
            c2204431BPl.accept(new C1BQ0("Parameter 'url' required!"));
            return;
        }
        try {
            c098200Yq = C1953107kv.LIZ(UriProtector.parse(params.url));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            Uri uri = (Uri) c098200Yq;
            String strLIZJ = C1953107kv.LIZJ(uri, null);
            if (strLIZJ != null && strLIZJ.length() != 0) {
                final String strLIZJ2 = C1953107kv.LIZJ(uri, params.extraVary);
                if (strLIZJ2 != null && strLIZJ2.length() != 0) {
                    C1287700jc8.LIZJ(new Runnable() { // from class: X.1BNi
                        public final void LIZ() {
                            try {
                                if (!C1BNF.LJ.get()) {
                                    c1bpo.accept(new CacheGetContentMethod.Result(""));
                                    return;
                                }
                                String strLJIIIIZZ = null;
                                IPiaCacheProvider.CacheConfig cacheConfigLJIIIZ = C1BNF.LJIIIZ(null, strLIZJ2);
                                if (cacheConfigLJIIIZ != null) {
                                    Number number = cacheConfigLJIIIZ.expire;
                                    String str = cacheConfigLJIIIZ.version;
                                    if (number != null && number.longValue() > System.currentTimeMillis() && !TextUtils.isEmpty(str)) {
                                        strLJIIIIZZ = C1BNF.LJIIIIZZ(strLIZJ2);
                                    }
                                }
                                c1bpo.accept(new CacheGetContentMethod.Result(strLJIIIIZZ != null ? strLJIIIIZZ : ""));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                InterfaceC1530550pvp<C2204191BOn> interfaceC1530550pvp = c2204431BPl;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[Cache] PIA Cache Get Content Failed, reason: (");
                                sbLIZ.append(e.getMessage());
                                sbLIZ.append(')');
                                interfaceC1530550pvp.accept(new C2204191BOn(C2188811AlT.LIZIZ(sbLIZ)));
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CacheGetContentMethod@8541.invoke$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CacheGetContentMethod@8541.invoke$1");
                        }
                    });
                    return;
                } else {
                    c2204431BPl.accept(new C1BQ0("Parameter 'url' & 'extraVary' invalid!"));
                    return;
                }
            }
            c2204431BPl.accept(new C1BQ0("Parameter 'url' invalid!"));
            return;
        }
        c2204431BPl.accept(new C1BQ0("Parameter 'url' invalid!"));
    }
}
