package com.ss.android.ugc.aweme.services.download;

import X.C0CHQ;
import X.C13UW;
import X.C2188811AlT;
import X.C2200151B8z;
import X.InterfaceC1385405bY;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class AVDownloadServiceImpl implements InterfaceC1385405bY {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    public final String getFullFilePath(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath != null && u.LJIIZILJ(savePath, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(downloadInfo.getSavePath());
            sbLIZ.append(downloadInfo.getName());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(downloadInfo.getSavePath());
        sbLIZ2.append(File.separator);
        sbLIZ2.append(downloadInfo.getName());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC1385405bY
    public void downloadFile(String str, String str2, String str3, int i, final C13UW c13uw) {
        DownloadTask downloadTaskWith = C2200151B8z.with(C0CHQ.LIZ);
        downloadTaskWith.url(str);
        downloadTaskWith.savePath(str2);
        downloadTaskWith.name(str3);
        downloadTaskWith.retryCount(i);
        downloadTaskWith.autoRemoveCallback(true);
        downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl.downloadFile.1
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onProgress(DownloadInfo downloadInfo) {
                long curBytes;
                long totalBytes;
                super.onProgress(downloadInfo);
                if (downloadInfo != null) {
                    curBytes = downloadInfo.getCurBytes();
                } else {
                    curBytes = 0;
                }
                if (downloadInfo != null) {
                    totalBytes = downloadInfo.getTotalBytes();
                } else {
                    totalBytes = 100;
                }
                int i2 = (int) (((curBytes * 1.0f) / totalBytes) * 100);
                C13UW c13uw2 = c13uw;
                if (c13uw2 != null) {
                    c13uw2.LIZIZ(i2, curBytes, totalBytes);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onStart(DownloadInfo downloadInfo) {
                super.onStart(downloadInfo);
                C13UW c13uw2 = c13uw;
                if (c13uw2 != null) {
                    c13uw2.LIZJ();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onSuccessed(DownloadInfo downloadInfo) {
                String url;
                super.onSuccessed(downloadInfo);
                C13UW c13uw2 = c13uw;
                if (c13uw2 != null) {
                    if (downloadInfo == null || (url = downloadInfo.getUrl()) == null) {
                        url = "";
                    }
                    c13uw2.LIZLLL(url, this.getFullFilePath(downloadInfo));
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                String errorMessage;
                super.onFailed(downloadInfo, baseException);
                C13UW c13uw2 = c13uw;
                if (c13uw2 != null) {
                    Integer numValueOf = null;
                    if (baseException != null) {
                        errorMessage = baseException.getErrorMessage();
                        numValueOf = Integer.valueOf(baseException.getErrorCode());
                    } else {
                        errorMessage = null;
                    }
                    c13uw2.LIZ(baseException, numValueOf, errorMessage);
                }
            }
        });
        downloadTaskWith.download();
    }
}
