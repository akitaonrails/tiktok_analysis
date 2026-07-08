package com.bytedance.tts.pigeon.container;

import X.C09R7;
import X.C0Y7P;
import X.C0Y8T;
import X.C0YC9;
import X.C0YWS;
import X.C0YWT;
import X.C0YWZ;
import X.C0YXB;
import X.C0YXG;
import X.C0YXQ;
import X.C19719912Dl;
import X.C821280WJq;
import X.C869590Y9l;
import X.InterfaceC875510YWf;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tts.pigeon.GECPigeon;
import ig6.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS248S0000000_14;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BasePigeonContainer<I_PROTOCOL extends c> implements C0YXB {
    public final List<I_PROTOCOL> LL = new CopyOnWriteArrayList();

    @Override // X.C0YXH
    public final void LJIILJJIL() {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILJJIL();
        }
    }

    @Override // X.C0YXH
    public final void LJIIZILJ() {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIZILJ();
        }
    }

    @Override // X.InterfaceC875510YWf
    public final void LJIL() {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIL();
        }
    }

    @Override // X.C0YXH
    public final void LJJIIJ() {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIJ();
        }
    }

    @Override // X.C0YXH
    public final void LJJIIZ() {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIZ();
        }
    }

    @Override // X.C0YXH
    public void LJJIIZI() {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIZI();
        }
        LJJJJLL().getContainerStore().LIZ.remove(this);
    }

    @Override // X.C0YXH
    public final void LJJIJ() {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJ();
        }
    }

    @Override // X.C0YXH
    public final void LJJIL() {
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(13);
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            aFwS248S0000000_14.invoke(it2.next());
        }
    }

    @Override // X.InterfaceC875510YWf
    public final void LJJJJLI() {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJLI();
        }
    }

    public BasePigeonContainer() {
        new LinkedHashMap();
    }

    public final void LIZ(C19719912Dl c19719912Dl) {
        ((CopyOnWriteArrayList) this.LL).add(LIZIZ(c19719912Dl));
    }

    public C0YXB LIZIZ(C19719912Dl c19719912Dl) {
        return (C0YXB) C09R7.LIZ(c19719912Dl).getConstructor(GECPigeon.class).newInstance(LJJJJLL());
    }

    @Override // X.C0YWZ
    public final void LJIIJ(List<C869590Y9l> list) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0YWZ) it2.next()).LJIIJ(list);
        }
    }

    @Override // X.C0YXG
    public final void LJIJJLI(boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0YXG) it2.next()).LJIJJLI(z);
        }
    }

    @Override // X.C0YXG
    public final void LJJIJIIJI(C0Y8T c0y8t) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJIIJI(c0y8t);
        }
    }

    @Override // X.C0YXG
    public final void LJJIJIIJIL(Map<String, C0Y8T> map) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJIIJIL(map);
        }
    }

    @Override // X.C0YXG
    public final void LJJIJIL(C0Y8T c0y8t) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJIL(c0y8t);
        }
    }

    @Override // X.InterfaceC875510YWf
    public final void LJJIJL(C0YWT c0ywt) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJL(c0ywt);
        }
    }

    @Override // X.C0YXG
    public final void LJJJI(C0Y8T c0y8t) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJI(c0y8t);
        }
    }

    @Override // X.InterfaceC875510YWf
    public final void LJJJJ(C0YXQ c0yxq) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJ(c0yxq);
        }
    }

    @Override // X.C0YXG
    public final void LJJJJZI(C0Y8T c0y8t) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJZI(c0y8t);
        }
    }

    @Override // X.C0YWS
    public final void LJJLI(boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0YWS) it2.next()).LJJLI(z);
        }
    }

    @Override // X.InterfaceC875510YWf
    public final void LJJLIIIIJ(WsChannelMsg wsChannelMsg) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJLIIIIJ(wsChannelMsg);
        }
    }

    @Override // X.C0YXG
    public final void LJI(int i, C0Y8T c0y8t) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJI(i, c0y8t);
        }
    }

    @Override // X.InterfaceC875510YWf
    public final void LJIIIIZZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(c821280WJq, jSONObject);
        }
    }

    @Override // X.C0YWZ
    public final void LJIIJJI(List<C869590Y9l> list, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0YWZ) it2.next()).LJIIJJI(list, z);
        }
    }

    @Override // X.InterfaceC875510YWf
    public final void LJJIZ(int i, int i2) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC875510YWf) it2.next()).LJJIZ(i, i2);
        }
    }

    @Override // X.C0YWZ
    public final void LJJJIL(List<C869590Y9l> list, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0YWZ) it2.next()).LJJJIL(list, z);
        }
    }

    @Override // X.C0YWQ
    public final void LJ(String str, String str2, Throwable th) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(str, str2, th);
        }
    }

    @Override // X.C0YWQ
    public final void LJFF(String str, String str2, Throwable th) {
        Iterator<I_PROTOCOL> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(str, str2, th);
        }
    }

    @Override // X.C0YWZ
    public final void LJIJJ(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0YWZ) it2.next()).LJIJJ(list, i, c0y7p);
        }
    }

    @Override // X.C0YWZ
    public final void LJJJLL(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0YWZ) it2.next()).LJJJLL(i, c0yc9, c869590Y9l);
        }
    }

    @Override // X.C0YWZ
    public final void LJJIIJZLJL(int i, String str, List list, Long l) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0YWZ) it2.next()).LJJIIJZLJL(i, str, list, l);
        }
    }
}
