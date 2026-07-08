package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1818420xQ8;
import X.C1818910xQv;
import X.C1818920xQw;
import X.C1818930xQx;
import X.C1818940xQy;
import X.C1818960xR0;
import X.C1818970xR1;
import X.C1818980xR2;
import X.C1818990xR3;
import X.C1819010xR5;
import X.C1819020xR6;
import X.C1819030xR7;
import X.C1834150xpV;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.SceneryBtmOperationAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.cell.SceneryModeOperationCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.viewmodel.SceneryModeOperationListViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryBtmOperationAssem extends UIListContentAssem<SceneryModeOperationListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1818960xR0(this));
    public final C01GW LLJ = C452501pT.LIZIZ(new C1818980xR2(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1818990xR3(this));
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SceneryBtmOperationAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/operationbtm/viewmodel/SceneryModeOperationListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SceneryBtmOperationAssem.class, "sceneryApplyViewModel", "getSceneryApplyViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/SceneryApplyViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SceneryBtmOperationAssem.class, "sceneryPictureViewModel", "getSceneryPictureViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/picturechunk/SceneryPictureViewModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public SceneryBtmOperationAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SceneryModeOperationListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1818920xQw(c19719912DlLIZ), new C1819010xR5(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SceneryApplyViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1818930xQx(c19719912DlLIZ2), new C1819020xR6(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SceneryPictureViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1818940xQy(c19719912DlLIZ3), new C1819030xR7(), null, true);
        this.LLJILLL = C452501pT.LIZIZ(new C1818970xR1(this));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LJ = true;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    public final LiveIconView Lo() {
        return (LiveIconView) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context contextLJII = C1834150xpV.LJII(view.getContext());
        ((LiveIconView) this.LLJ.getValue()).setIconTint(C20736316Cj.LIZIZ(R.attr.ezq, contextLJII));
        Lo().setIconTint(C20736316Cj.LIZIZ(R.attr.ezq, contextLJII));
        View view2 = (View) this.LLIZLLLIL.getValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exg, ((View) this.LLIZLLLIL.getValue()).getContext()));
        view2.setBackground(gradientDrawable);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(SceneryModeOperationCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvGo.getContext(), 0, false));
        viewOnAttachStateChangeListenerC20604515jvGo.setNestedScrollingEnabled(false);
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xQs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1818830xQn) obj).LLILLJJLI;
            }
        }, null, new C1818420xQ8(this), 6);
        C786410Ut5.g8((LiveIconView) this.LLJ.getValue(), new View.OnClickListener() { // from class: X.0xQA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                AssemVMLazy assemVMLazy2 = this.LL.LLJILJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SceneryBtmOperationAssem.LLJJ;
                SceneryApplyViewModel sceneryApplyViewModel = (SceneryApplyViewModel) assemVMLazy2.getValue();
                sceneryApplyViewModel.LL.Ek(sceneryApplyViewModel.vQ2().LL, false);
            }
        });
        C786410Ut5.g8(Lo(), new View.OnClickListener() { // from class: X.0xQ9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                AssemVMLazy assemVMLazy2 = this.LL.LLJILJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SceneryBtmOperationAssem.LLJJ;
                SceneryApplyViewModel sceneryApplyViewModel = (SceneryApplyViewModel) assemVMLazy2.getValue();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(sceneryApplyViewModel), null, null, new C1815460xLM(sceneryApplyViewModel, null), 3);
            }
        });
        Lo().setEnabled(false);
        C736680Sv4.LJIIIIZZ(this, this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.0xQz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612620O1c) obj).LLILLL;
            }
        }, null, new C1818910xQv(this, view), 6);
    }
}
