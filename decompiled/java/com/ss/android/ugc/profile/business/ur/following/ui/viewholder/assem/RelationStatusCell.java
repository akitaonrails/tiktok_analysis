package com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem;

import X.C01GW;
import X.C1749280vcc;
import X.C1782830wUj;
import X.C1808120x9W;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1808130x9X;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class RelationStatusCell extends PowerCell<C1782830wUj> implements InterfaceC1808130x9X {
    public final C01GW LL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 739));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 741));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 740));
    public boolean LLILZ = true;

    @Override // X.InterfaceC1808130x9X
    public final void LJII() {
        this.LLILZ = false;
    }

    @Override // X.InterfaceC1808130x9X
    public final Context LLIL() {
        return (Context) this.LL.getValue();
    }

    @Override // X.InterfaceC1808130x9X
    public final C1749280vcc getStatusView() {
        return (C1749280vcc) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1808130x9X
    public final TuxTextView o3() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1808130x9X
    public final boolean LJJI() {
        return this.LLILZ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1808120x9W.LIZ(this, (C1782830wUj) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eez, viewGroup, false);
    }
}
