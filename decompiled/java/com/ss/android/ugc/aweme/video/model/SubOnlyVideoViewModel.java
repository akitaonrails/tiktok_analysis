package com.ss.android.ugc.aweme.video.model;

import X.AbstractC316870CbV;
import X.C098200Yq;
import X.C0KBN;
import X.C0M4M;
import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C1906060zhU;
import X.C1906070zhV;
import X.C2189821An6;
import X.C326190CqX;
import X.C553680Lna;
import X.C562260M3k;
import X.C627660Ojc;
import X.EnumC492500JTc;
import X.EnumC562220M3g;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SubOnlyVideoViewModel extends BaseDetailShareVM<C326190CqX, C1906070zhV, C1906060zhU> {
    public boolean LLILZIL;
    public long LLILZLL;
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public EnumC492500JTc LLJ = EnumC492500JTc.MANAGEMENT_PAGE;
    public C1906060zhU LLJI;
    public final MutableLiveData<Integer> LLJIJIL;
    public final MutableLiveData LLJILJIL;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 97;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326190CqX(0);
    }

    public SubOnlyVideoViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LLJIJIL = mutableLiveData;
        this.LLJILJIL = mutableLiveData;
    }

    public static List DQ2() {
        List listSingletonList;
        C553680Lna c553680LnaQueryDraftsInfo = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().queryDraftsInfo(new C0M4M(true, false, EnumC562220M3g.NORMAL, (C562260M3k) null, 24));
        AwemeDraft awemeDraft = c553680LnaQueryDraftsInfo.LIZIZ;
        return (awemeDraft == null || (listSingletonList = Collections.singletonList(new C1906070zhV(null, null, null, null, null, Integer.valueOf(c553680LnaQueryDraftsInfo.LIZ), awemeDraft, EnumC492500JTc.MANAGEMENT_PAGE))) == null) ? C13BV.INSTANCE : listSingletonList;
    }

    public final List<InterfaceC1891350zJl> BQ2(List<? extends Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Aweme aweme : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    boolean z = this.LLILZIL;
                    long j = this.LLILZLL;
                    arrayList.add(new C1906070zhV(aweme, Boolean.valueOf(z), Long.valueOf(j), this.LLIZ, this.LLIZLLLIL, null, null, this.LLJ));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1906070zhV> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 153));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1906060zhU>> interfaceC1364105Vn) {
        return CQ2(new C1906060zhU(this.LLILZIL, this.LLILZLL, this.LLIZ), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = ((C1906070zhV) it2.next()).LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C1906070zhV) interfaceC1891350zJl).LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.C1906060zhU r15, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1906060zhU>> r16) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel.CQ2(X.0zhU, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return CQ2((C1906060zhU) obj, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        Object c098200Yq;
        Long l;
        super.request(i, c2189821An6, i2, z);
        try {
            String uid = c2189821An6.getUid();
            if (uid != null) {
                c098200Yq = Long.valueOf(CastLongProtector.parseLong(uid));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq) && (l = (Long) c098200Yq) != null) {
            long jLongValue = l.longValue();
            String secUid = c2189821An6.getSecUid();
            if (secUid != null) {
                this.LLILZIL = false;
                this.LLILZLL = jLongValue;
                this.LLIZ = secUid;
                AssemSingleListViewModel.refreshInner$default(this, null, null, 3, null);
            }
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1906060zhU yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        C1906060zhU c1906060zhU = this.LLJI;
        if (c1906060zhU == null) {
            return new C1906060zhU(this.LLILZIL, this.LLILZLL, this.LLIZ);
        }
        return c1906060zhU;
    }
}
