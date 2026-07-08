package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09BH;
import X.C09CT;
import X.C0VSJ;
import X.C2188811AlT;
import X.C2354809Ko;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
public final class VQEvaluationConfig implements Parcelable {
    public static final Parcelable.Creator<VQEvaluationConfig> CREATOR = new Creator();

    @C09CT("base_config")
    public final BaseConfig baseConfig;

    @C09CT("compose_config")
    public final ComposeConfig composeConfig;

    @C09CT("screen_shot_config")
    public final ScreenShotConfig screenShotConfig;

    @C09CT("sticker_config")
    public final StickerConfig stickerConfig;

    public static final class BaseConfig implements Parcelable {
        public static final Parcelable.Creator<BaseConfig> CREATOR = new Creator();

        @C09CT("media_list")
        public final List<String> mediaList;

        @C09CT("task_id")
        public final String taskID;

        public static final class Creator implements Parcelable.Creator<BaseConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseConfig createFromParcel(Parcel parcel) {
                return new BaseConfig(parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseConfig[] newArray(int i) {
                return new BaseConfig[i];
            }
        }

        public final BaseConfig copy(String str, List<String> list) {
            return new BaseConfig(str, list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaseConfig)) {
                return false;
            }
            BaseConfig baseConfig = (BaseConfig) obj;
            return Intrinsics.LJFF(this.taskID, baseConfig.taskID) && Intrinsics.LJFF(this.mediaList, baseConfig.mediaList);
        }

        public int hashCode() {
            return (this.taskID.hashCode() * 31) + this.mediaList.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BaseConfig(taskID=");
            sbLIZ.append(this.taskID);
            sbLIZ.append(", mediaList=");
            sbLIZ.append(this.mediaList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.taskID);
            parcel.writeStringList(this.mediaList);
        }

        public BaseConfig() {
            this("", new ArrayList());
        }

        public final List<String> getMediaList() {
            return this.mediaList;
        }

        public final String getTaskID() {
            return this.taskID;
        }

        public BaseConfig(String str, List<String> list) {
            this.taskID = str;
            this.mediaList = list;
        }
    }

    public static final class ComposeConfig implements Parcelable {
        public static final Parcelable.Creator<ComposeConfig> CREATOR = new Creator();

        @C09CT("open_hd_switch")
        public final boolean openHDSwitch;

        @C09CT("output_path")
        public final String outputPath;

        @C09CT("result_config")
        public final ResultConfig resultConfig;

        public static final class Creator implements Parcelable.Creator<ComposeConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComposeConfig createFromParcel(Parcel parcel) {
                return new ComposeConfig(parcel.readString(), parcel.readInt() != 0, ResultConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComposeConfig[] newArray(int i) {
                return new ComposeConfig[i];
            }
        }

        public final ComposeConfig copy(String str, boolean z, ResultConfig resultConfig) {
            return new ComposeConfig(str, z, resultConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComposeConfig)) {
                return false;
            }
            ComposeConfig composeConfig = (ComposeConfig) obj;
            return Intrinsics.LJFF(this.outputPath, composeConfig.outputPath) && this.openHDSwitch == composeConfig.openHDSwitch && Intrinsics.LJFF(this.resultConfig, composeConfig.resultConfig);
        }

        public int hashCode() {
            return (((this.outputPath.hashCode() * 31) + C786410Ut5.Z2(this.openHDSwitch)) * 31) + this.resultConfig.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ComposeConfig(outputPath=");
            sbLIZ.append(this.outputPath);
            sbLIZ.append(", openHDSwitch=");
            sbLIZ.append(this.openHDSwitch);
            sbLIZ.append(", resultConfig=");
            sbLIZ.append(this.resultConfig);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.outputPath);
            parcel.writeInt(this.openHDSwitch ? 1 : 0);
            this.resultConfig.writeToParcel(parcel, i);
        }

        public ComposeConfig() {
            this("", false, new ResultConfig("", "", ""));
        }

        public final boolean getOpenHDSwitch() {
            return this.openHDSwitch;
        }

        public final String getOutputPath() {
            return this.outputPath;
        }

        public final ResultConfig getResultConfig() {
            return this.resultConfig;
        }

        public ComposeConfig(String str, boolean z, ResultConfig resultConfig) {
            this.outputPath = str;
            this.openHDSwitch = z;
            this.resultConfig = resultConfig;
        }
    }

    public static final class Creator implements Parcelable.Creator<VQEvaluationConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VQEvaluationConfig createFromParcel(Parcel parcel) {
            return new VQEvaluationConfig(BaseConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ScreenShotConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComposeConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StickerConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VQEvaluationConfig[] newArray(int i) {
            return new VQEvaluationConfig[i];
        }
    }

