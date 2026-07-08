package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* JADX INFO: loaded from: classes16.dex */
public final class ChangeMaxPositionData {
    public static final Companion Companion = new Companion();
    public final BizChangeLayoutParams bizChangeLayoutParams;
    public final Map<String, String> customData;
    public final String layoutId;
    public final int maxPosition;
    public final int sceneVersion;

    public static final class Builder {
        public BizChangeLayoutParams bizChangeLayoutParams;
        public Map<String, String> customData;
        public String layoutId;
        public int maxPosition;
        public int sceneVersion;

        public final ChangeMaxPositionData build() {
            return new ChangeMaxPositionData(this);
        }

        public final BizChangeLayoutParams getBizChangeLayoutParams() {
            return this.bizChangeLayoutParams;
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final String getLayoutId() {
            return this.layoutId;
        }

        public final int getMaxPosition() {
            return this.maxPosition;
        }

        public final int getSceneVersion() {
            return this.sceneVersion;
        }

        public final void setBizChangeLayoutParams(BizChangeLayoutParams bizChangeLayoutParams) {
            this.bizChangeLayoutParams = bizChangeLayoutParams;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setLayoutId(String str) {
            this.layoutId = str;
        }

        public final void setMaxPosition(int i) {
            this.maxPosition = i;
        }

        public final void setSceneVersion(int i) {
            this.sceneVersion = i;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeMaxPositionData(maxPosition=");
        sbLIZ.append(this.maxPosition);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.layoutId);
        sbLIZ.append(", sceneVersion=");
        sbLIZ.append(this.sceneVersion);
        sbLIZ.append(", customData=");
        sbLIZ.append(this.customData);
        sbLIZ.append(", bizChangeLayoutParams=");
        sbLIZ.append(this.bizChangeLayoutParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final ChangeMaxPositionData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public ChangeMaxPositionData(Builder builder) {
        this(builder.getMaxPosition(), builder.getLayoutId(), builder.getSceneVersion(), builder.getCustomData(), builder.getBizChangeLayoutParams());
    }

    public ChangeMaxPositionData(int i, String str, int i2, Map<String, String> map, BizChangeLayoutParams bizChangeLayoutParams) {
        this.maxPosition = i;
        this.layoutId = str;
        this.sceneVersion = i2;
        this.customData = map;
        this.bizChangeLayoutParams = bizChangeLayoutParams;
    }
}
