package com.bytedance.android.livesdk.widgets.giftwidget.presenter;

import X.AbstractC1252750ihl;
import X.AnonymousClass0204;
import X.C004I;
import X.C083100Sv;
import X.C09JM;
import X.C0JBN;
import X.C0KVU;
import X.C0PEM;
import X.C0TZM;
import X.C1103140eoS;
import X.C1132550fZt;
import X.C1132570fZv;
import X.C1132580fZw;
import X.C1132690fa7;
import X.C1161920gLG;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11NJ;
import X.C1295960jpS;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C16F5;
import X.C1765020w20;
import X.C1819620xS4;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C474200Iig;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C784440Upu;
import X.C786410Ut5;
import X.C930940aKi;
import X.InterfaceC1075600e62;
import X.InterfaceC1128210fSt;
import X.InterfaceC1132680fa6;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC469390Iav;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ACListenerS120S0200000_17;
import Y.ACListenerS152S0100000_17;
import Y.AfS186S0100000_17;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.CPCState;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.pad.IPadMultiScreenService;
import com.bytedance.android.livesdkapi.depend.model.live.QuickGift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes18.dex */
public final class FastGiftConfirmDialog extends LiveDialogFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.AndroidViewModelFactory> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PywoLionO2srICHELIOSknPywoLionZjU+LDw2JjEpO2EVKTY4DiY1PAYjJyk6OigIIC4/JyI=";
    public C16F5 LL;
    public C1324720kZq LLILLJJLI;
    public C16F5 LLILLL;
    public C1295960jpS LLILZ;
    public C16F5 LLILZIL;
    public FrameLayout LLILZLL;
    public C16F5 LLIZ;
    public FrameLayout LLIZLLLIL;
    public LiveIconView LLJ;
    public View LLJI;
    public InterfaceC1132680fa6 LLJIJIL;
    public final C11NJ LLJILJIL = new C11NJ();
    public boolean LLJILJILJ;
    public final lifecycleAwareLazy LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    public FastGiftConfirmDialog() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveCPCViewModel.class);
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c19719912DlLIZ, 251);
        this.LLJILLL = new lifecycleAwareLazy(this, awS561S0100000_17, new AwS146S0400000_17(this, awS561S0100000_17, c19719912DlLIZ, AFwS301S0000000_17.get$arr$(14), 1));
        this.LLJJ = true;
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

    public final FrameLayout MR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fy1) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1324720kZq NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hpb) : null;
            this.LLILLJJLI = (C1324720kZq) viewFindViewById;
        }
        return (C1324720kZq) viewFindViewById;
    }

    public final C16F5 OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hpc) : null;
            this.LLILLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C1295960jpS PR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ntm) : null;
            this.LLILZ = (C1295960jpS) viewFindViewById;
        }
        return (C1295960jpS) viewFindViewById;
    }

    public final C16F5 RR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z5r) : null;
            this.LL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        int i;
        int i2;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
            this.LLJJ = bool.booleanValue();
        }
        if (this.LLJJ) {
            i = R.layout.g6b;
            i2 = 17;
        } else {
            i = R.layout.g6c;
            i2 = 5;
        }
        C500980Jkm c500980Jkm = new C500980Jkm(i);
        c500980Jkm.LIZJ = R.style.aig;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = i2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return !this.LLJJ;
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.Companion;
        Context context = getContext();
        return companion.getInstance((Application) (context != null ? C786410Ut5.N3(context) : null));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLJILJILJ) {
            C1103140eoS.LIZ(false, this.LLJJI);
        }
        this.LLJILJIL.LJ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Dialog dialog;
        Window window2;
        super.onStart();
        if (this.dataChannel != null && (dialog = getDialog()) != null && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(Integer.MIN_VALUE);
            window2.setNavigationBarColor(-16777216);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window2.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long id;
        FrameLayout.LayoutParams layoutParams;
        View childAt;
        List urls;
        User owner;
        DataChannel dataChannel;
        Room room;
        QuickGift quickGift;
        super.onViewCreated(view, bundle);
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        Gift fastGift = interfaceC1128210fStInst.getFastGift(id);
        if (C083100Sv.LIZ() && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (quickGift = room.quickGift) != null) {
            fastGift = C083100Sv.LIZIZ(quickGift);
        }
        if (fastGift != null) {
            RR().setMovementMethod(LinkMovementMethod.getInstance());
            if (this.LLJJI) {
                C500260Jjc.LJIILIIL(NR());
                ((ViewGroup.MarginLayoutParams) OR().getLayoutParams()).topMargin = 0;
                OR().setText(C497740JfY.LJIJI(2131841678));
                Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room3 != null) {
                    owner = room3.getOwner();
                } else {
                    owner = null;
                }
                RR().setText(C497740JfY.LJIJJ(2131841677, C0KVU.LIZ(owner)));
                C1295960jpS c1295960jpSPR = PR();
                if (c1295960jpSPR != null) {
                    C500260Jjc.LLFFF(c1295960jpSPR);
                }
                C500260Jjc.LJJJJJ(getViewLifecycleOwner(), C0PEM.LIZJ.plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 11)), new C474200Iig(this, null), 2);
            } else {
                C500260Jjc.LLFFF(NR());
                C1295960jpS c1295960jpSPR2 = PR();
                if (c1295960jpSPR2 != null) {
                    C500260Jjc.LJIILIIL(c1295960jpSPR2);
                }
                C1324720kZq c1324720kZqNR = NR();
                if (c1324720kZqNR != null) {
                    C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                    ImageModel imageModel = fastGift.image;
                    if (imageModel != null) {
                        urls = imageModel.getUrls();
                    } else {
                        urls = null;
                    }
                    C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
                    c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                    c1324610kZfLIZJ.LJJI(c1324720kZqNR);
                }
                OR().setText(fastGift.name);
                RR().setText(C497740JfY.LJIJI(2131843884));
            }
            View viewFindViewById = this.LLILZIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.izq);
                } else {
                    viewFindViewById = null;
                }
                this.LLILZIL = (C16F5) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(C497740JfY.LJIJJ(2131843886, Integer.valueOf(fastGift.diamondCount)));
            View viewFindViewById2 = this.LLILZLL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.ivu);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILZLL = (FrameLayout) viewFindViewById2;
            }
            C786410Ut5.O7((FrameLayout) viewFindViewById2, new ACListenerS120S0200000_17(fastGift, this, 14));
            LiveCPCViewModel liveCPCViewModel = (LiveCPCViewModel) this.LLJILLL.getValue();
            C16F5 c16f5RR = RR();
            View viewFindViewById3 = this.LLIZ;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.z5x);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLIZ = (C16F5) viewFindViewById3;
            }
            C16F5 c16f5 = (C16F5) viewFindViewById3;
            boolean z = this.LLJJI;
            AwS383S0200000_17 awS383S0200000_17 = new AwS383S0200000_17(this, fastGift, 42);
            if (!C1132580fZw.LJ()) {
                awS383S0200000_17.invoke(Boolean.FALSE);
            } else if (C1132580fZw.LIZLLL()) {
                liveCPCViewModel.getClass();
                boolean zLJI = MethodIDManager.LJI(202133);
                liveCPCViewModel.withState(new AwS596S0100000_17(liveCPCViewModel, 664));
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                C11EA.LJII(this, liveCPCViewModel, new C2217381BqS() { // from class: X.0fa0
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((CPCState) obj).getTask();
                    }
                }, new C1132550fZt(z, c16f5RR, c16f5, awS383S0200000_17));
            } else {
                CpcPromptResponse cpcPromptResponseLIZ = C1132580fZw.LIZ();
                if (C500260Jjc.LJJIIZ(cpcPromptResponseLIZ.prompt)) {
                    C1132570fZv.LIZJ(z, cpcPromptResponseLIZ.prompt, c16f5RR, c16f5, cpcPromptResponseLIZ.redirectLinkText);
                    awS383S0200000_17.invoke(Boolean.TRUE);
                } else {
                    awS383S0200000_17.invoke(Boolean.FALSE);
                }
            }
        }
        C786410Ut5.O7(MR(), new ACListenerS152S0100000_17(this, 74));
        View viewFindViewById4 = this.LLJ;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById4 = view5.findViewById(R.id.lc4);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJ = (LiveIconView) viewFindViewById4;
        }
        C786410Ut5.g8((LiveIconView) viewFindViewById4, new ACListenerS152S0100000_17(this, 75));
        if (MR().getChildCount() > 0 && (childAt = MR().getChildAt(0)) != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0fa2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                }
            }, childAt);
        }
        RR().setMovementMethod(LinkMovementMethod.getInstance());
        this.LLJILJIL.LIZ(C09JM.LIZ(C784440Upu.LIZ().LJ(C1132690fa7.class), new AfS186S0100000_17(this, 66)));
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            View viewFindViewById5 = this.LLJI;
            if (viewFindViewById5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById5 = view6.findViewById(R.id.hp6);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJI = viewFindViewById5;
            }
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById5.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.width = (int) C497740JfY.LIZIZ(375.0f);
                layoutParams.gravity = 8388693;
                layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(72.0f);
                InterfaceC469390Iav interfaceC469390Iav = ((IPadMultiScreenService) C1161920gLG.LIZJ(IPadMultiScreenService.class)).MR().get();
                if (interfaceC469390Iav != null && interfaceC469390Iav.St()) {
                    layoutParams.setMarginEnd((int) C497740JfY.LIZIZ(399.0f));
                } else {
                    layoutParams.setMarginEnd((int) C497740JfY.LIZIZ(24.0f));
                }
            }
            MR().setBackground(null);
        }
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
