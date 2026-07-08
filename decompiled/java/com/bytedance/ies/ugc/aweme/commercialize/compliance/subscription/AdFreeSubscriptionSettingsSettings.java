package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.C09CT;
import X.C1022620cia;
import X.C1AF0;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes13.dex */
public final class AdFreeSubscriptionSettingsSettings {
    public static final AdFreeSettings LIZ = new AdFreeSettings(2, 43200, 4, 43200, 2, 1, 10, 1, 1, 3, 20160, true, true, "600", false, 1440);

    public static final class AdFreeSettings {
        public static final int $stable = 0;

        @C09CT("ads_stay_time_cap")
        public final int adsStayTimeCap;

        @C09CT("card_block_time_interval")
        public final int cardBlockTimeInterval;

        @C09CT("card_frequency_cap")
        public final int cardFrequencyCap;

        @C09CT("card_frequency_time_interval")
        public final int cardFrequencyTimeInterval;

        @C09CT("card_req_gap_max")
        public final int cardReqGapMax;

        @C09CT("card_req_gap_min")
        public final int cardReqGapMin;

        @C09CT("card_stay_time_cap")
        public final int cardStayTimeCap;

        @C09CT("frequency_ads_dislike_count")
        public final int frequencyAdsDislikeCount;

        @C09CT("frequency_ads_fast_skipped_count")
        public final int frequencyAdsFastSkippedCount;

        @C09CT("frequency_ads_report_count")
        public final int frequencyAdsReportCount;

        @C09CT("frequency_card_dislike_count")
        public final int frequencyCardDislikeCount;

        @C09CT("frequency_card_fast_skipped_count")
        public final int frequencyCardFastSkippedCount;

        @C09CT("is_in_feed_card_enabled")
        public final boolean isInFeedCardEnabled;

        @C09CT("is_subscription_pending_phase_enabled")
        public final boolean isSubscriptionPendingPhaseEnabled;

        @C09CT("payment_pop_up_block_period")
        public final String paymentPopUpBlockPeriod;

        @C09CT("show_error_code_in_toast")
        public final boolean showErrorCodeInToast;

        public String toString() {
            return "AdFreeSettings(adsStayTimeCap=" + this.adsStayTimeCap + ", cardBlockTimeInterval=" + this.cardBlockTimeInterval + ", cardFrequencyCap=" + this.cardFrequencyCap + ", cardFrequencyTimeInterval=" + this.cardFrequencyTimeInterval + ", cardStayTimeCap=" + this.cardStayTimeCap + ", frequencyAdsDislikeCount=" + this.frequencyAdsDislikeCount + ", frequencyAdsFastSkippedCount=" + this.frequencyAdsFastSkippedCount + ", frequencyAdsReportCount=" + this.frequencyAdsReportCount + ", frequencyCardDislikeCount=" + this.frequencyCardDislikeCount + ", frequencyCardFastSkippedCount=" + this.frequencyCardFastSkippedCount + ", cardReqGapMax=" + this.cardReqGapMax + ", isInFeedCardEnabled=" + this.isInFeedCardEnabled + ", isSubscriptionPendingPhaseEnabled=" + this.isSubscriptionPendingPhaseEnabled + ", paymentPopUpBlockPeriod=" + this.paymentPopUpBlockPeriod + ", showErrorCodeInToast=" + this.showErrorCodeInToast + ", cardReqGapMin=" + this.cardReqGapMin + ')';
        }

        public AdFreeSettings() {
            this(2, 43200, 4, 43200, 2, 1, 10, 1, 1, 3, 20160, true, true, "600", true, 1440);
        }

        public final boolean isInFeedCardEnabled() {
            return this.isInFeedCardEnabled;
        }

        public final boolean isSubscriptionPendingPhaseEnabled() {
            return this.isSubscriptionPendingPhaseEnabled;
        }

        public AdFreeSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2, String str, boolean z3, int i12) {
            this.adsStayTimeCap = i;
            this.cardBlockTimeInterval = i2;
            this.cardFrequencyCap = i3;
            this.cardFrequencyTimeInterval = i4;
            this.cardStayTimeCap = i5;
            this.frequencyAdsDislikeCount = i6;
            this.frequencyAdsFastSkippedCount = i7;
            this.frequencyAdsReportCount = i8;
            this.frequencyCardDislikeCount = i9;
            this.frequencyCardFastSkippedCount = i10;
            this.cardReqGapMax = i11;
            this.isInFeedCardEnabled = z;
            this.isSubscriptionPendingPhaseEnabled = z2;
            this.paymentPopUpBlockPeriod = str;
            this.showErrorCodeInToast = z3;
            this.cardReqGapMin = i12;
        }
    }

    public static final AdFreeSettings LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AdFreeSettings adFreeSettings = LIZ;
            AdFreeSettings adFreeSettings2 = (AdFreeSettings) settingsManagerLIZLLL.LJIIIIZZ("ad_free_subscription_settings", AdFreeSettings.class, adFreeSettings);
            C1022620cia.LIZ("AdFreeSubscription", "AdFreeSubscriptionSettingsSettings-getValue:" + adFreeSettings2);
            return adFreeSettings2 != null ? adFreeSettings2 : adFreeSettings;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            StringBuilder sb = new StringBuilder("DEFAULT_GROUP:");
            AdFreeSettings adFreeSettings3 = LIZ;
            sb.append(adFreeSettings3);
            C1022620cia.LIZIZ("AdFreeSubscription", sb.toString());
            return adFreeSettings3;
        }
    }
}
