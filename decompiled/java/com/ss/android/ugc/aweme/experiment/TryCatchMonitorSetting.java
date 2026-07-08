package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class TryCatchMonitorSetting {
    public static final Config LIZ = new Config(new RateConfig(0.5d, 1.0d, 0.01d), null);
    public static final RateConfig LIZIZ = new RateConfig(0.5d, 1.0d, 0.01d);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(271));

    public static final class RateConfig {

        @C09CT("default_sampling_rate")
        public final double defaultSamplingRate;

        @C09CT("high_priority_sampling_rate")
        public final double highPrioritySamplingRate;

        @C09CT("low_priority_sampling_rate")
        public final double lowPrioritySamplingRate;

        public RateConfig() {
            this(0.5d, 1.0d, 0.01d);
        }

        public RateConfig(double d, double d2, double d3) {
            this.defaultSamplingRate = d;
            this.highPrioritySamplingRate = d2;
            this.lowPrioritySamplingRate = d3;
        }
    }

    public static final class Config {

        @C09CT("list")
        public final TryCatchConfigList list;

        @C09CT("rate")
        public final RateConfig rate;

        public Config() {
            this(new RateConfig(0.5d, 1.0d, 0.01d), null);
        }

        public Config(RateConfig rateConfig, TryCatchConfigList tryCatchConfigList) {
            this.rate = rateConfig;
            this.list = tryCatchConfigList;
        }
    }

    public static final class TryCatchConfigList {

        @C09CT("high_priority_list")
        public final List<TryCatchRule> highPriorityList;

        @C09CT("ignore_list")
        public final List<TryCatchRule> ignoreList;

        @C09CT("low_priority_list")
        public final List<TryCatchRule> lowPriorityList;

        public TryCatchConfigList() {
            this(null, null, null);
        }

        public TryCatchConfigList(List<TryCatchRule> list, List<TryCatchRule> list2, List<TryCatchRule> list3) {
            this.ignoreList = list;
            this.lowPriorityList = list2;
            this.highPriorityList = list3;
        }
    }

    public static final class TryCatchRule {

        @C09CT("exceptionMessage")
        public final String exceptionMessage;

        @C09CT("exceptionType")
        public final String exceptionType;

        @C09CT("stackClassName")
        public final String stackClassName;

        @C09CT("stackMethodName")
        public final String stackMethodName;

        public TryCatchRule() {
            this(null, null, null, null);
        }

        public TryCatchRule(String str, String str2, String str3, String str4) {
            this.exceptionMessage = str;
            this.exceptionType = str2;
            this.stackClassName = str3;
            this.stackMethodName = str4;
        }
    }
}
