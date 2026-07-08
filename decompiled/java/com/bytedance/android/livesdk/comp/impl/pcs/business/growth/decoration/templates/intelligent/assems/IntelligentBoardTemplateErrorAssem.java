package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems;

import X.C011Z;
import X.C019F;
import X.C01GW;
import X.C0QSJ;
import X.C1217340hme;
import X.C1246040iWw;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C16FS;
import X.C1819770xSJ;
import X.C1819780xSK;
import X.C1819790xSL;
import X.C1819800xSM;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateErrorAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentBoardTemplateErrorAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C127G LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IntelligentBoardTemplateErrorAssem.class, "intelligentBoardTemplatesPageViewModel", "getIntelligentBoardTemplatesPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/templates/intelligent/assems/vm/IntelligentBoardTemplateForYouListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IntelligentBoardTemplateErrorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IntelligentBoardTemplateForYouListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217340hme(c19719912DlLIZ), new C1819800xSM(), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new C1819770xSJ(this));
        this.LLJJIJI = C452501pT.LIZIZ(new C1819780xSK(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1819790xSL(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h03;
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

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IntelligentBoardTemplateForYouListViewModel.class, new Function0() { // from class: X.0xSH
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
                                com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateErrorAssem r4 = r5.LL
                                X.0QSJ r1 = r4.LLJJJIL
                                if (r1 != 0) goto L27
                                X.0Q7z r3 = r4.LLJJJ
                                if (r3 != 0) goto L10
                                X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
                                r4.LLJJJ = r3
                            L10:
                                r0 = 1
                                java.lang.Class[] r2 = new java.lang.Class[r0]
                                r1 = 0
                                java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouScope> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouScope.class
                                r2[r1] = r0
                                X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
                                r4.LLJJJIL = r1
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
                            throw new UnsupportedOperationException("Method not decompiled: X.C1819750xSH.invoke():java.lang.Object");
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        C786410Ut5.h8((C16FS) this.LLJJIJIIJIL.getValue(), new View.OnClickListener() { // from class: X.0xSI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AssemVMLazy assemVMLazy = this.LL.LLJJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IntelligentBoardTemplateErrorAssem.LLJJJJ;
                ((AssemListViewModel) assemVMLazy.getValue()).manualListRetry(EnumC323450Cm7.Refresh);
            }
        });
        LiveIconView liveIconView = (LiveIconView) this.LLJJIII.getValue();
        if (C011Z.LIZ.LJIJ(getContext())) {
            i = -1;
        } else {
            i = -16777216;
        }
        liveIconView.setIconTint(i);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xME
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C326170CqV) obj).LL;
            }
        }, null, new C1246040iWw(this), 6);
    }
}
