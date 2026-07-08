package com.bytedance.common.jato;

import X.C07TK;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes27.dex */
public class JatoXLConfig {
    public long mBlockInterval;
    public Context mContext;
    public boolean mEnabledThreadPrioProtect;
    public ExecutorService mExecuteService;
    public boolean mIsAddref;
    public boolean mIsDebug;
    public boolean mIsEnabledDalvikGcBlocker;
    public boolean mIsSupportApex;
    public int mLogCutType;
    public C07TK mMonitor;
    public int mPriority;
    public boolean mResetForNewThread;
    public boolean mUseByteHook;
    public boolean mUseInterpreterBridge;
    public boolean mUseJitBlock;
    public boolean mUseLogCut;
    public boolean mUseSoLoad;
    public int mPrioVersion = 1;
    public boolean mIsEnabledArtGcBlocker = true;
    public int mMaxGcBlockTime = LivePreCreateNextRoomPlayer.ENABLE;
    public int mGcHeapLimit = -1;
    public boolean isEnabledCpuSetFeature = true;

    public boolean isLargeHeapApp() {
        return (this.mContext.getApplicationInfo().flags & 1048576) != 0;
    }

    public int getGcHeapLimit() {
        return this.mGcHeapLimit;
    }

    public boolean getIsSupportApex() {
        return this.mIsSupportApex;
    }

    public int getMaxGcBlockTimeout() {
        return this.mMaxGcBlockTime;
    }

    public boolean isDebug() {
        return this.mIsDebug;
    }

    public boolean isEnabledArtGcBlocker() {
        return this.mIsEnabledArtGcBlocker;
    }

    public boolean isEnabledDalvikGcBlocker() {
        return this.mIsEnabledDalvikGcBlocker;
    }
}
