package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import com.ss.android.ugc.aweme.report.ClickReportInfo;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DetectBehavior implements Serializable {

    @C09CT("count_mode")
    public final String mode;

    @C09CT("type")
    public final String type;

    @C09CT("value")
    public final Integer value;

    public DetectBehavior() {
        this("total", null, null);
    }

    public final boolean detect(List<ClickReportInfo> list) {
        String str = this.type;
        if (Intrinsics.LJFF(str, "unconsumed")) {
            return list.isEmpty();
        }
        if (Intrinsics.LJFF(str, "unconsumed_negative_click")) {
            if (!list.isEmpty()) {
                if (!list.isEmpty()) {
                    Iterator<ClickReportInfo> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().clickType, "negative_click")) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<ClickReportInfo> it3 = list.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(it3.next().clickType, this.type)) {
                return true;
            }
        }
        return false;
    }

    public DetectBehavior(String str, String str2, Integer num) {
        this.mode = str;
        this.type = str2;
        this.value = num;
    }
}
