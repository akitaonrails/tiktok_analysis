package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C1CC2;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_guest_v3_guest_setting")
public final class MultiGuestV3GuestSetting {
    public static final String DEFAULT = "";
    public static n cache;
    public static final MultiGuestV3GuestSetting INSTANCE = new MultiGuestV3GuestSetting();
    public static String last = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("multi_guest_v3_guest_setting", DEFAULT);
    }

    public final Boolean getBoolValue(String str) {
        k kVarLJJIIZ;
        Boolean boolValueOf = null;
        try {
            String value = getValue();
            if (Intrinsics.LJFF(value, "")) {
                return null;
            }
            if (!Intrinsics.LJFF(value, last)) {
                last = value;
                new p();
                cache = p.LIZJ(value).LJIILIIL();
            }
            n nVar = cache;
            if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ(str)) == null) {
                return null;
            }
            boolValueOf = Boolean.valueOf(kVarLJJIIZ.LJ());
            return boolValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("getBoolValue error", th);
            return boolValueOf;
        }
    }
}
