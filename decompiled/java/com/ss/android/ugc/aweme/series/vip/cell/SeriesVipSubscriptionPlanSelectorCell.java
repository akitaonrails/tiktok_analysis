package com.ss.android.ugc.aweme.series.vip.cell;

import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1573130r2V;
import X.C1573140r2W;
import X.C432110Gwz;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesVipSubscriptionPlanSelectorCell extends PowerCell<C1573140r2W> {
    public final C432110Gwz LL = new C432110Gwz();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1112));
    public final C736950SvV LLILLL;
    public ViewGroup LLILZ;

    public SeriesVipSubscriptionPlanSelectorCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1113);
        this.LLILLL = new C736950SvV(C13LE.LIZ(SeriesVipSubscriptionViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(358), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZ = (ViewGroup) this.itemView.findViewById(R.id.ush);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1573140r2W c1573140r2W = (C1573140r2W) interfaceC1891350zJl;
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            C432110Gwz c432110Gwz = this.LL;
            C1573130r2V c1573130r2V = c1573140r2W.LL;
            c432110Gwz.LIZ(viewGroup, c1573130r2V.LIZ, c1573130r2V.LIZIZ, c1573130r2V.LIZJ, c1573130r2V.LIZLLL, c1573130r2V.LJ, ((SeriesVipSubscriptionViewModel) this.LLILLL.getValue()).DQ2(), new AwS603S0100000_24(this, 706));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.big, viewGroup, false);
    }
}
