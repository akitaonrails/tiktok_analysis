package com.ss.android.ugc.aweme.homepage.ui.slide;

import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1570630qyT;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C680080Qly;
import X.C729510SjV;
import X.InterfaceC1577800rA2;
import X.InterfaceC1583870rJp;
import androidx.lifecycle.ViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class XTabScrollProfileVM extends ViewModel implements InterfaceC1577800rA2 {
    public static final /* synthetic */ int LLILZ = 0;
    public final C19EG LL;
    public final HomePageDataViewModel LLILLJJLI;
    public final List<String> LLILLL;

    public XTabScrollProfileVM(C19EG c19eg) {
        Hox.LLJILJIL.LIZ(c19eg);
        HomeTabViewModel homeTabViewModelLIZ = HomeTabViewModel.LLILZIL.LIZ(c19eg);
        HomePageDataViewModel homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(c19eg);
        this.LL = c19eg;
        this.LLILLJJLI = homePageDataViewModelLIZIZ;
        List listLLIIII = C13LP.LLIIII(homeTabViewModelLIZ.lZ1(false));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC1583870rJp) it2.next()).tag());
        }
        this.LLILLL = new ArrayList(arrayList);
        C1570630qyT.LIZ(this.LL);
    }

    @Override // X.InterfaceC1577800rA2
    public final IXTabScrollProfileStrategy wC0(String str) {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJI(this.LL, null), InterceptHomeViewPagerProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                AbsTabScrollProfileStrategy absTabScrollProfileStrategyRk0 = ((InterceptHomeViewPagerProtocol) it2.next()).Rk0();
                if (Intrinsics.LJFF(absTabScrollProfileStrategyRk0.LL, str)) {
                    return absTabScrollProfileStrategyRk0;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1577800rA2
    public final boolean Bx0(float f, float f2) {
        boolean z;
        boolean z2 = false;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJI(this.LL, null), InterceptHomeViewPagerProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterceptHomeViewPagerProtocol interceptHomeViewPagerProtocol = (InterceptHomeViewPagerProtocol) it2.next();
                if (interceptHomeViewPagerProtocol.enable()) {
                    AbsTabScrollProfileStrategy absTabScrollProfileStrategyRk0 = interceptHomeViewPagerProtocol.Rk0();
                    if (absTabScrollProfileStrategyRk0 != null) {
                        Aweme aweme = this.LLILLJJLI.LLJILJILJ;
                        if (aweme != null && (C729510SjV.LJJIJIL(aweme) || AwemeExtKt.isPhotoMode(aweme))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zLY1 = absTabScrollProfileStrategyRk0.LY1(f, f2, z);
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("strategy: ");
                        sbLIZ.append(absTabScrollProfileStrategyRk0);
                        sbLIZ.append(", specialMode: ");
                        Aweme aweme2 = this.LLILLJJLI.LLJILJILJ;
                        if (aweme2 != null && (C729510SjV.LJJIJIL(aweme2) || AwemeExtKt.isPhotoMode(aweme2))) {
                            z2 = true;
                        }
                        sbLIZ.append(z2);
                        sbLIZ.append(" isInterceptScroll: ");
                        sbLIZ.append(zLY1);
                        C1720106oR.LJI("ScrollProfile", C2188811AlT.LIZIZ(sbLIZ));
                        return zLY1;
                    }
                }
            }
        }
        return false;
    }
}
