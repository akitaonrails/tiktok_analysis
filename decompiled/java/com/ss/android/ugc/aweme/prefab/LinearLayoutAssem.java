package com.ss.android.ugc.aweme.prefab;

import X.C723850SaN;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class LinearLayoutAssem extends DynamicAssem {
    public final int LLJJI = R.id.ro2;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public void hp() {
        C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 141));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setId(lp());
        Zo(linearLayout);
        super.xo();
    }

    public int lp() {
        return this.LLJJI;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Integer num;
        LinearLayout linearLayout;
        Object obj = getConfig().LLILZ.get("orientation");
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            int iIntValue = num.intValue();
            if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
                linearLayout.setOrientation(iIntValue);
            }
        }
        mo127do();
    }
}
