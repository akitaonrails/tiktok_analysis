package com.bytedance.android.livesdk.replay;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface LiveReplayTranscodeApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/replay/transcode/")
    C11NZ<Unit> transcodeLiveReplayVideo(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i);
}
