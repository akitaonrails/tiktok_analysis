package com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol;

import X.C0ZL0;
import X.C0ZQK;
import X.C0ZS9;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C869590Y9l;
import X.C898020ZKu;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MarkdownReceiverPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C0ZS9> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(MarkdownMsgReceiverAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol.MarkdownReceiverPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                sp(new AwS593S0100000_14(this, 22));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                ArrayList arrayList = new ArrayList(yp(c869590Y9l, false));
                arrayList.add(C0ZQK.LIZ(c869590Y9l, Up(), new AwS593S0100000_14(c869590Y9l, 23)));
                if (((C898020ZKu) Up()).LJIIJJI(c869590Y9l)) {
                    arrayList.add(((C898020ZKu) Up()).LIZLLL(c869590Y9l, new AwS415S0200000_14(c869590Y9l, this, 18)));
                }
                return arrayList;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
            public final void onViewCreated(View view) {
                View viewLJFF;
                super.onViewCreated(view);
                IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                if (iIMMessageBubbleService != null && (viewLJFF = iIMMessageBubbleService.LJFF(view, false)) != null) {
                    MarkdownReceiverPowerCell markdownReceiverPowerCell = this.LLLIIII;
                    dM(viewLJFF);
                    markdownReceiverPowerCell.R5(viewLJFF);
                    up(viewLJFF);
                }
            }
        };
    }
}
