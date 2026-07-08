package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery;

import X.C1135404cK;
import X.C687700QyG;
import X.C723850SaN;
import X.InterfaceC1146704e9;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BoardSceneryAssem extends UIContentAssem implements InterfaceC1146704e9 {
    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BoardSceneryScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardSceneryScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new C1135404cK(this));
    }
}
