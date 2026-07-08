package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C13BV;
import X.C918740a12;
import X.EnumC919140a1g;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import webcast.data.multilive_biz.BizInviteParams;

/* JADX INFO: loaded from: classes16.dex */
public final class InviteData {
    public static final Companion Companion = new Companion();
    public final BizInviteParams bizInviteParams;
    public final long channelId;
    public final Map<String, Object> custom;
    public final Map<String, String> customData;
    public final long expireTimeInSeconds;
    public final EnumC919140a1g inviteType;
    public final LiveRoomUser invitee;
    public List<C918740a12> inviteeList;
    public final LayoutDSLConfig layoutDSLConfig;
    public final int maxPosition;
    public final OnLineMicInfo onLineMicInfo;
    public final int source;

    public static final class Builder {
        public BizInviteParams bizInviteParams;
        public Map<String, ? extends Object> custom;
        public Map<String, String> customData;
        public long expireTimeInSeconds;
        public final LiveRoomUser invitee;
        public LayoutDSLConfig layoutDSLConfig;
        public int maxPosition;
        public OnLineMicInfo onLineMicInfo;
        public int source;
        public long channelId = -1;
        public EnumC919140a1g inviteType = EnumC919140a1g.LegacyInvitee;
        public List<C918740a12> inviteeList = C13BV.INSTANCE;

        public final InviteData build() {
            return new InviteData(this);
        }

        public final BizInviteParams getBizInviteParams() {
            return this.bizInviteParams;
        }

        public final long getChannelId() {
            return this.channelId;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final long getExpireTimeInSeconds() {
            return this.expireTimeInSeconds;
        }

        public final EnumC919140a1g getInviteType() {
            return this.inviteType;
        }

        public final LiveRoomUser getInvitee() {
            return this.invitee;
        }

        public final List<C918740a12> getInviteeList() {
            return this.inviteeList;
        }

        public final LayoutDSLConfig getLayoutDSLConfig() {
            return this.layoutDSLConfig;
        }

        public final int getMaxPosition() {
            return this.maxPosition;
        }

        public final OnLineMicInfo getOnLineMicInfo() {
            return this.onLineMicInfo;
        }

        public final int getSource() {
            return this.source;
        }

        public Builder(LiveRoomUser liveRoomUser) {
            this.invitee = liveRoomUser;
        }

        public final void setBizInviteParams(BizInviteParams bizInviteParams) {
            this.bizInviteParams = bizInviteParams;
        }

        public final void setChannelId(long j) {
            this.channelId = j;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setExpireTimeInSeconds(long j) {
            this.expireTimeInSeconds = j;
        }

        public final void setInviteType(EnumC919140a1g enumC919140a1g) {
            this.inviteType = enumC919140a1g;
        }

        public final void setInviteeList(List<C918740a12> list) {
            this.inviteeList = list;
        }

        public final void setLayoutDSLConfig(LayoutDSLConfig layoutDSLConfig) {
            this.layoutDSLConfig = layoutDSLConfig;
        }

        public final void setMaxPosition(int i) {
            this.maxPosition = i;
        }

        public final void setOnLineMicInfo(OnLineMicInfo onLineMicInfo) {
            this.onLineMicInfo = onLineMicInfo;
        }

        public final void setSource(int i) {
            this.source = i;
        }
    }

    public String toString() {
        return "InviteData(channelId=" + this.channelId + ", maxPosition=" + this.maxPosition + ", expireTimeInSeconds=" + this.expireTimeInSeconds + ", onLineMicInfo=" + this.onLineMicInfo + ", custom=" + this.custom + ", customData=" + this.customData + ", invitee=" + this.invitee + ", layoutDSLConfig=" + this.layoutDSLConfig + ", bizInviteParams=" + this.bizInviteParams + ", source=" + this.source + ", inviteType=" + this.inviteType + ", inviteeList=" + this.inviteeList + ')';
    }

    public InviteData(Builder builder) {
        this(builder.getChannelId(), builder.getMaxPosition(), builder.getExpireTimeInSeconds(), builder.getOnLineMicInfo(), builder.getCustom(), builder.getCustomData(), builder.getInvitee(), builder.getLayoutDSLConfig(), builder.getBizInviteParams(), builder.getSource(), builder.getInviteType(), builder.getInviteeList());
    }

    public final void setInviteeList(List<C918740a12> list) {
        this.inviteeList = list;
    }

    public static final class Companion {
        public final InviteData build(LiveRoomUser liveRoomUser, Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder(liveRoomUser);
            function1.invoke(builder);
            return builder.build();
        }
    }

    public InviteData(long j, int i, long j2, OnLineMicInfo onLineMicInfo, Map<String, ? extends Object> map, Map<String, String> map2, LiveRoomUser liveRoomUser, LayoutDSLConfig layoutDSLConfig, BizInviteParams bizInviteParams, int i2, EnumC919140a1g enumC919140a1g, List<C918740a12> list) {
        this.channelId = j;
        this.maxPosition = i;
        this.expireTimeInSeconds = j2;
        this.onLineMicInfo = onLineMicInfo;
        this.custom = map;
        this.customData = map2;
        this.invitee = liveRoomUser;
        this.layoutDSLConfig = layoutDSLConfig;
        this.bizInviteParams = bizInviteParams;
        this.source = i2;
        this.inviteType = enumC919140a1g;
        this.inviteeList = list;
    }

    public InviteData(long j, int i, long j2, OnLineMicInfo onLineMicInfo, Map map, Map map2, LiveRoomUser liveRoomUser, LayoutDSLConfig layoutDSLConfig, BizInviteParams bizInviteParams, int i2, EnumC919140a1g enumC919140a1g, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, j2, onLineMicInfo, map, map2, liveRoomUser, layoutDSLConfig, bizInviteParams, (i3 & 512) != 0 ? 0 : i2, (i3 & 1024) != 0 ? EnumC919140a1g.LegacyInvitee : enumC919140a1g, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list);
    }
}
