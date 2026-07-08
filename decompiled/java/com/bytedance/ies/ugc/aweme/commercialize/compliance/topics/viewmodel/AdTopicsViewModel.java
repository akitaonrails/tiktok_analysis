package com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.viewmodel;

import X.AbstractC746450TPv;
import X.C0TPL;
import X.C259800zU;
import X.C312690CNn;
import X.C786260Usq;
import X.InterfaceC594300NSq;
import Y.AObserverS125S0300000_12;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.PATopicsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.SensitiveTopicsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.viewmodel.AdTopicsViewModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public final class AdTopicsViewModel extends ViewModel {
    public static int LLILZLL = 3;
    public final MutableLiveData<PATopicsResponse> LL;
    public final MutableLiveData<SensitiveTopicsResponse> LLILLJJLI;
    public final MutableLiveData<AbstractC746450TPv> LLILLL;
    public final ICommercializeComplianceApi LLILZ;
    public final MediatorLiveData<Pair<PATopicsResponse, SensitiveTopicsResponse>> LLILZIL;

    public final void vQ2() {
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        this.LLILZ.getSensitiveTopics().enqueue(new C786260Usq(this, 6));
    }

    public AdTopicsViewModel() {
        MutableLiveData<PATopicsResponse> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        MutableLiveData<SensitiveTopicsResponse> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData2;
        this.LLILLL = new MutableLiveData<>();
        ICommercializeComplianceApi.LIZ.getClass();
        this.LLILZ = C0TPL.LIZ();
        MediatorLiveData<Pair<PATopicsResponse, SensitiveTopicsResponse>> mediatorLiveData = new MediatorLiveData<>();
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        mediatorLiveData.addSource(mutableLiveData, new AObserverS125S0300000_12(mediatorLiveData, c259800zU, c259800zU2, 12));
        mediatorLiveData.addSource(mutableLiveData2, new AObserverS125S0300000_12(mediatorLiveData, c259800zU2, c259800zU, 13));
        this.LLILZIL = mediatorLiveData;
    }

    public final void wQ2(final Integer num, final String str) {
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        this.LLILZ.getUserTopicsList(str, num).enqueue(new InterfaceC594300NSq<PATopicsResponse>() { // from class: X.0TPm
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<PATopicsResponse> c0x9s, Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getUserTopicsList onFailure: ");
                sbLIZ.append(th.getStackTrace());
                C1022620cia.LIZ("AdInferenceViewModel", C2188811AlT.LIZIZ(sbLIZ));
                int i = AdTopicsViewModel.LLILZLL;
                if (i > 0) {
                    AdTopicsViewModel.LLILZLL = i - 1;
                    this.wQ2(num, str);
                }
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<PATopicsResponse> c0x9s, C0X52<PATopicsResponse> c0x52) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adTopicId: ");
                sbLIZ.append(str);
                sbLIZ.append(",  adTopicSection: ");
                sbLIZ.append(num);
                sbLIZ.append(" getUserTopicsList onResponse: ");
                sbLIZ.append(c0x52.LIZIZ);
                C1022620cia.LIZ("AdInferenceViewModel", C2188811AlT.LIZIZ(sbLIZ));
                if (c0x52.LIZJ()) {
                    this.LL.setValue(c0x52.LIZIZ);
                    AdTopicsViewModel.LLILZLL = 3;
                    return;
                }
                int i = AdTopicsViewModel.LLILZLL;
                if (i <= 0) {
                    return;
                }
                AdTopicsViewModel.LLILZLL = i - 1;
                this.wQ2(num, str);
            }
        });
    }
}
