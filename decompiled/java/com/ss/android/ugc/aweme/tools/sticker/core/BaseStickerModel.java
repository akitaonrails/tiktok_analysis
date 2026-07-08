package com.ss.android.ugc.aweme.tools.sticker.core;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13BV;
import X.C19591311kt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC390580FTc;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.KeyframeInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseStickerModel implements Cloneable, Parcelable, Serializable {

    @C09CT("alpha")
    public final float alpha;

    @C09CT("center_x")
    public final float centerX;

    @C09CT("center_x_in_video")
    public final float centerXInVideo;

    @C09CT("center_y")
    public final float centerY;

    @C09CT("center_y_in_video")
    public final float centerYInVideo;

    @C09CT("compile_path")
    @C0MY0
    public String compilePath;

    @C09CT("container_height")
    public final int containerHeight;

    @C09CT("container_left")
    public final int containerLeft;

    @C09CT("container_top")
    public final int containerTop;

    @C09CT("container_width")
    public final int containerWidth;

    @C09CT("enable_nle_change")
    public boolean enableNLEChange;

    @C09CT("end_time")
    public float endTime;

    @C09CT("height")
    public final int height;

    @C09CT("height_in_video")
    public final float heightInVideo;

    @C040H
    public final EnumC390580FTc highlightState;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int id;

    @C09CT("is_embed")
    public final boolean isEmbed;

    @C09CT("is_manually_clipped")
    public boolean isManuallyClipped;

    @C09CT("keyframes")
    public final List<KeyframeInfo> keyframes;

    @C09CT("left")
    public final int left;

    @C09CT("media_height")
    public final int mediaHeight;

    @C09CT("media_width")
    public final int mediaWidth;

    @C09CT("rotation")
    public final float rotation;

    @C09CT("scale")
    public final float scale;

    @C09CT("start_time")
    public float startTime;

    @C09CT("sticker_source")
    public String stickerSource;

    @C09CT("top")
    public final int top;

    @C09CT("translate_x")
    public final float translateX;

    @C09CT("translate_y")
    public final float translateY;

    @C09CT("type")
    public final EnumC1466150oFx type;

    @C09CT("ui_end_time")
    public float uiEndTime;

    @C09CT("ui_start_time")
    public float uiStartTime;

    @C09CT("visible")
    public final boolean visible;

    @C09CT("width")
    public final int width;

    @C09CT("width_in_video")
    public final float widthInVideo;

    @C09CT("z_index")
    public int zIndex;
    public static final Parcelable.Creator<BaseStickerModel> CREATOR = new Parcelable.Creator<BaseStickerModel>() { // from class: X.0EKq
        @Override // android.os.Parcelable.Creator
        public final BaseStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            EnumC1466150oFx enumC1466150oFxValueOf = EnumC1466150oFx.valueOf(parcel.readString());
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            float f3 = parcel.readFloat();
            float f4 = parcel.readFloat();
            float f5 = parcel.readFloat();
            float f6 = parcel.readFloat();
            float f7 = parcel.readFloat();
            float f8 = parcel.readFloat();
            float f9 = parcel.readFloat();
            float f10 = parcel.readFloat();
            float f11 = parcel.readFloat();
            float f12 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f13 = parcel.readFloat();
            float f14 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            float f15 = parcel.readFloat();
            EnumC390580FTc enumC390580FTcValueOf = EnumC390580FTc.valueOf(parcel.readString());
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(KeyframeInfo.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new BaseStickerModel(i, i2, enumC1466150oFxValueOf, i3, i4, f, f2, i5, i6, i7, i8, i9, i10, i11, i12, z, string, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, z2, f13, f14, z3, f15, enumC390580FTcValueOf, string2, arrayList, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseStickerModel[] newArray(int i) {
            return new BaseStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public BaseStickerModel() {
        this(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseStickerModel copy$default(BaseStickerModel baseStickerModel, int i, int i2, EnumC1466150oFx enumC1466150oFx, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, float f13, float f14, boolean z3, float f15, EnumC390580FTc enumC390580FTc, String str2, List list, boolean z4, int i13, int i14, Object obj) {
        int i15 = i11;
        int i16 = i10;
        int i17 = i9;
        int i18 = i8;
        int i19 = i7;
        int i20 = i6;
        int i21 = i5;
        float f16 = f2;
        float f18 = f;
        int i22 = i4;
        int i23 = i3;
        EnumC1466150oFx enumC1466150oFx2 = enumC1466150oFx;
        int i24 = i2;
        int i25 = i;
        List list2 = list;
        boolean z5 = z3;
        float f19 = f14;
        float f20 = f13;
        boolean z6 = z2;
        float f21 = f12;
        float f22 = f15;
        float f23 = f11;
        float f24 = f10;
        float f25 = f9;
        float f26 = f8;
        float f27 = f7;
        EnumC390580FTc enumC390580FTc2 = enumC390580FTc;
        float f28 = f6;
        float f29 = f5;
        float f30 = f4;
        boolean z7 = z4;
        float f31 = f3;
        String str3 = str;
        String str4 = str2;
        boolean z8 = z;
        int i26 = i12;
        if ((i13 & 1) != 0) {
            i25 = baseStickerModel.id;
        }
        if ((i13 & 2) != 0) {
            i24 = baseStickerModel.zIndex;
        }
        if ((i13 & 4) != 0) {
            enumC1466150oFx2 = baseStickerModel.type;
        }
        if ((i13 & 8) != 0) {
            i23 = baseStickerModel.left;
        }
        if ((i13 & 16) != 0) {
            i22 = baseStickerModel.top;
        }
        if ((i13 & 32) != 0) {
            f18 = baseStickerModel.centerX;
        }
        if ((i13 & 64) != 0) {
            f16 = baseStickerModel.centerY;
        }
        if ((i13 & 128) != 0) {
            i21 = baseStickerModel.width;
        }
        if ((i13 & 256) != 0) {
            i20 = baseStickerModel.height;
        }
        if ((i13 & 512) != 0) {
            i19 = baseStickerModel.containerLeft;
        }
        if ((i13 & 1024) != 0) {
            i18 = baseStickerModel.containerTop;
        }
        if ((i13 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i17 = baseStickerModel.containerWidth;
        }
        if ((i13 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i16 = baseStickerModel.containerHeight;
        }
        if ((i13 & 8192) != 0) {
            i15 = baseStickerModel.mediaWidth;
        }
        if ((i13 & 16384) != 0) {
            i26 = baseStickerModel.mediaHeight;
        }
        if ((32768 & i13) != 0) {
            z8 = baseStickerModel.isEmbed;
        }
        if ((65536 & i13) != 0) {
            str3 = baseStickerModel.compilePath;
        }
        if ((131072 & i13) != 0) {
            f31 = baseStickerModel.centerXInVideo;
        }
        if ((262144 & i13) != 0) {
            f30 = baseStickerModel.centerYInVideo;
        }
        if ((524288 & i13) != 0) {
            f29 = baseStickerModel.widthInVideo;
        }
        if ((1048576 & i13) != 0) {
            f28 = baseStickerModel.heightInVideo;
        }
        if ((2097152 & i13) != 0) {
            f27 = baseStickerModel.translateX;
        }
        if ((4194304 & i13) != 0) {
            f26 = baseStickerModel.translateY;
        }
        if ((8388608 & i13) != 0) {
            f25 = baseStickerModel.scale;
        }
        if ((16777216 & i13) != 0) {
            f24 = baseStickerModel.rotation;
        }
        if ((33554432 & i13) != 0) {
            f23 = baseStickerModel.startTime;
        }
        if ((67108864 & i13) != 0) {
            f21 = baseStickerModel.endTime;
        }
        if ((134217728 & i13) != 0) {
            z6 = baseStickerModel.isManuallyClipped;
        }
        if ((268435456 & i13) != 0) {
            f20 = baseStickerModel.uiStartTime;
        }
        if ((536870912 & i13) != 0) {
            f19 = baseStickerModel.uiEndTime;
        }
        if ((1073741824 & i13) != 0) {
            z5 = baseStickerModel.visible;
        }
        if ((i13 & Integer.MIN_VALUE) != 0) {
            f22 = baseStickerModel.alpha;
        }
        if ((i14 & 1) != 0) {
            enumC390580FTc2 = baseStickerModel.highlightState;
        }
        if ((i14 & 2) != 0) {
            str4 = baseStickerModel.stickerSource;
        }
        if ((i14 & 4) != 0) {
            list2 = baseStickerModel.keyframes;
        }
        if ((i14 & 8) != 0) {
            z7 = baseStickerModel.enableNLEChange;
        }
        return baseStickerModel.copy(i25, i24, enumC1466150oFx2, i23, i22, f18, f16, i21, i20, i19, i18, i17, i16, i15, i26, z8, str3, f31, f30, f29, f28, f27, f26, f25, f24, f23, f21, z6, f20, f19, z5, f22, enumC390580FTc2, str4, list2, z7);
    }

    public final BaseStickerModel copy(int i, int i2, EnumC1466150oFx enumC1466150oFx, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, float f13, float f14, boolean z3, float f15, EnumC390580FTc enumC390580FTc, String str2, List<KeyframeInfo> list, boolean z4) {
        return new BaseStickerModel(i, i2, enumC1466150oFx, i3, i4, f, f2, i5, i6, i7, i8, i9, i10, i11, i12, z, str, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, z2, f13, f14, z3, f15, enumC390580FTc, str2, list, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStickerModel)) {
            return false;
        }
        BaseStickerModel baseStickerModel = (BaseStickerModel) obj;
        return this.id == baseStickerModel.id && this.zIndex == baseStickerModel.zIndex && this.type == baseStickerModel.type && this.left == baseStickerModel.left && this.top == baseStickerModel.top && Float.compare(this.centerX, baseStickerModel.centerX) == 0 && Float.compare(this.centerY, baseStickerModel.centerY) == 0 && this.width == baseStickerModel.width && this.height == baseStickerModel.height && this.containerLeft == baseStickerModel.containerLeft && this.containerTop == baseStickerModel.containerTop && this.containerWidth == baseStickerModel.containerWidth && this.containerHeight == baseStickerModel.containerHeight && this.mediaWidth == baseStickerModel.mediaWidth && this.mediaHeight == baseStickerModel.mediaHeight && this.isEmbed == baseStickerModel.isEmbed && Intrinsics.LJFF(this.compilePath, baseStickerModel.compilePath) && Float.compare(this.centerXInVideo, baseStickerModel.centerXInVideo) == 0 && Float.compare(this.centerYInVideo, baseStickerModel.centerYInVideo) == 0 && Float.compare(this.widthInVideo, baseStickerModel.widthInVideo) == 0 && Float.compare(this.heightInVideo, baseStickerModel.heightInVideo) == 0 && Float.compare(this.translateX, baseStickerModel.translateX) == 0 && Float.compare(this.translateY, baseStickerModel.translateY) == 0 && Float.compare(this.scale, baseStickerModel.scale) == 0 && Float.compare(this.rotation, baseStickerModel.rotation) == 0 && Float.compare(this.startTime, baseStickerModel.startTime) == 0 && Float.compare(this.endTime, baseStickerModel.endTime) == 0 && this.isManuallyClipped == baseStickerModel.isManuallyClipped && Float.compare(this.uiStartTime, baseStickerModel.uiStartTime) == 0 && Float.compare(this.uiEndTime, baseStickerModel.uiEndTime) == 0 && this.visible == baseStickerModel.visible && Float.compare(this.alpha, baseStickerModel.alpha) == 0 && this.highlightState == baseStickerModel.highlightState && Intrinsics.LJFF(this.stickerSource, baseStickerModel.stickerSource) && Intrinsics.LJFF(this.keyframes, baseStickerModel.keyframes) && this.enableNLEChange == baseStickerModel.enableNLEChange;
    }

    public String toString() {
        return "BaseStickerModel(id=" + this.id + ", zIndex=" + this.zIndex + ", type=" + this.type + ", left=" + this.left + ", top=" + this.top + ", centerX=" + this.centerX + ", centerY=" + this.centerY + ", width=" + this.width + ", height=" + this.height + ", containerLeft=" + this.containerLeft + ", containerTop=" + this.containerTop + ", containerWidth=" + this.containerWidth + ", containerHeight=" + this.containerHeight + ", mediaWidth=" + this.mediaWidth + ", mediaHeight=" + this.mediaHeight + ", isEmbed=" + this.isEmbed + ", compilePath=" + this.compilePath + ", centerXInVideo=" + this.centerXInVideo + ", centerYInVideo=" + this.centerYInVideo + ", widthInVideo=" + this.widthInVideo + ", heightInVideo=" + this.heightInVideo + ", translateX=" + this.translateX + ", translateY=" + this.translateY + ", scale=" + this.scale + ", rotation=" + this.rotation + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isManuallyClipped=" + this.isManuallyClipped + ", uiStartTime=" + this.uiStartTime + ", uiEndTime=" + this.uiEndTime + ", visible=" + this.visible + ", alpha=" + this.alpha + ", highlightState=" + this.highlightState + ", stickerSource=" + this.stickerSource + ", keyframes=" + this.keyframes + ", enableNLEChange=" + this.enableNLEChange + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.zIndex);
        parcel.writeString(this.type.name());
        parcel.writeInt(this.left);
        parcel.writeInt(this.top);
        parcel.writeFloat(this.centerX);
        parcel.writeFloat(this.centerY);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.containerLeft);
        parcel.writeInt(this.containerTop);
        parcel.writeInt(this.containerWidth);
        parcel.writeInt(this.containerHeight);
        parcel.writeInt(this.mediaWidth);
        parcel.writeInt(this.mediaHeight);
        parcel.writeInt(this.isEmbed ? 1 : 0);
        parcel.writeString(this.compilePath);
        parcel.writeFloat(this.centerXInVideo);
        parcel.writeFloat(this.centerYInVideo);
        parcel.writeFloat(this.widthInVideo);
        parcel.writeFloat(this.heightInVideo);
        parcel.writeFloat(this.translateX);
        parcel.writeFloat(this.translateY);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.startTime);
        parcel.writeFloat(this.endTime);
        parcel.writeInt(this.isManuallyClipped ? 1 : 0);
        parcel.writeFloat(this.uiStartTime);
        parcel.writeFloat(this.uiEndTime);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeFloat(this.alpha);
        parcel.writeString(this.highlightState.name());
        parcel.writeString(this.stickerSource);
        List<KeyframeInfo> list = this.keyframes;
        parcel.writeInt(list.size());
        Iterator<KeyframeInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.enableNLEChange ? 1 : 0);
    }

    public final String getLocationInfo() {
        PointF pointF = new PointF(this.translateX, this.translateY);
        C19591311kt c19591311kt = C19591311kt.LIZ;
        float f = this.mediaWidth;
        float f2 = this.mediaHeight;
        c19591311kt.getClass();
        PointF pointFLIZ = C19591311kt.LIZ(pointF, f, f2);
        float f3 = pointFLIZ.x + 0.5f;
        float f4 = pointFLIZ.y + 0.5f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.scale);
        sbLIZ.append(',');
        sbLIZ.append(f3);
        sbLIZ.append(',');
        sbLIZ.append(f4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final RectF getViewRect() {
        int i = this.left;
        int i2 = this.containerLeft;
        int i3 = i + i2;
        int i4 = i + i2 + this.width;
        int i5 = this.top;
        int i6 = this.containerTop;
        return new RectF(i3, i5 + i6, i4, i5 + i6 + this.height);
    }

    public final RectF getVisibleRectWithoutRotation() {
        if (!this.visible) {
            return new RectF();
        }
        float f = this.centerX;
        float f2 = this.translateX;
        int i = this.width;
        float f3 = this.scale;
        float f4 = 2;
        int i2 = this.containerLeft;
        float f5 = ((f + f2) - ((i * f3) / f4)) + i2;
        float f6 = f + f2 + ((i * f3) / f4) + i2;
        float f7 = this.centerY;
        float f8 = this.translateY;
        int i3 = this.height;
        int i4 = this.containerTop;
        return new RectF(f5, ((f7 + f8) - ((i3 * f3) / f4)) + i4, f6, f7 + f8 + ((i3 * f3) / f4) + i4);
    }

    public final RectF getVisibleRectWithoutRotationInContainer() {
        float f = this.centerX;
        float f2 = this.translateX;
        int i = this.width;
        float f3 = this.scale;
        float f4 = 2;
        float f5 = (f + f2) - ((i * f3) / f4);
        float f6 = f + f2 + ((i * f3) / f4);
        float f7 = this.centerY;
        float f8 = this.translateY;
        int i2 = this.height;
        return new RectF(f5, (f7 + f8) - ((i2 * f3) / f4), f6, f7 + f8 + ((i2 * f3) / f4));
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.id * 31) + this.zIndex) * 31) + this.type.hashCode()) * 31) + this.left) * 31) + this.top) * 31) + Float.floatToIntBits(this.centerX)) * 31) + Float.floatToIntBits(this.centerY)) * 31) + this.width) * 31) + this.height) * 31) + this.containerLeft) * 31) + this.containerTop) * 31) + this.containerWidth) * 31) + this.containerHeight) * 31) + this.mediaWidth) * 31) + this.mediaHeight) * 31) + C786410Ut5.Z2(this.isEmbed)) * 31) + this.compilePath.hashCode()) * 31) + Float.floatToIntBits(this.centerXInVideo)) * 31) + Float.floatToIntBits(this.centerYInVideo)) * 31) + Float.floatToIntBits(this.widthInVideo)) * 31) + Float.floatToIntBits(this.heightInVideo)) * 31) + Float.floatToIntBits(this.translateX)) * 31) + Float.floatToIntBits(this.translateY)) * 31) + Float.floatToIntBits(this.scale)) * 31) + Float.floatToIntBits(this.rotation)) * 31) + Float.floatToIntBits(this.startTime)) * 31) + Float.floatToIntBits(this.endTime)) * 31) + C786410Ut5.Z2(this.isManuallyClipped)) * 31) + Float.floatToIntBits(this.uiStartTime)) * 31) + Float.floatToIntBits(this.uiEndTime)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + this.highlightState.hashCode()) * 31) + this.stickerSource.hashCode()) * 31) + this.keyframes.hashCode()) * 31) + C786410Ut5.Z2(this.enableNLEChange);
    }

    public Object clone() {
        return super.clone();
    }

    public final RectF getStickerBoundingRect() {
        RectF visibleRectWithoutRotationInContainer = getVisibleRectWithoutRotationInContainer();
        Matrix matrix = new Matrix();
        matrix.postRotate(this.rotation, visibleRectWithoutRotationInContainer.centerX(), visibleRectWithoutRotationInContainer.centerY());
        matrix.mapRect(visibleRectWithoutRotationInContainer);
        return visibleRectWithoutRotationInContainer;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterXInVideo() {
        return this.centerXInVideo;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final float getCenterYInVideo() {
        return this.centerYInVideo;
    }

    public final String getCompilePath() {
        return this.compilePath;
    }

    public final int getContainerHeight() {
        return this.containerHeight;
    }

    public final int getContainerLeft() {
        return this.containerLeft;
    }

    public final int getContainerTop() {
        return this.containerTop;
    }

    public final int getContainerWidth() {
        return this.containerWidth;
    }

    public final boolean getEnableNLEChange() {
        return this.enableNLEChange;
    }

    public final float getEndTime() {
        return this.endTime;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getHeightInVideo() {
        return this.heightInVideo;
    }

    public final EnumC390580FTc getHighlightState() {
        return this.highlightState;
    }

    public final int getId() {
        return this.id;
    }

    public final List<KeyframeInfo> getKeyframes() {
        return this.keyframes;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMediaHeight() {
        return this.mediaHeight;
    }

    public final int getMediaWidth() {
        return this.mediaWidth;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getStartTime() {
        return this.startTime;
    }

    public final String getStickerSource() {
        return this.stickerSource;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslateX() {
        return this.translateX;
    }

    public final float getTranslateY() {
        return this.translateY;
    }

    public final EnumC1466150oFx getType() {
        return this.type;
    }

    public final float getUiEndTime() {
        return this.uiEndTime;
    }

    public final float getUiStartTime() {
        return this.uiStartTime;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getWidthInVideo() {
        return this.widthInVideo;
    }

    public final int getZIndex() {
        return this.zIndex;
    }

    public final boolean isEmbed() {
        return this.isEmbed;
    }

    public final boolean isManuallyClipped() {
        return this.isManuallyClipped;
    }

    public final void setCompilePath(String str) {
        this.compilePath = str;
    }

    public final void setEnableNLEChange(boolean z) {
        this.enableNLEChange = z;
    }

    public final void setEndTime(float f) {
        this.endTime = f;
    }

    public final void setManuallyClipped(boolean z) {
        this.isManuallyClipped = z;
    }

    public final void setStartTime(float f) {
        this.startTime = f;
    }

    public final void setStickerSource(String str) {
        this.stickerSource = str;
    }

    public final void setUiEndTime(float f) {
        this.uiEndTime = f;
    }

    public final void setUiStartTime(float f) {
        this.uiStartTime = f;
    }

    public final void setZIndex(int i) {
        this.zIndex = i;
    }

    public BaseStickerModel(int i, int i2, EnumC1466150oFx enumC1466150oFx, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, float f13, float f14, boolean z3, float f15, EnumC390580FTc enumC390580FTc, String str2, List<KeyframeInfo> list, boolean z4) {
        this.id = i;
        this.zIndex = i2;
        this.type = enumC1466150oFx;
        this.left = i3;
        this.top = i4;
        this.centerX = f;
        this.centerY = f2;
        this.width = i5;
        this.height = i6;
        this.containerLeft = i7;
        this.containerTop = i8;
        this.containerWidth = i9;
        this.containerHeight = i10;
        this.mediaWidth = i11;
        this.mediaHeight = i12;
        this.isEmbed = z;
        this.compilePath = str;
        this.centerXInVideo = f3;
        this.centerYInVideo = f4;
        this.widthInVideo = f5;
        this.heightInVideo = f6;
        this.translateX = f7;
        this.translateY = f8;
        this.scale = f9;
        this.rotation = f10;
        this.startTime = f11;
        this.endTime = f12;
        this.isManuallyClipped = z2;
        this.uiStartTime = f13;
        this.uiEndTime = f14;
        this.visible = z3;
        this.alpha = f15;
        this.highlightState = enumC390580FTc;
        this.stickerSource = str2;
        this.keyframes = list;
        this.enableNLEChange = z4;
    }

    public BaseStickerModel(int i, int i2, EnumC1466150oFx enumC1466150oFx, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, float f13, float f14, boolean z3, float f15, EnumC390580FTc enumC390580FTc, String str2, List list, boolean z4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i, (i13 & 2) != 0 ? 0 : i2, (i13 & 4) != 0 ? EnumC1466150oFx.NONE : enumC1466150oFx, (i13 & 8) != 0 ? 0 : i3, (i13 & 16) != 0 ? 0 : i4, (i13 & 32) != 0 ? 0.0f : f, (i13 & 64) != 0 ? 0.0f : f2, (i13 & 128) != 0 ? 0 : i5, (i13 & 256) != 0 ? 0 : i6, (i13 & 512) != 0 ? 0 : i7, (i13 & 1024) != 0 ? 0 : i8, (i13 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i9, (i13 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i10, (i13 & 8192) != 0 ? 0 : i11, (i13 & 16384) != 0 ? 0 : i12, (32768 & i13) != 0 ? false : z, (65536 & i13) != 0 ? "" : str, (131072 & i13) != 0 ? 0.0f : f3, (262144 & i13) != 0 ? 0.0f : f4, (524288 & i13) != 0 ? 0.0f : f5, (1048576 & i13) != 0 ? 0.0f : f6, (2097152 & i13) != 0 ? 0.0f : f7, (4194304 & i13) != 0 ? 0.0f : f8, (8388608 & i13) != 0 ? 1.0f : f9, (16777216 & i13) != 0 ? 0.0f : f10, (33554432 & i13) != 0 ? 0.0f : f11, (67108864 & i13) != 0 ? 0.0f : f12, (134217728 & i13) != 0 ? false : z2, (268435456 & i13) != 0 ? 0.0f : f13, (536870912 & i13) != 0 ? 0.0f : f14, (1073741824 & i13) != 0 ? true : z3, (i13 & Integer.MIN_VALUE) == 0 ? f15 : 1.0f, (i14 & 1) != 0 ? EnumC390580FTc.NORMAL : enumC390580FTc, (i14 & 2) != 0 ? CardStruct.IStatusCode.DEFAULT : str2, (i14 & 4) != 0 ? C13BV.INSTANCE : list, (i14 & 8) == 0 ? z4 : true);
    }
}
