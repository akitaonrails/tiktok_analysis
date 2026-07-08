package com.ss.android.ugc.nearby.toolzone;

import X.C1209080hZK;
import X.C21681819tI;
import X.C2211751BhN;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.nearby.container.model.NearbyToolZoneModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyToolZoneCell extends AssemPowerCell<NearbyToolZoneCellAssem, NearbyToolZoneModel> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new NearbyToolZoneCellAssem();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C1209080hZK(this, 5));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C21681819tI c21681819tI;
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) {
            return;
        }
        c21681819tI.LLILLJJLI = true;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        new NearbyToolZoneCellAssem();
        this.LL = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dsc, viewGroup, false);
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }
}
