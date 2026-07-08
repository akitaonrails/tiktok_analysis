package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C630120Ona;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicPUGCPlayAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public Music LLJJIJIL;
    public LinearLayout LLJJJ;
    public TuxIconView LLJJJIL;
    public TuxIconView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public View LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public Integer LLJLILLLLZIIL;
    public final C01GW LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicPUGCPlayAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicPUGCPlayAssem.class, "musicPlayVM", "getMusicPlayVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicPlayViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MusicPUGCPlayAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1271), AFwS240S0000000_9.get$arr$(538), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1272), AFwS240S0000000_9.get$arr$(539), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1269));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1268));
        this.LLJLILLLLZIIL = 0;
        this.LLJLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1270));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dq8;
    }

    public final MusicDetailViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    public final MusicPlayViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        IPlayerComponentAbility iPlayerComponentAbility;
        super.onDestroy();
        if (!lp().LLJJJJ || lp().LLJJJJJIL) {
            return;
        }
        Integer num = this.LLJLILLLLZIIL;
        if (num == null || num.intValue() != 0) {
            Integer num2 = this.LLJLILLLLZIIL;
            if (num2 == null || num2.intValue() != 3) {
                IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LLJLL.getValue();
                if ((iPlayerComponentAbility2 == null || iPlayerComponentAbility2.uz1() != 4) && (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJLL.getValue()) != null) {
                    iPlayerComponentAbility.tryResumePlay();
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLIZIZ;
        mo127do();
        this.LLJJJ = (LinearLayout) view.findViewById(R.id.qm5);
        this.LLJJJIL = (TuxIconView) view.findViewById(R.id.qmu);
        this.LLJJJJ = (TuxIconView) view.findViewById(R.id.w8l);
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.nmk);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.qnm);
        this.LLJJL = view.findViewById(R.id.uqb);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.bc_);
        this.LLJL = (TuxTextView) view.findViewById(R.id.bc6);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.used_count);
        Context context = getContext();
        if (context != null) {
            iLIZIZ = C497820Jfg.LIZIZ(context);
        } else {
            iLIZIZ = 0;
        }
        if (iLIZIZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360))) {
            TuxTextView tuxTextView = this.LLJJJJLIIL;
            if (tuxTextView != null) {
                C630120Ona.LIZ(tuxTextView);
            }
            View view2 = this.LLJJL;
            if (view2 != null) {
                C630120Ona.LIZ(view2);
            }
        }
        AssemViewModel.asyncSubscribe$default(lp(), new C2217381BqS() { // from class: X.0Ony
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 320), 28, null);
    }
}
