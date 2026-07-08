package com.ss.mediakit.medialoader;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLCopyOperation {
    public String mCustomDir;
    public String mDestPath;
    public String mFileKey;
    public boolean mForceCopyUnfinished;
    public final AVMDLCopyOperationListener mListener;
    public long mMinCacheSize;
    public long mMinDurationMs;
    public boolean mWaitIfCaching;

    public void setMinDurationMs(long j) {
        this.mMinDurationMs = j;
        if (j > 0) {
            this.mForceCopyUnfinished = false;
        }
    }

    public AVMDLCopyOperation(String str, String str2, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
    }

    public AVMDLCopyOperation(String str, String str2, boolean z, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
        this.mWaitIfCaching = z;
    }

    public AVMDLCopyOperation(String str, String str2, boolean z, boolean z2, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
        this.mWaitIfCaching = z2;
        this.mForceCopyUnfinished = z;
        if (z) {
            this.mWaitIfCaching = false;
        }
    }
}
