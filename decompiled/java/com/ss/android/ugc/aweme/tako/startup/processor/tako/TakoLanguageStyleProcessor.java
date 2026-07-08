package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.AbstractC848400XPy;
import X.AnonymousClass1425;
import X.AnonymousClass1426;
import X.C0XQ7;
import X.C13LC;
import X.C14FD;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1860520yW2;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C1863380yae;
import X.C1863850ybP;
import X.C201992141u;
import X.C2188811AlT;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import defpackage.u2;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoLanguageStyleProcessor implements ITakoNormalProcessorProtocol {
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) throws JSONException {
        boolean z;
        u2 u2VarLJFF;
        C13LC<C1863850ybP> c13lcT71;
        AnonymousClass1426 anonymousClass1426 = AnonymousClass1426.LIZ;
        anonymousClass1426.getClass();
        if (!AnonymousClass1426.LIZ()) {
            return false;
        }
        C201992141u c201992141u = C201992141u.LIZ;
        c201992141u.getClass();
        anonymousClass1426.getClass();
        if (AnonymousClass1426.LIZ()) {
            C201992141u.LIZIZ = new WeakReference<>(iMessageAbility);
        }
        C1863850ybP c1863850ybP = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null) {
            c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
        }
        c201992141u.getClass();
        boolean z2 = true;
        if (!c1862660yZU.LIZ && !c1862660yZU.LJFF) {
            AnonymousClass1425.LIZ.getClass();
            ITakoDebugService iTakoDebugServiceLIZ = AnonymousClass1425.LIZ();
            if (iTakoDebugServiceLIZ != null) {
                iTakoDebugServiceLIZ.LJI();
            }
            C1860520yW2.LIZ.getClass();
            Keva kevaLJIIL = C1860520yW2.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_language_style_guide_dialog_showed");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            boolean z3 = kevaLJIIL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            WeakReference<IMessageAbility> weakReference = C201992141u.LIZIZ;
            if (weakReference != null && weakReference.get() != null && (u2VarLJFF = C1863380yae.LJJII.LJFF(1, 1L)) != null && u2VarLJFF.LJIIIZ) {
                z = true;
            } else {
                z = false;
            }
            Pair pair = new Pair(Boolean.valueOf(z3), Boolean.valueOf(z));
            boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue2) {
                    C201992141u.LIZJ(true, false);
                } else {
                    C201992141u.LIZLLL(takoEnterParams, c1863850ybP);
                }
            }
            if (!zBooleanValue2) {
                C201992141u.LIZJ(false, true);
            }
            z2 = false;
        } else {
            z2 = false;
        }
        c1862660yZU.LJI = z2;
        return false;
    }
}
