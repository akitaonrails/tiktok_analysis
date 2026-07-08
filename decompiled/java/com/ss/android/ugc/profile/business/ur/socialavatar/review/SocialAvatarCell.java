package com.ss.android.ugc.profile.business.ur.socialavatar.review;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0HNI;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C436950HBl;
import X.C436960HBm;
import X.C452080Ho6;
import X.C452501pT;
import X.C456970Hvz;
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
import X.InterfaceC438160HGc;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS110S0200000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarCell extends PowerCell<C436950HBl> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public AvatarComponentView LLILLJJLI;
    public CardView LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialAvatarCell.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/socialavatar/review/SocialAvatarEditViewModel;", 0);
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (AvatarComponentView) this.itemView.findViewById(R.id.rqu);
        this.LLILLL = (CardView) this.itemView.findViewById(R.id.um3);
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0HGh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HNI) obj).LLILLL;
            }
        }, null, new AwS620S0100000_6(this, 95), 6);
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0HFp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HNI) obj).LLILZ;
            }
        }, null, new AwS620S0100000_6(this, 96), 6);
    }

    public SocialAvatarCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarEditViewModel.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 916);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(381);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 901), awS550S0100000_6, AFwS192S0000000_6.get$arr$(374), new AwS550S0100000_6((C03K6) this, 902), new AwS550S0100000_6((C03K6) this, 904), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 906), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) this, 908), null, new AwS550S0100000_6((C03K6) this, 909));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((C03K6) this, 903);
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 905);
            AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c19719912DlLIZ, 907);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_62, 48));
            AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 910);
            AwS550S0100000_6 awS550S0100000_66 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 911);
            AwS550S0100000_6 awS550S0100000_67 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 912);
            AwS550S0100000_6 awS550S0100000_68 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 913);
            AwS550S0100000_6 awS550S0100000_69 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 914);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS550S0100000_64, awS550S0100000_6, new C452080Ho6(), awS550S0100000_65, awS550S0100000_66, awS550S0100000_63, aFwS236S0000000_6, awS550S0100000_67, awS550S0100000_68, awS550S0100000_69);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 915), awS550S0100000_6, AFwS192S0000000_6.get$arr$(375), new AwS550S0100000_6((C03K6) this, 917), new AwS550S0100000_6((C03K6) this, 918), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 919), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) this, 920), null, new AwS550S0100000_6((C03K6) this, 921));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 922), awS550S0100000_6, AFwS192S0000000_6.get$arr$(376), new AwS550S0100000_6((C03K6) this, 923), new AwS550S0100000_6((C03K6) this, 924), new AwS550S0100000_6((C03K6) this, 899), aFwS236S0000000_6, null, null, new AwS550S0100000_6((C03K6) this, 900));
        }
        this.LL = assemVMLazy;
    }

    public final SocialAvatarEditViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (SocialAvatarEditViewModel) assemVMLazy.getValue();
    }

    public final void I5(C436960HBm c436960HBm) {
        C436960HBm c436960HBm2;
        C436950HBl item = getItem();
        if (item != null && (c436960HBm2 = item.LL) != null) {
            if (c436960HBm != null && c436960HBm.LIZJ == c436960HBm2.LIZJ) {
                CardView cardView = this.LLILLL;
                if (cardView != null) {
                    C786410Ut5.LLILLL(cardView, 0);
                    return;
                }
                return;
            }
            CardView cardView2 = this.LLILLL;
            if (cardView2 == null) {
                return;
            }
            C786410Ut5.LLILLL(cardView2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C436950HBl c436950HBl = (C436950HBl) interfaceC1891350zJl;
        super.onBindItemView(c436950HBl);
        String str = c436950HBl.LL.LIZ;
        AvatarComponentView avatarComponentView = this.LLILLJJLI;
        AvatarComponentView avatarComponentView2 = null;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        avatarComponentView.getConfig().LIZ(AFwS264S0000000_24.get$arr$(0));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        AvatarComponentView avatarComponentView3 = this.LLILLJJLI;
        if (avatarComponentView3 == null) {
            avatarComponentView3 = null;
        }
        InterfaceC438160HGc socialAvatarAbility = avatarComponentView3.getSocialAvatarAbility();
        if (socialAvatarAbility != null) {
            socialAvatarAbility.LIZLLL(Collections.singletonList(str), true);
        }
        AvatarComponentView avatarComponentView4 = this.LLILLJJLI;
        if (avatarComponentView4 == null) {
            avatarComponentView4 = null;
        }
        avatarComponentView4.LIZLLL(1);
        AvatarComponentView avatarComponentView5 = this.LLILLJJLI;
        if (avatarComponentView5 != null) {
            avatarComponentView2 = avatarComponentView5;
        }
        avatarComponentView2.LIZ(1, new ACListenerS110S0200000_6(this, c436950HBl, 0));
        I5(((C0HNI) L5().getState()).LLILLL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eil, viewGroup, false);
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
