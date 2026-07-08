package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;

/* JADX INFO: loaded from: classes26.dex */
public final class CreativeNetworkDowngradeConfig {

    @C09CT("camera_first_frame_timeout")
    public final long cameraFirstFrameTimeout;

    @C09CT("dispatch_config")
    public final DispatchConfig dispatchConfig;

    @C09CT("downgrade_until_camera_first_frame")
    public final boolean downgradeUntilCameraFirstFrame;

    @C09CT("downgrade_until_exit_creative")
    public final boolean downgradeUntilExitCreative;

    public CreativeNetworkDowngradeConfig() {
        this(false, false, 10000L, new DispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null));
    }

    public CreativeNetworkDowngradeConfig(boolean z, boolean z2, long j, DispatchConfig dispatchConfig) {
        this.downgradeUntilCameraFirstFrame = z;
        this.downgradeUntilExitCreative = z2;
        this.cameraFirstFrameTimeout = j;
        this.dispatchConfig = dispatchConfig;
    }
}
