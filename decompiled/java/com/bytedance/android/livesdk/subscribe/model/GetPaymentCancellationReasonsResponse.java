package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.PaymentCancellationReason;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetPaymentCancellationReasonsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("reasons")
        public List<PaymentCancellationReason> reasons = new ArrayList();
    }
}
