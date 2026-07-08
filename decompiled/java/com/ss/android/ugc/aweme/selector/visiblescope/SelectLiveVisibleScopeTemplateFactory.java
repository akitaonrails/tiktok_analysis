package com.ss.android.ugc.aweme.selector.visiblescope;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1225740i0C;
import X.DialogInterfaceOnDismissListenerC1225880i0Q;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectLiveVisibleScopeTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "live_visible_scope";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        DialogInterfaceOnDismissListenerC1225880i0Q dialogInterfaceOnDismissListenerC1225880i0Q;
        if (!(abstractC1225780i0G instanceof DialogInterfaceOnDismissListenerC1225880i0Q) || (dialogInterfaceOnDismissListenerC1225880i0Q = (DialogInterfaceOnDismissListenerC1225880i0Q) abstractC1225780i0G) == null) {
            return null;
        }
        return new C1225740i0C(dialogInterfaceOnDismissListenerC1225880i0Q);
    }
}
