package com.bytedance.android.livesdk.comp.api.linkcore.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkUser {
    public static final Companion Companion = new Companion();
    public String appVersion;
    public boolean audioMutedByChannel;
    public boolean audioOccupied;
    public boolean audioSwitchOn;
    public long avatarID;
    public Long channelId;
    public Long channelOwnerJoinTime;
    public Long channelOwnerLinkedTime;
    public Object extra;
    public Long groupChannelId;
    public String groupLinkMicId;
    public String linkMicId;
    public int linkUserType;
    public Long linkedTimeNano;
    public int onLineUserState;
    public Long operatorUid;
    public Long ownerChannelId;
    public Long ownerRoomId;
    public Long ownerUid;
    public OnLineMicInfo position;
    public Long roomId;
    public Long userId;
    public boolean videoSwitchOn;

    public static final class Builder {
        public String appVersion;
        public boolean audioOccupied;
        public boolean audioSwitchOn = true;
        public long avatarID;
        public Long channelId;
        public Long channelOwnerJoinTime;
        public Long channelOwnerLinkedTime;
        public Object extra;
        public String linkMicId;
        public int linkUserType;
        public Long linkedTimeNano;
        public OnLineMicInfo micPositionData;
        public Long operatorUid;
        public Long ownerChannelId;
        public Long ownerRoomId;
        public Long ownerUid;
        public Long roomId;
        public Long userId;
        public boolean videoSwitchOn;

        public static /* synthetic */ void getLinkUserType$annotations() {
        }

        public final LinkUser build() {
            return new LinkUser(this);
        }

        public final String getAppVersion() {
            return this.appVersion;
        }

        public final boolean getAudioOccupied() {
            return this.audioOccupied;
        }

        public final boolean getAudioSwitchOn() {
            return this.audioSwitchOn;
        }

        public final long getAvatarID() {
            return this.avatarID;
        }

        public final Long getChannelId() {
            return this.channelId;
        }

        public final Long getChannelOwnerJoinTime() {
            return this.channelOwnerJoinTime;
        }

        public final Long getChannelOwnerLinkedTime() {
            return this.channelOwnerLinkedTime;
        }

        public final Object getExtra() {
            return this.extra;
        }

        public final String getLinkMicId() {
            return this.linkMicId;
        }

        public final int getLinkUserType() {
            return this.linkUserType;
        }

        public final Long getLinkedTimeNano() {
            return this.linkedTimeNano;
        }

        public final OnLineMicInfo getMicPositionData() {
            return this.micPositionData;
        }

        public final Long getOperatorUid() {
            return this.operatorUid;
        }

        public final Long getOwnerChannelId() {
            return this.ownerChannelId;
        }

        public final Long getOwnerRoomId() {
            return this.ownerRoomId;
        }

        public final Long getOwnerUid() {
            return this.ownerUid;
        }

        public final Long getRoomId() {
            return this.roomId;
        }

        public final Long getUserId() {
            return this.userId;
        }

        public final boolean getVideoSwitchOn() {
            return this.videoSwitchOn;
        }

        public final void setAppVersion(String str) {
            this.appVersion = str;
        }

        public final void setAudioOccupied(boolean z) {
            this.audioOccupied = z;
        }

        public final void setAudioSwitchOn(boolean z) {
            this.audioSwitchOn = z;
        }

        public final void setAvatarID(long j) {
            this.avatarID = j;
        }

        public final void setChannelId(Long l) {
            this.channelId = l;
        }

        public final void setChannelOwnerJoinTime(Long l) {
            this.channelOwnerJoinTime = l;
        }

        public final void setChannelOwnerLinkedTime(Long l) {
            this.channelOwnerLinkedTime = l;
        }

        public final void setExtra(Object obj) {
            this.extra = obj;
        }

        public final void setLinkMicId(String str) {
            this.linkMicId = str;
        }

        public final void setLinkUserType(int i) {
            this.linkUserType = i;
        }

        public final void setLinkedTimeNano(Long l) {
            this.linkedTimeNano = l;
        }

        public final void setMicPositionData(OnLineMicInfo onLineMicInfo) {
            this.micPositionData = onLineMicInfo;
        }

        public final void setOperatorUid(Long l) {
            this.operatorUid = l;
        }

        public final void setOwnerChannelId(Long l) {
            this.ownerChannelId = l;
        }

        public final void setOwnerRoomId(Long l) {
            this.ownerRoomId = l;
        }

        public final void setOwnerUid(Long l) {
            this.ownerUid = l;
        }

        public final void setRoomId(Long l) {
            this.roomId = l;
        }

        public final void setUserId(Long l) {
            this.userId = l;
        }

        public final void setVideoSwitchOn(boolean z) {
            this.videoSwitchOn = z;
        }
    }

    public final LinkUser copy(Long l, Long l2, Long l3, String str, OnLineMicInfo onLineMicInfo, Object obj, boolean z, boolean z2, boolean z3, boolean z4, String str2, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, long j, Long l10, int i, int i2, Long l11, String str3) {
        return new LinkUser(l, l2, l3, str, onLineMicInfo, obj, z, z2, z3, z4, str2, l4, l5, l6, l7, l8, l9, j, l10, i, i2, l11, str3);
    }

    public String toString() {
        return "LinkUser(roomId=" + this.roomId + ", userId=" + this.userId + ", channelId=" + this.channelId + ", linkMicId=" + this.linkMicId + ", position=" + this.position + ", extra=" + this.extra + ", audioMutedByChannel=" + this.audioMutedByChannel + ", audioSwitchOn=" + this.audioSwitchOn + ", videoSwitchOn=" + this.videoSwitchOn + ", audioOccupied=" + this.audioOccupied + ", appVersion=" + this.appVersion + ", channelOwnerJoinTime=" + this.channelOwnerJoinTime + ", channelOwnerLinkedTime=" + this.channelOwnerLinkedTime + ", ownerUid=" + this.ownerUid + ", ownerRoomId=" + this.ownerRoomId + ", ownerChannelId=" + this.ownerChannelId + ", linkedTimeNano=" + this.linkedTimeNano + ", avatarID=" + this.avatarID + ", operatorUid=" + this.operatorUid + ", linkUserType=" + this.linkUserType + ", onLineUserState=" + this.onLineUserState + ", groupChannelId=" + this.groupChannelId + ", groupLinkMicId=" + this.groupLinkMicId + ')';
    }

    public final boolean audioOn() {
        return !this.audioMutedByChannel && this.audioSwitchOn;
    }

    public final String getActualLinkMicId() {
        String str = this.linkMicId;
        return str != null ? str : String.valueOf(this.userId.longValue());
    }

    public static final class Companion {
        public final LinkUser build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public LinkUser(Builder builder) {
        this(builder.getRoomId(), builder.getUserId(), builder.getChannelId(), builder.getLinkMicId(), builder.getMicPositionData(), builder.getExtra(), false, builder.getAudioSwitchOn(), builder.getVideoSwitchOn(), builder.getAudioOccupied(), builder.getAppVersion(), builder.getChannelOwnerJoinTime(), builder.getChannelOwnerLinkedTime(), builder.getOwnerUid(), builder.getOwnerRoomId(), builder.getOwnerChannelId(), builder.getLinkedTimeNano(), builder.getAvatarID(), builder.getOperatorUid(), builder.getLinkUserType(), 0, null, null);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(LinkUser.class, cls)) {
            return false;
        }
        LinkUser linkUser = (LinkUser) obj;
        if (Intrinsics.LJFF(this.roomId, linkUser.roomId) && Intrinsics.LJFF(this.userId, linkUser.userId) && Intrinsics.LJFF(this.channelId, linkUser.channelId) && Intrinsics.LJFF(this.linkMicId, linkUser.linkMicId) && Intrinsics.LJFF(this.position, linkUser.position) && Intrinsics.LJFF(this.extra, linkUser.extra) && Intrinsics.LJFF(this.appVersion, linkUser.appVersion) && Intrinsics.LJFF(this.channelOwnerJoinTime, linkUser.channelOwnerJoinTime) && Intrinsics.LJFF(this.channelOwnerLinkedTime, linkUser.channelOwnerLinkedTime) && Intrinsics.LJFF(this.ownerUid, linkUser.ownerUid) && Intrinsics.LJFF(this.ownerRoomId, linkUser.ownerRoomId) && Intrinsics.LJFF(this.ownerChannelId, linkUser.ownerChannelId) && Intrinsics.LJFF(this.linkedTimeNano, linkUser.linkedTimeNano) && this.avatarID == linkUser.avatarID && Intrinsics.LJFF(this.operatorUid, linkUser.operatorUid)) {
            return true;
        }
        return false;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAudioMutedByChannel(boolean z) {
        this.audioMutedByChannel = z;
    }

    public final void setAudioOccupied(boolean z) {
        this.audioOccupied = z;
    }

    public final void setAudioSwitchOn(boolean z) {
        this.audioSwitchOn = z;
    }

    public final void setAvatarID(long j) {
        this.avatarID = j;
    }

    public final void setChannelId(Long l) {
        this.channelId = l;
    }

    public final void setChannelOwnerJoinTime(Long l) {
        this.channelOwnerJoinTime = l;
    }

    public final void setChannelOwnerLinkedTime(Long l) {
        this.channelOwnerLinkedTime = l;
    }

    public final void setExtra(Object obj) {
        this.extra = obj;
    }

    public final void setGroupChannelId(Long l) {
        this.groupChannelId = l;
    }

    public final void setGroupLinkMicId(String str) {
        this.groupLinkMicId = str;
    }

    public final void setLinkMicId(String str) {
        this.linkMicId = str;
    }

    public final void setLinkUserType(int i) {
        this.linkUserType = i;
    }

    public final void setLinkedTimeNano(Long l) {
        this.linkedTimeNano = l;
    }

    public final void setOnLineUserState(int i) {
        this.onLineUserState = i;
    }

    public final void setOperatorUid(Long l) {
        this.operatorUid = l;
    }

    public final void setOwnerChannelId(Long l) {
        this.ownerChannelId = l;
    }

    public final void setOwnerRoomId(Long l) {
        this.ownerRoomId = l;
    }

    public final void setOwnerUid(Long l) {
        this.ownerUid = l;
    }

    public final void setPosition(OnLineMicInfo onLineMicInfo) {
        this.position = onLineMicInfo;
    }

    public final void setRoomId(Long l) {
        this.roomId = l;
    }

    public final void setUserId(Long l) {
        this.userId = l;
    }

    public final void setVideoSwitchOn(boolean z) {
        this.videoSwitchOn = z;
    }

    public LinkUser(Long l, Long l2, Long l3, String str, OnLineMicInfo onLineMicInfo, Object obj, boolean z, boolean z2, boolean z3, boolean z4, String str2, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, long j, Long l10, int i, int i2, Long l11, String str3) {
        this.roomId = l;
        this.userId = l2;
        this.channelId = l3;
        this.linkMicId = str;
        this.position = onLineMicInfo;
        this.extra = obj;
        this.audioMutedByChannel = z;
        this.audioSwitchOn = z2;
        this.videoSwitchOn = z3;
        this.audioOccupied = z4;
        this.appVersion = str2;
        this.channelOwnerJoinTime = l4;
        this.channelOwnerLinkedTime = l5;
        this.ownerUid = l6;
        this.ownerRoomId = l7;
        this.ownerChannelId = l8;
        this.linkedTimeNano = l9;
        this.avatarID = j;
        this.operatorUid = l10;
        this.linkUserType = i;
        this.onLineUserState = i2;
        this.groupChannelId = l11;
        this.groupLinkMicId = str3;
    }
}
