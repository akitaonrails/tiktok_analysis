package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpVideoShrinkAllowListSetting {
    public static final PdpVideoShrinkList LIZ = new PdpVideoShrinkList(null, 1, null);

    public static final class PdpVideoShrinkList {

        @C09CT("allow_list")
        public final List<String> pageList;

        public PdpVideoShrinkList() {
            this(null, 1, null);
        }

        public PdpVideoShrinkList(List<String> list) {
            this.pageList = list;
        }

        public PdpVideoShrinkList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
