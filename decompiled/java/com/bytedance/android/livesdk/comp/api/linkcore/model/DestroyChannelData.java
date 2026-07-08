package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C1AZU;
import X.C2188811AlT;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class DestroyChannelData {
    public static final Companion Companion = new Companion();
    public final Map<String, String> customData;
    public final long finishReason;
    public final C1AZU linkArchType;

    public static final class Builder {
        public Map<String, String> customData;
        public long finishReason;
        public C1AZU linkArchType = C1AZU.Inner;

        public static /* synthetic */ void getFinishReason$annotations() {
        }

        public final DestroyChannelData build() {
            return new DestroyChannelData(this);
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final long getFinishReason() {
            return this.finishReason;
        }

        public final C1AZU getLinkArchType() {
            return this.linkArchType;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setFinishReason(long j) {
            this.finishReason = j;
        }

        public final void setLinkArchType(C1AZU c1azu) {
            this.linkArchType = c1azu;
        }
    }

    public DestroyChannelData() {
        this(0L, null, C1AZU.Inner);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DestroyChannelData(finishReason=");
        sbLIZ.append(this.finishReason);
        sbLIZ.append(", customData=");
        sbLIZ.append(this.customData);
        sbLIZ.append(", linkArchType=");
        sbLIZ.append(this.linkArchType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final DestroyChannelData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public DestroyChannelData(Builder builder) {
        this(builder.getFinishReason(), builder.getCustomData(), C1AZU.Inner);
    }

    public DestroyChannelData(long j, Map<String, String> map, C1AZU c1azu) {
        this.finishReason = j;
        this.customData = map;
        this.linkArchType = c1azu;
    }
}
