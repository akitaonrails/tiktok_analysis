package com.ss.android.ugc.aweme.feed.model.ad;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public final class Notify implements Serializable {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("display_duration")
    public final Long displayDuration;

    @C09CT("in_app_text")
    public final String inAppText;

    @C09CT("system_text")
    public final String systemText;

    @C09CT("type")
    public final Integer type;

    public Notify() {
        this(null, null, null, null, null);
    }

    public final String getSafeText(String str, String str2) {
        Object c098200Yq;
        if (str == null) {
            return "";
        }
        try {
            c098200Yq = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{str2}, 1));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public Notify(Integer num, String str, String str2, Long l, String str3) {
        this.type = num;
        this.inAppText = str;
        this.systemText = str2;
        this.displayDuration = l;
        this.buttonText = str3;
    }
}
