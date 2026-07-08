package com.ss.android.ugc.profile.business.profile.background;

import X.C23250099c;
import X.C455760Hu2;
import X.EnumC455750Hu1;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ProfileBgVideoListViewModel extends ViewModel {
    public final MutableLiveData<List<Aweme>> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<EnumC455750Hu1> LLILLL;
    public final MutableLiveData LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public final MutableLiveData LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final List<Aweme> LLJI;

    public ProfileBgVideoListViewModel() {
        MutableLiveData<List<Aweme>> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<EnumC455750Hu1> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData2;
        this.LLILZ = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData3;
        this.LLILZLL = mutableLiveData3;
        this.LLIZLLLIL = true;
        this.LLJI = new ArrayList();
    }

    public final void vQ2(String str, String str2, boolean z) {
        EnumC455750Hu1 enumC455750Hu1;
        if (this.LLJ) {
            return;
        }
        if (!z && !this.LLIZLLLIL) {
            return;
        }
        this.LLJ = true;
        if (z) {
            this.LLIZ = 0L;
            this.LLIZLLLIL = true;
            ((ArrayList) this.LLJI).clear();
        }
        MutableLiveData<EnumC455750Hu1> mutableLiveData = this.LLILLL;
        if (z) {
            enumC455750Hu1 = EnumC455750Hu1.REFRESH_LOADING;
        } else {
            enumC455750Hu1 = EnumC455750Hu1.LOAD_MORE_LOADING;
        }
        mutableLiveData.setValue(enumC455750Hu1);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C455760Hu2(this, z, str, str2, null), 3);
    }
}
