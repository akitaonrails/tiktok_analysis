package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C08FF;
import X.C1437350nVV;
import X.C2188811AlT;
import X.C2254308sP;
import X.C786410Ut5;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CompileProbeResult implements Parcelable, Serializable {
    public final ResultData data;
    public final ResultStatus status;
    public final int version;
    public static final C1437350nVV Companion = new Object() { // from class: X.0nVV
    };
    public static final Parcelable.Creator<CompileProbeResult> CREATOR = new Parcelable.Creator<CompileProbeResult>() { // from class: X.0nVP
        @Override // android.os.Parcelable.Creator
        public final CompileProbeResult createFromParcel(Parcel parcel) {
            CompileProbeResult.ResultData resultDataCreateFromParcel;
            CompileProbeResult.ResultStatus resultStatusCreateFromParcel = CompileProbeResult.ResultStatus.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                resultDataCreateFromParcel = null;
            } else {
                resultDataCreateFromParcel = CompileProbeResult.ResultData.CREATOR.createFromParcel(parcel);
            }
            return new CompileProbeResult(resultStatusCreateFromParcel, resultDataCreateFromParcel, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CompileProbeResult[] newArray(int i) {
            return new CompileProbeResult[i];
        }
    };

    public static final class ResultData implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResultData> CREATOR = new Parcelable.Creator<ResultData>() { // from class: X.0mfA
            @Override // android.os.Parcelable.Creator
            public final CompileProbeResult.ResultData createFromParcel(Parcel parcel) {
                return new CompileProbeResult.ResultData(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readFloat(), OptBitrateFromVE.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final CompileProbeResult.ResultData[] newArray(int i) {
                return new CompileProbeResult.ResultData[i];
            }
        };
        public final int crf;
        public final int durationMs;
        public final int encodeHeight;
        public final int encodeWidth;
        public final int encoderType;
        public final int gop;
        public final int maxBitrate;
        public final float optBitrate;
        public final OptBitrateFromVE optBitrateFromVE;
        public final int optimizeCrf;
        public final int preset;
        public final float psnr;
        public final double qpoffset;
        public final float videoBitrate;

        public final ResultData copy(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE) {
            return new ResultData(i, f, i2, i3, i4, i5, i6, f2, i7, i8, d, i9, f3, optBitrateFromVE);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultData)) {
                return false;
            }
            ResultData resultData = (ResultData) obj;
            return this.optimizeCrf == resultData.optimizeCrf && Float.compare(this.videoBitrate, resultData.videoBitrate) == 0 && this.encoderType == resultData.encoderType && this.preset == resultData.preset && this.maxBitrate == resultData.maxBitrate && this.encodeWidth == resultData.encodeWidth && this.encodeHeight == resultData.encodeHeight && Float.compare(this.psnr, resultData.psnr) == 0 && this.crf == resultData.crf && this.gop == resultData.gop && Double.compare(this.qpoffset, resultData.qpoffset) == 0 && this.durationMs == resultData.durationMs && Float.compare(this.optBitrate, resultData.optBitrate) == 0 && Intrinsics.LJFF(this.optBitrateFromVE, resultData.optBitrateFromVE);
        }

        public String toString() {
            return "ResultData(optimizeCrf=" + this.optimizeCrf + ", videoBitrate=" + this.videoBitrate + ", encoderType=" + this.encoderType + ", preset=" + this.preset + ", maxBitrate=" + this.maxBitrate + ", encodeWidth=" + this.encodeWidth + ", encodeHeight=" + this.encodeHeight + ", psnr=" + this.psnr + ", crf=" + this.crf + ", gop=" + this.gop + ", qpoffset=" + this.qpoffset + ", durationMs=" + this.durationMs + ", optBitrate=" + this.optBitrate + ", optBitrateFromVE=" + this.optBitrateFromVE + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.optimizeCrf);
            parcel.writeFloat(this.videoBitrate);
            parcel.writeInt(this.encoderType);
            parcel.writeInt(this.preset);
            parcel.writeInt(this.maxBitrate);
            parcel.writeInt(this.encodeWidth);
            parcel.writeInt(this.encodeHeight);
            parcel.writeFloat(this.psnr);
            parcel.writeInt(this.crf);
            parcel.writeInt(this.gop);
            parcel.writeDouble(this.qpoffset);
            parcel.writeInt(this.durationMs);
            parcel.writeFloat(this.optBitrate);
            this.optBitrateFromVE.writeToParcel(parcel, i);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.optimizeCrf * 31) + Float.floatToIntBits(this.videoBitrate)) * 31) + this.encoderType) * 31) + this.preset) * 31) + this.maxBitrate) * 31) + this.encodeWidth) * 31) + this.encodeHeight) * 31) + Float.floatToIntBits(this.psnr)) * 31) + this.crf) * 31) + this.gop) * 31) + C786410Ut5.X2(this.qpoffset)) * 31) + this.durationMs) * 31) + Float.floatToIntBits(this.optBitrate)) * 31) + this.optBitrateFromVE.hashCode();
        }

        public final int getCrf() {
            return this.crf;
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final int getEncodeHeight() {
            return this.encodeHeight;
        }

        public final int getEncodeWidth() {
            return this.encodeWidth;
        }

        public final int getEncoderType() {
            return this.encoderType;
        }

        public final int getGop() {
            return this.gop;
        }

        public final int getMaxBitrate() {
            return this.maxBitrate;
        }

        public final float getOptBitrate() {
            return this.optBitrate;
        }

        public final OptBitrateFromVE getOptBitrateFromVE() {
            return this.optBitrateFromVE;
        }

        public final int getOptimizeCrf() {
            return this.optimizeCrf;
        }

        public final int getPreset() {
            return this.preset;
        }

        public final float getPsnr() {
            return this.psnr;
        }

        public final double getQpoffset() {
            return this.qpoffset;
        }

        public final float getVideoBitrate() {
            return this.videoBitrate;
        }

        public ResultData(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE) {
            this.optimizeCrf = i;
            this.videoBitrate = f;
            this.encoderType = i2;
            this.preset = i3;
            this.maxBitrate = i4;
            this.encodeWidth = i5;
            this.encodeHeight = i6;
            this.psnr = f2;
            this.crf = i7;
            this.gop = i8;
            this.qpoffset = d;
            this.durationMs = i9;
            this.optBitrate = f3;
            this.optBitrateFromVE = optBitrateFromVE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State implements Parcelable, Serializable {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ State[] $VALUES;
        public static final State CANCEL;
        public static final Parcelable.Creator<State> CREATOR;
        public static final State ERROR;
        public static final State SUCCESS;

        public static InterfaceC2044707zh<State> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }

        static {
            State state = new State("SUCCESS", 0);
            SUCCESS = state;
            State state2 = new State("ERROR", 1);
            ERROR = state2;
            State state3 = new State("CANCEL", 2);
            CANCEL = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new C2254308sP(stateArr);
            CREATOR = new Parcelable.Creator<State>() { // from class: X.0nk0
                @Override // android.os.Parcelable.Creator
                public final CompileProbeResult.State createFromParcel(Parcel parcel) {
                    return CompileProbeResult.State.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CompileProbeResult.State[] newArray(int i) {
                    return new CompileProbeResult.State[i];
                }
            };
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }

        public State(String str, int i) {
        }
    }

    public final CompileProbeResult copy(ResultStatus resultStatus, ResultData resultData, int i) {
        return new CompileProbeResult(resultStatus, resultData, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileProbeResult)) {
            return false;
        }
        CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
        return Intrinsics.LJFF(this.status, compileProbeResult.status) && Intrinsics.LJFF(this.data, compileProbeResult.data) && this.version == compileProbeResult.version;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        ResultData resultData = this.data;
        return ((iHashCode + (resultData == null ? 0 : resultData.hashCode())) * 31) + this.version;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompileProbeResult(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        ResultData resultData = this.data;
        if (resultData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resultData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.version);
    }

    public final boolean isHw() {
        return this.version == 2;
    }

    public final boolean isSw() {
        return this.version == 1;
    }

    public static final class ResultStatus implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResultStatus> CREATOR = new Parcelable.Creator<ResultStatus>() { // from class: X.0nVQ
            @Override // android.os.Parcelable.Creator
            public final CompileProbeResult.ResultStatus createFromParcel(Parcel parcel) {
                return new CompileProbeResult.ResultStatus(CompileProbeResult.State.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CompileProbeResult.ResultStatus[] newArray(int i) {
                return new CompileProbeResult.ResultStatus[i];
            }
        };
        public final String msg;
        public final State state;
        public final int toolsCode;
        public final int veCode;

        public final ResultStatus copy(State state, int i, int i2, String str) {
            return new ResultStatus(state, i, i2, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultStatus)) {
                return false;
            }
            ResultStatus resultStatus = (ResultStatus) obj;
            return this.state == resultStatus.state && this.veCode == resultStatus.veCode && this.toolsCode == resultStatus.toolsCode && Intrinsics.LJFF(this.msg, resultStatus.msg);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.veCode) * 31) + this.toolsCode) * 31) + this.msg.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ResultStatus(state=");
            sbLIZ.append(this.state);
            sbLIZ.append(", veCode=");
            sbLIZ.append(this.veCode);
            sbLIZ.append(", toolsCode=");
            sbLIZ.append(this.toolsCode);
            sbLIZ.append(", msg=");
            sbLIZ.append(this.msg);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.state.writeToParcel(parcel, i);
            parcel.writeInt(this.veCode);
            parcel.writeInt(this.toolsCode);
            parcel.writeString(this.msg);
        }

        public final String getMsg() {
            return this.msg;
        }

        public final State getState() {
            return this.state;
        }

        public final int getToolsCode() {
            return this.toolsCode;
        }

        public final int getVeCode() {
            return this.veCode;
        }

        public ResultStatus(State state, int i, int i2, String str) {
            this.state = state;
            this.veCode = i;
            this.toolsCode = i2;
            this.msg = str;
        }
    }

    public final ResultData getData() {
        return this.data;
    }

    public final ResultStatus getStatus() {
        return this.status;
    }

    public final int getVersion() {
        return this.version;
    }

    public CompileProbeResult(ResultStatus resultStatus, ResultData resultData, int i) {
        this.status = resultStatus;
        this.data = resultData;
        this.version = i;
    }
}
