package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.AnonymousClass0950;
import X.C05YD;
import X.C09IC;
import X.C09IR;
import X.C0PEM;
import X.C1954807lC;
import X.C1BNE;
import X.C1DFH;
import X.C2107308Nj;
import X.C2252331DDr;
import X.C23250099c;
import X.C323510CmD;
import X.C323520CmE;
import X.C327160Cs6;
import X.C327170Cs7;
import X.C327190Cs9;
import X.C327210CsB;
import X.C327220CsC;
import X.C327260CsG;
import X.C327270CsH;
import X.C327290CsJ;
import X.C898270ZLt;
import X.EnumC2252401DDy;
import X.InterfaceC327200CsA;
import X.InterfaceC327250CsF;
import X.InterfaceC332260D0u;
import X.InterfaceC497601wk;
import Y.AObserverS208S0100000_4;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AwemeStatusViewModel extends IAwemeStatusViewModel {
    public final ConcurrentHashMap<String, InterfaceC332260D0u<InterfaceC327250CsF>> LL = new ConcurrentHashMap<>();
    public final C2252331DDr LLILLJJLI;
    public final AnonymousClass0950 LLILLL;
    public final ConcurrentHashMap<String, Set<String>> LLILZ;
    public final ConcurrentHashMap<String, Set<Long>> LLILZIL;
    public final EventLiveData<FollowStatus> LLILZLL;
    public final AObserverS208S0100000_4 LLIZ;

    public AwemeStatusViewModel() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);
        this.LLILLJJLI = c2252331DDrLIZIZ;
        this.LLILLL = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLILZ = new ConcurrentHashMap<>();
        this.LLILZIL = new ConcurrentHashMap<>();
        IMFriendsService.LIZ.getClass();
        IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
        this.LLILZLL = iMFriendsServiceLIZ != null ? iMFriendsServiceLIZ.getRelationObservable() : null;
        this.LLIZ = new AObserverS208S0100000_4(this, 2);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C323510CmD(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventLiveData<FollowStatus> eventLiveData = this.LLILZLL;
        if (eventLiveData != null) {
            eventLiveData.removeObserver(this.LLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel
    public final AnonymousClass0950 wQ2() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel
    public final InterfaceC332260D0u vQ2(String str) {
        C05YD<InterfaceC327200CsA> c05ydLIZLLL;
        if (!this.LL.containsKey(str)) {
            this.LL.put(str, C1BNE.LIZ(C327260CsG.LIZ));
            IAwemeFetchManager.LIZ.getClass();
            IAwemeFetchManager value = C327290CsJ.LIZIZ.getValue();
            if (value != null && (c05ydLIZLLL = value.LIZLLL(str)) != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C323520CmE(c05ydLIZLLL, this, str, null), 3);
            } else {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C327220CsC(str, this, null), 2);
            }
        }
        InterfaceC332260D0u<InterfaceC327250CsF> interfaceC332260D0u = this.LL.get(str);
        if (interfaceC332260D0u == null) {
            return C1BNE.LIZ(C327260CsG.LIZ);
        }
        return interfaceC332260D0u;
    }

    public final void yQ2(InterfaceC327200CsA interfaceC327200CsA, String str) {
        InterfaceC327250CsF c327270CsH;
        if (!this.LL.containsKey(str)) {
            this.LL.put(str, C1BNE.LIZ(C327260CsG.LIZ));
        }
        InterfaceC332260D0u<InterfaceC327250CsF> interfaceC332260D0u = this.LL.get(str);
        if (interfaceC332260D0u != null) {
            if (Intrinsics.LJFF(interfaceC327200CsA, C327160Cs6.LIZ)) {
                c327270CsH = C327260CsG.LIZ;
            } else if (Intrinsics.LJFF(interfaceC327200CsA, C327210CsB.LIZ)) {
                c327270CsH = new InterfaceC327250CsF() { // from class: X.0CsE
                };
            } else if (interfaceC327200CsA instanceof C327190Cs9) {
                C327170Cs7 c327170Cs7 = ((C327190Cs9) interfaceC327200CsA).LIZ;
                Aweme aweme = c327170Cs7.LIZIZ;
                if (c327170Cs7.LIZ.getStatus() == null) {
                    c327270CsH = C327260CsG.LIZ;
                } else if (Intrinsics.LJFF(String.valueOf(c327170Cs7.LIZ.getStatus()), CardStruct.IStatusCode.DEFAULT) && aweme != null) {
                    c327270CsH = new C327270CsH(str, aweme);
                } else {
                    c327270CsH = new InterfaceC327250CsF() { // from class: X.0CsE
                    };
                }
            } else {
                throw new C1954807lC();
            }
            interfaceC332260D0u.setValue(c327270CsH);
        }
        this.LLILLJJLI.LIZJ(0);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel
    public final void xQ2(Long l, String str, String str2) {
        if (l != null) {
            l.longValue();
            if (!this.LLILZIL.containsKey(str)) {
                this.LLILZIL.put(str, new LinkedHashSet());
            }
            Set<Long> set = this.LLILZIL.get(str);
            if (set != null) {
                set.add(l);
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!this.LLILZ.containsKey(str2)) {
            this.LLILZ.put(str2, new LinkedHashSet());
        }
        Set<String> set2 = this.LLILZ.get(str2);
        if (set2 != null) {
            set2.add(str);
        }
    }
}
