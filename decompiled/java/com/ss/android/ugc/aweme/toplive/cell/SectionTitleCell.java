package com.ss.android.ugc.aweme.toplive.cell;

import X.C01GW;
import X.C03H8;
import X.C426750GoL;
import X.C439101nJ;
import X.C452501pT;
import X.C482430Ivx;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SectionTitleCell extends ToplivePagePowerCell<C482430Ivx> implements C03H8 {
    public final C01GW LLILLJJLI;

    public SectionTitleCell() {
        super(true);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 538));
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C482430Ivx c482430Ivx) {
        super.onBindItemView(c482430Ivx);
        ((TextView) this.LLILLJJLI.getValue()).setText(c482430Ivx.LL.itemName);
        if (Intrinsics.LJFF(c482430Ivx.LLILLJJLI, "you_may_like")) {
            C426750GoL.LJIIIZ(this.itemView, 0, 0, 0, Integer.valueOf(C439101nJ.LIZ(4)), false, 16);
        } else {
            C426750GoL.LJIIIZ(this.itemView, 0, 0, 0, 0, false, 16);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.diz, viewGroup, false);
    }
}
