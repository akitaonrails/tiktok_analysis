package com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach;

import X.C01GW;
import X.C0CHT;
import X.C311110CHl;
import X.C452501pT;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class l {
    public static final l LIZ = new l();
    public static final ReuseTtsAudioInMusicShootConfig LIZIZ = new ReuseTtsAudioInMusicShootConfig(false, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(263));

    public static final boolean LIZ() {
        C01GW c01gw = LIZJ;
        return ((ReuseTtsAudioInMusicShootConfig) c01gw.getValue()).enableEditingPageTextSticker && ((ReuseTtsAudioInMusicShootConfig) c01gw.getValue()).enableReuse;
    }

    public static final boolean LIZIZ() {
        if (((ReuseTtsAudioInMusicShootConfig) LIZJ.getValue()).enableReuse) {
            return C311110CHl.LIZ() || (C0CHT.LIZ() && !C311110CHl.LIZ());
        }
        return false;
    }
}
