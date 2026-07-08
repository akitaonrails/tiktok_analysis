package com.ss.videoarch.live.ttquic;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
public class TTEngineParam {
    public static final String DEFAULT_CACHE_PATH;
    public String agentName = "ttplayer-live";
    public int cacheMaxSize;
    public String cachePath;
    public String flvCachePath;
    public int logLevel;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3().getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append(Environment.DIRECTORY_DOWNLOADS);
        DEFAULT_CACHE_PATH = C2188811AlT.LIZIZ(sbLIZ);
    }

    public TTEngineParam() {
        String str = DEFAULT_CACHE_PATH;
        this.cachePath = str;
        this.flvCachePath = str;
        this.cacheMaxSize = 209715200;
        this.logLevel = 2;
    }
}
