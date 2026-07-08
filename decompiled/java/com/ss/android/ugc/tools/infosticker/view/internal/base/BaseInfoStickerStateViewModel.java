package com.ss.android.ugc.tools.infosticker.view.internal.base;

import X.C0LCS;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1634100scq;
import X.C1701940uOG;
import X.EnumC1641420soe;
import X.InterfaceC1640420sn2;
import X.InterfaceC420801kM;
import Y.AfS159S0200000_25;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public abstract class BaseInfoStickerStateViewModel<DATA> extends HumbleViewModel implements InterfaceC1640420sn2<DATA> {
    public final MutableLiveData<Map<DATA, Pair<EnumC1641420soe, Integer>>> LL;
    public final MutableLiveData<C0LCS<List<DATA>>> LLILLJJLI;
    public final MutableLiveData<C0LCS<List<DATA>>> LLILLL;
    public C11NJ LLILZ;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract C11NZ<C1634100scq<DATA, EnumC1641420soe, Integer>> vQ2(DATA data);

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11NJ c11nj = this.LLILZ;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLILZ = null;
    }

    @Override // X.InterfaceC1640420sn2
    public final MutableLiveData KI1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1640420sn2
    public final MutableLiveData V60() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1640420sn2
    public final MutableLiveData nN1() {
        return this.LL;
    }

    public BaseInfoStickerStateViewModel(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.LL = new MutableLiveData<>();
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILLL = new MutableLiveData<>();
    }

    @Override // X.InterfaceC1640420sn2
    public final void r22(DATA data) {
        LinkedHashMap linkedHashMap;
        if (isDestroyed()) {
            return;
        }
        Map<DATA, Pair<EnumC1641420soe, Integer>> value = this.LL.getValue();
        if (value != null && value.containsKey(data)) {
            return;
        }
        Map<DATA, Pair<EnumC1641420soe, Integer>> value2 = this.LL.getValue();
        if (value2 != null) {
            linkedHashMap = new LinkedHashMap(value2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(data, new Pair(EnumC1641420soe.UNKNOWN, 0));
        this.LL.setValue(linkedHashMap);
        InterfaceC420801kM interfaceC420801kMLJJLL = vQ2(data).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 116), new AfS159S0200000_25(this, data, 2));
        C11NJ c11nj = this.LLILZ;
        if (c11nj == null) {
            c11nj = new C11NJ();
            this.LLILZ = c11nj;
        }
        c11nj.LIZ(interfaceC420801kMLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void wQ2(MutableLiveData mutableLiveData, Object obj) {
        ArrayList arrayList;
        Collection collection;
        C0LCS c0lcs = (C0LCS) mutableLiveData.getValue();
        if (c0lcs != null && (collection = (Collection) c0lcs.LIZIZ()) != null) {
            arrayList = new ArrayList(collection);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(obj);
        mutableLiveData.setValue(new C0LCS(arrayList));
    }
}
