package com.ss.android.ugc.aweme.notification.v2.assem;

import X.AbstractC1623806Xk;
import X.C019F;
import X.C0DTR;
import X.C12ES;
import X.C1389890mGx;
import X.C13LE;
import X.C1559260qg8;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1869670ykn;
import X.C1889530zGp;
import X.C1893080zMY;
import X.C1913380ztI;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C481090Itn;
import X.C491001vg;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1609900rzo;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationResultStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public C1749280vcc LLIZLLLIL;
    public C481090Itn LLJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723580SZw(this, C1869670ykn.class, "notification_result_fragment_model"), checkSupervisorPrepared());
    public final AssemVMLazy LLJIJIL;
    public C1749280vcc LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationResultStatusAssem.class, "resultViewModel", "getResultViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/BaseNotificationResultViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NotificationResultStatusAssem() {
        C019F c019f = C019F.LIZ;
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 371);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BaseNotificationResultViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 812), AFwS271S0000000_28.get$arr$(179), awS572S0100000_28, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C481090Itn Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pes) : null;
            this.LLJ = (C481090Itn) viewFindViewById;
        }
        return (C481090Itn) viewFindViewById;
    }

    public final BaseNotificationResultViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (BaseNotificationResultViewModel) assemVMLazy.getValue();
    }

    public final void Jo() {
        ViewGroup.LayoutParams layoutParams;
        C1749280vcc c1749280vcc;
        C481090Itn c481090ItnGo = Go();
        if (c481090ItnGo != null) {
            C0DTR.LIZIZ(c481090ItnGo);
        }
        C1749280vcc c1749280vcc2 = this.LLJILJIL;
        if (c1749280vcc2 != null) {
            layoutParams = c1749280vcc2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(348));
            }
        } else {
            layoutParams = null;
        }
        C1749280vcc c1749280vcc3 = this.LLJILJIL;
        if (c1749280vcc3 != null) {
            C786410Ut5.U6(c1749280vcc3, layoutParams);
        }
        C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
        if (c1913380ztI.isStandardUIEnable()) {
            C1749280vcc c1749280vcc4 = this.LLJILJIL;
            if (c1749280vcc4 != null) {
                EnumC1609900rzo enumC1609900rzo = EnumC1609900rzo.INBOX_ACTIVITY;
                c1913380ztI.setStatusView(c1749280vcc4, enumC1609900rzo, new AwS572S0100000_28(this, 804), (Exception) null);
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    c1913380ztI.triggerNetworkTips(c19egLIZ, enumC1609900rzo, (Exception) null, c1749280vcc4);
                }
            }
        } else {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
            }
            Context context = getContext();
            if (context != null && (c1749280vcc = this.LLJILJIL) != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_refresh;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                c1722300uv6.LJI = context.getString(2131830224);
                c1722300uv6.LJIIIIZZ = context.getString(2131830225);
                C1893080zMY.LIZ(c1722300uv6, new AwS572S0100000_28(this, 805));
                c1749280vcc.setStatus(c1722300uv6);
            }
        }
        C1749280vcc c1749280vcc5 = this.LLJILJIL;
        if (c1749280vcc5 != null) {
            C12ES.LJIILL(0, c1749280vcc5);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume(), requestState = ");
        sbLIZ.append(Ho().getState().LLILLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationResultStatusAssem", strLIZIZ);
        AbstractC1623806Xk<Unit> abstractC1623806Xk = Ho().getState().LLILLL;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            C1889530zGp.LIZ("NotificationResultStatusAssem", "onSuccess");
            C1749280vcc c1749280vcc = this.LLJILJIL;
            if (c1749280vcc != null) {
                C0DTR.LIZIZ(c1749280vcc);
            }
            C481090Itn c481090ItnGo = Go();
            if (c481090ItnGo != null) {
                C12ES.LJIILL(0, c481090ItnGo);
                return;
            }
            return;
        }
        if (abstractC1623806Xk instanceof C1623706Xj) {
            C1889530zGp.LIZ("NotificationResultStatusAssem", "onLoading");
            yh();
        } else if (abstractC1623806Xk instanceof C491001vg) {
            C1889530zGp.LIZ("NotificationResultStatusAssem", "onError");
            Jo();
        }
    }

    public final void yh() {
        ViewGroup.LayoutParams layoutParams;
        C481090Itn c481090ItnGo = Go();
        if (c481090ItnGo != null) {
            C0DTR.LIZIZ(c481090ItnGo);
        }
        C1749280vcc c1749280vcc = this.LLJILJIL;
        if (c1749280vcc != null) {
            layoutParams = c1749280vcc.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
            }
        } else {
            layoutParams = null;
        }
        C1749280vcc c1749280vcc2 = this.LLJILJIL;
        if (c1749280vcc2 != null) {
            C786410Ut5.U6(c1749280vcc2, layoutParams);
        }
        C1749280vcc c1749280vcc3 = this.LLJILJIL;
        if (c1749280vcc3 != null) {
            C12ES.LJIILL(0, c1749280vcc3);
        }
        C1749280vcc c1749280vcc4 = this.LLJILJIL;
        if (c1749280vcc4 != null) {
            c1749280vcc4.LJ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.pey);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        C1749280vcc c1749280vcc = (C1749280vcc) viewFindViewById;
        if (c1749280vcc == null) {
            return;
        }
        this.LLJILJIL = c1749280vcc;
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0za1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900430zYP) obj).LLILLL;
            }
        }, this, null, new AwS607S0100000_28(this, 100), new AwS572S0100000_28(this, 370), new AwS607S0100000_28(this, 101), 4, null);
    }
}
