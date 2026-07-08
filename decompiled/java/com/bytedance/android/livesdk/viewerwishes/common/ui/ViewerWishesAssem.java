package com.bytedance.android.livesdk.viewerwishes.common.ui;

import X.AbstractC738140SxQ;
import X.C0TZM;
import X.C1134130fcR;
import X.C13LE;
import X.C1559260qg8;
import X.C1850820yGO;
import X.C1850860yGS;
import X.C19719912Dl;
import X.C19ME;
import X.C2176931AHr;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C500260Jjc;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736820SvI;
import X.C969770bLL;
import X.InterfaceC2176981AHw;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.GameTrickyPickedData;
import com.bytedance.android.livesdk.viewerwishes.common.viewmodel.ViewerWishesViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ViewerWishesAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public DataChannel LLJI;
    public InterfaceC2176981AHw LLJIJIL;
    public C1134130fcR LLJILJIL;
    public C1850820yGO LLJILJILJ;
    public C1850860yGS LLJILLL;
    public Long LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ViewerWishesAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/viewerwishes/common/viewmodel/ViewerWishesViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final boolean Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return ((ViewerWishesViewModel) assemVMLazy.getValue()).AQ2();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC2176981AHw interfaceC2176981AHw = this.LLJIJIL;
        if (interfaceC2176981AHw != null) {
            interfaceC2176981AHw.onFinish(true);
        }
        super.onDestroy();
    }

    public ViewerWishesAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ViewerWishesViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 26);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(27);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 27), aFwS279S0000000_33, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = new C1559260qg8(new C723590SZx(this, C969770bLL.class, null), checkSupervisorPrepared());
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        Go((C2176931AHr) assemVMLazy.getValue().getState());
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(X.C2176931AHr r19) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewerwishes.common.ui.ViewerWishesAssem.Go(X.1AHr):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Boolean bool;
        C19ME c19me;
        super.onViewCreated(view);
        this.LLJI = ((C969770bLL) this.LLJ.getValue()).LL;
        this.LLJILJIL = (C1134130fcR) view.findViewById(R.id.viewer_picks_gift_bar_panel);
        this.LLJILJILJ = (C1850820yGO) view.findViewById(R.id.mdm);
        DataChannel dataChannel = this.LLJI;
        this.LLJILLL = new C1850860yGS(dataChannel);
        ViewGroup.LayoutParams layoutParams = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIJIIJIL(bool)) {
            C1850820yGO c1850820yGO = this.LLJILJILJ;
            if (c1850820yGO != null) {
                layoutParams = c1850820yGO.getLayoutParams();
            }
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                c19me.setMarginEnd(0);
                c19me.endToEnd = 0;
                C1850820yGO c1850820yGO2 = this.LLJILJILJ;
                if (c1850820yGO2 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1850820yGO2);
                    c1850820yGO2.setLayoutParams(c19me);
                }
            }
        }
        DataChannel dataChannel2 = this.LLJI;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, GameTrickyPickedData.class, new AwS612S0100000_33(this, 29));
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        AssemViewModel value = assemVMLazy.getValue();
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new AwS647S0100000_33(this, 5));
    }
}
