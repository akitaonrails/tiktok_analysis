package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel;

import X.C1264304x7;
import X.C1537720q7O;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHubVM extends ViewModel {
    public static final /* synthetic */ int LLJJIII = 0;
    public Map<String, String> LL;
    public final MutableLiveData<Map<String, Object>> LLILLJJLI = new MutableLiveData<>();
    public C1264304x7 LLILLL;
    public long LLILZ;
    public final MutableLiveData<Long> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final MutableLiveData LLIZLLLIL;
    public final MutableLiveData<Integer> LLJ;
    public final MutableLiveData<Boolean> LLJI;
    public final MutableLiveData LLJIJIL;
    public SearchComponentCenter.TopBarComponent.ISearchTopBarAbility LLJILJIL;
    public C1537720q7O LLJILJILJ;
    public long LLJILLL;
    public DynamicPatch LLJJ;
    public String LLJJI;

    public SearchHubVM() {
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(this.LLILZ));
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LLIZ = mutableLiveData2;
        this.LLIZLLLIL = mutableLiveData2;
        this.LLJ = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(bool);
        this.LLJI = mutableLiveData3;
        this.LLJIJIL = mutableLiveData3;
        this.LLJJI = "";
    }

    public static EntityCardTitle vQ2(String str) {
        try {
            return (EntityCardTitle) GsonProtectorUtils.fromJson(((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson(), str, EntityCardTitle.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void wQ2(int i) {
        this.LLJ.setValue(Integer.valueOf(i));
    }
}
