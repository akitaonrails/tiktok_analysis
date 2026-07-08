package com.bytedance.creationmodel.framework;

import X.C11HN;
import X.C13BV;
import X.C2097608Jq;
import X.C2216571Bp9;
import X.C443120HZe;
import X.InterfaceC21368818ju;
import X.InterfaceC2216421Bou;
import androidx.lifecycle.LiveData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class CommonModelReadWriterInternal<T, V> extends C11HN<T> implements InterfaceC21368818ju, InterfaceC2216421Bou {
    public final Class<V> LIZLLL;
    public final LiveData<T> LJ;
    public final Function0<T> LJFF;
    public final Function1<T, Unit> LJI;
    public final Map<String, Object> LJII;

    @Override // X.InterfaceC21368818ju
    public final Map<Class<?>, Pair<Class<?>, Class<?>>> LIZJ() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC2216421Bou
    public final Map<Class<?>, C443120HZe<Class<?>, Class<?>, Class<?>>> LJ() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC2216421Bou
    public final List<C2216571Bp9> LIZ() {
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonModelReadWriterInternal(Class<V> cls, LiveData<T> liveData, Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        super(liveData, function0, function1);
        this.LIZLLL = cls;
        this.LJ = liveData;
        this.LJFF = function0;
        this.LJI = function1;
        this.LJII = new LinkedHashMap();
    }
}
