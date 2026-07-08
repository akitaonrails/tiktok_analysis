package com.ss.android.ugc.aweme;

import X.C0CCZ;
import X.C0VZ0;
import X.C2203431BLp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC486470J5x;
import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class WsRegionTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "WsRegionTask";
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
        C2203431BLp.LIZIZ.LJI(1025, 1, new InterfaceC486470J5x() { // from class: X.0XO8
            @Override // X.InterfaceC486470J5x
            public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                C0XO0.LIZLLL(C0XPY.LIZIZ).LJIILIIL("pushed_message", null, null);
            }
        });
    }
}
