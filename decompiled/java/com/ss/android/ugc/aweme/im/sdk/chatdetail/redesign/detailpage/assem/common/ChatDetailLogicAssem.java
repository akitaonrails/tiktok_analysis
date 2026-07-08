package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common;

import X.C01GW;
import X.C14K9;
import X.C1509305vX;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1618140sD6;
import X.C1620960sHe;
import X.C16GW;
import X.C418440Gaw;
import X.C426750GoL;
import X.C724240Sb0;
import X.C814420VxA;
import X.InterfaceC1618150sD7;
import X.InterfaceC1618160sD8;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public abstract class ChatDetailLogicAssem extends UIContentAssem implements AppBarOffsetListenerAbility {
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(new AwS568S0100000_24(this, 625));
    public final C01GW LLJ = C1509305vX.LIZ(new AwS568S0100000_24(this, 627));
    public final C01GW LLJI = C1509305vX.LIZ(new AwS568S0100000_24(this, 626));
    public final C01GW LLJIJIL = C1509305vX.LIZ(new AwS568S0100000_24(this, 628));
    public final C01GW LLJILJIL = C1509305vX.LIZ(new AwS568S0100000_24(this, 629));
    public final C01GW LLJILJILJ = C1509305vX.LIZ(new AwS568S0100000_24(this, 630));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C16GW Go() {
        return (C16GW) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), AppBarOffsetListenerAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, AppBarOffsetListenerAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.AppBarOffsetListenerAbility
    public final void Ik1(C1618140sD6 c1618140sD6) {
        Go().LIZ(c1618140sD6);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.AppBarOffsetListenerAbility
    public final void SA0(C1618140sD6 c1618140sD6) {
        C16GW c16gwGo = Go();
        if (c1618140sD6 != null) {
            List<InterfaceC1618160sD8<?>> list = c16gwGo.LLIZ;
            if (list != null) {
                ((ArrayList) list).remove(c1618140sD6);
                return;
            }
            return;
        }
        c16gwGo.getClass();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C426750GoL.LJIIIZ((View) this.LLJIJIL.getValue(), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), false, 23);
        Go().LIZ(new InterfaceC1618150sD7() { // from class: X.0sD5
            @Override // X.InterfaceC1618160sD8
            public final void LIZ(int i) {
                Integer numLIZJ;
                Integer numLIZJ2;
                int height = ((View) this.LIZ.LLJI.getValue()).getHeight();
                int height2 = ((((View) this.LIZ.LLJI.getValue()).getHeight() + ((View) this.LIZ.LLJIJIL.getValue()).getHeight()) - ((View) this.LIZ.LLJILJIL.getValue()).getHeight()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int iAbs = Math.abs(i);
                C786410Ut5.U4((FrameLayout) this.LIZ.LLJIJIL.getValue(), 1 - Math.min(Math.max(iAbs - height, 0) / (height2 - height), 1.0f));
                if (iAbs >= height2) {
                    Context context = this.LIZ.getContext();
                    if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
                        ((TuxNavBar) this.LIZ.LLJILJIL.getValue()).setNavBackground(numLIZJ2.intValue());
                    }
                    C786410Ut5.W4((LinearLayout) this.LIZ.LLJILJILJ.getValue(), 1.0f);
                    return;
                }
                Context context2 = this.LIZ.getContext();
                if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context2)) != null) {
                    ((TuxNavBar) this.LIZ.LLJILJIL.getValue()).setNavBackground(numLIZJ.intValue());
                }
                C786410Ut5.W4((LinearLayout) this.LIZ.LLJILJILJ.getValue(), 0.0f);
            }
        });
        C14K9.LJIJJ(LJJIJL(), new C1620960sHe(this, 0));
    }
}
