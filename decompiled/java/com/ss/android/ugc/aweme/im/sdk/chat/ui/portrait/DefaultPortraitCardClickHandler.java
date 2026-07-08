package com.ss.android.ugc.aweme.im.sdk.chat.ui.portrait;

import X.C01GW;
import X.C2244301Csm;
import X.C2244411Csx;
import X.C869590Y9l;
import X.InterfaceC2244421Csy;
import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPortraitCardClickAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.deeplink.IActionNavigationService;

/* JADX INFO: loaded from: classes35.dex */
public final class DefaultPortraitCardClickHandler implements MessageListPortraitCardClickAbility {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPortraitCardClickAbility
    public final void r52(C869590Y9l c869590Y9l, View view, PortraitCardTemplate portraitCardTemplate) {
        InterfaceC2244421Csy interfaceC2244421CsyLIZ;
        IActionNavigationService.LIZ.getClass();
        C01GW<IActionNavigationService> c01gw = C2244411Csx.LIZIZ;
        IActionNavigationService value = c01gw.getValue();
        if (value != null) {
            interfaceC2244421CsyLIZ = value.LIZ(c869590Y9l.getScene());
        } else {
            interfaceC2244421CsyLIZ = null;
        }
        ActionLinkComponent actionLinkComponentLIZ = portraitCardTemplate.linkComponent;
        if (actionLinkComponentLIZ == null) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        if (interfaceC2244421CsyLIZ != null) {
            interfaceC2244421CsyLIZ.LIZ(view, actionLinkComponentLIZ);
            return;
        }
        IActionNavigationService value2 = c01gw.getValue();
        if (value2 == null) {
            return;
        }
        value2.LIZIZ(view.getContext(), actionLinkComponentLIZ);
    }
}
