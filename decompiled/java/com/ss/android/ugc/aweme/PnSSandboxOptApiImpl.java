package com.ss.android.ugc.aweme;

import X.C08Q0;
import X.C1BWL;
import com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi;

/* JADX INFO: loaded from: classes5.dex */
public final class PnSSandboxOptApiImpl implements IPnSSandboxOptApi {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final int LIZ() {
        return C08Q0.LIZIZ(C1BWL.LIZ(), 0, "pns_socket_aspect_switch");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final int LIZIZ() {
        return C08Q0.LIZIZ(C1BWL.LIZ(), 100, "pns_socket_sampling_rate");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final void LIZJ() {
        C08Q0.LJFF(C1BWL.LIZ()).edit().putBoolean("pns_sandbox_clean_up", true).apply();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final int LIZLLL() {
        return C08Q0.LIZIZ(C1BWL.LIZ(), 0, "sandbox_sdk_launch_refactor");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final int LJ() {
        return C08Q0.LIZIZ(C1BWL.LIZ(), 0, "sandbox_sdk_enable");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final int LJFF() {
        return C08Q0.LIZIZ(C1BWL.LIZ(), 0, "control_sandbox_pumbaa_network_aspect");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final String LJI() {
        return C08Q0.LIZLLL(C1BWL.LIZ(), "pns_sandbox_cache_rule_hash", "");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final int LJII() {
        return C08Q0.LIZIZ(C1BWL.LIZ(), 0, "pns_sandbox_sampling_rate");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final boolean LJIIIIZZ() {
        boolean zLJ = C08Q0.LJ(C1BWL.LIZ(), "pns_sandbox_clean_up", false);
        if (zLJ) {
            C08Q0.LJFF(C1BWL.LIZ()).edit().putBoolean("pns_sandbox_clean_up", false).apply();
        }
        return zLJ;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final String LJIIIZ() {
        return C08Q0.LIZLLL(C1BWL.LIZ(), "sandbox_rules_experiment_group", "");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final int LJIIJ() {
        return C08Q0.LIZIZ(C1BWL.LIZ(), 0, "control_sandbox_wrapper_pre_load_so");
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi
    public final void LJIIJJI(String str) {
        C08Q0.LJFF(C1BWL.LIZ()).edit().putString("pns_sandbox_cache_rule_hash", str).apply();
    }
}
