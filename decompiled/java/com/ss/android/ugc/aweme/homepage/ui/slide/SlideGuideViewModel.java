package com.ss.android.ugc.aweme.homepage.ui.slide;

import X.AbstractC2252651DEx;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C0XQ7;
import X.C1250650ieN;
import X.C13LP;
import X.C15438062q;
import X.C1569810qx9;
import X.C1569820qxA;
import X.C1569830qxB;
import X.C1569860qxE;
import X.C1720106oR;
import X.C1DFH;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC1569400qwU;
import X.InterfaceC1583870rJp;
import X.InterfaceC1588590rRR;
import android.os.Looper;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SlideGuideViewModel extends ViewModel implements InterfaceC1588590rRR {
    public static Boolean LLJJIJI;
    public final InterfaceC1569400qwU LL;
    public final HomePageDataViewModel LLILLJJLI;
    public final AbstractC2252651DEx LLILLL;
    public final C01GW LLILZ;
    public final NextLiveData LLILZIL;
    public final NextLiveData LLILZLL;
    public final NextLiveData LLIZ;
    public final NextLiveData LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public AnonymousClass0956 LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public Boolean LLJILJILJ;
    public boolean LLJILLL;
    public Boolean LLJJ;
    public final List<String> LLJJI;
    public final List<String> LLJJIII;

    static {
        new C1569860qxE();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1588590rRR
    public final void nR0() {
        this.LLJILJILJ = false;
        Boolean bool = (Boolean) this.LLIZLLLIL.getValue();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (Intrinsics.LJFF(this.LLJJ, Boolean.TRUE) && !zBooleanValue && Intrinsics.LJFF(this.LLJI, "Following")) {
            xQ2(0L, "Following");
        }
    }

    public final void setVisible(boolean z) {
        T value = this.LLIZLLLIL.getValue();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.LJFF(value, bool)) {
            return;
        }
        vQ2(this.LLIZ, bool);
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final boolean wQ2(String str) {
        boolean z;
        boolean zBooleanValue;
        Aweme aweme = this.LLILLJJLI.LLJILJILJ;
        if (aweme != null && aweme.isAd()) {
            z = true;
        } else {
            z = false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1525083535) {
            if (iHashCode != 2576150) {
                if (iHashCode == 2587369 && str.equals("Stem")) {
                    Keva repo = Keva.getRepo("slide_mask_guide_repo");
                    Boolean bool = LLJJIJI;
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    if (repo.contains("tab_first_enter_done")) {
                        LLJJIJI = Boolean.FALSE;
                        return false;
                    }
                    repo.storeBoolean("tab_first_enter_done", true);
                    LLJJIJI = Boolean.FALSE;
                    return true;
                }
            } else {
                if (str.equals("Shop")) {
                    return false;
                }
                return z;
            }
        } else if (str.equals("Following")) {
            Boolean bool2 = this.LLJILJILJ;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = true;
            }
            if (!C0XQ7.LJFF().isLogin()) {
                return false;
            }
            if (this.LL.jF() && !zBooleanValue) {
                return false;
            }
            if (z || zBooleanValue) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static void vQ2(NextLiveData nextLiveData, Object obj) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            nextLiveData.setValue(obj);
        } else {
            nextLiveData.postValue(obj);
        }
    }

    public final void xQ2(long j, String str) {
        if (wQ2(str)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is avoid show");
            C1720106oR.LJI("SlideGuide", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLJIJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), this.LLILLL, null, new C1569810qx9(false, j, str, this, null), 2);
    }

    public SlideGuideViewModel(Hox hox, HomeTabViewModel homeTabViewModel, InterfaceC1569400qwU interfaceC1569400qwU, HomePageDataViewModel homePageDataViewModel) {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = interfaceC1569400qwU;
        this.LLILLJJLI = homePageDataViewModel;
        this.LLILLL = c1dfh;
        this.LLILZ = C452501pT.LIZIZ(new C1250650ieN());
        NextLiveData nextLiveData = new NextLiveData();
        this.LLILZIL = nextLiveData;
        this.LLILZLL = nextLiveData;
        NextLiveData nextLiveData2 = new NextLiveData();
        this.LLIZ = nextLiveData2;
        this.LLIZLLLIL = nextLiveData2;
        this.LLJI = "For You";
        List listLLIIII = C13LP.LLIIII(homeTabViewModel.lZ1(false));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC1583870rJp) it2.next()).tag());
        }
        this.LLJJI = new ArrayList(arrayList);
        this.LLJJIII = Collections.singletonList("Stem");
        hox.wQ2("HOME", new C1569820qxA(new C1569830qxB(this)));
    }
}
