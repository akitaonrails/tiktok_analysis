package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import X.EnumC2235671Cer;
import X.EnumC949920apK;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class ApplyData {
    public static final Companion Companion = new Companion();
    public final EnumC949920apK applyIntent;
    public final BizApplyParams bizApplyParams;
    public final long channelId;
    public final Map<String, Object> custom;
    public final long expireTimeInSeconds;
    public final OnLineMicInfo onLineMicInfo;
    public final EnumC2235671Cer replyStatus;
    public final LiveRoomUser targetUser;
    public final boolean useApplyDirectUpAbility;

    public static final class Builder {
        public BizApplyParams bizApplyParams;
        public Map<String, ? extends Object> custom;
        public long expireTimeInSeconds;
        public OnLineMicInfo onLineMicInfo;
        public LiveRoomUser targetUser;
        public boolean useApplyDirectUpAbility;
        public long channelId = -1;
        public EnumC949920apK applyIntent = EnumC949920apK.NormalApply;
        public EnumC2235671Cer replyStatus = EnumC2235671Cer.Agree;

        public final ApplyData build() {
            return new ApplyData(this);
        }

        public final EnumC949920apK getApplyIntent() {
            return this.applyIntent;
        }

        public final BizApplyParams getBizApplyParams() {
            return this.bizApplyParams;
        }

        public final long getChannelId() {
            return this.channelId;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final long getExpireTimeInSeconds() {
            return this.expireTimeInSeconds;
        }

        public final OnLineMicInfo getOnLineMicInfo() {
            return this.onLineMicInfo;
        }

        public final EnumC2235671Cer getReplyStatus() {
            return this.replyStatus;
        }

        public final LiveRoomUser getTargetUser() {
            return this.targetUser;
        }

        public final boolean getUseApplyDirectUpAbility() {
            return this.useApplyDirectUpAbility;
        }

        public final void setApplyIntent(EnumC949920apK enumC949920apK) {
            this.applyIntent = enumC949920apK;
        }

        public final void setBizApplyParams(BizApplyParams bizApplyParams) {
            this.bizApplyParams = bizApplyParams;
        }

        public final void setChannelId(long j) {
            this.channelId = j;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setExpireTimeInSeconds(long j) {
            this.expireTimeInSeconds = j;
        }

        public final void setOnLineMicInfo(OnLineMicInfo onLineMicInfo) {
            this.onLineMicInfo = onLineMicInfo;
        }

        public final void setReplyStatus(EnumC2235671Cer enumC2235671Cer) {
            this.replyStatus = enumC2235671Cer;
        }

        public final void setTargetUser(LiveRoomUser liveRoomUser) {
            this.targetUser = liveRoomUser;
        }

        public final void setUseApplyDirectUpAbility(boolean z) {
            this.useApplyDirectUpAbility = z;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyData(channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", onLineMicInfo=");
        sbLIZ.append(this.onLineMicInfo);
        sbLIZ.append(", bizApplyParams=");
        sbLIZ.append(this.bizApplyParams);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.custom);
        sbLIZ.append(", expireTimeInSeconds=");
        sbLIZ.append(this.expireTimeInSeconds);
        sbLIZ.append(", targetUser=");
        sbLIZ.append(this.targetUser);
        sbLIZ.append(", applyIntent=");
        sbLIZ.append(this.applyIntent);
        sbLIZ.append(", replyStatus=");
        sbLIZ.append(this.replyStatus);
        sbLIZ.append(", useApplyDirectUpAbility=");
        sbLIZ.append(this.useApplyDirectUpAbility);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final ApplyData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public ApplyData(Builder builder) {
        this(builder.getChannelId(), builder.getOnLineMicInfo(), builder.getBizApplyParams(), builder.getCustom(), builder.getExpireTimeInSeconds(), builder.getTargetUser(), builder.getApplyIntent(), builder.getReplyStatus(), builder.getUseApplyDirectUpAbility());
    }

    public ApplyData(long j, OnLineMicInfo onLineMicInfo, BizApplyParams bizApplyParams, Map<String, ? extends Object> map, long j2, LiveRoomUser liveRoomUser, EnumC949920apK enumC949920apK, EnumC2235671Cer enumC2235671Cer, boolean z) {
        this.channelId = j;
        this.onLineMicInfo = onLineMicInfo;
        this.bizApplyParams = bizApplyParams;
        this.custom = map;
        this.expireTimeInSeconds = j2;
        this.targetUser = liveRoomUser;
        this.applyIntent = enumC949920apK;
        this.replyStatus = enumC2235671Cer;
        this.useApplyDirectUpAbility = z;
    }
}
