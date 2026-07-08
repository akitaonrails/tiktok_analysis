package com.ss.android.ugc.aweme.assem;

import X.C019F;
import X.C01GW;
import X.C0P6P;
import X.C1218680hoo;
import X.C1220080hr4;
import X.C1220270hrN;
import X.C12823050b;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20509915Nh;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC1220110hr7;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.cell.MentionVideoFooterCell;
import com.ss.android.ugc.aweme.viewmodel.BaseVideoListVM;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MentionVideoListAssem extends UIListContentAssem<BaseVideoListVM<C1220270hrN, C12823050b, Long>> implements InterfaceC1220110hr7 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public C20509915Nh LLIZLLLIL;
    public Fragment LLJI;
    public final AssemVMLazy LLJILJILJ;
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1218680hoo.class, null), checkSupervisorPrepared());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 373));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 375));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MentionVideoListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/viewmodel/BaseVideoListVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MentionVideoListAssem() {
        C019F c019f = C019F.LIZ;
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 376);
        AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(this, 377);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BaseVideoListVM.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, awS563S0100000_19, AFwS257S0000000_19.get$arr$(72), awS563S0100000_192, true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = true;
        c20603715jn.LIZLLL = MentionVideoFooterCell.class;
        return c20603715jn;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0hr5] */
    @Override // X.InterfaceC1220110hr7
    public final C1220080hr4 LJIIZILJ() {
        return new C1220080hr4(Go(), new C0P6P() { // from class: X.0hr5
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.Jo().manualListRetry(EnumC323450Cm7.Next);
            }
        });
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final BaseVideoListVM<C1220270hrN, C12823050b, Long> Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (BaseVideoListVM) assemVMLazy.getValue();
    }

    public final void Oo() {
        C20509915Nh c20509915Nh = this.LLIZLLLIL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZIZ();
        }
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Oo();
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.assem.MentionVideoListAssem.onViewCreated(android.view.View):void");
    }
}
