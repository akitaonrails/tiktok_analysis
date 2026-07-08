package com.ss.android.ugc.aweme.detail.prefab;

import X.C1558360qeg;
import X.C1558520qew;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C426750GoL;
import X.C628830OlV;
import X.C724240Sb0;
import X.C814420VxA;
import X.RunnableC327860CtE;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility;
import com.ss.android.ugc.aweme.prefab.LinearLayoutAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class DetailHeaderAssem extends LinearLayoutAssem {
    public static final Map<String, Integer> LLJJIJIIJIL = C2097608Jq.LJIIIIZZ(new Pair("banner", Integer.valueOf(R.id.br5)), new Pair("basic_info", Integer.valueOf(R.id.btw)), new Pair("buttons", Integer.valueOf(R.id.d88)), new Pair("custom2", Integer.valueOf(R.id.fbt)), new Pair("custom1", Integer.valueOf(R.id.fbs)));
    public final int LLJJIII = R.id.fqj;
    public boolean LLJJIJI = true;

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, C628830OlV> map = ip().LLJILJIL;
        String[] strArr = {"banner", "basic_info", "advanced_info", "buttons"};
        int i = 0;
        do {
            String str = strArr[i];
            C628830OlV c628830OlVRemove = map.remove(str);
            if (c628830OlVRemove != null) {
                linkedHashMap.put(str, c628830OlVRemove);
            }
            i++;
        } while (i < 4);
        for (Map.Entry<String, C628830OlV> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        ip().LLJILJIL = linkedHashMap;
        super.hp();
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        C426750GoL.LJIIL(getContentView(), 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> kp() {
        return LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem
    public final int lp() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        DetailPageNameAbility detailPageNameAbility;
        String strMP;
        super.onViewCreated(view);
        if (this.LLJJIJI) {
            this.LLJJIJI = false;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (detailPageNameAbility = (DetailPageNameAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), DetailPageNameAbility.class, null)) != null && (strMP = detailPageNameAbility.MP()) != null) {
                HandlerHook.viewPost(view, new RunnableC327860CtE(strMP));
            }
        }
    }
}
