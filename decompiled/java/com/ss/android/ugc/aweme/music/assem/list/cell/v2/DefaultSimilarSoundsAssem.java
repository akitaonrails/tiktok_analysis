package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C418440Gaw;
import X.C419910GdJ;
import X.C631230OpN;
import X.C631940OqW;
import X.C632090Oql;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultSimilarSoundsAssem extends ReusedUISlotAssem<DefaultSimilarSoundsAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.egh;
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
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.otm);
        this.LLJL = (TuxTextView) view.findViewById(R.id.otn);
    }

    public void op(C632090Oql c632090Oql) {
        String quantityString;
        Resources resources;
        int i;
        C631940OqW musicItemModel = c632090Oql.getMusicItemModel();
        if (musicItemModel.similarMusicSize <= 0) {
            C631230OpN.LIZ(getContentView());
            return;
        }
        C631230OpN.LIZJ(getContentView());
        TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            if (musicItemModel.unFoldStatus) {
                i = R.raw.icon_chevron_up_fill;
            } else {
                i = R.raw.icon_chevron_down_fill;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView == null) {
            return;
        }
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            int i2 = musicItemModel.similarMusicSize;
            quantityString = resources.getQuantityString(2131755637, i2, Integer.valueOf(i2));
        } else {
            quantityString = null;
        }
        tuxTextView.setText(quantityString);
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
