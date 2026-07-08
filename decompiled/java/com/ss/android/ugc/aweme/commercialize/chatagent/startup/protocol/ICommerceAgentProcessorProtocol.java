package com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol;

import X.C06KX;
import X.C1077000e8I;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentEnterParams;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility;

/* JADX INFO: loaded from: classes17.dex */
public interface ICommerceAgentProcessorProtocol extends C06KX {
    void N01(Fragment fragment, CommerceAgentEnterParams commerceAgentEnterParams, C1077000e8I c1077000e8I, IMessageAbility iMessageAbility);

    int getPriority();

    boolean jI(CommerceAgentEnterParams commerceAgentEnterParams, IMessageAbility iMessageAbility);
}
