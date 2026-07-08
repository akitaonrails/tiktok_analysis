package com.ss.android.ugc.aweme.creative.model.edit;

import X.C01GW;
import X.C11HN;
import X.C2097908Jt;
import X.C2216571Bp9;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C443120HZe;
import X.C452501pT;
import X.InterfaceC2216671BpJ;
import X.InterfaceC2216701BpM;
import X.InterfaceC2216741BpQ;
import X.InterfaceC2216751BpR;
import X.InterfaceC2216761BpS;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModelReadWriter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class EditEffectModelReadWriter extends C11HN<EditEffectModel> implements InterfaceC2216701BpM, InterfaceC2216741BpQ, InterfaceC2216671BpJ, InterfaceC2216761BpS, InterfaceC2216751BpR {
    public final LiveData<EditEffectModel> LIZLLL;
    public final Function0<EditEffectModel> LJ;
    public final Function1<EditEffectModel, Unit> LJFF;
    public final C01GW LJI;

    @Override // X.InterfaceC2216421Bou
    public final List<C2216571Bp9> LIZ() {
        return Collections.singletonList(new C2216571Bp9(new C2217371BqR() { // from class: X.1BpK
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((EditEffectModel) obj).hasClippedEffect);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((EditEffectModel) obj).hasClippedEffect = ((Boolean) obj2).booleanValue();
            }
        }, new C2217381BqS() { // from class: X.1BpL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditEffectModelReadWriter) obj).LJI.getValue();
            }
        }, Boolean.TYPE));
    }

    @Override // X.InterfaceC21368818ju
    public final Map<Class<?>, Pair<Class<?>, Class<?>>> LIZJ() {
        return C2097908Jt.LIZJ(new Pair(EditEffectModel.class, new Pair(InterfaceC2216701BpM.class, InterfaceC2216741BpQ.class)));
    }

    @Override // X.InterfaceC2216671BpJ
    public final C11HN LIZLLL() {
        return (C11HN) this.LJI.getValue();
    }

    @Override // X.InterfaceC2216421Bou
    public final Map<Class<?>, C443120HZe<Class<?>, Class<?>, Class<?>>> LJ() {
        return C2097908Jt.LIZJ(new Pair(EditEffectModel.class, new C443120HZe(InterfaceC2216671BpJ.class, InterfaceC2216751BpR.class, InterfaceC2216761BpS.class)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditEffectModelReadWriter(LiveData<EditEffectModel> liveData, Function0<EditEffectModel> function0, Function1<? super EditEffectModel, Unit> function1) {
        super(liveData, function0, function1);
        this.LIZLLL = liveData;
        this.LJ = function0;
        this.LJFF = function1;
        this.LJI = C452501pT.LIZIZ(new AwS578S0100000_34(this, 36));
    }
}
