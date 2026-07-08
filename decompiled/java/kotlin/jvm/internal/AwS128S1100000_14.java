package kotlin.jvm.internal;

import X.AbstractC856710XjB;
import X.C09AY;
import X.C0I0B;
import X.C0YWT;
import X.C0ZBZ;
import X.C0ZO0;
import X.C0ZO5;
import X.C1224590hyL;
import X.C1225460hzk;
import X.C1227130i2R;
import X.C1232370iAt;
import X.C1390920mIc;
import X.C13LE;
import X.C1549500qQO;
import X.C1664590tQ1;
import X.C1909107dp;
import X.C2188811AlT;
import X.C362370EIp;
import X.C855900Xhs;
import X.C865210Xwt;
import X.C865530XxP;
import X.C866340Xyi;
import X.C869590Y9l;
import X.C898480ZMo;
import X.C898490ZMp;
import X.C907110ZiH;
import X.C908950ZlF;
import X.C908960ZlG;
import X.C909820Zme;
import X.EnumC1227730i3P;
import X.InterfaceC377540ErA;
import X.InterfaceC863600XuI;
import X.InterfaceC867020Xzo;
import X.InterfaceC906850Zhr;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.EditGroupInfoViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.interraction.InteractionCardReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tools.chat.message.component.AiChatMessageInfraComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS128S1100000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        ((C865530XxP) awS128S1100000_14.l1).LIZIZ.invoke(awS128S1100000_14.s0).LJLJL(awS128S1100000_14.s0, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        ((C865530XxP) awS128S1100000_14.l1).LIZIZ.invoke(awS128S1100000_14.s0).LJLIIIL((InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        C908960ZlG c908960ZlG = new C908960ZlG(((C909820Zme) awS128S1100000_14.l1).LIZIZ, awS128S1100000_14.s0);
        obj.getClass();
        return new C908950ZlF(c908960ZlG);
    }

    public static final Object invoke$11(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        String str = awS128S1100000_14.s0;
        Context context = (Context) awS128S1100000_14.l1;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZLLL = (int) (((double) C1232370iAt.LIZLLL(context)) * 0.5d);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZLLL;
        tuxSheet.LLJLL = true;
        tuxSheet.LLILLL = false;
        c1390920mIc.LJI(48);
        C1225460hzk c1225460hzk = new C1225460hzk(context, "chat_detail", "leave_group", str, c1390920mIc, false, true, false, new C1224590hyL(EnumC1227730i3P.MAIN, false, context.getString(2131835217), true, false), 0, Integer.valueOf(R.attr.a1f));
        C1227130i2R.LIZ.getClass();
        C1227130i2R.LJ(context, c1225460hzk);
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_leave_pop", new Pair[]{new Pair("result", "choose_group_owner"), new Pair("enter_from", "group_setting")}, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        Map map = (Map) obj;
        map.put("event", "cmd");
        map.put("idc_region", awS128S1100000_14.s0);
        map.put("api_url", ((C0YWT) awS128S1100000_14.l1).LJI);
        map.put("ws_url", ((C0YWT) awS128S1100000_14.l1).LJFF);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC906850Zhr.class));
        CompletionBlock completionBlock = (CompletionBlock) awS128S1100000_14.l1;
        String str = awS128S1100000_14.s0;
        AwS65S1000000_14 awS65S1000000_14 = new AwS65S1000000_14((String) obj, 15);
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC906850Zhr.class, str);
        awS65S1000000_14.invoke(xBaseResultModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success - ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        completionBlock.onSuccess(xBaseResultModel, "");
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        return ((EditGroupInfoViewModel) awS128S1100000_14.l1).wQ2(C0ZBZ.LIZ((C0ZBZ) obj, awS128S1100000_14.s0, null, false, null, null, null, false, null, false, false, null, 4093));
    }

    public static final Object invoke$15(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        return ((EditGroupInfoViewModel) awS128S1100000_14.l1).wQ2(C0ZBZ.LIZ((C0ZBZ) obj, null, null, false, null, null, null, false, awS128S1100000_14.s0, false, false, null, 3839));
    }

    public static final Object invoke$16(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        return ((EditGroupInfoViewModel) awS128S1100000_14.l1).wQ2(C0ZBZ.LIZ((C0ZBZ) obj, null, null, false, null, null, awS128S1100000_14.s0, false, null, false, false, null, 4031));
    }

    public static final Object invoke$17(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        return ((EditGroupInfoViewModel) awS128S1100000_14.l1).wQ2(C0ZBZ.LIZ((C0ZBZ) obj, null, awS128S1100000_14.s0, false, null, null, null, false, null, false, false, null, 4091));
    }

    public static final Object invoke$2(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        ((C865210Xwt) awS128S1100000_14.l1).LIZIZ.invoke(awS128S1100000_14.s0).LLD((InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        ((C866340Xyi) awS128S1100000_14.l1).LIZ.LJJ(awS128S1100000_14.s0, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        ((C866340Xyi) awS128S1100000_14.l1).LIZ.LJJLIL(awS128S1100000_14.s0, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        ((C866340Xyi) awS128S1100000_14.l1).LJJ(awS128S1100000_14.s0).LLIZLLLIL((InterfaceC867020Xzo) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        C898490ZMp c898490ZMpLIZ;
        C898480ZMo c898480ZMo = (C898480ZMo) obj;
        C898490ZMp c898490ZMp = c898480ZMo.LL;
        if (c898490ZMp != null) {
            c898490ZMpLIZ = C898490ZMp.LIZ(c898490ZMp, (C869590Y9l) awS128S1100000_14.l1, awS128S1100000_14.s0, 12);
        } else {
            c898490ZMpLIZ = null;
        }
        return C898480ZMo.LIZ(c898480ZMo, c898490ZMpLIZ, null, 2);
    }

    public static final Object invoke$7(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        DataSource dataSource = (DataSource) obj;
        if (dataSource == null) {
            ((InteractionCardReusedUISlot) awS128S1100000_14.l1).getClass();
            ((InteractionCardReusedUISlot) awS128S1100000_14.l1).LLLF.setValue(C0ZO5.LIZ);
        } else {
            InteractionCardReusedUISlot interactionCardReusedUISlot = (InteractionCardReusedUISlot) awS128S1100000_14.l1;
            interactionCardReusedUISlot.LLLF.setValue(new C0ZO0(dataSource, InteractionCardReusedUISlot.up(interactionCardReusedUISlot), awS128S1100000_14.s0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        int iLIZ;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 3) {
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        AbstractC856710XjB abstractC856710XjB = ((C907110ZiH) awS128S1100000_14.l1).LLJJJ;
                        if (abstractC856710XjB != null) {
                            iLIZ = abstractC856710XjB.LIZ();
                        } else {
                            iLIZ = -1;
                        }
                        ((C907110ZiH) awS128S1100000_14.l1).O3(!C362370EIp.LIZ(iLIZ));
                        C855900Xhs.LIZ(C1664590tQ1.LJII((C907110ZiH) awS128S1100000_14.l1), Boolean.FALSE);
                    }
                } else {
                    InterfaceC377540ErA interfaceC377540ErAT2 = ((C907110ZiH) awS128S1100000_14.l1).T2();
                    if (interfaceC377540ErAT2 != null && interfaceC377540ErAT2.isShowing()) {
                        TuxPanel tuxPanel = ((C907110ZiH) awS128S1100000_14.l1).LLJJJJ;
                        if (tuxPanel != null) {
                            tuxPanel.dismiss();
                        }
                    } else {
                        ((C907110ZiH) awS128S1100000_14.l1).Yc1();
                    }
                }
            } else {
                ((C907110ZiH) awS128S1100000_14.l1).i3().creativeModel.audioCopyrightDetectModel.setContinueSelected(true);
                Function0<Unit> function0 = ((C907110ZiH) awS128S1100000_14.l1).LLJJJJJIL;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        } else {
            ((C907110ZiH) awS128S1100000_14.l1).i3().creativeModel.audioCopyrightDetectModel.setChangeMusicFrom(awS128S1100000_14.s0);
            ((C907110ZiH) awS128S1100000_14.l1).JO();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS128S1100000_14 awS128S1100000_14, Object obj) {
        ((Number) obj).intValue();
        ((AiChatMessageInfraComponent) awS128S1100000_14.l1).T4(awS128S1100000_14.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(C865210Xwt c865210Xwt, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c865210Xwt;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(C865530XxP c865530XxP, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c865530XxP;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(C866340Xyi c866340Xyi, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c866340Xyi;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(C869590Y9l c869590Y9l, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c869590Y9l;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(C907110ZiH c907110ZiH, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c907110ZiH;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS128S1100000_14(CompletionBlock completionBlock, CompletionBlock<InterfaceC906850Zhr> completionBlock2, String str) {
        super(1);
        this.$t = str;
        this.l1 = completionBlock;
        this.s0 = completionBlock2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(EditGroupInfoViewModel editGroupInfoViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = editGroupInfoViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(InteractionCardReusedUISlot interactionCardReusedUISlot, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interactionCardReusedUISlot;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(AiChatMessageInfraComponent aiChatMessageInfraComponent, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aiChatMessageInfraComponent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(String str, C0YWT c0ywt, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0ywt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(String str, C909820Zme c909820Zme, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c909820Zme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S1100000_14(String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
    }
}
