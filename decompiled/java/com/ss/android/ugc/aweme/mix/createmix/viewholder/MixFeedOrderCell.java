package com.ss.android.ugc.aweme.mix.createmix.viewholder;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1166800gT8;
import X.C1166870gTF;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1324840ka2;
import X.C1360520lVa;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1765020w20;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1167900gUu;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC451590HnJ;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ATListenerS451S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MixFeedOrderCell extends PowerCell<C1166800gT8> implements InterfaceC1171660gay, InterfaceC1167900gUu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C01GW LL;
    public final C1166870gTF LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixFeedOrderCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/createmix/viewmodel/MixCreateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [X.0gTF] */
    public MixFeedOrderCell() {
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixCreateViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 465);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(145);
        if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 449), awS562S0100000_18, AFwS206S0000000_18.get$arr$(186), new AwS562S0100000_18((C03K6) this, 451), new AwS562S0100000_18((C03K6) this, 453), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 455), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 457), null, new AwS562S0100000_18((C03K6) this, 458));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 452);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 454);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 456);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 38));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 459);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 460);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 461);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 462);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 463);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 464), awS562S0100000_18, AFwS206S0000000_18.get$arr$(187), new AwS562S0100000_18((C03K6) this, 466), new AwS562S0100000_18((C03K6) this, 467), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 468), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 469), null, new AwS562S0100000_18((C03K6) this, 470));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 471), awS562S0100000_18, AFwS206S0000000_18.get$arr$(188), new AwS562S0100000_18((C03K6) this, 472), new AwS562S0100000_18((C03K6) this, 473), new AwS562S0100000_18((C03K6) this, 474), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 475));
        }
        this.LL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 450));
        this.LLILLJJLI = new Lifecycle() { // from class: X.0gTF
            @Override // androidx.lifecycle.Lifecycle
            public final void addObserver(LifecycleObserver lifecycleObserver) {
            }

            @Override // androidx.lifecycle.Lifecycle
            public final void removeObserver(LifecycleObserver lifecycleObserver) {
            }

            @Override // androidx.lifecycle.Lifecycle
            public final Lifecycle.State getCurrentState() {
                return Lifecycle.State.DESTROYED;
            }
        };
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIJ() {
        this.itemView.setBackgroundColor(0);
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIZILJ() {
        this.itemView.setBackgroundColor(((Number) this.LL.getValue()).intValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        return (currentLifecycleOwner == null || (lifecycle = currentLifecycleOwner.getLifecycle()) == null) ? this.LLILLJJLI : lifecycle;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        UrlModel urlModel;
        boolean z;
        C1166800gT8 c1166800gT8 = (C1166800gT8) interfaceC1891350zJl;
        RemoteImageView remoteImageView = (RemoteImageView) this.itemView.findViewById(R.id.f5b);
        C1166800gT8 item = getItem();
        if (item != null) {
            urlModel = item.LLILZ;
        } else {
            urlModel = null;
        }
        C1324840ka2.LJFF(remoteImageView, urlModel);
        String str = c1166800gT8.LLILZIL;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohl), 0);
            TextView textView = (TextView) this.itemView.findViewById(R.id.ohl);
            C1360520lVa c1360520lVa = new C1360520lVa();
            String str2 = c1166800gT8.LLILZIL;
            if (str2 == null) {
                str2 = "";
            }
            c1360520lVa.LIZ.append((CharSequence) str2);
            textView.setText(c1360520lVa.LIZ);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohl), 8);
        }
        ((TextView) this.itemView.findViewById(R.id.ohq)).setText(C20642515q3.LJFF().getQuantityString(2131755488, (int) c1166800gT8.LL.getStatistics().getPlayCount(), c1166800gT8.LLILZLL));
        C786410Ut5.LJZI(0, (ImageView) this.itemView.findViewById(R.id.lm0));
        this.itemView.findViewById(R.id.lm0).setOnTouchListener(new ATListenerS451S0100000_18(this, 13));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.do_, false, 4, null);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
