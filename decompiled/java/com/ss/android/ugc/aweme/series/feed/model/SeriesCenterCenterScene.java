package com.ss.android.ugc.aweme.series.feed.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenterCenterScene implements Serializable {

    @C09CT("category_id")
    public String categoryId;

    @C09CT("metric_name")
    public String metricName;

    @C09CT("name")
    public String name;

    @C09CT(Scene.SCENE_SERVICE)
    public SeriesCenterSceneEnum scene;

    public SeriesCenterCenterScene() {
        this(SeriesCenterSceneEnum.NONE, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesCenterCenterScene)) {
            return false;
        }
        SeriesCenterCenterScene seriesCenterCenterScene = (SeriesCenterCenterScene) obj;
        return this.scene == seriesCenterCenterScene.scene && Intrinsics.LJFF(this.categoryId, seriesCenterCenterScene.categoryId) && Intrinsics.LJFF(this.name, seriesCenterCenterScene.name) && Intrinsics.LJFF(this.metricName, seriesCenterCenterScene.metricName);
    }

    public int hashCode() {
        SeriesCenterSceneEnum seriesCenterSceneEnum = this.scene;
        int iHashCode = (seriesCenterSceneEnum == null ? 0 : seriesCenterSceneEnum.hashCode()) * 31;
        String str = this.categoryId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metricName;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setMetricName(String str) {
        this.metricName = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setScene(SeriesCenterSceneEnum seriesCenterSceneEnum) {
        this.scene = seriesCenterSceneEnum;
    }

    public SeriesCenterCenterScene(SeriesCenterSceneEnum seriesCenterSceneEnum, String str, String str2, String str3) {
        this.scene = seriesCenterSceneEnum;
        this.categoryId = str;
        this.name = str2;
        this.metricName = str3;
    }
}
