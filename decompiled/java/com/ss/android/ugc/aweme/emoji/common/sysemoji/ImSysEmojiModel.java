package com.ss.android.ugc.aweme.emoji.common.sysemoji;

import X.C09CT;
import X.C451570HnH;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ImSysEmojiModel extends com.ss.android.ugc.aweme.emoji.model.Emoji {
    public static final C451570HnH Companion = new Object() { // from class: X.0HnH
    };
    public int LL;

    @C09CT("emoji_list")
    public List<String> emojiList;

    @C09CT("mini_support")
    public String miniSupportSysVersion;

    @C09CT("preview_emoji")
    public String previewEmoji;

    @C09CT("support_skin_type")
    public int supportSkinBusinessType = 1;

    @C09CT("business_type")
    public int businessType = 7;

    public final String getPreviewEmoji() {
        String str = this.previewEmoji;
        if (str != null) {
            return str;
        }
        List<String> list = this.emojiList;
        if (list != null) {
            return (String) ListProtector.get(list, 0);
        }
        return null;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }

    public final String getMiniSupportSysVersion() {
        return this.miniSupportSysVersion;
    }

    public final int getPosition() {
        return this.LL;
    }

    public final int getSupportSkinBusinessType() {
        return this.supportSkinBusinessType;
    }

    public final void setBusinessType(int i) {
        this.businessType = i;
    }

    public final void setEmojiList(List<String> list) {
        this.emojiList = list;
    }

    public final void setMiniSupportSysVersion(String str) {
        this.miniSupportSysVersion = str;
    }

    public final void setPosition(int i) {
        this.LL = i;
    }

    public final void setPreviewEmoji(String str) {
        this.previewEmoji = str;
    }

    public final void setSupportSkinBusinessType(int i) {
        this.supportSkinBusinessType = i;
    }
}
