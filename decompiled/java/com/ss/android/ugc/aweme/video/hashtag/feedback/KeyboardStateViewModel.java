package com.ss.android.ugc.aweme.video.hashtag.feedback;

import X.C786410Ut5;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class KeyboardStateViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LL;
    public final MutableLiveData<Boolean> LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;
    public final MutableLiveData LLILZ;
    public boolean LLILZIL;

    public KeyboardStateViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LL = new MutableLiveData<>(bool);
        this.LLILLJJLI = new MutableLiveData<>(bool);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLILLL = mutableLiveData;
        this.LLILZ = mutableLiveData;
    }

    public final void runOnUiThread(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
        }
    }
}
