package com.ss.android.ugc.aweme.commentv2.title;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C041J;
import X.C09R3;
import X.C0HD4;
import X.C0QCK;
import X.C0SWE;
import X.C0SXF;
import X.C0XQ7;
import X.C0ZP4;
import X.C1017070cZd;
import X.C1158500gFk;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1341550l0z;
import X.C1342220l24;
import X.C1342560l2c;
import X.C1343170l3b;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C13LE;
import X.C1401850maF;
import X.C1440005kM;
import X.C14EU;
import X.C1908030zkf;
import X.C1908730zln;
import X.C19ME;
import X.C1A5L;
import X.C2097608Jq;
import X.C2105908Mv;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C341940Daq;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C426750GoL;
import X.C437750HEn;
import X.C438710HIf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C622680Oba;
import X.C687700QyG;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737030Svd;
import X.C737910Sx3;
import X.C738700SyK;
import X.C7775031x;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1260920iuw;
import X.EnumC1357230lQH;
import X.InterfaceC1146704e9;
import X.InterfaceC1349690lE7;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
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
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelNavAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public View LLJI;
    public TuxTextView LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public C0ZP4 LLJJ;
    public boolean LLJJI;
    public final C726120Se2 LLIZLLLIL = new C726120Se2();
    public final C0QCK LLJ = new C0QCK(InterfaceC1349690lE7.class);
    public final C736950SvV LLJILLL = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(142), new AwS565S0100000_21((AbstractC738140SxQ) this, 521), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelNavAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TitlePanelNavAssem.class, "sheetAbility", "getSheetAbility()Ltiktok/communication/LazyAbility;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    public final void Go() {
        C1341550l0z c1341550l0z = C1341550l0z.LIZ;
        CommentContextSource commentContextSourceJo = Jo();
        c1341550l0z.getClass();
        if (!C1341550l0z.LIZIZ(commentContextSourceJo) || this.LLJILJILJ == null) {
            return;
        }
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView != null && tuxTextView.isShown()) {
            TuxTextView tuxTextView2 = this.LLJIJIL;
            if (C041J.LIZ(tuxTextView2 != null ? tuxTextView2.getText() : null)) {
                TuxIconView tuxIconView = this.LLJILJILJ;
                if (tuxIconView == null || tuxIconView.getVisibility() != 0) {
                    C1350920lG6.LJJLL("comment_sort_change_button_show", Jo(), null, null);
                }
                TuxIconView tuxIconView2 = this.LLJILJILJ;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    return;
                }
                return;
            }
        }
        TuxIconView tuxIconView3 = this.LLJILJILJ;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        }
    }

    public final CommentContextSource Jo() {
        C726120Se2 c726120Se2 = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return c726120Se2.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        C0ZP4 c0zp4 = this.LLJJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lo(android.view.View r16) {
        /*
            r15 = this;
            X.0Q7z r1 = X.C1558520qew.LJIIL(r15)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r15)
            com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility r6 = X.C1345760l7m.LIZLLL(r0, r1)
            if (r6 == 0) goto L91
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r7 = r15.Jo()
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r15.Jo()
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
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r15.Jo()
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
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r15.Jo()
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r5 = r0.getCommonModel()
        L62:
            boolean r0 = com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.LIZ(r5)
            if (r0 == 0) goto L92
            X.0l0z r1 = X.C1341550l0z.LIZ
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r15.Jo()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelNavAssem.Lo(android.view.View):void");
    }

    @C14EU
    public final void onSortChange(C7775031x c7775031x) {
        C1341550l0z c1341550l0z = C1341550l0z.LIZ;
        CommentContextSource commentContextSourceJo = Jo();
        c1341550l0z.getClass();
        if (!C1341550l0z.LIZIZ(commentContextSourceJo)) {
            return;
        }
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(C1342560l2c.LIZ(Jo(), C724240Sb0.LIZ(this), (CommentSyncSharedVM) this.LLJILLL.getValue(), null, 8));
        }
        Go();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayout;
        Aweme aweme;
        User author;
        Aweme aweme2;
        Aweme aweme3;
        String strEventType;
        C1331070kk5 hierarchy;
        C1331100kk8 c1331100kk8;
        int iIntValue;
        View viewTd;
        int i;
        String authorUid;
        CommentCommonModel commonModel;
        Aweme aweme4;
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        Boolean bool = Boolean.TRUE;
        view.setTag(R.id.emb, bool);
        AttributeSet attributeSet = null;
        if (view instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) view;
        } else {
            constraintLayout = null;
        }
        int i2 = 0;
        if (constraintLayout != null) {
            boolean z = C1343170l3b.LIZ;
            if (!z) {
                viewTd = null;
            } else {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(constraintLayout.getContext()), R.layout.a55, null, false);
                C786410Ut5.LL(0, constraintLayout);
                C786410Ut5.LJLLLLLL(0, viewTd);
                C426750GoL.LJIIL(viewTd, 0, Integer.valueOf(viewTd.getPaddingTop()), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), 0, 16);
            }
            this.LLJI = viewTd;
            if (viewTd != null) {
                C19ME c19me = new C19ME(-2, -2);
                c19me.topToTop = 0;
                c19me.startToStart = 0;
                constraintLayout.addView(viewTd, c19me);
            }
            C786410Ut5.Y7(constraintLayout, new ACListenerS155S0100000_21(this, 201));
            TuxTextView tuxTextView = new TuxTextView(constraintLayout.getContext(), attributeSet, 6, i2);
            tuxTextView.setTuxFont(42);
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setId(R.id.bm0);
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            tuxTextView.setGravity(8388627);
            if (z) {
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                i = R.attr.a1h;
                C426750GoL.LJIIL(tuxTextView, numValueOf, 0, 0, 0, 16);
            } else {
                i = R.attr.a1h;
            }
            C1341550l0z c1341550l0z = C1341550l0z.LIZ;
            CommentContextSource commentContextSourceJo = Jo();
            c1341550l0z.getClass();
            if (C1341550l0z.LIZIZ(commentContextSourceJo)) {
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            }
            this.LLJIJIL = tuxTextView;
            TuxIconView tuxIconView2 = new TuxIconView(constraintLayout.getContext(), null, 0, 6, null);
            tuxIconView2.setId(R.id.bm1);
            tuxIconView2.setImportantForAccessibility(2);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C426750GoL.LJIIL(tuxIconView2, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
            tuxIconView2.setScaleType(ImageView.ScaleType.FIT_XY);
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView2.setIconWidth(iLIZIZ2);
            tuxIconView2.setIconHeight(iLIZIZ2);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_list_arrow_down;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            tuxIconView2.setTuxIcon(c419910GdJ);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            this.LLJILJIL = tuxIconView2;
            C2271391DvN.LIZ(tuxIconView2, (C1A5L) C2271381DvM.U0.getValue());
            TuxIconView tuxIconView3 = this.LLJILJIL;
            int i3 = this.LLJJIII;
            C19ME c19me2 = new C19ME(i3, i3);
            View view2 = this.LLJI;
            if (view2 != null) {
                c19me2.topToBottom = view2.getId();
            } else {
                c19me2.topToTop = 0;
                c19me2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
            }
            c19me2.bottomToBottom = 0;
            c19me2.endToEnd = 0;
            constraintLayout.addView(tuxIconView3, c19me2);
            C1158500gFk.LIZ(this.LLJILJIL);
            if (C1341550l0z.LIZIZ(Jo())) {
                TuxIconView tuxIconView4 = new TuxIconView(constraintLayout.getContext(), null, 0, 6, null);
                tuxIconView4.setId(View.generateViewId());
                tuxIconView4.setImportantForAccessibility(2);
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_3_lines_center_aligned;
                c419910GdJ2.LJ = Integer.valueOf(i);
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                tuxIconView4.setTuxIcon(c419910GdJ2);
                tuxIconView4.setScaleType(ImageView.ScaleType.FIT_XY);
                C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
                this.LLJILJILJ = tuxIconView4;
                TuxTextView tuxTextView2 = this.LLJIJIL;
                if (tuxTextView2 != null) {
                    int id = tuxTextView2.getId();
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    C19ME c19me3 = new C19ME(iLIZIZ3, iLIZIZ3);
                    c19me3.startToEnd = id;
                    c19me3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                    c19me3.topToTop = id;
                    c19me3.bottomToBottom = id;
                    if (C1341550l0z.LIZIZ(Jo()) && !z) {
                        c19me3.endToEnd = 0;
                    }
                    constraintLayout.addView(tuxIconView4, c19me3);
                }
                C1158500gFk.LIZ(this.LLJILJILJ);
                TuxIconView tuxIconView5 = this.LLJILJILJ;
                if (tuxIconView5 != null) {
                    C786410Ut5.I7(new C1401850maF(this, 30), tuxIconView5);
                }
                TuxTextView tuxTextView3 = this.LLJIJIL;
                if (tuxTextView3 != null) {
                    C786410Ut5.I7(new C1401850maF(this, 31), tuxTextView3);
                }
            }
            TuxTextView tuxTextView4 = this.LLJIJIL;
            C19ME c19me4 = new C19ME(-2, this.LLJJIII);
            View view3 = this.LLJI;
            if (view3 != null) {
                c19me4.topToBottom = view3.getId();
            } else {
                c19me4.topToTop = 0;
            }
            c19me4.startToStart = 0;
            c19me4.bottomToBottom = 0;
            if (C1341550l0z.LIZIZ(Jo()) && (tuxIconView = this.LLJILJILJ) != null) {
                c19me4.endToStart = tuxIconView.getId();
                if (z) {
                    c19me4.horizontalBias = 0.0f;
                } else {
                    c19me4.horizontalChainStyle = 2;
                    c19me4.horizontalBias = 0.5f;
                }
            } else if (!z) {
                c19me4.endToEnd = 0;
            }
            constraintLayout.addView(tuxTextView4, c19me4);
            TuxIconView tuxIconView6 = this.LLJILJIL;
            if (tuxIconView6 != null) {
                C786410Ut5.I7(new C1401850maF(this, 32), tuxIconView6);
            }
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            CommentContextSource commentContextSourceJo2 = Jo();
            if (commentContextSourceJo2 != null && (aweme4 = CommentContextSourceKt.aweme(commentContextSourceJo2)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme4);
            } else {
                authorUid = null;
            }
            boolean zLIZJ = ((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid);
            CommentContextSource commentContextSourceJo3 = Jo();
            if (commentContextSourceJo3 != null) {
                commonModel = commentContextSourceJo3.getCommonModel();
            } else {
                commonModel = null;
            }
            if (CommentTimeSortFeatExp.LIZ(commonModel) && !C1341550l0z.LIZIZ(Jo()) && !zLIZJ) {
                this.LLJJI = true;
            }
        }
        if (this.LLJI != null) {
            SmartImageView smartImageView = (SmartImageView) LJJIJL().findViewById(R.id.user_avatar);
            TextView textView = (TextView) LJJIJL().findViewById(R.id.user_name);
            C1908730zln c1908730zln = (C1908730zln) LJJIJL().findViewById(R.id.user_follow);
            if (smartImageView != null && (hierarchy = smartImageView.getHierarchy()) != null && (c1331100kk8 = hierarchy.LIZJ) != null) {
                c1331100kk8.LJFF(C341940Daq.LIZ(0.5d));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nf, LJJIJL().getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                c1331100kk8.LJFF = iIntValue;
            }
            if (textView != null) {
                C786410Ut5.I7(new C738700SyK(this, 3), textView);
            }
            if (smartImageView != null) {
                C786410Ut5.I7(new C738700SyK(this, 4), smartImageView);
            }
            CommentContextSource commentContextSourceJo4 = Jo();
            if (commentContextSourceJo4 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceJo4)) != null && (author = aweme.getAuthor()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                c1331670kl3LJIIIIZZ.LJJIIZI(C0HD4.LIZ(32.0f, LJJIJL().getContext()));
                c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ4;
                c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ5;
                c1331670kl3LJIIIIZZ.LJJIJLIJ = false;
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                if (textView != null) {
                    CommentContextSource commentContextSourceJo5 = Jo();
                    if (commentContextSourceJo5 != null) {
                        strEventType = CommentContextSourceKt.eventType(commentContextSourceJo5);
                    } else {
                        strEventType = null;
                    }
                    textView.setText(C1342220l24.LJ(author, strEventType, true, true));
                }
                C1908030zkf.LJI(LJJIJL().getContext(), author.getCustomVerify(), author.getEnterpriseVerifyReason(), textView);
                CommentContextSource commentContextSourceJo6 = Jo();
                if (commentContextSourceJo6 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceJo6)) != null && AwemeExtKt.isTextMoreAd(aweme2)) {
                    CommentContextSource commentContextSourceJo7 = Jo();
                    if (commentContextSourceJo7 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceJo7)) != null && C1017070cZd.LL(aweme3)) {
                        if (c1908730zln != null) {
                            C786410Ut5.u0(c1908730zln, 8);
                            C0SWE c0swe = new C0SWE(author);
                            c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
                            c0swe.LJFF = FragmentManager.LJJJJLL(LJJIJL());
                            c0swe.LIZJ = true;
                            c0swe.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 62), new Pair(bool, 62));
                            c1908730zln.LLLLZIL(c0swe.LIZ());
                            c1908730zln.setFollowClickInterceptor(new C437750HEn(this, null));
                        }
                    } else if (c1908730zln != null) {
                        C786410Ut5.u0(c1908730zln, 0);
                        C0SWE c0swe2 = new C0SWE(author);
                        c0swe2.LIZIZ = EnumC1357230lQH.NORMAL;
                        c0swe2.LJFF = FragmentManager.LJJJJLL(LJJIJL());
                        c0swe2.LIZJ = true;
                        c0swe2.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 62), new Pair(bool, 62));
                        c1908730zln.LLLLZIL(c0swe2.LIZ());
                        c1908730zln.setFollowClickInterceptor(new C437750HEn(this, null));
                    }
                } else if (c1908730zln != null) {
                    C0SWE c0swe22 = new C0SWE(author);
                    c0swe22.LIZIZ = EnumC1357230lQH.NORMAL;
                    c0swe22.LJFF = FragmentManager.LJJJJLL(LJJIJL());
                    c0swe22.LIZJ = true;
                    c0swe22.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 62), new Pair(bool, 62));
                    c1908730zln.LLLLZIL(c0swe22.LIZ());
                    c1908730zln.setFollowClickInterceptor(new C437750HEn(this, null));
                }
            }
        }
        this.LLJJ = C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILLL.getValue(), new C2217381BqS() { // from class: X.0HWt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C442480HWs) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 142), 4);
        C0QCK c0qck = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        c0qck.LIZ(this).LIZIZ(this, new AwS387S0200000_21(this, view, 22));
    }

    public static void Ho(Context context, CommentContextSource commentContextSource, String str) {
        Aweme aweme;
        User author;
        Activity activityLIZIZ;
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null && (author = aweme.getAuthor()) != null && !C2105908Mv.LIZ(author.getUid())) {
            C1351950lHl.LJJI(author, context, CommentContextSourceKt.eventType(commentContextSource), null, str, EnumC1260920iuw.RELATION_LABEL, null, null, 8076);
            C1350920lG6.LIZ.getClass();
            C1350920lG6.LJLJLJ(author, commentContextSource, false, str, null, null);
            C1440005kM.LIZ(new C737030Svd(36));
            if (C0SXF.LJIL(context) && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null) {
                activityLIZIZ.finish();
            }
        }
    }
}
