package dmt.av.video;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public class ReplayLiveData<T> extends MutableLiveData<T> {
    public final ArrayList<T> mReplayValues = new ArrayList<>();

    public void clearReplayValues() {
        this.mReplayValues.clear();
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        super.setValue(t);
        this.mReplayValues.add(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, final Observer<? super T> observer) {
        super.observe(lifecycleOwner, new Observer<T>() { // from class: X.10sy
            public boolean LL;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                if (!this.LL && !this.LLILLL.mReplayValues.isEmpty()) {
                    for (int i = 0; i < this.LLILLL.mReplayValues.size(); i++) {
                        observer.onChanged(ListProtector.get(this.LLILLL.mReplayValues, i));
                    }
                } else {
                    observer.onChanged(t);
                }
                this.LL = true;
            }
        });
    }
}
