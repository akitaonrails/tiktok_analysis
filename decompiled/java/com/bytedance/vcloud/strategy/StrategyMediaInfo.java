package com.bytedance.vcloud.strategy;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class StrategyMediaInfo {
    public Boolean isLast;
    public int isLive;
    public String mediaId;
    public String mediaInfo;
    public JSONObject mediaJsonObject;
    public Boolean needRemove;
    public IPreloadTaskCallbackListener preloadTaskListener;
    public String sceneId;
    public ISelectBitrateListener selectBitrateListener;

    public static class Builder {
        public Boolean isLast;
        public int isLive;
        public String mediaId;
        public String mediaInfo;
        public JSONObject mediaJsonObject;
        public Boolean needRemove;
        public IPreloadTaskCallbackListener preloadTaskListener;
        public String sceneId;
        public ISelectBitrateListener selectBitrateListener;

        public StrategyMediaInfo build() {
            return new StrategyMediaInfo(this);
        }

        public Builder isLast(Boolean bool) {
            this.isLast = bool;
            return this;
        }

        public Builder isLive(int i) {
            this.isLive = i;
            return this;
        }

        public Builder mediaId(String str) {
            this.mediaId = str;
            return this;
        }

        public Builder needRemove(Boolean bool) {
            this.needRemove = bool;
            return this;
        }

        public Builder sceneId(String str) {
            this.sceneId = str;
            return this;
        }

        public Builder(String str, IPreloadTaskCallbackListener iPreloadTaskCallbackListener, ISelectBitrateListener iSelectBitrateListener) {
            Boolean bool = Boolean.FALSE;
            this.isLast = bool;
            this.needRemove = bool;
            this.mediaJsonObject = null;
            this.mediaInfo = str;
            this.preloadTaskListener = iPreloadTaskCallbackListener;
            this.selectBitrateListener = iSelectBitrateListener;
        }

        public Builder(JSONObject jSONObject, IPreloadTaskCallbackListener iPreloadTaskCallbackListener, ISelectBitrateListener iSelectBitrateListener) {
            Boolean bool = Boolean.FALSE;
            this.isLast = bool;
            this.needRemove = bool;
            this.mediaInfo = null;
            this.mediaJsonObject = jSONObject;
            this.preloadTaskListener = iPreloadTaskCallbackListener;
            this.selectBitrateListener = iSelectBitrateListener;
        }
    }

    public Boolean getIsLast() {
        return this.isLast;
    }

    public int getIsLive() {
        return this.isLive;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public String getMediaInfo() {
        return this.mediaInfo;
    }

    public JSONObject getMediaJsonObject() {
        return this.mediaJsonObject;
    }

    public Boolean getNeedRemove() {
        return this.needRemove;
    }

    public IPreloadTaskCallbackListener getPreloadTaskListener() {
        return this.preloadTaskListener;
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public ISelectBitrateListener getSelectBitrateListener() {
        return this.selectBitrateListener;
    }

    public StrategyMediaInfo(Builder builder) {
        Boolean bool = Boolean.FALSE;
        this.isLast = bool;
        this.needRemove = bool;
        this.mediaJsonObject = null;
        this.preloadTaskListener = null;
        this.selectBitrateListener = null;
        this.mediaInfo = builder.mediaInfo;
        this.sceneId = builder.sceneId;
        this.mediaId = builder.mediaId;
        this.isLive = builder.isLive;
        this.isLast = builder.isLast;
        this.needRemove = builder.needRemove;
        this.mediaJsonObject = builder.mediaJsonObject;
        this.preloadTaskListener = builder.preloadTaskListener;
        this.selectBitrateListener = builder.selectBitrateListener;
    }

    public StrategyMediaInfo(String str, IPreloadTaskCallbackListener iPreloadTaskCallbackListener, ISelectBitrateListener iSelectBitrateListener) {
        Boolean bool = Boolean.FALSE;
        this.isLast = bool;
        this.needRemove = bool;
        this.mediaJsonObject = null;
        this.mediaInfo = str;
        this.preloadTaskListener = iPreloadTaskCallbackListener;
        this.selectBitrateListener = iSelectBitrateListener;
    }

    public StrategyMediaInfo(JSONObject jSONObject, IPreloadTaskCallbackListener iPreloadTaskCallbackListener, ISelectBitrateListener iSelectBitrateListener) {
        Boolean bool = Boolean.FALSE;
        this.isLast = bool;
        this.needRemove = bool;
        this.mediaJsonObject = jSONObject;
        this.preloadTaskListener = iPreloadTaskCallbackListener;
        this.selectBitrateListener = iSelectBitrateListener;
    }
}
