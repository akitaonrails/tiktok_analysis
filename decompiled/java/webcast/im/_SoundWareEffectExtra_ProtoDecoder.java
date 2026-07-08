package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SoundWareEffectExtra_ProtoDecoder implements C0IMD<SoundWareEffectExtra> {
    public static SoundWareEffectExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SoundWareEffectExtra soundWareEffectExtra = new SoundWareEffectExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                soundWareEffectExtra.rightId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            soundWareEffectExtra.userRightId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        soundWareEffectExtra.dynamicImageName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    soundWareEffectExtra.staticImageName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return soundWareEffectExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final SoundWareEffectExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SoundWareEffectExtra soundWareEffectExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SoundWareEffectExtra soundWareEffectExtra, List list) {
    }
}
