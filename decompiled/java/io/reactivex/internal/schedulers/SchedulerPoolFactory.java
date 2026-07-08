package io.reactivex.internal.schedulers;

import X.C09GN;
import X.C807400Vlq;
import X.ThreadFactoryC1301810jyt;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    public static final int PURGE_PERIOD_SECONDS;
    public static final AtomicReference<ScheduledExecutorService> PURGE_THREAD = new AtomicReference<>();
    public static final Map<ScheduledThreadPoolExecutor, Object> POOLS = new ConcurrentHashMap();

    static {
        Properties properties = System.getProperties();
        C09GN c09gn = new C09GN();
        if (properties.containsKey("rx2.purge-enabled")) {
            c09gn.LIZ = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
        } else {
            c09gn.LIZ = true;
        }
        if (c09gn.LIZ && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                c09gn.LIZIZ = CastIntegerProtector.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                c09gn.LIZIZ = 1;
            }
        } else {
            c09gn.LIZIZ = 1;
        }
        PURGE_ENABLED = c09gn.LIZ;
        PURGE_PERIOD_SECONDS = c09gn.LIZIZ;
        start();
    }

    public static void shutdown() {
        ScheduledExecutorService andSet = PURGE_THREAD.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        POOLS.clear();
    }

    public static void start() {
        tryStart(PURGE_ENABLED);
    }

    public SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceLIZIZ = C807400Vlq.LIZIZ(threadFactory);
        tryPutIntoPool(PURGE_ENABLED, scheduledExecutorServiceLIZIZ);
        return scheduledExecutorServiceLIZIZ;
    }

    public static void tryStart(boolean z) {
        ScheduledExecutorService scheduledExecutorServiceLIZIZ;
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = PURGE_THREAD;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            scheduledExecutorServiceLIZIZ = C807400Vlq.LIZIZ(new ThreadFactoryC1301810jyt("RxSchedulerPurge"));
            while (!atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceLIZIZ)) {
                if (atomicReference.get() != scheduledExecutorService) {
                    break;
                }
            }
            Runnable runnable = new Runnable() { // from class: X.08Kj
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    try {
                        for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(SchedulerPoolFactory.POOLS.keySet())) {
                            if (scheduledThreadPoolExecutor.isShutdown()) {
                                SchedulerPoolFactory.POOLS.remove(scheduledThreadPoolExecutor);
                            } else {
                                scheduledThreadPoolExecutor.purge();
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                }
            };
            long j = PURGE_PERIOD_SECONDS;
            scheduledExecutorServiceLIZIZ.scheduleAtFixedRate(runnable, j, j, TimeUnit.SECONDS);
            return;
            scheduledExecutorServiceLIZIZ.shutdownNow();
        }
    }

    public static void tryPutIntoPool(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            POOLS.put(scheduledExecutorService, scheduledExecutorService);
        }
    }
}
