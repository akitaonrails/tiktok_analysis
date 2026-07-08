package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C632090Oql;
import X.EnumC631610Opz;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultThirdLineAssem extends ReusedUISlotAssem<DefaultThirdLineAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.egj;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    public void op(EnumC631610Opz enumC631610Opz, MusicModel musicModel, boolean z, boolean z2) {
        throw null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Eo(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.otq);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        C632090Oql c632090Oql2 = c632090Oql;
        op(c632090Oql2.getMusicItemModel().pinStatus, c632090Oql2.getMusicModel(), c632090Oql2.getMusicItemModel().isHighlighted(), c632090Oql2.getMusicItemModel().isSpotlighted());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C632090Oql c632090Oql) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C632090Oql c632090Oql) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
