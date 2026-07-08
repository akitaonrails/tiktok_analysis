package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
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
import X.C1A02;
import X.C1A09;
import X.C1A0G;
import X.C1A0N;
import X.C21669119rF;
import X.C21700919wN;
import X.C21701619wU;
import X.C21701719wV;
import X.C21703019wi;
import X.C21703719wp;
import X.C21703819wq;
import X.C21705419x6;
import X.C21705519x7;
import X.C21705619x8;
import X.C21705719x9;
import X.C21705819xA;
import X.C21705919xB;
import X.C21706019xC;
import X.C21706119xD;
import X.C21706219xE;
import X.C21706319xF;
import X.C21706419xG;
import X.C21706519xH;
import X.C21706619xI;
import X.C21718819zG;
import X.C21718919zH;
import X.C21719019zI;
import X.C21720819za;
import X.C21721519zh;
import X.C21722219zo;
import X.C21722919zv;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C492900JUq;
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
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteAddCell;
import com.bytedance.android.livesdkapi.host.IHostSetting;
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
public final class SuggestEmoteAddCell extends PowerCell<C492900JUq> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final int LL = 125;
    public final int LLILLJJLI = 126;
    public final AssemVMLazy LLILLL;
    public boolean LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SuggestEmoteAddCell.class, "suggestEmotePageViewModel", "getSuggestEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/suggestemote/SuggestEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public SuggestEmoteAddCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SuggestEmotePageViewModel.class);
        C21669119rF c21669119rF = new C21669119rF(c19719912DlLIZ);
        C21706619xI c21706619xI = new C21706619xI();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C21706519xH(c19719912DlLIZ), c21669119rF, new C21718819zG(), new C21705719x9(this), new C21703019wi(this), new C21706019xC(this), c21706619xI, new C1A0N(this), null, new C21701619wU(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C21705519x7 c21705519x7 = new C21705519x7(this);
            C21705919xB c21705919xB = new C21705919xB(this);
            C21706219xE c21706219xE = new C21706219xE(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C21720819za((InterfaceC451590HnJ) obj, c21705519x7));
            C21721519zh c21721519zh = new C21721519zh(c01gwLIZIZ);
            C21722219zo c21722219zo = new C21722219zo(c01gwLIZIZ);
            C1A02 c1a02 = new C1A02(c01gwLIZIZ);
            C1A09 c1a09 = new C1A09(c01gwLIZIZ);
            C21722919zv c21722919zv = new C21722919zv(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c21706219xE, c21669119rF, new C452080Ho6(), c21721519zh, c21722219zo, c21705919xB, c21706619xI, c1a02, c1a09, c21722919zv);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C21706319xF(c19719912DlLIZ), c21669119rF, new C21718919zH(), new C21705819xA(this), new C21705419x6(this), new C21706119xD(this), c21706619xI, new C1A0G(this), null, new C21701719wV(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C21706419xG(c19719912DlLIZ), c21669119rF, new C21719019zI(), new C21705619x8(this), new C21703719wp(this), new C21703819wq(this), c21706619xI, null, null, new C21700919wN(this));
        }
        this.LLILLL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JVs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                SuggestEmoteAddCell suggestEmoteAddCell = this.LL;
                if (suggestEmoteAddCell.LLILZ) {
                    if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Cg2()) {
                        i = 2131839347;
                    } else {
                        i = 2131852092;
                    }
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(i));
                } else {
                    Fragment fragmentLIZ = C946803n0.LIZ(suggestEmoteAddCell.itemView);
                    if (fragmentLIZ != null) {
                        SuggestEmoteAddCell suggestEmoteAddCell2 = this.LL;
                        AssemVMLazy assemVMLazy = suggestEmoteAddCell2.LLILLL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SuggestEmoteAddCell.LLILZIL;
                        SuggestEmotePageViewModel suggestEmotePageViewModel = (SuggestEmotePageViewModel) assemVMLazy.getValue();
                        suggestEmotePageViewModel.withState(new C493190JVt((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class), fragmentLIZ, suggestEmoteAddCell2.LL, suggestEmoteAddCell2.LLILLJJLI, suggestEmotePageViewModel));
                    }
                }
                AssemVMLazy assemVMLazy2 = this.LL.LLILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SuggestEmoteAddCell.LLILZIL;
                SuggestEmotePageViewModel suggestEmotePageViewModel2 = (SuggestEmotePageViewModel) assemVMLazy2.getValue();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_suggest_emotes_add_click");
                c474500IjALIZ.LJJII(suggestEmotePageViewModel2.wQ2().LLILLJJLI, "entrance_page");
                c474500IjALIZ.LJJII(suggestEmotePageViewModel2.wQ2().LLILZ, "anchor_id");
                c474500IjALIZ.LJJII(suggestEmotePageViewModel2.wQ2().LLILLL, "upload_user_type");
                c474500IjALIZ.LIZ();
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C492900JUq c492900JUq = (C492900JUq) interfaceC1891350zJl;
        super.onBindItemView(c492900JUq);
        this.LLILZ = c492900JUq.LLILLL;
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
