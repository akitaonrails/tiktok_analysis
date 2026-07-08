package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard;

import X.C01GW;
import X.C0Q18;
import X.C2188811AlT;
import X.C452501pT;
import X.C655610Pnb;
import X.C656300Poi;
import X.EnumC656000PoE;
import X.InterfaceC1587906Jp;
import X.InterfaceC656550Pp7;
import X.InterfaceC657510Pqf;
import X.InterfaceC660150Puv;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdTopSingleCardHeaderAssem extends ReusedUISlotAssem<SearchAdTopSingleCardHeaderAssem> implements InterfaceC712990Rxx<C656300Poi> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 714));
    public InterfaceC656550Pp7 LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.et_;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C656300Poi c656300Poi) {
        InterfaceC660150Puv interfaceC660150PuvLJIJ;
        C0Q18 c0q18LIZ;
        C656300Poi c656300Poi2 = c656300Poi;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        InterfaceC656550Pp7 interfaceC656550Pp7 = null;
        if (interfaceC657510PqfLIZLLL != null) {
            interfaceC660150PuvLJIJ = interfaceC657510PqfLIZLLL.LJIJ(c656300Poi2.getAweme());
        } else {
            interfaceC660150PuvLJIJ = null;
        }
        if (interfaceC660150PuvLJIJ instanceof InterfaceC656550Pp7) {
            interfaceC656550Pp7 = (InterfaceC656550Pp7) interfaceC660150PuvLJIJ;
        }
        this.LLJL = interfaceC656550Pp7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderAssem [bind], searchAdTopSingleCardModule = ");
        sbLIZ.append(this.LLJL);
        sbLIZ.append(", aweme.aid = ");
        sbLIZ.append(c656300Poi2.getAweme().getAid());
        sbLIZ.append(", reqId = ");
        sbLIZ.append(c656300Poi2.getAweme().getRequestId());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC656550Pp7 interfaceC656550Pp72 = this.LLJL;
        if (interfaceC656550Pp72 != null && (c0q18LIZ = interfaceC656550Pp72.LIZ()) != null) {
            c0q18LIZ.Xq2(EnumC656000PoE.SEARCH_AD_TOP_SINGLE_CARD_HEADER.getValue(), (ViewGroup) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C656300Poi c656300Poi) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C656300Poi c656300Poi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
