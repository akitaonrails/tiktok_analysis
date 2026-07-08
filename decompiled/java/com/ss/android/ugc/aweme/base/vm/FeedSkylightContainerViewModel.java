package com.ss.android.ugc.aweme.base.vm;

import X.C01GW;
import X.C0RGG;
import X.C0ZP4;
import X.C1575790r6n;
import X.C1575800r6o;
import X.C1575830r6r;
import X.C1576740r8K;
import X.C1595770rd1;
import X.C1596130rdb;
import X.C1597740rgC;
import X.C1720106oR;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C299660Boq;
import X.C586380MzE;
import X.C690440R6k;
import X.InterfaceC0148002o;
import X.InterfaceC1583660rJU;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS6S0020000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightContainerViewModel extends AssemViewModel<C1575830r6r> {
    public static final /* synthetic */ int LLJI = 0;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public String LL = "auto";
    public int LLILLJJLI = -1;
    public Map<String, String> LLILLL = C2097608Jq.LJ();
    public C1595770rd1 LLILZ = new C1595770rd1(false, "");
    public final List<InterfaceC1583660rJU> LLJ = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1575830r6r(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ArrayList) this.LLJ).clear();
        C1596130rdb.LIZ.getClass();
    }

    public final boolean vQ2() {
        return getState().LLILZ.LIZ.LIZ;
    }

    public final boolean wQ2() {
        return getState().LLILLJJLI;
    }

    public final boolean xQ2() {
        return getState().LLILLL.LIZ.LIZ;
    }

    public final void BQ2(boolean z) {
        if (C299660Boq.LIZ()) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZJ(this.LLIZ) && z) {
                this.LLILZIL = true;
                return;
            }
        }
        setState(new AwS36S0010000_24(z, 3));
    }

    public final C0ZP4 yQ2(LifecycleOwner lifecycleOwner, Function1<? super C1575790r6n, Unit> function1) {
        return AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0r6Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1575830r6r) obj).LLILLL;
            }
        }, null, lifecycleOwner, null, new AwS603S0100000_24(function1, (Function1<? super C1575790r6n, Unit>) 27), 10, null);
    }

    public final void zQ2(boolean z, boolean z2) {
        if (C299660Boq.LIZ()) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZJ(this.LLIZ) && z) {
                this.LLILZIL = true;
                return;
            }
        }
        setState(new AwS6S0020000_24(z, z2, 0));
    }

    public static void AQ2(FeedSkylightContainerViewModel feedSkylightContainerViewModel, boolean z, String str, boolean z2, boolean z3, boolean z4, String str2, int i) {
        C1576740r8K c1576740r8KLIZ;
        String str3;
        String str4 = str2;
        boolean z5 = z3;
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z6 = true;
        }
        if ((i & 8) != 0) {
            z5 = false;
        }
        if ((i & 16) != 0) {
            z4 = true;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if (C299660Boq.LIZ()) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZJ(feedSkylightContainerViewModel.LLIZ)) {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("FeedSkylightContainerViewModel", "toggleSkylightListShowStatus: abort because of clear_mode_skylight_opt is enabled");
                if (z) {
                    return;
                }
            }
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggleSkylightListShowStatus: isShow: ");
        sbLIZ.append(z);
        sbLIZ.append(", enterMethod: ");
        sbLIZ.append(str);
        sbLIZ.append(", needAnim: ");
        sbLIZ.append(z6);
        sbLIZ.append(", isRefresh: ");
        sbLIZ.append(z5);
        sbLIZ.append(", toggleCleanMode: ");
        sbLIZ.append(z4);
        sbLIZ.append(", shouldFollowOuterCleanModeSetting: ");
        sbLIZ.append(feedSkylightContainerViewModel.LLILZLL);
        C1720106oR.LJI("FeedSkylightContainerViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (feedSkylightContainerViewModel.LLILLJJLI == 2) {
            C1597740rgC.LIZ.getClass();
            C1597740rgC.LJII = str;
        }
        int i4 = feedSkylightContainerViewModel.LLILLJJLI;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Iterator it2 = ((ArrayList) feedSkylightContainerViewModel.LLJ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1583660rJU) it2.next()).LIZ();
                    }
                }
            } else {
                Iterator it3 = ((ArrayList) feedSkylightContainerViewModel.LLJ).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1583660rJU) it3.next()).LIZIZ(z);
                }
            }
        } else {
            Iterator it4 = ((ArrayList) feedSkylightContainerViewModel.LLJ).iterator();
            while (it4.hasNext()) {
                ((InterfaceC1583660rJU) it4.next()).LIZJ();
            }
        }
        feedSkylightContainerViewModel.LLILZ = new C1595770rd1(z, str);
        feedSkylightContainerViewModel.setState(new C1575800r6o(str, str4, z, z6, z5));
        if (feedSkylightContainerViewModel.LLILZLL || !z4 || (c1576740r8KLIZ = C690440R6k.LIZ()) == null || (str3 = feedSkylightContainerViewModel.LLIZ) == null) {
            return;
        }
        int iHashCode = str3.hashCode();
        if (iHashCode != -1271119582) {
            if (iHashCode != -667094460) {
                if (iHashCode != 1691937916 || !str3.equals("homepage_hot")) {
                    return;
                }
                c1576740r8KLIZ.LJFF(z);
                return;
            }
            if (!str3.equals("homepage_friends")) {
                return;
            }
            c1576740r8KLIZ.LJ(z);
            return;
        }
        if (!str3.equals("homepage_follow")) {
            return;
        }
        c1576740r8KLIZ.LIZLLL(z);
    }
}
