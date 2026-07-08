package com.bytedance.pia.core.bridge.methods;

import X.C098200Yq;
import X.C09CT;
import X.C09EM;
import X.C1287700jc8;
import X.C189200o6;
import X.C1953107kv;
import X.C1BNF;
import X.C1BP0;
import X.C1BP1;
import X.C1BP6;
import X.C1BPO;
import X.C1BQ0;
import X.C2204191BOn;
import X.C2204431BPl;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.bridge.methods.CacheSaveMethod;
import com.bytedance.pia.core.cache.IPiaCacheProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class CacheSaveMethod implements InterfaceC2204471BPp<Params, Result> {
    public static final C1BP1<Params, Result> LIZ = new C1BP1<>("pia.internal.cache.save", C1BP0.All, new InterfaceC1537230q6b() { // from class: X.1BOx
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new CacheSaveMethod();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static final class Result {

        @C09CT("isUpdate")
        public final boolean isUpdate;

        public Result(boolean z) {
            this.isUpdate = z;
        }
    }

    public static final class Params {

        @C09CT("content")
        public final String content;

        @C09CT("extraVary")
        public final List<String> extraVary;

        @C09CT("url")
        public final String url;

        public Params(String str, List<String> list, String str2) {
            this.url = str;
            this.extraVary = list;
            this.content = str2;
        }
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, final C1BPO c1bpo, final C2204431BPl c2204431BPl) {
        Object c098200Yq;
        Number number;
        Params params = (Params) obj;
        if (TextUtils.isEmpty(params.url)) {
            c2204431BPl.accept(new C1BQ0("Parameter 'url' invalid!"));
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
            final Uri uri = (Uri) c098200Yq;
            String strLIZJ = C1953107kv.LIZJ(uri, null);
            if (strLIZJ != null && strLIZJ.length() != 0) {
                final List<String> list = params.extraVary;
                String strLIZJ2 = C1953107kv.LIZJ(uri, list);
                if (strLIZJ2 != null && strLIZJ2.length() != 0) {
                    if (Intrinsics.LJFF(strLIZJ, strLIZJ2)) {
                        c2204431BPl.accept(new C2204191BOn(-10001, "Can't modify the original html."));
                        return;
                    }
                    String str = params.content;
                    if (str != null && str.length() != 0) {
                        final String str2 = params.content;
                        final n nVarLIZ = C09EM.LIZ(str2);
                        if (nVarLIZ == null) {
                            c2204431BPl.accept(new C2204191BOn(-10002, "Invalid manifest in content."));
                            return;
                        }
                        IPiaCacheProvider.CacheConfig cacheConfigLJI = C1BNF.LJI(nVarLIZ);
                        if (cacheConfigLJI == null || ((number = cacheConfigLJI.maxAge) != null && number.longValue() <= 0)) {
                            c2204431BPl.accept(new C2204191BOn(-10003, "Invalid cache in manifest."));
                            return;
                        } else {
                            C1287700jc8.LIZJ(new Runnable() { // from class: X.1BNl
                                public final void LIZ() {
                                    try {
                                        c1bpo.accept(new CacheSaveMethod.Result(C1BNF.LJIILIIL(uri, str2, nVarLIZ, list)));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        InterfaceC1530550pvp<C2204191BOn> interfaceC1530550pvp = c2204431BPl;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("[Cache] PIA Cache Save Failed, reason: (");
                                        sbLIZ.append(e.getMessage());
                                        sbLIZ.append(')');
                                        interfaceC1530550pvp.accept(new C2204191BOn(C2188811AlT.LIZIZ(sbLIZ)));
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("CacheSaveMethod@6b25.invoke$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("CacheSaveMethod@6b25.invoke$1");
                                }
                            });
                            return;
                        }
                    }
                    c2204431BPl.accept(new C1BQ0("Parameter 'content' invalid!"));
                    return;
                }
                c2204431BPl.accept(new C1BQ0("Parameter 'url' & 'extraVary' invalid!"));
                return;
            }
            c2204431BPl.accept(new C1BQ0("Parameter 'url' invalid!"));
            return;
        }
        c2204431BPl.accept(new C1BQ0("Parameter 'url' invalid!"));
    }
}
