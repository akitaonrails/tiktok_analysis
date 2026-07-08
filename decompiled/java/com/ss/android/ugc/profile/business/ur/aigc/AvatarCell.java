package com.ss.android.ugc.profile.business.ur.aigc;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0HZQ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220990hsX;
import X.C1221030hsb;
import X.C1239170iLr;
import X.C1239180iLs;
import X.C1266210j3T;
import X.C1266280j3a;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1221420htE;
import X.EnumC1338240kve;
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
import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AvatarCell extends PowerCell<C1220990hsX> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public boolean LLILLJJLI;
    public C0HZQ LLILLL;
    public SmartImageView LLILZ;
    public C1239170iLr LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AvatarCell.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcAvatarViewModel;", 0);
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (C0HZQ) this.itemView.findViewById(R.id.dq1);
        this.LLILZ = (SmartImageView) this.itemView.findViewById(R.id.kb6);
        ProfileAigcAvatarViewModel profileAigcAvatarViewModelL5 = L5();
        selectSubscribe(profileAigcAvatarViewModelL5, new C2217381BqS() { // from class: X.0hsY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0hsZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0hsa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZIZ(profileAigcAvatarViewModelL5.usedInReusedScene), null, new C1266280j3a(this, 2));
    }

    public AvatarCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcAvatarViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2160);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(359);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2145), awS563S0100000_19, AFwS207S0000000_19.get$arr$(397), new AwS563S0100000_19((C03K6) this, 2146), new AwS563S0100000_19((C03K6) this, 2148), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2150), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 2152), null, new AwS563S0100000_19((C03K6) this, 2153));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 2147);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2149);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 2151);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 111));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 2154);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 2155);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 2156);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 2157);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 2158);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2159), awS563S0100000_19, AFwS207S0000000_19.get$arr$(398), new AwS563S0100000_19((C03K6) this, 2161), new AwS563S0100000_19((C03K6) this, 2162), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2163), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 2164), null, new AwS563S0100000_19((C03K6) this, 2165));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2166), awS563S0100000_19, AFwS207S0000000_19.get$arr$(399), new AwS563S0100000_19((C03K6) this, 2167), new AwS563S0100000_19((C03K6) this, 2168), new AwS563S0100000_19((C03K6) this, 2143), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 2144));
        }
        this.LL = assemVMLazy;
    }

    public final ProfileAigcAvatarViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (ProfileAigcAvatarViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1239180iLs c1239180iLs;
        C1266210j3T c1266210j3T;
        C1220990hsX c1220990hsX = (C1220990hsX) interfaceC1891350zJl;
        super.onBindItemView(c1220990hsX);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind item with id:");
        sbLIZ.append(c1220990hsX.LL.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZIL = new C1239170iLr();
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c1220990hsX.LL.LIZIZ);
        SmartImageView smartImageView = this.LLILZ;
        C0HZQ c0hzq = null;
        if (smartImageView == null) {
            smartImageView = null;
        }
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        C1239170iLr c1239170iLr = this.LLILZIL;
        if (c1239170iLr != null) {
            c1239180iLs = c1239170iLr.LJ;
        } else {
            c1239180iLs = null;
        }
        c1331670kl3LJIIIZ.LJJJIL = c1239180iLs;
        Context context = this.itemView.getContext();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        c1331670kl3LJIIIZ.LJJIIZI(c384050F3z.LIZ(context));
        C1239170iLr c1239170iLr2 = this.LLILZIL;
        if (c1239170iLr2 != null) {
            c1266210j3T = c1239170iLr2.LJFF;
        } else {
            c1266210j3T = null;
        }
        c1331670kl3LJIIIZ.LJIIL(c1266210j3T);
        C736680Sv4.LJIJJ(L5(), new AwS598S0100000_19(this, 782));
        C786410Ut5.I7(new ACListenerS122S0200000_19(c1220990hsX, this, 61), this.itemView);
        C0HZQ c0hzq2 = this.LLILLL;
        if (c0hzq2 != null) {
            c0hzq = c0hzq2;
        }
        c0hzq.setInterceptToggleListener(new AwS420S0200000_19(this, c1220990hsX, 177));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eb8, viewGroup, false);
    }

    public final void I5(EnumC1221420htE enumC1221420htE, C1221030hsb c1221030hsb, Set<C1221030hsb> set) {
        C1221030hsb c1221030hsb2;
        C1220990hsX item = getItem();
        if (item != null && (c1221030hsb2 = item.LL) != null) {
            C0HZQ c0hzq = null;
            if (enumC1221420htE.isDownload()) {
                C0HZQ c0hzq2 = this.LLILLL;
                if (c0hzq2 == null) {
                    c0hzq2 = null;
                }
                C786410Ut5.LLLLLZ(c0hzq2, 0);
                boolean zContains = set.contains(c1221030hsb2);
                this.LLILLJJLI = zContains;
                C0HZQ c0hzq3 = this.LLILLL;
                if (c0hzq3 != null) {
                    c0hzq = c0hzq3;
                }
                c0hzq.setChecked(zContains);
                this.itemView.setBackgroundResource(R.drawable.cxb);
                return;
            }
            C0HZQ c0hzq4 = this.LLILLL;
            if (c0hzq4 != null) {
                c0hzq = c0hzq4;
            }
            C786410Ut5.LLLLLZ(c0hzq, 4);
            if (Intrinsics.LJFF(c1221030hsb, c1221030hsb2)) {
                this.itemView.setBackgroundResource(R.drawable.cxa);
            } else {
                this.itemView.setBackgroundResource(R.drawable.cxb);
            }
        }
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
