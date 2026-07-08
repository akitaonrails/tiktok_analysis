package com.bytedance.ext_power_list;

import X.AbstractC1264080j02;
import X.C01NY;
import X.C1264090j03;
import X.C1954807lC;
import X.C20105813lg;
import X.C20105913lh;
import X.C20600415jG;
import X.C20601115jN;
import X.C23250099c;
import X.C323440Cm6;
import X.C329950Cwb;
import X.C329960Cwc;
import X.C329970Cwd;
import X.C329990Cwf;
import X.C627660Ojc;
import X.EnumC323450Cm7;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC636270OxV;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS137S0101000_31;
import kotlin.jvm.internal.AwS29S0202000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class AssemSingleListViewModel<ITEM, S extends InterfaceC636270OxV<S, ITEM>, Cursor> extends AssemViewModel<S> {
    public volatile Pair<? extends Cursor, ? extends Cursor> lastPageResult = new Pair<>(null, null);

    public abstract void newState(C627660Ojc<ITEM> c627660Ojc);

    public Object whenLoadLatest(Cursor cursor, InterfaceC1364105Vn<? super AbstractC1264080j02<ITEM>> interfaceC1364105Vn) {
        return whenLoadLatest$suspendImpl(this, cursor, interfaceC1364105Vn);
    }

    public abstract Object whenLoadMore(Cursor cursor, InterfaceC1364105Vn<? super AbstractC1264080j02<ITEM>> interfaceC1364105Vn);

    public abstract Object whenRefresh(InterfaceC1364105Vn<? super AbstractC1264080j02<ITEM>> interfaceC1364105Vn);

    public void listClear() {
        withState(new AwS610S0100000_31(this, 110));
    }

    public void manualListRefresh() {
        withState(new AwS610S0100000_31(this, 109));
    }

    public List<ITEM> listGetAll() {
        return getState().getListItemState();
    }

    public void listAddAll(Collection<? extends ITEM> collection) {
        withState(new AwS397S0200000_31((AssemSingleListViewModel) this, (Collection) collection, 28));
    }

    public void listAddItem(ITEM item) {
        withState(new AwS397S0200000_31(this, item, 30));
    }

    public ITEM listGetAt(int i) {
        List<ITEM> listItemState = getState().getListItemState();
        if (listItemState != null) {
            return (ITEM) ListProtector.get(listItemState, i);
        }
        return null;
    }

    public int listIndexOf(ITEM item) {
        List<ITEM> listItemState = getState().getListItemState();
        if (listItemState != null) {
            return listItemState.indexOf(item);
        }
        return -1;
    }

    public void listRemoveItem(ITEM item) {
        withState(new AwS397S0200000_31(this, item, 32));
    }

    public void listRemoveItemAt(int i) {
        withState(new AwS137S0101000_31(this, i, 4));
    }

    public void listSetItem(ITEM item) {
        withState(new AwS397S0200000_31(this, item, 33));
    }

    public void listSetItems(Collection<? extends ITEM> collection) {
        withState(new AwS397S0200000_31((AssemSingleListViewModel) this, (Collection) collection, 34));
    }

    public void manualListLoadLatest(Cursor cursor) {
        withState(new AwS397S0200000_31(this, cursor, 29));
    }

    public void manualListLoadMore(Cursor cursor) {
        withState(new AwS397S0200000_31(this, cursor, 31));
    }

    public void listAddAllAt(int i, Collection<? extends ITEM> collection) {
        withState(new AwS112S0201000_31((AssemSingleListViewModel) this, i, (int) collection, 10));
    }

    public void listAddItemAt(int i, ITEM item) {
        withState(new AwS112S0201000_31((AssemSingleListViewModel) this, (AssemSingleListViewModel<int, S, Cursor>) i, (int) item, 11));
    }

    public void listMoveItem(int i, int i2) {
        withState(new C20601115jN(this, i, i2));
    }

    public void listSetItemAt(int i, ITEM item) {
        withState(new AwS112S0201000_31((AssemSingleListViewModel) this, (AssemSingleListViewModel<int, S, Cursor>) i, (int) item, 12));
    }

    public final void modifyListState(S s, Function1<? super List<ITEM>, Unit> function1) {
        ArrayList arrayList;
        List<ITEM> listItemState = s.getListItemState();
        if (listItemState != null) {
            arrayList = new ArrayList(listItemState);
        } else {
            arrayList = new ArrayList();
        }
        function1.invoke(arrayList);
        newState(C627660Ojc.LIZ(s.getListState(), null, null, null, arrayList, 7));
    }

    public final void refreshInner(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1, Function1<? super AbstractC1264080j02<ITEM>, Unit> function12) {
        loadPage(EnumC323450Cm7.Refresh, function1, function12, new C329950Cwb(this, null), new AwS575S0100000_31(this, 202), new AwS680S0100000_31(this, 3), AFwS287S0000000_4.get$arr$(3));
    }

    public final void refreshInternal(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1, Function1<? super AbstractC1264080j02<ITEM>, Unit> function12) {
        refreshInner(function1, function12);
    }

    public static /* synthetic */ <ITEM, S extends InterfaceC636270OxV<S, ITEM>, Cursor> Object whenLoadLatest$suspendImpl(AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel, Cursor cursor, InterfaceC1364105Vn<? super AbstractC1264080j02<ITEM>> interfaceC1364105Vn) {
        return C1264090j03.LIZIZ();
    }

    public void listAddAll(Collection<? extends ITEM> collection, Cursor cursor, Cursor cursor2) {
        withState(new AwS126S0400000_31(this, (AssemSingleListViewModel<ITEM, S, Collection<? extends ITEM>>) cursor, (Collection<? extends ITEM>) cursor2, collection, 11));
    }

    public void listSetItemsAt(int i, int i2, Collection<? extends ITEM> collection) {
        withState(new AwS29S0202000_31((AssemSingleListViewModel) this, i, i2, (int) collection, 1));
    }

    public final void loadLatestInner(Cursor cursor, Function0<Boolean> function0, Function1<? super AbstractC1264080j02<ITEM>, Unit> function1) {
        loadPage(EnumC323450Cm7.Prev, new C20105813lg(function0), function1, new C329960Cwc(this, cursor, null), new AwS575S0100000_31(this, 203), new AwS680S0100000_31(this, 4), AFwS287S0000000_4.get$arr$(4));
    }

    public final void loadLatestInternal(Cursor cursor, Function0<Boolean> function0, Function1<? super AbstractC1264080j02<ITEM>, Unit> function1) {
        loadLatestInner(cursor, function0, function1);
    }

    public final void loadMoreInner(Cursor cursor, Function0<Boolean> function0, Function1<? super AbstractC1264080j02<ITEM>, Unit> function1) {
        loadPage(EnumC323450Cm7.Next, new C20105913lh(function0), function1, new C329970Cwd(this, cursor, null), new AwS575S0100000_31(this, 204), new AwS680S0100000_31(this, 2), AFwS287S0000000_4.get$arr$(2));
    }

    public final void loadMoreInternal(Cursor cursor, Function0<Boolean> function0, Function1<? super AbstractC1264080j02<ITEM>, Unit> function1) {
        loadMoreInner(cursor, function0, function1);
    }

    public List<ITEM> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<? extends ITEM> list, List<? extends ITEM> list2) {
        ArrayList arrayList = new ArrayList();
        int i = C323440Cm6.LIZ[enumC323450Cm7.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    arrayList.addAll(list2);
                    arrayList.addAll(list);
                    return arrayList;
                }
                throw new C1954807lC();
            }
            arrayList.addAll(list);
            arrayList.addAll(list2);
            return arrayList;
        }
        arrayList.addAll(list2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void manualListLoadLatest$default(AssemSingleListViewModel assemSingleListViewModel, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            assemSingleListViewModel.manualListLoadLatest(obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: manualListLoadLatest");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void manualListLoadMore$default(AssemSingleListViewModel assemSingleListViewModel, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            assemSingleListViewModel.manualListLoadMore(obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: manualListLoadMore");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshInner$default(AssemSingleListViewModel assemSingleListViewModel, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = new C01NY(null);
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            assemSingleListViewModel.refreshInner(function1, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshInner");
    }

    public final void handleState(EnumC323450Cm7 enumC323450Cm7, AbstractC1264080j02<ITEM> abstractC1264080j02, InterfaceC1631620sYq<? super C627660Ojc<ITEM>, ? super Cursor, ? super Cursor, C627660Ojc<ITEM>> interfaceC1631620sYq, Function2<? super C627660Ojc<ITEM>, ? super Throwable, C627660Ojc<ITEM>> function2, Function0<Unit> function0) {
        withState(new C20600415jG(abstractC1264080j02, this, enumC323450Cm7, interfaceC1631620sYq, function2, function0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadLatestInner$default(AssemSingleListViewModel assemSingleListViewModel, Object obj, Function0 function0, Function1 function1, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                function0 = AFwS221S0000000_31.get$arr$(90);
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            assemSingleListViewModel.loadLatestInner(obj, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadLatestInner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadMoreInner$default(AssemSingleListViewModel assemSingleListViewModel, Object obj, Function0 function0, Function1 function1, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                function0 = AFwS221S0000000_31.get$arr$(91);
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            assemSingleListViewModel.loadMoreInner(obj, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreInner");
    }

    private final void loadPage(EnumC323450Cm7 enumC323450Cm7, Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1, Function1<? super AbstractC1264080j02<ITEM>, Unit> function12, Function1<? super InterfaceC1364105Vn<? super AbstractC1264080j02<ITEM>>, ? extends Object> function13, Function0<Unit> function0, InterfaceC1631620sYq<? super C627660Ojc<ITEM>, ? super Cursor, ? super Cursor, C627660Ojc<ITEM>> interfaceC1631620sYq, Function2<? super C627660Ojc<ITEM>, ? super Throwable, C627660Ojc<ITEM>> function2) {
        function0.invoke();
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C329990Cwf(this, function1, enumC323450Cm7, interfaceC1631620sYq, function2, function13, function12, null), 3);
    }
}
