package com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0HQX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C435650H6l;
import X.C440920HQs;
import X.C452080Ho6;
import X.C452501pT;
import X.C456970Hvz;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1334360kpO;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC427850Gq7;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ResultV2Cell extends PowerCell<C0HQX> implements InterfaceC20631915oL, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(304));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(305));
    public SmartImageView LLILLL;
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public Animatable LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ResultV2Cell.class, "resultsVM", "getResultsVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/resultspage/MixStudioResultsPageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ResultV2Cell.class, "baseVM", "getBaseVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/framework/MixStudioBaseViewModel;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    public ResultV2Cell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioResultsPageViewModel.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 671);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(330);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 658), awS550S0100000_6, AFwS192S0000000_6.get$arr$(309), new AwS550S0100000_6((C03K6) this, 648), new AwS550S0100000_6((C03K6) this, 659), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 662), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) this, 665), null, new AwS550S0100000_6((C03K6) this, 668));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((C03K6) this, 644);
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 646);
            AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c19719912DlLIZ, 649);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_62, 29));
            AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 654);
            AwS550S0100000_6 awS550S0100000_66 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 657);
            AwS550S0100000_6 awS550S0100000_67 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 660);
            AwS550S0100000_6 awS550S0100000_68 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 663);
            AwS550S0100000_6 awS550S0100000_69 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 666);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS550S0100000_64, awS550S0100000_6, new C452080Ho6(), awS550S0100000_65, awS550S0100000_66, awS550S0100000_63, aFwS236S0000000_6, awS550S0100000_67, awS550S0100000_68, awS550S0100000_69);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 669), awS550S0100000_6, AFwS192S0000000_6.get$arr$(308), new AwS550S0100000_6((C03K6) this, 673), new AwS550S0100000_6((C03K6) this, 675), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 677), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) this, 679), null, new AwS550S0100000_6((C03K6) this, 681));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 682), awS550S0100000_6, AFwS192S0000000_6.get$arr$(310), new AwS550S0100000_6((C03K6) this, 684), new AwS550S0100000_6((C03K6) this, 686), new AwS550S0100000_6((C03K6) this, 636), aFwS236S0000000_6, null, null, new AwS550S0100000_6((C03K6) this, 638));
        }
        this.LLILZ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixStudioBaseViewModel.class);
        AwS550S0100000_6 awS550S0100000_610 = new AwS550S0100000_6(c19719912DlLIZ2, 640);
        AFwS236S0000000_6 aFwS236S0000000_62 = AFwS236S0000000_6.get$arr$(329);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 643), awS550S0100000_610, AFwS192S0000000_6.get$arr$(307), new AwS550S0100000_6((C03K6) this, 647), new AwS550S0100000_6((C03K6) this, 650), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 652), aFwS236S0000000_62, new AwS550S0100000_6((C03K6) this, 655), null, new AwS550S0100000_6((C03K6) this, 661));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_611 = new AwS550S0100000_6((C03K6) this, 664);
            AwS550S0100000_6 awS550S0100000_612 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 667);
            AwS550S0100000_6 awS550S0100000_613 = new AwS550S0100000_6(c19719912DlLIZ2, 670);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_611, 30));
            AwS550S0100000_6 awS550S0100000_614 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 672);
            AwS550S0100000_6 awS550S0100000_615 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 674);
            AwS550S0100000_6 awS550S0100000_616 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 676);
            AwS550S0100000_6 awS550S0100000_617 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 678);
            AwS550S0100000_6 awS550S0100000_618 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 680);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS550S0100000_613, awS550S0100000_610, new C452080Ho6(), awS550S0100000_614, awS550S0100000_615, awS550S0100000_612, aFwS236S0000000_62, awS550S0100000_616, awS550S0100000_617, awS550S0100000_618);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 683), awS550S0100000_610, AFwS192S0000000_6.get$arr$(311), new AwS550S0100000_6((C03K6) this, 685), new AwS550S0100000_6((C03K6) this, 687), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 637), aFwS236S0000000_62, new AwS550S0100000_6((C03K6) this, 639), null, new AwS550S0100000_6((C03K6) this, 641));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 642), awS550S0100000_610, AFwS192S0000000_6.get$arr$(306), new AwS550S0100000_6((C03K6) this, 645), new AwS550S0100000_6((C03K6) this, 651), new AwS550S0100000_6((C03K6) this, 653), aFwS236S0000000_62, null, null, new AwS550S0100000_6((C03K6) this, 656));
        }
        this.LLILZIL = assemVMLazy2;
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        Animatable animatable = this.LLILZLL;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0HQX c0hqx = (C0HQX) interfaceC1891350zJl;
        super.onBindItemView(c0hqx);
        String value = c0hqx.LLILLL.getValue();
        SmartImageView smartImageView = this.LLILLL;
        if (value != null && smartImageView != null) {
            I5(value, smartImageView, false, new AwS407S0200000_6(c0hqx, this, 92));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C440920HQs(c0hqx, this, null), 3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, C435650H6l.LIZ(-1, ((Number) this.LLILLJJLI.getValue()).intValue(), ((Number) this.LL.getValue()).intValue(), 0, 0, 248));
        SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
        smartImageView.setElevation(3.0f);
        frameLayout.addView(smartImageView, new FrameLayout.LayoutParams(((Number) this.LLILLJJLI.getValue()).intValue(), ((Number) this.LLILLJJLI.getValue()).intValue(), 17));
        this.LLILLL = smartImageView;
        return frameLayout;
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        Animatable animatable = this.LLILZLL;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void I5(String str, SmartImageView smartImageView, final boolean z, final Function0<Unit> function0) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LIZLLL("ResultCellV2");
        c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIZ.LIZLLL = false;
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(10);
        c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIZ.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0HQo
            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                this.LL.LLILZLL = null;
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                C0HQT c0hqt = C0HQT.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c0hqt.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis2, "time_ms");
                C20684815ws.LJIILLIIL("mix_studio_preload_render", c2344009Gk.LIZ);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                this.LL.LLILZLL = animatable;
                if (z && animatable != null) {
                    animatable.start();
                }
            }
        });
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
