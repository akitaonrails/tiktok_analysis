package com.bytedance.android.sdk.ticketguard;

import X.C0XNI;
import X.C0XNM;
import X.C0XNR;
import X.C0XNT;
import X.C847600XMw;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public interface TicketGuardService {
    String getBase64ReePub();

    C0XNM getConsumerRequestContent(C847600XMw c847600XMw);

    Boolean getInitResult(String str);

    C0XNR getProviderContent(ProviderRequestParam providerRequestParam);

    void handleConsumerResponse(HandleConsumerResponseParam handleConsumerResponseParam);

    List<TicketData> handleProviderResponse(C0XNT c0xnt);

    String reeSign(String str, String str2);

    void setNTPTimeProvider(C0XNI c0xni);

    void tryInit(TicketGuardInitParam ticketGuardInitParam, Function1<? super Boolean, Unit> function1);
}
