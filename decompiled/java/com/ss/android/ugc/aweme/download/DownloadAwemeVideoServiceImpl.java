package com.ss.android.ugc.aweme.download;

import X.AbstractC1383500m6e;
import X.AbstractC2199801B7q;
import X.C013C;
import X.C08HM;
import X.C0T9S;
import X.C1382800m5W;
import X.C13BV;
import X.C1483340ohg;
import X.C14E5;
import X.C1632480saE;
import X.C201955140j;
import X.C2188811AlT;
import X.C2426709f7;
import X.C262970ASh;
import X.InterfaceC1475840oVa;
import Y.ACallableS419S0100000_12;
import Y.ACallableS64S1100000_12;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.DownloadAwemeVideoServiceImpl;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadAwemeVideoServiceImpl implements IDownloadAwemeVideoService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0T9T, X.0m6e] */
    @Override // com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService
    public final void LIZ(Aweme aweme, final String str, final C0T9S c0t9s) {
        List<String> urlList;
        String strLIZIZ;
        List<String> urlList2;
        VideoUrlModel playAddrH264 = aweme.getVideo().getPlayAddrH264();
        if (playAddrH264 != null && (urlList = playAddrH264.getUrlList()) != null && !urlList.isEmpty()) {
            String strLIZJ = C08HM.LIZJ(aweme.getVideo().getPlayAddrH264().getBitRatedRatioUri());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZJ);
            sbLIZ.append(".mp4");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            String str2 = File.separator;
            if (!u.LJIIZILJ(str, str2, false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = str;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(strLIZIZ2);
            final String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            final String strSubstring = strLIZIZ3.substring(a0.LJJJJI(strLIZIZ3, str2, 0, 6) + 1);
            VideoUrlModel playAddrH2642 = aweme.getVideo().getPlayAddrH264();
            if (playAddrH2642 != null && (urlList2 = playAddrH2642.getUrlList()) != null && !urlList2.isEmpty()) {
                final ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = playAddrH2642.getUrlList().iterator();
                while (it2.hasNext()) {
                    String strLIZ = C1382800m5W.LIZ(aweme, it2.next());
                    if (strLIZ != null) {
                        arrayList.add(strLIZ);
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    final ?? r8 = new AbstractC1383500m6e() { // from class: X.0T9T
                        @Override // X.AbstractC1383500m6e
                        public final String LIZ() {
                            return arrayList.isEmpty() ^ true ? C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62) : "";
                        }

                        @Override // X.AbstractC1383500m6e
                        public final void LIZLLL() {
                            super.LIZLLL();
                            C15O7.LIZIZ(new ACallableS419S0100000_12(c0t9s, 5), C15O7.LJIIIIZZ, null);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("video_2_sticker");
                        }

                        @Override // X.AbstractC1383500m6e
                        public final void LJ(String str3, String str4) {
                            super.LJ(str3, str4);
                            C15O7.LIZIZ(new ACallableS64S1100000_12(c0t9s, str4, 2), C15O7.LJIIIIZZ, null);
                        }

                        @Override // X.AbstractC1383500m6e
                        public final void LIZIZ(final Exception exc, final Integer num, final String str3) {
                            super.LIZIZ(exc, num, str3);
                            final C0T9S c0t9s2 = c0t9s;
                            C15O7.LIZIZ(new Callable() { // from class: X.0T9R
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    C1C7U.LIZ("DownloadAwemeVideoServiceImpl@6b64.getProxyAbsMointorDownloadListener$1$onFailure$1");
                                    C0T9S c0t9s3 = c0t9s2;
                                    Exception exc2 = exc;
                                    String str4 = str3;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    Integer num2 = num;
                                    c0t9s3.LIZIZ(num2 != null ? num2.intValue() : -1, exc2, str4);
                                    Unit unit = Unit.LIZ;
                                    C1C7U.LIZIZ("DownloadAwemeVideoServiceImpl@6b64.getProxyAbsMointorDownloadListener$1$onFailure$1");
                                    return unit;
                                }
                            }, C15O7.LJIIIIZZ, null);
                        }

                        @Override // X.AbstractC1383500m6e
                        public final void LIZJ(int i, long j, long j2) {
                            C15O7.LIZIZ(new ACallableS419S0100000_12(c0t9s, i, j, j2, 4), C15O7.LJIIIIZZ, null);
                        }
                    };
                    boolean zLJIIJ = LocalVideoPlayerManager.LJ().LJIIJ(aweme.getAid(), strLIZIZ3, new C14E5() { // from class: X.0m6m
                        public final /* synthetic */ String LJFF = "video_2_sticker";

                        @Override // X.C14E5
                        public final void onFailed() {
                            DownloadAwemeVideoServiceImpl downloadAwemeVideoServiceImpl = this;
                            List<String> list = arrayList;
                            downloadAwemeVideoServiceImpl.LIZIZ(r8, strLIZIZ3, strSubstring, this.LJFF, list);
                        }

                        @Override // X.C14E5
                        public final void onSuccess(String str3) {
                            C0VSJ c0vsj = new C0VSJ(str3);
                            ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("download_success");
                            r8.LIZLLL();
                            r8.LIZJ(100, c0vsj.length(), c0vsj.length());
                            r8.LJ("local", str3);
                        }
                    });
                    C201955140j.LIZJ(C1632480saE.LIZIZ, "VideoToStickerUseMDLCache: start download");
                    final C013C c013c = new C013C();
                    if (!zLJIIJ) {
                        C2426709f7.LIZ("duet");
                        if (((Boolean) C262970ASh.LIZ.getValue()).booleanValue()) {
                            C1483340ohg.LJIIJJI(aweme, strLIZIZ3, true, false, new InterfaceC1475840oVa() { // from class: X.0m6n
                                public final /* synthetic */ String LJII = "video_2_sticker";

                                @Override // X.InterfaceC1475840oVa
                                public final /* synthetic */ void LIZ(long j, long j2) {
                                }

                                @Override // X.InterfaceC1475840oVa
                                public final void LIZIZ(int i) {
                                    C013C c013c2 = c013c;
                                    if (c013c2.element) {
                                        return;
                                    }
                                    c013c2.element = true;
                                    C201955140j.LIZJ(C1632480saE.LIZIZ, "VideoToStickerUseMDLCache: onCopyError");
                                    DownloadAwemeVideoServiceImpl downloadAwemeVideoServiceImpl = this;
                                    List<String> list = arrayList;
                                    downloadAwemeVideoServiceImpl.LIZIZ(r8, a0.LJJJLL("/", str), strSubstring, this.LJII, list);
                                }

                                @Override // X.InterfaceC1475840oVa
                                public final void onCopyComplete(boolean z, int i, String str3) {
                                    C013C c013c2 = c013c;
                                    if (c013c2.element) {
                                        return;
                                    }
                                    c013c2.element = true;
                                    if (z) {
                                        C201955140j.LIZJ(C1632480saE.LIZIZ, "VideoToStickerUseMDLCache: success");
                                        C0VSJ c0vsj = new C0VSJ(strLIZIZ3);
                                        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("download_success");
                                        r8.LIZLLL();
                                        r8.LIZJ(100, c0vsj.length(), c0vsj.length());
                                        r8.LJ("local", strLIZIZ3);
                                        return;
                                    }
                                    C201955140j.LIZJ(C1632480saE.LIZIZ, "VideoToStickerUseMDLCache: failed");
                                    DownloadAwemeVideoServiceImpl downloadAwemeVideoServiceImpl = this;
                                    List<String> list = arrayList;
                                    downloadAwemeVideoServiceImpl.LIZIZ(r8, a0.LJJJLL("/", str), strSubstring, this.LJII, list);
                                }
                            });
                            return;
                        } else {
                            LIZIZ(r8, a0.LJJJLL("/", str), strSubstring, "video_2_sticker", arrayList);
                            return;
                        }
                    }
                    return;
                }
            }
            c0t9s.LIZIZ(-1, new IllegalArgumentException("aweme urls is empty"), "aweme url is empty");
            return;
        }
        c0t9s.LIZIZ(-100, null, "video url list is null or empty");
    }

    public final void LIZIZ(final AbstractC1383500m6e abstractC1383500m6e, String str, String str2, String str3, List list) {
        List<String> listSubList;
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            listSubList = list.subList(1, list.size());
        } else {
            listSubList = C13BV.INSTANCE;
        }
        AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.0m6j
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                int downloadProcess;
                long curBytes;
                long totalBytes;
                super.onProgress(downloadInfo);
                AbstractC1383500m6e abstractC1383500m6e2 = abstractC1383500m6e;
                if (abstractC1383500m6e2 != null) {
                    if (downloadInfo != null) {
                        downloadProcess = downloadInfo.getDownloadProcess();
                        curBytes = downloadInfo.getCurBytes();
                        totalBytes = downloadInfo.getTotalBytes();
                    } else {
                        downloadProcess = 0;
                        curBytes = 0;
                        totalBytes = 100;
                    }
                    abstractC1383500m6e2.LIZJ(downloadProcess, curBytes, totalBytes);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                super.onStart(downloadInfo);
                AbstractC1383500m6e abstractC1383500m6e2 = abstractC1383500m6e;
                if (abstractC1383500m6e2 != null) {
                    abstractC1383500m6e2.LIZLLL();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String url;
                super.onSuccessed(downloadInfo);
                AbstractC1383500m6e abstractC1383500m6e2 = abstractC1383500m6e;
                if (abstractC1383500m6e2 != null) {
                    String strLIZIZ = "";
                    if (downloadInfo == null || (url = downloadInfo.getUrl()) == null) {
                        url = "";
                    }
                    this.getClass();
                    if (downloadInfo != null) {
                        String savePath = downloadInfo.getSavePath();
                        if (savePath != null && u.LJIIZILJ(savePath, "/", false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(downloadInfo.getSavePath());
                            sbLIZ.append(downloadInfo.getName());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(downloadInfo.getSavePath());
                            sbLIZ2.append(File.separator);
                            sbLIZ2.append(downloadInfo.getName());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    }
                    abstractC1383500m6e2.LJ(url, strLIZIZ);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                String errorMessage;
                super.onFailed(downloadInfo, baseException);
                AbstractC1383500m6e abstractC1383500m6e2 = abstractC1383500m6e;
                if (abstractC1383500m6e2 != null) {
                    Integer numValueOf = null;
                    if (baseException != null) {
                        errorMessage = baseException.getErrorMessage();
                        numValueOf = Integer.valueOf(baseException.getErrorCode());
                    } else {
                        errorMessage = null;
                    }
                    abstractC1383500m6e2.LIZIZ(baseException, numValueOf, errorMessage);
                }
            }
        };
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with((String) ListProtector.get(list, 0));
        abstractC2199801B7qWith.LJIIIIZZ = listSubList;
        abstractC2199801B7qWith.LIZJ = str2;
        abstractC2199801B7qWith.LJ = str;
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIJJ = 3;
        abstractC2199801B7qWith.LJIIJ = str3;
        abstractC2199801B7qWith.LJJ = downloadServiceManager.isAutoRemoveListener();
        abstractC2199801B7qWith.LJIIL = absDownloadListener;
        abstractC2199801B7qWith.LIZJ();
    }
}
