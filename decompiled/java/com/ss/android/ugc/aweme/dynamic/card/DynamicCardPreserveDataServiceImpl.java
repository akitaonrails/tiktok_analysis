package com.ss.android.ugc.aweme.dynamic.card;

import X.C085L;
import X.C1548820qPI;
import X.C2184008h4;
import X.C2196308j3;
import X.C2196508j5;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC346201Wa;
import com.ss.android.ugc.aweme.dynamic.card.api.preserve.data.DynamicCardPreserveDataService;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class DynamicCardPreserveDataServiceImpl implements DynamicCardPreserveDataService {
    @Override // com.ss.android.ugc.aweme.dynamic.card.api.preserve.data.DynamicCardPreserveDataService
    public final void LIZ(String str) {
        C2184008h4 c2184008h4Remove = C2196508j5.LIZ.remove(str);
        if (c2184008h4Remove != null) {
            C1548820qPI.LJIIIZ((C085L) c2184008h4Remove.LLJ.getValue(), "dm_preserve_data_register");
            C2296808zG.LIZJ(c2184008h4Remove.LLILZIL, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.preserve.data.DynamicCardPreserveDataService
    public final InterfaceC346201Wa LIZIZ(String str, AwS576S0100000_32 awS576S0100000_32) throws JSONException {
        C2184008h4 c2184008h4 = new C2184008h4(awS576S0100000_32, str);
        C2196508j5.LIZ.put(str, c2184008h4);
        C1548820qPI.LJI((C085L) c2184008h4.LLJ.getValue(), "dm_preserve_data_register");
        C23250099c.LIZLLL(c2184008h4.LLILZIL, null, null, new C2196308j3(c2184008h4, null), 3);
        return c2184008h4.LLIZLLLIL;
    }
}
