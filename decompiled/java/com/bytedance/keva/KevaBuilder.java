package com.bytedance.keva;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes24.dex */
public class KevaBuilder {
    public static IKevaBuildConfig buildCallBackImpl;
    public static KevaBuilder mInstance = new KevaBuilder();
    public Context mContext;
    public boolean mEnableArrayMap;
    public boolean mEnableAsyncWrite;
    public boolean mEnableExecutorOpt;
    public boolean mEnableLoadOpt;
    public boolean mEnableLockOpt;
    public boolean mEnableMultiProcessHashIndex;
    public boolean mEnableSingleProcessHashIndex;
    public int mExecuteKevaType;
    public Executor mExecutor;
    public int mIsLoadFromNative;
    public boolean mMainThreadPriorityOpt;
    public KevaMonitor mMonitor;
    public String mPortedRepoName;
    public int mPriorityValue;
    public File mWorkDir;
    public int sIsEnableMultiProcessLoadFromNative;

    public interface IKevaBuildConfig {
        void setKevaConfig(KevaBuilder kevaBuilder);
    }

    public static void clearInstance() {
        mInstance = null;
    }

    public static KevaBuilder getInstance() {
        KevaBuilder kevaBuilder = mInstance;
        return kevaBuilder != null ? kevaBuilder : new KevaBuilder();
    }

    public static void onFlush() {
        KevaAsyncWriter.onFlush();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getMainThreadPriorityValue() {
        return this.mPriorityValue;
    }

    public boolean isMainThreadPriorityOpt() {
        return this.mMainThreadPriorityOpt;
    }

    public static void setKevaBuildConfigCallBack(IKevaBuildConfig iKevaBuildConfig) {
        buildCallBackImpl = iKevaBuildConfig;
    }

    public KevaBuilder setAsyncWriteEnable(boolean z) {
        this.mEnableAsyncWrite = z;
        return this;
    }

    public KevaBuilder setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public void setEnableArrayMap(boolean z) {
        this.mEnableArrayMap = z;
    }

    public void setEnableExecutorOpt(boolean z) {
        this.mEnableExecutorOpt = z;
    }

    public void setEnableLoadOpt(boolean z) {
        this.mEnableLoadOpt = z;
    }

    public void setEnableLockOpt(boolean z) {
        this.mEnableLockOpt = z;
    }

    public void setEnableMultiProcessHashIndex(boolean z) {
        this.mEnableMultiProcessHashIndex = z;
    }

    public void setEnableSingleProcessHashIndex(boolean z) {
        this.mEnableSingleProcessHashIndex = z;
    }

    public void setExecuteType(int i) {
        this.mExecuteKevaType = i;
    }

    public KevaBuilder setExecutor(Executor executor) {
        this.mExecutor = executor;
        return this;
    }

    public KevaBuilder setIsEnableMultiProcessLoadFromNative(int i) {
        this.sIsEnableMultiProcessLoadFromNative = i;
        return this;
    }

    public KevaBuilder setIsLoadFromNative(int i) {
        this.mIsLoadFromNative = i;
        return this;
    }

    public void setMainThreadPriorityOpt(boolean z) {
        this.mMainThreadPriorityOpt = z;
    }

    public void setMainThreadPriorityValue(int i) {
        this.mPriorityValue = i;
    }

    public KevaBuilder setMonitor(KevaMonitor kevaMonitor) {
        this.mMonitor = kevaMonitor;
        return this;
    }

    public KevaBuilder setPortedRepoName(String str) {
        this.mPortedRepoName = str;
        return this;
    }

    public KevaBuilder setWorkDir(File file) {
        if (!file.exists() && !file.mkdirs()) {
            return this;
        }
        this.mWorkDir = file;
        return this;
    }
}
