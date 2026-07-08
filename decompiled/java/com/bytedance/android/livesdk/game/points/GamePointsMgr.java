package com.bytedance.android.livesdk.game.points;

import X.AbstractC1098830ehV;
import X.C0JT6;
import X.C1096990eeX;
import X.C1152470g61;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.InterfaceC1085330eLj;
import X.InterfaceC1087010eOR;
import X.InterfaceC1098840ehW;
import X.InterfaceC1101720emA;
import X.InterfaceC465600INq;
import Y.ALAdapterS13S0100000_17;
import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.game.model.GuessTaskPackInfo;
import com.bytedance.android.livesdk.game.points.GamePointsMgr;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GamePointsMgr implements InterfaceC465600INq {
    public Fragment LL;
    public DataChannel LLILLJJLI;
    public ImageView LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public C1096990eeX LLILZLL;
    public Room LLIZ;
    public final AwS596S0100000_17 LLIZLLLIL = new AwS596S0100000_17(this, 120);

    public static boolean LJI(C0JT6 c0jt6) {
        boolean z = false;
        try {
            String str = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date());
            if (Intrinsics.LJFF(str, (String) c0jt6.LIZ())) {
                return false;
            }
            c0jt6.LIZJ(str);
            z = true;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }

    @Override // X.C0IF4
    public final void LIZIZ(DataChannel dataChannel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume :  ");
        sbLIZ.append(dataChannel);
        C20441214yg.LIZIZ("PointsShortTouchMgr", C2188811AlT.LIZIZ(sbLIZ));
        C1096990eeX c1096990eeX = this.LLILZLL;
        if (c1096990eeX != null) {
            c1096990eeX.LJI();
        }
    }

    @Override // X.C0IF4
    public final void LJII(DataChannel dataChannel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause :  ");
        sbLIZ.append(dataChannel);
        C20441214yg.LIZIZ("PointsShortTouchMgr", C2188811AlT.LIZIZ(sbLIZ));
        C1096990eeX c1096990eeX = this.LLILZLL;
        if (c1096990eeX != null) {
            c1096990eeX.LJFF();
        }
    }

    @Override // X.C0IF4
    public final void LJIIIIZZ(DataChannel dataChannel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onExitRoom : ");
        sbLIZ.append(dataChannel);
        C20441214yg.LIZIZ("PointsShortTouchMgr", C2188811AlT.LIZIZ(sbLIZ));
        C1096990eeX c1096990eeX = this.LLILZLL;
        if (c1096990eeX != null) {
            c1096990eeX.LIZLLL();
        }
        this.LLILZLL = null;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLIZ = null;
    }

    public final void LJIIJJI(final View view) {
        Context context;
        final AbstractC1098830ehV abstractC1098830ehV;
        Uri uriBuild = UriProtector.parse(C1152470g61.LIZ(this.LLILLJJLI, false).guessingShortTouch).buildUpon().appendQueryParameter("source_entrance", "client_points_task").appendQueryParameter("open_page_time", String.valueOf(System.currentTimeMillis())).build();
        InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
        Fragment fragment = this.LL;
        InterfaceC1101720emA interfaceC1101720emA = null;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        InterfaceC1085330eLj interfaceC1085330eLjVd = interfaceC1087010eOR.Vd(context, uriBuild, null, "shortTouchGamePoints", null, true);
        if (interfaceC1085330eLjVd != null) {
            GamePointsMgr$showShortTouch$1$myTouchView$1 gamePointsMgr$showShortTouch$1$myTouchView$1 = new GamePointsMgr$showShortTouch$1$myTouchView$1(interfaceC1085330eLjVd, this);
            if (gamePointsMgr$showShortTouch$1$myTouchView$1.LLLILZJ() instanceof AbstractC1098830ehV) {
                View viewLLLILZJ = gamePointsMgr$showShortTouch$1$myTouchView$1.LLLILZJ();
                if ((viewLLLILZJ instanceof AbstractC1098830ehV) && (abstractC1098830ehV = (AbstractC1098830ehV) viewLLLILZJ) != null) {
                    abstractC1098830ehV.setLoadCallback(new InterfaceC1098840ehW() { // from class: X.0eeY
                        @Override // X.InterfaceC1098840ehW
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1098840ehW
                        public final void LJJIZ() {
                        }

                        @Override // X.InterfaceC1098840ehW
                        public final void LIZIZ(String str) {
                            String idStr;
                            C500260Jjc.LJLJLJ(abstractC1098830ehV, false);
                            ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Ud(EnumC1101860emO.NAME, "shortTouchGamePoints");
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_guess_page_performance");
                            Room room = this.LLIZ;
                            if (room != null) {
                                idStr = room.getIdStr();
                            } else {
                                idStr = null;
                            }
                            c474500IjALIZ.LJJII(idStr, "room_id");
                            c474500IjALIZ.LJJII("tiktok_live_interaction_game_guessing_pages_guessing_short_touch", "page_id");
                            c474500IjALIZ.LJJII("load", "action");
                            c474500IjALIZ.LJJII("client_fail", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            c474500IjALIZ.LJJII(str, "status_detail");
                            c474500IjALIZ.LJJII("client_points_task", "source_entrance");
                            c474500IjALIZ.LIZ();
                        }
                    });
                }
            }
            InterfaceC1087010eOR interfaceC1087010eOR2 = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
            if (view != null) {
                interfaceC1101720emA = new InterfaceC1101720emA() { // from class: X.0eib
                    @Override // X.InterfaceC1101720emA
                    public final void LJLJL() {
                    }

                    @Override // X.InterfaceC1101720emA
                    public final void LLLZI() {
                    }

                    @Override // X.InterfaceC1101720emA
                    public final boolean Ur() {
                        return true;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final int Vr() {
                        return 0;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final String Sr() {
                        return C1099470eiX.LIZ(this);
                    }

                    @Override // X.InterfaceC1101720emA
                    public final View LLLILZJ() {
                        return view;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
                        long j;
                        final Animator animatorRb0 = ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).rb0(viewGroup, z);
                        if (animatorRb0 != null) {
                            animatorRb0.addListener(new ALAdapterS13S0100000_17(viewGroup, 77));
                            if (z) {
                                j = 1040;
                            } else {
                                j = 1500;
                            }
                            animatorRb0.setDuration(j);
                        } else {
                            animatorRb0 = null;
                        }
                        final GamePointsMgr gamePointsMgr = this;
                        return new InterfaceC1101940emW() { // from class: X.0eic
                            @Override // X.InterfaceC1101940emW
                            public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                                return new AwS596S0100000_17(animatorRb0, 425);
                            }

                            @Override // X.InterfaceC1101940emW
                            public final void LIZIZ() {
                                Animator animator = animatorRb0;
                                if (animator != null) {
                                    animator.cancel();
                                }
                            }

                            @Override // X.InterfaceC1101940emW
                            public final void LIZJ() {
                                if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
                                    IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
                                    C1099510eib c1099510eib = this.LIZ;
                                    c1099510eib.getClass();
                                    C1101820emK c1101820emKTd = iShortTouchService.Td(C1099470eiX.LIZ(c1099510eib));
                                    if (c1101820emKTd != null) {
                                        GamePointsMgr gamePointsMgr2 = gamePointsMgr;
                                        c1101820emKTd.LIZJ = !gamePointsMgr2.LLILZ ? 1 : 0;
                                        c1101820emKTd.LIZLLL = gamePointsMgr2.LLILZIL;
                                    }
                                }
                                Animator animator = animatorRb0;
                                if (animator != null) {
                                    animator.start();
                                }
                            }

                            @Override // X.InterfaceC1101940emW
                            public final boolean isRunning() {
                                Animator animator = animatorRb0;
                                if (animator != null) {
                                    return animator.isRunning();
                                }
                                return false;
                            }
                        };
                    }
                };
            }
            interfaceC1087010eOR2.Yd(gamePointsMgr$showShortTouch$1$myTouchView$1, interfaceC1101720emA);
        }
    }

    @Override // X.C0IF4
    public final void LIZ(Fragment fragment, DataChannel dataChannel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterRoom : ");
        sbLIZ.append(fragment);
        sbLIZ.append(" , ");
        sbLIZ.append(dataChannel);
        C20441214yg.LIZIZ("PointsShortTouchMgr", C2188811AlT.LIZIZ(sbLIZ));
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    @Override // X.InterfaceC465600INq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.points.GamePointsMgr.LJJIJ(java.lang.String, boolean):void");
    }

    @Override // X.C0IF4
    public final void LJIIIZ(Room room, DataChannel dataChannel, boolean z) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        GuessTaskPackInfo guessTaskPackInfo;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInteractCreate : ");
        sbLIZ.append(z);
        sbLIZ.append(" , ");
        sbLIZ.append(dataChannel);
        C20441214yg.LIZIZ("PointsShortTouchMgr", C2188811AlT.LIZIZ(sbLIZ));
        if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null) {
            boolValueOf = Boolean.valueOf(roomAuthStatus2.creditEntranceForAudience);
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIJIIJIL(boolValueOf) && this.LLILLJJLI != null) {
            if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                boolValueOf2 = Boolean.valueOf(roomAuthStatus.isShowCreditWidget());
            } else {
                boolValueOf2 = null;
            }
            if (C500260Jjc.LJJIJIIJIL(boolValueOf2)) {
                this.LL = null;
            }
            this.LLIZ = room;
            if (this.LLILZLL == null) {
                C1096990eeX c1096990eeX = new C1096990eeX();
                AwS596S0100000_17 awS596S0100000_17 = this.LLIZLLLIL;
                c1096990eeX.LLILZ = room;
                c1096990eeX.LLJIJIL = awS596S0100000_17;
                c1096990eeX.LLILZIL = dataChannel;
                c1096990eeX.LLIZ.LJ();
                if (room != null && (guessTaskPackInfo = room.getGuessTaskPackInfo()) != null) {
                    c1096990eeX.LLILZLL = guessTaskPackInfo.config;
                    c1096990eeX.LIZIZ(guessTaskPackInfo, true);
                }
                C1548820qPI.LIZLLL("game_guessing_short_touch_ready", c1096990eeX);
                C1548820qPI.LIZLLL("game_guessing_short_touch_close", c1096990eeX);
                C1548820qPI.LIZLLL("game_guessing_interact_tasks_finish", c1096990eeX);
                C1548820qPI.LIZLLL("game_guessing_indicator_user_attending", c1096990eeX);
                this.LLILZLL = c1096990eeX;
            }
        }
    }
}
