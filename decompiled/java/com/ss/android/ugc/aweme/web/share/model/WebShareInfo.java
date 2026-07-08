package com.ss.android.ugc.aweme.web.share.model;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class WebShareInfo implements Serializable {
    public String LL;
    public String LLILLJJLI;
    public Boolean LLILLL;
    public Boolean LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public int LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public HybridContainerInfo LLJJI;

    public static class HybridContainerInfo implements Serializable {
        public String captureViewName;
        public boolean hideWhenPanelHeightRise;
        public Map<String, String> initData;
        public float offsetX;
        public float offsetY;
        public String url;
        public String urlContent;
        public int urlContentType = 1;
        public int alignType = 1;
        public float width = 100.0f;
        public float height = 100.0f;
        public float bgAlpha = 0.7f;
    }

    public String getDesc() {
        return this.LLILLJJLI;
    }

    public Boolean getDisableAppendParam() {
        return this.LLILZ;
    }

    public Boolean getEnableCopyLinkDesc() {
        return this.LLILLL;
    }

    public String getEnterFrom() {
        return this.LLJILJIL;
    }

    public HybridContainerInfo getHybridContainerInfo() {
        return this.LLJJI;
    }

    public String getImage() {
        return this.LLILZIL;
    }

    public String getImageData() {
        return this.LLJ;
    }

    public String getImagePath() {
        return this.LLIZLLLIL;
    }

    public String getReferralEnterFrom() {
        return this.LLJILLL;
    }

    public String getReferralPageEnterFrom() {
        return this.LLJILJILJ;
    }

    public String getShareItemId() {
        return this.LLJJ;
    }

    public int getShareMode() {
        return this.LLJIJIL;
    }

    public String getTips() {
        return this.LLIZ;
    }

    public String getTitle() {
        return this.LL;
    }

    public String getType() {
        return this.LLJI;
    }

    public String getUrl() {
        return this.LLILZLL;
    }

    public void setDesc(String str) {
        this.LLILLJJLI = str;
    }

    public void setDisableAppendParam(Boolean bool) {
        this.LLILZ = bool;
    }

    public void setEnableCopyLinkDesc(Boolean bool) {
        this.LLILLL = bool;
    }

    public void setEnterFrom(String str) {
        this.LLJILJIL = str;
    }

    public void setHybridContainerInfo(HybridContainerInfo hybridContainerInfo) {
        this.LLJJI = hybridContainerInfo;
    }

    public void setImage(String str) {
        this.LLILZIL = str;
    }

    public void setImageData(String str) {
        this.LLJ = str;
    }

    public void setImagePath(String str) {
        this.LLIZLLLIL = str;
    }

    public void setReferralEnterFrom(String str) {
        this.LLJILLL = str;
    }

    public void setReferralPageEnterFrom(String str) {
        this.LLJILJILJ = str;
    }

    public void setShareItemId(String str) {
        this.LLJJ = str;
    }

    public void setShareMode(int i) {
        this.LLJIJIL = i;
    }

    public void setTips(String str) {
        this.LLIZ = str;
    }

    public void setTitle(String str) {
        this.LL = str;
    }

    public void setType(int i) {
        this.LLJI = this.LLJI;
    }

    public void setUrl(String str) {
        this.LLILZLL = str;
    }

    public WebShareInfo(int i, String str, String str2, String str3, String str4, HybridContainerInfo hybridContainerInfo, Boolean bool, Boolean bool2) {
        this.LLJIJIL = i;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LL = str3;
        this.LLILLJJLI = str4;
        this.LLJJI = hybridContainerInfo;
        this.LLILLL = bool;
        this.LLILZ = bool2;
    }

    public WebShareInfo(String str, String str2, int i, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = i;
        this.LL = str3;
        this.LLILLJJLI = str4;
        this.LLILZLL = str5;
        this.LLILLL = bool;
        this.LLILZ = bool2;
    }

    public WebShareInfo(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLILLL = bool;
        this.LLILZ = bool2;
    }
}
