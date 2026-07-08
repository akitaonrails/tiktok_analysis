package com.ss.bytertc.engine.livepusher;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.utils.LogUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class LiveProber {
    public static int instanceCount;

    public abstract void doDestroy(boolean z);

    public abstract void getBandwidthResult(RTMPProbeBandwidthResult rTMPProbeBandwidthResult);

    public abstract int setLiveProberConfig(LiveProberConfig liveProberConfig);

    public abstract int startProbe();

    public abstract int stopProbe();

    public static void destroyLiveProber(LiveProber liveProber) {
        boolean z;
        try {
            LivePusher.rtcVideoLock.lock();
            if (liveProber != null) {
                if (instanceCount == 1) {
                    z = true;
                } else {
                    z = false;
                }
                liveProber.doDestroy(z);
                int i = instanceCount;
                if (i > 0) {
                    instanceCount = i - 1;
                }
            }
            LivePusher.rtcVideoLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LivePusher.rtcVideoLock.unlock();
            throw th;
        }
    }

    public static LiveProber createLiveProber(Context context, String str, String str2, ILiveProberEventHandler iLiveProberEventHandler, Object obj, JSONObject jSONObject) {
        if (context != null && !TextUtils.isEmpty(str2)) {
            try {
                LivePusher.rtcVideoLock.lock();
                if (str2 != null) {
                    try {
                        instanceCount++;
                        LiveProberImpl liveProberImpl = new LiveProberImpl(context, str, str2, iLiveProberEventHandler, obj, jSONObject);
                        LivePusher.rtcVideoLock.unlock();
                        return liveProberImpl;
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        LivePusher.rtcVideoLock.unlock();
                        return null;
                    }
                }
                LivePusher.rtcVideoLock.unlock();
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LivePusher.rtcVideoLock.unlock();
                throw th;
            }
        }
        LogUtil.e("LiveProber", "createLiveProber: context or app id is empty");
        return null;
    }
}
