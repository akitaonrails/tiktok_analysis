package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatIntroCardMsgContent extends BaseContent {

    @C09CT("image")
    public final UrlModel image;

    @C09CT("intro_content")
    public final String introContent;

    public ChatIntroCardMsgContent() {
        this(null, "");
    }

    public final ChatIntroCardMsgContent copy(UrlModel urlModel, String str) {
        return new ChatIntroCardMsgContent(urlModel, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatIntroCardMsgContent)) {
            return false;
        }
        ChatIntroCardMsgContent chatIntroCardMsgContent = (ChatIntroCardMsgContent) obj;
        return Intrinsics.LJFF(this.image, chatIntroCardMsgContent.image) && Intrinsics.LJFF(this.introContent, chatIntroCardMsgContent.introContent);
    }

    public int hashCode() {
        UrlModel urlModel = this.image;
        return ((urlModel == null ? 0 : urlModel.hashCode()) * 31) + this.introContent.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatIntroCardMsgContent(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", introContent=");
        sbLIZ.append(this.introContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final String getIntroContent() {
        return this.introContent;
    }

    public ChatIntroCardMsgContent(UrlModel urlModel, String str) {
        this.image = urlModel;
        this.introContent = str;
    }
}
