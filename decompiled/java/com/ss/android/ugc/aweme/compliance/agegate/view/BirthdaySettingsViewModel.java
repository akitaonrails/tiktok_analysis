package com.ss.android.ugc.aweme.compliance.agegate.view;

import X.AbstractC1836580xtQ;
import X.C1836590xtR;
import X.C1BNE;
import X.C2252321DDq;
import X.C23271099x;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class BirthdaySettingsViewModel extends ViewModel {
    public final MutableLiveData<Date> LL = new MutableLiveData<>();
    public final MutableLiveData<Date> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Date> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<String> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Date> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLJ = new MutableLiveData<>();
    public final MutableLiveData<String> LLJI = new MutableLiveData<>();
    public final C2252321DDq LLJIJIL;
    public final LiveData<AbstractC1836580xtQ> LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;

    public final Map<String, String> vQ2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("day", String.valueOf(this.LLJILJILJ));
        linkedHashMap.put("month", String.valueOf(this.LLJILLL));
        linkedHashMap.put("year", String.valueOf(this.LLJJ));
        linkedHashMap.put("selected_cnt", String.valueOf(Math.max(this.LLJILJILJ, Math.max(this.LLJILLL, this.LLJJ))));
        return linkedHashMap;
    }

    public BirthdaySettingsViewModel(boolean z) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1836590xtR(z));
        this.LLJIJIL = c2252321DDqLIZ;
        this.LLJILJIL = FlowLiveDataConversions.asLiveData(c2252321DDqLIZ, C23271099x.INSTANCE, Mp4ScreenVideoLoadTimeout.CONTROL);
    }
}
