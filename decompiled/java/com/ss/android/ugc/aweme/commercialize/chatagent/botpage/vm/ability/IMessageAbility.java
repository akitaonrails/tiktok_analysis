package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability;

import X.InterfaceC494301wD;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveBotItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.ExtraRequestInfo;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public interface IMessageAbility extends InterfaceC494301wD {
    void A02(Message message);

    void ZU();

    void Zd(Function1<? super CommerceAgentActiveActionItem, Unit> function1);

    void dL2(Message message);

    void nn2(Context context);

    boolean oj();

    void xZ0(String str, boolean z, Map map, CommerceAgentActiveActionItem commerceAgentActiveActionItem, CommerceAgentActiveBotItem commerceAgentActiveBotItem, String str2, int i, int i2, ExtraRequestInfo extraRequestInfo);
}
