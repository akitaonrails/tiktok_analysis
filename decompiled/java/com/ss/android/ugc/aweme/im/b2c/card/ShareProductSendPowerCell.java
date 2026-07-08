package com.ss.android.ugc.aweme.im.b2c.card;

import X.C0I6Y;
import X.C0ZL0;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C462670ICj;
import X.C724270Sb3;
import X.C869590Y9l;
import X.InterfaceC461380I7k;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareProductSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C462670ICj> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareProductReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.b2c.card.ShareProductSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                IEcommerceLogUtil iEcommerceLogUtil = (IEcommerceLogUtil) PluggableExtentionKt.pluggableSpiForReal(IEcommerceLogUtil.class);
                if (iEcommerceLogUtil != null) {
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null));
                    C724270Sb3 c724270Sb32 = this.LLJI;
                    ShareProductContent shareProductContent = (ShareProductContent) BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb32 != null ? c724270Sb32.LL : null)), ShareProductContent.class);
                    if (shareProductContent == null) {
                        return;
                    }
                    iEcommerceLogUtil.LJI(this.LLLIIII.itemView, c869590Y9lLIZ, shareProductContent);
                }
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return yp(c869590Y9l, true);
            }
        };
    }
}
