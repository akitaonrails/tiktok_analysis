package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FakeInlineMessageContent extends FakeMessageContent {
    public static final Companion Companion = new Companion();

    @C09CT("action")
    public final int clickInlineAction;

    @C09CT("copy")
    public final String copy;

    @C09CT("order_index")
    public final long previousMsgOrderIndex;

    @C09CT("span")
    public final String spanString;

    @C09CT("user_id")
    public final String userId;

    public static final class Companion {
    }

    public final FakeInlineMessageContent copy(long j, int i, String str, String str2, String str3) {
        return new FakeInlineMessageContent(j, i, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FakeInlineMessageContent)) {
            return false;
        }
        FakeInlineMessageContent fakeInlineMessageContent = (FakeInlineMessageContent) obj;
        return this.previousMsgOrderIndex == fakeInlineMessageContent.previousMsgOrderIndex && this.clickInlineAction == fakeInlineMessageContent.clickInlineAction && Intrinsics.LJFF(this.spanString, fakeInlineMessageContent.spanString) && Intrinsics.LJFF(this.copy, fakeInlineMessageContent.copy) && Intrinsics.LJFF(this.userId, fakeInlineMessageContent.userId);
    }

    public int hashCode() {
        return (((((((C786410Ut5.Y2(this.previousMsgOrderIndex) * 31) + this.clickInlineAction) * 31) + this.spanString.hashCode()) * 31) + this.copy.hashCode()) * 31) + this.userId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FakeInlineMessageContent(previousMsgOrderIndex=");
        sbLIZ.append(this.previousMsgOrderIndex);
        sbLIZ.append(", clickInlineAction=");
        sbLIZ.append(this.clickInlineAction);
        sbLIZ.append(", spanString=");
        sbLIZ.append(this.spanString);
        sbLIZ.append(", copy=");
        sbLIZ.append(this.copy);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FakeInlineMessageContent() {
        this(0L, -1, "", "", "");
    }

    private final boolean isTemplateDataValid() {
        return this.clickInlineAction != -1;
    }

    public final SystemContent toSystemContent() {
        SystemContent systemContent = new SystemContent();
        if (isTemplateDataValid()) {
            SystemContent.Key key = new SystemContent.Key();
            key.setKey("%s");
            key.setAction(this.clickInlineAction);
            key.setName(this.spanString);
            systemContent.setTemplate(new SystemContent.Key[]{key});
        }
        systemContent.setTips(this.copy);
        return systemContent;
    }

    public final int getClickInlineAction() {
        return this.clickInlineAction;
    }

    public final String getCopy() {
        return this.copy;
    }

    public final long getPreviousMsgOrderIndex() {
        return this.previousMsgOrderIndex;
    }

    public final String getSpanString() {
        return this.spanString;
    }

    public final String getUserId() {
        return this.userId;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent
    public boolean needUpdate(FakeMessageContent fakeMessageContent) {
        if (!(fakeMessageContent instanceof FakeInlineMessageContent) || ((FakeInlineMessageContent) fakeMessageContent).previousMsgOrderIndex == this.previousMsgOrderIndex) {
            return false;
        }
        return true;
    }

    public FakeInlineMessageContent(long j, int i, String str, String str2, String str3) {
        this.previousMsgOrderIndex = j;
        this.clickInlineAction = i;
        this.spanString = str;
        this.copy = str2;
        this.userId = str3;
    }
}
