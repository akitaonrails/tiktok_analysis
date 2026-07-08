package com.bytedance.frameworks.baselib.network.dispatcher;

import X.AbstractRunnableC1490650otT;
import X.AbstractRunnableC1490660otU;
import X.C1490590otN;
import X.C1490600otO;
import X.C1490630otR;
import X.C1494570ozn;
import X.C2188811AlT;
import X.C822650WOx;
import X.EnumC1490640otS;
import X.InterfaceRunnableC1490390ot3;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes24.dex */
public class NetThreadPoolManager implements WeakHandler.IHandler {
    public volatile ThreadPoolExecutor mExecutorDownload;
    public volatile ThreadPoolExecutor mExecutorImmediate;
    public volatile ThreadPoolExecutor mExecutorLocal;
    public volatile ThreadPoolExecutor mExecutorLowest;
    public volatile ThreadPoolExecutor mExecutorNormal;
    public WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    public static AtomicInteger mSequenceGenerator = new AtomicInteger();
    public static NetThreadPoolManager INSTANCE = new NetThreadPoolManager();

    private ExecutorService executorDownloadService() {
        if (this.mExecutorDownload == null) {
            synchronized (this) {
                try {
                    if (this.mExecutorDownload == null) {
                        this.mExecutorDownload = C1490590otN.LIZLLL().LIZJ;
                        if (this.mExecutorDownload == null) {
                            this.mExecutorDownload = new C822650WOx(C1490590otN.LIZLLL().LJFF, C1490590otN.LIZLLL().LJII, C1490590otN.LIZLLL().LJIIJ, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ApiThreadFactory("NetDownload"));
                            this.mExecutorDownload.allowCoreThreadTimeOut(C1490590otN.LIZLLL().LJIIJJI);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.mExecutorDownload;
    }

    private ExecutorService executorLocalService() {
        if (this.mExecutorLocal == null) {
            synchronized (this) {
                try {
                    if (this.mExecutorLocal == null) {
                        C1490590otN.LIZLLL().getClass();
                        this.mExecutorLocal = null;
                        if (this.mExecutorLocal == null) {
                            this.mExecutorLocal = new C822650WOx(1, 1, C1490590otN.LIZLLL().LJIIIIZZ, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ApiThreadFactory("NetLocal"));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.mExecutorLocal;
    }

    private ExecutorService executorLowestService() {
        if (this.mExecutorLowest == null) {
            synchronized (this) {
                try {
                    if (this.mExecutorLowest == null) {
                        this.mExecutorLowest = C1490590otN.LIZLLL().LIZLLL;
                        if (this.mExecutorLowest == null) {
                            C1490590otN.LIZLLL().getClass();
                            C1490590otN.LIZLLL().getClass();
                            C1490590otN.LIZLLL().getClass();
                            this.mExecutorLowest = new C822650WOx(1, 1, 10L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ApiThreadFactory("NetLowest"));
                            this.mExecutorLowest.allowCoreThreadTimeOut(true);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.mExecutorLowest;
    }

    public static int getSequenceNumber() {
        return mSequenceGenerator.incrementAndGet();
    }

    public ExecutorService executorApiService() {
        if (this.mExecutorNormal == null) {
            synchronized (this) {
                try {
                    if (this.mExecutorNormal == null) {
                        this.mExecutorNormal = C1490590otN.LIZLLL().LIZIZ;
                        if (this.mExecutorNormal == null) {
                            this.mExecutorNormal = new C822650WOx(C1490590otN.LIZLLL().LJ, C1490590otN.LIZLLL().LJI, C1490590otN.LIZLLL().LJIIIZ, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ApiThreadFactory("NetNormal"));
                            this.mExecutorNormal.allowCoreThreadTimeOut(C1490590otN.LIZLLL().LJIIJJI);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.mExecutorNormal;
    }

    public ExecutorService executorImmediateService() {
        if (this.mExecutorImmediate == null) {
            synchronized (this) {
                try {
                    if (this.mExecutorImmediate == null) {
                        this.mExecutorImmediate = C1490590otN.LIZLLL().LIZ;
                        if (this.mExecutorImmediate == null) {
                            C1490590otN.LIZLLL().getClass();
                            this.mExecutorImmediate = new C822650WOx(0, Integer.MAX_VALUE, C1490590otN.LIZLLL().LJIIIIZZ, TimeUnit.SECONDS, new SynchronousQueue(), new ApiThreadFactory("NetImmediate"));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.mExecutorImmediate;
    }

    private C1490600otO getThreadPoolConfig() {
        return C1490590otN.LIZLLL();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class ApiThreadFactory implements ThreadFactory {
        public final AtomicInteger mCount = new AtomicInteger(1);
        public String mThreadName;

        public ApiThreadFactory(String str) {
            this.mThreadName = "ApiExecutor";
            if (!TextUtils.isEmpty(str)) {
                this.mThreadName = str;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mThreadName);
            sbLIZ.append("#");
            sbLIZ.append(this.mCount.getAndIncrement());
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            BPEAThread bPEAThread = new BPEAThread(runnable, strLIZIZ) { // from class: X.0868
                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public final void run() {
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        Process.setThreadPriority(10);
                        super.run();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                }
            };
            bPEAThread.setDaemon(false);
            return bPEAThread;
        }
    }

    private AbstractRunnableC1490660otU getLocalRunnable(final AbstractRunnableC1490650otT abstractRunnableC1490650otT) {
        return new AbstractRunnableC1490660otU(abstractRunnableC1490650otT) { // from class: X.0otP
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    abstractRunnableC1490650otT.getClass();
                    if (((C1490630otR) abstractRunnableC1490650otT).LLILZIL == EnumC1490640otS.IMMEDIATE) {
                        this.LLILZ.executorImmediateService().execute(abstractRunnableC1490650otT);
                    } else {
                        this.LLILZ.executorApiService().execute(abstractRunnableC1490650otT);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            @Override // java.lang.Comparable
            public final int compareTo(AbstractRunnableC1490660otU abstractRunnableC1490660otU) {
                AbstractRunnableC1490660otU abstractRunnableC1490660otU2 = abstractRunnableC1490660otU;
                AbstractRunnableC1490650otT abstractRunnableC1490650otT2 = abstractRunnableC1490650otT;
                if (abstractRunnableC1490650otT2 != null) {
                    return abstractRunnableC1490650otT2.compareTo(abstractRunnableC1490660otU2.LL);
                }
                return 0;
            }
        };
    }

    public void executeApi(AbstractRunnableC1490650otT abstractRunnableC1490650otT) {
        if (abstractRunnableC1490650otT != null && !abstractRunnableC1490650otT.LL.get()) {
            abstractRunnableC1490650otT.LJFF(getSequenceNumber());
            EnumC1490640otS enumC1490640otS = ((C1490630otR) abstractRunnableC1490650otT).LLILZIL;
            if (enumC1490640otS == EnumC1490640otS.IMMEDIATE) {
                executorImmediateService().execute(abstractRunnableC1490650otT);
                return;
            }
            if (enumC1490640otS == EnumC1490640otS.LOWEST) {
                executorLowestService().execute(abstractRunnableC1490650otT);
                return;
            }
            long j = abstractRunnableC1490650otT.LLILLJJLI;
            if (j > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 0;
                messageObtain.obj = abstractRunnableC1490650otT;
                this.mHandler.sendMessageDelayed(messageObtain, j);
                return;
            }
            setBlockingQueueSize(this.mExecutorNormal, abstractRunnableC1490650otT);
            executorApiService().execute(abstractRunnableC1490650otT);
        }
    }

    public void executeDownload(AbstractRunnableC1490650otT abstractRunnableC1490650otT) {
        if (abstractRunnableC1490650otT != null && !abstractRunnableC1490650otT.LL.get()) {
            abstractRunnableC1490650otT.LJFF(getSequenceNumber());
            EnumC1490640otS enumC1490640otS = ((C1490630otR) abstractRunnableC1490650otT).LLILZIL;
            if (enumC1490640otS == EnumC1490640otS.IMMEDIATE) {
                executorImmediateService().execute(abstractRunnableC1490650otT);
                return;
            }
            if (enumC1490640otS == EnumC1490640otS.LOWEST) {
                executorLowestService().execute(abstractRunnableC1490650otT);
                return;
            }
            long j = abstractRunnableC1490650otT.LLILLJJLI;
            if (j > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = abstractRunnableC1490650otT;
                this.mHandler.sendMessageDelayed(messageObtain, j);
                return;
            }
            setBlockingQueueSize(this.mExecutorDownload, abstractRunnableC1490650otT);
            executorDownloadService().execute(abstractRunnableC1490650otT);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null && (HandlerHook.getMessageObj(message.obj) instanceof Runnable)) {
            try {
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        setBlockingQueueSize(this.mExecutorDownload, (AbstractRunnableC1490650otT) HandlerHook.getMessageObj(message.obj));
                        executorImmediateService().execute((Runnable) HandlerHook.getMessageObj(message.obj));
                        return;
                    }
                    return;
                }
                setBlockingQueueSize(this.mExecutorNormal, (AbstractRunnableC1490650otT) HandlerHook.getMessageObj(message.obj));
                executorApiService().execute((Runnable) HandlerHook.getMessageObj(message.obj));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void setBlockingQueueSize(ThreadPoolExecutor threadPoolExecutor, AbstractRunnableC1490650otT abstractRunnableC1490650otT) {
        C1494570ozn c1494570oznLJJJZ;
        if (threadPoolExecutor != null && (abstractRunnableC1490650otT instanceof C1490630otR)) {
            int size = threadPoolExecutor.getQueue().size();
            Runnable runnable = ((C1490630otR) abstractRunnableC1490650otT).LLILZ;
            if ((runnable instanceof InterfaceRunnableC1490390ot3) && (c1494570oznLJJJZ = ((InterfaceRunnableC1490390ot3) runnable).LJJJZ()) != null) {
                c1494570oznLJJJZ.LJLILLLLZI.LJ.getClass();
                c1494570oznLJJJZ.LJLIIIL = size;
            }
        }
    }
}
