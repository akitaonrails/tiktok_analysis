package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C01GW;
import X.C0DXR;
import X.C0QSJ;
import X.C1217300hma;
import X.C1217320hmc;
import X.C1217330hmd;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1819820xSO;
import X.C1819870xST;
import X.C1819880xSU;
import X.C19719912Dl;
import X.C20441214yg;
import X.C20603715jn;
import X.C20635115or;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.cell.IntelligentDecorationBoardForYouPowerCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.rv.ScaleAndAlphaLinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentBoardTemplateForYouListAssem extends UIListContentAssem<IntelligentBoardTemplateForYouListViewModel> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C20635115or LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public ScaleAndAlphaLinearLayoutManager LLJILLL;
    public C127G LLJJ;
    public InterfaceC665370Q7z LLJJI;
    public C0QSJ LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IntelligentBoardTemplateForYouListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/templates/intelligent/assems/vm/IntelligentBoardTemplateForYouListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IntelligentBoardTemplateForYouListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IntelligentBoardTemplateForYouListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217320hmc(c19719912DlLIZ), new C1819880xSU(), null, true);
        this.LLJ = C452501pT.LIZIZ(new C1217330hmd(this));
        this.LLJI = C452501pT.LIZIZ(new C1819870xST(this));
        this.LLJIJIL = new C20635115or();
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IntelligentBoardTemplateForYouScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IntelligentBoardTemplateForYouScope.class);
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 1;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final IntelligentBoardTemplateForYouListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (IntelligentBoardTemplateForYouListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IntelligentBoardTemplateForYouListViewModel.class, new Function0() { // from class: X.0xSN
                        /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[PHI: r1
                          0x0027: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0004, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() throws java.lang.IllegalAccessException {
                            /*
                                r5 = this;
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem r4 = r5.LL
                                X.0QSJ r1 = r4.LLJJIII
                                if (r1 != 0) goto L27
                                X.0Q7z r3 = r4.LLJJI
                                if (r3 != 0) goto L10
                                X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
                                r4.LLJJI = r3
                            L10:
                                r0 = 1
                                java.lang.Class[] r2 = new java.lang.Class[r0]
                                r1 = 0
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouScope> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouScope.class
                                r2[r1] = r0
                                X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
                                r4.LLJJIII = r1
                                if (r1 != 0) goto L27
                                r1 = 0
                            L21:
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel r0 = new com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel
                                r0.<init>(r1)
                                return r0
                            L27:
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility.class
                                java.lang.Object r1 = r1.getAbility(r0)
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility r1 = (com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility) r1
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility.class
                                X.C687700QyG.LJ(r1, r0)
                                goto L21
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1819810xSN.invoke():java.lang.Object");
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

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
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        ScaleAndAlphaLinearLayoutManager scaleAndAlphaLinearLayoutManager = new ScaleAndAlphaLinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvGo.getContext());
        this.LLJILLL = scaleAndAlphaLinearLayoutManager;
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(scaleAndAlphaLinearLayoutManager);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(IntelligentDecorationBoardForYouPowerCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.addItemDecoration(new C0DXR() { // from class: X.0DWx
            public int LL;

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (childAdapterPosition == -1) {
                    return;
                }
                if (C497740JfY.LJJ()) {
                    if (childAdapterPosition == 0) {
                        int width = (recyclerView.getWidth() - view2.getLayoutParams().width) / 2;
                        this.LL = width;
                        rect.right = width;
                        return;
                    } else {
                        if (c21673919s1.LIZIZ() <= 1 || childAdapterPosition != c21673919s1.LIZIZ() - 1) {
                            return;
                        }
                        rect.left = this.LL;
                        return;
                    }
                }
                if (childAdapterPosition == 0) {
                    int width2 = (recyclerView.getWidth() - view2.getLayoutParams().width) / 2;
                    this.LL = width2;
                    rect.left = width2;
                } else {
                    if (c21673919s1.LIZIZ() <= 1 || childAdapterPosition != c21673919s1.LIZIZ() - 1) {
                        return;
                    }
                    rect.right = this.LL;
                }
            }
        });
        try {
            this.LLJIJIL.LIZIZ(viewOnAttachStateChangeListenerC20604515jvGo);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIIZ("board", "pagerSnapHelper fails");
        }
        viewOnAttachStateChangeListenerC20604515jvGo.setOverScrollMode(2);
        viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0xSR
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                IntelligentBoardTemplateForYouListAssem intelligentBoardTemplateForYouListAssem;
                ScaleAndAlphaLinearLayoutManager scaleAndAlphaLinearLayoutManager2;
                int position;
                RecyclerView.LayoutManager layoutManager;
                View viewLJFF;
                if (i == 0 || i == 2) {
                    if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && (viewLJFF = this.LL.LLJIJIL.LJFF((layoutManager = recyclerView.getLayoutManager()))) != null) {
                        IntelligentBoardTemplateForYouListAssem intelligentBoardTemplateForYouListAssem2 = this.LL;
                        int position2 = layoutManager.getPosition(viewLJFF);
                        if (position2 != -1) {
                            intelligentBoardTemplateForYouListAssem2.ip().yQ2(position2);
                        }
                    }
                    if (i == 0) {
                        IntelligentBoardTemplateForYouListAssem intelligentBoardTemplateForYouListAssem3 = this.LL;
                        View viewLJFF2 = intelligentBoardTemplateForYouListAssem3.LLJIJIL.LJFF(intelligentBoardTemplateForYouListAssem3.LLJILLL);
                        if (viewLJFF2 != null && (scaleAndAlphaLinearLayoutManager2 = (intelligentBoardTemplateForYouListAssem = this.LL).LLJILLL) != null && (position = scaleAndAlphaLinearLayoutManager2.getPosition(viewLJFF2)) >= 0 && position < 2 && !intelligentBoardTemplateForYouListAssem.ip().LLJI) {
                            intelligentBoardTemplateForYouListAssem.ip().manualListLoadLatest(Long.valueOf(intelligentBoardTemplateForYouListAssem.ip().LLILZIL));
                        }
                    }
                }
            }
        });
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new C1217300hma(this));
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0xMF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C326170CqV) obj).LL;
            }
        }, null, new C1819820xSO(this), 6);
        C786410Ut5.x3(LJJIJL().getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0xSS
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C786410Ut5.C3(this.LL.LJJIJL().getViewTreeObserver(), this);
                IntelligentBoardTemplateForYouListViewModel intelligentBoardTemplateForYouListViewModelIp = this.LL.ip();
                int height = this.LL.LJJIJL().getHeight();
                intelligentBoardTemplateForYouListViewModelIp.LLILLJJLI = height;
                intelligentBoardTemplateForYouListViewModelIp.LLILLL = (int) (height * 0.62288135f);
            }
        });
    }
}
