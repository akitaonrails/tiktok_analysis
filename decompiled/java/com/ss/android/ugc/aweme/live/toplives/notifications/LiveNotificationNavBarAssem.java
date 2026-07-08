package com.ss.android.ugc.aweme.live.toplives.notifications;

import X.C019F;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveNotificationNavBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveNotificationNavBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/toplives/notifications/vm/LiveNotificationListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveNotificationNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveNotificationListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 365), AFwS237S0000000_7.get$arr$(115), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxNavBar tuxNavBar;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null && (view instanceof TuxNavBar) && (tuxNavBar = (TuxNavBar) view) != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS551S0100000_7(this, 363));
            int iIntValue = 0;
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131856777);
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_ellipsis_horizontal;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS551S0100000_7(this, 364));
            c0om1.LIZIZ(c1251150ifB2);
            tuxNavBar.setNavActions(c0om1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxNavBar.setBackgroundColor(iIntValue);
        }
    }
}
