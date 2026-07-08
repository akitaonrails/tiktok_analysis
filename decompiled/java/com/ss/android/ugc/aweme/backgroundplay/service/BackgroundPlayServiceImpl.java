package com.ss.android.ugc.aweme.backgroundplay.service;

import X.C01GW;
import X.C09JN;
import X.C0N0Y;
import X.C0TC9;
import X.C11JF;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1483390ohl;
import X.C1487370ooB;
import X.C1906580ziK;
import X.C1AV0;
import X.C2174741A9g;
import X.C2180321AUs;
import X.C2180331AUt;
import X.C2180381AUy;
import X.C2188811AlT;
import X.C275810ArT;
import X.EnumC2180361AUw;
import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BackgroundPlayServiceImpl implements IBackgroundPlayService {
    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final int LJIIZILJ() {
        return 2131827250;
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIIIZ() {
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        return C2180331AUt.LJ.getValue().getInt("sheet_action_badge_count", 0) < 3;
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final void LJJ() {
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        C01GW<Keva> c01gw = C2180331AUt.LJ;
        c01gw.getValue().storeInt("sheet_action_badge_count", c01gw.getValue().getInt("sheet_action_badge_count", 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final int LJIILL() {
        if (C275810ArT.LIZJ()) {
            return 1;
        }
        return C275810ArT.LIZLLL() ? 2 : 0;
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIJJLI() {
        if (C275810ArT.LIZIZ()) {
            return C2180331AUt.LJIIJ;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final Long LJIIJJI(String str, String str2) {
        String first;
        Long second;
        if (!C275810ArT.LIZIZ()) {
            return null;
        }
        Pair<String, Long> pair = C2180331AUt.LJFF;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        if (!Intrinsics.LJFF(first, C2188811AlT.LIZIZ(sbLIZ))) {
            return null;
        }
        Pair<String, Long> pair2 = C2180331AUt.LJFF;
        if (pair2 != null) {
            second = pair2.getSecond();
        } else {
            second = null;
        }
        C2180331AUt.LJFF = null;
        C2180331AUt.LJI = null;
        return second;
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final void LJIJJ(String str, String str2) {
        if (!C275810ArT.LIZIZ()) {
            return;
        }
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        C2180331AUt c2180331AUtLIZ = C2180321AUs.LIZ();
        if (c2180331AUtLIZ != null && !Intrinsics.LJFF(((LinkedHashMap) C2180331AUt.LIZLLL).get(str), str2)) {
            C2180331AUt.LIZLLL.remove(str);
            if (C2180331AUt.LIZLLL.isEmpty()) {
                c2180331AUtLIZ.LIZIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIIL(String str, String str2, C0TC9 c0tc9) {
        if (!C275810ArT.LIZIZ()) {
            return false;
        }
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(c0tc9.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Boolean> map = C2180331AUt.LJI;
        Boolean bool = null;
        if (map == null || ((LinkedHashMap) map).get(strLIZIZ) == null) {
            return false;
        }
        Map<String, Boolean> map2 = C2180331AUt.LJI;
        if (map2 != null) {
            bool = (Boolean) ((LinkedHashMap) map2).get(strLIZIZ);
        }
        Map<String, Boolean> map3 = C2180331AUt.LJI;
        if (map3 != null) {
            map3.remove(strLIZIZ);
        }
        C1AV0 c1av0 = C2180331AUt.LJIIIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("need skip resume play source:");
        sbLIZ2.append(c0tc9);
        c1av0.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIJ(Aweme aweme, String str, String str2) {
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        if (C2180321AUs.LIZJ(aweme, str, str2) && C275810ArT.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final int LJIILJJIL(String str, String str2, String str3, Aweme aweme) {
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        if (C2180321AUs.LIZIZ(str, str2, str3, aweme)) {
            return R.raw.icon_headphone_slash;
        }
        return R.raw.icon_headphone_fill;
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIILLIIL(String str, String str2, String str3, Aweme aweme) {
        if (!C275810ArT.LIZIZ()) {
            return false;
        }
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        return C2180321AUs.LIZIZ(str, str2, str3, aweme);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final void LJIL(String str, String str2, String str3, String str4) {
        C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_button_show", str, str2, str3, str4, null, null, null, null, 968);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final void LJIIJ(Context context, Aweme aweme, String str, String str2, String str3) {
        C2180331AUt c2180331AUtLIZ;
        EnumC2180361AUw enumC2180361AUw;
        C2180331AUt c2180331AUtLIZ2;
        if (!C275810ArT.LIZIZ()) {
            return;
        }
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        C01GW<Keva> c01gw = C2180331AUt.LJ;
        c01gw.getValue().storeInt("sheet_action_badge_count", 3);
        boolean zLIZIZ = C2180321AUs.LIZIZ(str, str2, str3, aweme);
        if (C275810ArT.LIZJ()) {
            String aid = aweme.getAid();
            boolean z = !zLIZIZ;
            if (C275810ArT.LIZJ() && aid != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    C2180331AUt.LIZLLL.put(strLIZIZ, aid);
                } else {
                    C2180331AUt.LIZLLL.remove(strLIZIZ);
                }
            }
            if (zLIZIZ && (c2180331AUtLIZ2 = C2180321AUs.LIZ()) != null) {
                c2180331AUtLIZ2.LIZIZ();
            }
        } else if (C275810ArT.LIZLLL()) {
            boolean z2 = !zLIZIZ;
            if (C275810ArT.LIZLLL()) {
                c01gw.getValue().storeBoolean("long_term_bg_play_enable", z2);
                if (!z2 && (c2180331AUtLIZ = C2180321AUs.LIZ()) != null) {
                    c2180331AUtLIZ.LIZIZ();
                }
            }
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            if (zLIZIZ) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131827247);
                c1389890mGx.LIZLLL(3000L);
                c1389890mGx.LJIIJJI();
                C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_toast_show", aweme.getAid(), str, AwemeExtKt.getAuthorUid(aweme), null, null, null, null, "off", 488);
            } else if (C275810ArT.LIZJ()) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                c1389890mGx2.LJIIIZ(2131827249);
                c1389890mGx2.LIZLLL(3000L);
                c1389890mGx2.LJIIJJI();
                C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_toast_show", aweme.getAid(), str, AwemeExtKt.getAuthorUid(aweme), null, null, null, null, "once_effective", 488);
            } else if (C275810ArT.LIZLLL()) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ);
                c1389890mGx3.LJIIIZ(2131827248);
                c1389890mGx3.LIZLLL(3000L);
                c1389890mGx3.LJIIJJI();
                C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_toast_show", aweme.getAid(), str, AwemeExtKt.getAuthorUid(aweme), null, null, null, null, "always_effective", 488);
            }
        }
        C2180381AUy c2180381AUy = C2180381AUy.LIZ;
        String aid2 = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (zLIZIZ) {
            enumC2180361AUw = EnumC2180361AUw.OFF;
        } else {
            enumC2180361AUw = EnumC2180361AUw.ON;
        }
        C2180381AUy.LIZ(c2180381AUy, "bcg_audio_button_click", aid2, str, authorUid, null, null, enumC2180361AUw, null, null, 872);
        C1AV0 c1av0 = C2180331AUt.LJIIIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BackgroundPlayAction execute to state ");
        sbLIZ2.append(!zLIZIZ);
        c1av0.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIILIIL(Aweme aweme, String str, String str2, String str3, boolean z) {
        String aid;
        boolean z2 = false;
        if (!C275810ArT.LIZIZ()) {
            return false;
        }
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        String str4 = C2180331AUt.LJII;
        if (str4 != null && Intrinsics.LJFF(str3, str4) && C2180331AUt.LJIIJ && z) {
            z2 = true;
            C2180331AUt.LJIIIIZZ = true;
            C2180331AUt c2180331AUtLIZ = C2180321AUs.LIZ();
            if (c2180331AUtLIZ != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c2180331AUtLIZ.LIZIZ;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                C2180331AUt.LIZJ(jCurrentTimeMillis, aid, str);
                if (aweme != null) {
                    C2180331AUt.LIZ(aweme, str2, str, c2180331AUtLIZ.LIZIZ, EnumC2180361AUw.RETURN);
                }
            }
            C1483390ohl.LIZ().LIZLLL();
            C1487370ooB c1487370ooB = C1487370ooB.LIZ;
            C1487370ooB.LIZLLL();
            C1AV0 c1av0 = C2180331AUt.LJIIIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isBGPActiveWhenDestroy ");
            sbLIZ.append(true);
            sbLIZ.append(", will pause player");
            c1av0.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return z2;
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIJI(final Aweme aweme, final String str, Fragment fragment, String str2, final C0N0Y c0n0y, final ARunnableS109S0100000_9 aRunnableS109S0100000_9, final ARunnableS109S0100000_9 aRunnableS109S0100000_92) {
        final C2180331AUt c2180331AUtLIZ;
        boolean zLIZIZ = false;
        if (!C275810ArT.LIZIZ()) {
            return false;
        }
        C2180321AUs c2180321AUs = C2180331AUt.LIZJ;
        if (!c0n0y.isPlaying()) {
            C2180331AUt.LJIIIZ.LJIIIZ("return false cause not playing");
        } else {
            if (C2174741A9g.LIZIZ.LJIILJJIL()) {
                C2180331AUt.LJIIIZ.LJIIIZ("return false cause OpenOnMuteService");
                return false;
            }
            if (((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJJ()) {
                C2180331AUt.LJIIIZ.LJIIIZ("return false cause isPipEnabled");
                return false;
            }
            if (fragment != null && fragment.getContext() != null) {
                zLIZIZ = C2180321AUs.LIZIZ(str, String.valueOf(System.identityHashCode(fragment)), str2, aweme);
                final String strValueOf = String.valueOf(System.identityHashCode(fragment));
                if (zLIZIZ) {
                    final Context context = fragment.getContext();
                    if (context != null && (c2180331AUtLIZ = C2180321AUs.LIZ()) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(System.identityHashCode(fragment));
                        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        final String strValueOf2 = String.valueOf(System.identityHashCode(C1906580ziK.LJ()));
                        c2180331AUtLIZ.LIZ.LJ();
                        final String aid = aweme.getAid();
                        C2180331AUt.LJIIIZ.LJIIIZ("observeAppEnterBackground");
                        C11JF c11jfLJLLLLLL = C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.1AUu
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("BackgroundPlayManager@d502.observeAppEnterBackground$backgroundDisposable$1");
                                if (((C606810Nr5) obj).LIZIZ) {
                                    if (!c0n0y.LJIILL().getPlayState().isPlaying()) {
                                        C2180331AUt.LJIIIZ.LJIIIZ("return cause not playing");
                                        c2180331AUtLIZ.LIZIZ();
                                    } else if (!Intrinsics.LJFF(strValueOf2, String.valueOf(System.identityHashCode(C1906580ziK.LJFF())))) {
                                        C2180331AUt.LJIIIZ.LJIIIZ("return cause pageHashCode not match");
                                        c2180331AUtLIZ.LIZIZ();
                                    } else {
                                        C2180331AUt.LJIIIZ.LJIIIZ("app enter background");
                                        C2180331AUt.LJIIJ = true;
                                        C2180331AUt.LJII = strValueOf;
                                        C2180331AUt.LJIIIIZZ = false;
                                        c2180331AUtLIZ.LIZIZ = System.currentTimeMillis();
                                        final C2180331AUt c2180331AUt = c2180331AUtLIZ;
                                        final Aweme aweme2 = aweme;
                                        final String str3 = strLIZIZ;
                                        Context context2 = context;
                                        final String str4 = str;
                                        C0N0Y c0n0y2 = c0n0y;
                                        final Runnable runnable = aRunnableS109S0100000_92;
                                        c2180331AUt.getClass();
                                        C1513680pUc c1513680pUc = new C1513680pUc(context2, aweme2, c0n0y2);
                                        InterfaceC1487460ooK interfaceC1487460ooK = new InterfaceC1487460ooK() { // from class: X.1AUv
                                            @Override // X.InterfaceC1487460ooK
                                            public final void LIZIZ(Integer num, Long l) {
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LIZJ() {
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJ() {
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJII() {
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJIIIZ() {
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJIIJ() {
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LIZ() {
                                                C2180331AUt.LJIIIZ.LJIIIZ("onEnterBgAudioPlay");
                                                C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_play_start", aweme2.getAid(), str4, AwemeExtKt.getAuthorUid(aweme2), null, EnumC2180391AUz.APP, null, null, null, 936);
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJFF() {
                                                C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_operation", aweme2.getAid(), null, AwemeExtKt.getAuthorUid(aweme2), null, null, EnumC2180361AUw.FORWARD, null, null, 876);
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJIIIIZZ() {
                                                C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_operation", aweme2.getAid(), null, AwemeExtKt.getAuthorUid(aweme2), null, null, EnumC2180361AUw.REWIND, null, null, 876);
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJIIL() {
                                                C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_operation", aweme2.getAid(), null, AwemeExtKt.getAuthorUid(aweme2), null, null, EnumC2180361AUw.DRAG, null, null, 876);
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LIZLLL(int i) {
                                                C1AV0 c1av0 = C2180331AUt.LJIIIZ;
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("onBgAudioPlay ");
                                                sbLIZ2.append(i);
                                                c1av0.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                                C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_play_start", aweme2.getAid(), str4, AwemeExtKt.getAuthorUid(aweme2), null, EnumC2180391AUz.SYSTEM, null, null, null, 936);
                                                c2180331AUt.LIZIZ = System.currentTimeMillis();
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJI(int i) {
                                                EnumC2180361AUw enumC2180361AUw;
                                                C1AV0 c1av0 = C2180331AUt.LJIIIZ;
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("onBgAudioPause ");
                                                sbLIZ2.append(i);
                                                c1av0.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                                if (i != 5) {
                                                    if (i != 6) {
                                                        enumC2180361AUw = EnumC2180361AUw.PAUSE;
                                                    } else {
                                                        Runnable runnable2 = runnable;
                                                        if (runnable2 != null) {
                                                            runnable2.run();
                                                        }
                                                        enumC2180361AUw = EnumC2180361AUw.AUTO_END;
                                                    }
                                                } else {
                                                    enumC2180361AUw = EnumC2180361AUw.KILL;
                                                }
                                                C2180331AUt.LIZ(aweme2, str4, str3, c2180331AUt.LIZIZ, enumC2180361AUw);
                                            }

                                            @Override // X.InterfaceC1487460ooK
                                            public final void LJIIJJI(int i) {
                                                C1AV0 c1av0 = C2180331AUt.LJIIIZ;
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("onExitBgAudioPlay ");
                                                sbLIZ2.append(i);
                                                c1av0.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                                C1483390ohl.LIZ().LIZLLL();
                                                C1487370ooB c1487370ooB = C1487370ooB.LIZ;
                                                C1487370ooB.LJ(this);
                                            }
                                        };
                                        C1483390ohl.LIZ().LIZLLL();
                                        C1487370ooB c1487370ooB = C1487370ooB.LIZ;
                                        C1487370ooB.LIZ(interfaceC1487460ooK);
                                        C1483390ohl.LIZ().LIZLLL();
                                        C1487370ooB.LIZJ(c1513680pUc);
                                        C2180331AUt.LIZLLL.remove(strLIZIZ);
                                    }
                                } else {
                                    if (c0n0y.isPlaying() && !C2180331AUt.LJIIIIZZ) {
                                        C2180331AUt.LIZ(aweme, str, strLIZIZ, c2180331AUtLIZ.LIZIZ, EnumC2180361AUw.RETURN);
                                        C2180331AUt.LIZJ(System.currentTimeMillis() - c2180331AUtLIZ.LIZIZ, aid, strLIZIZ);
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        String str5 = aid;
                                        String str6 = strLIZIZ;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(str5);
                                        sbLIZ2.append(str6);
                                        sbLIZ2.append(C0TC9.RESUME_PLAY_INTERNAL.getValue());
                                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                        Boolean bool = Boolean.TRUE;
                                        linkedHashMap.put(strLIZIZ2, bool);
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(str5);
                                        sbLIZ3.append(str6);
                                        sbLIZ3.append(C0TC9.VIDEO_EVENT.getValue());
                                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), bool);
                                        C2180331AUt.LJI = linkedHashMap;
                                    } else {
                                        C2180331AUt.LJFF = null;
                                        C2180331AUt.LJI = null;
                                    }
                                    if (C2180331AUt.LJIIJ) {
                                        C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_hot_start", aweme.getAid(), null, AwemeExtKt.getAuthorUid(aweme), null, null, null, null, null, 1004);
                                    }
                                    C1483390ohl.LIZ().LIZLLL();
                                    C1487370ooB c1487370ooB2 = C1487370ooB.LIZ;
                                    C1487370ooB.LIZLLL();
                                    c2180331AUtLIZ.LIZ.LJ();
                                    C2180331AUt.LJIIJ = false;
                                    C2180331AUt.LJIIIIZZ = false;
                                    C2180331AUt.LJII = null;
                                    C2180331AUt.LJIIIZ.LJIIIZ("app exit background");
                                }
                                C1C7U.LIZIZ("BackgroundPlayManager@d502.observeAppEnterBackground$backgroundDisposable$1");
                            }
                        });
                        c2180331AUtLIZ.LIZ.LIZ(C1906580ziK.LIZJ().LJIILJJIL().LJLLLLLL(new C09JN() { // from class: X.1AUx
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("BackgroundPlayManager@d502.observeAppEnterBackground$startDisposable$1");
                                if (!Intrinsics.LJFF(String.valueOf(System.identityHashCode(obj)), strValueOf2)) {
                                    C2180331AUt.LJIIIZ.LJIIIZ("run failedRunnable in started");
                                    Runnable runnable = aRunnableS109S0100000_9;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                    c2180331AUtLIZ.LIZIZ();
                                }
                                C1C7U.LIZIZ("BackgroundPlayManager@d502.observeAppEnterBackground$startDisposable$1");
                            }
                        }));
                        c2180331AUtLIZ.LIZ.LIZ(c11jfLJLLLLLL);
                        return zLIZIZ;
                    }
                } else {
                    C2180331AUt.LJIIIZ.LJIIIZ("return false cause not enable");
                    return zLIZIZ;
                }
            } else {
                C2180331AUt.LJIIIZ.LJIIIZ("return false cause fragment is null");
                return false;
            }
        }
        return zLIZIZ;
    }
}
