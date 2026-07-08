package com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel;

import X.C019F;
import X.C01GW;
import X.C0DSB;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C1567230qsz;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import irm.AkS91S0100000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoInputSkillLabelAssem extends UISlotAssem implements ITakoSkillLabelAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public boolean LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1253));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1254));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1252));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1256));
    public final AssemVMLazy LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoInputSkillLabelAssem.class, "skillLabelViewModel", "getSkillLabelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/skilllabel/TakoInputSkillLabelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoInputSkillLabelAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(430));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInputSkillLabelViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS568S0100000_24(c19719912DlLIZ, 1255), AFwS264S0000000_24.get$arr$(431), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fpe;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 456503513) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.ITakoSkillLabelAbility
    public final void eE0(C1567230qsz c1567230qsz) {
        if (c1567230qsz == null) {
            if (!this.LLJJI) {
                return;
            }
            C0DSB.LIZIZ(getContentView());
            return;
        }
        C0DSB.LIZJ(getContentView());
        String str = c1567230qsz.LIZ;
        Integer num = c1567230qsz.LIZIZ;
        TextView textView = (TextView) this.LLJJIJI.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJJIII.getValue();
        if (tuxIconView != null) {
            if (num != null) {
                tuxIconView.setIconRes(num.intValue());
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            } else {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = true;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(view.getContext(), R.style.zd);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.oo, contextThemeWrapper);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        View view2 = (View) this.LLJJIJIIJIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AkS91S0100000_24(this, 4), view2);
        }
    }
}
