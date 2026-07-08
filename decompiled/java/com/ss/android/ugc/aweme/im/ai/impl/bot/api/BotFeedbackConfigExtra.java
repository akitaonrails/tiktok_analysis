package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BotFeedbackConfigExtra implements Serializable {

    @C09CT("fatal_item_ids")
    public final List<String> fatalItemIds;

    @C09CT("logid")
    public final String logid;

    @C09CT("now")
    public final Long now;

    public BotFeedbackConfigExtra() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotFeedbackConfigExtra)) {
            return false;
        }
        BotFeedbackConfigExtra botFeedbackConfigExtra = (BotFeedbackConfigExtra) obj;
        return Intrinsics.LJFF(this.fatalItemIds, botFeedbackConfigExtra.fatalItemIds) && Intrinsics.LJFF(this.logid, botFeedbackConfigExtra.logid) && Intrinsics.LJFF(this.now, botFeedbackConfigExtra.now);
    }

    public int hashCode() {
        List<String> list = this.fatalItemIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.logid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.now;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotFeedbackConfigExtra(fatalItemIds=");
        sbLIZ.append(this.fatalItemIds);
        sbLIZ.append(", logid=");
        sbLIZ.append(this.logid);
        sbLIZ.append(", now=");
        sbLIZ.append(this.now);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BotFeedbackConfigExtra(List<String> list, String str, Long l) {
        this.fatalItemIds = list;
        this.logid = str;
        this.now = l;
    }
}
