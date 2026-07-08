package com.ss.android.ugc.aweme.texttoimage;

import X.C0X9Q;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes9.dex */
public interface Text2ImageAIGCApi {
    @InterfaceC1501240pAY("/tiktok/v1/photo/notification_send")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("ai_task_id") String str, InterfaceC1364105Vn<? super Text2ImageAIGCNotificationResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/photo/text_magic")
    @InterfaceC1485505rh
    Object LIZIZ(@InterfaceC1501100pAK("text") String str, @InterfaceC1501100pAK("ai_task_id") String str2, @InterfaceC1501100pAK("retry") boolean z, InterfaceC1364105Vn<? super Text2ImageAIGCTextMagicResponse> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @C0X9Q("/tiktok/v1/photo/cancel_send")
    Object cancel(@InterfaceC1501100pAK("ai_task_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/photo/task_query")
    Object query(@InterfaceC1501120pAM("ai_task_id") String str, InterfaceC1364105Vn<? super Text2ImageAIGCQueryResponse> interfaceC1364105Vn);
}
