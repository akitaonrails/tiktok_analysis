package com.ss.android.ugc.aweme.hangout.component.livecard.view;

import X.AbstractC479160Iqg;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0IEG;
import X.C0IL2;
import X.C0KVU;
import X.C0PEM;
import X.C1161920gLG;
import X.C118300cf;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331750klB;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19631511rN;
import X.C19719912Dl;
import X.C19EH;
import X.C20441214yg;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C472280Ifa;
import X.C475540Ikq;
import X.C477860Ioa;
import X.C477870Iob;
import X.C478090Iox;
import X.C478590Ipl;
import X.C478750Iq1;
import X.C478760Iq2;
import X.C478920IqI;
import X.C478950IqL;
import X.C479080IqY;
import X.C479140Iqe;
import X.C479150Iqf;
import X.C479170Iqh;
import X.C479440Ir8;
import X.C479450Ir9;
import X.C479760Ire;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C842240X2g;
import X.EnumC21569519bB;
import X.EnumC479370Ir1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC466370IQp;
import X.InterfaceC468260IXw;
import X.InterfaceC472300Ifc;
import X.InterfaceC475150IkD;
import X.InterfaceC475300IkS;
import X.InterfaceC479210Iql;
import X.ViewOnLayoutChangeListenerC521670Kd3;
import X.ViewTreeObserverOnPreDrawListenerC521780KdE;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.feed.api.HangoutModuleReShowEvent;
import com.bytedance.android.feed.api.HangoutRoomFeedCleanupEvent;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.feed.api.LiveRoomPageChangeEvent;
import com.bytedance.android.feed.api.TopLiveClearModelChannel;
import com.bytedance.android.feed.api.TopLiveSkylightEntranceEvent;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutTopliveNewUserGuideEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLivePreloadConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.HangoutRoomFeedViewModel;
import com.ss.android.ugc.aweme.hangout.component.newuserguide.viewmodel.HangoutNewUserGuideVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS22S0001000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game.GameDrawerCategory;
import webcast.data.CardTag;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutRoomFeedAssem extends LiveHangoutV2SelectableSlotAssem implements InterfaceC479210Iql, InterfaceC472300Ifc {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILLL;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public boolean LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public ValueAnimator LLJLILLLLZIIL;
    public ViewOnLayoutChangeListenerC521670Kd3 LLJLL;
    public ARunnableS107S0100000_7 LLJLLIL;
    public ViewTreeObserverOnPreDrawListenerC521780KdE LLJLLL;
    public boolean LLJZ;
    public C472280Ifa LLJZIJLIL;
    public final AssemVMLazy LLL;
    public final AssemVMLazy LLLF;
    public EnterRoomConfig LLLFF;
    public C479170Iqh LLLFFI;
    public ARunnableS107S0100000_7 LLLFZ;
    public Pair<? extends Fragment, ? extends C0IEG> LLLI;
    public View LLLII;
    public View LLLIIII;
    public View LLLIIIIL;
    public View LLLIIIL;
    public SmartImageView LLLIIL;
    public TuxTextView LLLIILIL;
    public C19631511rN LLLIL;
    public View LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public final C01GW LLLIZZ;
    public boolean LLLJ;
    public long LLLJIL;
    public final float LLLJL;
    public boolean LLLL;
    public final C01GW LLLLII;
    public List<? extends FeedItem> LLLLIIIILLL;
    public final AwS586S0100000_7 LLLLIIL;
    public final AwS586S0100000_7 LLLLIILL;
    public final int LLJJIII = View.generateViewId();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 211));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HangoutRoomFeedAssem.class, "roomFeedVM", "getRoomFeedVM()Lcom/ss/android/ugc/aweme/hangout/component/livecard/viewmodel/HangoutRoomFeedViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(HangoutRoomFeedAssem.class, "guideLayoutVM", "getGuideLayoutVM()Lcom/ss/android/ugc/aweme/hangout/component/newuserguide/viewmodel/HangoutNewUserGuideVM;", 0);
        c09r3.getClass();
        LLLLIILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public HangoutRoomFeedAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HangoutRoomFeedViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ, 209), AFwS237S0000000_7.get$arr$(76), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(HangoutNewUserGuideVM.class);
        this.LLLF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ2, 210), AFwS237S0000000_7.get$arr$(77), null, true);
        this.LLLIZZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 207));
        this.LLLJL = (int) C497740JfY.LIZIZ(12.0f);
        this.LLLLII = C452501pT.LIZIZ(new AwS551S0100000_7(this, 208));
        this.LLLLIIIILLL = C13BV.INSTANCE;
        this.LLLLIIL = new AwS586S0100000_7(this, 217);
        this.LLLLIILL = new AwS586S0100000_7(this, 216);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ddk;
    }

    public final void Gp() {
        View view;
        ViewTreeObserver viewTreeObserver;
        this.LLJZ = false;
        ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE = this.LLJLLL;
        if (viewTreeObserverOnPreDrawListenerC521780KdE != null && (view = this.LLJJIJI) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC521780KdE);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC521780KdE, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.LLJLLL = null;
    }

    @Override // X.InterfaceC472300Ifc
    public final void Je() {
    }

    public final void Bp() {
        C19EH c19ehPu;
        Fragment fragmentLJI;
        Fragment first;
        C0IEG second;
        InterfaceC466370IQp currentFragment;
        FragmentManager parentFragmentManager;
        if (!this.LLILZ) {
            C20441214yg.LJIIL("HangoutRoomFeedAssem", "removeRoomFragment: view not valid, clearing reference only");
            this.LLLI = null;
            return;
        }
        InterfaceC475150IkD interfaceC475150IkDUp = up();
        if (interfaceC475150IkDUp == null || (c19ehPu = interfaceC475150IkDUp.Pu()) == null || !((fragmentLJI = C724240Sb0.LJI(this)) == null || (parentFragmentManager = fragmentLJI.getParentFragmentManager()) == null || !parentFragmentManager.LJL())) {
            C20441214yg.LJIIL("HangoutRoomFeedAssem", "removeRoomFragment: FragmentManager destroyed or transaction null, clearing reference only");
            this.LLLI = null;
            return;
        }
        Pair<? extends Fragment, ? extends C0IEG> pair = this.LLLI;
        if (pair != null && (second = pair.getSecond()) != null && (currentFragment = second.getCurrentFragment()) != null) {
            currentFragment.pL(false);
        }
        Pair<? extends Fragment, ? extends C0IEG> pair2 = this.LLLI;
        if (pair2 != null && (first = pair2.getFirst()) != null) {
            try {
                c19ehPu.LJIIZILJ(first);
                c19ehPu.LJIIL();
                C786410Ut5.LJLLLLLL(8, LJJIJL());
                C20441214yg.LIZIZ("HangoutRoomFeedAssem", "removeRoomFragment: fragment removed");
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("HangoutRoomFeedAssem", "removeRoomFragment: failed to remove fragment", e);
            }
        }
        this.LLLI = null;
        C472280Ifa c472280Ifa = this.LLJZIJLIL;
        if (c472280Ifa != null) {
            c472280Ifa.setSkylightOpen(false);
        }
    }

    @Override // X.InterfaceC472300Ifc
    public final boolean LJJJLZIJ() {
        return this.LLLI != null;
    }

    public final int kp() {
        View view = this.LLJJIJIL;
        View view2 = this.LLJJIJI;
        if (view2 == null) {
            return 0;
        }
        if (view == null) {
            return view2.getHeight();
        }
        int top = view.getTop() + view.getHeight();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view3 = (View) parent;
            while (view3 != null && view3 != view2) {
                top += view3.getTop();
                Object parent2 = view3.getParent();
                if (!(parent2 instanceof View)) {
                    break;
                }
                view3 = (View) parent2;
            }
        }
        return top;
    }

    public final float lp() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LLJJIJIIJIL;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        float f = (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) ? 0 : marginLayoutParams.topMargin;
        View view2 = this.LLJJIJIIJIL;
        return f + (view2 != null ? view2.getTranslationY() : 0.0f);
    }

    public final void mp() {
        EnterRoomConfig enterRoomConfig = this.LLLFF;
        C479170Iqh c479170Iqh = this.LLLFFI;
        this.LLLFF = null;
        this.LLLFFI = null;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLLFZ;
        if (aRunnableS107S0100000_7 != null) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS107S0100000_7);
        }
        this.LLLFZ = null;
        if (enterRoomConfig == null || c479170Iqh == null) {
            return;
        }
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "flushDeferredRoom: creating deferred room now");
        Fp(enterRoomConfig, c479170Iqh, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C19EH c19ehPu;
        Fragment fragmentLJI;
        Fragment first;
        FragmentManager parentFragmentManager;
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onDestroy");
        C478090Iox c478090Iox = (C478090Iox) this.LLLIZZ.getValue();
        if (c478090Iox != null) {
            c478090Iox.LIZLLL();
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        this.LLLFF = null;
        this.LLLFFI = null;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLLFZ;
        if (aRunnableS107S0100000_7 != null) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS107S0100000_7);
        }
        this.LLLFZ = null;
        Gp();
        ARunnableS107S0100000_7 aRunnableS107S0100000_72 = this.LLJLLIL;
        if (aRunnableS107S0100000_72 != null) {
            LinkedHashSet<Runnable> linkedHashSet = C479760Ire.LJIJJLI;
            synchronized (linkedHashSet) {
                try {
                    linkedHashSet.remove(aRunnableS107S0100000_72);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LLJLLIL = null;
        ValueAnimator valueAnimator = this.LLJLILLLLZIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJLILLLLZIIL = null;
        this.LLLL = false;
        C472280Ifa c472280Ifa = this.LLJZIJLIL;
        if (c472280Ifa != null) {
            c472280Ifa.setTouchEventInterceptor(null);
        }
        InterfaceC475300IkS interfaceC475300IkSSp = sp();
        if (interfaceC475300IkSSp != null) {
            interfaceC475300IkSSp.LJIIJ(null);
        }
        if (this.LLILZ) {
            InterfaceC475150IkD interfaceC475150IkDUp = up();
            if (interfaceC475150IkDUp == null || (c19ehPu = interfaceC475150IkDUp.Pu()) == null || !((fragmentLJI = C724240Sb0.LJI(this)) == null || (parentFragmentManager = fragmentLJI.getParentFragmentManager()) == null || !parentFragmentManager.LJL())) {
                C20441214yg.LJIIL("HangoutRoomFeedAssem", "cleanupRoomFeed: FragmentManager destroyed or transaction null, clearing reference only");
                this.LLLI = null;
                HangoutRoomFeedViewModel hangoutRoomFeedViewModelOp = op();
                C20441214yg.LIZIZ("HangoutRoomFeedVM", "clearState");
                hangoutRoomFeedViewModelOp.setState(AFwS237S0000000_7.get$arr$(283));
            } else {
                Pair<? extends Fragment, ? extends C0IEG> pair = this.LLLI;
                if (pair != null && (first = pair.getFirst()) != null) {
                    try {
                        c19ehPu.LJIIZILJ(first);
                        c19ehPu.LJIIJ();
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJFF("HangoutRoomFeedAssem", "cleanupRoomFeed: failed to remove fragment", e);
                    }
                }
                this.LLLI = null;
                HangoutRoomFeedViewModel hangoutRoomFeedViewModelOp2 = op();
                C20441214yg.LIZIZ("HangoutRoomFeedVM", "clearState");
                hangoutRoomFeedViewModelOp2.setState(AFwS237S0000000_7.get$arr$(283));
                ViewOnLayoutChangeListenerC521670Kd3 viewOnLayoutChangeListenerC521670Kd3 = this.LLJLL;
                if (viewOnLayoutChangeListenerC521670Kd3 != null) {
                    View view = this.LLJJIJI;
                    if (view != null) {
                        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC521670Kd3);
                    }
                    View view2 = this.LLJJIJIL;
                    if (view2 != null) {
                        view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC521670Kd3);
                    }
                }
                this.LLJLL = null;
                this.LLJJIJI = null;
                this.LLJJIJIL = null;
                this.LLJJIJIIJIL = null;
                this.LLJZIJLIL = null;
                C19631511rN c19631511rN = this.LLLIL;
                if (c19631511rN != null) {
                    c19631511rN.LIZIZ();
                }
                this.LLLIIIL = null;
                this.LLLIIL = null;
                this.LLLIILIL = null;
                this.LLLIL = null;
                this.LLLILZ = null;
                this.LLLII = null;
                this.LLLIIII = null;
                C20441214yg.LIZIZ("HangoutRoomFeedAssem", "cleanupRoomFeed: cleaned up");
            }
        } else {
            this.LLLI = null;
        }
        super.onDestroy();
    }

    public final HangoutRoomFeedViewModel op() {
        AssemVMLazy assemVMLazy = this.LLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIILLL;
        return (HangoutRoomFeedViewModel) assemVMLazy.getValue();
    }

    public final int tp() {
        return ((Number) this.LLJLIL.getValue()).intValue();
    }

    @Override // X.InterfaceC479210Iql
    public final void LLLLIILL() {
        C0IEG second;
        FragmentManager parentFragmentManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUnSelected, roomPageFragment=");
        sbLIZ.append(this.LLLI != null);
        sbLIZ.append(", parentFragmentManager.isDestroyed=");
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        sbLIZ.append((fragmentLJI == null || (parentFragmentManager = fragmentLJI.getParentFragmentManager()) == null) ? null : Boolean.valueOf(parentFragmentManager.LJL()));
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.LLJJJ);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
        Pair<? extends Fragment, ? extends C0IEG> pair = this.LLLI;
        int currentPosition = (pair == null || (second = pair.getSecond()) == null) ? 0 : second.getCurrentPosition();
        HangoutRoomFeedViewModel hangoutRoomFeedViewModelOp = op();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("savePosition: ");
        sbLIZ2.append(currentPosition);
        C20441214yg.LIZIZ("HangoutRoomFeedVM", C2188811AlT.LIZIZ(sbLIZ2));
        hangoutRoomFeedViewModelOp.setState(new AwS22S0001000_7(currentPosition, 2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onUnSelected: saved position=");
        sbLIZ3.append(currentPosition);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ3));
        this.LLLILZJ = false;
        C478090Iox c478090Iox = (C478090Iox) this.LLLIZZ.getValue();
        if (c478090Iox != null) {
            c478090Iox.LIZLLL();
        }
        this.LLLJ = false;
        this.LLLJIL = 0L;
        this.LLLFF = null;
        this.LLLFFI = null;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLLFZ;
        if (aRunnableS107S0100000_7 != null) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS107S0100000_7);
        }
        this.LLLFZ = null;
        Gp();
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onUnSelected: resetting global channel state for discover skylight");
        DataChannelGlobal.LLILZ.HQ2(TopLiveClearModelChannel.class, new C475540Ikq(false));
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onUnSelected: global channel state reset completed");
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        View view2 = this.LLLIIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        Bp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onCreate");
    }

    public final InterfaceC475300IkS sp() {
        Object obj = getConfig().LLILZ.get("tabRoot");
        if (obj instanceof InterfaceC475300IkS) {
            return (InterfaceC475300IkS) obj;
        }
        return null;
    }

    public final InterfaceC475150IkD up() {
        Object obj = getConfig().LLILZ.get("wrapper");
        if (obj instanceof InterfaceC475150IkD) {
            return (InterfaceC475150IkD) obj;
        }
        return null;
    }

    public final void Ap(boolean z) {
        int i;
        int i2;
        boolean z2 = this.LLJJJ;
        this.LLJJJ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onExpandStateChanged: isExpanded=");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(", isTabSelected=");
        sbLIZ.append(this.LLLILZJ);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
        boolean z3 = !z;
        View view = this.LLJJIJIIJIL;
        if (view != null && z3 != this.LLLL) {
            this.LLLL = z3;
            if (z3) {
                view.setOutlineProvider((ViewOutlineProvider) this.LLLLII.getValue());
                view.setClipToOutline(true);
            } else {
                view.setOutlineProvider(null);
                view.setClipToOutline(false);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setRoundCorner: isRounded=");
            sbLIZ2.append(z3);
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ2));
        }
        View view2 = this.LLJJIJI;
        if (view2 != null) {
            if (z) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
        View view3 = this.LLLIIIL;
        if (view3 != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view3);
        }
        if (!z) {
            C19631511rN c19631511rN = this.LLLIL;
            if (c19631511rN != null) {
                C786410Ut5.LLJJIJIIJIL(c19631511rN, 0);
            }
            C19631511rN c19631511rN2 = this.LLLIL;
            if (c19631511rN2 != null) {
                c19631511rN2.LJFF();
            }
        } else {
            C19631511rN c19631511rN3 = this.LLLIL;
            if (c19631511rN3 != null) {
                c19631511rN3.LIZIZ();
            }
            C19631511rN c19631511rN4 = this.LLLIL;
            if (c19631511rN4 != null) {
                C786410Ut5.LLJJIJIIJIL(c19631511rN4, 8);
            }
        }
        C472280Ifa c472280Ifa = this.LLJZIJLIL;
        if (c472280Ifa != null) {
            c472280Ifa.setSkylightOpen(z3);
        }
        if (!this.LLLILZJ) {
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onExpandStateChanged: tab not selected, skip posting global events");
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.HQ2(TopLiveSkylightVisibilityChannel.class, Boolean.valueOf(z3));
        dataChannelGlobal.HQ2(TopLiveClearModelChannel.class, new C475540Ikq(z3));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onExpandStateChanged: posted TopLiveClearModelChannel cleared=");
        sbLIZ3.append(z3);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ3));
        if (!z && z2) {
            dataChannelGlobal.GQ2(HangoutModuleReShowEvent.class);
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onExpandStateChanged: posted HangoutModuleReShowEvent");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ep(float r8) {
        /*
            r7 = this;
            kotlin.Pair<? extends androidx.fragment.app.Fragment, ? extends X.0IEG> r0 = r7.LLLI
            r6 = 0
            if (r0 == 0) goto L66
            java.lang.Object r0 = r0.getSecond()
            X.0IEG r0 = (X.C0IEG) r0
            if (r0 == 0) goto L66
            int r5 = r0.getCurrentPosition()
            if (r5 == 0) goto L67
            r4 = 0
        L14:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L64
            r3 = 1
        L1a:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L62
            r2 = 1
        L1f:
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting.isHotPathLogReduceOpt()
            if (r0 != 0) goto L4c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shouldAssemHandleScroll: position="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", dy="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", isExpanded="
            r1.append(r0)
            boolean r0 = r7.LLJJJ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "HangoutRoomFeedAssem"
            X.C20441214yg.LIZIZ(r0, r1)
        L4c:
            if (r2 == 0) goto L54
            boolean r0 = r7.LLJJJ
            if (r0 != 0) goto L54
        L52:
            r6 = 1
        L53:
            return r6
        L54:
            if (r4 != 0) goto L5b
            boolean r0 = r7.LLJJJ
            if (r0 == 0) goto L53
            return r6
        L5b:
            if (r3 == 0) goto L53
            boolean r0 = r7.LLJJJ
            if (r0 == 0) goto L53
            goto L52
        L62:
            r2 = 0
            goto L1f
        L64:
            r3 = 0
            goto L1a
        L66:
            r5 = 0
        L67:
            r4 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.view.HangoutRoomFeedAssem.Ep(float):boolean");
    }

    @Override // X.InterfaceC472300Ifc
    public final boolean Fh(MotionEvent motionEvent) {
        return !this.LLJJJJLIIL;
    }

    public final void Jp(long j) {
        String nickName;
        Object next;
        C479170Iqh c479170Iqh;
        Room room;
        User owner;
        ImageModel avatarThumb;
        List<String> listLIZ;
        String str;
        C479170Iqh c479170Iqh2;
        List<AbstractC479160Iqg> list = op().getState().LL;
        ArrayList arrayList = new ArrayList();
        for (AbstractC479160Iqg abstractC479160Iqg : list) {
            if (abstractC479160Iqg instanceof C479150Iqf) {
                arrayList.add(abstractC479160Iqg);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            nickName = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((C479150Iqf) next).LLILLL.LIZ == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C479150Iqf c479150Iqf = (C479150Iqf) next;
        if (c479150Iqf == null || (c479170Iqh2 = c479150Iqf.LLILLL) == null || (room = c479170Iqh2.LJFF) == null) {
            List<AbstractC479160Iqg> list2 = op().getState().LL;
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC479160Iqg abstractC479160Iqg2 : list2) {
                if (abstractC479160Iqg2 instanceof C479150Iqf) {
                    arrayList2.add(abstractC479160Iqg2);
                }
            }
            C479150Iqf c479150Iqf2 = (C479150Iqf) C13LP.LJJJLL(arrayList2);
            if (c479150Iqf2 == null || (c479170Iqh = c479150Iqf2.LLILLL) == null || (room = c479170Iqh.LJFF) == null) {
                return;
            }
        }
        SmartImageView smartImageView = this.LLLIIL;
        if (smartImageView != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null && (str = (String) C13LP.LJJJLL(listLIZ)) != null && str.length() != 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = (int) C497740JfY.LIZIZ(14.0f);
            c1331670kl3LJIIIZ.LJJI = c1331750klB.LIZ();
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        TuxTextView tuxTextView = this.LLLIILIL;
        if (tuxTextView != null) {
            tuxTextView.setText(C0KVU.LIZ(room.getOwner()));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindCollapsedHeaderData: nickName=");
        User owner2 = room.getOwner();
        if (owner2 != null) {
            nickName = owner2.getNickName();
        }
        sbLIZ.append(nickName);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC472300Ifc
    public final boolean LJJJJ(MotionEvent motionEvent) {
        View view;
        if (motionEvent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        if (this.LLJJL) {
                            this.LLJJL = false;
                            DataChannelGlobal.LLILZ.FQ2(ViewPagerScrollInterceptionGlobalEvent.class, Boolean.FALSE);
                        }
                        this.LLJJLIIIJLLLLLLLZ = false;
                        this.LLJJJJLIIL = false;
                        this.LLJL = false;
                    }
                } else {
                    float rawY = motionEvent.getRawY() - this.LLJJJJ;
                    float rawX = motionEvent.getRawX() - this.LLJJJIL;
                    if (Math.abs(rawY) > tp() || Math.abs(rawX) > tp()) {
                        C477860Ioa.LJIIIIZZ("slide", this.LLLILZLLLI);
                    }
                    if (!this.LLJJL && Math.abs(rawY) > tp() && Math.abs(rawY) > Math.abs(rawX)) {
                        this.LLJJL = true;
                        DataChannelGlobal.LLILZ.FQ2(ViewPagerScrollInterceptionGlobalEvent.class, Boolean.TRUE);
                        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onInterceptTouchEvent: vertical scroll detected, intercept ViewPager");
                    }
                    if (this.LLJJLIIIJLLLLLLLZ && (Math.abs(rawY) > tp() || Math.abs(rawX) > tp())) {
                        this.LLJJLIIIJLLLLLLLZ = false;
                        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onInterceptTouchEvent: dragging detected, foldOnUpAction cancelled");
                    }
                    if (zp(rawY, rawX)) {
                        this.LLJJLIIIJLLLLLLLZ = false;
                        this.LLJJJJLIIL = false;
                        return true;
                    }
                    if (!this.LLJJJJLIIL && ((Math.abs(rawY) > tp() || Math.abs(rawX) > tp()) && Math.abs(rawY) > Math.abs(rawX))) {
                        this.LLJJJJLIIL = Ep(rawY);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onInterceptTouchEvent: isDragging=");
                        sbLIZ.append(this.LLJJJJLIIL);
                        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } else {
                if (this.LLJJL) {
                    this.LLJJL = false;
                    DataChannelGlobal.LLILZ.FQ2(ViewPagerScrollInterceptionGlobalEvent.class, Boolean.FALSE);
                }
                if (this.LLJJLIIIJLLLLLLLZ) {
                    C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onInterceptTouchEvent: ACTION_UP, triggering expand (click-to-expand)");
                    C477860Ioa.LJIIIIZZ("click", this.LLLILZLLLI);
                    Ip(true, true);
                    this.LLJJLIIIJLLLLLLLZ = false;
                    this.LLJJJJLIIL = false;
                    this.LLJL = false;
                    return true;
                }
                this.LLJJJJLIIL = false;
                this.LLJL = false;
            }
        } else {
            this.LLJJJIL = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            this.LLJJJJ = rawY2;
            this.LLJJJJJIL = rawY2;
            this.LLJJJJLIIL = false;
            this.LLJJLIIIJLLLLLLLZ = false;
            this.LLJL = false;
            if (!this.LLJJJ && (view = this.LLJJIJIIJIL) != null && view.getVisibility() == 0) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.LLJJLIIIJLLLLLLLZ = true;
                    C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onInterceptTouchEvent: ACTION_DOWN, foldOnUpAction=true (click-to-expand)");
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onInterceptTouchEvent: ACTION_DOWN at y=");
            sbLIZ2.append(this.LLJJJJ);
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!TiktokLiveHangoutPerformanceOptSetting.isHotPathLogReduceOpt()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("hangoutRoomFeedAssem: ");
            sbLIZ3.append(this.LLJJJJLIIL);
            C20441214yg.LIZIZ("test_intercept", C2188811AlT.LIZIZ(sbLIZ3));
        }
        return this.LLJJJJLIIL;
    }

    public final void hp(int i) {
        int height;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        C472280Ifa c472280Ifa = this.LLJZIJLIL;
        if (c472280Ifa != null) {
            height = c472280Ifa.getHeight();
        } else {
            height = 0;
        }
        for (View view : C1697810uHb.LJIIJJI(this.LLJJIJIIJIL, this.LLLII, this.LLLIIIL)) {
            if (view != null) {
                C786410Ut5.ed(view, 0.0f);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    if (view != this.LLLIIIL) {
                        if (i > 0 && height > 0) {
                            i2 = height;
                        } else {
                            i2 = -1;
                        }
                        marginLayoutParams.height = i2;
                    }
                    marginLayoutParams.topMargin = i;
                    C786410Ut5.W5(view, marginLayoutParams);
                }
            }
        }
    }

    public final void ip(float f) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        for (View view : C1697810uHb.LJIIJJI(this.LLJJIJIIJIL, this.LLLII, this.LLLIIIL)) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i = marginLayoutParams.topMargin;
                } else {
                    i = 0;
                }
                C786410Ut5.ed(view, f - i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    @Override // X.InterfaceC472300Ifc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.view.HangoutRoomFeedAssem.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C472280Ifa c472280Ifa;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        SmartImageView smartImageView;
        TuxTextView tuxTextView;
        C19631511rN c19631511rN;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        View viewFindViewById7;
        Pair pairLJ;
        C479450Ir9 c479450Ir9;
        C479450Ir9 c479450Ir92;
        View viewFindViewById8;
        super.onViewCreated(view);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onViewCreated");
        ViewParent parent = LJJIJL().getParent();
        Integer numValueOf = null;
        if (parent instanceof C472280Ifa) {
            c472280Ifa = (C472280Ifa) parent;
        } else {
            c472280Ifa = null;
        }
        this.LLJZIJLIL = c472280Ifa;
        if (c472280Ifa != null) {
            c472280Ifa.setPageContainer(1);
        }
        InterfaceC475300IkS interfaceC475300IkSSp = sp();
        if (interfaceC475300IkSSp != null) {
            interfaceC475300IkSSp.LJIIJ(this.LLJZIJLIL);
        }
        C472280Ifa c472280Ifa2 = this.LLJZIJLIL;
        if (c472280Ifa2 != null) {
            viewFindViewById = c472280Ifa2.findViewById(R.id.ybo);
        } else {
            viewFindViewById = null;
        }
        this.LLJJIJI = viewFindViewById;
        this.LLJJIJIIJIL = LJJIJL();
        C472280Ifa c472280Ifa3 = this.LLJZIJLIL;
        if (c472280Ifa3 != null) {
            viewFindViewById2 = c472280Ifa3.findViewById(R.id.oag);
        } else {
            viewFindViewById2 = null;
        }
        this.LLJJIJIL = viewFindViewById2;
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        C472280Ifa c472280Ifa4 = this.LLJZIJLIL;
        if (c472280Ifa4 != null && (viewFindViewById8 = c472280Ifa4.findViewById(R.id.n3v)) != null) {
            viewFindViewById8.setId(this.LLJJIII);
        }
        C472280Ifa c472280Ifa5 = this.LLJZIJLIL;
        if (c472280Ifa5 != null) {
            c472280Ifa5.setTouchEventInterceptor(this);
        }
        C472280Ifa c472280Ifa6 = this.LLJZIJLIL;
        if (c472280Ifa6 != null) {
            viewFindViewById3 = c472280Ifa6.findViewById(R.id.e67);
        } else {
            viewFindViewById3 = null;
        }
        this.LLLIIIL = viewFindViewById3;
        if (viewFindViewById3 != null) {
            smartImageView = (SmartImageView) viewFindViewById3.findViewById(R.id.lce);
        } else {
            smartImageView = null;
        }
        this.LLLIIL = smartImageView;
        View view3 = this.LLLIIIL;
        if (view3 != null) {
            tuxTextView = (TuxTextView) view3.findViewById(R.id.zeb);
        } else {
            tuxTextView = null;
        }
        this.LLLIILIL = tuxTextView;
        View view4 = this.LLLIIIL;
        if (view4 != null && (c19631511rN = (C19631511rN) view4.findViewById(R.id.lcf)) != null) {
            c19631511rN.LIZJ(EnumC21569519bB.LIVE_PREVIEW_LIVING_ICON_NEW);
        } else {
            c19631511rN = null;
        }
        this.LLLIL = c19631511rN;
        View view5 = this.LLLIIIL;
        if (view5 != null) {
            viewFindViewById4 = view5.findViewById(R.id.coz);
        } else {
            viewFindViewById4 = null;
        }
        this.LLLILZ = viewFindViewById4;
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 215), viewFindViewById4);
        }
        C472280Ifa c472280Ifa7 = this.LLJZIJLIL;
        if (c472280Ifa7 != null) {
            viewFindViewById5 = c472280Ifa7.findViewById(R.id.hll);
        } else {
            viewFindViewById5 = null;
        }
        this.LLLII = viewFindViewById5;
        C472280Ifa c472280Ifa8 = this.LLJZIJLIL;
        if (c472280Ifa8 != null) {
            viewFindViewById6 = c472280Ifa8.findViewById(R.id.hly);
        } else {
            viewFindViewById6 = null;
        }
        this.LLLIIII = viewFindViewById6;
        C472280Ifa c472280Ifa9 = this.LLJZIJLIL;
        if (c472280Ifa9 != null) {
            viewFindViewById7 = c472280Ifa9.findViewById(R.id.hli);
        } else {
            viewFindViewById7 = null;
        }
        this.LLLIIIIL = viewFindViewById7;
        this.LLJJJ = false;
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        ViewOnLayoutChangeListenerC521670Kd3 viewOnLayoutChangeListenerC521670Kd3 = new ViewOnLayoutChangeListenerC521670Kd3(c118300cf, this, 2);
        this.LLJLL = viewOnLayoutChangeListenerC521670Kd3;
        View view6 = this.LLJJIJI;
        if (view6 != null) {
            view6.addOnLayoutChangeListener(viewOnLayoutChangeListenerC521670Kd3);
        }
        View view7 = this.LLJJIJIL;
        if (view7 != null) {
            view7.addOnLayoutChangeListener(this.LLJLL);
        }
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 186);
        LinkedHashSet<Runnable> linkedHashSet = C479760Ire.LJIJJLI;
        synchronized (linkedHashSet) {
            try {
                linkedHashSet.add(aRunnableS107S0100000_7);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJLLIL = aRunnableS107S0100000_7;
        HangoutRoomFeedViewModel hangoutRoomFeedViewModelOp = op();
        TiktokLiveTopLiveArchitectureOptSetting tiktokLiveTopLiveArchitectureOptSetting = TiktokLiveTopLiveArchitectureOptSetting.INSTANCE;
        if (tiktokLiveTopLiveArchitectureOptSetting.isArchOpt()) {
            C478590Ipl c478590Ipl = C478590Ipl.LIZ;
            pairLJ = C478590Ipl.LJ();
        } else {
            C478920IqI.LIZ.getClass();
            pairLJ = C478920IqI.LJ("tryPreRenderInstantDisplay");
        }
        List list = (List) pairLJ.getSecond();
        boolean zBooleanValue = ((Boolean) pairLJ.getFirst()).booleanValue();
        if (C500260Jjc.LJJIJIIJI(list) && !zBooleanValue) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Using cached play feed data with ");
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(" items");
            C20441214yg.LIZIZ("HangoutRoomFeedVM", C2188811AlT.LIZIZ(sbLIZ));
            if (tiktokLiveTopLiveArchitectureOptSetting.isArchOpt()) {
                C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
                if (c479440Ir8 != null && (c479450Ir92 = c479440Ir8.LIZIZ) != null) {
                    c479450Ir92.LIZIZ(System.currentTimeMillis(), "HangoutRoomFeedVM#tryPreRenderInstantDisplay");
                }
                C479440Ir8 c479440Ir82 = C478750Iq1.LIZ;
                if (c479440Ir82 != null && (c479450Ir9 = c479440Ir82.LIZIZ) != null) {
                    c479450Ir9.LJII = "cached";
                }
            }
            hangoutRoomFeedViewModelOp.setState(new AwS586S0100000_7(list, (List<GameDrawerCategory>) 419));
        } else {
            op().xQ2(EnumC479370Ir1.INIT, "landing_init", true);
        }
        AssemVMLazy assemVMLazy = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIILLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Iqa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C479080IqY) obj).LL);
            }
        }, null, new AwS621S0100000_7(this, 74), 6);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0Iqc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478820Iq8) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 75), 6);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0Iqb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C478820Iq8) obj).LLILLL);
            }
        }, null, new AwS621S0100000_7(this, 76), 6);
        DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveSkylightEntranceEvent.class, this.LLLLIIL);
        DataChannelGlobal.LLILZ.BQ2(this, this, LiveRoomPageChangeEvent.class, this.LLLLIILL);
        DataChannelGlobal.LLILZ.BQ2(this, this, HangoutRoomFeedCleanupEvent.class, new AwS586S0100000_7(this, 402));
    }

    public final void Ip(final boolean z, boolean z2) {
        final float f;
        View view;
        View view2;
        if (this.LLJJIJIIJIL == null) {
            return;
        }
        int iKp = kp();
        if (iKp == 0 && !z) {
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "triggerExpand: anchor=0 and collapse requested, waiting for layout");
            return;
        }
        float fLp = lp();
        if (z) {
            f = 0.0f;
        } else {
            f = iKp;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerExpand: expand=");
        sbLIZ.append(z);
        sbLIZ.append(", start=");
        sbLIZ.append(fLp);
        sbLIZ.append(", end=");
        sbLIZ.append(f);
        sbLIZ.append(", anchor=");
        sbLIZ.append(iKp);
        sbLIZ.append(", withAnim=");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (z && (view2 = this.LLLIIIL) != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        if (!z && (view = this.LLJJIJI) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (!z2) {
            hp((int) f);
            Ap(z);
            return;
        }
        ValueAnimator valueAnimator = this.LLJLILLLLZIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final C013C c013c = new C013C();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fLp, f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 9));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0IqZ
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                c013c.element = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (c013c.element) {
                    return;
                }
                this.hp((int) f);
                this.Ap(z);
            }
        });
        valueAnimatorOfFloat.start();
        this.LLJLILLLLZIIL = valueAnimatorOfFloat;
    }

    @Override // X.InterfaceC479210Iql
    public final void u(boolean z, boolean z2) {
        C479450Ir9 c479450Ir9;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelected: isFirstEnter=");
        sbLIZ.append(z);
        sbLIZ.append(", hasInitTopTab=");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLILZJ = true;
        this.LLLILZLLLI = z2;
        if (!this.LLLJ) {
            this.LLLJ = true;
            this.LLLJIL = System.currentTimeMillis();
            C478090Iox c478090Iox = (C478090Iox) this.LLLIZZ.getValue();
            if (c478090Iox != null) {
                c478090Iox.LJ(4000L);
            }
        }
        if (MultiGuestTopLivePreloadConfigSetting.getValue().feedDataTimeoutThreshold > 0 && C478950IqL.LIZ()) {
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "onSelected: data expired, refreshing");
            C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
            if (c479440Ir8 != null && (c479450Ir9 = c479440Ir8.LIZIZ) != null) {
                c479450Ir9.LJII = "expired";
            }
            op().xQ2(EnumC479370Ir1.INIT, "timeout_refresh", true);
            return;
        }
        List<AbstractC479160Iqg> list = op().getState().LL;
        if (true ^ list.isEmpty()) {
            yp(list, op().getState().LLILLJJLI);
        }
        if (z) {
            HangoutRoomFeedViewModel hangoutRoomFeedViewModelOp = op();
            C23250099c.LIZLLL(hangoutRoomFeedViewModelOp.getAssemVMScope(), C0PEM.LIZJ, null, new C478760Iq2(hangoutRoomFeedViewModelOp, null), 2);
        }
    }

    public final void yp(List<? extends AbstractC479160Iqg> list, FeedExtra feedExtra) {
        C479170Iqh c479170Iqh;
        EnterRoomConfig enterRoomConfigNY;
        Room room;
        Long lValueOf;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.LogData logData;
        C479150Iqf c479150Iqf;
        if (this.LLLI != null) {
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "handleDataReady: roomPageFragment already exists, skip");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC479160Iqg abstractC479160Iqg : list) {
            if (abstractC479160Iqg instanceof C479150Iqf) {
                arrayList.add(abstractC479160Iqg);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            FeedItem feedItem = ((C479150Iqf) it2.next()).LLILLL.LJIIJJI;
            if (feedItem != null) {
                arrayList2.add(feedItem);
            }
        }
        if (arrayList2.isEmpty() && (!list.isEmpty())) {
            C20441214yg.LJIIL("HangoutRoomFeedAssem", "handleDataReady: feedItems is empty but items exist, refreshing data");
            op().xQ2(EnumC479370Ir1.INIT, "landing_init", true);
            return;
        }
        if (arrayList2.isEmpty()) {
            C20441214yg.LJIIL("HangoutRoomFeedAssem", "handleDataReady: feedItems is empty");
            return;
        }
        int i = op().getState().LLILZ;
        if (i > 0 && i < list.size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleDataReady: restoring to saved position ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            i = 0;
        }
        Object obj = ListProtector.get(list, i);
        if (!(obj instanceof C479150Iqf) || (c479150Iqf = (C479150Iqf) obj) == null || (c479170Iqh = c479150Iqf.LLILLL) == null) {
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC479160Iqg abstractC479160Iqg2 : list) {
                if (abstractC479160Iqg2 instanceof C479150Iqf) {
                    arrayList3.add(abstractC479160Iqg2);
                }
            }
            C479150Iqf c479150Iqf2 = (C479150Iqf) C13LP.LJJJLL(arrayList3);
            if (c479150Iqf2 != null) {
                c479170Iqh = c479150Iqf2.LLILLL;
            } else {
                return;
            }
        }
        this.LLLLIIIILLL = arrayList2;
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService != null && (enterRoomConfigNY = iLiveFeedApiService.nY(i, arrayList2, feedExtra)) != null) {
            EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
            if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (logData = enterRoomConfig.mLogData) != null) {
                String str = enterRoomConfigNY.mLogData.liveTabSource;
                if (str == null || str.length() == 0) {
                    enterRoomConfigNY.mLogData.liveTabSource = logData.liveTabSource;
                }
                String str2 = enterRoomConfigNY.mLogData.topLiveSource;
                if (str2 == null || str2.length() == 0) {
                    enterRoomConfigNY.mLogData.topLiveSource = logData.topLiveSource;
                }
            }
            EnterRoomConfig.RoomsData roomsData = enterRoomConfigNY.mRoomsData;
            roomsData.enterFromMerge = "live_merge";
            roomsData.enterMethod = "hangout_live_cell_all";
            roomsData.hangoutEnterSource = "feed_room";
            ArrayList<EnterRoomConfig> arrayList4 = enterRoomConfigNY.mLogData.moreConfig;
            if (arrayList4 != null) {
                Iterator<EnterRoomConfig> it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    it3.next().mRoomsData.hangoutEnterSource = "feed_room";
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                InterfaceC468260IXw interfaceC468260IXw = ((FeedItem) it4.next()).item;
                if ((interfaceC468260IXw instanceof Room) && (room = (Room) interfaceC468260IXw) != null && (lValueOf = Long.valueOf(room.getId())) != null) {
                    arrayList5.add(lValueOf);
                }
            }
            long[] jArrLLIIIILZ = C13LP.LLIIIILZ(arrayList5);
            enterRoomConfigNY.mRoomsData.roomIds = jArrLLIIIILZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleDataReady: showing room fragment, roomId=");
            sbLIZ2.append(enterRoomConfigNY.mRoomsData.roomId);
            sbLIZ2.append(", roomIds.size=");
            sbLIZ2.append(jArrLLIIIILZ.length);
            sbLIZ2.append(", startIndex=");
            sbLIZ2.append(i);
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ2));
            Fp(enterRoomConfigNY, c479170Iqh, false);
            return;
        }
        C20441214yg.LJ("HangoutRoomFeedAssem", "handleDataReady: buildConfigWithFeedItems returned null");
    }

    public final boolean zp(float f, float f2) {
        if (this.LLJL) {
            return true;
        }
        if (this.LLJJJ || f <= tp() || Math.abs(f) <= Math.abs(f2)) {
            return false;
        }
        this.LLJL = true;
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", "maybeExpandOnDownDrag: collapsed down-drag detected, expanding to fullscreen");
        Ip(true, true);
        return true;
    }

    public final void Fp(EnterRoomConfig enterRoomConfig, C479170Iqh c479170Iqh, boolean z) {
        Integer numValueOf;
        User owner;
        long id;
        Long lValueOf;
        String requestId;
        Integer numValueOf2;
        String str;
        Map<String, String> map;
        C479450Ir9 c479450Ir9;
        Fragment first;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        if (!this.LLILZ) {
            C20441214yg.LJIIL("HangoutRoomFeedAssem", "showRoomFragment: view not valid, skip");
            return;
        }
        if (this.LLLI != null) {
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "showRoomFragment: already exists, skip");
            return;
        }
        if (!this.LLLILZJ) {
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "showRoomFragment: tab not selected, skip");
            return;
        }
        if (!z && HangoutTopliveNewUserGuideEnableSetting.INSTANCE.value() == 1) {
            boolean z2 = C479760Ire.LJIJI;
            if (C479140Iqe.LIZ()) {
                AssemVMLazy assemVMLazy = this.LLLF;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIILLL;
                if (!((C479080IqY) assemVMLazy.getValue().getState()).LL) {
                    this.LLLFF = enterRoomConfig;
                    this.LLLFFI = c479170Iqh;
                    if (this.LLLFZ == null) {
                        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 185);
                        this.LLLFZ = aRunnableS107S0100000_7;
                        HandlerHook.viewPostDelay(LJJIJL(), aRunnableS107S0100000_7, 2000L);
                    }
                    C20441214yg.LIZIZ("HangoutRoomFeedAssem", "showRoomFragment: defer creation until interact positioned (guide active)");
                    return;
                }
            }
        }
        InterfaceC475300IkS interfaceC475300IkSSp = sp();
        InterfaceC475150IkD interfaceC475150IkDUp = up();
        if (interfaceC475300IkSSp == null) {
            C20441214yg.LJIIL("HangoutRoomFeedAssem", "showRoomFragment: tabRoot is null, skip");
            return;
        }
        if (interfaceC475150IkDUp == null) {
            C20441214yg.LJIIL("HangoutRoomFeedAssem", "showRoomFragment: wrapper is null, skip");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showRoomFragment: creating room fragment, roomId=");
        sbLIZ.append(enterRoomConfig.mRoomsData.roomId);
        C20441214yg.LIZIZ("HangoutRoomFeedAssem", C2188811AlT.LIZIZ(sbLIZ));
        Room room = c479170Iqh.LJFF;
        if (room != null) {
            numValueOf = Integer.valueOf(C477860Ioa.LIZ(room));
        } else {
            numValueOf = null;
        }
        Room room2 = c479170Iqh.LJFF;
        if (room2 != null && room2.getOwnerUserId() > 0) {
            Room room3 = c479170Iqh.LJFF;
            if (room3 != null) {
                id = room3.getOwnerUserId();
                lValueOf = Long.valueOf(id);
            }
            lValueOf = null;
        } else {
            Room room4 = c479170Iqh.LJFF;
            if (room4 != null && (owner = room4.getOwner()) != null) {
                id = owner.getId();
                lValueOf = Long.valueOf(id);
            }
            lValueOf = null;
        }
        Long lValueOf2 = Long.valueOf(c479170Iqh.LIZ);
        Room room5 = c479170Iqh.LJFF;
        if (room5 != null) {
            requestId = room5.getRequestId();
        } else {
            requestId = null;
        }
        Room room6 = c479170Iqh.LJFF;
        if (room6 != null) {
            numValueOf2 = Integer.valueOf(room6.getUserCount());
        } else {
            numValueOf2 = null;
        }
        CardTag cardTag = c479170Iqh.LIZLLL;
        if (cardTag != null) {
            str = cardTag.text;
        } else {
            str = null;
        }
        String str2 = c479170Iqh.LIZIZ;
        Room room7 = c479170Iqh.LJFF;
        if (room7 != null && (multiLiveUserSettings = room7.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null) {
            map = multiLiveUserApplySettings.extraInfo;
        } else {
            map = null;
        }
        C477870Iob c477870Iob = new C477870Iob("play_card_feed", "live_cell", "hangout_live_cell_all", numValueOf, 1, lValueOf, lValueOf2, requestId, numValueOf2, "hangout_live_cell_all", str, str2, 1, "showRoomFragment", map);
        C477860Ioa.LJIIJ(c477870Iob, null);
        C477860Ioa.LJIIIZ(c477870Iob, null, null, 6);
        try {
            C0IL2.LIZ.LIZLLL(new EnterRoomLinkSession(enterRoomConfig));
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            View view = this.LLLII;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "hideFallbackView: fallback view hidden");
            interfaceC475300IkSSp.LJIIJ(this.LLJZIJLIL);
            interfaceC475300IkSSp.LJII(this.LLJJIII);
            this.LLLI = interfaceC475300IkSSp.LJIIZILJ(enterRoomConfig);
            interfaceC475300IkSSp.LJFF();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Boolean bool = Boolean.TRUE;
            dataChannelGlobal.HQ2(TopLiveSkylightVisibilityChannel.class, bool);
            dataChannelGlobal.HQ2(TopLiveClearModelChannel.class, new C475540Ikq(true));
            C19EH c19ehPu = interfaceC475150IkDUp.Pu();
            Pair<? extends Fragment, ? extends C0IEG> pair = this.LLLI;
            if (pair != null && (first = pair.getFirst()) != null) {
                if (c19ehPu != null) {
                    c19ehPu.LJIJ(R.id.iiv, first, null);
                    c19ehPu.LJIIL();
                }
                C20441214yg.LIZIZ("HangoutRoomFeedAssem", "showRoomFragment: fragment committed");
                Jp(enterRoomConfig.mRoomsData.roomId);
                if (this.LLLILZJ) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.LLLJIL >= 1000) {
                        this.LLLJIL = jCurrentTimeMillis;
                        C478090Iox c478090Iox = (C478090Iox) this.LLLIZZ.getValue();
                        if (c478090Iox != null) {
                            c478090Iox.LJ(4000L);
                        }
                    }
                }
            }
            Ip(false, false);
            if (!Intrinsics.LJFF(op().LL.getValue(), bool)) {
                op().LL.setValue(bool);
            }
            C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
            if (c479440Ir8 != null && (c479450Ir9 = c479440Ir8.LIZIZ) != null) {
                c479450Ir9.LIZJ(System.currentTimeMillis());
            }
            View view2 = this.LLJJIJIIJIL;
            if (view2 != null && view2.getVisibility() == 0) {
                return;
            }
            View view3 = this.LLJJIJIIJIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            C20441214yg.LIZIZ("HangoutRoomFeedAssem", "showRoomFragment: fallback set fragmentContainer VISIBLE");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("HangoutRoomFeedAssem", "showRoomFragment: failed to create room fragment", e);
            this.LLLI = null;
        }
    }
}
