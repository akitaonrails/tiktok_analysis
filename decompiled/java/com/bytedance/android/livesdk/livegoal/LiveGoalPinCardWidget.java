package com.bytedance.android.livesdk.livegoal;

import X.AnimationAnimationListenerC1151560g4Y;
import X.AnimationAnimationListenerC1151570g4Z;
import X.C0IJT;
import X.C1092490eXH;
import X.C1108900exk;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C262100zr;
import X.C354201Zc;
import X.C389001fE;
import X.C474500IjA;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751980Tee;
import X.C786410Ut5;
import X.C930940aKi;
import X.CountDownTimerC1151440g4M;
import X.CountDownTimerC511401yy;
import X.EnumC1107860ew4;
import X.EnumC1108010ewJ;
import X.EnumC2636010g;
import X.InterfaceC1059280dfi;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnLayoutChangeListenerC1108930exn;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS30S0200100_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGoalPinCardWidget extends LiveWidget implements InterfaceC1059280dfi, InterfaceC1141530foN {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final Boolean LL;
    public IMessageManager LLILLJJLI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLL;
    public FrameLayout LLILZ;
    public CountDownTimerC1151440g4M LLILZIL;
    public CountDownTimerC511401yy LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public ViewOnLayoutChangeListenerC1108930exn LLJI;
    public long LLJIJIL;
    public long LLJILJIL;

    public LiveGoalPinCardWidget() {
        this(null);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.f913go5;
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    public final boolean A1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return Intrinsics.LJFF(dataChannel.gg0(LiveGoalPinCardVisibilityChannel.class), Boolean.TRUE);
        }
        return false;
    }

    public final void C1() {
        View view;
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        ViewOnLayoutChangeListenerC1108930exn viewOnLayoutChangeListenerC1108930exn = this.LLJI;
        if (viewOnLayoutChangeListenerC1108930exn != null) {
            View view2 = getView();
            viewOnLayoutChangeListenerC1108930exn.LLILLJJLI = null;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1108930exn);
            }
        }
        View view3 = getView();
        if (view3 == null || view3.getVisibility() != 0 || !A1() || (view = getView()) == null) {
            return;
        }
        C1092490eXH.LIZ(view, new AwS561S0100000_17(this, 230), false);
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        z1(EnumC1108010ewJ.OTHERS);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        String str;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveGoalPinCardVisibilityChannel.class, Boolean.FALSE);
        }
        C1108900exk c1108900exk = (C1108900exk) DataChannelGlobal.LLILZ.gg0(LiveGiftShowPinCardEvent.class);
        if (c1108900exk == null || (str = c1108900exk.LJFF) == null) {
            str = "";
        }
        C389001fE.LIZJ("lynx_pin_card_closed", new Pair[]{new Pair("name", str)});
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 229);
        if (C500260Jjc.LJJJI(this.LL)) {
            ViewOnLayoutChangeListenerC1108930exn viewOnLayoutChangeListenerC1108930exn = this.LLJI;
            if (viewOnLayoutChangeListenerC1108930exn != null) {
                View view = getView();
                viewOnLayoutChangeListenerC1108930exn.LLILLJJLI = null;
                if (view != null) {
                    view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1108930exn);
                }
            }
            if (this.LLIZLLLIL) {
                awS561S0100000_17.invoke();
                return;
            }
            View view2 = getView();
            if (view2 != null) {
                C1092490eXH.LIZ(view2, awS561S0100000_17, false);
                return;
            }
            return;
        }
        View view3 = getView();
        if (view3 != null) {
            if (view3.getAlpha() == 0.0f || view3.getVisibility() == 8) {
                awS561S0100000_17.invoke();
                return;
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setDuration(500L);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setAnimationListener(new AnimationAnimationListenerC1151560g4Y(view3, awS561S0100000_17, 3));
            view3.startAnimation(animationSet);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveGoalPinCardVisibilityChannel.class, Boolean.TRUE);
        }
        AFwS205S0000000_17 aFwS205S0000000_17 = AFwS205S0000000_17.get$arr$(68);
        if (this.LLJ - SystemClock.elapsedRealtime() <= 2000) {
            aFwS205S0000000_17.invoke();
            return;
        }
        if (C500260Jjc.LJJJI(this.LL)) {
            if (this.LLIZLLLIL) {
                aFwS205S0000000_17.invoke();
                return;
            }
            super.show();
            View view = getView();
            if (view != null) {
                C1092490eXH.LIZ(view, new AwS418S0200000_17(this, aFwS205S0000000_17, 23), true);
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 != null) {
            AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this, aFwS205S0000000_17, 24);
            Animation animation = view2.getAnimation();
            if (animation != null && animation.hasStarted()) {
                awS418S0200000_17.invoke();
                return;
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setDuration(500L);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(awS418S0200000_17, 19));
            view2.startAnimation(animationSet);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget.onCreate():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LLJ = 0L;
        this.LLIZLLLIL = false;
        ViewOnLayoutChangeListenerC1108930exn viewOnLayoutChangeListenerC1108930exn = this.LLJI;
        if (viewOnLayoutChangeListenerC1108930exn != null) {
            viewOnLayoutChangeListenerC1108930exn.LL = null;
        }
        this.LLJI = null;
        CountDownTimerC1151440g4M countDownTimerC1151440g4M = this.LLILZIL;
        if (countDownTimerC1151440g4M != null) {
            countDownTimerC1151440g4M.cancel();
        }
        CountDownTimerC511401yy countDownTimerC511401yy = this.LLILZLL;
        if (countDownTimerC511401yy != null) {
            countDownTimerC511401yy.cancel();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveGoalPinCardVisibilityChannel.class, Boolean.FALSE);
        }
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
    }

    public LiveGoalPinCardWidget(Boolean bool) {
        this.LL = bool;
        this.LLJIJIL = -1L;
        this.LLJILJIL = -1L;
    }

    public final void B1(C1108900exk c1108900exk) {
        Long lValueOf;
        String str;
        Boolean bool;
        String strLIZ;
        String str2;
        LiveMode liveModeLIZJ;
        ViewGroup.LayoutParams layoutParams;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Boolean boolValueOf = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        long jCurrentTimeMillis = (((long) c1108900exk.LJI) * 1000) - System.currentTimeMillis();
        if (c1108900exk.LIZ && Intrinsics.LJFF(c1108900exk.LJ, lValueOf) && jCurrentTimeMillis > 0) {
            CountDownTimerC1151440g4M countDownTimerC1151440g4M = this.LLILZIL;
            if (countDownTimerC1151440g4M != null) {
                countDownTimerC1151440g4M.cancel();
            }
            if (this.context != null && (str = c1108900exk.LIZLLL) != null && str.length() != 0 && !C494680Jac.LJI(this.dataChannel)) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(HighPrioritySlotVisibilityChannel.class), Boolean.TRUE)) {
                    DataChannel dataChannel2 = this.dataChannel;
                    if (dataChannel2 == null || !Intrinsics.LJFF(dataChannel2.gg0(HighPriorityTooltipVisibilityChannel.class), Boolean.TRUE)) {
                        DataChannel dataChannel3 = this.dataChannel;
                        if (dataChannel3 != null) {
                            bool = (Boolean) dataChannel3.gg0(GiftGuideWidgetVisibilityChannel.class);
                        } else {
                            bool = null;
                        }
                        if (!C500260Jjc.LJJJI(bool)) {
                            IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
                            Context context = this.context;
                            String str3 = c1108900exk.LIZLLL;
                            if (str3 == null) {
                                str3 = "";
                            }
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = iHybridContainerService.DU1(context, str3, null, true, new AwS30S0200100_17(this, c1108900exk, jCurrentTimeMillis, 2));
                            this.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 != null) {
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.setBackgroundColor(0);
                            }
                            FrameLayout frameLayout = this.LLILZ;
                            if (frameLayout != null) {
                                C786410Ut5.LJJJJIZL(frameLayout);
                            }
                            FrameLayout frameLayout2 = this.LLILZ;
                            if (frameLayout2 != null) {
                                frameLayout2.addView(this.LLILLL, -1, -1);
                            }
                            FrameLayout frameLayout3 = this.LLILZ;
                            if (frameLayout3 != null && (layoutParams = frameLayout3.getLayoutParams()) != null) {
                                if (C500260Jjc.LJJIJIIJIL(this.LL)) {
                                    layoutParams.height = (int) C497740JfY.LIZIZ(c1108900exk.LIZIZ);
                                    layoutParams.width = -1;
                                } else {
                                    layoutParams.height = C497740JfY.LJIIIZ(R.dimen.asu);
                                    layoutParams.width = C497740JfY.LJIIIZ(R.dimen.asv);
                                }
                                FrameLayout frameLayout4 = this.LLILZ;
                                if (frameLayout4 != null) {
                                    C786410Ut5.a6(frameLayout4, layoutParams);
                                }
                            }
                            this.LLJIJIL = SystemClock.elapsedRealtime();
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_push_card_show");
                            c474500IjALIZ.LJIJJLI(this.dataChannel);
                            DataChannel dataChannel4 = this.dataChannel;
                            if (dataChannel4 != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel4)) != null) {
                                strLIZ = C354201Zc.LIZ(liveModeLIZJ);
                            } else {
                                strLIZ = null;
                            }
                            c474500IjALIZ.LJJII(strLIZ, "live_type");
                            EnumC1107860ew4 enumC1107860ew4 = EnumC1107860ew4.LIVE_GOAL;
                            c474500IjALIZ.LJJII(enumC1107860ew4.getIdentify(), "card_id");
                            c474500IjALIZ.LJJII(enumC1107860ew4.getSource().name().toLowerCase(Locale.US), "creator");
                            DataChannel dataChannel5 = this.dataChannel;
                            if (dataChannel5 != null) {
                                boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel5));
                            }
                            if (C500260Jjc.LJJJI(boolValueOf)) {
                                str2 = "anchor";
                            } else {
                                str2 = "viewer";
                            }
                            c474500IjALIZ.LJJII(str2, "user_type");
                            c474500IjALIZ.LIZ();
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Integer numValueOf;
        if (Intrinsics.LJFF("live_goal_update_event", c262100zr.LIZ)) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            Boolean boolValueOf = null;
            boolean zLJFF = false;
            if (interfaceC1107590evd != null) {
                numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "goalStatus", 0));
                boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd, "pinned", false));
            } else {
                numValueOf = null;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                zLJFF = Intrinsics.LJFF(dataChannel.gg0(LiveGoalPinCardVisibilityChannel.class), Boolean.TRUE);
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                int code = EnumC2636010g.ONGOING.getCode();
                if (numValueOf != null && numValueOf.intValue() == code && C500260Jjc.LJIIZILJ(this.dataChannel) && !this.LLIZ && zLJFF) {
                    CountDownTimerC511401yy countDownTimerC511401yy = new CountDownTimerC511401yy(this, 2);
                    this.LLILZLL = countDownTimerC511401yy;
                    countDownTimerC511401yy.start();
                    this.LLIZ = true;
                }
            }
        }
    }

    public final void z1(EnumC1108010ewJ enumC1108010ewJ) {
        String strLIZ;
        String str;
        LiveMode liveModeLIZJ;
        if (!A1()) {
            return;
        }
        hide();
        this.LLJILJIL = SystemClock.elapsedRealtime();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_push_card_show_duration");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        Boolean boolValueOf = null;
        if (dataChannel != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) != null) {
            strLIZ = C354201Zc.LIZ(liveModeLIZJ);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        EnumC1107860ew4 enumC1107860ew4 = EnumC1107860ew4.LIVE_GOAL;
        c474500IjALIZ.LJJII(enumC1107860ew4.getIdentify(), "card_id");
        c474500IjALIZ.LJJII(enumC1107860ew4.getSource().name().toLowerCase(Locale.US), "creator");
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel2));
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "anchor";
        } else {
            str = "viewer";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII(Long.valueOf((this.LLJILJIL - this.LLJIJIL) / 1000), "duration");
        c474500IjALIZ.LJJII(enumC1108010ewJ.toString(), "reason");
        c474500IjALIZ.LIZ();
        this.LLJIJIL = -1L;
        this.LLJILJIL = -1L;
    }
}
