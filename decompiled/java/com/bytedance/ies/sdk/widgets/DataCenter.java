package com.bytedance.ies.sdk.widgets;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class DataCenter extends ViewModel {
    public LifecycleOwner lifecycleOwner;
    public Thread mainThread;
    public Map<String, Object> dataStore = new HashMap();
    public Map<String, NextLiveData<KVData>> liveDataMap = new HashMap();
    public Handler handler = new BPEAHandler(Looper.getMainLooper());

    private boolean notMainThread() {
        if (this.mainThread == null) {
            this.mainThread = Looper.getMainLooper().getThread();
        }
        return C786410Ut5.u3() != this.mainThread;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.dataStore.clear();
        this.liveDataMap.clear();
        this.lifecycleOwner = null;
        this.handler.removeCallbacksAndMessages(null);
    }

    private NextLiveData<KVData> getLiveData(String str) {
        NextLiveData<KVData> nextLiveData = this.liveDataMap.get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData<>();
            if (this.dataStore.containsKey(str)) {
                nextLiveData.setValue(new KVData(str, this.dataStore.get(str)));
            }
            this.liveDataMap.put(str, nextLiveData);
        }
        return nextLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$put$0(Bundle bundle) {
        C1C7U.LIZ("DataCenter@3494.put$1L");
        put(bundle);
        C1C7U.LIZIZ("DataCenter@3494.put$1L");
    }

    public <T> T get(String str) {
        T t = (T) this.dataStore.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public boolean has(String str) {
        return this.dataStore.containsKey(str);
    }

    public DataCenter put(final Bundle bundle) {
        if (notMainThread()) {
            C786410Ut5.LJJZZIII(this.handler, new Runnable() { // from class: X.0Cu5
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$put$0(bundle);
                }
            });
            return this;
        }
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            if (str != null) {
                put(str, INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_DataCenter_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str));
            }
        }
        return this;
    }

    public DataCenter removeObserver(Observer<KVData> observer) {
        if (observer == null) {
            return this;
        }
        Iterator<NextLiveData<KVData>> it2 = this.liveDataMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().removeObserver(observer);
        }
        return this;
    }

    public static Object INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_DataCenter_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static DataCenter create(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        DataCenter dataCenter = (DataCenter) viewModelProvider.get(DataCenter.class);
        dataCenter.lifecycleOwner = lifecycleOwner;
        return dataCenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T get(Object obj, T t) {
        if (obj == 0) {
            return null;
        }
        if (t != null && ((!(obj instanceof Number) || !(t instanceof Number)) && !t.getClass().isAssignableFrom(obj.getClass()))) {
            return t;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$put$1(String str, Object obj) {
        C1C7U.LIZ("DataCenter@3494.put$2L");
        put(str, obj);
        C1C7U.LIZIZ("DataCenter@3494.put$2L");
    }

    public DataCenter observe(String str, Observer<KVData> observer) {
        observe(str, observer, false);
        return this;
    }

    public DataCenter observeForever(String str, Observer<KVData> observer) {
        observeForever(str, observer, false);
        return this;
    }

    public DataCenter put(final String str, final Object obj) {
        if (notMainThread()) {
            C786410Ut5.LJJZZIII(this.handler, new Runnable() { // from class: X.0Cu6
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$put$1(str, obj);
                }
            });
            return this;
        }
        this.dataStore.put(str, obj);
        NextLiveData<KVData> nextLiveData = this.liveDataMap.get(str);
        if (nextLiveData != null) {
            nextLiveData.setValue(new KVData(str, obj));
        }
        return this;
    }

    public DataCenter removeObserver(String str, Observer<KVData> observer) {
        NextLiveData<KVData> nextLiveData;
        if (!TextUtils.isEmpty(str) && observer != null && (nextLiveData = this.liveDataMap.get(str)) != null) {
            nextLiveData.removeObserver(observer);
        }
        return this;
    }

    public <T> T get(String str, T t) {
        if (!this.dataStore.containsKey(str)) {
            return t;
        }
        return (T) get(this.dataStore.get(str), t);
    }

    public DataCenter observe(String str, Observer<KVData> observer, boolean z) {
        if (!TextUtils.isEmpty(str) && observer != null) {
            NextLiveData<KVData> liveData = getLiveData(str);
            LifecycleOwner lifecycleOwner = this.lifecycleOwner;
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, observer, z);
            }
        }
        return this;
    }

    public DataCenter observeForever(String str, Observer<KVData> observer, boolean z) {
        if (!TextUtils.isEmpty(str) && observer != null) {
            getLiveData(str).observeForever(observer, z);
        }
        return this;
    }
}
