package com.ss.android.ugc.aweme.story.friendanniversary;

import X.C1717906o5;
import X.C461720I8s;
import X.C902380Zae;
import X.C902600Zb0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryFriendAnniversaryServiceImpl implements StoryFriendAnniversaryService {
    public final Map<String, C902380Zae> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final C902600Zb0 LIZJ = new C902600Zb0();

    @Override // com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService
    public final void LIZJ() {
        C902380Zae c902380ZaeLIZ;
        if (!C1717906o5.LIZ() || (c902380ZaeLIZ = LIZ(C461720I8s.LIZIZ())) == null) {
            return;
        }
        c902380ZaeLIZ.LJI(null, null);
    }

    @Override // com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService
    public final C902600Zb0 LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService
    public final C902380Zae LIZ(String str) {
        if (str == null) {
            return null;
        }
        C902380Zae c902380Zae = this.LIZIZ.get(str);
        if (c902380Zae == null) {
            C902380Zae c902380Zae2 = new C902380Zae(str);
            this.LIZIZ.put(str, c902380Zae2);
            return c902380Zae2;
        }
        return c902380Zae;
    }
}
