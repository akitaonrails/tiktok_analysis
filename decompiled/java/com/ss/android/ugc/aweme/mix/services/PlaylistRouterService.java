package com.ss.android.ugc.aweme.mix.services;

import X.C04TD;
import X.C0SUC;
import X.C1012040cRW;
import X.C1169150gWv;
import X.C1483410ohn;
import X.C2189821An6;
import X.InterfaceC1481730of5;
import X.InterfaceC1483670oiD;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class PlaylistRouterService implements IPlaylistRouterService {
    public static IPlaylistRouterService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPlaylistRouterService.class, false);
        if (objLIZ != null) {
            return (IPlaylistRouterService) objLIZ;
        }
        if (C04TD.s2 == null) {
            synchronized (IPlaylistRouterService.class) {
                if (C04TD.s2 == null) {
                    C04TD.s2 = new PlaylistRouterService();
                }
            }
        }
        return C04TD.s2;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IPlaylistRouterService
    public final void LIZ(Context context, Aweme aweme, String str, boolean z, boolean z2) {
        String str2;
        float duration;
        float currentPosition;
        String mixId;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ2;
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
        String playlistSearchId = c2189821An6LIZ.getPlaylistSearchId();
        Integer numValueOf = Integer.valueOf(c2189821An6LIZ.isFromVideo());
        String searchType = c2189821An6LIZ.getSearchType();
        HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
        if (searchExtraParams != null) {
            str2 = searchExtraParams.get("search_result_id");
        } else {
            str2 = null;
        }
        C1169150gWv c1169150gWv = new C1169150gWv(playlistSearchId, numValueOf, searchType, 0, str2, null);
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL = C1483410ohn.LJLJJI().LJIILL();
        float f = 0.0f;
        if (interfaceC1483670oiDLJIILL != null && (interfaceC1481730of5LJIIIZ2 = interfaceC1483670oiDLJIILL.LJIIIZ()) != null) {
            duration = interfaceC1481730of5LJIIIZ2.getDuration();
        } else {
            duration = 0.0f;
        }
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL2 = C1483410ohn.LJLJJI().LJIILL();
        if (interfaceC1483670oiDLJIILL2 != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiDLJIILL2.LJIIIZ()) != null) {
            currentPosition = interfaceC1481730of5LJIIIZ.getCurrentPosition();
        } else {
            currentPosition = 0.0f;
        }
        if (duration != 0.0f) {
            f = (currentPosition / duration) * 100;
        }
        C1012040cRW.LIZIZ().LIZ = C1483410ohn.LJLJJI();
        C1012040cRW.LIZIZ().LIZJ = C1483410ohn.LJLJJI().LJIILL().LJIIIZ().getCurrentPosition();
        C1012040cRW.LIZIZ().LIZIZ = aweme.getAid();
        C1012040cRW.LIZIZ().LIZJ = -1L;
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo == null || (mixId = playListInfo.getMixId()) == null) {
            mixId = "";
        }
        iMixFeedService.LJJIIZ(context, aweme, c1169150gWv, Float.valueOf(f), mixId, aweme.getAid(), str, "", "", "", "", z, z2);
    }
}
