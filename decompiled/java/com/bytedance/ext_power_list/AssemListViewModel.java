package com.bytedance.ext_power_list;

import X.AbstractC1264080j02;
import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C1264100j04;
import X.C1264110j05;
import X.C1264120j06;
import X.C1265700j2e;
import X.C1954807lC;
import X.C20600815jK;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C316880CbW;
import X.C317290CcB;
import X.C323380Cm0;
import X.C452501pT;
import X.C627660Ojc;
import X.EnumC323450Cm7;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS137S0101000_31;
import kotlin.jvm.internal.AwS29S0202000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class AssemListViewModel<S extends InterfaceC636340Oxc<S, ITEM>, ITEM extends InterfaceC1891350zJl, Cursor> extends AssemSingleListViewModel<ITEM, S, Cursor> {
    public final C01GW config$delegate = C452501pT.LIZIZ(new AwS548S0100000_4(this, 36));
    public C20600815jK<ITEM> state;

    public Object onLoadLatest(Cursor cursor, InterfaceC1364105Vn<? super AbstractC316870CbV<Cursor>> interfaceC1364105Vn) {
        return onLoadLatest$suspendImpl(this, cursor, interfaceC1364105Vn);
    }

    public abstract Object onLoadMore(Cursor cursor, InterfaceC1364105Vn<? super AbstractC316870CbV<Cursor>> interfaceC1364105Vn);

    public abstract Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Cursor>> interfaceC1364105Vn);

    public final AbstractC329610Cw3<Cursor> getConfig() {
        return (AbstractC329610Cw3) this.config$delegate.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listClear() {
        withState(new AwS610S0100000_31((AssemListViewModel) this, 108));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public List<ITEM> listGetAll() {
        C20600815jK<ITEM> c20600815jK = this.state;
        List<ITEM> list = c20600815jK != null ? (List<ITEM>) c20600815jK.LJII() : null;
        if (list instanceof List) {
            return list;
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void manualListRefresh() {
        getConfig().getOperator().refresh();
    }

    public final C20600815jK<ITEM> getState() {
        return this.state;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddAll(Collection<? extends ITEM> collection) {
        withState(new AwS397S0200000_31((AssemListViewModel) this, (Collection) collection, 23));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddItem(ITEM item) {
        withState(new AwS397S0200000_31((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) item, 24));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public ITEM listGetAt(int i) {
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != null) {
            return (ITEM) c20600815jK.LJI(i);
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public int listIndexOf(ITEM item) {
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != null) {
            return c20600815jK.LJIIIZ(item);
        }
        return -1;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listRemoveItem(ITEM item) {
        withState(new AwS397S0200000_31((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) item, 25));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listRemoveItemAt(int i) {
        withState(new AwS137S0101000_31((AssemListViewModel) this, i, 3));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listSetItem(ITEM item) {
        withState(new AwS397S0200000_31((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) item, 26));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listSetItems(Collection<? extends ITEM> collection) {
        withState(new AwS397S0200000_31((AssemListViewModel) this, (Collection) collection, 27));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void manualListLoadLatest(Cursor cursor) {
        getConfig().getOperator().LIZLLL(cursor);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void manualListLoadMore(Cursor cursor) {
        getConfig().getOperator().LIZ(cursor);
    }

    public void manualListRetry(EnumC323450Cm7 enumC323450Cm7) {
        getConfig().getOperator().LIZIZ(enumC323450Cm7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setListState(C20600815jK<?> c20600815jK) {
        this.state = c20600815jK;
    }

    public final void setState(C20600815jK<ITEM> c20600815jK) {
        this.state = c20600815jK;
    }

    public final AbstractC316870CbV<Cursor> toValue$ext_power_list_release(AbstractC1264080j02<ITEM> abstractC1264080j02) {
        if (abstractC1264080j02 instanceof C1265700j2e) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            C1265700j2e c1265700j2e = (C1265700j2e) abstractC1264080j02;
            Object obj = c1265700j2e.LIZIZ;
            Object obj2 = null;
            if (obj == null) {
                obj = null;
            }
            Object obj3 = c1265700j2e.LIZJ;
            if (obj3 != null) {
                obj2 = obj3;
            }
            List<T> list = c1265700j2e.LIZLLL;
            c317290CcB.getClass();
            return new C323380Cm0(obj, obj2, list);
        }
        if (abstractC1264080j02 instanceof C1264100j04) {
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Exception exc = new Exception(((C1264100j04) abstractC1264080j02).LIZIZ);
            c317290CcB2.getClass();
            return new C316650Cb9(exc);
        }
        if (abstractC1264080j02 instanceof C1264120j06) {
            C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
            List<T> list2 = ((C1264120j06) abstractC1264080j02).LIZIZ;
            c317290CcB3.getClass();
            return new C316640Cb8(list2);
        }
        if (abstractC1264080j02 instanceof C1264110j05) {
            C317290CcB c317290CcB4 = AbstractC316870CbV.LIZ;
            String str = ((C1264110j05) abstractC1264080j02).LIZIZ;
            c317290CcB4.getClass();
            return new C316880CbW(str);
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenRefresh(X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<ITEM>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C20600715jJ
            if (r0 == 0) goto L3b
            r4 = r6
            X.15jJ r4 = (X.C20600715jJ) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            com.bytedance.ext_power_list.AssemListViewModel r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.0CbV r3 = (X.AbstractC316870CbV) r3
            X.0j02 r0 = r0.toResult$ext_power_list_release(r3, r1)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILZ = r1
            java.lang.Object r3 = r5.onRefresh(r4)
            if (r3 != r2) goto L39
            return r2
        L39:
            r0 = r5
            goto L24
        L3b:
            X.15jJ r4 = new X.15jJ
            r4.<init>(r5, r6)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ext_power_list.AssemListViewModel.whenRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddAllAt(int i, Collection<? extends ITEM> collection) {
        withState(new AwS112S0201000_31((AssemListViewModel) this, i, (int) collection, 7));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddItemAt(int i, ITEM item) {
        withState(new AwS112S0201000_31((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) i, (int) item, 8));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listSetItemAt(int i, ITEM item) {
        withState(new AwS112S0201000_31((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) i, (int) item, 9));
    }

    public final void modifyListState(S s, C20600815jK<ITEM> c20600815jK) {
        newState(C627660Ojc.LIZ(s.getListState(), null, null, null, c20600815jK.LJII(), 7));
    }

    public final AbstractC1264080j02<ITEM> toResult$ext_power_list_release(AbstractC316870CbV<Cursor> abstractC316870CbV, boolean z) {
        if (abstractC316870CbV instanceof C323380Cm0) {
            C323380Cm0 c323380Cm0 = (C323380Cm0) abstractC316870CbV;
            return new C1265700j2e(c323380Cm0.LIZIZ, c323380Cm0.LIZJ, c323380Cm0.LIZLLL);
        }
        if (abstractC316870CbV instanceof C316650Cb9) {
            return new C1264100j04(((C316650Cb9) abstractC316870CbV).LIZIZ);
        }
        if (abstractC316870CbV instanceof C316640Cb8) {
            return new C1264120j06(((C316640Cb8) abstractC316870CbV).LIZIZ);
        }
        if (abstractC316870CbV instanceof C316880CbW) {
            return new C1264110j05(((C316880CbW) abstractC316870CbV).LIZIZ);
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenLoadLatest(Cursor r7, X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<ITEM>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C20600515jH
            if (r0 == 0) goto L3d
            r5 = r8
            X.15jH r5 = (X.C20600515jH) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L43
            com.bytedance.ext_power_list.AssemListViewModel r2 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            X.0CbV r4 = (X.AbstractC316870CbV) r4
            r1 = 0
            r0 = 0
            X.0j02 r0 = toResult$ext_power_list_release$default(r2, r4, r1, r3, r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r6
            r5.LLILZ = r3
            java.lang.Object r4 = r6.onLoadLatest(r7, r5)
            if (r4 != r1) goto L3b
            return r1
        L3b:
            r2 = r6
            goto L24
        L3d:
            X.15jH r5 = new X.15jH
            r5.<init>(r6, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ext_power_list.AssemListViewModel.whenLoadLatest(java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenLoadMore(Cursor r7, X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<ITEM>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C20600615jI
            if (r0 == 0) goto L3d
            r5 = r8
            X.15jI r5 = (X.C20600615jI) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L43
            com.bytedance.ext_power_list.AssemListViewModel r2 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            X.0CbV r4 = (X.AbstractC316870CbV) r4
            r1 = 0
            r0 = 0
            X.0j02 r0 = toResult$ext_power_list_release$default(r2, r4, r1, r3, r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r6
            r5.LLILZ = r3
            java.lang.Object r4 = r6.onLoadMore(r7, r5)
            if (r4 != r1) goto L3b
            return r1
        L3b:
            r2 = r6
            goto L24
        L3d:
            X.15jI r5 = new X.15jI
            r5.<init>(r6, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ext_power_list.AssemListViewModel.whenLoadMore(java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static /* synthetic */ <S extends InterfaceC636340Oxc<S, ITEM>, ITEM extends InterfaceC1891350zJl, Cursor> Object onLoadLatest$suspendImpl(AssemListViewModel<S, ITEM, Cursor> assemListViewModel, Cursor cursor, InterfaceC1364105Vn<? super AbstractC316870CbV<Cursor>> interfaceC1364105Vn) {
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddAll(Collection<? extends ITEM> collection, Cursor cursor, Cursor cursor2) {
        withState(new AwS126S0400000_31((AssemListViewModel) this, (AssemListViewModel<S, ITEM, Collection<? extends ITEM>>) cursor, (Collection<? extends ITEM>) cursor2, collection, 10));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listSetItemsAt(int i, int i2, Collection<? extends ITEM> collection) {
        withState(new AwS29S0202000_31((AssemListViewModel) this, i, i2, (int) collection, 0));
    }

    public static /* synthetic */ AbstractC1264080j02 toResult$ext_power_list_release$default(AssemListViewModel assemListViewModel, AbstractC316870CbV abstractC316870CbV, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return assemListViewModel.toResult$ext_power_list_release(abstractC316870CbV, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toResult");
    }
}
