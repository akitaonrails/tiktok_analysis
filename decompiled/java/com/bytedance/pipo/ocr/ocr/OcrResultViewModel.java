package com.bytedance.pipo.ocr.ocr;

import X.C20154213tU;
import Y.AObserverS232S0100000_30;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class OcrResultViewModel extends ViewModel {
    public final MutableLiveData<String> LL;
    public final MutableLiveData<String> LLILLJJLI;
    public final MutableLiveData<String> LLILLL;
    public final MediatorLiveData<C20154213tU> LLILZ;
    public final MediatorLiveData<C20154213tU> LLILZIL;
    public final MediatorLiveData<C20154213tU> LLILZLL;
    public final MediatorLiveData<Boolean> LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;

    public OcrResultViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData3;
        MediatorLiveData<C20154213tU> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.setValue(new C20154213tU(0));
        this.LLILZ = mediatorLiveData;
        MediatorLiveData<C20154213tU> mediatorLiveData2 = new MediatorLiveData<>();
        mediatorLiveData2.setValue(new C20154213tU(0));
        this.LLILZIL = mediatorLiveData2;
        MediatorLiveData<C20154213tU> mediatorLiveData3 = new MediatorLiveData<>();
        mediatorLiveData3.setValue(new C20154213tU(0));
        this.LLILZLL = mediatorLiveData3;
        MediatorLiveData<Boolean> mediatorLiveData4 = new MediatorLiveData<>();
        this.LLIZ = mediatorLiveData4;
        mediatorLiveData.addSource(mutableLiveData, new AObserverS232S0100000_30(this, 1));
        mediatorLiveData2.addSource(mutableLiveData2, new AObserverS232S0100000_30(this, 2));
        mediatorLiveData3.addSource(mutableLiveData3, new AObserverS232S0100000_30(this, 3));
        mediatorLiveData4.addSource(mediatorLiveData, new AObserverS232S0100000_30(this, 4));
        mediatorLiveData4.addSource(mediatorLiveData2, new AObserverS232S0100000_30(this, 5));
        mediatorLiveData4.addSource(mediatorLiveData3, new AObserverS232S0100000_30(this, 6));
    }

    public final String vQ2(String str, String str2) {
        if (str == null) {
            return "-1";
        }
        if (Intrinsics.LJFF(str, str2)) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }
}
