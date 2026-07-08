package com.ss.android.ugc.trill.setting;

import X.C747580TUe;
import X.InterfaceC19277510bN;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes29.dex */
public final class TranslationLanguageViewModel extends ViewModel {
    public MutableLiveData<ArrayList<C747580TUe>> LL;
    public final InterfaceC19277510bN LLILLJJLI;

    public TranslationLanguageViewModel() {
        InterfaceC19277510bN.LIZ.getClass();
        this.LLILLJJLI = (InterfaceC19277510bN) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ).build().retrofit.LIZ(InterfaceC19277510bN.class);
    }
}
