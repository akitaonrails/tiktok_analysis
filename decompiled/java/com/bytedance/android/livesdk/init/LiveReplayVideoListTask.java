package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class LiveReplayVideoListTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "fetch_live_reply_video_list_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        try {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            Boolean bool = Boolean.FALSE;
            iBroadcastService.checkScheduledLiveReplayVideoTask(true, null, bool, null, bool);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
