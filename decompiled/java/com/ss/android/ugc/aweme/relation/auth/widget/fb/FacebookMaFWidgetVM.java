package com.ss.android.ugc.aweme.relation.auth.widget.fb;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C1071540dzU;
import X.C1074430e49;
import X.C1074450e4B;
import X.C1074740e4e;
import X.C1370940lmO;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1374800lsc;
import X.C1377070lwH;
import X.C15438062q;
import X.C1697810uHb;
import X.C19EG;
import X.C1DFB;
import X.C2000307sX;
import X.InterfaceC0148002o;
import X.InterfaceC1004520cFO;
import X.InterfaceC1369790lkX;
import X.InterfaceC1378050lxr;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.widget.ext.InviteFriendsSharePackageV2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FacebookMaFWidgetVM extends AssemViewModel<C1074430e49> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C1074450e4B LL;
    public final InterfaceC1004520cFO LLILLJJLI;
    public final AbstractC2252651DEx LLILLL;
    public InviteFriendsSharePackageV2 LLILZ;
    public C1371590lnR LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1074430e49(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = this.LLILZ;
        if (inviteFriendsSharePackageV2 != null) {
            inviteFriendsSharePackageV2.LJJI();
        }
        this.LL.LJIIIZ.clear();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (this.LL.LJ) {
            String str = this.LL.LIZJ.LIZ;
            C1370940lmO c1370940lmO = new C1370940lmO();
            c1370940lmO.LIZ = "text";
            InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = new InviteFriendsSharePackageV2("invitevia", str, false, c1370940lmO, 12);
            this.LLILZ = inviteFriendsSharePackageV2;
            inviteFriendsSharePackageV2.LJJIII();
        }
    }

    public FacebookMaFWidgetVM(C1074450e4B c1074450e4B) {
        InterfaceC1004520cFO interfaceC1004520cFOLJII = C1071540dzU.LIZIZ.LJII();
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LL = c1074450e4B;
        this.LLILLJJLI = interfaceC1004520cFOLJII;
        this.LLILLL = c1dfb;
    }

    public final List<C1074740e4e> vQ2(List<? extends User> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (User user : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C1074740e4e(this.LL, user, i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public final void wQ2(final C19EG c19eg) {
        InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = this.LLILZ;
        if (inviteFriendsSharePackageV2 == null) {
            return;
        }
        if (this.LLILZIL == null) {
            InviteFriendsSharePackageV2.Companion.getClass();
            C1371600lnS c1371600lnS = new C1371600lnS();
            c1371600lnS.LJJIIJ = inviteFriendsSharePackageV2;
            C1374800lsc c1374800lsc = C1374800lsc.LIZ;
            C1377070lwH c1377070lwH = new C1377070lwH(new InterfaceC1378050lxr() { // from class: X.0e4k
                @Override // X.InterfaceC1378050lxr
                public final Activity get() {
                    return c19eg;
                }
            }, null);
            c1374800lsc.getClass();
            C1374800lsc.LIZ("facebook", c1377070lwH, c1371600lnS);
            this.LLILZIL = new C1371590lnR(c1371600lnS);
        }
        C1371590lnR c1371590lnR = this.LLILZIL;
        if (c1371590lnR != null) {
            inviteFriendsSharePackageV2.LJI(c19eg, (InterfaceC1369790lkX) ListProtector.get(c1371590lnR.LIZ, 0));
        }
        new C2000307sX(this.LL.LIZJ.LIZ).LIZLLL(null);
    }
}
