package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.DependencyInfo;
import com.ss.ugc.aweme.creation.base.ImportItemModel;
import com.ss.ugc.aweme.creation.base.PointLengthInfo;
import com.ss.ugc.aweme.creation.base.SimpleCanvasComposer;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class SimpleCanvasComposer implements Parcelable, Serializable {
    public static final Parcelable.Creator<SimpleCanvasComposer> CREATOR = new Parcelable.Creator<SimpleCanvasComposer>() { // from class: X.0Mhm
        @Override // android.os.Parcelable.Creator
        public final SimpleCanvasComposer createFromParcel(Parcel parcel) {
            Float fValueOf;
            DependencyInfo dependencyInfo = (DependencyInfo) parcel.readParcelable(SimpleCanvasComposer.class.getClassLoader());
            ImportItemModel importItemModel = (ImportItemModel) parcel.readParcelable(SimpleCanvasComposer.class.getClassLoader());
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            } else {
                fValueOf = null;
            }
            return new SimpleCanvasComposer(dependencyInfo, importItemModel, fValueOf, (PointLengthInfo) parcel.readParcelable(SimpleCanvasComposer.class.getClassLoader()), (PointLengthInfo) parcel.readParcelable(SimpleCanvasComposer.class.getClassLoader()), (PointLengthInfo) parcel.readParcelable(SimpleCanvasComposer.class.getClassLoader()), (PointLengthInfo) parcel.readParcelable(SimpleCanvasComposer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleCanvasComposer[] newArray(int i) {
            return new SimpleCanvasComposer[i];
        }
    };

    @C09CT("canvas_center_x")
    public PointLengthInfo canvasCenterX;

    @C09CT("canvas_center_y")
    public PointLengthInfo canvasCenterY;

    @C09CT("canvas_height")
    public PointLengthInfo canvasHeight;

    @C09CT("canvas_width")
    public PointLengthInfo canvasWidth;

    @C09CT("dependency_info")
    public DependencyInfo dependencyInfo;

    @C09CT("scale")
    public Float scale;

    @C09CT("video")
    public ImportItemModel video;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.dependencyInfo, i);
        parcel.writeParcelable(this.video, i);
        Float f = this.scale;
        if (f != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.canvasWidth, i);
        parcel.writeParcelable(this.canvasHeight, i);
        parcel.writeParcelable(this.canvasCenterX, i);
        parcel.writeParcelable(this.canvasCenterY, i);
    }

    public final PointLengthInfo getCanvasCenterX() {
        return this.canvasCenterX;
    }

    public final PointLengthInfo getCanvasCenterY() {
        return this.canvasCenterY;
    }

    public final PointLengthInfo getCanvasHeight() {
        return this.canvasHeight;
    }

    public final PointLengthInfo getCanvasWidth() {
        return this.canvasWidth;
    }

    public final DependencyInfo getDependencyInfo() {
        return this.dependencyInfo;
    }

    public final Float getScale() {
        return this.scale;
    }

    public final ImportItemModel getVideo() {
        return this.video;
    }

    public final void setCanvasCenterX(PointLengthInfo pointLengthInfo) {
        this.canvasCenterX = pointLengthInfo;
    }

    public final void setCanvasCenterY(PointLengthInfo pointLengthInfo) {
        this.canvasCenterY = pointLengthInfo;
    }

    public final void setCanvasHeight(PointLengthInfo pointLengthInfo) {
        this.canvasHeight = pointLengthInfo;
    }

    public final void setCanvasWidth(PointLengthInfo pointLengthInfo) {
        this.canvasWidth = pointLengthInfo;
    }

    public final void setDependencyInfo(DependencyInfo dependencyInfo) {
        this.dependencyInfo = dependencyInfo;
    }

    public final void setScale(Float f) {
        this.scale = f;
    }

    public final void setVideo(ImportItemModel importItemModel) {
        this.video = importItemModel;
    }

    public SimpleCanvasComposer(DependencyInfo dependencyInfo, ImportItemModel importItemModel, Float f, PointLengthInfo pointLengthInfo, PointLengthInfo pointLengthInfo2, PointLengthInfo pointLengthInfo3, PointLengthInfo pointLengthInfo4) {
        this.dependencyInfo = dependencyInfo;
        this.video = importItemModel;
        this.scale = f;
        this.canvasWidth = pointLengthInfo;
        this.canvasHeight = pointLengthInfo2;
        this.canvasCenterX = pointLengthInfo3;
        this.canvasCenterY = pointLengthInfo4;
    }
}
