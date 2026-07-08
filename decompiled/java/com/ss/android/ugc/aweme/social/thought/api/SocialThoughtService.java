package com.ss.android.ugc.aweme.social.thought.api;

import X.C19EG;
import X.C341220DZg;
import X.InterfaceC1891350zJl;
import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public interface SocialThoughtService {
    void LIZ(C19EG c19eg, String str, String str2, String str3, boolean z, String str4, Function0<Unit> function0);

    C341220DZg LIZIZ();

    void LIZJ(C19EG c19eg, String str, String str2, ThoughtInfo thoughtInfo, User user, boolean z);

    void LIZLLL(Context context, String str, String str2);

    Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] LJ();

    ISocialThoughtDataCenterService LJJIIZI();
}
