package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools;

import X.C019F;
import X.C01D1;
import X.C09R3;
import X.C1001240cA6;
import X.C1001250cA7;
import X.C1001260cA8;
import X.C1001270cA9;
import X.C1001280cAA;
import X.C1120090fFn;
import X.C1161920gLG;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1817580xOm;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C291301Ax;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC1814530xJr;
import X.InterfaceC2217461Bqa;
import X.ViewOnLayoutChangeListenerC1001230cA5;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class DecorationEditAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public ConstraintLayout LLJJI;
    public final ViewOnLayoutChangeListenerC1001230cA5 LLJJIII = new View.OnLayoutChangeListener() { // from class: X.0cA5
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            AssemVMLazy assemVMLazy = this.LL.LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = DecorationEditAssem.LLJJJJJIL;
            AssemViewModel value = assemVMLazy.getValue();
            int height = view.getHeight();
            if (height > 0) {
                value.setState(new C1001210cA3(height));
            }
        }
    };
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final InterfaceC1814530xJr LLJJJ;
    public final C1559260qg8 LLJJJIL;
    public final C1559260qg8 LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DecorationEditAssem.class, "boardTextDynamicStyleViewModel", "getBoardTextDynamicStyleViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/font/viewmodel/BoardTextDynamicStyleViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DecorationEditAssem.class, "decorationBottomBarHeightViewModel", "getDecorationBottomBarHeightViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/DecorationBottomBarHeightViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(DecorationEditAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/DecorationEditNavigationViewModel;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cA5] */
    public DecorationEditAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BoardTextDynamicStyleViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new C1001240cA6(c19719912DlLIZ), new C1817580xOm(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(DecorationBottomBarHeightViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new C1001250cA7(c19719912DlLIZ2), new C1001270cA9(), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(DecorationEditNavigationViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1001260cA8(c19719912DlLIZ3), new C1001280cAA(), null, true);
        this.LLJJJ = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
        this.LLJJJIL = new C1559260qg8(new C723590SZx(this, C291301Ax.class, "save_data"), checkSupervisorPrepared());
        this.LLJJJJ = new C1559260qg8(new C723590SZx(this, C1120090fFn.class, "DecorationEditData"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.g46;
    }

    public final C291301Ax hp() {
        return (C291301Ax) this.LLJJJIL.getValue();
    }

    public final DecorationEditNavigationViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (DecorationEditNavigationViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ConstraintLayout constraintLayout = this.LLJJI;
        if (constraintLayout != null) {
            constraintLayout.removeOnLayoutChangeListener(this.LLJJIII);
        }
        this.LLJJI = null;
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(com.bytedance.android.livesdk.model.BoardItem r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditAssem.kp(com.bytedance.android.livesdk.model.BoardItem, boolean):void");
    }
}
