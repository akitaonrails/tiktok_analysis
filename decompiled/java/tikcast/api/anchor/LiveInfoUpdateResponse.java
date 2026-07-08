package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveInfoUpdateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("duration_frequency_control")
        public boolean durationFrequencyControl;

        @C09CT("times_frequency_control")
        public boolean timesFrequencyControl;
    }
}
