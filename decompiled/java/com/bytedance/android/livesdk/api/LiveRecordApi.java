package com.bytedance.android.livesdk.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import webcast.api.room.RecordLiveResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface LiveRecordApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/record_live/")
    C11NZ<C470590Icr<RecordLiveResponse>> updateRecordLiveState(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("action") int i, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i2);
}
