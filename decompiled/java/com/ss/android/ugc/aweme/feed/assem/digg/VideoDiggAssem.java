package com.ss.android.ugc.aweme.feed.assem.digg;

import X.AbstractC1604130rqV;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0CN5;
import X.C0CNO;
import X.C0HHT;
import X.C0PEM;
import X.C0RL9;
import X.C0RLA;
import X.C0RLB;
import X.C0RLG;
import X.C0RSD;
import X.C0S90;
import X.C0SXF;
import X.C0ZDN;
import X.C1017070cZd;
import X.C1157604fu;
import X.C1295960jpS;
import X.C1359600lU6;
import X.C1359720lUI;
import X.C1360460lVU;
import X.C13LE;
import X.C1440005kM;
import X.C1491980ovc;
import X.C1491990ovd;
import X.C1558520qew;
import X.C15O7;
import X.C1602200rnO;
import X.C1637806bA;
import X.C1637906bB;
import X.C1720106oR;
import X.C1849640yEU;
import X.C189200o6;
import X.C19719912Dl;
import X.C1A5L;
import X.C1BCA;
import X.C1DFH;
import X.C1EAU;
import X.C20094213jo;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2219251BtT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2276411E8h;
import X.C23250099c;
import X.C291001Au;
import X.C294930BhD;
import X.C325170Cot;
import X.C452501pT;
import X.C637920P0k;
import X.C694180RKu;
import X.C695660RQm;
import X.C696650RUh;
import X.C699500RcC;
import X.C700450Rdj;
import X.C715960S6o;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C730530Sl9;
import X.C730980Sls;
import X.C731030Slx;
import X.C731050Slz;
import X.C731060Sm0;
import X.C731070Sm1;
import X.C731080Sm2;
import X.C731090Sm3;
import X.C731100Sm4;
import X.C731130Sm7;
import X.C731140Sm8;
import X.C731170SmB;
import X.C731940SnQ;
import X.C734390SrN;
import X.C734440SrS;
import X.C735370Ssx;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1492100ovo;
import X.EnumC312610CNf;
import X.InterfaceC1006670cIr;
import X.InterfaceC1018470cbt;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC497601wk;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.ViewOnClickListenerC731010Slv;
import Y.ARunnableS80S0200000_11;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.ab.FeedDiggNoNetExp;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedDefaultAvatarAbility;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS153S1200000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public class VideoDiggAssem extends BaseCellSlotComponent<VideoDiggAssem> implements ComponentPriorityProtocol, VideoDiggAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZJ;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0RLG(this));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 224));
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public Drawable LLLFZ;
    public C731140Sm8 LLLI;
    public boolean LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public ARunnableS80S0200000_11 LLLIIL;
    public boolean LLLIILIL;
    public final C01GW LLLIL;
    public final ViewOnClickListenerC731010Slv LLLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoDiggAssem.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoDiggAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(VideoDiggAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        c09r3.getClass();
        LLLILZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.0Slv] */
    public VideoDiggAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StatePassingVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C0RL9(c19719912DlLIZ), null, new C731090Sm3());
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoDiggVM.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C0RLA(c19719912DlLIZ2), null, new C731050Slz());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RightAreaContainerVM.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new C0RLB(c19719912DlLIZ3), null, new C731060Sm0());
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C731070Sm1());
        this.LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C731080Sm2());
        this.LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(66));
        this.LLLFFI = C452501pT.LIZIZ(new C715960S6o(this));
        this.LLLIIII = C452501pT.LIZIZ(new C731030Slx());
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(85));
        this.LLLIIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(86));
        this.LLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 223));
        this.LLLILZ = new View.OnClickListener() { // from class: X.0Slv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean zLJI = MethodIDManager.LJI(71912);
                boolean zLJI2 = MethodIDManager.LJI(71991);
                VideoDiggAssem videoDiggAssem = this.LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoDiggAssem.LLLILZJ;
                videoDiggAssem.Vp(view, "click_like");
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_digg";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.b9u;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    public void Xp() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, LLLILZJ[2]), new C2217381BqS() { // from class: X.0SlT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C695520RPy) obj).LL;
            }
        }, null, new C731130Sm7(), 6);
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
        if (str.hashCode() != -429318727) {
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
        List<UpvoteStruct> list;
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (!c1360460lVU.LJJIIJZLJL(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            return false;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid());
        if (upvoteListLJIIIIZZ == null || (list = upvoteListLJIIIIZZ.upvotes) == null) {
            return true;
        }
        Iterator<UpvoteStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            UpvoteStruct next = it2.next();
            User user = next.user;
            if (Intrinsics.LJFF(user != null ? user.getUid() : null, this.LLLIIIIL.getValue())) {
                return next == null;
            }
        }
        return true;
    }

    public final VideoDiggVM Fp() {
        return (VideoDiggVM) this.LLJZ.getValue(this, LLLILZJ[1]);
    }

    public final C731140Sm8 Gp() {
        if (this.LLLI == null) {
            C731140Sm8 c731140Sm8 = new C731140Sm8();
            this.LLLI = c731140Sm8;
            Context context = getContext();
            boolean z = false;
            if (context != null && !C0SXF.LJIL(context)) {
                z = true;
            }
            c731140Sm8.LIZ = z;
        }
        return this.LLLI;
    }

    public final VideoViewModel Ip() {
        return (VideoViewModel) this.LLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility
    public final boolean UG2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().isLike()) {
            return true;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        return ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getUserDigg() != 0;
    }

    public final void Wp() {
        boolean zBooleanValue = ((Boolean) C2219251BtT.LJ.getValue()).booleanValue();
        C730530Sl9 c730530Sl9 = new C730530Sl9(this);
        C1491980ovc.LIZ.LIZ(new C1491990ovd("VideoDiggAssem_SubscribeAsync", zBooleanValue, EnumC1492100ovo.ASYNC_PRIORITY, -20), null, new C731100Sm4(c730530Sl9));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility
    public final void Yy0() {
        Context context;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (!Up(aweme)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Video not liked, executing digg for aweme: ");
            sbLIZ.append(aweme.getAid());
            C1720106oR.LJI("VideoDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
            Vp(getContentView().findViewById(R.id.ftz), "long_press_like");
        }
        if (((Number) C1EAU.LJIILJJIL.getValue()).intValue() != 2 || (context = getContext()) == null) {
            return;
        }
        new C0ZDN(context).LIZ(0);
    }

    public static boolean Tp() {
        return !C294930BhD.LIZ() && ((Boolean) C1EAU.LIZJ.getValue()).booleanValue() && !C0RSD.LIZ() && C1359600lU6.LIZIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility
    public final Long IA0() {
        CharSequence text;
        String string;
        AppCompatTextView appCompatTextView = (AppCompatTextView) getContentView().findViewById(R.id.fu0);
        if (appCompatTextView == null || (text = appCompatTextView.getText()) == null || (string = text.toString()) == null) {
            return null;
        }
        return TextUtils.isDigitsOnly(string) ? C2095008Iq.LJIILIIL(string) : !a0.LJJJIL(string) ? 10000L : null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility
    public final Rect Jg1() {
        if (getContentView().getVisibility() != 0) {
            return null;
        }
        Rect rect = new Rect();
        getContentView().findViewById(R.id.ftt).getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        Drawable drawable = ((ImageView) getContentView().findViewById(R.id.ftt)).getDrawable();
        if (drawable == null || Intrinsics.LJFF(drawable, this.LLLFZ)) {
            return;
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(Fp());
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C696650RUh(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(202352);
        super.onCreate();
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate: ");
        sbLIZ.append(this);
        c2276411E8h.LJII("common_feed", "VideoDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (!C1157604fu.LIZ()) {
            Wp();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void wr() {
        Fp().QQ2(null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public static boolean Up(Aweme aweme) {
        if (!aweme.isLike() && aweme.getUserDigg() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        if (C1157604fu.LIZ()) {
            Wp();
        }
    }

    public final boolean Jp(View view) {
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        try {
            if (!Tp()) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("VideoDiggAssem", "filter disable long press");
                return false;
            }
            if (((Number) C1EAU.LJIILJJIL.getValue()).intValue() > 0) {
                view.setHapticFeedbackEnabled(true);
            } else {
                view.setHapticFeedbackEnabled(false);
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj4 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Long press detected on digg button for aweme: ");
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(", view: ");
            sbLIZ.append(C13LE.LIZ(view.getClass()).LJI());
            sbLIZ.append(", current like = ");
            sbLIZ.append(Up(aweme));
            C1720106oR.LJI("VideoDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
            if (Bp()) {
                Pair[] pairArr = new Pair[5];
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                pairArr[0] = new Pair(((VideoItemParams) obj2).mEventType, "enter_from");
                pairArr[1] = new Pair(-1, "reposted");
                pairArr[2] = new Pair("long_press_like_panel", "panel_source");
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                pairArr[3] = new Pair(C735370Ssx.LIZJ(((VideoItemParams) obj3).getAweme()), "group_id");
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (c724270Sb34 != null) {
                    obj4 = c724270Sb34.LL;
                }
                if (C1359720lUI.LJFF(((VideoItemParams) obj4).getAweme())) {
                    str = "fifa_world_cup";
                } else {
                    str = "normal";
                }
                pairArr[4] = new Pair(str, Scene.SCENE_SERVICE);
                C20684815ws.LJIJI("repost_button_show", pairArr);
                C1440005kM.LIZ(new C731170SmB(aweme.getAid(), 1));
                return true;
            }
            if (!Up(aweme)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("long press rollback to click like: ");
                sbLIZ2.append(aweme.getAid());
                C1720106oR.LJI("VideoDiggAssem", C2188811AlT.LIZIZ(sbLIZ2));
                Vp(getContentView().findViewById(R.id.ftz), "long_press_like");
                return true;
            }
            view.setHapticFeedbackEnabled(false);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility
    public final void Mp0(String str) {
        View viewFindViewById = getContentView().findViewById(R.id.ftz);
        if (str == null) {
            str = "click_like";
        }
        Vp(viewFindViewById, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Qp(C291001Au<? extends VideoItemParams> c291001Au) {
        Aweme aweme;
        String aid;
        Boolean boolValueOf;
        AwemeStatistics statistics;
        if (c291001Au == null) {
            return;
        }
        VideoDiggVM videoDiggVMFp = Fp();
        VideoItemParams videoItemParams = (VideoItemParams) c291001Au.LIZ;
        Long lValueOf = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) videoDiggVMFp.LLJIJIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAweme: aid: ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", userDigg: ");
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(aweme.isLike());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", diggCount: ");
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            lValueOf = Long.valueOf(statistics.getDiggCount());
        }
        sbLIZ.append(lValueOf);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        videoDiggVMFp.setState(new AwS377S0200000_11(videoDiggVMFp, aweme, 128));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        VideoViewCellRootView videoViewCellRootView;
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated: ");
        sbLIZ.append(this);
        c2276411E8h.LJII("common_feed", "VideoDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
        super.onViewCreated(view);
        Context context = view.getContext();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        this.LLLFZ = C731940SnQ.LJI(context, ((VideoItemParams) obj).getAweme());
        C731140Sm8 c731140Sm8Gp = Gp();
        c731140Sm8Gp.LIZJ = LJJIJL();
        c731140Sm8Gp.LJI = getContentView();
        c731140Sm8Gp.LIZLLL = getContentView().findViewById(R.id.ftz);
        c731140Sm8Gp.LJ = getContentView().findViewById(R.id.ftt);
        c731140Sm8Gp.LJFF = (TuxTextView) getContentView().findViewById(R.id.fu0);
        C786410Ut5.O7((FrameLayout) getContentView().findViewById(R.id.ftz), this.LLLILZ);
        q0.LJIJ(getContentView().findViewById(R.id.fuc), new C20094213jo() { // from class: X.0Sg8
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }
        });
        C786410Ut5.h9((TuxTextView) getContentView().findViewById(R.id.fu0), this.LLLILZ);
        C786410Ut5.R7((LinearLayout) getContentView().findViewById(R.id.fuc), this.LLLILZ);
        C786410Ut5.I7(this.LLLILZ, LJJIJL());
        HandlerHook.viewPost(getContentView(), new Runnable() { // from class: X.0RVs
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoDiggAssem@a0f1.onViewCreated$2");
                try {
                    ((C731940SnQ) this.LL.getContentView().findViewById(R.id.ftt)).LLILZ = (FeedDefaultAvatarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), FeedDefaultAvatarAbility.class, null);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoDiggAssem@a0f1.onViewCreated$2");
            }
        });
        View viewFindViewById = getContentView().findViewById(R.id.ftz);
        C01GW c01gw = C2271381DvM.LLJJJJJIL;
        C2271391DvN.LIZ(viewFindViewById, (C1A5L) c01gw.getValue());
        C2271391DvN.LIZ(getContentView().findViewById(R.id.fu0), (C1A5L) c01gw.getValue());
        C2271391DvN.LIZ(getContentView().findViewById(R.id.fuc), (C1A5L) c01gw.getValue());
        C2271391DvN.LIZ(LJJIJL(), (C1A5L) c01gw.getValue());
        ViewParent parent = LJJIJL().getParent();
        while (parent != null && !(parent instanceof VideoViewCellRootView)) {
            parent = parent.getParent();
        }
        if ((parent instanceof VideoViewCellRootView) && (videoViewCellRootView = (VideoViewCellRootView) parent) != null) {
            videoViewCellRootView.setDiggIconCallback(new AwS590S0100000_11(this, 465));
        }
        View viewFindViewById2 = getContentView().findViewById(R.id.ftz);
        if (viewFindViewById2 != null) {
            C637920P0k.LIZ(viewFindViewById2, new ARunnableS80S0200000_11(viewFindViewById2, this, 53));
        }
        View viewFindViewById3 = getContentView().findViewById(R.id.fu0);
        if (viewFindViewById3 != null) {
            C637920P0k.LIZ(viewFindViewById3, new ARunnableS80S0200000_11(viewFindViewById3, this, 53));
        }
        View viewFindViewById4 = getContentView().findViewById(R.id.fuc);
        if (viewFindViewById4 != null) {
            C637920P0k.LIZ(viewFindViewById4, new ARunnableS80S0200000_11(viewFindViewById4, this, 53));
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null) {
            C637920P0k.LIZ(viewLJJIJL, new ARunnableS80S0200000_11(viewLJJIJL, this, 53));
        }
        FeedDiggNoNetExp.DiggNoNetConfig diggNoNetConfigLIZ = FeedDiggNoNetExp.LIZ();
        if (diggNoNetConfigLIZ != null && diggNoNetConfigLIZ.enable == 1) {
            if (C0CN5.LJII()) {
                C0CNO.LIZ(C15O7.LJI, new C1849640yEU());
            } else {
                C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0Slt
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                        if (c1602200rnO2.LIZJ()) {
                            C0CNO.LIZ(C15O7.LJI, new C1849640yEU());
                            C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        long diggCount;
        Aweme aweme;
        VideoItemParams videoItemParams2 = videoItemParams;
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind: ");
        sbLIZ.append(this);
        sbLIZ.append(", item: ");
        sbLIZ.append(videoItemParams2);
        c2276411E8h.LJII("common_feed", "VideoDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLLIIII.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onBind containerView : ");
        sbLIZ2.append(LJJIJL().getVisibility());
        sbLIZ2.append(" contentView : ");
        sbLIZ2.append(getContentView().getVisibility());
        sbLIZ2.append(" aid: ");
        String aid = videoItemParams2.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        sbLIZ2.append(aid);
        sbLIZ2.append(" userDigg: ");
        sbLIZ2.append(videoItemParams2.getAweme().isLike());
        sbLIZ2.append(", diggCount: ");
        AwemeStatistics statistics = videoItemParams2.getAweme().getStatistics();
        if (statistics != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        sbLIZ2.append(diggCount);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (C1017070cZd.LJLLL(videoItemParams2.getAweme())) {
            VideoItemParams item = Fp().getItem();
            if (item != null && (aweme = item.getAweme()) != null && aweme.isLike()) {
                Fp().LLJILJILJ = true;
            }
            Context context = getContext();
            Aweme aweme2 = videoItemParams2.getAweme();
            AwS377S0200000_11 awS377S0200000_11 = new AwS377S0200000_11(this, videoItemParams2, 129);
            C734390SrN.LIZ.getClass();
            ILikeEffectService iLikeEffectServiceLIZ = C734390SrN.LIZ();
            if (iLikeEffectServiceLIZ != null) {
                iLikeEffectServiceLIZ.LJ(context, aweme2, false, awS377S0200000_11);
            }
        } else {
            this.LLLFZ = C731940SnQ.LJI(getContext(), videoItemParams2.getAweme());
            ((C1295960jpS) getContentView().findViewById(R.id.ftt)).setImageDrawable(this.LLLFZ);
        }
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
        vr((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: zp */
    public final void vr(VideoItemParams videoItemParams) {
        Fp().QQ2(getContext());
    }

    public final void Vp(View view, String str) {
        Object obj;
        String str2;
        Object obj2;
        C734440SrS c734440SrS = C734440SrS.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        VideoItemParams item = Fp().getItem();
        if (item == null || (str2 = item.mEventType) == null) {
            str2 = "";
        }
        String str3 = "click_like";
        if (!Intrinsics.LJFF(str, "click_like") && !Intrinsics.LJFF(str, "long_press_like")) {
            str3 = str;
        }
        c734440SrS.getClass();
        C734440SrS.LJI(aweme, str2, str3);
        VideoDiggVM videoDiggVMFp = Fp();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        if (videoDiggVMFp.LQ2(((VideoItemParams) obj2).getAweme().getAid())) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            C734440SrS.LIZJ(((VideoItemParams) obj3).getAweme(), new C325170Cot(3012, "video is digging"));
            return;
        }
        C0S90.LIZ();
        Fp().RQ2(new AwS153S1200000_11(this, view, str, 0));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility
    public final boolean sj0(float f, float f2) {
        Object c098200Yq;
        if (!Tp() || getContentView().getVisibility() != 0 || !getContentView().isAttachedToWindow()) {
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
        if (rect == null || !rect.contains((int) f, (int) f2)) {
            return false;
        }
        return true;
    }

    public final boolean Ep(Aweme aweme, View view, C731940SnQ c731940SnQ, String str, boolean z) {
        Context context;
        String url;
        Fp().LLJILJILJ = true;
        if (c731940SnQ == null || aweme == null || ((aweme.isLike() && !z) || !C1017070cZd.LJLLL(aweme))) {
            return false;
        }
        String uri = null;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        C734390SrN c734390SrN = C734390SrN.LIZ;
        c734390SrN.getClass();
        ILikeEffectService iLikeEffectServiceLIZ = C734390SrN.LIZ();
        if (iLikeEffectServiceLIZ != null && iLikeEffectServiceLIZ.LIZJ(context, aweme) != null) {
            C734390SrN.LIZJ(aweme, str);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context2 = getContext();
        final C730980Sls c730980Sls = new C730980Sls(jCurrentTimeMillis, aweme, str, this, c731940SnQ, view);
        SimpleUriAndUrl simpleUriAndUrlLJJIII = C1017070cZd.LJJIII(aweme);
        if (simpleUriAndUrlLJJIII != null) {
            url = simpleUriAndUrlLJJIII.getUrl();
            uri = simpleUriAndUrlLJJIII.getUri();
        } else {
            url = null;
        }
        if (context2 != null && url != null && url.length() != 0 && uri != null && uri.length() != 0) {
            c734390SrN.getClass();
            ILikeEffectService iLikeEffectServiceLIZ2 = C734390SrN.LIZ();
            if (iLikeEffectServiceLIZ2 != null) {
                iLikeEffectServiceLIZ2.LJIIJ(context2, url, uri, new InterfaceC1018470cbt() { // from class: X.0Slw
                    @Override // X.InterfaceC1018470cbt
                    public final void LIZ(boolean z2) {
                        Function1<Boolean, Unit> function1 = c730980Sls;
                        if (function1 != null) {
                            function1.invoke(Boolean.valueOf(z2));
                        }
                    }
                });
            }
        }
        return true;
    }
}
