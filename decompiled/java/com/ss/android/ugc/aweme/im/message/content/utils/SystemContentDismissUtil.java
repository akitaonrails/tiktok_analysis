package com.ss.android.ugc.aweme.im.message.content.utils;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemContentDismissUtil {
    public static final SystemContentDismissUtil INSTANCE = new SystemContentDismissUtil();

    public final boolean shouldDismiss(SystemContentDismissContext systemContentDismissContext, List<? extends Map<String, String>> list) {
        Object c098200Yq;
        DismissConditionStrategy strategy;
        try {
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                loop0: for (Map<String, String> map : list) {
                    if (map != null) {
                        if (!map.isEmpty()) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                Boolean boolValueOf = null;
                                if (key != null) {
                                    strategy = DismissConditionStrategyFactory.INSTANCE.getStrategy(key);
                                } else {
                                    strategy = null;
                                }
                                if (value == null) {
                                    break;
                                }
                                if (strategy != null) {
                                    boolValueOf = Boolean.valueOf(strategy.shouldDismiss(value, systemContentDismissContext));
                                }
                                if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        break;
                    }
                }
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
