package com.ss.android.ugc.aweme.outreach.pipeline;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OutreachPipelineSampleConfig {

    @C09CT("decision_make")
    public final PipelineStageSampleConfig decisionMake;

    @C09CT("fetch_dispatch")
    public final PipelineStageSampleConfig fetchDispatch;

    @C09CT("fetch_request")
    public final PipelineStageSampleConfig fetchRequest;

    @C09CT("outreach_click")
    public final PipelineStageSampleConfig outreachClick;

    @C09CT("outreach_data_parse")
    public final PipelineStageSampleConfig outreachDataParse;

    @C09CT("outreach_show")
    public final PipelineStageSampleConfig outreachShow;

    @C09CT("signal_trigger_sample_config")
    public final SignalTriggerSampleConfig signalTriggerSampleConfig;

    @C09CT("strategy_execute")
    public final PipelineStageSampleConfig strategyExecute;

    @C09CT("trigger_dispatch")
    public final PipelineStageSampleConfig triggerDispatch;

    public OutreachPipelineSampleConfig() {
        this(new SignalTriggerSampleConfig(null, 0.0d, 3, null), new PipelineStageSampleConfig(0.0d), new PipelineStageSampleConfig(0.0d), new PipelineStageSampleConfig(0.0d), new PipelineStageSampleConfig(0.0d), new PipelineStageSampleConfig(0.0d), new PipelineStageSampleConfig(0.0d), new PipelineStageSampleConfig(0.0d), new PipelineStageSampleConfig(0.0d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutreachPipelineSampleConfig)) {
            return false;
        }
        OutreachPipelineSampleConfig outreachPipelineSampleConfig = (OutreachPipelineSampleConfig) obj;
        return Intrinsics.LJFF(this.signalTriggerSampleConfig, outreachPipelineSampleConfig.signalTriggerSampleConfig) && Intrinsics.LJFF(this.strategyExecute, outreachPipelineSampleConfig.strategyExecute) && Intrinsics.LJFF(this.decisionMake, outreachPipelineSampleConfig.decisionMake) && Intrinsics.LJFF(this.fetchRequest, outreachPipelineSampleConfig.fetchRequest) && Intrinsics.LJFF(this.fetchDispatch, outreachPipelineSampleConfig.fetchDispatch) && Intrinsics.LJFF(this.triggerDispatch, outreachPipelineSampleConfig.triggerDispatch) && Intrinsics.LJFF(this.outreachDataParse, outreachPipelineSampleConfig.outreachDataParse) && Intrinsics.LJFF(this.outreachShow, outreachPipelineSampleConfig.outreachShow) && Intrinsics.LJFF(this.outreachClick, outreachPipelineSampleConfig.outreachClick);
    }

    public final int hashCode() {
        return (((((((((((((((this.signalTriggerSampleConfig.hashCode() * 31) + this.strategyExecute.hashCode()) * 31) + this.decisionMake.hashCode()) * 31) + this.fetchRequest.hashCode()) * 31) + this.fetchDispatch.hashCode()) * 31) + this.triggerDispatch.hashCode()) * 31) + this.outreachDataParse.hashCode()) * 31) + this.outreachShow.hashCode()) * 31) + this.outreachClick.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachPipelineSampleConfig(signalTriggerSampleConfig=");
        sbLIZ.append(this.signalTriggerSampleConfig);
        sbLIZ.append(", strategyExecute=");
        sbLIZ.append(this.strategyExecute);
        sbLIZ.append(", decisionMake=");
        sbLIZ.append(this.decisionMake);
        sbLIZ.append(", fetchRequest=");
        sbLIZ.append(this.fetchRequest);
        sbLIZ.append(", fetchDispatch=");
        sbLIZ.append(this.fetchDispatch);
        sbLIZ.append(", triggerDispatch=");
        sbLIZ.append(this.triggerDispatch);
        sbLIZ.append(", outreachDataParse=");
        sbLIZ.append(this.outreachDataParse);
        sbLIZ.append(", outreachShow=");
        sbLIZ.append(this.outreachShow);
        sbLIZ.append(", outreachClick=");
        sbLIZ.append(this.outreachClick);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final double LIZ(String str) {
        switch (str.hashCode()) {
            case -1975251167:
                if (!str.equals("trigger_dispatch")) {
                    return 0.0d;
                }
                return this.triggerDispatch.sampleRate;
            case -1683410002:
                if (!str.equals("outreach_click")) {
                    return 0.0d;
                }
                return this.outreachClick.sampleRate;
            case -952941791:
                if (!str.equals("signal_trigger")) {
                    return 0.0d;
                }
                return this.signalTriggerSampleConfig.sampleRate;
            case -689758551:
                if (!str.equals("strategy_execute")) {
                    return 0.0d;
                }
                return this.strategyExecute.sampleRate;
            case -505079695:
                if (!str.equals("decision_make")) {
                    return 0.0d;
                }
                return this.decisionMake.sampleRate;
            case 169934712:
                if (!str.equals("outreach_data_parse")) {
                    return 0.0d;
                }
                return this.outreachDataParse.sampleRate;
            case 184436234:
                if (!str.equals("fetch_request")) {
                    return 0.0d;
                }
                return this.fetchRequest.sampleRate;
            case 916000791:
                if (!str.equals("outreach_show")) {
                    return 0.0d;
                }
                return this.outreachShow.sampleRate;
            case 2100584543:
                if (!str.equals("fetch_dispatch")) {
                    return 0.0d;
                }
                return this.fetchDispatch.sampleRate;
            default:
                return 0.0d;
        }
    }

    public OutreachPipelineSampleConfig(SignalTriggerSampleConfig signalTriggerSampleConfig, PipelineStageSampleConfig pipelineStageSampleConfig, PipelineStageSampleConfig pipelineStageSampleConfig2, PipelineStageSampleConfig pipelineStageSampleConfig3, PipelineStageSampleConfig pipelineStageSampleConfig4, PipelineStageSampleConfig pipelineStageSampleConfig5, PipelineStageSampleConfig pipelineStageSampleConfig6, PipelineStageSampleConfig pipelineStageSampleConfig7, PipelineStageSampleConfig pipelineStageSampleConfig8) {
        this.signalTriggerSampleConfig = signalTriggerSampleConfig;
        this.strategyExecute = pipelineStageSampleConfig;
        this.decisionMake = pipelineStageSampleConfig2;
        this.fetchRequest = pipelineStageSampleConfig3;
        this.fetchDispatch = pipelineStageSampleConfig4;
        this.triggerDispatch = pipelineStageSampleConfig5;
        this.outreachDataParse = pipelineStageSampleConfig6;
        this.outreachShow = pipelineStageSampleConfig7;
        this.outreachClick = pipelineStageSampleConfig8;
    }
}
