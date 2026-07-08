package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.viewpager;

import X.AnonymousClass1278;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C09R3;
import X.C0ZP4;
import X.C11GO;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C127K;
import X.C127M;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1A04;
import X.C1A05;
import X.C1A0B;
import X.C1A0C;
import X.C1A0I;
import X.C1A0J;
import X.C1A0P;
import X.C1A0Q;
import X.C21669519rJ;
import X.C21669619rK;
import X.C21701119wP;
import X.C21701219wQ;
import X.C21702019wY;
import X.C21702119wZ;
import X.C21702219wa;
import X.C21702319wb;
import X.C21703219wk;
import X.C21703319wl;
import X.C21706719xJ;
import X.C21706819xK;
import X.C21706919xL;
import X.C21707019xM;
import X.C21711619y6;
import X.C21711719y7;
import X.C21711819y8;
import X.C21711919y9;
import X.C21712019yA;
import X.C21712119yB;
import X.C21712219yC;
import X.C21712319yD;
import X.C21712419yE;
import X.C21712519yF;
import X.C21712619yG;
import X.C21712719yH;
import X.C21712819yI;
import X.C21712919yJ;
import X.C21713019yK;
import X.C21713119yL;
import X.C21713219yM;
import X.C21713319yN;
import X.C21713419yO;
import X.C21713519yP;
import X.C21713619yQ;
import X.C21713719yR;
import X.C21713819yS;
import X.C21713919yT;
import X.C21714019yU;
import X.C21714119yV;
import X.C21718719zF;
import X.C21719419zM;
import X.C21719519zN;
import X.C21719619zO;
import X.C21719719zP;
import X.C21719819zQ;
import X.C21721019zc;
import X.C21721119zd;
import X.C21721719zj;
import X.C21721819zk;
import X.C21722419zq;
import X.C21722519zr;
import X.C21723119zx;
import X.C21723219zy;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C493820JYe;
import X.C520010KaN;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.viewpager.SubOnlyLiveVipChoiceCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingVM;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.VIPSubOnlyLiveSettingInfo;

