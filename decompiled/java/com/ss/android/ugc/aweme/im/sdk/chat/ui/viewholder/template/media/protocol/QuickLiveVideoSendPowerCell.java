package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.AbstractC899510ZQn;
import X.C0SXN;
import X.C0ZDX;
import X.C0ZL0;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C462510IBt;
import X.C869590Y9l;
import X.C911010ZoZ;
import X.InterfaceC1891350zJl;
import X.InterfaceC461380I7k;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.List;
import kotlin.jvm.internal.AwS380S0200000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class QuickLiveVideoSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C911010ZoZ> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickLiveReactionVideoSendAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveVideoSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridgeBp = Bp();
                AbstractC899510ZQn<?, ?> abstractC899510ZQnFQ2 = skeletonLayoutAssemblerBridgeBp != null ? skeletonLayoutAssemblerBridgeBp.fQ2(C462510IBt.LIZ) : null;
                if (!(abstractC899510ZQnFQ2 instanceof AbstractC899510ZQn) || abstractC899510ZQnFQ2 == null) {
                    return;
                }
                tp(C462510IBt.LIZ);
                sp(new AwS380S0200000_14(this, (QuickLiveVideoSendPowerCell$createAssemAttached2Cell$1) abstractC899510ZQnFQ2, (AbstractC899510ZQn<?, MessageLeftIconState>) 49));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                boolean z;
                if (c869590Y9l.isSuccessStatus() && C0ZDX.LJJJJIZL(c869590Y9l)) {
                    z = true;
                } else {
                    z = false;
                }
                return yp(c869590Y9l, z);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    /* JADX INFO: renamed from: W5 */
    public final void onBindItemView(InterfaceC461380I7k interfaceC461380I7k) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onBindItemView(interfaceC461380I7k);
        C0SXN.LIZ("im_power_cell_on_bind_item_view", System.currentTimeMillis() - jCurrentTimeMillis);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell, com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onBindItemView((C911010ZoZ) interfaceC1891350zJl);
        C0SXN.LIZ("im_power_cell_on_bind_item_view", System.currentTimeMillis() - jCurrentTimeMillis);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell, com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        C0SXN.LIZ("im_power_cell_on_create_item_view", System.currentTimeMillis() - jCurrentTimeMillis);
        return viewOnCreateItemView;
    }
}
