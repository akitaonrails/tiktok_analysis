package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.AnonymousClass0956;
import X.C0Z47;
import X.C0ZCG;
import X.C0ZCW;
import X.C0ZDX;
import X.C23250099c;
import X.C869590Y9l;
import X.InterfaceC1493105sv;
import X.InterfaceC497601wk;
import X.InterfaceC874680YTa;
import com.ss.android.ugc.aweme.analytics.IIMReadMessageAnalytics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageKt;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMReadMessageAnalytics implements IIMReadMessageAnalytics {
    public static final IMReadMessageAnalytics LIZIZ = new IMReadMessageAnalytics();
    public static final Set<String> LIZJ = new CopyOnWriteArraySet();
    public static AnonymousClass0956 LIZLLL;

    public static final class Service implements IIMReadMessageAnalytics {
        public final /* synthetic */ IMReadMessageAnalytics LIZIZ = IMReadMessageAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.analytics.IIMReadMessageAnalytics
        public final void LIZ(C869590Y9l c869590Y9l, SessionInfo sessionInfo, C0ZCG c0zcg, InterfaceC1493105sv interfaceC1493105sv, InterfaceC497601wk interfaceC497601wk, InterfaceC874680YTa interfaceC874680YTa) {
            this.LIZIZ.LIZ(c869590Y9l, sessionInfo, c0zcg, interfaceC1493105sv, interfaceC497601wk, interfaceC874680YTa);
        }
    }

    public static String LIZIZ(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMReadMessageAnalytics
    public final void LIZ(C869590Y9l c869590Y9l, SessionInfo sessionInfo, C0ZCG c0zcg, InterfaceC1493105sv interfaceC1493105sv, InterfaceC497601wk interfaceC497601wk, InterfaceC874680YTa interfaceC874680YTa) {
        StoryFeature storyFeatureLIZ;
        if (c869590Y9l == null) {
            return;
        }
        if (c0zcg.LIZJ(c869590Y9l) && ((storyFeatureLIZ = StoryFeature.LIZ.LIZ()) == null || !storyFeatureLIZ.LIZIZ(c869590Y9l))) {
            C0ZCW.LIZ.getClass();
            if (C0ZCW.LIZJ(c869590Y9l) == null) {
                return;
            }
        }
        if (FakeMessageKt.isFakeMessage(c869590Y9l)) {
            return;
        }
        int i = C0ZDX.LIZJ;
        if (c869590Y9l.getLocalExt().get("key_local_ext_has_read") != null) {
            return;
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0Z47(c869590Y9l, c0zcg, sessionInfo, interfaceC1493105sv, interfaceC874680YTa, null), 3);
    }
}
