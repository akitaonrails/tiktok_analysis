package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C869590Y9l;
import X.C869680Y9u;
import X.InterfaceC1294060jmO;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1294060jmO
public final class FakeMessage extends C869590Y9l {
    public FakeMessageContent fakeContent;

    public static final class Builder extends C869680Y9u {
        public Builder() {
            super(1234L, "sec_uid");
        }

        @Override // X.C869680Y9u
        public FakeMessage newMessage() {
            return new FakeMessage();
        }

        public final Builder setFakeContent(FakeMessageContent fakeMessageContent) {
            ((FakeMessage) this.msg).fakeContent = fakeMessageContent;
            return this;
        }
    }

    public final FakeMessageContent getFakeContent() {
        return this.fakeContent;
    }

    public final boolean needUpdate(FakeMessage fakeMessage) {
        FakeMessageContent fakeMessageContent = this.fakeContent;
        if (fakeMessageContent == null || !fakeMessageContent.needUpdate(fakeMessage.fakeContent)) {
            return false;
        }
        return true;
    }
}
