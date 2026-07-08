package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent;

import X.C09JN;
import X.C118300cf;
import X.C11IR;
import X.C11JN;
import X.C11NZ;
import X.C11S5;
import X.C201955140j;
import X.C2188811AlT;
import X.C516201zk;
import X.C523440Kfu;
import X.C534820KyG;
import X.C534850KyJ;
import X.C534860KyK;
import X.C535020Kya;
import X.C538760LBa;
import X.C552700Lm0;
import X.C581080Mqg;
import X.C581220Mqu;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentRepository;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS62S0210000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumAiContentRepositoryImpl implements AlbumAiContentRepository {
    public final Set<Integer> LIZIZ;

    public AlbumAiContentRepositoryImpl() {
        Map map = (Map) C534860KyK.LIZLLL.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((C534850KyJ) entry.getValue()).LIZJ) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.LIZIZ = linkedHashMap.keySet();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentRepository
    public final C11NZ<List<C535020Kya>> LIZ(C534820KyG c534820KyG) {
        AlbumAiContentService.LIZ.getClass();
        AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
        final boolean z = true;
        if (albumAiContentServiceLIZ != null && albumAiContentServiceLIZ.isEnable()) {
            C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\nfetchAiMediaModel -------------------- supportFeatures:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", ");
            sbLIZ.append(c534820KyG);
            C201955140j.LJIILL(c552700Lm0, "AlbumAiContentRepository", C2188811AlT.LIZIZ(sbLIZ));
            if (c534820KyG.LIZLLL != 3) {
                z = false;
            }
            C11JN c11jnLJJIJIIJIL = C11NZ.LJIJJLI(new C581220Mqu(c534820KyG, this, 0)).LJL(C11S5.LIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0KyH
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$2");
                    List list = (List) obj;
                    if (z && (!list.isEmpty())) {
                        this.getClass();
                        ((Keva) ((C533720KwU) C534860KyK.LIZ.getValue()).LIZ()).storeBoolean("has_ai_content", true);
                    }
                    C1C7U.LIZIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$2");
                }
            });
            AwS62S0210000_8 awS62S0210000_8 = new AwS62S0210000_8(z, c534820KyG, this, 3);
            C118300cf c118300cf = new C118300cf();
            return C538760LBa.LIZIZ(c11jnLJJIJIIJIL.LJJIJIIJIL(new C516201zk(c118300cf, 151)).LJJIIJZLJL(new C581080Mqg(awS62S0210000_8, c118300cf, 1)), "AlbumAiContentRepository", "fetchAiMediaModel total");
        }
        return C11IR.LL;
    }
}
