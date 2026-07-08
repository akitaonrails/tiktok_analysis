package com.ss.android.socialbase.downloader.service;

import X.C1490880otq;
import X.C1498830p6f;
import X.C1B84;
import X.InterfaceC1490850otn;
import X.InterfaceC1498840p6g;
import X.InterfaceC2199461B6i;
import X.InterfaceC2200061B8q;
import X.InterfaceC2200071B8r;
import X.InterfaceC2200081B8s;
import android.content.Context;
import com.ss.android.socialbase.downloader.depend.IDownloadNetworkHandler;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadComponentManagerService {

    public static class DefaultDownloadComponentManagerService implements IDownloadComponentManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void clearMemoryCacheData(double d) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void clearSqlDownloadCacheData() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void coverComponent(C1B84 c1b84) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public Context getAppContext() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public InterfaceC2199461B6i getDownloadInterceptor() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public InterfaceC1490850otn getReserveWifiStatusListener() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void initComponent(C1B84 c1b84) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void initDownloadCacheImmediately() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public boolean isInit() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setAppContext(Context context) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadDBListener(InterfaceC2200071B8r interfaceC2200071B8r) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadInMultiProcess() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadMemoryInfoListener(InterfaceC2200081B8s interfaceC2200081B8s) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadNetworkHandler(IDownloadNetworkHandler iDownloadNetworkHandler) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadThreadCheckListener(InterfaceC2200061B8q interfaceC2200061B8q) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setReserveWifiStatusListener(InterfaceC1490850otn interfaceC1490850otn) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void submitSingleTask(Runnable runnable) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void unRegisterDownloadReceiver() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void updateDownloadInfo(DownloadInfo downloadInfo) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public InterfaceC1498840p6g getTTNetHandler() {
            return new C1498830p6f();
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public JSONObject getDownloadSetting() {
            return C1490880otq.LIZIZ;
        }
    }

    void clearMemoryCacheData(double d);

    void clearSqlDownloadCacheData();

    void coverComponent(C1B84 c1b84);

    Context getAppContext();

    InterfaceC2199461B6i getDownloadInterceptor();

    JSONObject getDownloadSetting();

    InterfaceC1490850otn getReserveWifiStatusListener();

    InterfaceC1498840p6g getTTNetHandler();

    void initComponent(C1B84 c1b84);

    void initDownloadCacheImmediately();

    boolean isInit();

    void setAppContext(Context context);

    void setDownloadDBListener(InterfaceC2200071B8r interfaceC2200071B8r);

    void setDownloadInMultiProcess();

    void setDownloadMemoryInfoListener(InterfaceC2200081B8s interfaceC2200081B8s);

    void setDownloadNetworkHandler(IDownloadNetworkHandler iDownloadNetworkHandler);

    void setDownloadThreadCheckListener(InterfaceC2200061B8q interfaceC2200061B8q);

    void setReserveWifiStatusListener(InterfaceC1490850otn interfaceC1490850otn);

    void submitSingleTask(Runnable runnable);

    void unRegisterDownloadReceiver();

    void updateDownloadInfo(DownloadInfo downloadInfo);
}
