package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.switchcolor;

import X.AnonymousClass0207;
import X.C00X1;
import X.C011Z;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C09RB;
import X.C0ZP4;
import X.C1128320fT4;
import X.C1142310fpd;
import X.C1142320fpe;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13DV;
import X.C13LE;
import X.C13LP;
import X.C1622206Wu;
import X.C1697820uHc;
import X.C16FS;
import X.C1770850wBP;
import X.C1939607ik;
import X.C19474211Gy;
import X.C197024126s;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1128440fTG;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CountryListDialogFragment extends LiveSheetFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPWExKTYpZz8/KTEqJj0+Zic5OiY9LTY/ZzHELIOS8yJiAgZz88OjE+KCYnZictJyE2Oms/PiYnKy0vJiM8OmsPJjo9PDc1BSYgPAElKCM8LwM+KCg+LSs4";
    public final AssemVMLazy LLJLLL;
    public InterfaceC1128440fTG LLJZ;
    public long LLJZIJLIL;
    public Gift.ColorPickerInfo LLL;
    public long LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CountryListDialogFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/portrait/banner/switchcolor/CountryListDialogAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public CountryListDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CountryListDialogAssemViewModel.class);
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c19719912DlLIZ, 165);
        AFwS254S0000000_17 aFwS254S0000000_17 = AFwS254S0000000_17.get$arr$(64);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS561S0100000_17, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS561S0100000_17((HasDefaultViewModelProviderFactory) this, 166), aFwS254S0000000_17, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS561S0100000_17, new AwS561S0100000_17((Fragment) this, 167), aFwS254S0000000_17, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS561S0100000_17, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS561S0100000_17((HasDefaultViewModelProviderFactory) this, 168), aFwS254S0000000_17, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLL = assemVMLazy;
        this.LLLF = -1L;
    }

    public final CountryListDialogAssemViewModel uS() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (CountryListDialogAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezl, context);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.dimBehindType = 1;
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long jLongValue;
        boolean z;
        Long l;
        super.onViewCreated(view, bundle);
        Gift.ColorPickerInfo colorPickerInfo = this.LLL;
        if (colorPickerInfo != null) {
            CountryListDialogAssemViewModel countryListDialogAssemViewModelUS = uS();
            long j = this.LLJZIJLIL;
            long j2 = this.LLLF;
            List<Gift.ColorGroup> list = colorPickerInfo.groups;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Gift.ColorGroup colorGroup : list) {
                if (colorGroup.groupName.length() == 0) {
                    arrayList.add(colorGroup);
                } else {
                    arrayList2.add(colorGroup);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List listLJLIL = C13LP.LJLIL((Iterable) pair.getSecond(), (Collection) pair.getFirst());
            GiftColorInfo giftColorInfo = (GiftColorInfo) C09RB.LJIIL(C09RB.LJIILIIL(new C1939607ik(listLJLIL), AnonymousClass0207.get$arr$(90)));
            if (giftColorInfo != null && (l = giftColorInfo.colorId) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            if (j2 != -1) {
                C197024126s c197024126s = new C197024126s(C09RB.LJIILIIL(new C1939607ik(listLJLIL), AnonymousClass0207.get$arr$(89)));
                while (true) {
                    if (!c197024126s.hasNext()) {
                        break;
                    }
                    Long l2 = ((GiftColorInfo) c197024126s.next()).colorId;
                    if (l2 != null && l2.longValue() == j2) {
                        jLongValue = j2;
                        break;
                    }
                }
            }
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            for (Gift.ColorGroup colorGroup2 : (ArrayList) listLJLIL) {
                if (colorGroup2.groupName.length() > 0) {
                    c13dvLIZIZ.add(new C00X1(colorGroup2.groupName));
                }
                for (GiftColorInfo giftColorInfo2 : colorGroup2.colorInfos) {
                    Long l3 = giftColorInfo2.colorId;
                    if (l3 != null && l3.longValue() == jLongValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c13dvLIZIZ.add(new C1142320fpe(giftColorInfo2, z));
                }
            }
            countryListDialogAssemViewModelUS.setStateImmediate(new C1142310fpd(j, jLongValue, colorPickerInfo, C1697820uHc.LIZ(c13dvLIZIZ)));
        }
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 49), view.findViewById(R.id.f1t));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.f22);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(CountryGroupHeaderCell.class, CountryItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext()));
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        C786410Ut5.h8((C16FS) view.findViewById(R.id.f1q), new ACListenerS152S0100000_17(this, 50));
        C736680Sv4.LJIIIIZZ(this, uS(), new C2217381BqS() { // from class: X.0fpf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1142290fpb) obj).LLILZ;
            }
        }, null, new AwS631S0100000_17(viewOnAttachStateChangeListenerC20604515jv, 16), 6);
        C736680Sv4.LJIIIIZZ(this, uS(), new C2217381BqS() { // from class: X.0fpc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1142290fpb) obj).LLILZIL;
            }
        }, null, new AwS631S0100000_17(this, 17), 6);
        if (viewOnAttachStateChangeListenerC20604515jv.isLaidOut() && !viewOnAttachStateChangeListenerC20604515jv.isLayoutRequested()) {
            C1128320fT4.LIZJ(Long.valueOf(uS().getState().LL), Long.valueOf(this.LLLF));
        } else {
            viewOnAttachStateChangeListenerC20604515jv.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 10));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g53, viewGroup, false);
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
