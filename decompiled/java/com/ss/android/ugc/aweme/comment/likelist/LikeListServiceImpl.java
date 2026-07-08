package com.ss.android.ugc.aweme.comment.likelist;

import X.C1356840lPe;
import X.C1357090lQ3;
import X.C730150SkX;
import X.EnumC1356970lPr;
import X.InterfaceC1356980lPs;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.like.ILikeListService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeListServiceImpl implements ILikeListService {
    @Override // com.ss.android.ugc.aweme.like.ILikeListService
    public final Object LIZ(long j, long j2, Aweme aweme, String str) throws JSONException {
        String aid;
        List<User> likeList;
        String aid2;
        InterfaceC1356980lPs interfaceC1356980lPs = (InterfaceC1356980lPs) C1357090lQ3.LIZIZ.getValue();
        String aid3 = null;
        if (aweme != null) {
            aid3 = aweme.getAid();
        }
        String str2 = "";
        if (aid3 == null) {
            aid3 = "";
        }
        LikeListResponse likeListResponseLIZLLL = interfaceC1356980lPs.LIZ(aid3, j, j2, 50, str, EnumC1356970lPr.NORMAL.getValue()).LIZLLL();
        if (aweme != null && C730150SkX.LIZJ(aweme)) {
            likeListResponseLIZLLL.setLikeList(new ArrayList());
        }
        long size = 0;
        if (j == 0) {
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            likeListResponseLIZLLL.setLikeList(C1356840lPe.LIZJ(aid, likeListResponseLIZLLL.getLikeList()));
            if (!likeListResponseLIZLLL.getHasMore() && (likeList = likeListResponseLIZLLL.getLikeList()) != null && Integer.valueOf(likeList.size()) != null) {
                if (aweme != null && (aid2 = aweme.getAid()) != null) {
                    str2 = aid2;
                }
                List<User> likeList2 = likeListResponseLIZLLL.getLikeList();
                if (likeList2 != null) {
                    size = likeList2.size();
                }
                C1356840lPe.LIZIZ(str2, size, likeListResponseLIZLLL);
            }
        }
        return likeListResponseLIZLLL;
    }
}
