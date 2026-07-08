package com.ss.android.ugc.aweme.featurepoll;

import X.C05K7;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C117600cY;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799780VYy;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC20234614Fk
public final class FeaturePollLegoTask implements C0CCZ, InterfaceC799780VYy {
    public final Long LL = null;

    @Override // X.InterfaceC799780VYy
    public final /* synthetic */ long LIZ() {
        return 0L;
    }

    @Override // X.InterfaceC799780VYy
    public final /* synthetic */ void LJ(Long l) {
    }

    @Override // X.InterfaceC799780VYy
    public final void LJFF() {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FeaturePollLegoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799780VYy
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        long jLongValue;
        if (!C117600cY.LIZ().open) {
            return;
        }
        Long l = this.LL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = C117600cY.LIZ().intervalMs;
            if (jLongValue < 60000) {
                jLongValue = 60000;
            }
        }
        C05K7.LIZ.LIZ(jLongValue, AFwS187S0000000_2.get$arr$(1052));
    }
}
