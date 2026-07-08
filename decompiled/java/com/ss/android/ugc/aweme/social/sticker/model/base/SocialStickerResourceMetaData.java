package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class SocialStickerResourceMetaData implements Serializable {
    public static final int $stable = 8;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("effect_name")
    public String effectSubPath;

    @C09CT("fallback_res_id")
    public Integer fallbackResId;

    @C09CT("gecko_param")
    public GeckoResourceParam geckoParam;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("is_circle")
    public Boolean isCircle;

    @C09CT("local_url")
    public String localPath;

    @C09CT("remote_url")
    public UrlModel remoteUrl;

    @C09CT("type")
    public int type;

    public SocialStickerResourceMetaData() {
        this("", 0, null, null, null, null, null, null, null);
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectSubPath() {
        return this.effectSubPath;
    }

    public final Integer getFallbackResId() {
        return this.fallbackResId;
    }

    public final GeckoResourceParam getGeckoParam() {
        return this.geckoParam;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final UrlModel getRemoteUrl() {
        return this.remoteUrl;
    }

    public final int getType() {
        return this.type;
    }

    public final Boolean isCircle() {
        return this.isCircle;
    }

    public final void setCircle(Boolean bool) {
        this.isCircle = bool;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setEffectSubPath(String str) {
        this.effectSubPath = str;
    }

    public final void setFallbackResId(Integer num) {
        this.fallbackResId = num;
    }

    public final void setGeckoParam(GeckoResourceParam geckoResourceParam) {
        this.geckoParam = geckoResourceParam;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setRemoteUrl(UrlModel urlModel) {
        this.remoteUrl = urlModel;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public SocialStickerResourceMetaData(String str, int i, Integer num, UrlModel urlModel, String str2, String str3, GeckoResourceParam geckoResourceParam, String str4, Boolean bool) {
        this.id = str;
        this.type = i;
        this.fallbackResId = num;
        this.remoteUrl = urlModel;
        this.effectId = str2;
        this.effectSubPath = str3;
        this.geckoParam = geckoResourceParam;
        this.localPath = str4;
        this.isCircle = bool;
    }
}
