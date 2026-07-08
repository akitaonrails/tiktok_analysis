package com.bytedance.helios.api.config;

import X.C09CT;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2097908Jt;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class SignalConfig {

    @C09CT("alog")
    public final Map<String, List<Object>> alog;

    @C09CT("alog_enable")
    public final boolean alogEnable;

    @C09CT("composition")
    public final Map<String, List<String>> composition;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fully_report")
    public final boolean fullyReport;

    @C09CT("lifecycle")
    public final Map<String, List<String>> lifecycle;

    @C09CT("max_upload_size")
    public final int maxUploadSize;

    public SignalConfig() {
        this(false, 0, null, false, null, null, false, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignalConfig(boolean z, int i, Map<String, ? extends List<String>> map, boolean z2, Map<String, ? extends List<Object>> map2, Map<String, ? extends List<String>> map3, boolean z3) {
        this.enable = z;
        this.maxUploadSize = i;
        this.composition = map;
        this.alogEnable = z2;
        this.alog = map2;
        this.lifecycle = map3;
        this.fullyReport = z3;
    }

    public SignalConfig(boolean z, int i, Map map, boolean z2, Map map2, Map map3, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 100 : i, (i2 & 4) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("video", C1697810uHb.LJIIJJI("sysMethod", "customMethod", "app", "guard", "sys", "alog")), new Pair("audio", C1697810uHb.LJIIJJI("sysMethod", "customMethod", "app", "guard", "sys", "alog"))) : map, (i2 & 8) == 0 ? z2 : false, (i2 & 16) != 0 ? C2097608Jq.LJ() : map2, (i2 & 32) != 0 ? C2097908Jt.LIZJ(new Pair("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", C1697810uHb.LJIIJJI("onPaused", "Stopped"))) : map3, (i2 & 64) == 0 ? z3 : true);
    }
}
