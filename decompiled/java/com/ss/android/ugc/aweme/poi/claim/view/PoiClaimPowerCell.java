package com.ss.android.ugc.aweme.poi.claim.view;

import X.C1200050hKl;
import X.C1200110hKr;
import X.C1220000hqw;
import X.C13LE;
import X.C452070Ho5;
import X.C686930Qx1;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimPowerCell extends AssemPowerCell<PoiClaimListCellAssem, C1200050hKl> {
    public final C736950SvV LLIZ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiClaimListCellAssem();
    }

    public PoiClaimPowerCell() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(278);
        this.LLIZ = new C736950SvV(C13LE.LIZ(PoiClaimPoiListViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(282), null, null, null);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd;
        C686930Qx1 c686930Qx1;
        new PoiClaimListCellAssem();
        C1200110hKr c1200110hKr = ((PoiClaimPoiListViewModel) this.LLIZ.getValue()).LLJILJIL;
        if (c1200110hKr == null || (c686930Qx1 = c1200110hKr.LIZ) == null || (viewTd = c686930Qx1.LIZIZ(R.layout.dyt)) == null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dyt, viewGroup, false);
        }
        this.LL = viewTd;
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }
}
