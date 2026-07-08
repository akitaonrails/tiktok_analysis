package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C09CT;
import X.C0Q3K;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class IncentiveDetailInfo implements Serializable {
    public static final C0Q3K Companion = new Object() { // from class: X.0Q3K
    };

    @C09CT("current_day")
    public final Integer currentDay;

    @C09CT("duration_day")
    public final Integer durationDay;

    @C09CT("finish_day")
    public final Integer finishDay;

    @C09CT("finished_count")
    public final int finishedCount;

    @C09CT("has_agree")
    public final Integer hasAgree;

    @C09CT("reward_voucher")
    public final VoucherInfo rewardVoucher;

    @C09CT("suggest_word")
    public final String suggestWord;

    @C09CT("task_end_time")
    public final Long taskEndTime;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("task_start_time")
    public final Long taskStartTime;

    @C09CT("task_type")
    public final String taskType;

    @C09CT("total_count")
    public final int totalCount;

    @C09CT("total_day")
    public final Integer totalDay;

    public IncentiveDetailInfo() {
        this("-1", null, null, null, null, null, null, null, null, 0, 0, null, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveDetailInfo)) {
            return false;
        }
        IncentiveDetailInfo incentiveDetailInfo = (IncentiveDetailInfo) obj;
        return Intrinsics.LJFF(this.taskId, incentiveDetailInfo.taskId) && Intrinsics.LJFF(this.taskType, incentiveDetailInfo.taskType) && Intrinsics.LJFF(this.durationDay, incentiveDetailInfo.durationDay) && Intrinsics.LJFF(this.taskStartTime, incentiveDetailInfo.taskStartTime) && Intrinsics.LJFF(this.taskEndTime, incentiveDetailInfo.taskEndTime) && Intrinsics.LJFF(this.hasAgree, incentiveDetailInfo.hasAgree) && Intrinsics.LJFF(this.totalDay, incentiveDetailInfo.totalDay) && Intrinsics.LJFF(this.finishDay, incentiveDetailInfo.finishDay) && Intrinsics.LJFF(this.currentDay, incentiveDetailInfo.currentDay) && this.totalCount == incentiveDetailInfo.totalCount && this.finishedCount == incentiveDetailInfo.finishedCount && Intrinsics.LJFF(this.rewardVoucher, incentiveDetailInfo.rewardVoucher) && Intrinsics.LJFF(this.suggestWord, incentiveDetailInfo.suggestWord);
    }

    public int hashCode() {
        int iHashCode = this.taskId.hashCode() * 31;
        String str = this.taskType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.durationDay;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.taskStartTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.taskEndTime;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.hasAgree;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalDay;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.finishDay;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.currentDay;
        int iHashCode9 = (((((iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31) + this.totalCount) * 31) + this.finishedCount) * 31;
        VoucherInfo voucherInfo = this.rewardVoucher;
        int iHashCode10 = (iHashCode9 + (voucherInfo == null ? 0 : voucherInfo.hashCode())) * 31;
        String str2 = this.suggestWord;
        return iHashCode10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IncentiveDetailInfo(taskId=" + this.taskId + ", taskType=" + this.taskType + ", durationDay=" + this.durationDay + ", taskStartTime=" + this.taskStartTime + ", taskEndTime=" + this.taskEndTime + ", hasAgree=" + this.hasAgree + ", totalDay=" + this.totalDay + ", finishDay=" + this.finishDay + ", currentDay=" + this.currentDay + ", totalCount=" + this.totalCount + ", finishedCount=" + this.finishedCount + ", rewardVoucher=" + this.rewardVoucher + ", suggestWord=" + this.suggestWord + ')';
    }

    public IncentiveDetailInfo(String str, String str2, Integer num, Long l, Long l2, Integer num2, Integer num3, Integer num4, Integer num5, int i, int i2, VoucherInfo voucherInfo, String str3) {
        this.taskId = str;
        this.taskType = str2;
        this.durationDay = num;
        this.taskStartTime = l;
        this.taskEndTime = l2;
        this.hasAgree = num2;
        this.totalDay = num3;
        this.finishDay = num4;
        this.currentDay = num5;
        this.totalCount = i;
        this.finishedCount = i2;
        this.rewardVoucher = voucherInfo;
        this.suggestWord = str3;
    }
}
