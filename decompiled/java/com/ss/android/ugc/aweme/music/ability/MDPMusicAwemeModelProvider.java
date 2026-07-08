package com.ss.android.ugc.aweme.music.ability;

import X.C1401320mZO;
import X.C201955140j;
import X.C2188811AlT;
import X.C290790BaX;
import X.InterfaceC1526205yG;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class MDPMusicAwemeModelProvider implements IMDPMusicAwemeModelAbility {
    public final C1401320mZO LL;

    @Override // com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility
    public final int XJ0() {
        Music music;
        MusicDetail musicDetail = this.LL.LLJJJIL;
        if (musicDetail == null || (music = musicDetail.music) == null) {
            return 0;
        }
        return music.getUserCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility
    public final void Y32() {
        C1401320mZO c1401320mZO = this.LL;
        ((MusicAwemeList) c1401320mZO.mData).increaseShowMoreTime();
        List<InterfaceC1526205yG> list = c1401320mZO.mNotifyListeners;
        if (list != null) {
            Iterator<InterfaceC1526205yG> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility
    public final void hR0() {
        C1401320mZO c1401320mZO = this.LL;
        if (c1401320mZO != null) {
            String str = c1401320mZO.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkToRefreshMusicSquareList-->blockForMusicDeailNull:");
            sbLIZ.append(c1401320mZO.LLJJL);
            C201955140j.LJIILIIL(str, C2188811AlT.LIZIZ(sbLIZ));
            if (C290790BaX.LIZ() && c1401320mZO.LLJJL) {
                c1401320mZO.LLJJL = false;
                c1401320mZO.LJIJJ((MusicAwemeList) c1401320mZO.mData, c1401320mZO.LLILZIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility
    public final boolean pa0() {
        List<Aweme> list;
        MusicAwemeList data = this.LL.getData();
        return (data == null || (list = data.foldAidItems) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    public MDPMusicAwemeModelProvider(C1401320mZO c1401320mZO) {
        this.LL = c1401320mZO;
    }

    @Override // com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility
    public final boolean Ta2(String str) {
        if (str == null) {
            return this.LL.isHasMore();
        }
        MusicAwemeList data = this.LL.getData();
        if (data == null || data.getHasMore(str) != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility
    public final void c5(String str) {
        String idStr;
        long j;
        Music music;
        C1401320mZO c1401320mZO = this.LL;
        Object[] objArr = new Object[4];
        objArr[0] = 4;
        MusicDetail musicDetail = this.LL.LLJJJIL;
        if (musicDetail != null && (music = musicDetail.music) != null) {
            idStr = music.getIdStr();
        } else {
            idStr = null;
        }
        objArr[1] = idStr;
        objArr[2] = 0;
        objArr[3] = str;
        c1401320mZO.getClass();
        if (objArr[3] == "show_more" && ((MusicAwemeList) c1401320mZO.mData).isHasMore()) {
            if (C290790BaX.LIZ()) {
                c1401320mZO.mListQueryType = 4;
            }
            String str2 = (String) objArr[1];
            if (c1401320mZO.isDataEmpty()) {
                j = 0;
            } else {
                j = ((MusicAwemeList) c1401320mZO.mData).cursor;
            }
            c1401320mZO.LJIIL(c1401320mZO.LLIZLLLIL, ((Integer) objArr[2]).intValue(), false, str2, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility
    public final void jo(MusicDetail musicDetail) {
        this.LL.LLJJJIL = musicDetail;
    }
}
