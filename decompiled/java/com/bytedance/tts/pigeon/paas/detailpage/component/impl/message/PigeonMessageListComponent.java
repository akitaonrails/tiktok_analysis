package com.bytedance.tts.pigeon.paas.detailpage.component.impl.message;

import X.AbstractC1741606ru;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0NZ6;
import X.C0NZ9;
import X.C0NZF;
import X.C0NZG;
import X.C0NZH;
import X.C0YVN;
import X.C0YVO;
import X.C0YX2;
import X.C0YXN;
import X.C13BV;
import X.C1741406rs;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C259800zU;
import X.C344001Ve;
import X.C414301jJ;
import X.C452501pT;
import X.C875590YWn;
import X.InterfaceC870420YCq;
import X.InterfaceC875610YWp;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.AbsConversationDetailComponent;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent;
import com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class PigeonMessageListComponent extends AbsConversationDetailComponent<IConversationDetailContainer> implements PigeonMessageListComponentApi {
    public static final /* synthetic */ int LLJJ = 0;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public C1741406rs LLILZIL;
    public final C01GW LLILZLL;
    public AnonymousClass0956 LLIZ;
    public long LLIZLLLIL;
    public Boolean LLJ;
    public final C0YVN LLJI;
    public final C01GW LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final C2252321DDq LLJILJILJ;
    public final C0YVO LLJILLL;

    @Override // X.InterfaceC319750Cg9
    public final Unit LIZLLL() {
        this.LLILLL.setValue(C0NZH.LOADING);
        LJJLIIIJL().LIZLLL();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC319750Cg9
    public final void LJII() {
        AnonymousClass0956 anonymousClass0956LIZLLL;
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C259800zU c259800zU = new C259800zU();
        C0YX2 c0yx2 = (C0YX2) ((PigeonConversationComponentApi) this.LLILZLL.getValue()).LIZIZ().getValue();
        T t = c0yx2 != null ? c0yx2.LIZ : 0;
        c259800zU.element = t;
        if (t != 0) {
            LJJLIIIJL().LJII();
            this.LLILLL.setValue(C0NZH.LOADING);
            this.LLJILJILJ.setValue(C0NZF.LIZ);
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LLILLJJLI.getScope(), null, null, new C0NZ6(this, null), 3);
        } else {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LLILLJJLI.getScope(), null, null, new C0NZ9(c259800zU, this, null), 3);
        }
        this.LLIZ = anonymousClass0956LIZLLL;
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi
    public final C414301jJ LJJIII() {
        return new C414301jJ(this.LLILZ, this.LLJILJIL, new C344001Ve(null));
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXH
    public final void LJJIIJ() {
        this.LL.getPigeonIMClient().LIZIZ.LJIILL().LIZIZ(this.LLJILLL);
        LJJLIIIJL().stop();
        String conversationId = this.LLILLJJLI.getConversationId();
        if (conversationId.length() > 0) {
            LJJLIIIJL().stop();
            this.LL.m144getConversationListManager().LIZJ(conversationId);
        }
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXH
    public final void LJJIIZ() {
        this.LL.getPigeonIMClient().LIZIZ.LJIILL().LIZLLL(this.LLJILLL);
        String conversationId = this.LLILLJJLI.getConversationId();
        if (conversationId.length() > 0) {
            LJJLIIIJL().resume();
            this.LL.m144getConversationListManager().LIZJ(conversationId);
        }
    }

    public final InterfaceC875610YWp LJJLIIIJL() {
        return (InterfaceC875610YWp) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXH
    public final void LJJIIZI() {
        LJJLIIIJL().LJ(this.LLJI);
        this.LLILZIL = null;
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi
    public final C2252321DDq LJJIJLIJ() {
        return this.LLILLL;
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi
    public final C2252321DDq LJJJZ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC319750Cg9
    public final void LJJIFFI(C0YXN c0yxn) {
        this.LLILZIL = c0yxn;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJJI(X.InterfaceC1364105Vn<?> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0NZ7
            if (r0 == 0) goto L27
            r5 = r7
            X.0NZ7 r5 = (X.C0NZ7) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L4e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0NZ7 r5 = new X.0NZ7
            r5.<init>(r6, r7)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            X.0YIy r0 = com.bytedance.tts.pigeon.GECPigeon.Companion
            r0.getClass()
            X.0YWU r0 = X.C872060YIy.LIZ()
            X.0YXL r0 = r0.LIZJ()
            X.1DEx r2 = r0.LIZIZ
            X.0NZ8 r1 = new X.0NZ8
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r2, r1)
            if (r0 != r4) goto L51
            return r4
        L4e:
            X.C155000ia.LIZIZ(r1)
        L51:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent.LJJLIIIJJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0YVO] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0YVN] */
    public PigeonMessageListComponent(GECPigeon gECPigeon, IConversationDetailContainer iConversationDetailContainer) {
        super(gECPigeon, iConversationDetailContainer);
        this.LLILLL = C1BNE.LIZ(C0NZH.IDLE);
        this.LLILZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(iConversationDetailContainer, 34));
        this.LLJI = new AbstractC1741606ru() { // from class: X.0YVN
            @Override // X.AbstractC1741606ru
            public final void LIZ() {
                PigeonMessageListComponent pigeonMessageListComponent = this.LL;
                pigeonMessageListComponent.LLILZ.getValue();
                List<C869590Y9l> listLJIIIIZZ = pigeonMessageListComponent.LJJLIIIJL().LJIIIIZZ();
                C2252321DDq c2252321DDq = pigeonMessageListComponent.LLILZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
                for (C869590Y9l c869590Y9l : listLJIIIIZZ) {
                    if (c869590Y9l.getMsgType() == 10000 && c869590Y9l.getExt().containsKey("a:msg_content")) {
                        c869590Y9l.setMsgStatus(2);
                    }
                    arrayList.add(c869590Y9l);
                }
                c2252321DDq.setValue(arrayList);
            }

            @Override // X.C1741506rt, X.InterfaceC868420Y4y
            public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
                boolean z;
                Integer numValueOf;
                LIZ();
                C1741406rs c1741406rs = this.LL.LLILZIL;
                if (c1741406rs != null) {
                    c1741406rs.Us(list, enumC872590YKz);
                }
                int size = 0;
                if (enumC872590YKz != EnumC872590YKz.SUCCESS && enumC872590YKz != EnumC872590YKz.SKIPPED) {
                    z = false;
                } else {
                    z = true;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("load older ");
                sbLIZ.append(z);
                sbLIZ.append(' ');
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                PigeonMessageListComponent pigeonMessageListComponent = this.LL;
                if (list != null) {
                    size = list.size();
                }
                pigeonMessageListComponent.LJJLIIIJJIZ(size, z);
            }

            @Override // X.C1741506rt, X.InterfaceC868420Y4y
            public final void u6(List<C869590Y9l> list, boolean z) {
                Integer numValueOf;
                int size;
                LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("load newer ");
                sbLIZ.append(z);
                sbLIZ.append(' ');
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                PigeonMessageListComponent pigeonMessageListComponent = this.LL;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                pigeonMessageListComponent.LJJLIIIJJIZ(size, z);
            }

            @Override // X.InterfaceC868420Y4y
            public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
                LIZ();
            }

            @Override // X.C1741506rt, X.InterfaceC868420Y4y
            public final void a(int i, String str, List list, Long l) {
                Integer numValueOf;
                int size;
                LIZ();
                C1741406rs c1741406rs = this.LL.LLILZIL;
                if (c1741406rs != null) {
                    c1741406rs.a(1, str, list, l);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onQuery ");
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                PigeonMessageListComponent pigeonMessageListComponent = this.LL;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                pigeonMessageListComponent.LJJLIIIJJIZ(size, true);
            }
        };
        this.LLJIJIL = C452501pT.LIZIZ(new AwS258S0300000_14(gECPigeon, iConversationDetailContainer, this, 2));
        this.LLJILJIL = C1BNE.LIZ(0);
        this.LLJILJILJ = C1BNE.LIZ(C0NZG.LIZ);
        this.LLJILLL = new InterfaceC870420YCq() { // from class: X.0YVO
            @Override // X.InterfaceC870420YCq
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC870420YCq
            public final void LJIJ(List<String> list) {
                C2252321DDq c2252321DDq = this.LL.LLJILJIL;
                c2252321DDq.setValue(Integer.valueOf(((Number) c2252321DDq.getValue()).intValue() + 1));
            }
        };
    }

    public final void LJJLIIIJJIZ(int i, boolean z) {
        C23250099c.LIZLLL(this.LLILLJJLI.getScope(), null, null, new C875590YWn(z, i, this, null), 3);
    }
}
