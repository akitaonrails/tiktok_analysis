package com.sun.jna.internal;

import X.C0W9U;
import X.C1C7U;
import X.C2179971ATj;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes31.dex */
public class Cleaner {
    public static final Cleaner INSTANCE = new Cleaner();
    public Thread cleanerThread;
    public CleanerRef firstCleanable;
    public final ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();

    public interface Cleanable {
        void clean();
    }

    public static class CleanerRef extends PhantomReference<Object> implements Cleanable {
        public final Cleaner cleaner;
        public final Runnable cleanupTask;
        public CleanerRef next;
        public CleanerRef previous;

        @Override // com.sun.jna.internal.Cleaner.Cleanable
        public void clean() {
            if (this.cleaner.remove(this)) {
                this.cleanupTask.run();
            }
        }

        public CleanerRef getNext() {
            return this.next;
        }

        public CleanerRef getPrevious() {
            return this.previous;
        }

        public void setNext(CleanerRef cleanerRef) {
            this.next = cleanerRef;
        }

        public void setPrevious(CleanerRef cleanerRef) {
            this.previous = cleanerRef;
        }

        public CleanerRef(Cleaner cleaner, Object obj, ReferenceQueue<? super Object> referenceQueue, Runnable runnable) {
            super(obj, referenceQueue);
            this.cleaner = cleaner;
            this.cleanupTask = runnable;
        }
    }

    public class CleanerThread extends BPEAThread {
        private void bpea_origin_run() {
            com_sun_jna_internal_Cleaner$CleanerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_sun_jna_internal_Cleaner$CleanerThread__run$___twin___() {
            while (true) {
                try {
                    Reference<? extends Object> referenceRemove = Cleaner.this.referenceQueue.remove(30000L);
                    if (referenceRemove instanceof CleanerRef) {
                        ((CleanerRef) referenceRemove).clean();
                    } else if (referenceRemove == null) {
                        synchronized (Cleaner.this.referenceQueue) {
                            try {
                                Logger logger = Logger.getLogger(Cleaner.class.getName());
                                Cleaner cleaner = Cleaner.this;
                                if (cleaner.firstCleanable == null) {
                                    cleaner.cleanerThread = null;
                                    logger.log(Level.FINE, "Shutting down CleanerThread");
                                    return;
                                } else if (logger.isLoggable(Level.FINER)) {
                                    StringBuilder sb = new StringBuilder();
                                    for (CleanerRef cleanerRef = Cleaner.this.firstCleanable; cleanerRef != null; cleanerRef = cleanerRef.next) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(cleanerRef.cleanupTask.toString());
                                    }
                                    logger.log(Level.FINER, "Registered Cleaners: {0}", sb.toString());
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    Logger.getLogger(Cleaner.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e2);
                }
            }
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            C1C7U.LIZ("Cleaner$CleanerThread@b04f.run");
            boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
            try {
                com_sun_jna_internal_Cleaner$CleanerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("Cleaner$CleanerThread@b04f.run");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        public CleanerThread() {
            super("JNA Cleaner");
            setDaemon(true);
        }

        public static void com_sun_jna_internal_Cleaner$CleanerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CleanerThread cleanerThread) {
            try {
                cleanerThread.com_sun_jna_internal_Cleaner$CleanerThread__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public static Cleaner getCleaner() {
        return INSTANCE;
    }

    private synchronized CleanerRef add(CleanerRef cleanerRef) {
        synchronized (this.referenceQueue) {
            try {
                CleanerRef cleanerRef2 = this.firstCleanable;
                if (cleanerRef2 == null) {
                    this.firstCleanable = cleanerRef;
                } else {
                    cleanerRef.setNext(cleanerRef2);
                    this.firstCleanable.setPrevious(cleanerRef);
                    this.firstCleanable = cleanerRef;
                }
                if (this.cleanerThread == null) {
                    Logger.getLogger(Cleaner.class.getName()).log(Level.FINE, "Starting CleanerThread");
                    CleanerThread cleanerThread = new CleanerThread();
                    this.cleanerThread = cleanerThread;
                    cleanerThread.start();
                }
            } finally {
            }
        }
        return cleanerRef;
    }

    public synchronized boolean remove(CleanerRef cleanerRef) {
        boolean z;
        boolean z2;
        synchronized (this.referenceQueue) {
            try {
                z = true;
                if (cleanerRef == this.firstCleanable) {
                    this.firstCleanable = cleanerRef.getNext();
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cleanerRef.getPrevious() != null) {
                    cleanerRef.getPrevious().setNext(cleanerRef.getNext());
                }
                if (cleanerRef.getNext() != null) {
                    cleanerRef.getNext().setPrevious(cleanerRef.getPrevious());
                }
                if (cleanerRef.getPrevious() == null && cleanerRef.getNext() == null) {
                    z = z2;
                }
                cleanerRef.setNext(null);
                cleanerRef.setPrevious(null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public synchronized Cleanable register(Object obj, Runnable runnable) {
        CleanerRef cleanerRef;
        cleanerRef = new CleanerRef(this, obj, this.referenceQueue, runnable);
        add(cleanerRef);
        return cleanerRef;
    }
}
