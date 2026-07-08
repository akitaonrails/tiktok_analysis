package com.ss.android.ugc.aweme.history;

import X.AbstractC1053500dWO;
import X.C0NQJ;
import X.C0PEM;
import X.C1053540dWS;
import X.C1053550dWT;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1807670x8n;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2286608xc;
import X.C23250099c;
import X.C289060BUq;
import X.InterfaceC2217461Bqa;
import Y.AComparatorS35S0000000_16;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebHistoryViewModel extends AndroidViewModel {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public List<AdWebHistoryEntity> LL;
    public final MutableLiveData<List<AbstractC1053500dWO>> LLILLJJLI;
    public final MutableLiveData<List<AbstractC1053500dWO>> LLILLL;
    public final MutableLiveData<List<AbstractC1053500dWO>> LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final C0NQJ LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public volatile C1053550dWT LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdWebHistoryViewModel.class, "historyManager", "getHistoryManager()Lcom/ss/android/ugc/aweme/history/AdWebHistoryManager;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C1053550dWT vQ2() {
        C1053550dWT c1053550dWT = this.LLJILJIL;
        if (c1053550dWT == null) {
            synchronized (this) {
                c1053550dWT = this.LLJILJIL;
                if (c1053550dWT == null) {
                    C1053550dWT c1053550dWT2 = (C1053550dWT) C1807670x8n.LJJJJI();
                    this.LLJILJIL = c1053550dWT2;
                    return c1053550dWT2;
                }
            }
        }
        return c1053550dWT;
    }

    public AdWebHistoryViewModel(Application application) {
        super(application);
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILLL = new MutableLiveData<>();
        this.LLILZ = new MutableLiveData<>();
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = new C0NQJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1053590dWX
            if (r0 == 0) goto L7b
            r5 = r7
            X.0dWX r5 = (X.C1053590dWX) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L61
            if (r0 != r3) goto L81
            X.C155000ia.LIZIZ(r4)
        L22:
            java.util.List r4 = (java.util.List) r4
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AdWebHistoryViewModel loadFirstPageFromLocal mLocalNewData size "
            r2.append(r0)
            java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity> r0 = r6.LL
            r1 = 0
            if (r0 == 0) goto L5f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L3c:
            r2.append(r0)
            java.lang.String r0 = " localData size: "
            r2.append(r0)
            if (r4 == 0) goto L4e
            int r0 = r4.size()
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
        L4e:
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            if (r4 == 0) goto L5c
            r6.zQ2(r4, r3, r3)
            r0 = 0
            r6.LLIZ = r0
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            r0 = r1
            goto L3c
        L61:
            X.C155000ia.LIZIZ(r4)
            X.0dWT r0 = r6.vQ2()
            java.util.List r0 = r0.LJ()
            r6.LL = r0
            X.0dWT r0 = r6.vQ2()
            r5.LLILLL = r3
            java.lang.Object r4 = r0.LJFF(r5)
            if (r4 != r1) goto L22
            return r1
        L7b:
            X.0dWX r5 = new X.0dWX
            r5.<init>(r6, r7)
            goto L12
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.history.AdWebHistoryViewModel.xQ2(X.05Vn):java.lang.Object");
    }

    public final void yQ2(long j) {
        if (this.LLIZ) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1053540dWS(this, j, null), 2);
    }

    public final Unit wQ2(AdWebHistoryListCommonResponse adWebHistoryListCommonResponse, boolean z) {
        List<AdWebHistoryEntity> list;
        long jLongValue;
        boolean zBooleanValue;
        Boolean bool;
        Long l;
        List<AdWebHistoryEntity> list2;
        Pair pair;
        Integer numLJ = null;
        if (C289060BUq.LIZ()) {
            List<AdWebHistoryEntity> listLJ = this.LL;
            if (listLJ == null) {
                listLJ = vQ2().LJ();
            }
            if (adWebHistoryListCommonResponse == null || (list2 = adWebHistoryListCommonResponse.adWebHistoryEntities) == null) {
                list2 = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (AdWebHistoryEntity adWebHistoryEntity : list2) {
                if (adWebHistoryEntity != null) {
                    arrayList.add(new Pair(adWebHistoryEntity.url, adWebHistoryEntity.requestTime));
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (AdWebHistoryEntity adWebHistoryEntity2 : listLJ) {
                AdWebHistoryEntity adWebHistoryEntity3 = adWebHistoryEntity2;
                if (adWebHistoryEntity3 != null) {
                    pair = new Pair(adWebHistoryEntity3.url, adWebHistoryEntity3.requestTime);
                } else {
                    pair = null;
                }
                if (!C13LP.LJJJJ(pair, setLLIIJI)) {
                    arrayList2.add(adWebHistoryEntity2);
                }
            }
            List<AdWebHistoryEntity> listLJLIL = C13LP.LJLIL(list2, arrayList2);
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS35S0000000_16(5), listLJLIL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleServerResponse LogicOptimize localNewData size : ");
            sbLIZ.append(C2286608xc.LJ(listLJ.size()));
            sbLIZ.append(" serverData size: ");
            sbLIZ.append(C2286608xc.LJ(list2.size()));
            sbLIZ.append(" sortedMergedData size : ");
            if (listLJLLLL != null) {
                numLJ = C2286608xc.LJ(listLJLLLL.size());
            }
            sbLIZ.append(numLJ);
            C2188811AlT.LIZIZ(sbLIZ);
            zQ2(listLJLIL, z, false);
        } else {
            if (adWebHistoryListCommonResponse != null) {
                list = adWebHistoryListCommonResponse.adWebHistoryEntities;
            } else {
                list = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleServerResponse old logic serverData size :");
            if (list != null) {
                numLJ = C2286608xc.LJ(list.size());
            }
            sbLIZ2.append(numLJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            zQ2(list, z, false);
        }
        if (adWebHistoryListCommonResponse != null && (l = adWebHistoryListCommonResponse.nextCursor) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LLILZIL = jLongValue;
        if (adWebHistoryListCommonResponse != null && (bool = adWebHistoryListCommonResponse.hasMore) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZLL = zBooleanValue;
        this.LLIZLLLIL.postValue(false);
        this.LLIZ = false;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity> r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.history.AdWebHistoryViewModel.zQ2(java.util.List, boolean, boolean):void");
    }
}
