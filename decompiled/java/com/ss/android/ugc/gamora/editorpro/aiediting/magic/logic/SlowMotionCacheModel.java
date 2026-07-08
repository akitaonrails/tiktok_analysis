package com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SlowMotionCacheModel {
    public static final int $stable = 8;
    public ClientToEffectMessage client2EffectMessage;
    public String exportVideoPath;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlowMotionCacheModel)) {
            return false;
        }
        SlowMotionCacheModel slowMotionCacheModel = (SlowMotionCacheModel) obj;
        return Intrinsics.LJFF(this.exportVideoPath, slowMotionCacheModel.exportVideoPath) && Intrinsics.LJFF(this.client2EffectMessage, slowMotionCacheModel.client2EffectMessage);
    }

    public int hashCode() {
        return (this.exportVideoPath.hashCode() * 31) + this.client2EffectMessage.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlowMotionCacheModel(exportVideoPath=");
        sbLIZ.append(this.exportVideoPath);
        sbLIZ.append(", client2EffectMessage=");
        sbLIZ.append(this.client2EffectMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setClient2EffectMessage(ClientToEffectMessage clientToEffectMessage) {
        this.client2EffectMessage = clientToEffectMessage;
    }

    public final void setExportVideoPath(String str) {
        this.exportVideoPath = str;
    }

    public SlowMotionCacheModel(String str, ClientToEffectMessage clientToEffectMessage) {
        this.exportVideoPath = str;
        this.client2EffectMessage = clientToEffectMessage;
    }
}
