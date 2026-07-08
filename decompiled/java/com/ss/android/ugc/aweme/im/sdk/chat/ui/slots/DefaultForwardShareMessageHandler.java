package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.C069M;
import X.C0I0B;
import X.C1608506Rn;
import X.C20684815ws;
import X.C830490Whz;
import X.C869590Y9l;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListForwardShareMessageAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.service.automessage.IShareMessageHelper;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultForwardShareMessageHandler implements MessageListForwardShareMessageAbility {
    public final SessionInfo LL;
    public final Fragment LLILLJJLI;

    public DefaultForwardShareMessageHandler(Fragment fragment, SessionInfo sessionInfo) {
        this.LL = sessionInfo;
        this.LLILLJJLI = fragment;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListForwardShareMessageAbility
    public final void xA0(View view, C869590Y9l c869590Y9l, BaseContent baseContent, BaseTemplate baseTemplate) {
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if ((baseTemplate instanceof AwemeCardTemplate) && iMShareServiceLIZ != null && !iMShareServiceLIZ.LIZLLL(view, c869590Y9l)) {
            return;
        }
        IShareMessageHelper.LIZ.getClass();
        IShareMessageHelper iShareMessageHelperLIZ = C069M.LIZ();
        if (iShareMessageHelperLIZ != null) {
            iShareMessageHelperLIZ.LIZ(this.LL, view.getContext(), baseContent, baseTemplate, c869590Y9l, "forward", null, true, new AwS558S0100000_14(this, 862));
        }
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("enter_method", "forward");
        C20684815ws.LJIILLIIL("click_share_button", c830490Whz);
    }
}
