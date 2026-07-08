package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MusicInfo_ProtoDecoder implements C0IMD<MusicInfo> {
    public static MusicInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MusicInfo musicInfo = new MusicInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        musicInfo.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        musicInfo.songId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        musicInfo.coverHdUrl = _MusicUrlStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        musicInfo.coverMediumUrl = _MusicUrlStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        musicInfo.coverLargeUrl = _MusicUrlStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        musicInfo.coverThumbUrl = _MusicUrlStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        musicInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        musicInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return musicInfo;
            }
        }
    }

    public static void LJ(MusicInfo musicInfo) {
        MusicUrlStruct musicUrlStruct = musicInfo.coverHdUrl;
        if (musicUrlStruct != null) {
            _MusicUrlStruct_ProtoDecoder.LJ(musicUrlStruct);
        }
        MusicUrlStruct musicUrlStruct2 = musicInfo.coverMediumUrl;
        if (musicUrlStruct2 != null) {
            _MusicUrlStruct_ProtoDecoder.LJ(musicUrlStruct2);
        }
        MusicUrlStruct musicUrlStruct3 = musicInfo.coverLargeUrl;
        if (musicUrlStruct3 != null) {
            _MusicUrlStruct_ProtoDecoder.LJ(musicUrlStruct3);
        }
        MusicUrlStruct musicUrlStruct4 = musicInfo.coverThumbUrl;
        if (musicUrlStruct4 != null) {
            _MusicUrlStruct_ProtoDecoder.LJ(musicUrlStruct4);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MusicInfo musicInfo) {
        LJ(musicInfo);
    }

    @Override // X.C0IMD
    public final MusicInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MusicInfo musicInfo, List list) {
    }
}
