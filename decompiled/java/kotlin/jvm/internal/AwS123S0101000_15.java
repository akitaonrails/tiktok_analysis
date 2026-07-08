package kotlin.jvm.internal;

import X.AbstractC19486711Lt;
import X.C09AY;
import X.C11S5;
import X.C2188811AlT;
import X.C304201Fw;
import X.C786410Ut5;
import X.C925990aCj;
import X.C933680aP8;
import X.C933690aP9;
import X.C936070aSz;
import X.C946850akN;
import X.C948360amo;
import X.C948780anU;
import X.C953610avH;
import X.C954640aww;
import X.C972120bP8;
import X.DialogC972110bP7;
import X.EnumC952890au7;
import X.EnumC971520bOA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC769940UIe;
import X.InterfaceC923870a9J;
import X.InterfaceC923890a9L;
import X.InterfaceC927510aFB;
import X.InterfaceC953490av5;
import X.InterfaceC954180awC;
import X.InterfaceC954910axN;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public class AwS123S0101000_15 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        EnumC971520bOA enumC971520bOA;
        C972120bP8 c972120bP8 = ((DialogC972110bP7) awS123S0101000_15.l0).LLJI;
        InterfaceC953490av5 interfaceC953490av5 = c972120bP8.LIZLLL;
        NoticeboardTemplate noticeboardTemplate = c972120bP8.LIZJ;
        String str = noticeboardTemplate.mediaNodeId;
        interfaceC953490av5.LIZLLL(awS123S0101000_15.i1, noticeboardTemplate.noticeboardTemplateId, str);
        if (awS123S0101000_15.i1 == 1) {
            enumC971520bOA = EnumC971520bOA.SET_AS_PUBLIC;
        } else {
            enumC971520bOA = EnumC971520bOA.SET_AS_PRIVATE;
        }
        Long lValueOf = Long.valueOf(((DialogC972110bP7) awS123S0101000_15.l0).LLJI.LIZJ.noticeboardTemplateId);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = ((DialogC972110bP7) awS123S0101000_15.l0).LLJI.LJ;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
        C786410Ut5.LJ((DialogC972110bP7) awS123S0101000_15.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        return C933680aP8.LIZ((C933680aP8) obj, null, new C933690aP9(awS123S0101000_15.i1, ((C933690aP9) awS123S0101000_15.l0).LIZIZ), null, 5);
    }

    public static final Object invoke$2(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        char c;
        InterfaceC923870a9J interfaceC923870a9J;
        InterfaceC769940UIe liveStream;
        if (!((Boolean) obj).booleanValue()) {
            int i = awS123S0101000_15.i1;
            int i2 = C936070aSz.LIZ;
            boolean z = true;
            if (i != 0 && i != 1) {
                c = 1;
            } else {
                c = 2;
            }
            InterfaceC923890a9L liveVideoClient = ((MultiGuestV3GuestPresenter) awS123S0101000_15.l0).getLiveVideoClient();
            if ((liveVideoClient instanceof InterfaceC923870a9J) && (interfaceC923870a9J = (InterfaceC923870a9J) liveVideoClient) != null && (liveStream = interfaceC923870a9J.getLiveStream()) != null) {
                if (c == 2) {
                    z = false;
                }
                liveStream.s3(z);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(Integer.valueOf(awS123S0101000_15.i1), "joinType");
        interfaceC954910axN.LJIILIIL(Long.valueOf(((C954640aww) awS123S0101000_15.l0).LJ), "groupChannelId");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        Integer numValueOf;
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        InterfaceC954180awC interfaceC954180awC = (InterfaceC954180awC) awS123S0101000_15.l0;
        Integer numValueOf2 = null;
        if (interfaceC954180awC != null) {
            numValueOf = Integer.valueOf(interfaceC954180awC.LJJLIIIJLJLI());
        } else {
            numValueOf = null;
        }
        interfaceC954910axN.LJIILIIL(numValueOf, "linker_mode");
        interfaceC954910axN.LJIILIIL(Integer.valueOf(awS123S0101000_15.i1), "linked_host_size");
        InterfaceC954180awC interfaceC954180awC2 = (InterfaceC954180awC) awS123S0101000_15.l0;
        if (interfaceC954180awC2 != null) {
            numValueOf2 = Integer.valueOf(((ArrayList) C948780anU.LJFF(interfaceC954180awC2)).size());
        }
        interfaceC954910axN.LJIILIIL(numValueOf2, "linked_guest_size");
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        C948360amo c948360amo = ((LayoutMarketFragment) awS123S0101000_15.l0).LLJZIJLIL;
        if (c948360amo != null) {
            int i = awS123S0101000_15.i1;
            int i2 = c948360amo.LLILZLL;
            c948360amo.LLLJ(i);
            c948360amo.notifyItemChanged(i2);
            c948360amo.notifyItemChanged(c948360amo.LLILZLL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        ((Number) obj).intValue();
        ((MultiGuestV3GuestBeInvitedDialog) awS123S0101000_15.l0).SR(awS123S0101000_15.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LinkMicState.Companion.castStateToString(awS123S0101000_15.i1));
        sbLIZ.append('(');
        sbLIZ.append(awS123S0101000_15.i1);
        sbLIZ.append(')');
        interfaceC954910axN.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ), "state");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS123S0101000_15.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS123S0101000_15 awS123S0101000_15, Object obj) {
        InterfaceC927510aFB interfaceC927510aFB;
        AbstractC19486711Lt abstractC19486711LtLJIILLIIL;
        ((Boolean) obj).booleanValue();
        C304201Fw c304201Fw = ((C953610avH) awS123S0101000_15.l0).LJIIZILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C953610avH.LJJIFFI;
        InterfaceC927510aFB interfaceC927510aFB2 = (InterfaceC927510aFB) c304201Fw.LIZ();
        if (interfaceC927510aFB2 != null && interfaceC927510aFB2.LJIILJJIL() != null && (interfaceC927510aFB = (InterfaceC927510aFB) ((C953610avH) awS123S0101000_15.l0).LJIIZILJ.LIZ()) != null && (abstractC19486711LtLJIILLIIL = interfaceC927510aFB.LJIILLIIL(awS123S0101000_15.i1, true)) != null) {
            ((C953610avH) awS123S0101000_15.l0).LIZLLL.LIZ(abstractC19486711LtLJIILLIIL.LJIJJLI(C11S5.LIZ()).LJIILL().LJIIZILJ());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS123S0101000_15 r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS123S0101000_15.invoke$9(kotlin.jvm.internal.AwS123S0101000_15, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS123S0101000_15(int r3, X.InterfaceC954180awC r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 4 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS123S0101000_15.<init>(int, X.0awC, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0101000_15(int i, C933690aP9 c933690aP9, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c933690aP9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0101000_15(int i, C954640aww c954640aww, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c954640aww;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0101000_15(int i, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = multiGuestV3GuestPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0101000_15(C925990aCj c925990aCj, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c925990aCj;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0101000_15(C953610avH c953610avH, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c953610avH;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0101000_15(DialogC972110bP7 dialogC972110bP7, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = dialogC972110bP7;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0101000_15(LayoutMarketFragment layoutMarketFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = layoutMarketFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0101000_15(MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = multiGuestV3GuestBeInvitedDialog;
        this.i1 = i;
    }
}
