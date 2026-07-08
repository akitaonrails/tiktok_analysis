package com.ss.android.ugc.tiktok.tpsc.core.render.components.builtin.setting;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes29.dex */
public final class SettingItemViewModel extends ViewModel {
    public static final /* synthetic */ int LLILLL = 0;
    public final MutableLiveData<Integer> LL;
    public final MutableLiveData<Boolean> LLILLJJLI;

    public SettingItemViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(-1);
        this.LL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this.LLILLJJLI = mutableLiveData2;
    }
}