    public static final class ResultConfig implements Parcelable {
        public static final Parcelable.Creator<ResultConfig> CREATOR = new Creator();

        @C09CT("fail_info_path")
        public final String failInfoPath;

        @C09CT("finish_tag_path")
        public final String finishTagPath;

        @C09CT("success_info_path")
        public final String successInfoPath;

        public static final class Creator implements Parcelable.Creator<ResultConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResultConfig createFromParcel(Parcel parcel) {
                return new ResultConfig(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResultConfig[] newArray(int i) {
                return new ResultConfig[i];
            }
        }

        public final ResultConfig copy(String str, String str2, String str3) {
            return new ResultConfig(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultConfig)) {
                return false;
            }
            ResultConfig resultConfig = (ResultConfig) obj;
            return Intrinsics.LJFF(this.successInfoPath, resultConfig.successInfoPath) && Intrinsics.LJFF(this.failInfoPath, resultConfig.failInfoPath) && Intrinsics.LJFF(this.finishTagPath, resultConfig.finishTagPath);
        }

        public int hashCode() {
            return (((this.successInfoPath.hashCode() * 31) + this.failInfoPath.hashCode()) * 31) + this.finishTagPath.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ResultConfig(successInfoPath=");
            sbLIZ.append(this.successInfoPath);
            sbLIZ.append(", failInfoPath=");
            sbLIZ.append(this.failInfoPath);
            sbLIZ.append(", finishTagPath=");
            sbLIZ.append(this.finishTagPath);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.successInfoPath);
            parcel.writeString(this.failInfoPath);
            parcel.writeString(this.finishTagPath);
        }

        public ResultConfig() {
            this("", "", "");
        }

        public final void doClear() {
            new C0VSJ(this.finishTagPath).delete();
            new C0VSJ(this.failInfoPath).delete();
            new C0VSJ(this.successInfoPath).delete();
        }

        public final String getFailInfoPath() {
            return this.failInfoPath;
        }

        public final String getFinishTagPath() {
            return this.finishTagPath;
        }

        public final String getSuccessInfoPath() {
            return this.successInfoPath;
        }

        public final void doFail(String str) throws Throwable {
            C0VSJ c0vsjLIZJ = C2354809Ko.LIZJ(this.failInfoPath, true);
            if (c0vsjLIZJ != null) {
                C09BH.LJIIIZ(c0vsjLIZJ, str, Charsets.UTF_8);
            }
            C2354809Ko.LIZJ(this.finishTagPath, true);
        }

        public final void doSuc(String str) throws Throwable {
            C0VSJ c0vsjLIZJ = C2354809Ko.LIZJ(this.successInfoPath, true);
            if (c0vsjLIZJ != null) {
                C09BH.LJIIIZ(c0vsjLIZJ, str, Charsets.UTF_8);
            }
            C2354809Ko.LIZJ(this.finishTagPath, true);
        }

        public ResultConfig(String str, String str2, String str3) {
            this.successInfoPath = str;
            this.failInfoPath = str2;
            this.finishTagPath = str3;
        }
    }

    public static final class ScreenShotConfig implements Parcelable {
        public static final Parcelable.Creator<ScreenShotConfig> CREATOR = new Creator();

        @C09CT("capture_loop_delay")
        public final long captureLoopDelay;

        @C09CT("mistake_threshold")
        public final long mistakeThreshold;

        @C09CT("result_config")
        public final ResultConfig resultConfig;

        @C09CT("time_points")
        public final List<Long> timePoints;

        @C09CT("workspace")
        public final String workspace;

        public static final class Creator implements Parcelable.Creator<ScreenShotConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScreenShotConfig createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new ScreenShotConfig(string, arrayList, ResultConfig.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScreenShotConfig[] newArray(int i) {
                return new ScreenShotConfig[i];
            }
        }

        public final ScreenShotConfig copy(String str, List<Long> list, ResultConfig resultConfig, long j, long j2) {
            return new ScreenShotConfig(str, list, resultConfig, j, j2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenShotConfig)) {
                return false;
            }
            ScreenShotConfig screenShotConfig = (ScreenShotConfig) obj;
            return Intrinsics.LJFF(this.workspace, screenShotConfig.workspace) && Intrinsics.LJFF(this.timePoints, screenShotConfig.timePoints) && Intrinsics.LJFF(this.resultConfig, screenShotConfig.resultConfig) && this.mistakeThreshold == screenShotConfig.mistakeThreshold && this.captureLoopDelay == screenShotConfig.captureLoopDelay;
        }

