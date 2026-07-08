package com.ss.android.ugc.aweme.relation.auth.widget.contact;

import X.AbstractC2252651DEx;
import X.AbstractC848400XPy;
import X.C0PEM;
import X.C0XQ7;
import X.C1071540dzU;
import X.C1074630e4T;
import X.C1074720e4c;
import X.C1074770e4h;
import X.C1074790e4j;
import X.C1370940lmO;
import X.C13LP;
import X.C1DFB;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import X.InterfaceC1055970daN;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.auth.widget.ext.InviteFriendsSharePackageV2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class ContactMaFWidgetVM extends AssemViewModel<C1074720e4c> {
    public static C1074720e4c LLILZLL;
    public static C1074720e4c LLIZ;
    public static final C1074790e4j LLIZLLLIL = C1074790e4j.LL;
    public final C1074630e4T LL;
    public final InterfaceC1055970daN LLILLJJLI;
    public final InviteFriendsSharePackageV2 LLILLL;
    public final Keva LLILZ;
    public final AbstractC2252651DEx LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1074720e4c(0);
    }

    public final void vQ2() {
        setState(AFwS252S0000000_16.get$arr$(693));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.LJJI();
        this.LL.LJIIZILJ.clear();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LLILLL.LJJIII();
    }

    public ContactMaFWidgetVM(C1074630e4T c1074630e4T) {
        InterfaceC1055970daN interfaceC1055970daNLIZIZ = C1071540dzU.LIZIZ.LIZIZ();
        String str = c1074630e4T.LIZJ.LIZ;
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "text";
        InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = new InviteFriendsSharePackageV2("invitesinglesms", str, true, c1370940lmO, 8);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append("_friends_state_repo");
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LL = c1074630e4T;
        this.LLILLJJLI = interfaceC1055970daNLIZIZ;
        this.LLILLL = inviteFriendsSharePackageV2;
        this.LLILZ = repo;
        this.LLILZIL = c1dfb;
    }

    public static Pair wQ2(List list) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1074770e4h c1074770e4h = (C1074770e4h) it2.next();
            Integer num = (Integer) linkedHashMap.get(c1074770e4h.LL);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            linkedHashMap.put(c1074770e4h.LL, Integer.valueOf(iIntValue + 1));
        }
        return new Pair(C13LP.LLIIII(linkedHashMap.keySet()), C13LP.LLIIII(linkedHashMap.values()));
    }
}
