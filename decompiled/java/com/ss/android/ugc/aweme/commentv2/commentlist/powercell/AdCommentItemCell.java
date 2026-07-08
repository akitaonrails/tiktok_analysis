package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.AbstractC1066520drO;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1876207Wm;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes17.dex */
public final class AdCommentItemCell extends PowerCell<C1876207Wm> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        C1876207Wm c1876207Wm = (C1876207Wm) interfaceC1891350zJl;
        super.onBindItemView(c1876207Wm);
        ICommentFloatAdAbility iCommentFloatAdAbility = (ICommentFloatAdAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), ICommentFloatAdAbility.class, null);
        if (iCommentFloatAdAbility != null) {
            iCommentFloatAdAbility.e40();
        }
        View view = this.itemView;
        if ((view instanceof FrameLayout) && (frameLayout = (FrameLayout) view) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        AbstractC1066520drO abstractC1066520drOR = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).R(this.itemView.getContext(), c1876207Wm.LL);
        if ((abstractC1066520drOR instanceof AbstractC1066520drO) && abstractC1066520drOR != null) {
            View view2 = this.itemView;
            if ((view2 instanceof FrameLayout) && (viewGroup = (ViewGroup) view2) != null) {
                viewGroup.addView(abstractC1066520drOR.itemView);
            }
            this.itemView.getContext();
            abstractC1066520drOR.I5(c1876207Wm.LL);
        }
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LJ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            C786410Ut5.a6(frameLayout, layoutParams);
            return frameLayout;
        }
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}
