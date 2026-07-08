package com.ss.android.ugc.aweme.deeplink.actions.music;

import X.AbstractC1950107kR;
import X.C1950707kX;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ThirdPartyOauthMusicAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("tt_to_dsp_authorize_specific_dsp_deeplink", false)) {
            String lastPathSegment = UriProtector.parse(str).getLastPathSegment();
            if (lastPathSegment == null) {
                return new Pair<>("//main", new HashMap());
            }
            HashMap map2 = new HashMap(map);
            map2.put("platform", lastPathSegment);
            return new Pair<>("//third-party-oauth/music", map2);
        }
        return new Pair<>("//main", new HashMap());
    }
}
