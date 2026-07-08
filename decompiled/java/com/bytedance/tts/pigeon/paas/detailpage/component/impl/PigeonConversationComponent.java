package com.bytedance.tts.pigeon.paas.detailpage.component.impl;

import X.C0YX2;
import X.C0YXD;
import X.C13LE;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C872060YIy;
import X.C875690YWx;
import X.InterfaceC497601wk;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.components.api.PigeonConversationListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PigeonConversationComponent extends AbsConversationDetailComponent<IConversationDetailContainer> implements PigeonConversationComponentApi {
    public final C2252321DDq LLILLL;

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.impl.AbsConversationDetailComponent
    public final void LJJLIIIJILLIZJL() {
        Iterator it2 = ((Iterable) ((PigeonConversationListComponentApi) C0YXD.LIZIZ(this.LL, C13LE.LIZ(PigeonConversationListComponentApi.class))).LJIJI().getValue()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C0YX2) next).LIZ.getConversationId(), this.LLILLJJLI.getConversationId())) {
                if (next != null) {
                    this.LLILLL.setValue(next);
                }
            }
        }
        InterfaceC497601wk scope = this.LLILLJJLI.getScope();
        GECPigeon.Companion.getClass();
        C23250099c.LIZLLL(scope, C872060YIy.LIZ().LIZJ().LIZIZ, null, new C875690YWx(this, null), 2);
    }

    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponentApi
    public final C2252321DDq LIZIZ() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJJI(X.InterfaceC1364105Vn<? super X.C0Y8T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C875710YWz
            if (r0 == 0) goto L68
            r5 = r8
            X.0YWz r5 = (X.C875710YWz) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L6f
            X.C155000ia.LIZIZ(r2)
        L23:
            X.0Y8T r2 = (X.C0Y8T) r2
            if (r2 == 0) goto L6e
            X.1DDq r1 = r7.LLILLL
            X.0YX2 r0 = new X.0YX2
            r0.<init>(r2)
            r1.setValue(r0)
        L31:
            return r2
        L32:
            X.C155000ia.LIZIZ(r2)
            X.1DDq r0 = r7.LLILLL
            java.lang.Object r0 = r0.getValue()
            X.0YX2 r0 = (X.C0YX2) r0
            if (r0 == 0) goto L43
            X.0Y8T r2 = r0.LIZ
            if (r2 != 0) goto L31
        L43:
            T extends com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer r0 = r7.LLILLJJLI
            java.lang.String r3 = r0.getConversationId()
            com.bytedance.tts.pigeon.GECPigeon r2 = r7.LL
            r5.LLILLL = r1
            X.0YIy r0 = com.bytedance.tts.pigeon.GECPigeon.Companion
            r0.getClass()
            X.0YWU r0 = X.C872060YIy.LIZ()
            X.0YXL r0 = r0.LIZJ()
            X.1DEx r1 = r0.LIZ
            X.0YI3 r0 = new X.0YI3
            r0.<init>(r2, r3, r4)
            java.lang.Object r2 = X.C23250099c.LJI(r5, r1, r0)
            if (r2 != r6) goto L23
            return r6
        L68:
            X.0YWz r5 = new X.0YWz
            r5.<init>(r7, r8)
            goto L12
        L6e:
            return r4
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent.LJJLIIIJJI(X.05Vn):java.lang.Object");
    }

    public PigeonConversationComponent(GECPigeon gECPigeon, IConversationDetailContainer iConversationDetailContainer) {
        super(gECPigeon, iConversationDetailContainer);
        this.LLILLL = C1BNE.LIZ(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJL(kotlin.jvm.functions.Function2<? super X.C0Y8T, ? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r7, X.InterfaceC1364105Vn<? super X.C0Y8T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C875700YWy
            if (r0 == 0) goto L28
            r5 = r8
            X.0YWy r5 = (X.C875700YWy) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r5.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L36
            if (r2 == r0) goto L44
            if (r2 != r1) goto L2e
            java.lang.Object r0 = r5.LL
            X.C155000ia.LIZIZ(r4)
            return r0
        L28:
            X.0YWy r5 = new X.0YWy
            r5.<init>(r6, r8)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r7
            r5.LLILZ = r0
            java.lang.Object r4 = r6.LJJLIIIJJI(r5)
            if (r4 != r3) goto L4b
            return r3
        L44:
            java.lang.Object r7 = r5.LL
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            X.C155000ia.LIZIZ(r4)
        L4b:
            if (r4 == 0) goto L59
            r5.LL = r4
            r5.LLILZ = r1
            java.lang.Object r0 = r7.invoke(r4, r5)
            if (r0 != r3) goto L58
            return r3
        L58:
            return r4
        L59:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent.LJJL(kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
