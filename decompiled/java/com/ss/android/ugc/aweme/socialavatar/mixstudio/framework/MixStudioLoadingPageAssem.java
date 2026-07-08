package com.ss.android.ugc.aweme.socialavatar.mixstudio.framework;

import X.C01GW;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC440890HQp;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioLoadingPageAssem extends MixStudioPageAssem {
    public C1390410mHn LLJJJ;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(153));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(152));
    public final EnumC440890HQp LLJJJJJIL = EnumC440890HQp.LOADING;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void LLFF() {
        C1390410mHn c1390410mHn = this.LLJJJ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void onPagePause() {
        C1390410mHn c1390410mHn = this.LLJJJ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, ((Number) this.LLJJJIL.getValue()).intValue()));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        if (numLIZJ != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        Zo(frameLayout);
        C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
        frameLayout.addView(c1390410mHn, new FrameLayout.LayoutParams(((Number) this.LLJJJJ.getValue()).intValue(), ((Number) this.LLJJJJ.getValue()).intValue(), 17));
        this.LLJJJ = c1390410mHn;
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final EnumC440890HQp ip() {
        return this.LLJJJJJIL;
    }
}
