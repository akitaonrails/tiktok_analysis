package com.ss.lyrax.utils.loader;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxNativeLibraryLoaderInfo {
    public String mSdkVersion = "";
    public Long mLoadTimeStampMs = 0L;
    public String mLoaderClassName = "";
    public int mLoadTimes = 0;
    public boolean mIsLoadSuccess = false;

    public long getLoadTimeStamp() {
        return this.mLoadTimeStampMs.longValue();
    }

    public void loadLibrary() {
        this.mLoadTimes++;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxNativeLibraryLoaderInfo{SdkVersion='");
        sbLIZ.append(this.mSdkVersion);
        sbLIZ.append('\'');
        sbLIZ.append(", LoadTimeStamp=");
        sbLIZ.append(this.mLoadTimeStampMs);
        sbLIZ.append(", LoaderClassName='");
        sbLIZ.append(this.mLoaderClassName);
        sbLIZ.append('\'');
        sbLIZ.append(", LoadTimes=");
        sbLIZ.append(this.mLoadTimes);
        sbLIZ.append(", IsLoadSuccess=");
        sbLIZ.append(this.mIsLoadSuccess);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getLoaderClassName() {
        return this.mLoaderClassName;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public boolean isLoadSuccess() {
        return this.mIsLoadSuccess;
    }

    public void setLoadResult(boolean z) {
        this.mIsLoadSuccess = z;
    }

    public void setLoadTimeStampMs(long j) {
        this.mLoadTimeStampMs = Long.valueOf(j);
    }

    public void setLoaderClassName(String str) {
        this.mLoaderClassName = str;
    }

    public void setSdkVersion(String str) {
        this.mSdkVersion = str;
    }
}
