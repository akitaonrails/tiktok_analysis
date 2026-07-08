package com.ss.bytertc.engine.livepusher;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.NativeLivePusherFunctions;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LiveProberImpl extends LiveProber {
    public Context mContext;
    public LiveProberEventHandler mExLiveProberEventHandler;
    public final ReentrantReadWriteLock.ReadLock mJniReadLock;
    public final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    public ILiveProberEventHandler mLiveProberEventHandler;
    public long mNativeEngine;
    public final ReentrantReadWriteLock mReadWriteLock;
    public RTCVideo mRtcVideo;

    public boolean engineInvalid() {
        return this.mNativeEngine == 0;
    }

    @Override // com.ss.bytertc.engine.livepusher.LiveProber
    public int startProbe() {
        LogUtil.d("LiveProberImpl", "startProbe");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LiveProberImpl", "native engine is invalid, startProbe failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeStartProbe = NativeLivePusherFunctions.nativeStartProbe(this.mNativeEngine);
            this.mJniReadLock.unlock();
            return iNativeStartProbe;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LiveProber
    public int stopProbe() {
        LogUtil.d("LiveProberImpl", "stopProbe");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LiveProberImpl", "native engine is invalid, stopProbe failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeStopProbe = NativeLivePusherFunctions.nativeStopProbe(this.mNativeEngine);
            this.mJniReadLock.unlock();
            return iNativeStopProbe;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public ILiveProberEventHandler getLiveProberEventHandler() {
        return this.mLiveProberEventHandler;
    }

    @Override // com.ss.bytertc.engine.livepusher.LiveProber
    public void doDestroy(boolean z) {
        LogUtil.d("LiveProberImpl", "destroy LiveProberImpl.");
        this.mJniWriteLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LiveProberImpl", "native engine is invalid, no need to destroy now.");
                this.mJniWriteLock.unlock();
                return;
            }
            long j = this.mNativeEngine;
            this.mNativeEngine = 0L;
            this.mJniWriteLock.unlock();
            NativeLivePusherFunctions.nativeDestroyLiveProber(j);
            int i = LivePusherImpl.rtcVideoInstanceCount - 1;
            LivePusherImpl.rtcVideoInstanceCount = i;
            if (z && this.mRtcVideo != null && i <= 0) {
                RTCVideo.destroyRTCVideo();
                this.mRtcVideo = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LiveProber
    public void getBandwidthResult(RTMPProbeBandwidthResult rTMPProbeBandwidthResult) {
        LogUtil.d("LiveProberImpl", "getBandwidthResult");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LiveProberImpl", "native engine is invalid, getBandwidthResult failed.");
            } else if (rTMPProbeBandwidthResult != null) {
                NativeLivePusherFunctions.nativeGetBandwidthResult(this.mNativeEngine, rTMPProbeBandwidthResult);
                this.mJniReadLock.unlock();
                return;
            }
            this.mJniReadLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.LiveProber
    public int setLiveProberConfig(LiveProberConfig liveProberConfig) {
        LogUtil.d("LiveProberImpl", "setLiveProberConfig");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("LiveProberImpl", "native engine is invalid, setLiveProberConfig failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeSetLiveProberConfig = NativeLivePusherFunctions.nativeSetLiveProberConfig(this.mNativeEngine, new InternalLiveProberConfig(liveProberConfig));
            this.mJniReadLock.unlock();
            return iNativeSetLiveProberConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    private JSONObject parametersAppendUrl(JSONObject jSONObject, String str) {
        if (str.isEmpty()) {
            return jSONObject;
        }
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                LogUtil.w("LiveProberImpl", "parameters json object append urls failed", e);
                return jSONObject;
            }
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("rtc.live_pusher_urls", jSONArray);
        return jSONObject;
    }

    public LiveProberImpl(Context context, String str, String str2, ILiveProberEventHandler iLiveProberEventHandler, Object obj, JSONObject jSONObject) {
        String strJ3;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create LivePusherImpl with appId: ");
        sbLIZ.append(str2);
        LogUtil.d("LiveProberImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (str2 != null) {
            this.mContext = C786410Ut5.N3(context);
            this.mLiveProberEventHandler = iLiveProberEventHandler;
            this.mExLiveProberEventHandler = new LiveProberEventHandler(this);
            LivePusherImpl.rtcVideoInstanceCount++;
            JSONObject jSONObjectParametersAppendUrl = parametersAppendUrl(jSONObject, str);
            this.mRtcVideo = RTCVideo.createRTCVideo(this.mContext, str2, null, obj, jSONObjectParametersAppendUrl);
            try {
                Context context2 = this.mContext;
                LiveProberEventHandler liveProberEventHandler = this.mExLiveProberEventHandler;
                if (jSONObjectParametersAppendUrl == null) {
                    strJ3 = "";
                } else {
                    strJ3 = C786410Ut5.J3(jSONObjectParametersAppendUrl);
                }
                this.mNativeEngine = NativeLivePusherFunctions.nativeCreateLiveProber(context2, str, str2, liveProberEventHandler, strJ3);
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("exception info:");
                sbLIZ2.append(Arrays.toString(e.getStackTrace()));
                throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
