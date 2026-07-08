package com.bytedance.sysoptimizer;

import X.C786410Ut5;
import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class JemallocAllocatorOptimizer {
    public static native boolean do_arena_chunk_hooks();

    public static native boolean do_arena_decay();

    public static native int do_arena_decay_time(long j);

    public static native boolean do_arena_destroy();

    public static native int do_arena_dirty_decay_ms(long j);

    public static native int do_arena_dss(String str);

    public static native boolean do_arena_extent_hooks();

    public static native int do_arena_lg_dirty_mult(long j);

    public static native int do_arena_muzzy_decay_ms(long j);

    public static native boolean do_arena_purge();

    public static native boolean do_arena_reset();

    public static native int do_arena_retain_grow_limit(long j);

    public static native int do_arenas_decay_time(long j);

    public static native int do_arenas_dirty_decay_ms(long j);

    public static native int do_arenas_lg_dirty_mult(long j);

    public static native int do_arenas_muzzy_decay_ms(long j);

    public static native boolean do_arenas_purge();

    public static native String do_get_arena_dss();

    public static native boolean do_get_boolean_option_value(String str);

    public static native int do_get_integer_option_value(String str);

    public static native boolean do_opt_retain(boolean z);

    public static native int do_tcache_create();

    public static native boolean do_tcache_destroy(int i);

    public static native boolean do_tcache_flush();

    public static native boolean do_thread_arena(int i);

    public static native int do_thread_tcache_enabled(boolean z);

    public static native boolean do_thread_tcache_flush();

    public static synchronized void getJemallocOptions(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            C786410Ut5.j4("raw thread.arena is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("thread.arena"))});
            C786410Ut5.j4("thread.tcache.enabled is %b\n", new Object[]{Boolean.valueOf(do_get_boolean_option_value("thread.tcache.enabled"))});
            C786410Ut5.j4("arenas.narenas is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arenas.narenas"))});
            C786410Ut5.j4("arena.<i>.lg_dirty_mult is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arena.0.lg_dirty_mult"))});
            C786410Ut5.j4("arena.<i>.decay_time is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arena.0.decay_time"))});
            C786410Ut5.j4("arena.<i>.dirty_decay_ms is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arena.0.dirty_decay_ms"))});
            C786410Ut5.j4("arena.<i>.muzzy_decay_ms is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arena.0.muzzy_decay_ms"))});
            C786410Ut5.j4("arena.<i>.retain_grow_limit is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arena.0.retain_grow_limit"))});
            C786410Ut5.j4("arenas.lg_dirty_mult is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arenas.lg_dirty_mult"))});
            C786410Ut5.j4("arenas.decay_time is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arenas.decay_time"))});
            C786410Ut5.j4("arenas.dirty_decay_ms is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arenas.dirty_decay_ms"))});
            C786410Ut5.j4("arenas.muzzy_decay_ms is %d\n", new Object[]{Integer.valueOf(do_get_integer_option_value("arenas.muzzy_decay_ms"))});
        }
    }

    public static synchronized void setJemallocOptions(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            do_thread_arena(0);
            if (do_thread_tcache_enabled(true) == 0) {
                do_thread_tcache_enabled(false);
            }
            do_thread_tcache_flush();
            int iDo_tcache_create = do_tcache_create();
            do_tcache_flush();
            if (iDo_tcache_create == 0) {
                do_tcache_destroy(iDo_tcache_create);
            }
            do_arena_decay();
            do_arena_purge();
            do_arena_destroy();
            C786410Ut5.j4("get jemalloc arena.<i>.dss, result: %s\n", new Object[]{do_get_arena_dss()});
            do_arena_dss("secondary");
            do_arena_lg_dirty_mult(1000L);
            do_arena_decay_time(1000L);
            do_arena_dirty_decay_ms(1000L);
            do_arena_muzzy_decay_ms(1000L);
            do_arena_retain_grow_limit(1048576L);
            do_arena_extent_hooks();
            do_arena_chunk_hooks();
            do_arenas_lg_dirty_mult(1000L);
            do_arenas_decay_time(1000L);
            do_arenas_dirty_decay_ms(1000L);
            do_arenas_muzzy_decay_ms(1000L);
            do_arenas_purge();
        }
    }

    public static JemallocSettingResult doJemallocArenaDecayTime(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arena.<i>.decay_time(ssize_t)", String.valueOf(do_get_integer_option_value("arena.0.decay_time")), String.valueOf(i), do_arena_decay_time(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arena.<i>.decay_time(ssize_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocArenaDirtyDecayMs(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arena.<i>.dirty_decay_ms(ssize_t)", String.valueOf(do_get_integer_option_value("arena.0.dirty_decay_ms")), String.valueOf(i), do_arena_dirty_decay_ms(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arena.<i>.dirty_decay_ms(ssize_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocArenaDss(Context context, String str) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arena.<i>.dss(const char*)", do_get_arena_dss(), str, do_arena_dss(str));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arena.<i>.dss(const char*)", "", str, -1);
    }

    public static JemallocSettingResult doJemallocArenaLgDirtyMult(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arena.<i>.lg_dirty_mult(ssize_t)", String.valueOf(do_get_integer_option_value("arena.0.lg_dirty_mult")), String.valueOf(i), do_arena_lg_dirty_mult(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arena.<i>.lg_dirty_mult(ssize_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocArenaMuzzyDecayMs(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arena.<i>.muzzy_decay_ms(ssize_t)", String.valueOf(do_get_integer_option_value("arena.0.muzzy_decay_ms")), String.valueOf(i), do_arena_muzzy_decay_ms(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arena.<i>.muzzy_decay_ms(ssize_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocArenaRetainGrowLimit(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arena.<i>.retain_grow_limit(size_t)", String.valueOf(do_get_integer_option_value("arena.0.retain_grow_limit")), String.valueOf(i), do_arena_retain_grow_limit(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arena.<i>.retain_grow_limit(size_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocArenasDecayTime(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arenas.decay_time(ssize_t)", String.valueOf(do_get_integer_option_value("arenas.decay_time")), String.valueOf(i), do_arenas_decay_time(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arenas.decay_time(ssize_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocArenasDirtyDecayMs(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arenas.dirty_decay_ms(ssize_t)", String.valueOf(do_get_integer_option_value("arenas.dirty_decay_ms")), String.valueOf(i), do_arenas_dirty_decay_ms(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arenas.dirty_decay_ms(ssize_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocArenasLgDirtyMult(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arenas.lg_dirty_mult(ssize_t)", String.valueOf(do_get_integer_option_value("arenas.lg_dirty_mult")), String.valueOf(i), do_arenas_lg_dirty_mult(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arenas.lg_dirty_mult(ssize_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocArenasMuzzyDecayMs(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                return new JemallocSettingResult("arenas.muzzy_decay_ms(ssize_t)", String.valueOf(do_get_integer_option_value("arenas.muzzy_decay_ms")), String.valueOf(i), do_arenas_muzzy_decay_ms(i));
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("arenas.muzzy_decay_ms(ssize_t)", "", String.valueOf(i), -1);
    }

    public static JemallocSettingResult doJemallocThreadTcacheEnabled(Context context, boolean z) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                boolean zDo_get_boolean_option_value = do_get_boolean_option_value("thread.tcache.enabled");
                do_thread_tcache_enabled(z);
                return new JemallocSettingResult("thread.tcache.enabled(bool)", String.valueOf(zDo_get_boolean_option_value), String.valueOf(z), 0);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new JemallocSettingResult("thread.tcache.enabled", "", String.valueOf(z), -1);
    }
}
