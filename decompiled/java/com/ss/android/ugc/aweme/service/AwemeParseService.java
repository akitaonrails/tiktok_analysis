package com.ss.android.ugc.aweme.service;

import X.C14SG;
import com.ss.android.ugc.aweme.components.video.playbox.IAwemeParseService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes31.dex */
public final class AwemeParseService implements IAwemeParseService {
    @Override // com.ss.android.ugc.aweme.components.video.playbox.IAwemeParseService
    public final Aweme parseAwemeJSONStr(String str) {
        return (Aweme) new C14SG(Aweme.class).LIZ(str);
    }
}
