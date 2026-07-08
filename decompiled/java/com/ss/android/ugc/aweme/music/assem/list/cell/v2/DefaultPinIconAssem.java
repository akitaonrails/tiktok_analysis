package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C418440Gaw;
import X.C419910GdJ;
import X.C631230OpN;
import X.C632090Oql;
import X.C632780Ors;
import X.C814420VxA;
import X.EnumC631610Opz;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultPinIconAssem extends ReusedUISlotAssem<DefaultPinIconAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public TuxIconView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.efy;
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Eo(View view) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.otg);
        if (tuxIconView != null) {
            C632780Ors.LIZ(tuxIconView, 10, 10, 10, 10);
        } else {
            tuxIconView = null;
        }
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        int i;
        int i2;
        C632090Oql c632090Oql2 = c632090Oql;
        boolean zIsSimilarMusic = c632090Oql2.getMusicItemModel().isSimilarMusic();
        boolean zIsHighlighted = c632090Oql2.getMusicItemModel().isHighlighted();
        EnumC631610Opz enumC631610Opz = c632090Oql2.getMusicItemModel().pinStatus;
        boolean zIsSpotlighted = c632090Oql2.getMusicItemModel().isSpotlighted();
        if (!zIsSimilarMusic && !zIsHighlighted && !zIsSpotlighted) {
            C631230OpN.LIZJ(getContentView());
            TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                EnumC631610Opz enumC631610Opz2 = EnumC631610Opz.PINNED;
                if (enumC631610Opz == enumC631610Opz2) {
                    i = R.raw.icon_pin_fill;
                } else {
                    i = R.raw.icon_pin;
                }
                c419910GdJ.LIZ = i;
                if (enumC631610Opz != enumC631610Opz2 && enumC631610Opz != EnumC631610Opz.ENABLE_PINNED) {
                    i2 = R.attr.a1p;
                } else {
                    i2 = R.attr.a1h;
                }
                c419910GdJ.LJ = Integer.valueOf(i2);
                tuxIconView.setTuxIcon(c419910GdJ);
                return;
            }
            return;
        }
        C631230OpN.LIZ(getContentView());
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
