package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC2238408pq;
import X.AnonymousClass0956;
import X.C01GW;
import X.C05RV;
import X.C0CNO;
import X.C0PEM;
import X.C14EU;
import X.C1618770sE7;
import X.C1619080sEc;
import X.C1665906fh;
import X.C1720106oR;
import X.C1904220zeW;
import X.C1DFH;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C880600Ygc;
import X.C880610Ygd;
import X.C880720Ygo;
import X.C889810YvT;
import X.C889820YvU;
import X.C889840YvW;
import X.C889850YvX;
import X.C889860YvY;
import X.C889870YvZ;
import X.C889900Yvc;
import X.C889910Yvd;
import X.C889930Yvf;
import X.C890330YwJ;
import X.EnumC880480YgQ;
import X.InterfaceC497601wk;
import X.InterfaceC889970Yvj;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS122S0101000_14;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS66S0210000_14;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class InboxFilterBarViewModel extends AssemViewModel<C889840YvW> implements InboxAbilityCenter$IInboxImFilterAbility, InterfaceC889970Yvj {
    public static C889860YvY LLILZIL;
    public final MutableLiveData<Pair<FilterTabType, Set<EnumC880480YgQ>>> LL = new MutableLiveData<>();
    public C889850YvX LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public AnonymousClass0956 LLILZ;

    @Override // X.InterfaceC889970Yvj
    public final void QH0() {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility
    public final void Qe0() {
        String strLIZIZ;
        String str;
        C889930Yvf.LIZ.getClass();
        C889900Yvc c889900Yvc = C889930Yvf.LJI;
        C889930Yvf.LJI = null;
        if (c889900Yvc != null) {
            gL2(c889900Yvc.LIZ, c889900Yvc.LIZIZ, c889900Yvc.LIZJ);
            return;
        }
        C889850YvX c889850YvX = this.LLILLJJLI;
        if ((c889850YvX == null || c889850YvX.LIZLLL == null || c889850YvX == null || c889850YvX.LIZJ == null) && (strLIZIZ = C1618770sE7.LIZIZ(true)) != null) {
            C889850YvX c889850YvX2 = this.LLILLJJLI;
            if (c889850YvX2 == null || (str = c889850YvX2.LIZLLL) == null) {
                str = "go_back_tab";
            }
            yQ2(this, null, null, strLIZIZ, str, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility
    public final void Xg2() {
        wQ2(true, C889930Yvf.LIZ.LJI().getSecond());
    }

    @Override // X.InterfaceC889970Yvj
    public final void eV0() {
        C889850YvX c889850YvX = this.LLILLJJLI;
        this.LLILLJJLI = c889850YvX != null ? C889850YvX.LIZ(c889850YvX, true, C889930Yvf.LIZ.LIZJ(), C1618770sE7.LIZIZ(false), "default_land", null, null, false, 144) : null;
        LLILZIL = new C889860YvY();
        C889840YvW c889840YvWDefaultState = defaultState();
        setState(new AwS593S0100000_14(c889840YvWDefaultState, 293));
        zQ2(c889840YvWDefaultState.LLILLL.getFirst(), c889840YvWDefaultState.LLILZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.ss.android.ugc.aweme.inbox.filter.FilterTabType, java.lang.String] */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    public final C889840YvW defaultState() {
        String strLIZIZ;
        String str;
        FilterTabType filterTabType;
        EnumC880480YgQ enumC880480YgQLIZJ;
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        c889930Yvf.getClass();
        C889900Yvc c889900Yvc = C889930Yvf.LJI;
        C05RV c05rv = 0;
        C889930Yvf.LJI = null;
        List<FilterTabType> listLJFF = c889930Yvf.LJFF();
        ArrayList arrayList = new ArrayList();
        for (FilterTabType filterTabType2 : listLJFF) {
            FilterTabType.Companion.getClass();
            if (!FilterTabType.NOT_DISPLAY_TAB_TYPE_SET.contains(filterTabType2)) {
                arrayList.add(filterTabType2);
            }
        }
        IMChatListApi.LJJIII.getClass();
        List<FilterTabType> listLIZ = C890330YwJ.LIZ().LJJIZ().LIZ();
        if (listLIZ != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!listLIZ.contains(obj)) {
                    if (obj == (c889900Yvc != null ? c889900Yvc.LIZ : null)) {
                    }
                }
                arrayList2.add(obj);
            }
            arrayList = arrayList2;
        }
        C889850YvX c889850YvX = this.LLILLJJLI;
        if (c889850YvX == null || !c889850YvX.LIZ) {
            ?? r9 = 0;
            c889850YvX = new C889850YvX(C1618770sE7.LIZIZ(true), r9, r9, false, 123);
            c05rv = r9;
        }
        if ((c889900Yvc == null || (strLIZIZ = c889900Yvc.LIZIZ) == null) && (strLIZIZ = c889850YvX.LIZJ) == null) {
            strLIZIZ = C1618770sE7.LIZIZ(true);
        }
        if (c889900Yvc == null || (str = c889900Yvc.LIZJ) == null) {
            str = "default_land";
        }
        this.LLILLJJLI = C889850YvX.LIZ(c889850YvX, false, c05rv, strLIZIZ, str, c05rv, c05rv, false, 227);
        Pair<FilterTabType, Set<EnumC880480YgQ>> pairLJII = (c889900Yvc == null || (filterTabType = c889900Yvc.LIZ) == null || !arrayList.contains(filterTabType) || (enumC880480YgQLIZJ = C880600Ygc.LIZJ(filterTabType)) == null) ? C889930Yvf.LIZ.LJII() : new Pair<>(filterTabType, Collections.singleton(enumC880480YgQLIZJ));
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C889910Yvd c889910YvdLIZ = C880600Ygc.LIZ((FilterTabType) it2.next());
            if (c889910YvdLIZ != null) {
                arrayList3.add(c889910YvdLIZ);
            }
        }
        List<EnumC880480YgQ> listLJ = C889930Yvf.LIZ.LJ(arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator<EnumC880480YgQ> it3 = listLJ.iterator();
        while (it3.hasNext()) {
            C880720Ygo c880720YgoLIZ = C880610Ygd.LIZ(it3.next());
            if (c880720YgoLIZ != null) {
                arrayList4.add(c880720YgoLIZ);
            }
        }
        C889840YvW c889840YvW = new C889840YvW(arrayList3, arrayList4, new Pair(pairLJII.getFirst(), Boolean.TRUE), pairLJII.getSecond(), null);
        zQ2(pairLJII.getFirst(), pairLJII.getSecond());
        return c889840YvW;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
        C889930Yvf.LIZ.getClass();
        ((CopyOnWriteArrayList) C889930Yvf.LIZIZ.getValue()).remove(this);
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        LLILZIL = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EventBus.LIZLLL().LJIJJ(this);
        C889930Yvf.LIZ.getClass();
        C01GW c01gw = C889930Yvf.LIZIZ;
        if (!((CopyOnWriteArrayList) c01gw.getValue()).contains(this)) {
            ((CopyOnWriteArrayList) c01gw.getValue()).add(this);
        }
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        this.LLILLL = C23250099c.LIZLLL(assemVMScope, abstractC2238408pq, null, new C889820YvU(this, null), 2);
        this.LLILZ = C23250099c.LIZLLL(getAssemVMScope(), abstractC2238408pq, null, new C889810YvT(this, null), 2);
        LLILZIL = new C889860YvY();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility
    public final MutableLiveData jp2() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility
    public final Boolean Ef2(Pair<? extends FilterTabType, ? extends Set<? extends EnumC880480YgQ>> pair) {
        if (pair != null) {
            FilterTabType first = pair.getFirst();
            C889930Yvf c889930Yvf = C889930Yvf.LIZ;
            boolean z = true;
            if (first == c889930Yvf.LJI().getFirst() && Intrinsics.LJFF(pair.getSecond(), c889930Yvf.LJI().getSecond())) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChange(C1619080sEc c1619080sEc) {
        int iLJJJJLI;
        if (C1665906fh.LIZJ.LJIIIIZZ()) {
            C1904220zeW.LL.getClass();
            iLJJJJLI = C1904220zeW.LJJJJL();
        } else {
            C1904220zeW.LL.getClass();
            iLJJJJLI = C1904220zeW.LJJJJLI();
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive NoticeCountChangedEvent = ");
        sbLIZ.append(iLJJJJLI);
        C1720106oR.LJI("InboxFilterBarViewModel", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS122S0101000_14(this, iLJJJJLI, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01b8 A[PHI: r9
      0x01b8: PHI (r9v20 X.0Yvd) = 
      (r9v1 X.0Yvd)
      (r9v2 X.0Yvd)
      (r9v3 X.0Yvd)
      (r9v4 X.0Yvd)
      (r9v5 X.0Yvd)
      (r9v7 X.0Yvd)
      (r9v8 X.0Yvd)
      (r9v9 X.0Yvd)
      (r9v10 X.0Yvd)
      (r9v11 X.0Yvd)
      (r9v12 X.0Yvd)
      (r9v14 X.0Yvd)
      (r9v15 X.0Yvd)
      (r9v16 X.0Yvd)
      (r9v17 X.0Yvd)
      (r9v18 X.0Yvd)
      (r9v19 X.0Yvd)
      (r9v21 X.0Yvd)
     binds: [B:31:0x01a2, B:30:0x018b, B:29:0x0177, B:28:0x0163, B:27:0x014f, B:23:0x0134, B:22:0x011f, B:21:0x010a, B:20:0x00f5, B:19:0x00e0, B:25:0x014c, B:17:0x00c6, B:16:0x00ae, B:15:0x0099, B:14:0x0084, B:13:0x006f, B:12:0x005a, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(boolean r18, java.util.Set r19) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel.wQ2(boolean, java.util.Set):void");
    }

    public final void zQ2(FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set) {
        C0CNO.LIZLLL(0L, new AwS258S0300000_14(this, (InboxFilterBarViewModel) filterTabType, (FilterTabType) set, (Set<? extends EnumC880480YgQ>) 8));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility
    public final boolean gL2(FilterTabType filterTabType, String str, String str2) {
        boolean zXQ2;
        C889910Yvd next;
        Iterator<C889910Yvd> it2 = getState().LL.iterator();
        while (true) {
            zXQ2 = false;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == filterTabType) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C889910Yvd c889910Yvd = next;
        if (c889910Yvd == null || !(zXQ2 = xQ2(c889910Yvd, str, str2, true))) {
            int i = C2187451AjH.LIZ;
            C889910Yvd c889910YvdLIZ = C880600Ygc.LIZ(C889930Yvf.LIZ.LJI().getFirst());
            if (c889910YvdLIZ != null) {
                xQ2(c889910YvdLIZ, str, str2, true);
            }
            yQ2(this, null, null, str, str2, 3);
        }
        return zXQ2;
    }

    public final boolean xQ2(C889910Yvd c889910Yvd, String str, String str2, boolean z) {
        Set<EnumC880480YgQ> setSingleton;
        boolean z2;
        EnumC880480YgQ enumC880480YgQLIZJ;
        FilterTabType first = getState().LLILLL.getFirst();
        if (c889910Yvd.LIZ == first) {
            return false;
        }
        if (!C889930Yvf.LIZ.LJIIL() || (enumC880480YgQLIZJ = C880600Ygc.LIZJ(c889910Yvd.LIZ)) == null || (setSingleton = Collections.singleton(enumC880480YgQLIZJ)) == null) {
            setSingleton = getState().LLILZ;
        }
        C889860YvY c889860YvY = LLILZIL;
        if (c889860YvY != null) {
            c889860YvY.LIZ = new C889870YvZ(c889910Yvd.LIZ, SystemClock.elapsedRealtime(), str2);
        }
        if (!Intrinsics.LJFF(str2, "click_tab")) {
            first = null;
        }
        C889850YvX c889850YvX = this.LLILLJJLI;
        if (c889850YvX != null) {
            z2 = c889850YvX.LJII;
        } else {
            z2 = false;
        }
        this.LLILLJJLI = new C889850YvX(str, str2, first, z2, 99);
        setState(new AwS66S0210000_14(c889910Yvd, (C889910Yvd) z, (boolean) setSingleton, (Set<? extends EnumC880480YgQ>) 2));
        zQ2(c889910Yvd.LIZ, setSingleton);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void yQ2(com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel r15, X.C889910Yvd r16, java.lang.Boolean r17, java.lang.String r18, java.lang.String r19, int r20) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel.yQ2(com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel, X.0Yvd, java.lang.Boolean, java.lang.String, java.lang.String, int):void");
    }
}
