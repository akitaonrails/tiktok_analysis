package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_MusicGiftInfo_AudioResource_ProtoDecoder implements C0IMD<Gift.MusicGiftInfo.AudioResource> {
    public static Gift.MusicGiftInfo.AudioResource LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.MusicGiftInfo.AudioResource audioResource = new Gift.MusicGiftInfo.AudioResource();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            audioResource.snippetId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        audioResource.lyricsUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    audioResource.audioUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audioResource;
            }
        }
    }

    @Override // X.C0IMD
    public final Gift.MusicGiftInfo.AudioResource LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Gift.MusicGiftInfo.AudioResource audioResource) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.MusicGiftInfo.AudioResource audioResource, List list) {
    }
}
