package com.bytedance.tt.reliability.monitor.viewchecker.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class PopupBlockConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("rules")
    public List<BlockRule> rules = new ArrayList();

    @C09CT("trace_config")
    public TraceConfig traceConfig;

    public static class BlockRule {

        @C09CT("description")
        public String descripton;

        @C09CT("enable")
        public boolean enable;

        @C09CT("force_finish")
        public boolean forceFinish;

        @C09CT("host_activity")
        public String hostActivity;

        @C09CT("rule_id")
        public String ruleId;

        @C09CT("target_type")
        public TargetType targetType;

        public String getDescripton() {
            return this.descripton;
        }

        public String getHostActivity() {
            return this.hostActivity;
        }

        public String getRuleId() {
            return this.ruleId;
        }

        public TargetType getTargetType() {
            return this.targetType;
        }

        public boolean isEnable() {
            return this.enable;
        }

        public boolean isForceFinish() {
            return this.forceFinish;
        }
    }

    public List<BlockRule> getRules() {
        return this.rules;
    }

    public TraceConfig getTraceConfig() {
        return this.traceConfig;
    }

    public boolean isEnable() {
        return this.enable;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class TraceConfig {

        @C09CT("sample_ratio_bps")
        public int sampleRatioBps = 800;

        @C09CT("max_per_sig_per_day")
        public int maxPerSigPerDay = 1;

        @C09CT("sig_frame_count")
        public int sigFrameCount = 5;

        @C09CT("known_sig_blacklist")
        public List<String> knownSigBlacklist = new ArrayList();

        @C09CT("target_activities_boost")
        public List<String> targetActivitiesBoost = new ArrayList();

        @C09CT("hook_target_keywords")
        public List<String> hookTargetKeywords = new ArrayList();

        public List<String> getHookTargetKeywords() {
            return this.hookTargetKeywords;
        }

        public List<String> getKnownSigBlacklist() {
            return this.knownSigBlacklist;
        }

        public int getMaxPerSigPerDay() {
            return this.maxPerSigPerDay;
        }

        public int getSampleRatioBps() {
            return this.sampleRatioBps;
        }

        public int getSigFrameCount() {
            return this.sigFrameCount;
        }

        public List<String> getTargetActivitiesBoost() {
            return this.targetActivitiesBoost;
        }
    }
}
