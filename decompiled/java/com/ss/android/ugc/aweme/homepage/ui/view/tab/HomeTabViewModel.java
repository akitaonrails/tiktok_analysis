package com.ss.android.ugc.aweme.homepage.ui.view.tab;

import X.AbstractC1591090rVT;
import X.C0QSJ;
import X.C1395900mQe;
import X.C13BV;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1569900qxI;
import X.C1592370rXX;
import X.C19252910Tv;
import X.C19EG;
import X.C296200BjG;
import X.C687700QyG;
import X.InterfaceC1570600qyQ;
import X.InterfaceC1583870rJp;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class HomeTabViewModel extends ViewModel implements InterfaceC1570600qyQ {
    public static final C1569900qxI LLILZIL = new C1569900qxI();
    public C19EG LL;
    public final HashMap<String, InterfaceC1583870rJp> LLILLJJLI = new HashMap<>();
    public final HashMap<InterfaceC1583870rJp, View> LLILLL = new HashMap<>();
    public AbstractC1591090rVT LLILZ;

    @Override // X.InterfaceC1570600qyQ
    public final void aA() {
    }

    @Override // X.InterfaceC1570600qyQ
    public final View GA() {
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            return c19eg.findViewById(R.id.nwe);
        }
        return null;
    }

    @Override // X.InterfaceC1570600qyQ
    public final View Zn2() {
        C1592370rXX c1592370rXXLIZ;
        View viewGA = GA();
        if (viewGA == null) {
            return null;
        }
        return (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII() && (c1592370rXXLIZ = C1395900mQe.LIZ(viewGA)) != null) ? c1592370rXXLIZ : viewGA;
    }

    @Override // X.InterfaceC1570600qyQ
    public final List<InterfaceC1583870rJp> vy() {
        HomeTabAbility homeTabAbility;
        List<InterfaceC1583870rJp> listTz;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(this.LL, null), MainActivityScope.class);
            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomeTabAbility.class) : null;
            homeTabAbility = (HomeTabAbility) (ability instanceof HomeTabAbility ? ability : null);
        } else {
            homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(this.LL, null), HomeTabAbility.class, null);
        }
        return (homeTabAbility == null || (listTz = homeTabAbility.Tz()) == null) ? C13BV.INSTANCE : listTz;
    }

    @Override // X.InterfaceC1570600qyQ
    public final AbstractC1591090rVT y01() {
        return this.LLILZ;
    }

    public HomeTabViewModel(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // X.InterfaceC1570600qyQ
    public final <T extends InterfaceC1583870rJp> T QG0(String str) {
        InterfaceC1583870rJp interfaceC1583870rJp = this.LLILLJJLI.get(str);
        if (interfaceC1583870rJp instanceof InterfaceC1583870rJp) {
            return (T) interfaceC1583870rJp;
        }
        return null;
    }

    @Override // X.InterfaceC1570600qyQ
    public final void YF(AbstractC1591090rVT abstractC1591090rVT) {
        this.LLILZ = abstractC1591090rVT;
    }

    @Override // X.InterfaceC1570600qyQ
    public final List<InterfaceC1583870rJp> lZ1(boolean z) {
        HomeTabAbility homeTabAbility;
        List<InterfaceC1583870rJp> listL32;
        Object ability;
        Object obj = null;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(this.LL, null), MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomeTabAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomeTabAbility) {
                obj = ability;
            }
            homeTabAbility = (HomeTabAbility) obj;
        } else {
            homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(this.LL, null), HomeTabAbility.class, null);
        }
        if (homeTabAbility != null && (listL32 = homeTabAbility.l32()) != null) {
            return listL32;
        }
        return C13BV.INSTANCE;
    }
}
