package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor;

import X.C0TVI;
import X.C1146120fvm;
import X.C14K9;
import X.C1559260qg8;
import X.C723580SZw;
import X.C723850SaN;
import Y.ARunnableS86S0200000_17;
import android.os.Build;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelPulldownSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1146120fvm.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gx6;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!LiveGiftPanelPulldownSetting.INSTANCE.isEnabled() && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0DKp
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), c20246014Ju.LIZ(2).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        C723850SaN.LIZLLL(this, new AwS596S0100000_17(this, 123));
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null) {
            HandlerHook.viewPost(viewLJJIJL, new ARunnableS86S0200000_17(viewLJJIJL, this, 67));
        }
    }
}
