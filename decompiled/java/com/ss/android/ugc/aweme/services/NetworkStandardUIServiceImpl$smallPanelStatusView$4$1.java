package com.ss.android.ugc.aweme.services;

import X.C09AY;
import X.C13LP;
import X.C197039127h;
import X.C786410Ut5;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public final class NetworkStandardUIServiceImpl$smallPanelStatusView$4$1 extends C09AY implements Function1<C197039127h, Unit> {
    public final /* synthetic */ String $buttonDesc;
    public final /* synthetic */ String $scene;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStandardUIServiceImpl$smallPanelStatusView$4$1(String str, String str2) {
        super(1);
        this.$buttonDesc = str;
        this.$scene = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C197039127h c197039127h) {
        C197039127h c197039127h2 = c197039127h;
        c197039127h2.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
        c197039127h2.setText(this.$buttonDesc);
        c197039127h2.setButtonSize(3);
        if (C13LP.LJJJJ(this.$scene, NetworkStandardUIServiceImpl.Companion.getNewStylePanelList())) {
            ViewGroup.LayoutParams layoutParams = c197039127h2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
            } else {
                layoutParams = null;
            }
            C786410Ut5.J6(c197039127h2, layoutParams);
        }
        return Unit.LIZ;
    }
}
