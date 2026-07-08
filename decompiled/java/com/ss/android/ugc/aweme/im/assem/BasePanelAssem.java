package com.ss.android.ugc.aweme.im.assem;

import X.C019F;
import X.C06PH;
import X.C06PI;
import X.C06RM;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePanelAssem extends UISlotAssem {
    public static final C06PI LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final long LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.06PI] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasePanelAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = new Object() { // from class: X.06PI
        };
        LLJJIJIIJIL = C06RM.LIZ() ? 300L : 150L;
    }

    public BasePanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 295), AFwS229S0000000_2.get$arr$(228), null, true);
    }

    public abstract C19719912Dl ip();

    public final PanelStateViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C06PH(this, view, null), 3);
    }
}
