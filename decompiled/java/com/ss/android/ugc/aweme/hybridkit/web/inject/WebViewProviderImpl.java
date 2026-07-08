package com.ss.android.ugc.aweme.hybridkit.web.inject;

import X.C1544850qIt;
import X.C1BVM;
import X.InterfaceC1544310qI1;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class WebViewProviderImpl extends C1BVM {
    public final InterfaceC1544310qI1 LLJ;

    @Override // X.C1BVM, X.InterfaceC1548170qOF
    public final String LIZ() {
        return "WebViewProviderImpl";
    }

    @Override // X.C1BVM
    public final void LJ() {
        super.LJ();
        this.LLJ.destroy(this.LLILZIL);
    }

    public WebViewProviderImpl(C1544850qIt c1544850qIt) {
        super(7);
        this.LLJ = c1544850qIt;
    }

    @Override // X.C1BVM
    public final void LJIIJJI(String str) {
        this.LLJ.LJ(this.LLILZIL, str);
        super.LJIIJJI(str);
        this.LLJ.LJFF(this.LLILZIL);
    }

    @Override // X.C1BVM
    public final void LJIIJ(Map<String, Object> map, boolean z) {
        super.LJIIJ(map, z);
        this.LLJ.LIZJ(this.LLILZIL);
    }

    @Override // X.C1BVM
    public final void LJIIL(String str, Map<String, String> map) {
        this.LLJ.LJ(this.LLILZIL, str);
        super.LJIIL(str, map);
        this.LLJ.LJFF(this.LLILZIL);
    }
}
