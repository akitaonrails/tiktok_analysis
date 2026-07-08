package com.ss.android.ugc.aweme.tako.otherpage.share.cards.sharetitle;

import X.C0284007u;
import X.C07ID;
import X.C426750GoL;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoShareTitleAssem extends ReusedUISlotAssem<TakoShareTitleAssem> implements InterfaceC712990Rxx<C0284007u> {
    public View LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fni;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.v1u);
        if (C07ID.LIZ() && (view2 = this.LLJJLIIIJLLLLLLLZ) != null) {
            C426750GoL.LJIIL(view2, 0, 0, 0, 0, 16);
        }
        this.LLJL = (TuxTextView) view.findViewById(R.id.v1t);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0284007u c0284007u) {
        C0284007u c0284007u2 = c0284007u;
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            tuxTextView.setText(c0284007u2.LL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0284007u c0284007u) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0284007u c0284007u) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
