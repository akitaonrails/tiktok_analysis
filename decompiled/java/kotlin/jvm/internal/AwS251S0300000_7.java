package kotlin.jvm.internal;

import X.AbstractC470790IdB;
import X.AbstractC470800IdC;
import X.C03H5;
import X.C09AY;
import X.C0IJT;
import X.C0J54;
import X.C0JFN;
import X.C0JH3;
import X.C0JHC;
import X.C0KCK;
import X.C0KLA;
import X.C0KP1;
import X.C0KP2;
import X.C0KP3;
import X.C0KPG;
import X.C0KS8;
import X.C0KSC;
import X.C0KSH;
import X.C0KSW;
import X.C0KSY;
import X.C1161920gLG;
import X.C118300cf;
import X.C1324610kZf;
import X.C1605720rt4;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C176600m4;
import X.C1789970wgF;
import X.C1819620xS4;
import X.C19748512Ol;
import X.C19EG;
import X.C20684815ws;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C471830Ier;
import X.C474500IjA;
import X.C475360IkY;
import X.C475510Ikn;
import X.C482120IvS;
import X.C484980J0e;
import X.C485050J0l;
import X.C489110JGb;
import X.C493580JXg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C515900KLc;
import X.C516910KOz;
import X.C517700KSa;
import X.C517840KSo;
import X.C518180KTw;
import X.C520010KaN;
import X.C766270U4b;
import X.C781520UlC;
import X.C782110Um9;
import X.C786410Ut5;
import X.C924790aAn;
import X.InterfaceC0148002o;
import X.InterfaceC1791930wjP;
import X.InterfaceC489200JGk;
import X.InterfaceC743640TFa;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS71S0110000_7;
import Y.AcS352S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.OuterMultiGuestLayoutChangeEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeInvitationLynxUrlSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinFragment;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tikcast.api.fans.GetNonFansUserDataResponse;
import webcast.api.game.GameDrawerCategory;
import webcast.data.RechargeCustomError;
import webcast.data.SuperFanPackage;
import webcast.data.SuperFanPrivilege;
import webcast.data.SuperFanPrivilegeInfo;

