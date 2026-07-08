package com.ss.android.socialbase.downloader.depend;

import X.C1490830otl;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: loaded from: classes30.dex */
public abstract class AbsDownloadListener implements IDownloadListener {
    public static final String TAG = "AbsDownloadListener";

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Name: ");
            sbLIZ.append(downloadInfo.getName());
            C1490830otl.LIZLLL(id, str, "onCanceled", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Name: ");
            sbLIZ.append(downloadInfo.getName());
            C1490830otl.LIZLLL(id, str, "onFirstStart", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Name: ");
            sbLIZ.append(downloadInfo.getName());
            C1490830otl.LIZLLL(id, str, "onFirstSuccess", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onIntercept(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Name: ");
            sbLIZ.append(downloadInfo.getName());
            C1490830otl.LIZLLL(id, str, "onIntercept", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Name: ");
            sbLIZ.append(downloadInfo.getName());
            C1490830otl.LIZLLL(id, str, "onPause", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Name: ");
            sbLIZ.append(downloadInfo.getName());
            C1490830otl.LIZLLL(id, str, "onPrepare", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
            C1490830otl.LIZLLL(downloadInfo.getId(), TAG, "onProgress", C786410Ut5.j4("Name: %s %.2f%%", new Object[]{downloadInfo.getName(), Float.valueOf((downloadInfo.getCurBytes() / downloadInfo.getTotalBytes()) * 100.0f)}));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Name: ");
            sbLIZ.append(downloadInfo.getName());
            C1490830otl.LIZLLL(id, str, "onStart", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Name: ");
            sbLIZ.append(downloadInfo.getName());
            sbLIZ.append(" ");
            sbLIZ.append(downloadInfo.isSuccessByCache());
            C1490830otl.LIZLLL(id, str, "onSuccessed", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String errorMessage;
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                errorMessage = baseException.getErrorMessage();
            } else {
                errorMessage = "unkown";
            }
            objArr[1] = errorMessage;
            C1490830otl.LIZLLL(id, str, "onFailed", C786410Ut5.j4("Name: %s because of : %s", objArr));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        String errorMessage;
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                errorMessage = baseException.getErrorMessage();
            } else {
                errorMessage = "unkown";
            }
            objArr[1] = errorMessage;
            C1490830otl.LIZLLL(id, str, "onRetry", C786410Ut5.j4("Name: %s because of : %s", objArr));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        String errorMessage;
        if (C1490830otl.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                errorMessage = baseException.getErrorMessage();
            } else {
                errorMessage = "unkown";
            }
            objArr[1] = errorMessage;
            C1490830otl.LIZLLL(id, str, "onRetryDelay", C786410Ut5.j4("Name: %s because of : %s", objArr));
        }
    }
}
