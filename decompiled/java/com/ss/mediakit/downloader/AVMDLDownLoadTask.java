package com.ss.mediakit.downloader;

import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLDownLoadTask {
    public File file;
    public FileOutputStream fos;
    public Future mFuture;
    public long mHandle;
    public Lock mHandleLock;
    public boolean mIsRunning;
    public AVMDLRequest mRequest;
    public Lock mResonseLock;
    public AVMDLResponse mResponse;
    public int mStep;
}
