package com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data;

import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.InterfaceC1631620sYq;
import X.InterfaceC192001109n;
import X.InterfaceC626120Oh8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseSettingDataViewModel extends ViewModel {
    public Integer LL;
    public Integer LLILLJJLI;
    public final MutableLiveData<Integer> LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final CopyOnWriteArrayList<InterfaceC192001109n> LLILZIL;

    public abstract C11NZ<? extends BaseResponse> vQ2(int i);

    public BaseSettingDataViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(-1);
        this.LLILLL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this.LLILZ = mutableLiveData2;
        this.LLILZIL = new CopyOnWriteArrayList<>();
    }

    public void wQ2(final int i, C11NZ<? extends BaseResponse> c11nz, final InterfaceC1631620sYq<? super Integer, ? super Integer, ? super BaseResponse, Unit> interfaceC1631620sYq, final InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Throwable, Unit> interfaceC1631620sYq2) {
        Integer value = this.LLILLL.getValue();
        if (value != null && value.intValue() == i) {
            return;
        }
        this.LL = this.LLILLL.getValue();
        if (c11nz == null) {
            c11nz = vQ2(i);
        }
        c11nz.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<BaseResponse>() { // from class: X.109Z
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                int iIntValue;
                BaseSettingDataViewModel baseSettingDataViewModel = this.LL;
                Integer num = baseSettingDataViewModel.LLILLJJLI;
                if (num != null) {
                    num.intValue();
                    baseSettingDataViewModel.LLILLL.setValue(baseSettingDataViewModel.LLILLJJLI);
                    baseSettingDataViewModel.LLILLJJLI = null;
                }
                BaseSettingDataViewModel baseSettingDataViewModel2 = this.LL;
                int i2 = i;
                Iterator<InterfaceC192001109n> it2 = baseSettingDataViewModel2.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(i2, th);
                }
                InterfaceC1631620sYq<Integer, Integer, Throwable, Unit> interfaceC1631620sYq3 = interfaceC1631620sYq2;
                if (interfaceC1631620sYq3 != null) {
                    Integer num2 = this.LL.LL;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    interfaceC1631620sYq3.invoke(Integer.valueOf(iIntValue), Integer.valueOf(i), th);
                }
                this.LL.LLILZ.postValue(Boolean.FALSE);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(BaseResponse baseResponse) {
                int iIntValue;
                BaseResponse baseResponse2 = baseResponse;
                BaseSettingDataViewModel baseSettingDataViewModel = this.LL;
                baseSettingDataViewModel.LLILLJJLI = null;
                int i2 = i;
                Iterator<InterfaceC192001109n> it2 = baseSettingDataViewModel.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(i2, baseResponse2);
                }
                InterfaceC1631620sYq<Integer, Integer, BaseResponse, Unit> interfaceC1631620sYq3 = interfaceC1631620sYq;
                if (interfaceC1631620sYq3 != null) {
                    Integer num = this.LL.LL;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    interfaceC1631620sYq3.invoke(Integer.valueOf(iIntValue), Integer.valueOf(i), baseResponse2);
                }
                this.LL.LLILZ.postValue(Boolean.FALSE);
            }
        });
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = this.LLILLL.getValue();
        }
        this.LLILZ.postValue(Boolean.TRUE);
        this.LLILLL.postValue(Integer.valueOf(i));
    }
}
