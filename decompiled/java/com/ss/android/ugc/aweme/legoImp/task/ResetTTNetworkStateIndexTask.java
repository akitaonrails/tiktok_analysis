package com.ss.android.ugc.aweme.legoImp.task;

import X.C09JN;
import X.C0CCZ;
import X.C0VZ0;
import X.C2214201BlK;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class ResetTTNetworkStateIndexTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ResetTTNetworkStateIndexTask";
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
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0Uvn
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ResetTTNetworkStateIndexTask@b9d0.run$1");
                if (!((Boolean) obj).booleanValue()) {
                    if (C788100Uvo.LIZ) {
                        Keva keva = C0X2B.LIZ;
                    } else {
                        C0X2E c0x2e = C0X2E.LIZJ;
                    }
                }
                C1C7U.LIZIZ("ResetTTNetworkStateIndexTask@b9d0.run$1");
            }
        });
    }
}
