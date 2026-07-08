package com.ss.android.ugc.aweme.sticker.image;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.image.ImageEffect;
import com.ss.android.ugc.aweme.sticker.image.ResourceInfo;
import com.ss.android.ugc.aweme.sticker.image.TemplateItem;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ImageEffect extends Effect {
    public long applyEndTime;
    public long applyStartTime;
    public long clickStartTime;
    public long downLoadEndTime;
    public long downLoadStartTime;
    public ResourceInfo resourceInfo;

    @C09CT("template_item")
    public final TemplateItem templateItem;
    public boolean zipCache;
    public static final Parcelable.Creator<ImageEffect> CREATOR = new Parcelable.Creator<ImageEffect>() { // from class: X.0wRW
        @Override // android.os.Parcelable.Creator
        public final ImageEffect createFromParcel(Parcel parcel) {
            TemplateItem templateItemCreateFromParcel;
            boolean z;
            ResourceInfo resourceInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                templateItemCreateFromParcel = null;
            } else {
                templateItemCreateFromParcel = TemplateItem.CREATOR.createFromParcel(parcel);
            }
            TemplateItem templateItem = templateItemCreateFromParcel;
            if (parcel.readInt() != 0) {
                resourceInfoCreateFromParcel = ResourceInfo.CREATOR.createFromParcel(parcel);
            }
            ResourceInfo resourceInfo = resourceInfoCreateFromParcel;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            long j5 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ImageEffect(templateItem, resourceInfo, j, j2, j3, j4, j5, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageEffect[] newArray(int i) {
            return new ImageEffect[i];
        }
    };
    public static final int $stable = 8;

    public ImageEffect() {
        this(null, null, 0L, 0L, 0L, 0L, 0L, false);
    }

    public final ImageEffect copy(TemplateItem templateItem, ResourceInfo resourceInfo, long j, long j2, long j3, long j4, long j5, boolean z) {
        return new ImageEffect(templateItem, resourceInfo, j, j2, j3, j4, j5, z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageEffect)) {
            return false;
        }
        ImageEffect imageEffect = (ImageEffect) obj;
        return Intrinsics.LJFF(this.templateItem, imageEffect.templateItem) && Intrinsics.LJFF(this.resourceInfo, imageEffect.resourceInfo) && this.clickStartTime == imageEffect.clickStartTime && this.downLoadStartTime == imageEffect.downLoadStartTime && this.downLoadEndTime == imageEffect.downLoadEndTime && this.applyStartTime == imageEffect.applyStartTime && this.applyEndTime == imageEffect.applyEndTime && this.zipCache == imageEffect.zipCache;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public int hashCode() {
        TemplateItem templateItem = this.templateItem;
        int iHashCode = (templateItem == null ? 0 : templateItem.hashCode()) * 31;
        ResourceInfo resourceInfo = this.resourceInfo;
        return ((((((((((((iHashCode + (resourceInfo != null ? resourceInfo.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.clickStartTime)) * 31) + C786410Ut5.Y2(this.downLoadStartTime)) * 31) + C786410Ut5.Y2(this.downLoadEndTime)) * 31) + C786410Ut5.Y2(this.applyStartTime)) * 31) + C786410Ut5.Y2(this.applyEndTime)) * 31) + C786410Ut5.Z2(this.zipCache);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageEffect(templateItem=");
        sbLIZ.append(this.templateItem);
        sbLIZ.append(", resourceInfo=");
        sbLIZ.append(this.resourceInfo);
        sbLIZ.append(", clickStartTime=");
        sbLIZ.append(this.clickStartTime);
        sbLIZ.append(", downLoadStartTime=");
        sbLIZ.append(this.downLoadStartTime);
        sbLIZ.append(", downLoadEndTime=");
        sbLIZ.append(this.downLoadEndTime);
        sbLIZ.append(", applyStartTime=");
        sbLIZ.append(this.applyStartTime);
        sbLIZ.append(", applyEndTime=");
        sbLIZ.append(this.applyEndTime);
        sbLIZ.append(", zipCache=");
        sbLIZ.append(this.zipCache);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TemplateItem templateItem = this.templateItem;
        if (templateItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateItem.writeToParcel(parcel, i);
        }
        ResourceInfo resourceInfo = this.resourceInfo;
        if (resourceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resourceInfo.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.clickStartTime);
        parcel.writeLong(this.downLoadStartTime);
        parcel.writeLong(this.downLoadEndTime);
        parcel.writeLong(this.applyStartTime);
        parcel.writeLong(this.applyEndTime);
        parcel.writeInt(this.zipCache ? 1 : 0);
    }

    public final long getApplyEndTime() {
        return this.applyEndTime;
    }

    public final long getApplyStartTime() {
        return this.applyStartTime;
    }

    public final long getClickStartTime() {
        return this.clickStartTime;
    }

    public final long getDownLoadEndTime() {
        return this.downLoadEndTime;
    }

    public final long getDownLoadStartTime() {
        return this.downLoadStartTime;
    }

    public final ResourceInfo getResourceInfo() {
        return this.resourceInfo;
    }

    public final TemplateItem getTemplateItem() {
        return this.templateItem;
    }

    public final boolean getZipCache() {
        return this.zipCache;
    }

    public final void setApplyEndTime(long j) {
        this.applyEndTime = j;
    }

    public final void setApplyStartTime(long j) {
        this.applyStartTime = j;
    }

    public final void setClickStartTime(long j) {
        this.clickStartTime = j;
    }

    public final void setDownLoadEndTime(long j) {
        this.downLoadEndTime = j;
    }

    public final void setDownLoadStartTime(long j) {
        this.downLoadStartTime = j;
    }

    public final void setResourceInfo(ResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public final void setZipCache(boolean z) {
        this.zipCache = z;
    }

    public ImageEffect(TemplateItem templateItem, ResourceInfo resourceInfo, long j, long j2, long j3, long j4, long j5, boolean z) {
        super(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        this.templateItem = templateItem;
        this.resourceInfo = resourceInfo;
        this.clickStartTime = j;
        this.downLoadStartTime = j2;
        this.downLoadEndTime = j3;
        this.applyStartTime = j4;
        this.applyEndTime = j5;
        this.zipCache = z;
    }
}
