package com.ss.android.ugc.aweme.im.streaming.sugar;

import X.AnonymousClass0950;
import X.C05YD;
import X.C099R;
import X.C09AE;
import X.C09IC;
import X.C09IR;
import X.C0YNY;
import X.C0Z2Z;
import X.C0ZDX;
import X.C13LP;
import X.C15438062q;
import X.C1887607aM;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C823170WQx;
import X.C869590Y9l;
import X.C905340ZfQ;
import X.C905350ZfR;
import X.C905740Zg4;
import X.C905810ZgB;
import X.C905840ZgE;
import X.C905850ZgF;
import X.C905870ZgH;
import X.C905890ZgJ;
import X.C905900ZgK;
import X.C906150Zgj;
import X.EnumC905780Zg8;
import X.EnumC905800ZgA;
import X.InterfaceC1364105Vn;
import X.InterfaceC332260D0u;
import X.InterfaceC346201Wa;
import X.InterfaceC874680YTa;
import X.InterfaceC905300ZfM;
import X.InterfaceC905630Zft;
import X.InterfaceC905750Zg5;
import X.InterfaceC905820ZgC;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.ReplySourcePayloadData;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StreamingCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamStatusComponent;
import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public final class StreamingViewModel extends ViewModel implements InterfaceC905300ZfM {
    public final StreamingSugar LL;
    public final InterfaceC905750Zg5 LLILLJJLI;
    public final C1887607aM LLILLL;
    public final InterfaceC905630Zft LLILZ;
    public final ConcurrentHashMap<String, C905890ZgJ> LLILZIL = new ConcurrentHashMap<>();
    public final C823170WQx<String> LLILZLL = new C823170WQx<>();
    public final C823170WQx<String> LLIZ = new C823170WQx<>();
    public final ConcurrentHashMap<String, C05YD<InterfaceC905820ZgC>> LLIZLLLIL = new ConcurrentHashMap<>();
    public final C2252321DDq LLJ = C1BNE.LIZ(C905870ZgH.LIZ);
    public final C2252331DDr LLJI;
    public final AnonymousClass0950 LLJIJIL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        synchronized (this.LLILZIL) {
            try {
                Iterator<T> it2 = this.LLILZIL.values().iterator();
                while (it2.hasNext()) {
                    ((C905890ZgJ) it2.next()).LIZIZ.LIZIZ(null);
                }
                for (String str : this.LLILZIL.keySet()) {
                    this.LLILLJJLI.LJJIIJ(str);
                    this.LLILLJJLI.LIZIZ(str);
                }
                this.LLILZIL.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLIZLLLIL.clear();
        this.LLIZ.clear();
        this.LLILZ.LIZ();
        if (!this.LLILZLL.isEmpty()) {
            this.LLILLJJLI.LIZ(C13LP.LLIIJI(this.LLILZLL));
            this.LLILZLL.clear();
        }
    }

    @Override // X.InterfaceC905300ZfM
    public final AnonymousClass0950 IK1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC905300ZfM
    public final void AD(C869590Y9l c869590Y9l) {
        if (!C0ZDX.LJJJJJL(c869590Y9l)) {
            return;
        }
        String uuid = c869590Y9l.getUuid();
        synchronized (this.LLILZIL) {
            try {
                C905890ZgJ c905890ZgJ = this.LLILZIL.get(uuid);
                if (c905890ZgJ != null) {
                    c905890ZgJ.LIZIZ.LIZIZ(null);
                    this.LLILLJJLI.LJJIIJ(uuid);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILZ.LJFF(uuid, EnumC905780Zg8.CANCELLED, null, null, null, false, null);
        this.LLJI.LIZJ(Unit.LIZ);
    }

    @Override // X.InterfaceC905300ZfM
    public final void CN2(C869590Y9l c869590Y9l) {
        StreamingCardTemplate streamingCardTemplate;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (!(baseTemplateLIZ instanceof StreamingCardTemplate) || (streamingCardTemplate = (StreamingCardTemplate) baseTemplateLIZ) == null || !C905900ZgK.LIZ(streamingCardTemplate.streamStatus)) {
            return;
        }
        synchronized (this.LLILZIL) {
            try {
                String uuid = c869590Y9l.getUuid();
                C905890ZgJ c905890ZgJRemove = this.LLILZIL.remove(uuid);
                if (c905890ZgJRemove != null) {
                    c905890ZgJRemove.LIZIZ.LIZIZ(null);
                    this.LLILLJJLI.LJJIIJ(uuid);
                    this.LLILLJJLI.LIZIZ(uuid);
                    this.LLILZLL.add(uuid);
                    this.LLILZ.LJFF(uuid, EnumC905780Zg8.REMOTE_MESSAGE_ARRIVED, null, null, null, false, null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJI.LIZJ(Unit.LIZ);
    }

    @Override // X.InterfaceC905300ZfM
    public final C05YD<InterfaceC905820ZgC> Kl0(C869590Y9l c869590Y9l) {
        InterfaceC332260D0u<InterfaceC905820ZgC> interfaceC332260D0u;
        InterfaceC332260D0u<InterfaceC905820ZgC> interfaceC332260D0u2;
        StreamingCardTemplate streamingCardTemplate;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if ((baseTemplateLIZ instanceof StreamingCardTemplate) && (streamingCardTemplate = (StreamingCardTemplate) baseTemplateLIZ) != null && C905900ZgK.LIZ(streamingCardTemplate.streamStatus)) {
            ConcurrentHashMap<String, C05YD<InterfaceC905820ZgC>> concurrentHashMap = this.LLIZLLLIL;
            String uuid = c869590Y9l.getUuid();
            C05YD<InterfaceC905820ZgC> c05ydLIZ = concurrentHashMap.get(uuid);
            if (c05ydLIZ == null) {
                C906150Zgj c906150Zgj = BlockUIData.Companion;
                List<StreamBlockComponent> list = streamingCardTemplate.blocks;
                c906150Zgj.getClass();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (StreamBlockComponent streamBlockComponent : list) {
                    BlockUIData.Companion.getClass();
                    arrayList.add(C906150Zgj.LIZ(streamBlockComponent));
                }
                c05ydLIZ = C1BNE.LIZ(new C905850ZgF(arrayList));
                C05YD<InterfaceC905820ZgC> c05ydPutIfAbsent = concurrentHashMap.putIfAbsent(uuid, c05ydLIZ);
                if (c05ydPutIfAbsent != null) {
                    c05ydLIZ = c05ydPutIfAbsent;
                }
            }
            return c05ydLIZ;
        }
        C905890ZgJ c905890ZgJ = this.LLILZIL.get(c869590Y9l.getUuid());
        if (c905890ZgJ != null && (interfaceC332260D0u2 = c905890ZgJ.LIZ) != null) {
            return interfaceC332260D0u2;
        }
        x50(c869590Y9l);
        C905890ZgJ c905890ZgJ2 = this.LLILZIL.get(c869590Y9l.getUuid());
        if (c905890ZgJ2 != null && (interfaceC332260D0u = c905890ZgJ2.LIZ) != null) {
            return interfaceC332260D0u;
        }
        return this.LLJ;
    }

    @Override // X.InterfaceC905300ZfM
    public final void p61(C869590Y9l c869590Y9l) {
        PersistentExtraData persistentExtraDataLJIIIIZZ;
        ReplySourcePayloadData replySourcePayloadData;
        String str;
        if (!c869590Y9l.getLocalExt().containsKey("can_insert_streaming_message") || !this.LLILLL.LIZ.invoke(c869590Y9l).booleanValue() || (persistentExtraDataLJIIIIZZ = C0ZDX.LJIIIIZZ(c869590Y9l)) == null || (replySourcePayloadData = persistentExtraDataLJIIIIZZ.replySourcePayload) == null || (str = replySourcePayloadData.clientMessageIdForReply) == null || str.length() == 0 || this.LLILZIL.containsKey(str) || !this.LLIZ.add(str) || C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZLLL(str) != null) {
            return;
        }
        vQ2(new C905350ZfR(c869590Y9l.getConversationId(), str, c869590Y9l.getConversationShortId(), c869590Y9l.getUuid(), Long.valueOf(c869590Y9l.getMsgId()), null, 32), false, EnumC905800ZgA.AUTO_START_ON_OPEN);
    }

    @Override // X.InterfaceC905300ZfM
    public final void x50(C869590Y9l c869590Y9l) {
        C905810ZgB c905810ZgBLJFF;
        StreamingCardTemplate streamingCardTemplate;
        StreamStatusComponent streamStatusComponent;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (((baseTemplateLIZ instanceof StreamingCardTemplate) && (streamingCardTemplate = (StreamingCardTemplate) baseTemplateLIZ) != null && (streamStatusComponent = streamingCardTemplate.streamStatus) != null && C905900ZgK.LIZ(streamStatusComponent)) || (c905810ZgBLJFF = this.LLILLJJLI.LJFF(c869590Y9l, this.LLILLL.LIZIZ)) == null) {
            return;
        }
        synchronized (this.LLILZIL) {
            try {
                ConcurrentHashMap<String, C905890ZgJ> concurrentHashMap = this.LLILZIL;
                String str = c905810ZgBLJFF.LIZ;
                C905890ZgJ c905890ZgJWQ2 = concurrentHashMap.get(str);
                if (c905890ZgJWQ2 == null) {
                    this.LLILZ.LJ(c905810ZgBLJFF.LIZ, c869590Y9l.getConversationId(), c869590Y9l.getConversationShortId(), EnumC905800ZgA.RESUME, null, null, null);
                    this.LLILZ.LIZIZ(c905810ZgBLJFF.LIZ);
                    c905890ZgJWQ2 = wQ2(c905810ZgBLJFF.LIZ, c905810ZgBLJFF.LIZIZ, c905810ZgBLJFF.LIZJ);
                    C905890ZgJ c905890ZgJPutIfAbsent = concurrentHashMap.putIfAbsent(str, c905890ZgJWQ2);
                    if (c905890ZgJPutIfAbsent != null) {
                        c905890ZgJWQ2 = c905890ZgJPutIfAbsent;
                    }
                }
                C905890ZgJ c905890ZgJ = c905890ZgJWQ2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJI.LIZJ(Unit.LIZ);
    }

    @Override // X.InterfaceC905300ZfM
    public final Object BD0(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (!C0ZDX.LJJJJJL(c869590Y9l)) {
            return Unit.LIZ;
        }
        String uuid = c869590Y9l.getUuid();
        synchronized (this.LLILZIL) {
            try {
                C905890ZgJ c905890ZgJ = this.LLILZIL.get(uuid);
                if (c905890ZgJ != null) {
                    c905890ZgJ.LIZIZ.LIZIZ(null);
                    InterfaceC905820ZgC value = c905890ZgJ.LIZ.getValue();
                    if (!(value instanceof C905850ZgF)) {
                        c905890ZgJ.LIZ.setValue(new C905840ZgE(value.LIZ(), value.getRawData(), value.getExtraData()));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILZ.LJFF(uuid, EnumC905780Zg8.CANCELLED, null, null, null, false, null);
        Object objLJ = this.LLILLJJLI.LJ(uuid, c869590Y9l.getConversationId(), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC905300ZfM
    public final void Hv2(C905350ZfR c905350ZfR, boolean z) {
        vQ2(c905350ZfR, z, EnumC905800ZgA.MANUAL_START);
    }

    @Override // X.InterfaceC905300ZfM
    public final InterfaceC332260D0u TH2(C905340ZfQ c905340ZfQ, boolean z) {
        C09AE c09ae;
        InterfaceC332260D0u<InterfaceC905820ZgC> interfaceC332260D0u;
        synchronized (this.LLILZIL) {
            if (z) {
                try {
                    C905890ZgJ c905890ZgJRemove = this.LLILZIL.remove(c905340ZfQ.LIZIZ);
                    if (c905890ZgJRemove != null && (c09ae = c905890ZgJRemove.LIZIZ) != null) {
                        c09ae.LIZIZ(null);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ConcurrentHashMap<String, C905890ZgJ> concurrentHashMap = this.LLILZIL;
            String str = c905340ZfQ.LIZIZ;
            C905890ZgJ c905890ZgJWQ2 = concurrentHashMap.get(str);
            if (c905890ZgJWQ2 == null) {
                c905890ZgJWQ2 = wQ2(c905340ZfQ.LIZIZ, this.LL.Rx1(c905340ZfQ, this.LLILLL.LIZIZ, EnumC905800ZgA.MESSAGE_SENT), C905870ZgH.LIZ);
                C905890ZgJ c905890ZgJPutIfAbsent = concurrentHashMap.putIfAbsent(str, c905890ZgJWQ2);
                if (c905890ZgJPutIfAbsent != null) {
                    c905890ZgJWQ2 = c905890ZgJPutIfAbsent;
                }
            }
            interfaceC332260D0u = c905890ZgJWQ2.LIZ;
        }
        this.LLJI.LIZJ(Unit.LIZ);
        return interfaceC332260D0u;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[PHI: r9
      0x00c2: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String), (r9v3 java.lang.String) binds: [B:36:0x00a3, B:38:0x00a9, B:40:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC905300ZfM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Tq2(X.C869590Y9l r14, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.im.streaming.api.StreamingInterruptResponseData>> r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streaming.sugar.StreamingViewModel.Tq2(X.0Y9l, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC905300ZfM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x51(X.C869590Y9l r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streaming.sugar.StreamingViewModel.x51(X.0Y9l, X.05Vn):java.lang.Object");
    }

    public final void vQ2(C905350ZfR c905350ZfR, boolean z, EnumC905800ZgA enumC905800ZgA) {
        C09AE c09ae;
        if (!z && C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZLLL(c905350ZfR.LIZIZ) != null) {
            return;
        }
        synchronized (this.LLILZIL) {
            if (z) {
                try {
                    C905890ZgJ c905890ZgJRemove = this.LLILZIL.remove(c905350ZfR.LIZIZ);
                    if (c905890ZgJRemove != null && (c09ae = c905890ZgJRemove.LIZIZ) != null) {
                        c09ae.LIZIZ(null);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ConcurrentHashMap<String, C905890ZgJ> concurrentHashMap = this.LLILZIL;
            String str = c905350ZfR.LIZIZ;
            C905890ZgJ c905890ZgJWQ2 = concurrentHashMap.get(str);
            if (c905890ZgJWQ2 == null) {
                c905890ZgJWQ2 = wQ2(c905350ZfR.LIZIZ, this.LL.l42(c905350ZfR, this.LLILLL.LIZIZ, enumC905800ZgA), C905870ZgH.LIZ);
                C905890ZgJ c905890ZgJPutIfAbsent = concurrentHashMap.putIfAbsent(str, c905890ZgJWQ2);
                if (c905890ZgJPutIfAbsent != null) {
                    c905890ZgJWQ2 = c905890ZgJPutIfAbsent;
                }
            }
            C905890ZgJ c905890ZgJ = c905890ZgJWQ2;
        }
        this.LLJI.LIZJ(Unit.LIZ);
    }

    public final C905890ZgJ wQ2(String str, InterfaceC346201Wa<? extends InterfaceC905820ZgC> interfaceC346201Wa, InterfaceC905820ZgC interfaceC905820ZgC) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(interfaceC905820ZgC);
        return new C905890ZgJ(c2252321DDqLIZ, C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C905740Zg4(interfaceC346201Wa, c2252321DDqLIZ, this, str, null), 3));
    }

    public StreamingViewModel(StreamingSugar streamingSugar, InterfaceC905750Zg5 interfaceC905750Zg5, C1887607aM c1887607aM, InterfaceC905630Zft interfaceC905630Zft) {
        this.LL = streamingSugar;
        this.LLILLJJLI = interfaceC905750Zg5;
        this.LLILLL = c1887607aM;
        this.LLILZ = interfaceC905630Zft;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLJI = c2252331DDrLIZIZ;
        this.LLJIJIL = C09IC.LIZ(c2252331DDrLIZIZ);
    }
}
