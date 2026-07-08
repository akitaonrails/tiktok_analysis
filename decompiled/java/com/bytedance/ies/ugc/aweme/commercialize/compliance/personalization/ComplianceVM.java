package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.AbstractC746450TPv;
import X.C0TPL;
import X.C312690CNn;
import X.C786260Usq;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.common.datamodel.TTAEToggleModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.TherePartyDataControlModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.model.PersonalDetailsResponse;

/* JADX INFO: loaded from: classes13.dex */
public final class ComplianceVM extends ViewModel {
    public static int LLJI = 3;
    public final ICommercializeComplianceApi LL;
    public final MutableLiveData<TherePartyDataControlModel> LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData<Integer> LLILZIL;
    public final MutableLiveData<String> LLILZLL;
    public final MutableLiveData<TTAEToggleModel> LLIZ;
    public final MutableLiveData<PersonalDetailsResponse> LLIZLLLIL;
    public final MutableLiveData<AbstractC746450TPv> LLJ;

    public final void wQ2() {
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        this.LL.getPersonalDetails().enqueue(new C786260Usq(this, 1));
    }

    public ComplianceVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LL = C0TPL.LIZ();
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILLL = new MutableLiveData<>();
        this.LLILZ = new MutableLiveData<>();
        this.LLILZIL = new MutableLiveData<>();
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = new MutableLiveData<>();
    }

    public final void vQ2(boolean z) {
        TTAEToggleModel tTAEToggleModelCopy;
        MutableLiveData<TTAEToggleModel> mutableLiveData = this.LLIZ;
        TTAEToggleModel value = mutableLiveData.getValue();
        if (value != null) {
            tTAEToggleModelCopy = value.copy(Integer.valueOf(z ? 1 : 0), value.toggleDisplayStatus, value.toggleTitle, value.toggleDesc);
        } else {
            tTAEToggleModelCopy = null;
        }
        mutableLiveData.postValue(tTAEToggleModelCopy);
    }
}
