package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartIdleDetectionConfig {

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("enhance_drowsy_confirm_count")
    public int enhanceDrowsyConfirmCount;

    @C09CT("enhance_enabled")
    public boolean enhanceEnabled;

    @C09CT("enhance_range_vote")
    public int enhanceRangeVote;

    @C09CT("enhance_weak_extra_gap_seconds")
    public int enhanceWeakExtraGapSeconds;

    @C09CT("feedback_suppress_grace_seconds")
    public int feedbackSuppressGraceSeconds;

    @C09CT("feedback_suppress_initial_seconds")
    public int feedbackSuppressInitialSeconds;

    @C09CT("feedback_suppress_max_seconds")
    public int feedbackSuppressMaxSeconds;

    @C09CT("reset_version")
    public int resetVersion;

    @C09CT("strategy")
    public int strategy;

    @C09CT("trigger_count_mode")
    public int triggerCountMode;

    @C09CT("trigger_threshold")
    public int triggerThreshold;

    @C09CT("polling_interval_seconds")
    public int pollingIntervalSeconds = 600;

    @C09CT("idle_gap_threshold_seconds")
    public int idleGapThresholdSeconds = 3600;

    public final boolean isFeedbackSuppressEnabled() {
        return this.feedbackSuppressInitialSeconds > 0 && this.feedbackSuppressGraceSeconds > 0;
    }

    public String toString() {
        return "SmartIdleDetectionConfig(enabled=" + this.enabled + ", triggerThreshold=" + this.triggerThreshold + ", triggerCountMode=" + this.triggerCountMode + ", resetVersion=" + this.resetVersion + ", strategy=" + this.strategy + ", pollingIntervalSeconds=" + this.pollingIntervalSeconds + ", idleGapThresholdSeconds=" + this.idleGapThresholdSeconds + ", feedbackSuppressInitialSeconds=" + this.feedbackSuppressInitialSeconds + ", feedbackSuppressGraceSeconds=" + this.feedbackSuppressGraceSeconds + ", feedbackSuppressMaxSeconds=" + this.feedbackSuppressMaxSeconds + ", enhanceEnabled=" + this.enhanceEnabled + ", enhanceDrowsyConfirmCount=" + this.enhanceDrowsyConfirmCount + ", enhanceRangeVote=" + this.enhanceRangeVote + ", enhanceWeakExtraGapSeconds=" + this.enhanceWeakExtraGapSeconds + ')';
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getEnhanceDrowsyConfirmCount() {
        return this.enhanceDrowsyConfirmCount;
    }

    public final boolean getEnhanceEnabled() {
        return this.enhanceEnabled;
    }

    public final int getEnhanceRangeVote() {
        return this.enhanceRangeVote;
    }

    public final int getEnhanceWeakExtraGapSeconds() {
        return this.enhanceWeakExtraGapSeconds;
    }

    public final int getFeedbackSuppressGraceSeconds() {
        return this.feedbackSuppressGraceSeconds;
    }

    public final int getFeedbackSuppressInitialSeconds() {
        return this.feedbackSuppressInitialSeconds;
    }

    public final int getFeedbackSuppressMaxSeconds() {
        return this.feedbackSuppressMaxSeconds;
    }

    public final int getIdleGapThresholdSeconds() {
        return this.idleGapThresholdSeconds;
    }

    public final int getPollingIntervalSeconds() {
        return this.pollingIntervalSeconds;
    }

    public final int getResetVersion() {
        return this.resetVersion;
    }

    public final int getStrategy() {
        return this.strategy;
    }

    public final int getTriggerCountMode() {
        return this.triggerCountMode;
    }

    public final int getTriggerThreshold() {
        return this.triggerThreshold;
    }

    public final boolean isEnhanceEnabled() {
        return this.enhanceEnabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setEnhanceDrowsyConfirmCount(int i) {
        this.enhanceDrowsyConfirmCount = i;
    }

    public final void setEnhanceEnabled(boolean z) {
        this.enhanceEnabled = z;
    }

    public final void setEnhanceRangeVote(int i) {
        this.enhanceRangeVote = i;
    }

    public final void setEnhanceWeakExtraGapSeconds(int i) {
        this.enhanceWeakExtraGapSeconds = i;
    }

    public final void setFeedbackSuppressGraceSeconds(int i) {
        this.feedbackSuppressGraceSeconds = i;
    }

    public final void setFeedbackSuppressInitialSeconds(int i) {
        this.feedbackSuppressInitialSeconds = i;
    }

    public final void setFeedbackSuppressMaxSeconds(int i) {
        this.feedbackSuppressMaxSeconds = i;
    }

    public final void setIdleGapThresholdSeconds(int i) {
        this.idleGapThresholdSeconds = i;
    }

    public final void setPollingIntervalSeconds(int i) {
        this.pollingIntervalSeconds = i;
    }

    public final void setResetVersion(int i) {
        this.resetVersion = i;
    }

    public final void setStrategy(int i) {
        this.strategy = i;
    }

    public final void setTriggerCountMode(int i) {
        this.triggerCountMode = i;
    }

    public final void setTriggerThreshold(int i) {
        this.triggerThreshold = i;
    }
}
