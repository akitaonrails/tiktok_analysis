package com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight;

import X.C050S;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: loaded from: classes10.dex */
public final class FanSpotlightBlockVideoCell extends AssemPowerCell<FanSpotlightBlockVideoAssem, C050S> {
    public FanSpotlightBlockVideoAssem LLIZ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        FanSpotlightBlockVideoAssem fanSpotlightBlockVideoAssem = new FanSpotlightBlockVideoAssem();
        this.LLIZ = fanSpotlightBlockVideoAssem;
        return fanSpotlightBlockVideoAssem;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        FanSpotlightBlockVideoAssem fanSpotlightBlockVideoAssem = this.LLIZ;
        if (fanSpotlightBlockVideoAssem != null) {
            SmartImageView smartImageView = fanSpotlightBlockVideoAssem.LLJLIL;
            if (smartImageView == null) {
                smartImageView = null;
            }
            smartImageView.setAttached(true);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        FanSpotlightBlockVideoAssem fanSpotlightBlockVideoAssem = this.LLIZ;
        if (fanSpotlightBlockVideoAssem != null) {
            SmartImageView smartImageView = fanSpotlightBlockVideoAssem.LLJLIL;
            if (smartImageView == null) {
                smartImageView = null;
            }
            smartImageView.setAttached(false);
        }
    }
}
