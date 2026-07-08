package com.bytedance.touchpoint.ui.pendant;

import X.C09AY;
import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public final class SpecActWidget$keva$2 extends C09AY implements Function0<Keva> {
    public SpecActWidget$keva$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Keva invoke() {
        return Keva.getRepo("act_widget");
    }
}
