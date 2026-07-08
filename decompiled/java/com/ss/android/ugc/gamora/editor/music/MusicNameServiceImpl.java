package com.ss.android.ugc.gamora.editor.music;

import X.C13LP;
import X.C1418630n1J;
import X.C1419670n2z;
import X.C1954807lC;
import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.service.IMusicNameService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicNameServiceImpl implements IMusicNameService {
    @Override // com.ss.android.ugc.aweme.music.service.IMusicNameService
    public final String LIZIZ(MusicModel musicModel) {
        UrlModel coverMedium;
        List<String> urlList;
        if (musicModel == null) {
            return null;
        }
        int i = C1419670n2z.LIZ[C1418630n1J.LIZIZ(musicModel).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
            } else {
                MatchedPGCSoundInfo matchedPGCSoundInfo = musicModel.getMatchedPGCSoundInfo();
                if (matchedPGCSoundInfo == null || (coverMedium = matchedPGCSoundInfo.getCoverMedium()) == null || (urlList = coverMedium.getUrlList()) == null) {
                    return null;
                }
                return (String) C13LP.LJJJLZIJ(0, urlList);
            }
        }
        return musicModel.getPicSmall();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicNameService
    public final String LIZJ(AVMusic aVMusic) {
        UrlModel coverMedium;
        List<String> urlList;
        if (aVMusic == null) {
            return null;
        }
        int i = C1419670n2z.LIZ[C1418630n1J.LIZ(aVMusic).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
            } else {
                MatchedPGCSoundInfo matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
                if (matchedPGCSoundInfo == null || (coverMedium = matchedPGCSoundInfo.getCoverMedium()) == null || (urlList = coverMedium.getUrlList()) == null) {
                    return null;
                }
                return (String) C13LP.LJJJLZIJ(0, urlList);
            }
        }
        return aVMusic.getPicSmall();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicNameService
    public final String LIZ(Context context, MusicModel musicModel) {
        String name;
        String name2;
        String str = "";
        if (musicModel == null || (name = musicModel.getName()) == null || name.length() == 0) {
            return "";
        }
        int i = C1419670n2z.LIZ[C1418630n1J.LIZIZ(musicModel).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Object[] objArr = new Object[1];
                    String singer = musicModel.getSinger();
                    if (singer != null) {
                        str = singer;
                    }
                    objArr[0] = str;
                    return context.getString(2131839043, objArr);
                }
                throw new C1954807lC();
            }
            MatchedPGCSoundInfo matchedPGCSoundInfo = musicModel.getMatchedPGCSoundInfo();
            if (matchedPGCSoundInfo == null || (name2 = matchedPGCSoundInfo.getTitle()) == null) {
                return "";
            }
        } else {
            name2 = musicModel.getName();
            if (name2 == null) {
                return "";
            }
        }
        return name2;
    }
}
