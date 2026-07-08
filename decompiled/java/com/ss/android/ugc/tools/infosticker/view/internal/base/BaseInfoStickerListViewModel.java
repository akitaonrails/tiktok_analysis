package com.ss.android.ugc.tools.infosticker.view.internal.base;

import X.AbstractC1634360sdG;
import X.AbstractC19484711Kz;
import X.C11NJ;
import X.C11S5;
import X.C13BV;
import X.C1701940uOG;
import X.EnumC1641470soj;
import X.InterfaceC1640330smt;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public abstract class BaseInfoStickerListViewModel<DATA> extends HumbleViewModel implements InterfaceC1640330smt<DATA> {
    public final MutableLiveData<List<DATA>> LL;
    public final MutableLiveData<EnumC1641470soj> LLILLJJLI;
    public final MutableLiveData<EnumC1641470soj> LLILLL;
    public C11NJ LLILZ;

    public void LLIZLLLIL() {
    }

    public void Px2(AbstractC1634360sdG abstractC1634360sdG) {
    }

    public LiveData<Object> getExtraData() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void tw(StickerSetCategory stickerSetCategory) {
    }

    public abstract AbstractC19484711Kz<List<DATA>> wQ2();

    public abstract AbstractC19484711Kz<List<DATA>> xQ2();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11NJ c11nj = this.LLILZ;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLILZ = null;
    }

    public final C11NJ vQ2() {
        C11NJ c11nj = this.LLILZ;
        if (c11nj != null) {
            return c11nj;
        }
        C11NJ c11nj2 = new C11NJ();
        this.LLILZ = c11nj2;
        return c11nj2;
    }

    public void X1() {
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILLJJLI.getValue();
        if (value == null || !(value == EnumC1641470soj.EMPTY || value == EnumC1641470soj.LOADING)) {
            List<DATA> value2 = this.LL.getValue();
            if (value2 == null || !(true ^ value2.isEmpty())) {
                this.LLILLJJLI.setValue(EnumC1641470soj.LOADING);
                vQ2().LIZ(wQ2().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS194S0100000_25(this, 112), new AfS194S0100000_25(this, 113)));
            }
        }
    }

    public void se2() {
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILLJJLI.getValue();
        if (value == null || value == EnumC1641470soj.NONE) {
            List<DATA> value2 = this.LL.getValue();
            if (value2 == null || !value2.isEmpty()) {
                EnumC1641470soj value3 = this.LLILLL.getValue();
                if (value3 == null || !(value3 == EnumC1641470soj.EMPTY || value3 == EnumC1641470soj.LOADING)) {
                    this.LLILLL.setValue(EnumC1641470soj.LOADING);
                    vQ2().LIZ(xQ2().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS194S0100000_25(this, 114), new AfS194S0100000_25(this, 115)));
                }
            }
        }
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> LJJIJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> getLoadMoreState() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<List<DATA>> he() {
        return this.LL;
    }

    public BaseInfoStickerListViewModel(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        MutableLiveData<List<DATA>> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = new MutableLiveData<>();
        MutableLiveData<EnumC1641470soj> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData2;
        mutableLiveData.setValue(C13BV.INSTANCE);
        mutableLiveData2.setValue(EnumC1641470soj.NONE);
    }
}
