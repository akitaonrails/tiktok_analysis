package com.bytedance.pia.core.setting;

import X.C01GW;
import X.C08CX;
import X.C098200Yq;
import X.C09CT;
import X.C09EI;
import X.C13LP;
import X.C13LQ;
import X.C1545410qJn;
import X.C189200o6;
import X.C1953107kv;
import X.C1BNZ;
import X.C1BPP;
import X.C2204081BOc;
import X.C452501pT;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class Config {
    public static final Config LIZIZ = new Config(null, null, null, false, 15, null);
    public static final Config LIZJ = new Config(C13LQ.LJLIIL(new String[]{"prefetch", "nsr", "snapshot", "cache", "streaming", "preload"}), null, null, false, 14, null);

    @C09EI
    public final C01GW LIZ;

    @C09CT("features")
    public final Set<String> expectedFeatures;

    @C09CT("isMocked")
    public final boolean isFromMock;

    @C09CT("streaming")
    public final String streaming;

    @C09CT("version")
    public final String version;

    public Config() {
        this(null, null, null, false, 15, null);
    }

    public final Set<String> LIZIZ() {
        return (Set) this.LIZ.getValue();
    }

    public final boolean LIZJ() {
        return LIZIZ().contains("streaming") && this.streaming.length() > 0;
    }

    public final String toString() {
        return GsonProtectorUtils.toJson(GsonUtils.LIZ(), this);
    }

    public static final Config LIZ(Uri uri) {
        Object c098200Yq;
        String strLJIL;
        if (uri != null) {
            if ((!uri.getBooleanQueryParameter("_pia_", false) && uri.getBooleanQueryParameter("__pia_manifest__", false)) || Settings.LJIIIIZZ) {
                Config configLIZIZ = C2204081BOc.LIZ.LIZIZ(uri);
                if (configLIZIZ != null) {
                    return configLIZIZ;
                }
                C1545410qJn.LIZ.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (uri.getBooleanQueryParameter("_pia_", false)) {
                    String strLIZJ = C1953107kv.LIZJ(uri, null);
                    if (C13LP.LJJJJ(strLIZJ, C1545410qJn.LJIIJJI)) {
                        return new Config(C13LQ.LJLIIL(new String[]{"nsr", "prefetch", "snapshot", "cache"}), null, null, false, 14, null);
                    }
                    Keva keva = C1545410qJn.LIZIZ;
                    if (keva != null && keva.contains(strLIZJ)) {
                        Keva keva2 = C1545410qJn.LIZIZ;
                        if (keva2 == null) {
                            keva2 = null;
                        }
                        String string = keva2.getString(strLIZJ, "");
                        if (string != null && string.length() != 0) {
                            try {
                                GsonUtils.LIZIZ.getClass();
                                n nVarLJIILIIL = p.LIZJ(string).LJIILIIL();
                                Set set = (Set) GsonUtils.LIZ().LIZJ(nVarLJIILIIL.LJJIIZ("features"), Set.class);
                                String strLJIL2 = nVarLJIILIIL.LJJIIZ("version").LJIL();
                                String str = C1545410qJn.LJIIJ;
                                if (str != null && !Intrinsics.LJFF(str, strLJIL2)) {
                                    return null;
                                }
                                k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("manifestVersion");
                                if (kVarLJJIIZ == null || !(kVarLJJIIZ instanceof q) || !(kVarLJJIIZ.LJIILJJIL().LL instanceof String)) {
                                    strLJIL = "";
                                } else {
                                    strLJIL = kVarLJJIIZ.LJIL();
                                    if (strLJIL == null) {
                                        strLJIL = "";
                                    }
                                }
                                c098200Yq = new Config(set, strLJIL, null, false, 12, null);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                                Config config = (Config) c098200Yq;
                                C1BPP.LJFF(6, "[PIASettings] Finish create setting. Cost Time: " + (System.currentTimeMillis() - jCurrentTimeMillis) + ". (URL: " + uri + ", pageSetting: " + config + ')', null);
                                return config;
                            }
                        }
                    }
                }
            } else {
                return LIZJ;
            }
        }
        return null;
    }

    public Config(Set<String> set, String str, String str2, boolean z) {
        this.expectedFeatures = set;
        this.version = str;
        this.streaming = str2;
        this.isFromMock = z;
        this.LIZ = C452501pT.LIZIZ(new C1BNZ(this));
    }

    public Config(Set set, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }
}
