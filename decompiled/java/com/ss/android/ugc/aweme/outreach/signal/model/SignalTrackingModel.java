package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class SignalTrackingModel {

    @C09CT("enable_double_channel_tracking")
    public final boolean enableDoubleChannelTracking;

    @C09CT("enable_signal_channel_tracking")
    public final boolean enableSignalTracking;

    @C09CT("fall_back_signal_use_ab_switch")
    public final boolean fallBackSignalUseABSwitch;

    @C09CT("report_signal_sample_rate")
    public final int reportSignalSampleRate;

    @C09CT("tracking_timing_list")
    public final ArrayList<String> trackingTimingList;

    public SignalTrackingModel() {
        this(null, false, false, false, 10);
    }

    public SignalTrackingModel(ArrayList<String> arrayList, boolean z, boolean z2, boolean z3, int i) {
        this.trackingTimingList = arrayList;
        this.enableSignalTracking = z;
        this.enableDoubleChannelTracking = z2;
        this.fallBackSignalUseABSwitch = z3;
        this.reportSignalSampleRate = i;
    }
}
