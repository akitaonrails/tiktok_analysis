package com.ss.android.ugc.aweme.ecommerce.base.osp.logisticpanel;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregateLogisticPanelAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public ConstraintLayout LLJ;
    public C197039127h LLJI;
    public final AssemVMLazy LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AggregateLogisticPanelAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/logisticpanel/AggregateLogisticPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AggregateLogisticPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AggregateLogisticPanelViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 140), AFwS228S0000000_1.get$arr$(68), null, true);
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ald) : null;
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C197039127h Ho() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ale) : null;
            this.LLJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final AggregateLogisticPanelViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (AggregateLogisticPanelViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c4 A[PHI: r3
      0x01c4: PHI (r3v7 android.view.View) = (r3v6 android.view.View), (r3v13 android.view.View) binds: [B:85:0x01b1, B:90:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.logisticpanel.AggregateLogisticPanelAssem.onViewCreated(android.view.View):void");
    }
}
