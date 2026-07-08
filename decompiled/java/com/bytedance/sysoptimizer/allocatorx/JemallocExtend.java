package com.bytedance.sysoptimizer.allocatorx;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class JemallocExtend {
    public static native boolean art_extend_arena(int i);

    public static native boolean extend_arena();

    public static native boolean extend_arena_specific(String str, int i);

    public static native boolean extend_arena_specific_2(String str, int i);

    public static native boolean extend_multi_arena_to_auto(int i, int i2);

    public static native String get_jemalloc_stats();

    public static native boolean hwui_purge_control(int i);

    public static native boolean other_core_libs_extend_arena(int i);

    public static native boolean player_lib_extend_arena(int i);

    public static native boolean renderthread_extend_arena();

    public static boolean extendArena(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!extend_arena()) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static String getJemallocStats(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return get_jemalloc_stats();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
        return null;
    }

    public static boolean renderThreadExtendArena(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!renderthread_extend_arena()) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static boolean artThreadExtendArena(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!art_extend_arena(i)) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static boolean hwuiPurgeCtl(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!hwui_purge_control(i)) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static boolean otherCoreLibsExtendArena(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!other_core_libs_extend_arena(i)) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static boolean playerExtendArena(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!player_lib_extend_arena(i)) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static boolean extendArenaSpecific(Context context, String str, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!extend_arena_specific(str, i)) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static boolean extendArenaSpecific2(Context context, String str, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!extend_arena_specific_2(str, i)) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static boolean extendMultiArenaToAuto(Context context, int i, int i2) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (!extend_multi_arena_to_auto(i, i2)) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }
}
