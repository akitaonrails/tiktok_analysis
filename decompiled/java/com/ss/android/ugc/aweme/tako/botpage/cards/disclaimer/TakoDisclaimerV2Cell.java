package com.ss.android.ugc.aweme.tako.botpage.cards.disclaimer;

import X.C003L;
import X.C03H5;
import X.C202131147d;
import X.C202132147e;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseCell;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.TakoDisclaimerWithTosConfigModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoDisclaimerV2Cell extends TakoBaseCell<ReusedUISlotAssem<? extends C03H5>, C003L> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem<? extends C03H5> I5() {
        C202132147e.LIZ.getClass();
        if (((Boolean) C202132147e.LIZIZ.getValue()).booleanValue()) {
            List<String> list = ((TakoDisclaimerWithTosConfigModel) C202131147d.LIZIZ.getValue()).contentParagraphs;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!a0.LJJJIL(it2.next())) {
                        return new TakoDisclaimerV2OptAssem();
                    }
                }
            }
        }
        return new TakoDisclaimerV2Assem();
    }
}
