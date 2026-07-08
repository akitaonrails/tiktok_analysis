package com.ss.android.ugc.aweme.plugin.retry;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.plugin.retry.NetworkRetryConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public class RetryStrategy {

    @C09CT("constant_delay")
    public static final RetryStrategy CONSTANT_DELAY;

    @C09CT("increasing_delay")
    public static final RetryStrategy INCREASING_DELAY;
    public static final /* synthetic */ RetryStrategy[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;

    @C09CT("no_retry")
    public static final RetryStrategy NO_RETRY;

    @C09CT("retry_no_delay")
    public static final RetryStrategy RETRY_NO_DELAY;
    public final boolean LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<RetryStrategy> getEntries() {
        return LLILZ;
    }

    public long getDelay(NetworkRetryConfig networkRetryConfig, int i) {
        return 0L;
    }

    static {
        RetryStrategy retryStrategy = new RetryStrategy("NO_RETRY", 0, false, false);
        NO_RETRY = retryStrategy;
        RetryStrategy retryStrategy2 = new RetryStrategy("RETRY_NO_DELAY", 1, false, true);
        RETRY_NO_DELAY = retryStrategy2;
        RetryStrategy retryStrategy3 = new RetryStrategy() { // from class: X.0pEZ
            @Override // com.ss.android.ugc.aweme.plugin.retry.RetryStrategy
            public final long getDelay(NetworkRetryConfig networkRetryConfig, int i) {
                if (networkRetryConfig.delayMs != null) {
                    return r0.intValue();
                }
                return 0L;
            }
        };
        CONSTANT_DELAY = retryStrategy3;
        RetryStrategy retryStrategy4 = new RetryStrategy() { // from class: X.0pEY
            @Override // com.ss.android.ugc.aweme.plugin.retry.RetryStrategy
            public final long getDelay(NetworkRetryConfig networkRetryConfig, int i) {
                int iIntValue;
                if (i >= 1 && i <= 31) {
                    Integer num = networkRetryConfig.delayMs;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    return iIntValue * (1 << (i - 1));
                }
                throw new IllegalArgumentException("attempt has to be 1..31");
            }
        };
        INCREASING_DELAY = retryStrategy4;
        RetryStrategy[] retryStrategyArr = {retryStrategy, retryStrategy2, retryStrategy3, retryStrategy4};
        LLILLL = retryStrategyArr;
        LLILZ = new C2254308sP(retryStrategyArr);
    }

    public static RetryStrategy[] values() {
        return (RetryStrategy[]) LLILLL.clone();
    }

    public final boolean getDelay() {
        return this.LL;
    }

    public final boolean getRetry() {
        return this.LLILLJJLI;
    }

    public static RetryStrategy valueOf(String str) {
        return (RetryStrategy) C08FF.LIZ(RetryStrategy.class, str);
    }

    public RetryStrategy(String str, int i, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
