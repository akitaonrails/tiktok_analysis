package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api;

import X.C057D;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyBatchSyncRequest;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyBatchSyncResponse;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyConfigGetResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface FrequencyControlAPI {
    public static final C057D LIZ = C057D.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/im/dm_management/frequency/batch_sync")
    C11NZ<FrequencyBatchSyncResponse> batchSync(@InterfaceC1485405rg FrequencyBatchSyncRequest frequencyBatchSyncRequest);

    @InterfaceC1501160pAQ("/tiktok/v1/im/dm_management/frequency/check")
    C11NZ<Object> check(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str, @InterfaceC1501070pAH("frequency_type") int i, @InterfaceC1501070pAH("ids") List<String> list, @InterfaceC1501070pAH("extra") String str2);

    @InterfaceC1501160pAQ("/tiktok/v1/im/dm_management/frequency/config/get")
    C11NZ<FrequencyConfigGetResponse> configGet(@InterfaceC1501070pAH("extra") String str);
}
