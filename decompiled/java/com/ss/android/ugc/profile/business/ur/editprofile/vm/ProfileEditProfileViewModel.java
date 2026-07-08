package com.ss.android.ugc.profile.business.ur.editprofile.vm;

import X.AbstractC1906720ziY;
import X.C01GW;
import X.C11NJ;
import X.C1214280hhi;
import X.C15438062q;
import X.C452501pT;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditProfileViewModel extends ViewModel {
    public final C11NJ LL;
    public final List<Integer> LLILLJJLI = new ArrayList();
    public final List<Integer> LLILLL = new ArrayList();
    public final List<Integer> LLILZ = new ArrayList();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(423));
    public final MutableLiveData<String> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<List<Integer>> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJ = new MutableLiveData<>();
    public Map<Integer, String> LLJI;

    public ProfileEditProfileViewModel(C11NJ c11nj) {
        this.LL = c11nj;
    }

    public final void vQ2(AbstractC1906720ziY abstractC1906720ziY) {
        ((ArrayList) this.LLILLJJLI).clear();
        List<Integer> list = this.LLILLJJLI;
        List<InterfaceC1891350zJl> listLJII = abstractC1906720ziY.LLILZLL.LJII();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
        Iterator<InterfaceC1891350zJl> it2 = listLJII.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((C1214280hhi) it2.next()).LL));
        }
        ((ArrayList) list).addAll(new ArrayList(arrayList));
        if (((ArrayList) this.LLILZ).isEmpty()) {
            ((ArrayList) this.LLILZ).addAll(this.LLILLJJLI);
        }
    }
}
