package com.ss.android.ugc.aweme.feed.assem.music;

import X.AnonymousClass0723;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C0A07;
import X.C0GY9;
import X.C0H1U;
import X.C0HCN;
import X.C0HHT;
import X.C0RD6;
import X.C0RDX;
import X.C0RGG;
import X.C0RQZ;
import X.C0RRD;
import X.C0SVP;
import X.C1017070cZd;
import X.C1398490mUp;
import X.C1398900mVU;
import X.C1398910mVV;
import X.C1398920mVW;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1744700vVE;
import X.C1785006yu;
import X.C1827607Du;
import X.C1865880yeg;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19K8;
import X.C1A9R;
import X.C1A9W;
import X.C1A9X;
import X.C1AV2;
import X.C1AV3;
import X.C1D92;
import X.C20329414ge;
import X.C2041907zF;
import X.C2097908Jt;
import X.C21158717r7;
import X.C21387418mu;
import X.C2174681A9a;
import X.C2174691A9b;
import X.C2174701A9c;
import X.C2174721A9e;
import X.C2174731A9f;
import X.C2174741A9g;
import X.C2174761A9i;
import X.C2180521AVm;
import X.C2217381BqS;
import X.C23250099c;
import X.C2487409ou;
import X.C268880AgI;
import X.C277080AtW;
import X.C283710BAb;
import X.C288460BSi;
import X.C302070Bsj;
import X.C337180DJs;
import X.C341940Daq;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C452501pT;
import X.C586380MzE;
import X.C592510NLt;
import X.C592530NLv;
import X.C612110Nzd;
import X.C694180RKu;
import X.C695540RQa;
import X.C695550RQb;
import X.C699500RcC;
import X.C700450Rdj;
import X.C714060Rzg;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C732110Snh;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.EnumC655500PnQ;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565640qqQ;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC497601wk;
import X.InterfaceC695440RPq;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC709040Rra;
import X.InterfaceC718610SGt;
import X.RunnableC21164417s2;
import X.RunnableC21367318jf;
import Y.ACListenerS167S0100000_33;
import Y.ALAdapterS11S0200000_16;
import Y.ALAdapterS27S0100000_33;
import Y.ALAdapterS6S0101000_33;
import Y.ALAdapterS6S0200000_9;
import Y.ALAdapterS7S0110000_21;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS132S0100000_32;
import Y.AUListenerS261S0100000_11;
import Y.AUListenerS265S0100000_16;
import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes34.dex */
public class VideoMusicCoverAssem extends BaseMusicCoverAssem<VideoMusicCoverAssem> implements InteractRightMenuMusicCoverAbility, InterfaceC695440RPq, ComponentPriorityProtocol, InterfaceC1565640qqQ, FcpStandardPreloadProtocol, InterfaceC1554640qYg {
    public static final C592530NLv LLLLZLLLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZ;
    public static final C01GW<InterfaceC497601wk> LLLZI;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new C0RRD(this));
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public C427870Gq9 LLLI;
    public C427870Gq9 LLLII;
    public C1D92 LLLIIII;
    public C21387418mu LLLIIIIL;
    public FrameLayout LLLIIIL;
    public TuxIconView LLLIIL;
    public View LLLIILIL;
    public FrameLayout LLLIL;
    public FrameLayout LLLILZ;
    public FrameLayout LLLILZJ;
    public RelativeLayout LLLILZLLLI;
    public C1A9R LLLIZZ;
    public final List<Animator> LLLJ;
    public ValueAnimator LLLJIL;
    public final boolean LLLJL;
    public boolean LLLL;
    public C20329414ge LLLLII;
    public long LLLLIIIILLL;
    public final double LLLLIIL;
    public final double LLLLIILL;
    public final int LLLLIILLL;
    public int LLLLIL;
    public TuxTextView LLLLILI;
    public FrameLayout LLLLJ;
    public boolean LLLLJI;
    public AnimatorSet LLLLL;
    public AnimatorSet LLLLLIL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public FrameLayout LLLLLJLJLL;
    public FrameLayout LLLLLL;
    public ImageView LLLLLLIL;
    public TuxTextView LLLLLLJ;
    public TuxIconView LLLLLLL;
    public boolean LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public String LLLLLLLZIL;
    public ARunnableS132S0100000_32 LLLLLLZ;
    public ARunnableS132S0100000_32 LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public boolean LLLLLZL;
    public boolean LLLLZ;
    public RunnableC21367318jf LLLLZI;
    public RunnableC21164417s2 LLLLZIL;
    public boolean LLLLZLL;
    public boolean LLLLZLLIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0NLv] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoMusicCoverAssem.class, "musicCoverVM", "getMusicCoverVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicCoverVM;", 0);
        C13LE.LIZ.getClass();
        LLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(VideoMusicCoverAssem.class, "recordMuteVM", "getRecordMuteVM()Lcom/ss/android/ugc/aweme/feed/assem/music/RecordMuteVM;", 0), new C2217381BqS(VideoMusicCoverAssem.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0)};
        LLLLZLLLI = new Object() { // from class: X.0NLv
        };
        LLLZI = C452501pT.LIZIZ(new C592510NLt());
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.18jf] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.17s2] */
    public VideoMusicCoverAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoMusicCoverVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new C0RQZ(c19719912DlLIZ), null, new C2174721A9e());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RecordMuteVM.class);
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C695540RQa(c19719912DlLIZ2), null, new C2174681A9a());
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new C695550RQb(c19719912DlLIZ3), null, new C2174731A9f());
        this.LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C2174691A9b());
        this.LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C2174701A9c());
        this.LLLJ = new ArrayList();
        this.LLLJL = C2174761A9i.LIZIZ();
        this.LLLLIIL = 49.0d;
        this.LLLLIILL = 27.0d;
        this.LLLLIILLL = 64;
        this.LLLLIL = Integer.MIN_VALUE;
        this.LLLLLLLLL = C2174741A9g.LIZIZ.LJIILJJIL();
        this.LLLLLZIL = true;
        this.LLLLLZL = true;
        this.LLLLZI = new Runnable() { // from class: X.18jf
            public final void LIZ() {
                C20329414ge c20329414ge;
                C19K7 c19k7;
                FrameLayout frameLayout;
                ValueAnimator valueAnimator;
                VideoMusicCoverAssem videoMusicCoverAssem = this.LL;
                if (videoMusicCoverAssem.LLLIL == null || videoMusicCoverAssem.LLLLZLL) {
                    return;
                }
                videoMusicCoverAssem.LLLLZLL = true;
                if (videoMusicCoverAssem.LLLJIL != null) {
                    if (!C283710BAb.LIZ() && (valueAnimator = this.LL.LLLJIL) != null) {
                        valueAnimator.end();
                    }
                    if (AnonymousClass0723.LIZ()) {
                        C19K8.LIZ(this.LL.LLLLII);
                    }
                } else {
                    ValueAnimator valueAnimatorOfFloat = (C638120P1e.LIZ.needFixCoverAnim && C444960Hcc.LIZIZ()) ? ValueAnimator.ofFloat(360.0f, 0.0f) : ValueAnimator.ofFloat(0.0f, 360.0f);
                    videoMusicCoverAssem.LLLJIL = valueAnimatorOfFloat;
                    VideoMusicCoverAssem videoMusicCoverAssem2 = this.LL;
                    ValueAnimator valueAnimator2 = videoMusicCoverAssem2.LLLJIL;
                    if (!((ArrayList) videoMusicCoverAssem2.LLLJ).contains(valueAnimator2)) {
                        ((ArrayList) videoMusicCoverAssem2.LLLJ).add(valueAnimator2);
                    }
                    ValueAnimator valueAnimator3 = this.LL.LLLJIL;
                    if (valueAnimator3 != null) {
                        C01GW c01gw = C0BAA.LIZ;
                        valueAnimator3.setDuration(((Number) c01gw.getValue()).intValue() > 0 ? ((long) ((Number) c01gw.getValue()).intValue()) * 1000 : 8000L);
                    }
                    ValueAnimator valueAnimator4 = this.LL.LLLJIL;
                    if (valueAnimator4 != null) {
                        valueAnimator4.setRepeatMode(1);
                    }
                    ValueAnimator valueAnimator5 = this.LL.LLLJIL;
                    if (valueAnimator5 != null) {
                        valueAnimator5.setInterpolator(new LinearInterpolator());
                    }
                    ValueAnimator valueAnimator6 = this.LL.LLLJIL;
                    if (valueAnimator6 != null) {
                        valueAnimator6.setRepeatCount(-1);
                    }
                    if (AnonymousClass0723.LIZ()) {
                        VideoMusicCoverAssem videoMusicCoverAssem3 = this.LL;
                        VideoMusicCoverAssem videoMusicCoverAssem4 = this.LL;
                        videoMusicCoverAssem3.LLLLII = new C20329414ge(videoMusicCoverAssem4.LLLIL);
                        ValueAnimator valueAnimator7 = videoMusicCoverAssem4.LLLJIL;
                        if (valueAnimator7 != null) {
                            VideoMusicCoverAssem.Jp(videoMusicCoverAssem4.LLLLII, valueAnimator7);
                        }
                    } else {
                        VideoMusicCoverAssem videoMusicCoverAssem5 = this.LL;
                        ValueAnimator valueAnimator8 = videoMusicCoverAssem5.LLLJIL;
                        if (valueAnimator8 != null) {
                            AUListenerS279S0100000_32 aUListenerS279S0100000_32 = new AUListenerS279S0100000_32(videoMusicCoverAssem5, 10);
                            videoMusicCoverAssem5.getClass();
                            VideoMusicCoverAssem.Jp(aUListenerS279S0100000_32, valueAnimator8);
                        }
                    }
                }
                VideoMusicCoverAssem videoMusicCoverAssem6 = this.LL;
                ValueAnimator valueAnimator9 = videoMusicCoverAssem6.LLLJIL;
                if (valueAnimator9 != null && (frameLayout = videoMusicCoverAssem6.LLLIL) != null) {
                    if (C283710BAb.LIZ() && valueAnimator9.isStarted()) {
                        valueAnimator9.resume();
                    } else {
                        C21367418jg.LIZ("musicCoverDegrade", valueAnimator9, frameLayout);
                    }
                }
                if (!AnonymousClass0723.LIZ() || (c20329414ge = this.LL.LLLLII) == null || (c19k7 = (C19K7) C19K8.LIZ.getValue()) == null) {
                    return;
                }
                c19k7.LIZ(c20329414ge);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoMusicCoverAssem@aa4.musicCoverInnerContainerAnimRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoMusicCoverAssem@aa4.musicCoverInnerContainerAnimRunnable$1");
            }
        };
        this.LLLLZIL = new Runnable() { // from class: X.17s2
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoMusicCoverAssem@aa4.notesLayoutAnimRunnable$1");
                try {
                    VideoMusicCoverAssem videoMusicCoverAssem = this.LL;
                    if (!videoMusicCoverAssem.LLLLZLLIL) {
                        videoMusicCoverAssem.LLLLZLLIL = true;
                        final C21387418mu c21387418mu = videoMusicCoverAssem.LLLIIIIL;
                        if (c21387418mu != null) {
                            C20595415iS.LIZ(new InterfaceC20595515iT() { // from class: X.18Jy
                                public final /* synthetic */ int LIZ = LivePreCreateNextRoomPlayer.ENABLE;
                                public final /* synthetic */ int LIZIZ = 800;

                                @Override // X.InterfaceC20595515iT
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC20595515iT
                                public final void LIZIZ() {
                                    C21387418mu c21387418mu2 = c21387418mu;
                                    c21387418mu2.LLJI = this.LIZ;
                                    c21387418mu2.LLJ = this.LIZIZ;
                                    c21387418mu2.LLJIJIL.removeCallbacksAndMessages(null);
                                    C786410Ut5.LJLIIL(c21387418mu2.LLILZIL.nextInt(4) * 100, c21387418mu2.LLJIJIL, c21387418mu2.LLJILJIL);
                                }
                            });
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoMusicCoverAssem@aa4.notesLayoutAnimRunnable$1");
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final void Bs2(InterfaceC709040Rra interfaceC709040Rra, int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_music_cover";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final Rect Hs2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9s;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Rect Zl() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Drawable bf2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final int[] cB1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Pair<Integer, Integer> nQ2() {
        return null;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1856293165) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final View y9() {
        return null;
    }

    public final void Aq() {
        if (((Number) C268880AgI.LIZ.getValue()).intValue() == 1) {
            TuxIconView tuxIconView = this.LLLIIL;
            if (tuxIconView != null) {
                C337180DJs.LIZJ(tuxIconView);
            }
        } else {
            TuxIconView tuxIconView2 = this.LLLIIL;
            if (tuxIconView2 != null) {
                C337180DJs.LIZ(tuxIconView2);
            }
        }
        C01GW c01gw = C0A07.LIZ;
        if (((Number) c01gw.getValue()).floatValue() <= 0.0f) {
            View view = this.LLLIILIL;
            if (view != null) {
                C337180DJs.LIZ(view);
                return;
            }
            return;
        }
        View view2 = this.LLLIILIL;
        if (view2 != null) {
            C337180DJs.LIZJ(view2);
        }
        View view3 = this.LLLIILIL;
        if (view3 != null) {
            C786410Ut5.T4(view3, ((Number) c01gw.getValue()).floatValue());
        }
    }

    public final void Qp() {
        C427870Gq9 c427870Gq9 = this.LLLII;
        if (c427870Gq9 != null) {
            C337180DJs.LIZJ(c427870Gq9);
        }
        C427870Gq9 c427870Gq92 = this.LLLII;
        boolean zLJI = MethodIDManager.LJI(71716);
        if (c427870Gq92 != null) {
            C337180DJs.LIZJ(c427870Gq92);
        }
        C1D92 c1d92 = this.LLLIIII;
        if (c1d92 != null) {
            C337180DJs.LIZ(c1d92);
        }
        C1398920mVW c1398920mVW = new C1398920mVW(c427870Gq92);
        if (C1827607Du.LJ(new C1865880yeg(), C1785006yu.LIZJ())) {
            C823050WQl.LIZJ().execute(new ARunnableS109S0100000_9(c1398920mVW, 43));
        } else {
            c1398920mVW.invoke();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void Up() {
        AnimatorSet animatorSet = this.LLLLL;
        if ((animatorSet == null || !animatorSet.isRunning()) && !this.LLLLJI) {
            return;
        }
        this.LLLLLILLIL = true;
        this.LLLLLJIL = true;
        AnimatorSet animatorSet2 = this.LLLLL;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        AnimatorSet animatorSet3 = this.LLLLL;
        if (animatorSet3 != null) {
            animatorSet3.end();
        }
        wq(false);
    }

    public final VideoViewModel Xp() {
        return (VideoViewModel) this.LLLFFI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        return C2097908Jt.LIZJ(new Pair(MusicPreloadTask.class, new AwS553S0100000_9(this, 130)));
    }

    public final VideoMusicCoverVM aq() {
        return (VideoMusicCoverVM) this.LLL.getValue(this, LLLZ[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        LLLLZLLLI.getClass();
        C23250099c.LIZLLL(LLLZI.getValue(), null, null, new C21158717r7(this, null), 3);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        if (((Boolean) C277080AtW.LIZ.getValue()).booleanValue()) {
            if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS132S0100000_32(this, 34));
            } else {
                vq();
                tq();
            }
        }
    }

    public final C1A9R dq() {
        if (this.LLLIZZ == null) {
            this.LLLIZZ = new C1A9R();
        }
        C1A9R c1a9r = this.LLLIZZ;
        if (c1a9r == null) {
            return null;
        }
        return c1a9r;
    }

    @Override // X.InterfaceC695440RPq
    public final View ea() {
        FrameLayout frameLayout = this.LLLILZ;
        return frameLayout == null ? this.LLLILZJ : frameLayout;
    }

    public final C1A9W fq() {
        int i = C732110Snh.LIZ;
        C1A9W c1a9w = new C1A9W(8, 14, 0, 9, 40, 0, false);
        if (C0HCN.LIZJ() || LowScreenOptimizeAB.LIZIZ()) {
            c1a9w = C1A9W.LIZ(c1a9w, 8, 8, 8, 116);
        } else {
            C732110Snh.LIZIZ();
            C1A9W.LIZ(c1a9w, 10, 12, 0, 124);
        }
        C1A9X c1a9xLJIILIIL = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJIILIIL(c1a9w.LIZ, c1a9w.LIZIZ, c1a9w.LIZJ, c1a9w.LIZLLL, c1a9w.LJ, c1a9w.LJFF);
        int i2 = c1a9xLJIILIIL.LJ;
        int i3 = c1a9xLJIILIIL.LIZ;
        int i4 = c1a9xLJIILIIL.LIZIZ;
        int i5 = c1a9xLJIILIIL.LIZLLL;
        int i6 = c1a9xLJIILIIL.LIZJ;
        int i7 = c1a9xLJIILIIL.LJFF;
        C724270Sb3 c724270Sb3 = this.LLJI;
        return new C1A9W(i3, i4, i6, i5, i2, i7, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).isMyProfile);
    }

    public final void kq() {
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        c2174741A9g.LJIILL(c2174741A9g.LIZIZ(C724240Sb0.LIZ(this)), EnumC655500PnQ.CLICK_UNMUTE_BUTTON, iq());
        c2174741A9g.LJIIJ();
    }

    public final boolean lq() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (!C1017070cZd.LLJZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            return false;
        }
        ISearchCopyrightMuteService iSearchCopyrightMuteServiceEp = Ep();
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        C724270Sb3 c724270Sb33 = this.LLJI;
        return !iSearchCopyrightMuteServiceEp.LIZIZ(aweme, ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mEventType);
    }

    public final void tq() {
        if (this.LLLLZLL) {
            this.LLLLZLL = false;
            C2041907zF.LIZJ(this.LLLIL);
            if (this.LLLIL != null) {
                if (C283710BAb.LIZ()) {
                    ValueAnimator valueAnimator = this.LLLJIL;
                    if (valueAnimator != null) {
                        valueAnimator.pause();
                    }
                } else {
                    ValueAnimator valueAnimator2 = this.LLLJIL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.end();
                    }
                }
                if (AnonymousClass0723.LIZ()) {
                    C19K8.LIZ(this.LLLLII);
                }
            }
        }
    }

    public final void vq() {
        if (this.LLLLZLLIL) {
            this.LLLLZLLIL = false;
            C2041907zF.LIZJ(this.LLLIIIIL);
            C21387418mu c21387418mu = this.LLLIIIIL;
            if (c21387418mu != null) {
                c21387418mu.LLJIJIL.removeCallbacksAndMessages(null);
                c21387418mu.LLJIJIL.removeCallbacks(c21387418mu.LLJILJIL);
                int childCount = c21387418mu.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    c21387418mu.LIZIZ(c21387418mu.getChildAt(i));
                }
            }
        }
    }

    public final void xq() {
        for (Animator animator : (ArrayList) this.LLLJ) {
            if (animator != null) {
                animator.end();
            }
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
            }
            if (animator != null) {
                animator.removeAllListeners();
            }
        }
    }

    public final void yq() {
        FrameLayout frameLayout = this.LLLLLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS167S0100000_33(this, 49));
        }
        C1AV2 c1av2LIZ = C1AV3.LIZ(3, "Feed", null, "music_cover");
        c1av2LIZ.LJI = true;
        Bq(c1av2LIZ);
        this.LLLLLLLLL = true;
        ((RecordMuteVM) this.LLLF.getValue(this, LLLZ[1])).LLILLJJLI = false;
    }

    public final void zq() {
        TuxIconView tuxIconView = this.LLLLLLL;
        if (tuxIconView == null || tuxIconView.getVisibility() != 0) {
            return;
        }
        ISearchCopyrightMuteService iSearchCopyrightMuteServiceEp = Ep();
        C724270Sb3 c724270Sb3 = this.LLJI;
        iSearchCopyrightMuteServiceEp.LIZ(tuxIconView, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    public final void Vp() {
        if (C283710BAb.LIZ()) {
            ValueAnimator valueAnimator = this.LLLJIL;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            if (AnonymousClass0723.LIZ()) {
                C19K8.LIZ(this.LLLLII);
            }
        }
    }

    public final void Wp() {
        ViewGroup.LayoutParams layoutParams;
        GradientDrawable gradientDrawable;
        if (!C302070Bsj.LIZIZ() || C2174741A9g.LIZIZ.LJIILLIIL()) {
            ARunnableS132S0100000_32 aRunnableS132S0100000_32 = this.LLLLLLZZ;
            if (aRunnableS132S0100000_32 != null) {
                C2487409ou.LIZ(aRunnableS132S0100000_32);
            }
            this.LLLLLLLLLL = false;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(fq().LIZ)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(fq().LJ)));
            float f = iLIZIZ2 / 2;
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            int i = (iLIZIZ2 - iLIZIZ3) / 2;
            FrameLayout frameLayout = this.LLLLLJLJLL;
            if (frameLayout != null) {
                frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), iLIZIZ, frameLayout.getPaddingBottom());
            }
            FrameLayout frameLayout2 = this.LLLLLL;
            if (frameLayout2 != null) {
                layoutParams = frameLayout2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iLIZIZ2;
                    layoutParams.height = iLIZIZ2;
                }
            } else {
                layoutParams = null;
            }
            FrameLayout frameLayout3 = this.LLLLLL;
            if (frameLayout3 != null) {
                C786410Ut5.a6(frameLayout3, layoutParams);
            }
            FrameLayout frameLayout4 = this.LLLLLL;
            if (frameLayout4 != null) {
                frameLayout4.setPadding(i, i, i, i);
            }
            FrameLayout frameLayout5 = this.LLLLLL;
            Drawable background = frameLayout5 != null ? frameLayout5.getBackground() : null;
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setCornerRadius(f);
            }
            ImageView imageView = this.LLLLLLIL;
            if (imageView == null) {
                imageView = null;
            }
            C1744700vVE.LJIIL(imageView, iLIZIZ3);
            ImageView imageView2 = this.LLLLLLIL;
            if (imageView2 == null) {
                imageView2 = null;
            }
            C1744700vVE.LJIIIIZZ(iLIZIZ3, imageView2);
            TuxTextView tuxTextView = this.LLLLLLJ;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.B5(tuxTextView, 0.0f);
            TuxTextView tuxTextView2 = this.LLLLLLJ;
            (tuxTextView2 != null ? tuxTextView2 : null).setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
    }

    public final C0SVP iq() {
        return C302070Bsj.LIZIZ() ? !this.LLLLZ ? C0SVP.STYLE_NO_BUTTON : this.LLLLLLLLLL ? C0SVP.STYLE_UNFOLD_CAPSULE : C0SVP.STYLE_FOLD_BUTTON : (Intrinsics.LJFF(C2174741A9g.LIZIZ.LIZIZ(null), this.LLLLLLLZIL) && this.LLLLLLLLL) ? this.LLLLLLLLLL ? C0SVP.STYLE_UNFOLD_CAPSULE : C0SVP.STYLE_FOLD_BUTTON : C0SVP.STYLE_NO_BUTTON;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public final void Bq(C1AV2 c1av2) {
        Object obj;
        Object obj2;
        int i;
        int i2;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo2;
        boolean zLJIILJJIL = C2174741A9g.LIZIZ.LJIILJJIL();
        ISearchCopyrightMuteService iSearchCopyrightMuteServiceEp = Ep();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((VideoItemParams) obj).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        boolean zLIZLLL = iSearchCopyrightMuteServiceEp.LIZLLL(((VideoItemParams) obj2).mEventType);
        int i3 = 4;
        int i4 = 8;
        if (zLIZLLL) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            Aweme aweme = ((VideoItemParams) obj3).getAweme();
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
            boolean z = true;
            if (statusSafety2 == null || (videoMuteInfo = statusSafety2.getVideoMuteInfo()) == null || !videoMuteInfo.isMute() || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (videoMuteInfo2 = statusSafety.getVideoMuteInfo()) == null || !videoMuteInfo2.getIsCopyrightViolation()) {
                z = false;
            }
            FrameLayout frameLayout = this.LLLIL;
            if (frameLayout != null) {
                if (!zLJIILJJIL && !z) {
                    i3 = 0;
                }
                C2180521AVm.LIZLLL(frameLayout, i3, c1av2);
            }
            FrameLayout frameLayout2 = this.LLLLLJLJLL;
            if (frameLayout2 != null) {
                if (!zLJIILJJIL && !z) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                C2180521AVm.LIZLLL(frameLayout2, i2, c1av2);
            }
            FrameLayout frameLayout3 = this.LLLLLL;
            if (frameLayout3 != null) {
                if (zLJIILJJIL) {
                    i = 0;
                } else {
                    i = 8;
                }
                C2180521AVm.LIZLLL(frameLayout3, i, c1av2);
            }
            TuxIconView tuxIconView = this.LLLLLLL;
            if (tuxIconView != null) {
                if (!zLJIILJJIL && z) {
                    i4 = 0;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, i4);
            }
            if (!zLJIILJJIL && !z) {
                Aq();
            } else {
                TuxIconView tuxIconView2 = this.LLLIIL;
                if (tuxIconView2 != null) {
                    C337180DJs.LIZ(tuxIconView2);
                }
                View view = this.LLLIILIL;
                if (view != null) {
                    C337180DJs.LIZ(view);
                }
            }
        } else {
            FrameLayout frameLayout4 = this.LLLIL;
            if (frameLayout4 != null) {
                if (!zLJIILJJIL) {
                    i3 = 0;
                }
                C2180521AVm.LIZLLL(frameLayout4, i3, c1av2);
            }
            FrameLayout frameLayout5 = this.LLLLLJLJLL;
            if (frameLayout5 != null) {
                if (zLJIILJJIL) {
                    i4 = 0;
                }
                C2180521AVm.LIZLLL(frameLayout5, i4, c1av2);
            }
            if (zLJIILJJIL) {
                TuxIconView tuxIconView3 = this.LLLIIL;
                if (tuxIconView3 != null) {
                    C337180DJs.LIZ(tuxIconView3);
                }
                View view2 = this.LLLIILIL;
                if (view2 != null) {
                    C337180DJs.LIZ(view2);
                }
            } else {
                Aq();
            }
        }
        if (this.LLLJL) {
            if (zLJIILJJIL) {
                FrameLayout frameLayout6 = this.LLLILZJ;
                if (frameLayout6 != null) {
                    C786410Ut5.O7(frameLayout6, new ACListenerS167S0100000_33(this, 50));
                }
                FrameLayout frameLayout7 = this.LLLILZ;
                if (frameLayout7 != null) {
                    C786410Ut5.O7(frameLayout7, new ACListenerS167S0100000_33(this, 51));
                    return;
                }
                return;
            }
            Gp(this.LLLILZ, this.LLLIIIL, this.LLLL, this.LLLLJI);
            Gp(this.LLLILZJ, this.LLLIIIL, this.LLLL, this.LLLLJI);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_on_page_resume", new AwS600S0100000_21(this, 116));
        C0RDX.LIZJ(this, "event_on_page_pause", new C1398900mVU(this));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C714060Rzg c714060Rzg) {
        if (c714060Rzg.LIZ && C1398490mUp.LIZ()) {
            AnimatorSet animatorSet = this.LLLLL;
            if ((animatorSet != null && animatorSet.isRunning()) || this.LLLLJI) {
                this.LLLLLILLIL = true;
                this.LLLLLJIL = true;
                AnimatorSet animatorSet2 = this.LLLLL;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                }
                AnimatorSet animatorSet3 = this.LLLLL;
                if (animatorSet3 != null) {
                    animatorSet3.end();
                }
                wq(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0251  */
    /* JADX WARN: Type inference failed for: r7v17, types: [com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem$withDestroy$observer$1] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r27) {
        /*
            Method dump skipped, instruction units count: 2200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem.onViewCreated(android.view.View):void");
    }

    public final void pq(String str) {
        C1AV2 c1av2LIZ = C1AV3.LIZ(2, "Feed", null, "music_cover");
        c1av2LIZ.LIZ(str);
        c1av2LIZ.LJI = true;
        Bq(c1av2LIZ);
        if (this.LLLLZ) {
            this.LLLLZ = false;
            C2174741A9g.LIZIZ.LJIIL(false);
        }
        ARunnableS132S0100000_32 aRunnableS132S0100000_32 = this.LLLLLLZ;
        if (aRunnableS132S0100000_32 != null) {
            C2487409ou.LIZ(aRunnableS132S0100000_32);
        }
    }

    public final void qq(String str) {
        boolean z;
        C1AV2 c1av2LIZ = C1AV3.LIZ(1, "Feed", null, "music_cover");
        c1av2LIZ.LIZ(str);
        c1av2LIZ.LJI = true;
        Bq(c1av2LIZ);
        if (this.LLLLLZ && this.LLLLLZIL && this.LLLLLZL) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLLLZ && z) {
            this.LLLLZ = true;
            C2174741A9g.LIZIZ.LJIIL(true);
            zq();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (C288460BSi.LIZ) {
            getContentView().setEnabled(true);
        }
        if (C2174741A9g.LIZIZ.LJIILJJIL()) {
            yq();
        }
        if (lq()) {
            View viewLJJIJL = LJJIJL();
            C1AV2 c1av2LIZ = C1AV3.LIZ("onbind", "Feed", null, "music_cover");
            c1av2LIZ.LJI = true;
            C2180521AVm.LIZLLL(viewLJJIJL, 8, c1av2LIZ);
        }
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZIJLIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
        Music music = videoItemParams2.getAweme().getMusic();
        if (music != null) {
            BaseMusicCoverAssem.Ip(this.LLLILZ, music);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void wR(int i) {
        Object obj;
        if (i == 0) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            C0RGG c0rggLIZ = C586380MzE.LIZ();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (c0rggLIZ.LIZJ(((VideoItemParams) obj).mEventType)) {
                return;
            }
        }
        View viewLJJIJL = LJJIJL();
        C1AV2 c1av2LIZ = C1AV3.LIZ("update_container", "Feed", null, "music_cover");
        c1av2LIZ.LJI = true;
        C2180521AVm.LIZLLL(viewLJJIJL, i, c1av2LIZ);
    }

    public final void wq(boolean z) {
        TuxTextView tuxTextView;
        int i;
        int iLIZIZ;
        int i2;
        Object obj;
        int width;
        Object obj2;
        int iLIZIZ2;
        Object obj3;
        AnimatorSet.Builder builderPlay;
        AnimatorSet.Builder builderWith;
        AnimatorSet.Builder builderWith2;
        AnimatorSet.Builder builderAfter;
        AnimatorSet.Builder builderPlay2;
        AnimatorSet.Builder builderWith3;
        AnimatorSet.Builder builderAfter2;
        Object obj4;
        long j;
        Object obj5;
        long j2;
        C427870Gq9 c427870Gq9 = this.LLLII;
        if (c427870Gq9 != null && (tuxTextView = this.LLLLILI) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C1A9W c1a9wFq = fq();
            final int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9wFq.LJ)));
            if (!((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJJIIJ()) {
                i = c1a9wFq.LJ;
            } else {
                i = c1a9wFq.LJ + c1a9wFq.LIZ + c1a9wFq.LIZIZ;
            }
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            C427870Gq9 c427870Gq92 = this.LLLII;
            if (c427870Gq92 != null) {
                iLIZIZ = c427870Gq92.getWidth();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) (((double) iLIZIZ3) * 0.74d))));
            }
            if (C0HCN.LIZJ()) {
                i2 = 22;
            } else {
                i2 = 24;
            }
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
            C612110Nzd c612110Nzd = C612110Nzd.LIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            c612110Nzd.getClass();
            if (C612110Nzd.LIZIZ(aweme)) {
                width = c427870Gq9.getWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            } else {
                width = iLIZIZ4;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78)), iLIZIZ4);
            if (!((ArrayList) this.LLLJ).contains(valueAnimatorOfInt)) {
                ((ArrayList) this.LLLJ).add(valueAnimatorOfInt);
            }
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator(1.5f));
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj5 = c724270Sb32.LL;
                } else {
                    obj5 = null;
                }
                if (C612110Nzd.LIZIZ(((VideoItemParams) obj5).getAweme())) {
                    j2 = 300;
                } else {
                    j2 = 250;
                }
                valueAnimatorOfInt.setDuration(j2);
            }
            Jp(new AUListenerS265S0100000_16(this, 21), valueAnimatorOfInt);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c427870Gq9, "alpha", 0.0f, 1.0f);
            if (!((ArrayList) this.LLLJ).contains(objectAnimatorOfFloat)) {
                ((ArrayList) this.LLLJ).add(objectAnimatorOfFloat);
            }
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0c5y
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    FrameLayout frameLayout = this.LL.LLLLJ;
                    if (frameLayout != null) {
                        int i3 = iLIZIZ3;
                        frameLayout.setBackground(null);
                        C618720OOo.LIZIZ(frameLayout, i3, i3);
                    }
                }
            });
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78)), width);
            if (!((ArrayList) this.LLLJ).contains(valueAnimatorOfInt2)) {
                ((ArrayList) this.LLLJ).add(valueAnimatorOfInt2);
            }
            if (valueAnimatorOfInt2 != null) {
                valueAnimatorOfInt2.setInterpolator(new DecelerateInterpolator(1.5f));
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj4 = c724270Sb33.LL;
                } else {
                    obj4 = null;
                }
                if (C612110Nzd.LIZIZ(((VideoItemParams) obj4).getAweme())) {
                    j = 300;
                } else {
                    j = 250;
                }
                valueAnimatorOfInt2.setDuration(j);
            }
            Jp(new AUListenerS265S0100000_16(this, 22), valueAnimatorOfInt2);
            valueAnimatorOfInt2.addListener(new ALAdapterS6S0200000_9(this, objectAnimatorOfFloat, 0));
            valueAnimatorOfInt.addListener(new ALAdapterS11S0200000_16(this, c1a9wFq, 2));
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj2 = c724270Sb34.LL;
            } else {
                obj2 = null;
            }
            if (!C612110Nzd.LIZIZ(((VideoItemParams) obj2).getAweme())) {
                iLIZIZ = iLIZIZ5;
            }
            ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(iLIZIZ, iLIZIZ3);
            if (!((ArrayList) this.LLLJ).contains(valueAnimatorOfInt3)) {
                ((ArrayList) this.LLLJ).add(valueAnimatorOfInt3);
            }
            valueAnimatorOfInt3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt3.setDuration(100L);
            Jp(new AUListenerS265S0100000_16(this, 19), valueAnimatorOfInt3);
            valueAnimatorOfInt3.addListener(new ALAdapterS6S0101000_33(this, iLIZIZ3, 6));
            int[] iArr = new int[2];
            C427870Gq9 c427870Gq93 = this.LLLI;
            if (c427870Gq93 != null) {
                iLIZIZ2 = c427870Gq93.getWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) (((double) iLIZIZ3) * 0.74d))));
            }
            iArr[0] = iLIZIZ2;
            iArr[1] = iLIZIZ3;
            ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(iArr);
            if (!((ArrayList) this.LLLJ).contains(valueAnimatorOfInt4)) {
                ((ArrayList) this.LLLJ).add(valueAnimatorOfInt4);
            }
            valueAnimatorOfInt4.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt4.setDuration(100L);
            Jp(new AUListenerS265S0100000_16(this, 20), valueAnimatorOfInt4);
            if (this.LLLLLIL == null) {
                this.LLLLLIL = new AnimatorSet();
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat2.setDuration(100L);
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj3 = c724270Sb35.LL;
            } else {
                obj3 = null;
            }
            if (C612110Nzd.LIZIZ(((VideoItemParams) obj3).getAweme())) {
                AnimatorSet animatorSet = this.LLLLLIL;
                if (animatorSet != null && (builderPlay2 = animatorSet.play(valueAnimatorOfInt3)) != null && (builderWith3 = builderPlay2.with(objectAnimatorOfFloat2)) != null && (builderAfter2 = builderWith3.after(valueAnimatorOfInt)) != null) {
                    builderAfter2.after(valueAnimatorOfInt2);
                }
            } else {
                AnimatorSet animatorSet2 = this.LLLLLIL;
                if (animatorSet2 != null && (builderPlay = animatorSet2.play(valueAnimatorOfInt3)) != null && (builderWith = builderPlay.with(valueAnimatorOfInt4)) != null && (builderWith2 = builderWith.with(objectAnimatorOfFloat2)) != null && (builderAfter = builderWith2.after(valueAnimatorOfInt)) != null) {
                    builderAfter.after(valueAnimatorOfInt2);
                }
            }
            AnimatorSet animatorSet3 = this.LLLLLIL;
            if (animatorSet3 != null) {
                animatorSet3.removeAllListeners();
            }
            AnimatorSet animatorSet4 = this.LLLLLIL;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new ALAdapterS7S0110000_21(this, z, 0));
            }
            AnimatorSet animatorSet5 = this.LLLLLIL;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        }
    }

    public static void Jp(final ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator valueAnimator) {
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(animatorUpdateListener) { // from class: X.0jjP
            public final WeakReference<ValueAnimator.AnimatorUpdateListener> LL;

            {
                this.LL = new WeakReference<>(animatorUpdateListener);
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = this.LL.get();
                if (animatorUpdateListener2 != null) {
                    animatorUpdateListener2.onAnimationUpdate(valueAnimator2);
                }
            }
        });
    }

    public static void jq(VideoMusicCoverAssem videoMusicCoverAssem, boolean z) {
        int iLIZIZ;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        float f2;
        float f3;
        int iLIZIZ2;
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(videoMusicCoverAssem.fq().LIZ)));
        if (iLIZIZ3 == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        } else {
            iLIZIZ = iLIZIZ3 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        }
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(videoMusicCoverAssem.fq().LJ)));
        TuxTextView tuxTextView = videoMusicCoverAssem.LLLLLLJ;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C341940Daq.LIZIZ(C0H1U.LIZLLL(tuxTextView)))));
        if (iLIZIZ5 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54))) {
            TuxTextView tuxTextView3 = videoMusicCoverAssem.LLLLLLJ;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setTuxFont(92);
            TuxTextView tuxTextView4 = videoMusicCoverAssem.LLLLLLJ;
            if (tuxTextView4 != null) {
                tuxTextView2 = tuxTextView4;
            }
            iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C341940Daq.LIZIZ(C0H1U.LIZLLL(tuxTextView2)))));
            if (iLIZIZ5 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54))) {
                iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
            }
        }
        int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        float f4 = 2;
        float f5 = iLIZIZ4 / f4;
        float f6 = iLIZIZ6 / f4;
        int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        int i6 = (iLIZIZ4 - iLIZIZ7) / 2;
        int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        int i7 = iLIZIZ6 + iLIZIZ5 + iLIZIZ9;
        if (z) {
            i = iLIZIZ;
        } else {
            i = iLIZIZ3;
            iLIZIZ3 = iLIZIZ;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iLIZIZ3);
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(valueAnimatorOfInt)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(valueAnimatorOfInt);
        }
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        valueAnimatorOfInt.setDuration(300L);
        Jp(new AUListenerS261S0100000_11(videoMusicCoverAssem, 0), valueAnimatorOfInt);
        if (z) {
            i2 = i7;
            i7 = iLIZIZ4;
            i3 = iLIZIZ6;
        } else {
            i2 = iLIZIZ4;
            i3 = iLIZIZ4;
            iLIZIZ4 = iLIZIZ6;
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i2, i7);
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(valueAnimatorOfInt2)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(valueAnimatorOfInt2);
        }
        valueAnimatorOfInt2.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        valueAnimatorOfInt2.setDuration(300L);
        Jp(new AUListenerS265S0100000_16(videoMusicCoverAssem, 5), valueAnimatorOfInt2);
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(i3, iLIZIZ4);
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(valueAnimatorOfInt3)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(valueAnimatorOfInt3);
        }
        valueAnimatorOfInt3.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        valueAnimatorOfInt3.setDuration(300L);
        Jp(new AUListenerS265S0100000_16(videoMusicCoverAssem, 1), valueAnimatorOfInt3);
        if (z) {
            i4 = iLIZIZ9;
        } else {
            i4 = i6;
            i6 = iLIZIZ9;
        }
        ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(i4, i6);
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(valueAnimatorOfInt4)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(valueAnimatorOfInt4);
        }
        valueAnimatorOfInt4.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        valueAnimatorOfInt4.setDuration(300L);
        Jp(new AUListenerS265S0100000_16(videoMusicCoverAssem, 2), valueAnimatorOfInt4);
        if (z) {
            f = f6;
        } else {
            f = f5;
            f5 = f6;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f5);
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(valueAnimatorOfFloat)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(valueAnimatorOfFloat);
        }
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        valueAnimatorOfFloat.setDuration(300L);
        Jp(new AUListenerS265S0100000_16(videoMusicCoverAssem, 0), valueAnimatorOfFloat);
        if (z) {
            i5 = iLIZIZ8;
        } else {
            i5 = iLIZIZ7;
            iLIZIZ7 = iLIZIZ8;
        }
        ValueAnimator valueAnimatorOfInt5 = ValueAnimator.ofInt(i5, iLIZIZ7);
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(valueAnimatorOfInt5)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(valueAnimatorOfInt5);
        }
        valueAnimatorOfInt5.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        valueAnimatorOfInt5.setDuration(300L);
        Jp(new AUListenerS261S0100000_11(videoMusicCoverAssem, 1), valueAnimatorOfInt5);
        if (z) {
            f2 = 1.0f;
            f3 = 0.0f;
        } else {
            f2 = 0.0f;
            f3 = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, f3);
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(valueAnimatorOfFloat2)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(valueAnimatorOfFloat2);
        }
        valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        valueAnimatorOfFloat2.setDuration(300L);
        Jp(new AUListenerS265S0100000_16(videoMusicCoverAssem, 3), valueAnimatorOfFloat2);
        if (z) {
            iLIZIZ2 = iLIZIZ5;
            iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        ValueAnimator valueAnimatorOfInt6 = ValueAnimator.ofInt(iLIZIZ2, iLIZIZ5);
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(valueAnimatorOfInt6)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(valueAnimatorOfInt6);
        }
        valueAnimatorOfInt6.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        valueAnimatorOfInt6.setDuration(300L);
        Jp(new AUListenerS265S0100000_16(videoMusicCoverAssem, 4), valueAnimatorOfInt6);
        AnimatorSet animatorSet = new AnimatorSet();
        if (!((ArrayList) videoMusicCoverAssem.LLLJ).contains(animatorSet)) {
            ((ArrayList) videoMusicCoverAssem.LLLJ).add(animatorSet);
        }
        animatorSet.addListener(new ALAdapterS27S0100000_33(videoMusicCoverAssem, 1));
        animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfInt3).with(valueAnimatorOfInt2).with(valueAnimatorOfInt4).with(valueAnimatorOfFloat).with(valueAnimatorOfInt5).with(valueAnimatorOfInt6).with(valueAnimatorOfFloat2);
        animatorSet.start();
    }

    public final void Tp(C427870Gq9 c427870Gq9, UrlModel urlModel, int i, int i2) {
        boolean zLJI = MethodIDManager.LJI(71716);
        if (c427870Gq9 != null) {
            C337180DJs.LIZJ(c427870Gq9);
        }
        C1D92 c1d92 = this.LLLIIII;
        if (c1d92 != null) {
            C337180DJs.LIZ(c1d92);
        }
        new C1398910mVV(urlModel, this, i, i2, c427870Gq9).invoke();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
