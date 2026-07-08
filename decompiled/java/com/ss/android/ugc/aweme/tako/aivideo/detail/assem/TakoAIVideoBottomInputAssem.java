package com.ss.android.ugc.aweme.tako.aivideo.detail.assem;

import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class TakoAIVideoBottomInputAssem extends BasePanelComponent implements IDetailBottomProtocol, InterfaceC1554640qYg, InterfaceC1146704e9 {
    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        return new Space(viewGroup.getContext());
    }
}
