package com.ss.android.ugc.aweme.im.sdk.chat.ui.comment;

import X.C0Z2Z;
import X.C0ZL0;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C461610I8h;
import X.C869590Y9l;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.message.template.card.ShareCommentCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.CommentFallbackStatusComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareCommentTemplateSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C461610I8h> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareCommentTemplateReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.comment.ShareCommentTemplateSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                ShareCommentCardTemplate shareCommentCardTemplate = (ShareCommentCardTemplate) C0Z2Z.LIZ(c869590Y9l, ShareCommentCardTemplate.class);
                boolean z = false;
                if (shareCommentCardTemplate != null && shareCommentCardTemplate.commentFallbackStatusComponent == CommentFallbackStatusComponent.STATUS_COMMENT_VISIBLE) {
                    z = true;
                }
                return yp(c869590Y9l, z);
            }
        };
    }
}
