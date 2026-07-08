package com.ss.android.ugc.aweme.pipfeed.components.single;

import X.EnumC19384110sZ;
import X.InterfaceC19383710sV;
import X.InterfaceC19383810sW;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes30.dex */
public final class ControlOverlayViewModel extends ViewModel {
    public InterfaceC19383810sW LL;
    public InterfaceC19383710sV LLILLJJLI;
    public final MutableLiveData<EnumC19384110sZ> LLILLL;
    public final MutableLiveData<EnumC19384110sZ> LLILZ;
    public final MutableLiveData<EnumC19384110sZ> LLILZIL;
    public final MutableLiveData<EnumC19384110sZ> LLILZLL;
    public final ControlOverlayViewModel$isPlaying$1 LLIZ;
    public final MutableLiveData<Float> LLIZLLLIL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL = null;
        this.LLILLJJLI = null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel$isPlaying$1] */
    public ControlOverlayViewModel() {
        EnumC19384110sZ enumC19384110sZ = EnumC19384110sZ.VISIBLE;
        this.LLILLL = new MutableLiveData<>(enumC19384110sZ);
        this.LLILZ = new MutableLiveData<>(enumC19384110sZ);
        this.LLILZIL = new MutableLiveData<>(enumC19384110sZ);
        this.LLILZLL = new MutableLiveData<>(EnumC19384110sZ.GONE);
        this.LLIZ = new MutableLiveData<Boolean>() { // from class: com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel$isPlaying$1
            {
                Boolean bool = Boolean.TRUE;
            }

            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public void setValue(Boolean bool) {
                super.setValue(bool);
            }
        };
        this.LLIZLLLIL = new MutableLiveData<>(Float.valueOf(0.0f));
    }
}
