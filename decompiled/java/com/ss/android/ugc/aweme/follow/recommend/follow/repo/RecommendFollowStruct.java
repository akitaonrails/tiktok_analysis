package com.ss.android.ugc.aweme.follow.recommend.follow.repo;

import X.C09CT;
import X.C2188811AlT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendFollowStruct implements Cloneable {
    public final User LL;
    public final int LLILLJJLI;

    @C09CT("recommend_item_list")
    public final List<Aweme> awemeList;

    @C09CT("user_id")
    public final String uid;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendFollowStruct(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final RecommendFollowStruct clone() {
        ArrayList arrayList;
        String str = this.uid;
        List<Aweme> list = this.awemeList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(it2.next().m199clone()));
            }
        } else {
            arrayList = new ArrayList();
        }
        return new RecommendFollowStruct(str, arrayList, this.LL.m307clone(), this.LLILLJJLI);
    }

    public final int hashCode() {
        return this.uid.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecommendFollowStruct)) {
            return false;
        }
        return TextUtils.equals(((RecommendFollowStruct) obj).uid, this.uid);
    }

    public RecommendFollowStruct(String str, List<Aweme> list, User user, int i) {
        this.uid = str;
        this.awemeList = list;
        this.LL = user;
        this.LLILLJJLI = i;
    }
}
