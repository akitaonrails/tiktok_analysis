package com.ss.android.ugc.aweme.legacy.select;

import X.C054G;
import X.C0PEM;
import X.C1486105rn;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectedCardVM extends ViewModel {
    public String LL = "";
    public String LLILLJJLI = "";
    public boolean LLILLL;
    public final C23119094b LLILZ;
    public final C054G LLILZIL;
    public final IUserService LLILZLL;
    public final NextLiveData<List<C1486105rn>> LLIZ;
    public final NextLiveData LLIZLLLIL;
    public final NextLiveData<Integer> LLJ;
    public final NextLiveData LLJI;
    public final NextLiveData<List<IMUser>> LLJIJIL;
    public final NextLiveData LLJILJIL;
    public final NextLiveData<Boolean> LLJILJILJ;
    public final NextLiveData LLJILLL;
    public final Set<String> LLJJ;

    public SelectedCardVM() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LLILZ = c23119094bLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZIL = C2296808zG.LIZ(C2107308Nj.LIZ.plus(c23119094bLIZ));
        this.LLILZLL = (IUserService) ServiceManager.get().getService(IUserService.class);
        NextLiveData<List<C1486105rn>> nextLiveData = new NextLiveData<>();
        this.LLIZ = nextLiveData;
        this.LLIZLLLIL = nextLiveData;
        NextLiveData<Integer> nextLiveData2 = new NextLiveData<>();
        this.LLJ = nextLiveData2;
        this.LLJI = nextLiveData2;
        NextLiveData<List<IMUser>> nextLiveData3 = new NextLiveData<>();
        this.LLJIJIL = nextLiveData3;
        this.LLJILJIL = nextLiveData3;
        NextLiveData<Boolean> nextLiveData4 = new NextLiveData<>();
        this.LLJILJILJ = nextLiveData4;
        this.LLJILLL = nextLiveData4;
        this.LLJJ = new LinkedHashSet();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZ.LIZIZ(null);
    }
}
