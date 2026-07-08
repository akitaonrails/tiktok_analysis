package com.ss.android.ugc.aweme.detail.prefab;

import X.C01GW;
import X.C2188811AlT;
import X.C327850CtD;
import X.C452501pT;
import android.view.View;
import com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class DetailPageStatusViewAssem extends FullPageStatusViewAssem {
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 104));
    public boolean LLJJIJIL = true;

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber
    public final void i1() {
        super.i1();
        String str = (String) this.LLJJIJIIJIL.getValue();
        if (str != null) {
            C327850CtD.LIZ("detail_prepare_network", str);
            C327850CtD.LIZLLL("detail_page_visible", str);
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public void t0() {
        super.t0();
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            String str = (String) this.LLJJIJIIJIL.getValue();
            if (str != null) {
                C327850CtD.LIZ("detail_page_visible", str);
                C327850CtD.LIZLLL("detail_header_render", str);
                C327850CtD.LIZLLL("detail_content_render", str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber
    public final void LLLLLZIL(Throwable th) {
        Throwable th2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshError throwable: ");
        sbLIZ.append(th);
        sbLIZ.append(", exception: ");
        if (th instanceof Exception) {
            th2 = th;
        } else {
            th2 = null;
        }
        sbLIZ.append(th2);
        C2188811AlT.LIZIZ(sbLIZ);
        super.LLLLLZIL(th);
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            String str = (String) this.LLJJIJIIJIL.getValue();
            if (str != null) {
                C327850CtD.LIZJ("detail_page_visible", str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        if (Intrinsics.LJFF(this.LLJJI.getValue(), this.LLJJIJIIJIL.getValue()) && this.LLJJIJIIJIL.getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJIL = z;
    }
}