        public int hashCode() {
            return (((((((this.workspace.hashCode() * 31) + this.timePoints.hashCode()) * 31) + this.resultConfig.hashCode()) * 31) + C786410Ut5.Y2(this.mistakeThreshold)) * 31) + C786410Ut5.Y2(this.captureLoopDelay);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ScreenShotConfig(workspace=");
            sbLIZ.append(this.workspace);
            sbLIZ.append(", timePoints=");
            sbLIZ.append(this.timePoints);
            sbLIZ.append(", resultConfig=");
            sbLIZ.append(this.resultConfig);
            sbLIZ.append(", mistakeThreshold=");
            sbLIZ.append(this.mistakeThreshold);
            sbLIZ.append(", captureLoopDelay=");
            sbLIZ.append(this.captureLoopDelay);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.workspace);
            List<Long> list = this.timePoints;
            parcel.writeInt(list.size());
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
            this.resultConfig.writeToParcel(parcel, i);
            parcel.writeLong(this.mistakeThreshold);
            parcel.writeLong(this.captureLoopDelay);
        }

        public ScreenShotConfig() {
            this("", new ArrayList(), new ResultConfig("", "", ""), 500L, 32L);
        }

        public final long getCaptureLoopDelay() {
            return this.captureLoopDelay;
        }

        public final long getMistakeThreshold() {
            return this.mistakeThreshold;
        }

        public final ResultConfig getResultConfig() {
            return this.resultConfig;
        }

        public final List<Long> getTimePoints() {
            return this.timePoints;
        }

        public final String getWorkspace() {
            return this.workspace;
        }

        public ScreenShotConfig(String str, List<Long> list, ResultConfig resultConfig, long j, long j2) {
            this.workspace = str;
            this.timePoints = list;
            this.resultConfig = resultConfig;
            this.mistakeThreshold = j;
            this.captureLoopDelay = j2;
        }
    }

    public static final class StickerConfig implements Parcelable {

        @C09CT("end_time")
        public final long endTime;

        @C09CT("extra")
        public final String extra;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("result_config")
        public final ResultConfig resultConfig;

        @C09CT("rotation")
        public final int rotation;

        @C09CT("scale")
        public final float scale;

        @C09CT("start_time")
        public final long startTime;

        @C09CT("type")
        public final int type;

        @C09CT("x_coordinate")
        public final float xCoordinate;

        @C09CT("y_coordinate")
        public final float yCoordinate;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<StickerConfig> CREATOR = new Creator();

        public static final class Companion {
        }

        public static final class Creator implements Parcelable.Creator<StickerConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StickerConfig createFromParcel(Parcel parcel) {
                return new StickerConfig(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readString(), ResultConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StickerConfig[] newArray(int i) {
                return new StickerConfig[i];
            }
        }

        public final StickerConfig copy(String str, int i, long j, long j2, float f, float f2, float f3, int i2, String str2, ResultConfig resultConfig) {
            return new StickerConfig(str, i, j, j2, f, f2, f3, i2, str2, resultConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickerConfig)) {
                return false;
            }
            StickerConfig stickerConfig = (StickerConfig) obj;
            return Intrinsics.LJFF(this.id, stickerConfig.id) && this.type == stickerConfig.type && this.startTime == stickerConfig.startTime && this.endTime == stickerConfig.endTime && Float.compare(this.xCoordinate, stickerConfig.xCoordinate) == 0 && Float.compare(this.yCoordinate, stickerConfig.yCoordinate) == 0 && Float.compare(this.scale, stickerConfig.scale) == 0 && this.rotation == stickerConfig.rotation && Intrinsics.LJFF(this.extra, stickerConfig.extra) && Intrinsics.LJFF(this.resultConfig, stickerConfig.resultConfig);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StickerConfig(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", startTime=");
            sbLIZ.append(this.startTime);
            sbLIZ.append(", endTime=");
            sbLIZ.append(this.endTime);
            sbLIZ.append(", xCoordinate=");
            sbLIZ.append(this.xCoordinate);
            sbLIZ.append(", yCoordinate=");
            sbLIZ.append(this.yCoordinate);
            sbLIZ.append(", scale=");
            sbLIZ.append(this.scale);
            sbLIZ.append(", rotation=");
            sbLIZ.append(this.rotation);
            sbLIZ.append(", extra=");
            sbLIZ.append(this.extra);
            sbLIZ.append(", resultConfig=");
            sbLIZ.append(this.resultConfig);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeInt(this.type);
            parcel.writeLong(this.startTime);
            parcel.writeLong(this.endTime);
            parcel.writeFloat(this.xCoordinate);
            parcel.writeFloat(this.yCoordinate);
            parcel.writeFloat(this.scale);
            parcel.writeInt(this.rotation);
            parcel.writeString(this.extra);
            this.resultConfig.writeToParcel(parcel, i);
        }

        public StickerConfig() {
            this("", 0, 0L, 0L, 0.0f, 0.0f, 1.0f, 0, "", new ResultConfig("", "", ""));
        }

