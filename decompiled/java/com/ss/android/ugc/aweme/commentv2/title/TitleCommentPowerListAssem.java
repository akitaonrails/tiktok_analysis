package com.ss.android.ugc.aweme.commentv2.title;

import X.AbstractC21673619ry;
import X.C019F;
import X.C09R3;
import X.C0HD5;
import X.C0QSJ;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497820Jfg;
import X.C653210Pjj;
import X.C653230Pjl;
import X.C687700QyG;
import X.C718860SHs;
import X.C719150SIv;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1349690lE7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.comment.api.ICommentListItemVisibleAbility;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.translation.TranslationCommentAssemVM;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.ss.android.ugc.aweme.feed.title.vm.TitlePanelRootVM;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes22.dex */
public final class TitleCommentPowerListAssem extends CommentPowerListAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLLLLL;
    public final AssemVMLazy LLLLLLIL;
    public volatile InterfaceC1349690lE7 LLLLLLJ;
    public InterfaceC665370Q7z LLLLLLL;
    public C0QSJ LLLLLLLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitleCommentPowerListAssem.class, "rootVM", "getRootVM()Lcom/ss/android/ugc/aweme/feed/title/vm/TitlePanelRootVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TitleCommentPowerListAssem.class, "sheetAbility", "getSheetAbility()Lcom/ss/android/ugc/aweme/feed/title/TitlePanelSheetAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TitleCommentPowerListAssem.class, "commentActionMenuVM", "getCommentActionMenuVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentActionMenuVM;", 0);
        c09r3.getClass();
        LLLLLLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public TitleCommentPowerListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TitlePanelRootVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ, 398), AFwS259S0000000_21.get$arr$(136), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentActionMenuVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ2, 399), AFwS259S0000000_21.get$arr$(137), null, true);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class, TitlePanelRootScope.class});
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommentPageScope.class);
        arrayList.add(TitlePanelRootScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, com.ss.android.ugc.aweme.comment.api.ICommentListItemVisibleAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WS() {
        /*
            r4 = this;
            X.0lE7 r0 = r4.LLLLLLJ
            if (r0 != 0) goto L3c
            monitor-enter(r4)
            X.0lE7 r0 = r4.LLLLLLJ     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L35
            X.0QSJ r1 = r4.LLLLLLLLL     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLLLLL     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L37
            r4.LLLLLLL = r3     // Catch: java.lang.Throwable -> L37
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L37
            java.lang.Class<com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope> r1 = com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L37
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L37
            r4.LLLLLLLLL = r1     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0lE7> r0 = X.InterfaceC1349690lE7.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L37
            X.0lE7 r0 = (X.InterfaceC1349690lE7) r0     // Catch: java.lang.Throwable -> L37
        L31:
            r4.LLLLLLJ = r0     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            goto L3a
        L35:
            monitor-exit(r4)
            goto L3c
        L37:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3a:
            if (r0 == 0) goto L3f
        L3c:
            r0.Ag()
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitleCommentPowerListAssem.WS():void");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem
    public final void Ip() {
        Aweme aweme;
        CommentContextSource commentContextSourceSp = sp();
        if (commentContextSourceSp != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceSp)) != null && AwemeExtKt.isTextMoreAd(aweme)) {
            Ho();
        }
        Go();
        Oo();
        Lo();
        No();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, com.ss.android.ugc.aweme.comment.api.ICommentListItemVisibleAbility
    public final boolean RJ2() {
        LinearLayoutManager linearLayoutManager;
        Fragment fragmentLJI;
        View view;
        View viewFindViewById;
        AbstractC21673619ry adapter = Bp().getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) != 0) {
            RecyclerView.LayoutManager layoutManager = Bp().getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                return false;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
            return iFindFirstVisibleItemPosition > 0 || (viewFindViewByPosition != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (view = fragmentLJI.getView()) != null && (viewFindViewById = view.findViewById(R.id.y29)) != null && C653230Pjl.LIZ(viewFindViewByPosition) + C0HD5.LIZ(viewFindViewByPosition, 48) <= C653230Pjl.LIZ(viewFindViewById));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvBp = Bp();
        if (!viewOnAttachStateChangeListenerC20604515jvBp.isAttachedToWindow()) {
            return false;
        }
        View viewFindViewById2 = LJJIJL().getRootView().findViewById(R.id.y2i);
        int[] iArr = C653210Pjj.LIZIZ;
        viewFindViewById2.getLocationOnScreen(iArr);
        int height = iArr[1] + viewFindViewById2.getHeight();
        Context context = viewOnAttachStateChangeListenerC20604515jvBp.getContext();
        int iLIZ = context != null ? C497820Jfg.LIZ(context) : 0;
        View viewFindViewById3 = LJJIJL().getRootView().findViewById(R.id.y29);
        if (viewFindViewById3.getVisibility() == 0) {
            iLIZ = C653230Pjl.LIZ(viewFindViewById3);
        }
        if (C653230Pjl.LIZ(viewOnAttachStateChangeListenerC20604515jvBp) >= iLIZ) {
            return false;
        }
        viewOnAttachStateChangeListenerC20604515jvBp.getLocationOnScreen(iArr);
        return iArr[1] + viewOnAttachStateChangeListenerC20604515jvBp.getHeight() > height;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, ICommentListAssemAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, lp(), ICommentDeleteAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, mp(), ICommentListVMAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, tp(), ICommentExposureAbility.class, null, null);
            C718860SHs.LIZ.getClass();
            if (C719150SIv.LIZ) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, this, ICommentListItemVisibleAbility.class, null, null);
            }
            this.LLLLLJIL = false;
            lp().LLIZ = false;
            mp().LLJJIII = false;
            tp().LLJ = false;
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
        lp().LL = C1558520qew.LJIIL(this);
        lp().LLILLJJLI = new WeakReference<>(C724240Sb0.LJI(this));
        mp().LLIZLLLIL = new WeakReference<>(C724240Sb0.LJI(this));
        mp().NQ2(C1558520qew.LJIIL(this));
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentPowerListAssem.LLLLLJLJLL;
        ((TranslationCommentAssemVM) assemVMLazy.getValue()).LL = C1558520qew.LJIIL(this);
        tp().LL = C1558520qew.LJIIL(this);
        tp().LLILLJJLI = new WeakReference<>(C724240Sb0.LJI(this));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void LLJ(int i) {
        InterfaceC1349690lE7 interfaceC1349690lE7;
        super.LLJ(i);
        if (i == 0 && (interfaceC1349690lE7 = (InterfaceC1349690lE7) C1558520qew.LIZIZ(C1558520qew.LJIIL(this), C13LE.LIZ(TitlePanelRootScope.class), C13LE.LIZ(InterfaceC1349690lE7.class))) != null) {
            interfaceC1349690lE7.LJJJJLI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5) {
        /*
            r4 = this;
            X.0SHs r3 = X.C718860SHs.LIZ
            r3.getClass()
            boolean r2 = X.C0QQX.LIZ
            if (r2 != 0) goto L10
            r3.getClass()
            boolean r0 = X.C719150SIv.LIZ
            if (r0 == 0) goto L26
        L10:
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM r0 = r4.mp()
            X.0l5H r0 = r0.LLILLJJLI
            X.0l2h r1 = X.EnumC1342610l2h.TITLE_PANEL
            r0.LJJJI = r1
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM r0 = r4.mp()
            X.0l5H r0 = r0.GQ2()
            if (r0 == 0) goto L26
            r0.LJJJI = r1
        L26:
            super.onViewCreated(r5)
            r3.getClass()
            if (r2 != 0) goto L35
            r3.getClass()
            boolean r0 = X.C719150SIv.LIZ
            if (r0 == 0) goto L42
        L35:
            X.15jv r2 = r4.Bp()
            X.0maL r1 = new X.0maL
            r0 = 4
            r1.<init>(r4, r0)
            r2.addOnLayoutChangeListener(r1)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitleCommentPowerListAssem.onViewCreated(android.view.View):void");
    }
}
