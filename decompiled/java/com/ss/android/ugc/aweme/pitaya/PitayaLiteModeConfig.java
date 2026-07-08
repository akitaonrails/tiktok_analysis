package com.ss.android.ugc.aweme.pitaya;

import X.C1344405Ny;
import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PitayaLiteModeConfig implements ReflectionCall {
    public static final C1344405Ny Companion = new Object() { // from class: X.05Ny
    };
    public boolean fromBootLoader;
    public final List<String> moduleList;
    public final int setupMode;

    public final PitayaLiteModeConfig copy(int i, List<String> list) {
        return new PitayaLiteModeConfig(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PitayaLiteModeConfig)) {
            return false;
        }
        PitayaLiteModeConfig pitayaLiteModeConfig = (PitayaLiteModeConfig) obj;
        return this.setupMode == pitayaLiteModeConfig.setupMode && Intrinsics.LJFF(this.moduleList, pitayaLiteModeConfig.moduleList);
    }

    public int hashCode() {
        int i = this.setupMode * 31;
        List<String> list = this.moduleList;
        return i + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PitayaLiteModeConfig(setupMode=");
        sbLIZ.append(this.setupMode);
        sbLIZ.append(", moduleList=");
        sbLIZ.append(this.moduleList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getFromBootLoader() {
        return this.fromBootLoader;
    }

    public final List<String> getModuleList() {
        return this.moduleList;
    }

    public final int getSetupMode() {
        return this.setupMode;
    }

    public final void setFromBootLoader(boolean z) {
        this.fromBootLoader = z;
    }

    public PitayaLiteModeConfig(int i, List<String> list) {
        this.setupMode = i;
        this.moduleList = list;
    }
}
