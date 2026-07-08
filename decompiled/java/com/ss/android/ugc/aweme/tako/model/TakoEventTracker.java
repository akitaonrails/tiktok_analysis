package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoEventTracker implements Serializable {
    public static final int $stable = 0;

    @C09CT("card_type")
    public final Integer cardType;

    @C09CT("id_list")
    public final String idList;

    @C09CT("is_quote_video")
    public final int isQuoteVideo;

    @C09CT("log_id")
    public final String logId;

    @C09CT("message_id")
    public final String messageId;

    @C09CT("message_type")
    public final String messageType;

    public TakoEventTracker() {
        this("", "", 0, "", null, 0);
    }

    public final TakoEventTracker copy(String str, String str2, Integer num, String str3, String str4, int i) {
        return new TakoEventTracker(str, str2, num, str3, str4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoEventTracker)) {
            return false;
        }
        TakoEventTracker takoEventTracker = (TakoEventTracker) obj;
        return Intrinsics.LJFF(this.logId, takoEventTracker.logId) && Intrinsics.LJFF(this.messageType, takoEventTracker.messageType) && Intrinsics.LJFF(this.cardType, takoEventTracker.cardType) && Intrinsics.LJFF(this.messageId, takoEventTracker.messageId) && Intrinsics.LJFF(this.idList, takoEventTracker.idList) && this.isQuoteVideo == takoEventTracker.isQuoteVideo;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoEventTracker(logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.messageType);
        sbLIZ.append(", cardType=");
        sbLIZ.append(this.cardType);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.messageId);
        sbLIZ.append(", idList=");
        sbLIZ.append(this.idList);
        sbLIZ.append(", isQuoteVideo=");
        sbLIZ.append(this.isQuoteVideo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int isQuoteVideo() {
        return this.isQuoteVideo;
    }

    public TakoEventTracker(String str, String str2, Integer num, String str3, String str4, int i) {
        this.logId = str;
        this.messageType = str2;
        this.cardType = num;
        this.messageId = str3;
        this.idList = str4;
        this.isQuoteVideo = i;
    }
}
