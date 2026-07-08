package com.ss.android.ugc.aweme.poi.detail.bottomspace;

import X.C418440Gaw;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class BottomSpaceAssem extends BaseSlashReusedComponent<BottomSpaceModule> {
    public FrameLayout LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dzg;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJL = (FrameLayout) view.findViewById(R.id.qzh);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final void up(BottomSpaceModule bottomSpaceModule) {
        ViewGroup.LayoutParams layoutParams;
        super.up(bottomSpaceModule);
        Integer height = bottomSpaceModule.getHeight();
        if (height != null) {
            int iIntValue = height.intValue();
            FrameLayout frameLayout = this.LLJL;
            if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            }
        }
    }
}
