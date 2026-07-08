package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SuggestWordStruct implements Serializable {

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("words")
    public List<WordStruct> words;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("hint_text")
    public String hintText = "";

    @C09CT("extra_info")
    public String extraInfo = "";

    @C09CT("qrec_virtual_enable")
    public String qrecVirtualEnable = "";

    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getQrecVirtualEnable() {
        return this.qrecVirtualEnable;
    }

    public final String getScene() {
        return this.scene;
    }

    public final List<WordStruct> getWords() {
        return this.words;
    }

    public final void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public final void setHintText(String str) {
        this.hintText = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setQrecVirtualEnable(String str) {
        this.qrecVirtualEnable = str;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setWords(List<WordStruct> list) {
        this.words = list;
    }
}
