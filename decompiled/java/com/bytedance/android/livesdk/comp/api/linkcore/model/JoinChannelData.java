package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class JoinChannelData {
    public static final Companion Companion = new Companion();
    public final BizJoinChannelParams bizJoinChannelParams;

    public static final class Builder {
        public BizJoinChannelParams bizJoinChannelParams;

        public final JoinChannelData build() {
            return new JoinChannelData(this);
        }

        public final BizJoinChannelParams getBizJoinChannelParams() {
            return this.bizJoinChannelParams;
        }

        public final void setBizJoinChannelParams(BizJoinChannelParams bizJoinChannelParams) {
            this.bizJoinChannelParams = bizJoinChannelParams;
        }
    }

    public static final class Companion {
        public final JoinChannelData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public JoinChannelData(Builder builder) {
        this(builder.getBizJoinChannelParams());
    }

    public JoinChannelData(BizJoinChannelParams bizJoinChannelParams) {
        this.bizJoinChannelParams = bizJoinChannelParams;
    }
}
