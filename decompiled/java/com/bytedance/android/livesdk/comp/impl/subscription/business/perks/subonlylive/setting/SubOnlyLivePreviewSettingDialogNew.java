package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C0ZP4;
import X.C11GO;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1324720kZq;
import X.C13LE;
import X.C1622206Wu;
import X.C16F5;
import X.C16FS;
import X.C1770850wBP;
import X.C1834150xpV;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C492670JTt;
import X.C494350Ja5;
import X.C494360Ja6;
import X.C494370Ja7;
import X.C494380Ja8;
import X.C494390Ja9;
import X.C494410JaB;
import X.C494500JaK;
import X.C494580JaS;
import X.C494600JaU;
import X.C494610JaV;
import X.C494620JaW;
import X.C494630JaX;
import X.C494670Jab;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC492580JTk;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubVipSubOnlyLiveSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLivePreviewSettingDialogVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyLivePreviewSettingDialogNew extends LiveDialogFragment implements InterfaceC724530SbT {
    public static final C494360Ja6 LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2HELIOSs8LD04O2s/PC08Jik1JSYlLWs/LDsnISsrZxwmKgoiJTYfITMpGT02PiwpPhw2PDElJygXISQgJigdLTI=";
    public boolean LLILLJJLI;
    public final AssemVMLazy LLILZ;
    public C16F5 LLILZIL;
    public C16FS LLILZLL;
    public C127K LLIZ;
    public String LL = "";
    public final C01GW LLILLL = C452501pT.LIZIZ(new C494350Ja5(this));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Ja6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubOnlyLivePreviewSettingDialogNew.class, "subOnlyLivePreviewSettingDialogVM", "getSubOnlyLivePreviewSettingDialogVM()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subonlylive/setting/vm/SubOnlyLivePreviewSettingDialogVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.0Ja6
        };
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

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public SubOnlyLivePreviewSettingDialogNew() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubOnlyLivePreviewSettingDialogVM.class);
        C494390Ja9 c494390Ja9 = new C494390Ja9(c19719912DlLIZ);
        C494670Jab c494670Jab = new C494670Jab();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c494390Ja9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C494600JaU(this), c494670Jab, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c494390Ja9, new C494610JaV(this), c494670Jab, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c494390Ja9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C494620JaW(this), c494670Jab, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy;
    }

    public final SubOnlyLivePreviewSettingDialogVM MR() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (SubOnlyLivePreviewSettingDialogVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gb4);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 60;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        dismiss();
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C127M accessory;
        super.onViewCreated(view, bundle);
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.bmy), new View.OnClickListener() { // from class: X.0Jaa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.onBackPressed();
            }
        });
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.dataChannel);
        boolean z = false;
        C127M accessory2 = null;
        C723850SaN.LIZ(this, false, null, new C494410JaB(this, roomLJJLIIIIJ), 3);
        if (roomLJJLIIIIJ != null) {
            C127K c127k = (C127K) view.findViewById(R.id.axs);
            this.LLIZ = c127k;
            if (c127k != null) {
                c127k.setTitle(C497740JfY.LJIJI(2131844228));
            }
            if (this.LLILLJJLI) {
                C127K c127k2 = this.LLIZ;
                if (c127k2 != null) {
                    c127k2.setSubtitle(C497740JfY.LJIJI(2131856621));
                }
            } else {
                C127K c127k3 = this.LLIZ;
                if (c127k3 != null) {
                    c127k3.setSubtitle(C497740JfY.LJIJI(2131844223));
                }
            }
            C127K c127k4 = this.LLIZ;
            if (c127k4 != null) {
                if (!C494680Jac.LJIILJJIL(roomLJJLIIIIJ) || !C494680Jac.LIZ(roomLJJLIIIIJ)) {
                    z = true;
                }
                c127k4.setCellEnabled(z);
            }
            C127K c127k5 = this.LLIZ;
            if (c127k5 != null) {
                accessory = c127k5.getAccessory();
            } else {
                accessory = null;
            }
            if (accessory instanceof C127A) {
                C127K c127k6 = this.LLIZ;
                if (c127k6 != null) {
                    accessory2 = c127k6.getAccessory();
                }
                C11GO c11go = (C11GO) accessory2;
                c11go.LJIILJJIL(C494680Jac.LJFF());
                C1834150xpV.LJIIJ(this.LLIZ, true);
                c11go.LJI(new C494630JaX(this));
                c11go.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0JaA
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        SubOnlyLivePreviewSettingDialogVM subOnlyLivePreviewSettingDialogVMMR = this.LL.MR();
                        subOnlyLivePreviewSettingDialogVMMR.withState(new C494520JaM(subOnlyLivePreviewSettingDialogVMMR, z2, compoundButton.getContext(), this.LL.LLILLJJLI));
                    }
                });
            }
            if (SubVipSubOnlyLiveSetting.INSTANCE.isEnable() || C494680Jac.LJIILJJIL(roomLJJLIIIIJ)) {
                C500260Jjc.LLFFF(this.LLIZ);
            }
            C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0JaY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C494590JaT) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new C494370Ja7(this), 4);
            C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0JaZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C494590JaT) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new C494380Ja8(this), 4);
            SubOnlyLivePreviewSettingDialogVM subOnlyLivePreviewSettingDialogVMMR = MR();
            Room room = subOnlyLivePreviewSettingDialogVMMR.vQ2().LLILLJJLI;
            if (room != null) {
                if (!C494680Jac.LJIILJJIL(room)) {
                    subOnlyLivePreviewSettingDialogVMMR.setState(new C494500JaK());
                } else if (C494680Jac.LIZ(subOnlyLivePreviewSettingDialogVMMR.vQ2().LLILLJJLI)) {
                    subOnlyLivePreviewSettingDialogVMMR.setState(new C494580JaS());
                }
            }
        }
        ((InterfaceC492580JTk) this.LLILLL.getValue()).LIZIZ((C16F5) view.findViewById(R.id.guz), ((InterfaceC492580JTk) this.LLILLL.getValue()).LIZJ(), requireActivity(), this.LLILLJJLI);
        ((InterfaceC492580JTk) this.LLILLL.getValue()).LJ((C1324720kZq) view.findViewById(R.id.gcr), (C1324720kZq) view.findViewById(R.id.wj1), (C16F5) view.findViewById(R.id.f04));
        Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(this.dataChannel);
        if (roomLJJLIIIIJ2 != null) {
            C492670JTt.LIZ(String.valueOf(roomLJJLIIIIJ2.getOwnerUserId()), this.LL, C494680Jac.LJFF());
        }
        this.LLILZIL = (C16F5) view.findViewById(R.id.wi7);
        C16FS c16fs = (C16FS) view.findViewById(R.id.whx);
        this.LLILZLL = c16fs;
        if (this.LLILLJJLI) {
            C16F5 c16f5 = this.LLILZIL;
            if (c16f5 != null) {
                c16f5.setText("");
            }
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 8);
            }
            C16FS c16fs2 = this.LLILZLL;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131856674));
                return;
            }
            return;
        }
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131843630));
        }
        C16F5 c16f53 = this.LLILZIL;
        if (c16f53 == null) {
            return;
        }
        c16f53.setText(C497740JfY.LJIJI(2131843629));
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
