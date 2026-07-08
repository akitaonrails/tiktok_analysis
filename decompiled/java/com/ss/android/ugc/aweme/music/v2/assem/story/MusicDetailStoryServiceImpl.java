package com.ss.android.ugc.aweme.music.v2.assem.story;

import X.C13LE;
import X.C19719912Dl;
import X.C630620OoO;
import X.InterfaceC630590OoL;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.services.MusicEntranceResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailStoryServiceImpl implements IMusicDetailStoryService {
    @Override // com.ss.android.ugc.aweme.music.v2.assem.story.IMusicDetailStoryService
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(StoryMusicIgnoreCopyRightCoverAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.story.IMusicDetailStoryService
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(StoryMusicCoverAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.story.IMusicDetailStoryService
    public final MusicEntranceResult LIZ(int i) {
        C630620OoO.LIZ.getClass();
        return C630620OoO.LIZIZ.get(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.story.IMusicDetailStoryService
    public final void LIZJ(int i, MusicEntranceResult musicEntranceResult) {
        InterfaceC630590OoL interfaceC630590OoL;
        C630620OoO c630620OoO = C630620OoO.LIZ;
        c630620OoO.getClass();
        MusicEntranceResult musicEntranceResult2 = C630620OoO.LIZIZ.get(Integer.valueOf(i));
        if (musicEntranceResult2 != null) {
            List<Aweme> list = musicEntranceResult2.awemeList;
            if (list != null) {
                Collection<? extends Aweme> arrayList = musicEntranceResult.awemeList;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                list.addAll(arrayList);
            }
            List<String> list2 = musicEntranceResult2.unreadStoryIds;
            List<String> list3 = musicEntranceResult.unreadStoryIds;
            c630620OoO.getClass();
            if (list2 != null) {
                ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi$default(ISocPubStatusRepoService.class, false, false, false, 14, null);
                if (list3 != null) {
                    for (String str : list3) {
                        if (!list2.contains(str) && (iSocPubStatusRepoService == null || !iSocPubStatusRepoService.LJFF(str))) {
                            list2.add(str);
                        }
                    }
                }
            }
            musicEntranceResult2.setHasMore(musicEntranceResult.hasMore);
            musicEntranceResult2.setPageToken(musicEntranceResult.pageToken);
            musicEntranceResult2.setTotalCount(musicEntranceResult.totalCount);
            WeakReference<InterfaceC630590OoL> weakReference = C630620OoO.LIZJ.get(Integer.valueOf(i));
            if (weakReference != null && (interfaceC630590OoL = weakReference.get()) != null) {
                interfaceC630590OoL.LIZ(musicEntranceResult2.unreadStoryIds);
            }
        }
    }
}
