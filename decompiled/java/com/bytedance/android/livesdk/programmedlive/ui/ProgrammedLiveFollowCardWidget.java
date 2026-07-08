package com.bytedance.android.livesdk.programmedlive.ui;

import X.AbstractC19994813Le;
import X.C001A;
import X.C01GW;
import X.C09JN;
import X.C0GY9;
import X.C0IJT;
import X.C0IXW;
import X.C0JSS;
import X.C0K9J;
import X.C0K9S;
import X.C0K9T;
import X.C0K9U;
import X.C0K9V;
import X.C0KAJ;
import X.C0KVU;
import X.C0TZM;
import X.C1078480eAg;
import X.C1102070emj;
import X.C1102130emp;
import X.C1102420enI;
import X.C1107780evw;
import X.C1107810evz;
import X.C1143680frq;
import X.C1161920gLG;
import X.C11JF;
import X.C11S5;
import X.C1324720kZq;
import X.C15438062q;
import X.C1697810uHb;
import X.C16F5;
import X.C1701940uOG;
import X.C197039127h;
import X.C20441214yg;
import X.C20743416Fc;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C292401Bi;
import X.C466640IRq;
import X.C467820IWe;
import X.C474130IiZ;
import X.C474500IjA;
import X.C476090Ilj;
import X.C497740JfY;
import X.C500260Jjc;
import X.C512760K9a;
import X.C512820K9g;
import X.C512940K9s;
import X.C513000K9y;
import X.C522060Kdg;
import X.C749080TZy;
import X.C776250Uch;
import X.C786410Ut5;
import X.C916790Zxt;
import X.C924810aAp;
import X.EnumC1100250ejn;
import X.EnumC1107830ew1;
import X.EnumC512780K9c;
import X.EnumC512800K9e;
import X.InterfaceC1097760efm;
import X.InterfaceC1102120emo;
import X.InterfaceC1102160ems;
import X.InterfaceC513010K9z;
import Y.ACListenerS142S0100000_7;
import Y.ALAdapterS4S0100000_7;
import Y.ARunnableS76S0200000_7;
import Y.AUListenerS257S0100000_7;
import Y.AfS176S0100000_7;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.programmedlive.model.FollowCard;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveFollowCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.model.message.FollowCardMessage;
import com.bytedance.android.livesdk.notify.RecyclableNotifyWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class ProgrammedLiveFollowCardWidget extends RecyclableNotifyWidget implements OnMessageListener, InterfaceC1102160ems {
    public static final /* synthetic */ int LLJL = 0;
    public C1324720kZq LL;
    public C1324720kZq LLILLJJLI;
    public LinearLayout LLILLL;
    public C20743416Fc LLILZ;
    public C1324720kZq LLILZIL;
    public C197039127h LLILZLL;
    public LiveIconView LLIZ;
    public C197039127h LLIZLLLIL;
    public FrameLayout LLJ;
    public C476090Ilj LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public Room LLJILJILJ;
    public Pair<FollowCardMessage, Boolean> LLJILLL;
    public FollowCard LLJJ;
    public IMessageManager LLJJI;
    public boolean LLJJIII = true;
    public long LLJJIJI = -1;
    public long LLJJIJIIJIL = -1;
    public ValueAnimator LLJJIJIL;
    public ValueAnimator LLJJJ;
    public C0K9T LLJJJIL;
    public C11JF LLJJJJ;
    public final List<String> LLJJJJJIL;
    public final Set<Long> LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C0K9S LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.android.livesdk.notify.RecyclableNotifyWidget, X.InterfaceC1102150emr
    public final List<String> Q0() {
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        C1107810evz c1107810evz2 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz3 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz4 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz5 = C1107810evz.LIZIZ;
        return C1697810uHb.LJIIJJI(C1107810evz.LJJ.LIZ, "SUB_ONLY_ACCESS", "MULTI_FLOATING_FIX", "MULTI_FLOATING", "CO_HOST", C1107810evz.LJJIJL.LIZ, C1107810evz.LJJIJLIJ.LIZ);
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 8;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hjj;
    }

    @Override // com.bytedance.android.livesdk.notify.RecyclableNotifyWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final User B1() {
        List<User> list;
        List<User> list2;
        FollowCard followCard = this.LLJJ;
        if (!C500260Jjc.LJJIFFI((followCard == null || (list2 = followCard.multiUserList) == null) ? null : Boolean.valueOf(list2.isEmpty()))) {
            FollowCard followCard2 = this.LLJJ;
            if (followCard2 != null) {
                return followCard2.user;
            }
            return null;
        }
        FollowCard followCard3 = this.LLJJ;
        if (followCard3 == null || (list = followCard3.multiUserList) == null) {
            return null;
        }
        return (User) ListProtector.get(list, 0);
    }

    public final Handler C1() {
        return (Handler) this.LLJJL.getValue();
    }

    @Override // com.bytedance.android.livesdk.notify.RecyclableNotifyWidget, X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return new C0K9J();
    }

    public final void y1() {
        ValueAnimator valueAnimator = this.LLJJIJIL;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        if (valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LLJJIJIL;
            if (valueAnimator2 == null) {
                valueAnimator2 = null;
            }
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LLJJJ;
        if (valueAnimator3 == null) {
            valueAnimator3 = null;
        }
        if (valueAnimator3.isRunning()) {
            ValueAnimator valueAnimator4 = this.LLJJJ;
            (valueAnimator4 != null ? valueAnimator4 : null).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0K9S] */
    public ProgrammedLiveFollowCardWidget() {
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        C1107810evz c1107810evz2 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz3 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz4 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz5 = C1107810evz.LIZIZ;
        this.LLJJJJJIL = C1697810uHb.LJIIJJI("LIVE_NON_INPUT_BOTTOM_SHEET", "LIVE_DIALOG", "LIVE_FULL_SCREEN_SURVEY", "EXPLORE_DRAWER", C1107810evz.LJJIL.LIZ);
        this.LLJJJJLIIL = new LinkedHashSet();
        this.LLJJL = C292401Bi.LIZ(new AwS551S0100000_7(this, 94));
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC513010K9z() { // from class: X.0K9S
            @Override // X.InterfaceC513010K9z
            public final int LIZLLL() {
                return 1;
            }

            @Override // X.InterfaceC513010K9z
            public final void LIZ() {
                Pair<FollowCardMessage, Boolean> pair = this.LIZ.LLJILLL;
                if (pair == null || !pair.getSecond().booleanValue()) {
                    this.LIZ.dataChannel.zW(ProgrammedLiveFollowCardVisibilityChannel.class, new C512770K9b(true));
                }
            }

            @Override // X.InterfaceC513010K9z
            public final boolean LIZIZ() {
                Pair<FollowCardMessage, Boolean> pair = this.LIZ.LLJILLL;
                return (pair == null || pair.getSecond().booleanValue()) ? false : true;
            }

            @Override // X.InterfaceC513010K9z
            public final Map<Integer, List<String>> LIZJ() {
                HashMap map = new HashMap();
                C1107810evz c1107810evz6 = C1107810evz.LIZIZ;
                C1107810evz c1107810evz7 = C1107810evz.LIZIZ;
                C1107810evz c1107810evz8 = C1107810evz.LIZIZ;
                C1107810evz c1107810evz9 = C1107810evz.LIZIZ;
                C1107810evz c1107810evz10 = C1107810evz.LIZIZ;
                map.put(1, C1697810uHb.LJIIJJI(C1107810evz.LJJIIZ.LIZ, "SUB_ONLY_ACCESS", "MULTI_FLOATING_FIX", "MULTI_FLOATING", "CO_HOST", C1107810evz.LJJIJL.LIZ, C1107810evz.LJJIJLIJ.LIZ));
                return map;
            }

            @Override // X.InterfaceC513010K9z
            public final boolean isShowing() {
                return this.LIZ.isShowing();
            }

            @Override // X.InterfaceC513010K9z
            public final boolean LJ(String str) {
                this.LIZ.dataChannel.zW(ProgrammedLiveFollowCardVisibilityChannel.class, new C512770K9b(false));
                return true;
            }
        };
    }

    public final void I1() {
        C1().removeMessages(2);
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            c197039127h.setButtonVariant(2);
            c197039127h.setText(C497740JfY.LJIJI(2131841711));
        }
        C197039127h c197039127h2 = this.LLILZLL;
        if (c197039127h2 != null) {
            c197039127h2.setClickable(false);
        }
        Handler handlerC1 = C1();
        Message message = new Message();
        message.what = 3;
        C786410Ut5.LJLJLJ(handlerC1, message, 1000L);
    }

    @Override // com.bytedance.android.livesdk.notify.RecyclableNotifyWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        y1();
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJIII = true;
        this.LLJJIJI = -1L;
        this.LLJJIJIIJIL = -1L;
        IMessageManager iMessageManager = this.LLJJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.FOLLOW_CARD_MESSAGE.getIntType(), this);
        }
        C11JF c11jf = this.LLJJJJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            C11JF c11jf2 = this.LLJJJJ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            this.LLJJJJ = null;
        }
        C1().removeCallbacksAndMessages(null);
        C513000K9y c513000K9y = C513000K9y.LIZ;
        C513000K9y.LJIIIIZZ(1, this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.SIDE_CARD;
    }

    @Override // X.InterfaceC512840K9i
    public final InterfaceC1102120emo LJJLIIIIJ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    @Override // com.bytedance.android.livesdk.notify.RecyclableNotifyWidget, com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public final void onHide() {
        IHiddenChangeAwareWidget.DefaultImpls.onHide(this);
    }

    public static EnumC512800K9e D1(C0K9V c0k9v) {
        switch (C0K9U.LIZ[c0k9v.ordinal()]) {
            case 1:
                return EnumC512800K9e.MANUALLY_CLOSE;
            case 2:
            case 3:
            case 4:
                return EnumC512800K9e.CLICK_CONTENT;
            case 5:
                return EnumC512800K9e.TIMEOUT;
            case 6:
                return EnumC512800K9e.FREQUENCY_CONTROLLED;
            default:
                return EnumC512800K9e.OTHERS;
        }
    }

    public static boolean E1(ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget) {
        Boolean boolValueOf;
        List<User> list;
        FollowCard followCard = programmedLiveFollowCardWidget.LLJJ;
        programmedLiveFollowCardWidget.getClass();
        if (followCard != null && (list = followCard.multiUserList) != null) {
            boolValueOf = Boolean.valueOf(!list.isEmpty());
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public final void F1(FollowCard followCard) {
        Boolean boolValueOf;
        TextPaint paint;
        Integer numValueOf;
        float fLIZIZ;
        float fLIZIZ2;
        ArrayList arrayList = new ArrayList();
        if (followCard.multiUserList != null) {
            boolValueOf = Boolean.valueOf(!r0.isEmpty());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            List<User> list = followCard.multiUserList;
            if (list != null) {
                arrayList.addAll(list);
            }
        } else {
            User user = followCard.user;
            if (user == null) {
                return;
            } else {
                arrayList.add(user);
            }
        }
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int size = arrayList.size();
            if (size != 1) {
                if (size != 2) {
                    fLIZIZ2 = C497740JfY.LIZIZ(20.0f);
                } else {
                    fLIZIZ2 = C497740JfY.LIZIZ(16.0f);
                }
            } else {
                fLIZIZ2 = C497740JfY.LIZIZ(10.0f);
            }
            marginLayoutParams.topMargin = (int) fLIZIZ2;
            C786410Ut5.a6(frameLayout, marginLayoutParams);
        }
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            int size2 = arrayList.size();
            if (size2 != 1 && size2 != 2) {
                fLIZIZ = C497740JfY.LIZIZ(12.0f);
            } else {
                fLIZIZ = C497740JfY.LIZIZ(8.0f);
            }
            marginLayoutParams2.topMargin = (int) fLIZIZ;
            C786410Ut5.d6(linearLayout, marginLayoutParams2);
        }
        C476090Ilj c476090Ilj = this.LLJI;
        if (c476090Ilj != null && !arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                User user2 = (User) ListProtector.get(arrayList, 0);
                C786410Ut5.LLJJIII(c476090Ilj.LIZLLL, 0);
                C786410Ut5.LLJJIII(c476090Ilj.LJ, 8);
                C786410Ut5.LLJJIII(c476090Ilj.LJFF, 8);
                HandlerHook.viewPost(c476090Ilj.LIZLLL, new ARunnableS76S0200000_7(c476090Ilj, user2, 83));
            }
            if (arrayList.size() == 2) {
                User user3 = (User) ListProtector.get(arrayList, 0);
                User user4 = (User) ListProtector.get(arrayList, 1);
                C786410Ut5.LLJJIII(c476090Ilj.LIZLLL, 0);
                C786410Ut5.LLJJIII(c476090Ilj.LJ, 0);
                C786410Ut5.LLJJIII(c476090Ilj.LJFF, 8);
                int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.sh);
                int iLIZIZ = (int) C497740JfY.LIZIZ(1.5f);
                int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.sz);
                int i = (iLJIIIZ * 4) - iLJIIIZ2;
                C476090Ilj.LIZIZ(user3.getAvatarThumb(), c476090Ilj.LIZLLL);
                C476090Ilj.LIZIZ(user4.getAvatarThumb(), c476090Ilj.LJ);
                C476090Ilj.LIZ(iLJIIIZ, iLJIIIZ2, iLIZIZ, c476090Ilj.LJ);
                int i2 = iLJIIIZ * 2;
                int i3 = (i2 - iLJIIIZ2) + iLIZIZ;
                int i4 = (c476090Ilj.LIZJ / 2) - (i / 2);
                C1324720kZq c1324720kZq = c476090Ilj.LIZLLL;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
                layoutParams.setMarginStart(i4);
                C786410Ut5.u6(c1324720kZq, layoutParams);
                C1324720kZq c1324720kZq2 = c476090Ilj.LJ;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
                layoutParams2.setMarginStart(i4 + i3);
                C786410Ut5.u6(c1324720kZq2, layoutParams2);
            }
            if (arrayList.size() > 2) {
                User user5 = (User) ListProtector.get(arrayList, 0);
                User user6 = (User) ListProtector.get(arrayList, 1);
                User user7 = (User) ListProtector.get(arrayList, 2);
                C786410Ut5.LLJJIII(c476090Ilj.LIZLLL, 0);
                C786410Ut5.LLJJIII(c476090Ilj.LJ, 0);
                C786410Ut5.LLJJIII(c476090Ilj.LJFF, 0);
                int iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sc);
                int iLIZIZ2 = (int) C497740JfY.LIZIZ(1.5f);
                int iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sz);
                int i5 = (iLJIIIZ3 * 6) - (iLJIIIZ4 * 2);
                C476090Ilj.LIZIZ(user5.getAvatarThumb(), c476090Ilj.LIZLLL);
                C476090Ilj.LIZIZ(user6.getAvatarThumb(), c476090Ilj.LJ);
                C476090Ilj.LIZIZ(user7.getAvatarThumb(), c476090Ilj.LJFF);
                C476090Ilj.LIZ(iLJIIIZ3, iLJIIIZ4, iLIZIZ2, c476090Ilj.LJ);
                C476090Ilj.LIZ(iLJIIIZ3, iLJIIIZ4, iLIZIZ2, c476090Ilj.LJFF);
                int i6 = iLJIIIZ3 * 2;
                int i7 = (i6 - iLJIIIZ4) + iLIZIZ2;
                int i8 = (c476090Ilj.LIZJ / 2) - (i5 / 2);
                C1324720kZq c1324720kZq3 = c476090Ilj.LIZLLL;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i6, i6);
                layoutParams3.setMarginStart(i8);
                C786410Ut5.u6(c1324720kZq3, layoutParams3);
                C1324720kZq c1324720kZq4 = c476090Ilj.LJ;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i6, i6);
                layoutParams4.setMarginStart(i8 + i7);
                C786410Ut5.u6(c1324720kZq4, layoutParams4);
                C1324720kZq c1324720kZq5 = c476090Ilj.LJFF;
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(i6, i6);
                layoutParams5.setMarginStart(i8 + (i7 * 2));
                C786410Ut5.u6(c1324720kZq5, layoutParams5);
            }
        }
        C20743416Fc c20743416Fc = this.LLILZ;
        if (c20743416Fc != null) {
            if (arrayList.size() == 1) {
                c20743416Fc.setText(C0KVU.LIZ((User) ListProtector.get(arrayList, 0)));
                c20743416Fc.setLines(1);
            } else {
                String strLIZ = C0KVU.LIZ((User) ListProtector.get(arrayList, 0));
                C20743416Fc c20743416Fc2 = this.LLILZ;
                if (c20743416Fc2 != null) {
                    paint = c20743416Fc2.getPaint();
                } else {
                    paint = null;
                }
                FrameLayout frameLayout2 = this.LLJ;
                if (frameLayout2 != null) {
                    numValueOf = Integer.valueOf(frameLayout2.getWidth());
                } else {
                    numValueOf = null;
                }
                if (paint != null && numValueOf != null) {
                    int length = strLIZ.length();
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            String strSubstring = strLIZ.substring(0, strLIZ.length() - i9);
                            if (i9 != 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strSubstring);
                                sbLIZ.append("...");
                                strSubstring = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            if (paint.measureText(strSubstring) < ((int) C497740JfY.LIZIZ(94.0f))) {
                                strLIZ = strSubstring;
                                break;
                            }
                            i9++;
                        } else {
                            strLIZ = C0KVU.LIZ((User) ListProtector.get(arrayList, 0));
                            break;
                        }
                    }
                }
                c20743416Fc.setText(this.context.getResources().getQuantityString(2131755944, arrayList.size() - 1, strLIZ, Integer.valueOf(arrayList.size() - 1)));
                c20743416Fc.setLines(2);
            }
            c20743416Fc.requestLayout();
        }
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131841705, C0KVU.LIZ(UserService.getInstance().user().LJIJJLI())));
        }
        C16F5 c16f52 = this.LLJILJIL;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJJ(2131841706, C0KVU.LIZ((User) ListProtector.get(arrayList, 0))));
        }
        if (arrayList.size() == 1 && ((User) ListProtector.get(arrayList, 0)).getAuthenticationInfo() != null) {
            C0JSS.LJFF(this.LLILZIL, ((User) ListProtector.get(arrayList, 0)).getAuthenticationInfo().authenticationBadge, 0, new C522060Kdg(this, 0));
        } else {
            C1324720kZq c1324720kZq6 = this.LLILZIL;
            if (c1324720kZq6 != null) {
                c1324720kZq6.setImageDrawable(null);
            }
            C1324720kZq c1324720kZq7 = this.LLILZIL;
            if (c1324720kZq7 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq7);
            }
        }
        if (arrayList.size() == 1) {
            C500260Jjc.LLFFF(this.LLILZLL);
            C500260Jjc.LJIILIIL(this.LLIZLLLIL);
            if (((User) ListProtector.get(arrayList, 0)).isFollowing()) {
                I1();
            } else {
                C197039127h c197039127h = this.LLILZLL;
                if (c197039127h != null) {
                    c197039127h.setButtonVariant(0);
                    c197039127h.setText(C497740JfY.LJIJI(2131841701));
                }
            }
            this.LLJJJJ = (C11JF) UserService.getInstance().user().LIZIZ(((User) ListProtector.get(arrayList, 0)).getId()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 92), new C09JN() { // from class: X.0K9W
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("ProgrammedLiveFollowCardWidget@cec8.loadUser$8");
                    C1C7U.LIZIZ("ProgrammedLiveFollowCardWidget@cec8.loadUser$8");
                }
            });
            C1324720kZq c1324720kZq8 = this.LLILLJJLI;
            if (c1324720kZq8 != null) {
                C786410Ut5.e8(c1324720kZq8, new ACListenerS142S0100000_7(this, 308));
            }
            LinearLayout linearLayout2 = this.LLILLL;
            if (linearLayout2 != null) {
                C786410Ut5.R7(linearLayout2, null);
            }
            FrameLayout frameLayout3 = this.LLJ;
            if (frameLayout3 != null) {
                C786410Ut5.O7(frameLayout3, null);
            }
            C197039127h c197039127h2 = this.LLIZLLLIL;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, null);
            }
            C1324720kZq c1324720kZq9 = this.LL;
            if (c1324720kZq9 != null) {
                C786410Ut5.e8(c1324720kZq9, null);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLILZLL);
        C500260Jjc.LLFFF(this.LLIZLLLIL);
        C500260Jjc.LJIILIIL(this.LLILZIL);
        ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 99);
        C1324720kZq c1324720kZq10 = this.LLILLJJLI;
        if (c1324720kZq10 != null) {
            C786410Ut5.e8(c1324720kZq10, null);
        }
        LinearLayout linearLayout3 = this.LLILLL;
        if (linearLayout3 != null) {
            C786410Ut5.R7(linearLayout3, aCListenerS142S0100000_7);
        }
        FrameLayout frameLayout4 = this.LLJ;
        if (frameLayout4 != null) {
            C786410Ut5.O7(frameLayout4, aCListenerS142S0100000_7);
        }
        C197039127h c197039127h3 = this.LLIZLLLIL;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, aCListenerS142S0100000_7);
        }
        C1324720kZq c1324720kZq11 = this.LL;
        if (c1324720kZq11 == null) {
            return;
        }
        C786410Ut5.e8(c1324720kZq11, aCListenerS142S0100000_7);
    }

    public final void G1(boolean z) {
        String str;
        int followStatus;
        String str2;
        Map<String, String> linkedHashMap;
        String str3;
        Room room;
        IInteractService iInteractService;
        User userB1 = B1();
        if (userB1 != null) {
            try {
                HashMap map = new HashMap();
                if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
                    map.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
                }
                w.LIZ.getClass();
                String strLJIILJJIL = w.LJIILJJIL();
                boolean zIsEmpty = TextUtils.isEmpty(strLJIILJJIL);
                String str4 = CardStruct.IStatusCode.DEFAULT;
                if (!zIsEmpty && Intrinsics.LJFF(strLJIILJJIL, "click_push_live_cd_user")) {
                    map.put("is_subscribe", "1");
                } else {
                    map.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
                }
                map.put("request_page", "program_live_audience_c_anchor");
                if (z) {
                    map.put("growth_deepevent", "1");
                }
                map.put("connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType());
                map.put("core_connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oE2());
                map.put("to_user_id", String.valueOf(userB1.getId()));
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
                map.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                map.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                map.put("click_user_position", "program_live_following_card");
                if (Intrinsics.LJFF(this.dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
                    str = "portrait";
                } else {
                    str = "landscape";
                }
                map.put("room_orientation", str);
                FollowInfo followInfo = userB1.getFollowInfo();
                if (followInfo != null) {
                    followStatus = (int) followInfo.getFollowStatus();
                } else {
                    followStatus = 0;
                }
                map.put("follow_status", String.valueOf(followStatus));
                if (followStatus != 1 && followStatus != 3) {
                    str2 = "single";
                } else {
                    str2 = "mutual";
                }
                map.put("follow_type", str2);
                IInteractService iInteractService2 = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                if (iInteractService2.Nt()) {
                    linkedHashMap = iInteractService2.getMatchLogParams();
                } else {
                    linkedHashMap = new LinkedHashMap<>();
                }
                if (!TextUtils.isEmpty(iInteractService2.xw0())) {
                    if (TextUtils.equals("in_pk", iInteractService2.xw0())) {
                        linkedHashMap.put("match_status", "pk_phase");
                    } else {
                        linkedHashMap.put("match_status", LiveCenterMockToolSwitch.PUNISH);
                    }
                }
                map.putAll(linkedHashMap);
                map.putAll(C467820IWe.LIZIZ());
                if (z && (iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class)) != null) {
                    iInteractService.Yz("follow", map);
                }
                map.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LJJ(Long.valueOf(userB1.getId())));
                if (C924810aAp.LJ().LJJII > 0) {
                    str4 = "1";
                }
                map.put("is_guest_connection", str4);
                if (((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Al1()) {
                    ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).dH(map);
                }
                if (z) {
                    str3 = "livesdk_follow";
                } else {
                    str3 = "livesdk_unfollow";
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJJII(Integer.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount()), "guest_cnt");
                c474500IjALIZ.LJIILLIIL(new C474130IiZ("live", userB1.getId()));
                c474500IjALIZ.LJIJJLI(this.dataChannel);
                c474500IjALIZ.LJJIZ(this.dataChannel);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                    c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ip(room.getId())), "server_heat_level");
                    c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).v5(room.getId())), "client_heat_level");
                }
                c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2(), "multi_tool");
                c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_follow"));
                c474500IjALIZ.LJIIJJI("live_interact");
                c474500IjALIZ.LJIILJJIL("live_detail");
                c474500IjALIZ.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        FollowCard followCard = this.LLJJ;
        if (followCard != null) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            J1(followCard, z);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (C1324720kZq) findViewById(R.id.bnu);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.bij);
        this.LLILLL = (LinearLayout) findViewById(R.id.user_name_group);
        this.LLILZ = (C20743416Fc) findViewById(R.id.p09);
        this.LLILZIL = (C1324720kZq) findViewById(R.id.bbv);
        this.LLILZLL = (C197039127h) findViewById(R.id.idt);
        this.LLIZ = (LiveIconView) findViewById(R.id.e1g);
        this.LLIZLLLIL = (C197039127h) findViewById(R.id.uj2);
        this.LLJIJIL = (C16F5) findViewById(R.id.ewu);
        this.LLJILJIL = (C16F5) findViewById(R.id.ev2);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bi2);
        this.LLJ = frameLayout;
        if (frameLayout != null) {
            this.LLJI = new C476090Ilj(frameLayout);
        }
        C1143680frq.LIZLLL(this.LL, "tiktok_live_watch_resource_normal_1", "ttlive_programmed_live_follow_card_background.png");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJIJIL = valueAnimatorOfFloat;
        ValueAnimator valueAnimator = null;
        if (valueAnimatorOfFloat == null) {
            valueAnimatorOfFloat = null;
        }
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 38));
        ValueAnimator valueAnimator2 = this.LLJJIJIL;
        if (valueAnimator2 == null) {
            valueAnimator2 = null;
        }
        valueAnimator2.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
        ValueAnimator valueAnimator3 = this.LLJJIJIL;
        if (valueAnimator3 == null) {
            valueAnimator3 = null;
        }
        valueAnimator3.setDuration(300L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.LLJJJ = valueAnimatorOfFloat2;
        if (valueAnimatorOfFloat2 == null) {
            valueAnimatorOfFloat2 = null;
        }
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS257S0100000_7(this, 39));
        ValueAnimator valueAnimator4 = this.LLJJJ;
        if (valueAnimator4 == null) {
            valueAnimator4 = null;
        }
        valueAnimator4.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
        ValueAnimator valueAnimator5 = this.LLJJJ;
        if (valueAnimator5 != null) {
            valueAnimator = valueAnimator5;
        }
        valueAnimator.setDuration(300L);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        this.LLJILJILJ = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLJJJJLIIL.clear();
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.LLJJI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.FOLLOW_CARD_MESSAGE.getIntType(), this);
        }
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS142S0100000_7(this, 95));
        }
        LiveIconView liveIconView = this.LLIZ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 96));
        }
        this.dataChannel.BQ2(this, ProgrammedLiveFollowCardVisibilityChannel.class, new AwS586S0100000_7(this, 182));
        C512760K9a c512760K9a = (C512760K9a) this.dataChannel.gg0(C749080TZy.class);
        if (c512760K9a != null) {
            this.LLJJ = c512760K9a.LIZ;
            FollowCard followCard = this.LLJJ;
            if (followCard != null && this.LLJJIII && !c512760K9a.LIZIZ) {
                F1(followCard);
                J1(followCard, false);
                this.LLJJIJI = c512760K9a.LIZJ;
            }
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && ((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    onMessage((IMessage) obj);
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof FollowCardMessage) {
            if (!C916790Zxt.LIZ(8) && (((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).LJIIIIZZ(this.dataChannel, C1107810evz.LJJIJL) || ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).LJIIIIZZ(this.dataChannel, C1107810evz.LJJIJLIJ))) {
                return;
            }
            FollowCardMessage followCardMessage = (FollowCardMessage) iMessage;
            Pair<FollowCardMessage, Boolean> pair = this.LLJILLL;
            if (pair == null || (true ^ Intrinsics.LJFF(followCardMessage.followCardId, pair.getFirst().followCardId))) {
                this.LLJILLL = new Pair<>(iMessage, Boolean.FALSE);
                if (this.LLJJIII) {
                    Handler handlerC1 = C1();
                    Message message = new Message();
                    message.what = 0;
                    message.obj = iMessage;
                    Long l = followCardMessage.maxRandom;
                    long jNextLong = 0;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        if (jLongValue > 0) {
                            jNextLong = AbstractC19994813Le.Default.nextLong(jLongValue);
                        }
                    }
                    C786410Ut5.LJLJLJ(handlerC1, message, jNextLong);
                }
            }
        }
    }

    public final void z1(boolean z) {
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            frameLayout.setClickable(z);
        }
        C1324720kZq c1324720kZq = this.LLILLJJLI;
        if (c1324720kZq != null) {
            c1324720kZq.setClickable(z);
        }
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            linearLayout.setClickable(z);
        }
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            c197039127h.setClickable(z);
        }
        LiveIconView liveIconView = this.LLIZ;
        if (liveIconView != null) {
            liveIconView.setClickable(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1(X.C0K9V r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget.H1(X.0K9V, boolean):void");
    }

    public final void J1(FollowCard followCard, boolean z) {
        long jLongValue;
        User user;
        ArrayList arrayList;
        List<User> list;
        List<User> list2;
        View view = getView();
        boolean z2 = false;
        if (view != null && view.getVisibility() == 0) {
            return;
        }
        boolean zEnable = LiveNotifyMessageFrequencySetting.INSTANCE.enable();
        Long l = followCard.id;
        long id = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (zEnable && jLongValue != 0) {
            if (!this.LLJJJJLIIL.contains(Long.valueOf(jLongValue))) {
                HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
                C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(8, this.dataChannel, "watch", false, false);
                if (!c512940K9sLIZLLL.LIZ) {
                    C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, this.LLJJJIL, C0KAJ.AUTO_CONTROL, null, c512940K9sLIZLLL.LIZIZ, 48);
                    A1(C0K9V.FREQUENCY_CONTROLLED, true, false);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(jLongValue);
                    sbLIZ.append(" has been frequency controlled. Not show.");
                    C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                this.LLJJJJLIIL.add(Long.valueOf(jLongValue));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(jLongValue);
                sbLIZ2.append(" is added to allow set. Show.");
                C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ2));
                z2 = true;
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(jLongValue);
                sbLIZ3.append(" is in allow set. Show.");
                C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        y1();
        ValueAnimator valueAnimator = this.LLJJIJIL;
        Object objValueOf = null;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.removeAllListeners();
        ValueAnimator valueAnimator2 = this.LLJJIJIL;
        if (valueAnimator2 == null) {
            valueAnimator2 = null;
        }
        valueAnimator2.addListener(new ALAdapterS4S0100000_7(this, 11));
        ValueAnimator valueAnimator3 = this.LLJJIJIL;
        if (valueAnimator3 == null) {
            valueAnimator3 = null;
        }
        valueAnimator3.start();
        if (zEnable && z2) {
            HashMap<Long, MsgNotifyQuota> map2 = C1102420enI.LIZ;
            Room room = this.LLJILJILJ;
            if (room != null) {
                id = room.getId();
            }
            C1102420enI.LIZIZ(8, false, false, "watch", "ProgramLiveFollowCard", id);
        }
        ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).f10(this.dataChannel, C1107810evz.LJJIJ, new C1107780evw(true, (Object) EnumC512780K9c.PROGRAMMED_LIVE_FOLLOW));
        if (z) {
            this.LLJJIJI = SystemClock.elapsedRealtime();
            if (E1(this)) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_program_live_multi_following_card_show");
                c474500IjALIZ.LJIJJLI(this.dataChannel);
                FollowCard followCard2 = this.LLJJ;
                if (followCard2 != null && (list2 = followCard2.multiUserList) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<User> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(it2.next().getId()));
                    }
                } else {
                    arrayList = null;
                }
                c474500IjALIZ.LJJII(arrayList, "to_user_id");
                FollowCard followCard3 = this.LLJJ;
                if (followCard3 != null && (list = followCard3.multiUserList) != null) {
                    objValueOf = Integer.valueOf(list.size());
                }
                c474500IjALIZ.LJJII(objValueOf, "to_user_num");
                c474500IjALIZ.LIZ();
            } else {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_program_live_following_card_show");
                c474500IjALIZ2.LJIJJLI(this.dataChannel);
                FollowCard followCard4 = this.LLJJ;
                if (followCard4 != null && (user = followCard4.user) != null) {
                    objValueOf = Long.valueOf(user.getId());
                }
                c474500IjALIZ2.LJJII(objValueOf, "to_user_id");
                c474500IjALIZ2.LIZ();
            }
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_side_card_show");
            c474500IjALIZ3.LJIJJLI(this.dataChannel);
            if (E1(this)) {
                c474500IjALIZ3.LJJII("program_live_multi_following_card", "content");
            } else {
                c474500IjALIZ3.LJJII("program_live_following_card", "content");
            }
            c474500IjALIZ3.LIZ();
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) {
        LLFFF(i);
    }

    @Override // com.bytedance.android.livesdk.notify.RecyclableNotifyWidget
    public final void x1(EnumC512800K9e enumC512800K9e, boolean z) {
        super.x1(enumC512800K9e, z);
        IBusinessAvoidConflictNotifyService iBusinessAvoidConflictNotifyService = (IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class);
        DataChannel dataChannel = this.dataChannel;
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        iBusinessAvoidConflictNotifyService.f10(dataChannel, C1107810evz.LJJIJ, new C1107780evw(false, (Object) EnumC512780K9c.PROGRAMMED_LIVE_FOLLOW));
    }

    public final void A1(final C0K9V c0k9v, boolean z, final boolean z2) {
        if (c0k9v == C0K9V.NETWORK) {
            View view = getView();
            if (view != null && view.getVisibility() == 0) {
                hide();
            }
            H1(c0k9v, z);
            return;
        }
        View view2 = getView();
        if (view2 != null && view2.getVisibility() == 8) {
            return;
        }
        if (c0k9v == C0K9V.CONFLICT_CONTROLLED) {
            LLIILII(true, z2, true, C513000K9y.LIZ, null);
        } else {
            C512820K9g c512820K9g = C0KAJ.Companion;
            EnumC512800K9e enumC512800K9eD1 = D1(c0k9v);
            c512820K9g.getClass();
            C0KAJ c0kajLIZ = C512820K9g.LIZ(enumC512800K9eD1);
            if (c0kajLIZ != null) {
                C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, this.LLJJJIL, c0kajLIZ, null, null, 112);
            }
            y1();
            ValueAnimator valueAnimator = this.LLJJJ;
            ValueAnimator valueAnimator2 = null;
            if (valueAnimator == null) {
                valueAnimator = null;
            }
            valueAnimator.removeAllListeners();
            ValueAnimator valueAnimator3 = this.LLJJJ;
            if (valueAnimator3 == null) {
                valueAnimator3 = null;
            }
            valueAnimator3.addListener(new AnimatorListenerAdapter() { // from class: X.0K9Z
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget = this.LL;
                    C0K9V c0k9v2 = c0k9v;
                    programmedLiveFollowCardWidget.getClass();
                    programmedLiveFollowCardWidget.x1(ProgrammedLiveFollowCardWidget.D1(c0k9v2), z2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget = this.LL;
                    C0K9V c0k9v2 = c0k9v;
                    programmedLiveFollowCardWidget.getClass();
                    programmedLiveFollowCardWidget.x1(ProgrammedLiveFollowCardWidget.D1(c0k9v2), z2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.LL.z1(false);
                }
            });
            ValueAnimator valueAnimator4 = this.LLJJJ;
            if (valueAnimator4 != null) {
                valueAnimator2 = valueAnimator4;
            }
            valueAnimator2.start();
        }
        H1(c0k9v, z);
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        if (z) {
            A1(C0K9V.CONFLICT_CONTROLLED, true, false);
        } else {
            if (c1102130emp.LIZ() == null) {
                return;
            }
            x1(EnumC512800K9e.CONFLICT_CONTROLLED, false);
        }
    }
}
