package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1SummaryCardAttr implements Serializable {

    @C09CT("display_info")
    public final SummaryDisplayInfo displayInfo;

    @C09CT("is_ai_refactor")
    public final Boolean isAiRefactor;

    @C09CT("is_mix_top1")
    public final Boolean isMixTop1;

    @C09CT("is_short_answer")
    public final Boolean isShortAnswer;

    @C09CT("is_stream")
    public final Boolean isStream;

    @C09CT("is_tako")
    public final Boolean isTako;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public Top1SummaryCardAttr() {
        this(null, null, null, null, null, null, Boolean.FALSE);
    }

    public final Top1SummaryCardAttr copy(SummaryDisplayInfo summaryDisplayInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5) {
        return new Top1SummaryCardAttr(summaryDisplayInfo, bool, bool2, bool3, bool4, num, bool5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Top1SummaryCardAttr)) {
            return false;
        }
        Top1SummaryCardAttr top1SummaryCardAttr = (Top1SummaryCardAttr) obj;
        return Intrinsics.LJFF(this.displayInfo, top1SummaryCardAttr.displayInfo) && Intrinsics.LJFF(this.isTako, top1SummaryCardAttr.isTako) && Intrinsics.LJFF(this.isMixTop1, top1SummaryCardAttr.isMixTop1) && Intrinsics.LJFF(this.isStream, top1SummaryCardAttr.isStream) && Intrinsics.LJFF(this.isAiRefactor, top1SummaryCardAttr.isAiRefactor) && Intrinsics.LJFF(this.status, top1SummaryCardAttr.status) && Intrinsics.LJFF(this.isShortAnswer, top1SummaryCardAttr.isShortAnswer);
    }

    public final Boolean isAiRefactor() {
        return this.isAiRefactor;
    }

    public final Boolean isMixTop1() {
        return this.isMixTop1;
    }

    public final Boolean isShortAnswer() {
        return this.isShortAnswer;
    }

    public final Boolean isStream() {
        return this.isStream;
    }

    public final Boolean isTako() {
        return this.isTako;
    }

    public Top1SummaryCardAttr(SummaryDisplayInfo summaryDisplayInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5) {
        this.displayInfo = summaryDisplayInfo;
        this.isTako = bool;
        this.isMixTop1 = bool2;
        this.isStream = bool3;
        this.isAiRefactor = bool4;
        this.status = num;
        this.isShortAnswer = bool5;
    }
}
