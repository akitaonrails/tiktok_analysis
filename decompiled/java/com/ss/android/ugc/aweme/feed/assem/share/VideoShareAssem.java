package com.ss.android.ugc.aweme.feed.assem.share;

import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0CBR;
import X.C0CNO;
import X.C0HHT;
import X.C0OBG;
import X.C0RF0;
import X.C0RRE;
import X.C0RRT;
import X.C0S23;
import X.C0S90;
import X.C0SXF;
import X.C1017180cZo;
import X.C1322090kVb;
import X.C1360460lVU;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1583510rJF;
import X.C1590480rUU;
import X.C1637806bA;
import X.C1637906bB;
import X.C1789206za;
import X.C1865840yec;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19K7;
import X.C19K8;
import X.C19MB;
import X.C1A5L;
import X.C1EE1;
import X.C20094213jo;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2277711EDh;
import X.C2344009Gk;
import X.C2487409ou;
import X.C296090Bj5;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C487570JAd;
import X.C585780MyG;
import X.C609020Nue;
import X.C622680Oba;
import X.C694180RKu;
import X.C695560RQc;
import X.C695570RQd;
import X.C695660RQm;
import X.C699500RcC;
import X.C700450Rdj;
import X.C717590SCv;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C731140Sm8;
import X.C732100Sng;
import X.C732130Snj;
import X.C732360So6;
import X.C732370So7;
import X.C732380So8;
import X.C732390So9;
import X.C732420SoC;
import X.C732430SoD;
import X.C732460SoG;
import X.C732470SoH;
import X.C732480SoI;
import X.C732510SoL;
import X.C732520SoM;
import X.C732530SoN;
import X.C732550SoP;
import X.C732600SoU;
import X.C732620SoW;
import X.C732630SoX;
import X.C732650SoZ;
import X.C732660Soa;
import X.C732670Sob;
import X.C732680Soc;
import X.C732690Sod;
import X.C732720Sog;
import X.C733410Spn;
import X.C736660Sv2;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC732770Sol;
import X.InterfaceC1361560lXG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1364710lcL;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.ViewOnTouchListenerC1364750lcP;
import Y.ARunnableS111S0100000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Objects;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import p5a.a;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public class VideoShareAssem extends BaseCellSlotComponent<VideoShareAssem> implements View.OnClickListener, ComponentPriorityProtocol, IVideoShareAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public ValueAnimator LLJLLIL;
    public C736660Sv2 LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new C0RRE(this));
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public C732130Snj LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public C732460SoG LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoShareAssem.class, "videoShareVM", "getVideoShareVM()Lcom/ss/android/ugc/aweme/feed/assem/share/VideoShareViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoShareAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        c09r3.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoShareAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoShareViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new C695560RQc(c19719912DlLIZ), null, new C732650SoZ());
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RightAreaContainerVM.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C695570RQd(c19719912DlLIZ2), null, new C732660Soa());
        this.LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C732670Sob());
        this.LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C732680Soc());
        this.LLLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C732690Sod());
        this.LLLIILIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 241));
        this.LLLIL = C452501pT.LIZIZ(new C0S23());
        this.LLLILZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(94));
        this.LLLILZJ = C452501pT.LIZIZ(new C0RRT());
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility
    public final Object Eg0(Aweme aweme, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return Qp(this, aweme, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_share";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.b_1;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    public void Vp() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(this, LLLILZLLLI[1]), new C2217381BqS() { // from class: X.0SmQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C695520RPy) obj).LL;
            }
        }, null, new C732100Sng(), 6);
    }

    public void Wp() {
        C736680Sv4.LJIIIIZZ(this, Jp(), new C2217381BqS() { // from class: X.0SoK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C732520SoM) obj).LLILLL;
            }
        }, null, new C732510SoL(), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1971159570) {
            return null;
        }
        return this;
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

    public final boolean Fp() {
        Aweme aweme;
        if (!C2277711EDh.LIZIZ.LJJIFFI()) {
            return true;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme2 = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme2 != null && aweme2.isCanPlay()) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            Aweme aweme3 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
            if (aweme3 == null || !AwemeExtKt.isDelete(aweme3)) {
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (Intrinsics.LJFF(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mEventType, "offline_mode_page")) {
                    return true;
                }
                VideoShareViewModel videoShareViewModelJp = Jp();
                VideoItemParams item = videoShareViewModelJp.getItem();
                if (item != null && (aweme = item.getAweme()) != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    String str = videoShareViewModelJp.eventType;
                    if (str == null) {
                        str = "";
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("follow_status", String.valueOf(AwemeExtKt.getFollowStatus(aweme)));
                    String groupId = aweme.getGroupId();
                    c2344009Gk.LJIIIIZZ("group_id", groupId != null ? groupId : "");
                    c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                    C20684815ws.LJIILLIIL("long_press_more_button", c2344009Gk.LIZ);
                }
                InterfaceC1364710lcL interfaceC1364710lcLGp = Gp();
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (!interfaceC1364710lcLGp.LJIILLIIL(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme())) {
                    return false;
                }
                int[] iArr = new int[2];
                View viewFindViewById = getContentView().findViewById(R.id.uzq);
                if (viewFindViewById != null) {
                    viewFindViewById.getLocationInWindow(iArr);
                }
                Gp().LJJI();
                ViewOnTouchListenerC1364750lcP.LIZIZ();
                C724270Sb3 c724270Sb35 = this.LLJI;
                DataCenter dataCenter = ((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.zQ2(iArr, "video_share_button_long_click");
                    return true;
                }
            }
        }
        return true;
    }

    public final InterfaceC1364710lcL Gp() {
        return (InterfaceC1364710lcL) this.LLLILZJ.getValue();
    }

    public final C732130Snj Ip() {
        if (this.LLLFFI == null) {
            C732130Snj c732130Snj = new C732130Snj();
            this.LLLFFI = c732130Snj;
            Context context = getContext();
            boolean z = false;
            if (context != null && !C0SXF.LJIL(context)) {
                z = true;
            }
            c732130Snj.LIZ = z;
        }
        return this.LLLFFI;
    }

    public final VideoShareViewModel Jp() {
        return (VideoShareViewModel) this.LLJZIJLIL.getValue(this, LLLILZLLLI[0]);
    }

    public final void Tp() {
        View viewFindViewById;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator duration;
        if (!C0CBR.LIZJ) {
            getContentView().findViewById(R.id.uz4).animate().scaleX(1.02f).scaleY(1.02f).setDuration(150L).withEndAction(new ARunnableS111S0100000_11(this, 26)).start();
            return;
        }
        View contentView = getContentView();
        if (contentView == null || (viewFindViewById = contentView.findViewById(R.id.uz4)) == null || (viewPropertyAnimatorAnimate = viewFindViewById.animate()) == null || (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(1.0f)) == null || (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.0f)) == null || (duration = viewPropertyAnimatorScaleY.setDuration(150L)) == null) {
            return;
        }
        duration.start();
    }

    public final void Xp() {
        if (((Boolean) C1789206za.LIZ.getValue()).booleanValue()) {
            C2487409ou.LIZJ(new Runnable() { // from class: X.0SoB
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoShareAssem@b354.tryClearAlignAnimation$1");
                    try {
                        ValueAnimator valueAnimator = this.LL.LLJLLIL;
                        if (valueAnimator != null) {
                            valueAnimator.end();
                        }
                        VideoShareAssem videoShareAssem = this.LL;
                        videoShareAssem.LLJLLIL = null;
                        C19K8.LIZ(videoShareAssem.LLJLLL);
                        this.LL.LLJLLL = null;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoShareAssem@b354.tryClearAlignAnimation$1");
                }
            });
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (this.LLLI) {
            this.LLLI = false;
            Gp().LJIILIIL(getContentView().findViewById(R.id.uzq), C724240Sb0.LIZ(this));
        }
    }

    public void Bp() {
        Context context = getContext();
        if (context == null || !C0SXF.LJIL(context)) {
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII((ConstraintLayout) getContentView().findViewById(R.id.uz4));
        c19mb.LJIIIIZZ(getContentView().findViewById(R.id.uzq).getId(), 4, getContentView().findViewById(R.id.uz4).getId(), 4);
        c19mb.LIZIZ((ConstraintLayout) getContentView().findViewById(R.id.uz4));
    }

    public final void Ep() {
        final ConstraintLayout constraintLayout = (ConstraintLayout) getContentView().findViewById(R.id.uz4);
        if (constraintLayout != null) {
            Xp();
            Animation animation = constraintLayout.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            C2487409ou.LIZJ(new Runnable() { // from class: X.0SoE
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoShareAssem@b354.cancelAnimation$1$1");
                    try {
                        constraintLayout.clearAnimation();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoShareAssem@b354.cancelAnimation$1$1");
                }
            });
        }
        Jp().zQ2();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
        if (C1865840yec.LIZ()) {
            if (this.LLLIIIL != null) {
                Gp().LJJI();
                ViewOnTouchListenerC1364750lcP.LIZ(null);
            }
            this.LLLIIIL = null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility
    public final EnumC732770Sol pr0() {
        return Jp().LLIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void wr() {
        C717590SCv c717590SCv = Jp().LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoShareViewModel.LLJILJIL;
        c717590SCv.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        Ep();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        Object obj2;
        String aid;
        String str;
        Object obj3;
        boolean zLJI = MethodIDManager.LJI(202357);
        if (C0OBG.LIZIZ(view)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj4 = null;
        String adsPreviewDisableSharing = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C1017180cZo.LJIJ(((VideoItemParams) obj).getAweme().getAwemeRawAd())) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj3 = c724270Sb32.LL;
                } else {
                    obj3 = null;
                }
                AwemeRawAd awemeRawAd = ((VideoItemParams) obj3).getAweme().getAwemeRawAd();
                if (awemeRawAd != null) {
                    adsPreviewDisableSharing = awemeRawAd.getAdsPreviewDisableSharing();
                }
                c1389890mGx.LJIIJ(adsPreviewDisableSharing);
                c1389890mGx.LJIIJJI();
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C0S90.LIZ();
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        if (c1ee1.LJJIZ()) {
            C0RF0 c0rf0 = jm().LIZLLL;
            if (c0rf0 != null) {
                str = c0rf0.LJIIIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "offline_mode_page")) {
                c1ee1.LJJJJZI(C724240Sb0.LIZ(this));
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        C1590480rUU c1590480rUU = C1590480rUU.LIZ;
        View viewLJJIJL = LJJIJL();
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj2 = c724270Sb33.LL;
        } else {
            obj2 = null;
        }
        String str2 = ((VideoItemParams) obj2).mEventType;
        c1590480rUU.getClass();
        C1590480rUU.LJ(viewLJJIJL, str2, "share");
        SystemClock.elapsedRealtime();
        Jp().JQ2((ImageView) getContentView().findViewById(R.id.uzq));
        ((InterfaceC1365380ldQ) this.LLLIL.getValue()).LJIJ(System.currentTimeMillis(), "share_button");
        InterfaceC1361560lXG interfaceC1361560lXGLJJII = C1360460lVU.LIZIZ.LJJII();
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        }
        Aweme aweme = ((VideoItemParams) obj4).getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        interfaceC1361560lXGLJJII.LIZLLL(aid);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C732620SoW c732620SoW) {
        Object obj;
        String str = c732620SoW.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
            this.LLLIIIIL = true;
            Gp().LJJJJLI(getContentView().findViewById(R.id.uzq), C724240Sb0.LIZ(this), c732620SoW.LIZIZ);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUpdateShareCountEvent$common_feed_release(C585780MyG c585780MyG) {
        Object obj;
        Object obj2;
        Object obj3;
        long shareCount;
        if (c585780MyG == null) {
            return;
        }
        String str = c585780MyG.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj4 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInnerShareCompleteEvent aid=");
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            sbLIZ.append(((VideoItemParams) obj2).getAweme().getAid());
            sbLIZ.append(" awemecount=");
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            AwemeStatistics statistics = ((VideoItemParams) obj3).getAweme().getStatistics();
            if (statistics != null) {
                shareCount = statistics.getShareCount();
            } else {
                shareCount = 0;
            }
            sbLIZ.append(shareCount);
            sbLIZ.append(" updatecount");
            sbLIZ.append(c585780MyG.LIZIZ);
            sbLIZ.append('}');
            C2188811AlT.LIZIZ(sbLIZ);
            VideoShareViewModel videoShareViewModelJp = Jp();
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            }
            Aweme aweme = ((VideoItemParams) obj4).getAweme();
            long j = c585780MyG.LIZIZ;
            videoShareViewModelJp.getClass();
            if (aweme != null && aweme.getStatistics() != null) {
                aweme.getStatistics().setShareCount(j);
                videoShareViewModelJp.setState(new AwS590S0100000_11(videoShareViewModelJp, 542));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        int i;
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        VideoViewCellRootView videoViewCellRootView;
        View viewFindViewById;
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        C786410Ut5.I7(this, getContentView());
        C786410Ut5.I7(this, view);
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0SoY
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.LL.Fp();
            }
        });
        C786410Ut5.E9((RemoteImageView) getContentView().findViewById(R.id.uzq), this);
        a aVar = new a(0.6f, 150L);
        InterfaceC1364710lcL interfaceC1364710lcLGp = Gp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (interfaceC1364710lcLGp.LJIILLIIL(((VideoItemParams) obj).getAweme())) {
            a aVar2 = new a(1.0f, 0L);
            ViewOnTouchListenerC1364750lcP viewOnTouchListenerC1364750lcPLJJIJL = Gp().LJJIJL();
            aVar.LLILLL = viewOnTouchListenerC1364750lcPLJJIJL;
            aVar2.LLILLL = viewOnTouchListenerC1364750lcPLJJIJL;
            C0CNO.LIZLLL(0L, new C732720Sog(new C732470SoH(this, aVar)));
            getContentView().findViewById(R.id.uzq).setHapticFeedbackEnabled(false);
            getContentView().findViewById(R.id.uzq).setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0Soe
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.LL.Fp();
                }
            });
            View viewFindViewById2 = getContentView().findViewById(R.id.uz7);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0Sof
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        return this.LL.Fp();
                    }
                });
            }
            View viewFindViewById3 = getContentView().findViewById(R.id.uz7);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setOnTouchListener(aVar2);
            }
        }
        getContentView().findViewById(R.id.uzq).setOnTouchListener(aVar);
        Bp();
        C786410Ut5.h9((TuxTextView) getContentView().findViewById(R.id.uz7), this);
        C786410Ut5.R7((LinearLayout) getContentView().findViewById(R.id.fuc), this);
        C786410Ut5.Y7((ConstraintLayout) getContentView().findViewById(R.id.uz4), this);
        C2271391DvN.LIZ(getContentView().findViewById(R.id.uzq), (C1A5L) C2271381DvM.LLLLLZ.getValue());
        C2271391DvN.LIZ(getContentView().findViewById(R.id.uz4), (C1A5L) C2271381DvM.LLLLLZIL.getValue());
        C2271391DvN.LIZ(getContentView().findViewById(R.id.uz7), (C1A5L) C2271381DvM.LLLLLZL.getValue());
        C2271391DvN.LIZ(getContentView().findViewById(R.id.fuc), (C1A5L) C2271381DvM.LLLLZLLLI.getValue());
        q0.LJIJ(getContentView().findViewById(R.id.fuc), new C20094213jo() { // from class: X.0Sjr
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }
        });
        Context context = getContext();
        if (context != null && (viewFindViewById = getContentView().findViewById(R.id.g1p)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZ, null))) != null && iBottomTabLayoutAbilityLJIIIZ.hv0()) {
            ViewParent parent = LJJIJL().getParent();
            while (parent != null && !(parent instanceof VideoViewCellRootView)) {
                parent = parent.getParent();
            }
            if ((parent instanceof VideoViewCellRootView) && (videoViewCellRootView = (VideoViewCellRootView) parent) != null) {
                videoViewCellRootView.setShareIconCallback(new AwS590S0100000_11(this, 545));
            }
        }
        C732130Snj c732130SnjIp = Ip();
        if (c732130SnjIp != null) {
            c732130SnjIp.LIZJ = getContentView();
            c732130SnjIp.LIZLLL = getContentView().findViewById(R.id.fuc);
            c732130SnjIp.LJ = getContentView().findViewById(R.id.uz4);
            c732130SnjIp.LJI = (TuxTextView) view.findViewById(R.id.uz7);
            c732130SnjIp.LJFF = getContentView().findViewById(R.id.uzq);
        }
        Vp();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0NvP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new C732480SoI(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0NvQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C732370So7(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0SlK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLJIJIL;
            }
        }, null, new C732420SoC(), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0STx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLJ;
            }
        }, null, new C733410Spn(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0Nuf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJILLL;
            }
        }, null, new C609020Nue(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIL.getValue(), new C2217381BqS() { // from class: X.0STy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0RFV) obj2).LLJ;
            }
        }, C736820SvI.LJ(), new C732430SoD(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0NvR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLJ;
            }
        }, null, new C732550SoP(), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0Sn1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LL;
            }
        }, null, new C732380So8(), 6);
        C736680Sv4.LJIIIZ(this, Jp(), new C2217381BqS() { // from class: X.0SoO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C732520SoM) obj2).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0SoQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C732520SoM) obj2).LLILLJJLI;
            }
        }, null, new C732360So6(), 12);
        Wp();
        C736680Sv4.LJIIIIZZ(this, Jp(), new C2217381BqS() { // from class: X.0SoR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C732520SoM) obj2).LLILZ;
            }
        }, null, new C732390So9(), 6);
        C736680Sv4.LJIIIIZZ(this, Jp(), new C2217381BqS() { // from class: X.0SoS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C732520SoM) obj2).LLIZ;
            }
        }, C736820SvI.LJ(), new C732530SoN(), 4);
        Context context2 = getContext();
        if (context2 != null && !C0SXF.LJIL(context2) && C296090Bj5.LIZ()) {
            int iLIZIZ = C296090Bj5.LIZIZ();
            if (iLIZIZ != 1) {
                if (iLIZIZ != 2) {
                    if (iLIZIZ != 3) {
                        i = R.raw.icon_color_share_shadow_alt_2;
                    } else {
                        i = R.raw.icon_exp_exp_02_icon_media_share;
                    }
                } else {
                    i = R.raw.icon_exp_exp_01_icon_media_share;
                }
            } else {
                i = R.raw.icon_media_share;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            int i2 = C731140Sm8.LJII;
            c419910GdJ.LIZIZ = C487570JAd.LIZ();
            c419910GdJ.LIZJ = C487570JAd.LIZ();
            Context context3 = getContext();
            if (context3 != null) {
                ((C1322090kVb) view.findViewById(R.id.uzq)).setImageDrawable(c419910GdJ.LIZ(context3));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C732600SoU c732600SoU;
        InteractAreaCommonAbility interactAreaCommonAbility;
        C732630SoX c732630SoX = ((C732520SoM) Jp().getState()).LLILZLL;
        if (c732630SoX != null && c732630SoX.LIZ && (c732600SoU = ((C732520SoM) Jp().getState()).LLILLJJLI) != null && c732600SoU.LIZ == 0 && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZ.getValue()) != null) {
            interactAreaCommonAbility.zB1(this);
        }
        this.LLLII = false;
        this.LLLIIII = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
        vr((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: zp */
    public final void vr(VideoItemParams videoItemParams) {
        VideoShareViewModel videoShareViewModelJp = Jp();
        Context context = getContext();
        C717590SCv c717590SCv = videoShareViewModelJp.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoShareViewModel.LLJILJIL;
        c717590SCv.LIZIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility
    public final boolean b41(float f, float f2) {
        Object c098200Yq;
        if (getContentView().getVisibility() != 0 || !getContentView().isAttachedToWindow()) {
            return false;
        }
        try {
            C695660RQm c695660RQm = C695660RQm.LIZ;
            View contentView = getContentView();
            c695660RQm.getClass();
            c098200Yq = C695660RQm.LIZIZ(contentView);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Rect rect = (Rect) c098200Yq;
        Objects.toString(rect);
        if (rect != null) {
            rect.contains((int) f, (int) f2);
            if (rect.contains((int) f, (int) f2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object Qp(com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem r5, com.ss.android.ugc.aweme.feed.model.Aweme r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof X.C732400SoA
            if (r0 == 0) goto L60
            r4 = r7
            X.0SoA r4 = (X.C732400SoA) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L4e
            if (r0 != r1) goto L66
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "maybeShowExternalShareInThisVideo "
            r1.append(r0)
            if (r6 == 0) goto L4c
            java.lang.String r0 = r6.getAid()
        L39:
            r1.append(r0)
            java.lang.String r0 = "  mayShowShare="
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L4c:
            r0 = 0
            goto L39
        L4e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel r0 = r5.Jp()
            r4.LL = r6
            r4.LLILZ = r1
            java.lang.Object r3 = r0.HQ2(r4)
            if (r3 != r2) goto L24
            return r2
        L60:
            X.0SoA r4 = new X.0SoA
            r4.<init>(r5, r7)
            goto L12
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem.Qp(com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem, com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }

    public final void Up(float f, float f2, View view) {
        C19K7 c19k7;
        if (((Boolean) C1789206za.LIZ.getValue()).booleanValue()) {
            ValueAnimator valueAnimator = this.LLJLLIL;
            if (valueAnimator != null) {
                valueAnimator.end();
                C19K8.LIZ(this.LLJLLL);
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
                this.LLJLLIL = valueAnimatorOfFloat;
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setDuration(600L);
                }
                ValueAnimator valueAnimator2 = this.LLJLLIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.setRepeatMode(2);
                }
                ValueAnimator valueAnimator3 = this.LLJLLIL;
                if (valueAnimator3 != null) {
                    valueAnimator3.setRepeatCount(-1);
                }
                C736660Sv2 c736660Sv2 = new C736660Sv2(view);
                this.LLJLLL = c736660Sv2;
                ValueAnimator valueAnimator4 = this.LLJLLIL;
                if (valueAnimator4 != null) {
                    valueAnimator4.addUpdateListener(c736660Sv2);
                }
            }
            ValueAnimator valueAnimator5 = this.LLJLLIL;
            if (valueAnimator5 != null) {
                valueAnimator5.start();
            }
            C736660Sv2 c736660Sv22 = this.LLJLLL;
            if (c736660Sv22 != null && (c19k7 = (C19K7) C19K8.LIZ.getValue()) != null) {
                c19k7.LIZ(c736660Sv22);
                return;
            }
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600L);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        view.startAnimation(scaleAnimation);
    }
}
