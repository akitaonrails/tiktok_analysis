package com.ss.android.ugc.aweme.feed.api;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveTaskApi {
    public static final LiveTaskApi LIZ = new LiveTaskApi();

    public interface RealApi {
        @InterfaceC1501240pAY("/webcast/live_center/task/event_report/")
        @InterfaceC1501300pAe
        C11NZ<TaskFinishResponse> finishTask(@InterfaceC1501050pAF("video_id") String str, @InterfaceC1501050pAF("event_type") int i);
    }
}
