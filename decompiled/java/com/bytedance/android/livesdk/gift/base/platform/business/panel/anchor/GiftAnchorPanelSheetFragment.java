package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C0JOK;
import X.C0QSJ;
import X.C0ZP4;
import X.C1132410fZf;
import X.C1133630fbd;
import X.C1138630fjh;
import X.C1140890fnL;
import X.C1145100fu8;
import X.C1146150fvp;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1998507sF;
import X.C1A6V;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C784440Upu;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1998407sE;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AfS186S0100000_17;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.livesdk.GiftDialogSizeChanged;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.GiftAnchorPanelCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.IGiftAnchorPanelCenterAbility;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.top.IGiftAnchorPanelTopAbility;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelSheetFragment extends LiveSheetFragment implements InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final C1132410fZf LLLIIIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPWExKTYpZz8/KTEqJj0+ZiHELIOSc5OiY9LTY/Zz8yJiAgZy49Ky0jO2EUISM4CCEwICo+GS49LSkfISo2PAM+KCg+LSs4";
    public Room LLJLLL;
    public DataChannel LLJZ;
    public Context LLJZIJLIL;
    public String LLL = "";
    public final C1133630fbd LLLF = new C1133630fbd();
    public final AssemVMLazy LLLFF;
    public final C01GW LLLFFI;
    public C1146150fvp LLLFZ;
    public boolean LLLI;
    public int LLLII;
    public int LLLIIII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0fZf] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftAnchorPanelSheetFragment.class, "panelCenterVM", "getPanelCenterVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/GiftAnchorPanelCenterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIIIL = new Object() { // from class: X.0fZf
        };
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int ZR() {
        return R.id.izo;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{GiftAnchorPanelScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(GiftAnchorPanelScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(GiftAnchorPanelScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public GiftAnchorPanelSheetFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelCenterViewModel.class);
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c19719912DlLIZ, 141);
        AFwS254S0000000_17 aFwS254S0000000_17 = AFwS254S0000000_17.get$arr$(49);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS561S0100000_17, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS561S0100000_17((HasDefaultViewModelProviderFactory) this, 142), aFwS254S0000000_17, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS561S0100000_17, new AwS561S0100000_17((Fragment) this, 143), aFwS254S0000000_17, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS561S0100000_17, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS561S0100000_17((HasDefaultViewModelProviderFactory) this, 144), aFwS254S0000000_17, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLFF = assemVMLazy;
        this.LLLFFI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 140));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void LJJJI(float f) {
        int iTz0;
        int iP31 = 0;
        if (-1.0f <= f && f <= 0.0f) {
            if (this.LLLII == 0) {
                IGiftAnchorPanelCenterAbility iGiftAnchorPanelCenterAbility = (IGiftAnchorPanelCenterAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IGiftAnchorPanelCenterAbility.class, null);
                if (iGiftAnchorPanelCenterAbility != null) {
                    iTz0 = iGiftAnchorPanelCenterAbility.tz0();
                } else {
                    iTz0 = 0;
                }
                this.LLLII = iTz0;
            }
            if (this.LLLIIII == 0) {
                IGiftAnchorPanelTopAbility iGiftAnchorPanelTopAbility = (IGiftAnchorPanelTopAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IGiftAnchorPanelTopAbility.class, null);
                if (iGiftAnchorPanelTopAbility != null) {
                    iP31 = iGiftAnchorPanelTopAbility.p31();
                }
                this.LLLIIII = iP31;
            }
            int i = this.LLLII + this.LLLIIII;
            float f2 = 1 + f;
            DataChannel dataChannel = this.LLJZ;
            if (dataChannel != null) {
                dataChannel.LC0(GiftDialogSizeChanged.class, new C1998507sF(i * f2, EnumC1998407sE.SHEET_SLIDE));
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.isHeaderHidden = true;
        sheetOptions.LIZ(3, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int l5(Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.exu, (Context) this.LLLFFI.getValue());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        Dialog dialog = this.LLJJIJIL.LIZLLL.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C1145100fu8.LIZ(window);
            C1A6V c1a6v = new C1A6V(window, window.getDecorView());
            c1a6v.LIZ.LJ();
            c1a6v.LIZ(1);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        if (!this.LLLI) {
            this.LLLI = true;
            this.LLLF.LIZJ = i;
            DataChannel dataChannel = this.LLJZ;
            if (dataChannel != null) {
                dataChannel.LC0(GiftDialogDismissEvent.class, Boolean.FALSE);
            }
            DataChannel dataChannel2 = this.LLJZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(GiftDialogVisibilityChannel.class, Boolean.FALSE);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (LiveGiftResourceManagerSettings.INSTANCE.getPreloadStrategy() == 1) {
            C1140890fnL.LIZLLL().getClass();
            C1138630fjh.LJIIIZ();
        }
        if (this.LLJLLL == null || this.LLJZ == null) {
            return;
        }
        C723850SaN.LIZ(this, false, null, new AwS596S0100000_17(this, 125), 3);
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null) {
            dataChannel.zW(GiftDialogVisibilityChannel.class, Boolean.TRUE);
            dataChannel.BQ2(this, GiftDialogDismissEvent.class, new AwS596S0100000_17(this, 428));
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS596S0100000_17(this, 429));
            C784440Upu.LIZ().LIZJ(this, C0JOK.class).LIZJ(new AfS186S0100000_17(this, 112));
        }
        AssemVMLazy assemVMLazy = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0fvc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1146210fvv) obj).LLILLJJLI;
            }
        }, null, new AwS631S0100000_17(this, 6), 6);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gno, viewGroup, false);
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
