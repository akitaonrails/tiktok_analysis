package com.ss.bytertc.engine.livepusher;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.InternalNetworkQualityInfo;
import com.ss.bytertc.engine.InternalSourceWantedData;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class LivePusherEventHandler {
    public WeakReference<LivePusherImpl> mLivePusherImpl;

    public LivePusherEventHandler(LivePusherImpl livePusherImpl) {
        this.mLivePusherImpl = new WeakReference<>(livePusherImpl);
    }

    public void onLocalAudioStateChanged(LivePusherLocalAudioState livePusherLocalAudioState) {
        LivePusherImpl livePusherImpl;
        ILivePusherEventHandler livePusherEventHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLocalAudioStateChanged, state: ");
        sbLIZ.append(livePusherLocalAudioState.value());
        LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            WeakReference<LivePusherImpl> weakReference = this.mLivePusherImpl;
            if (weakReference != null && (livePusherImpl = weakReference.get()) != null && (livePusherEventHandler = livePusherImpl.getLivePusherEventHandler()) != null) {
                livePusherEventHandler.onLocalAudioStateChanged(livePusherLocalAudioState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLocalAudioStateChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onLocalVideoStateChanged(LivePusherLocalVideoState livePusherLocalVideoState) {
        LivePusherImpl livePusherImpl;
        ILivePusherEventHandler livePusherEventHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLocalVideoStateChanged, state: ");
        sbLIZ.append(livePusherLocalVideoState.value());
        LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            WeakReference<LivePusherImpl> weakReference = this.mLivePusherImpl;
            if (weakReference != null && (livePusherImpl = weakReference.get()) != null && (livePusherEventHandler = livePusherImpl.getLivePusherEventHandler()) != null) {
                livePusherEventHandler.onLocalVideoStateChanged(livePusherLocalVideoState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLocalVideoStateChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onNetworkQuality(InternalNetworkQualityInfo internalNetworkQualityInfo) {
        LivePusherImpl livePusherImpl;
        ILivePusherEventHandler livePusherEventHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Local onNetworkQuality, uid: ");
        sbLIZ.append(internalNetworkQualityInfo.uid);
        sbLIZ.append(", info: ");
        sbLIZ.append(internalNetworkQualityInfo.toString());
        LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            WeakReference<LivePusherImpl> weakReference = this.mLivePusherImpl;
            if (weakReference != null && (livePusherImpl = weakReference.get()) != null && (livePusherEventHandler = livePusherImpl.getLivePusherEventHandler()) != null) {
                livePusherEventHandler.onNetworkQuality(new NetworkQualityStats(internalNetworkQualityInfo));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onNetworkQuality callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onLogCallback(String str, String str2) {
        LivePusherImpl livePusherImpl;
        ILivePusherEventHandler livePusherEventHandler;
        try {
            WeakReference<LivePusherImpl> weakReference = this.mLivePusherImpl;
            if (weakReference != null && (livePusherImpl = weakReference.get()) != null && (livePusherEventHandler = livePusherImpl.getLivePusherEventHandler()) != null) {
                livePusherEventHandler.onLogCallback(str, str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPerformanceAlarms callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onError(LivePusherErrorCode livePusherErrorCode, int i, String str) {
        LivePusherImpl livePusherImpl;
        ILivePusherEventHandler livePusherEventHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError... errCode: ");
        sbLIZ.append(livePusherErrorCode.value());
        sbLIZ.append(", subCode: ");
        sbLIZ.append(i);
        sbLIZ.append(", errMsg: ");
        sbLIZ.append(str);
        LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<LivePusherImpl> weakReference = this.mLivePusherImpl;
        if (weakReference != null && (livePusherImpl = weakReference.get()) != null && (livePusherEventHandler = livePusherImpl.getLivePusherEventHandler()) != null) {
            livePusherEventHandler.onError(livePusherErrorCode, i, str);
        }
    }

    public void onStatusChanged(LivePusherStatus livePusherStatus, int i, String str) {
        LivePusherImpl livePusherImpl;
        ILivePusherEventHandler livePusherEventHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStatusChanged... status: ");
        sbLIZ.append(livePusherStatus.value());
        sbLIZ.append(", code: ");
        sbLIZ.append(i);
        sbLIZ.append(", msg: ");
        sbLIZ.append(str);
        LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<LivePusherImpl> weakReference = this.mLivePusherImpl;
        if (weakReference != null && (livePusherImpl = weakReference.get()) != null && (livePusherEventHandler = livePusherImpl.getLivePusherEventHandler()) != null) {
            livePusherEventHandler.onStatusChanged(livePusherStatus, i, str);
        }
    }

    public void onPerformanceAlarms(int i, String str, int i2, InternalSourceWantedData internalSourceWantedData) {
        LivePusherImpl livePusherImpl;
        PerformanceAlarmReason performanceAlarmReason;
        PerformanceAlarmMode performanceAlarmMode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPerformanceAlarms, level: ");
        sbLIZ.append(i2);
        sbLIZ.append(", data: ");
        sbLIZ.append(internalSourceWantedData);
        LogUtil.d("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            WeakReference<LivePusherImpl> weakReference = this.mLivePusherImpl;
            if (weakReference != null && (livePusherImpl = weakReference.get()) != null) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_RESUMED;
                            } else {
                                performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_RESUMED;
                            }
                        } else {
                            performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_FALLBACKED;
                        }
                    } else {
                        performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_RESUMED;
                    }
                } else {
                    performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_FALLBACKED;
                }
                ILivePusherEventHandler livePusherEventHandler = livePusherImpl.getLivePusherEventHandler();
                if (livePusherEventHandler != null) {
                    if (i == 0) {
                        performanceAlarmMode = PerformanceAlarmMode.NORMAL;
                    } else {
                        performanceAlarmMode = PerformanceAlarmMode.SIMULCAST;
                    }
                    livePusherEventHandler.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, new SourceWantedData(internalSourceWantedData));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPerformanceAlarms callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("LivePusherEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
