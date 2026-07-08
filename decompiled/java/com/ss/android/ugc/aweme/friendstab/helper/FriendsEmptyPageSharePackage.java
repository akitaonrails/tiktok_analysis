package com.ss.android.ugc.aweme.friendstab.helper;

import X.C1074880e4s;
import X.C1370940lmO;
import X.C1373440lqQ;
import X.C1608906Rr;
import X.C23250099c;
import X.InterfaceC1369790lkX;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendsEmptyPageSharePackage extends LinkDefaultSharePackage {
    public static final C1074880e4s Companion = new Object() { // from class: X.0e4s
    };
    public final FriendsEmptyPageMainSectionVM vm;

    public FriendsEmptyPageSharePackage(C1370940lmO c1370940lmO, FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM) {
        super(c1370940lmO);
        this.vm = friendsEmptyPageMainSectionVM;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJI(Context context, InterfaceC1369790lkX interfaceC1369790lkX) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = this.itemType;
        String str2 = this.description;
        c1373440lqQ.getClass();
        String strLIZ = C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
        FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = this.vm;
        String str3 = this.title;
        friendsEmptyPageMainSectionVM.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(friendsEmptyPageMainSectionVM), null, null, new C1608906Rr(friendsEmptyPageMainSectionVM, interfaceC1369790lkX, str3, strLIZ, context, null), 3);
        return true;
    }
}
