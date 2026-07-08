package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell;

import X.C01GW;
import X.C1220000hqw;
import X.C1271404yG;
import X.C13LE;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1578890rBn;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPanelBannerCell extends PowerCell<C1271404yG> {
    public TuxTextView LL;
    public View LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 736));
    public final C736950SvV LLILZ;

    public SeriesPanelBannerCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 737);
        this.LLILZ = new C736950SvV(C13LE.LIZ(SeriesPanelSquareViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(219), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.urw);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.urv);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(EnumC1578890rBn.ICON_SERIES_FILL.id());
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.urt);
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_x_mark);
        }
        View viewFindViewById = this.itemView.findViewById(R.id.uru);
        this.LLILLJJLI = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 24), viewFindViewById);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1271404yG c1271404yG = (C1271404yG) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1271404yG.LL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bbw, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1271404yG c1271404yG = (C1271404yG) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1271404yG.LL);
        }
    }
}
