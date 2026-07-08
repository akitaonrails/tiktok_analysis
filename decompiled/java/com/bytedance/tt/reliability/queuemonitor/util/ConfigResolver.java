package com.bytedance.tt.reliability.queuemonitor.util;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.queuemonitor.model.Filter;
import com.bytedance.tt.reliability.queuemonitor.model.QueueId;
import com.bytedance.tt.reliability.queuemonitor.model.StackSamplingConfig;
import com.bytedance.tt.reliability.queuemonitor.model.StackTraceConfig;
import com.bytedance.tt.reliability.queuemonitor.model.WarnConfig;
import com.bytedance.tt.reliability.queuemonitor.model.WarnThresholdConfig;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfigResolver {
    public static final ConfigResolver INSTANCE = new ConfigResolver();

    private final Regex safeRegex(String str) {
        try {
            return new Regex(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    private final boolean matches(Filter filter, QueueId queueId) {
        boolean zContainsMatchIn;
        boolean zContainsMatchIn2;
        String str = filter.namePattern;
        if (str == null) {
            zContainsMatchIn = true;
        } else {
            Regex regexSafeRegex = INSTANCE.safeRegex(str);
            if (regexSafeRegex == null) {
                return false;
            }
            zContainsMatchIn = regexSafeRegex.containsMatchIn(queueId.name);
        }
        String str2 = filter.groupTypePattern;
        if (str2 == null) {
            zContainsMatchIn2 = true;
        } else {
            Regex regexSafeRegex2 = INSTANCE.safeRegex(str2);
            if (regexSafeRegex2 == null) {
                return false;
            }
            zContainsMatchIn2 = regexSafeRegex2.containsMatchIn(queueId.groupType);
        }
        if (!zContainsMatchIn || !zContainsMatchIn2) {
            return false;
        }
        return true;
    }

    public final StackSamplingConfig resolve$arm_release(QueueId queueId, StackTraceConfig stackTraceConfig) {
        if (stackTraceConfig == null) {
            return null;
        }
        List<StackSamplingConfig> list = stackTraceConfig.businessSampling;
        if (list.isEmpty()) {
            return stackTraceConfig.f48default;
        }
        for (StackSamplingConfig stackSamplingConfig : list) {
            Filter filter = stackSamplingConfig.filter;
            if (filter != null && matches(filter, queueId)) {
                return stackSamplingConfig;
            }
        }
        return stackTraceConfig.f48default;
    }

    public final WarnThresholdConfig resolve$arm_release(QueueId queueId, WarnConfig warnConfig) {
        if (warnConfig == null) {
            return null;
        }
        List<WarnThresholdConfig> list = warnConfig.businessThreshold;
        if (list.isEmpty()) {
            return warnConfig.defaultThreshold;
        }
        for (WarnThresholdConfig warnThresholdConfig : list) {
            Filter filter = warnThresholdConfig.filter;
            if (filter != null && matches(filter, queueId)) {
                return warnThresholdConfig;
            }
        }
        return warnConfig.defaultThreshold;
    }
}
