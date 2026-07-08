package com.ss.android.ugc.aweme.prop.fragment;

import X.C036E;
import X.C1255920ims;
import X.C1261230ivR;
import X.C1389890mGx;
import X.C1401200mZC;
import X.C1401410mZX;
import X.C19EG;
import Y.AObserverS237S0100000_35;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes22.dex */
public final class EarlyLoadStickerDetailAwemeListFramgent extends StickerDetailAwemeListFramgent {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjctLiI2JjFiHELIOSDC4hJDwAJi43GzElKiQ2OgEpPS46JAQ7LCI2BCw/PQkhKSgrLCEn";

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void sS() {
        MutableLiveData mutableLiveData;
        C1261230ivR c1261230ivR = this.LLLIIII.get(this.LL);
        this.LLJJJJ = c1261230ivR;
        if (c1261230ivR == null) {
            C1261230ivR c1261230ivR2 = new C1261230ivR(this.LLILLJJLI, this, this, this.LLLILZJ, getArguments());
            this.LLJJJJ = c1261230ivR2;
            c1261230ivR2.setLoadMoreListener(this);
            C1261230ivR c1261230ivR3 = this.LLJJJJ;
            c1261230ivR3.mmLabel = "detail_list";
            c1261230ivR3.LLIZ = this.LLLFFI;
            this.LLLIIII.put(this.LL, c1261230ivR3);
        }
        this.LLJJIJIIJIL.setAdapter(this.LLJJJJ);
        this.LLJJJJ.LLIZ = this.LLLFFI;
        getActivity();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C1255920ims c1255920ims = this.LLLII.get(this.LL);
                C1401410mZX c1401410mZX = c1255920ims instanceof C1401410mZX ? (C1401410mZX) c1255920ims : null;
                C1401200mZC c1401200mZC = new C1401200mZC(this);
                if (c1401410mZX == null || (mutableLiveData = c1401410mZX.LLILZLL) == null) {
                    return;
                }
                mutableLiveData.observe(this, new AObserverS237S0100000_35(c1401200mZC, 0));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
    }
}
