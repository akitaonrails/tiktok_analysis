package v2p;

import X.C0XSU;
import X.C0XSV;
import X.C13LD;
import X.C13OD;
import X.C13OE;
import X.C13R7;
import X.C13RD;
import X.C13RE;
import X.C1535105zh;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class m1 extends C13OD<FetchFavoriteListResponse, FetchFavoriteListResponse> {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        String str = this.LIZIZ;
        if (str != null) {
            mapLIZ.put("panel", str);
        }
        Map<String, String> map = this.LIZJ;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ.append("/effect/api");
        sbLIZ.append("/v3/effect/my");
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD
    public final int getRetryCount() {
        return this.LIZ.LJIILL;
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, FetchFavoriteListResponse.class);
    }

    public m1(C13RD c13rd, String str, String str2, Map<String, String> map) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = map;
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
        FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) c13oe;
        List<Effect> effect_list = fetchFavoriteListResponse.getEffect_list();
        if (effect_list != null) {
            for (Effect effect : effect_list) {
                effect.setId(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        List<Effect> collection_effects = fetchFavoriteListResponse.getCollection_effects();
        if (collection_effects != null) {
            for (Effect effect2 : collection_effects) {
                effect2.setId(u.LJJIFFI(u.LJJIFFI(effect2.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        C13LD c13ld = C13LD.LIZ;
        String str = this.LIZ.LJII;
        List<Effect> effect_list2 = fetchFavoriteListResponse.getEffect_list();
        c13ld.getClass();
        C13LD.LJIIIZ(str, effect_list2);
        C13LD.LJIIIZ(this.LIZ.LJII, fetchFavoriteListResponse.getCollection_effects());
        super.onSuccess(j, j2, j3, fetchFavoriteListResponse);
    }
}
