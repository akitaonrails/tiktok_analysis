package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems;

import X.AbstractC214823195h;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C1217460hmq;
import X.C1217470hmr;
import X.C1217480hms;
import X.C127G;
import X.C13LE;
import X.C14KS;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1781580wSi;
import X.C1815310xL7;
import X.C1815620xLc;
import X.C1815630xLd;
import X.C1815640xLe;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C439101nJ;
import X.C452501pT;
import X.C497740JfY;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C758470Tp7;
import X.C758510TpB;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC971680bOQ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummarySmallImageStylePanelView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryTextStylePanelView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveBoardBlankCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveBoardChunkTitleCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveBoardErrorCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveDecorationCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell.IntelligentTemplateForYouDecorationCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell.IntelligentTemplateForYouUpdateCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.vm.IntelligentBoardTemplatePreviewViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveBoardsPageContentAssem extends UIListContentAssem<LiveBoardsPageViewModel> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1559260qg8 LLJI;
    public final AssemVMLazy LLJIJIL;
    public C127G LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveBoardsPageContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsPageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LiveBoardsPageContentAssem.class, "intelligentBoardVM", "getIntelligentBoardVM()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/intelligent/vm/IntelligentBoardTemplatePreviewViewModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public LiveBoardsPageContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardsPageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1217460hmq(c19719912DlLIZ), new C1815630xLd(), null, true);
        this.LLJ = C452501pT.LIZIZ(new C1217480hms(this));
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1781580wSi.class, null), checkSupervisorPrepared());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IntelligentBoardTemplatePreviewViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1217470hmr(c19719912DlLIZ2), new C1815640xLe(), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BoardPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardPageScope.class);
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
        c20603715jn.LJ = true;
        c20603715jn.LIZ = 2;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    public final IntelligentBoardTemplatePreviewViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (IntelligentBoardTemplatePreviewViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{LiveBoardsPageViewModel.class, new Function0() { // from class: X.0xLb
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
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageContentAssem r4 = r5.LL
                                X.0QSJ r1 = r4.LLJILLL
                                if (r1 != 0) goto L27
                                X.0Q7z r3 = r4.LLJILJILJ
                                if (r3 != 0) goto L10
                                X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
                                r4.LLJILJILJ = r3
                            L10:
                                r0 = 1
                                java.lang.Class[] r2 = new java.lang.Class[r0]
                                r1 = 0
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope.class
                                r2[r1] = r0
                                X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
                                r4.LLJILLL = r1
                                if (r1 != 0) goto L27
                                r1 = 0
                            L21:
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel r0 = new com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel
                                r0.<init>(r1)
                                return r0
                            L27:
                                java.lang.Class<X.0xKr> r0 = X.InterfaceC1815150xKr.class
                                java.lang.Object r1 = r1.getAbility(r0)
                                X.0xKr r1 = (X.InterfaceC1815150xKr) r1
                                java.lang.Class<X.0xKr> r0 = X.InterfaceC1815150xKr.class
                                X.C687700QyG.LJ(r1, r0)
                                goto L21
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1815610xLb.invoke():java.lang.Object");
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJILJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(LiveBoardBlankCell.class, LiveBoardErrorCell.class, LiveBoardChunkTitleCell.class, LiveDecorationCell.class, IntelligentTemplateForYouDecorationCell.class, IntelligentTemplateForYouUpdateCell.class, AiSummaryTextStylePanelView.class, AiSummarySmallImageStylePanelView.class);
        C758470Tp7 c758470Tp7LIZ = C758510TpB.LIZ();
        if (c758470Tp7LIZ != null && c758470Tp7LIZ.LIZJ) {
            InterfaceC971680bOQ interfaceC971680bOQ = Lo().LLILLL;
            if (interfaceC971680bOQ != null) {
                interfaceC971680bOQ.LJFF();
            }
            Lo().LLILLJJLI = (int) ((((double) ((C14KS.LJFF() - ((int) C497740JfY.LIZIZ(44.0f))) / 3)) * 1.4260869565217391d) + ((double) ((int) C497740JfY.LIZIZ(18.0f))));
            C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.019I
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C00IK) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new C1815310xL7(this), 4);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jvGo.getContext(), 6);
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0xL6
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                AssemVMLazy assemVMLazy = this.LJ.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveBoardsPageContentAssem.LLJJ;
                C1815950xM9 c1815950xM9 = (C1815950xM9) assemVMLazy.getValue().getState();
                c1815950xM9.getClass();
                List<InterfaceC1891350zJl> list = c1815950xM9.getListState().LLILZ;
                if (list != null && i >= 0 && i < list.size()) {
                    Object obj = ListProtector.get(list, i);
                    if (obj instanceof C1157010gDL) {
                        return 2;
                    }
                    if (obj instanceof AbstractC1814790xKH) {
                        return 3;
                    }
                    if (!(obj instanceof C03HC) && !(obj instanceof C994120byc) && !(obj instanceof C994100bya)) {
                        boolean z = obj instanceof AbstractC1812590xGj;
                        return 6;
                    }
                    return 6;
                }
                return 6;
            }
        };
        Go().setLayoutManager(gridLayoutManager);
        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
            if (!((C1781580wSi) this.LLJI.getValue()).LLILZIL && ((C1781580wSi) this.LLJI.getValue()).LLILLJJLI) {
                C439101nJ.LJI(Go());
            } else {
                if (!((C1781580wSi) this.LLJI.getValue()).LLILLJJLI) {
                    return;
                }
                AssemVMLazy assemVMLazy = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
                C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xLf
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1815950xM9) obj).LLIZ;
                    }
                }, null, new C1815620xLc(this), 6);
            }
        }
    }
}
