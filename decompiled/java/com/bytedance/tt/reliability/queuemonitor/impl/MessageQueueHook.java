package com.bytedance.tt.reliability.queuemonitor.impl;

import X.C2110908Ot;
import X.C2111008Ou;
import android.os.Handler;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class MessageQueueHook {
    public static final ThreadLocal<Boolean> GUARD = new ThreadLocal<>();

    public boolean post(Runnable runnable) {
        int i = C2111008Ou.LIZ;
        if (MQCollector.shouldTrack((Handler) new Object())) {
            try {
                ThreadLocal<Boolean> threadLocal = GUARD;
                threadLocal.set(Boolean.TRUE);
                MQCollector.onPostMessage((Handler) new Object(), runnable);
                threadLocal.remove();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                GUARD.remove();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                GUARD.remove();
                throw th;
            }
        }
        int i2 = C2110908Ot.LIZ;
        return ((Boolean) new Object()).booleanValue();
    }

    public boolean postAtFrontOfQueue(Runnable runnable) {
        int i = C2111008Ou.LIZ;
        if (MQCollector.shouldTrack((Handler) new Object())) {
            try {
                ThreadLocal<Boolean> threadLocal = GUARD;
                threadLocal.set(Boolean.TRUE);
                MQCollector.onPostMessage((Handler) new Object(), runnable);
                threadLocal.remove();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                GUARD.remove();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                GUARD.remove();
                throw th;
            }
        }
        int i2 = C2110908Ot.LIZ;
        return ((Boolean) new Object()).booleanValue();
    }

    public boolean sendEmptyMessage(int i) {
        ThreadLocal<Boolean> threadLocal;
        int i2 = C2111008Ou.LIZ;
        if (MQCollector.shouldTrack((Handler) new Object())) {
            try {
                threadLocal = GUARD;
                threadLocal.set(Boolean.TRUE);
                MQCollector.onMessage((Handler) new Object(), null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                threadLocal = GUARD;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                GUARD.remove();
                throw th;
            }
            threadLocal.remove();
        }
        int i3 = C2110908Ot.LIZ;
        return ((Boolean) new Object()).booleanValue();
    }

    public boolean sendMessage(Message message) {
        int i = C2111008Ou.LIZ;
        if (MQCollector.shouldTrack((Handler) new Object())) {
            try {
                ThreadLocal<Boolean> threadLocal = GUARD;
                threadLocal.set(Boolean.TRUE);
                MQCollector.onMessage((Handler) new Object(), message);
                threadLocal.remove();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                GUARD.remove();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                GUARD.remove();
                throw th;
            }
        }
        int i2 = C2110908Ot.LIZ;
        return ((Boolean) new Object()).booleanValue();
    }

    public boolean sendMessageAtFrontOfQueue(Message message) {
        int i = C2111008Ou.LIZ;
        if (MQCollector.shouldTrack((Handler) new Object()) && GUARD.get() == null) {
            MQCollector.onMessage((Handler) new Object(), message);
        }
        int i2 = C2110908Ot.LIZ;
        return ((Boolean) new Object()).booleanValue();
    }

    public boolean postAtTime(Runnable runnable, long j) {
        int i = C2111008Ou.LIZ;
        try {
            if (MQCollector.shouldTrack((Handler) new Object())) {
                try {
                    ThreadLocal<Boolean> threadLocal = GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage((Handler) new Object(), runnable);
                    threadLocal.remove();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    GUARD.remove();
                }
            }
            int i2 = C2110908Ot.LIZ;
            return ((Boolean) new Object()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            GUARD.remove();
            throw th;
        }
    }

    public boolean postDelayed(Runnable runnable, long j) {
        int i = C2111008Ou.LIZ;
        try {
            if (MQCollector.shouldTrack((Handler) new Object())) {
                try {
                    ThreadLocal<Boolean> threadLocal = GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage((Handler) new Object(), runnable);
                    threadLocal.remove();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    GUARD.remove();
                }
            }
            int i2 = C2110908Ot.LIZ;
            return ((Boolean) new Object()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            GUARD.remove();
            throw th;
        }
    }

    public boolean sendEmptyMessageAtTime(int i, long j) {
        ThreadLocal<Boolean> threadLocal;
        int i2 = C2111008Ou.LIZ;
        try {
            if (MQCollector.shouldTrack((Handler) new Object())) {
                try {
                    threadLocal = GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onMessage((Handler) new Object(), null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    threadLocal = GUARD;
                }
                threadLocal.remove();
            }
            int i3 = C2110908Ot.LIZ;
            return ((Boolean) new Object()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            GUARD.remove();
            throw th;
        }
    }

    public boolean sendEmptyMessageDelayed(int i, long j) {
        int i2 = C2111008Ou.LIZ;
        if (MQCollector.shouldTrack((Handler) new Object()) && GUARD.get() == null) {
            MQCollector.onMessage((Handler) new Object(), null);
        }
        int i3 = C2110908Ot.LIZ;
        return ((Boolean) new Object()).booleanValue();
    }

    public boolean sendMessageAtTime(Message message, long j) {
        int i = C2111008Ou.LIZ;
        if (MQCollector.shouldTrack((Handler) new Object()) && GUARD.get() == null) {
            MQCollector.onMessage((Handler) new Object(), message);
        }
        int i2 = C2110908Ot.LIZ;
        return ((Boolean) new Object()).booleanValue();
    }

    public boolean sendMessageDelayed(Message message, long j) {
        int i = C2111008Ou.LIZ;
        if (MQCollector.shouldTrack((Handler) new Object()) && GUARD.get() == null) {
            MQCollector.onMessage((Handler) new Object(), message);
        }
        int i2 = C2110908Ot.LIZ;
        return ((Boolean) new Object()).booleanValue();
    }

    public boolean postAtTime(Runnable runnable, Object obj, long j) {
        int i = C2111008Ou.LIZ;
        try {
            if (MQCollector.shouldTrack((Handler) new Object())) {
                try {
                    ThreadLocal<Boolean> threadLocal = GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage((Handler) new Object(), runnable);
                    threadLocal.remove();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    GUARD.remove();
                }
            }
            int i2 = C2110908Ot.LIZ;
            return ((Boolean) new Object()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            GUARD.remove();
            throw th;
        }
    }

    public boolean postDelayed(Runnable runnable, int i, long j) {
        int i2 = C2111008Ou.LIZ;
        try {
            if (MQCollector.shouldTrack((Handler) new Object())) {
                try {
                    ThreadLocal<Boolean> threadLocal = GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage((Handler) new Object(), runnable);
                    threadLocal.remove();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    GUARD.remove();
                }
            }
            int i3 = C2110908Ot.LIZ;
            return ((Boolean) new Object()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            GUARD.remove();
            throw th;
        }
    }

    public boolean postDelayed(Runnable runnable, Object obj, long j) {
        int i = C2111008Ou.LIZ;
        try {
            if (MQCollector.shouldTrack((Handler) new Object())) {
                try {
                    ThreadLocal<Boolean> threadLocal = GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage((Handler) new Object(), runnable);
                    threadLocal.remove();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    GUARD.remove();
                }
            }
            int i2 = C2110908Ot.LIZ;
            return ((Boolean) new Object()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            GUARD.remove();
            throw th;
        }
    }
}
