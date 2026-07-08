package com.ss.android.ugc.aweme.base.ui.cell;

import X.C1322110kVd;
import X.C786410Ut5;
import X.InterfaceC1575760r6k;
import X.InterfaceC1594910rbd;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseSkylightCell<T extends InterfaceC1594910rbd> extends LongClickAbilitySkylightCell<T> implements InterfaceC1575760r6k {
    public abstract View Hy1();

    @Override // X.InterfaceC1575760r6k
    public final int[] T0() {
        int[] iArr = new int[2];
        View viewHy1 = Hy1();
        if (viewHy1 == null) {
            return null;
        }
        viewHy1.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + (viewHy1.getWidth() / 2);
        iArr[1] = iArr[1] + (viewHy1.getHeight() / 2);
        return iArr;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C786410Ut5.T4(this.itemView, 1.0f);
        C786410Ut5.ed(this.itemView, 0.0f);
        C786410Ut5.Jc(this.itemView, 0.0f);
        C786410Ut5.Ob(this.itemView, 1.0f);
        C786410Ut5.pc(this.itemView, 1.0f);
    }

    public static void T5(List list, C1322110kVd c1322110kVd, String str) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIIJ(list, c1322110kVd, "fyp_window_avatar", str);
    }
}
