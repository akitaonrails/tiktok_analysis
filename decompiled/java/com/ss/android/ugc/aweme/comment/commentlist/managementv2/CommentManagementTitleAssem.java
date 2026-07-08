package com.ss.android.ugc.aweme.comment.commentlist.managementv2;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09R3;
import X.C0BJ8;
import X.C0HD5;
import X.C0P0T;
import X.C0XQ7;
import X.C10EU;
import X.C1341780l1M;
import X.C1342300l2C;
import X.C1345700l7g;
import X.C1350920lG6;
import X.C1356320lOo;
import X.C1357700lR2;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C295780Bia;
import X.C295880Bik;
import X.C384050F3z;
import X.C419910GdJ;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C724240Sb0;
import X.C726120Se2;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1341650l19;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class CommentManagementTitleAssem extends UISlotAssem implements IManagementTitleAbility, ICommentPageReusedProtocol, ICommentPageVisibilityProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public TuxIconView LLJJI;
    public TextView LLJJIII;
    public final C01GW LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public final C726120Se2 LLJJIJIL;
    public C0P0T LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentManagementTitleAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentManagementTitleAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public CommentManagementTitleAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentManagementAssemVM.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 10));
        this.LLJJIJIL = new C726120Se2();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ahf;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
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

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        C0P0T c0p0t = this.LLJJJ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.managementv2.IManagementTitleAbility
    public final void TX1() {
        lp("pop_up");
    }

    public final CommentContextSource ip() {
        C726120Se2 c726120Se2 = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return c726120Se2.LIZ(this);
    }

    public final CommentManagementAssemVM kp() {
        return (CommentManagementAssemVM) this.LLJJIJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIL, this, IManagementTitleAbility.class, null, null);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            this.LLJJJIL = Intrinsics.LJFF(interfaceC665370Q7zLJIL, c19egLIZ != null ? C1558360qeg.LJI(c19egLIZ, null) : null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJIL, IManagementTitleAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
        kp().LLILZ = C1558520qew.LJIIL(this);
        kp().LLILZIL = new WeakReference<>(C724240Sb0.LJI(this));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJJJIL;
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

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        Aweme aweme2;
        String authorUid;
        TuxIconView tuxIconView;
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceIp = ip();
        if (commentContextSourceIp != null && (commonModel = commentContextSourceIp.getCommonModel()) != null && commonModel.forceHideBatchManagementView) {
            return;
        }
        CommentManagementAssemVM commentManagementAssemVMKp = kp();
        CommentContextSource commentContextSourceIp2 = ip();
        String authorUid2 = null;
        if (commentContextSourceIp2 != null) {
            aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp2);
        } else {
            aweme2 = null;
        }
        commentManagementAssemVMKp.getClass();
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        } else {
            authorUid = null;
        }
        if (!C10EU.LJIIZILJ(authorUid)) {
            if (aweme2 != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme2);
            }
            if ((C10EU.LJIIZILJ(authorUid2) || !commentManagementAssemVMKp.xQ2()) && ((tuxIconView = this.LLJJI) == null || tuxIconView.getVisibility() != 0)) {
                return;
            }
        }
        CommentManagementAssemVM commentManagementAssemVMKp2 = kp();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        commentManagementAssemVMKp2.getClass();
        commentManagementAssemVMKp2.withState(new C1342300l2C(commentManagementAssemVMKp2, true, fragmentLJI, false));
    }

    public final void hp(String str) {
        Keva repo = Keva.getRepo("keva_repo_batch");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_portal");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        int i = 0;
        if (!repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            Keva repo2 = Keva.getRepo("keva_repo_batch");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("keva_key_portal");
            sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            i = 1;
            repo2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "is_first");
        C1350920lG6.LJJJ(c2344009Gk, "comment_batch_management_portal_left_ck");
        lp(str);
    }

    public final void lp(String str) {
        CommentManagementAssemVM commentManagementAssemVMKp = kp();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentManagementAssemVM.LLIZLLLIL;
        commentManagementAssemVMKp.getClass();
        commentManagementAssemVMKp.withState(new C1342300l2C(commentManagementAssemVMKp, false, fragmentLJI, true));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C1350920lG6.LJJJ(c2344009Gk, "comment_batch_management_sw");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        CommentCommonModel commonModel;
        TuxIconView tuxIconView;
        CommentCommonModel commonModel2;
        TuxIconView tuxIconView2;
        super.onViewCreated(view);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.t1s);
        if (C0BJ8.LIZ()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_ellipsis_horizontal;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            TuxIconView tuxIconView3 = this.LLJJI;
            if (tuxIconView3 != null) {
                tuxIconView3.setTuxIcon(c419910GdJ);
            }
        }
        this.LLJJIII = (TextView) view.findViewById(R.id.t1u);
        TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.t1w);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c3);
        c384050F3z.LIZJ = Float.valueOf(C0HD5.LIZIZ(tuxIconView4, Float.valueOf(16.0f)));
        tuxIconView4.setBackground(c384050F3z.LIZ(tuxIconView4.getContext()));
        this.LLJJIJIIJIL = tuxIconView4;
        CommentContextSource commentContextSourceIp = ip();
        if (commentContextSourceIp != null && (commonModel2 = commentContextSourceIp.getCommonModel()) != null && Intrinsics.LJFF(commonModel2.isSpiltMode(), Boolean.TRUE) && (tuxIconView2 = this.LLJJI) != null && (tuxIconView2.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tuxIconView2.getLayoutParams();
            layoutParams.setMarginEnd(0);
            layoutParams.removeRule(16);
            layoutParams.addRule(21);
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217371BqR() { // from class: X.0l47
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159060gGe) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1159060gGe) obj).LLILLJJLI = (C291001Au) obj2;
            }
        }, null, new AwS635S0100000_21(this, 11), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217371BqR() { // from class: X.0l4E
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1159060gGe) obj).LLILZ);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1159060gGe) obj).LLILZ = ((Boolean) obj2).booleanValue();
            }
        }, null, AFwS305S0000000_21.get$arr$(25), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217371BqR() { // from class: X.0l4F
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1159060gGe) obj).LLILLL);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1159060gGe) obj).LLILLL = ((Boolean) obj2).booleanValue();
            }
        }, null, new AwS633S0100000_19(this, 32), 6);
        CommentContextSource commentContextSourceIp2 = ip();
        if (commentContextSourceIp2 != null) {
            commonModel = commentContextSourceIp2.getCommonModel();
        } else {
            commonModel = null;
        }
        if (CommentTimeSortFeatExp.LIZ(commonModel) && (tuxIconView = this.LLJJI) != null && tuxIconView.getVisibility() == 0) {
            C1350920lG6.LJJLL("comment_sort_change_button_show", ip(), null, null);
        }
        TuxIconView tuxIconView5 = this.LLJJI;
        if (tuxIconView5 != null) {
            C786410Ut5.a9(tuxIconView5, new ACListenerS155S0100000_21(this, 17));
        }
        TextView textView = this.LLJJIII;
        if (textView != null) {
            C786410Ut5.T7(textView, new ACListenerS155S0100000_21(this, 18));
        }
        C1341780l1M c1341780l1M = C1341780l1M.LIZ;
        TuxIconView tuxIconView6 = this.LLJJI;
        EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.BUTTON;
        C1341780l1M.LIZIZ(c1341780l1M, tuxIconView6, enumC1341650l19, 0.0f, null, 12);
        C1341780l1M.LIZIZ(c1341780l1M, this.LLJJIII, enumC1341650l19, 0.0f, null, 12);
    }
}
