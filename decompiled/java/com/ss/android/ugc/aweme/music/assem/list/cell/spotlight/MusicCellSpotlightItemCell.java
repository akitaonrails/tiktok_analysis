package com.ss.android.ugc.aweme.music.assem.list.cell.spotlight;

import X.C325700Cpk;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellSpotlightItemCell extends AssemPowerCell<MusicCellSpotlightItemAssem, C325700Cpk> {
    public MusicCellSpotlightItemAssem LLIZ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        MusicCellSpotlightItemAssem musicCellSpotlightItemAssem = new MusicCellSpotlightItemAssem();
        this.LLIZ = musicCellSpotlightItemAssem;
        return musicCellSpotlightItemAssem;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        SmartImageView smartImageView;
        super.onViewAttachedToWindow();
        MusicCellSpotlightItemAssem musicCellSpotlightItemAssem = this.LLIZ;
        if (musicCellSpotlightItemAssem == null || (smartImageView = musicCellSpotlightItemAssem.LLJLIL) == null) {
            return;
        }
        smartImageView.setAttached(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        SmartImageView smartImageView;
        super.onViewDetachedFromWindow();
        MusicCellSpotlightItemAssem musicCellSpotlightItemAssem = this.LLIZ;
        if (musicCellSpotlightItemAssem == null || (smartImageView = musicCellSpotlightItemAssem.LLJLIL) == null) {
            return;
        }
        smartImageView.setAttached(false);
    }
}
