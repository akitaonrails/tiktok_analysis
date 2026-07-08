package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C0IJT;
import X.C0JUO;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1A01;
import X.C1A08;
import X.C1A0F;
import X.C1A0M;
import X.C1A0T;
import X.C21670119rP;
import X.C21670219rQ;
import X.C21670319rR;
import X.C21681819tI;
import X.C21701519wT;
import X.C21702819wg;
import X.C21702919wh;
import X.C21703619wo;
import X.C21710119xr;
import X.C21710219xs;
import X.C21710319xt;
import X.C21710419xu;
import X.C21710519xv;
import X.C21710619xw;
import X.C21710719xx;
import X.C21710819xy;
import X.C21710919xz;
import X.C21711019y0;
import X.C21711119y1;
import X.C21711219y2;
import X.C21711319y3;
import X.C21711419y4;
import X.C21711519y5;
import X.C21720519zX;
import X.C21720619zY;
import X.C21720719zZ;
import X.C21721419zg;
import X.C21722119zn;
import X.C21722819zu;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C292401Bi;
import X.C452080Ho6;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
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
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveSuggestEmoteEntrance;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SubWaveSuggestEmoteEntrance extends PowerCell<C0JUO> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public C0JUO LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubWaveSuggestEmoteEntrance.class, "subWaveEmotePageViewModel", "getSubWaveEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subwave/emote/SubWaveEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public SubWaveSuggestEmoteEntrance() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubWaveEmotePageViewModel.class);
        C21670119rP c21670119rP = new C21670119rP(c19719912DlLIZ);
        C21711519y5 c21711519y5 = new C21711519y5();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C21711419y4(c19719912DlLIZ), c21670119rP, new C21720519zX(), new C21710619xw(this), new C21703619wo(this), new C21710919xz(this), c21711519y5, new C1A0T(this), null, new C21702819wg(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C21710419xu c21710419xu = new C21710419xu(this);
            C21710819xy c21710819xy = new C21710819xy(this);
            C21711119y1 c21711119y1 = new C21711119y1(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C21721419zg((InterfaceC451590HnJ) obj, c21710419xu));
            C21722119zn c21722119zn = new C21722119zn(c01gwLIZIZ);
            C21722819zu c21722819zu = new C21722819zu(c01gwLIZIZ);
            C1A08 c1a08 = new C1A08(c01gwLIZIZ);
            C1A0F c1a0f = new C1A0F(c01gwLIZIZ);
            C1A01 c1a01 = new C1A01(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c21711119y1, c21670119rP, new C452080Ho6(), c21722119zn, c21722819zu, c21710819xy, c21711519y5, c1a08, c1a0f, c1a01);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C21711219y2(c19719912DlLIZ), c21670119rP, new C21720619zY(), new C21710719xx(this), new C21710319xt(this), new C21711019y0(this), c21711519y5, new C1A0M(this), null, new C21702919wh(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C21711319y3(c19719912DlLIZ), c21670119rP, new C21720719zZ(), new C21710519xv(this), new C21710119xr(this), new C21710219xs(this), c21711519y5, null, null, new C21701519wT(this));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C292401Bi.LIZ(new C21670319rR(this));
        this.LLILLL = C292401Bi.LIZ(new C21670219rQ(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JW3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                SubWaveSuggestEmoteEntrance subWaveSuggestEmoteEntrance = this.LL;
                if (subWaveSuggestEmoteEntrance.LLILZIL != null) {
                    AssemVMLazy assemVMLazy = subWaveSuggestEmoteEntrance.LL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SubWaveSuggestEmoteEntrance.LLILZLL;
                    boolean z = false;
                    SubWaveEmotePageViewModel subWaveEmotePageViewModel = (SubWaveEmotePageViewModel) assemVMLazy.getValue();
                    subWaveEmotePageViewModel.withState(new C0JTV(subWaveEmotePageViewModel, view.getContext()));
                    C0JUO c0juo = subWaveSuggestEmoteEntrance.LLILZIL;
                    if (c0juo != null) {
                        z = c0juo.LL;
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_import_emotes_from_subscriber_click");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "anchor_id");
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c474500IjALIZ.LJJII(str, "is_red_dot");
                    c474500IjALIZ.LJJII("", "price_level");
                    c474500IjALIZ.LJJII("1", "is_sub_wave_reward");
                    c474500IjALIZ.LIZ();
                }
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C0JUO c0juo = (C0JUO) interfaceC1891350zJl;
        super.onBindItemView(c0juo);
        this.LLILZIL = c0juo;
        C500260Jjc.LJLJLJ((View) this.LLILLJJLI.getValue(), c0juo.LL);
        boolean z = c0juo.LL;
        if (!this.LLILZ) {
            this.LLILZ = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_import_emotes_from_subscriber_show");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "anchor_id");
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str, "is_red_dot");
            c474500IjALIZ.LJJII("", "price_level");
            c474500IjALIZ.LJJII("1", "is_sub_wave_reward");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gz5, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
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
