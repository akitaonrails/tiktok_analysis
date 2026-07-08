package com.ss.android.ugc.aweme.internalshare.impl.viewmodel;

import X.C054G;
import X.C1363150lZp;
import X.C1363350la9;
import X.C1371590lnR;
import X.C13BV;
import X.C2296808zG;
import X.C2502509rL;
import X.InterfaceC1356390lOv;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadAndShareViewModel extends ViewModel implements InterfaceC1356390lOv, GenericLifecycleObserver {
    public final MutableLiveData<C1371590lnR> LL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;
    public final MutableLiveData<List<IMContact>> LLILZ;
    public final MutableLiveData<IMContact> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final C054G LLIZ;
    public final SharePanelViewModel LLIZLLLIL;

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2296808zG.LIZJ(this.LLIZ, null);
        MutableLiveData<Boolean> mutableLiveData = this.LLILLJJLI;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LLILLL.setValue(bool);
    }

    public DownloadAndShareViewModel(SharePackage sharePackage) {
        Boolean bool = Boolean.FALSE;
        this.LLILLJJLI = new MutableLiveData<>(bool);
        this.LLILLL = new MutableLiveData<>(bool);
        this.LLILZ = new MutableLiveData<>();
        MutableLiveData<IMContact> mutableLiveData = new MutableLiveData<>(null);
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        this.LLIZ = C2296808zG.LIZ(new C2502509rL(CoroutineExceptionHandler.LJJLIL, 16));
        this.LLIZLLLIL = C1363350la9.LIZ(sharePackage, this, C13BV.INSTANCE, false, false, false, null, null, null, false, false, null, null, null, 16376);
    }

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
        this.LLILZIL.setValue(iMContact);
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        this.LLILZ.setValue(list);
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean eJ2(IMContact iMContact, boolean z) {
        if (iMContact instanceof C1363150lZp) {
            this.LLILLL.setValue(Boolean.TRUE);
            return false;
        }
        return false;
    }
}
