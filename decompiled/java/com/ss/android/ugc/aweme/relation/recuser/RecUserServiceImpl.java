package com.ss.android.ugc.aweme.relation.recuser;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1056380db2;
import X.C1074590e4P;
import X.C1262590ixd;
import X.C1262690ixn;
import X.C1262850iy3;
import X.C1263860izg;
import X.C1263960izq;
import X.C1264660j0y;
import X.C13LE;
import X.C1554960qZC;
import X.C19719912Dl;
import X.C19EG;
import X.C1D7W;
import X.C2174581A8q;
import X.C2246021CvY;
import X.C452070Ho5;
import X.C724750Sbp;
import X.EnumC1262370ixH;
import X.EnumC19359310oZ;
import X.InterfaceC1056430db7;
import X.InterfaceC1072780e1U;
import X.InterfaceC1073440e2Y;
import X.InterfaceC1263910izl;
import X.InterfaceC1264190j0D;
import X.InterfaceC1264650j0x;
import X.InterfaceC1337505Lh;
import X.InterfaceC1588500rRI;
import X.InterfaceC1589370rSh;
import X.InterfaceC1603120ros;
import X.InterfaceC302490BtP;
import X.InterfaceC800130Va7;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.lego.AliasFetchRequestLegoTask;
import com.ss.android.ugc.aweme.relation.lego.RecUserRequestLegoTask;
import com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager;
import com.ss.android.ugc.aweme.relation.monitor.RecUserMonManagerImpl;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes20.dex */
public final class RecUserServiceImpl implements IRecUserService {
    public final C1264660j0y LIZ = C1264660j0y.LIZ;
    public final C1056380db2 LIZIZ = C1056380db2.LIZ;
    public final C1262690ixn LIZJ = C1262690ixn.LIZ;
    public final Map<String, ArrayList<String>> LIZLLL = new LinkedHashMap();
    public final C2174581A8q LJ = C2174581A8q.LIZ;
    public final RecUserMonManagerImpl LJFF = RecUserMonManagerImpl.LL;

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1337505Lh LIZIZ() {
        C1D7W c1d7w = new C1D7W(null);
        C1554960qZC.LIZ(GScope.LL, c1d7w, InterfaceC1337505Lh.class, "source_default_key");
        c1d7w.LL.clear();
        return c1d7w;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1072780e1U LIZJ() {
        return new C1262850iy3();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC800130Va7 LJIILIIL() {
        return new AliasFetchRequestLegoTask();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final boolean LJFF() {
        ArrayList arrayList;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null || (arrayList = (ArrayList) ((LinkedHashMap) this.LIZLLL).get(curUserId)) == null) {
            return false;
        }
        return arrayList.contains("homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC302490BtP LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1264190j0D LJII() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final IRecUserMonManager LJIIJ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1589370rSh LJIILJJIL() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1056430db7 LJIILL() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final void LJ(String str) {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId == null) {
            return;
        }
        if (!this.LIZLLL.containsKey(curUserId)) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            this.LIZLLL.put(curUserId, arrayList);
        } else {
            ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) this.LIZLLL).get(curUserId);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            if (!arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1263910izl LJIIIIZZ(EnumC1262370ixH enumC1262370ixH) {
        return new C1263860izg(new C1262590ixd(enumC1262370ixH, 2097150));
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final List<InterfaceC800130Va7> LJIIJJI(boolean z) {
        return Collections.singletonList(new RecUserRequestLegoTask(z));
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1073440e2Y LJIIIZ(C19EG c19eg, Bundle bundle) {
        C1262850iy3 c1262850iy3 = new C1262850iy3();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecUserAfterAuthPopupVM.class);
        return new C1074590e4P(c19eg, c1262850iy3, (RecUserAfterAuthPopupVM) new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ), new AwS408S0200000_7(c19719912DlLIZ, c1262850iy3, 63), new C452070Ho5(), C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS560S0100000_16(bundle, 787), AFwS252S0000000_16.get$arr$(526)).getValue(), bundle);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1603120ros LIZLLL(C19EG c19eg, Aweme aweme, LifecycleOwner lifecycleOwner) {
        return C2246021CvY.LIZIZ(c19eg, EnumC19359310oZ.FYP, aweme, lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1588500rRI LJI(Fragment fragment, String str, InterfaceC1264650j0x interfaceC1264650j0x) {
        return new EmptyGuideV2(fragment, interfaceC1264650j0x);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final void LJIIL(TuxTextView tuxTextView, User user, Aweme aweme) {
        C1263960izq.LIZLLL(C1263960izq.LIZ, tuxTextView, user, aweme, 4);
    }
}
