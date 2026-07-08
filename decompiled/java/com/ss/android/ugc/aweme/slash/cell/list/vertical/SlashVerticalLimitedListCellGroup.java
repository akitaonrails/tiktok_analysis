package com.ss.android.ugc.aweme.slash.cell.list.vertical;

import X.C01GW;
import X.C098200Yq;
import X.C1180060goW;
import X.C13LP;
import X.C189200o6;
import X.C19M4;
import X.C20600815jK;
import X.C2248361CzK;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C452501pT;
import X.C698190Ra5;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC452301pR;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.slash.cell.arc.BasePowerListSlashCellGroup;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashVerticalLimitedListCellGroup extends BasePowerListSlashCellGroup<SlashVerticalLimitedListCellModel> {
    public View LLJJJ;
    public C19M4 LLJJJIL;
    public View LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f9g;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.BasePowerListSlashCellGroup
    public final void Fp() {
        Up(true);
    }

    public final int Qp() {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return 0;
        }
        return state.LJIIIIZZ();
    }

    public SlashVerticalLimitedListCellGroup() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJJJJIL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 2228));
        this.LLJJJJLIIL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 2227));
    }

    public final int Jp() {
        List<SlashCellModel> list;
        SlashCellModel slashCellModelLp = lp();
        if (slashCellModelLp == null || (list = slashCellModelLp.cells) == null) {
            return 0;
        }
        return list.size();
    }

    public final boolean Tp() {
        return Qp() >= ((Number) this.LLJJJJLIIL.getValue()).intValue() || Qp() >= Jp();
    }

    public final void Up(boolean z) {
        List listLL;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        List<SlashCellModel> list;
        List<SlashCellModel> listSubList;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2;
        C20600815jK<InterfaceC1891350zJl> state2;
        List<SlashCellModel> list2;
        if (Tp()) {
            return;
        }
        if (Qp() > 0 && !z) {
            SlashCellModel slashCellModelLp = lp();
            if (slashCellModelLp != null && (list2 = slashCellModelLp.cells) != null) {
                int iQp = Qp();
                int iQp2 = Qp() + ((Number) this.LLJJJJJIL.getValue()).intValue();
                int iJp = Jp();
                if (iQp2 > iJp) {
                    iQp2 = iJp;
                }
                listSubList = list2.subList(iQp, iQp2);
            } else {
                listSubList = null;
            }
            List listGp = BasePowerListSlashCellGroup.Gp(listSubList);
            if (listGp != null && (viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL) != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                state2.LIZLLL(listGp, null);
            }
        } else {
            SlashCellModel slashCellModelLp2 = lp();
            if (slashCellModelLp2 != null && (list = slashCellModelLp2.cells) != null) {
                int iIntValue = ((Number) this.LLJJJJJIL.getValue()).intValue();
                int iJp2 = Jp();
                if (iIntValue > iJp2) {
                    iIntValue = iJp2;
                }
                listLL = C13LP.LL(list, iIntValue);
            } else {
                listLL = null;
            }
            List listGp2 = BasePowerListSlashCellGroup.Gp(listLL);
            if (listGp2 != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILL(listGp2, null);
            }
        }
        if (Tp()) {
            View view = this.LLJJJ;
            if (view != null) {
                C337180DJs.LIZ(view);
                return;
            }
            return;
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C337180DJs.LIZJ(view2);
        }
        View view3 = this.LLJJJ;
        if (view3 == null) {
            return;
        }
        C786410Ut5.I7(new AbS699S0100000_18(this, 43, 42), view3);
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.BasePowerListSlashCellGroup, com.ss.android.ugc.aweme.slash.cell.arc.SlashCell, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.uj5);
        this.LLJJJ = viewFindViewById;
        if (viewFindViewById != null) {
            C427690Gpr.LJIIIIZZ(viewFindViewById);
        }
        this.LLJJJIL = (C19M4) view.findViewById(R.id.ujb);
        this.LLJJJJ = view.findViewById(R.id.uj6);
        if (C960203pA.LIZIZ(view.getContext())) {
            View view2 = this.LLJJJJ;
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.d8i);
                return;
            }
            return;
        }
        View view3 = this.LLJJJJ;
        if (view3 == null) {
            return;
        }
        view3.setBackgroundResource(R.drawable.d8j);
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.BasePowerListSlashCellGroup, com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void zp(SlashCellModel slashCellModel) {
        String str;
        Object c098200Yq;
        String str2;
        C19M4 c19m4;
        super.zp(slashCellModel);
        SlashVerticalLimitedListCellModel slashVerticalLimitedListCellModel = (SlashVerticalLimitedListCellModel) this.LLJJIII;
        if (slashVerticalLimitedListCellModel != null) {
            int i = slashVerticalLimitedListCellModel.seeMoreButtonHeight;
            View view = this.LLJJJ;
            if (view != null) {
                C1180060goW.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), view);
            }
        }
        SlashVerticalLimitedListCellModel slashVerticalLimitedListCellModel2 = (SlashVerticalLimitedListCellModel) this.LLJJIII;
        if (slashVerticalLimitedListCellModel2 != null && (str2 = slashVerticalLimitedListCellModel2.seeMoreButtonText) != null && (c19m4 = this.LLJJJIL) != null) {
            c19m4.setText(str2);
        }
        SlashVerticalLimitedListCellModel slashVerticalLimitedListCellModel3 = (SlashVerticalLimitedListCellModel) this.LLJJIII;
        if (slashVerticalLimitedListCellModel3 != null && (str = slashVerticalLimitedListCellModel3.seeMoreButtonIcon) != null) {
            try {
                C01GW c01gw = C2248361CzK.LIZ;
                c098200Yq = C2248361CzK.LJFF(getContentView().getContext(), str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C698190Ra5 c698190Ra5 = (C698190Ra5) c098200Yq;
            if (c698190Ra5 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c698190Ra5.LIZ;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZLLL = c698190Ra5.LIZIZ;
                C19M4 c19m42 = this.LLJJJIL;
                if (c19m42 != null) {
                    c19m42.setEndIcon(c419910GdJ);
                }
            }
        }
    }
}
