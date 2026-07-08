package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_ai_beauty_ve_bmf_params")
public final class LiveAIBeautyVEBmfParams {
    public static final LiveAIBeautyVEBmfParams INSTANCE = new LiveAIBeautyVEBmfParams();
    public static final AIBeautyVEParamList DEFAULT = new AIBeautyVEParamList(0, 0, 0, 0, 0, "", "", 0, new AesBoostAlgType(0, null, null, 7, null));

    private final AIBeautyVEParamList getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        AIBeautyVEParamList aIBeautyVEParamList = DEFAULT;
        AIBeautyVEParamList aIBeautyVEParamList2 = (AIBeautyVEParamList) settingsManager.getValueSafely("live_ai_beauty_ve_bmf_params", aIBeautyVEParamList);
        return aIBeautyVEParamList2 != null ? aIBeautyVEParamList2 : aIBeautyVEParamList;
    }

    public final AIBeautyVEParamList getValue() {
        return getSettingValue();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class AesBoostAlgType {
        public static final TypeAdapter ADAPTER = new LiveAIBeautyVEBmfParams_AesBoostAlgType_OptTypeAdapter(NormalGson.singleton());

        @C09CT("aesBoostAlgType")
        public int aesBoostAlgType;

        @C09CT("groupIds")
        public List<Integer> groupIds;

        @C09CT("modelNamePrefix")
        public String modelNamePrefix;

        public AesBoostAlgType() {
            this(0, null, null, 7, null);
        }

        public final int getAesBoostAlgType() {
            return this.aesBoostAlgType;
        }

        public final List<Integer> getGroupIds() {
            return this.groupIds;
        }

        public final String getModelNamePrefix() {
            return this.modelNamePrefix;
        }

        public final void setAesBoostAlgType(int i) {
            this.aesBoostAlgType = i;
        }

        public final void setGroupIds(List<Integer> list) {
            this.groupIds = list;
        }

        public final void setModelNamePrefix(String str) {
            this.modelNamePrefix = str;
        }

        public AesBoostAlgType(int i, List<Integer> list, String str) {
            this.aesBoostAlgType = i;
            this.groupIds = list;
            this.modelNamePrefix = str;
        }

        public AesBoostAlgType(int i, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? "" : str);
        }
    }

    /* JADX INFO: loaded from: classes36.dex */
    public static final class AIBeautyVEParamList {
        public static final TypeAdapter ADAPTER = new LiveAIBeautyVEBmfParams_AIBeautyVEParamList_OptTypeAdapter(NormalGson.singleton());

        @C09CT("accessKey")
        public String accessKey;

        @C09CT("aesBoostParams")
        public AesBoostAlgType aesBoostParams;

        @C09CT("algorithmType")
        public int algorithmType;

        @C09CT("backend")
        public int backend;

        @C09CT("maxHeight")
        public int maxHeight;

        @C09CT("maxWidth")
        public int maxWidth;

        @C09CT("modeDownloadUrl")
        public String modeDownloadUrl;

        @C09CT("poolSize")
        public int poolSize;

        @C09CT("texProcessType")
        public int texProcessType;

        public AIBeautyVEParamList() {
            this(0, 0, 0, 0, 0, "", "", 0, new AesBoostAlgType(0, null, null, 7, null));
        }

        public final String getAccessKey() {
            return this.accessKey;
        }

        public final AesBoostAlgType getAesBoostParams() {
            return this.aesBoostParams;
        }

        public final int getAlgorithmType() {
            return this.algorithmType;
        }

        public final int getBackend() {
            return this.backend;
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final int getMaxWidth() {
            return this.maxWidth;
        }

        public final String getModeDownloadUrl() {
            return this.modeDownloadUrl;
        }

        public final int getPoolSize() {
            return this.poolSize;
        }

        public final int getTexProcessType() {
            return this.texProcessType;
        }

        public final void setAccessKey(String str) {
            this.accessKey = str;
        }

        public final void setAesBoostParams(AesBoostAlgType aesBoostAlgType) {
            this.aesBoostParams = aesBoostAlgType;
        }

        public final void setAlgorithmType(int i) {
            this.algorithmType = i;
        }

        public final void setBackend(int i) {
            this.backend = i;
        }

        public final void setMaxHeight(int i) {
            this.maxHeight = i;
        }

        public final void setMaxWidth(int i) {
            this.maxWidth = i;
        }

        public final void setModeDownloadUrl(String str) {
            this.modeDownloadUrl = str;
        }

        public final void setPoolSize(int i) {
            this.poolSize = i;
        }

        public final void setTexProcessType(int i) {
            this.texProcessType = i;
        }

        public AIBeautyVEParamList(int i, int i2, int i3, int i4, int i5, String str, String str2, int i6, AesBoostAlgType aesBoostAlgType) {
            this.algorithmType = i;
            this.backend = i2;
            this.poolSize = i3;
            this.maxWidth = i4;
            this.maxHeight = i5;
            this.modeDownloadUrl = str;
            this.accessKey = str2;
            this.texProcessType = i6;
            this.aesBoostParams = aesBoostAlgType;
        }
    }
}
