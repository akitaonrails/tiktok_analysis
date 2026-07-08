package com.ss.android.ugc.aweme.poi.detail.cells;

import X.C1200890hM7;
import X.C337180DJs;
import X.C430000Gta;
import Y.ARunnableS87S0200000_18;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRegionalCardCell extends PoiBaseCardCell {
    public SmartImageView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public View LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C430000Gta LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e74;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJ = (SmartImageView) view.findViewById(R.id.f58);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.r4z);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.zhm);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.zhn);
        this.LLJJJJLIIL = view.findViewById(R.id.fkf);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.qw2);
        this.LLJJLIIIJLLLLLLLZ = (C430000Gta) view.findViewById(R.id.x2s);
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void zp(SlashCellModel slashCellModel) {
        String str;
        String str2;
        PoiCardCellData poiCardCellData = (PoiCardCellData) this.LLJJIII;
        Gp(poiCardCellData, this.LLJJJ);
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            if (poiCardCellData != null) {
                str2 = poiCardCellData.poiName;
            } else {
                str2 = null;
            }
            tuxTextView.setText(str2);
        }
        if (poiCardCellData != null && (str = poiCardCellData.regionLevel) != null && C1200890hM7.LIZ(str)) {
            TuxTextView tuxTextView2 = this.LLJJL;
            if (tuxTextView2 != null) {
                C337180DJs.LIZJ(tuxTextView2);
            }
            TuxTextView tuxTextView3 = this.LLJJL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(poiCardCellData.regionLevel);
            }
        } else {
            TuxTextView tuxTextView4 = this.LLJJL;
            if (tuxTextView4 != null) {
                C337180DJs.LIZ(tuxTextView4);
            }
        }
        C430000Gta c430000Gta = this.LLJJLIIIJLLLLLLLZ;
        if (c430000Gta != null) {
            HandlerHook.viewPost(c430000Gta, new ARunnableS87S0200000_18(this, poiCardCellData, 9));
        }
        Jp(poiCardCellData, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL);
    }
}
