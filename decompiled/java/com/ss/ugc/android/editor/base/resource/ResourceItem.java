package com.ss.ugc.android.editor.base.resource;

import X.C357590E0f;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class ResourceItem {
    public int alignType;
    public String animationType;
    public C357590E0f category;
    public List<Float> color;
    public String designerId;
    public Drawable drawableIcon;
    public Long duration;
    public String extra;
    public String hint;
    public String icon;
    public boolean isNegativeAdjust;
    public String mask;
    public String name;
    public String name_en;
    public int order;
    public boolean overlap;
    public ResourceItem parentResource;
    public String path;
    public List<Integer> rgb;
    public String sdkExtra;
    public String selectedIcon;
    public String singer;
    public int source;
    public String stickerType;
    public StyleBean style;
    public String tags;
    public Double transitionDefaultDuration;
    public Bitmap videoFrame;
    public Double videoAnimDefaultDuration = Double.valueOf(0.0d);
    public String resourceId = "";
    public String effectId = "";
    public ArrayList<ResourceItem> childResources = new ArrayList<>();
    public Float blurRadius = Float.valueOf(0.0f);
    public String gameplayType = "";
    public ArrayList<String> magicResourceTypeList = new ArrayList<>();
    public boolean isNullItem = false;
    public List<ResourceItem> dep = Collections.emptyList();
    public Boolean isFavorite = Boolean.FALSE;

    public String getName() {
        return (TextUtils.equals(C786410Ut5.t2(Locale.getDefault()), "zh") || TextUtils.isEmpty(this.name_en)) ? this.name : this.name_en;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class StyleBean {
        public List<Float> backgroundColor;
        public List<Float> outlineColor;
        public List<Float> shadowColor;
        public List<Float> textColor;

        public List<Float> getBackgroundColor() {
            return this.backgroundColor;
        }

        public List<Float> getOutlineColor() {
            return this.outlineColor;
        }

        public List<Float> getShadowColor() {
            return this.shadowColor;
        }

        public List<Float> getTextColor() {
            return this.textColor;
        }

        public void setBackgroundColor(List<Float> list) {
            this.backgroundColor = list;
        }

        public void setOutlineColor(List<Float> list) {
            this.outlineColor = list;
        }

        public void setShadowColor(List<Float> list) {
            this.shadowColor = list;
        }

        public void setTextColor(List<Float> list) {
            this.textColor = list;
        }
    }

    public int getAlignType() {
        return this.alignType;
    }

    public String getAnimationType() {
        return this.animationType;
    }

    public Float getBlurRadius() {
        return this.blurRadius;
    }

    public C357590E0f getCategory() {
        return this.category;
    }

    public ArrayList<ResourceItem> getChildResources() {
        return this.childResources;
    }

    public List<Float> getColor() {
        return this.color;
    }

    public List<ResourceItem> getDep() {
        return this.dep;
    }

    public Drawable getDrawableIcon() {
        return this.drawableIcon;
    }

    public Long getDuration() {
        return this.duration;
    }

    public String getEffectId() {
        return this.effectId;
    }

    public String getExtra() {
        return this.extra;
    }

    public Boolean getFavorite() {
        return this.isFavorite;
    }

    public String getGameplayType() {
        return this.gameplayType;
    }

    public String getHint() {
        return this.hint;
    }

    public String getIcon() {
        return this.icon;
    }

    public boolean getIsNegativeAdjust() {
        return this.isNegativeAdjust;
    }

    public ArrayList<String> getMagicResourceTypeList() {
        return this.magicResourceTypeList;
    }

    public String getMask() {
        return this.mask;
    }

    public String getNameEn() {
        return this.name_en;
    }

    public int getOrder() {
        return this.order;
    }

    public ResourceItem getParentResource() {
        return this.parentResource;
    }

    public String getPath() {
        return this.path;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public String getSelectedIcon() {
        return this.selectedIcon;
    }

    public String getSinger() {
        return this.singer;
    }

    public String getStickerType() {
        return this.stickerType;
    }

    public StyleBean getStyle() {
        return this.style;
    }

    public String getTags() {
        return this.tags;
    }

    public Double getTransitionDefaultDuration() {
        return this.transitionDefaultDuration;
    }

    public Double getVideoAnimDefaultDuration() {
        return this.videoAnimDefaultDuration;
    }

    public Bitmap getVideoFrame() {
        return this.videoFrame;
    }

    public void setAlignType(int i) {
        this.alignType = i;
    }

    public void setAnimationType(String str) {
        this.animationType = str;
    }

    public void setBlurRadius(Float f) {
        this.blurRadius = f;
    }

    public void setCategory(C357590E0f c357590E0f) {
        this.category = c357590E0f;
    }

    public void setChildResources(ArrayList<ResourceItem> arrayList) {
        this.childResources = arrayList;
    }

    public void setColor(List<Float> list) {
        this.color = list;
    }

    public void setDep(List<ResourceItem> list) {
        this.dep = list;
    }

    public void setDrawableIcon(Drawable drawable) {
        this.drawableIcon = drawable;
    }

    public void setDuration(long j) {
        this.duration = Long.valueOf(j);
    }

    public void setEffectId(String str) {
        this.effectId = str;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFavorite(Boolean bool) {
        this.isFavorite = bool;
    }

    public void setGameplayType(String str) {
        this.gameplayType = str;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIsNegativeAdjust(boolean z) {
        this.isNegativeAdjust = z;
    }

    public void setMagicResourceTypeList(ArrayList<String> arrayList) {
        this.magicResourceTypeList = arrayList;
    }

    public void setMask(String str) {
        this.mask = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNameEn(String str) {
        this.name_en = str;
    }

    public void setOrder(int i) {
        this.order = i;
    }

    public void setParentResource(ResourceItem resourceItem) {
        this.parentResource = resourceItem;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setResourceId(String str) {
        this.resourceId = str;
    }

    public void setSelectedIcon(String str) {
        this.selectedIcon = str;
    }

    public void setSinger(String str) {
        this.singer = str;
    }

    public void setStickerType(String str) {
        this.stickerType = str;
    }

    public void setStyle(StyleBean styleBean) {
        this.style = styleBean;
    }

    public void setTags(String str) {
        this.tags = str;
    }

    public void setTransitionDefaultDuration(Double d) {
        this.transitionDefaultDuration = d;
    }

    public void setVideoAnimDefaultDuration(Double d) {
        this.videoAnimDefaultDuration = d;
    }

    public void setVideoFrame(Bitmap bitmap) {
        this.videoFrame = bitmap;
    }
}
