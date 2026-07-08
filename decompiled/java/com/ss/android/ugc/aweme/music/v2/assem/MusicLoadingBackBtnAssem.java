package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C627680Oje;
import X.C627690Ojf;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS144S0100000_9;
import Y.AfS178S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicLoadingBackBtnAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public boolean LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicLoadingBackBtnAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicLoadingBackBtnAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1266), AFwS240S0000000_9.get$arr$(536), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
        C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 16);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_left_ltr;
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView.setTuxIcon(c419910GdJ);
        C427690Gpr.LJI(tuxIconView, null);
        C786410Ut5.a9(tuxIconView, new ACListenerS144S0100000_9(this, 78));
        Zo(tuxIconView);
        super.xo();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        if (((MusicDetailViewModel) assemVMLazy.getValue()).LLJJJJ) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C627680Oje.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                interfaceC1555100qZQLIZIZ.LIZ(new AfS178S0100000_9(this, 49));
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C627690Ojf.class, null);
            if (interfaceC1555100qZQLIZIZ2 != null) {
                interfaceC1555100qZQLIZIZ2.LIZ(new AfS178S0100000_9(this, 50));
            }
        }
    }
}