/* JADX INFO: loaded from: classes8.dex */
public class AwS251S0300000_7 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS251S0300000_7 awS251S0300000_7) {
        IapService iapService = ((C516910KOz) awS251S0300000_7.l0).LIZIZ;
        Activity activity = ((C0KP3) awS251S0300000_7.l1).LIZJ.get();
        C1789970wgF c1789970wgF = (C1789970wgF) awS251S0300000_7.l2;
        final C516910KOz c516910KOz = (C516910KOz) awS251S0300000_7.l0;
        final C0KP3 c0kp3 = (C0KP3) awS251S0300000_7.l1;
        c516910KOz.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C0KP2 c0kp2 = new C0KP2(c0kp3.LJIILL, jCurrentTimeMillis);
        iapService.LIZIZ(activity, c1789970wgF, new C0KP1(c0kp2, jCurrentTimeMillis, c516910KOz) { // from class: X.0KP0
            public final /* synthetic */ long LJFF;
            public final /* synthetic */ C516910KOz LJI;

            @Override // X.InterfaceC518120KTq
            public final void LIZ(C0KPG c0kpg) {
                String str;
                String string;
                String str2;
                int value;
                int i;
                String str3;
                EnumC1792020wjY enumC1792020wjY;
                EnumC1792020wjY enumC1792020wjY2;
                long jCurrentTimeMillis2;
                int i2;
                String str4 = c0kpg.LIZIZ;
                if (str4 == null || str4.length() == 0) {
                    SuperFanPackage superFanPackage = this.LJ.LJI.LIZ;
                    if (superFanPackage != null) {
                        str = superFanPackage.packageId;
                    } else {
                        str = null;
                    }
                    c0kpg.LIZIZ = str;
                }
                String str5 = c0kpg.LIZJ;
                if (str5 == null || str5.length() == 0) {
                    c0kpg.LIZJ = this.LJ.LJIILL;
                }
                if (c0kpg.LIZ == C0KPI.SUCCESS) {
                    C516010KLn.LIZ.getClass();
                    long jLIZIZ = C516010KLn.LIZIZ();
                    if (C516010KLn.LIZLLL == 0) {
                        jCurrentTimeMillis2 = 0;
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis() - C516010KLn.LIZLLL;
                    }
                    boolean zLIZ = this.LIZ.LIZ();
                    String str6 = this.LIZIZ.LIZ;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - this.LIZJ;
                    C0KNX c0knx = this.LIZ;
                    String str7 = c0knx.LIZLLL;
                    String str8 = c0knx.LIZIZ;
                    Map<String, String> map = this.LIZLLL;
                    C0KM7 c0km7LIZIZ = C0KP1.LIZIZ();
                    C0KNX c0knx2 = this.LIZ;
                    C0KN4 c0kn4 = c0knx2.LIZ;
                    if (c0kn4 != null) {
                        i2 = c0kn4.LLIZLLLIL;
                    } else {
                        i2 = 0;
                    }
                    C516010KLn.LJIIJ(Boolean.valueOf(zLIZ), str6, jCurrentTimeMillis3, jLIZIZ, jCurrentTimeMillis2, str7, str8, map, c0km7LIZIZ, i2, c0knx2);
                    C0KN4 c0kn42 = this.LIZ.LIZ;
                    if (c0kn42 != null) {
                        c0kn42.LIZJ();
                    }
                    Map mapLIZIZ = C0KSH.LIZIZ(this.LJ);
                    C0KP3 c0kp32 = this.LJ;
                    mapLIZIZ.put("contract_id", c0kp32.LJIILL);
                    mapLIZIZ.put("order_id", c0kp32.LJIILL);
                    C0KSH.LJI((int) (System.currentTimeMillis() - this.LJFF), true, mapLIZIZ);
                    this.LJ.LJIILJJIL.LJ(c0kpg);
                    C0KO7 c0ko7 = this.LJI.LIZ;
                    if (c0ko7 != null) {
                        c0ko7.LIZIZ(this.LJ.LJIILL);
                        return;
                    }
                    return;
                }
                Map mapLIZIZ2 = C0KSH.LIZIZ(this.LJ);
                C0KP3 c0kp33 = this.LJ;
                mapLIZIZ2.put("contract_id", c0kp33.LJIILL);
                mapLIZIZ2.put("order_id", c0kp33.LJIILL);
                C0KQW c0kqw = c0kpg.LIZLLL;
                mapLIZIZ2.put("error_code", String.valueOf(c0kpg.LIZ.getValue()));
                String str9 = "";
                if (c0kqw == null || (enumC1792020wjY2 = c0kqw.LIZ) == null || (string = Integer.valueOf(enumC1792020wjY2.getValue()).toString()) == null) {
                    string = "";
                }
                mapLIZIZ2.put("detail_error_code", string);
                if (c0kqw == null || (str2 = c0kqw.LIZIZ) == null) {
                    str2 = "";
                }
                mapLIZIZ2.put("detail_error_msg", str2);
                C0KSH.LJI((int) (System.currentTimeMillis() - this.LJFF), false, mapLIZIZ2);
                C516010KLn c516010KLn = C516010KLn.LIZ;
                Boolean boolValueOf = Boolean.valueOf(this.LIZ.LIZ());
                String str10 = this.LIZIZ.LIZ;
                long jCurrentTimeMillis4 = System.currentTimeMillis() - this.LIZIZ.LIZIZ;
                int value2 = c0kpg.LIZ.getValue();
                C0KQW c0kqw2 = c0kpg.LIZLLL;
                if (c0kqw2 != null && (enumC1792020wjY = c0kqw2.LIZ) != null) {
                    value = enumC1792020wjY.getValue();
                } else {
                    value = 0;
                }
                C0KQW c0kqw3 = c0kpg.LIZLLL;
                if (c0kqw3 != null && (str3 = c0kqw3.LIZIZ) != null) {
                    str9 = str3;
                }
                C0KNX c0knx3 = this.LIZ;
                String str11 = c0knx3.LIZLLL;
                String str12 = c0knx3.LIZIZ;
                Map<String, String> map2 = this.LIZLLL;
                C0KM7 c0km7LIZIZ2 = C0KP1.LIZIZ();
                C0KNX c0knx4 = this.LIZ;
                C0KN4 c0kn43 = c0knx4.LIZ;
                if (c0kn43 != null) {
                    i = c0kn43.LLIZLLLIL;
                } else {
                    i = 0;
                }
                c516010KLn.getClass();
                C516010KLn.LJII(boolValueOf, str10, jCurrentTimeMillis4, value2, value, "", str9, str11, str12, map2, c0km7LIZIZ2, i, c0knx4);
                C0KN4 c0kn44 = this.LIZ.LIZ;
                if (c0kn44 != null) {
                    c0kn44.LIZJ();
                }
                this.LJ.LJIILJJIL.LIZ(c0kpg);
                C0KO7 c0ko72 = this.LJI.LIZ;
                if (c0ko72 == null) {
                    return;
                }
                c0ko72.LIZ();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LJ, c0kp2);
                this.LJFF = jCurrentTimeMillis;
                this.LJI = c516910KOz;
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS251S0300000_7 awS251S0300000_7) {
        if (C924790aAn.LIZLLL().LJFF()) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841276));
        } else {
            C19EG c19egLJIJJLI = C520010KaN.LJIJJLI((Context) awS251S0300000_7.l0, true);
            if (c19egLJIJJLI != null) {
                C482120IvS c482120IvS = (C482120IvS) awS251S0300000_7.l1;
                EnterRoomConfig enterRoomConfig = (EnterRoomConfig) awS251S0300000_7.l2;
                c482120IvS.getClass();
                C482120IvS.LJ(c19egLJIJJLI, enterRoomConfig);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS251S0300000_7 awS251S0300000_7) {
        int i = ((Bundle) awS251S0300000_7.l0).getInt("open_sub_only_setting");
        if (((Bundle) awS251S0300000_7.l0).getInt("open_sub_setting") == 1) {
            IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
            if (iHostSubscription != null) {
                C493580JXg c493580JXg = (C493580JXg) awS251S0300000_7.l1;
                iHostSubscription.EB0(c493580JXg.LIZ, i, c493580JXg.LJI);
            }
        } else {
            C493580JXg c493580JXg2 = (C493580JXg) awS251S0300000_7.l1;
            c493580JXg2.LIZJ.LIZIZ((Context) awS251S0300000_7.l2, c493580JXg2.LIZLLL.getAnchor_go_live_popup(), ((C493580JXg) awS251S0300000_7.l1).LJI, "live_take_page", "", "page");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS251S0300000_7 awS251S0300000_7) {
        DataChannel dataChannel = ((TreasureBoxViewModel) awS251S0300000_7.l0).getDataChannel();
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            ((TreasureBoxViewModel) awS251S0300000_7.l0).vQ2(false);
        }
        ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LJFF(((C517840KSo) awS251S0300000_7.l1).LIZ.get(), (C0KPG) awS251S0300000_7.l2, "80XR2DK73101", null);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS251S0300000_7 awS251S0300000_7) {
        ((C0KLA) awS251S0300000_7.l0).LJIIJ.LJFF((HashMap) awS251S0300000_7.l1, ((C515900KLc) awS251S0300000_7.l2).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS251S0300000_7 awS251S0300000_7) {
        ((C0KLA) awS251S0300000_7.l0).LJIIJ.LJFF((HashMap) awS251S0300000_7.l1, (C0KCK) awS251S0300000_7.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS251S0300000_7 awS251S0300000_7) {
        if (((SuperFanJoinFragment) awS251S0300000_7.l0).isAdded()) {
            SuperFanJoinFragment superFanJoinFragment = (SuperFanJoinFragment) awS251S0300000_7.l0;
            superFanJoinFragment.LLJ = false;
            AwS551S0100000_7 awS551S0100000_7 = superFanJoinFragment.LLJI;
            if (awS551S0100000_7 != null) {
                awS551S0100000_7.invoke();
            }
            superFanJoinFragment.LLJI = null;
            C500260Jjc.LJIILIIL((View) awS251S0300000_7.l1);
            C500260Jjc.LLFFF((View) awS251S0300000_7.l2);
            C0KSH.LJIIIIZZ(C475510Ikn.LJ((SuperFanJoinFragment) awS251S0300000_7.l0), ((SuperFanJoinFragment) awS251S0300000_7.l0).LL, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS251S0300000_7 awS251S0300000_7) {
        C0JHC c0jhcZQ2;
        ((Function0) awS251S0300000_7.l0).invoke();
        PcsCourseManageVM pcsCourseManageVM = ((C0JH3) awS251S0300000_7.l1).LLILLL;
        if (pcsCourseManageVM != null) {
            c0jhcZQ2 = pcsCourseManageVM.zQ2();
        } else {
            c0jhcZQ2 = null;
        }
        C489110JGb.LJIIJJI(c0jhcZQ2, (InterfaceC489200JGk) awS251S0300000_7.l2, "confirm_peel", "click");
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS251S0300000_7 awS251S0300000_7) {
        C0JHC c0jhcZQ2;
        ((Function0) awS251S0300000_7.l0).invoke();
        PcsCourseManageVM pcsCourseManageVM = ((C0JH3) awS251S0300000_7.l1).LLILLL;
        if (pcsCourseManageVM != null) {
            c0jhcZQ2 = pcsCourseManageVM.zQ2();
        } else {
            c0jhcZQ2 = null;
        }
        C489110JGb.LJIIJJI(c0jhcZQ2, (InterfaceC489200JGk) awS251S0300000_7.l2, "retry", "click");
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AwS251S0300000_7 awS251S0300000_7) {
        List<SuperFanPrivilegeInfo> list;
        String strLIZ;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        View viewFindViewById7;
        View viewFindViewById8;
        SuperFanPrivilege superFanPrivilege;
        SuperFansGoalJoinDialog superFansGoalJoinDialog = (SuperFansGoalJoinDialog) awS251S0300000_7.l0;
        superFansGoalJoinDialog.getClass();
        if (superFansGoalJoinDialog.isAdded()) {
            View view = ((SuperFansGoalJoinDialog) awS251S0300000_7.l0).getView();
            GetNonFansUserDataResponse.Data data = (GetNonFansUserDataResponse.Data) ((C0KSY) awS251S0300000_7.l1).LIZ;
            String strLIZIZ = null;
            if (data != null && (superFanPrivilege = data.superFanPrivilegeInfo) != null) {
                list = superFanPrivilege.privilegeDetails;
            } else {
                list = null;
            }
            if (list != null) {
                Pair[] pairArr = new Pair[4];
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.a5e);
                    viewFindViewById2 = view.findViewById(R.id.a5f);
                } else {
                    viewFindViewById = null;
                    viewFindViewById2 = null;
                }
                pairArr[0] = new Pair(viewFindViewById, viewFindViewById2);
                if (view != null) {
                    viewFindViewById3 = view.findViewById(R.id.bq2);
                    viewFindViewById4 = view.findViewById(R.id.bq3);
                } else {
                    viewFindViewById3 = null;
                    viewFindViewById4 = null;
                }
                pairArr[1] = new Pair(viewFindViewById3, viewFindViewById4);
                if (view != null) {
                    viewFindViewById5 = view.findViewById(R.id.vrs);
                    viewFindViewById6 = view.findViewById(R.id.vrt);
                } else {
                    viewFindViewById5 = null;
                    viewFindViewById6 = null;
                }
                pairArr[2] = new Pair(viewFindViewById5, viewFindViewById6);
                if (view != null) {
                    viewFindViewById7 = view.findViewById(R.id.mme);
                    viewFindViewById8 = view.findViewById(R.id.mmf);
                } else {
                    viewFindViewById7 = null;
                    viewFindViewById8 = null;
                }
                pairArr[3] = new Pair(viewFindViewById7, viewFindViewById8);
                int i = 0;
                for (Object obj : C1697810uHb.LJIIJJI(pairArr)) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Pair pair = (Pair) obj;
                        if (i < list.size()) {
                            SuperFanPrivilegeInfo superFanPrivilegeInfo = (SuperFanPrivilegeInfo) ListProtector.get(list, i);
                            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(superFanPrivilegeInfo.icon);
                            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                            c1324610kZfLJIIIZ.LJJI((View) pair.getFirst());
                            TextView textView = (TextView) pair.getSecond();
                            if (textView != null) {
                                textView.setText(superFanPrivilegeInfo.title);
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            SuperFansGoalJoinDialog superFansGoalJoinDialog2 = (SuperFansGoalJoinDialog) awS251S0300000_7.l0;
            C0KS8 c0ks8 = (C0KS8) awS251S0300000_7.l2;
            C16F5 c16f5 = superFansGoalJoinDialog2.LLLFFI;
            if (c16f5 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(C497740JfY.LJIJI(2131856589));
                sbLIZ.append(']');
                C517700KSa.LIZLLL(c16f5, C497740JfY.LJIJJ(2131856588, C2188811AlT.LIZIZ(sbLIZ)), 62, C20736316Cj.LIZIZ(R.attr.ey7, superFansGoalJoinDialog2.getContext()), new AwS551S0100000_7(superFansGoalJoinDialog2, 692));
            }
            if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2()) {
                C16FS c16fs = superFansGoalJoinDialog2.LLLFF;
                if (c16fs != null) {
                    c16fs.setBackgroundTintList(ColorStateList.valueOf(ColorProtector.parseColor("#B47827")));
                }
                C16FS c16fs2 = superFansGoalJoinDialog2.LLLFF;
                if (c16fs2 != null) {
                    c16fs2.setText(C497740JfY.LJIJI(2131856591));
                }
                C16FS c16fs3 = superFansGoalJoinDialog2.LLLFF;
                if (c16fs3 != null) {
                    C786410Ut5.h8(c16fs3, new ACListenerS142S0100000_7(superFansGoalJoinDialog2, 240));
                }
                C518180KTw.LJJIL(superFansGoalJoinDialog2.LLL, superFansGoalJoinDialog2.LLJLLL, null);
            } else {
                C0KSW c0ksw = c0ks8.LIZIZ;
                if (c0ksw != null) {
                    strLIZ = c0ksw.LIZ();
                } else {
                    strLIZ = null;
                }
                C0KSW c0ksw2 = c0ks8.LIZIZ;
                if (c0ksw2 != null) {
                    strLIZIZ = c0ksw2.LIZIZ();
                }
                boolean z = !Intrinsics.LJFF(strLIZ, strLIZIZ);
                C16FS c16fs4 = superFansGoalJoinDialog2.LLLFF;
                if (c16fs4 != null) {
                    c16fs4.setBackgroundTintList(ColorStateList.valueOf(ColorProtector.parseColor("#B47827")));
                }
                C16FS c16fs5 = superFansGoalJoinDialog2.LLLFF;
                if (c16fs5 != null) {
                    c16fs5.setText(C517700KSa.LIZIZ(superFansGoalJoinDialog2.getContext(), c0ks8));
                }
                C16FS c16fs6 = superFansGoalJoinDialog2.LLLFF;
                if (c16fs6 != null) {
                    C786410Ut5.h8(c16fs6, new ACListenerS71S0110000_7(superFansGoalJoinDialog2, z, 2));
                }
                C518180KTw.LJJIL(superFansGoalJoinDialog2.LLL, superFansGoalJoinDialog2.LLJLLL, Boolean.valueOf(z));
            }
            SuperFansGoalJoinDialog superFansGoalJoinDialog3 = (SuperFansGoalJoinDialog) awS251S0300000_7.l0;
            superFansGoalJoinDialog3.LLLII = true;
            superFansGoalJoinDialog3.yS();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS251S0300000_7 awS251S0300000_7) {
        ((C484980J0e) awS251S0300000_7.l0).LJIIJ((C471830Ier) awS251S0300000_7.l1, (AbstractC470790IdB) awS251S0300000_7.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS251S0300000_7 awS251S0300000_7) {
        ((C484980J0e) awS251S0300000_7.l0).LJIIL((C485050J0l) awS251S0300000_7.l1, (AbstractC470800IdC) awS251S0300000_7.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS251S0300000_7 awS251S0300000_7) {
        C19EG c19egLJIJJLI = C520010KaN.LJIJJLI((Context) awS251S0300000_7.l0, true);
        if (c19egLJIJJLI != null) {
            C482120IvS c482120IvS = (C482120IvS) awS251S0300000_7.l1;
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) awS251S0300000_7.l2;
            c482120IvS.getClass();
            C482120IvS.LJ(c19egLJIJJLI, enterRoomConfig);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS251S0300000_7 awS251S0300000_7) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(((C1605720rt4) awS251S0300000_7.l0).LIZIZ().size(), "live_data_status_size_after");
        c2344009Gk.LIZJ(((Set) awS251S0300000_7.l1).size(), "live_data_status_size_cleaned");
        c2344009Gk.LIZJ(((C1605720rt4) awS251S0300000_7.l0).LIZJ().size(), "user_status_size_after");
        c2344009Gk.LIZJ(((C118300cf) awS251S0300000_7.l2).element, "user_status_size_cleaned");
        c2344009Gk.LJIIIIZZ("clean_source", "lifecycle_owner_destroy");
        C20684815ws.LJIILLIIL("story_status_cache_clear", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS251S0300000_7 r15) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS251S0300000_7.invoke$21(kotlin.jvm.internal.AwS251S0300000_7):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AwS251S0300000_7 awS251S0300000_7) {
        LifecycleOwner lifecycleOwner;
        DataChannel dataChannel = (DataChannel) awS251S0300000_7.l0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_start_popup_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannelLJ = C475510Ikn.LJ((Fragment) awS251S0300000_7.l1);
        c0jfn.getClass();
        C0JFN.LJIIJ(dataChannelLJ, "QA", "draw_guess_start", true);
        C782110Um9 c782110Um9 = new C782110Um9(((Fragment) awS251S0300000_7.l1).getContext());
        c782110Um9.LIZIZ = (Fragment) awS251S0300000_7.l1;
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        DataChannel dataChannel2 = (DataChannel) awS251S0300000_7.l0;
        if (dataChannel2 != null) {
            lifecycleOwner = dataChannel2.LLILZ;
        } else {
            lifecycleOwner = null;
        }
        c782110Um9.LIZIZ = lifecycleOwner;
        c782110Um9.LJIIZILJ(2131841423);
        c782110Um9.LJII(2131841416);
        c782110Um9.LJIIJ(2131841414, new AcS352S0200000_7((DataChannel) awS251S0300000_7.l0, (Function1) awS251S0300000_7.l2, 2));
        c782110Um9.LJIILIIL(2131841413, new AcS352S0200000_7((DataChannel) awS251S0300000_7.l0, (Function1) awS251S0300000_7.l2, 3));
        C786410Ut5.E4(c782110Um9.LIZ());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AwS251S0300000_7 awS251S0300000_7) {
        LifecycleOwner lifecycleOwner;
        if (((IInteractService) awS251S0300000_7.l0).LJII() > 4) {
            ((Function1) awS251S0300000_7.l1).invoke(Boolean.FALSE);
            C0JFN c0jfn = C0JFN.LIZ;
            DataChannel dataChannelLJ = C475510Ikn.LJ((Fragment) awS251S0300000_7.l2);
            c0jfn.getClass();
            C0JFN.LJIIJ(dataChannelLJ, "guest_connection_gird", "draw_guess_start", false);
            C766270U4b.LIZLLL(2131841417);
        } else {
            C0JFN c0jfn2 = C0JFN.LIZ;
            DataChannel dataChannelLJ2 = C475510Ikn.LJ((Fragment) awS251S0300000_7.l2);
            c0jfn2.getClass();
            C0JFN.LJIIJ(dataChannelLJ2, "guest_connection_gird", "draw_guess_start", true);
            Context context = ((Fragment) awS251S0300000_7.l2).getContext();
            if (context == null) {
                ((Function1) awS251S0300000_7.l1).invoke(Boolean.FALSE);
            } else {
                C782110Um9 c782110Um9 = new C782110Um9(context);
                c782110Um9.LJIIZILJ(2131841423);
                c782110Um9.LJII(2131841418);
                DataChannel dataChannelLJ3 = C475510Ikn.LJ((Fragment) awS251S0300000_7.l2);
                if (dataChannelLJ3 != null) {
                    lifecycleOwner = dataChannelLJ3.LLILZ;
                } else {
                    lifecycleOwner = null;
                }
                c782110Um9.LIZIZ = lifecycleOwner;
                c782110Um9.LJIIJ(2131841419, new AcS352S0200000_7((Fragment) awS251S0300000_7.l2, (Function1) awS251S0300000_7.l1, 5));
                final IInteractService iInteractService = (IInteractService) awS251S0300000_7.l0;
                final Function1 function1 = (Function1) awS251S0300000_7.l1;
                final Fragment fragment = (Fragment) awS251S0300000_7.l2;
                c782110Um9.LJIILIIL(2131841420, new InterfaceC743640TFa() { // from class: X.0Imq
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        EnumC918990a1R enumC918990a1R;
                        if (iInteractService.LJII() > 4) {
                            function1.invoke(Boolean.FALSE);
                            C766270U4b.LIZLLL(2131841417);
                        } else {
                            DataChannel dataChannelLJ4 = C475510Ikn.LJ(fragment);
                            if (dataChannelLJ4 != null) {
                                if (iInteractService.ib2()) {
                                    enumC918990a1R = EnumC918990a1R.FLOAT_FIX;
                                } else {
                                    enumC918990a1R = EnumC918990a1R.FLOAT;
                                }
                                dataChannelLJ4.LC0(OuterMultiGuestLayoutChangeEvent.class, new C476790Imr(enumC918990a1R, new RunnableC514801zW(function1, 200)));
                            }
                        }
                        C0JFN c0jfn3 = C0JFN.LIZ;
                        DataChannel dataChannelLJ5 = C475510Ikn.LJ(fragment);
                        c0jfn3.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_pictionary_change_popup_click");
                        c474500IjALIZ.LJIJJLI(dataChannelLJ5);
                        c474500IjALIZ.LJJII("ok", "click_type");
                        c474500IjALIZ.LIZ();
                        liveDialog.dismiss();
                    }
                });
                c782110Um9.LJIILLIIL = false;
                c782110Um9.LJIILL = false;
                C786410Ut5.E4(c782110Um9.LIZ());
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_pictionary_change_popup_show");
                c474500IjALIZ.LJIJJLI(C475510Ikn.LJ((Fragment) awS251S0300000_7.l2));
                c474500IjALIZ.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AwS251S0300000_7 awS251S0300000_7) {
        LifecycleOwner lifecycleOwner;
        DataChannel dataChannel = (DataChannel) awS251S0300000_7.l0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_start_popup_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannel2 = (DataChannel) awS251S0300000_7.l0;
        c0jfn.getClass();
        C0JFN.LJIIJ(dataChannel2, "poll", "draw_guess_start", true);
        C782110Um9 c782110Um9 = new C782110Um9(((Fragment) awS251S0300000_7.l1).getContext());
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        DataChannel dataChannel3 = (DataChannel) awS251S0300000_7.l0;
        if (dataChannel3 != null) {
            lifecycleOwner = dataChannel3.LLILZ;
        } else {
            lifecycleOwner = null;
        }
        c782110Um9.LIZIZ = lifecycleOwner;
        c782110Um9.LJIIZILJ(2131841423);
        c782110Um9.LJII(2131841415);
        c782110Um9.LJIIJ(2131841414, new AcS352S0200000_7((DataChannel) awS251S0300000_7.l0, (Function1) awS251S0300000_7.l2, 6));
        c782110Um9.LJIILIIL(2131841413, new AcS352S0200000_7((DataChannel) awS251S0300000_7.l0, (Function1) awS251S0300000_7.l2, 7));
        C786410Ut5.E4(c782110Um9.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS251S0300000_7 awS251S0300000_7) {
        RoomAuthStatus roomAuthStatus;
        Room room = (Room) awS251S0300000_7.l0;
        boolean z = true;
        if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableStickerDonation() || (C781520UlC.LJIIJJI((LiveMode) awS251S0300000_7.l1) && C500260Jjc.LJJJIL((DataChannel) awS251S0300000_7.l2))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS251S0300000_7 awS251S0300000_7) {
        ((C259800zU) awS251S0300000_7.l0).element = "home_page";
        ((BasePreviewSettingMainFragmentSheet) awS251S0300000_7.l1).LLLLLZL.LIZIZ((Context) awS251S0300000_7.l2, SubscribeInvitationLynxUrlSetting.INSTANCE.getHome_page(), "invitation_letter", "live_take_page", "", "page");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS251S0300000_7 awS251S0300000_7) {
        if (((TreasureBoxDialog) awS251S0300000_7.l0).isAdded()) {
            C500260Jjc.LJIILIIL((View) awS251S0300000_7.l1);
            C500260Jjc.LLFFF((View) awS251S0300000_7.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS251S0300000_7 awS251S0300000_7) {
        RechargeCustomError rechargeCustomError = (RechargeCustomError) awS251S0300000_7.l0;
        if (rechargeCustomError != null) {
            int i = rechargeCustomError.errCode;
            Gson gson = C19748512Ol.LIZJ;
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().mO0(((C517840KSo) awS251S0300000_7.l1).LIZ.get(), (CustomErrorExtra) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, rechargeCustomError), CustomErrorExtra.class), i, Boolean.TRUE);
        } else {
            C0KSC c0ksc = C0KSC.LIZ;
            Activity activity = ((C517840KSo) awS251S0300000_7.l1).LIZ.get();
            Throwable th = (Throwable) awS251S0300000_7.l2;
            c0ksc.getClass();
            C176600m4.LIZJ(new AwS408S0200000_7(activity, th, 37));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS251S0300000_7 awS251S0300000_7) {
        ((Function2) awS251S0300000_7.l0).invoke((C03H5) awS251S0300000_7.l1, (InterfaceC0148002o) awS251S0300000_7.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS251S0300000_7 awS251S0300000_7) {
        C0J54.LIZIZ((Context) awS251S0300000_7.l0);
        C475360IkY c475360IkY = C475360IkY.LIZ;
        Context context = (Context) awS251S0300000_7.l0;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) awS251S0300000_7.l1;
        c475360IkY.getClass();
        C475360IkY.LIZ(context, enterRoomConfig);
        ((Function0) awS251S0300000_7.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS251S0300000_7 awS251S0300000_7) {
        LiveHostWatch liveHostWatch = (LiveHostWatch) awS251S0300000_7.l0;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) awS251S0300000_7.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("without_wifi_");
        sbLIZ.append(((EnterRoomConfig) awS251S0300000_7.l1).mLogData.openFromSchema);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        liveHostWatch.getClass();
        LiveHostWatch.LIZIZ(enterRoomConfig, strLIZIZ);
        ((Function0) awS251S0300000_7.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS251S0300000_7 awS251S0300000_7) {
        ((List) awS251S0300000_7.l0).remove((InterfaceC489200JGk) awS251S0300000_7.l1);
        PcsCourseManageVM pcsCourseManageVM = (PcsCourseManageVM) awS251S0300000_7.l2;
        List list = (List) awS251S0300000_7.l0;
        pcsCourseManageVM.getClass();
        pcsCourseManageVM.setState(new AwS586S0100000_7(list, (List<GameDrawerCategory>) 440));
        ((PcsCourseManageVM) awS251S0300000_7.l2).FQ2(true);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS251S0300000_7(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 21 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS251S0300000_7.<init>(androidx.fragment.app.Fragment, com.bytedance.ies.sdk.datachannel.DataChannel, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(C259800zU c259800zU, C259800zU<String> c259800zU2, BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet, Context context) {
        super(0);
        this.$t = context;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = basePreviewSettingMainFragmentSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(C484980J0e c484980J0e, C484980J0e c484980J0e2, C471830Ier<Integer> c471830Ier, AbstractC470790IdB<Integer, Object> abstractC470790IdB) {
        super(0);
        this.$t = abstractC470790IdB;
        this.l0 = c484980J0e;
        this.l1 = c484980J0e2;
        this.l2 = c471830Ier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(C484980J0e c484980J0e, C484980J0e c484980J0e2, C485050J0l<Integer> c485050J0l, AbstractC470800IdC<Integer, Object> abstractC470800IdC) {
        super(0);
        this.$t = abstractC470800IdC;
        this.l0 = c484980J0e;
        this.l1 = c484980J0e2;
        this.l2 = c485050J0l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(C0KLA c0kla, C0KLA c0kla2, HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> map, C0KCK c0kck) {
        super(0);
        this.$t = c0kck;
        this.l0 = c0kla;
        this.l1 = c0kla2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(C0KLA c0kla, C0KLA c0kla2, HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> map, C515900KLc c515900KLc) {
        super(0);
        this.$t = c515900KLc;
        this.l0 = c0kla;
        this.l1 = c0kla2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(C516910KOz c516910KOz, C0KP3 c0kp3, C1789970wgF c1789970wgF, int i) {
        super(0);
        this.$t = i;
        this.l0 = c516910KOz;
        this.l1 = c0kp3;
        this.l2 = c1789970wgF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(C1605720rt4 c1605720rt4, C1605720rt4 c1605720rt42, Set<String> set, C118300cf c118300cf) {
        super(0);
        this.$t = c118300cf;
        this.l0 = c1605720rt4;
        this.l1 = c1605720rt42;
        this.l2 = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(Context context, C482120IvS c482120IvS, EnterRoomConfig enterRoomConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c482120IvS;
        this.l2 = enterRoomConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(Context context, Context context2, EnterRoomConfig enterRoomConfig, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = enterRoomConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(Bundle bundle, C493580JXg c493580JXg, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = bundle;
        this.l1 = c493580JXg;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(View view, View view2, TreasureBoxDialog treasureBoxDialog, int i) {
        super(0);
        this.$t = i;
        this.l0 = treasureBoxDialog;
        this.l1 = view;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(IInteractService iInteractService, IInteractService iInteractService2, Function1<? super Boolean, Unit> function1, Fragment fragment) {
        super(0);
        this.$t = fragment;
        this.l0 = iInteractService;
        this.l1 = iInteractService2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(SuperFansGoalJoinDialog superFansGoalJoinDialog, SuperFansGoalJoinDialog superFansGoalJoinDialog2, C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
        super(0);
        this.$t = c0ks8;
        this.l0 = superFansGoalJoinDialog;
        this.l1 = superFansGoalJoinDialog2;
        this.l2 = c0ksy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(TreasureBoxViewModel treasureBoxViewModel, C517840KSo c517840KSo, C0KPG c0kpg, int i) {
        super(0);
        this.$t = i;
        this.l0 = treasureBoxViewModel;
        this.l1 = c517840KSo;
        this.l2 = c0kpg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(SuperFanJoinFragment superFanJoinFragment, View view, View view2, int i) {
        super(0);
        this.$t = i;
        this.l0 = superFanJoinFragment;
        this.l1 = view;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(LiveMode liveMode, Room room, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = room;
        this.l1 = liveMode;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(LiveHostWatch liveHostWatch, LiveHostWatch liveHostWatch2, EnterRoomConfig enterRoomConfig, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = liveHostWatch;
        this.l1 = liveHostWatch2;
        this.l2 = enterRoomConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(List list, List<InterfaceC489200JGk> list2, InterfaceC489200JGk interfaceC489200JGk, PcsCourseManageVM pcsCourseManageVM) {
        super(0);
        this.$t = pcsCourseManageVM;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = interfaceC489200JGk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS251S0300000_7(Function2 function2, Function2<C03H5, InterfaceC0148002o, Unit> function22, C03H5 c03h5, InterfaceC0148002o interfaceC0148002o) {
        super(0);
        this.$t = interfaceC0148002o;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = c03h5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(AwS408S0200000_7 awS408S0200000_7, C0JH3 c0jh3, InterfaceC489200JGk interfaceC489200JGk, int i) {
        super(0);
        this.$t = i;
        this.l0 = awS408S0200000_7;
        this.l1 = c0jh3;
        this.l2 = interfaceC489200JGk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(AwS551S0100000_7 awS551S0100000_7, C0JH3 c0jh3, InterfaceC489200JGk interfaceC489200JGk, int i) {
        super(0);
        this.$t = i;
        this.l0 = awS551S0100000_7;
        this.l1 = c0jh3;
        this.l2 = interfaceC489200JGk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS251S0300000_7(RechargeCustomError rechargeCustomError, C517840KSo c517840KSo, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = rechargeCustomError;
        this.l1 = c517840KSo;
        this.l2 = th;
    }
}
