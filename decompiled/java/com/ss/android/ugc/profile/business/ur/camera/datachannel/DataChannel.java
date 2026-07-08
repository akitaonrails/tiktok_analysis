package com.ss.android.ugc.profile.business.ur.camera.datachannel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class DataChannel extends BaseDataChannel {
    public static final /* synthetic */ int LLILZ = 0;
    public LifecycleOwner LLILLL;

    public final void yQ2(Class cls, Object obj) {
        if (wQ2()) {
            LiveData liveData = (LiveData) vQ2(cls);
            if (liveData != null) {
                liveData.postValue(obj);
                return;
            }
            return;
        }
        LiveData liveData2 = (LiveData) vQ2(cls);
        if (liveData2 == null) {
            return;
        }
        liveData2.setValue(obj);
    }

    public final void xQ2(LifecycleOwner lifecycleOwner, Class cls, Function1 function1) {
        NextLiveData nextLiveData;
        if (lifecycleOwner != null) {
            NextLiveData nextLiveData2 = (NextLiveData) vQ2(cls);
            if (nextLiveData2 != null) {
                nextLiveData2.observe(lifecycleOwner, function1, false);
                return;
            }
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.LLILLL;
        if (lifecycleOwner2 == null || (nextLiveData = (NextLiveData) vQ2(cls)) == null) {
            return;
        }
        nextLiveData.observe(lifecycleOwner2, function1, false);
    }
}
