package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class OnLineMicInfo {
    public static final Companion Companion = new Companion();
    public final MicPositionInfo micPositionData;
    public final int onLinePattern;

    public static final class Builder {
        public MicPositionInfo micPositionData;
        public int onLinePattern = 1;

        public final OnLineMicInfo build() {
            return new OnLineMicInfo(this);
        }

        public final MicPositionInfo getMicPositionData() {
            return this.micPositionData;
        }

        public final int getOnLinePattern() {
            return this.onLinePattern;
        }

        public final void setMicPositionData(MicPositionInfo micPositionInfo) {
            this.micPositionData = micPositionInfo;
        }

        public final void setOnLinePattern(int i) {
            this.onLinePattern = i;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnLineMicInfo(onLinePattern=");
        sbLIZ.append(this.onLinePattern);
        sbLIZ.append(", micPositionData=");
        sbLIZ.append(this.micPositionData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final OnLineMicInfo build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public OnLineMicInfo(Builder builder) {
        this(builder.getOnLinePattern(), builder.getMicPositionData());
    }

    public OnLineMicInfo(int i, MicPositionInfo micPositionInfo) {
        this.onLinePattern = i;
        this.micPositionData = micPositionInfo;
    }
}
