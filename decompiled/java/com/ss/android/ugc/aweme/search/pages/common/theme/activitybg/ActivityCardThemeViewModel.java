package com.ss.android.ugc.aweme.search.pages.common.theme.activitybg;

import X.C01GW;
import X.C07GU;
import X.C0P8J;
import X.C0P8L;
import X.C0QLM;
import X.C0QNH;
import X.C0QOE;
import X.C452501pT;
import X.C640160P9a;
import X.C640210P9f;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData;
import com.ss.android.ugc.aweme.discover.model.SearchActivityCardGradientConfig;
import com.ss.android.ugc.aweme.search.SearchSkinAbility;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivityCardThemeViewModel extends ViewModel {
    public int LL;
    public int LLILLJJLI;
    public SearchActivityCardBgData LLILZIL;
    public AwS554S0100000_10 LLIZLLLIL;
    public boolean LLILLL = true;
    public float LLILZ = 0.5f;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(263));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(260));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(258));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 381));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(261));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(259));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 382));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(262));

    public final float wQ2() {
        Double startPercent;
        if (!this.LLILLL) {
            return 1.0f;
        }
        SearchActivityCardBgData searchActivityCardBgData = this.LLILZIL;
        if (searchActivityCardBgData == null || !C640210P9f.LIZIZ(searchActivityCardBgData)) {
            int i = this.LLILLJJLI;
            int i2 = this.LL;
            if ((i + i2) / 2 < i2) {
                return 1.0f;
            }
            return ((r0 - i2) * 1.0f) / i;
        }
        int i3 = this.LL;
        int i4 = this.LLILLJJLI;
        SearchActivityCardBgData searchActivityCardBgData2 = this.LLILZIL;
        Double endPercent = null;
        if (searchActivityCardBgData2 == null) {
            return 1.0f;
        }
        SearchActivityCardGradientConfig gradientConfig = searchActivityCardBgData2.getGradientConfig();
        if (gradientConfig == null) {
            startPercent = null;
            if (searchActivityCardBgData2 != null) {
            }
            if (startPercent != null || endPercent == null || startPercent.doubleValue() > endPercent.doubleValue() || startPercent.doubleValue() < 0.0d || endPercent.doubleValue() > 1.0d) {
                return 1.0f;
            }
            double dDoubleValue = (((double) (i4 + i3)) * startPercent.doubleValue()) / endPercent.doubleValue();
            double d = i3;
            if (dDoubleValue >= d) {
                return (float) (((dDoubleValue - d) * ((double) 1.0f)) / ((double) i4));
            }
            return 1.0f;
        }
        startPercent = gradientConfig.getStartPercent();
        SearchActivityCardGradientConfig gradientConfig2 = searchActivityCardBgData2.getGradientConfig();
        if (gradientConfig2 != null) {
            endPercent = gradientConfig2.getEndPercent();
        }
        return startPercent != null ? 1.0f : 1.0f;
    }

    public final LiveData<C640160P9a> xQ2() {
        return (LiveData) this.LLJI.getValue();
    }

    public final MutableLiveData<Boolean> yQ2() {
        return (MutableLiveData) this.LLILZLL.getValue();
    }

    public final void vQ2(C640160P9a c640160P9a) {
        SearchSkinAbility searchSkinAbility;
        if (C07GU.LIZ()) {
            AwS554S0100000_10 awS554S0100000_10 = this.LLIZLLLIL;
            if (awS554S0100000_10 != null && (searchSkinAbility = (SearchSkinAbility) awS554S0100000_10.invoke()) != null) {
                C0QOE c0qoe = C0QOE.GENERAL;
                C0QNH c0qnh = C0QNH.DEALS_DARK;
                if (!Intrinsics.LJFF(c640160P9a.LIZ, "activity_bg")) {
                    c0qnh = null;
                }
                searchSkinAbility.Z01(c0qoe, new C0QLM(c0qnh, null, null, null, null, new C0P8J(c640160P9a), 30));
                return;
            }
            return;
        }
        ((LiveData) this.LLJ.getValue()).postValue(c640160P9a);
    }

    public final void zQ2(C640160P9a c640160P9a) {
        SearchSkinAbility searchSkinAbility;
        if (C07GU.LIZ()) {
            AwS554S0100000_10 awS554S0100000_10 = this.LLIZLLLIL;
            if (awS554S0100000_10 != null && (searchSkinAbility = (SearchSkinAbility) awS554S0100000_10.invoke()) != null) {
                C0QOE c0qoe = C0QOE.GENERAL;
                C0QNH c0qnh = C0QNH.DEALS_DARK;
                if (!Intrinsics.LJFF(c640160P9a.LIZ, "activity_bg")) {
                    c0qnh = null;
                }
                searchSkinAbility.Z01(c0qoe, new C0QLM(c0qnh, null, null, null, null, new C0P8L(c640160P9a), 30));
                return;
            }
            return;
        }
        ((LiveData) this.LLJILJIL.getValue()).postValue(c640160P9a);
    }
}
