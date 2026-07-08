package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel;

import X.C0KCJ;
import X.C0KDG;
import X.C0KDH;
import X.C0KDK;
import X.C0KDP;
import X.C0KDZ;
import X.C0KFK;
import X.C0KLA;
import X.C13LP;
import Y.AObserverS172S0200000_7;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class UpDowngradePackageViewModel extends ViewModel {
    public final C0KFK LL = new C0KFK();
    public final MutableLiveData<C0KLA> LLILLJJLI;
    public final LiveData<C0KCJ> LLILLL;
    public final MutableLiveData<Map<String, C0KDH>> LLILZ;
    public Function0<Unit> LLILZIL;
    public final MediatorLiveData<C0KCJ> LLILZLL;
    public final MutableLiveData<C0KDK> LLIZ;
    public final LiveData<PGCSubscriptionProductDetailWithTemplateInfo> LLIZLLLIL;
    public final MutableLiveData<C0KDP> LLJ;
    public final MutableLiveData<C0KDZ> LLJI;
    public final MutableLiveData<C0KDG> LLJIJIL;

    public UpDowngradePackageViewModel() {
        MutableLiveData<C0KLA> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        LiveData<C0KCJ> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new AwS586S0100000_7(this, 291));
        this.LLILLL = liveDataSwitchMap;
        MutableLiveData<Map<String, C0KDH>> mutableLiveData2 = new MutableLiveData<>();
        this.LLILZ = mutableLiveData2;
        this.LLILZIL = AFwS193S0000000_7.get$arr$(177);
        MediatorLiveData<C0KCJ> mediatorLiveData = new MediatorLiveData<>();
        this.LLILZLL = mediatorLiveData;
        mediatorLiveData.addSource(liveDataSwitchMap, new AObserverS172S0200000_7(mediatorLiveData, this, 1));
        mediatorLiveData.addSource(mutableLiveData2, new AObserverS172S0200000_7(mediatorLiveData, this, 2));
        MutableLiveData<C0KDK> mutableLiveData3 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData3;
        this.LLIZLLLIL = Transformations.switchMap(mutableLiveData3, new AwS586S0100000_7(this, 292));
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>();
    }

    public final List<PGCSubscriptionProductDetailWithTemplateInfo> wQ2(List<PGCSubscriptionProductDetailWithTemplateInfo> list) {
        Set<String> setKeySet;
        String str;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo : list) {
                PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo;
                Map<String, C0KDH> value = this.LLILZ.getValue();
                if (value != null && (setKeySet = value.keySet()) != null) {
                    TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
                    if (templateInfo != null) {
                        str = templateInfo.packageId;
                    } else {
                        str = null;
                    }
                    if (C13LP.LJJJJ(str, setKeySet)) {
                        arrayList.add(pGCSubscriptionProductDetailWithTemplateInfo);
                    }
                }
            }
            return new ArrayList(arrayList);
        }
        return new ArrayList();
    }

    public final void vQ2(Boolean bool, Boolean bool2, String str, Boolean bool3, RefundInfo refundInfo, Integer num) {
        C0KDG value = this.LLJIJIL.getValue();
        if (value == null) {
            value = new C0KDG(0);
        }
        if (bool != null) {
            value.LIZIZ = bool.booleanValue();
        }
        if (bool2 != null) {
            value.LIZJ = bool2.booleanValue();
        }
        if (str != null && str.length() > 0) {
            value.LIZLLL = str;
        }
        if (bool3 != null) {
            value.LJ = bool3.booleanValue();
        }
        if (refundInfo != null) {
            value.LJI = refundInfo;
        }
        if (num != null) {
            value.LJFF = num.intValue();
        }
        this.LLJIJIL.setValue(value);
    }
}
