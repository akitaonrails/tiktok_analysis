package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import X.C01GW;
import X.C03H5;
import X.C03ID;
import X.C06BY;
import X.C06LY;
import X.C07AA;
import X.C0NET;
import X.C0OB7;
import X.C0OBH;
import X.C0OBI;
import X.C0OBJ;
import X.C0P13;
import X.C0P2G;
import X.C0QB7;
import X.C0R68;
import X.C0R93;
import X.C0RD6;
import X.C0RE9;
import X.C0RES;
import X.C0RF0;
import X.C0RJN;
import X.C0RKF;
import X.C0RKO;
import X.C0RRR;
import X.C0SE4;
import X.C0SE5;
import X.C0SKM;
import X.C0SKN;
import X.C0SXF;
import X.C1017070cZd;
import X.C1057880ddS;
import X.C1076010e6h;
import X.C11NJ;
import X.C1246100iX2;
import X.C1253000iiA;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1618440sDa;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C1A5L;
import X.C1AF0;
import X.C1ER1;
import X.C20684815ws;
import X.C2177241AIw;
import X.C2177251AIx;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2276471E8n;
import X.C2344009Gk;
import X.C2487409ou;
import X.C2530409vq;
import X.C2540509xT;
import X.C269010AgV;
import X.C281310B0v;
import X.C298710BnJ;
import X.C299590Boj;
import X.C299850Bp9;
import X.C300390Bq1;
import X.C328100Ctc;
import X.C418440Gaw;
import X.C426750GoL;
import X.C430110Gtl;
import X.C452501pT;
import X.C549720LhC;
import X.C549760LhG;
import X.C578570Mmd;
import X.C608450Ntj;
import X.C614800O9m;
import X.C637980P0q;
import X.C690430R6j;
import X.C690870R8b;
import X.C694180RKu;
import X.C696150RSj;
import X.C696160RSk;
import X.C696170RSl;
import X.C699500RcC;
import X.C700450Rdj;
import X.C704010RjT;
import X.C704050RjX;
import X.C717590SCv;
import X.C717640SDa;
import X.C717650SDb;
import X.C717660SDc;
import X.C717670SDd;
import X.C717700SDg;
import X.C717710SDh;
import X.C717750SDl;
import X.C717760SDm;
import X.C717770SDn;
import X.C717830SDt;
import X.C717860SDw;
import X.C717870SDx;
import X.C717880SDy;
import X.C718100SEu;
import X.C722510SVt;
import X.C723580SZw;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729980SkG;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C844470XAv;
import X.C960203pA;
import X.EnumC1578206Fw;
import X.EnumC558410LvD;
import X.InterfaceC1554640qYg;
import X.InterfaceC1577520r9a;
import X.InterfaceC1659430tHh;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC558600LvW;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC710220RtU;
import X.InterfaceC899120ZPa;
import X.ViewOnClickListenerC1576306Fd;
import X.ViewOnTouchListenerC430680Gug;
import Y.ARunnableS80S0200000_11;
import Y.AfS180S0100000_11;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedActivityStatusAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import irm.AkS27S0300000_11;
import irm.AkS56S0200000_11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS125S1100000_11;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class VideoAuthorInfoRelationAssem extends BaseCellSlotComponent<VideoAuthorInfoRelationAssem> implements InteractInfoAuthorInfoAbility, ComponentPriorityProtocol, InterfaceC1554640qYg {
    public static final C717700SDg LLLLLLLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLLLLL;
    public boolean LLJLLIL;
    public int LLJLLL = -1;
    public int LLJZ = -1;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public FrameLayout LLLF;
    public InterfaceC899120ZPa LLLFF;
    public View LLLFFI;
    public View LLLFZ;
    public View LLLI;
    public TuxTextView LLLII;
    public C0QB7 LLLIIII;
    public LinearLayout LLLIIIIL;
    public TuxTextView LLLIIIL;
    public TuxIconView LLLIIL;
    public TuxIconView LLLIILIL;
    public TuxIconView LLLIL;
    public TuxTextView LLLILZ;
    public TuxTextView LLLILZJ;
    public final boolean LLLILZLLLI;
    public final C11NJ LLLIZZ;
    public final C01GW LLLJ;
    public List<MutualUser> LLLJIL;
    public final int LLLJL;
    public String LLLL;
    public String LLLLII;
    public final HashMap<String, String> LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final InterfaceC1731706qJ LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public final C01GW LLLLLL;
    public boolean LLLLLLIL;
    public final VideoAuthorInfoRelationAssem$descExpandModeProtocol$1 LLLLLLJ;
    public final C01GW LLLLLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoAuthorInfoRelationAssem.class, "authorInfoVM", "getAuthorInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/videoauthorinfo/VideoAuthorInfoVM;", 0);
        C13LE.LIZ.getClass();
        LLLLLLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLLLLLL = new C717700SDg();
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem$descExpandModeProtocol$1] */
    public VideoAuthorInfoRelationAssem() {
        this.LLLILZLLLI = C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1 ? false : C2530409vq.LIZ;
        this.LLLIZZ = new C11NJ();
        this.LLLJ = C452501pT.LIZIZ(new C704050RjX(this));
        this.LLLJL = 20;
        this.LLLL = "";
        this.LLLLII = "low_interest";
        this.LLLLIIIILLL = new HashMap<>();
        this.LLLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 278));
        this.LLLLIILL = C452501pT.LIZIZ(new C0OBI());
        this.LLLLIILLL = C452501pT.LIZIZ(new C696170RSl());
        this.LLLLIL = C452501pT.LIZIZ(new C696160RSk());
        this.LLLLILI = C452501pT.LIZIZ(new C696150RSj());
        this.LLLLJ = C452501pT.LIZIZ(new C0RKF(this));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoAuthorInfoVM.class);
        this.LLLLJI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new C0OBJ(c19719912DlLIZ), null, new C717860SDw());
        this.LLLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C717870SDx());
        this.LLLLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C717880SDy());
        this.LLLLLILLIL = C452501pT.LIZIZ(new C0P2G(this));
        this.LLLLLJIL = C452501pT.LIZIZ(new C0RKO(this));
        this.LLLLLJLJLL = C452501pT.LIZIZ(new C0OBH(this));
        this.LLLLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 274));
        this.LLLLLLJ = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem$descExpandModeProtocol$1
        };
        this.LLLLLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 275));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.InteractInfoAuthorInfoAbility
    public final int JV0() {
        int[] iArr = new int[2];
        LJJIJL().getLocationOnScreen(iArr);
        return iArr[1];
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_5;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1293470206) {
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

    public final void Jp() {
        int width;
        TuxTextView tuxTextView = this.LLJZIJLIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        if (tuxTextView.getParent() == null) {
            return;
        }
        int iLIZIZ = C718100SEu.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        int width2 = tuxTextView2.getWidth();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ensureTitleViewWidth] title = ");
        TuxTextView tuxTextView3 = this.LLJZIJLIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        sbLIZ.append((Object) tuxTextView3.getText());
        sbLIZ.append(", width = ");
        sbLIZ.append(width2);
        sbLIZ.append(", minTitleWidth = ");
        sbLIZ.append(iLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[ensureTitleViewWidth] time = ");
        TuxTextView tuxTextView4 = this.LLL;
        if (tuxTextView4 == null) {
            tuxTextView4 = null;
        }
        sbLIZ2.append((Object) tuxTextView4.getText());
        sbLIZ2.append(", timeWidth = ");
        TuxTextView tuxTextView5 = this.LLL;
        if (tuxTextView5 == null) {
            tuxTextView5 = null;
        }
        sbLIZ2.append(tuxTextView5.getWidth());
        C2188811AlT.LIZIZ(sbLIZ2);
        if (width2 >= iLIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) {
            return;
        }
        TuxTextView tuxTextView6 = this.LLJZIJLIL;
        if (tuxTextView6 == null) {
            tuxTextView6 = null;
        }
        Layout layout = tuxTextView6.getLayout();
        if (layout == null) {
            return;
        }
        if (layout.getEllipsisCount(layout.getLineCount() - 1) > 0 || width2 <= 0) {
            GenrePriorityAbility genrePriorityAbilityVp = Vp();
            int iTr2 = genrePriorityAbilityVp != null ? genrePriorityAbilityVp.tr2() : 0;
            LinearLayout linearLayout = this.LLLIIIIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            if (linearLayout.getVisibility() == 0) {
                LinearLayout linearLayout2 = this.LLLIIIIL;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                width = linearLayout2.getWidth();
            } else {
                width = 0;
            }
            int iWp = Wp() - iLIZIZ;
            TuxTextView tuxTextView7 = this.LLL;
            if (tuxTextView7 == null) {
                tuxTextView7 = null;
            }
            ViewGroup.LayoutParams layoutParams = tuxTextView7.getLayoutParams();
            int marginStart = ((iWp - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0)) - iTr2) - width;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[ensureTitleViewWidth] maxTitleLineWidth = ");
            sbLIZ3.append(Wp());
            sbLIZ3.append(", maxWidth = ");
            sbLIZ3.append(marginStart);
            sbLIZ3.append(", minTitleWidth = ");
            sbLIZ3.append(iLIZIZ);
            sbLIZ3.append(", genreTagWidth = ");
            sbLIZ3.append(iTr2);
            sbLIZ3.append(", collabWidth = ");
            sbLIZ3.append(width);
            sbLIZ3.append(", postTimeView.marginStart = ");
            TuxTextView tuxTextView8 = this.LLL;
            if (tuxTextView8 == null) {
                tuxTextView8 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = tuxTextView8.getLayoutParams();
            sbLIZ3.append(layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (C718100SEu.LIZIZ()) {
                TuxTextView tuxTextView9 = this.LLL;
                if (tuxTextView9 == null) {
                    tuxTextView9 = null;
                }
                if (tuxTextView9.getWidth() < marginStart) {
                    TuxTextView tuxTextView10 = this.LLL;
                    C786410Ut5.LLLLZLL(tuxTextView10 != null ? tuxTextView10 : null, 8);
                    return;
                }
            }
            TuxTextView tuxTextView11 = this.LLL;
            (tuxTextView11 != null ? tuxTextView11 : null).setMaxWidth(marginStart);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.InteractInfoAuthorInfoAbility
    public final boolean Nv() {
        return this.LLJZIJLIL != null;
    }

    public final VideoAuthorInfoVM Qp() {
        return (VideoAuthorInfoVM) this.LLLLJI.getValue(this, LLLLLLLLLL[0]);
    }

    public final boolean Up() {
        return ((Boolean) this.LLLLLLL.getValue()).booleanValue();
    }

    public final GenrePriorityAbility Vp() {
        return (GenrePriorityAbility) this.LLLLLJIL.getValue();
    }

    public final int Wp() {
        return ((Number) this.LLLLIIL.getValue()).intValue();
    }

    public final int Xp() {
        return ((Number) this.LLLLILI.getValue()).intValue();
    }

    public final boolean dq() {
        return ((Boolean) this.LLLLLJLJLL.getValue()).booleanValue();
    }

    public final boolean fq() {
        return ((Boolean) this.LLLLJ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    public final boolean tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        return aweme != null && AwemeExtKt.isPhotoMode(aweme) && C0SKM.LJIIIIZZ().blockCheckColor;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return (!fq() || C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this))) ? "left_container_author" : "title_container_author";
    }

    public final void Ip() {
        if (Up() || C718100SEu.LIZIZ()) {
            if (!C718100SEu.LIZ()) {
                TuxTextView tuxTextView = this.LLJZIJLIL;
                C430110Gtl.LIZ(tuxTextView != null ? tuxTextView : null, new AwS555S0100000_11(this, 276));
                return;
            }
            TuxTextView tuxTextView2 = this.LLJZIJLIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            C0SE4 c0se4 = new C0SE4(tuxTextView2, new AwS555S0100000_11(this, 277));
            TuxTextView tuxTextView3 = this.LLJZIJLIL;
            C786410Ut5.x3((tuxTextView3 != null ? tuxTextView3 : null).getViewTreeObserver(), c0se4);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Tp() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r4 = r0.getCurUser()
            X.0Sb3 r0 = r5.LLJI
            r3 = 0
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.LL
        L11:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.feed.model.CollabInfo r0 = r0.getCollabInfo()
            if (r0 == 0) goto L52
            java.util.List<com.ss.android.ugc.aweme.feed.model.CollaboratorInfo> r1 = r0.collaborators
            if (r1 == 0) goto L52
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.CollaboratorInfo r0 = (com.ss.android.ugc.aweme.feed.model.CollaboratorInfo) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r0 = r0.getUid()
            r2.add(r0)
            goto L34
        L4a:
            r0 = r3
            goto L11
        L4c:
            java.util.Set r2 = X.C13LP.LLIIJI(r2)
            if (r2 != 0) goto L54
        L52:
            X.08CX r2 = X.C08CX.INSTANCE
        L54:
            java.lang.String r1 = r4.getUid()
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.LL
        L5e:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L6c
            java.lang.String r3 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
        L6c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L77
            java.lang.String r0 = "author"
            return r0
        L75:
            r0 = r3
            goto L5e
        L77:
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L80
            java.lang.String r0 = "collaber"
            return r0
        L80:
            java.lang.String r0 = "user"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem.Tp():java.lang.String");
    }

    public final void kq() {
        GenrePriorityAbility genrePriorityAbilityVp;
        if (!fq() || C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this))) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (aq(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) < Wp() || (genrePriorityAbilityVp = Vp()) == null) {
            return;
        }
        genrePriorityAbilityVp.rO1();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLLLLLJ));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void wr() {
        C717590SCv c717590SCv = Qp().LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoAuthorInfoVM.LLILZ;
        c717590SCv.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public final void Bp(CharSequence charSequence) {
        String string;
        boolean z = false;
        if (((Number) C269010AgV.LIZ.getValue()).intValue() == 1) {
            if (charSequence != null && (string = charSequence.toString()) != null && string.length() == 1) {
                z = true;
            }
            TuxTextView tuxTextView = null;
            if (z) {
                TuxTextView tuxTextView2 = this.LLJZIJLIL;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                tuxTextView2.setEllipsize(null);
                return;
            }
            TuxTextView tuxTextView3 = this.LLJZIJLIL;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        TuxTextView tuxTextView;
        LinearLayout.LayoutParams layoutParams;
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().observe(this, new Observer() { // from class: X.0SDu
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    C1243340iSa c1243340iSa = (C1243340iSa) obj;
                    if (Intrinsics.LJFF(c1243340iSa.LIZ, AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme()))) {
                        VideoAuthorInfoVM videoAuthorInfoVMQp = this.LL.Qp();
                        String str = c1243340iSa.LIZIZ;
                        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LL);
                        videoAuthorInfoVMQp.getClass();
                        videoAuthorInfoVMQp.setState(new AwS125S1100000_11(videoItemParams, str, 5));
                    }
                }
            });
        }
        try {
            TuxTextView tuxTextView2 = null;
            if (C718100SEu.LIZIZ()) {
                TuxTextView tuxTextView3 = this.LLL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                tuxTextView3.setTuxFont(62);
                TuxTextView tuxTextView4 = this.LLL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = tuxTextView4.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.gravity = 16;
                }
            } else {
                TuxTextView tuxTextView5 = this.LLL;
                if (tuxTextView5 != null) {
                    tuxTextView2 = tuxTextView5;
                }
                tuxTextView2.setTuxFont(42);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (C718100SEu.LIZ() && (tuxTextView = this.LLL) != null) {
            C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0SE2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
    }

    public final boolean Fp(String str) {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        Object obj;
        Object obj2;
        LLLLLLLLL.getClass();
        if (Intrinsics.LJFF(C717700SDg.LIZIZ(str), Boolean.TRUE)) {
            return true;
        }
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        Object obj3 = null;
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            if (interfaceC1577520r9aLIZIZ.LIZIZ(aweme, ((VideoItemParams) obj2).mEventType)) {
                return true;
            }
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        }
        if (C637980P0q.LIZ(((VideoItemParams) obj3).getAweme()) && TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }

    public final void Gp(Aweme aweme) {
        int size;
        List<InteractionTagUserInfo> list;
        int iRO1;
        this.LLLLII = "low_interest";
        TuxTextView tuxTextView = this.LLLII;
        View view = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        String strVQ2 = Qp().vQ2(aweme);
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Xp() + ((Number) this.LLLLIL.getValue()).intValue() + 12))) + tuxTextView.getPaint().measureText(strVQ2);
        int iAq = aq(aweme);
        if (iAq + fLIZIZ >= Wp()) {
            GenrePriorityAbility genrePriorityAbilityVp = Vp();
            if (genrePriorityAbilityVp != null) {
                iRO1 = genrePriorityAbilityVp.rO1();
            } else {
                iRO1 = 0;
            }
            iAq -= iRO1;
        }
        if (iAq + fLIZIZ >= Wp()) {
            InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
            if (interactionTagInfo != null && (list = interactionTagInfo.taggedUsers) != null) {
                size = list.size();
            } else {
                size = 1;
            }
            tuxTextView.setText(String.valueOf(size));
        } else {
            tuxTextView.setText(strVQ2);
        }
        View view2 = this.LLLI;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.LJLLLLLL(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int aq(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem.aq(com.ss.android.ugc.aweme.feed.model.Aweme):int");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_component_clickable", new C717770SDn(this));
    }

    public final void jq(Aweme aweme) {
        Object obj;
        List<User> listLIZJ;
        C690870R8b c690870R8b;
        String str;
        int i;
        int iRO1;
        int iRO12;
        Object obj2;
        String uid;
        C2189821An6 c2189821An6;
        Object obj3;
        List<User> listLIZJ2;
        Object obj4;
        String uid2;
        Object obj5;
        String str2;
        int iRO13;
        C2189821An6 c2189821An62;
        Object obj6;
        String uid3;
        C2189821An6 c2189821An63;
        if (C2540509xT.LIZIZ()) {
            int iLIZ = C2540509xT.LIZ();
            int i2 = 0;
            String quantityString = "";
            if (iLIZ != 1) {
                if (iLIZ == 3) {
                    C717700SDg c717700SDg = LLLLLLLLL;
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    if (c724270Sb3 != null) {
                        obj3 = c724270Sb3.LL;
                    } else {
                        obj3 = null;
                    }
                    c717700SDg.getClass();
                    if (C717700SDg.LIZJ((VideoItemParams) obj3)) {
                        C724270Sb3 c724270Sb32 = this.LLJI;
                        if (c724270Sb32 != null) {
                            obj6 = c724270Sb32.LL;
                        } else {
                            obj6 = null;
                        }
                        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj6).baseFeedPageParams;
                        if (baseFeedPageParams == null || (c2189821An63 = baseFeedPageParams.param) == null || (uid3 = c2189821An63.getUid()) == null) {
                            uid3 = "";
                        }
                        listLIZJ2 = C328100Ctc.LIZLLL(aweme, uid3);
                    } else {
                        listLIZJ2 = C328100Ctc.LIZJ(aweme);
                    }
                    ArrayList arrayList = new ArrayList(listLIZJ2);
                    C724270Sb3 c724270Sb33 = this.LLJI;
                    if (c724270Sb33 != null) {
                        obj4 = c724270Sb33.LL;
                    } else {
                        obj4 = null;
                    }
                    BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) obj4).baseFeedPageParams;
                    if (baseFeedPageParams2 == null || (c2189821An62 = baseFeedPageParams2.param) == null || (uid2 = c2189821An62.getUid()) == null) {
                        uid2 = "";
                    }
                    C724270Sb3 c724270Sb34 = this.LLJI;
                    if (c724270Sb34 != null) {
                        obj5 = c724270Sb34.LL;
                    } else {
                        obj5 = null;
                    }
                    BaseFeedPageParams baseFeedPageParams3 = ((VideoItemParams) obj5).baseFeedPageParams;
                    if (baseFeedPageParams3 == null || (str2 = baseFeedPageParams3.eventType) == null) {
                        str2 = "";
                    }
                    User userLIZ = C328100Ctc.LIZ(aweme, uid2, str2);
                    boolean zLJ = C328100Ctc.LJ(aweme);
                    if (zLJ) {
                        Object[] objArr = new Object[4];
                        Object obj7 = this.LLLIL;
                        if (obj7 == null) {
                            obj7 = null;
                        }
                        objArr[0] = obj7;
                        Object obj8 = this.LLLILZJ;
                        if (obj8 == null) {
                            obj8 = null;
                        }
                        objArr[1] = obj8;
                        Object obj9 = this.LLLILZ;
                        if (obj9 == null) {
                            obj9 = null;
                        }
                        objArr[2] = obj9;
                        Object obj10 = this.LLJZIJLIL;
                        if (obj10 == null) {
                            obj10 = null;
                        }
                        objArr[3] = obj10;
                        Iterator it2 = C1697810uHb.LJIIJJI(objArr).iterator();
                        while (it2.hasNext()) {
                            C786410Ut5.I7(new AkS56S0200000_11(this, aweme, 5), (View) it2.next());
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (zLJ) {
                            TuxIconView tuxIconView = this.LLLIL;
                            if (tuxIconView == null) {
                                tuxIconView = null;
                            }
                            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                            TuxTextView tuxTextView = this.LLLILZJ;
                            if (tuxTextView == null) {
                                tuxTextView = null;
                            }
                            C786410Ut5.LLLLZLL(tuxTextView, 0);
                            TuxTextView tuxTextView2 = this.LLLILZ;
                            if (tuxTextView2 == null) {
                                tuxTextView2 = null;
                            }
                            C786410Ut5.LLLLZLL(tuxTextView2, 0);
                            tuxTextView2.setText(LJJIJL().getContext().getString(2131828914));
                        } else {
                            TuxIconView tuxIconView2 = this.LLLIL;
                            if (tuxIconView2 == null) {
                                tuxIconView2 = null;
                            }
                            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                            TuxTextView tuxTextView3 = this.LLLILZ;
                            if (tuxTextView3 == null) {
                                tuxTextView3 = null;
                            }
                            C786410Ut5.LLLLZLL(tuxTextView3, 8);
                            TuxTextView tuxTextView4 = this.LLLILZJ;
                            if (tuxTextView4 == null) {
                                tuxTextView4 = null;
                            }
                            C786410Ut5.LLLLZLL(tuxTextView4, 8);
                            kq();
                        }
                    } else {
                        TuxTextView tuxTextView5 = this.LLLILZJ;
                        if (tuxTextView5 == null) {
                            tuxTextView5 = null;
                        }
                        C786410Ut5.LLLLZLL(tuxTextView5, 0);
                        TuxIconView tuxIconView3 = this.LLLIL;
                        if (tuxIconView3 == null) {
                            tuxIconView3 = null;
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                        if (userLIZ != null) {
                            ListProtector.add(arrayList, 0, userLIZ);
                            List<User> listLL = C13LP.LL(arrayList, 2);
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                            for (User user : listLL) {
                                String uid4 = user.getUid();
                                if (uid4 == null) {
                                    uid4 = "";
                                }
                                String nickname = user.getNickname();
                                if (nickname == null) {
                                    nickname = "";
                                }
                                arrayList2.add(new MutualUser(uid4, nickname, user.getAvatarThumb(), user.getAvatarThumb(), "", null));
                            }
                            Ep(new MutualStruct(0, 2, arrayList2, 0), tuxIconView3);
                        }
                        if (arrayList.size() == 2) {
                            User user2 = (User) ListProtector.get(arrayList, 1);
                            String nickname2 = user2.getNickname();
                            if (nickname2 == null) {
                                String uniqueId = user2.getUniqueId();
                                if (uniqueId != null) {
                                    quantityString = uniqueId;
                                }
                            } else {
                                quantityString = nickname2;
                            }
                            int iAq = aq(aweme);
                            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            TuxTextView tuxTextView6 = this.LLLILZ;
                            if (tuxTextView6 == null) {
                                tuxTextView6 = null;
                            }
                            float fMeasureText = fLIZIZ + tuxTextView6.getPaint().measureText(quantityString);
                            TuxTextView tuxTextView7 = this.LLLILZJ;
                            if (tuxTextView7 == null) {
                                tuxTextView7 = null;
                            }
                            float fMeasureText2 = iAq + fMeasureText + tuxTextView7.getPaint().measureText(LJJIJL().getContext().getString(2131828913));
                            if (fMeasureText2 > Wp()) {
                                GenrePriorityAbility genrePriorityAbilityVp = Vp();
                                if (genrePriorityAbilityVp != null) {
                                    iRO13 = genrePriorityAbilityVp.rO1();
                                } else {
                                    iRO13 = 0;
                                }
                                if (fMeasureText2 - iRO13 > Wp()) {
                                    C844470XAv.LIZ.getClass();
                                    quantityString = C844470XAv.LIZ().getResources().getQuantityString(2131755140, 1, 1);
                                }
                            }
                            TuxTextView tuxTextView8 = this.LLLILZ;
                            if (tuxTextView8 == null) {
                                tuxTextView8 = null;
                            }
                            C786410Ut5.LLLLZLL(tuxTextView8, 0);
                            tuxTextView8.setText(quantityString);
                        } else {
                            TuxTextView tuxTextView9 = this.LLLILZ;
                            if (tuxTextView9 == null) {
                                tuxTextView9 = null;
                            }
                            C786410Ut5.LLLLZLL(tuxTextView9, 0);
                            C844470XAv.LIZ.getClass();
                            tuxTextView9.setText(C844470XAv.LIZ().getResources().getQuantityString(2131755140, arrayList.size() - 1, Integer.valueOf(arrayList.size() - 1)));
                        }
                    }
                }
            } else if (this.LLLIIIIL != null) {
                C717700SDg c717700SDg2 = LLLLLLLLL;
                C724270Sb3 c724270Sb35 = this.LLJI;
                if (c724270Sb35 != null) {
                    obj = c724270Sb35.LL;
                } else {
                    obj = null;
                }
                c717700SDg2.getClass();
                if (C717700SDg.LIZJ((VideoItemParams) obj)) {
                    C724270Sb3 c724270Sb36 = this.LLJI;
                    if (c724270Sb36 != null) {
                        obj2 = c724270Sb36.LL;
                    } else {
                        obj2 = null;
                    }
                    BaseFeedPageParams baseFeedPageParams4 = ((VideoItemParams) obj2).baseFeedPageParams;
                    if (baseFeedPageParams4 == null || (c2189821An6 = baseFeedPageParams4.param) == null || (uid = c2189821An6.getUid()) == null) {
                        uid = "";
                    }
                    listLIZJ = C328100Ctc.LIZLLL(aweme, uid);
                } else {
                    listLIZJ = C328100Ctc.LIZJ(aweme);
                }
                LinearLayout linearLayout = this.LLLIIIIL;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                if (C300390Bq1.LIZ()) {
                    linearLayout.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                }
                TuxIconView tuxIconView4 = null;
                TuxIconView tuxIconView5 = null;
                LinearLayout linearLayout2 = null;
                C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
                if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
                    c690870R8b = new C690870R8b();
                    if (C299590Boj.LIZ()) {
                        C1AF0.LIZJ("can not find hierarchyData: cellContext");
                        c690870R8b.LIZIZ = "cell_unknown";
                    }
                }
                C0RF0 c0rf0 = c690870R8b.LIZLLL;
                if (c0rf0 != null) {
                    str = c0rf0.LJIIIZ;
                } else {
                    str = null;
                }
                if (C704010RjT.LJ(str)) {
                    TuxTextView tuxTextView10 = this.LLLIIIL;
                    if (tuxTextView10 == null) {
                        tuxTextView10 = null;
                    }
                    C704010RjT.LIZLLL(tuxTextView10);
                    LinearLayout linearLayout3 = this.LLLIIIIL;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    C704010RjT.LIZIZ(linearLayout3);
                    C704010RjT.LIZJ(this.LLLIIL);
                }
                C786410Ut5.I7(new AkS27S0300000_11(linearLayout, this, aweme, 0), linearLayout);
                if (listLIZJ.isEmpty()) {
                    if (C328100Ctc.LJ(aweme)) {
                        LinearLayout linearLayout4 = this.LLLIIIIL;
                        if (linearLayout4 == null) {
                            linearLayout4 = null;
                        }
                        if (C0SXF.LJIL(getContext())) {
                            i2 = 8;
                        }
                        C786410Ut5.LJZL(i2, linearLayout4);
                        TuxTextView tuxTextView11 = this.LLLIIIL;
                        if (tuxTextView11 == null) {
                            tuxTextView11 = null;
                        }
                        tuxTextView11.setText(LJJIJL().getContext().getString(2131828922));
                        TuxIconView tuxIconView6 = this.LLLIILIL;
                        if (tuxIconView6 != null) {
                            tuxIconView5 = tuxIconView6;
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
                    } else {
                        LinearLayout linearLayout5 = this.LLLIIIIL;
                        if (linearLayout5 != null) {
                            linearLayout2 = linearLayout5;
                        }
                        C786410Ut5.LJZL(8, linearLayout2);
                        kq();
                    }
                } else {
                    TuxTextView tuxTextView12 = this.LLLIIIL;
                    if (tuxTextView12 == null) {
                        tuxTextView12 = null;
                    }
                    LinearLayout linearLayout6 = this.LLLIIIIL;
                    if (linearLayout6 == null) {
                        linearLayout6 = null;
                    }
                    if (!C0SXF.LJIL(getContext())) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJZL(i, linearLayout6);
                    int iAq2 = aq(aweme);
                    if (listLIZJ.size() == 1) {
                        User user3 = (User) C13LP.LJJJJZI(listLIZJ);
                        String nickname3 = user3.getNickname();
                        if (nickname3 == null || (nickname3.length() == 0 && (nickname3 = user3.getUniqueId()) == null)) {
                            nickname3 = "";
                        }
                        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + tuxTextView12.getPaint().measureText(nickname3) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)) + iAq2;
                        if (fLIZIZ2 > Wp()) {
                            GenrePriorityAbility genrePriorityAbilityVp2 = Vp();
                            if (genrePriorityAbilityVp2 != null) {
                                iRO12 = genrePriorityAbilityVp2.rO1();
                            } else {
                                iRO12 = 0;
                            }
                            fLIZIZ2 -= iRO12;
                        }
                        if (fLIZIZ2 > Wp()) {
                            C786410Ut5.LLLLZLL(tuxTextView12, 8);
                        } else {
                            C786410Ut5.LLLLZLL(tuxTextView12, 0);
                            tuxTextView12.setText(nickname3);
                        }
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
                        for (User user4 : listLIZJ) {
                            String uid5 = user4.getUid();
                            if (uid5 == null) {
                                uid5 = "";
                            }
                            String nickname4 = user4.getNickname();
                            if (nickname4 == null) {
                                nickname4 = "";
                            }
                            arrayList3.add(new MutualUser(uid5, nickname4, user4.getAvatarThumb(), user4.getAvatarThumb(), "", null));
                        }
                        MutualStruct mutualStruct = new MutualStruct(0, 1, arrayList3, 0);
                        TuxIconView tuxIconView7 = this.LLLIILIL;
                        if (tuxIconView7 == null) {
                            tuxIconView7 = null;
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView7, 0);
                        TuxIconView tuxIconView8 = this.LLLIILIL;
                        if (tuxIconView8 != null) {
                            tuxIconView4 = tuxIconView8;
                        }
                        Ep(mutualStruct, tuxIconView4);
                    } else {
                        C786410Ut5.LLLLZLL(tuxTextView12, 0);
                        List<User> listLL2 = C13LP.LL(listLIZJ, 2);
                        C844470XAv.LIZ.getClass();
                        String quantityString2 = C844470XAv.LIZ().getResources().getQuantityString(2131755142, listLIZJ.size(), Integer.valueOf(listLIZJ.size()));
                        float fLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + tuxTextView12.getPaint().measureText(quantityString2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + iAq2;
                        if (fLIZIZ3 > Wp()) {
                            GenrePriorityAbility genrePriorityAbilityVp3 = Vp();
                            if (genrePriorityAbilityVp3 != null) {
                                iRO1 = genrePriorityAbilityVp3.rO1();
                            } else {
                                iRO1 = 0;
                            }
                            fLIZIZ3 -= iRO1;
                        }
                        if (fLIZIZ3 > Wp()) {
                            String strValueOf = String.valueOf(listLIZJ.size());
                            float fMeasureText3 = fLIZIZ3 - (tuxTextView12.getPaint().measureText(quantityString2) - tuxTextView12.getPaint().measureText(strValueOf));
                            tuxTextView12.setText(strValueOf);
                            if (fMeasureText3 > Wp()) {
                                TuxIconView tuxIconView9 = this.LLLIILIL;
                                if (tuxIconView9 == null) {
                                    tuxIconView9 = null;
                                }
                                C786410Ut5.LLLLLLZZ(tuxIconView9, 8);
                            } else {
                                TuxIconView tuxIconView10 = this.LLLIILIL;
                                if (tuxIconView10 == null) {
                                    tuxIconView10 = null;
                                }
                                C786410Ut5.LLLLLLZZ(tuxIconView10, 0);
                                int size = listLL2.size();
                                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLL2, 10));
                                for (User user5 : listLL2) {
                                    String uid6 = user5.getUid();
                                    if (uid6 == null) {
                                        uid6 = "";
                                    }
                                    String nickname5 = user5.getNickname();
                                    if (nickname5 == null) {
                                        nickname5 = "";
                                    }
                                    arrayList4.add(new MutualUser(uid6, nickname5, user5.getAvatarThumb(), user5.getAvatarThumb(), "", null));
                                }
                                MutualStruct mutualStruct2 = new MutualStruct(0, size, arrayList4, 0);
                                TuxIconView tuxIconView11 = this.LLLIILIL;
                                if (tuxIconView11 == null) {
                                    tuxIconView11 = null;
                                }
                                Ep(mutualStruct2, tuxIconView11);
                            }
                        } else {
                            tuxTextView12.setText(quantityString2);
                            TuxIconView tuxIconView12 = this.LLLIILIL;
                            if (tuxIconView12 == null) {
                                tuxIconView12 = null;
                            }
                            C786410Ut5.LLLLLLZZ(tuxIconView12, 0);
                            int size2 = listLL2.size();
                            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLL2, 10));
                            for (User user6 : listLL2) {
                                String uid7 = user6.getUid();
                                if (uid7 == null) {
                                    uid7 = "";
                                }
                                String nickname6 = user6.getNickname();
                                if (nickname6 == null) {
                                    nickname6 = "";
                                }
                                arrayList5.add(new MutualUser(uid7, nickname6, user6.getAvatarThumb(), user6.getAvatarThumb(), "", null));
                            }
                            MutualStruct mutualStruct3 = new MutualStruct(0, size2, arrayList5, 0);
                            TuxIconView tuxIconView13 = this.LLLIILIL;
                            if (tuxIconView13 == null) {
                                tuxIconView13 = null;
                            }
                            Ep(mutualStruct3, tuxIconView13);
                        }
                    }
                }
            }
            Ip();
        }
    }

    public final void lq(Aweme aweme) {
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem;
        int iRO1;
        int iLIZIZ;
        List<InteractionTagUserInfo> list;
        AwemeCommerceStruct commerceVideoAuthInfo;
        InteractionTagInfo interactionTagInfo;
        List<InteractionTagUserInfo> list2;
        int i = 0;
        if (C298710BnJ.LIZIZ() > 0) {
            View view = null;
            if (!C729980SkG.LJIIIIZZ(aweme)) {
                videoAuthorInfoRelationAssem = this;
            } else {
                videoAuthorInfoRelationAssem = null;
            }
            if (videoAuthorInfoRelationAssem != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isBrandedContent() && (interactionTagInfo = aweme.getInteractionTagInfo()) != null && (list2 = interactionTagInfo.taggedUsers) != null) {
                ArrayList arrayList = new ArrayList();
                for (InteractionTagUserInfo interactionTagUserInfo : list2) {
                    InteractionTagUserInfo interactionTagUserInfo2 = interactionTagUserInfo;
                    if (interactionTagUserInfo2.isBusinessAccount() && interactionTagUserInfo2.invitationStatus != 2) {
                        arrayList.add(interactionTagUserInfo);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    list2.remove(it2.next());
                }
            }
            if (aweme.getInteractionTagInfo() == null) {
                View view2 = this.LLLI;
                if (view2 != null) {
                    view = view2;
                }
                C786410Ut5.LJLLLLLL(8, view);
                kq();
                return;
            }
            View view3 = this.LLLI;
            if (view3 == null) {
                view3 = null;
            }
            if (C300390Bq1.LIZ()) {
                view3.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            }
            InteractionTagInfo interactionTagInfo2 = aweme.getInteractionTagInfo();
            if (interactionTagInfo2 != null && interactionTagInfo2.interestLevel == InteractionTagInterestLevel.HIGH.getLevel()) {
                int iAq = aq(aweme);
                ArrayList arrayList2 = new ArrayList();
                InteractionTagInfo interactionTagInfo3 = aweme.getInteractionTagInfo();
                if (interactionTagInfo3 != null && (list = interactionTagInfo3.taggedUsers) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (InteractionTagUserInfo interactionTagUserInfo3 : list) {
                        if (interactionTagUserInfo3.interestLevel == InteractionTagInterestLevel.HIGH.getLevel()) {
                            arrayList3.add(interactionTagUserInfo3);
                        }
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(InteractionTagInfoKt.toMutualUser((InteractionTagUserInfo) it3.next()));
                        if (arrayList2.size() == 2) {
                            break;
                        }
                    }
                }
                TuxTextView tuxTextView = this.LLLII;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                C0QB7 c0qb7 = this.LLLIIII;
                if (c0qb7 == null) {
                    c0qb7 = null;
                }
                String strVQ2 = Qp().vQ2(aweme);
                float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Xp() + ((Number) this.LLLLIILLL.getValue()).intValue() + 12))) + tuxTextView.getPaint().measureText(strVQ2);
                if (arrayList2.size() > 0) {
                    if (arrayList2.size() == 1) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
                    }
                    fLIZIZ += iLIZIZ;
                }
                if (iAq + fLIZIZ >= Wp()) {
                    GenrePriorityAbility genrePriorityAbilityVp = Vp();
                    if (genrePriorityAbilityVp != null) {
                        iRO1 = genrePriorityAbilityVp.rO1();
                    } else {
                        iRO1 = 0;
                    }
                    iAq -= iRO1;
                }
                if (fLIZIZ + iAq >= Wp()) {
                    Gp(aweme);
                    C786410Ut5.u1(c0qb7, 8);
                } else {
                    if (arrayList2.size() > 0) {
                        C786410Ut5.u1(c0qb7, 0);
                        if (!Intrinsics.LJFF(this.LLLJIL, arrayList2)) {
                            c0qb7.LIZ(new MutualStruct(0, arrayList2.size(), arrayList2, 0), 4);
                        }
                        this.LLLJIL = arrayList2;
                    } else {
                        C786410Ut5.u1(c0qb7, 8);
                    }
                    tuxTextView.setText(strVQ2);
                    this.LLLLII = "high_interest";
                    View view4 = this.LLLI;
                    if (view4 == null) {
                        view4 = null;
                    }
                    C786410Ut5.LJLLLLLL(0, view4);
                }
            } else {
                Gp(aweme);
            }
            View view5 = this.LLLI;
            if (view5 == null) {
                view5 = null;
            }
            if (C0SXF.LJIL(getContext())) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view5);
            View view6 = this.LLLI;
            if (view6 != null) {
                view = view6;
            }
            C786410Ut5.I7(new AkS56S0200000_11(this, aweme, 3), view);
            return;
        }
        kq();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        int i;
        String eventType;
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        EnumC558410LvD enumC558410LvDLJIILIIL;
        C19719912Dl c19719912DlLJIILIIL;
        InterfaceC1659430tHh interfaceC1659430tHhLIZLLL;
        Integer numLIZJ;
        C2189821An6 c2189821An6;
        Object obj2;
        ViewGroup viewGroup;
        Integer numLIZJ2;
        FrameLayout frameLayout;
        String str;
        EnumC1578206Fw enumC1578206Fw;
        LinearLayout.LayoutParams layoutParams;
        super.onViewCreated(view);
        this.LLL = (TuxTextView) view.findViewById(R.id.tv_post_time);
        Object obj3 = null;
        if (Up()) {
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = 16;
            }
        }
        this.LLLFZ = view.findViewById(R.id.trr);
        this.LLLF = (FrameLayout) view.findViewById(R.id.wa5);
        if (C06BY.LIZ() && (frameLayout = this.LLLF) != null) {
            C0RF0 c0rf0 = jm().LIZLLL;
            if (c0rf0 != null) {
                str = c0rf0.LJIIIZ;
            } else {
                str = null;
            }
            if (C0R93.LIZ(str) || dq()) {
                if (dq()) {
                    enumC1578206Fw = EnumC1578206Fw.STORY;
                } else {
                    enumC1578206Fw = EnumC1578206Fw.FRIENDS;
                }
                IStreakService.LJJIIZ.getClass();
                ViewOnClickListenerC1576306Fd viewOnClickListenerC1576306FdV = C06LY.LIZ().V(frameLayout.getContext(), enumC1578206Fw, new AwS581S0100000_2(frameLayout, 445));
                this.LLLFF = viewOnClickListenerC1576306FdV;
                if (viewOnClickListenerC1576306FdV != null) {
                    viewOnClickListenerC1576306FdV.LJFF();
                }
            }
        }
        if (C300390Bq1.LIZ() && !this.LLJLLIL && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.za, view.getContext())) != null) {
            int iIntValue = numLIZJ2.intValue();
            TuxTextView tuxTextView2 = this.LLL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setShadowLayer(C418440Gaw.LIZIZ(2), 0.0f, 2.0f, iIntValue);
        }
        if (fq() && !C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this))) {
            try {
                ViewParent parent = LJJIJL().getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    HandlerHook.viewPost(viewGroup, new ARunnableS80S0200000_11(this, viewGroup, 8));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.title);
        this.LLJZIJLIL = tuxTextView3;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        C2271391DvN.LIZ(tuxTextView3, (C1A5L) C2271381DvM.LJIJ.getValue());
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C1017070cZd.LLLI(((VideoItemParams) obj).getAweme())) {
            TuxTextView tuxTextView4 = this.LLJZIJLIL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setOnTouchListener(new ViewOnTouchListenerC430680Gug());
        } else {
            C0R68.LIZ.getClass();
            if (C0R68.LIZ() == 0) {
                TuxTextView tuxTextView5 = this.LLJZIJLIL;
                if (tuxTextView5 == null) {
                    tuxTextView5 = null;
                }
                tuxTextView5.setOnTouchListener(new C03ID());
            }
        }
        if (C07AA.LIZ() || this.LLJLLIL) {
            TuxTextView tuxTextView6 = this.LLJZIJLIL;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            tuxTextView6.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        TuxTextView tuxTextView7 = this.LLJZIJLIL;
        if (tuxTextView7 == null) {
            tuxTextView7 = null;
        }
        C786410Ut5.h9(tuxTextView7, new View.OnClickListener() { // from class: X.0Slg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String from;
                Aweme aweme;
                C2189821An6 c2189821An62;
                C0ZE7 c0ze7Nz0;
                ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                if (Intrinsics.LJFF(((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType, "paid_series_detail_page") && ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme().isPaidContent) {
                    ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                    return;
                }
                User author = null;
                IFeedActivityStatusAbility iFeedActivityStatusAbility = (IFeedActivityStatusAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFeedActivityStatusAbility.class, null);
                if (iFeedActivityStatusAbility != null && (c0ze7Nz0 = iFeedActivityStatusAbility.Nz0()) != null) {
                    C595710NYb c595710NYbLIZJ = C0O26.LIZJ(AFwS243S0000000_11.get$arr$(101), AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme()));
                    InterfaceC897380ZIi.LIZIZ.getClass();
                    boolean zLIZJ = C896480ZEw.LIZJ(C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ));
                    C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
                    c0ze7Nz0.LJII = Boolean.valueOf(zLIZJ);
                    c0ze8LJIIJJI.LIZ(c0ze7Nz0, false, C0I0B.LJFF.LIZIZ());
                }
                if (C298540Bn2.LIZ()) {
                    InterfaceC1597970rgZ interfaceC1597970rgZLJJIJIL = C1618440sDa.LIZIZ.LJJIJIL();
                    BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C631370Opb.LIZ(this.LL)).baseFeedPageParams;
                    if (baseFeedPageParams != null && (c2189821An62 = baseFeedPageParams.param) != null) {
                        from = c2189821An62.getFrom();
                    } else {
                        from = null;
                    }
                    String strLIZIZ = C1600750rl3.LIZIZ(from);
                    EnumC1260930iux enumC1260930iux = EnumC1260930iux.ENTER_PROFILE;
                    VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LL);
                    if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                        author = aweme.getAuthor();
                    }
                    interfaceC1597970rgZLJJIJIL.LJFF(strLIZIZ, "click_name", enumC1260930iux, author, null, false);
                }
                DataCenter dataCenter = ((VideoItemParams) C631370Opb.LIZ(this.LL)).dataCenter;
                if (dataCenter == null) {
                    return;
                }
                dataCenter.zQ2(((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType, "title_view_click");
            }
        });
        if (!C718100SEu.LIZIZ()) {
            TuxTextView tuxTextView8 = this.LLJZIJLIL;
            if (tuxTextView8 == null) {
                tuxTextView8 = null;
            }
            tuxTextView8.setMinTextSize((14.0f * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
        }
        View viewFindViewById = view.findViewById(R.id.x0a);
        if (viewFindViewById != null) {
            this.LLLFFI = view.findViewById(R.id.x0_);
            C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJLILLLLZIIL();
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C960203pA.LIZ(R.attr.bx, view.getContext()));
        gradientDrawable.setColor(C960203pA.LIZ(R.attr.bx, view.getContext()));
        this.LLLII = (TuxTextView) view.findViewById(R.id.vo_);
        C0QB7 c0qb7 = (C0QB7) view.findViewById(R.id.vo9);
        c0qb7.setSocialVideoTag(true);
        c0qb7.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        this.LLLIIII = c0qb7;
        View viewFindViewById2 = view.findViewById(R.id.voa);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(4));
        Context context = view.getContext();
        if (C722510SVt.LIZIZ()) {
            i = R.attr.dy;
        } else {
            i = R.attr.zj;
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(i, context);
        if (numLIZJ3 != null) {
            gradientDrawable2.setColor(numLIZJ3.intValue());
        }
        viewFindViewById2.setBackground(gradientDrawable2);
        if (C300390Bq1.LIZ()) {
            C426750GoL.LJIIIZ(viewFindViewById2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Xp())))), null, null, null, false, 30);
            C426750GoL.LJIIL(viewFindViewById2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, 26);
        }
        this.LLLI = viewFindViewById2;
        this.LLLIIIIL = (LinearLayout) view.findViewById(R.id.e5i);
        this.LLLIILIL = (TuxIconView) view.findViewById(R.id.e5f);
        this.LLLIIIL = (TuxTextView) view.findViewById(R.id.e5k);
        this.LLLIIL = (TuxIconView) view.findViewById(R.id.e5j);
        LinearLayout linearLayout = this.LLLIIIIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(C418440Gaw.LIZIZ(4));
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ze, view.getContext());
        if (numLIZJ4 != null) {
            gradientDrawable3.setColor(numLIZJ4.intValue());
        }
        linearLayout.setBackground(gradientDrawable3);
        if (C300390Bq1.LIZ()) {
            C426750GoL.LJIIIZ(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Xp())))), null, null, null, false, 30);
            C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, 26);
        }
        this.LLLIL = (TuxIconView) view.findViewById(R.id.als);
        this.LLLILZ = (TuxTextView) view.findViewById(R.id.alu);
        this.LLLILZJ = (TuxTextView) view.findViewById(R.id.alt);
        View view2 = this.LLLFZ;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0REe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DataCenter dataCenter;
                if (C2277711EDh.LIZIZ.LJJIL((C0OB8) C631370Opb.LIZ(this.LL)) && (dataCenter = ((VideoItemParams) C631370Opb.LIZ(this.LL)).dataCenter) != null) {
                    dataCenter.zQ2(((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType, "title_view_click");
                }
            }
        }, view2);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLLL.getValue(), new C2217381BqS() { // from class: X.0SDv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C1ELP) obj4).LLJJIJIL;
            }
        }, null, new C717710SDh(), 6);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null && c724270Sb32.LL != null) {
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            if (C0SE5.LIZIZ(((VideoItemParams) obj2).getAweme())) {
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLL.getValue(), new C2217381BqS() { // from class: X.0SDq
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj4) {
                        return ((C1ELP) obj4).LLJZ;
                    }
                }, null, new C717670SDd(this), 6);
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLLIL.getValue(), new C2217381BqS() { // from class: X.0RCG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C709790Rsn) obj4).LL;
            }
        }, null, new C614800O9m(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLLIL.getValue(), new C2217381BqS() { // from class: X.0NzQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C709790Rsn) obj4).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C717760SDm(), 4);
        if (fq() && !C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this))) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLLIL.getValue(), new C2217381BqS() { // from class: X.0Rsu
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj4) {
                    return ((C709790Rsn) obj4).LLJJLIIIJLLLLLLLZ;
                }
            }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(46), 4);
        }
        C736680Sv4.LJIIIIZZ(this, Qp(), new C2217381BqS() { // from class: X.0SDz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C717830SDt) obj4).LL;
            }
        }, null, new C717660SDc(this), 6);
        C736680Sv4.LJIIIIZZ(this, Qp(), new C2217381BqS() { // from class: X.0SDo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return Integer.valueOf(((C717830SDt) obj4).LLILLJJLI);
            }
        }, null, new C717650SDb(), 6);
        C736680Sv4.LJIIIIZZ(this, Qp(), new C2217381BqS() { // from class: X.0SDp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return Integer.valueOf(((C717830SDt) obj4).LLILLL);
            }
        }, null, new C0OB7(), 6);
        C736680Sv4.LJIIIIZZ(this, Qp(), new C2217381BqS() { // from class: X.0SDs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C717830SDt) obj4).LLILZ;
            }
        }, null, new C717750SDl(), 6);
        C736680Sv4.LJIIIIZZ(this, Qp(), new C2217381BqS() { // from class: X.0SE0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C717830SDt) obj4).LLILZIL;
            }
        }, null, new C717640SDa(), 6);
        C2487409ou.LIZJ(new Runnable() { // from class: X.0SDk
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoAuthorInfoRelationAssem@40b3.onViewCreated$8");
                try {
                    LiveData liveDataLJ = C737450SwJ.LIZIZ.LJ(this.LL.getLifecycle());
                    if (liveDataLJ != null) {
                        final VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = this.LL;
                        liveDataLJ.observe(videoAuthorInfoRelationAssem, new Observer() { // from class: X.0SDj
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj4) {
                                String aid;
                                Aweme aweme = (Aweme) obj4;
                                if (aweme != null) {
                                    VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
                                    String aid2 = aweme.getAid();
                                    Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem2)).getAweme();
                                    Object obj5 = null;
                                    if (aweme2 != null) {
                                        aid = aweme2.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    if (Intrinsics.LJFF(aid2, aid)) {
                                        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem3 = videoAuthorInfoRelationAssem;
                                        videoAuthorInfoRelationAssem3.LLLJIL = null;
                                        C724270Sb3 c724270Sb33 = videoAuthorInfoRelationAssem3.LLJI;
                                        if (c724270Sb33 != null) {
                                            obj5 = c724270Sb33.LL;
                                        }
                                        Aweme aweme3 = ((VideoItemParams) obj5).getAweme();
                                        if (aweme3 != null) {
                                            aweme3.setInteractionTagInfo(aweme.getInteractionTagInfo());
                                            videoAuthorInfoRelationAssem3.lq(aweme3);
                                        }
                                    }
                                }
                            }
                        });
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoAuthorInfoRelationAssem@40b3.onViewCreated$8");
            }
        });
        C2487409ou.LIZJ(new Runnable() { // from class: X.0SDf
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoAuthorInfoRelationAssem@40b3.onViewCreated$9");
                try {
                    LiveData liveDataLJIIIZ = C214878197k.LIZIZ.LJIIIZ(this.LL.getLifecycle());
                    if (liveDataLJIIIZ != null) {
                        final VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = this.LL;
                        liveDataLJIIIZ.observe(videoAuthorInfoRelationAssem, new Observer() { // from class: X.0SDe
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj4) {
                                String aid;
                                Aweme aweme = (Aweme) obj4;
                                if (aweme != null) {
                                    VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
                                    String aid2 = aweme.getAid();
                                    Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem2)).getAweme();
                                    Object obj5 = null;
                                    if (aweme2 != null) {
                                        aid = aweme2.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    if (Intrinsics.LJFF(aid2, aid)) {
                                        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem3 = videoAuthorInfoRelationAssem;
                                        C724270Sb3 c724270Sb33 = videoAuthorInfoRelationAssem3.LLJI;
                                        if (c724270Sb33 != null) {
                                            obj5 = c724270Sb33.LL;
                                        }
                                        Aweme aweme3 = ((VideoItemParams) obj5).getAweme();
                                        if (aweme3 != null) {
                                            aweme3.setCollabInfo(aweme.getCollabInfo());
                                            videoAuthorInfoRelationAssem3.jq(aweme);
                                        }
                                    }
                                }
                            }
                        });
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoAuthorInfoRelationAssem@40b3.onViewCreated$9");
            }
        });
        if (C281310B0v.LIZ() && !C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this)) && !C300390Bq1.LIZ()) {
            C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, view, 28));
        }
        C578570Mmd.LIZ.getClass();
        if (C578570Mmd.LIZ() && C300390Bq1.LIZ() && (!C281310B0v.LIZ() || !C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this)))) {
            C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, view, 29));
        }
        try {
            C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, view, 30));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (C0RE9.LIZ(eventType)) {
            C13IQ<? extends ReusedUIAssem<? extends C03H5>> c13iqS = C1ER1.LIZIZ.S();
            if ((c13iqS instanceof C13IQ) && c13iqS != null) {
                C723830SaL.LIZ(this, null, new C0RES(view, this, c13iqS));
            }
        }
        if (dq() && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, (Context) this.LLLLLL.getValue())) != null) {
            int iIntValue2 = numLIZJ.intValue();
            TuxTextView tuxTextView9 = this.LLL;
            if (tuxTextView9 == null) {
                tuxTextView9 = null;
            }
            tuxTextView9.setTextColor(iIntValue2);
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ2 != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ2.LIZIZ()) != null && (enumC558410LvDLJIILIIL = interfaceC558600LvWLIZIZ.LJIILIIL()) != null && enumC558410LvDLJIILIIL != EnumC558410LvD.DISABLED) {
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ3 = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ3 != null && (interfaceC1659430tHhLIZLLL = iAITheaterFeatureServiceLIZ3.LIZLLL()) != null) {
                c19719912DlLJIILIIL = interfaceC1659430tHhLIZLLL.LJIILIIL();
            } else {
                c19719912DlLJIILIIL = null;
            }
            if ((c19719912DlLJIILIIL instanceof C13IQ) && c19719912DlLJIILIIL != null) {
                C723830SaL.LIZ(this, null, new AwS220S0300000_11(view, this, c19719912DlLJIILIIL, 6));
                return;
            }
            return;
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        }
        if (((VideoItemParams) obj3).getAweme().aiTheaterInfo == null || (iAITheaterFeatureServiceLIZ = C549720LhC.LIZ()) == null) {
            return;
        }
        C549760LhG.LIZ(iAITheaterFeatureServiceLIZ, AIGC.AICreationSceneName.REMIX_FEED_POST.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        boolean z;
        int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        InterfaceC710220RtU interfaceC710220RtUYn;
        Pair<Integer, Integer> pairLJIILL;
        Object obj;
        InterfaceC899120ZPa interfaceC899120ZPa;
        String nickname;
        int i;
        String imprId;
        InteractAreaCommonAbility interactAreaCommonAbility;
        final VideoItemParams videoItemParams2 = videoItemParams;
        String str = ((C717830SDt) Qp().getState()).LL;
        if (str != null && ((!C637980P0q.LIZ(videoItemParams2.getAweme()) || !TextUtils.isEmpty(str)) && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLLLILLIL.getValue()) != null)) {
            interactAreaCommonAbility.zB1(this);
        }
        TuxTextView tuxTextView = null;
        this.LLLJIL = null;
        lq(videoItemParams2.getAweme());
        jq(videoItemParams2.getAweme());
        final boolean z2 = !TextUtils.isEmpty(C1057880ddS.LIZIZ(videoItemParams2.mEventType, null, videoItemParams2.getAweme()));
        C608450Ntj c608450Ntj = C608450Ntj.LIZ;
        final String str2 = videoItemParams2.mEventType;
        final Aweme aweme = videoItemParams2.getAweme();
        c608450Ntj.getClass();
        if (aweme != null) {
            C0NET c0net = C0NET.LIZ;
            String aid = aweme.getAid();
            c0net.getClass();
            boolean zLJIIIIZZ = C0NET.LJIIIIZZ(aid);
            try {
                if (C0P13.LIZ() && C299850Bp9.LIZ()) {
                    ExecutorService executorServiceLIZJ = C823050WQl.LIZJ();
                    final int i2 = zLJIIIIZZ ? 1 : 0;
                    executorServiceLIZJ.execute(new Runnable() { // from class: X.0Ntk
                        public final void LIZ() {
                            try {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("enter_from", str2);
                                c2344009Gk.LIZJ(i2, "cache");
                                C608450Ntj c608450Ntj2 = C608450Ntj.LIZ;
                                Aweme aweme2 = aweme;
                                boolean z3 = z2;
                                VideoItemParams videoItemParams3 = videoItemParams2;
                                c608450Ntj2.getClass();
                                c2344009Gk.LIZJ(C608450Ntj.LJ(aweme2, z3, videoItemParams3), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                c2344009Gk.LIZJ(aweme.isAd() ? 1 : 0, "is_ad");
                                c2344009Gk.LJIIIIZZ("aid", aweme.getAid());
                                LogPbBean logPbBean = aweme.getLogPbBean();
                                c2344009Gk.LJIIIIZZ("log_id", logPbBean != null ? logPbBean.getImprId() : null);
                                Map<String, String> map = c2344009Gk.LIZ;
                                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("nickname_show=");
                                sbLIZ.append(map);
                                c2276471E8n.LIZIZ("common_feed", "FeedFiledMobForServerUtil", C2188811AlT.LIZIZ(sbLIZ));
                                C20684815ws.LJIILLIIL("nickname_show", map);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FeedFiledMobForServerUtil@c896.mobNickNameShow$$inlined$postMobEvent$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FeedFiledMobForServerUtil@c896.mobNickNameShow$$inlined$postMobEvent$1");
                        }
                    });
                } else {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str2);
                    c2344009Gk.LIZJ(zLJIIIIZZ ? 1 : 0, "cache");
                    c2344009Gk.LIZJ(C608450Ntj.LJ(aweme, z2, videoItemParams2), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                    if (aweme.isAd()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c2344009Gk.LIZJ(i, "is_ad");
                    c2344009Gk.LJIIIIZZ("aid", aweme.getAid());
                    LogPbBean logPbBean = aweme.getLogPbBean();
                    if (logPbBean != null) {
                        imprId = logPbBean.getImprId();
                    } else {
                        imprId = null;
                    }
                    c2344009Gk.LJIIIIZZ("log_id", imprId);
                    Map<String, String> map = c2344009Gk.LIZ;
                    C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("nickname_show=");
                    sbLIZ.append(map);
                    c2276471E8n.LIZIZ("common_feed", "FeedFiledMobForServerUtil", C2188811AlT.LIZIZ(sbLIZ));
                    C20684815ws.LJIILLIIL("nickname_show", map);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (videoItemParams2.getAweme().getAuthor() != null && (nickname = videoItemParams2.getAweme().getAuthor().getNickname()) != null && nickname.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.LLLLLLIL = z;
        Ip();
        if (C06BY.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) obj).getAweme());
            if (authorUid != null && authorUid.length() != 0 && (interfaceC899120ZPa = this.LLLFF) != null) {
                interfaceC899120ZPa.LIZIZ(1, authorUid, null, true);
            }
        }
        if (videoItemParams2.getAweme().getAuthor() != null) {
            C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJLILLLLZIIL();
        }
        boolean zLJFF = C0SKN.LJFF(videoItemParams2);
        this.LLJLLIL = zLJFF;
        if (zLJFF) {
            IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPhotoSlidesAbility.class, null);
            if (iPhotoSlidesAbility != null && (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) != null && (pairLJIILL = interfaceC710220RtUYn.LJIILL()) != null) {
                this.LLJLLL = pairLJIILL.getFirst().intValue();
                this.LLJZ = pairLJIILL.getSecond().intValue();
            }
            TuxTextView tuxTextView2 = this.LLL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else {
            Context context = getContext();
            int iIntValue2 = -1;
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = -1;
            }
            this.LLJLLL = iIntValue;
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context2)) != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            this.LLJZ = iIntValue2;
        }
        TuxTextView tuxTextView3 = this.LLJZIJLIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setTextColor(this.LLJLLL);
        TuxTextView tuxTextView4 = this.LLL;
        if (tuxTextView4 != null) {
            tuxTextView = tuxTextView4;
        }
        tuxTextView.setTextColor(this.LLJZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
        vr((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: zp */
    public final void vr(VideoItemParams videoItemParams) {
        VideoAuthorInfoVM videoAuthorInfoVMQp = Qp();
        Context context = getContext();
        C717590SCv c717590SCv = videoAuthorInfoVMQp.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoAuthorInfoVM.LLILZ;
        c717590SCv.LIZIZ(context);
    }

    public final void Ep(MutualStruct mutualStruct, TuxIconView tuxIconView) {
        C2177241AIw c2177241AIw = new C2177241AIw(LJJIJL().getContext(), C1246100iX2.LIZ(mutualStruct), (C2177251AIx) this.LLLJ.getValue());
        tuxIconView.setImageBitmap(c2177241AIw.LIZ());
        this.LLLIZZ.LIZ(c2177241AIw.LIZLLL().LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS180S0100000_11(tuxIconView, 2)));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.InteractInfoAuthorInfoAbility
    public final void Fr2(int i, int i2) {
        int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        if (this.LLJLLIL) {
            this.LLJLLL = i;
            this.LLJZ = i2;
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else {
            Context context = getContext();
            int iIntValue2 = -1;
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = -1;
            }
            this.LLJLLL = iIntValue;
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context2)) != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            this.LLJZ = iIntValue2;
        }
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(i);
        }
        TuxTextView tuxTextView3 = this.LLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7 A[PHI: r15
      0x00f7: PHI (r15v1 int) = (r15v0 int), (r15v3 int), (r15v3 int) binds: [B:59:0x00f4, B:41:0x00a4, B:43:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iq(com.bytedance.tux.input.TuxTextView r18, java.lang.CharSequence r19) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem.iq(com.bytedance.tux.input.TuxTextView, java.lang.CharSequence):void");
    }
}
