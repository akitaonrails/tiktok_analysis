package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized;

import X.C019F;
import X.C01D1;
import X.C01DP;
import X.C01DX;
import X.C09R3;
import X.C0J2O;
import X.C0J2P;
import X.C0J2U;
import X.C0J2Y;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C485460J2a;
import X.C687700QyG;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationBottomBarHeightViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.OverlayImageEditorAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class OverlayImageEditorAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OverlayImageEditorAssem.class, "editPageViewModel", "getEditPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditPageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(OverlayImageEditorAssem.class, "bottomBarHeightViewModel", "getBottomBarHeightViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/DecorationBottomBarHeightViewModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public OverlayImageEditorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardEditPageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C0J2O(c19719912DlLIZ), new C485460J2a(), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(DecorationBottomBarHeightViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new C0J2P(c19719912DlLIZ2), new C0J2Y(), null, true);
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.g0o;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CustomizedBoardScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CustomizedBoardScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new C0J2U(this));
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0J2G
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OverlayImageEditorAssem@569e.onViewCreated$2");
                try {
                    OverlayImageEditorAssem overlayImageEditorAssem = this.LL;
                    AssemVMLazy assemVMLazy = overlayImageEditorAssem.LLJJIII;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = OverlayImageEditorAssem.LLJJIJIIJIL;
                    overlayImageEditorAssem.withState((DecorationBottomBarHeightViewModel) assemVMLazy.getValue(), new C0J2E(view));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OverlayImageEditorAssem@569e.onViewCreated$2");
            }
        });
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        ((FullyCustomizedBoardEditPageViewModel) assemVMLazy.getValue()).xQ2();
        C01DX.LIZIZ("show", ((C01DP) this.LLJJIJI.getValue()).LLILZ, ((C01DP) this.LLJJIJI.getValue()).LLIZLLLIL, ((C01DP) this.LLJJIJI.getValue()).LLJ, null, true);
    }
}
