package com.ss.ugc.android.editor.core.utils;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class LiveDataBus {
    public static LiveDataBus liveDataBus = new LiveDataBus();
    public Map<String, BusMutableLiveData> bus = new HashMap();

    public static LiveDataBus getInstance() {
        return liveDataBus;
    }

    public static class BusMutableLiveData<T> extends MutableLiveData<T> {
        private void hook(Observer<? super T> observer) {
            Object value;
            try {
                Field declaredField = LiveData.class.getDeclaredField("mObservers");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Method declaredMethod = obj.getClass().getDeclaredMethod("get", Object.class);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(obj, observer);
                if (objInvoke != null && (objInvoke instanceof Map.Entry) && (value = ((Map.Entry) objInvoke).getValue()) != null) {
                    Field declaredField2 = value.getClass().getSuperclass().getDeclaredField("mLastVersion");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = LiveData.class.getDeclaredField("mVersion");
                    declaredField3.setAccessible(true);
                    declaredField2.set(value, declaredField3.get(this));
                    return;
                }
                throw new NullPointerException("observerWraper is null");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        @Override // androidx.lifecycle.LiveData
        public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super.observe(lifecycleOwner, observer);
            hook(observer);
        }
    }

    public <T> MutableLiveData<T> with(String str, Class<T> cls) {
        if (!this.bus.containsKey(str)) {
            this.bus.put(str, new BusMutableLiveData());
        }
        return this.bus.get(str);
    }
}
