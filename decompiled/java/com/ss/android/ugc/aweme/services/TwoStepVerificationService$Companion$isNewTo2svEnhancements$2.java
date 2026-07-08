package com.ss.android.ugc.aweme.services;

import X.C09AY;
import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepVerificationService$Companion$isNewTo2svEnhancements$2 extends C09AY implements Function0<Boolean> {
    public TwoStepVerificationService$Companion$isNewTo2svEnhancements$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Boolean invoke() {
        Keva keva = TwoStepVerificationService.keva;
        return keva.contains("is_new_to_2sv_enhancements") ? Boolean.valueOf(keva.getBoolean("is_new_to_2sv_enhancements", false)) : Boolean.TRUE;
    }
}
