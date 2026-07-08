package com.tiktok.ttf.network.zstd;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C0XM1;
import X.C1496400p2k;
import X.C2188811AlT;
import X.C2200151B8z;
import X.C2213981Bky;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1495060p0a;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.util.Log;
import com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS547S0100000_3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class ZstdDictUpdateTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ZstdDictUpdateTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        C0XM1.LJ.getValue(EnumC1495060p0a.ColdBootTasksDegradeExperimentIsZSTDDictUpdateEnable);
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Map<String, ZstdDictSetting.DictUrl> map;
        C1496400p2k c1496400p2k = C1496400p2k.LIZ;
        Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
        c1496400p2k.getClass();
        C01GW c01gw = C1496400p2k.LJ;
        ZstdDictSetting.ZstdDictConfig zstdDictConfig = (ZstdDictSetting.ZstdDictConfig) c01gw.getValue();
        Map<String, String> map2 = null;
        if (zstdDictConfig != null) {
            map2 = zstdDictConfig.path;
        }
        synchronized (c1496400p2k) {
            C1496400p2k.LIZLLL = map2;
        }
        ZstdDictSetting.ZstdDictConfig zstdDictConfig2 = (ZstdDictSetting.ZstdDictConfig) c01gw.getValue();
        if (zstdDictConfig2 != null && (map = zstdDictConfig2.versionUrl) != null) {
            for (Map.Entry<String, ZstdDictSetting.DictUrl> entry : map.entrySet()) {
                final String key = entry.getKey();
                ZstdDictSetting.DictUrl value = entry.getValue();
                if (value != null) {
                    C1496400p2k.LIZ.getClass();
                    C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(applicationContext, 17));
                    DownloadTask downloadTaskWith = C2200151B8z.with(C786410Ut5.N3(applicationContext));
                    downloadTaskWith.url(value.url);
                    downloadTaskWith.md5(value.checksum);
                    downloadTaskWith.savePath((String) c01gwLIZIZ.getValue());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(key);
                    sbLIZ.append(".dict");
                    downloadTaskWith.name(C2188811AlT.LIZIZ(sbLIZ));
                    downloadTaskWith.monitorScene("zstd_dict_download");
                    downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.0p2l
                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onStart(DownloadInfo downloadInfo) {
                            String url;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Downloader onStart with ");
                            if (downloadInfo != null) {
                                url = downloadInfo.getUrl();
                            } else {
                                url = null;
                            }
                            sbLIZ2.append(url);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            if (downloadInfo == null) {
                                return;
                            }
                            C1496400p2k c1496400p2k2 = C1496400p2k.LIZ;
                            String str = key;
                            String targetFilePath = downloadInfo.getTargetFilePath();
                            synchronized (c1496400p2k2) {
                                C1496400p2k.LIZIZ.storeString(str, targetFilePath);
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            String url;
                            Integer numValueOf;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Downloader onFailed with ");
                            String errorMessage = null;
                            if (downloadInfo != null) {
                                url = downloadInfo.getUrl();
                            } else {
                                url = null;
                            }
                            sbLIZ2.append(url);
                            sbLIZ2.append(": ");
                            sbLIZ2.append(baseException);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            String str = key;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("dict_id", str);
                                Gson gson = new Gson();
                                C1496400p2k.LIZ.getClass();
                                jSONObject.put("params", gson.LJIILL((ZstdDictSetting.ZstdDictConfig) C1496400p2k.LJ.getValue()));
                                if (baseException != null) {
                                    numValueOf = Integer.valueOf(baseException.getErrorCode());
                                } else {
                                    numValueOf = null;
                                }
                                jSONObject.put("err_code", numValueOf);
                                if (baseException != null) {
                                    errorMessage = baseException.getErrorMessage();
                                }
                                jSONObject.put("err_msg", errorMessage);
                                C0XPI c0xpiLIZJ = C0XM1.LIZJ();
                                if (c0xpiLIZJ != null) {
                                    c0xpiLIZJ.monitorCommonLog("zstd_dict_download_error", jSONObject);
                                }
                                C189200o6.m2constructorimpl(Integer.valueOf(Log.d("zstd_dict_download_error", C786410Ut5.J3(jSONObject))));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    });
                    downloadTaskWith.download();
                }
            }
        }
    }
}
