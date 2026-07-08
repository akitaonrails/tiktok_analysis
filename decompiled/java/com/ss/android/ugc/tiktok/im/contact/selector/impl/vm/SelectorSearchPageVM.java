package com.ss.android.ugc.tiktok.im.contact.selector.impl.vm;

import X.AbstractC1223670hwr;
import X.AbstractC1223800hx4;
import X.AbstractC316870CbV;
import X.AbstractC595720NYc;
import X.AnonymousClass0956;
import X.C013C;
import X.C01GW;
import X.C0PEM;
import X.C1218620hoi;
import X.C1223620hwm;
import X.C1223660hwq;
import X.C1223680hws;
import X.C1224280hxq;
import X.C1224840hyk;
import X.C13BV;
import X.C23250099c;
import X.C259800zU;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C322810Cl5;
import X.C452501pT;
import X.C627660Ojc;
import X.C897520ZIw;
import X.EnumC1989907qr;
import X.InterfaceC0148002o;
import X.InterfaceC1223330hwJ;
import X.InterfaceC1223520hwc;
import X.InterfaceC1223590hwj;
import X.InterfaceC1224310hxt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorSearchPageVM extends AssemListViewModel<C1218620hoi, AbstractC1223800hx4, Object> implements InterfaceC1224310hxt {
    public final InterfaceC1223330hwJ LL;
    public final C01GW LLILLJJLI = C1223620hwm.LJ(this);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2674));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2675));
    public EnumC1989907qr LLILZIL = EnumC1989907qr.INVOKE_SEARCH;
    public List<? extends AbstractC1223800hx4> LLILZLL = C13BV.INSTANCE;
    public String LLIZ;
    public C897520ZIw LLIZLLLIL;
    public AnonymousClass0956 LLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218620hoi(6, new C627660Ojc(null, null, null, null, 15));
    }

    @Override // X.InterfaceC1224310hxt
    public final void hf2() {
        if (((Boolean) this.LLILZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C322810Cl5(this, null), 2);
        }
    }

    public final InterfaceC1223520hwc wQ2() {
        return (InterfaceC1223520hwc) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1224310hxt
    public final boolean qp2() {
        return wQ2().LIZIZ().LIZIZ;
    }

    @Override // X.InterfaceC1224310hxt
    public final List<AbstractC1223800hx4> kX0() {
        return this.LLILZLL;
    }

    public SelectorSearchPageVM(InterfaceC1223330hwJ interfaceC1223330hwJ) {
        this.LL = interfaceC1223330hwJ;
    }

    public static AbstractC316870CbV xQ2(AbstractC1223670hwr abstractC1223670hwr) {
        if (abstractC1223670hwr instanceof C1223660hwq) {
            C1223660hwq c1223660hwq = (C1223660hwq) abstractC1223670hwr;
            if (!c1223660hwq.LIZIZ) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                List<AbstractC1223800hx4> list = c1223660hwq.LIZ;
                c317290CcB.getClass();
                return new C316640Cb8(list);
            }
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c1223660hwq.LIZJ, c1223660hwq.LIZ, 1);
        }
        if (abstractC1223670hwr instanceof C1223680hws) {
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Exception exc = ((C1223680hws) abstractC1223670hwr).LIZ;
            c317290CcB2.getClass();
            return new C316650Cb9(exc);
        }
        C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB3.getClass();
        return new C316640Cb8(c13bv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1224310hxt
    public final void Ki0(List<? extends AbstractC1223800hx4> list) {
        vQ2(C627660Ojc.LIZ(((C1218620hoi) getState()).LL, null, null, null, list, 7), false);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<AbstractC1223800hx4> c627660Ojc) {
        C1223620hwm.LIZJ(c627660Ojc, this.LL);
        vQ2(c627660Ojc, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Object>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C323050ClT
            if (r0 == 0) goto L60
            r4 = r6
            X.0ClT r4 = (X.C323050ClT) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L66
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0hwr r1 = (X.AbstractC1223670hwr) r1
            X.0CbV r0 = xQ2(r1)
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.07qr r1 = r5.LLILZIL
            X.07qr r0 = X.EnumC1989907qr.SET_DEFAULT_DATA
            if (r1 != r0) goto L49
            X.0hwc r0 = r5.wQ2()
            X.0hwj r0 = r0.LIZ()
            java.util.List r1 = r0.LJJIJ()
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r1)
            return r0
        L49:
            X.0hwc r0 = r5.wQ2()
            X.0hwj r1 = r0.LIZ()
            java.lang.String r0 = r5.LLIZ
            if (r0 != 0) goto L57
            java.lang.String r0 = ""
        L57:
            r4.LLILLL = r2
            java.lang.Object r1 = r1.LJJIIZ(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L60:
            X.0ClT r4 = new X.0ClT
            r4.<init>(r5, r6)
            goto L12
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchPageVM.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.Object r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Object>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C323060ClU
            if (r0 == 0) goto L3d
            r4 = r7
            X.0ClU r4 = (X.C323060ClU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0hwr r3 = (X.AbstractC1223670hwr) r3
            X.0CbV r0 = xQ2(r3)
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0hwc r0 = r5.wQ2()
            X.0hwj r0 = r0.LIZ()
            r4.LLILLL = r1
            X.0hwq r3 = r0.LJJIFFI()
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.0ClU r4 = new X.0ClU
            r4.<init>(r5, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchPageVM.onLoadMore(java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, X.0Ojc] */
    public final void vQ2(C627660Ojc<AbstractC1223800hx4> c627660Ojc, boolean z) {
        List<ITEM> list;
        List<? extends AbstractC1223800hx4> list2 = c627660Ojc.LLILZ;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = c627660Ojc;
        C013C c013c = new C013C();
        if (z) {
            if (wQ2().LIZ().LIZJ().LIZ()) {
                InterfaceC1223590hwj interfaceC1223590hwjLIZ = wQ2().LIZ();
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                c259800zU.element = C627660Ojc.LIZ(c627660Ojc, null, null, null, interfaceC1223590hwjLIZ.LJIJJLI(list2), 7);
            }
            List<ITEM> list3 = ((C627660Ojc) c259800zU.element).LLILZ;
            if (list3 != 0 && ((C1224280hxq) this.LLILLJJLI.getValue()).LJ().LJJIZ().LIZLLL()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (obj instanceof C1224840hyk) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC595720NYc abstractC595720NYcLIZIZ = C1223620hwm.LIZIZ((C1224840hyk) it2.next());
                    if (abstractC595720NYcLIZIZ != null) {
                        arrayList2.add(abstractC595720NYcLIZIZ);
                    }
                }
                C897520ZIw c897520ZIw = this.LLIZLLLIL;
                if (c897520ZIw != null) {
                    c897520ZIw.LJFF(arrayList2);
                }
            }
            List<AbstractC1223800hx4> list4 = ((C1218620hoi) getState()).LL.LLILZ;
            boolean z2 = false;
            if ((list4 == null || list4.isEmpty()) && (list = ((C627660Ojc) c259800zU.element).LLILZ) != 0 && !list.isEmpty()) {
                z2 = true;
            }
            c013c.element = z2;
        }
        List list5 = ((C627660Ojc) c259800zU.element).LLILZ;
        if (list5 == null) {
            list5 = C13BV.INSTANCE;
        }
        this.LLILZLL = list5;
        setState(new AwS385S0200000_19(c013c, c259800zU, 74));
    }
}
