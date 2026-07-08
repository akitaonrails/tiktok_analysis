package com.ss.android.ugc.aweme.account.agegate.customdataforsdk;

import X.C118300cf;
import X.C1402305eH;
import X.C19251810Tk;
import X.C19258510Vz;
import X.C23250099c;
import X.C294540Bga;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService;
import com.ss.android.ugc.aweme.pns.agegate.NativeStoreVariables;
import java.util.Date;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class TTKCustomViewModel extends ViewModel {
    public final MutableLiveData<Date> LL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>(Boolean.FALSE);
    public final MutableLiveData<Integer> LLILLL = new MutableLiveData<>(null);
    public final MutableLiveData<Unit> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<C19258510Vz> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>();
    public boolean LLIZ;

    public final void N(boolean z) {
        int iIntValue;
        IPNSAgeFromStoreService iPNSAgeFromStoreServiceLJIJJ;
        NativeStoreVariables nativeStoreVariablesLJII;
        Integer num;
        if (C294540Bga.LIZ() && z) {
            this.LLILZLL.setValue(Boolean.TRUE);
            C118300cf c118300cf = new C118300cf();
            IAgeGateService iAgeGateService = (IAgeGateService) PluggableExtentionKt.pluggableSpi$default(IAgeGateService.class, false, false, false, 14, null);
            if (iAgeGateService != null && (iPNSAgeFromStoreServiceLJIJJ = iAgeGateService.LJIJJ()) != null && (nativeStoreVariablesLJII = iPNSAgeFromStoreServiceLJIJJ.LJII()) != null && (num = nativeStoreVariablesLJII.fallbackWaitDuration) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            c118300cf.element = iIntValue;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1402305eH(c118300cf, this, null), 3);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C19251810Tk(this, null), 3);
        }
    }
}
