package com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist;

import X.AnonymousClass0950;
import X.C069P;
import X.C08XD;
import X.C09IC;
import X.C09IR;
import X.C0CZ6;
import X.C0PEM;
import X.C0Y8T;
import X.C0YA1;
import X.C0YSQ;
import X.C0Z70;
import X.C1479305qh;
import X.C1714906nb;
import X.C1954807lC;
import X.C2095008Iq;
import X.C2252331DDr;
import X.C23250099c;
import X.C315670CYz;
import X.C455420HtU;
import X.C459160HzW;
import X.C461720I8s;
import X.C860410Xp9;
import X.C869590Y9l;
import X.C879170YeJ;
import X.C879220YeO;
import X.C879250YeR;
import X.C879290YeV;
import X.C879320YeY;
import X.C914090ZtX;
import X.EnumC879230YeP;
import X.InterfaceC1480505qt;
import X.InterfaceC876950Yaj;
import X.InterfaceC879330YeZ;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.im.core.proto.UrlStruct;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMReactionListSheetViewModel extends ViewModel implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLJILJIL = 0;
    public C869590Y9l LL;
    public final String LLILLJJLI = C461720I8s.LIZIZ();
    public boolean LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData LLILZIL;
    public final ArrayList<String> LLILZLL;
    public final HashMap<String, Integer> LLIZ;
    public long LLIZLLLIL;
    public final C0CZ6 LLJ;
    public final C2252331DDr LLJI;
    public final AnonymousClass0950 LLJIJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume$im_messagelist_release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume$im_messagelist_release() {
        if (this.LLILLL) {
            this.LLILZ.postValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0CZ6] */
    public IMReactionListSheetViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.LLILZ = mutableLiveData;
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = new HashMap<>();
        this.LLJ = new InterfaceC1480505qt() { // from class: X.0CZ6
            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                Integer num = this.LIZ.LLIZ.get(iMUser.getUid());
                if (num != null) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), null, null, new C315660CYy(this.LIZ, num, iMUser, null), 3);
                }
            }
        };
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJI = c2252331DDrLIZIZ;
        this.LLJIJIL = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    public final void wQ2(C860410Xp9 c860410Xp9) {
        if (!c860410Xp9.LLILZ.isSelf()) {
            return;
        }
        InterfaceC879330YeZ interfaceC879330YeZ = c860410Xp9.LL;
        if (!(interfaceC879330YeZ instanceof C455420HtU) && !(interfaceC879330YeZ instanceof C459160HzW)) {
            if (!(interfaceC879330YeZ instanceof C879290YeV)) {
                throw new C1954807lC();
            }
            return;
        }
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        C869590Y9l c869590Y9l = this.LL;
        C869590Y9l c869590Y9l2 = null;
        if (c869590Y9l == null) {
            c869590Y9l = null;
        }
        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(c869590Y9l.getConversationId());
        if (c0y8tLIZ != null) {
            C869590Y9l c869590Y9l3 = this.LL;
            if (c869590Y9l3 != null) {
                c869590Y9l2 = c869590Y9l3;
            }
            C879320YeY.LIZ(c869590Y9l2, this.LLILLJJLI, c0y8tLIZ, interfaceC879330YeZ, new C914090ZtX(2));
        }
    }

    public static List vQ2(IMReactionListSheetViewModel iMReactionListSheetViewModel, C869590Y9l c869590Y9l) {
        C860410Xp9 c860410Xp9;
        EnumC879230YeP enumC879230YeP;
        long jLongValue;
        EnumC879230YeP enumC879230YeP2;
        Long lLJIILIIL;
        C069P c069p = IMContactApi.LIZ;
        c069p.getClass();
        C1479305qh c1479305qh = new C1479305qh(C069P.LIZ().LJ());
        c069p.getClass();
        C1714906nb c1714906nb = new C1714906nb(C069P.LIZ().LJ());
        iMReactionListSheetViewModel.LL = c869590Y9l;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<C0YA1>> entry : c869590Y9l.getPropertyItemListMap().entrySet()) {
            String key = entry.getKey();
            List<C0YA1> value = entry.getValue();
            for (C0YA1 c0ya1 : value) {
                String str = c0ya1.idempotent_id;
                if (str == null || str.length() == 0) {
                    if (c0ya1.uid.longValue() > 0) {
                        c0ya1.idempotent_id = c0ya1.uid.toString();
                    }
                }
            }
            if (C879170YeJ.LIZLLL(key) || C879170YeJ.LIZJ(key)) {
                for (C0YA1 c0ya12 : value) {
                    Object objInvoke = c1479305qh.invoke(c0ya12.idempotent_id, c0ya12.sec_uid, "im_chat_reaction");
                    boolean zLIZLLL = C879250YeR.LIZLLL(c0ya12);
                    if (objInvoke == null) {
                        iMReactionListSheetViewModel.LLILZLL.add(c0ya12.idempotent_id);
                    }
                    if (C879170YeJ.LIZLLL(key)) {
                        C459160HzW c459160HzWLIZIZ = C879170YeJ.LIZIZ(key);
                        String str2 = c0ya12.idempotent_id;
                        long createTimeSeconds = c0ya12.getCreateTimeSeconds();
                        C879220YeO c879220YeO = EnumC879230YeP.Companion;
                        boolean zLJFF = Intrinsics.LJFF(c0ya12.idempotent_id, iMReactionListSheetViewModel.LLILLJJLI);
                        c879220YeO.getClass();
                        if (zLJFF) {
                            if (zLIZLLL) {
                                enumC879230YeP = EnumC879230YeP.AI_SELF;
                            } else {
                                enumC879230YeP = EnumC879230YeP.SELF;
                            }
                        } else if (zLIZLLL) {
                            enumC879230YeP = EnumC879230YeP.AI_OTHER;
                        } else {
                            enumC879230YeP = EnumC879230YeP.OTHER;
                        }
                        c860410Xp9 = new C860410Xp9(c459160HzWLIZIZ, str2, createTimeSeconds, enumC879230YeP);
                    } else if (C879170YeJ.LIZJ(key)) {
                        String str3 = c0ya12.idempotent_id;
                        if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
                            jLongValue = lLJIILIIL.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        UrlStruct urlStruct = c0ya12.url;
                        C455420HtU c455420HtULIZ = C879170YeJ.LIZ(jLongValue, key, new C0Z70(urlStruct.uri, urlStruct.url_list, urlStruct.width, urlStruct.height));
                        String str4 = c0ya12.idempotent_id;
                        long createTimeSeconds2 = c0ya12.getCreateTimeSeconds();
                        C879220YeO c879220YeO2 = EnumC879230YeP.Companion;
                        boolean zLJFF2 = Intrinsics.LJFF(c0ya12.idempotent_id, iMReactionListSheetViewModel.LLILLJJLI);
                        c879220YeO2.getClass();
                        if (zLJFF2) {
                            if (zLIZLLL) {
                                enumC879230YeP2 = EnumC879230YeP.AI_SELF;
                            } else {
                                enumC879230YeP2 = EnumC879230YeP.SELF;
                            }
                        } else if (zLIZLLL) {
                            enumC879230YeP2 = EnumC879230YeP.AI_OTHER;
                        } else {
                            enumC879230YeP2 = EnumC879230YeP.OTHER;
                        }
                        c860410Xp9 = new C860410Xp9(c455420HtULIZ, str4, createTimeSeconds2, enumC879230YeP2);
                    }
                    arrayList.add(c860410Xp9);
                    iMReactionListSheetViewModel.LLIZ.put(c0ya12.idempotent_id, 0);
                }
            }
        }
        int i = 0;
        C08XD.LJIL(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iMReactionListSheetViewModel.LLIZ.put(((C860410Xp9) it2.next()).LLILLJJLI, Integer.valueOf(i));
            i++;
        }
        if (!iMReactionListSheetViewModel.LLILZLL.isEmpty()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(iMReactionListSheetViewModel), C0PEM.LIZJ, null, new C315670CYz(iMReactionListSheetViewModel.LLILZLL, c1714906nb, iMReactionListSheetViewModel, null), 2);
        }
        return arrayList;
    }
}
