package com.ss.android.ugc.aweme.challenge.api;

import X.AnonymousClass1126;
import X.AnonymousClass1162;
import X.AnonymousClass1163;
import X.C1499810p8F;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class ChallengeNetPreload implements InterfaceC727570SgN<AnonymousClass1163, ListenableFuture<ChallengeAwemeList>> {
    public String EXTRA_CHALLENGE_IS_HASHTAG = "extra_challenge_is_hashtag";

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        String string;
        if (bundle != null) {
            string = bundle.getString(FollowStatusChangeMethod.PARAM_UID, "");
        } else {
            string = null;
        }
        if (string == null || string.length() == 0) {
            return false;
        }
        boolean z = bundle.getBoolean(this.EXTRA_CHALLENGE_IS_HASHTAG, false);
        AnonymousClass1126.LIZ.getClass();
        AnonymousClass1126.LIZ(2, string, "challenge_video", null, z, 0L);
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, AnonymousClass1162.LIZ, null, 0, false, 29);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public ListenableFuture<ChallengeAwemeList> preload2(Bundle bundle, Function1<? super Class<AnonymousClass1163>, ? extends AnonymousClass1163> function1) {
        String str;
        String string;
        String str2 = "";
        if (bundle != null && (string = bundle.getString(FollowStatusChangeMethod.PARAM_UID, "")) != null) {
            str2 = string;
        }
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean(this.EXTRA_CHALLENGE_IS_HASHTAG, false);
        }
        if (((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIZILJ(str2)) {
            str = AnonymousClass1162.LJFF;
        } else {
            str = AnonymousClass1162.LIZJ;
        }
        HashMap map = new HashMap();
        if (z) {
            map.put("hashtag_name", str2);
            map.put("query_type", "1");
        } else {
            map.put("ch_id", str2);
            map.put("query_type", CardStruct.IStatusCode.DEFAULT);
        }
        map.put("cursor", String.valueOf(0L));
        map.put("count", String.valueOf(20));
        map.put("type", "5");
        map.put("source", "challenge_video");
        return function1.invoke(AnonymousClass1163.class).LJFF(str, map);
    }
}
