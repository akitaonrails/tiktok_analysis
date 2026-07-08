package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.recommend;

import X.AbstractC1542200qEc;
import X.C00X6;
import X.C1541950qED;
import X.C1548730qP9;
import X.C1548750qPB;
import X.C1735790vGr;
import X.C2097608Jq;
import X.InterfaceC1541990qEH;
import X.InterfaceC1891350zJl;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductRecommendCell extends PowerCell<C00X6> {
    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        C1735790vGr c1735790vGr;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView;
        InterfaceC1541990qEH kitView;
        super.onPause();
        View view = this.itemView;
        if (!(view instanceof C1735790vGr) || (c1735790vGr = (C1735790vGr) view) == null || (sparkView = c1735790vGr.getSparkView()) == null || (kitView = sparkView.getKitView()) == null) {
            return;
        }
        kitView.onHide();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00X6 c00x6 = (C00X6) interfaceC1891350zJl;
        final C1735790vGr c1735790vGr = (C1735790vGr) this.itemView;
        if (c1735790vGr.getSparkView() == null) {
            final String str = c00x6.LL;
            if (c1735790vGr.LL == null) {
                Context context = c1735790vGr.getContext();
                C1548730qP9 c1548730qP9 = new C1548730qP9();
                c1548730qP9.LJIIJJI = str;
                c1548730qP9.LJI = new AwS675S0100000_26(c1735790vGr, 42);
                c1548730qP9.LJIIIIZZ = new AbstractC1542200qEc() { // from class: X.0vGs
                    @Override // X.AbstractC1537870q7d
                    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str2, C1542120qEU c1542120qEU) {
                        int iIntValue;
                        C1735790vGr c1735790vGr2 = c1735790vGr;
                        String str3 = str;
                        Integer num = c1542120qEU.LIZ;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        String str4 = c1542120qEU.LIZIZ;
                        c1735790vGr2.getClass();
                        C1735790vGr.LIZ(iIntValue, str3, str4);
                    }
                };
                C1548750qPB.LIZ.getClass();
                SparkContext sparkContextLIZ = c1548730qP9.LIZ(C2097608Jq.LJ(), false);
                C1541950qED.LIZJ.getClass();
                c1735790vGr.LL = new C1541950qED(context, sparkContextLIZ).LIZ(false);
            }
            if (c1735790vGr.getChildCount() == 0) {
                c1735790vGr.addView(c1735790vGr.LL, new FrameLayout.LayoutParams(-1, -1));
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1735790vGr.LL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1735790vGr c1735790vGr = new C1735790vGr(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1735790vGr);
        c1735790vGr.setLayoutParams(layoutParams);
        return c1735790vGr;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        C1735790vGr c1735790vGr;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView;
        InterfaceC1541990qEH kitView;
        super.onResume(z);
        View view = this.itemView;
        if ((view instanceof C1735790vGr) && (c1735790vGr = (C1735790vGr) view) != null && (sparkView = c1735790vGr.getSparkView()) != null && (kitView = sparkView.getKitView()) != null) {
            kitView.onShow();
        }
    }
}
