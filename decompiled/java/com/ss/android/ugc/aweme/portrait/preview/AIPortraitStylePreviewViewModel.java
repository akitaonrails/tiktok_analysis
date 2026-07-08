package com.ss.android.ugc.aweme.portrait.preview;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C13LP;
import X.C1687000u0A;
import X.C1BNE;
import X.C2252321DDq;
import X.C549290LgV;
import X.C558690Lvf;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class AIPortraitStylePreviewViewModel extends ViewModel {
    public final C1687000u0A LL = new C1687000u0A(0);
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public AIGCEntranceInfo LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public AIPortraitStylePreviewViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C558690Lvf.LIZ);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public final String vQ2() {
        C549290LgV c549290LgV;
        String str = this.LLILZ;
        if (str != null) {
            return str;
        }
        Object value = this.LLILLL.getValue();
        if (!(value instanceof C549290LgV) || (c549290LgV = (C549290LgV) value) == null) {
            return null;
        }
        return c549290LgV.LIZ;
    }

    public final String wQ2() {
        C549290LgV c549290LgV;
        AITheaterCameoImageModel aITheaterCameoImageModel;
        List<String> urlList;
        String str = this.LLILZIL;
        if (str != null) {
            return str;
        }
        Object value = this.LLILLL.getValue();
        if (!(value instanceof C549290LgV) || (c549290LgV = (C549290LgV) value) == null || (aITheaterCameoImageModel = c549290LgV.LIZIZ) == null || (urlList = aITheaterCameoImageModel.getUrlList()) == null) {
            return null;
        }
        return (String) C13LP.LJJJLL(urlList);
    }
}
