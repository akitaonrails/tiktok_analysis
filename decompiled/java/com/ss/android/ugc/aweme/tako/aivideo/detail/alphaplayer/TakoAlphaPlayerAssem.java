package com.ss.android.ugc.aweme.tako.aivideo.detail.alphaplayer;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C0QSJ;
import X.C0XF1;
import X.C0XQ7;
import X.C1337690kul;
import X.C13LE;
import X.C1860520yW2;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C687700QyG;
import X.C724240Sb0;
import X.EnumC1519405xA;
import X.InterfaceC1146704e9;
import X.InterfaceC1519605xC;
import X.InterfaceC1519705xD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoAlphaPlayerAssem extends AbstractC738140SxQ implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public InterfaceC1519605xC LL;
    public volatile TakoAIVideoOverlayAbility LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C0QSJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAlphaPlayerAssem.class, "overlayAbility", "getOverlayAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoOverlayAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final TakoAIVideoOverlayAbility m327do() {
        TakoAIVideoOverlayAbility takoAIVideoOverlayAbility = this.LLILLJJLI;
        if (takoAIVideoOverlayAbility == null) {
            synchronized (this) {
                takoAIVideoOverlayAbility = this.LLILLJJLI;
                if (takoAIVideoOverlayAbility == null) {
                    TakoAIVideoOverlayAbility takoAIVideoOverlayAbilityBo = bo();
                    this.LLILLJJLI = takoAIVideoOverlayAbilityBo;
                    return takoAIVideoOverlayAbilityBo;
                }
            }
        }
        return takoAIVideoOverlayAbility;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    public final TakoAIVideoOverlayAbility bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLILZ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILLL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLILLL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoAIVideoDetailScope.class});
            this.LLILZ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        TakoAIVideoOverlayAbility takoAIVideoOverlayAbility = (TakoAIVideoOverlayAbility) c0qsjLIZLLL.getAbility(TakoAIVideoOverlayAbility.class);
        C687700QyG.LJ(takoAIVideoOverlayAbility, TakoAIVideoOverlayAbility.class);
        return takoAIVideoOverlayAbility;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC1519605xC interfaceC1519605xC = this.LL;
        if (interfaceC1519605xC != null) {
            interfaceC1519605xC.cancel();
        }
        this.LL = null;
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (!(c19egLIZ instanceof ComponentActivity) || c19egLIZ == null) {
            return;
        }
        InterfaceC1519705xD.LIZ.getClass();
        if (!C0XF1.LIZLLL(c19egLIZ)) {
            m327do().rn1(EnumC1519405xA.DONE);
            return;
        }
        C1860520yW2.LIZ.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_played_ai_video_alpha");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        boolean z = !kevaLJIIL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        m327do().rn1(EnumC1519405xA.PLAYING);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1337690kul(z, this, c19egLIZ, null), 3);
    }
}
