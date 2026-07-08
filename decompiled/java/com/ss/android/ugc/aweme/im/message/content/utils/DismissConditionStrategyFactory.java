package com.ss.android.ugc.aweme.im.message.content.utils;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DismissConditionStrategyFactory {
    public static final DismissConditionStrategyFactory INSTANCE = new DismissConditionStrategyFactory();
    public static final ConcurrentHashMap<String, DismissConditionStrategy> strategySet = new ConcurrentHashMap<>();

    public final DismissConditionStrategy getStrategy(String str) {
        DismissConditionStrategy dismissConditionStrategyPutIfAbsent;
        if (Intrinsics.LJFF(str, "dismiss_time")) {
            ConcurrentHashMap<String, DismissConditionStrategy> concurrentHashMap = strategySet;
            DismissConditionStrategy dismissTimeStrategy = concurrentHashMap.get("dismiss_time");
            if (dismissTimeStrategy == null && (dismissConditionStrategyPutIfAbsent = concurrentHashMap.putIfAbsent("dismiss_time", (dismissTimeStrategy = new DismissTimeStrategy()))) != null) {
                dismissTimeStrategy = dismissConditionStrategyPutIfAbsent;
            }
            return dismissTimeStrategy;
        }
        return strategySet.get(str);
    }

    public final void addStrategy(String str, DismissConditionStrategy dismissConditionStrategy) {
        strategySet.put(str, dismissConditionStrategy);
    }
}
