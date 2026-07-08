package com.ss.android.ugc.aweme.aiuikit.api.pages.loading;

import X.C01GW;
import X.C0ET4;
import X.C0MWU;
import X.C1659700tI8;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C2274921E2o;
import X.C452501pT;
import X.C539960LFq;
import X.C549530Lgt;
import X.C549550Lgv;
import X.C549780LhI;
import X.C549800LhK;
import X.C549820LhM;
import X.C549840LhO;
import X.C559610Lx9;
import X.EnumC1642750sqn;
import X.InterfaceC548530LfH;
import X.InterfaceC548750Lfd;
import X.InterfaceC549370Lgd;
import X.InterfaceC549900LhU;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AIGCLoadingScene extends AIGCBaseScene<C549550Lgv> {
    public final int LLJJLIIIJLLLLLLLZ = R.layout.o7;
    public final C549550Lgv LLJL = new C549550Lgv(this);
    public final C0MWU LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final List<C549530Lgt<?, ?>> LLLLLLIL() {
        return C1697810uHb.LJIIJJI(LLLLLLLLLL(), this.LLJLLIL.getValue(), this.LLJLLL.getValue(), LLLLLLLLL());
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLLLJ(ViewGroup viewGroup) {
    }

    public abstract InterfaceC548750Lfd LLLLLLL();

    public abstract C549840LhO LLLLLLLZIL();

    public abstract C549820LhM LLLLLLZZ();

    public abstract C549800LhK LLLLLZ();

    public C549530Lgt<InterfaceC548530LfH, C549780LhI> LLLLLLLLL() {
        return (C549530Lgt) this.LLJZ.getValue();
    }

    public C549530Lgt<InterfaceC549900LhU, C549800LhK> LLLLLLLLLL() {
        return (C549530Lgt) this.LLJLL.getValue();
    }

    public C549780LhI LLLLLLZ() {
        return new C549780LhI();
    }

    public AIGCLoadingScene() {
        C0MWU c0mwu = new C0MWU();
        c0mwu.LIZJ = R.style.y0;
        this.LLJLIL = c0mwu;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 72));
        this.LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 76));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 75));
        this.LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 73));
        this.LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 74));
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final int LLLLLILLIL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final C0MWU LLLLLJLJLL() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public void LLLLJI(C539960LFq c539960LFq) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C2274921E2o.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC549370Lgd.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC549370Lgd.class, C2274921E2o.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, this, 11));
    }
}
