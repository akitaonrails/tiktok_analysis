package com.bytedance.hybrid.spark.raven.component;

import X.C09CT;
import X.C1161180gK4;
import X.EnumC1160590gJ7;
import X.InterfaceC1891350zJl;
import com.bytedance.hybrid.spark.raven.model.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseComponentData extends BaseResponse implements InterfaceC1891350zJl {
    public int backgroundColor;
    public int backgroundColorDark;
    public C1161180gK4 componentType;
    public int gap;
    public String instanceId;

    @C09CT("is_skeleton")
    public Boolean isSkeleton;
    public int paddingBottom;
    public int paddingLeft;
    public int paddingRight;
    public int paddingTop;

    @C09CT("skeleton_to_instance_id")
    public String skeletonToInstanceId;
    public String updateType;
    public EnumC1160590gJ7 groupLayoutType = EnumC1160590gJ7.LIST;
    public int column = 1;

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int getBackgroundColor$spark_raven_release() {
        return this.backgroundColor;
    }

    public final int getBackgroundColorDark$spark_raven_release() {
        return this.backgroundColorDark;
    }

    public final int getColumn$spark_raven_release() {
        return this.column;
    }

    public final C1161180gK4 getComponentType$spark_raven_release() {
        return this.componentType;
    }

    public final int getGap$spark_raven_release() {
        return this.gap;
    }

    public final EnumC1160590gJ7 getGroupLayoutType$spark_raven_release() {
        return this.groupLayoutType;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final int getPaddingBottom$spark_raven_release() {
        return this.paddingBottom;
    }

    public final int getPaddingLeft$spark_raven_release() {
        return this.paddingLeft;
    }

    public final int getPaddingRight$spark_raven_release() {
        return this.paddingRight;
    }

    public final int getPaddingTop$spark_raven_release() {
        return this.paddingTop;
    }

    public final String getSkeletonToInstanceId() {
        return this.skeletonToInstanceId;
    }

    public final String getUpdateType$spark_raven_release() {
        return this.updateType;
    }

    public final String instanceId() {
        return this.instanceId;
    }

    public final Boolean isSkeleton() {
        return this.isSkeleton;
    }

    public final String updateType() {
        return this.updateType;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        BaseComponentData baseComponentData;
        if (interfaceC1891350zJl instanceof BaseComponentData) {
            baseComponentData = (BaseComponentData) interfaceC1891350zJl;
        } else {
            baseComponentData = null;
        }
        return areContentsTheSame(baseComponentData);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        BaseComponentData baseComponentData;
        String str = this.instanceId;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof BaseComponentData) && (baseComponentData = (BaseComponentData) interfaceC1891350zJl) != null) {
            str2 = baseComponentData.instanceId;
        }
        if (!Intrinsics.LJFF(str, str2) && !areContentsTheSame(interfaceC1891350zJl)) {
            return false;
        }
        return true;
    }

    public final void setBackgroundColor$spark_raven_release(int i) {
        this.backgroundColor = i;
    }

    public final void setBackgroundColorDark$spark_raven_release(int i) {
        this.backgroundColorDark = i;
    }

    public final void setColumn$spark_raven_release(int i) {
        this.column = i;
    }

    public final void setComponentType$spark_raven_release(C1161180gK4 c1161180gK4) {
        this.componentType = c1161180gK4;
    }

    public final void setGap$spark_raven_release(int i) {
        this.gap = i;
    }

    public final void setGroupLayoutType$spark_raven_release(EnumC1160590gJ7 enumC1160590gJ7) {
        this.groupLayoutType = enumC1160590gJ7;
    }

    public final void setInstanceId(String str) {
        this.instanceId = str;
    }

    public final void setPaddingBottom$spark_raven_release(int i) {
        this.paddingBottom = i;
    }

    public final void setPaddingLeft$spark_raven_release(int i) {
        this.paddingLeft = i;
    }

    public final void setPaddingRight$spark_raven_release(int i) {
        this.paddingRight = i;
    }

    public final void setPaddingTop$spark_raven_release(int i) {
        this.paddingTop = i;
    }

    public final void setSkeleton(Boolean bool) {
        this.isSkeleton = bool;
    }

    public final void setSkeletonToInstanceId(String str) {
        this.skeletonToInstanceId = str;
    }

    public final void setUpdateType$spark_raven_release(String str) {
        this.updateType = str;
    }

    public boolean areContentsTheSame(BaseComponentData baseComponentData) {
        return Intrinsics.LJFF(baseComponentData, this);
    }
}
