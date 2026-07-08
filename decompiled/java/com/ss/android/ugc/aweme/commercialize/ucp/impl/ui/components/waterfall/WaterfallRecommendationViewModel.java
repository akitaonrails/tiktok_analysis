package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C0D0E;
import X.C1954807lC;
import X.C1BNE;
import X.C2095008Iq;
import X.C2252321DDq;
import X.C23250099c;
import X.C332100D0e;
import X.C332110D0f;
import X.C332150D0j;
import X.C332170D0l;
import X.C332190D0n;
import X.C332210D0p;
import X.C332230D0r;
import X.C844470XAv;
import X.EnumC332220D0q;
import X.InterfaceC332180D0m;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class WaterfallRecommendationViewModel extends ViewModel {
    public final C0D0E LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Map<String, String> LLILZIL;
    public final EnumC332220D0q LLILZLL;
    public final String LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final AnonymousClass0951 LLJ;
    public AnonymousClass0956 LLJI;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void vQ2(boolean z) {
        int iIntValue;
        int i = C332210D0p.LIZ[this.LLILZLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
            } else {
                C332230D0r c332230D0r = InterfaceC332180D0m.LIZ;
                c332230D0r.getClass();
                if (Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.order_details.recommend_debug_status", "none"), "empty")) {
                    this.LLIZLLLIL.setValue(C332110D0f.INSTANCE);
                    return;
                }
                c332230D0r.getClass();
                if (Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.order_details.recommend_debug_status", "none"), "failed") && C332170D0l.LIZ()) {
                    C2252321DDq c2252321DDq = this.LLIZLLLIL;
                    C844470XAv.LIZ.getClass();
                    c2252321DDq.setValue(new C332100D0e(C844470XAv.LIZ().getString(2131857630)));
                    return;
                }
            }
        } else {
            InterfaceC332180D0m.LIZ.getClass();
            if (Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.thank_you.recommend_debug_status", "none"), "empty")) {
                this.LLIZLLLIL.setValue(C332110D0f.INSTANCE);
                return;
            }
            if (Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.thank_you.recommend_debug_status", "none"), "failed")) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(C332230D0r.LIZ().getString("ucp_demo.thank_you.recommend_fail_remaining", CardStruct.IStatusCode.DEFAULT));
                if (numLJIIJJI != null && (iIntValue = numLJIIJJI.intValue()) >= 0 && iIntValue > 0) {
                    int i2 = iIntValue - 1;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    C332230D0r.LIZ().putString("ucp_demo.thank_you.recommend_fail_remaining", String.valueOf(i2));
                    if (i2 == 0) {
                        C332230D0r.LIZ().putString("ucp_demo.thank_you.recommend_debug_status", "none");
                    }
                    C2252321DDq c2252321DDq2 = this.LLIZLLLIL;
                    C844470XAv.LIZ.getClass();
                    c2252321DDq2.setValue(new C332100D0e(C844470XAv.LIZ().getString(2131857630)));
                    return;
                }
                C332230D0r.LIZ().putString("ucp_demo.thank_you.recommend_debug_status", "none");
                C332230D0r.LIZ().putString("ucp_demo.thank_you.recommend_fail_remaining", CardStruct.IStatusCode.DEFAULT);
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZLLLIL.setValue(C332190D0n.INSTANCE);
        this.LLJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C332150D0j(this, z, null), 3);
    }

    public WaterfallRecommendationViewModel(C0D0E c0d0e, String str, String str2, String str3, Map map, EnumC332220D0q enumC332220D0q, String str4) {
        this.LL = c0d0e;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = map;
        this.LLILZLL = enumC332220D0q;
        this.LLIZ = str4;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C332190D0n.INSTANCE);
        this.LLIZLLLIL = c2252321DDqLIZ;
        this.LLJ = C09IC.LIZIZ(c2252321DDqLIZ);
        vQ2(false);
    }
}
