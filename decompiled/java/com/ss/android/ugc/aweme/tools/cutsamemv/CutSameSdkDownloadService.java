package com.ss.android.ugc.aweme.tools.cutsamemv;

import X.AbstractC2199801B7q;
import X.C08F1;
import X.C0VSJ;
import X.C19858012mo;
import X.C201955140j;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import Y.ARunnableS6S1201000_30;
import android.content.Context;
import android.util.Log;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.tools.cutsamemv.CutSameSdkDownloadService;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class CutSameSdkDownloadService extends AbsDownloadService {
    public final Map<String, Integer> LLILZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.cut_downloader.AbsDownloadService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.ugc.cut_downloader.AbsDownloadService
    public final void LIZ(final String str, String str2, final C19858012mo c19858012mo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getCacheDir().getAbsolutePath());
        sbLIZ.append("/cutsamezip");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        new C0VSJ(strLIZIZ).mkdirs();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        String strLIZIZ2 = C08F1.LIZIZ(str);
        if (strLIZIZ2 == null) {
            strLIZIZ2 = String.valueOf(System.currentTimeMillis());
        }
        sbLIZ2.append(strLIZIZ2);
        sbLIZ2.append(".zip");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LJ = strLIZIZ;
        abstractC2199801B7qWith.LIZJ = strLIZIZ3;
        abstractC2199801B7qWith.LJIIIZ = str2;
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIIJ = "cutsame_template";
        abstractC2199801B7qWith.LJIIL = new AbsDownloadListener() { // from class: X.13SX
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                if (downloadInfo != null) {
                    CutSameSdkDownloadService cutSameSdkDownloadService = this.LL;
                    String str3 = str;
                    C19858012mo c19858012mo2 = c19858012mo;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("CutSameSdkDownload, success : downloadId=");
                    sbLIZ3.append(cutSameSdkDownloadService.LLILZ.remove(downloadInfo.getUrl()));
                    sbLIZ3.append(", url=");
                    sbLIZ3.append(downloadInfo.getUrl());
                    sbLIZ3.append(", path=");
                    sbLIZ3.append(downloadInfo.getTargetFilePath());
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ3));
                    ((ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class)).LJII(downloadInfo.getTotalBytes(), str3);
                    c19858012mo2.LIZ(downloadInfo.getUrl(), downloadInfo.getTargetFilePath());
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                int errorCode;
                if (downloadInfo != null) {
                    CutSameSdkDownloadService cutSameSdkDownloadService = this.LL;
                    C19858012mo c19858012mo2 = c19858012mo;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("CutSameSdkDownload, failed : downloadId=");
                    sbLIZ3.append(cutSameSdkDownloadService.LLILZ.remove(downloadInfo.getUrl()));
                    sbLIZ3.append(", url=");
                    sbLIZ3.append(downloadInfo.getUrl());
                    sbLIZ3.append(", path=");
                    sbLIZ3.append(downloadInfo.getTargetFilePath());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                    String url = downloadInfo.getUrl();
                    if (baseException != null) {
                        errorCode = baseException.getErrorCode();
                    } else {
                        errorCode = -1;
                    }
                    if (Intrinsics.LJFF(url, c19858012mo2.LIZ)) {
                        AbsDownloadService absDownloadService = c19858012mo2.LIZLLL;
                        C786410Ut5.LJJZZIII(absDownloadService.LL, new ARunnableS6S1201000_30(errorCode, url, c19858012mo2, absDownloadService, 1));
                    }
                }
            }
        };
        abstractC2199801B7qWith.LJJ = true;
        abstractC2199801B7qWith.LJIJJLI = true;
        int iLIZJ = abstractC2199801B7qWith.LIZJ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("CutSameSdkDownload, start : downloadId=");
        sbLIZ3.append(iLIZJ);
        sbLIZ3.append(", url=");
        sbLIZ3.append(str);
        sbLIZ3.append(", path=");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append('/');
        sbLIZ3.append(strLIZIZ3);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ3));
        this.LLILZ.put(str, Integer.valueOf(iLIZJ));
    }
}
