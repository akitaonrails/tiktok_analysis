package com.ss.android.ugc.aweme.feed.assem.videocomment;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04R1;
import X.C098200Yq;
import X.C09R3;
import X.C0BUK;
import X.C0C64;
import X.C0CN5;
import X.C0CNZ;
import X.C0HHT;
import X.C0HIW;
import X.C0HIX;
import X.C0HU7;
import X.C0OAD;
import X.C0QQX;
import X.C0RRF;
import X.C0RU6;
import X.C0S90;
import X.C0SDQ;
import X.C0SDR;
import X.C0SDS;
import X.C0SXF;
import X.C0XQ7;
import X.C10EU;
import X.C1233040iBy;
import X.C1356620lPI;
import X.C1389890mGx;
import X.C13LE;
import X.C13LQ;
import X.C1440005kM;
import X.C1558520qew;
import X.C1590480rUU;
import X.C1601690rmZ;
import X.C1602200rnO;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1865480ye2;
import X.C189200o6;
import X.C19719912Dl;
import X.C19746412Nq;
import X.C1A5L;
import X.C1AV3;
import X.C1BCA;
import X.C1ER1;
import X.C20094213jo;
import X.C20642515q3;
import X.C20684815ws;
import X.C2097908Jt;
import X.C21647019ng;
import X.C2176211AEx;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2344009Gk;
import X.C2487409ou;
import X.C277530AuF;
import X.C277870Aun;
import X.C294930BhD;
import X.C295030BhN;
import X.C296030Biz;
import X.C296050Bj1;
import X.C296070Bj3;
import X.C302070Bsj;
import X.C452501pT;
import X.C523420Kfs;
import X.C547860LeC;
import X.C589960NBy;
import X.C637920P0k;
import X.C694180RKu;
import X.C695580RQe;
import X.C695590RQf;
import X.C695660RQm;
import X.C699500RcC;
import X.C700450Rdj;
import X.C715970S6p;
import X.C718860SHs;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C725790SdV;
import X.C729980SkG;
import X.C730960Slq;
import X.C732040Sna;
import X.C732050Snb;
import X.C732080Sne;
import X.C732090Snf;
import X.C732110Snh;
import X.C732740Soi;
import X.C732900Soy;
import X.C732910Soz;
import X.C732920Sp0;
import X.C732930Sp1;
import X.C732940Sp2;
import X.C732950Sp3;
import X.C732990Sp7;
import X.C733010Sp9;
import X.C733020SpA;
import X.C733030SpB;
import X.C733170SpP;
import X.C733180SpQ;
import X.C733190SpR;
import X.C733200SpS;
import X.C733210SpT;
import X.C733220SpU;
import X.C733230SpV;
import X.C733270SpZ;
import X.C733300Spc;
import X.C733340Spg;
import X.C733390Spl;
import X.C735370Ssx;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737030Svd;
import X.C737910Sx3;
import X.C738900Sye;
import X.C738910Syf;
import X.C786410Ut5;
import X.EnumC312610CNf;
import X.EnumC452301pR;
import X.EnumC733380Spk;
import X.InterfaceC1006670cIr;
import X.InterfaceC1008930cMV;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC21641019mi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC736670Sv3;
import X.InterpolatorC448120Hhi;
import X.ViewOnLongClickListenerC738750SyP;
import Y.AAListenerS322S0100000_11;
import Y.AAListenerS87S0400000_11;
import Y.ACListenerS146S0100000_11;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS44S0300000_11;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import p5a.a;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public class VideoCommentAssem extends BaseCellSlotComponent<VideoCommentAssem> implements ComponentPriorityProtocol, IVideoCommentAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0RRF(this));
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final C01GW LLLFZ;
    public TuxTextView LLLI;
    public View LLLII;
    public ImageView LLLIIII;
    public ImageView LLLIIIIL;
    public TuxTextView LLLIIIL;
    public View LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public C732050Snb LLLILZ;
    public C732910Soz LLLILZJ;
    public C732990Sp7 LLLILZLLLI;
    public C737030Svd LLLIZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoCommentAssem.class, "commentVM", "getCommentVM()Lcom/ss/android/ugc/aweme/feed/assem/videocomment/VideoCommentVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoCommentAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        c09r3.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoCommentAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCommentVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new C695580RQe(c19719912DlLIZ), null, new C733200SpS());
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C733210SpT());
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C733220SpU());
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C733230SpV());
        this.LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoQuickCommentVM.class), new C733270SpZ());
        this.LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C733190SpR());
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RightAreaContainerVM.class);
        this.LLLFFI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C695590RQf(c19719912DlLIZ2), null, new C732740Soi());
        this.LLLFZ = C452501pT.LIZIZ(new C715970S6p(this));
        this.LLLIILIL = C452501pT.LIZIZ(new C0RU6());
        this.LLLIL = C452501pT.LIZ(EnumC452301pR.NONE, new C725790SdV(this));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_comment";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.b9r;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    public void Wp() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(this, LLLJ[1]), new C2217381BqS() { // from class: X.0SmR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C695520RPy) obj).LL;
            }
        }, null, new C732040Sna(), 6);
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
        if (str.hashCode() != -259441198) {
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

    public final boolean Bp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme == null || !C295030BhN.LIZ()) {
            return false;
        }
        if (C294930BhD.LIZ()) {
            C589960NBy c589960NBy = C589960NBy.LIZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            Aweme aweme2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
            c589960NBy.getClass();
            if (C589960NBy.LIZ(aweme2)) {
                return false;
            }
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        if ((((Number) C277870Aun.LIZ.getValue()).intValue() != 0 && ComplianceServiceProvider.LJFF().LIZJ(3)) || ComplianceServiceProvider.LJFF().LJFF()) {
            return false;
        }
        CommentService.LIZ.getClass();
        return (!C523420Kfs.LIZ().LJLZ(aweme) || AwemeExtKt.isAdTraffic(aweme) || C732110Snh.LJFF()) ? false : true;
    }

    public final TuxTextView Gp() {
        TuxTextView tuxTextView = this.LLLI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final View Ip() {
        View view = this.LLLII;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final VideoCommentVM Jp() {
        return (VideoCommentVM) this.LLJLLL.getValue(this, LLLJ[0]);
    }

    public final void Tp() {
        int i;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(aweme));
            C724270Sb3 c724270Sb32 = this.LLJI;
            c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType);
            c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme));
            c2344009Gk.LIZJ(C729980SkG.LJIIIIZZ(aweme) ? 1 : 0, "is_video_author");
            AwemeStatistics statistics = aweme.getStatistics();
            c2344009Gk.LIZJ((statistics == null || statistics.getCommentCount() != 0) ? 0 : 1, "is_zero_comment");
            AwemeStatistics statistics2 = aweme.getStatistics();
            c2344009Gk.LIZLLL(statistics2 != null ? statistics2.getCommentCount() : 0L, "visible_comment_cnt");
            if (AwemeExtKt.getFollowStatus(aweme) == 2) {
                i = 2;
            } else if (AwemeExtKt.getFollowStatus(aweme) == 1) {
                i = 1;
            } else {
                User author = aweme.getAuthor();
                i = (author == null || author.getFollowerStatus() != 1) ? AwemeExtKt.getFollowStatus(aweme) == 4 ? 4 : 0 : 3;
            }
            c2344009Gk.LIZJ(i, "follow_status");
            AwemeStatistics statistics3 = aweme.getStatistics();
            if (statistics3 != null && statistics3.getCommentCount() == 0) {
                c2344009Gk.LJFF("zero_comment_prompt_type", C296070Bj3.LIZIZ() ? "fallback" : C296070Bj3.LIZ() ? "incentive" : "no");
            }
            C20684815ws.LJIILLIIL("press_comment_icon", c2344009Gk.LIZ);
        }
        if (Bp()) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            Aweme aweme2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
            CommentService.LIZ.getClass();
            if (C523420Kfs.LIZ().LJJI(aweme2) != EnumC733380Spk.ALLOW_COMMENT) {
                return;
            }
            int[] iArr = new int[4];
            Rect rect = new Rect();
            View viewIp = Ip();
            if (viewIp != null) {
                viewIp.getGlobalVisibleRect(rect);
            }
            iArr[0] = rect.left;
            iArr[1] = rect.top;
            iArr[2] = rect.right;
            iArr[3] = rect.bottom;
            C724270Sb3 c724270Sb34 = this.LLJI;
            DataCenter dataCenter = ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(iArr, "video_comment_button_long_click");
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C2487409ou.LIZJ(new ARunnableS111S0100000_11(this, 30));
        C732990Sp7 c732990Sp7 = this.LLLILZLLLI;
        if (c732990Sp7 != null) {
            C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, c732990Sp7);
        }
        if (((Number) C04R1.LIZ.getValue()).intValue() != 1) {
            ((Handler) this.LLLIILIL.getValue()).removeCallbacksAndMessages(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility
    public final Rect mt2() {
        View view = this.LLLIIL;
        if (view == null) {
            view = null;
        }
        if (view.getVisibility() != 0) {
            return null;
        }
        Rect rect = new Rect();
        View view2 = this.LLLIIL;
        (view2 != null ? view2 : null).getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility
    public final void Pb0() {
        Xp(2, LJJIJL());
    }

    public final void aq() {
        getContentView().setContentDescription(C1356620lPI.LIZ(C20642515q3.LJI(2131823206), C2097908Jt.LIZJ(new Pair("number", Gp().getText().toString()))));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Sp7, X.0cIr] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        if (C724240Sb0.LIZ(this) != null && C0CNZ.LIZJ()) {
            if (C0CN5.LJII()) {
                CommentService.LIZ.getClass();
                C523420Kfs.LIZ().LJJJLZIJ();
            } else {
                ?? r1 = new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0Sp7
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                        if (c1602200rnO2.LIZJ()) {
                            CommentService.LIZ.getClass();
                            C523420Kfs.LIZ().LJJJLZIJ();
                        }
                    }
                };
                C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, r1);
                this.LLLILZLLLI = r1;
            }
        }
    }

    public final void Ep(final View view) {
        if (C295030BhN.LIZ() && C277530AuF.LIZ()) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0SpY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, view);
        } else {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 12), view);
        }
        final a aVar = new a(0.6f, 150L);
        if (C295030BhN.LIZ()) {
            if (((Number) C04R1.LIZ.getValue()).intValue() == 1) {
                C637920P0k.LIZ(view, new ARunnableS44S0300000_11(aVar, this, view, 6));
            } else {
                C786410Ut5.LJJZZIII((Handler) this.LLLIILIL.getValue(), new Runnable() { // from class: X.0Sp5
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VideoCommentAssem@5078.configClickListener$4");
                        try {
                            this.LL.Up(view, aVar);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VideoCommentAssem@5078.configClickListener$4");
                    }
                });
            }
        }
        view.setOnTouchListener(aVar);
    }

    public final void Qp(View view) {
        Object obj;
        boolean zLJI = MethodIDManager.LJI(71884);
        ICommonFeedAppDiffProtocol.LIZ.getClass();
        ICommonFeedAppDiffProtocol iCommonFeedAppDiffProtocolLIZ = C1865480ye2.LIZ();
        view.getContext();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        ((VideoItemParams) obj2).getAweme();
        iCommonFeedAppDiffProtocolLIZ.LJFF(new AwS412S0200000_11(this, view, 22));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        boolean z = true;
        TuxTextView tuxTextView = null;
        if (!C302070Bsj.LIZLLL()) {
            this.LLLI = (TuxTextView) view.findViewById(R.id.ea6);
        } else {
            this.LLLI = (TuxTextView) view.findViewById(R.id.ea9);
            C2180521AVm.LIZLLL(view.findViewById(R.id.ea6), 8, C1AV3.LIZ(1, "Feed", null, "comment"));
        }
        this.LLLII = view.findViewById(R.id.ea2);
        this.LLLIIL = view.findViewById(R.id.ebd);
        this.LLLIIIIL = (ImageView) view.findViewById(R.id.eb6);
        this.LLLIIII = (ImageView) view.findViewById(R.id.eb2);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.eam);
        this.LLLIIIL = tuxTextView2;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.LJJJJI(36.0f);
        C732050Snb c732050Snb = new C732050Snb();
        c732050Snb.LIZIZ = view;
        c732050Snb.LIZJ = view.findViewById(R.id.ef3);
        c732050Snb.LIZLLL = Ip();
        c732050Snb.LJI = Gp();
        ImageView imageView = this.LLLIIIIL;
        if (imageView == null) {
            imageView = null;
        }
        c732050Snb.LJFF = imageView;
        TuxTextView tuxTextView3 = this.LLLIIIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        c732050Snb.LJII = tuxTextView3;
        Context context = getContext();
        if (context == null || C0SXF.LJIL(context)) {
            z = false;
        }
        c732050Snb.LIZ = z;
        ImageView imageView2 = this.LLLIIII;
        if (imageView2 == null) {
            imageView2 = null;
        }
        c732050Snb.LJ = imageView2;
        this.LLLILZ = c732050Snb;
        this.LLLILZJ = new C732910Soz();
        Ep(Ip());
        Ep(getContentView());
        Ep(Gp());
        TuxTextView tuxTextView4 = this.LLLIIIL;
        if (tuxTextView4 != null) {
            tuxTextView = tuxTextView4;
        }
        Ep(tuxTextView);
        Ep(view);
        q0.LJIJ(getContentView(), new C20094213jo() { // from class: X.0Sp6
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }

            @Override // X.C20094213jo
            public final boolean performAccessibilityAction(View view2, int i, Bundle bundle) {
                if (i == 16) {
                    this.LIZ.Qp(view2);
                    return true;
                }
                return super.performAccessibilityAction(view2, i, bundle);
            }
        });
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Rt5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C732090Snf(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Rt6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new C733020SpA(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Rsj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new C732950Sp3(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Rsp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIII;
            }
        }, C736820SvI.LIZLLL(), new C0SDQ(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Rsk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJI;
            }
        }, null, new C733030SpB(), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0Sn2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(61), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0SpI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLILLJJLI;
            }
        }, null, new C732900Soy(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0SpN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C733280Spa) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new C732920Sp0(), 4);
        C736680Sv4.LJIIIIZZ(this, Jp(), new C2217381BqS() { // from class: X.0SpF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C733080SpG) obj).LLILZLL);
            }
        }, null, new C0SDS(), 6);
        C736680Sv4.LJIIIIZZ(this, Jp(), new C2217381BqS() { // from class: X.0SpH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C733080SpG) obj).LL;
            }
        }, null, new C733010Sp9(), 6);
        C736680Sv4.LJIIIZ(this, Jp(), new C2217381BqS() { // from class: X.0SpL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C733080SpG) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0SpE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C733080SpG) obj).LLILZIL);
            }
        }, null, new C0SDR(), 12);
        C736680Sv4.LJIIIZ(this, Jp(), new C2217381BqS() { // from class: X.0SpD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C733080SpG) obj).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.0SpC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C733080SpG) obj).LLIZ);
            }
        }, null, new C732080Sne(), 12);
        C718860SHs.LIZ.getClass();
        if (C0QQX.LIZ) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0Rt4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILLL;
                }
            }, null, AFwS294S0000000_11.get$arr$(60), 6);
        }
        Wp();
        CommentService.LIZ.getClass();
        C523420Kfs.LIZ().LLIL();
        C2271391DvN.LIZ(Ip(), (C1A5L) C2271381DvM.LLLILZLLLI.getValue());
        C2271391DvN.LIZ(Gp(), (C1A5L) C2271381DvM.LLLIZZ.getValue());
        C2271391DvN.LIZ(getContentView(), (C1A5L) C2271381DvM.LLLJ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility
    public final void pl2(int i) {
        Object obj;
        String aid;
        Object obj2;
        Object obj3;
        InterfaceC736670Sv3 interfaceC736670Sv3LJJIJLIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openCommentPanel: jumpType=");
        sbLIZ.append(i);
        sbLIZ.append(", awemeId=");
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj4 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i == 2) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            DataCenter dataCenter = ((VideoItemParams) obj2).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(108, "video_comment_list");
            }
            IFeedService iFeedServiceLIZIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ();
            Context context = getContext();
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            String str = ((VideoItemParams) obj3).mEventType;
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            }
            InterfaceC1008930cMV interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(context, ((VideoItemParams) obj4).getAweme(), str, true);
            if (interfaceC1008930cMVLIZJ != null && (interfaceC736670Sv3LJJIJLIJ = interfaceC1008930cMVLIZJ.LJJIJLIJ()) != null) {
                interfaceC736670Sv3LJJIJLIJ.Kv1();
                return;
            }
            return;
        }
        Qp(LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        final VideoItemParams videoItemParams2 = videoItemParams;
        C786410Ut5.LJLLLLLL(0, getContentView());
        if (C1601690rmZ.LIZJ()) {
            aq();
        }
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
        if (C0CNZ.LIZIZ()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0Ocq
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoCommentAssem@5078.onBind$1");
                    try {
                        CommentService.LIZ.getClass();
                        CommentService commentServiceLIZ = C523420Kfs.LIZ();
                        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
                        Aweme aweme = videoItemParams2.getAweme();
                        String str = videoItemParams2.mEventType;
                        BaseFeedPageParams baseFeedPageParams = videoItemParams2.baseFeedPageParams;
                        commentServiceLIZ.LJL(c19egLIZ, aweme, str, baseFeedPageParams != null ? baseFeedPageParams.param : null);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoCommentAssem@5078.onBind$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility
    public final void vX1(String str) {
        AnimatorSet animatorSet;
        TuxTextView tuxTextView = this.LLLIIIL;
        final TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        TuxTextView tuxTextView3 = this.LLLIIIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setText(str);
        if (C2176211AEx.LIZIZ()) {
            final C732910Soz c732910Soz = this.LLLILZJ;
            if (c732910Soz != null) {
                final View view = this.LLLIIL;
                if (view == null) {
                    view = null;
                }
                TuxTextView tuxTextView4 = this.LLLIIIL;
                if (tuxTextView4 != null) {
                    tuxTextView2 = tuxTextView4;
                }
                final AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 284);
                if (c732910Soz.LIZJ) {
                    Iterator it2 = ((ArrayList) c732910Soz.LIZIZ).iterator();
                    while (it2.hasNext()) {
                        ((C21647019ng) it2.next()).LIZ();
                    }
                }
                c732910Soz.LIZJ = true;
                C732910Soz.LIZIZ(view, tuxTextView2);
                C786410Ut5.LJLLLLLL(0, tuxTextView2);
                C0HU7 c0hu7 = C0HU7.LIZ;
                C21647019ng c21647019ngLIZ = C0HU7.LIZ(c0hu7, view.getContext(), view, C1697810uHb.LJIIJJI(new C19746412Nq("source_scale_before_x", new C0HIW(1.0f, 0.0f)), new C19746412Nq("source_scale_before_y", new C0HIX(1.0f, 0.0f))), 0.0f, null, null, null, 248);
                C21647019ng c21647019ngLIZ2 = C0HU7.LIZ(c0hu7, tuxTextView2.getContext(), tuxTextView2, C1697810uHb.LJIIJJI(new C19746412Nq("target_scale_before_x", new C0HIW(0.0f, 1.0f)), new C19746412Nq("target_scale_before_y", new C0HIX(0.0f, 1.0f))), 0.0f, null, null, null, 248);
                c21647019ngLIZ.LIZJ("source_scale_before_x", new C738910Syf(c21647019ngLIZ2, 0));
                C21647019ng c21647019ngLIZ3 = C0HU7.LIZ(c0hu7, view.getContext(), view, C1697810uHb.LJIIJJI(new C19746412Nq("source_scale_after_x", new C0HIW(0.0f, 1.0f)), new C19746412Nq("source_scale_after_y", new C0HIX(0.0f, 1.0f))), 0.0f, null, null, null, 248);
                C21647019ng c21647019ngLIZ4 = C0HU7.LIZ(c0hu7, tuxTextView2.getContext(), tuxTextView2, C1697810uHb.LJIIJJI(new C19746412Nq("target_scale_after_x", new C0HIW(1.0f, 0.0f)), new C19746412Nq("target_scale_after_y", new C0HIX(1.0f, 0.0f))), 0.0f, null, null, null, 248);
                c21647019ngLIZ3.LIZLLL(1500L);
                c21647019ngLIZ4.LIZLLL(1500L);
                c21647019ngLIZ2.LIZJ("target_scale_before_x", new C738900Sye(c21647019ngLIZ3, c21647019ngLIZ4, 1));
                c21647019ngLIZ3.LIZJ("source_scale_after_x", new InterfaceC21641019mi() { // from class: X.0Sp8
                    @Override // X.InterfaceC21641019mi
                    public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    }

                    @Override // X.InterfaceC21641019mi
                    public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                        c732910Soz.LIZJ = false;
                        if (Intrinsics.LJFF(interfaceC1844880y6o.W5(), Boolean.TRUE)) {
                            C732910Soz c732910Soz2 = c732910Soz;
                            View view2 = view;
                            View view3 = tuxTextView2;
                            c732910Soz2.getClass();
                            C732910Soz.LIZIZ(view2, view3);
                            awS555S0100000_11.invoke();
                            return;
                        }
                        awS555S0100000_11.invoke();
                    }
                });
                c21647019ngLIZ.LJI(true);
                return;
            }
            return;
        }
        C732910Soz c732910Soz2 = this.LLLILZJ;
        if (c732910Soz2 != null) {
            View view2 = this.LLLIIL;
            if (view2 == null) {
                view2 = null;
            }
            TuxTextView tuxTextView5 = this.LLLIIIL;
            if (tuxTextView5 != null) {
                tuxTextView2 = tuxTextView5;
            }
            AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11(this, 285);
            AnimatorSet animatorSet2 = c732910Soz2.LIZ;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = c732910Soz2.LIZ) != null) {
                animatorSet.cancel();
            }
            C732910Soz.LIZIZ(view2, tuxTextView2);
            C786410Ut5.LJLLLLLL(0, tuxTextView2);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxTextView2, (Property<TuxTextView, Float>) View.SCALE_X, 1.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tuxTextView2, (Property<TuxTextView, Float>) View.SCALE_Y, 1.0f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet3.setInterpolator(C1619980sG4.LJIILIIL());
            animatorSet3.setDuration(166L);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            animatorSet4.setInterpolator(new InterpolatorC448120Hhi(4.0f));
            animatorSet4.setDuration(496L);
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playSequentially(animatorSet3, animatorSet4);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f);
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(tuxTextView2, (Property<TuxTextView, Float>) View.SCALE_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(tuxTextView2, (Property<TuxTextView, Float>) View.SCALE_Y, 0.0f);
            AnimatorSet animatorSet6 = new AnimatorSet();
            animatorSet6.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8);
            animatorSet6.setInterpolator(new InterpolatorC448120Hhi(4.0f));
            animatorSet6.setDuration(496L);
            animatorSet6.setStartDelay(1500L);
            AnimatorSet animatorSet7 = new AnimatorSet();
            animatorSet7.playSequentially(animatorSet5, animatorSet6);
            animatorSet7.addListener(new AAListenerS87S0400000_11(c732910Soz2, view2, tuxTextView2, awS555S0100000_112, 1));
            animatorSet7.addListener(new AAListenerS322S0100000_11(awS555S0100000_112, 21));
            c732910Soz2.LIZ = animatorSet7;
            animatorSet7.start();
        }
    }

    public final void Fp(int i, String str) {
        Object obj;
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        commentServiceLIZ.LJJIIZI(i, str, ((VideoItemParams) obj).mEventType);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility
    public final void Qe1(CharSequence charSequence, String str) {
        Object obj;
        String string;
        boolean z;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C737030Svd c737030Svd = new C737030Svd(7, ((VideoItemParams) obj).getAweme());
        if (str == null) {
            str = "FROM_AGENT";
        }
        c737030Svd.LJIIJ = str;
        if (charSequence != null) {
            string = charSequence.toString();
        } else {
            string = null;
        }
        c737030Svd.LJIILIIL = string;
        if (string != null && string.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        c737030Svd.LJIILJJIL = !z;
        this.LLLIZZ = c737030Svd;
        try {
            Xp(3, LJJIJL());
            this.LLLIZZ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLLIZZ = null;
            throw th;
        }
    }

    public final void Up(View view, a aVar) {
        boolean z;
        C732940Sp2 c732940Sp2;
        C732930Sp1 c732930Sp1;
        view.setHapticFeedbackEnabled(false);
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        if (((Number) C0BUK.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        C733180SpQ c733180SpQ = null;
        if (!z && (((Number) C296050Bj1.LIZ.getValue()).intValue() & 2) <= 0 && !C296030Biz.LIZ() && !C0CNZ.LIZJ() && !C0CNZ.LIZ()) {
            c732940Sp2 = null;
        } else {
            c732940Sp2 = new C732940Sp2(this);
        }
        if (C277530AuF.LIZ()) {
            c732930Sp1 = new C732930Sp1(this, view);
        } else {
            c732930Sp1 = null;
        }
        if (C277530AuF.LIZ()) {
            c733180SpQ = new C733180SpQ(this);
        }
        aVar.LLILLL = commentServiceLIZ.LJI(c732940Sp2, c732930Sp1, c733180SpQ);
        if (!C277530AuF.LIZ()) {
            view.setOnLongClickListener(new ViewOnLongClickListenerC738750SyP(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Vp(int r7, java.lang.String r8) {
        /*
            r6 = this;
            com.bytedance.tux.input.TuxTextView r4 = r6.Gp()
            java.lang.String r3 = "comment_assem"
            java.lang.String r2 = "2"
            java.lang.String r0 = "Feed"
            r1 = 0
            X.1AV2 r0 = X.C1AV3.LIZ(r2, r0, r1, r3)
            X.C2180521AVm.LIZLLL(r4, r7, r0)
            com.bytedance.tux.input.TuxTextView r0 = r6.Gp()
            r0.setText(r8)
            X.0Snb r3 = r6.LLLILZ
            if (r3 == 0) goto L6e
            java.lang.String r0 = "0"
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 != 0) goto L45
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L2b
            java.lang.Object r1 = r0.LL
        L2b:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r1
            if (r1 == 0) goto La8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getAweme()
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r0.getStatistics()
            if (r0 == 0) goto La8
            long r4 = r0.getCommentCount()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto La8
        L45:
            r0 = 1
        L46:
            r3.LJIIIIZZ = r0
            com.bytedance.tux.input.TuxTextView r2 = r3.LJI
            if (r2 == 0) goto L6e
            X.01GW r0 = X.C296070Bj3.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L6e
            boolean r0 = r3.LJIIIIZZ
            if (r0 == 0) goto L72
            X.01GW r0 = r3.LJIIJ
            java.lang.Object r0 = r0.getValue()
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r2.setTypeface(r0)
            r0 = 1093664768(0x41300000, float:11.0)
            r2.LJJJJI(r0)
        L6e:
            r6.aq()
            return
        L72:
            boolean r0 = X.C0HCN.LIZIZ()
            if (r0 == 0) goto L7e
            r0 = 82
            r2.setTuxFont(r0)
            goto L6e
        L7e:
            X.10Tv r1 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r1.LIZLLL()
            X.0sAQ r0 = r0.LJIJI()
            X.0Snn r0 = r0.LJJL()
            boolean r0 = r0.LJJII()
            if (r0 == 0) goto La2
            X.0sAf r0 = r1.LIZLLL()
            X.0sAQ r0 = r0.LJIJI()
            X.0Snn r0 = r0.LJJL()
            r0.LJII(r2)
            goto L6e
        La2:
            boolean r0 = r3.LIZ
            X.AbstractC731360SmU.LIZIZ(r2, r0)
            goto L6e
        La8:
            r0 = 0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem.Vp(int, java.lang.String):void");
    }

    public final void Xp(int i, View view) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        InterfaceC736670Sv3 interfaceC736670Sv3LJJIJLIJ;
        Object obj5;
        Object obj6;
        Object obj7;
        int i2;
        Object obj8;
        C737030Svd c737030Svd;
        Object obj9;
        int i3;
        int i4;
        Object obj10;
        boolean zLJI = MethodIDManager.LJI(71879);
        Object obj11 = null;
        if (i != 3) {
            C1590480rUU c1590480rUU = C1590480rUU.LIZ;
            View viewLJJIJL = LJJIJL();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj10 = c724270Sb3.LL;
            } else {
                obj10 = null;
            }
            String str = ((VideoItemParams) obj10).mEventType;
            c1590480rUU.getClass();
            C1590480rUU.LJ(viewLJJIJL, str, "comment");
            C733390Spl.LIZ("comment_icon_click");
            C0S90.LIZ();
        }
        int[] iArr = (int[]) C0C64.LJIILLIIL().LJJIIJ(true, "hybrid_test_experiment_int_array", 31744, int[].class, C733340Spg.LIZ, 1);
        if (iArr != null) {
            C13LQ.LJJLJ(iArr);
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        AwemeBizExtKt.setCommentClicked(aweme, true);
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj2 = c724270Sb33.LL;
        } else {
            obj2 = null;
        }
        DataCenter dataCenter = ((VideoItemParams) obj2).dataCenter;
        if (dataCenter != null) {
            dataCenter.zQ2(aweme.getAid(), "VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR");
        }
        Context context = getContext();
        if (context == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        EnumC733380Spk enumC733380SpkLJJI = ((CommentService) ServiceManager.get().getService(CommentService.class)).LJJI(aweme);
        if (enumC733380SpkLJJI == EnumC733380Spk.FTC) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(C0OAD.LIZ(2131858174, aweme));
            c1389890mGx.LJIIJJI();
            Fp(1, "ftc");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (enumC733380SpkLJJI != EnumC733380Spk.UNAVAILABLE && enumC733380SpkLJJI != EnumC733380Spk.DELETED) {
            CommentService.LIZ.getClass();
            C523420Kfs.LIZ().LLIIL();
            C730960Slq c730960SlqLIZ = C730960Slq.LIZ();
            ImageView imageView = this.LLLIIIIL;
            if (imageView == null) {
                imageView = null;
            }
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj3 = c724270Sb34.LL;
            } else {
                obj3 = null;
            }
            String str2 = ((VideoItemParams) obj3).mEventType;
            String strLIZJ = C735370Ssx.LIZJ(aweme);
            String strLIZLLL = C735370Ssx.LIZLLL(aweme);
            c730960SlqLIZ.getClass();
            C730960Slq.LIZIZ(imageView, 1, str2, strLIZJ, strLIZLLL, null);
            C1440005kM.LIZ(new C733170SpP());
            if (enumC733380SpkLJJI == EnumC733380Spk.PRIVATE) {
                Fp(1, "private");
                C547860LeC.LIZ.getClass();
                if (C547860LeC.LIZLLL().LIZ(aweme)) {
                    i4 = 2131826061;
                } else {
                    i4 = 2131845247;
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(view);
                c1389890mGx2.LJIIIZ(i4);
                c1389890mGx2.LJIIJJI();
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (enumC733380SpkLJJI == EnumC733380Spk.THIRD_PARTY) {
                Fp(1, "advertisement");
                C1389890mGx c1389890mGx3 = new C1389890mGx(view);
                c1389890mGx3.LJIIIZ(2131858551);
                c1389890mGx3.LJIIJJI();
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (enumC733380SpkLJJI == EnumC733380Spk.UNPUBLISHED) {
                Fp(1, "unpublished");
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (enumC733380SpkLJJI == EnumC733380Spk.ADVERTISEMENT) {
                Fp(1, "advertisement");
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZIZ(2131829184);
                c1233040iBy.LIZLLL();
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (enumC733380SpkLJJI == EnumC733380Spk.FORBIDDEN) {
                Fp(1, "advertisement");
                C1389890mGx c1389890mGx4 = new C1389890mGx(view);
                c1389890mGx4.LJIIIZ(2131829184);
                c1389890mGx4.LJIIJJI();
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (enumC733380SpkLJJI == EnumC733380Spk.NO_PERMISSION) {
                Fp(1, "advertisement");
                C1389890mGx c1389890mGx5 = new C1389890mGx(view);
                if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                    i3 = 2131829191;
                } else {
                    i3 = 2131829192;
                }
                c1389890mGx5.LJIIIZ(i3);
                c1389890mGx5.LJIIJJI();
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (enumC733380SpkLJJI == EnumC733380Spk.ALLOW_COMMENT) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && (c737030Svd = this.LLLIZZ) != null) {
                            C724270Sb3 c724270Sb35 = this.LLJI;
                            if (c724270Sb35 != null) {
                                obj9 = c724270Sb35.LL;
                            } else {
                                obj9 = null;
                            }
                            DataCenter dataCenter2 = ((VideoItemParams) obj9).dataCenter;
                            if (dataCenter2 != null) {
                                dataCenter2.zQ2(c737030Svd, "video_comment_list_from_agent");
                            }
                        }
                    } else {
                        C724270Sb3 c724270Sb36 = this.LLJI;
                        if (c724270Sb36 != null) {
                            obj8 = c724270Sb36.LL;
                        } else {
                            obj8 = null;
                        }
                        DataCenter dataCenter3 = ((VideoItemParams) obj8).dataCenter;
                        if (dataCenter3 != null) {
                            dataCenter3.zQ2(7, "video_comment_list_from_keyboard");
                        }
                    }
                } else {
                    C724270Sb3 c724270Sb37 = this.LLJI;
                    if (c724270Sb37 != null) {
                        obj5 = c724270Sb37.LL;
                    } else {
                        obj5 = null;
                    }
                    DataCenter dataCenter4 = ((VideoItemParams) obj5).dataCenter;
                    if (dataCenter4 != null) {
                        dataCenter4.zQ2(7, "video_comment_list");
                    }
                }
                if (C20684815ws.LJI("show_gift_icon")) {
                    C724270Sb3 c724270Sb38 = this.LLJI;
                    if (c724270Sb38 != null) {
                        obj6 = c724270Sb38.LL;
                    } else {
                        obj6 = null;
                    }
                    Aweme aweme2 = ((VideoItemParams) obj6).getAweme();
                    if (aweme2 != null && aweme2.getAid() != null) {
                        if (C733300Spc.LIZ.contains(aweme2.getAid())) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            C724270Sb3 c724270Sb39 = this.LLJI;
                            if (c724270Sb39 != null) {
                                obj7 = c724270Sb39.LL;
                            } else {
                                obj7 = null;
                            }
                            c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) obj7).mEventType);
                            c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(aweme2));
                            c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme2));
                            c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                            if (AwemeExtKt.getFollowStatus(aweme2) == 1) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            c2344009Gk.LIZJ(i2, "is_follow");
                            c2344009Gk.LIZJ(aweme2.isLike() ? 1 : 0, "is_like");
                            c2344009Gk.LJIIIIZZ("action_type", "click");
                            C20684815ws.LJIILLIIL("show_gift_icon", c2344009Gk.LIZ);
                        }
                    }
                }
            } else if (enumC733380SpkLJJI == EnumC733380Spk.NOT_ADX_AD) {
                Fp(1, "not_adx_ad");
                C1389890mGx c1389890mGx6 = new C1389890mGx(view);
                c1389890mGx6.LJIIIZ(2131828317);
                c1389890mGx6.LJIIJJI();
            } else {
                Fp(0, "not_allow");
            }
            IFeedService iFeedServiceLIZIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ();
            C724270Sb3 c724270Sb310 = this.LLJI;
            if (c724270Sb310 != null) {
                obj4 = c724270Sb310.LL;
            } else {
                obj4 = null;
            }
            String str3 = ((VideoItemParams) obj4).mEventType;
            C724270Sb3 c724270Sb311 = this.LLJI;
            if (c724270Sb311 != null) {
                obj11 = c724270Sb311.LL;
            }
            InterfaceC1008930cMV interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(context, ((VideoItemParams) obj11).getAweme(), str3, true);
            if (interfaceC1008930cMVLIZJ != null && (interfaceC736670Sv3LJJIJLIJ = interfaceC1008930cMVLIZJ.LJJIJLIJ()) != null) {
                interfaceC736670Sv3LJJIJLIJ.Kv1();
            }
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.G(aweme.getAid(), false);
            c1er1.LLD(aweme.getAid());
            C732910Soz c732910Soz = this.LLLILZJ;
            if (c732910Soz != null && c732910Soz.LIZLLL) {
                ((Keva) c732910Soz.LJFF.getValue()).storeInt(C732910Soz.LIZ(), 3);
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (AwemeExtKt.isImage(aweme)) {
            C1389890mGx c1389890mGx7 = new C1389890mGx(view);
            c1389890mGx7.LJIIIZ(2131835839);
            c1389890mGx7.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx8 = new C1389890mGx(view);
            c1389890mGx8.LJIIIZ(2131858174);
            c1389890mGx8.LJIIJJI();
        }
        if (AwemeExtKt.isDelete(aweme)) {
            Fp(1, "deleted");
        } else {
            Fp(1, "unavailable");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility
    public final boolean uY(float f, float f2) {
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
}
