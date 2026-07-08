package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MusicGiftMood_ProtoDecoder implements C0IMD<MusicGiftMood> {
    public static MusicGiftMood LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MusicGiftMood musicGiftMood = new MusicGiftMood();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 5) {
                                if (iLJI != 6) {
                                    if (iLJI != 7) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        musicGiftMood.color = _MusicGiftMoodColor_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    musicGiftMood.title = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                musicGiftMood.disc = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            musicGiftMood.name = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        musicGiftMood.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    musicGiftMood.moodId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return musicGiftMood;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MusicGiftMood musicGiftMood) {
        MusicGiftMood musicGiftMood2 = musicGiftMood;
        ImageModel imageModel = musicGiftMood2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = musicGiftMood2.disc;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final MusicGiftMood LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MusicGiftMood musicGiftMood, List list) {
    }
}
