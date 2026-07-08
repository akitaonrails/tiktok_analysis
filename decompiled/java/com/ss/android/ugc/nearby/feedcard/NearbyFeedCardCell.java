package com.ss.android.ugc.nearby.feedcard;

import X.C1200910hM9;
import X.C1204470hRt;
import X.C1558420qem;
import X.C1558520qew;
import X.C686930Qx1;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.nearby.container.ability.IContainerAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedCardCell extends AssemPowerCell<NearbyFeedCellAssem, C1204470hRt> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new NearbyFeedCellAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd;
        C1200910hM9 c1200910hM9N32;
        C686930Qx1 c686930Qx1;
        new NearbyFeedCellAssem();
        IContainerAbility iContainerAbility = (IContainerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IContainerAbility.class, null);
        if (iContainerAbility == null || (c1200910hM9N32 = iContainerAbility.n32()) == null || (c686930Qx1 = c1200910hM9N32.LIZ) == null || (viewTd = c686930Qx1.LIZIZ(R.layout.ds3)) == null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ds3, viewGroup, false);
        }
        this.LL = viewTd;
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }
}
