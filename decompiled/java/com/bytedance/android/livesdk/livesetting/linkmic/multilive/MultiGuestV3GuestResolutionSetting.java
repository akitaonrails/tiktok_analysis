package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C1CC2;
import X.C748410TXj;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_linkmic_guest_resolution")
public final class MultiGuestV3GuestResolutionSetting {
    public static final String DEFAULT = "";
    public static volatile n cache;
    public static final MultiGuestV3GuestResolutionSetting INSTANCE = new MultiGuestV3GuestResolutionSetting();
    public static volatile String last = "";

    public final C748410TXj getGuestResolution() {
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
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
            Integer numValueOf = (nVar == null || (kVarLJJIIZ2 = nVar.LJJIIZ("width")) == null) ? null : Integer.valueOf(kVarLJJIIZ2.LJIIJJI());
            n nVar2 = cache;
            Integer numValueOf2 = (nVar2 == null || (kVarLJJIIZ = nVar2.LJJIIZ("height")) == null) ? null : Integer.valueOf(kVarLJJIIZ.LJIIJJI());
            if (numValueOf == null || numValueOf.intValue() <= 0 || numValueOf2 == null || numValueOf2.intValue() <= 0) {
                return null;
            }
            return new C748410TXj(numValueOf.intValue(), numValueOf2.intValue());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("getResolutionValue error", th);
            return null;
        }
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("multi_linkmic_guest_resolution", DEFAULT);
    }
}
