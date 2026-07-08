package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components;

import X.C0Y3I;
import X.C0Y7P;
import X.C0Y8T;
import X.C0YA1;
import X.C0YA6;
import X.C0YAE;
import X.C0YC9;
import X.C0YIF;
import X.C0YX2;
import X.C0YXD;
import X.C0YXM;
import X.C0YXN;
import X.C1018703yb;
import X.C1061730djf;
import X.C13LE;
import X.C1548820qPI;
import X.C1711306n1;
import X.C1741406rs;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2126308Ur;
import X.C2252321DDq;
import X.C23250099c;
import X.C397901gf;
import X.C869590Y9l;
import X.C875680YWw;
import X.C876050YYh;
import X.EnumC872590YKz;
import X.InterfaceC319750Cg9;
import X.InterfaceC870420YCq;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.AbsConversationDetailComponent;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.EventCenterComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class EventCenterComponent extends AbsConversationDetailComponent<IConversationDetailContainer> implements EventCenterComponentApi, InterfaceC870420YCq {
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public final C0YXN LLILZLL;

    @Override // X.InterfaceC868050Y3n
    public final void LJJJJJL(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJLIIIJ(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJLI(String str, List<C0YAE> list) {
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJLILLLLZI(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJLJI(int i, C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJLL(C1711306n1 c1711306n1) {
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJZI(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC868050Y3n
    public final void LLIIII(int i, String str) {
    }

    @Override // X.InterfaceC868050Y3n
    public final void LLIILZL(int i, String str, List list) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
    }

    @Override // X.InterfaceC868050Y3n
    public final int LLLIIII() {
        return 0;
    }

    @Override // X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void kl(List<C869590Y9l> list, List<C869590Y9l> list2) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, ? extends List<? extends C0YA1>> map, Map<String, ? extends List<? extends C0YA1>> map2, Long l, Long l2) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void nc(List<C869590Y9l> list) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXH
    public final void LJJIIZI() {
        this.LL.getPigeonIMClient().LIZIZ.LJIILL().LIZIZ(this);
        this.LL.getPigeonIMClient().LIZIZ.LJIILL().LJII(this.LLILLJJLI.getConversationId(), this);
        this.LL.getPigeonIMClient().LIZIZ.LJIILL().LJIIIIZZ(this.LLILLJJLI.getConversationId(), this);
        T t = this.LLILLJJLI;
        InterfaceC319750Cg9 interfaceC319750Cg9 = (InterfaceC319750Cg9) C0YXD.LIZLLL(t.LJJJJLL(), C13LE.LIZ(PigeonMessageListComponentApi.class));
        if (interfaceC319750Cg9 != null) {
            interfaceC319750Cg9.LJJIFFI(null);
        }
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXH
    public final void LJJIL() {
        this.LL.getPigeonIMClient().LIZIZ.LJIILL().LIZLLL(this);
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.impl.AbsConversationDetailComponent
    public final void LJJLIIIJILLIZJL() {
        this.LL.getPigeonIMClient().LIZIZ.LJIILL().LJIIL(this.LLILLJJLI.getConversationId(), this);
        this.LL.getPigeonIMClient().LIZIZ.LJIILL().LJIILIIL(this.LLILLJJLI.getConversationId(), this);
        T t = this.LLILLJJLI;
        InterfaceC319750Cg9 interfaceC319750Cg9 = (InterfaceC319750Cg9) C0YXD.LIZLLL(t.LJJJJLL(), C13LE.LIZ(PigeonMessageListComponentApi.class));
        if (interfaceC319750Cg9 != null) {
            interfaceC319750Cg9.LJJIFFI(this.LLILZLL);
        }
    }

    public final void LJJLIIIJL() {
        C23250099c.LIZLLL(this.LLILLJJLI.getScope(), C2126308Ur.LIZ, null, new C0YXM(this, null), 2);
    }

    public final void LJJLIIIJLLLLLLLZ() {
        C2252321DDq c2252321DDqLIZIZ;
        C0YX2 c0yx2;
        if (this.LLILLJJLI.getConversationId().length() == 0) {
            return;
        }
        PigeonConversationComponentApi pigeonConversationComponentApi = (PigeonConversationComponentApi) C0YXD.LIZLLL(this.LLILLJJLI.LJJJJLL(), C13LE.LIZ(PigeonConversationComponentApi.class));
        if (pigeonConversationComponentApi == null || (c2252321DDqLIZIZ = pigeonConversationComponentApi.LIZIZ()) == null || (c0yx2 = (C0YX2) c2252321DDqLIZIZ.getValue()) == null) {
            return;
        }
        LJI(0, c0yx2.LIZ);
    }

    @Override // X.InterfaceC870420YCq
    public final void LJIILIIL() {
        LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC870420YCq
    public final void LJIJ(List<String> list) {
        if (((ArrayList) list).contains(this.LLILLJJLI.getConversationId())) {
            LJJLIIIJLLLLLLLZ();
        }
    }

    public final void LJJLIIIJJIZ(C397901gf c397901gf) {
        if (this.LLILLL != null) {
            c397901gf.getClass();
            C1548820qPI.LIZIZ(c397901gf);
            C1018703yb.LIZIZ("pigeon_jsb_event", C2097608Jq.LJIIIIZZ(new Pair("client", this.LLILZ), new Pair("container_id", this.LLILZIL), new Pair("name", c397901gf.LL), new Pair("conversation_id", this.LLILLJJLI.getConversationId())));
        }
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJLJLI(List<C0YAE> list) {
        LJJLIIIJL();
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJLL(List<C0YAE> list) {
        LJJLIIIJL();
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJZZI(List<C0YAE> list) {
        LJJLIIIJL();
    }

    @Override // X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return;
        }
        LJJLIIIJJI(Collections.singletonList(c869590Y9l), new AwS415S0200000_14(this, c869590Y9l, 12));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0YXN] */
    public EventCenterComponent(GECPigeon gECPigeon, IConversationDetailContainer iConversationDetailContainer) {
        super(gECPigeon, iConversationDetailContainer);
        this.LLILZ = "";
        this.LLILZIL = "";
        this.LLILZLL = new C1741406rs() { // from class: X.0YXN
            @Override // X.C1741406rs, X.C1741506rt, X.InterfaceC868420Y4y
            public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
                if (list != null && !list.isEmpty()) {
                    EventCenterComponent eventCenterComponent = this.LL;
                    eventCenterComponent.LJJLIIIJJI(list, new AwS415S0200000_14(eventCenterComponent, (EventCenterComponent) list, (List<C869590Y9l>) 11));
                }
            }

            @Override // X.C1741406rs, X.C1741506rt, X.InterfaceC868420Y4y
            public final void a(int i, String str, List list, Long l) {
                if (list != null && !list.isEmpty()) {
                    EventCenterComponent eventCenterComponent = this.LL;
                    eventCenterComponent.LJJLIIIJJI(list, new AwS415S0200000_14(eventCenterComponent, (EventCenterComponent) list, (List<C869590Y9l>) 15));
                }
            }
        };
    }

    @Override // X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
        if (i == C0YIF.LIZ && c869590Y9l != null) {
            LJJLIIIJJI(Collections.singletonList(c869590Y9l), new AwS415S0200000_14(this, c869590Y9l, 101));
        }
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXG
    public final void LJI(int i, C0Y8T c0y8t) {
        if (c0y8t == null) {
            return;
        }
        C23250099c.LIZLLL(this.LLILLJJLI.getScope(), C2126308Ur.LIZ, null, new C875680YWw(this, c0y8t, null), 2);
    }

    public final void LJJLIIIJJI(List<? extends C869590Y9l> list, Function0<Unit> function0) {
        if (list != null && !list.isEmpty()) {
            Iterator<? extends C869590Y9l> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getConversationId(), this.LLILLJJLI.getConversationId())) {
                    function0.invoke();
                    return;
                }
            }
        }
    }

    public final void LJJLIIIJLJLI(String str, List<? extends C869590Y9l> list) {
        C2252321DDq c2252321DDqLIZIZ;
        C0YX2 c0yx2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", str);
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            Pair[] pairArr = new Pair[13];
            pairArr[0] = new Pair("content", c869590Y9l.getContent());
            Map<String, String> ext = c869590Y9l.getExt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(ext.size()));
            Iterator<T> it2 = ext.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            pairArr[1] = new Pair("ext", linkedHashMap2);
            pairArr[2] = new Pair("conversationShortId", String.valueOf(c869590Y9l.getConversationShortId()));
            pairArr[3] = new Pair("conversationType", Integer.valueOf(c869590Y9l.getConversationType()));
            pairArr[4] = new Pair("createdAt", Long.valueOf(c869590Y9l.getCreatedAt()));
            Map<String, String> localExt = c869590Y9l.getLocalExt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(localExt.size()));
            Iterator<T> it3 = localExt.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
            pairArr[5] = new Pair("localExt", linkedHashMap3);
            pairArr[6] = new Pair("msgId", C876050YYh.LJFF(c869590Y9l.getMsgId()));
            pairArr[7] = new Pair("msgStatus", Integer.valueOf(C876050YYh.LJ(c869590Y9l.getMsgStatus())));
            pairArr[8] = new Pair("msgType", Integer.valueOf(c869590Y9l.getMsgType()));
            pairArr[9] = new Pair("orderInConversation", String.valueOf(c869590Y9l.getOrderIndex()));
            pairArr[10] = new Pair("indexInConversation", String.valueOf(c869590Y9l.getIndex()));
            pairArr[11] = new Pair("sender", String.valueOf(c869590Y9l.getSender()));
            pairArr[12] = new Pair("uuid", c869590Y9l.getUuid());
            arrayList.add(C2097608Jq.LJIIIIZZ(pairArr));
        }
        linkedHashMap.put("msgList", arrayList);
        long jCurrentTimeMillis = System.currentTimeMillis();
        new C1061730djf();
        LJJLIIIJJIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(linkedHashMap), "ecim.messageDataSourceChange"));
        PigeonConversationComponentApi pigeonConversationComponentApi = (PigeonConversationComponentApi) C0YXD.LIZLLL(this.LLILLJJLI.LJJJJLL(), C13LE.LIZ(PigeonConversationComponentApi.class));
        if (pigeonConversationComponentApi != null && (c2252321DDqLIZIZ = pigeonConversationComponentApi.LIZIZ()) != null && (c0yx2 = (C0YX2) c2252321DDqLIZIZ.getValue()) != null) {
            LJI(0, c0yx2.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.EventCenterComponentApi
    public final void Ib2(String str, String str2, String str3) {
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return;
        }
        LJJLIIIJJI(Collections.singletonList(c869590Y9l), new AwS415S0200000_14(this, c869590Y9l, 102));
    }

    @Override // X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        if (list != null && !list.isEmpty()) {
            LJJLIIIJJI(list, new AwS415S0200000_14(this, (EventCenterComponent) list, (List<C869590Y9l>) 13));
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        if (list != null && !list.isEmpty()) {
            LJJLIIIJJI(list, new AwS415S0200000_14(this, (EventCenterComponent) list, (List<C869590Y9l>) 14));
        }
    }
}
