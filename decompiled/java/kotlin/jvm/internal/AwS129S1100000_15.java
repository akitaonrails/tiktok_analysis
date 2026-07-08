package kotlin.jvm.internal;

import X.C01GW;
import X.C01HE;
import X.C05P0;
import X.C09AY;
import X.C0H79;
import X.C0KX4;
import X.C1672250tcN;
import X.C2188811AlT;
import X.C782110Um9;
import X.C786410Ut5;
import X.C915850ZwN;
import X.C925600aC6;
import X.C927240aEk;
import X.C929860aIy;
import X.C931740aM0;
import X.C931750aM1;
import X.C942210act;
import X.C942270acz;
import X.C946220ajM;
import X.C948090amN;
import X.C948100amO;
import X.C948400ams;
import X.C973470bRJ;
import X.DialogC972110bP7;
import X.EnumC1156220gC4;
import X.InterfaceC1692950u9l;
import X.InterfaceC743640TFa;
import X.InterfaceC954910axN;
import X.InterfaceC973480bRK;
import Y.AcS496S0100000_15;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandler;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.GuestUserInfo;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public class AwS129S1100000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        C782110Um9 c782110Um9 = new C782110Um9(((DialogC972110bP7) awS129S1100000_15.l1).getContext());
        c782110Um9.LJIIZILJ(2131854946);
        c782110Um9.LJIIIZ(awS129S1100000_15.s0);
        c782110Um9.LJIILIIL(2131854966, new AcS496S0100000_15((DialogC972110bP7) awS129S1100000_15.l1, 8));
        c782110Um9.LJIIJ(2131854971, new InterfaceC743640TFa() { // from class: X.0bPA
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILL = false;
        final DialogC972110bP7 dialogC972110bP7 = (DialogC972110bP7) awS129S1100000_15.l1;
        c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0bP9
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C786410Ut5.LJ(dialogC972110bP7);
            }
        };
        C786410Ut5.E4(c782110Um9.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        boolean z;
        PosIdentity posIdentity = (PosIdentity) obj;
        ((Function1) awS129S1100000_15.l1).invoke(posIdentity);
        long jLJI = C01HE.LJI(posIdentity.value);
        String str = awS129S1100000_15.s0;
        if (posIdentity.type == 2) {
            z = true;
        } else {
            z = false;
        }
        C915850ZwN.LJIIIZ(jLJI, str, false, z);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(awS129S1100000_15.s0, "debugSource");
        interfaceC954910axN.LJIILIIL(String.valueOf((Map) awS129S1100000_15.l1), "guestInfoMap");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(awS129S1100000_15.s0, "debugSource");
        interfaceC954910axN.LJIILIIL(String.valueOf(((C946220ajM) awS129S1100000_15.l1).LIZJ().size()), "newListSize");
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        boolean z;
        PosIdentity posIdentity = (PosIdentity) obj;
        ((Function1) awS129S1100000_15.l1).invoke(posIdentity);
        long jLJI = C01HE.LJI(posIdentity.value);
        String str = awS129S1100000_15.s0;
        if (posIdentity.type == 2) {
            z = true;
        } else {
            z = false;
        }
        C915850ZwN.LJIIIZ(jLJI, str, false, z);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        String str;
        String str2;
        Integer numValueOf;
        InterfaceC1692950u9l interfaceC1692950u9l = (InterfaceC1692950u9l) obj;
        if (interfaceC1692950u9l.LIZLLL() && ((int) (interfaceC1692950u9l.LIZ() & 4294967295L)) > 0 && ((int) (interfaceC1692950u9l.LIZ() >> 32)) > 0 && !((Boolean) ((C05P0) awS129S1100000_15.l1).getValue()).booleanValue()) {
            C948100amO c948100amOLIZ = C0H79.LIZ();
            if (c948100amOLIZ != null) {
                str = c948100amOLIZ.LIZLLL;
            } else {
                str = null;
            }
            String strValueOf = String.valueOf(str);
            C948100amO c948100amOLIZ2 = C0H79.LIZ();
            if (c948100amOLIZ2 != null) {
                str2 = c948100amOLIZ2.LJ;
            } else {
                str2 = null;
            }
            String strValueOf2 = String.valueOf(str2);
            C948100amO c948100amOLIZ3 = C0H79.LIZ();
            if (c948100amOLIZ3 != null) {
                numValueOf = Integer.valueOf(c948100amOLIZ3.LIZIZ());
            } else {
                numValueOf = null;
            }
            String strValueOf3 = String.valueOf(numValueOf);
            List listLJII = C942210act.LIZ.LJII(null, false);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJII.iterator();
            while (it2.hasNext()) {
                String strValueOf4 = String.valueOf(((C948400ams) it2.next()).LIZIZ);
                if (strValueOf4 != null) {
                    arrayList.add(strValueOf4);
                }
            }
            C931740aM0.LJIIJJI(new C931750aM1("show", strValueOf, strValueOf2, strValueOf3, null, arrayList, "origin_panel", awS129S1100000_15.s0, 240));
            ((C05P0) awS129S1100000_15.l1).setValue(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str2 = awS129S1100000_15.s0;
        if (zBooleanValue) {
            str = "on";
        } else {
            str = "off";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        linkedHashMap.put("switch_to", str);
        linkedHashMap.put("from_page", str2);
        C942270acz.LIZ(linkedHashMap);
        C0KX4.LIZ("livesdk_multi_show_available_spot_on_and_off", linkedHashMap, null, true);
        ((Function1) awS129S1100000_15.l1).invoke(new C948090amN(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C929860aIy.LIZIZ.remove(awS129S1100000_15.s0);
        ((Function1) awS129S1100000_15.l1).invoke(Integer.valueOf(iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        ((MultiGuestSharedBgGuestViewModel) awS129S1100000_15.l1).zQ2(awS129S1100000_15.s0, EnumC1156220gC4.REMOTE);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        boolean z;
        PosIdentity posIdentity = (PosIdentity) obj;
        ((Function1) awS129S1100000_15.l1).invoke(posIdentity);
        long jLJI = C01HE.LJI(posIdentity.value);
        String str = awS129S1100000_15.s0;
        if (posIdentity.type == 2) {
            z = true;
        } else {
            z = false;
        }
        C915850ZwN.LJIIIZ(jLJI, str, false, z);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        ((MultiGuestAnchorQuickConnectViewModel) awS129S1100000_15.l1).Xr1(null, awS129S1100000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        boolean z;
        PosIdentity posIdentity = (PosIdentity) obj;
        ((Function1) awS129S1100000_15.l1).invoke(posIdentity);
        long jLJI = C01HE.LJI(posIdentity.value);
        String str = awS129S1100000_15.s0;
        if (posIdentity.type == 2) {
            z = true;
        } else {
            z = false;
        }
        C915850ZwN.LJIIIZ(jLJI, str, false, z);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        MultiGuestEnterIntentHandler multiGuestEnterIntentHandler = (MultiGuestEnterIntentHandler) awS129S1100000_15.l1;
        String str = awS129S1100000_15.s0;
        multiGuestEnterIntentHandler.getClass();
        if (Intrinsics.LJFF(str, "guest_end_recommend_request")) {
            new C927240aEk("endLivePage", "guestReviewApply").LIZ();
        } else if (Intrinsics.LJFF(str, "guest_review_panel_recommend_link_room_request")) {
            new C927240aEk("summaryV", "applyBtn").LIZ();
        } else {
            new C927240aEk("summaryV", "applyBtn").LIZ();
        }
        ((MultiGuestEnterIntentHandler) awS129S1100000_15.l1).LJIIZILJ(5);
        C925600aC6.LIZ = awS129S1100000_15.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC973480bRK interfaceC973480bRK = (InterfaceC973480bRK) awS129S1100000_15.l1;
        if (interfaceC973480bRK != null) {
            interfaceC973480bRK.LIZ(th);
        }
        C01GW c01gw = C973470bRJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger_by_once_fail_source_");
        sbLIZ.append(awS129S1100000_15.s0);
        C973470bRJ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        return C1672250tcN.LIZ((C1672250tcN) obj, null, false, awS129S1100000_15.s0, (Integer) awS129S1100000_15.l1, false, 927);
    }

    public static final Object invoke$9(AwS129S1100000_15 awS129S1100000_15, Object obj) {
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) awS129S1100000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from LinkState wallpaper downloadImage , start download image: ");
        sbLIZ.append(awS129S1100000_15.s0);
        multiGuestSharedBgGuestViewModel.yQ2(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS129S1100000_15(java.lang.String r3, kotlin.jvm.functions.Function1 r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 1: goto Lf;
                case 3: goto Lf;
                case 5: goto Lf;
                case 12: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r3
            r1.l1 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS129S1100000_15.<init>(java.lang.String, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1100000_15(C05P0 c05p0, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1100000_15(DialogC972110bP7 dialogC972110bP7, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = dialogC972110bP7;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1100000_15(InterfaceC973480bRK interfaceC973480bRK, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC973480bRK;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1100000_15(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = multiGuestSharedBgGuestViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1100000_15(MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = multiGuestAnchorQuickConnectViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1100000_15(MultiGuestEnterIntentHandler multiGuestEnterIntentHandler, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = multiGuestEnterIntentHandler;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1100000_15(String str, C946220ajM c946220ajM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c946220ajM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S1100000_15(String str, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S1100000_15(String str, String str2, Map<Long, GuestUserInfo> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }
}
