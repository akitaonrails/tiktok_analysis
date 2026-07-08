package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_wallet_cache_mapping")
public final class LiveWalletCacheMappingSetting {
    public static final LiveWalletCacheMappingSetting INSTANCE = new LiveWalletCacheMappingSetting();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJIIJ(new Pair("2", "2"), new Pair("1", "1"), new Pair("3", "3"), new Pair("5", "5"));
    public static final Map<String, String> TREATMENT = C2097608Jq.LJIIJ(new Pair("2", "2"), new Pair("1", "2"), new Pair("3", "2"), new Pair("5", "2"));

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005d -> B:27:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer getValue(int r4) {
        /*
            r3 = this;
            com.bytedance.android.live_settings.SettingsManager r2 = com.bytedance.android.live_settings.SettingsManager.INSTANCE
            java.util.Map<java.lang.String, java.lang.String> r1 = com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCacheMappingSetting.DEFAULT
            java.lang.String r0 = "live_wallet_cache_mapping"
            java.lang.Object r0 = r2.getValueSafely(r0, r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Lf
            r1 = r0
        Lf:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L63
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L2a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L59
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r1)     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L5d
            int r2 = r0.intValue()     // Catch: java.lang.Exception -> L59
            goto L5e
        L2a:
            boolean r0 = r1 instanceof java.lang.Float     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L36
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Exception -> L59
            float r0 = r1.floatValue()     // Catch: java.lang.Exception -> L59
            int r2 = (int) r0     // Catch: java.lang.Exception -> L59
            goto L5e
        L36:
            boolean r0 = r1 instanceof java.lang.Double     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L42
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Exception -> L59
            double r0 = r1.doubleValue()     // Catch: java.lang.Exception -> L59
            int r2 = (int) r0     // Catch: java.lang.Exception -> L59
            goto L5e
        L42:
            boolean r0 = r1 instanceof java.lang.Long     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L4e
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Exception -> L59
            long r0 = r1.longValue()     // Catch: java.lang.Exception -> L59
            int r2 = (int) r0     // Catch: java.lang.Exception -> L59
            goto L5e
        L4e:
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L5d
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Exception -> L59
            int r2 = r1.intValue()     // Catch: java.lang.Exception -> L59
            goto L5e
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5d:
            r2 = 0
        L5e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L63:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCacheMappingSetting.getValue(int):java.lang.Integer");
    }
}
