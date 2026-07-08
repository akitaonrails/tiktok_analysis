package com.ss.android.ugc.aweme.friends.service;

import X.C0XQ7;
import X.C1071790dzt;
import X.C1071800dzu;
import X.C1072140e0S;
import X.C1072150e0T;
import X.C1072640e1G;
import X.C1072670e1J;
import X.C1072680e1K;
import X.C1072740e1Q;
import X.C1073600e2o;
import X.C1369580lkC;
import X.C1370940lmO;
import X.C1440005kM;
import X.C1851307Mx;
import X.C19EG;
import X.C2188811AlT;
import X.C286420BKm;
import X.C849850XVn;
import X.EnumC1072920e1i;
import X.InterfaceC1072760e1S;
import X.InterfaceC1368050lhj;
import X.InterfaceC849930XVv;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.experiment.AllowedIAPMessageType;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialFriendsService implements ISocialFriendsService, GenericLifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final String LIZ() {
        return C1072140e0S.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final String LIZLLL() {
        return C1072740e1Q.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final String LJ() {
        return C1072150e0T.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final boolean LJFF(int i) {
        if (C286420BKm.LIZIZ && Build.VERSION.SDK_INT >= 31) {
            ConnectNowFragment.LLJJJ.getClass();
            if (ConnectNowFragment.LLJJJJ) {
                C1851307Mx.LIZ.getClass();
                if (!((AllowedIAPMessageType) C1851307Mx.LIZJ.getValue()).iapTypes.contains(Integer.valueOf(i))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final Pair<Boolean, Long> LJI(int i) {
        String str = C1072670e1J.LIZIZ;
        C1072670e1J c1072670e1JLIZ = C1072680e1K.LIZ();
        EnumC1072920e1i enumC1072920e1i = EnumC1072920e1i.RECOMMEND;
        int value = enumC1072920e1i.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("go_through_social_recommend_flow");
        sbLIZ.append(i);
        sbLIZ.append(value);
        boolean z = c1072670e1JLIZ.LIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        C1072670e1J c1072670e1JLIZ2 = C1072680e1K.LIZ();
        int value2 = enumC1072920e1i.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("go_through_time_ms");
        sbLIZ2.append(i);
        sbLIZ2.append(value2);
        return new Pair<>(Boolean.valueOf(z), Long.valueOf(c1072670e1JLIZ2.LIZ.getLong(C2188811AlT.LIZIZ(sbLIZ2), -1L)));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final Pair<Boolean, Long> LJII(int i) {
        String str = C1072670e1J.LIZIZ;
        C1072670e1J c1072670e1JLIZ = C1072680e1K.LIZ();
        EnumC1072920e1i enumC1072920e1i = EnumC1072920e1i.CONSENT;
        int value = enumC1072920e1i.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("go_through_social_recommend_flow");
        sbLIZ.append(i);
        sbLIZ.append(value);
        boolean z = c1072670e1JLIZ.LIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        C1072670e1J c1072670e1JLIZ2 = C1072680e1K.LIZ();
        int value2 = enumC1072920e1i.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("go_through_time_ms");
        sbLIZ2.append(i);
        sbLIZ2.append(value2);
        return new Pair<>(Boolean.valueOf(z), Long.valueOf(c1072670e1JLIZ2.LIZ.getLong(C2188811AlT.LIZIZ(sbLIZ2), -1L)));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final void LIZIZ(C19EG c19eg, C1369580lkC c1369580lkC) {
        final Context context = c1369580lkC.getContext();
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "text";
        final InviteFriendsPageSharePackage inviteFriendsPageSharePackage = new InviteFriendsPageSharePackage(c1370940lmO);
        inviteFriendsPageSharePackage.LJJIFFI();
        c1369580lkC.LJIIZILJ(inviteFriendsPageSharePackage.LJJI(c19eg), false);
        c1369580lkC.LLJJ = new InterfaceC1368050lhj() { // from class: X.0e1R
            @Override // X.InterfaceC1368050lhj
            public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
                inviteFriendsPageSharePackage.LJI(context, interfaceC1369790lkX);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final void LIZJ(Activity activity, boolean z, InterfaceC849930XVv interfaceC849930XVv) {
        int i;
        C0XQ7.LJ();
        int i2 = 2;
        if (!Intrinsics.LJFF(C0XQ7.LIZ.LJIIL().getLatestLoginMethodName(), "facebook")) {
            i = 1;
        } else {
            i = 2;
        }
        C1072640e1G.LIZ.getClass();
        InterfaceC1072760e1S interfaceC1072760e1SLIZ = C1072640e1G.LIZ(i);
        if (!interfaceC1072760e1SLIZ.LIZJ((C19EG) activity)) {
            interfaceC849930XVv.LIZ();
            return;
        }
        if (!z) {
            if (interfaceC1072760e1SLIZ.LIZ() != 2) {
                i2 = 1;
            }
            if (!C849850XVn.LIZIZ.LIZJ().LJIILL()) {
                C1440005kM.LIZ(new C1073600e2o(i2, interfaceC1072760e1SLIZ.LIZIZ(), false));
                String str = C1071790dzt.LIZIZ;
                C1071800dzu.LIZ().LIZ.storeBoolean("after_login_permission_pop_up", true);
            }
        }
        interfaceC849930XVv.LIZ();
    }
}
