package kotlin.jvm.internal;

import X.C09AY;
import X.C0ET4;
import X.C0XQ7;
import X.C113E;
import X.C11X4;
import X.C122P;
import X.C12TM;
import X.C1397620mTQ;
import X.C19515711Wx;
import X.C19553411em;
import X.C19553611eo;
import X.C19566411gs;
import X.C19571011hc;
import X.C19659311vr;
import X.C19659511vt;
import X.C19723012Eq;
import X.C19760712Td;
import X.C19A3;
import X.C1DRG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C559610Lx9;
import X.EnumC1461710o8n;
import X.EnumC19515811Wy;
import X.EnumC19554111et;
import X.InterfaceC19515911Wz;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.model.EffectCreatorCenterConfig;
import com.ss.android.ugc.profile.business.effect.EffectCreatorCenterFloatingNoticeConfig;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS110S0201000_29 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS110S0201000_29 awS110S0201000_29, Object obj) {
        ((Boolean) obj).booleanValue();
        ((C19659311vr) awS110S0201000_29.l0).getEditModel().creativeModel.onThisDayData.getLoadedIndexList().add(Integer.valueOf(awS110S0201000_29.i2));
        List<TextStickerData> listLIZIZ = ((C19659511vt) awS110S0201000_29.l1).LIZIZ();
        C19659311vr c19659311vr = (C19659311vr) awS110S0201000_29.l0;
        for (TextStickerData textStickerData : (ArrayList) listLIZIZ) {
            C122P c122p = c19659311vr.LLJJL;
            if (c122p == null) {
                c122p = null;
            }
            c122p.LIZIZ(textStickerData, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS110S0201000_29 awS110S0201000_29, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(awS110S0201000_29.i2, new AwS395S0200000_29((C19760712Td) awS110S0201000_29.l0, (EnumC1461710o8n) awS110S0201000_29.l1, 22));
        c1397620mTQ.LJII(2131833383, new AwS395S0200000_29((C19760712Td) awS110S0201000_29.l0, (EnumC1461710o8n) awS110S0201000_29.l1, 23));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS110S0201000_29 awS110S0201000_29, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(awS110S0201000_29.i2, new AwS395S0200000_29((C12TM) awS110S0201000_29.l0, (EnumC1461710o8n) awS110S0201000_29.l1, 28));
        c1397620mTQ.LJII(2131833383, new AwS395S0200000_29((C12TM) awS110S0201000_29.l0, (EnumC1461710o8n) awS110S0201000_29.l1, 29));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS110S0201000_29 awS110S0201000_29, Object obj) {
        return C19553411em.LIZ((C19553411em) obj, null, null, new C19553611eo((Pair) awS110S0201000_29.l0, (EnumC19554111et) awS110S0201000_29.l1, awS110S0201000_29.i2), 3);
    }

    public static final Object invoke$4(AwS110S0201000_29 awS110S0201000_29, Object obj) {
        return C19723012Eq.LIZ((C19723012Eq) obj, null, true, (Bitmap) awS110S0201000_29.l0, awS110S0201000_29.i2, 0, false, false, (C19571011hc) awS110S0201000_29.l1, 17);
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS110S0201000_29 awS110S0201000_29, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C19566411gs c19566411gs = new C19566411gs((C1DRG) obj, (C19A3) awS110S0201000_29.l1, awS110S0201000_29.i2);
        ((C559610Lx9) awS110S0201000_29.l0).getClass();
        C559610Lx9.LIZ(c19566411gs);
        c19566411gs.afterInit$als_release(jUptimeMillis);
        return c19566411gs;
    }

    public static final Object invoke$6(AwS110S0201000_29 awS110S0201000_29, Object obj) {
        EffectProfileListViewModel effectProfileListViewModel;
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FloatingNotice dismiss, method: ");
        sbLIZ.append(iIntValue);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LevelBanner", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC19515911Wz interfaceC19515911Wz = ((C11X4) awS110S0201000_29.l0).LIZLLL;
        if (interfaceC19515911Wz != null) {
            EnumC19515811Wy.BADGE.getBannerType();
            interfaceC19515911Wz.onDismiss();
        }
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        C19515711Wx c19515711Wx = C19515711Wx.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        c19515711Wx.getClass();
                        linkedHashMap.put("enter_from", "profile_page");
                        linkedHashMap.put("position", "bottom_bar");
                        linkedHashMap.put("campaign_id", "badge");
                        C20684815ws.LJIILLIIL("effect_designer_profile_banner_link_click", linkedHashMap);
                        C20684815ws.LJIILLIIL("effect_creator_center_open", C2097908Jt.LIZJ(new Pair("enter_from", "profile_banner")));
                        C11X4 c11x4 = (C11X4) awS110S0201000_29.l0;
                        Context context = (Context) awS110S0201000_29.l1;
                        c11x4.getClass();
                        EffectCreatorCenterConfig effectCreatorCenterConfig = EffectCreatorCenterFloatingNoticeConfig.get();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(effectCreatorCenterConfig.url);
                        sbLIZ2.append(effectCreatorCenterConfig.urlFragment);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(effectCreatorCenterConfig.container);
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append(effectCreatorCenterConfig.containerParam);
                        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ3)).open();
                        EffectProfileListViewModel effectProfileListViewModel2 = ((C11X4) awS110S0201000_29.l0).LIZ;
                        if (effectProfileListViewModel2 != null) {
                            effectProfileListViewModel2.qR2(awS110S0201000_29.i2);
                        }
                    }
                } else {
                    C19515711Wx.LIZ.getClass();
                    C19515711Wx.LIZ("click");
                    EffectProfileListViewModel effectProfileListViewModel3 = ((C11X4) awS110S0201000_29.l0).LIZ;
                    if (effectProfileListViewModel3 != null) {
                        effectProfileListViewModel3.qR2(awS110S0201000_29.i2);
                    }
                }
            } else {
                C19515711Wx.LIZ.getClass();
                C19515711Wx.LIZ("swipe");
                EffectProfileListViewModel effectProfileListViewModel4 = ((C11X4) awS110S0201000_29.l0).LIZ;
                if (effectProfileListViewModel4 != null) {
                    effectProfileListViewModel4.qR2(awS110S0201000_29.i2);
                }
            }
        } else {
            C19515711Wx.LIZ.getClass();
            C19515711Wx.LIZ("auto");
            C11X4 c11x42 = (C11X4) awS110S0201000_29.l0;
            int i = awS110S0201000_29.i2;
            c11x42.getClass();
            C0XQ7.LJ();
            String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("badge_notice_");
            sbLIZ4.append(curUserId);
            sbLIZ4.append('_');
            sbLIZ4.append(i);
            int i2 = ((Keva) c11x42.LJ.getValue()).getInt(C2188811AlT.LIZIZ(sbLIZ4), 0);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("markBadgeViewedIfNeed, showCount ");
            sbLIZ5.append(i2);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LevelBanner", C2188811AlT.LIZIZ(sbLIZ5));
            if (i2 >= 3 && (effectProfileListViewModel = c11x42.LIZ) != null) {
                effectProfileListViewModel.qR2(i);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS110S0201000_29 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS110S0201000_29.invoke$7(kotlin.jvm.internal.AwS110S0201000_29, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0201000_29(int i, C12TM c12tm, EnumC1461710o8n enumC1461710o8n, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c12tm;
        this.l1 = enumC1461710o8n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0201000_29(int i, C19760712Td c19760712Td, EnumC1461710o8n enumC1461710o8n, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c19760712Td;
        this.l1 = enumC1461710o8n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0201000_29(C113E c113e, EffectModel effectModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c113e;
        this.l1 = effectModel;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0201000_29(C11X4 c11x4, int i, Context context, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c11x4;
        this.i2 = i;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0201000_29(C19659311vr c19659311vr, int i, C19659511vt c19659511vt, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c19659311vr;
        this.i2 = i;
        this.l1 = c19659511vt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0201000_29(Bitmap bitmap, int i, C19571011hc c19571011hc, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = bitmap;
        this.i2 = i;
        this.l1 = c19571011hc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS110S0201000_29(Pair pair, Pair<Integer, Integer> pair2, EnumC19554111et enumC19554111et, int i) {
        super(1);
        this.$t = i;
        this.l0 = pair;
        this.l1 = pair2;
        this.i2 = enumC19554111et;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0201000_29(C0ET4 c0et4, C559610Lx9 c559610Lx9, C19A3 c19a3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c19a3;
        this.i2 = i;
    }
}
