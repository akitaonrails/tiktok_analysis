package com.ss.android.ugc.aweme.net.mutli.network;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04RR;
import X.C04TD;
import X.C0XQ7;
import X.C10EU;
import X.C1471350oOL;
import X.C1471390oOP;
import X.C1492970oxD;
import X.C1493000oxG;
import X.C1493100oxQ;
import X.C15O7;
import X.C19266210Yy;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2104408Mg;
import X.C452501pT;
import X.C746350TPl;
import X.C844470XAv;
import X.EnumC1471360oOM;
import X.EnumC1493040oxK;
import Y.ACallableS428S0100000_23;
import com.bytedance.ttnet.TTWiFiCellSwitcher;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.channel.ISpeedModeService;
import com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SpeedModeServiceImpl implements ISpeedModeService {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJFF;
    public volatile boolean LJ = true;
    public final C01GW LJI = C452501pT.LIZIZ(new C1493000oxG(this));
    public final C01GW LJII = C452501pT.LIZIZ(new C1493100oxQ(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1471390oOP(this));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C1492970oxD(this));

    public static boolean LIZJ() {
        Integer numLIZ = C746350TPl.LIZ.LIZJ().LIZ();
        return (numLIZ == null || numLIZ.intValue() != 1) && ((ISpeedModeSetting) ServiceManager.get().getService(ISpeedModeSetting.class)).LJFF() != EnumC1493040oxK.NOT_ALLOW;
    }

    public static ISpeedModeService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ISpeedModeService.class, false);
        if (objLIZ != null) {
            return (ISpeedModeService) objLIZ;
        }
        if (C04TD.O2 == null) {
            synchronized (ISpeedModeService.class) {
                if (C04TD.O2 == null) {
                    C04TD.O2 = new SpeedModeServiceImpl();
                }
            }
        }
        return C04TD.O2;
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final boolean LIZ() {
        return this.LIZJ || this.LIZLLL;
    }

    public final C1471350oOL LJ() {
        return (C1471350oOL) this.LJIIIIZZ.getValue();
    }

    public final void LJII() throws JSONException {
        if (PluggableExtentionKt.pluggableSpi$default(ISpeedModeSetting.class, false, false, false, 14, null) == null) {
            return;
        }
        EnumC1493040oxK enumC1493040oxKLJFF = ((ISpeedModeSetting) ServiceManager.get().getService(ISpeedModeSetting.class)).LJFF();
        C1471350oOL c1471350oOLLJ = LJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_status", enumC1493040oxKLJFF.name());
        c1471350oOLLJ.getClass();
        C1471350oOL.LIZJ(9, -1, -1, jSONObject);
        if (this.LJFF || enumC1493040oxKLJFF != EnumC1493040oxK.ALLOW) {
            return;
        }
        C20684815ws.LJIILLIIL("net_speed_mode_auth", C2097908Jt.LIZJ(new Pair("auth_status", "1")));
        this.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final boolean enable() {
        C844470XAv.LIZ.getClass();
        return C2104408Mg.LIZJ(C844470XAv.LIZ()) && C19266210Yy.LIZIZ.LIZJ() < 1 && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !C10EU.LJIILIIL() && ((Boolean) C04RR.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final void start() {
        C15O7.LIZJ(new ACallableS428S0100000_23(this, 3));
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final void stop() {
        C15O7.LIZJ(new ACallableS428S0100000_23(this, 4));
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final void LIZIZ(final int i, final boolean z, final boolean z2) {
        if (z && z2) {
            throw new IllegalArgumentException("switchToCell and switchToWifi cannot be both true!");
        }
        C15O7.LIZJ(new Callable() { // from class: X.0oxA
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("SpeedModeServiceImpl@2150.switch$1");
                int i2 = i;
                if (i2 == 0) {
                    if (z) {
                        this.LJI.getValue().getClass();
                        TTWiFiCellSwitcher.inst().start();
                        TTWiFiCellSwitcher.inst().triggerSwitchingToNetwork(EnumC1492930ox9.CELL);
                    }
                    if (z2) {
                        this.LJI.getValue().getClass();
                        TTWiFiCellSwitcher.inst().start();
                        TTWiFiCellSwitcher.inst().triggerSwitchingToNetwork(EnumC1492930ox9.WIFI);
                    }
                } else if (i2 == 1) {
                    if (z) {
                        this.LJ().LJFF();
                    }
                    if (z2) {
                        this.LJ().LJI();
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SpeedModeServiceImpl@2150.switch$1");
                return unit;
            }
        });
    }

    public final void LJFF(int i, int i2, int i3) {
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                EnumC1471360oOM enumC1471360oOM = EnumC1471360oOM.READY_SWITCH_TO_CELL;
                if (i3 == enumC1471360oOM.getValue()) {
                    LIZIZ(0, true, false);
                    LIZIZ(1, true, false);
                } else if (i3 == EnumC1471360oOM.READY_SWITCH_TO_WIFI.getValue()) {
                    LIZIZ(0, false, true);
                    LIZIZ(1, false, true);
                }
                if (i3 == EnumC1471360oOM.CELL.getValue() && i2 == enumC1471360oOM.getValue()) {
                    z = true;
                }
                this.LIZLLL = z;
                return;
            }
            return;
        }
        if (i3 != 1) {
            if (i3 != 3) {
                if (i3 == 2 && i2 == 1) {
                    z = true;
                }
            } else {
                LIZIZ(0, false, true);
                LIZIZ(1, false, true);
            }
        } else {
            LIZIZ(0, true, false);
            LIZIZ(1, true, false);
        }
        this.LIZJ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0oxP] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r6, int r7, int r8) {
        /*
            r5 = this;
            if (r7 == r8) goto L75
            boolean r0 = r5.enable()
            if (r0 == 0) goto L75
            boolean r0 = LIZJ()
            if (r0 != 0) goto L12
            r5.stop()
            return
        L12:
            r4 = 0
            r3 = 1
            if (r6 != 0) goto L42
            if (r8 != r3) goto L19
        L18:
            r4 = 1
        L19:
            X.0oxB r2 = new X.0oxB
            r2.<init>(r5, r6, r7, r8)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting> r0 = com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting r0 = (com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting) r0
            X.0oxK r0 = r0.LJFF()
            int[] r1 = X.C1493030oxJ.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L5f
            r0 = 2
            if (r1 == r0) goto L5b
            r0 = 3
            if (r1 != r0) goto L55
            r5.stop()
            return
        L42:
            r1 = 0
            if (r6 != r3) goto L53
            X.0oOM r0 = X.EnumC1471360oOM.READY_SWITCH_TO_CELL
            int r0 = r0.getValue()
            if (r8 != r0) goto L53
            r0 = 1
        L4e:
            if (r1 != 0) goto L18
            if (r0 == 0) goto L19
            goto L18
        L53:
            r0 = 0
            goto L4e
        L55:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L5b:
            r2.invoke()
            return
        L5f:
            if (r4 == 0) goto L75
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting> r0 = com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting r1 = (com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting) r1
            X.0oxP r0 = new X.0oxP
            r0.<init>()
            r1.LIZIZ(r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl.LJI(int, int, int):void");
    }
}
