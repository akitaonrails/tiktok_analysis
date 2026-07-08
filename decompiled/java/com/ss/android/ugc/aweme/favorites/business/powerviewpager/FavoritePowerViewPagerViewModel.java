package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import X.AnonymousClass0206;
import X.C01GW;
import X.C0OFL;
import X.C13BV;
import X.C13LP;
import X.C178100mJ;
import X.C286540BKy;
import X.C452501pT;
import X.C5182020e;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FavoritePowerViewPagerViewModel extends ViewModel {
    public List<? extends C0OFL> LL;
    public List<? extends C0OFL> LLILLJJLI;
    public final MutableLiveData<List<C0OFL>> LLILLL;
    public boolean LLILZ;
    public final MutableLiveData LLILZIL;
    public final MutableLiveData<String> LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    public final String vQ2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0OFL c0ofl : this.LL) {
            String str = c0ofl.LIZ().mobKey;
            Integer value = c0ofl.LL.getValue();
            linkedHashMap.put(str, Integer.valueOf(value != null ? value.intValue() : 0));
        }
        return C178100mJ.LIZJ(linkedHashMap);
    }

    public FavoritePowerViewPagerViewModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LL = c13bv;
        this.LLILLJJLI = c13bv;
        MutableLiveData<List<C0OFL>> mutableLiveData = new MutableLiveData<>();
        this.LLILLL = mutableLiveData;
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(187));
        this.LLIZLLLIL = C452501pT.LIZIZ(new C5182020e(this, 109));
    }

    public final String wQ2(int i) {
        C0OFL c0ofl;
        FavoriteTabItemV2 favoriteTabItemV2LIZ;
        String str;
        List list = (List) this.LLILZIL.getValue();
        if (list == null || (c0ofl = (C0OFL) C13LP.LJJJLZIJ(i, list)) == null || (favoriteTabItemV2LIZ = c0ofl.LIZ()) == null || (str = favoriteTabItemV2LIZ.mobKey) == null) {
            return "";
        }
        return str;
    }

    public final String xQ2(int i) {
        C0OFL c0ofl;
        FavoriteTabItemV2 favoriteTabItemV2LIZ;
        String str;
        List list = (List) this.LLILZIL.getValue();
        if (list == null || (c0ofl = (C0OFL) C13LP.LJJJLZIJ(i, list)) == null || (favoriteTabItemV2LIZ = c0ofl.LIZ()) == null || (str = favoriteTabItemV2LIZ.pageTitle) == null) {
            return "";
        }
        return str;
    }

    public final int yQ2(String str) {
        int i = 0;
        if (C286540BKy.LIZ()) {
            Iterator<? extends C0OFL> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(it2.next().LIZ().mobKey, str)) {
                    i++;
                } else {
                    return i;
                }
            }
        } else {
            List list = (List) this.LLILZIL.getValue();
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    if (!Intrinsics.LJFF(((C0OFL) it3.next()).LIZ().mobKey, str)) {
                        i++;
                    } else {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(X.C1206260hUm r20) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoritePowerViewPagerViewModel.zQ2(X.0hUm):void");
    }
}
