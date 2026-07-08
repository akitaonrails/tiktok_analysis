package com.ss.android.ugc.aweme.inbox.bulletin.comment.assem;

import X.AbstractC1906720ziY;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0OY4;
import X.C0OYW;
import X.C0OYX;
import X.C0Q4Y;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C20600815jK;
import X.C20603715jn;
import X.C20607315kN;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS62S0000000_9;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentFoldFooterCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentMoreCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentSheetCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentStatusFooterCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentTextFooterCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentSheetListAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OY4.class, "BulletinCommentSheetHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 501));
    public final C736950SvV LLJI = new C736950SvV(C13LE.LIZ(BulletinCommentListViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(289), new AwS553S0100000_9((AbstractC738140SxQ) this, 502), new C451610HnL(this, true, true), new C723700Sa8(this));
    public C127G LLJIJIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinCommentListViewModel.class, new AObjectS62S0000000_9(this, 31)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0OYW, X.0ziY] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0OYX, X.0ziY] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv != 0) {
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZ = 2;
            c20603715jn.LIZLLL = LoadingFooterCell.class;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            viewOnAttachStateChangeListenerC20604515jv.LJII(new C20607315kN() { // from class: X.0Gkc
                @Override // X.C20607315kN
                public final void LJIIIIZZ() {
                    View view2 = (View) this.LL.LLJ.getValue();
                    if (view2 != null) {
                        HandlerHook.viewPost(view2, new ARunnableS106S0100000_6((Object) viewOnAttachStateChangeListenerC20604515jv, 74));
                    }
                }

                @Override // X.C20607315kN
                public final void LJIIIZ(boolean z) {
                    View view2 = (View) this.LL.LLJ.getValue();
                    if (view2 != null) {
                        HandlerHook.viewPostDelay(view2, new ARunnableS106S0100000_6((Object) viewOnAttachStateChangeListenerC20604515jv, 75), 50L);
                    }
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new WrapLinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1));
            ?? r4 = new AbstractC1906720ziY() { // from class: X.0OYX
                @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
                public final void onCreate() {
                    LJIILIIL(BulletinCommentSheetCell.class);
                    LJIILIIL(BulletinCommentMoreCell.class);
                }
            };
            C20600815jK<InterfaceC1891350zJl> c20600815jK = r4.LLILZLL;
            C0Q4Y c0q4y = C0Q4Y.BUFFER;
            c20600815jK.LIZLLL = c0q4y;
            viewOnAttachStateChangeListenerC20604515jv.LIZJ(r4);
            ?? r1 = new AbstractC1906720ziY() { // from class: X.0OYW
                @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
                public final void onCreate() {
                    LJIILIIL(BulletinCommentStatusFooterCell.class);
                    LJIILIIL(BulletinCommentFoldFooterCell.class);
                    LJIILIIL(BulletinCommentTextFooterCell.class);
                }
            };
            r1.LLILZLL.LIZLLL = c0q4y;
            viewOnAttachStateChangeListenerC20604515jv.LIZJ(r1);
            viewOnAttachStateChangeListenerC20604515jv.LL.LLLIL(((BulletinCommentListViewModel) this.LLJI.getValue()).LL, r4, r4.LLILZLL);
            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJI.getValue(), new C2217371BqR() { // from class: X.0OYO
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OYC) obj).LL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C0OYC) obj).LL = (AbstractC1623806Xk) obj2;
                }
            }, this, C736820SvI.LIZLLL(), null, null, new AwS375S0200000_9(this, (C0OYX) r4, 45), 24, null);
            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJI.getValue(), new C2217371BqR() { // from class: X.0OYQ
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OYC) obj).LLILLJJLI;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C0OYC) obj).LLILLJJLI = (AbstractC1623806Xk) obj2;
                }
            }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9((C0OYW) r1, 167), 24, null);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0OYP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OYC) obj).LLILZ;
                }
            }, null, new AwS623S0100000_9(this, 63), 6);
        }
    }
}
