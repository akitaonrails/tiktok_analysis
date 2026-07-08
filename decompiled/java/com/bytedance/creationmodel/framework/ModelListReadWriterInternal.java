package com.bytedance.creationmodel.framework;

import X.C088000Us;
import X.C13LP;
import X.C19220210Hg;
import X.C2216411Bot;
import X.InterfaceC2216611BpD;
import Y.AObjectS301S0200000_34;
import Y.AObjectS320S0200000_34;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS41S0001000_29;

/* JADX INFO: loaded from: classes35.dex */
public final class ModelListReadWriterInternal<T, R, W> extends CommonModelReadWriterInternal<List<? extends T>, T> implements InterfaceC2216611BpD<T, W> {
    public final Function0<List<T>> LJIIIIZZ;
    public final Function1<List<? extends T>, Unit> LJIIIZ;
    public final List<Object> LJIIJ;

    @Override // X.InterfaceC2216611BpD
    public final List<W> LIZIZ() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        List list = (List) LJII();
        if (list != null && list.size() > ((ArrayList) this.LJIIJ).size()) {
            int size = list.size();
            for (int size2 = ((ArrayList) this.LJIIJ).size(); size2 < size; size2++) {
                String strValueOf = String.valueOf(size2);
                AwS41S0001000_29 awS41S0001000_29 = new AwS41S0001000_29(size2, 40);
                C088000Us c088000Us = new C088000Us(size2);
                T tNewInstance = ((Class) ((LinkedHashMap) C2216411Bot.LIZ).get(this.LIZLLL)).getConstructor(LiveData.class, Function0.class, Function1.class).newInstance(Transformations.distinctUntilChanged(C19220210Hg.LIZ(this.LJ, awS41S0001000_29)), new AObjectS301S0200000_34(awS41S0001000_29, this, 11), new AObjectS320S0200000_34(this, c088000Us, 6));
                this.LJII.put(strValueOf, tNewInstance);
                ((ArrayList) this.LJIIJ).add(tNewInstance);
            }
        }
        List<Object> list2 = this.LJIIJ;
        List list3 = (List) LJII();
        return new ArrayList(C13LP.LL(list2, list3 != null ? list3.size() : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelListReadWriterInternal(Class<T> cls, LiveData<List<T>> liveData, Function0<? extends List<? extends T>> function0, Function1<? super List<? extends T>, Unit> function1) {
        super(cls, liveData, function0, function1);
        this.LJIIIIZZ = function0;
        this.LJIIIZ = function1;
        Transformations.distinctUntilChanged(C19220210Hg.LIZ(liveData, AFwS281S0000000_34.get$arr$(0)));
        this.LJIIJ = new ArrayList();
    }
}
