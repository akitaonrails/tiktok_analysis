package com.ss.android.ugc.aweme.challenge.recommend;

import X.C10EU;
import X.C1445580nim;
import X.C15O7;
import X.C194503117t;
import X.C19774512Yl;
import X.InterfaceC194504117u;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagResponse;

/* JADX INFO: loaded from: classes30.dex */
public class RecommendHashTagViewModel extends ViewModel {
    public MutableLiveData<RecommendHashTagResponse> LL;

    public final void vQ2(C1445580nim c1445580nim) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.LL == null) {
            this.LL = new MutableLiveData<>();
        }
        C194503117t c194503117t = C194503117t.LIZ;
        MutableLiveData<RecommendHashTagResponse> mutableLiveData = this.LL;
        c194503117t.getClass();
        boolean zLJI = MethodIDManager.LJI(136609);
        if (C10EU.LJIIIIZZ()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        InterfaceC194504117u interfaceC194504117u = C194503117t.LIZIZ;
        if (c1445580nim != null) {
            str = c1445580nim.LIZLLL;
            str2 = c1445580nim.LIZIZ;
            str3 = c1445580nim.LIZ;
            str4 = c1445580nim.LIZJ;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        interfaceC194504117u.LIZ(str, str2, str3, str4).LJ(new C19774512Yl(mutableLiveData, 3), C15O7.LJIIIIZZ, null);
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }
}
