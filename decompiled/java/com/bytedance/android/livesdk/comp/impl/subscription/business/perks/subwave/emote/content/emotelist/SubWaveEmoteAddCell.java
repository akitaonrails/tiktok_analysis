package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C0JUR;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1A06;
import X.C1A0D;
import X.C1A0K;
import X.C1A0R;
import X.C21669719rL;
import X.C21701319wR;
import X.C21702419wc;
import X.C21702519wd;
import X.C21703419wm;
import X.C21707119xN;
import X.C21707219xO;
import X.C21707319xP;
import X.C21707419xQ;
import X.C21707519xR;
import X.C21707619xS;
import X.C21707719xT;
import X.C21707819xU;
import X.C21707919xV;
import X.C21708019xW;
import X.C21708119xX;
import X.C21708219xY;
import X.C21708319xZ;
import X.C21708419xa;
import X.C21708519xb;
import X.C21719919zR;
import X.C21720019zS;
import X.C21720119zT;
import X.C21721219ze;
import X.C21721919zl;
import X.C21722619zs;
import X.C21723319zz;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
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
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteAddCell;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SubWaveEmoteAddCell extends PowerCell<C0JUR> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final int LL = 125;
    public final int LLILLJJLI = 126;
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubWaveEmoteAddCell.class, "subWaveEmotePageViewModel", "getSubWaveEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subwave/emote/SubWaveEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public SubWaveEmoteAddCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubWaveEmotePageViewModel.class);
        C21669719rL c21669719rL = new C21669719rL(c19719912DlLIZ);
        C21708519xb c21708519xb = new C21708519xb();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C21708419xa(c19719912DlLIZ), c21669719rL, new C21719919zR(), new C21707619xS(this), new C21703419wm(this), new C21707919xV(this), c21708519xb, new C1A0R(this), null, new C21702419wc(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C21707419xQ c21707419xQ = new C21707419xQ(this);
            C21707819xU c21707819xU = new C21707819xU(this);
            C21708119xX c21708119xX = new C21708119xX(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C21721219ze((InterfaceC451590HnJ) obj, c21707419xQ));
            C21721919zl c21721919zl = new C21721919zl(c01gwLIZIZ);
            C21722619zs c21722619zs = new C21722619zs(c01gwLIZIZ);
            C1A06 c1a06 = new C1A06(c01gwLIZIZ);
            C1A0D c1a0d = new C1A0D(c01gwLIZIZ);
            C21723319zz c21723319zz = new C21723319zz(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c21708119xX, c21669719rL, new C452080Ho6(), c21721919zl, c21722619zs, c21707819xU, c21708519xb, c1a06, c1a0d, c21723319zz);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C21708219xY(c19719912DlLIZ), c21669719rL, new C21720019zS(), new C21707719xT(this), new C21707319xP(this), new C21708019xW(this), c21708519xb, new C1A0K(this), null, new C21702519wd(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C21708319xZ(c19719912DlLIZ), c21669719rL, new C21720119zT(), new C21707519xR(this), new C21707119xN(this), new C21707219xO(this), c21708519xb, null, null, new C21701319wR(this));
        }
        this.LLILLL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JVx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Fragment fragmentLIZ = C946803n0.LIZ(this.LL.itemView);
                if (fragmentLIZ != null) {
                    SubWaveEmoteAddCell subWaveEmoteAddCell = this.LL;
                    AssemVMLazy assemVMLazy = subWaveEmoteAddCell.LLILLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SubWaveEmoteAddCell.LLILZ;
                    SubWaveEmotePageViewModel subWaveEmotePageViewModel = (SubWaveEmotePageViewModel) assemVMLazy.getValue();
                    subWaveEmotePageViewModel.withState(new C493200JVu((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class), fragmentLIZ, subWaveEmoteAddCell.LL, subWaveEmoteAddCell.LLILLJJLI, subWaveEmotePageViewModel));
                    subWaveEmotePageViewModel.xQ2("add");
                }
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        Activity activityLIZIZ;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h4y, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (activityLIZIZ = C737910Sx3.LIZIZ(viewTd.getContext())) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C2204961BRm.LLILZIL(activityLIZIZ.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null)).getRealMetrics(displayMetrics);
            int iLIZIZ = (displayMetrics.widthPixels - (((int) C497740JfY.LIZIZ(12.0f)) * 2)) / 4;
            if (iLIZIZ > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = iLIZIZ;
                marginLayoutParams.width = iLIZIZ;
                C786410Ut5.W5(viewTd, layoutParams);
            }
        }
        return viewTd;
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
