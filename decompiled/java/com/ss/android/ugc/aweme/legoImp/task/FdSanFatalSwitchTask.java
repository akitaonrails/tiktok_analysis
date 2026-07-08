package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC304970BxP;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.FdSanFatalSwitch;
import com.ss.android.ugc.aweme.legoImp.task.FdSanFatalSwitchTask;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class FdSanFatalSwitchTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FdSanFatalSwitchTask";
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
    public final void run(final Context context) {
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.14fh
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                FdSanFatalSwitchTask fdSanFatalSwitchTask = this.LL;
                Context context2 = context;
                fdSanFatalSwitchTask.getClass();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("fdsan_tracker", false)) {
                    FdSanFatalSwitch.openAndroidQFdsan(context2);
                }
            }
        });
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("fdsan_tracker", false)) {
            FdSanFatalSwitch.openAndroidQFdsan(context);
        }
    }
}
