package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C13LZ;
import X.C19994513Lb;
import X.C19994613Lc;
import X.C827760Wda;
import X.C827770Wdb;
import X.C827780Wdc;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC827550WdF;
import Y.ARunnableS82S0200000_13;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.ss.android.ugc.aweme.legoImp.task.PitayaDlpTask;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PitayaDlpTask implements C0CCZ {
    public double LL;
    public C827760Wda LLILLL;
    public final C19994613Lc LLILLJJLI = C19994513Lb.LIZIZ(System.currentTimeMillis());
    public final C827770Wdb LLILZ = new InterfaceC827550WdF() { // from class: X.0Wdb
        @Override // X.InterfaceC827550WdF
        public final C827540WdE LIZ(C827540WdE c827540WdE) {
            C827760Wda c827760Wda;
            IPitayaCore iPitayaCore;
            if (c827540WdE != null) {
                PitayaDlpTask pitayaDlpTask = this.LIZ;
                if (pitayaDlpTask.LLILLJJLI.nextInt(pitayaDlpTask.LLILZIL) <= ((double) pitayaDlpTask.LLILZIL) * pitayaDlpTask.LL && (c827760Wda = this.LIZ.LLILLL) != null && (iPitayaCore = c827760Wda.LIZJ) != null && iPitayaCore.isReady()) {
                    C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS82S0200000_13(c827540WdE, c827760Wda, 32));
                }
            }
            return c827540WdE;
        }
    };
    public final int LLILZIL = 1000000;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PitayaDlpTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DlpSettingsModel dlpSettingsModel = C827780Wdc.LIZ;
        DlpSettingsModel dlpSettingsModel2 = (DlpSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("dlp_settings", DlpSettingsModel.class, dlpSettingsModel);
        if (dlpSettingsModel2 != null) {
            dlpSettingsModel = dlpSettingsModel2;
        }
        if (dlpSettingsModel.enabled) {
            this.LL = C13LZ.LIZJ(dlpSettingsModel.sampleRate, 0.0d, 1.0d);
            this.LLILLL = new C827760Wda(this, dlpSettingsModel.breachedThreshold, dlpSettingsModel.packSize);
        }
    }
}
