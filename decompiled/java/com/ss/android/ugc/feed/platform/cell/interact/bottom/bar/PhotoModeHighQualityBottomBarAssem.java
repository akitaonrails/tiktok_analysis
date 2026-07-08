package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeHighQualityBottomBarAssem extends BaseCellSlotComponent<PhotoModeHighQualityBottomBarAssem> {
    public long LLJLLIL = -1;
    public ViewGroup LLJLLL;
    public TuxTextView LLJZ;
    public FrameLayout LLJZIJLIL;
    public VideoItemParams LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b73;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.trr);
        this.LLJLLL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        this.LLJZ = (TuxTextView) view.findViewById(R.id.y3j);
        this.LLJZIJLIL = (FrameLayout) view.findViewById(R.id.e2h);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r12) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PhotoModeHighQualityBottomBarAssem.up(java.lang.Object):void");
    }
}
