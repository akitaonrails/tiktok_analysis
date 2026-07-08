package com.bytedance.keva;

import X.C08FF;
import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes24.dex */
public class KevaAsyncWriter extends KevaFuture {
    public static final long MAIN_THREAD_ID = Looper.getMainLooper().getThread().getId();
    public static final Map<String, Boolean> sIgnoreMap;
    public static final CopyOnWriteArrayList<OnFlushListener> sListeners;
    public static final Keva sWalFlagKeva;
    public final LinkedHashMap<String, AsyncWriteObject> mMap;
    public volatile boolean mNeedClear;
    public final ReentrantReadWriteLock mReentrantReadWriteLock;
    public volatile Stage mStage;
    public final Object mSyncLock;
    public volatile boolean mWalCheckReady;
    public final OnFlushListener onFlushListener;

    public interface OnFlushListener {
        void onFlush();
    }

    @Override // com.bytedance.keva.KevaFuture
    public void initTask(Callable<KevaImpl> callable) {
    }

    public void onFlushImpl() {
        boolean z;
        synchronized (this) {
            try {
                int i = AnonymousClass4.$SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage[this.mStage.ordinal()];
                if (i == 3) {
                    this.mStage = Stage.FLUSH;
                    z = true;
                } else {
                    if (i != 4) {
                        return;
                    }
                    this.mStage = Stage.FLUSH;
                    z = false;
                }
                if (z) {
                    commitWAL();
                } else {
                    checkRepoAllReady();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.keva.KevaAsyncWriter$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type;
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage;

        static {
            int[] iArr = new int[AsyncWriteObject.Type.values().length];
            $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type = iArr;
            try {
                iArr[AsyncWriteObject.Type.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.INT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.BYTES.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_SET.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.BYTES_JUST_DISK.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_JUST_DISK.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_SET_JUST_DISK.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[AsyncWriteObject.Type.STRING_ARRAY_JUST_DISK.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            int[] iArr2 = new int[Stage.values().length];
            $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage = iArr2;
            try {
                iArr2[Stage.FLUSH.ordinal()] = 1;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage[Stage.SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage[Stage.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$bytedance$keva$KevaAsyncWriter$Stage[Stage.LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
        }
    }

    private void commit() {
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (this.mMap.isEmpty()) {
                this.mReentrantReadWriteLock.readLock().unlock();
                return;
            }
            refreshToDisk();
            this.mReentrantReadWriteLock.readLock().unlock();
            try {
                this.mReentrantReadWriteLock.writeLock().lock();
                this.mMap.clear();
                this.mReentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mReentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th2;
        }
    }

    private void deleteWalFlag() {
        sWalFlagKeva.erase(this.mName);
    }

    private boolean isAllReady() {
        return this.mStage == Stage.SYNC;
    }

    public static void onFlush() {
        Iterator<OnFlushListener> it2 = sListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onFlush();
        }
    }

    private void refreshToDisk() {
        if (this.mNeedClear) {
            super.clear();
            this.mNeedClear = false;
        }
        for (String str : this.mMap.keySet()) {
            AsyncWriteObject asyncWriteObject = this.mMap.get(str);
            if (asyncWriteObject != null) {
                if (asyncWriteObject.action != AsyncWriteObject.Action.ERASE) {
                    switch (AnonymousClass4.$SwitchMap$com$bytedance$keva$KevaAsyncWriter$AsyncWriteObject$Type[asyncWriteObject.type.ordinal()]) {
                        case 1:
                            super.storeDouble(str, ((Double) asyncWriteObject.value).doubleValue());
                            break;
                        case 2:
                            super.storeLong(str, ((Long) asyncWriteObject.value).longValue());
                            break;
                        case 3:
                            super.storeInt(str, ((Integer) asyncWriteObject.value).intValue());
                            break;
                        case 4:
                            super.storeFloat(str, ((Float) asyncWriteObject.value).floatValue());
                            break;
                        case 5:
                            super.storeBytes(str, (byte[]) asyncWriteObject.value);
                            break;
                        case 6:
                            super.storeString(str, (String) asyncWriteObject.value);
                            break;
                        case 7:
                            super.storeStringArray(str, (String[]) asyncWriteObject.value);
                            break;
                        case 8:
                            super.storeBoolean(str, ((Boolean) asyncWriteObject.value).booleanValue());
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            super.storeStringSet(str, (Set) asyncWriteObject.value);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            super.storeBytesJustDisk(str, (byte[]) asyncWriteObject.value);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            super.storeStringJustDisk(str, (String) asyncWriteObject.value);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            super.storeStringSetJustDisk(str, (Set) asyncWriteObject.value);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            super.storeStringArrayJustDisk(str, (String[]) asyncWriteObject.value);
                            break;
                    }
                } else {
                    super.erase(str);
                }
            }
        }
    }

    private boolean shouldAsyncWrite() {
        if (this.mStage != Stage.LOADING || MAIN_THREAD_ID != C786410Ut5.u3().getId()) {
            return false;
        }
        if (!this.mWalCheckReady) {
            this.mWalCheckReady = true;
            Keva keva = sWalFlagKeva;
            if (!keva.getBoolean(this.mName, false)) {
                keva.storeBoolean(this.mName, true);
                return true;
            }
            sIgnoreMap.put(this.mName, Boolean.TRUE);
            KevaImpl.sMonitor.reportWarning(8, this.mName, "", "", "the last async write action is not work correct");
        }
        return true;
    }

    private boolean shouldReadFromMem() {
        return this.mStage == Stage.LOADING;
    }

    public static void uploadFailedStatistics() {
        final Set<Map.Entry<String, ?>> setEntrySet = sWalFlagKeva.getAll().entrySet();
        if (setEntrySet.size() == 0) {
            return;
        }
        KevaImpl.sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaAsyncWriter.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("KevaAsyncWriter@24c3.uploadFailedStatistics$1");
                com_bytedance_keva_KevaAsyncWriter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("KevaAsyncWriter@24c3.uploadFailedStatistics$1");
            }

            public void com_bytedance_keva_KevaAsyncWriter$1__run$___twin___() {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    String str = (String) ((Map.Entry) it2.next()).getKey();
                    Map<String, Boolean> map = KevaAsyncWriter.sIgnoreMap;
                    Boolean bool = map.get(str);
                    if (bool == null || !bool.booleanValue()) {
                        sb.setLength(0);
                        sb.append("fileName = ");
                        sb.append(str);
                        KevaAsyncWriter.sWalFlagKeva.erase(str);
                        KevaImpl.sMonitor.reportWarning(6, str, "", "", sb.toString());
                        map.remove(str);
                    }
                }
            }

            public static void com_bytedance_keva_KevaAsyncWriter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_bytedance_keva_KevaAsyncWriter$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    static {
        KevaPrivateImpl kevaPrivateImpl = new KevaPrivateImpl("wal", null, 0);
        sWalFlagKeva = kevaPrivateImpl;
        sListeners = new CopyOnWriteArrayList<>();
        sIgnoreMap = new ConcurrentHashMap();
        kevaPrivateImpl.init(false);
        uploadFailedStatistics();
    }

    private void checkRepoAllReady() {
        if (isAllReady()) {
            return;
        }
        synchronized (this.mSyncLock) {
            while (!isAllReady()) {
                try {
                    try {
                        this.mSyncLock.wait();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    private void setFinalState() {
        deleteWalFlag();
        this.mStage = Stage.SYNC;
        synchronized (this.mSyncLock) {
            try {
                this.mSyncLock.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        unregisterOnFlushListener(this.onFlushListener);
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void clear() {
        if (isAllReady()) {
            super.clear();
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.clear();
                this.mNeedClear = true;
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.clear();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    public void commitWAL() {
        commit();
        setFinalState();
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public int count() {
        checkRepoAllReady();
        return super.count();
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void dump() {
        checkRepoAllReady();
        super.dump();
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        checkRepoAllReady();
        return super.getAll();
    }

    @Override // com.bytedance.keva.KevaFuture
    public void onRepoLoad() {
        super.onRepoLoad();
        this.mStage = Stage.LOAD;
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (this.mMap.isEmpty()) {
                setFinalState();
                this.mReentrantReadWriteLock.readLock().unlock();
            } else {
                this.mReentrantReadWriteLock.readLock().unlock();
                KevaImpl.sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaAsyncWriter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C1C7U.LIZ("KevaAsyncWriter@24c3.onRepoLoad$1");
                        com_bytedance_keva_KevaAsyncWriter$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("KevaAsyncWriter@24c3.onRepoLoad$1");
                    }

                    public void com_bytedance_keva_KevaAsyncWriter$3__run$___twin___() {
                        KevaAsyncWriter.this.commitWAL();
                    }

                    public static void com_bytedance_keva_KevaAsyncWriter$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                        try {
                            anonymousClass3.com_bytedance_keva_KevaAsyncWriter$3__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    public static class AsyncWriteObject {
        public final Action action;
        public final Type type;
        public final Object value;

        public enum Action {
            INSERT,
            ERASE,
            CLEAR;

            public static Action valueOf(String str) {
                return (Action) C08FF.LIZ(Action.class, str);
            }
        }

        public enum Type {
            INT,
            DOUBLE,
            LONG,
            FLOAT,
            BOOLEAN,
            STRING,
            BYTES,
            STRING_SET,
            STRING_ARRAY,
            BYTES_JUST_DISK,
            STRING_ARRAY_JUST_DISK,
            STRING_JUST_DISK,
            STRING_SET_JUST_DISK;

            public static Type valueOf(String str) {
                return (Type) C08FF.LIZ(Type.class, str);
            }
        }

        public AsyncWriteObject(Type type, Action action, Object obj) {
            this.type = type;
            this.action = action;
            this.value = obj;
        }
    }

    public enum Stage {
        LOADING,
        LOAD,
        FLUSH,
        SYNC;

        public static Stage valueOf(String str) {
            return (Stage) C08FF.LIZ(Stage.class, str);
        }
    }

    public static void registerOnFlushListener(OnFlushListener onFlushListener) {
        sListeners.add(onFlushListener);
    }

    public static void unregisterOnFlushListener(OnFlushListener onFlushListener) {
        sListeners.remove(onFlushListener);
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void erase(String str) {
        if (isAllReady()) {
            super.erase(str);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(null, AsyncWriteObject.Action.ERASE, null));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.erase(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getBoolean(str, z);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.BOOLEAN) {
                boolean zBooleanValue = ((Boolean) asyncWriteObject.value).booleanValue();
                this.mReentrantReadWriteLock.readLock().unlock();
                return zBooleanValue;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getBoolean(str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getBytes(str, bArr);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.BYTES) {
                byte[] bArr2 = (byte[]) asyncWriteObject.value;
                this.mReentrantReadWriteLock.readLock().unlock();
                return bArr2;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getBytes(str, bArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getBytesJustDisk(str, bArr);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.BYTES_JUST_DISK) {
                byte[] bArr2 = (byte[]) asyncWriteObject.value;
                this.mReentrantReadWriteLock.readLock().unlock();
                return bArr2;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getBytesJustDisk(str, bArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getDouble(str, d);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.DOUBLE) {
                double dDoubleValue = ((Double) asyncWriteObject.value).doubleValue();
                this.mReentrantReadWriteLock.readLock().unlock();
                return dDoubleValue;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getDouble(str, d);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getFloat(str, f);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.FLOAT) {
                float fFloatValue = ((Float) asyncWriteObject.value).floatValue();
                this.mReentrantReadWriteLock.readLock().unlock();
                return fFloatValue;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getFloat(str, f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getInt(str, i);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.INT) {
                int iIntValue = ((Integer) asyncWriteObject.value).intValue();
                this.mReentrantReadWriteLock.readLock().unlock();
                return iIntValue;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getInt(str, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            super.getLong(str, j);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.LONG) {
                long jLongValue = ((Long) asyncWriteObject.value).longValue();
                this.mReentrantReadWriteLock.readLock().unlock();
                return jLongValue;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getLong(str, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getString(str, str2);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING) {
                String str3 = (String) asyncWriteObject.value;
                this.mReentrantReadWriteLock.readLock().unlock();
                return str3;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getString(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringArray(str, strArr);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_ARRAY) {
                String[] strArr2 = (String[]) asyncWriteObject.value;
                this.mReentrantReadWriteLock.readLock().unlock();
                return strArr2;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringArray(str, strArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringArrayJustDisk(str, strArr);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_ARRAY_JUST_DISK) {
                String[] strArr2 = (String[]) asyncWriteObject.value;
                this.mReentrantReadWriteLock.readLock().unlock();
                return strArr2;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringArrayJustDisk(str, strArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringJustDisk(str, str2);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_JUST_DISK) {
                String str3 = (String) asyncWriteObject.value;
                this.mReentrantReadWriteLock.readLock().unlock();
                return str3;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringJustDisk(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringSet(str, set);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_SET) {
                Set<String> set2 = (Set) asyncWriteObject.value;
                this.mReentrantReadWriteLock.readLock().unlock();
                return set2;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringSet(str, set);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        AsyncWriteObject asyncWriteObject;
        if (isAllReady()) {
            return super.getStringSetJustDisk(str, set);
        }
        try {
            this.mReentrantReadWriteLock.readLock().lock();
            if (shouldReadFromMem() && (asyncWriteObject = this.mMap.get(str)) != null && asyncWriteObject.type == AsyncWriteObject.Type.STRING_SET_JUST_DISK) {
                Set<String> set2 = (Set) asyncWriteObject.value;
                this.mReentrantReadWriteLock.readLock().unlock();
                return set2;
            }
            this.mReentrantReadWriteLock.readLock().unlock();
            checkRepoAllReady();
            return super.getStringSetJustDisk(str, set);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        if (isAllReady()) {
            super.storeBoolean(str, z);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.BOOLEAN, AsyncWriteObject.Action.INSERT, Boolean.valueOf(z)));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeBoolean(str, z);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        if (isAllReady()) {
            super.storeBytes(str, bArr);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.BYTES, AsyncWriteObject.Action.INSERT, bArr));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeBytes(str, bArr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        if (isAllReady()) {
            super.storeBytesJustDisk(str, bArr);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.BYTES_JUST_DISK, AsyncWriteObject.Action.INSERT, bArr));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeBytesJustDisk(str, bArr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        if (isAllReady()) {
            super.storeDouble(str, d);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.DOUBLE, AsyncWriteObject.Action.INSERT, Double.valueOf(d)));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeDouble(str, d);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        if (isAllReady()) {
            super.storeFloat(str, f);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.FLOAT, AsyncWriteObject.Action.INSERT, Float.valueOf(f)));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeFloat(str, f);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        if (isAllReady()) {
            super.storeInt(str, i);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.INT, AsyncWriteObject.Action.INSERT, Integer.valueOf(i)));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeInt(str, i);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        if (isAllReady()) {
            super.storeLong(str, j);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.LONG, AsyncWriteObject.Action.INSERT, Long.valueOf(j)));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeLong(str, j);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        if (isAllReady()) {
            super.storeString(str, str2);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING, AsyncWriteObject.Action.INSERT, str2));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeString(str, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        if (isAllReady()) {
            super.storeStringArray(str, strArr);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_ARRAY, AsyncWriteObject.Action.INSERT, strArr));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeStringArray(str, strArr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        if (isAllReady()) {
            super.storeStringArrayJustDisk(str, strArr);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_ARRAY_JUST_DISK, AsyncWriteObject.Action.INSERT, strArr));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeStringArrayJustDisk(str, strArr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        if (isAllReady()) {
            super.storeStringJustDisk(str, str2);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_JUST_DISK, AsyncWriteObject.Action.INSERT, str2));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeStringJustDisk(str, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        if (isAllReady()) {
            super.storeStringSet(str, set);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_SET, AsyncWriteObject.Action.INSERT, set));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeStringSet(str, set);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.keva.KevaFuture, com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        if (isAllReady()) {
            super.storeStringSetJustDisk(str, set);
            return;
        }
        try {
            this.mReentrantReadWriteLock.writeLock().lock();
            if (shouldAsyncWrite()) {
                this.mMap.put(str, new AsyncWriteObject(AsyncWriteObject.Type.STRING_SET_JUST_DISK, AsyncWriteObject.Action.INSERT, set));
                this.mReentrantReadWriteLock.writeLock().unlock();
            } else {
                this.mReentrantReadWriteLock.writeLock().unlock();
                checkRepoAllReady();
                super.storeStringSetJustDisk(str, set);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    public KevaAsyncWriter(String str, String str2, int i, Callable<KevaImpl> callable, boolean z) {
        super(str, str2, i, callable, z);
        this.mSyncLock = new Object();
        this.mMap = new LinkedHashMap<>();
        this.mReentrantReadWriteLock = new ReentrantReadWriteLock();
        OnFlushListener onFlushListener = new OnFlushListener() { // from class: com.bytedance.keva.KevaAsyncWriter.2
            @Override // com.bytedance.keva.KevaAsyncWriter.OnFlushListener
            public void onFlush() {
                KevaAsyncWriter.this.onFlushImpl();
            }
        };
        this.onFlushListener = onFlushListener;
        registerOnFlushListener(onFlushListener);
        this.mStage = Stage.LOADING;
        super.initTask(callable);
    }
}
