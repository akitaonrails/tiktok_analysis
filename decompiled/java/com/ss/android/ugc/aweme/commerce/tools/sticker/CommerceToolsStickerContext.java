package com.ss.android.ugc.aweme.commerce.tools.sticker;

import X.C09CT;
import X.C1697810uHb;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class CommerceToolsStickerContext implements Serializable, Parcelable {
    public static final Parcelable.Creator<CommerceToolsStickerContext> CREATOR = new Parcelable.Creator<CommerceToolsStickerContext>() { // from class: X.0noC
        @Override // android.os.Parcelable.Creator
        public final CommerceToolsStickerContext createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CommerceToolsStickerContext();
        }

        @Override // android.os.Parcelable.Creator
        public final CommerceToolsStickerContext[] newArray(int i) {
            return new CommerceToolsStickerContext[i];
        }
    };

    @C09CT("favorite_source")
    public String favoriteSource;

    @C09CT("from_prop_id")
    public String fromPropId;

    @C09CT("has_commerce_sticker_metadata")
    public boolean hasCommerceStickerMetaData;

    @C09CT("has_ibe_metadata")
    public boolean hasIBEMetaData;

    @C09CT("impr_position")
    public Integer imprPosition;

    @C09CT("is_from_carousal")
    public boolean isCarousalOpen;

    @C09CT("is_default_prop")
    public String isDefaultProp;

    @C09CT("is_prop_panel_cache")
    public boolean isPropPanelCache;

    @C09CT("preset_effect_id")
    public String presetEffectId;

    @C09CT("prop_basic_event_params")
    public Map<String, String> propBasicEventParams;

    @C09CT("prop_category")
    public String propCategory;

    @C09CT("prop_id")
    public String propId;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("start_use_time")
    public Long startUseTime;

    @C09CT("started_use_effect")
    public boolean startedUsingEffect;

    @C09CT("tab_key")
    public String tabKey;

    @C09CT("tab_name")
    public String tabName;

    @C09CT("from_source")
    public int fromSource = -1;

    @C09CT("effect_sdk_extra")
    public String effectSdkExtra = "";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final String getEffectSdkExtra() {
        return this.effectSdkExtra;
    }

    public final String getFavoriteSource() {
        return this.favoriteSource;
    }

    public final String getFromPropId() {
        return this.fromPropId;
    }

    public final int getFromSource() {
        return this.fromSource;
    }

    public final boolean getHasCommerceStickerMetaData() {
        return this.hasCommerceStickerMetaData;
    }

    public final boolean getHasIBEMetaData() {
        return this.hasIBEMetaData;
    }

    public final Integer getImprPosition() {
        return this.imprPosition;
    }

    public final String getPresetEffectId() {
        return this.presetEffectId;
    }

    public final Map<String, String> getPropBasicEventParams() {
        return this.propBasicEventParams;
    }

    public final String getPropCategory() {
        return this.propCategory;
    }

    public final String getPropId() {
        return this.propId;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final Long getStartUseTime() {
        return this.startUseTime;
    }

    public final boolean getStartedUsingEffect() {
        return this.startedUsingEffect;
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final boolean isCarousalOpen() {
        return this.isCarousalOpen;
    }

    public final String isDefaultProp() {
        return this.isDefaultProp;
    }

    public final boolean isPropPanelCache() {
        return this.isPropPanelCache;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (!C1697810uHb.LJIIJJI(-1, 0, 1, 2, 3).contains(Integer.valueOf(this.fromSource))) {
            this.fromSource = -1;
        }
    }

    public final void setCarousalOpen(boolean z) {
        this.isCarousalOpen = z;
    }

    public final void setDefaultProp(String str) {
        this.isDefaultProp = str;
    }

    public final void setEffectSdkExtra(String str) {
        this.effectSdkExtra = str;
    }

    public final void setFavoriteSource(String str) {
        this.favoriteSource = str;
    }

    public final void setFromPropId(String str) {
        this.fromPropId = str;
    }

    public final void setFromSource(int i) {
        this.fromSource = i;
    }

    public final void setHasCommerceStickerMetaData(boolean z) {
        this.hasCommerceStickerMetaData = z;
    }

    public final void setHasIBEMetaData(boolean z) {
        this.hasIBEMetaData = z;
    }

    public final void setImprPosition(Integer num) {
        this.imprPosition = num;
    }

    public final void setPresetEffectId(String str) {
        this.presetEffectId = str;
    }

    public final void setPropBasicEventParams(Map<String, String> map) {
        this.propBasicEventParams = map;
    }

    public final void setPropCategory(String str) {
        this.propCategory = str;
    }

    public final void setPropId(String str) {
        this.propId = str;
    }

    public final void setPropPanelCache(boolean z) {
        this.isPropPanelCache = z;
    }

    public final void setResourceId(String str) {
        this.resourceId = str;
    }

    public final void setStartUseTime(Long l) {
        this.startUseTime = l;
    }

    public final void setStartedUsingEffect(boolean z) {
        this.startedUsingEffect = z;
    }

    public final void setTabKey(String str) {
        this.tabKey = str;
    }

    public final void setTabName(String str) {
        this.tabName = str;
    }
}
