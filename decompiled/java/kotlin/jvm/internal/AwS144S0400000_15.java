package kotlin.jvm.internal;

import X.AbstractC938650aX9;
import X.AbstractC963510bBF;
import X.C00S0;
import X.C080500Rv;
import X.C09AY;
import X.C11IW;
import X.C11NJ;
import X.C11PQ;
import X.C1324720kZq;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C766270U4b;
import X.C915980Zwa;
import X.C918130a03;
import X.C925010aB9;
import X.C930540aK4;
import X.C931780aM4;
import X.C933980aPc;
import X.C937310aUz;
import X.C939680aYo;
import X.C941290abP;
import X.C941390abZ;
import X.C945320ahu;
import X.C950000apS;
import X.C950320apy;
import X.C954460awe;
import X.C961300b7g;
import X.C974060bSG;
import X.C974090bSJ;
import X.C974100bSK;
import X.C974140bSO;
import X.C977560bXu;
import X.C977580bXw;
import X.C977590bXx;
import X.C977630bY1;
import X.C978160bYs;
import X.EnumC919170a1j;
import X.EnumC959580b4u;
import X.EnumC975850bV9;
import X.InterfaceC925030aBB;
import X.InterfaceC927740aFY;
import X.InterfaceC945140ahc;
import X.InterfaceC950020apU;
import X.InterfaceC954180awC;
import X.InterfaceC974170bSR;
import X.ViewOnClickListenerC939670aYn;
import X.ViewOnLayoutChangeListenerC986920bn0;
import Y.AfS48S1100000_15;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.live.liveinteract.api.OnSelfWindowCreatedEvent;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWavePrivilegeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWaveScaleFactorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: loaded from: classes16.dex */
public class AwS144S0400000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS144S0400000_15 awS144S0400000_15) {
        InterfaceC925030aBB interfaceC925030aBBAg;
        InterfaceC945140ahc interfaceC945140ahc = ((C925010aB9) awS144S0400000_15.l0).LLILZLL;
        if (interfaceC945140ahc != null && (interfaceC925030aBBAg = interfaceC945140ahc.ag()) != null) {
            interfaceC925030aBBAg.LIZ((C945320ahu) awS144S0400000_15.l1);
        }
        ((InterfaceC954180awC) awS144S0400000_15.l2).LJJLIIIJ((C945320ahu) awS144S0400000_15.l1, (SeiAppData) awS144S0400000_15.l3);
        Function1<? super SeiAppData, Unit> function1 = ((C925010aB9) awS144S0400000_15.l0).LLJ;
        if (function1 != null) {
            function1.invoke((SeiAppData) awS144S0400000_15.l3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS144S0400000_15 r6) {
        /*
            java.lang.Object r0 = r6.l0
            com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse$LinkmicStatus r0 = (com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse.LinkmicStatus) r0
            java.lang.Object r5 = r6.l1
            X.0apS r5 = (X.C950000apS) r5
            java.lang.Object r4 = r6.l2
            X.0apy r4 = (X.C950320apy) r4
            java.lang.Object r3 = r6.l3
            X.0apU r3 = (X.InterfaceC950020apU) r3
            int r2 = r0.playType
            r0 = 1
            if (r2 == r0) goto L25
            r1 = 0
            r0 = 3
            if (r2 != r0) goto L1f
            X.C949990apR.LIZLLL(r5, r4)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1f:
            if (r1 != 0) goto L25
            r3.LIZ(r5, r4)
            goto L1c
        L25:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            r0.LJJII(r5, r4)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS144S0400000_15.invoke$1(kotlin.jvm.internal.AwS144S0400000_15):java.lang.Object");
    }

    public static final Object invoke$2(AwS144S0400000_15 awS144S0400000_15) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856754));
        C977590bXx c977590bXx = ((C977580bXw) awS144S0400000_15.l0).LJ;
        EnumC959580b4u enumC959580b4u = EnumC959580b4u.TEAM_PAIR_TIMED_OUT;
        c977590bXx.getClass();
        C915980Zwa.LJIIIZ().LIZ(enumC959580b4u, null);
        EnumC975850bV9 enumC975850bV9 = (EnumC975850bV9) awS144S0400000_15.l1;
        if (enumC975850bV9 != EnumC975850bV9.INVITER_CLICK_TEAM_PAIR && enumC975850bV9 != EnumC975850bV9.INVITER_SUGGESTED_TEAM_PAIR) {
            ((Function0) awS144S0400000_15.l3).invoke();
        } else {
            ((Function0) awS144S0400000_15.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS144S0400000_15 awS144S0400000_15) {
        C20441214yg.LJIIIZ("CompetitionAnchorLauncher", "handleInitFromCompetitionAction, checkMatchPermission success ");
        C974060bSG c974060bSG = (C974060bSG) awS144S0400000_15.l0;
        InterfaceC974170bSR interfaceC974170bSR = c974060bSG.LIZ;
        if (interfaceC974170bSR != null) {
            interfaceC974170bSR.LIZIZ(new C974100bSK(c974060bSG, (List) awS144S0400000_15.l1, C918130a03.LIZ(Integer.valueOf(((AbstractC963510bBF) awS144S0400000_15.l2).LIZIZ)), (MultiMatchPrepareResponse) awS144S0400000_15.l3, false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS144S0400000_15 awS144S0400000_15) {
        C974060bSG c974060bSG = (C974060bSG) awS144S0400000_15.l0;
        InterfaceC974170bSR interfaceC974170bSR = c974060bSG.LIZ;
        if (interfaceC974170bSR != null) {
            interfaceC974170bSR.LIZIZ(new C974100bSK(c974060bSG, (List) awS144S0400000_15.l1, (EnumC919170a1j) awS144S0400000_15.l2, (MultiMatchPrepareResponse) awS144S0400000_15.l3, false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS144S0400000_15 awS144S0400000_15) {
        ((C974090bSJ) awS144S0400000_15.l0).LIZ.LIZ(new C974140bSO((List) awS144S0400000_15.l1, (EnumC919170a1j) awS144S0400000_15.l2, (MultiMatchPrepareResponse) awS144S0400000_15.l3));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS144S0400000_15 awS144S0400000_15) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856754));
        C977630bY1 c977630bY1 = ((C977560bXu) awS144S0400000_15.l0).LJII;
        EnumC959580b4u enumC959580b4u = EnumC959580b4u.TEAM_PAIR_TIMED_OUT;
        c977630bY1.getClass();
        C915980Zwa.LJIIIZ().LIZ(enumC959580b4u, null);
        EnumC975850bV9 enumC975850bV9 = (EnumC975850bV9) awS144S0400000_15.l1;
        if (enumC975850bV9 != EnumC975850bV9.INVITER_CLICK_TEAM_PAIR && enumC975850bV9 != EnumC975850bV9.INVITER_SUGGESTED_TEAM_PAIR) {
            ((Function0) awS144S0400000_15.l3).invoke();
        } else {
            ((Function0) awS144S0400000_15.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS144S0400000_15 awS144S0400000_15) {
        C961300b7g.LJIIJ(C961300b7g.LIZ, (DataChannel) awS144S0400000_15.l0, (LiveSheetFragment) awS144S0400000_15.l1, null, null, true, (Function0) awS144S0400000_15.l2, 12);
        ((Function0) awS144S0400000_15.l3).invoke();
        ((LiveSheetFragment) awS144S0400000_15.l1).close();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS144S0400000_15 awS144S0400000_15) {
        SimpleLiveTextView simpleLiveTextView;
        LiveIconView liveIconView;
        C080500Rv c080500RvLIZ;
        C11PQ<SoundWareEffectExtra> c11pq;
        View view;
        C941290abP c941290abP;
        MutableLiveData<Integer> mutableLiveDataLJIIJJI;
        Integer value;
        View viewFindViewById;
        ImageModel value2;
        MutableLiveData<ImageModel> mutableLiveDataLJFF;
        C930540aK4.LJJIJLIJ((ViewGroup) awS144S0400000_15.l0, new AwS594S0100000_15((ViewOnClickListenerC939670aYn) awS144S0400000_15.l2, 1049));
        int width = (int) (((ViewGroup) awS144S0400000_15.l0).getWidth() * C933980aPc.LIZJ(C933980aPc.LJFF()));
        ViewGroup viewGroup = (ViewGroup) awS144S0400000_15.l1;
        DataChannel dataChannel = null;
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.qt3)) != null) {
            ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn = (ViewOnClickListenerC939670aYn) awS144S0400000_15.l2;
            ViewGroup.LayoutParams layoutParamsLJ = C933980aPc.LJ(viewFindViewById);
            if (layoutParamsLJ == null || width != layoutParamsLJ.width || width != layoutParamsLJ.height) {
                C933980aPc.LJIIZILJ(width, width, viewFindViewById);
            }
            if (BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
                if (viewFindViewById.isLaidOut() && !viewFindViewById.isLayoutRequested()) {
                    AbstractC938650aX9 abstractC938650aX9 = viewOnClickListenerC939670aYn.LLJIJIL;
                    if (abstractC938650aX9 != null && (mutableLiveDataLJFF = abstractC938650aX9.LJFF()) != null) {
                        value2 = mutableLiveDataLJFF.getValue();
                    } else {
                        value2 = null;
                    }
                    viewOnClickListenerC939670aYn.LJII(value2);
                } else {
                    viewFindViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(viewOnClickListenerC939670aYn, 5));
                }
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) awS144S0400000_15.l1;
        if (viewGroup2 != null) {
            ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn2 = (ViewOnClickListenerC939670aYn) awS144S0400000_15.l2;
            String str = ((C939680aYo) awS144S0400000_15.l3).LIZIZ;
            viewOnClickListenerC939670aYn2.getClass();
            if (C931780aM4.LIZ() && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().useVoiceWaveLayer) {
                viewOnClickListenerC939670aYn2.LLJILLL = null;
                viewOnClickListenerC939670aYn2.LLJI = null;
            } else {
                C1324720kZq c1324720kZq = (C1324720kZq) viewGroup2.findViewById(R.id.pnc);
                if (c1324720kZq != null) {
                    viewOnClickListenerC939670aYn2.LLJILLL = c1324720kZq;
                    Object parent = viewGroup2.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                    C933980aPc.LJIILLIIL(c1324720kZq, view, width);
                    C941290abP c941290abP2 = viewOnClickListenerC939670aYn2.LLJI;
                    if (c941290abP2 == null) {
                        c941290abP2 = new C941290abP(viewOnClickListenerC939670aYn2.LLJILLL, true, viewOnClickListenerC939670aYn2.LLJILJILJ, str);
                    }
                    viewOnClickListenerC939670aYn2.LLJI = c941290abP2;
                    AbstractC938650aX9 abstractC938650aX92 = viewOnClickListenerC939670aYn2.LLJIJIL;
                    if ((abstractC938650aX92 == null || (mutableLiveDataLJIIJJI = abstractC938650aX92.LJIIJJI()) == null || (value = mutableLiveDataLJIIJJI.getValue()) == null || value.intValue() != 0) && (c941290abP = viewOnClickListenerC939670aYn2.LLJI) != null) {
                        c941290abP.LIZLLL = true;
                    }
                }
            }
        }
        C941390abZ c941390abZ = ((ViewOnClickListenerC939670aYn) awS144S0400000_15.l2).LLJILJILJ;
        if (c941390abZ != null && MultiGuestVoiceWavePrivilegeSetting.INSTANCE.enable()) {
            int value3 = (int) (width * MultiGuestVoiceWaveScaleFactorSetting.INSTANCE.getValue());
            C933980aPc.LJIIZILJ(value3, value3, c941390abZ);
            C933980aPc.LJIILJJIL(c941390abZ, 0, 0, Integer.valueOf((int) C497740JfY.LIZIZ(1.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(1.0f)));
        }
        ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn3 = (ViewOnClickListenerC939670aYn) awS144S0400000_15.l2;
        C941390abZ c941390abZ2 = viewOnClickListenerC939670aYn3.LLJILJILJ;
        if (c941390abZ2 != null) {
            String str2 = ((C939680aYo) awS144S0400000_15.l3).LIZIZ;
            C11NJ c11nj = viewOnClickListenerC939670aYn3.LLILZIL;
            InterfaceC927740aFY interfaceC927740aFYLIZIZ = C00S0.LIZIZ();
            if (interfaceC927740aFYLIZIZ != null && (c080500RvLIZ = interfaceC927740aFYLIZIZ.LIZ(str2)) != null && (c11pq = c080500RvLIZ.LIZ) != null) {
                c11nj.LIZ(C937310aUz.LJI(new C11IW(c11pq.LJJIFFI().LJJIJIIJIL(new AfS48S1100000_15(c941390abZ2, str2, 5))), "VoiceChatBasicMask", "addVoiceWaveEffectChangedListener").LJIILL().LJIIZILJ());
            }
        }
        ViewGroup viewGroup3 = (ViewGroup) awS144S0400000_15.l1;
        if (viewGroup3 != null && (liveIconView = (LiveIconView) viewGroup3.findViewById(R.id.pn3)) != null) {
            int i = (int) (width * 0.3125f);
            ViewGroup.LayoutParams layoutParamsLJ2 = C933980aPc.LJ(liveIconView);
            if (layoutParamsLJ2 == null || i != layoutParamsLJ2.width || i != layoutParamsLJ2.height) {
                C933980aPc.LJIIZILJ(i, i, liveIconView);
            }
            liveIconView.setIconHeightRatio(0.6f);
            liveIconView.setIconWidthRatio(0.6f);
        }
        float width2 = ((ViewGroup) awS144S0400000_15.l0).getWidth() * 0.8f;
        ViewGroup viewGroup4 = (ViewGroup) awS144S0400000_15.l1;
        if (viewGroup4 != null && (simpleLiveTextView = (SimpleLiveTextView) viewGroup4.findViewById(R.id.p9_)) != null) {
            simpleLiveTextView.setMaxWidth((int) width2);
        }
        ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn4 = (ViewOnClickListenerC939670aYn) awS144S0400000_15.l2;
        AbstractC938650aX9 abstractC938650aX93 = viewOnClickListenerC939670aYn4.LLJIJIL;
        if (abstractC938650aX93 != null) {
            dataChannel = abstractC938650aX93.LIZ;
        }
        boolean zLJFF = viewOnClickListenerC939670aYn4.LJFF();
        if (!C931780aM4.LIZ() && zLJFF && dataChannel != null) {
            dataChannel.FQ2(OnSelfWindowCreatedEvent.class);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[businessMicInfoObserver] ");
        sbLIZ.append(((ViewOnClickListenerC939670aYn) awS144S0400000_15.l2).hashCode());
        sbLIZ.append(" cal size");
        C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0400000_15(C925010aB9 c925010aB9, C945320ahu c945320ahu, InterfaceC954180awC interfaceC954180awC, SeiAppData seiAppData, int i) {
        super(0);
        this.$t = i;
        this.l0 = c925010aB9;
        this.l1 = c945320ahu;
        this.l2 = interfaceC954180awC;
        this.l3 = seiAppData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0400000_15(C974060bSG c974060bSG, EnumC919170a1j enumC919170a1j, MultiMatchPrepareResponse multiMatchPrepareResponse, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = c974060bSG;
        this.l1 = list;
        this.l2 = enumC919170a1j;
        this.l3 = multiMatchPrepareResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS144S0400000_15(C974060bSG c974060bSG, C974060bSG c974060bSG2, List<C954460awe> list, AbstractC963510bBF abstractC963510bBF, MultiMatchPrepareResponse multiMatchPrepareResponse) {
        super(0);
        this.$t = multiMatchPrepareResponse;
        this.l0 = c974060bSG;
        this.l1 = c974060bSG2;
        this.l2 = list;
        this.l3 = abstractC963510bBF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS144S0400000_15(C974090bSJ c974090bSJ, C974090bSJ c974090bSJ2, List<C954460awe> list, EnumC919170a1j enumC919170a1j, MultiMatchPrepareResponse multiMatchPrepareResponse) {
        super(0);
        this.$t = multiMatchPrepareResponse;
        this.l0 = c974090bSJ;
        this.l1 = c974090bSJ2;
        this.l2 = list;
        this.l3 = enumC919170a1j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0400000_15(C977560bXu c977560bXu, EnumC975850bV9 enumC975850bV9, AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152, int i) {
        super(0);
        this.$t = i;
        this.l0 = c977560bXu;
        this.l1 = enumC975850bV9;
        this.l2 = awS559S0100000_15;
        this.l3 = awS559S0100000_152;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0400000_15(C977580bXw c977580bXw, EnumC975850bV9 enumC975850bV9, AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152, int i) {
        super(0);
        this.$t = i;
        this.l0 = c977580bXw;
        this.l1 = enumC975850bV9;
        this.l2 = awS559S0100000_15;
        this.l3 = awS559S0100000_152;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0400000_15(ViewGroup viewGroup, ViewGroup viewGroup2, ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn, C939680aYo c939680aYo, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = viewGroup2;
        this.l2 = viewOnClickListenerC939670aYn;
        this.l3 = c939680aYo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0400000_15(MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus, C950000apS c950000apS, C950320apy c950320apy, InterfaceC950020apU interfaceC950020apU, int i) {
        super(0);
        this.$t = i;
        this.l0 = linkmicStatus;
        this.l1 = c950000apS;
        this.l2 = c950320apy;
        this.l3 = interfaceC950020apU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0400000_15(DataChannel dataChannel, LiveSheetFragment liveSheetFragment, Function0 function0, C978160bYs c978160bYs, int i) {
        super(0);
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = liveSheetFragment;
        this.l2 = function0;
        this.l3 = c978160bYs;
    }
}
