package com.ss.android.ugc.aweme.deeplink.actions.music;

import X.AbstractC1387200mCc;
import X.AbstractC1950107kR;
import X.C1906580ziK;
import X.C1950707kX;
import X.C20684815ws;
import X.C2421209eE;
import X.C633020OsG;
import X.InterfaceC1603190roz;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class MusicSettingAuthAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final boolean LJIIIIZZ() {
        AbstractC1387200mCc abstractC1387200mCc;
        Pair<Boolean, String> pairLJIJJ = C633020OsG.LIZIZ.LJIJJ();
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        int length = abstractC1387200mCcArrLJII.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                abstractC1387200mCc = null;
                break;
            }
            abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1603190roz) {
                break;
            }
            i++;
        }
        if (pairLJIJJ.getFirst().booleanValue() || abstractC1387200mCc == null) {
            return false;
        }
        LJIIIZ(pairLJIJJ);
        return true;
    }

    public final void LJIIIZ(Pair pair) {
        HashMap map = new HashMap();
        map.put("result", "fail");
        map.put("previous_page", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(LJFF(), "enter_from"));
        map.put("error_code", pair.getSecond());
        C20684815ws.LJIILLIIL("click_music_setting_link", map);
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        C2421209eE.LIZ();
        Pair<Boolean, String> pairLJIJJ = C633020OsG.LIZIZ.LJIJJ();
        if (pairLJIJJ.getFirst().booleanValue()) {
            return new Pair<>("//settings/music/auth", map);
        }
        LJIIIZ(pairLJIJJ);
        return new Pair<>("//main", new HashMap());
    }
}
