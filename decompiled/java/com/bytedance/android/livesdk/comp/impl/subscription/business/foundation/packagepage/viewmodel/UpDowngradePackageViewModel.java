package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel;

import X.C0KFB;
import X.C0KIP;
import X.C0KJ5;
import X.C0KJJ;
import X.C0KJX;
import X.C13LP;
import X.C514190KEn;
import X.C514580KGa;
import X.C514830KGz;
import X.C515260KIq;
import X.C515450KJj;
import X.EnumC513810KDb;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class UpDowngradePackageViewModel extends ViewModel {
    public final C0KJJ LL = new C0KJJ();
    public final MutableLiveData<C0KJX> LLILLJJLI;
    public final LiveData<C514830KGz> LLILLL;
    public final MutableLiveData<Map<String, C0KFB>> LLILZ;
    public Function0<Unit> LLILZIL;
    public final MediatorLiveData<C514830KGz> LLILZLL;
    public final MutableLiveData<C0KJ5> LLIZ;
    public final LiveData<SubscriptionProductDetailWithTemplateInfo> LLIZLLLIL;
    public final MutableLiveData<C0KIP> LLJ;
    public final MutableLiveData<EnumC513810KDb> LLJI;
    public final MutableLiveData<C514190KEn> LLJIJIL;

    public UpDowngradePackageViewModel() {
        MutableLiveData<C0KJX> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        LiveData<C514830KGz> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new C515260KIq(this));
        this.LLILLL = liveDataSwitchMap;
        MutableLiveData<Map<String, C0KFB>> mutableLiveData2 = new MutableLiveData<>();
        this.LLILZ = mutableLiveData2;
        this.LLILZIL = new C515450KJj();
        final MediatorLiveData<C514830KGz> mediatorLiveData = new MediatorLiveData<>();
        this.LLILZLL = mediatorLiveData;
        mediatorLiveData.addSource(liveDataSwitchMap, new Observer() { // from class: X.0KGb
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C514830KGz c514830KGz = (C514830KGz) obj;
                if (mediatorLiveData.getValue() == null) {
                    mediatorLiveData.setValue(new C514830KGz(c514830KGz.LIZ, c514830KGz.LIZIZ, c514830KGz.LIZJ, null, true, false, 40));
                } else {
                    C514830KGz value = mediatorLiveData.getValue();
                    if (value != null) {
                        value.LIZ = this.wQ2(c514830KGz.LIZ);
                        value.LIZIZ = c514830KGz.LIZIZ;
                        value.LIZJ = c514830KGz.LIZJ;
                        value.LJ = true;
                    }
                    mediatorLiveData.setValue(value);
                }
                this.LLILZIL.invoke();
            }
        });
        mediatorLiveData.addSource(mutableLiveData2, new Observer() { // from class: X.0KGd
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Map<String, C0KFB> map = (Map) obj;
                if (mediatorLiveData.getValue() == null) {
                    mediatorLiveData.setValue(new C514830KGz(null, null, null, map, false, true, 23));
                    return;
                }
                C514830KGz value = mediatorLiveData.getValue();
                if (value != null) {
                    value.LIZ = this.wQ2(value.LIZ);
                    value.LIZLLL = map;
                    value.LJFF = true;
                }
                mediatorLiveData.setValue(value);
            }
        });
        MutableLiveData<C0KJ5> mutableLiveData3 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData3;
        this.LLIZLLLIL = Transformations.switchMap(mutableLiveData3, new C514580KGa(this));
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>();
    }

    public final List<SubscriptionProductDetailWithTemplateInfo> wQ2(List<SubscriptionProductDetailWithTemplateInfo> list) {
        Set<String> setKeySet;
        String str;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo : list) {
                SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo2 = subscriptionProductDetailWithTemplateInfo;
                Map<String, C0KFB> value = this.LLILZ.getValue();
                if (value != null && (setKeySet = value.keySet()) != null) {
                    TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
                    if (templateInfo != null) {
                        str = templateInfo.packageId;
                    } else {
                        str = null;
                    }
                    if (C13LP.LJJJJ(str, setKeySet)) {
                        arrayList.add(subscriptionProductDetailWithTemplateInfo);
                    }
                }
            }
            return new ArrayList(arrayList);
        }
        return new ArrayList();
    }

    public final void vQ2(Boolean bool, Boolean bool2, String str, Boolean bool3, RefundInfo refundInfo, Integer num) {
        C514190KEn value = this.LLJIJIL.getValue();
        if (value == null) {
            value = new C514190KEn(0);
        }
        if (bool != null) {
            value.LIZ = bool.booleanValue();
        }
        if (bool2 != null) {
            value.LIZIZ = bool2.booleanValue();
        }
        if (str != null && str.length() > 0) {
            value.LIZJ = str;
        }
        if (bool3 != null) {
            value.LIZLLL = bool3.booleanValue();
        }
        if (num != null) {
            value.LJ = num.intValue();
        }
        this.LLJIJIL.setValue(value);
    }
}
