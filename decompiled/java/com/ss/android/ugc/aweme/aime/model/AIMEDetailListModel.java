package com.ss.android.ugc.aweme.aime.model;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMEDetailListModel extends BaseResponse implements C0X12 {
    public String LL;

    @C09CT("aweme_list")
    public ArrayList<Aweme> awemeList;

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("original_aweme_id")
    public final String originAwemeId;

    @C09CT("page_extra")
    public String pageExtra;

    @C09CT("top_awemes")
    public List<? extends Aweme> topAwemeList;

    public final ArrayList<Aweme> LJ() {
        ArrayList<Aweme> arrayList = new ArrayList<>();
        List<? extends Aweme> list = this.topAwemeList;
        if (list != null) {
            arrayList.addAll(list);
        }
        ArrayList<Aweme> arrayList2 = this.awemeList;
        if (arrayList2 != null) {
            for (Aweme aweme : arrayList2) {
                Iterator<Aweme> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(aweme);
                        break;
                    }
                    if (Intrinsics.LJFF(aweme.getAid(), it2.next().getAid())) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.C0X12
    public final String getRequestId() {
        String str = this.LL;
        return str == null ? "" : str;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.LL = str;
    }
}
