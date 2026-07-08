package com.ss.android.ugc.aweme.notification.sysnotice.assem;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C019F;
import X.C01GW;
import X.C0DXR;
import X.C0VWN;
import X.C1379050lzT;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.notification.sysnotice.cell.SystemNotificationCell;
import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import com.ss.android.ugc.aweme.notification.v2.cell.NoticePriorityTitleCell;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes22.dex */
public final class SystemNotificationListAssem extends UIListContentAssem<SystemNotificationListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SystemNotificationListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/notification/sysnotice/vm/SystemNotificationListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SystemNotificationListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SystemNotificationListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 713), AFwS259S0000000_21.get$arr$(207), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 712));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 3;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC21674919sB abstractC21674919sB;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jvGo.getItemAnimator();
        if (itemAnimator instanceof AbstractC21674919sB) {
            abstractC21674919sB = (AbstractC21674919sB) itemAnimator;
        } else {
            abstractC21674919sB = null;
        }
        if (abstractC21674919sB != null) {
            abstractC21674919sB.LLIZ = false;
            abstractC21674919sB.LJIJJ(0L);
            abstractC21674919sB.LJIJJLI(0L);
            abstractC21674919sB.LJIL(0L);
            abstractC21674919sB.LJJ(0L);
        }
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(NoticePriorityTitleCell.class, SystemNotificationCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.addItemDecoration(new C0DXR() { // from class: X.03It
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
        });
        viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(new C1379050lzT(viewOnAttachStateChangeListenerC20604515jvGo.getContext()));
        C0VWN.LIZ("inbox_system_page", false).LIZIZ(viewOnAttachStateChangeListenerC20604515jvGo);
    }
}
