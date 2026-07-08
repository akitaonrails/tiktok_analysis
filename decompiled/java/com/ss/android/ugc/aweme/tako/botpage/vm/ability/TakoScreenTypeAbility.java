package com.ss.android.ugc.aweme.tako.botpage.vm.ability;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoScreenTypeAbility implements ITakoScreenTypeAbility {
    public String LL;

    public TakoScreenTypeAbility() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility
    public final boolean cA() {
        return Intrinsics.LJFF(this.LL, "nine_split_screen");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility
    public final void eM0() {
        this.LL = "full_screen";
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility
    public final boolean isFullScreen() {
        return Intrinsics.LJFF(this.LL, "full_screen");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility
    public final boolean r41() {
        return Intrinsics.LJFF(this.LL, "seven_split_screen");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility
    public final String nZ0() {
        return this.LL;
    }

    public TakoScreenTypeAbility(TakoEnterParams takoEnterParams) {
        String screenType;
        if (takoEnterParams != null) {
            screenType = takoEnterParams.getScreenType();
        } else {
            screenType = null;
        }
        this.LL = screenType;
    }
}
