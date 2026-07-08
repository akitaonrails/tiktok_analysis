package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C1331660kl2;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C627680Oje;
import X.C627690Ojf;
import X.C639020P4q;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import Y.AfS178S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicHeaderBackgroundAssem extends DynamicAssem implements PageHeaderScrollAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1260));
    public final AssemVMLazy LLJJIII;
    public boolean LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicHeaderBackgroundAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicHeaderBackgroundAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1261), AFwS240S0000000_9.get$arr$(531), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public final String lp() {
        return (String) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        View view = new View(context);
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(310))));
        Zo(view);
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
    public final void bq(int i) {
        C786410Ut5.ed(getContentView(), -i);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        String strLp = lp();
        if (strLp != null && strLp.length() != 0) {
            C1331660kl2.LJIIIZ(lp()).LJJII(new C639020P4q(view, this, 1));
        } else {
            AssemVMLazy assemVMLazy = this.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
            AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Ome
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C629660Omq) obj).LL;
                }
            }, null, null, null, new AwS375S0200000_9(view, this, 74), 14, null);
        }
        AssemVMLazy assemVMLazy2 = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIJIIJIL;
        if (((MusicDetailViewModel) assemVMLazy2.getValue()).LLJJJJ) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C627680Oje.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                interfaceC1555100qZQLIZIZ.LIZ(new AfS178S0100000_9(this, 25));
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C627690Ojf.class, null);
            if (interfaceC1555100qZQLIZIZ2 != null) {
                interfaceC1555100qZQLIZIZ2.LIZ(new AfS178S0100000_9(this, 26));
            }
        }
    }
}
