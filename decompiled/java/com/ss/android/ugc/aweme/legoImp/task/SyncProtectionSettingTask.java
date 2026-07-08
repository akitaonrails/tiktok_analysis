package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C0XQ7;
import X.C15YK;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class SyncProtectionSettingTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SyncProtectionSettingTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C0XQ7.LJFF().isLogin()) {
            ComplianceServiceProvider.LJIL().LJJIJL(new C15YK() { // from class: X.15Z9
                @Override // X.C15YK
                public final void onSuccess() {
                    this.LIZ.getClass();
                    ComplianceServiceProvider.LJIL().LJIIJJI();
                    ComplianceServiceProvider.LJIL().LJJJJI();
                }

                @Override // X.C15YK
                public final void onFailed(Exception exc) {
                    this.LIZ.getClass();
                    ComplianceServiceProvider.LJIL().LJIIJJI();
                    ComplianceServiceProvider.LJIL().LJJJJI();
                }
            }, "cold_launch");
            ComplianceServiceProvider.LJIL().LJJIFFI();
        } else {
            ComplianceServiceProvider.LJIL().LJJIJL(new C15YK() { // from class: X.15ZA
                @Override // X.C15YK
                public final void onFailed(Exception exc) {
                }

                @Override // X.C15YK
                public final void onSuccess() {
                }
            }, "cold_launch");
        }
    }
}
