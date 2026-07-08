package com.bytedance.ttc2pa;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes35.dex */
public interface ITTC2PADepend {

    public static final class DefaultImpls {
    }

    TtC2paNetworkResponse LIZ(String str, Map map);

    boolean enableDebug();

    long getCertFailRetryIntervalSeconds();

    Context getContext();

    ScheduledExecutorService getIoExecutor();

    String getRemoteCertDownloadURL();

    String getTimeStampRequestHost();

    void monitorLogSend(String str, String str2);

    TtC2paNetworkResponse onRemoteSign(byte[] bArr);
}
