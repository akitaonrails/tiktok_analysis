package com.bytedance.sysoptimizer.anr;

import X.C1C7U;
import X.C2179971ATj;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.sysoptimizer.java.ReflectionUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes4.dex */
public class QueuedWorkOptimizer {
    public static IAsyncWorker sAsyncWorker;
    public static IErrorListener sErrorListener;

    public interface IAsyncWorker {
        void run(Runnable runnable);
    }

    public interface IErrorListener {
        void onError(Throwable th);
    }

    public interface IQueuedWorkOptimizerHandler {
        void optimize();
    }

    public static class ProxyConcurrentLinkedQueue<T> extends ConcurrentLinkedQueue<T> {
        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
        public boolean add(T t) {
            return true;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return true;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return true;
        }
    }

    public static class QueuedWorkCallback implements Handler.Callback {
        public static LinkedList<Runnable> sWork;
        public Handler.Callback originCallBack;
        public Handler queuedWorkHandler;

        private void processPendingWork() {
            LinkedList<Runnable> linkedList;
            if (this.queuedWorkHandler == null || (linkedList = sWork) == null) {
                return;
            }
            LinkedList linkedList2 = (LinkedList) linkedList.clone();
            sWork.clear();
            this.queuedWorkHandler.removeMessages(1);
            if (linkedList2.size() > 0) {
                Iterator it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                processPendingWork();
            }
            Handler.Callback callback = this.originCallBack;
            if (callback != null) {
                callback.handleMessage(message);
            }
            return true;
        }

        public QueuedWorkCallback(Handler handler, Handler.Callback callback, LinkedList<Runnable> linkedList) {
            this.queuedWorkHandler = handler;
            this.originCallBack = callback;
            sWork = linkedList;
        }
    }

    public static class QueuedWorkOptimizerAboveO implements IQueuedWorkOptimizerHandler {

        public static class MyRunnable implements Runnable {
            public final Runnable run;

            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("QueuedWorkOptimizer$QueuedWorkOptimizerAboveO$MyRunnable@48fd.run");
                com_bytedance_sysoptimizer_anr_QueuedWorkOptimizer$QueuedWorkOptimizerAboveO$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("QueuedWorkOptimizer$QueuedWorkOptimizerAboveO$MyRunnable@48fd.run");
            }

            public void com_bytedance_sysoptimizer_anr_QueuedWorkOptimizer$QueuedWorkOptimizerAboveO$MyRunnable__run$___twin___() {
                IAsyncWorker iAsyncWorker = QueuedWorkOptimizer.sAsyncWorker;
                if (iAsyncWorker != null) {
                    iAsyncWorker.run(this.run);
                }
            }

            public MyRunnable(Runnable runnable) {
                this.run = runnable;
            }

            public static void com_bytedance_sysoptimizer_anr_QueuedWorkOptimizer$QueuedWorkOptimizerAboveO$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
                try {
                    myRunnable.com_bytedance_sysoptimizer_anr_QueuedWorkOptimizer$QueuedWorkOptimizerAboveO$MyRunnable__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.bytedance.sysoptimizer.anr.QueuedWorkOptimizer.IQueuedWorkOptimizerHandler
        public void optimize() {
            try {
                Class<?> cls = Class.forName("android.app.QueuedWork");
                Field declaredField = cls.getDeclaredField("sFinishers");
                ReflectionUtils.removeFinal(declaredField);
                declaredField.setAccessible(true);
                declaredField.set(null, new EmptyLinkedList());
                if (QueuedWorkOptimizer.sAsyncWorker != null) {
                    Field declaredField2 = cls.getDeclaredField("sWork");
                    ReflectionUtils.removeFinal(declaredField2);
                    declaredField2.setAccessible(true);
                    declaredField2.set(null, new MyLinkedList());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                IErrorListener iErrorListener = QueuedWorkOptimizer.sErrorListener;
                if (iErrorListener != null) {
                    iErrorListener.onError(th);
                }
            }
        }

        public static class EmptyLinkedList<T> extends LinkedList<T> {
            @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
            public boolean add(T t) {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean isEmpty() {
                return true;
            }

            @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
            public boolean remove(Object obj) {
                return true;
            }

            @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
            public int size() {
                return 0;
            }

            public EmptyLinkedList() {
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public void clear() {
                super.clear();
            }
        }

        public static class MyLinkedList extends LinkedList<Runnable> {
            public MyLinkedList() {
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
            public boolean add(Runnable runnable) {
                return super.add(new MyRunnable(runnable));
            }
        }

        public QueuedWorkOptimizerAboveO() {
        }
    }

    public static class QueuedWorkOptimizerBelowO implements IQueuedWorkOptimizerHandler {
        @Override // com.bytedance.sysoptimizer.anr.QueuedWorkOptimizer.IQueuedWorkOptimizerHandler
        public void optimize() {
            try {
                Field declaredField = Class.forName("android.app.QueuedWork").getDeclaredField("sPendingWorkFinishers");
                declaredField.setAccessible(true);
                ReflectionUtils.removeFinal(declaredField);
                declaredField.set(null, new ProxyConcurrentLinkedQueue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                IErrorListener iErrorListener = QueuedWorkOptimizer.sErrorListener;
                if (iErrorListener != null) {
                    iErrorListener.onError(th);
                }
            }
        }

        public QueuedWorkOptimizerBelowO() {
        }
    }

    public static IQueuedWorkOptimizerHandler getOptimizer() {
        return Build.VERSION.SDK_INT < 26 ? new QueuedWorkOptimizerBelowO() : new QueuedWorkOptimizerAboveO();
    }

    public static void optimize() {
        if (Build.VERSION.SDK_INT >= 26) {
            takeOverQueuedWorkHandler();
            return;
        }
        IQueuedWorkOptimizerHandler optimizer = getOptimizer();
        if (optimizer != null) {
            optimizer.optimize();
        }
    }

    public static void takeOverQueuedWorkHandler() {
        try {
            Class<?> cls = Class.forName("android.app.QueuedWork");
            Handler handler = (Handler) ReflectionUtils.invokeStaticMethod(cls, "getHandler");
            LinkedList linkedList = (LinkedList) ReflectionUtils.getStaticFieldObject("sWork", cls);
            if (handler == null || linkedList == null) {
                return;
            }
            ReflectionUtils.setFieldObject(handler, "mCallback", new QueuedWorkCallback(handler, (Handler.Callback) ReflectionUtils.getFieldObject("android.os.Handler", "mCallback", handler), linkedList));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            IErrorListener iErrorListener = sErrorListener;
            if (iErrorListener != null) {
                iErrorListener.onError(th);
            }
        }
    }

    public static void injectAsyncWorker(IAsyncWorker iAsyncWorker) {
        sAsyncWorker = iAsyncWorker;
    }

    public static void setErrorListener(IErrorListener iErrorListener) {
        sErrorListener = iErrorListener;
    }
}
