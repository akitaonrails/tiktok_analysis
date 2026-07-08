package com.ss.android.ugc.aweme.pcs.course.videopublishpage.ui;

import X.C786410Ut5;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PcsCoursePublishNavigationAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dhe;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.mk3);
        if (liveIconView != null) {
            C786410Ut5.I7(new AbS686S0100000_2(liveIconView, 21), liveIconView);
        }
    }
}
