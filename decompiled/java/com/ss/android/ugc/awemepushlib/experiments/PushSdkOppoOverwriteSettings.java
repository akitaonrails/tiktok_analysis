package com.ss.android.ugc.awemepushlib.experiments;

import X.C098200Yq;
import X.C0C64;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class PushSdkOppoOverwriteSettings {
    public static final PushSdkOppoOverwriteSettings INSTANCE = new PushSdkOppoOverwriteSettings();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final n f84default = new n();
    public static final int $stable = 8;

    public final boolean enabled() {
        return a0.LJJIIZI(getOverwriteSettings(), "sdk_key_PushSDK", false);
    }

    public final String getOverwriteSettings() {
        Object c098200Yq;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            c098200Yq = f84default;
            n nVar = (n) c0c64LJIILLIIL.LJJII(n.class, c098200Yq, "push_sdk_oppo_overwrite_settings", false);
            if (nVar != null) {
                c098200Yq = nVar;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        k kVar = (k) c098200Yq;
        if (kVar == null) {
            kVar = f84default;
        }
        return kVar.toString();
    }
}
