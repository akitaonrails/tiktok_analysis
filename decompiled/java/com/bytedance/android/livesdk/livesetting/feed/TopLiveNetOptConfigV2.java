package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveNetOptConfigV2 {
    public static final TypeAdapter ADAPTER = new TopLiveNetOptConfigV2_OptTypeAdapter(NormalGson.singleton());

    @C09CT("not_close_sky_on_net_error")
    public boolean notCloseSkyWhenNetError;

    @C09CT("opt_go_live_request")
    public boolean optGoLiveRequest;

    @C09CT("opt_pip_on_resume")
    public boolean optPipOnResume;

    public final boolean getNotCloseSkyWhenNetError() {
        return this.notCloseSkyWhenNetError;
    }

    public final boolean getOptGoLiveRequest() {
        return this.optGoLiveRequest;
    }

    public final boolean getOptPipOnResume() {
        return this.optPipOnResume;
    }

    public final void setNotCloseSkyWhenNetError(boolean z) {
        this.notCloseSkyWhenNetError = z;
    }

    public final void setOptGoLiveRequest(boolean z) {
        this.optGoLiveRequest = z;
    }

    public final void setOptPipOnResume(boolean z) {
        this.optPipOnResume = z;
    }
}
