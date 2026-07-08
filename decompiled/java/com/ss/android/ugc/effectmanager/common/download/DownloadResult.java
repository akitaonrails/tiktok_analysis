package com.ss.android.ugc.effectmanager.common.download;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadResult {
    public DownloadException downloadException;
    public long downloadTimeMillsCost;
    public long fetchInputStreamTimeMillsCost;
    public long fileSize;
    public long unzipTimeMillsCost;
    public long writeToDiskTimeMillsCost;

    public final boolean isSuccess() {
        return this.downloadException == null;
    }

    public final DownloadException getDownloadException() {
        return this.downloadException;
    }

    public final long getDownloadTimeMillsCost() {
        return this.downloadTimeMillsCost;
    }

    public final long getFetchInputStreamTimeMillsCost() {
        return this.fetchInputStreamTimeMillsCost;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final long getUnzipTimeMillsCost() {
        return this.unzipTimeMillsCost;
    }

    public final long getWriteToDiskTimeMillsCost() {
        return this.writeToDiskTimeMillsCost;
    }

    public final void setDownloadException(DownloadException downloadException) {
        this.downloadException = downloadException;
    }

    public final void setDownloadTimeMillsCost(long j) {
        this.downloadTimeMillsCost = j;
    }

    public final void setFetchInputStreamTimeMillsCost(long j) {
        this.fetchInputStreamTimeMillsCost = j;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setUnzipTimeMillsCost(long j) {
        this.unzipTimeMillsCost = j;
    }

    public final void setWriteToDiskTimeMillsCost(long j) {
        this.writeToDiskTimeMillsCost = j;
    }
}
