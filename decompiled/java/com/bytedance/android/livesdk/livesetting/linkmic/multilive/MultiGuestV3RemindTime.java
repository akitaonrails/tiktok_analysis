package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("anchor_panel_revenue_tip_auto_refresh")
public final class MultiGuestV3RemindTime {
    public static final String DEFAULT = "";
    public static volatile n cache;
    public static final MultiGuestV3RemindTime INSTANCE = new MultiGuestV3RemindTime();
    public static volatile String last = "";

    private final n getObject() {
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
            return cache;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final boolean enable() {
        k kVarLJJIIZ;
        try {
            n object = getObject();
            if (object == null || (kVarLJJIIZ = object.LJJIIZ("isEnable")) == null) {
                return false;
            }
            return kVarLJJIIZ.LJIIJJI() == 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("anchor_panel_revenue_tip_auto_refresh", DEFAULT);
    }

    public final long interval() {
        k kVarLJJIIZ;
        long jLJIIZILJ = 0;
        try {
            n object = getObject();
            if (object == null || (kVarLJJIIZ = object.LJJIIZ("interval")) == null) {
                return 0L;
            }
            jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
            return jLJIIZILJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jLJIIZILJ;
        }
    }
}
