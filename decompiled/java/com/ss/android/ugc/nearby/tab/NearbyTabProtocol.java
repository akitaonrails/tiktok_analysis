package com.ss.android.ugc.nearby.tab;

import X.C1203730hQh;
import X.C1205170hT1;
import X.C1388190mED;
import X.C1578630rBN;
import X.C1583120rIc;
import X.C19EG;
import X.C2188811AlT;
import X.C486860J7k;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1571190qzN;
import X.EnumC1583970rJz;
import X.InterfaceC1589850rTT;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import com.ss.android.ugc.nearby.container.NearbyFragment;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class NearbyTabProtocol extends TopTabProtocol {
    public final String LLILZIL = "Nearby";
    public final Class<? extends Fragment> LLILZLL = NearbyFragment.class;
    public Context LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        return new C1583120rIc() { // from class: X.0rI5
            public static boolean LIZJ;

            @Override // X.C1583120rIc
            public final AbstractC1584410rKh LIZJ() {
                return new C1574870r5J();
            }

            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1584440rKk c1584440rKk) {
                View viewLIZJ = C20673215v0.LIZJ(R.layout.dsp, C1388190mED.LIZ(c1584440rKk.LIZ));
                if (!LIZJ) {
                    LIZJ = true;
                    C0S78.LIZJ(new AwS568S0100000_24(viewLIZJ, 1675), false);
                }
                return new C1205180hT2(viewLIZJ, c1584440rKk.LIZJ);
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1571190qzN LJIIL() {
        Context context = this.LLIZ;
        return (context == null || !C960203pA.LIZIZ(context)) ? EnumC1571190qzN.LIGHT : EnumC1571190qzN.DARK;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        C1205170hT1.LIZ.getClass();
        return C1205170hT1.LIZIZ();
    }

    public NearbyTabProtocol() {
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLIZLLLIL = "homepage_nearby";
        this.LLJ = 7;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final InterfaceC1589850rTT LJ() {
        return new InterfaceC1589850rTT() { // from class: X.0rTO
            @Override // X.InterfaceC1589850rTT
            public final void LJ() {
            }

            @Override // X.InterfaceC1589850rTT
            public final void LIZLLL() {
                C1203790hQn.LIZIZ(EnumC1589810rTP.TOUCH_UP, null);
            }

            @Override // X.InterfaceC1589850rTT
            public final void LIZ(C1589790rTN c1589790rTN) {
                C1203790hQn.LIZIZ(EnumC1589810rTP.PAGE_DETERMINE_SELECTED, c1589790rTN.LIZ);
            }

            @Override // X.InterfaceC1589850rTT
            public final void LIZIZ(C1589790rTN c1589790rTN) {
                C1203790hQn.LIZIZ(EnumC1589810rTP.PAGE_SCROLL_START, c1589790rTN.LIZ);
            }

            @Override // X.InterfaceC1589850rTT
            public final void LIZJ(C1589860rTU c1589860rTU) {
                C1203790hQn.LIZIZ(EnumC1589810rTP.TOUCH_DOWN, null);
            }

            @Override // X.InterfaceC1589850rTT
            public final void LJFF(C1589790rTN c1589790rTN) {
                C1203790hQn.LIZIZ(EnumC1589810rTP.PAGE_SCROLL_OVER_THRESHOLD, c1589790rTN.LIZ);
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyTabProtocol onUnSelect toTab");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLJ);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_nearby", bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Nearby");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        this.LLIZ = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyTabProtocol getTitle, th: ");
        sbLIZ.append(C786410Ut5.u3());
        C2188811AlT.LIZIZ(sbLIZ);
        C1205170hT1 c1205170hT1 = C1205170hT1.LIZ;
        C1203730hQh.LIZ.getClass();
        RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
        if (roamingLocationInfoLIZ != null) {
            str = roamingLocationInfoLIZ.manualRegionName;
        } else {
            str = null;
        }
        c1205170hT1.getClass();
        return C1205170hT1.LJ(str);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIZ(String str, String str2) {
        C19EG c19egLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyTabProtocol onSelect lastTabName");
        sbLIZ.append(str);
        sbLIZ.append(", enterMethod");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = this.LLIZ;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi$default(IHomeSidebarService.class, false, false, false, 14, null);
            if (iHomeSidebarService != null && iHomeSidebarService.LJ(c19egLIZIZ)) {
                C486860J7k.LIZIZ(c19egLIZIZ).KQ2(true);
            } else {
                C486860J7k.LIZIZ(c19egLIZIZ).KQ2(false);
            }
        }
    }
}
