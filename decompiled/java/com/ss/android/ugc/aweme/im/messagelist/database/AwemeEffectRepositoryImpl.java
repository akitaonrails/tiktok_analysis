package com.ss.android.ugc.aweme.im.messagelist.database;

import X.C01GW;
import X.C0NOY;
import X.C0NOZ;
import X.C0NP4;
import X.C0NP5;
import X.C0NP6;
import X.C0NPA;
import X.C13BV;
import X.C2188811AlT;
import X.C2286608xc;
import X.C23250099c;
import X.C452501pT;
import X.C593100NOa;
import X.C593120NOc;
import X.C593130NOd;
import X.C593140NOe;
import X.C593150NOf;
import X.C593320NOw;
import X.InterfaceC1364105Vn;
import X.InterfaceC593180NOi;
import X.InterfaceC593210NOl;
import com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AwemeEffectRepositoryImpl implements IAwemeEffectRepository {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(126));
    public final AFwS195S0000000_9 LIZIZ = AFwS195S0000000_9.get$arr$(127);
    public final ConcurrentHashMap<String, InterfaceC593210NOl> LIZJ = new ConcurrentHashMap<>();

    public final InterfaceC593180NOi LJIIJJI() {
        return (InterfaceC593180NOi) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final void LIZLLL(C0NPA c0npa) {
        InterfaceC593210NOl interfaceC593210NOl = this.LIZJ.get(c0npa.LIZJ);
        if (interfaceC593210NOl != null) {
            interfaceC593210NOl.hx(c0npa);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final void LJI(String str) {
        InterfaceC593210NOl interfaceC593210NOl = this.LIZJ.get(str);
        if (interfaceC593210NOl != null) {
            interfaceC593210NOl.o50(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final void LJIIIZ(String str) {
        this.LIZJ.remove(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregisterEffectCallback: conversationId=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final Object LIZ(String str, InterfaceC1364105Vn<? super C0NPA> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, (CoroutineContext) this.LIZIZ.invoke(), new C593130NOd(this, str, null));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final void LIZIZ(String str, InterfaceC593210NOl interfaceC593210NOl) {
        this.LIZJ.put(str, interfaceC593210NOl);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerEffectCallback: conversationId=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final Object LIZJ(List list, C0NP6 c0np6) {
        if (((ArrayList) list).isEmpty()) {
            return C13BV.INSTANCE;
        }
        return C23250099c.LJI(c0np6, (CoroutineContext) this.LIZIZ.invoke(), new C593120NOc(this, list, null));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final Object LJ(List<String> list, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        if (list.isEmpty()) {
            return C2286608xc.LJ(0);
        }
        return C23250099c.LJI(interfaceC1364105Vn, (CoroutineContext) this.LIZIZ.invoke(), new C0NOZ(this, list, null));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final Object LJFF(List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (list.isEmpty()) {
            return C2286608xc.LJ(0);
        }
        return C23250099c.LJI(interfaceC1364105Vn, (CoroutineContext) this.LIZIZ.invoke(), new C0NOY(this, list, null));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final Object LJII(String str, long j, long j2, InterfaceC1364105Vn<? super List<C593320NOw>> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, (CoroutineContext) this.LIZIZ.invoke(), new C593150NOf(this, str, j, j2, null));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final Object LJIIJ(String str, long j, long j2, C0NP5 c0np5) {
        return C23250099c.LJI(c0np5, (CoroutineContext) this.LIZIZ.invoke(), new C593100NOa(this, str, j, j2, null));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository
    public final Object LJIIIIZZ(long j, long j2, String str, String str2, C0NP4 c0np4) {
        return C23250099c.LJI(c0np4, (CoroutineContext) this.LIZIZ.invoke(), new C593140NOe(this, str, str2, j, j2, null));
    }
}
