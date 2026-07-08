package com.ss.android.ugc.aweme.tako.aivideo.detail.ability;

import X.AnonymousClass0951;
import X.C09IC;
import X.C1BNE;
import X.C2252321DDq;
import X.EnumC1519405xA;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoAIVideoOverlayAbilityImpl implements TakoAIVideoOverlayAbility {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;

    public TakoAIVideoOverlayAbilityImpl() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(EnumC1519405xA.WAITING);
        this.LLILLJJLI = c2252321DDqLIZ2;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        C09IC.LIZIZ(c2252321DDqLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility
    public final AnonymousClass0951 Vg2() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility
    public final void gR1(boolean z) {
        this.LL.setValue(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility
    public final void rn1(EnumC1519405xA enumC1519405xA) {
        this.LLILLJJLI.setValue(enumC1519405xA);
    }
}
