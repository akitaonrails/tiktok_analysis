package com.ss.android.ugc.aweme.memory.profiler.core;

import X.C0VSJ;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Debug;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryDumpReceiver extends BroadcastReceiver {
    public static volatile boolean registered;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public static final class Companion {
        public final synchronized void register(Context context) {
            if (MemoryDumpReceiver.registered) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 24) {
                return;
            }
            MemoryDumpReceiver memoryDumpReceiver = new MemoryDumpReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("snapmemory.profiler.action.hprof");
            intentFilter.addAction("snapmemory.profiler.action.smaps");
            Context contextN3 = C786410Ut5.N3(context);
            if (i >= 33) {
                C786410Ut5.LJIJJLI(contextN3, memoryDumpReceiver, intentFilter, 2);
            } else {
                C786410Ut5.LJIJJ(contextN3, memoryDumpReceiver, intentFilter);
            }
            MemoryDumpReceiver.registered = true;
        }
    }

    public final String dumpHprof(File file) throws IOException {
        C0VSJ c0vsj = new C0VSJ(file, "snapmemory_cli.hprof");
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        Debug.dumpHprofData(c0vsj.getAbsolutePath());
        return c0vsj.getAbsolutePath();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x004b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final java.lang.String dumpSmaps(java.io.File r7) {
        /*
            r6 = this;
            X.0VSJ r5 = new X.0VSJ
            java.lang.String r0 = "snapmemory_cli_smaps.txt"
            r5.<init>(r7, r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L10
            r5.delete()
        L10:
            X.0VSP r4 = new X.0VSP
            X.0VSJ r1 = new X.0VSJ
            java.lang.String r0 = "/proc/self/smaps"
            r1.<init>(r0)
            r4.<init>(r1)
            r3 = 0
            X.0VSV r2 = new X.0VSV     // Catch: java.lang.Throwable -> L43
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L43
            X.C2106208My.LIZ(r4, r2)     // Catch: java.lang.Throwable -> L30
            X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Throwable -> L43
            X.C2107108Nh.LIZ(r4, r3)
            java.lang.String r0 = r5.getAbsolutePath()
            return r0
        L30:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            goto L39
        L37:
            r0 = move-exception
            r1 = r3
        L39:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L39
        L3f:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        L43:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L4b
            throw r1     // Catch: java.lang.Throwable -> L48
        L48:
            r0 = move-exception
            r3 = r1
            goto L4c
        L4b:
            r0 = move-exception
        L4c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4b
            X.C2107108Nh.LIZ(r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.memory.profiler.core.MemoryDumpReceiver.dumpSmaps(java.io.File):java.lang.String");
    }

    public void com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver__onReceive$___twin___(Context context, Intent intent) {
        final String action;
        if (intent != null && (action = intent.getAction()) != null) {
            if (!Intrinsics.LJFF(action, "snapmemory.profiler.action.hprof") && !Intrinsics.LJFF(action, "snapmemory.profiler.action.smaps")) {
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final File fileY2 = C786410Ut5.y2(C786410Ut5.N3(context), "hprof");
            if (fileY2 == null) {
                pendingResultGoAsync.setResultCode(1);
                pendingResultGoAsync.setResultData("getExternalFilesDir(\"hprof\") returned null");
                pendingResultGoAsync.finish();
            } else {
                fileY2.mkdirs();
                new BPEAThread(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.core.MemoryDumpReceiver.onReceive.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("MemoryDumpReceiver@432a.onReceive$1");
                        com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver$onReceive$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("MemoryDumpReceiver@432a.onReceive$1");
                    }

                    public final void com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver$onReceive$1__run$___twin___() {
                        try {
                            try {
                                String strDumpHprof = Intrinsics.LJFF(action, "snapmemory.profiler.action.hprof") ? this.dumpHprof(fileY2) : this.dumpSmaps(fileY2);
                                pendingResultGoAsync.setResultCode(0);
                                pendingResultGoAsync.setResultData(strDumpHprof);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                pendingResultGoAsync.setResultCode(1);
                                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(e.getClass().getSimpleName());
                                sbLIZ.append(": ");
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                sbLIZ.append(message);
                                pendingResult.setResultData(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            pendingResultGoAsync.finish();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            pendingResultGoAsync.finish();
                            throw th;
                        }
                    }

                    public static void com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver$onReceive$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        try {
                            anonymousClass1.com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver$onReceive$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                }).start();
            }
        }
    }

    public static void com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(MemoryDumpReceiver memoryDumpReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            memoryDumpReceiver.com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            memoryDumpReceiver.com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(MemoryDumpReceiver memoryDumpReceiver, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        com_ss_android_ugc_aweme_memory_profiler_core_MemoryDumpReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(memoryDumpReceiver, context, intent);
    }
}
