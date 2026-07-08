package com.ss.android.ugc.aweme.tako.otherpage.share.ui;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1852920yJm;
import X.C1857690yRT;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS164S0100000_30;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class ShareTitleNewAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public SmartImageView LLJJI;
    public final AssemVMLazy LLJJIII;
    public boolean LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareTitleNewAssem.class, "takoShareVM", "getTakoShareVM()Lcom/ss/android/ugc/aweme/tako/otherpage/share/vm/TakoShareVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ShareTitleNewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoShareVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1359), AFwS274S0000000_30.get$arr$(175), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fr9;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TextView textView = (TextView) view.findViewById(R.id.xcw);
        if (textView != null) {
            textView.setText(C1852920yJm.LIZ.botName);
        }
        this.LLJJI = (SmartImageView) view.findViewById(R.id.xcx);
        SmartImageView smartImageView = this.LLJJI;
        if (smartImageView != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ;
            C786410Ut5.G6(smartImageView, layoutParams);
            C1857690yRT.LJII(smartImageView, iLIZIZ, iLIZIZ, false);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.xcy);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS164S0100000_30(this, 21));
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        ((TakoShareVM) assemVMLazy.getValue()).vQ2(new AwS574S0100000_30(this, 263));
        ((TakoShareVM) this.LLJJIII.getValue()).wQ2(new AwS574S0100000_30(this, 264));
    }
}
