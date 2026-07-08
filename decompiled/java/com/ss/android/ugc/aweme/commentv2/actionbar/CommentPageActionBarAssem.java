package com.ss.android.ugc.aweme.commentv2.actionbar;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C01GW;
import X.C041J;
import X.C0BJA;
import X.C0HD4;
import X.C0HD5;
import X.C0HWQ;
import X.C0P0T;
import X.C0SWE;
import X.C0SXF;
import X.C0XQ7;
import X.C1158490gFj;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1340510kzJ;
import X.C1341170l0N;
import X.C1341550l0z;
import X.C1342220l24;
import X.C1342560l2c;
import X.C1342620l2i;
import X.C1343170l3b;
import X.C1344610l5v;
import X.C1345760l7m;
import X.C1346420l8q;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1352805Re;
import X.C1352905Rf;
import X.C1354730lMF;
import X.C1356320lOo;
import X.C1357700lR2;
import X.C1383090m5z;
import X.C1391600mJi;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C161N;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1908030zkf;
import X.C1908730zln;
import X.C19719912Dl;
import X.C19EG;
import X.C19YJ;
import X.C19YK;
import X.C20593115i5;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C288640BTa;
import X.C295780Bia;
import X.C295880Bik;
import X.C418440Gaw;
import X.C422830Gi1;
import X.C427870Gq9;
import X.C437760HEo;
import X.C438710HIf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C679280Qkg;
import X.C687700QyG;
import X.C718860SHs;
import X.C719150SIv;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C726120Se2;
import X.C736950SvV;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.EnumC1235690iGF;
import X.EnumC1260920iuw;
import X.EnumC1357230lQH;
import X.InterfaceC1344590l5t;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnTouchListenerC430870Guz;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility;
import com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS100S0210000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class CommentPageActionBarAssem extends UISlotAssem implements IPageActionBarAbility, ICommentPageReusedProtocol, ICommentPageVisibilityProtocol, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJL;
    public View LLJJIII;
    public C427870Gq9 LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public C1908730zln LLJJIJIL;
    public TuxTextView LLJJJ;
    public ViewGroup LLJJJIL;
    public TuxIconView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public C19YK LLJJJJLIIL;
    public TuxIconView LLJJL;
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public TuxIconView LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public View LLJLL;
    public final C01GW LLJZ;
    public C0P0T LLJZIJLIL;
    public boolean LLL;
    public C1352905Rf LLLF;
    public AwS600S0100000_21 LLLFF;
    public ViewGroup LLLFFI;
    public RelativeLayout LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public Drawable LLLIIIIL;
    public final C01GW LLLIIIL;
    public Boolean LLLIIL;
    public Drawable LLLIILIL;
    public final C01GW LLLIL;
    public View LLLILZ;
    public final ARunnableS121S0100000_21 LLLILZJ;
    public View LLLILZLLLI;
    public long LLLIZZ;
    public ICommentPageAbility LLLJ;
    public final C01GW LLLJIL;
    public final CommentPageActionBarAssem LLJJI = this;
    public final C726120Se2 LLJLLIL = new C726120Se2();
    public final C736950SvV LLJLLL = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(103), new AwS565S0100000_21((AbstractC738140SxQ) this, 270), new C451610HnL(this, true, true), new C723700Sa8(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentPageActionBarAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        C1352905Rf c1352905Rf;
        this.LLL = true;
        if (C0BJA.LIZIZ() && (c1352905Rf = this.LLLF) != null) {
            zp(c1352905Rf.LIZIZ);
        }
        CommentContextSource commentContextSourceKp = kp();
        CommentCommonModel commonModel = commentContextSourceKp != null ? commentContextSourceKp.getCommonModel() : null;
        C1341550l0z c1341550l0z = C1341550l0z.LIZ;
        CommentContextSource commentContextSourceKp2 = kp();
        c1341550l0z.getClass();
        if (C1341550l0z.LIZIZ(commentContextSourceKp2) || CommentTimeSortFeatExp.LIZ(commonModel)) {
            C1350920lG6.LJJLL("comment_sort_change_button_show", kp(), null, null);
        }
        if (op()) {
            Tp();
            return;
        }
        View view = this.LLJJIII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        this.LLL = false;
        if (C1158490gFj.LIZ()) {
            hp();
        }
        C1342620l2i.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, CommentPageScope.class, this, IPageActionBarAbility.class, null, null);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    public CommentPageActionBarAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentManagementAssemVM.class);
        this.LLJZ = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 57));
        this.LLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 646));
        this.LLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 645));
        this.LLLIIII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(164));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 266));
        this.LLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 644));
        this.LLLILZJ = new ARunnableS121S0100000_21(this, 51);
        this.LLLJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 268));
    }

    public final void Bp() {
        TuxTextView tuxTextView;
        C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
        CommentContextSource commentContextSourceKp = kp();
        c1340510kzJ.getClass();
        if (C1340510kzJ.LIZIZ(commentContextSourceKp)) {
            C1351950lHl.LJIJJ(this.LLJJJJ);
            return;
        }
        C1341550l0z c1341550l0z = C1341550l0z.LIZ;
        CommentContextSource commentContextSourceKp2 = kp();
        c1341550l0z.getClass();
        if (C1341550l0z.LIZIZ(commentContextSourceKp2) && (tuxTextView = this.LLJJJ) != null && tuxTextView.getVisibility() == 0) {
            TuxTextView tuxTextView2 = this.LLJJJ;
            if (C041J.LIZ(tuxTextView2 != null ? tuxTextView2.getText() : null)) {
                C1351950lHl.LJIJJLI(this.LLJJJJ);
                return;
            }
        }
        C1351950lHl.LJIJJ(this.LLJJJJ);
    }

    public final void Ep() {
        Aweme aweme;
        C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
        CommentContextSource commentContextSourceKp = kp();
        c1340510kzJ.getClass();
        if (C1340510kzJ.LIZIZ(commentContextSourceKp)) {
            C1351950lHl.LJIJJ(this.LLJJJJJIL);
            return;
        }
        TuxIconView tuxIconView = this.LLJJJJJIL;
        if (tuxIconView != null) {
            tuxIconView.setTintColorRes(R.attr.a1j);
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        CommentContextSource commentContextSourceKp2 = kp();
        boolean zLIZJ = ((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ((commentContextSourceKp2 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) == null) ? null : AwemeExtKt.getAuthorUid(aweme));
        CommentContextSource commentContextSourceKp3 = kp();
        if (CommentTimeSortFeatExp.LIZ(commentContextSourceKp3 != null ? commentContextSourceKp3.getCommonModel() : null)) {
            C1341550l0z c1341550l0z = C1341550l0z.LIZ;
            CommentContextSource commentContextSourceKp4 = kp();
            c1341550l0z.getClass();
            if (!C1341550l0z.LIZIZ(commentContextSourceKp4) && !zLIZJ && !CommentContextSourceKt.isFromTitlePanel(kp())) {
                C1351950lHl.LJIJJLI(this.LLJJJJJIL);
                return;
            }
        }
        C1351950lHl.LJIJJ(this.LLJJJJJIL);
    }

    public final void Gp() {
        CommentCommonModel commonModel;
        C1352905Rf c1352905Rf = this.LLLF;
        if (c1352905Rf != null) {
            CommentContextSource commentContextSourceKp = kp();
            Aweme aweme = commentContextSourceKp != null ? CommentContextSourceKt.aweme(commentContextSourceKp) : null;
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            CommentContextSource commentContextSourceKp2 = kp();
            boolean zLIZJ = C1346420l8q.LIZJ((commentContextSourceKp2 == null || (commonModel = commentContextSourceKp2.getCommonModel()) == null) ? null : Boolean.valueOf(commonModel.forceHideBatchManagementView));
            AwS600S0100000_21 awS600S0100000_21 = this.LLLFF;
            boolean zLIZJ2 = ((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(aweme != null ? AwemeExtKt.getAuthorUid(aweme) : null);
            if ((!zLIZJ2 || zLIZJ) && C0BJA.LIZ(zLIZJ2)) {
                if (c1352905Rf.LIZ == null) {
                    c1352905Rf.LIZ = C23250099c.LIZLLL(lifecycleScope, null, null, new C1352805Re(c1352905Rf, awS600S0100000_21, null), 3);
                    return;
                }
                return;
            }
            AnonymousClass0956 anonymousClass0956 = c1352905Rf.LIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1352905Rf.LIZ = null;
            c1352905Rf.LIZIZ = false;
            if (awS600S0100000_21 != null) {
                awS600S0100000_21.invoke(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void I52() {
        TuxTextView tuxTextView;
        C1341550l0z c1341550l0z = C1341550l0z.LIZ;
        CommentContextSource commentContextSourceKp = kp();
        c1341550l0z.getClass();
        if (!C1341550l0z.LIZIZ(commentContextSourceKp) || (tuxTextView = this.LLJJJ) == null) {
            return;
        }
        tuxTextView.setText(C1342560l2c.LIZ(kp(), C724240Sb0.LIZ(this), (CommentSyncSharedVM) this.LLJLLL.getValue(), null, 8));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void Wh0() {
        Context contextLIZIZ;
        FrameLayout frameLayout;
        if (C295780Bia.LIZIZ) {
            contextLIZIZ = getContentView().getContext();
        } else {
            Context context = getContext();
            if (context == null) {
                return;
            } else {
                contextLIZIZ = C1354730lMF.LIZIZ(context);
            }
        }
        if (contextLIZIZ == null || (frameLayout = this.LLJLILLLLZIIL) == null || this.LLJZIJLIL != null) {
            return;
        }
        C1344610l5v c1344610l5v = new Object() { // from class: X.0l5v
        };
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, 96);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 269);
        c1344610l5v.getClass();
        TuxTextView tuxTextView = new TuxTextView(contextLIZIZ, null, 6, 0);
        tuxTextView.setText(contextLIZIZ.getString(2131829258));
        tuxTextView.setTuxFont(52);
        tuxTextView.setTextColor(-1);
        tuxTextView.setTextAlignment(4);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        tuxTextView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        C0HWQ c0hwq = new C0HWQ(contextLIZIZ);
        c0hwq.LLIZLLLIL = C679280Qkg.LIZ(248);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0d, contextLIZIZ);
        c0hwq.LJI(numLIZJ != null ? numLIZJ.intValue() : -16776961);
        c0hwq.LLILZIL = tuxTextView;
        C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
        c1391600mJi.LIZIZ = frameLayout;
        c1391600mJi.LJIIL = true;
        c1391600mJi.LJIJJ = true;
        c0hwq.LJIIIZ(true, new ACListenerS155S0100000_21(awS600S0100000_21, 269));
        c0hwq.LIZJ(new AwS600S0100000_21(awS565S0100000_21, 394));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-16));
        C1391600mJi c1391600mJi2 = c0hwq.LLILLJJLI;
        c1391600mJi2.LJFF = iLIZIZ2;
        c1391600mJi2.LJII = 6000L;
        c1391600mJi2.LIZLLL = EnumC1235690iGF.BOTTOM;
        C0P0T c0p0tLIZIZ = c0hwq.LIZIZ();
        this.LLJZIJLIL = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
        C161N.LIZIZ.LJJLIIIJILLIZJL();
    }

    public final void hp() {
        ICommentPageAbility iCommentPageAbility = this.LLLJ;
        if (iCommentPageAbility == null) {
            iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null);
        }
        View view = this.LLLILZ;
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLLILZJ);
        }
        this.LLLILZ = null;
        yp();
        if (iCommentPageAbility != null) {
            iCommentPageAbility.S01();
        }
    }

    public final CommentContextSource kp() {
        C726120Se2 c726120Se2 = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJL;
        return c726120Se2.LIZ(this);
    }

    public final boolean op() {
        CommentContextSource commentContextSourceKp;
        boolean z = C1343170l3b.LIZ;
        return C1343170l3b.LIZ && (commentContextSourceKp = kp()) != null && CommentContextSourceKt.isFromTitlePanel(commentContextSourceKp);
    }

    public final void yp() {
        ViewGroup viewGroup;
        View view = this.LLLILZLLLI;
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
        this.LLLILZLLLI = null;
        this.LLLJ = null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return op() ? R.layout.a4y : R.layout.a1o;
    }

    public final boolean Jp() {
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceKp = kp();
        Boolean boolValueOf = null;
        if (commentContextSourceKp != null && (commonModel = commentContextSourceKp.getCommonModel()) != null) {
            boolValueOf = Boolean.valueOf(commonModel.isLandscapeMode());
        }
        if (!C1346420l8q.LIZJ(boolValueOf)) {
            return false;
        }
        C20593115i5.LIZ.getClass();
        return !C20593115i5.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void K01() {
        List<InterfaceC1344590l5t> listG11;
        C1383090m5z c1383090m5zLJIIIIZZ;
        ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null);
        if (iCommentPageAbility == null || (listG11 = iCommentPageAbility.g11()) == null) {
            return;
        }
        int i = 0;
        for (InterfaceC1344590l5t interfaceC1344590l5t : listG11) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            InterfaceC1344590l5t interfaceC1344590l5t2 = interfaceC1344590l5t;
            CharSequence charSequenceC4 = interfaceC1344590l5t2.c4(getContext());
            C19YK c19yk = this.LLJJJJLIIL;
            if (c19yk != null && (c1383090m5zLJIIIIZZ = c19yk.LJIIIIZZ(i)) != null) {
                c1383090m5zLJIIIIZZ.LIZIZ = charSequenceC4;
                c1383090m5zLJIIIIZZ.LIZIZ();
            }
            Qp(i, interfaceC1344590l5t2, false);
            if (i == 0) {
                C1341170l0N c1341170l0N = C1341170l0N.LIZ;
                Aweme aweme = CommentContextSourceKt.aweme(kp());
                c1341170l0N.getClass();
                if (C1341170l0N.LIZ(aweme)) {
                    TuxTextView tuxTextView = this.LLJJJ;
                    if (tuxTextView != null) {
                        C19EG c19egLIZ = C724240Sb0.LIZ(this);
                        tuxTextView.setText(c19egLIZ != null ? c19egLIZ.getString(2131825067) : null);
                    }
                } else {
                    TuxTextView tuxTextView2 = this.LLJJJ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(charSequenceC4);
                    }
                }
                Bp();
            }
            i = i2;
        }
    }

    public final void Tp() {
        Aweme aweme;
        User author;
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJIIZI(C0HD4.LIZ(32.0f, getContentView().getContext()));
        c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
        int iLIZ = C0HD5.LIZ(LJJIJL(), 32);
        int iLIZ2 = C0HD5.LIZ(LJJIJL(), 32);
        c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZ;
        c1331670kl3LJIIIIZZ.LJIIIZ = iLIZ2;
        c1331670kl3LJIIIIZZ.LJJIJLIJ = false;
        c1331670kl3LJIIIIZZ.LJJ(this.LLJJIJI);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        TuxTextView tuxTextView = this.LLJJIJIIJIL;
        if (tuxTextView != null) {
            CommentContextSource commentContextSourceKp2 = kp();
            tuxTextView.setText(C1342220l24.LJ(author, commentContextSourceKp2 != null ? CommentContextSourceKt.eventType(commentContextSourceKp2) : null, true, true));
        }
        C1908030zkf.LJI(getContentView().getContext(), author.getCustomVerify(), author.getEnterpriseVerifyReason(), this.LLJJIJIIJIL);
        C1908730zln c1908730zln = this.LLJJIJIL;
        if (c1908730zln != null) {
            C0SWE c0swe = new C0SWE(author);
            c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
            c0swe.LJFF = C724240Sb0.LJI(this);
            c0swe.LIZJ = true;
            c0swe.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 62), new Pair(Boolean.TRUE, 62));
            c1908730zln.LLLLZIL(c0swe.LIZ());
        }
        C1908730zln c1908730zln2 = this.LLJJIJIL;
        if (c1908730zln2 != null) {
            c1908730zln2.setFollowClickInterceptor(new C437760HEo(this, null));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C1158490gFj.LIZ()) {
            hp();
        }
        C1342620l2i.LIZ.getClass();
    }

    public final void up() {
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(C724240Sb0.LJI(this), C1558520qew.LJIIL(this));
        if (iCommentListAssemAbilityLIZLLL != null) {
            iCommentListAssemAbilityLIZLLL.qA1(true, false);
        }
        ICommentPageAbility iCommentPageAbility = this.LLLJ;
        if (iCommentPageAbility == null && (iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null)) == null) {
            return;
        }
        iCommentPageAbility.dn1(0);
    }

    public final void Ap(Drawable drawable) {
        View view;
        View view2;
        if (Intrinsics.LJFF(this.LLLIILIL, drawable)) {
            return;
        }
        RelativeLayout relativeLayout = this.LLLFZ;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundDrawable(drawable);
        }
        this.LLLIILIL = drawable;
        C718860SHs.LIZ.getClass();
        if (C719150SIv.LIZ) {
            if (drawable == null) {
                RelativeLayout relativeLayout2 = this.LLLFZ;
                if (relativeLayout2 != null) {
                    Ip(8, relativeLayout2);
                }
                RelativeLayout relativeLayout3 = this.LLLFZ;
                if (relativeLayout3 != null) {
                    C786410Ut5.S7(relativeLayout3, null);
                }
                if (op() && (view2 = this.LLJJIII) != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                    return;
                }
                return;
            }
            RelativeLayout relativeLayout4 = this.LLLFZ;
            if (relativeLayout4 != null) {
                Ip(0, relativeLayout4);
            }
            RelativeLayout relativeLayout5 = this.LLLFZ;
            if (relativeLayout5 != null) {
                C786410Ut5.S7(relativeLayout5, (View.OnClickListener) this.LLLJIL.getValue());
            }
            if (!op() || (view = this.LLJJIII) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        if (!C295880Bik.LIZLLL || !C295780Bia.LIZIZ) {
            C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
            if (!C1356320lOo.LIZ(Co())) {
                super.Eo(context);
                return context;
            }
        }
        return LJJIJL().getContext();
    }

    public final void Fp(boolean z) {
        String authorUid;
        Aweme aweme;
        C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
        CommentContextSource commentContextSourceKp = kp();
        c1340510kzJ.getClass();
        if (C1340510kzJ.LIZIZ(commentContextSourceKp)) {
            C1351950lHl.LJIJJ(this.LLJJJJJIL);
            this.LLLIIL = Boolean.FALSE;
            return;
        }
        if (Intrinsics.LJFF(this.LLLIIL, Boolean.valueOf(z))) {
            return;
        }
        TuxIconView tuxIconView = this.LLJJJJJIL;
        if (tuxIconView != null) {
            tuxIconView.setTintColorRes(R.attr.a1j);
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        CommentContextSource commentContextSourceKp2 = kp();
        CommentCommonModel commonModel = null;
        if (commentContextSourceKp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        boolean zLIZJ = ((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid);
        CommentContextSource commentContextSourceKp3 = kp();
        if (commentContextSourceKp3 != null) {
            commonModel = commentContextSourceKp3.getCommonModel();
        }
        if (CommentTimeSortFeatExp.LIZ(commonModel)) {
            C1341550l0z c1341550l0z = C1341550l0z.LIZ;
            CommentContextSource commentContextSourceKp4 = kp();
            c1341550l0z.getClass();
            if (!C1341550l0z.LIZIZ(commentContextSourceKp4) && !zLIZJ && z) {
                C1351950lHl.LJIJJLI(this.LLJJJJJIL);
            } else {
                C1351950lHl.LJIJJ(this.LLJJJJJIL);
            }
        } else {
            C1351950lHl.LJIJJ(this.LLJJJJJIL);
        }
        this.LLLIIL = Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void I80(ViewPager viewPager) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dualTabLayout ");
        sbLIZ.append(this.LLJJJJLIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        C19YK c19yk = this.LLJJJJLIIL;
        if (c19yk != null) {
            c19yk.setupWithViewPager(viewPager);
        }
        K01();
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void Ld0(boolean z) {
        View view;
        ICommentPageActionBarVMAbility iCommentPageActionBarVMAbility = (ICommentPageActionBarVMAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageActionBarVMAbility.class, null);
        int i = 0;
        if ((iCommentPageActionBarVMAbility == null || iCommentPageActionBarVMAbility.lj1() <= 1) && !CommentContextSourceKt.isFromTitlePanel(kp()) && (view = this.LLJLL) != null) {
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void Q52(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZ;
        C19YK c19yk = this.LLJJJJLIIL;
        if (c19yk == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c19yk.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (z) {
                C1341550l0z c1341550l0z = C1341550l0z.LIZ;
                CommentContextSource commentContextSourceKp = kp();
                c1341550l0z.getClass();
                if (C1341550l0z.LIZIZ(commentContextSourceKp)) {
                    iLIZ = C0HD5.LIZ(c19yk, 55);
                } else {
                    iLIZ = C0HD5.LIZ(c19yk, 16);
                }
            } else {
                iLIZ = C0HD5.LIZ(c19yk, 99);
            }
            marginLayoutParams.setMarginEnd(iLIZ);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19yk);
            c19yk.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void S41(boolean z) {
        ViewGroup viewGroup;
        View viewFindViewById;
        int i;
        if (Jp()) {
            return;
        }
        TuxIconView tuxIconView = this.LLJJL;
        int i2 = 0;
        if (tuxIconView != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        if (((Number) C288640BTa.LIZ.getValue()).intValue() == 1 && !CommentContextSourceKt.isFromTitlePanel(kp()) && (viewGroup = this.LLLFFI) != null && (viewFindViewById = viewGroup.findViewById(R.id.hfr)) != null) {
            if (z) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void W81(Integer num) {
        List<InterfaceC1344590l5t> listG11;
        C1383090m5z c1383090m5zLJIIIIZZ;
        ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null);
        if (iCommentPageAbility != null && (listG11 = iCommentPageAbility.g11()) != null) {
            int i = 0;
            for (InterfaceC1344590l5t interfaceC1344590l5t : listG11) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1344590l5t interfaceC1344590l5t2 = interfaceC1344590l5t;
                    if (Intrinsics.LJFF(interfaceC1344590l5t2.DJ(), num)) {
                        CharSequence charSequenceC4 = interfaceC1344590l5t2.c4(getContext());
                        C19YK c19yk = this.LLJJJJLIIL;
                        if (c19yk != null && (c1383090m5zLJIIIIZZ = c19yk.LJIIIIZZ(i)) != null) {
                            c1383090m5zLJIIIIZZ.LIZIZ = charSequenceC4;
                            c1383090m5zLJIIIIZZ.LIZIZ();
                        }
                        Qp(i, interfaceC1344590l5t2, false);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        if (C0BJA.LIZIZ()) {
            Gp();
        }
        this.LLLIIL = null;
        Ep();
        Li1(0.0f, 0, 0, 0);
        if (op()) {
            Tp();
            return;
        }
        View view = this.LLJJIII;
        if (view == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentRootFragmentScope.class}).unbindAbility(this.LLJJI, IPageActionBarAbility.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lp(android.view.View r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r5.kp()
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r0.getCommonModel()
        La:
            X.0l2i r4 = X.C1342620l2i.LIZ
            boolean r0 = com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.LIZ(r0)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L59
            X.0l0z r1 = X.C1341550l0z.LIZ
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r5.kp()
            r1.getClass()
            boolean r0 = X.C1341550l0z.LIZIZ(r0)
            if (r0 != 0) goto L59
            r1 = 1
        L24:
            X.19YK r0 = r5.LLJJJJLIIL
            if (r0 == 0) goto L57
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L57
            r0 = 1
        L2f:
            r4.getClass()
            int r1 = X.C1342620l2i.LIZ(r6, r1, r2, r0)
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r5.kp()
            if (r0 == 0) goto L56
            boolean r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.isFromTitlePanel(r0)
            if (r0 != r3) goto L56
            X.0SHs r0 = X.C718860SHs.LIZ
            r0.getClass()
            boolean r0 = X.C719150SIv.LIZ
            if (r0 == 0) goto L56
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.C0HD5.LIZ(r6, r0)
            int r1 = r1 - r0
        L56:
            return r1
        L57:
            r0 = 0
            goto L2f
        L59:
            r1 = 0
            goto L24
        L5b:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarAssem.lp(android.view.View):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mp(android.view.View r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r5.kp()
            if (r0 == 0) goto L3a
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r0.getCommonModel()
        La:
            X.0l2i r4 = X.C1342620l2i.LIZ
            boolean r0 = com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.LIZ(r0)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L38
            X.0l0z r1 = X.C1341550l0z.LIZ
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r5.kp()
            r1.getClass()
            boolean r0 = X.C1341550l0z.LIZIZ(r0)
            if (r0 != 0) goto L38
            r1 = 1
        L24:
            X.19YK r0 = r5.LLJJJJLIIL
            if (r0 == 0) goto L36
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L36
        L2e:
            r4.getClass()
            int r0 = X.C1342620l2i.LIZIZ(r6, r1, r2, r3)
            return r0
        L36:
            r3 = 0
            goto L2e
        L38:
            r1 = 0
            goto L24
        L3a:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarAssem.mp(android.view.View):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 1329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void p51(int i) {
        InterfaceC1344590l5t interfaceC1344590l5t;
        CommentCommonModel commonModel;
        C1383090m5z c1383090m5zLJIIIIZZ;
        List<InterfaceC1344590l5t> listG11;
        CharSequence charSequenceC4 = null;
        ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null);
        if (iCommentPageAbility != null) {
            int iIntValue = Integer.valueOf(iCommentPageAbility.Wb0(i)).intValue();
            ICommentPageAbility iCommentPageAbility2 = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null);
            if (iCommentPageAbility2 != null && (listG11 = iCommentPageAbility2.g11()) != null) {
                interfaceC1344590l5t = (InterfaceC1344590l5t) C13LP.LJJJLZIJ(iIntValue, listG11);
                if (interfaceC1344590l5t != null) {
                    charSequenceC4 = interfaceC1344590l5t.c4(getContext());
                }
            } else {
                interfaceC1344590l5t = null;
            }
            C19YK c19yk = this.LLJJJJLIIL;
            if (c19yk != null && (c1383090m5zLJIIIIZZ = c19yk.LJIIIIZZ(iIntValue)) != null) {
                c1383090m5zLJIIIIZZ.LIZIZ = charSequenceC4;
                c1383090m5zLJIIIIZZ.LIZIZ();
            }
            Qp(iIntValue, interfaceC1344590l5t, false);
            CommentContextSource commentContextSourceKp = kp();
            if (commentContextSourceKp != null && (commonModel = commentContextSourceKp.getCommonModel()) != null && commonModel.isFriendsSimpleDetail() && iIntValue == 0) {
                C19YK c19yk2 = this.LLJJJJLIIL;
                if (c19yk2 == null || c19yk2.getChildCount() <= 1) {
                    TuxTextView tuxTextView = this.LLJJJ;
                    if (tuxTextView != null) {
                        tuxTextView.setText(charSequenceC4);
                    }
                    Bp();
                }
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentRootFragmentScope.class}).bindAbility(this.LLJJI, IPageActionBarAbility.class);
    }

    public final void tp(View view) {
        boolean zLIZ = C1158490gFj.LIZ();
        ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null);
        if (iCommentPageAbility != null) {
            iCommentPageAbility.QV0(lp(view), mp(view), view, new AwS100S0210000_21(this, zLIZ, iCommentPageAbility, 0), new AwS565S0100000_21(this, 267));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void zB2(int i) {
        List<InterfaceC1344590l5t> listG11;
        InterfaceC1344590l5t interfaceC1344590l5t;
        C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
        CommentContextSource commentContextSourceKp = kp();
        c1340510kzJ.getClass();
        if (C1340510kzJ.LIZIZ(commentContextSourceKp)) {
            i = 1;
        }
        C19YK c19yk = this.LLJJJJLIIL;
        if (c19yk != null) {
            if (i > 1 && !CommentContextSourceKt.isFromTitlePanel(kp())) {
                C1351950lHl.LJIJJLI(c19yk);
                K01();
            } else {
                C1351950lHl.LJIJJ(c19yk);
            }
        }
        View view = this.LLJLL;
        if (view != null) {
            if (i > 1 && !CommentContextSourceKt.isFromTitlePanel(kp())) {
                C1351950lHl.LJIJJLI(view);
            } else {
                C1351950lHl.LJIJJ(view);
            }
        }
        TuxTextView tuxTextView = this.LLJJJ;
        if (tuxTextView != null) {
            if (i > 1) {
                C1351950lHl.LJIJJ(tuxTextView);
                C1351950lHl.LJIJJ(this.LLJJJJ);
            } else {
                C1351950lHl.LJIJJLI(tuxTextView);
                Bp();
            }
            C1341170l0N c1341170l0N = C1341170l0N.LIZ;
            Aweme aweme = CommentContextSourceKt.aweme(kp());
            c1341170l0N.getClass();
            CharSequence charSequenceC4 = null;
            if (C1341170l0N.LIZ(aweme)) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    charSequenceC4 = c19egLIZ.getString(2131825067);
                }
            } else {
                ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(tuxTextView, null), ICommentPageAbility.class, null);
                if (iCommentPageAbility != null && (listG11 = iCommentPageAbility.g11()) != null && (interfaceC1344590l5t = (InterfaceC1344590l5t) C13LP.LJJJLL(listG11)) != null) {
                    charSequenceC4 = interfaceC1344590l5t.c4(tuxTextView.getContext());
                }
            }
            tuxTextView.setText(charSequenceC4);
        }
    }

    public final void zp(boolean z) {
        String aid;
        String authorUid;
        Aweme aweme;
        Aweme aweme2;
        if (this.LLL) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = kp();
            String strEventType = null;
            if (commentContextSourceKp != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp)) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            CommentContextSource commentContextSourceKp2 = kp();
            if (commentContextSourceKp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            CommentContextSource commentContextSourceKp3 = kp();
            if (commentContextSourceKp3 != null) {
                strEventType = CommentContextSourceKt.eventType(commentContextSourceKp3);
            }
            c1350920lG6.getClass();
            C1350920lG6.LJJLIIIIJ(aid, authorUid, strEventType, "comment_panel", z);
        }
    }

    public static void Ip(int i, View view) {
        if (view.getVisibility() == i) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final void ip(User user, String str) {
        String str2;
        Fragment fragmentLIZ;
        C19EG activity;
        CommentCommonModel commonModel;
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            Context context = getContentView().getContext();
            CommentContextSource commentContextSourceKp = kp();
            if (commentContextSourceKp != null && (commonModel = commentContextSourceKp.getCommonModel()) != null) {
                str2 = commonModel.eventType;
            } else {
                str2 = null;
            }
            C1351950lHl.LJJI(user, context, str2, null, str, EnumC1260920iuw.RELATION_LABEL, null, null, 8076);
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp2 = kp();
            c1350920lG6.getClass();
            C1350920lG6.LJLJLJ(user, commentContextSourceKp2, false, str, null, null);
            C1440005kM.LIZ(new C737030Svd(36));
            if (C0SXF.LJIL(getContentView().getContext()) && (fragmentLIZ = C946803n0.LIZ(getContentView())) != null && (activity = fragmentLIZ.getActivity()) != null) {
                activity.finish();
            }
        }
    }

    public final void sp(C1383090m5z c1383090m5z, boolean z) {
        Context contextLIZIZ;
        Integer numLIZJ;
        int iLJ;
        Drawable drawable;
        C19YJ c19yj;
        Drawable drawable2;
        TuxIconDrawable tuxIconDrawable;
        Integer numLIZJ2;
        TextView customTextView = null;
        if (C295780Bia.LIZIZ) {
            contextLIZIZ = getContentView().getContext();
        } else {
            Context context = getContext();
            if (context != null) {
                contextLIZIZ = C1354730lMF.LIZIZ(context);
            } else {
                contextLIZIZ = null;
            }
        }
        if (z) {
            if (contextLIZIZ != null) {
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, contextLIZIZ);
            } else {
                numLIZJ2 = null;
            }
            iLJ = C1346420l8q.LJ(numLIZJ2);
        } else {
            if (contextLIZIZ != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, contextLIZIZ);
            } else {
                numLIZJ = null;
            }
            iLJ = C1346420l8q.LJ(numLIZJ);
        }
        if (c1383090m5z != null) {
            drawable = c1383090m5z.LIZ;
        } else {
            drawable = null;
        }
        if (drawable instanceof TuxIconDrawable) {
            if (c1383090m5z != null) {
                drawable2 = c1383090m5z.LIZ;
            } else {
                drawable2 = null;
            }
            if (drawable2 instanceof TuxIconDrawable) {
                tuxIconDrawable = (TuxIconDrawable) drawable2;
                if (tuxIconDrawable != null) {
                    tuxIconDrawable.LJFF(iLJ);
                }
            } else {
                tuxIconDrawable = null;
            }
            c1383090m5z.LIZ = tuxIconDrawable;
            c1383090m5z.LIZIZ();
        } else if (c1383090m5z == null) {
            return;
        }
        if (c1383090m5z.LJII != null) {
            if (c1383090m5z != null && (c19yj = c1383090m5z.LJII) != null) {
                customTextView = c19yj.getCustomTextView();
            }
            if ((customTextView instanceof TuxTextView) && customTextView != null) {
                customTextView.setTextColor(iLJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void wj1(Integer num, ViewOnTouchListenerC430870Guz viewOnTouchListenerC430870Guz) {
        List<InterfaceC1344590l5t> listG11;
        C19YK c19yk;
        C1383090m5z c1383090m5zLJIIIIZZ;
        C19YJ c19yj;
        View view;
        ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null);
        if (iCommentPageAbility != null && (listG11 = iCommentPageAbility.g11()) != null) {
            int i = 0;
            for (InterfaceC1344590l5t interfaceC1344590l5t : listG11) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (Intrinsics.LJFF(interfaceC1344590l5t.DJ(), num) && (c19yk = this.LLJJJJLIIL) != null && (c1383090m5zLJIIIIZZ = c19yk.LJIIIIZZ(i)) != null && (c19yj = c1383090m5zLJIIIIZZ.LJII) != null) {
                        C1383090m5z c1383090m5z = c19yj.LL;
                        if (c1383090m5z != null) {
                            view = c1383090m5z.LJ;
                        } else {
                            view = null;
                        }
                        View view2 = c19yj.LLILLJJLI;
                        if (view != null) {
                            view2 = c19yj.LLILZIL;
                        }
                        if (view2 != null) {
                            view2.setOnTouchListener(viewOnTouchListenerC430870Guz);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void Qp(int i, InterfaceC1344590l5t interfaceC1344590l5t, boolean z) {
        boolean z2;
        C19YK c19yk;
        C1383090m5z c1383090m5zLJIIIIZZ;
        View view;
        TuxIconView tuxIconView;
        if (i == 0) {
            C1341550l0z c1341550l0z = C1341550l0z.LIZ;
            CommentContextSource commentContextSourceKp = kp();
            c1341550l0z.getClass();
            if (C1341550l0z.LIZIZ(commentContextSourceKp) && interfaceC1344590l5t != null) {
                C19YK c19yk2 = this.LLJJJJLIIL;
                if (c19yk2 != null && c19yk2.getSelectedTabPosition() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Drawable drawableCw = interfaceC1344590l5t.Cw(z2);
                if (drawableCw != null && (c19yk = this.LLJJJJLIIL) != null && (c1383090m5zLJIIIIZZ = c19yk.LJIIIIZZ(i)) != null && (view = c1383090m5zLJIIIIZZ.LJ) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.wuq)) != null) {
                    tuxIconView.setImageDrawable(drawableCw);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility
    public final void Li1(float f, int i, Integer num, Integer num2) {
        ViewGroup viewGroup = this.LLJJJIL;
        if (viewGroup == null) {
            return;
        }
        int iIntValue = ((Number) this.LLLI.getValue()).intValue() + ((Number) this.LLLII.getValue()).intValue();
        if (C1343170l3b.LIZ) {
            iIntValue += ((Number) this.LLLIL.getValue()).intValue();
        }
        if (((Boolean) this.LLLIIIL.getValue()).booleanValue()) {
            if (!((Boolean) this.LLLIIII.getValue()).booleanValue()) {
                C718860SHs.LIZ.getClass();
                if (!C719150SIv.LIZ) {
                    if (i >= 1) {
                        Ip(0, viewGroup);
                        Fp(true);
                        Ap(this.LLLIIIIL);
                        return;
                    } else {
                        Ip(8, viewGroup);
                        Fp(false);
                        Ap(null);
                        return;
                    }
                }
            }
            if (i == 0) {
                if (num2 != null && num != null) {
                    if (num2.intValue() < num.intValue() && f != 0.0f) {
                        if (num2.intValue() < num.intValue() && num2.intValue() > iIntValue) {
                            Ap(this.LLLIIIIL);
                            Ip(8, viewGroup);
                            Fp(false);
                            return;
                        } else if (num2.intValue() <= iIntValue) {
                            Ap(this.LLLIIIIL);
                            Ip(0, viewGroup);
                            Fp(true);
                            return;
                        } else {
                            Ap(null);
                            Ip(8, viewGroup);
                            Fp(false);
                            return;
                        }
                    }
                    Ap(null);
                    Ip(8, viewGroup);
                    Fp(false);
                    return;
                }
                Ip(8, viewGroup);
                Fp(false);
                Ap(null);
                return;
            }
            Ip(0, viewGroup);
            Fp(true);
            Ap(this.LLLIIIIL);
            return;
        }
        Ip(0, viewGroup);
    }
}
