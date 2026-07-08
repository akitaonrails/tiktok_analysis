package com.bytedance.pipo.stellar.base.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoStellarPageSettingsModel {

    @C09CT("disable_recreate_targets")
    public final List<String> disableRecreateTargets;

    public PipoStellarPageSettingsModel() {
        this(null, 1, null);
    }

    public PipoStellarPageSettingsModel(List<String> list) {
        this.disableRecreateTargets = list;
    }

    public PipoStellarPageSettingsModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
