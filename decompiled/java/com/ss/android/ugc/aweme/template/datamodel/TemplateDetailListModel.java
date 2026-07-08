package com.ss.android.ugc.aweme.template.datamodel;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateDetailListModel extends BaseResponse implements C0X12 {
    public String LL;

    @C09CT("aweme_list")
    public ArrayList<Aweme> awemeList;

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("is_laoding_load")
    public boolean isLazyLoading;

    @C09CT("original_aweme_id")
    public final String originAwemeId;

    @C09CT("page_extra")
    public String pageExtra;

    @C09CT("top_awemes")
    public ArrayList<Aweme> topAwemeList;

    public final ArrayList<Aweme> LJ() {
        ArrayList<Aweme> arrayList = new ArrayList<>();
        ArrayList<Aweme> arrayList2 = this.topAwemeList;
        if (arrayList2 != null) {
            for (Aweme aweme : arrayList2) {
                AwemeBizExtKt.setTemplateDetailPinedTop(aweme, true);
                if (Intrinsics.LJFF(aweme.getAid(), this.originAwemeId)) {
                    AwemeBizExtKt.setTemplateOriginalAweme(aweme, true);
                }
            }
        }
        ArrayList<Aweme> arrayList3 = this.topAwemeList;
        if (arrayList3 != null) {
            arrayList.addAll(arrayList3);
        }
        ArrayList<Aweme> arrayList4 = this.awemeList;
        if (arrayList4 != null) {
            for (Aweme aweme2 : arrayList4) {
                Iterator<Aweme> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(aweme2);
                        break;
                    }
                    if (Intrinsics.LJFF(aweme2.getAid(), it2.next().getAid())) {
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
