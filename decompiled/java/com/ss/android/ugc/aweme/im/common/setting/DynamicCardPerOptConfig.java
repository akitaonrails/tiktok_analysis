package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicCardPerOptConfig {

    @C09CT("enable_async_layout")
    public final boolean enableAsyncLayout;

    @C09CT("enable_global_reuse")
    public final boolean enableGlobalReuse;

    @C09CT("enable_pre_decode")
    public final boolean enablePreDecode;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("enable_spark_lite")
    public final boolean enableSparkLite;

    @C09CT("fix_recycle_issue")
    public final boolean fixRecycleIssue;

    @C09CT("force_schema")
    public final String forceSchema;

    @C09CT("global_reuse_size")
    public final int globalReuseSize;

    @C09CT("pre_decode_schema_list")
    public final List<String> preDecodeSchemaList;

    @C09CT("preload_config")
    public final Map<String, Integer> preloadSchemaSizeMap;

    @C09CT("preload_size")
    public final int preloadSize;

    @C09CT("use_native")
    public final boolean useNative;

    public DynamicCardPerOptConfig() {
        this(false, false, false, null, false, false, 0, null, false, 0, false, null, 4095, null);
    }

    public DynamicCardPerOptConfig(boolean z, boolean z2, boolean z3, List<String> list, boolean z4, boolean z5, int i, Map<String, Integer> map, boolean z6, int i2, boolean z7, String str) {
        this.enableSparkLite = z;
        this.fixRecycleIssue = z2;
        this.enablePreDecode = z3;
        this.preDecodeSchemaList = list;
        this.enableAsyncLayout = z4;
        this.enablePreload = z5;
        this.preloadSize = i;
        this.preloadSchemaSizeMap = map;
        this.enableGlobalReuse = z6;
        this.globalReuseSize = i2;
        this.useNative = z7;
        this.forceSchema = str;
    }

    public DynamicCardPerOptConfig(boolean z, boolean z2, boolean z3, List list, boolean z4, boolean z5, int i, Map map, boolean z6, int i2, boolean z7, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? C13BV.INSTANCE : list, (i3 & 16) != 0 ? false : z4, (i3 & 32) != 0 ? false : z5, (i3 & 64) != 0 ? 5 : i, (i3 & 128) != 0 ? C2097608Jq.LJ() : map, (i3 & 256) != 0 ? false : z6, (i3 & 512) == 0 ? i2 : 5, (i3 & 1024) == 0 ? z7 : false, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str);
    }
}
