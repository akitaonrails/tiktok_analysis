package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_MusicGiftInfo_ProtoDecoder implements C0IMD<Gift.MusicGiftInfo> {
    public static Gift.MusicGiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.MusicGiftInfo musicGiftInfo = new Gift.MusicGiftInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    musicGiftInfo.songName = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                musicGiftInfo.moodId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            musicGiftInfo.songId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        musicGiftInfo.resource = _Gift_MusicGiftInfo_AudioResource_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    musicGiftInfo.artistName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return musicGiftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift.MusicGiftInfo musicGiftInfo) {
    }

    @Override // X.C0IMD
    public final Gift.MusicGiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.MusicGiftInfo musicGiftInfo, List list) {
    }
}
