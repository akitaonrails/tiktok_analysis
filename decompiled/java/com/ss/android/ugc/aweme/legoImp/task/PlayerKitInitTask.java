package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass0716;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1150504el;
import X.C1336210ksN;
import X.C1486540omq;
import X.C2214201BlK;
import X.EnumC1335310kqv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.AfS133S0000000_9;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.IPlayerInitService;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class PlayerKitInitTask implements C0CCZ, InterfaceC799590VYf {
    public static PlayerKitInitTask LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PlayerKitInitTask";
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
    public final /* synthetic */ int priority() {
        return 1;
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

    public static PlayerKitInitTask LIZ() {
        if (LL == null) {
            LL = new PlayerKitInitTask();
        }
        return LL;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1150504el.LIZ().LIZLLL("method_init_player_kit_duration", false);
        if (((Boolean) AnonymousClass0716.LJJIJIIJI.getValue()).booleanValue()) {
            TTVideoEngine.LLFII(737, 1);
        } else {
            TTVideoEngine.LLFII(737, 0);
        }
        if (C1336210ksN.LIZ()) {
            TTVideoEngine.LLFII(2038, 1);
            TTVideoEngine.LLFII(2040, EnumC1335310kqv.EXTREME_LOW.getValue());
        } else {
            EnumC1335310kqv enumC1335310kqvLIZLLL = C1336210ksN.LIZLLL();
            EnumC1335310kqv enumC1335310kqv = EnumC1335310kqv.LOW;
            if (enumC1335310kqvLIZLLL == enumC1335310kqv) {
                TTVideoEngine.LLFII(2038, 1);
                TTVideoEngine.LLFII(2040, enumC1335310kqv.getValue());
            } else {
                TTVideoEngine.LLFII(2038, 0);
                TTVideoEngine.LLFII(2040, EnumC1335310kqv.COMMON.getValue());
            }
        }
        C1486540omq.LIZ();
        IPlayerInitService iPlayerInitService = (IPlayerInitService) PluggableExtentionKt.pluggableSpi(IPlayerInitService.class);
        if (iPlayerInitService != null) {
            iPlayerInitService.LIZLLL();
        }
        C1150504el.LIZ().LJI("method_init_player_kit_duration", false);
        C2214201BlK.LIZLLL().LJJLJLI(new AfS133S0000000_9(0));
    }
}
