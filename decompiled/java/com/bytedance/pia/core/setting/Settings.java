package com.bytedance.pia.core.setting;

import X.C01GW;
import X.C09CT;
import X.C09EI;
import X.C13BV;
import X.C13LQ;
import X.C1886407aA;
import X.C1886507aB;
import X.C1953107kv;
import X.C20138613qy;
import X.C2188811AlT;
import X.C2203951BNp;
import X.C2203961BNq;
import X.C2203971BNr;
import X.C2203981BNs;
import X.C2204091BOd;
import X.C452501pT;
import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public final class Settings {
    public static final C01GW<Settings> LJI;
    public static final C01GW<Settings> LJII;
    public static volatile boolean LJIIIIZZ;
    public static volatile Settings LJIIIZ;

    @C09EI
    public boolean LIZ;

    @C09EI
    public final C01GW LIZIZ;

    @C09EI
    public final C01GW LIZJ;

    @C09EI
    public final C01GW LIZLLL;

    @C09EI
    public final C01GW LJ;

    @C09EI
    public final C01GW LJFF;

    @C09CT("allow_domains")
    public final List<String> allowedDomains;

    @C09CT("blocked_pages")
    public final List<String> blockedPages;

    @C09CT("blocked_pages_v1")
    public final List<String> blockedV1Page;

    @C09CT("features")
    public final Set<String> enabledFeatures;

    @C09CT("html_intercept_timeout")
    public final int htmlInterceptTimeout;

    @C09CT("boot")
    public final boolean isBootEnabled;

    @C09CT("cache")
    public final boolean isCacheEnabled;

    @C09CT("experiment_must_finish_warmup")
    public final boolean isMustFinishWarmup;

    @C09CT("nsr_v1")
    public final boolean isNsrV1Enabled;

    @C09CT("main")
    public final boolean isPiaEnabled;

    @C09CT("experiment_disable_pia_query")
    public final boolean isPiaQueryDisable;

    @C09CT("prefetch_v1")
    public final boolean isPrefetchV1Enabled;

    @C09CT("snapshot_v1")
    public final boolean isSnapshotV1Enabled;

    @C09CT("enable_add_cache_key")
    public final boolean isUrlCompatV2Enabled;

    @C09CT("vanilla_fetch")
    public final boolean isVanillaFetchEnabled;

    @C09CT("warmup")
    public final boolean isWarmupEnabled;

    @C09CT("worker")
    public final boolean isWorkerEnabled;

    @C09CT("page_storage_capacity")
    public final int pageStorageCapacity;

    @C09CT("streaming_intercept_timeout")
    public final int streamingInterceptTimeout;

    @C09CT("url_rules")
    public final List<String> urlRules;

    public Settings() {
        this(false, false, false, false, false, false, null, 0, null, 0, 0, null, null, false, false, false, false, false, false, null, 1048575, null);
    }

    static {
        new C2203961BNq();
        LJI = C452501pT.LIZIZ(new C2203981BNs());
        LJII = C452501pT.LIZIZ(new C2203971BNr());
        LJIIIIZZ = true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PiaSettings(enabled=");
        sbLIZ.append(LJIIIIZZ);
        sbLIZ.append("): ");
        sbLIZ.append(GsonProtectorUtils.toJson(GsonUtils.LIZ(), this));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ(Uri uri) {
        if (!LJIIIIZZ) {
            return true;
        }
        if (!this.isPiaEnabled || ((Collection) this.LIZLLL.getValue()).isEmpty()) {
            return false;
        }
        if (((Collection) this.LIZLLL.getValue()).contains("*")) {
            return true;
        }
        if (uri == null || !C1953107kv.LIZIZ(uri)) {
            return false;
        }
        Collection<String> collection = (Collection) this.LIZLLL.getValue();
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        for (String str : collection) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('.');
            sbLIZ.append(uri.getHost());
            if (u.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ), str, false)) {
                return true;
            }
        }
        return false;
    }

    public Settings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<String> list, int i, Set<String> set, int i2, int i3, List<String> list2, List<String> list3, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, List<String> list4) {
        this.isPiaEnabled = z;
        this.isBootEnabled = z2;
        this.isCacheEnabled = z3;
        this.isWorkerEnabled = z4;
        this.isVanillaFetchEnabled = z5;
        this.isWarmupEnabled = z6;
        this.allowedDomains = list;
        this.htmlInterceptTimeout = i;
        this.enabledFeatures = set;
        this.pageStorageCapacity = i2;
        this.streamingInterceptTimeout = i3;
        this.blockedPages = list2;
        this.urlRules = list3;
        this.isPiaQueryDisable = z7;
        this.isMustFinishWarmup = z8;
        this.isUrlCompatV2Enabled = z9;
        this.isNsrV1Enabled = z10;
        this.isPrefetchV1Enabled = z11;
        this.isSnapshotV1Enabled = z12;
        this.blockedV1Page = list4;
        this.LIZIZ = C452501pT.LIZIZ(new C2203951BNp(this));
        this.LIZJ = C452501pT.LIZIZ(new C20138613qy(this));
        this.LIZLLL = C452501pT.LIZIZ(new C1886407aA(this));
        this.LJ = C452501pT.LIZIZ(new C1886507aB(this));
        this.LJFF = C452501pT.LIZIZ(new C2204091BOd(this));
    }

    public Settings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, int i, Set set, int i2, int i3, List list2, List list3, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, List list4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? true : z2, (i4 & 4) != 0 ? true : z3, (i4 & 8) != 0 ? true : z4, (i4 & 16) != 0 ? true : z5, (i4 & 32) == 0 ? z6 : true, (i4 & 64) != 0 ? C13BV.INSTANCE : list, (i4 & 128) != 0 ? 20 : i, (i4 & 256) != 0 ? C13LQ.LJLIIL(new String[]{"prefetch", "nsr", "snapshot", "cache", "streaming", "preload"}) : set, (i4 & 512) != 0 ? 500 : i2, (i4 & 1024) != 0 ? 5 : i3, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list2, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list3, (i4 & 8192) != 0 ? false : z7, (i4 & 16384) != 0 ? false : z8, (32768 & i4) != 0 ? false : z9, (65536 & i4) != 0 ? false : z10, (131072 & i4) != 0 ? false : z11, (262144 & i4) != 0 ? false : z12, (i4 & 524288) != 0 ? C13BV.INSTANCE : list4);
    }
}
