package com.ss.android.ugc.aweme;

import X.C01GW;
import X.C08UZ;
import X.C0VSJ;
import X.C1007900cKq;
import X.C1008160cLG;
import X.C1009340cNA;
import X.C1009520cNS;
import X.C1014160cUw;
import X.C1014660cVk;
import X.C1015460cX2;
import X.C1015490cX5;
import X.C1015750cXV;
import X.C1016430cYb;
import X.C1016460cYe;
import X.C1016470cYf;
import X.C1029740cu4;
import X.C13LP;
import X.C1552050qUV;
import X.C2114508Qd;
import X.C2188811AlT;
import X.C2249208ra;
import X.C301090Br9;
import X.C452501pT;
import X.C703302op;
import X.EnumC1016500cYi;
import X.EnumC1016560cYo;
import X.InterfaceC1007910cKr;
import X.InterfaceC1016480cYg;
import X.InterfaceC1043620dGS;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS2S3300000_16;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.IAnoleVideoPreloadTracker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.settings.AnoleImagePreloadModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleServiceImpl implements IAnoleService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1016470cYf());

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final C1015460cX2 LJ() {
        return new C1015460cX2(C1015750cXV.LIZ, C1015750cXV.LIZIZ, C1015750cXV.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final C1009520cNS LJII() {
        return (C1009520cNS) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final void LJFF(C1009340cNA c1009340cNA) {
        AwemeRawAd awemeRawAd = c1009340cNA.LIZLLL;
        if (((AnoleImagePreloadModel) C1015490cX5.LIZIZ.getValue()).enable) {
            C08UZ.LIZIZ.execute(new ARunnableS116S0100000_16(awemeRawAd, 263));
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final C1014660cVk LIZIZ(AwemeRawAd awemeRawAd, AnoleComponentModel anoleComponentModel) {
        return new C1014660cVk(awemeRawAd, anoleComponentModel);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final Integer LIZJ(String str, String str2) {
        int i;
        if (!C301090Br9.LIZ()) {
            return null;
        }
        if (C1552050qUV.LIZIZ(str, str2)) {
            i = 1;
        } else if (Intrinsics.LJFF(((LinkedHashMap) C1015750cXV.LIZJ).get(str2), Boolean.TRUE)) {
            i = 2;
        } else {
            i = 0;
        }
        C1015750cXV.LIZLLL.put(str2, Integer.valueOf(i));
        return Integer.valueOf(i);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final void LIZLLL(C1009340cNA c1009340cNA, final C1016430cYb c1016430cYb) {
        String string;
        AwemeRawAd awemeRawAd = c1009340cNA.LIZLLL;
        C1014160cUw c1014160cUw = new C1014160cUw(awemeRawAd, c1016430cYb.LIZ, c1016430cYb.LIZIZ, c1016430cYb.LIZJ, c1016430cYb.LIZLLL);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        IAdHybridContainerManager iAdHybridContainerManager = (IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class);
        EnumC1016560cYo enumC1016560cYo = EnumC1016560cYo.ANOLE_DATA_RESPONSE;
        Long creativeId = awemeRawAd.getCreativeId();
        String string2 = null;
        if (creativeId != null) {
            string2 = creativeId.toString();
        }
        String logExtra = awemeRawAd.getLogExtra();
        String str = c1009340cNA.LIZIZ;
        Integer numValueOf = Integer.valueOf(awemeRawAd.getChargeType());
        Integer numValueOf2 = Integer.valueOf(awemeRawAd.getSystemOrigin());
        Boolean bool = Boolean.TRUE;
        iAdHybridContainerManager.LIZ(enumC1016560cYo, c1014160cUw, new C1029740cu4(string2, logExtra, str, numValueOf, numValueOf2, bool, false, 64), new InterfaceC1043620dGS() { // from class: X.0cYd
            @Override // X.InterfaceC1043620dGS
            public final void LIZ(String str2) {
                if (str2 != null) {
                    C1015750cXV.LIZJ.put(str2, Boolean.TRUE);
                }
            }

            @Override // X.InterfaceC1043620dGS
            public final void LIZIZ(C1016520cYk c1016520cYk) {
                C1015750cXV.LIZ(jCurrentTimeMillis, c1016520cYk.LIZ, true);
                Function1<Boolean, Unit> function1 = c1016430cYb.LJ;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
            }

            @Override // X.InterfaceC1043620dGS
            public final void LIZJ(C1016520cYk c1016520cYk) {
                String str2;
                if (c1016520cYk != null) {
                    str2 = c1016520cYk.LIZ;
                } else {
                    str2 = null;
                }
                C1015750cXV.LIZ(jCurrentTimeMillis, str2, false);
                Function1<Boolean, Unit> function1 = c1016430cYb.LJ;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
            }

            @Override // X.InterfaceC1043620dGS
            public final void LIZLLL(String str2) {
                C1015750cXV.LIZIZ(4, str2);
            }

            @Override // X.InterfaceC1043620dGS
            public final void LJ(String str2) {
                C1015750cXV.LIZIZ(8, str2);
            }

            @Override // X.InterfaceC1043620dGS
            public final void LJFF(String str2) {
                C1015750cXV.LIZIZ(7, str2);
            }

            @Override // X.InterfaceC1043620dGS
            public final void LJI(String str2) {
                C1015750cXV.LIZIZ(6, str2);
            }
        });
        IAdHybridContainerManager iAdHybridContainerManager2 = (IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class);
        EnumC1016560cYo enumC1016560cYo2 = EnumC1016560cYo.ANOLE_CDN_DATA_RESPONSE;
        Long creativeId2 = awemeRawAd.getCreativeId();
        if (creativeId2 != null) {
            string = creativeId2.toString();
        } else {
            string = null;
        }
        iAdHybridContainerManager2.LIZ(enumC1016560cYo2, c1014160cUw, new C1029740cu4(string, awemeRawAd.getLogExtra(), c1009340cNA.LIZIZ, Integer.valueOf(awemeRawAd.getChargeType()), Integer.valueOf(awemeRawAd.getSystemOrigin()), bool, false, 64), null);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final boolean LIZ(C1009340cNA c1009340cNA, String str, String str2) {
        Map<String, AnoleComponentModel> map;
        String str3;
        AnoleModel anoleModel = c1009340cNA.LIZLLL.getAnoleModel();
        boolean zLIZJ = false;
        if (anoleModel != null && (map = anoleModel.components) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, AnoleComponentModel> entry : map.entrySet()) {
                if (Intrinsics.LJFF(entry.getValue().slotID, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                List<String> geckoChannels = ((AnoleComponentModel) ((Map.Entry) it2.next()).getValue()).getGeckoChannels();
                if (geckoChannels != null && (str3 = (String) C13LP.LJJJLL(geckoChannels)) != null) {
                    zLIZJ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZJ(str2, str3);
                }
            }
        }
        return zLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final void LJIIIIZZ(final C1016460cYe c1016460cYe, final AwemeRawAd awemeRawAd, final InterfaceC1016480cYg interfaceC1016480cYg) {
        String strLIZIZ;
        String strLIZIZ2;
        IAnoleVideoPreloadTracker iAnoleVideoPreloadTrackerLIZIZ;
        IAnoleVideoPreloadTracker iAnoleVideoPreloadTrackerLIZIZ2;
        IAnoleVideoPreloadTracker iAnoleVideoPreloadTrackerLIZIZ3;
        C01GW c01gw = C2249208ra.LIZ;
        if (c1016460cYe.LIZ.isEmpty()) {
            interfaceC1016480cYg.LIZ("", -1, EnumC1016500cYi.VIDEO_URL_LIST_EMPTY);
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String str = (String) ListProtector.get(c1016460cYe.LIZ, 0);
        AnoleComponentModel anoleComponentModel = c1016460cYe.LJFF;
        if (anoleComponentModel != null && (iAnoleVideoPreloadTrackerLIZIZ3 = C2249208ra.LIZIZ()) != null) {
            iAnoleVideoPreloadTrackerLIZIZ3.LIZJ(anoleComponentModel, c1016460cYe.LJI, awemeRawAd, c1016460cYe.LIZIZ, str);
        }
        if (c1016460cYe.LIZIZ.length() == 0) {
            AnoleComponentModel anoleComponentModel2 = c1016460cYe.LJFF;
            if (anoleComponentModel2 != null && (iAnoleVideoPreloadTrackerLIZIZ2 = C2249208ra.LIZIZ()) != null) {
                iAnoleVideoPreloadTrackerLIZIZ2.LIZIZ(false, jCurrentTimeMillis, anoleComponentModel2, c1016460cYe.LJI, awemeRawAd, c1016460cYe.LIZIZ, str, EnumC1016500cYi.VIDEO_ID_IS_EMPTY.getReason());
            }
            interfaceC1016480cYg.LIZ("", -1, EnumC1016500cYi.VIDEO_ID_IS_EMPTY);
            return;
        }
        String str2 = c1016460cYe.LIZLLL;
        if (str2 != null && str2.length() != 0) {
            String str3 = c1016460cYe.LIZLLL;
            if (str3 != null && u.LJIIZILJ(str3, "/", false)) {
                strLIZIZ = c1016460cYe.LIZLLL;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1016460cYe.LIZLLL);
                sbLIZ.append('/');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            strLIZIZ = (String) C2249208ra.LIZLLL.getValue();
        }
        if (strLIZIZ == null) {
            strLIZIZ = (String) C2249208ra.LIZLLL.getValue();
        }
        if (C703302op.LIZ(c1016460cYe.LJ)) {
            strLIZIZ2 = c1016460cYe.LJ;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1016460cYe.LIZIZ);
            sbLIZ2.append('_');
            sbLIZ2.append(c1016460cYe.LIZJ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(strLIZIZ2);
        File fileLJFF = C2114508Qd.LJFF(new C0VSJ(""), C2188811AlT.LIZIZ(sbLIZ3));
        if (fileLJFF != null && fileLJFF.exists()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("preloadVideo hit cache: ");
            sbLIZ4.append(fileLJFF.getAbsolutePath());
            C2188811AlT.LIZIZ(sbLIZ4);
            AnoleComponentModel anoleComponentModel3 = c1016460cYe.LJFF;
            if (anoleComponentModel3 != null && (iAnoleVideoPreloadTrackerLIZIZ = C2249208ra.LIZIZ()) != null) {
                iAnoleVideoPreloadTrackerLIZIZ.LIZ(anoleComponentModel3, c1016460cYe.LJI, awemeRawAd, c1016460cYe.LIZIZ, str);
            }
            interfaceC1016480cYg.LIZIZ(str);
            return;
        }
        IDownloadListener iDownloadListener = new IDownloadListener() { // from class: X.0cYh
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstStart(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstSuccess(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPrepare(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                C1016460cYe c1016460cYe2 = c1016460cYe;
                AnoleComponentModel anoleComponentModel4 = c1016460cYe2.LJFF;
                if (anoleComponentModel4 != null) {
                    long j = jCurrentTimeMillis;
                    AwemeRawAd awemeRawAd2 = awemeRawAd;
                    String str4 = str;
                    IAnoleVideoPreloadTracker iAnoleVideoPreloadTrackerLIZIZ4 = C2249208ra.LIZIZ();
                    if (iAnoleVideoPreloadTrackerLIZIZ4 != null) {
                        iAnoleVideoPreloadTrackerLIZIZ4.LIZIZ(false, j, anoleComponentModel4, c1016460cYe2.LJI, awemeRawAd2, c1016460cYe2.LIZIZ, str4, EnumC1016500cYi.DOWNLOAD_SERVICE_CANCELLED.getReason());
                    }
                }
                InterfaceC1016480cYg interfaceC1016480cYg2 = interfaceC1016480cYg;
                if (interfaceC1016480cYg2 != null) {
                    interfaceC1016480cYg2.LIZ(str, -1, EnumC1016500cYi.DOWNLOAD_SERVICE_CANCELLED);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String url;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("preloadVideo success: ");
                if (downloadInfo != null) {
                    url = downloadInfo.getUrl();
                } else {
                    url = null;
                }
                sbLIZ5.append(url);
                C2188811AlT.LIZIZ(sbLIZ5);
                InterfaceC1016480cYg interfaceC1016480cYg2 = interfaceC1016480cYg;
                if (interfaceC1016480cYg2 != null) {
                    interfaceC1016480cYg2.onSuccess(str);
                }
                C1016460cYe c1016460cYe2 = c1016460cYe;
                AnoleComponentModel anoleComponentModel4 = c1016460cYe2.LJFF;
                if (anoleComponentModel4 != null) {
                    long j = jCurrentTimeMillis;
                    AwemeRawAd awemeRawAd2 = awemeRawAd;
                    String str4 = str;
                    IAnoleVideoPreloadTracker iAnoleVideoPreloadTrackerLIZIZ4 = C2249208ra.LIZIZ();
                    if (iAnoleVideoPreloadTrackerLIZIZ4 != null) {
                        iAnoleVideoPreloadTrackerLIZIZ4.LIZIZ(true, j, anoleComponentModel4, c1016460cYe2.LJI, awemeRawAd2, c1016460cYe2.LIZIZ, str4, null);
                    }
                }
                C08UZ.LIZIZ.execute(new ARunnableS103S0100000_3(downloadInfo, 168));
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                String errorMessage;
                int errorCode;
                String savePath;
                File fileLJFF2;
                String name = null;
                if (baseException != null) {
                    errorMessage = baseException.getErrorMessage();
                    errorCode = baseException.getErrorCode();
                } else {
                    errorMessage = null;
                    errorCode = -1;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("preloadVideo failed: ");
                sbLIZ5.append(errorMessage);
                C2188811AlT.LIZIZ(sbLIZ5);
                EnumC1016500cYi enumC1016500cYi = EnumC1016500cYi.DOWNLOAD_SERVICE_FAILED;
                if (errorMessage != null) {
                    enumC1016500cYi.setReason(errorMessage);
                }
                InterfaceC1016480cYg interfaceC1016480cYg2 = interfaceC1016480cYg;
                if (interfaceC1016480cYg2 != null) {
                    interfaceC1016480cYg2.LIZ(str, errorCode, enumC1016500cYi);
                }
                C1016460cYe c1016460cYe2 = c1016460cYe;
                AnoleComponentModel anoleComponentModel4 = c1016460cYe2.LJFF;
                if (anoleComponentModel4 != null) {
                    long j = jCurrentTimeMillis;
                    AwemeRawAd awemeRawAd2 = awemeRawAd;
                    String str4 = str;
                    IAnoleVideoPreloadTracker iAnoleVideoPreloadTrackerLIZIZ4 = C2249208ra.LIZIZ();
                    if (iAnoleVideoPreloadTrackerLIZIZ4 != null) {
                        iAnoleVideoPreloadTrackerLIZIZ4.LIZIZ(false, j, anoleComponentModel4, c1016460cYe2.LJI, awemeRawAd2, c1016460cYe2.LIZIZ, str4, errorMessage);
                    }
                }
                if (errorCode == 1034) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    if (downloadInfo != null) {
                        savePath = downloadInfo.getSavePath();
                    } else {
                        savePath = null;
                    }
                    sbLIZ6.append(savePath);
                    if (downloadInfo != null) {
                        name = downloadInfo.getName();
                    }
                    sbLIZ6.append(name);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
                    if (strLIZIZ3 != null && strLIZIZ3.length() != 0 && (fileLJFF2 = C2114508Qd.LJFF(new C0VSJ(""), strLIZIZ3)) != null && fileLJFF2.exists()) {
                        fileLJFF2.delete();
                    }
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c1016460cYe.LIZ);
        arrayList.remove(str);
        C08UZ.LIZIZ.execute(new ARunnableS2S3300000_16(str, arrayList, strLIZIZ, strLIZIZ2, c1016460cYe, iDownloadListener, 1));
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final C1007900cKq LJI(Context context, Set set, C1009340cNA c1009340cNA, InterfaceC1007910cKr interfaceC1007910cKr, C1008160cLG c1008160cLG) {
        Set setSingleton = set;
        AnoleModel anoleModel = c1009340cNA.LIZLLL.getAnoleModel();
        if (anoleModel == null && (anoleModel = c1009340cNA.LJFF) == null) {
            return null;
        }
        if (setSingleton == null) {
            setSingleton = Collections.singleton("feed");
        }
        return new C1007900cKq(context, setSingleton, c1009340cNA, anoleModel, interfaceC1007910cKr, c1008160cLG);
    }
}
