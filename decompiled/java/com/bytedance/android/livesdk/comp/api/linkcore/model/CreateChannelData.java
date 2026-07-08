package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C1AZU;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class CreateChannelData {
    public static final Companion Companion = new Companion();
    public final BizCreateChannelParams bizCreateChannelParams;
    public final String layoutId;
    public final C1AZU linkArchType;
    public final Long liveRoomMode;
    public final int maxPosition;

    public static final class Builder {
        public BizCreateChannelParams bizCreateChannelParams;
        public String layoutId;
        public C1AZU linkArchType;
        public Long liveRoomMode;
        public int maxPosition;

        public final CreateChannelData build() {
            return new CreateChannelData(this);
        }

        public final BizCreateChannelParams getBizCreateChannelParams() {
            return this.bizCreateChannelParams;
        }

        public final String getLayoutId() {
            return this.layoutId;
        }

        public final C1AZU getLinkArchType() {
            return this.linkArchType;
        }

        public final Long getLiveRoomMode() {
            return this.liveRoomMode;
        }

        public final int getMaxPosition() {
            return this.maxPosition;
        }

        public final void setBizCreateChannelParams(BizCreateChannelParams bizCreateChannelParams) {
            this.bizCreateChannelParams = bizCreateChannelParams;
        }

        public final void setLayoutId(String str) {
            this.layoutId = str;
        }

        public final void setLinkArchType(C1AZU c1azu) {
            this.linkArchType = c1azu;
        }

        public final void setLiveRoomMode(Long l) {
            this.liveRoomMode = l;
        }

        public final void setMaxPosition(int i) {
            this.maxPosition = i;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateChannelData(maxPosition=");
        sbLIZ.append(this.maxPosition);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.layoutId);
        sbLIZ.append(", bizCreateChannelParams=");
        sbLIZ.append(this.bizCreateChannelParams);
        sbLIZ.append(", liveRoomMode=");
        sbLIZ.append(this.liveRoomMode);
        sbLIZ.append(", linkArchType=");
        sbLIZ.append(this.linkArchType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final CreateChannelData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public CreateChannelData(Builder builder) {
        this(builder.getMaxPosition(), builder.getLayoutId(), builder.getBizCreateChannelParams(), builder.getLiveRoomMode(), builder.getLinkArchType());
    }

    public CreateChannelData(int i, String str, BizCreateChannelParams bizCreateChannelParams, Long l, C1AZU c1azu) {
        this.maxPosition = i;
        this.layoutId = str;
        this.bizCreateChannelParams = bizCreateChannelParams;
        this.liveRoomMode = l;
        this.linkArchType = c1azu;
    }
}
