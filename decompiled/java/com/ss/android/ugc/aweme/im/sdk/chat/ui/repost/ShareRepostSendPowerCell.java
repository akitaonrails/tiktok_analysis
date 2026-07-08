package com.ss.android.ugc.aweme.im.sdk.chat.ui.repost;

import X.C0Z2Z;
import X.C0ZL0;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C462400IBi;
import X.C869590Y9l;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.RepostCardStatusComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareRepostSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C462400IBi> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareRepostReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.repost.ShareRepostSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                ShareRepostCardTemplate shareRepostCardTemplate;
                BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                if (baseTemplateLIZ instanceof ShareRepostCardTemplate) {
                    shareRepostCardTemplate = (ShareRepostCardTemplate) baseTemplateLIZ;
                } else {
                    shareRepostCardTemplate = null;
                }
                boolean z = false;
                if (shareRepostCardTemplate != null && shareRepostCardTemplate.shareRepost.status == RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_SUCCESS) {
                    z = true;
                }
                return yp(c869590Y9l, z);
            }
        };
    }
}
