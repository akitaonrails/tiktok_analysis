package com.ss.android.ugc.aweme.selector.inviteguest;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226000i0c;
import X.DialogInterfaceOnDismissListenerC1226010i0d;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveInviteGuestTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "live_invite_guest_template";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d;
        if (!(abstractC1225780i0G instanceof DialogInterfaceOnDismissListenerC1226010i0d) || (dialogInterfaceOnDismissListenerC1226010i0d = (DialogInterfaceOnDismissListenerC1226010i0d) abstractC1225780i0G) == null) {
            return null;
        }
        return new C1226000i0c(dialogInterfaceOnDismissListenerC1226010i0d);
    }
}
