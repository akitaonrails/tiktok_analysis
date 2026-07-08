package com.ss.android.ugc.aweme.tako.otherpage.share.ui;

import X.C019F;
import X.C01GW;
import X.C0DSB;
import X.C13LE;
import X.C1637806bA;
import X.C1857690yRT;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2279711EKz;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1861810yY7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689540R2y;
import X.InterfaceC712990Rxx;
import Y.ACListenerS164S0100000_30;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class ShareAvatarAssem<ITEM extends InterfaceC689540R2y> extends ReusedUIContentAssem<ShareAvatarAssem<ITEM>> implements InterfaceC712990Rxx<ITEM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS574S0100000_30((ShareAvatarAssem) this, 260));
    public final AssemVMLazy LLJJJJJIL;
    public C427660Gpo LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareAvatarAssem.class, "takoShareVM", "getTakoShareVM()Lcom/ss/android/ugc/aweme/tako/otherpage/share/vm/TakoShareVM;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ShareAvatarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoShareVM.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1862), AFwS274S0000000_30.get$arr$(173), null, true);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C427660Gpo c427660Gpo = (C427660Gpo) view.findViewById(R.id.bh2);
        this.LLJJJJLIIL = c427660Gpo;
        C0DSB.LIZIZ(c427660Gpo);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(Object obj) {
        TakoChatUIAbility takoChatUIAbility;
        InterfaceC689540R2y interfaceC689540R2y = (InterfaceC689540R2y) obj;
        boolean z = true;
        if (((Boolean) C2279711EKz.LJII.getValue()).booleanValue() && ((takoChatUIAbility = (TakoChatUIAbility) this.LLJJJJ.getValue()) == null || !takoChatUIAbility.Gx1())) {
            z = false;
        }
        if ((interfaceC689540R2y instanceof InterfaceC1861810yY7) && z) {
            C427660Gpo c427660Gpo = this.LLJJJJLIIL;
            if (c427660Gpo != null) {
                InterfaceC1861810yY7 interfaceC1861810yY7 = (InterfaceC1861810yY7) interfaceC689540R2y;
                if (interfaceC1861810yY7.LJJJJZI().LLILLL.sender.isSelf) {
                    c427660Gpo.setBackground(null);
                    C427660Gpo.LJIIJJI(c427660Gpo, interfaceC1861810yY7.LJJJJZI().LLILLL.sender.iconUrl, false, null, null, false, false, null, null, false, null, 1022);
                    C786410Ut5.T8(c427660Gpo, new View.OnClickListener() { // from class: X.14FW
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    });
                    return;
                } else {
                    C1857690yRT.LJI(c427660Gpo, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), R.attr.zq, 0, null, 24);
                    C786410Ut5.T8(c427660Gpo, new ACListenerS164S0100000_30(this, 47));
                    return;
                }
            }
            return;
        }
        C0DSB.LIZIZ(this.LLJJJJLIIL);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
