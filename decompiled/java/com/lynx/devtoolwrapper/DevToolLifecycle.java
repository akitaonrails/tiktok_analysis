package com.lynx.devtoolwrapper;

import X.C2188811AlT;
import X.EnumC1310030kC9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;

/* JADX INFO: loaded from: classes21.dex */
public class DevToolLifecycle {
    public static volatile DevToolLifecycle LIZIZ;
    public volatile EnumC1310030kC9 LIZ = EnumC1310030kC9.UNAVAILABLE;

    private native void nativeSyncStateToNative(int i);

    public final synchronized void LIZJ() {
        if (this.LIZ == EnumC1310030kC9.ATTACHED) {
            LynxLog.i("DevToolLifecycle", "DevTool enabled. Transitioning to ENABLED.");
            this.LIZ = EnumC1310030kC9.ENABLED;
            LIZLLL();
        } else if (this.LIZ == EnumC1310030kC9.UNAVAILABLE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot enable DevTool because it is ");
            sbLIZ.append(this.LIZ);
            LynxLog.w("DevToolLifecycle", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onEnabled() called but state is ");
            sbLIZ2.append(this.LIZ);
            LynxLog.d("DevToolLifecycle", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized void LIZLLL() throws Throwable {
        try {
            try {
            } catch (UnsatisfiedLinkError e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            nativeSyncStateToNative(this.LIZ.ordinal());
        } catch (UnsatisfiedLinkError e3) {
            e = e3;
            try {
                TryCatchGuardChecker.doCheck(e);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    try {
                        sbLIZ.append("UnsatisfiedLinkError! Trying to sync state [");
                        try {
                            try {
                                sbLIZ.append(this.LIZ);
                                try {
                                    sbLIZ.append("] before native library is loaded.");
                                    try {
                                        try {
                                            LynxLog.w("DevToolLifecycle", C2188811AlT.LIZIZ(sbLIZ));
                                        } catch (Throwable th3) {
                                            th = th3;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            throw th;
        }
    }

    public static DevToolLifecycle LIZ() {
        if (LIZIZ == null) {
            synchronized (DevToolLifecycle.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new DevToolLifecycle();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final boolean LIZIZ() {
        return this.LIZ.ordinal() >= EnumC1310030kC9.ENABLED.ordinal();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:62:0x0062
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static synchronized void syncStateFromNative(int r6) {
        /*
            java.lang.Class<com.lynx.devtoolwrapper.DevToolLifecycle> r5 = com.lynx.devtoolwrapper.DevToolLifecycle.class
            monitor-enter(r5)
            com.lynx.devtoolwrapper.DevToolLifecycle r4 = LIZ()     // Catch: java.lang.Throwable -> L68
            X.0kC9[] r0 = X.EnumC1310030kC9.values()     // Catch: java.lang.Throwable -> L51 java.lang.ArrayIndexOutOfBoundsException -> L53
            r3 = r0[r6]     // Catch: java.lang.Throwable -> L4d java.lang.ArrayIndexOutOfBoundsException -> L4f
            X.0kC9 r0 = r4.LIZ     // Catch: java.lang.Throwable -> L4b
            if (r0 == r3) goto L49
            java.lang.String r2 = "DevToolLifecycle"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "SyncStateFromNative: Transitioning from "
            r1.append(r0)     // Catch: java.lang.Throwable -> L41
            X.0kC9 r0 = r4.LIZ     // Catch: java.lang.Throwable -> L3f
            r1.append(r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch: java.lang.Throwable -> L39
            r1.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L35
            com.lynx.base.log.LynxLog.i(r2, r0)     // Catch: java.lang.Throwable -> L6a
            r4.LIZ = r3     // Catch: java.lang.Throwable -> L33
            goto L49
        L33:
            r0 = move-exception
            goto L6b
        L35:
            r0 = move-exception
            goto L6b
        L37:
            r0 = move-exception
            goto L6b
        L39:
            r0 = move-exception
            goto L6b
        L3b:
            r0 = move-exception
            goto L6b
        L3d:
            r0 = move-exception
            goto L6b
        L3f:
            r0 = move-exception
            goto L6b
        L41:
            r0 = move-exception
            goto L6b
        L43:
            r0 = move-exception
            goto L6b
        L45:
            r0 = move-exception
            goto L6b
        L47:
            r0 = move-exception
            goto L6b
        L49:
            monitor-exit(r5)
            return
        L4b:
            r0 = move-exception
            goto L6b
        L4d:
            r0 = move-exception
            goto L6b
        L4f:
            r0 = move-exception
            goto L54
        L51:
            r0 = move-exception
            goto L6b
        L53:
            r0 = move-exception
        L54:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "DevToolLifecycle"
            java.lang.String r0 = "Invalid value during state sync. The definition of states in Android platform and native are not identical"
            com.lynx.base.log.LynxLog.e(r1, r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r5)
            return
        L60:
            r0 = move-exception
            goto L6b
        L62:
            r0 = move-exception
            goto L6b
        L64:
            r0 = move-exception
            goto L6b
        L66:
            r0 = move-exception
            goto L6b
        L68:
            r0 = move-exception
            goto L6b
        L6a:
            r0 = move-exception
        L6b:
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.devtoolwrapper.DevToolLifecycle.syncStateFromNative(int):void");
    }
}
