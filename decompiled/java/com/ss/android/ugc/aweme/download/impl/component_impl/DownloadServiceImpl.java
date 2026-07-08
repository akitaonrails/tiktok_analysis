package com.ss.android.ugc.aweme.download.impl.component_impl;

import X.AbstractC2199801B7q;
import X.AbstractC2200031B8n;
import X.AbstractC2200041B8o;
import X.C0VX7;
import X.C1490510otF;
import X.C1498680p6Q;
import X.C1AF0;
import X.C1B67;
import X.C1B84;
import X.C1B8O;
import X.C1B8Q;
import X.C1B90;
import X.C1B93;
import X.C2199721B7i;
import X.C2540609xU;
import X.C823050WQl;
import X.C844470XAv;
import X.InterfaceC1500070p8f;
import X.InterfaceC2199971B8h;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadNetworkHandler;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.ttnet.IDownloadApi;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadConfigDepend;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadMonitorLogSender;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi;
import com.ss.android.ugc.aweme.traffic.TrafficMonitorService;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class DownloadServiceImpl implements IDownloadService {
    public static IMonitorLogSendDepend LIZJ;
    public static IDownloadConfigDepend LIZLLL;
    public Context LIZ;
    public ITrafficMonitorApi LIZIZ;

    public static JSONObject LIZJ() {
        String settingString;
        JSONObject jSONObject;
        IDownloadConfigDepend iDownloadConfigDepend = LIZLLL;
        if (iDownloadConfigDepend == null || (settingString = iDownloadConfigDepend.getSettingString()) == null) {
            settingString = "";
        }
        try {
            jSONObject = !TextUtils.isEmpty(settingString) ? new JSONObject(settingString) : new JSONObject();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("switch_not_auto_boot_service", 1);
            jSONObject.put("download_completed_event_tag", "draw_ad");
            jSONObject.put("landing_page_progressbar_visible", 1);
            jSONObject.put("is_enable_show_retry_download_dialog", 1);
            jSONObject.put("save_path_security", 1);
            return jSONObject;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return jSONObject;
        }
    }

    static {
        Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final void LIZIZ(final C0VX7 c0vx7) {
        try {
            C1B90 c1b90LIZ = C1B90.LIZ();
            C1B93 c1b93 = new C1B93() { // from class: X.1B95
                @Override // X.C1B93
                public final String getAid() {
                    String aid = c0vx7.getAid();
                    return aid == null ? "" : aid;
                }

                @Override // X.C1B93
                public final String getAppVersionName() {
                    String appVersionName = c0vx7.getAppVersionName();
                    return appVersionName == null ? "" : appVersionName;
                }

                @Override // X.C1B93
                public final String getChannel() {
                    String channel = c0vx7.getChannel();
                    return channel == null ? "" : channel;
                }

                @Override // X.C1B93
                public final Context getContext() {
                    return c0vx7.getContext();
                }

                @Override // X.C1B93
                public final String getDeviceId() {
                    String deviceId = c0vx7.getDeviceId();
                    return deviceId == null ? "" : deviceId;
                }

                @Override // X.C1B93
                public final String[] getMonitorHosts() {
                    return c0vx7.getMonitorHosts();
                }

                @Override // X.C1B93
                public final String getPackageName() {
                    return c0vx7.getPackageName();
                }

                @Override // X.C1B93
                public final long getUpdateVersionCode() {
                    return c0vx7.getUpdateVersionCode();
                }
            };
            if (c1b90LIZ.LIZ == null) {
                c1b90LIZ.LIZ = c1b93;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final void cancel(int i) {
        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).cancel(i);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final DownloadInfo getDownloadInfo(int i) {
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).getDownloadInfo(i);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final AbstractC2199801B7q getDownloadTask(int i) {
        C1B8Q c1b8qLIZ = C1B8O.LIZ();
        if (c1b8qLIZ != null) {
            return c1b8qLIZ.LIZ.get(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final AbstractC2200031B8n getPageLifeMonitor(int i) {
        getDownloadTask(i);
        return new AbstractC2200031B8n() { // from class: X.1B8W
        };
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final AbstractC2200041B8o getViewLifeMonitor(int i) {
        getDownloadTask(i);
        return new AbstractC2200041B8o() { // from class: X.1B8X
        };
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final boolean isDownloading(int i) {
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).isDownloading(i);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final void restart(int i) {
        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).restart(i);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final AbstractC2199801B7q with(String str) {
        if (this.LIZ == null) {
            C844470XAv.LIZ.getClass();
            this.LIZ = C844470XAv.LIZ();
        }
        return new C2199721B7i(this.LIZ, str);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final int getDownloadId(String str, String str2) {
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).getDownloadId(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public final DownloadInfo getDownloadInfo(String str, String str2) {
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).getDownloadInfo(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final void LIZ(Context context, DownloadMonitorLogSender downloadMonitorLogSender, DownloadConfigDepend downloadConfigDepend) {
        InterfaceC1500070p8f tTNetDownloadHttpService;
        this.LIZ = context;
        LIZJ = downloadMonitorLogSender;
        LIZLLL = downloadConfigDepend;
        boolean z = false;
        LIZJ().optInt("download_exp_switch_temp", 0);
        C1B84 c1b84 = new C1B84(context);
        c1b84.LJ = new InterfaceC2199971B8h() { // from class: X.1B8S
            @Override // X.InterfaceC2199971B8h
            public final JSONObject get() {
                this.LIZ.getClass();
                return DownloadServiceImpl.LIZJ();
            }
        };
        c1b84.LJIILJJIL = false;
        c1b84.LIZJ = new C1B67() { // from class: X.1B8P
            @Override // X.C1B67
            public final void LIZIZ(String str, JSONObject jSONObject) {
                C1B90.LIZ().LIZIZ(str, jSONObject);
                DownloadServiceImpl downloadServiceImpl = this.LIZ;
                if (downloadServiceImpl.LIZIZ == null) {
                    downloadServiceImpl.LIZIZ = TrafficMonitorService.LIZJ();
                }
                ITrafficMonitorApi iTrafficMonitorApi = downloadServiceImpl.LIZIZ;
                if (iTrafficMonitorApi != null) {
                    iTrafficMonitorApi.LIZIZ(str, jSONObject);
                }
            }
        };
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("replace_ttnet_download_service", false)) {
            if (C2540609xU.LIZ()) {
                c1b84.LJIILIIL = new C1498680p6Q() { // from class: X.0XIg
                    public final C08I7<String, Retrofit> LIZIZ = new C08I7<>(10);

                    @Override // X.C1498680p6Q
                    public final IDownloadApi LJ(String str) {
                        synchronized (this) {
                            if (C2093608Ic.LJ(str)) {
                                return null;
                            }
                            Retrofit retrofitLIZIZ = this.LIZIZ.LIZIZ(str);
                            if (retrofitLIZIZ != null) {
                                return (IDownloadApi) retrofitLIZIZ.LIZ(IDownloadApi.class);
                            }
                            Retrofit retrofitLJIIIIZZ = C1515120pWw.LJIIIIZZ(str, Collections.singletonList(C2429209fW.LIZ().dataFlowIDInterceptor("671089154")));
                            this.LIZIZ.LIZLLL(str, retrofitLJIIIIZZ);
                            return (IDownloadApi) retrofitLJIIIIZZ.LIZ(IDownloadApi.class);
                        }
                    }
                };
            } else {
                c1b84.LJIILIIL = new C1498680p6Q();
            }
        } else {
            IDownloadConfigDepend iDownloadConfigDepend = LIZLLL;
            if (iDownloadConfigDepend != null) {
                tTNetDownloadHttpService = iDownloadConfigDepend.getTTNetDownloadHttpService();
            } else {
                tTNetDownloadHttpService = null;
            }
            c1b84.LIZIZ = tTNetDownloadHttpService;
        }
        if (LIZJ().optInt("enable_thread_opt") == 1) {
            JSONObject jSONObjectLIZJ = LIZJ();
            int iOptInt = jSONObjectLIZJ.optInt("cpu_thread_count", -1);
            int iOptInt2 = jSONObjectLIZJ.optInt("io_thread_count", -1);
            int iOptInt3 = jSONObjectLIZJ.optInt("mix_default_thread_count", -1);
            int iOptInt4 = jSONObjectLIZJ.optInt("mix_frequent_thread_count", -1);
            int iOptInt5 = jSONObjectLIZJ.optInt("mix_apk_thread_count", 4);
            int iOptInt6 = jSONObjectLIZJ.optInt("db_thread_count", -1);
            int iOptInt7 = jSONObjectLIZJ.optInt("chunk_thread_count", -1);
            if (jSONObjectLIZJ.optInt("use_default_okhttp_executor", 0) == 1) {
                z = true;
            }
            c1b84.LJFF = C1490510otF.LIZ(iOptInt, "cpu", C823050WQl.LIZJ());
            c1b84.LJI = C1490510otF.LIZ(iOptInt2, "io", C823050WQl.LIZLLL());
            c1b84.LJII = C1490510otF.LIZ(iOptInt3, "mix-default", C823050WQl.LIZLLL());
            c1b84.LJIIIIZZ = C1490510otF.LIZ(iOptInt4, "mix-frequent", C823050WQl.LIZLLL());
            c1b84.LJIIIZ = C1490510otF.LIZ(iOptInt5, "mix-apk", C823050WQl.LIZLLL());
            c1b84.LJIIJ = C1490510otF.LIZ(iOptInt6, "db", C823050WQl.LIZLLL());
            c1b84.LJIIJJI = C1490510otF.LIZ(iOptInt7, "chunk", C823050WQl.LIZLLL());
            if (!z) {
                c1b84.LJIIL = C823050WQl.LIZLLL();
            }
        }
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (SettingsManager.LIZ("sandbox_3rd_net_add_downloader_dfid", true)) {
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).setDownloadNetworkHandler(new IDownloadNetworkHandler() { // from class: X.1B8J
                @Override // com.ss.android.socialbase.downloader.depend.IDownloadNetworkHandler
                public final String handle(String str, List<HttpHeader> list) {
                    if (list != null) {
                        list.add(new HttpHeader("x-tt-dataflow-id", "671089154"));
                    }
                    return str;
                }
            });
        }
        Downloader.init(c1b84);
    }
}
