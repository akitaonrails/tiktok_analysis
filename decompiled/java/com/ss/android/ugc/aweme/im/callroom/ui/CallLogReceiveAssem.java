package com.ss.android.ugc.aweme.im.callroom.ui;

import X.C0ZXS;
import X.C0ZXX;
import X.C786410Ut5;
import X.C898900ZOe;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class CallLogReceiveAssem extends CallLogAssem {
    @Override // com.ss.android.ugc.aweme.im.callroom.ui.CallLogAssem
    public final int Ap() {
        return R.attr.a1h;
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.ui.CallLogAssem
    public final int yp() {
        return 13;
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.ui.CallLogAssem
    public final int zp() {
        return R.attr.a1h;
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.ui.CallLogAssem
    public final String up() {
        return LJJIJL().getContext().getString(2131832231);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 57), LJJIJL());
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.ui.CallLogAssem
    public final void op(C0ZXS c0zxs, boolean z) {
        tp(c0zxs);
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal != null) {
            ((IIMMessageBubbleService) objPluggableSpiForReal).LJII(((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL, c0zxs, z, LifecycleOwnerKt.getLifecycleScope(this), new AwS415S0200000_14(this, c0zxs, 20), AFwS248S0000000_14.get$arr$(134), C0ZXX.LIZ);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
