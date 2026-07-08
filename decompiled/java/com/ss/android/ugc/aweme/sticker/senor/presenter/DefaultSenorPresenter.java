package com.ss.android.ugc.aweme.sticker.senor.presenter;

import X.AbstractC2218781Bsi;
import X.AbstractC2218961Bt0;
import X.C0WZX;
import X.C1300690jx5;
import X.C13SZ;
import X.C19GS;
import X.C1DI4;
import X.C2204961BRm;
import X.C2218851Bsp;
import X.C2218921Bsw;
import X.C2219091BtD;
import X.C838130WuJ;
import X.InterfaceC2218841Bso;
import X.InterfaceC2218931Bsx;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public final class DefaultSenorPresenter extends BaseSenorPresenter {
    public final boolean LLIZ;
    public final InterfaceC2218931Bsx LLIZLLLIL;
    public final boolean LLJ;
    public final InterfaceC2218841Bso LLJI;
    public C2218921Bsw LLJIJIL;

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC1623040sL0
    public final void register() {
        Sensor sensorLIZIZ;
        this.LLILLL = true;
        Sensor sensorLIZIZ2 = LIZIZ(9, new AbstractC2218961Bt0() { // from class: X.1Bsz
        });
        if (sensorLIZIZ2 == null) {
            C2218921Bsw c2218921Bsw = new C2218921Bsw(this.LL, this.LLIZLLLIL);
            this.LLJIJIL = c2218921Bsw;
            c2218921Bsw.enable();
        } else {
            C2218851Bsp c2218851Bsp = new C2218851Bsp(this.LLIZLLLIL, this.LLIZ);
            try {
                C1300690jx5.LIZIZ(this.LLILZ, c2218851Bsp, sensorLIZIZ2, this.LLILZIL.get(C2204961BRm.LJJLIIIJLJLI(sensorLIZIZ2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT9Ib1iXWYlSsXUB4ZdRctrgLEFFb/OnQx7WKz9015BuEoNMapQA==", null)), 10000), this.LLILLJJLI, C1DI4.LIZIZ);
                LIZ(c2218851Bsp);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                C2219091BtD.LIZLLL().w("BPEA-registerGravitySenor: " + C13SZ.LIZIZ(e));
            }
        }
        if (!this.LLJ || (sensorLIZIZ = LIZIZ(15, new AbstractC2218961Bt0() { // from class: X.1Bsy
        })) == null) {
            sensorLIZIZ = LIZIZ(11, new AbstractC2218961Bt0() { // from class: X.1Bt1
            });
        }
        if (sensorLIZIZ != null) {
            final InterfaceC2218931Bsx interfaceC2218931Bsx = this.LLIZLLLIL;
            final boolean z = this.LLIZ;
            AbstractC2218781Bsi abstractC2218781Bsi = new AbstractC2218781Bsi(interfaceC2218931Bsx, z) { // from class: X.1Bss
                public final InterfaceC2218931Bsx LLILLJJLI;

                @Override // android.hardware.SensorEventListener
                public final void onAccuracyChanged(Sensor sensor, int i) {
                }

                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    if (this.LL) {
                        this.LLILLJJLI.LJ(sensorEvent.values, AbstractC2218781Bsi.LIZ(sensorEvent));
                    }
                }

                {
                    super(z);
                    this.LLILLJJLI = interfaceC2218931Bsx;
                }
            };
            try {
                C1300690jx5.LIZIZ(this.LLILZ, abstractC2218781Bsi, sensorLIZIZ, this.LLILZIL.get(C2204961BRm.LJJLIIIJLJLI(sensorLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT9Ib1iXWYlSsXUB4ZdRctrgLEFFb/OnQx7WKz9015BuEoNMapQA==", null)), 10000), this.LLILLJJLI, C1DI4.LIZJ);
                LIZ(abstractC2218781Bsi);
            } catch (C838130WuJ e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2219091BtD.LIZLLL().w("BPEA-registerRotationVectorSenor: " + C13SZ.LIZIZ(e2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC1623040sL0
    public final void unRegister() {
        super.unRegister();
        C2218921Bsw c2218921Bsw = this.LLJIJIL;
        if (c2218921Bsw != null) {
            c2218921Bsw.disable();
        }
    }

    public final Sensor LIZIZ(int i, AbstractC2218961Bt0 abstractC2218961Bt0) {
        Sensor sensorLIZLLL;
        InterfaceC2218841Bso interfaceC2218841Bso = this.LLJI;
        if (interfaceC2218841Bso == null || (sensorLIZLLL = interfaceC2218841Bso.LIZLLL(this.LLILZ, i)) == null) {
            return C2204961BRm.LJJL(this.LLILZ, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT9Ib1iXWYlSsXUB4ZdRctrgLEFFb/OnQx7WKz9015BuEoNMapQA==", null));
        }
        return sensorLIZLLL;
    }

    public DefaultSenorPresenter(C19GS c19gs, LifecycleOwner lifecycleOwner, boolean z, InterfaceC2218931Bsx interfaceC2218931Bsx, boolean z2, Handler handler, InterfaceC2218841Bso interfaceC2218841Bso, boolean z3) {
        super(c19gs, lifecycleOwner, handler);
        this.LLIZ = z;
        this.LLIZLLLIL = interfaceC2218931Bsx;
        this.LLJ = z2;
        this.LLJI = interfaceC2218841Bso;
    }
}
