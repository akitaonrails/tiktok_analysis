package com.ss.android.ugc.aweme.poi.videopublish.rcmdcell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0ZP4;
import X.C1185430gxB;
import X.C1199950hKb;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1200220hL2;
import X.C1200260hL6;
import X.C1200280hL8;
import X.C1201220hMe;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20627315nb;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
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
import X.ViewOnAttachStateChangeListenerC1208760hYo;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishRcmdListHeaderCell extends PowerCell<C1200220hL2> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final /* synthetic */ C1201220hMe LL = new C1201220hMe();
    public C20627315nb LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public final AssemVMLazy LLILZIL;
    public final C1200280hL8 LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiPublishRcmdListHeaderCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/videopublish/PoiPublishExtensionVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public PoiPublishRcmdListHeaderCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiPublishExtensionVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2160);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(733);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2171), awS562S0100000_18, AFwS206S0000000_18.get$arr$(563), new AwS562S0100000_18((C03K6) this, 2146), new AwS562S0100000_18((C03K6) this, 2148), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2150), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 2152), null, new AwS562S0100000_18((C03K6) this, 2153));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 2147);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2149);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 2151);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 105));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 2154);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 2155);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 2156);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 2157);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 2158);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2159), awS562S0100000_18, AFwS206S0000000_18.get$arr$(564), new AwS562S0100000_18((C03K6) this, 2161), new AwS562S0100000_18((C03K6) this, 2162), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2163), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 2164), null, new AwS562S0100000_18((C03K6) this, 2165));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2166), awS562S0100000_18, AFwS206S0000000_18.get$arr$(565), new AwS562S0100000_18((C03K6) this, 2167), new AwS562S0100000_18((C03K6) this, 2168), new AwS562S0100000_18((C03K6) this, 2169), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 2170));
        }
        this.LLILZIL = assemVMLazy;
        this.LLILZLL = C1199950hKb.LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C20627315nb c20627315nb = (C20627315nb) this.itemView.findViewById(R.id.veq);
        this.LLILLJJLI = c20627315nb;
        if (c20627315nb == null) {
            c20627315nb = null;
        }
        this.LLILLL = (TuxIconView) c20627315nb.findViewById(R.id.jxe);
        C20627315nb c20627315nb2 = this.LLILLJJLI;
        this.LLILZ = (TuxTextView) (c20627315nb2 != null ? c20627315nb2 : null).findViewById(R.id.xkj);
        this.LL.LIZJ(this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        ExtensionMisc extensionMisc;
        C1200220hL2 c1200220hL2 = (C1200220hL2) interfaceC1891350zJl;
        super.onBindItemView(c1200220hL2);
        TuxIconView tuxIconView = this.LLILLL;
        C20627315nb c20627315nb = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        tuxIconView.setIconRes(R.raw.icon_location_north_east_fill);
        TuxIconView tuxIconView2 = this.LLILLL;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        tuxIconView2.setTintColorRes(R.attr.a1k);
        TuxIconView tuxIconView3 = this.LLILLL;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(tuxTextView.getContext().getString(2131844697));
        C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
        C20627315nb c20627315nb2 = this.LLILLJJLI;
        if (c20627315nb2 == null) {
            c20627315nb2 = null;
        }
        C1200260hL6 c1200260hL6 = c1200220hL2.LLILLJJLI;
        if (c1200260hL6 != null && (extensionMisc = c1200260hL6.LLILLJJLI) != null && extensionMisc.isImageNewStyleUi()) {
            i = 16;
        } else {
            i = 44;
        }
        C426750GoL.LJIIIZ(c20627315nb2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), null, null, null, false, 30);
        C1185430gxB.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "video_post_page");
        C20684815ws.LJIILLIIL("find_nearby_places_show", linkedHashMap);
        C20627315nb c20627315nb3 = this.LLILLJJLI;
        if (c20627315nb3 != null) {
            c20627315nb = c20627315nb3;
        }
        C786410Ut5.k9(c20627315nb, new ACListenerS153S0100000_18(this, 119));
        this.LL.LIZIZ().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1208760hYo(getCurrentLifecycleOwner(), 2));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL.getClass();
        return C1201220hMe.LIZ(viewGroup);
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
