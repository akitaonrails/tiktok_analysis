package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MixInfo {
    public static final Companion Companion = new Companion();
    public final LiveStreamMixer streamMixer;
    public final String streamUrl;

    public static final class Builder {
        public LiveStreamMixer streamMixer;
        public String streamUrl;

        public final MixInfo build() {
            return new MixInfo(this);
        }

        public final LiveStreamMixer getStreamMixer() {
            return this.streamMixer;
        }

        public final String getStreamUrl() {
            return this.streamUrl;
        }

        public final void setStreamMixer(LiveStreamMixer liveStreamMixer) {
            this.streamMixer = liveStreamMixer;
        }

        public final void setStreamUrl(String str) {
            this.streamUrl = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixInfo)) {
            return false;
        }
        MixInfo mixInfo = (MixInfo) obj;
        return Intrinsics.LJFF(this.streamUrl, mixInfo.streamUrl) && Intrinsics.LJFF(this.streamMixer, mixInfo.streamMixer);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixInfo(streamUrl=");
        sbLIZ.append(this.streamUrl);
        sbLIZ.append(", streamMixer=");
        sbLIZ.append(this.streamMixer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final MixInfo build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public MixInfo(Builder builder) {
        this(builder.getStreamUrl(), builder.getStreamMixer());
    }

    public MixInfo(String str, LiveStreamMixer liveStreamMixer) {
        this.streamUrl = str;
        this.streamMixer = liveStreamMixer;
    }
}
