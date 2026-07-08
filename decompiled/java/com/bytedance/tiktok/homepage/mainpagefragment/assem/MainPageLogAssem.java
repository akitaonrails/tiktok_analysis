package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C1565850qql;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC452301pR;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageLogAssem extends BaseMainPageFragmentUIAssem {
    public final C01GW LLJ = C452501pT.LIZ(EnumC452301pR.NONE, new C1565850qql());

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((AbstractC1604130rqV) this.LLJ.getValue()).LJIIIZ("onDestroy");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC1570850qyp
    public final void bg(View view) {
        super.bg(view);
        ((AbstractC1604130rqV) this.LLJ.getValue()).LJIIIZ("[onFragmentViewCreated]");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC1570850qyp
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onTabChanged], ");
        sbLIZ.append(str);
        sbLIZ.append(',');
        sbLIZ.append(str2);
        sbLIZ.append(',');
        sbLIZ.append(z);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
