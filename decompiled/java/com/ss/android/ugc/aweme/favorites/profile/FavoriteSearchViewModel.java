package com.ss.android.ugc.aweme.favorites.profile;

import X.C1206420hV2;
import X.C1206590hVJ;
import X.InterfaceC1206370hUx;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class FavoriteSearchViewModel extends ViewModel {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public final MutableLiveData<Boolean> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<C1206420hV2<Unit>> LLILLL;
    public final MutableLiveData LLILZ;
    public final MutableLiveData<String> LLILZIL;
    public final MutableLiveData LLILZLL;
    public volatile C1206590hVJ LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public InterfaceC1206370hUx LLJJIJI;

    public FavoriteSearchViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<C1206420hV2<Unit>> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData2;
        this.LLILZ = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>("");
        this.LLILZIL = mutableLiveData3;
        this.LLILZLL = mutableLiveData3;
        this.LLJI = -1;
    }
}
