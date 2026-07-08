package com.ss.android.ugc.aweme.chatnoticenew;

import X.AbstractC2252651DEx;
import X.AnonymousClass0684;
import X.C013C;
import X.C01GW;
import X.C069Y;
import X.C06NH;
import X.C06NJ;
import X.C06O6;
import X.C06OD;
import X.C06OK;
import X.C06OL;
import X.C06ON;
import X.C06OO;
import X.C06OT;
import X.C098200Yq;
import X.C0PEM;
import X.C0W8I;
import X.C13BV;
import X.C13E8;
import X.C13LP;
import X.C1599406Oa;
import X.C1599606Oc;
import X.C189200o6;
import X.C1DFH;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C452501pT;
import X.EnumC1596306Mv;
import X.InterfaceC1294060jmO;
import X.InterfaceC1599506Ob;
import X.InterfaceC497601wk;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatNoticeFlowEngine implements IChatNoticeFlowEngine {
    public InterfaceC497601wk LIZIZ;
    public boolean LIZJ;
    public String LIZLLL = "";
    public InterfaceC1599506Ob LJ;
    public Function0<Unit> LJFF;
    public final C01GW LJI;
    public List<C06ON> LJII;
    public boolean LJIIIIZZ;
    public final C13E8<C1599606Oc> LJIIIZ;
    public final C06OK LJIIJ;

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final void LIZIZ() {
        for (C06ON c06on : this.LJII) {
            C1599406Oa c1599406Oa = c06on.LJII;
            if (c1599406Oa != null) {
                c1599406Oa.LIZJ = false;
                c1599406Oa.LIZLLL = true;
                C06OT.LIZ(c1599406Oa);
            }
            c06on.LJII = null;
        }
    }

    public final void LJIJ() {
        C0W8I.LIZ.getClass();
        if (C0W8I.LIZIZ() || C0W8I.LIZJ()) {
            try {
                C13E8<C1599606Oc> c13e8 = this.LJIIIZ;
                System.currentTimeMillis();
                c13e8.addLast(new C1599606Oc());
                if (this.LJIIIZ.size() > 50) {
                    this.LJIIIZ.LJIILJJIL();
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public ChatNoticeFlowEngine() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(198));
        this.LJII = C13BV.INSTANCE;
        this.LJIIIZ = new C13E8<>();
        this.LJIIJ = new C06OK(this, null);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final C13E8<C1599606Oc> LJFF() {
        return this.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final EnumC1596306Mv LIZJ(C06NH c06nh) {
        C06OO c06oo;
        C06ON c06on = (C06ON) C13LP.LJJJLZIJ(c06nh.ordinal(), this.LJII);
        if (c06on != null && (c06oo = c06on.LIZJ) != null) {
            return c06oo.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final void LJ(C069Y c069y) {
        this.LJ = c069y;
    }

    @Override // X.C06N8
    @InterfaceC1294060jmO
    public final void LJI(AFwS229S0000000_2 aFwS229S0000000_2) {
        for (C06ON c06on : this.LJII) {
            C06OO c06oo = c06on.LIZJ;
            if (c06oo != null && ((Boolean) aFwS229S0000000_2.invoke(c06oo)).booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(c06on.LIZ);
                sbLIZ.append("] Current task ");
                sbLIZ.append(c06oo.LIZ);
                sbLIZ.append(" to be resumed.");
                C2188811AlT.LIZIZ(sbLIZ);
                LJIJ();
                AnonymousClass0684<C06OO> anonymousClass0684LIZJ = c06on.LIZJ(c06oo.LIZ);
                if (anonymousClass0684LIZJ != null) {
                    anonymousClass0684LIZJ.resume();
                }
            }
        }
    }

    @Override // X.C06N8
    @InterfaceC1294060jmO
    public final void LJII(Function1<? super C06OO, Boolean> function1) {
        for (C06ON c06on : this.LJII) {
            C06OO c06oo = c06on.LIZJ;
            if (c06oo != null && function1.invoke(c06oo).booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(c06on.LIZ);
                sbLIZ.append("] Current task ");
                sbLIZ.append(c06oo.LIZ);
                sbLIZ.append(" to be paused.");
                C2188811AlT.LIZIZ(sbLIZ);
                LJIJ();
                AnonymousClass0684<C06OO> anonymousClass0684LIZJ = c06on.LIZJ(c06oo.LIZ);
                if (anonymousClass0684LIZJ != null) {
                    anonymousClass0684LIZJ.pause();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final void LJIIIIZZ(boolean z) {
        InterfaceC497601wk interfaceC497601wk;
        boolean z2 = this.LJIIIIZZ;
        this.LJIIIIZZ = z;
        if (z2 && !z && C06NJ.LIZIZ() && (interfaceC497601wk = this.LIZIZ) != null) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C06OL(this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final <T extends C06OO> void LJIIIZ(C06OD<T> c06od) {
        EnumC1596306Mv enumC1596306Mv = c06od.LL;
        ((C06ON) ListProtector.get(this.LJII, enumC1596306Mv.getSceneId().ordinal())).LJFF.put(enumC1596306Mv, c06od);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final <T extends C06OO> void LJIIJJI(C06O6<T> c06o6) {
        if (c06o6.LIZLLL() && c06o6.LJII().contains(c06o6.LL.LIZIZ)) {
            for (EnumC1596306Mv enumC1596306Mv : c06o6.LIZIZ()) {
                ((C06ON) ListProtector.get(this.LJII, enumC1596306Mv.getSceneId().ordinal())).LJFF.put(enumC1596306Mv, c06o6);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final void LJIIL(EnumC1596306Mv enumC1596306Mv) {
        C06ON next;
        Iterator<C06ON> it2 = this.LJII.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == enumC1596306Mv.getSceneId()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C06ON c06on = next;
        if (c06on != null) {
            List<? extends C06OO> list = c06on.LJ;
            ArrayList arrayList = new ArrayList();
            for (C06OO c06oo : list) {
                if (c06oo.LIZ != enumC1596306Mv) {
                    arrayList.add(c06oo);
                }
            }
            c06on.LJ = arrayList;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final AnonymousClass0684<C06OO> LJIILIIL(EnumC1596306Mv enumC1596306Mv) {
        C06ON next;
        C06NH sceneId = enumC1596306Mv.getSceneId();
        Iterator<C06ON> it2 = this.LJII.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == sceneId) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C06ON c06on = next;
        if (c06on == null) {
            return null;
        }
        return c06on.LIZJ(enumC1596306Mv);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final void LJIILLIIL(AwS546S0100000_2 awS546S0100000_2) {
        this.LJFF = awS546S0100000_2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.C06OO r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C06OX
            if (r0 == 0) goto L40
            r5 = r8
            X.06OX r5 = (X.C06OX) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L34
            if (r0 != r2) goto L46
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            r5.LLILLL = r1
            java.lang.Object r0 = r6.LJIIZILJ(r7, r5)
            if (r0 != r3) goto L37
            return r3
        L34:
            X.C155000ia.LIZIZ(r4)
        L37:
            r5.LLILLL = r2
            java.lang.Object r0 = r6.LJIJJ(r1, r5)
            if (r0 != r3) goto L25
            return r3
        L40:
            X.06OX r5 = new X.06OX
            r5.<init>(r6, r8)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine.LJIILJJIL(X.06OO, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final void LJIILL(Set<? extends EnumC1596306Mv> set, Function0<? extends C06O6<? extends C06OO>> function0) {
        C06O6<? extends C06OO> c06o6;
        if (C06NJ.LIZ() != 0) {
            AwS246S0300000_2 awS246S0300000_2 = new AwS246S0300000_2(new C013C(), (C013C) new C259800zU(), (C259800zU<C06O6<C06OO>>) function0, (Function0<? extends C06O6<? extends C06OO>>) 2);
            for (EnumC1596306Mv enumC1596306Mv : set) {
                C06ON c06on = (C06ON) ListProtector.get(this.LJII, enumC1596306Mv.getSceneId().ordinal());
                if (!c06on.LJFF.containsKey(enumC1596306Mv) && !c06on.LJIIIZ.contains(enumC1596306Mv) && !c06on.LJIIIIZZ.containsKey(enumC1596306Mv)) {
                    c06on.LJIIIIZZ.put(enumC1596306Mv, awS246S0300000_2);
                }
            }
            return;
        }
        C06O6<? extends C06OO> c06o6Invoke = function0.invoke();
        if ((c06o6Invoke instanceof C06O6) && (c06o6 = c06o6Invoke) != null) {
            LJIIJJI(c06o6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.C06OO r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine.LJIIZILJ(X.06OO, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r3.LIZLLL == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        if (r2 != X.EnumC1596306Mv.REPLY_STICKER_RECOMMENDATION) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v15, types: [X.0684, X.06OO] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List<? extends X.06OO>] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0296 -> B:77:0x0198). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0329 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x032c -> B:17:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(X.C06NH r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine.LJIJI(X.06NH, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(boolean r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C06OY
            if (r0 == 0) goto L4b
            r5 = r8
            X.06OY r5 = (X.C06OY) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L3f
            if (r0 != r2) goto L51
            java.lang.Object r1 = r5.LL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C155000ia.LIZIZ(r4)
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r1.next()
            X.06ON r0 = (X.C06ON) r0
            X.06NH r0 = r0.LIZ
            r5.LL = r1
            r5.LLILZ = r2
            java.lang.Object r0 = r6.LJIJI(r0, r5)
            if (r0 != r3) goto L26
            return r3
        L3f:
            X.C155000ia.LIZIZ(r4)
            if (r7 == 0) goto L59
            java.util.List<X.06ON> r0 = r6.LJII
            java.util.Iterator r1 = r0.iterator()
            goto L26
        L4b:
            X.06OY r5 = new X.06OY
            r5.<init>(r6, r8)
            goto L12
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L59:
            java.util.List<X.06ON> r0 = r6.LJII
            java.util.Iterator r4 = r0.iterator()
        L5f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r4.next()
            X.06ON r0 = (X.C06ON) r0
            X.01wk r3 = r6.LIZIZ
            if (r3 == 0) goto L5f
            X.06OM r2 = new X.06OM
            r1 = 0
            r2.<init>(r6, r0, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            goto L5f
        L7a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine.LJIJJ(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00be -> B:11:0x0032). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine, X.C06N8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r9, java.lang.String r10, kotlin.jvm.functions.Function2<? super X.C06OO, ? super X.InterfaceC1364105Vn<? super java.lang.Boolean>, ? extends java.lang.Object> r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine.LIZ(boolean, java.lang.String, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn r9, kotlin.jvm.functions.Function2 r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C06OW
            if (r0 == 0) goto L85
            r6 = r9
            X.06OW r6 = (X.C06OW) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r7 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L40
            if (r0 == r3) goto L4e
            if (r0 != r4) goto L8b
            X.C155000ia.LIZIZ(r7)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r7)
            X.06OZ r0 = new X.06OZ
            r0.<init>(r8)
            r6.LL = r11
            r6.LLILLJJLI = r12
            r6.LLILZLL = r2
            java.lang.Object r7 = r10.invoke(r0, r6)
            if (r7 != r5) goto L47
            return r5
        L40:
            boolean r12 = r6.LLILLJJLI
            boolean r11 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L47:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r1 = r7.iterator()
            goto L59
        L4e:
            boolean r12 = r6.LLILLJJLI
            boolean r11 = r6.LL
            java.lang.Object r1 = r6.LLILLL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C155000ia.LIZIZ(r7)
        L59:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r1.next()
            X.09AE r0 = (X.C09AE) r0
            r6.LLILLL = r1
            r6.LL = r11
            r6.LLILLJJLI = r12
            r6.LLILZLL = r3
            java.lang.Object r0 = r0.LJJZ(r6)
            if (r0 != r5) goto L59
            return r5
        L74:
            if (r12 == 0) goto L93
            if (r11 != 0) goto L79
            r2 = 0
        L79:
            r0 = 0
            r6.LLILLL = r0
            r6.LLILZLL = r4
            java.lang.Object r0 = r8.LJIJJ(r2, r6)
            if (r0 != r5) goto L28
            return r5
        L85:
            X.06OW r6 = new X.06OW
            r6.<init>(r8, r9)
            goto L12
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine.LIZLLL(X.05Vn, kotlin.jvm.functions.Function2, boolean, boolean):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine
    public final void LJIIJ(LifecycleCoroutineScope lifecycleCoroutineScope, boolean z, String str, AbstractC2252651DEx abstractC2252651DEx) {
        this.LIZIZ = lifecycleCoroutineScope;
        this.LIZJ = z;
        this.LIZLLL = str;
        C06NH[] c06nhArrValues = C06NH.values();
        ArrayList arrayList = new ArrayList(c06nhArrValues.length);
        for (C06NH c06nh : c06nhArrValues) {
            arrayList.add(new C06ON(c06nh, abstractC2252651DEx));
        }
        this.LJII = arrayList;
    }
}
