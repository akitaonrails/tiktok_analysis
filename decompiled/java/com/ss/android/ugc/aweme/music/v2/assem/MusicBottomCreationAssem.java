package com.ss.android.ugc.aweme.music.v2.assem;

import X.C1554960qZC;
import X.C1558520qew;
import X.C2097608Jq;
import X.C627680Oje;
import X.C627690Ojf;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import Y.AfS178S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicBottomCreationAssem extends DynamicAssem {
    public ConstraintLayout LLJJI;
    public boolean LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dpu;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> kp() {
        return C2097608Jq.LJIIIIZZ(new Pair("1", Integer.valueOf(R.id.v1x)), new Pair("2", Integer.valueOf(R.id.f7a)), new Pair("3", Integer.valueOf(R.id.v62)));
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = -1;
            C786410Ut5.X5(layoutParams, viewGroup);
        }
        mo127do();
        this.LLJJI = (ConstraintLayout) view.findViewById(R.id.osv);
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C627680Oje.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS178S0100000_9(this, 45));
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C627690Ojf.class, null);
        if (interfaceC1555100qZQLIZIZ2 != null) {
            interfaceC1555100qZQLIZIZ2.LIZ(new AfS178S0100000_9(this, 46));
        }
    }
}
