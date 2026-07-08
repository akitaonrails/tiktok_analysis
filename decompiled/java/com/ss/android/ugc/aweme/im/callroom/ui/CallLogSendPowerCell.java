package com.ss.android.ugc.aweme.im.callroom.ui;

import X.C0ZL0;
import X.C0ZQF;
import X.C0ZXL;
import X.C0ZXS;
import X.C0ZXU;
import X.C0ZXV;
import X.C0ZXY;
import X.C0ZXZ;
import X.C13LE;
import X.C1562980qm8;
import X.C1954807lC;
import X.C19719912Dl;
import X.C869590Y9l;
import X.C899860ZRw;
import X.InterfaceC907020Zi8;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class CallLogSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C899860ZRw> implements InterfaceC907020Zi8 {
    public View LLJJJIL;

    @Override // X.InterfaceC907020Zi8
    public final void LJLLL(double d) {
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(CallLogSendAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.callroom.ui.CallLogSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return C0ZQF.LIZ(c869590Y9l, Up());
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
            public final void onViewCreated(View view) {
                View viewLJFF;
                super.onViewCreated(view);
                IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                if (iIMMessageBubbleService != null && (viewLJFF = iIMMessageBubbleService.LJFF(view, false)) != null) {
                    CallLogSendPowerCell callLogSendPowerCell = this.LLLIIII;
                    dM(viewLJFF);
                    callLogSendPowerCell.R5(viewLJFF);
                    up(viewLJFF);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC907020Zi8
    public final View getBackgroundView() {
        C0ZXS c0zxs;
        C899860ZRw c899860ZRw = (C899860ZRw) getItem();
        C0ZXL c0zxl = (c899860ZRw == null || (c0zxs = c899860ZRw.LL) == null) ? null : c0zxs.LIZJ;
        if (c0zxl instanceof C0ZXV) {
            View view = this.LLJJJIL;
            if (view != null) {
                return view;
            }
            IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
            viewLJFF = iIMMessageBubbleService != null ? iIMMessageBubbleService.LJFF(LJJIJL(), false) : null;
            this.LLJJJIL = viewLJFF;
        } else if (!(c0zxl instanceof C0ZXY) && !(c0zxl instanceof C0ZXZ) && !(c0zxl instanceof C0ZXU) && c0zxl != null) {
            throw new C1954807lC();
        }
        return viewLJFF;
    }
}