        public int hashCode() {
            return (((((((((((((((((this.id.hashCode() * 31) + this.type) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + Float.floatToIntBits(this.xCoordinate)) * 31) + Float.floatToIntBits(this.yCoordinate)) * 31) + Float.floatToIntBits(this.scale)) * 31) + this.rotation) * 31) + this.extra.hashCode()) * 31) + this.resultConfig.hashCode();
        }

        public final long getEndTime() {
            return this.endTime;
        }

        public final String getExtra() {
            return this.extra;
        }

        public final String getId() {
            return this.id;
        }

        public final ResultConfig getResultConfig() {
            return this.resultConfig;
        }

        public final int getRotation() {
            return this.rotation;
        }

        public final float getScale() {
            return this.scale;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final int getType() {
            return this.type;
        }

        public final float getXCoordinate() {
            return this.xCoordinate;
        }

        public final float getYCoordinate() {
            return this.yCoordinate;
        }

        public StickerConfig(String str, int i, long j, long j2, float f, float f2, float f3, int i2, String str2, ResultConfig resultConfig) {
            this.id = str;
            this.type = i;
            this.startTime = j;
            this.endTime = j2;
            this.xCoordinate = f;
            this.yCoordinate = f2;
            this.scale = f3;
            this.rotation = i2;
            this.extra = str2;
            this.resultConfig = resultConfig;
        }
    }

    public VQEvaluationConfig() {
        this(new BaseConfig("", new ArrayList()), null, null, null);
    }

    public final VQEvaluationConfig copy(BaseConfig baseConfig, ScreenShotConfig screenShotConfig, ComposeConfig composeConfig, StickerConfig stickerConfig) {
        return new VQEvaluationConfig(baseConfig, screenShotConfig, composeConfig, stickerConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VQEvaluationConfig)) {
            return false;
        }
        VQEvaluationConfig vQEvaluationConfig = (VQEvaluationConfig) obj;
        return Intrinsics.LJFF(this.baseConfig, vQEvaluationConfig.baseConfig) && Intrinsics.LJFF(this.screenShotConfig, vQEvaluationConfig.screenShotConfig) && Intrinsics.LJFF(this.composeConfig, vQEvaluationConfig.composeConfig) && Intrinsics.LJFF(this.stickerConfig, vQEvaluationConfig.stickerConfig);
    }

    public int hashCode() {
        int iHashCode = this.baseConfig.hashCode() * 31;
        ScreenShotConfig screenShotConfig = this.screenShotConfig;
        int iHashCode2 = (iHashCode + (screenShotConfig == null ? 0 : screenShotConfig.hashCode())) * 31;
        ComposeConfig composeConfig = this.composeConfig;
        int iHashCode3 = (iHashCode2 + (composeConfig == null ? 0 : composeConfig.hashCode())) * 31;
        StickerConfig stickerConfig = this.stickerConfig;
        return iHashCode3 + (stickerConfig != null ? stickerConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VQEvaluationConfig(baseConfig=");
        sbLIZ.append(this.baseConfig);
        sbLIZ.append(", screenShotConfig=");
        sbLIZ.append(this.screenShotConfig);
        sbLIZ.append(", composeConfig=");
        sbLIZ.append(this.composeConfig);
        sbLIZ.append(", stickerConfig=");
        sbLIZ.append(this.stickerConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseConfig.writeToParcel(parcel, i);
        ScreenShotConfig screenShotConfig = this.screenShotConfig;
        if (screenShotConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            screenShotConfig.writeToParcel(parcel, i);
        }
        ComposeConfig composeConfig = this.composeConfig;
        if (composeConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composeConfig.writeToParcel(parcel, i);
        }
        StickerConfig stickerConfig = this.stickerConfig;
        if (stickerConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickerConfig.writeToParcel(parcel, i);
        }
    }

    public final BaseConfig getBaseConfig() {
        return this.baseConfig;
    }

    public final ComposeConfig getComposeConfig() {
        return this.composeConfig;
    }

    public final ScreenShotConfig getScreenShotConfig() {
        return this.screenShotConfig;
    }

    public final StickerConfig getStickerConfig() {
        return this.stickerConfig;
    }

    public static final class FailInfo {

        @C09CT("error_code")
        public final int errorCode;

        @C09CT("error_msg")
        public final String errorMsg;

        public FailInfo() {
            this(0, null);
        }

        public FailInfo(int i, String str) {
            this.errorCode = i;
            this.errorMsg = str;
        }
    }

    public VQEvaluationConfig(BaseConfig baseConfig, ScreenShotConfig screenShotConfig, ComposeConfig composeConfig, StickerConfig stickerConfig) {
        this.baseConfig = baseConfig;
        this.screenShotConfig = screenShotConfig;
        this.composeConfig = composeConfig;
        this.stickerConfig = stickerConfig;
    }
}
