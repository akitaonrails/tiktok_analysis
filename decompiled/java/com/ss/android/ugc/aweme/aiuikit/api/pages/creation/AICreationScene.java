package com.ss.android.ugc.aweme.aiuikit.api.pages.creation;

import X.C01GW;
import X.C0MWU;
import X.C1697810uHb;
import X.C2274921E2o;
import X.C452501pT;
import X.C549530Lgt;
import X.C549540Lgu;
import com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AICreationScene extends AIGCBaseScene<C549540Lgu> {
    public final int LLJJLIIIJLLLLLLLZ = R.layout.nz;
    public final C549540Lgu LLJL = new C549540Lgu(this);
    public boolean LLJLIL;
    public C2274921E2o LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final List<C549530Lgt<?, ?>> LLLLLLIL() {
        return C1697810uHb.LJIIJJI(this.LLJLL.getValue(), this.LLJLLL.getValue(), this.LLJLLIL.getValue());
    }

    public AICreationScene() {
        new C0MWU();
        this.LLJLIL = true;
        this.LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 59));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 58));
        this.LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 57));
        this.LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 56));
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final int LLLLLILLIL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onResume() {
        super.onResume();
    }
}
