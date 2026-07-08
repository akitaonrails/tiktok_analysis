package com.ss.android.ugc.aweme.im.streaming.remote;

import X.C0X9S;
import X.C1515820pY4;
import X.C1515830pY5;
import X.C906250Zgt;
import X.C906720Zhe;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174608fY;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingInterruptResponseData;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface StreamingApi {
    @InterfaceC2174608fY
    @InterfaceC1501160pAQ("/tiktok/v2/im/get_streaming_msg")
    Object getStreamingMsg(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super C1515820pY4<C1515830pY5<C906250Zgt, Void>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v2/im/interrupt_streaming_msg")
    C0X9S<ComposePbAndJson<C906720Zhe, StreamingInterruptResponseData>> interruptStreamMsg(@InterfaceC1501130pAN Map<String, String> map);
}
