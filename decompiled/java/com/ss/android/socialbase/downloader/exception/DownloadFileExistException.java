package com.ss.android.socialbase.downloader.exception;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadFileExistException extends BaseException {
    public String existTargetFileName;
    public String existTargetFilePath;

    public String getExistTargetFileName() {
        return this.existTargetFileName;
    }

    public String getExistTargetFilePath() {
        return this.existTargetFilePath;
    }

    public DownloadFileExistException(String str, String str2) {
        this.existTargetFilePath = str;
        this.existTargetFileName = str2;
    }
}
