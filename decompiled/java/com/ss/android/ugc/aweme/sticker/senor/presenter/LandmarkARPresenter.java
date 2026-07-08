package com.ss.android.ugc.aweme.sticker.senor.presenter;

import X.AbstractC2218781Bsi;
import X.C0WZX;
import X.C1300690jx5;
import X.C13SZ;
import X.C19GS;
import X.C1DI4;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2219091BtD;
import X.C838130WuJ;
import X.InterfaceC1463990oCT;
import X.InterfaceC1623850sMJ;
import X.InterfaceC2218811Bsl;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class LandmarkARPresenter extends BaseSenorPresenter {
    public final boolean LLIZ;
    public final InterfaceC1623850sMJ LLIZLLLIL;
    public final int LLJ;
    public final InterfaceC2218811Bsl LLJI;

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC1623040sL0
    public final void register() throws Throwable {
        this.LLILLL = true;
        Sensor sensorLIZLLL = this.LLIZLLLIL.LIZLLL(this.LLILZ, 15);
        if (sensorLIZLLL == null) {
            sensorLIZLLL = this.LLIZLLLIL.LIZLLL(this.LLILZ, 11);
        }
        if (sensorLIZLLL == null) {
            return;
        }
        this.LLJI.LIZ(true);
        this.LLIZLLLIL.L3(new AwS613S0100000_34(this, 50));
        final boolean z = this.LLIZ;
        final InterfaceC2218811Bsl interfaceC2218811Bsl = this.LLJI;
        AbstractC2218781Bsi abstractC2218781Bsi = new AbstractC2218781Bsi(z, interfaceC2218811Bsl) { // from class: X.1Bsk
            public final InterfaceC2218811Bsl LLILLJJLI;

            @Override // android.hardware.SensorEventListener
            public final void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public final void onSensorChanged(SensorEvent sensorEvent) {
                double dLIZ = AbstractC2218781Bsi.LIZ(sensorEvent);
                if (this.LL) {
                    this.LLILLJJLI.LIZJ(sensorEvent.values, dLIZ);
                }
            }

            {
                this.LLILLJJLI = interfaceC2218811Bsl;
            }
        };
        try {
            C1300690jx5.LIZIZ(this.LLILZ, abstractC2218781Bsi, sensorLIZLLL, this.LLILZIL.get(C2204961BRm.LJJLIIIJLJLI(sensorLIZLLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT9Ib1iXWYlSsXUB4ZdRctrgrAHFPnN3IJyV6M93h4BiJSEq0=", null)), this.LLJ), this.LLILLJJLI, C1DI4.LJII);
            LIZ(abstractC2218781Bsi);
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BPEA-registerRotationVectorSenor: ");
            sbLIZ.append(C13SZ.LIZIZ(e));
            interfaceC1463990oCTLIZLLL.w(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC1623040sL0
    public final void unRegister() {
        super.unRegister();
        this.LLJI.LIZ(false);
    }

    public LandmarkARPresenter(C19GS c19gs, LifecycleOwner lifecycleOwner, boolean z, InterfaceC1623850sMJ interfaceC1623850sMJ) {
        super(c19gs, lifecycleOwner, null);
        this.LLIZ = z;
        this.LLIZLLLIL = interfaceC1623850sMJ;
        this.LLJ = 10000;
        this.LLJI = interfaceC1623850sMJ.LIZJ();
    }
}
