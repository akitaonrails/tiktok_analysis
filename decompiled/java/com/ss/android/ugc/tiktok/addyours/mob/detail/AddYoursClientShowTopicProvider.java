package com.ss.android.ugc.tiktok.addyours.mob.detail;

import X.C00F4;
import X.C1554960qZC;
import X.C308560C7q;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursClientShowTopicProvider implements EventParamsProtocol<C00F4> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C00F4 getParam() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        AddYoursTopic addYoursTopic;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "topic", AddYoursTopic.class, null)) == null || (addYoursTopic = (AddYoursTopic) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        Long topicId = addYoursTopic.getTopicId();
        String text = addYoursTopic.getText();
        Aweme video = addYoursTopic.getVideo();
        return new C00F4(topicId, text, video != null ? AwemeExtKt.getAuthorUid(video) : null, C308560C7q.LIZIZ(addYoursTopic.getViewerInvited()));
    }

    public AddYoursClientShowTopicProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
