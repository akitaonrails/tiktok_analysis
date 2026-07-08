package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel;

import X.C01GW;
import X.C0AID;
import X.C0SVP;
import X.C14EU;
import X.C1608260rxA;
import X.C2174741A9g;
import X.C2188811AlT;
import X.C690940R8i;
import X.C690950R8j;
import X.EnumC655500PnQ;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS36S0010000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3AudioMuteViewModel extends AssemViewModel<C1608260rxA> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1608260rxA(C2174741A9g.LIZIZ.LJIIZILJ() || ((Boolean) C0AID.LIZ.getValue()).booleanValue(), 2);
    }

    public FriendsV3AudioMuteViewModel() {
        if (((Boolean) C0AID.LIZ.getValue()).booleanValue()) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (((Boolean) C0AID.LIZ.getValue()).booleanValue()) {
            return;
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onOpenOnMuteEvent(C690940R8i c690940R8i) {
        boolean z;
        C01GW c01gw = C690950R8j.LIZ;
        if (!C690950R8j.LIZIZ || getState().LL == (z = c690940R8i.LIZ)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOpenOnMuteEvent: muteIconState=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(new AwS36S0010000_24(z, 4));
    }

    public final void vQ2(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsMute: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = getState().LL;
        setState(new AwS36S0010000_24(z, 5));
        if (z2 && !z && C690950R8j.LIZIZ) {
            C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
            if (c2174741A9g.LJIILJJIL()) {
                c2174741A9g.LJIILL(c2174741A9g.LIZIZ(null), EnumC655500PnQ.CLICK_UNMUTE_BUTTON, C0SVP.STYLE_FOLD_BUTTON);
                c2174741A9g.LJIIJ();
            }
        }
    }
}
