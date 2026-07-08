package com.ss.android.ugc.aweme.feed.assem.music.mute;

import X.AbstractC1604130rqV;
import X.C04TD;
import X.C0ACB;
import X.C0BK9;
import X.C0N0Y;
import X.C0SVP;
import X.C10EU;
import X.C13LP;
import X.C1440005kM;
import X.C1483410ohn;
import X.C1908480zlO;
import X.C20684815ws;
import X.C20690215xk;
import X.C2174741A9g;
import X.C2188811AlT;
import X.C2252408s6;
import X.C2276411E8h;
import X.C2344009Gk;
import X.C2487409ou;
import X.C276890AtD;
import X.C690940R8i;
import X.C690950R8j;
import X.C786410Ut5;
import X.C787430Uuj;
import X.C844470XAv;
import X.CountDownTimerC20747916Gv;
import X.EnumC1987307qR;
import X.EnumC655500PnQ;
import X.InterfaceC19330810jy;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.view.KeyEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi;
import com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS149S0101000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class OpenOnMuteImpl implements IOpenOnMuteSpi, IVolumeKeyUnmuteRunnerSpi, IToolsVolumeKeydownRunnerSpi {
    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final synchronized List<EnumC1987307qR> LJFF() {
        C20690215xk.LIZ.getClass();
        return C13LP.LLIIII(C20690215xk.LJI);
    }

    public static IOpenOnMuteSpi LJIJI() {
        Object objLIZ = C04TD.LIZ(IOpenOnMuteSpi.class, false);
        if (objLIZ != null) {
            return (IOpenOnMuteSpi) objLIZ;
        }
        if (C04TD.q0 == null) {
            synchronized (IOpenOnMuteSpi.class) {
                if (C04TD.q0 == null) {
                    C04TD.q0 = new OpenOnMuteImpl();
                }
            }
        }
        return C04TD.q0;
    }

    public static void LJIJJ() {
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        boolean zLJIILJJIL = c2174741A9g.LJIILJJIL();
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVideoEngineMuteState: ");
        sbLIZ.append(zLJIILJJIL ? 1 : 0);
        c2276411E8h.LJII("common_feed", "OpenOnMute", C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine.LLFII(961, zLJIILJJIL ? 1 : 0);
        C20690215xk.LIZ.getClass();
        float f = c2174741A9g.LJIILJJIL() ? 0.0f : 1.0f;
        AbstractC1604130rqV abstractC1604130rqVLIZ = C20690215xk.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[muteInVolume] from ");
        sbLIZ2.append("updateVideoEngineMuteState");
        sbLIZ2.append(", value ");
        sbLIZ2.append(f);
        abstractC1604130rqVLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C1483410ohn.LJLJJI().LJJLIL(f, f);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJ() {
        return C690950R8j.LIZIZ && LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJI() {
        C20690215xk c20690215xk = C20690215xk.LIZ;
        c20690215xk.getClass();
        Keva kevaLIZIZ = C20690215xk.LIZIZ();
        c20690215xk.getClass();
        kevaLIZIZ.storeInt("capsule_count", C20690215xk.LIZIZ().getInt("capsule_count", 0) + 1);
        C20690215xk.LJII = Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIIIIZZ() {
        C20690215xk.LIZ.getClass();
        C20690215xk.LIZIZ().storeBoolean("setting_state", !C10EU.LJIILIIL() && LJIILLIIL());
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIIJ() {
        C20690215xk.LIZ.getClass();
        C20690215xk.LIZ().LJIIIZ("[fadeInVolume]");
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        if (c0n0yLJLJJI.isMute()) {
            C20690215xk.LIZ().LJIILL("[tryChangeVolume] player is mute, stay mute");
        } else {
            new CountDownTimerC20747916Gv(c0n0yLJLJJI, 1).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJIIJJI() {
        C20690215xk.LIZ.getClass();
        return C20690215xk.LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILJJIL() {
        /*
            r2 = this;
            X.01GW r0 = X.C690950R8j.LIZ
            boolean r0 = X.C690950R8j.LIZIZ
            r1 = 1
            if (r0 == 0) goto L10
            X.15xk r0 = X.C20690215xk.LIZ
            r0.getClass()
            boolean r0 = X.C20690215xk.LJ
            if (r0 != 0) goto L25
        L10:
            X.01GW r0 = X.C0BK9.LIZ
            boolean r0 = X.C0BK9.LIZIZ
            if (r0 == 0) goto L26
            X.15xk r0 = X.C20690215xk.LIZ
            r0.getClass()
            java.util.Set<X.07qR> r0 = X.C20690215xk.LJI
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L26
        L25:
            return r1
        L26:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl.LJIILJJIL():boolean");
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJIILLIIL() {
        C20690215xk.LIZ.getClass();
        return C20690215xk.LIZIZ().getBoolean("setting_state", false);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJIIZILJ() {
        C20690215xk.LIZ.getClass();
        return C20690215xk.LJIIL ? LJIILJJIL() : LJIILLIIL() && C690950R8j.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJIJ() {
        C20690215xk c20690215xk = C20690215xk.LIZ;
        c20690215xk.getClass();
        if (C20690215xk.LIZIZ().getInt("capsule_count", 0) >= 3) {
            return false;
        }
        c20690215xk.getClass();
        Boolean bool = C20690215xk.LJII;
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d A[RETURN] */
    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl.LIZIZ(java.lang.Object):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LIZJ(Context context) throws Exception {
        final AudioManager audioManager;
        if (!C0ACB.LIZIZ || context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        Object objH2 = C786410Ut5.H2(context, "audio");
        if ((objH2 instanceof AudioManager) && (audioManager = (AudioManager) objH2) != null) {
            C786410Ut5.LJIJJ(context, new C787430Uuj(audioManager) { // from class: X.0V13
                public int LIZIZ;

                {
                    super(audioManager);
                    C844470XAv.LIZ.getClass();
                    this.LIZIZ = C0V12.LIZIZ(C844470XAv.LIZ());
                    new WeakReference(audioManager);
                }

                public final void LIZIZ(Context context2, Intent intent) {
                    EnumC655500PnQ enumC655500PnQ;
                    super.onReceive(context2, intent);
                    C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
                    if (c2174741A9g.LJIILJJIL() && Intrinsics.LJFF(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        C844470XAv.LIZ.getClass();
                        int iLIZIZ = C0V12.LIZIZ(C844470XAv.LIZ());
                        String strLIZIZ = c2174741A9g.LIZIZ(null);
                        if (this.LIZIZ < iLIZIZ) {
                            enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
                        } else {
                            enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                        }
                        c2174741A9g.LJIILL(strLIZIZ, enumC655500PnQ, C0SVP.STYLE_NO_BUTTON);
                        this.LIZIZ = iLIZIZ;
                    }
                }

                @Override // X.C787430Uuj, android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZIZ(context2, intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZIZ(context2, intent);
                    }
                }
            }, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            TTVideoEngine.LLFII(960, 1);
            C20690215xk c20690215xk = C20690215xk.LIZ;
            boolean zLJIILLIIL = LJIILLIIL();
            c20690215xk.getClass();
            C20690215xk.LJ = zLJIILLIIL;
            C20690215xk.LJII = Boolean.TRUE;
            C20690215xk.LJIIL = true;
            if (C276890AtD.LIZIZ) {
                C1908480zlO.LIZIZ.LJ(new InterfaceC19330810jy() { // from class: X.10uL
                    @Override // X.InterfaceC19330810jy
                    public final int[] LIZJ() {
                        return new int[]{1001};
                    }

                    @Override // X.InterfaceC19330810jy
                    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                        return false;
                    }

                    @Override // X.InterfaceC19330810jy
                    public final boolean LJI(InnerPushMessage innerPushMessage) {
                        return true;
                    }

                    @Override // X.InterfaceC19330810jy
                    public final boolean LJFF(InnerPushMessage innerPushMessage) {
                        boolean z;
                        boolean z2;
                        C20690215xk.LIZ.getClass();
                        boolean z3 = C20690215xk.LIZIZ().getBoolean("no_click", true);
                        long j = C20690215xk.LIZIZ().getLong("push_interval_millisecond", 0L);
                        int i = C20690215xk.LIZIZ().getInt("push_count", 0);
                        if (System.currentTimeMillis() - j > 604800000) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i < 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z4 = !C2174741A9g.LIZIZ.LJIILLIIL();
                        boolean z5 = C20690215xk.LIZIZ().getBoolean("setting_never_enable", true);
                        boolean zBooleanValue = ((Boolean) C258560ABi.LIZ.getValue()).booleanValue();
                        if (z3 && z && z2 && z4 && z5 && zBooleanValue) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC19330810jy
                    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
                        C20690215xk.LIZ.getClass();
                        if (C20690215xk.LIZIZ().getBoolean("no_click", true)) {
                            C20690215xk.LIZIZ().storeBoolean("no_click", false);
                            C20684815ws.LJIILLIIL("mute_settings_push_click", new C2344009Gk().LIZ);
                        }
                        return false;
                    }

                    @Override // X.InterfaceC19330810jy
                    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                        C2252408s6.LIZ(AFwS218S0000000_29.get$arr$(313));
                        return null;
                    }
                });
                C2487409ou.LIZLLL(C20690215xk.LIZLLL, new Runnable() { // from class: X.0Oh5
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("OpenOnMuteImpl@f725.initForColdBoot$1");
                        try {
                            C20690215xk.LIZ.getClass();
                            C20690215xk.LJIILIIL = false;
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("OpenOnMuteImpl@f725.initForColdBoot$1");
                    }
                });
            }
            LJIJJ();
            AbstractC1604130rqV abstractC1604130rqVLIZ = C20690215xk.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[initForColdBoot] feature:");
            C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
            sbLIZ.append(c2174741A9g.LJIILJJIL());
            abstractC1604130rqVLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (c2174741A9g.LJIILJJIL()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("is_launch_on_mute", null);
                C20684815ws.LJIILLIIL("launch_on_mute", c2344009Gk.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LIZLLL(C0SVP c0svp) {
        String value;
        C20690215xk.LIZ.getClass();
        if (C20690215xk.LJFF) {
            C20690215xk.LJFF = false;
            if (c0svp != null) {
                C20690215xk.LJIIJJI = c0svp;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", C20690215xk.LJIIIZ);
            EnumC655500PnQ enumC655500PnQ = C20690215xk.LJIIJ;
            Integer numValueOf = null;
            if (enumC655500PnQ != null) {
                value = enumC655500PnQ.getValue();
            } else {
                value = null;
            }
            c2344009Gk.LJIIIIZZ("unmute_method", value);
            C0SVP c0svp2 = C20690215xk.LJIIJJI;
            if (c0svp2 != null) {
                numValueOf = Integer.valueOf(c0svp2.getValue());
            }
            c2344009Gk.LJ(numValueOf, "button_unfold");
            C20684815ws.LJIILLIIL("video_unmute", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIIL(boolean z) {
        if (z) {
            C20690215xk.LIZ.getClass();
            C20690215xk.LJIIIIZZ++;
        } else {
            C20690215xk.LIZ.getClass();
            C20690215xk.LJIIIIZZ--;
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIILIIL(boolean z) {
        C20690215xk.LIZ.getClass();
        C20690215xk.LIZIZ().storeBoolean("setting_state", z);
        C20690215xk.LIZIZ().storeBoolean("setting_never_enable", false);
        AbstractC1604130rqV abstractC1604130rqVLIZ = C20690215xk.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setSettingState] ");
        sbLIZ.append(z);
        abstractC1604130rqVLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("enterFrom: settings_page / settings_name：open_tiktok_on_mute / status_before_change: ");
        int i = !z ? 1 : 0;
        sbLIZ2.append(i);
        sbLIZ2.append(" / status_after_change: ");
        sbLIZ2.append(z ? 1 : 0);
        C2188811AlT.LIZIZ(sbLIZ2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        c2344009Gk.LJIIIIZZ("settings_name", "open_tiktok_on_mute");
        c2344009Gk.LIZJ(i, "status_before_change");
        c2344009Gk.LIZJ(z ? 1 : 0, "status_after_change");
        C20684815ws.LJIILLIIL("profile_settings_change", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final synchronized void LJII(boolean z, EnumC1987307qR enumC1987307qR) {
        if (!C0BK9.LIZIZ) {
            return;
        }
        C20690215xk.LIZ.getClass();
        AbstractC1604130rqV abstractC1604130rqVLIZ = C20690215xk.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setOpenOnMuteByBusiness, mute=");
        sbLIZ.append(z);
        sbLIZ.append(", business=");
        sbLIZ.append(enumC1987307qR);
        abstractC1604130rqVLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C20690215xk.LJI.add(enumC1987307qR);
        } else {
            C20690215xk.LJI.remove(enumC1987307qR);
        }
        LJIJJ();
        C1440005kM.LIZ(new C690940R8i(LJIILJJIL()));
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi
    public final void LJIIIZ(int i, KeyEvent keyEvent) {
        LJIJJLI(i, C0SVP.STYLE_NO_BUTTON);
    }

    public final void LJIJJLI(int i, C0SVP c0svp) {
        EnumC655500PnQ enumC655500PnQ;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            if (i == 24 || i == 25) {
                String strLIZIZ = LIZIZ(null);
                if (i == 24) {
                    enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
                } else {
                    enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                }
                c2174741A9g.LJIILL(strLIZIZ, enumC655500PnQ, c0svp);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi
    public final void LIZ(Integer num, KeyEvent keyEvent, Object obj) {
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        LIZIZ(obj);
        LJIJJLI(iIntValue, C0SVP.STYLE_NO_BUTTON);
        if (C690950R8j.LIZIZ && C276890AtD.LIZIZ) {
            C2252408s6.LIZ(new AwS149S0101000_9(this, num.intValue(), 12));
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIILL(String str, EnumC655500PnQ enumC655500PnQ, C0SVP c0svp) {
        C20690215xk.LIZ.getClass();
        C20690215xk.LJIIIZ = str;
        C20690215xk.LJIIJ = enumC655500PnQ;
        C20690215xk.LJIIJJI = c0svp;
        AbstractC1604130rqV abstractC1604130rqVLIZ = C20690215xk.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[toggleUnmute] tempState ");
        sbLIZ.append(C20690215xk.LJ);
        sbLIZ.append(" -> false");
        abstractC1604130rqVLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C20690215xk.LJ = false;
        LJIJJ();
        if (C20690215xk.LJIIIIZZ <= 0) {
            C20690215xk.LIZ().LJIIIZ("[toggleUnmute] sent mob by default");
            LIZLLL(null);
        }
        C1440005kM.LIZ(new C690940R8i(LJIILJJIL()));
    }
}
