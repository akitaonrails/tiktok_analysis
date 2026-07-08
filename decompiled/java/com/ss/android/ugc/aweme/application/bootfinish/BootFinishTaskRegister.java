package com.ss.android.ugc.aweme.application.bootfinish;

import com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BootFinishTaskRegister implements IBootFinishTaskConfig {
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();
    public final List<String> LIZLLL = new ArrayList();

    @Override // com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig
    public final List<String> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig
    public final List<String> LIZLLL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig
    public final List<String> LJFF() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig
    public final List<String> LJII() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig
    public final void LIZ(String str) {
        ((ArrayList) this.LIZ).add(str);
    }

    @Override // com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig
    public final void LIZJ(String str) {
        ((ArrayList) this.LIZJ).add(str);
    }

    @Override // com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig
    public final void LJ(String str) {
        ((ArrayList) this.LIZLLL).add(str);
    }

    @Override // com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig
    public final void LJI(String str) {
        ((ArrayList) this.LIZIZ).add(str);
    }
}
