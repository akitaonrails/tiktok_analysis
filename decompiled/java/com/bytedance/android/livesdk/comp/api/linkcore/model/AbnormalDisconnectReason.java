package com.bytedance.android.livesdk.comp.api.linkcore.model;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public final class AbnormalDisconnectReason {
    public static final Companion Companion = new Companion();
    public final Map<String, Object> custom;
    public final String disconnectFromLinkMicId;
    public final long disconnectFromUid;
    public final String disconnectSource;
    public final int dissconnectReason;

    public static final class Builder {
        public Map<String, ? extends Object> custom;
        public String disconnectFromLinkMicId;
        public long disconnectFromUid;
        public String disconnectSource = "";
        public int dissconnectReason;

        public final AbnormalDisconnectReason build() {
            return new AbnormalDisconnectReason(this);
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final String getDisconnectFromLinkMicId() {
            return this.disconnectFromLinkMicId;
        }

        public final long getDisconnectFromUid() {
            return this.disconnectFromUid;
        }

        public final String getDisconnectSource() {
            return this.disconnectSource;
        }

        public final int getDissconnectReason() {
            return this.dissconnectReason;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setDisconnectFromLinkMicId(String str) {
            this.disconnectFromLinkMicId = str;
        }

        public final void setDisconnectFromUid(long j) {
            this.disconnectFromUid = j;
        }

        public final void setDisconnectSource(String str) {
            this.disconnectSource = str;
        }

        public final void setDissconnectReason(int i) {
            this.dissconnectReason = i;
        }
    }

    public AbnormalDisconnectReason() {
        this(0L, null, "", 0, null);
    }

    public static final class Companion {
        public final AbnormalDisconnectReason build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public AbnormalDisconnectReason(Builder builder) {
        this(builder.getDisconnectFromUid(), builder.getCustom(), builder.getDisconnectSource(), builder.getDissconnectReason(), builder.getDisconnectFromLinkMicId());
    }

    public AbnormalDisconnectReason(long j, Map<String, ? extends Object> map, String str, int i, String str2) {
        this.disconnectFromUid = j;
        this.custom = map;
        this.disconnectSource = str;
        this.dissconnectReason = i;
        this.disconnectFromLinkMicId = str2;
    }
}
