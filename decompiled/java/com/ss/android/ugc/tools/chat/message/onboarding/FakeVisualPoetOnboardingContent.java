package com.ss.android.ugc.tools.chat.message.onboarding;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class FakeVisualPoetOnboardingContent extends BaseContent implements FakeMsgContent {
    public static final int $stable = 8;
    public final int LL;

    @C09CT("fake_id")
    public final String fakeId;

    @C09CT("text")
    public final String text;

    public final FakeVisualPoetOnboardingContent copy(String str, String str2) {
        return new FakeVisualPoetOnboardingContent(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FakeVisualPoetOnboardingContent)) {
            return false;
        }
        FakeVisualPoetOnboardingContent fakeVisualPoetOnboardingContent = (FakeVisualPoetOnboardingContent) obj;
        return Intrinsics.LJFF(this.text, fakeVisualPoetOnboardingContent.text) && Intrinsics.LJFF(this.fakeId, fakeVisualPoetOnboardingContent.fakeId);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.fakeId.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FakeVisualPoetOnboardingContent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", fakeId=");
        sbLIZ.append(this.fakeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FakeVisualPoetOnboardingContent() {
        this("", "");
    }

    public final String getFakeId() {
        return this.fakeId;
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public int getMsgType() {
        return this.LL;
    }

    public final String getText() {
        return this.text;
    }

    public FakeVisualPoetOnboardingContent(String str, String str2) {
        this.text = str;
        this.fakeId = str2;
        this.LL = 4065;
    }
}
