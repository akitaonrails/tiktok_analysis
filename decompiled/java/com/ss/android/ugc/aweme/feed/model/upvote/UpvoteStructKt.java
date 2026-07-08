package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C15438062q;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class UpvoteStructKt {
    public static final List<String> getRepostUids(UpvoteList upvoteList) {
        String uid;
        if (upvoteList == null) {
            return null;
        }
        List<UpvoteStruct> list = upvoteList.upvotes;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<UpvoteStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            User user = it2.next().user;
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            arrayList.add(uid);
        }
        return arrayList;
    }
}
