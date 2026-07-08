package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C1181430gqj;
import X.C1187600h0g;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostWaterFallItemCell extends AssemPowerCell<PoiPostWaterFallReuseAssem, C1187600h0g> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiPostWaterFallReuseAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        ReusedUISlotAssem reusedUISlotAssem;
        if (!SlashComponentUIPreloadExp.LIZ("poi_merged_list") && !SlashComponentUIPreloadExp.LIZ("poi_video_list")) {
            return super.onCreateItemView(viewGroup);
        }
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        if ((reusedUIAssemNG1 instanceof ReusedUISlotAssem) && (reusedUISlotAssem = (ReusedUISlotAssem) reusedUIAssemNG1) != null) {
            Context context = viewGroup.getContext();
            if (context != null) {
                this.LL = C1181430gqj.LIZIZ(context, reusedUISlotAssem.Oo(), viewGroup, false);
                Sl0(LJJIJL(), this);
                return LJJIJL();
            }
            return super.onCreateItemView(viewGroup);
        }
        return super.onCreateItemView(viewGroup);
    }
}
