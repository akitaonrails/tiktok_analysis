package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.aigc.C2PAServiceImpl;
import com.ss.android.ugc.aweme.aigc.IC2PAService;
import java.util.List;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class C2PAPluginInstallTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "C2PAPluginInstallTask";
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
        IC2PAService iC2PAServiceLJ = C2PAServiceImpl.LJ();
        if (!iC2PAServiceLJ.LIZLLL() || context == null) {
            return;
        }
        iC2PAServiceLJ.LIZJ(context, new AwS432S0200000_31(iC2PAServiceLJ, context, 52), null);
    }
}
