package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C13LC;
import X.C1558520qew;
import X.C1852270yIj;
import X.C1854150yLl;
import X.C1862330yYx;
import X.C1863850ybP;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeItemAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageCreateSubModeItemAssem extends TakoSubModeItemAssem {
    public final Integer LLJZ = Integer.valueOf(R.attr.zq);

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeItemAssem
    public final Integer op() {
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeItemAssem
    public final void sp(C1854150yLl c1854150yLl) {
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        C1852270yIj.LIZ.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = C1852270yIj.LJIIJJI();
        if (interfaceC665370Q7zLJIIJJI != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LL;
            String str3 = c1863850ybP.LLILLJJLI;
            String str4 = c1863850ybP.LLILZIL;
            String str5 = c1863850ybP.LLILZLL;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String str7 = c1863850ybP.LLIZ;
            if (str7 != null) {
                str6 = str7;
            }
            if (c1854150yLl.LLJILJILJ) {
                str = "off";
            } else {
                str = "on";
            }
            C1862330yYx.LJLI(c1862330yYx, str2, str3, str4, str5, str6, str, c1854150yLl.LLJ, null, null, null, "action_bar", "create_image_template", 4992);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeItemAssem
    public final void tp(C1854150yLl c1854150yLl) {
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        C1852270yIj.LIZ.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = C1852270yIj.LJIIJJI();
        if (interfaceC665370Q7zLJIIJJI != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LL;
            String str3 = c1863850ybP.LLILLJJLI;
            String str4 = c1863850ybP.LLILZIL;
            String str5 = c1863850ybP.LLILZLL;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String str7 = c1863850ybP.LLIZ;
            if (str7 != null) {
                str6 = str7;
            }
            if (c1854150yLl.LLJILJILJ) {
                str = "on";
            } else {
                str = "off";
            }
            C1862330yYx.LJLIIIL(c1862330yYx, str2, str3, str4, str5, str6, str, c1854150yLl.LLJ, null, null, "action_bar", "create_image_template", 2432);
        }
    }
}
