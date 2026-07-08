package com.ss.android.ugc.aweme.tako.nimblecard;

import X.C1858830yTJ;
import X.C20039913b3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseCell;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerNimbleCell extends TakoBaseCell<NimbleCardAnswerAssem, C1858830yTJ> {
    public int LLIZLLLIL;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        C20039913b3 c20039913b3 = C20039913b3.LIZ;
        int i = this.LLIZLLLIL;
        c20039913b3.getClass();
        Pair pair = (Pair) ((LinkedHashMap) C20039913b3.LJII).get(Integer.valueOf(i));
        return new NimbleCardAnswerAssem(pair != null ? ((Number) pair.getFirst()).intValue() : 0);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        this.LLIZLLLIL = i;
        return onCreateItemView(viewGroup);
    }
}
