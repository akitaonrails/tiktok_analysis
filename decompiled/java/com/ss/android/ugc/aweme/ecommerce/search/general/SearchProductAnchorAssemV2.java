package com.ss.android.ugc.aweme.ecommerce.search.general;

import X.C0Q29;
import X.C1558520qew;
import X.InterfaceC583720Muw;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchProductAnchorAssemV2 extends SearchProductAnchorAssem {
    @Override // com.ss.android.ugc.aweme.ecommerce.search.general.SearchProductAnchorAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 28);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.rx3);
        if (viewGroup != null) {
            C0Q29 c0q29 = new C0Q29(view.getContext(), awS554S0100000_10, 6);
            this.LLJL = c0q29;
            viewGroup.addView(c0q29);
        }
        ((SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class)).Im2(new InterfaceC583720Muw() { // from class: X.0Pmx
            @Override // X.InterfaceC583720Muw
            public final void LIZ() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZJ() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC583720Muw
            public final void onBuffering(boolean z) {
            }

            @Override // X.InterfaceC583720Muw
            public final void onLoading() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LJII() {
                ITopLiveProductView iTopLiveProductView = this.LIZ.LLJL;
                if (iTopLiveProductView != null) {
                    iTopLiveProductView.resumeDisplay();
                }
            }

            @Override // X.InterfaceC583720Muw
            public final void LJJZ() {
                ITopLiveProductView iTopLiveProductView = this.LIZ.LLJL;
                if (iTopLiveProductView != null) {
                    iTopLiveProductView.resumeDisplay();
                }
            }

            @Override // X.InterfaceC583720Muw
            public final void onPause() {
                ITopLiveProductView iTopLiveProductView = this.LIZ.LLJL;
                if (iTopLiveProductView != null) {
                    iTopLiveProductView.pauseDisplay();
                }
            }
        });
    }
}
