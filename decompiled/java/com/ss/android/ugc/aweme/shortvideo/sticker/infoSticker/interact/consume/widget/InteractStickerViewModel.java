package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import X.C0RD4;
import X.C786410Ut5;
import Y.ARunnableS16S1200000_11;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractStickerViewModel extends ViewModel {
    public InteractStickerWidget LLILLL;
    public Thread LLILZ;
    public final HashMap<String, Object> LL = new HashMap<>();
    public final HashMap<String, NextLiveData<C0RD4>> LLILLJJLI = new HashMap<>();
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL.clear();
        this.LLILLJJLI.clear();
        this.LLILLL = null;
    }

    public final <T> T get(String str) {
        T t = (T) this.LL.get(str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final void wQ2(Object obj, String str) {
        if (this.LLILZ == null) {
            this.LLILZ = Looper.getMainLooper().getThread();
        }
        if (C786410Ut5.u3() == this.LLILZ) {
            this.LL.put(str, obj);
            NextLiveData<C0RD4> nextLiveData = this.LLILLJJLI.get(str);
            if (nextLiveData != null) {
                nextLiveData.setValue(new C0RD4(str, obj));
                return;
            }
            return;
        }
        C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS16S1200000_11(obj, str, this, 13));
    }

    public final void vQ2(String str, Observer observer, boolean z) {
        if (!TextUtils.isEmpty(str) && observer != null) {
            NextLiveData<C0RD4> nextLiveData = this.LLILLJJLI.get(str);
            if (nextLiveData == null) {
                nextLiveData = new NextLiveData<>();
                if (this.LL.containsKey(str)) {
                    nextLiveData.setValue(new C0RD4(str, this.LL.get(str)));
                }
                this.LLILLJJLI.put(str, nextLiveData);
            }
            nextLiveData.observe(this.LLILLL, observer, z);
        }
    }
}
