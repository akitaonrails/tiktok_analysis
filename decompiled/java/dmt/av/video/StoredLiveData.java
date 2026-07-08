package dmt.av.video;

import X.InterfaceC1462580oAC;
import Y.AObserverS184S0200000_22;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes23.dex */
public class StoredLiveData<T> extends MutableLiveData<T> {
    public T mOldValue;

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        super.setValue(t);
        this.mOldValue = t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observe$0(InterfaceC1462580oAC interfaceC1462580oAC, Object obj) {
        interfaceC1462580oAC.LIZ(this.mOldValue, obj);
    }

    public void observe(LifecycleOwner lifecycleOwner, InterfaceC1462580oAC<T> interfaceC1462580oAC) {
        super.observe(lifecycleOwner, new AObserverS184S0200000_22(this, interfaceC1462580oAC, 2));
    }
}
