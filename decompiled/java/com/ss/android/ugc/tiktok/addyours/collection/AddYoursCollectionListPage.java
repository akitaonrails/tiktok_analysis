package com.ss.android.ugc.tiktok.addyours.collection;

import X.C01GW;
import X.C03H5;
import X.C0NKE;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1247530iZL;
import X.C1390850mIV;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C615070OAn;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC615090OAp;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursCollectionListPage extends BaseFavoritePage implements InterfaceC724530SbT, AddYoursCollectionAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2stLSsqJzA+OmEwHELIOSJykgLCwnISoiZw43LBwjPD0gCyogJSowPCwjJwM6OzEcKCg2";
    public final C19719912Dl LLIZ = C13LE.LIZ(AddYoursCollectionListAssem.class);
    public final String LLIZLLLIL = "add_yours";
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursCollectionListPage.class, "collectionVM", "getCollectionVM()Lcom/ss/android/ugc/tiktok/addyours/collection/AddYoursCollectionListVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final boolean SR() {
        return false;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final AddYoursCollectionListVM WR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (AddYoursCollectionListVM) assemVMLazy.getValue();
    }

    public AddYoursCollectionListPage() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursCollectionListVM.class);
        this.LLJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS553S0100000_9(c19719912DlLIZ, 1628), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1629), AFwS240S0000000_9.get$arr$(682));
        this.LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1627));
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final String UR() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final C19719912Dl VR() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionAbility
    public final void mq1(C615070OAn c615070OAn) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247530iZL[] c1247530iZLArr = new C1247530iZL[2];
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZIZ(2131828350);
        c1247530iZL.LIZJ(R.raw.icon_bookmark_fill);
        c1247530iZL.LIZ(new AwS375S0200000_9(this, c615070OAn, 109));
        c1247530iZLArr[0] = c1247530iZL;
        C1247530iZL c1247530iZL2 = new C1247530iZL();
        c1247530iZL2.LIZJ(R.raw.icon_a_rectangle_on_rectangle);
        c1247530iZL2.LIZ(new AwS375S0200000_9(this, c615070OAn, 110));
        if (c615070OAn.LLIZLLLIL) {
            c1247530iZL2.LIZIZ(R.string.suj);
        } else {
            c1247530iZL2.LIZIZ(2131850744);
        }
        c1247530iZLArr[1] = c1247530iZL2;
        c1390850mIV.LIZ(c1247530iZLArr);
        c1390850mIV.LIZJ().show(fragmentManager, "add_yours_collection");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectEvent(C0NKE c0nke) {
        Object next;
        if (c0nke.LIZIZ != EnumC615090OAp.COLLECT) {
            return;
        }
        int collectStatus = c0nke.LIZ.getCollectStatus();
        if (collectStatus != 0) {
            if (collectStatus == 1) {
                WR().listAddItemAt(0, new C615070OAn(c0nke.LIZ));
                return;
            }
            return;
        }
        AddYoursCollectionListVM addYoursCollectionListVMWR = WR();
        AddYoursTopic addYoursTopic = c0nke.LIZ;
        List<ITEM> listListGetAll = addYoursCollectionListVMWR.listGetAll();
        if (listListGetAll == 0) {
            return;
        }
        Iterator it2 = listListGetAll.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                long j = ((C615070OAn) next).LL;
                Long topicId = addYoursTopic.getTopicId();
                if (topicId != null && j == topicId.longValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C615070OAn c615070OAn = (C615070OAn) next;
        if (c615070OAn == null) {
            return;
        }
        addYoursCollectionListVMWR.listRemoveItem(c615070OAn);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(681));
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, AddYoursCollectionAbility.class, null, null);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0OAl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C614960OAc) obj).LLILLJJLI;
            }
        }, null, new AwS623S0100000_9(this, 157), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0OAm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C614960OAc) obj).LLILLL;
            }
        }, null, new AwS623S0100000_9(this, 158), 6);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
