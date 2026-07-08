package com.ss.android.ugc.aweme.mix.choose;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0HZQ;
import X.C0ZP4;
import X.C1168070gVB;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
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
import Y.ACListenerS121S0200000_18;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistChoosePanelListCell extends PowerCell<C1168070gVB> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public C0HZQ LLILLJJLI;
    public String LLILLL;
    public final C01GW LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaylistChoosePanelListCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/mix/choose/PlaylistChoosePanelViewModel;", 0);
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C736680Sv4.LJIIIIZZ(this, I5(), new C2217381BqS() { // from class: X.0gW2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1168510gVt) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 44), 6);
    }

    public PlaylistChoosePanelListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PlaylistChoosePanelViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 683);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(136);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 416), awS546S0100000_2, AFwS206S0000000_18.get$arr$(181), new AwS562S0100000_18((C03K6) this, 417), new AwS562S0100000_18((C03K6) this, 419), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 421), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 423), null, new AwS562S0100000_18((C03K6) this, 424));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((C03K6) this, 418);
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 420);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18(c19719912DlLIZ, 422);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_18, 37));
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c01gwLIZIZ, 425);
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 426);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 427);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 428);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 429);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_183, awS546S0100000_2, new C452080Ho6(), awS562S0100000_184, awS562S0100000_185, awS562S0100000_182, aFwS256S0000000_18, awS562S0100000_186, awS562S0100000_187, awS562S0100000_188);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 430), awS546S0100000_2, AFwS206S0000000_18.get$arr$(182), new AwS562S0100000_18((C03K6) this, 431), new AwS562S0100000_18((C03K6) this, 432), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 433), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 434), null, new AwS562S0100000_18((C03K6) this, 435));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 436), awS546S0100000_2, AFwS206S0000000_18.get$arr$(183), new AwS562S0100000_18((C03K6) this, 437), new AwS562S0100000_18((C03K6) this, 438), new AwS562S0100000_18((C03K6) this, 439), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 415));
        }
        this.LL = assemVMLazy;
        this.LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 682));
    }

    public final PlaylistChoosePanelViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (PlaylistChoosePanelViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        int iIntValue2;
        String str;
        Drawable drawableMutate;
        List<String> urlList;
        C1168070gVB c1168070gVB = (C1168070gVB) interfaceC1891350zJl;
        ((TextView) this.itemView.findViewById(R.id.qv2)).setText(c1168070gVB.LLILLJJLI);
        TextView textView = (TextView) this.itemView.findViewById(R.id.qv3);
        Resources resources = this.itemView.getContext().getResources();
        Integer num = c1168070gVB.LLILZ;
        int i = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Object[] objArr = new Object[1];
        Integer num2 = c1168070gVB.LLILZ;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        objArr[0] = Integer.valueOf(iIntValue2);
        textView.setText(resources.getQuantityString(2131755471, iIntValue, objArr));
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.qua);
        smartImageView.setBackground((Drawable) this.LLILZ.getValue());
        UrlModel urlModel = c1168070gVB.LLILLL;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        TuxTag tuxTag = (TuxTag) this.itemView.findViewById(R.id.quy);
        tuxTag.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        if (c1168070gVB.LLILZLL != 1) {
            i = 8;
        }
        C786410Ut5.LLZLLIL(tuxTag, i);
        Drawable background = tuxTag.getBackground();
        if (background != null && (drawableMutate = background.mutate()) != null) {
            drawableMutate.setAlpha(30);
        }
        tuxTag.setTextColor(C960203pA.LIZ(R.attr.a11, tuxTag.getContext()));
        C0HZQ c0hzq = (C0HZQ) this.itemView.findViewById(R.id.qu6);
        this.LLILLJJLI = c0hzq;
        if (c0hzq != null) {
            c0hzq.setChecked(c1168070gVB.LL);
        }
        C0HZQ c0hzq2 = this.LLILLJJLI;
        if (c0hzq2 != null) {
            C786410Ut5.b9(c0hzq2, new ACListenerS121S0200000_18(c1168070gVB, this, 68));
        }
        C786410Ut5.I7(new ACListenerS121S0200000_18(c1168070gVB, this, 69), this.itemView);
        this.LLILLL = c1168070gVB.LLILZIL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dws, viewGroup, false);
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
