package com.bytedance.hybrid.spark.raven.component.builtin.myna;

import X.C1041450dCx;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenMynaCell extends AssemPowerCell<MynaRavenReusedAssem, RavenMynaModule> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new MynaRavenReusedAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        RavenMynaModule ravenMynaModule = (RavenMynaModule) interfaceC1891350zJl;
        this.itemView.getMeasuredHeight();
        this.itemView.getMinimumHeight();
        super.onBindItemView(ravenMynaModule);
        Integer height = ravenMynaModule.getHeight();
        if (height != null && height.intValue() > 0) {
            this.itemView.setMinimumHeight((int) C1041450dCx.LIZ(height.intValue()));
        }
        Integer width = ravenMynaModule.getWidth();
        if (width != null && width.intValue() > 0) {
            int iIntValue = width.intValue();
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) C1041450dCx.LIZ(iIntValue);
                C786410Ut5.W5(this.itemView, layoutParams);
            }
        }
        this.itemView.getMinimumHeight();
    }
}
