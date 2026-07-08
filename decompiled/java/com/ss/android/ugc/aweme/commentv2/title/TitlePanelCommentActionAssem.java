package com.ss.android.ugc.aweme.commentv2.title;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C09R3;
import X.C0XQ7;
import X.C0ZP4;
import X.C1158500gFk;
import X.C1220000hqw;
import X.C1341550l0z;
import X.C1342560l2c;
import X.C1350920lG6;
import X.C13LE;
import X.C1401850maF;
import X.C14EU;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C622680Oba;
import X.C687700QyG;
import X.C718860SHs;
import X.C719150SIv;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C7775031x;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelCommentActionAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public TuxIconView LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public C0ZP4 LLJJJ;
    public boolean LLJJJIL;
    public final C726120Se2 LLJJI = new C726120Se2();
    public final C736950SvV LLJJIJIL = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(138), new AwS565S0100000_21((AbstractC738140SxQ) this, 517), new C451610HnL(this, true, true), new C723700Sa8(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelCommentActionAssem.class, "sheetAbility", "getSheetAbility()Lcom/ss/android/ugc/aweme/feed/title/TitlePanelSheetAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TitlePanelCommentActionAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a53;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TitlePanelRootScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TitlePanelRootScope.class);
        return arrayList;
    }

    public final CommentContextSource hp() {
        C726120Se2 c726120Se2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return c726120Se2.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0ZP4 c0zp4 = this.LLJJJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJJJ = null;
        C622680Oba.LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip(android.view.View r16) {
        /*
            r15 = this;
            X.0Q7z r1 = X.C1558520qew.LJIIL(r15)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r15)
            com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility r6 = X.C1345760l7m.LIZLLL(r0, r1)
            if (r6 == 0) goto L91
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r7 = r15.hp()
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r15.hp()
            r5 = 0
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r0.getCommonModel()
        L1d:
            X.0l2i r4 = X.C1342620l2i.LIZ
            boolean r0 = com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.LIZ(r0)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L94
            X.0l0z r1 = X.C1341550l0z.LIZ
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r15.hp()
            r1.getClass()
            boolean r0 = X.C1341550l0z.LIZIZ(r0)
            if (r0 != 0) goto L94
            r0 = 1
        L37:
            r4.getClass()
            r8 = r16
            int r11 = X.C1342620l2i.LIZ(r8, r0, r2, r2)
            X.0SHs r0 = X.C718860SHs.LIZ
            r0.getClass()
            boolean r0 = X.C719150SIv.LIZ
            if (r0 == 0) goto L58
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r11 = r11 - r0
        L58:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r15.hp()
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r5 = r0.getCommonModel()
        L62:
            boolean r0 = com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.LIZ(r5)
            if (r0 == 0) goto L92
            X.0l0z r1 = X.C1341550l0z.LIZ
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r15.hp()
            r1.getClass()
            boolean r0 = X.C1341550l0z.LIZIZ(r0)
            if (r0 != 0) goto L92
        L77:
            int r10 = X.C1342620l2i.LIZIZ(r8, r3, r2, r2)
            r9 = 0
            r0 = 214(0xd6, float:3.0E-43)
            kotlin.jvm.internal.AFwS209S0000000_21 r12 = kotlin.jvm.internal.AFwS209S0000000_21.get$arr$(r0)
            r0 = 215(0xd7, float:3.01E-43)
            kotlin.jvm.internal.AFwS209S0000000_21 r13 = kotlin.jvm.internal.AFwS209S0000000_21.get$arr$(r0)
            r0 = 216(0xd8, float:3.03E-43)
            kotlin.jvm.internal.AFwS209S0000000_21 r14 = kotlin.jvm.internal.AFwS209S0000000_21.get$arr$(r0)
            r6.kd0(r7, r8, r9, r10, r11, r12, r13, r14)
        L91:
            return
        L92:
            r3 = 0
            goto L77
        L94:
            r0 = 0
            goto L37
        L96:
            r0 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentActionAssem.ip(android.view.View):void");
    }

    @C14EU
    public final void onSortChange(C7775031x c7775031x) {
        TuxTextView tuxTextView;
        C1341550l0z c1341550l0z = C1341550l0z.LIZ;
        CommentContextSource commentContextSourceHp = hp();
        c1341550l0z.getClass();
        if (C1341550l0z.LIZIZ(commentContextSourceHp) && (tuxTextView = this.LLJJIJIIJIL) != null) {
            tuxTextView.setText(C1342560l2c.LIZ(hp(), C724240Sb0.LIZ(this), (CommentSyncSharedVM) this.LLJJIJIL.getValue(), null, 8));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String authorUid;
        CommentCommonModel commonModel;
        Aweme aweme;
        TuxIconView tuxIconView;
        int marginStart;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        this.LLJJIJIIJIL = (TuxTextView) LJJIJL().findViewById(R.id.y2c);
        this.LLJJIII = (TuxIconView) LJJIJL().findViewById(R.id.khh);
        this.LLJJIJI = (TuxIconView) LJJIJL().findViewById(R.id.y2d);
        C1158500gFk.LIZ(this.LLJJIII);
        C1158500gFk.LIZ(this.LLJJIJI);
        C718860SHs.LIZ.getClass();
        if (C719150SIv.LIZ && (tuxIconView = this.LLJJIJI) != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            C426750GoL.LJIIIZ(tuxIconView, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i2), false, 16);
        }
        TuxIconView tuxIconView2 = this.LLJJIJI;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new C1401850maF(this, 25), tuxIconView2);
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        CommentContextSource commentContextSourceHp = hp();
        if (commentContextSourceHp != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceHp)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        boolean zLIZJ = ((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid);
        CommentContextSource commentContextSourceHp2 = hp();
        if (commentContextSourceHp2 != null) {
            commonModel = commentContextSourceHp2.getCommonModel();
        } else {
            commonModel = null;
        }
        if (CommentTimeSortFeatExp.LIZ(commonModel)) {
            C1341550l0z c1341550l0z = C1341550l0z.LIZ;
            CommentContextSource commentContextSourceHp3 = hp();
            c1341550l0z.getClass();
            if (!C1341550l0z.LIZIZ(commentContextSourceHp3) && !zLIZJ) {
                this.LLJJJIL = true;
            }
        }
        if (this.LLJJJIL) {
            TuxIconView tuxIconView3 = this.LLJJIJI;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
            C1350920lG6.LJJLL("comment_sort_change_button_show", hp(), null, null);
        }
        C786410Ut5.LJLLLLLL(8, getContentView());
        this.LLJJJ = C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIL.getValue(), new C2217381BqS() { // from class: X.0HWx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C442480HWs) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 60), 4);
    }
}
