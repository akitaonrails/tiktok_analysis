package com.ss.android.socialbase.downloader.service;

import X.C20149513sj;
import X.C20149613sk;
import X.C2199671B7d;
import X.C786410Ut5;
import X.InterfaceC20149713sl;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: loaded from: classes31.dex */
public class DownloadIdGeneratorService implements IDownloadIdGeneratorService {
    public InterfaceC20149713sl mDownloadIdGenerator;

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
    public boolean isDefaultIdGenerator() {
        return this.mDownloadIdGenerator == null;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
    public int generate(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        String taskKey = downloadInfo.getTaskKey();
        if (TextUtils.isEmpty(taskKey)) {
            taskKey = downloadInfo.getUrl();
        }
        return generate(taskKey, downloadInfo.getSavePath());
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
    public void setDownloadIdGenerator(InterfaceC20149713sl interfaceC20149713sl) {
        this.mDownloadIdGenerator = interfaceC20149713sl;
    }

    private int generateImpl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (C20149513sj.LIZLLL(str2) > 1) {
            if (!TextUtils.isEmpty(str2) && str2.startsWith("content")) {
                int i = 0;
                while (true) {
                    SparseArray<C20149613sk> sparseArray = C20149513sj.LIZ;
                    if (i >= sparseArray.size()) {
                        break;
                    }
                    C20149613sk c20149613sk = sparseArray.get(sparseArray.keyAt(i));
                    if (str2.startsWith(c20149613sk.LIZIZ)) {
                        str2 = c20149613sk.LIZIZ;
                        break;
                    }
                    i++;
                }
                str2 = null;
            } else {
                str2 = null;
            }
        }
        String strLJJIFFI = C2199671B7d.LJJIFFI(C786410Ut5.j4("%s_%s", new Object[]{str, str2}));
        if (TextUtils.isEmpty(strLJJIFFI)) {
            return 0;
        }
        return strLJJIFFI.hashCode();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService, X.InterfaceC20149713sl
    public int generate(String str, String str2) {
        InterfaceC20149713sl interfaceC20149713sl = this.mDownloadIdGenerator;
        if (interfaceC20149713sl != null) {
            return interfaceC20149713sl.generate(str, str2);
        }
        return generateImpl(str, str2);
    }
}
