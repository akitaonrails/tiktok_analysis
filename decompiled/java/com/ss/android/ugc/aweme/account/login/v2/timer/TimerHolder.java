package com.ss.android.ugc.aweme.account.login.v2.timer;

import X.C851370XaZ;
import android.app.Application;
import android.util.SparseArray;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MediatorLiveData;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class TimerHolder extends AndroidViewModel {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final MediatorLiveData<SparseArray<Map<String, C851370XaZ>>> LL;

    public TimerHolder(Application application) {
        super(application);
        this.LL = new MediatorLiveData<>();
    }
}
