package com.ss.android.ugc.aweme.im.actionbar.common.viewmodel;

import X.C0I0B;
import X.C1400340mXo;
import X.C20684815ws;
import X.C2344009Gk;
import X.C914160Zte;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveEventActionBarViewModel extends AssemViewModel<InterfaceC0148002o> {
    public static boolean vQ2() {
        ILiveEventOuterService iLiveEventOuterServiceK5;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpiForReal(ILiveOuterService.class);
        if (iLiveOuterService == null || (iLiveEventOuterServiceK5 = iLiveOuterService.K5()) == null) {
            return false;
        }
        return iLiveEventOuterServiceK5.enableCreateLiveEventInGroupChat();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(1);
    }

    public static void wQ2(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        c2344009Gk.LJIIIIZZ("event_page", "group_chat_bar");
        c2344009Gk.LJIIIIZZ("conversation_id", str2);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
