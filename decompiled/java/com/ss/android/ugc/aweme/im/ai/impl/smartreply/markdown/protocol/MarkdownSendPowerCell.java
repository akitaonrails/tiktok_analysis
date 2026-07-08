package com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol;

import X.C0ZL0;
import X.C0ZQK;
import X.C0ZSA;
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
import X.C898020ZKu;
import X.InterfaceC907020Zi8;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MarkdownSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C0ZSA> implements InterfaceC907020Zi8 {
    public View LLJJJIL;

    @Override // X.InterfaceC907020Zi8
    public final void LJLLL(double d) {
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(MarkdownMsgSenderAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol.MarkdownSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                sp(new AwS593S0100000_14(this, 24));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                ArrayList arrayList = new ArrayList(yp(c869590Y9l, false));
                arrayList.add(C0ZQK.LIZ(c869590Y9l, Up(), new AwS593S0100000_14(c869590Y9l, 25)));
                if (((C898020ZKu) Up()).LJIIJJI(c869590Y9l)) {
                    arrayList.add(((C898020ZKu) Up()).LIZLLL(c869590Y9l, new AwS415S0200000_14(c869590Y9l, this, 19)));
                }
                return arrayList;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
            public final void onViewCreated(View view) {
                View viewLJFF;
                super.onViewCreated(view);
                IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                if (iIMMessageBubbleService != null && (viewLJFF = iIMMessageBubbleService.LJFF(view, false)) != null) {
                    MarkdownSendPowerCell markdownSendPowerCell = this.LLLIIII;
                    dM(viewLJFF);
                    markdownSendPowerCell.R5(viewLJFF);
                    up(viewLJFF);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC907020Zi8
    public final View getBackgroundView() {
        C0ZXS c0zxs;
        C0ZSA c0zsa = (C0ZSA) getItem();
        C0ZXL c0zxl = (c0zsa == null || (c0zxs = c0zsa.LL) == null) ? null : c0zxs.LIZJ;
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