/* JADX INFO: loaded from: classes34.dex */
public final class SubOnlyLiveVipChoiceCell extends PowerCell<C493820JYe> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public C127K LLILLL;
    public C493820JYe LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubOnlyLiveVipChoiceCell.class, "subOnlyLiveVipListVM", "getSubOnlyLiveVipListVM()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subonlylive/setting/vip/vm/SubOnlyLiveVipListVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SubOnlyLiveVipChoiceCell.class, "subOnlyLiveSettingVM", "getSubOnlyLiveSettingVM()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subonlylive/setting/vm/SubOnlyLiveSettingVM;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.hns;
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

    public SubOnlyLiveVipChoiceCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubOnlyLiveVipListVM.class);
        C21669519rJ c21669519rJ = new C21669519rJ(c19719912DlLIZ);
        C21714119yV c21714119yV = new C21714119yV();
        Object obj2 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, obj2)) {
            assemVMLazy = new AssemVMLazy(new C21713719yR(c19719912DlLIZ), c21669519rJ, new C21719619zO(), new C21712319yD(this), new C21703319wl(this), new C21712819yI(this), c21714119yV, new C1A0Q(this), null, new C21702119wZ(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C21711819y8 c21711819y8 = new C21711819y8(this);
            C21712619yG c21712619yG = new C21712619yG(this);
            C21713619yQ c21713619yQ = new C21713619yQ(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C21721019zc((InterfaceC451590HnJ) obj, c21711819y8));
            C21721719zj c21721719zj = new C21721719zj(c01gwLIZIZ);
            C21722419zq c21722419zq = new C21722419zq(c01gwLIZIZ);
            C1A04 c1a04 = new C1A04(c01gwLIZIZ);
            C1A0B c1a0b = new C1A0B(c01gwLIZIZ);
            C21723119zx c21723119zx = new C21723119zx(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c21713619yQ, c21669519rJ, new C452080Ho6(), c21721719zj, c21722419zq, c21712619yG, c21714119yV, c1a04, c1a0b, c21723119zx);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C21713819yS(c19719912DlLIZ), c21669519rJ, new C21719519zN(), new C21712419yE(this), new C21711619y6(this), new C21713019yK(this), c21714119yV, new C1A0I(this), null, new C21702219wa(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C21713919yT(c19719912DlLIZ), c21669519rJ, new C21719719zP(), new C21712119yB(this), new C21706919xL(this), new C21707019xM(this), c21714119yV, null, null, new C21701219wQ(this));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SubOnlyLiveSettingVM.class);
        C21669619rK c21669619rK = new C21669619rK(c19719912DlLIZ2);
        C21714019yU c21714019yU = new C21714019yU();
        if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy2 = new AssemVMLazy(new C21713319yN(c19719912DlLIZ2), c21669619rK, new C21719419zM(), new C21712219yC(this), new C21703219wk(this), new C21712719yH(this), c21714019yU, new C1A0P(this), null, new C21702019wY(this));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            C21712019yA c21712019yA = new C21712019yA(this);
            C21712919yJ c21712919yJ = new C21712919yJ(this);
            C21713419yO c21713419yO = new C21713419yO(c19719912DlLIZ2);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C21721119zd((InterfaceC451590HnJ) obj2, c21712019yA));
            C21721819zk c21721819zk = new C21721819zk(c01gwLIZIZ2);
            C21722519zr c21722519zr = new C21722519zr(c01gwLIZIZ2);
            C1A05 c1a05 = new C1A05(c01gwLIZIZ2);
            C1A0C c1a0c = new C1A0C(c01gwLIZIZ2);
            C21723219zy c21723219zy = new C21723219zy(c01gwLIZIZ2);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(c21713419yO, c21669619rK, new C452080Ho6(), c21721819zk, c21722519zr, c21712919yJ, c21714019yU, c1a05, c1a0c, c21723219zy);
        } else if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy2 = new AssemVMLazy(new C21713519yP(c19719912DlLIZ2), c21669619rK, new C21719819zQ(), new C21712519yF(this), new C21711719y7(this), new C21713119yL(this), c21714019yU, new C1A0J(this), null, new C21702319wb(this));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new C21713219yM(c19719912DlLIZ2), c21669619rK, new C21718719zF(), new C21711919y9(this), new C21706719xJ(this), new C21706819xK(this), c21714019yU, null, null, new C21701119wP(this));
        }
        this.LLILLJJLI = assemVMLazy2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LLILLL = (C127K) this.itemView.findViewById(R.id.ds2);
        C520010KaN.LJJIJ(this.itemView, false);
        C127K c127k = this.LLILLL;
        if (c127k != null) {
            AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(c127k.getContext());
            anonymousClass1278.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0JYT
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    int iIndexOf;
                    long j;
                    long j2;
                    int i;
                    String str;
                    int size;
                    compoundButton.setChecked(z);
                    SubOnlyLiveVipChoiceCell subOnlyLiveVipChoiceCell = this.LL;
                    C493820JYe c493820JYe = subOnlyLiveVipChoiceCell.LLILZ;
                    if (c493820JYe != null) {
                        AssemVMLazy assemVMLazy = subOnlyLiveVipChoiceCell.LL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SubOnlyLiveVipChoiceCell.LLILZIL;
                        SubOnlyLiveVipListVM subOnlyLiveVipListVM = (SubOnlyLiveVipListVM) assemVMLazy.getValue();
                        List<C493820JYe> list = subOnlyLiveVipListVM.getState().LLILZ;
                        if (list.contains(c493820JYe)) {
                            iIndexOf = list.indexOf(c493820JYe);
                        } else {
                            iIndexOf = 0;
                        }
                        VIPSubOnlyLiveSettingInfo.Category category = c493820JYe.LLILLL;
                        String str2 = category.title;
                        int i2 = c493820JYe.LL;
                        long j3 = 0;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                j2 = 0;
                                j = 0;
                            } else {
                                j2 = category.lowerBound;
                                j = 0;
                            }
                        } else {
                            j = category.lowerBound;
                            j2 = 0;
                        }
                        subOnlyLiveVipListVM.setState(new C0JBA());
                        if (c493820JYe.LL == 0 && iIndexOf == 0 && (size = ((ArrayList) subOnlyLiveVipListVM.LLILZLL).size()) >= 0 && size < 2) {
                            i = 1;
                        } else {
                            i = c493820JYe.LL;
                        }
                        int size2 = list.size();
                        C493830JYf c493830JYf = new C493830JYf(i, iIndexOf, size2, j2, j, str2);
                        if (j2 > 0) {
                            j3 = j2;
                        } else if (j > 0) {
                            j3 = j;
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_visibility_option_click");
                        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(((C491690JPz) subOnlyLiveVipListVM.LLILLJJLI.getValue()).LLILLJJLI, "show_entrance");
                        c474500IjALIZ.LJJII(Integer.valueOf(iIndexOf), "current_visible");
                        c474500IjALIZ.LJJII(Integer.valueOf(size2), "all_levels");
                        c474500IjALIZ.LJJII(Integer.valueOf(iIndexOf), "selected_level");
                        c474500IjALIZ.LJJII(Long.valueOf(j3), "selected_item");
                        if (i == 1) {
                            str = "months";
                        } else {
                            str = "plans";
                        }
                        c474500IjALIZ.LJJII(str, "current_threshold_type");
                        c474500IjALIZ.LIZ();
                        subOnlyLiveVipListVM.LLIZ = c493830JYf;
                        subOnlyLiveVipChoiceCell.LLILLJJLI.getValue().setState(new C0JYH(c493830JYf));
                    }
                }
            });
            c127k.setAccessory(anonymousClass1278);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C127M accessory;
        C493820JYe c493820JYe = (C493820JYe) interfaceC1891350zJl;
        this.LLILZ = c493820JYe;
        C127K c127k = this.LLILLL;
        if (c127k != null) {
            c127k.setTitle(c493820JYe.LLILLL.title);
            c127k.setSubtitle(c493820JYe.LLILLL.desc);
        }
        C127K c127k2 = this.LLILLL;
        if (c127k2 != null && (accessory = c127k2.getAccessory()) != null && (accessory instanceof AnonymousClass1278)) {
            ((C11GO) accessory).LJIILJJIL(c493820JYe.LLILLJJLI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(C520010KaN.LJJIJ(viewGroup, false)), R.layout.hns, viewGroup, false);
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
