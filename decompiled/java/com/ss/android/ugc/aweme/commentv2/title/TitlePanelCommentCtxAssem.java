package com.ss.android.ugc.aweme.commentv2.title;

import X.AbstractC1177930gl5;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C09R3;
import X.C0BJA;
import X.C0QSJ;
import X.C1349590lDx;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C726120Se2;
import X.EnumC725960Sdm;
import X.InterfaceC1146704e9;
import X.InterfaceC1349690lE7;
import X.InterfaceC1354310lLZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.translation.TranslationCommentAssemVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentExposureVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentCtxAssem;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelCommentCtxAssem extends AbstractC738140SxQ implements ICommentPageContainer, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final TitlePanelCommentCtxAssem LLILZ = this;
    public final C726120Se2 LLILZIL = new C726120Se2();
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1349590lDx LLJ;
    public volatile InterfaceC1349690lE7 LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelCommentCtxAssem.class, "sheetAbility", "getSheetAbility()Lcom/ss/android/ugc/aweme/feed/title/TitlePanelSheetAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TitlePanelCommentCtxAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TitlePanelCommentCtxAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(TitlePanelCommentCtxAssem.class, "exposeVM", "getExposeVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentExposureVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(TitlePanelCommentCtxAssem.class, "translationCommentAssemVM", "getTranslationCommentAssemVM()Lcom/ss/android/ugc/aweme/comment/translation/TranslationCommentAssemVM;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public TitlePanelCommentCtxAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ, 518), AFwS259S0000000_21.get$arr$(139), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentExposureVM.class);
        this.LLIZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ2, 519), AFwS259S0000000_21.get$arr$(140), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TranslationCommentAssemVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ3, 520), AFwS259S0000000_21.get$arr$(141), null, true);
        this.LLJ = new C1349590lDx("title_panel_comment");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final boolean B9() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void Qg2(Aweme aweme, AwS565S0100000_21 awS565S0100000_21) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void Qh0() {
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final void pX() {
    }

    public final CommentExposureVM bo() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (CommentExposureVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1349690lE7 m171do() {
        /*
            r4 = this;
            X.0lE7 r0 = r4.LLJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0lE7 r0 = r4.LLJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJILJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJIJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJIJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope> r1 = com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJILJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0lE7> r0 = X.InterfaceC1349690lE7.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0lE7 r0 = (X.InterfaceC1349690lE7) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentCtxAssem.m171do():X.0lE7");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final boolean l91() {
        InterfaceC1349690lE7 interfaceC1349690lE7M171do = m171do();
        return interfaceC1349690lE7M171do != null && interfaceC1349690lE7M171do.isShowing();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        InterfaceC1349690lE7 interfaceC1349690lE7M171do = m171do();
        if (interfaceC1349690lE7M171do == null) {
            return;
        }
        interfaceC1349690lE7M171do.Ej(new AbstractC1177930gl5() { // from class: X.0lE6
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                TitlePanelCommentCtxAssem titlePanelCommentCtxAssem = this.LIZ;
                if (!titlePanelCommentCtxAssem.LL && i == 3) {
                    titlePanelCommentCtxAssem.LL = true;
                    List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this.LIZ), ICommentPageVisibilityProtocol.class, false);
                    if (listLIZIZ != null) {
                        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                        while (it2.hasNext()) {
                            ((ICommentPageVisibilityProtocol) it2.next()).P61();
                        }
                    }
                }
            }
        });
        interfaceC1349690lE7M171do.d9(new InterfaceC1354310lLZ() { // from class: X.0lDw
            @Override // X.InterfaceC1354310lLZ
            public final void onShow() {
                ViewGroup viewGroup;
                List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this.LL), ICommentPageVisibilityProtocol.class, false);
                if (listLIZIZ != null) {
                    Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                    while (it2.hasNext()) {
                        ((ICommentPageVisibilityProtocol) it2.next()).LJJJJZI();
                    }
                }
                this.LL.LLJ.LIZLLL(true, C1558520qew.LJIIL(this.LL), C724240Sb0.LJI(this.LL), true);
                this.LL.LLJ.LJI(-1L);
                ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(C724240Sb0.LJI(this.LL), C1558520qew.LJIIL(this.LL));
                View viewVa = iCommentListAssemAbilityLIZLLL != null ? iCommentListAssemAbilityLIZLLL.Va() : null;
                if ((viewVa instanceof ViewGroup) && (viewGroup = (ViewGroup) viewVa) != null) {
                    C2211751BhN.LIZIZ(viewGroup);
                }
                AssemVMLazy assemVMLazy = this.LL.LLILZLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TitlePanelCommentCtxAssem.LLJILJILJ;
                CommentListAssemVM commentListAssemVM = (CommentListAssemVM) assemVMLazy.getValue();
                EnumC725960Sdm enumC725960Sdm = EnumC725960Sdm.PAGE_SHOW;
                commentListAssemVM.RI0(enumC725960Sdm);
                this.LL.bo().RI0(enumC725960Sdm);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), C0PEM.LIZ, null, new C452380Hoa(this.LL, null), 2);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
            @Override // X.InterfaceC1354310lLZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void lM(X.EnumC1349720lEA r33) {
                /*
                    Method dump skipped, instruction units count: 241
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1349580lDw.lM(X.0lEA):void");
            }
        });
        this.LLILLL = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);
        if (C0BJA.LIZIZ()) {
            C726120Se2 c726120Se2 = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
            Aweme aweme = CommentContextSourceKt.aweme(c726120Se2.LIZ(this));
            if (aweme != null) {
                ((TranslationCommentAssemVM) this.LLIZLLLIL.getValue()).vQ2(aweme);
            }
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, ICommentPageContainer.class, null, fragmentLJI2 != null ? fragmentLJI2.getViewLifecycleOwner() : null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || !fragmentLJI.isVisible()) {
            return;
        }
        this.LLILLJJLI = true;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((ICommentPageVisibilityProtocol) it2.next()).onPagePause();
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.isVisible() && this.LLILLJJLI) {
            this.LLILLJJLI = false;
            this.LLJ.LJ();
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, false);
            if (listLIZIZ != null) {
                Iterator it2 = listLIZIZ.iterator();
                while (it2.hasNext()) {
                    ((ICommentPageVisibilityProtocol) it2.next()).LLFF();
                }
            }
        }
        bo().RI0(EnumC725960Sdm.RESUME);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C1349590lDx c1349590lDx = this.LLJ;
        c1349590lDx.getClass();
        c1349590lDx.LIZJ = SystemClock.elapsedRealtime();
        bo().RI0(EnumC725960Sdm.STOP);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    public final int zF() {
        View view;
        View viewFindViewById;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (view = fragmentLJI.getView()) == null || (viewFindViewById = view.findViewById(R.id.i4g)) == null) {
            return 0;
        }
        return viewFindViewById.getHeight();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Kb1(java.lang.String r3) {
        /*
            r2 = this;
            X.0lE7 r1 = r2.m171do()
            if (r1 == 0) goto L17
            X.0lE9 r0 = X.EnumC1349720lEA.Companion
            r0.getClass()
            int r0 = r3.hashCode()
            switch(r0) {
                case -584541682: goto L44;
                case 1089111664: goto L39;
                case 1195475146: goto L2e;
                case 1670365313: goto L23;
                case 1672243158: goto L18;
                default: goto L12;
            }
        L12:
            X.0lEA r0 = X.EnumC1349720lEA.UNKNOWN
        L14:
            r1.H5(r0)
        L17:
            return
        L18:
            java.lang.String r0 = "click_empty"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            X.0lEA r0 = X.EnumC1349720lEA.CLICK_OUTSIDE
            goto L14
        L23:
            java.lang.String r0 = "click_close"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            X.0lEA r0 = X.EnumC1349720lEA.CLICK_CLOSE_ICON
            goto L14
        L2e:
            java.lang.String r0 = "back_pressed"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            X.0lEA r0 = X.EnumC1349720lEA.BACK_PRESS
            goto L14
        L39:
            java.lang.String r0 = "slide_down"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            X.0lEA r0 = X.EnumC1349720lEA.SWIPE_DOWN
            goto L14
        L44:
            java.lang.String r0 = "slide_right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            X.0lEA r0 = X.EnumC1349720lEA.SWIPE_RIGHT
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelCommentCtxAssem.Kb1(java.lang.String):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentRootFragmentScope.class}).unbindAbility(this.LLILZ, ICommentPageContainer.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentRootFragmentScope.class}).bindAbility(this.LLILZ, ICommentPageContainer.class);
    }
}
