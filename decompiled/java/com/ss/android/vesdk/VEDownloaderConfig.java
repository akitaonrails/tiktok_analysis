package com.ss.android.vesdk;

import X.C08FF;
import X.C0VSJ;
import X.C20187913yv;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class VEDownloaderConfig {
    public String cacheDir;
    public String customFileName;
    public String customSavePath;
    public long externalFirstSegOffset;
    public long externalMediaSize;
    public String externalPath;
    public HashMap<String, String> headerParams;
    public boolean needSaveFile;
    public String url;
    public String[] urlList;
    public int maxDownloadCount = 3;
    public int maxCacheFileCount = 10;
    public int maxNetworkTimeout = LivePreCreateNextRoomPlayer.ENABLE;
    public int connectTimeoutMs = -1;
    public int mediaCheckTimeoutMs = -1;
    public int mediaCheckMaxRetries = -1;
    public DownloadPriority priority = DownloadPriority.NORMAL;
    public DownloadPriority probePriority = DownloadPriority.INHERIT;
    public String businessId = "";
    public long rangeStart = -1;
    public long rangeEnd = -1;

    public String getFinalSavePath() {
        if (!TextUtils.isEmpty(this.customSavePath)) {
            C0VSJ c0vsj = new C0VSJ(this.customSavePath);
            if (!this.customSavePath.endsWith("/") && !c0vsj.isDirectory()) {
                return this.customSavePath;
            }
            if (!TextUtils.isEmpty(this.customFileName)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.customSavePath);
                sbLIZ.append(this.customSavePath.endsWith("/") ? "" : "/");
                sbLIZ.append(this.customFileName);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            String mD5FileName = TEVideoUtils.getMD5FileName("", getResourceKey());
            if (mD5FileName != null) {
                String name = new C0VSJ(mD5FileName).getName();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.customSavePath);
                sbLIZ2.append(this.customSavePath.endsWith("/") ? "" : "/");
                sbLIZ2.append(name);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        if (TextUtils.isEmpty(this.customFileName) || TextUtils.isEmpty(this.cacheDir)) {
            if (TextUtils.isEmpty(this.cacheDir)) {
                return null;
            }
            return TEVideoUtils.getMD5FileName(this.cacheDir, getResourceKey());
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.cacheDir);
        sbLIZ3.append("/");
        sbLIZ3.append(this.customFileName);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public String getResourceKey() {
        return getResourceKey(this.url, this.urlList, this.customSavePath, this.customFileName);
    }

    public C20187913yv validateConfig() {
        File parentFile;
        if (TextUtils.isEmpty(this.url)) {
            return new C20187913yv(false, "URL cannot be empty");
        }
        if (TextUtils.isEmpty(this.cacheDir)) {
            return new C20187913yv(false, "Cache directory cannot be empty");
        }
        if (TextUtils.isEmpty(this.customSavePath) || (parentFile = new C0VSJ(this.customSavePath).getParentFile()) == null || parentFile.exists() || parentFile.mkdirs()) {
            return new C20187913yv(true, "Configuration validation passed");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to create parent directory for custom save path: ");
        sbLIZ.append(parentFile.getAbsolutePath());
        return new C20187913yv(false, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX INFO: loaded from: classes24.dex */
    public enum DownloadPriority {
        INHERIT(-1),
        LOW(0),
        NORMAL(100),
        HIGH(200),
        CRITICAL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL),
        EXCLUSIVE(400);

        public final int value;

        public int getValue() {
            return this.value;
        }

        public static DownloadPriority valueOf(String str) {
            return (DownloadPriority) C08FF.LIZ(DownloadPriority.class, str);
        }

        DownloadPriority(int i) {
            this.value = i;
        }
    }

    public VEDownloaderConfig(String str, String str2) {
        this.url = str;
        this.cacheDir = str2;
    }

    public static String getResourceKey(String str, String[] strArr, String str2) {
        return getResourceKey(str, strArr, str2, null);
    }

    public static String getResourceKey(String str, String[] strArr, String str2, String str3) {
        boolean z;
        boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_enable_streaming_params_isolation", false).booleanValue();
        boolean zBooleanValue2 = VEConfigCenter.getInstance().getValue("ve_enable_streaming_url_failover", false).booleanValue();
        if (strArr != null && strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (zBooleanValue && zBooleanValue2 && z && !TextUtils.isEmpty(str2)) {
            String str4 = "/";
            if (!str2.endsWith("/") && !new C0VSJ(str2).isDirectory()) {
                return str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                if (str2.endsWith("/")) {
                    str4 = "";
                }
                sbLIZ.append(str4);
                sbLIZ.append(str3);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return str;
    }

    public VEDownloaderConfig(String str, String str2, String str3, String str4, long j, long j2) {
        this.url = str;
        this.cacheDir = str2;
        this.externalPath = str4;
        this.externalFirstSegOffset = j;
        this.externalMediaSize = j2;
    }
}
