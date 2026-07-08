package com.ss.android.ugc.aweme.creative.model;

import X.C01GW;
import X.C11HN;
import X.C2097908Jt;
import X.C2216571Bp9;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C443120HZe;
import X.C452501pT;
import X.InterfaceC2216711BpN;
import X.InterfaceC2216771BpT;
import X.InterfaceC2216781BpU;
import X.InterfaceC2216791BpV;
import X.InterfaceC2216801BpW;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModelReadWriter;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class CreativeModelReadWriter extends C11HN<CreativeModel> implements InterfaceC2216711BpN, InterfaceC2216771BpT, InterfaceC2216801BpW, InterfaceC2216791BpV, InterfaceC2216781BpU {
    public final LiveData<CreativeModel> LIZLLL;
    public final Function0<CreativeModel> LJ;
    public final Function1<CreativeModel, Unit> LJFF;
    public final C01GW LJI;

    @Override // X.InterfaceC2216421Bou
    public final List<C2216571Bp9> LIZ() {
        return Collections.singletonList(new C2216571Bp9(new C2217371BqR() { // from class: X.1BpE
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CreativeModel) obj).editEffectModel;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((CreativeModel) obj).editEffectModel = (EditEffectModel) obj2;
            }
        }, new C2217381BqS() { // from class: X.1BpH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CreativeModelReadWriter) obj).LJI.getValue();
            }
        }, EditEffectModel.class));
    }

    @Override // X.InterfaceC21368818ju
    public final Map<Class<?>, Pair<Class<?>, Class<?>>> LIZJ() {
        return C2097908Jt.LIZJ(new Pair(CreativeModel.class, new Pair(InterfaceC2216711BpN.class, InterfaceC2216771BpT.class)));
    }

    @Override // X.InterfaceC2216421Bou
    public final Map<Class<?>, C443120HZe<Class<?>, Class<?>, Class<?>>> LJ() {
        return C2097908Jt.LIZJ(new Pair(CreativeModel.class, new C443120HZe(InterfaceC2216801BpW.class, InterfaceC2216781BpU.class, InterfaceC2216791BpV.class)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeModelReadWriter(LiveData<CreativeModel> liveData, Function0<CreativeModel> function0, Function1<? super CreativeModel, Unit> function1) {
        super(liveData, function0, function1);
        this.LIZLLL = liveData;
        this.LJ = function0;
        this.LJFF = function1;
        this.LJI = C452501pT.LIZIZ(new AwS578S0100000_34(this, 34));
    }
}
