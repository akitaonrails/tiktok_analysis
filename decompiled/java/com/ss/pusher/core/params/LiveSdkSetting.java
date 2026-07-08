package com.ss.pusher.core.params;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C2097608Jq;
import com.ss.pusher.core.base.TEBundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class LiveSdkSetting {

    @C09CT("enable_gl_tracer")
    public final boolean enableGLTracer;

    @C09CT("enable_global_gl_shared_context_mutex")
    public final boolean enableGlobalGlSharedContextMutex;

    @C09CT("gear_identifier")
    public String gearIdentifier;

    @C09CT("ProbeSpeedResolutionBase")
    public final List<ProbeSpeedGear> probeSpeedResolutions;

    @C09CT("psnr_statistics")
    public final PsnrStatisics psnrStatisics;

    @C09CT("strategyConfiguration")
    public final StrategyConfiguration strategyConfiguration;

    @C09CT("thread_pri")
    public final Map<String, Integer> threadPriority;

    @C09CT("ts_con_cdn")
    public final List<String> tsConCdn;

    @C09CT("UploadBWProbe")
    public final UploadBWProbeParams uploadBWProbeParams;

    @C09CT("Common")
    public final CommonParams commonParams = new CommonParams();

    @C09CT("Switch")
    public final SwitchParams switchParams = new SwitchParams();
    public final KcpParams LIZ = new KcpParams();
    public final QuicParams LIZIZ = new QuicParams();

    @C09CT("bwestBaseBwStrategy_params")
    public final BwEstBaseBWConfig bwEstBaseBWConfig = new BwEstBaseBWConfig();

    @C09CT("node_opt")
    public final NodeOptParams nodeOpt = new NodeOptParams();

    @C09CT("sandbox")
    public final SandboxParams sandboxParams = new SandboxParams();
    public final RtmpCacheConfig LIZJ = new RtmpCacheConfig();
    public String LIZLLL = "quic";
    public final String LJ = "";

    @C09CT("anchorNetUrlQueryItems")
    public final List<String> anchorNetUrlQueryItems = C1697810uHb.LJIIJJI("rtcUserId", "rtcRoomId", "rtcToken", "rtcStreamId", "rtcStreamToken");
    public final Map<String, Integer> LJFF = new HashMap();

    @C09CT("PushStall")
    public final PushStallConfig pushStallConfig = new PushStallConfig();

    @C09CT("PushBase")
    public final PushBase mPushBase = new PushBase();

    public final void LIZ() {
        PushBase pushBase = this.mPushBase;
        int i = pushBase.maxBitrate;
        int i2 = pushBase.minBitrate;
        int i3 = pushBase.defaultBitrate;
        if (i3 < 1) {
            i3 = 1000000;
        }
        if (i < i3) {
            i = (i3 * 5) / 3;
        }
        if (i2 < 1 || i2 > i3) {
            i2 = (i3 * 2) / 5;
        }
        int i4 = pushBase.LJFF;
        if (pushBase.LJI > 0) {
            i3 = i;
        }
        if (i4 > 0) {
            i2 = i;
            i3 = i;
        }
        pushBase.maxBitrate = i;
        pushBase.minBitrate = i2;
        pushBase.defaultBitrate = i3;
        pushBase.LJ = i3;
        pushBase.width = (((pushBase.width + 2) - 1) / 2) * 2;
        pushBase.height = (((pushBase.height + 2) - 1) / 2) * 2;
    }

    public LiveSdkSetting() {
        C13BV c13bv = C13BV.INSTANCE;
        this.tsConCdn = c13bv;
        this.uploadBWProbeParams = new UploadBWProbeParams();
        this.probeSpeedResolutions = c13bv;
        this.gearIdentifier = "";
        this.threadPriority = C2097608Jq.LJ();
        this.psnrStatisics = new PsnrStatisics();
    }

    public static int LIZIZ(TEBundle tEBundle, String str, int i, Boolean[] boolArr) {
        int i2;
        if (tEBundle.contains(str) && i != (i2 = tEBundle.getInt(str))) {
            boolArr[0] = Boolean.TRUE;
            return i2;
        }
        return i;
    }
}
