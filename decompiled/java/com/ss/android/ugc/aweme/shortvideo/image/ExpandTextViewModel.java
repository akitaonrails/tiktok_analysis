package com.ss.android.ugc.aweme.shortvideo.image;

import X.C11RK;
import X.C1428270nGr;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ExpandTextViewModel extends ViewModel {
    public final C11RK<VideoPublishEditModel> LL = new C11RK<>();
    public final MutableLiveData<Integer> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Pair<Boolean, Boolean>> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final MutableLiveData LLJ;
    public final MutableLiveData<Boolean> LLJI;
    public final MutableLiveData LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL;
    public final MutableLiveData LLJILJILJ;
    public final MutableLiveData<Integer> LLJILLL;
    public final MutableLiveData LLJJ;
    public final MutableLiveData<String> LLJJI;
    public final MutableLiveData LLJJIII;

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean wQ2() {
        String str = (String) this.LLJJIII.getValue();
        return (Intrinsics.LJFF(str, "recognition error") || Intrinsics.LJFF(str, "Others") || str == null || !C1428270nGr.LIZ(str)) ? false : true;
    }

    public ExpandTextViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLIZLLLIL = mutableLiveData;
        this.LLJ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLJI = mutableLiveData2;
        this.LLJIJIL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LLJILJIL = mutableLiveData3;
        this.LLJILJILJ = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.LLJILLL = mutableLiveData4;
        this.LLJJ = mutableLiveData4;
        MutableLiveData<String> mutableLiveData5 = new MutableLiveData<>();
        this.LLJJI = mutableLiveData5;
        this.LLJJIII = mutableLiveData5;
    }

    public final void vQ2(boolean z) {
        boolean zBooleanValue;
        Pair<Boolean, Boolean> value = this.LLILZ.getValue();
        Boolean boolValueOf = Boolean.valueOf(z);
        if (value != null) {
            zBooleanValue = value.getSecond().booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZ.setValue(new Pair<>(boolValueOf, Boolean.valueOf(zBooleanValue)));
    }
}
