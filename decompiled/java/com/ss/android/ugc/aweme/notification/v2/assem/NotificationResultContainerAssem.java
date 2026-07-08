package com.ss.android.ugc.aweme.notification.v2.assem;

import X.C01D1;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1868400yik;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C622840Obq;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC622850Obr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC636730OyF;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationResultContainerAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLIZLLLIL;
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1868400yik.class, "notification_fragment_params"), checkSupervisorPrepared());
    public final AssemVMLazy LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationResultContainerAssem.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NotificationResultContainerAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 811), AFwS271S0000000_28.get$arr$(178), null, true);
    }

    public final ViewOnAttachStateChangeListenerC20631115oD Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pev) : null;
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
    }

    public final NotificationFragmentV2ViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (NotificationFragmentV2ViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDGo = Go();
        if (viewOnAttachStateChangeListenerC20631115oDGo != null) {
            InterfaceC636730OyF fragmentItemOperator = viewOnAttachStateChangeListenerC20631115oDGo.getFragmentItemOperator();
            C622840Obq c622840Obq = new C622840Obq();
            c622840Obq.LJIIIZ = Ho().getState().LL;
            c622840Obq.LJII = EnumC622850Obr.FRAGMENTS_NO_DESTROY;
            fragmentItemOperator.LIZLLL(c622840Obq);
            viewOnAttachStateChangeListenerC20631115oDGo.setUserInputEnabled(false);
            C1868400yik c1868400yik = (C1868400yik) this.LLJ.getValue();
            if (c1868400yik != null && c1868400yik.LL) {
                AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0zYg
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1900660zYm) obj).LLILZIL;
                    }
                }, this, null, null, null, new AwS607S0100000_28(this, 238), 28, null);
            } else {
                AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0zaS
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1900660zYm) obj).LLILZ;
                    }
                }, this, null, null, null, new AwS607S0100000_28(this, 239), 28, null);
            }
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0zaR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1900660zYm) obj).LL);
                }
            }, C736820SvI.LJ(), new AwS642S0100000_28(viewOnAttachStateChangeListenerC20631115oDGo, 80), 4);
        }
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0zaQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900660zYm) obj).LLILZIL;
            }
        }, null, new AwS607S0100000_28(this, 98), new AwS572S0100000_28(this, 369), new AwS607S0100000_28(this, 99), 2, null);
    }
}
