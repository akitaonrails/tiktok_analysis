package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class TabIcon {

    @C09CT("height")
    public Float height;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public Float width;

    public TabIcon() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        List<String> list;
        TabIcon tabIcon;
        List<String> list2;
        Object obj2;
        if (!(obj instanceof TabIcon) || (list = this.urlList) == null || !(!list.isEmpty()) || (list2 = (tabIcon = (TabIcon) obj).urlList) == null || !(!list2.isEmpty())) {
            return false;
        }
        List<String> list3 = this.urlList;
        Object obj3 = null;
        if (list3 != null) {
            obj2 = ListProtector.get(list3, 0);
        } else {
            obj2 = null;
        }
        List<String> list4 = tabIcon.urlList;
        if (list4 != null) {
            obj3 = ListProtector.get(list4, 0);
        }
        return Intrinsics.LJFF(obj2, obj3);
    }

    public TabIcon(List<String> list, Float f, Float f2) {
        this.urlList = list;
        this.width = f;
        this.height = f2;
    }
}
