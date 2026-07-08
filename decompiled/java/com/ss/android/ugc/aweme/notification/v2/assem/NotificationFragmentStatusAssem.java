package com.ss.android.ugc.aweme.notification.v2.assem;

import X.C01D1;
import X.C01GW;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C1868400yik;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationFragmentStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1868400yik.class, "notification_fragment_params"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public C1749280vcc LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationFragmentStatusAssem.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NotificationFragmentStatusAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 810), AFwS271S0000000_28.get$arr$(177), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 809));
    }

    public final NotificationFragmentV2ViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (NotificationFragmentV2ViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1749280vcc c1749280vcc;
        super.onViewCreated(view);
        if ((view instanceof C1749280vcc) && (c1749280vcc = (C1749280vcc) view) != null) {
            this.LLJI = c1749280vcc;
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0zYn
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1900660zYm) obj).LLJ;
                }
            }, C736820SvI.LIZLLL(), AFwS315S0000000_28.get$arr$(18), 4);
            C1868400yik c1868400yik = (C1868400yik) this.LLIZLLLIL.getValue();
            if (c1868400yik != null && c1868400yik.LL) {
                AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0zYo
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1900660zYm) obj).LLILZIL;
                    }
                }, this, null, new AwS607S0100000_28(this, 96), new AwS572S0100000_28(this, 368), new AwS607S0100000_28(this, 97), 4, null);
                C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0zYp
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1900660zYm) obj).LLILZLL;
                    }
                }, null, AFwS315S0000000_28.get$arr$(19), 6);
            }
        }
    }
}
