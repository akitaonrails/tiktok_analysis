package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C1663906fN;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomTitleBarLabelConf extends IBusinessConfig {
    public static final C1663906fN Companion = new Object() { // from class: X.06fN
    };

    @C09CT("title")
    public final String label;

    public ChatRoomTitleBarLabelConf() {
        this(null);
    }

    public final ChatRoomTitleBarLabelConf copy(String str) {
        return new ChatRoomTitleBarLabelConf(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatRoomTitleBarLabelConf) && Intrinsics.LJFF(this.label, ((ChatRoomTitleBarLabelConf) obj).label);
    }

    public int hashCode() {
        String str = this.label;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatRoomTitleBarLabelConf(label=");
        sbLIZ.append(this.label);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getLabel() {
        return this.label;
    }

    public ChatRoomTitleBarLabelConf(String str) {
        this.label = str;
    }
}
