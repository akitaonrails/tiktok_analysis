package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AnonymousClass0629;
import X.C01GW;
import X.C069P;
import X.C0I0B;
import X.C0I31;
import X.C0PEM;
import X.C0YNP;
import X.C0ZK1;
import X.C0ZKF;
import X.C13LP;
import X.C1519105x7;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C416140GTk;
import X.C427660Gpo;
import X.C431950Gwj;
import X.C432250GxD;
import X.C452501pT;
import X.C460220I2y;
import X.C460230I2z;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ACListenerS110S0200000_6;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusAnalytics;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleTypingIndicatorPowerCell extends ReusedUISlotAssem<SingleTypingIndicatorPowerCell> implements InterfaceC712990Rxx<C460220I2y> {
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public C427660Gpo LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cn4;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        C431950Gwj c431950Gwj = (C431950Gwj) this.LLJZ.getValue();
        if (c431950Gwj != null) {
            c431950Gwj.LIZIZ();
        }
    }

    public SingleTypingIndicatorPowerCell() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJLLIL = C452501pT.LIZ(enumC452301pR, new AwS558S0100000_14(this, 549));
        this.LLJLLL = C452501pT.LIZ(enumC452301pR, AFwS192S0000000_6.get$arr$(67));
        this.LLJZ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 151));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.typing_bubble);
        this.LLJL = view.findViewById(R.id.bi2);
        this.LLJLIL = view.findViewById(R.id.nzy);
        this.LLJLILLLLZIIL = (C427660Gpo) view.findViewById(R.id.biz);
        this.LLJLL = (TuxIconView) view.findViewById(R.id.bhq);
    }

    public final void op(C460220I2y c460220I2y) {
        IMUser iMUserLJIIL;
        int i = 0;
        if (!c460220I2y.LL) {
            View view = this.LLJL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLJLIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                return;
            }
            return;
        }
        View view3 = this.LLJL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLJLIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        C427660Gpo c427660Gpo = this.LLJLILLLLZIIL;
        if (c427660Gpo != null) {
            String str = c460220I2y.LLILZ;
            String str2 = c460220I2y.LLILLJJLI;
            IMAIServiceAPI.LIZ.getClass();
            if (AnonymousClass0629.LIZ().LIZ().LJIL(str)) {
                iMUserLJIIL = AnonymousClass0629.LIZ().LIZIZ().LJI(AnonymousClass0629.LIZ().LIZIZ().LIZ(C0YNP.LJII(str)));
            } else {
                IMContactApi.LIZ.getClass();
                iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str2, null, "im_local_db");
            }
            if (iMUserLJIIL == null) {
                C427660Gpo.LJIIJJI(c427660Gpo, Integer.valueOf(R.drawable.c5w), false, null, null, false, false, null, null, false, null, 1006);
            } else {
                IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJLLIL.getValue();
                if (iDMAvatarLoader != null) {
                    i = 0;
                    iDMAvatarLoader.LJ(iMUserLJIIL, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
                }
                IAccessibilityUtils.LIZ.getClass();
                IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
                if (iAccessibilityUtilsLIZ != null) {
                    iAccessibilityUtilsLIZ.LIZ(this.LLJLILLLLZIIL, iMUserLJIIL);
                }
            }
            if (c460220I2y.LLILZIL != null) {
                TuxIconView tuxIconView = this.LLJLL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, i);
                }
                TuxIconView tuxIconView2 = this.LLJLL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setImageDrawable(c460220I2y.LLILZIL);
                }
            } else {
                TuxIconView tuxIconView3 = this.LLJLL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                }
            }
            C786410Ut5.T8(c427660Gpo, new ACListenerS110S0200000_6(c427660Gpo, c460220I2y, 6));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C460220I2y c460220I2y) {
        C460220I2y c460220I2y2 = c460220I2y;
        op(c460220I2y2);
        sp(c460220I2y2.LLILLL);
        C431950Gwj c431950Gwj = (C431950Gwj) this.LLJZ.getValue();
        if (c431950Gwj != null && c431950Gwj.LJFF == null) {
            LifecycleCoroutineScope lifecycleCoroutineScope = c431950Gwj.LIZIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            c431950Gwj.LJFF = C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ, null, new C432250GxD(c431950Gwj, null), 2);
        }
        String str = c460220I2y2.LLILZ;
        ITypingStatusAnalytics.LIZ.getClass();
        ITypingStatusAnalytics iTypingStatusAnalyticsLIZ = C1519105x7.LIZ();
        if (iTypingStatusAnalyticsLIZ != null) {
            iTypingStatusAnalyticsLIZ.reportOnTypingIndicatorShown(0, "private", str, -1, C0I0B.LJFF.LIZIZ());
        }
    }

    public final void sp(boolean z) {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C416140GTk c416140GTk = new C416140GTk(getContentView().getContext());
            Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
            if (objPluggableSpiForReal != null) {
                c416140GTk.LIZIZ(((IIMMessageBubbleService) objPluggableSpiForReal).LJIIIIZZ(), false, false);
                view.setBackground(c416140GTk);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C460220I2y c460220I2y) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C460220I2y c460220I2y) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        Object objLJJJLZIJ;
        C460230I2z c460230I2z;
        C460220I2y c460220I2y = (C460220I2y) interfaceC1587906Jp;
        if (list != null) {
            objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        } else {
            objLJJJLZIJ = null;
        }
        if ((objLJJJLZIJ instanceof C460230I2z) && (c460230I2z = (C460230I2z) objLJJJLZIJ) != null) {
            if (c460230I2z.LIZ) {
                op(c460220I2y);
            }
            if (c460230I2z.LIZIZ) {
                sp(c460220I2y.LLILLL);
            }
            String str = c460220I2y.LLILZ;
            ITypingStatusAnalytics.LIZ.getClass();
            ITypingStatusAnalytics iTypingStatusAnalyticsLIZ = C1519105x7.LIZ();
            if (iTypingStatusAnalyticsLIZ != null) {
                iTypingStatusAnalyticsLIZ.reportOnTypingIndicatorShown(0, "private", str, -1, C0I0B.LJFF.LIZIZ());
                return;
            }
            return;
        }
        op(c460220I2y);
        sp(c460220I2y.LLILLL);
        C431950Gwj c431950Gwj = (C431950Gwj) this.LLJZ.getValue();
        if (c431950Gwj != null && c431950Gwj.LJFF == null) {
            LifecycleCoroutineScope lifecycleCoroutineScope = c431950Gwj.LIZIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            c431950Gwj.LJFF = C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ, null, new C432250GxD(c431950Gwj, null), 2);
        }
        String str2 = c460220I2y.LLILZ;
        ITypingStatusAnalytics.LIZ.getClass();
        ITypingStatusAnalytics iTypingStatusAnalyticsLIZ2 = C1519105x7.LIZ();
        if (iTypingStatusAnalyticsLIZ2 == null) {
            return;
        }
        iTypingStatusAnalyticsLIZ2.reportOnTypingIndicatorShown(0, "private", str2, -1, C0I0B.LJFF.LIZIZ());
    }
}
