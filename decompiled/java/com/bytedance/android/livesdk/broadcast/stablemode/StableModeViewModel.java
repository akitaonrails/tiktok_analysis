package com.bytedance.android.livesdk.broadcast.stablemode;

import X.AbstractC1180404ja;
import X.AbstractC775780Ubw;
import X.C0IJT;
import X.C20337914i1;
import X.C20441214yg;
import X.C2252331DDr;
import X.C2286608xc;
import X.C474500IjA;
import X.C775720Ubq;
import X.C775730Ubr;
import X.C775740Ubs;
import X.C775750Ubt;
import X.C775760Ubu;
import X.C775770Ubv;
import X.C775790Ubx;
import X.C775900Uc8;
import X.InterfaceC1364105Vn;
import X.InterfaceC772190UQv;
import X.InterfaceC774460UZo;
import com.bytedance.android.livesdk.livesetting.performance.BroadcastNewStableModeSetting;
import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class StableModeViewModel extends MviViewModel<C775720Ubq, AbstractC775780Ubw, AbstractC1180404ja> {
    public StableModeViewModel() {
        super(new C775720Ubq(false, false));
    }

    public static boolean zQ2() {
        Integer numLIZIZ;
        BroadcastNewStableModeSetting broadcastNewStableModeSetting = BroadcastNewStableModeSetting.INSTANCE;
        if (!broadcastNewStableModeSetting.enable()) {
            return false;
        }
        C20337914i1<Integer> c20337914i1 = InterfaceC772190UQv.j4;
        Integer numLIZIZ2 = c20337914i1.LIZIZ();
        return (numLIZIZ2 != null && numLIZIZ2.intValue() == -1 && broadcastNewStableModeSetting.isDefaultOpen()) || ((numLIZIZ = c20337914i1.LIZIZ()) != null && numLIZIZ.intValue() == 1);
    }

    @Override // com.bytedance.android.livesdk.mvi.core.MviViewModel
    public final Object yQ2(InterfaceC774460UZo interfaceC774460UZo, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC775780Ubw abstractC775780Ubw = (AbstractC775780Ubw) interfaceC774460UZo;
        if (abstractC775780Ubw instanceof C775790Ubx) {
            setState(new AwS591S0100000_12(this, 29));
        } else if (abstractC775780Ubw instanceof C775770Ubv) {
            if (xQ2().LIZ) {
                C2252331DDr c2252331DDr = C775900Uc8.LIZ;
                C20441214yg.LIZIZ("LiveAnchorDowngradeBus", "closeDowngrade");
                C775900Uc8.LJ = true;
                setState(AFwS245S0000000_12.get$arr$(1));
            } else {
                C2252331DDr c2252331DDr2 = C775900Uc8.LIZ;
                C20441214yg.LIZIZ("LiveAnchorDowngradeBus", "openDowngrade");
                C775900Uc8.LJ = false;
                setState(AFwS245S0000000_12.get$arr$(2));
            }
        } else if (abstractC775780Ubw instanceof C775730Ubr) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_stable_mode_button_click");
            C775730Ubr c775730Ubr = (C775730Ubr) abstractC775780Ubw;
            c474500IjALIZ.LJJII(c775730Ubr.LIZ, "change_entry");
            c474500IjALIZ.LJJII(c775730Ubr.LIZJ, "click_type");
            c474500IjALIZ.LJJII(c775730Ubr.LIZIZ, "room_id");
            c474500IjALIZ.LJJII(C2286608xc.LJ(c775730Ubr.LIZLLL), "toast_type");
            c474500IjALIZ.LIZ();
        } else if (abstractC775780Ubw instanceof C775740Ubs) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_stable_mode_button_show");
            C775740Ubs c775740Ubs = (C775740Ubs) abstractC775780Ubw;
            c474500IjALIZ2.LJJII(C2286608xc.LJ(c775740Ubs.LIZLLL), "stable_mode_status");
            c474500IjALIZ2.LJJII(c775740Ubs.LIZ, "enter_from");
            c474500IjALIZ2.LJJII(c775740Ubs.LIZIZ, "room_id");
            c474500IjALIZ2.LJJII(C2286608xc.LJ(c775740Ubs.LIZJ), "toast_type");
            c474500IjALIZ2.LIZ();
        } else if (abstractC775780Ubw instanceof C775750Ubt) {
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_anchor_stable_mode_toast_click");
            C775750Ubt c775750Ubt = (C775750Ubt) abstractC775780Ubw;
            c474500IjALIZ3.LJJII(c775750Ubt.LIZ, "ui_type");
            c474500IjALIZ3.LJJII(c775750Ubt.LIZIZ, "room_id");
            c474500IjALIZ3.LJJII(C2286608xc.LJ(c775750Ubt.LIZJ), "toast_type");
            c474500IjALIZ3.LIZ();
        } else if (abstractC775780Ubw instanceof C775760Ubu) {
            C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_anchor_stable_mode_activated_toast_show");
            C775760Ubu c775760Ubu = (C775760Ubu) abstractC775780Ubw;
            c474500IjALIZ4.LJJII(c775760Ubu.LIZ, "ui_type");
            c474500IjALIZ4.LJJII(c775760Ubu.LIZIZ, "room_id");
            c474500IjALIZ4.LJJII(C2286608xc.LJ(c775760Ubu.LIZJ), "toast_type");
            c474500IjALIZ4.LIZ();
        }
        return Unit.LIZ;
    }
}
