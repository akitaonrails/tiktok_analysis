package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1566090qr9;
import X.C20601085f;
import X.C20602085g;
import X.C20612085q;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewHolderLogTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ViewHolderLogTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C20612085q c20612085q = new C20612085q();
        CrashType crashType = CrashType.JAVA;
        Npth.addAttachUserData(c20612085q, crashType);
        Npth.addAttachUserData(new C20601085f(), crashType);
        Npth.addAttachUserData(new C20602085g(), crashType);
        Npth.addAttachUserData(new C1566090qr9(), CrashType.ALL);
    }
}
