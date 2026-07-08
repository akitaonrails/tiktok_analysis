package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class LeaveChannelData {
    public static final Companion Companion = new Companion();
    public final BizLeaveParams bizLeaveParams;
    public final Map<String, Object> custom;
    public final int leaveReason;
    public final String leaveSource;
    public final String leavedLinkMicId;
    public final long notSuggestToUid;

    public static final class Builder {
        public BizLeaveParams bizLeaveParams;
        public Map<String, ? extends Object> custom;
        public int leaveReason;
        public String leaveSource = "";
        public String leavedLinkMicId;
        public long notSuggestToUid;

        public final LeaveChannelData build() {
            return new LeaveChannelData(this);
        }

        public final BizLeaveParams getBizLeaveParams() {
            return this.bizLeaveParams;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final int getLeaveReason() {
            return this.leaveReason;
        }

        public final String getLeaveSource() {
            return this.leaveSource;
        }

        public final String getLeavedLinkMicId() {
            return this.leavedLinkMicId;
        }

        public final long getNotSuggestToUid() {
            return this.notSuggestToUid;
        }

        public final void setBizLeaveParams(BizLeaveParams bizLeaveParams) {
            this.bizLeaveParams = bizLeaveParams;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setLeaveReason(int i) {
            this.leaveReason = i;
        }

        public final void setLeaveSource(String str) {
            this.leaveSource = str;
        }

        public final void setLeavedLinkMicId(String str) {
            this.leavedLinkMicId = str;
        }

        public final void setNotSuggestToUid(long j) {
            this.notSuggestToUid = j;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LeaveChannelData(notSuggestToUid=");
        sbLIZ.append(this.notSuggestToUid);
        sbLIZ.append(", bizLeaveParams=");
        sbLIZ.append(this.bizLeaveParams);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.custom);
        sbLIZ.append(", leaveSource=");
        sbLIZ.append(this.leaveSource);
        sbLIZ.append(", leaveReason=");
        sbLIZ.append(this.leaveReason);
        sbLIZ.append(", leavedLinkMicId=");
        sbLIZ.append(this.leavedLinkMicId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final LeaveChannelData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public LeaveChannelData(Builder builder) {
        this(builder.getNotSuggestToUid(), builder.getBizLeaveParams(), builder.getCustom(), builder.getLeaveSource(), builder.getLeaveReason(), builder.getLeavedLinkMicId());
    }

    public LeaveChannelData(long j, BizLeaveParams bizLeaveParams, Map<String, ? extends Object> map, String str, int i, String str2) {
        this.notSuggestToUid = j;
        this.bizLeaveParams = bizLeaveParams;
        this.custom = map;
        this.leaveSource = str;
        this.leaveReason = i;
        this.leavedLinkMicId = str2;
    }
}
