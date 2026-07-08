package com.ss.android.ugc.aweme.detail.prefab.videos;

import X.C1558360qeg;
import X.C1558520qew;
import X.C607770Nsd;
import X.C723830SaL;
import X.C724240Sb0;
import X.C786410Ut5;
import Y.ACListenerS132S0200000_30;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public class DetailVideoCellAssem extends ReusedUISlotAssem<DetailVideoCellAssem> {
    public InnerFlowAbility<C607770Nsd> LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bk_;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InnerFlowAbility<C607770Nsd> innerFlowAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            innerFlowAbility = (InnerFlowAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), InnerFlowAbility.class, null);
        } else {
            innerFlowAbility = null;
        }
        this.LLJJLIIIJLLLLLLLZ = innerFlowAbility;
        view.setPadding(1, 1, 1, 1);
        C786410Ut5.I7(new ACListenerS132S0200000_30(view, this, 1), view);
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 40));
    }
}
