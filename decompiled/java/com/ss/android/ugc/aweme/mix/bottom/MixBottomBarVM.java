package com.ss.android.ugc.aweme.mix.bottom;

import X.C08I7;
import X.C0PEM;
import X.C0SUC;
import X.C1012040cRW;
import X.C1165090gQN;
import X.C1169150gWv;
import X.C1483410ohn;
import X.C1623606Xi;
import X.C20673215v0;
import X.C2189821An6;
import X.C23250099c;
import X.C722990SXp;
import X.C723080SXy;
import X.InterfaceC1481730of5;
import X.InterfaceC1483670oiD;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class MixBottomBarVM extends AbsMixBottomBarVM {
    public final C08I7<C722990SXp, Pair<MixStruct, MixVideosResponse>> LL = new C08I7<>(3);
    public volatile String LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM
    public final void yQ2() {
        if (!C20673215v0.LIZ(R.layout.do3, null)) {
            C20673215v0.LJI(R.layout.do3, null);
        }
        if (C20673215v0.LIZ(R.layout.do6, null)) {
            return;
        }
        C20673215v0.LJI(R.layout.do6, null);
    }

    @Override // com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM
    public final void xQ2(Aweme aweme) {
        String mixId;
        String aid;
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo == null || (mixId = playListInfo.getMixId()) == null || (aid = aweme.getAid()) == null) {
            return;
        }
        C722990SXp c722990SXp = new C722990SXp(mixId, aid);
        int iLIZ = C723080SXy.LIZ();
        if (this.LL.LIZIZ(c722990SXp) != null) {
            setState(new AwS590S0100000_11(new C1623606Xi(c722990SXp), (C1623606Xi<C722990SXp>) 166));
        } else {
            if (Intrinsics.LJFF(this.LLILLJJLI, aweme.getAid())) {
                return;
            }
            this.LLILLJJLI = aweme.getAid();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1165090gQN(mixId, aweme, iLIZ, this, aid, c722990SXp, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM
    public final boolean vQ2(String str, String str2) {
        if (this.LL.LIZIZ(new C722990SXp(str, str2)) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM
    public final void wQ2(Context context, Aweme aweme, String str, boolean z) {
        String str2;
        float duration;
        String str3;
        String mixId;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ2;
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
        String playlistSearchId = c2189821An6LIZ.getPlaylistSearchId();
        Integer numValueOf = Integer.valueOf(c2189821An6LIZ.isFromVideo());
        String searchType = c2189821An6LIZ.getSearchType();
        HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
        String mixId2 = null;
        if (searchExtraParams != null) {
            str2 = searchExtraParams.get("search_result_id");
        } else {
            str2 = null;
        }
        C1169150gWv c1169150gWv = new C1169150gWv(playlistSearchId, numValueOf, searchType, 0, str2, null);
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL = C1483410ohn.LJLJJI().LJIILL();
        float currentPosition = 0.0f;
        if (interfaceC1483670oiDLJIILL != null && (interfaceC1481730of5LJIIIZ2 = interfaceC1483670oiDLJIILL.LJIIIZ()) != null) {
            duration = interfaceC1481730of5LJIIIZ2.getDuration();
        } else {
            duration = 0.0f;
        }
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL2 = C1483410ohn.LJLJJI().LJIILL();
        if (interfaceC1483670oiDLJIILL2 != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiDLJIILL2.LJIIIZ()) != null) {
            currentPosition = interfaceC1481730of5LJIIIZ.getCurrentPosition();
        }
        float f = (currentPosition / duration) * 100;
        C1012040cRW.LIZIZ().LIZ = C1483410ohn.LJLJJI();
        C1012040cRW.LIZIZ().LIZJ = C1483410ohn.LJLJJI().LJIILL().LJIIIZ().getCurrentPosition();
        C1012040cRW.LIZIZ().LIZIZ = aweme.getAid();
        C1012040cRW.LIZIZ().LIZJ = -1L;
        C722990SXp c722990SXpLIZ = getState().LL.LIZ();
        if (c722990SXpLIZ != null) {
            str3 = c722990SXpLIZ.LIZ;
        } else {
            str3 = null;
        }
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo != null) {
            mixId2 = playListInfo.getMixId();
        }
        boolean z2 = !Intrinsics.LJFF(str3, mixId2);
        String aid = aweme.getAid();
        String groupId = aweme.getGroupId();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        PlayListInfo playListInfo2 = aweme.playlist_info;
        if (playListInfo2 == null || (mixId = playListInfo2.getMixId()) == null) {
            mixId = "";
        }
        iMixFeedService.LJJIIZ(context, aweme, c1169150gWv, Float.valueOf(f), mixId, aweme.getAid(), str, "", aid, groupId, authorUid, z, z2);
    }
}
