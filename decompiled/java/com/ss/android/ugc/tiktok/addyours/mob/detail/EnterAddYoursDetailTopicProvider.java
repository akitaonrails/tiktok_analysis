package com.ss.android.ugc.tiktok.addyours.mob.detail;

import X.C00F3;
import X.C1554960qZC;
import X.C308560C7q;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes10.dex */
public final class EnterAddYoursDetailTopicProvider implements IEnterAddYoursDetailProvider<C00F3> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        AddYoursTopic addYoursTopic;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", AddYoursTopic.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (addYoursTopic = (AddYoursTopic) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        Long topicId = addYoursTopic.getTopicId();
        String text = addYoursTopic.getText();
        Aweme video = addYoursTopic.getVideo();
        return new C00F3(topicId, text, video != null ? AwemeExtKt.getAuthorUid(video) : null, C308560C7q.LIZIZ(addYoursTopic.getViewerInvited()));
    }

    public EnterAddYoursDetailTopicProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
