package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C0SXN;
import X.C0ZDX;
import X.C0ZL0;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C869590Y9l;
import X.C911040Zoc;
import X.InterfaceC1891350zJl;
import X.InterfaceC461380I7k;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class QuickLiveVideoReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C911040Zoc> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickLiveReactionVideoReceiveAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveVideoReceivePowerCell$createAssemAttached2Cell$1
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
        super.onBindItemView((C911040Zoc) interfaceC1891350zJl);
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
