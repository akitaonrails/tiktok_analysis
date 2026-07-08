package com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol;

import X.C07EB;
import X.C14NH;
import X.C1858840yTK;
import X.C20039913b3;
import Y.ARunnableS130S0100000_30;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseCell;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoFlexAnswerNimbleCell extends TakoBaseCell<FlexNimbleCardAnswerAssem, C1858840yTK> {
    public int LLIZLLLIL;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        C20039913b3 c20039913b3 = C20039913b3.LIZ;
        int i = this.LLIZLLLIL;
        c20039913b3.getClass();
        Pair pair = (Pair) ((LinkedHashMap) C20039913b3.LJII).get(Integer.valueOf(i));
        return new FlexNimbleCardAnswerAssem(pair != null ? ((Number) pair.getFirst()).intValue() : 0);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        int iIntValue;
        C14NH c14nh = C14NH.LIZ;
        C20039913b3.LIZ.getClass();
        Pair pair = (Pair) ((LinkedHashMap) C20039913b3.LJII).get(Integer.valueOf(i));
        if (pair != null) {
            iIntValue = ((Number) pair.getFirst()).intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        c14nh.getClass();
        TemplateData templateDataLJI = C14NH.LJI(numValueOf);
        if (((Number) C07EB.LIZ.getValue()).intValue() != 0 && !C14NH.LIZJ) {
            C14NH.LIZJ = true;
            ((ExecutorService) C14NH.LIZLLL.getValue()).execute(new ARunnableS130S0100000_30(templateDataLJI, 43));
        }
        this.LLIZLLLIL = i;
        return onCreateItemView(viewGroup);
    }
}
