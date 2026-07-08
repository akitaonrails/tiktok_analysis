package com.ss.android.ugc.aweme.im.messagelist.api.fake.message;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FakeInlineMsgContent implements FakeMsgContent {

    @C09CT("content")
    public final String content;

    @C09CT("msg_type")
    public final int msgType;

    @C09CT("preview_hint")
    public final String previewHint;

    @C09CT("templates")
    public final List<FakeInlineMsgTemplate> templates;

    public FakeInlineMsgContent() {
        this(0, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FakeInlineMsgContent)) {
            return false;
        }
        FakeInlineMsgContent fakeInlineMsgContent = (FakeInlineMsgContent) obj;
        return this.msgType == fakeInlineMsgContent.msgType && Intrinsics.LJFF(this.content, fakeInlineMsgContent.content) && Intrinsics.LJFF(this.templates, fakeInlineMsgContent.templates) && Intrinsics.LJFF(this.previewHint, fakeInlineMsgContent.previewHint);
    }

    public final int hashCode() {
        return (((((this.msgType * 31) + this.content.hashCode()) * 31) + this.templates.hashCode()) * 31) + this.previewHint.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FakeInlineMsgContent(msgType=");
        sbLIZ.append(this.msgType);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", templates=");
        sbLIZ.append(this.templates);
        sbLIZ.append(", previewHint=");
        sbLIZ.append(this.previewHint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.msgType;
    }

    public FakeInlineMsgContent(int i, String str, List<FakeInlineMsgTemplate> list, String str2) {
        this.msgType = i;
        this.content = str;
        this.templates = list;
        this.previewHint = str2;
    }

    public FakeInlineMsgContent(int i, String str, List list, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? "" : str2);
    }
}
