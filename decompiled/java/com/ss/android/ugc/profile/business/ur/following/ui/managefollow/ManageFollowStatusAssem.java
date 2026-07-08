package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS164S0400000_4;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ManageFollowStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageFollowStatusAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/following/ui/managefollow/ManageFollowVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManageFollowStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageFollowVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 885), AFwS229S0000000_2.get$arr$(539), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.unfollow_container);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.nxo);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w28);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0DHs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C339250DRr c339250DRr = (C339250DRr) obj;
                c339250DRr.getClass();
                return C627260Oiy.LIZ(c339250DRr);
            }
        }, C736820SvI.LIZLLL(), new AwS164S0400000_4(linearLayout, viewOnAttachStateChangeListenerC20604515jv, c1749280vcc, view, 0), 4);
    }
}
