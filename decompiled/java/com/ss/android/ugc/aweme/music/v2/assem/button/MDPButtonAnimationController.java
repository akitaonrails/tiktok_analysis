package com.ss.android.ugc.aweme.music.v2.assem.button;

import X.C0C64;
import X.C0CNO;
import X.C629810On5;
import X.InterfaceC629820On6;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class MDPButtonAnimationController implements IMDPButtonAnimationAbility {
    public final Map<View, List<InterfaceC629820On6>> LL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.music.v2.assem.button.IMDPButtonAnimationAbility
    public final void C61(int i) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "mdp_square_disable_shoot_animation", true, false)) {
            C0CNO.LIZLLL(0L, new C629810On5(this, i));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.button.IMDPButtonAnimationAbility
    public final synchronized void Iy0(View view, InterfaceC629820On6 interfaceC629820On6) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "mdp_square_disable_shoot_animation", true, false)) {
            return;
        }
        List<InterfaceC629820On6> arrayList = (List) ((LinkedHashMap) this.LL).get(view);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.contains(interfaceC629820On6)) {
            arrayList.add(interfaceC629820On6);
            this.LL.put(view, arrayList);
        }
    }
}
