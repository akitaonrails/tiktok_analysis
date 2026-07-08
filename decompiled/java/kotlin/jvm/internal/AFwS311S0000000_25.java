package kotlin.jvm.internal;

import X.C09AY;
import X.C0AQD;
import X.C0CHQ;
import X.C0MBB;
import X.C0MXE;
import X.C11IR;
import X.C11NZ;
import X.C1206680hVS;
import X.C1244960iVC;
import X.C1296860jqu;
import X.C1296870jqv;
import X.C1383370m6R;
import X.C13D2;
import X.C13FE;
import X.C1440005kM;
import X.C1474810oTv;
import X.C1561460qjg;
import X.C1644630stp;
import X.C1644660sts;
import X.C1645880svq;
import X.C1665550tRZ;
import X.C1665740tRs;
import X.C1665750tRt;
import X.C1665790tRx;
import X.C1665900tS8;
import X.C1665930tSB;
import X.C1667200tUE;
import X.C1668040tVa;
import X.C1668060tVc;
import X.C1668690tWd;
import X.C1668930tX1;
import X.C1669050tXD;
import X.C1669430tXp;
import X.C1669660tYC;
import X.C1670400tZO;
import X.C1670810ta3;
import X.C1671550tbF;
import X.C1673210tdv;
import X.C1674370tfn;
import X.C1675670tht;
import X.C1675980tiO;
import X.C1678560tmY;
import X.C1679930tol;
import X.C1680510tph;
import X.C1682520tsw;
import X.C1682900ttY;
import X.C1684240tvi;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1687980u1k;
import X.C1688120u1y;
import X.C1688130u1z;
import X.C1691120u6o;
import X.C1693340uAO;
import X.C1693430uAX;
import X.C1693520uAg;
import X.C1693660uAu;
import X.C1693720uB0;
import X.C1693790uB7;
import X.C1693830uBB;
import X.C1696340uFE;
import X.C1696350uFF;
import X.C1696370uFH;
import X.C1696630uFh;
import X.C1697080uGQ;
import X.C1697810uHb;
import X.C1701890uOB;
import X.C19292410dm;
import X.C19484211Ku;
import X.C1954807lC;
import X.C20053713dH;
import X.C20084413iE;
import X.C20084613iG;
import X.C2015707v1;
import X.C2553409zY;
import X.C543670LTx;
import X.EnumC1254700iku;
import X.EnumC1653870t8j;
import X.EnumC1671200tag;
import X.EnumC1676720tja;
import X.EnumC1684030tvN;
import X.InterfaceC1627880sSo;
import X.InterfaceC1627890sSp;
import X.InterfaceC1637880siw;
import X.InterfaceC1638030sjB;
import X.InterfaceC1644620sto;
import X.InterfaceC1653800t8c;
import X.InterfaceC1653990t8v;
import X.InterfaceC1668050tVb;
import X.InterfaceC1676340tiy;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1690500u5o;
import X.InterfaceC1697170uGZ;
import X.InterfaceC20032213Zo;
import X.InterfaceC20036213aS;
import X.InterfaceC20053113dB;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.c;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AFwS311S0000000_25 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(87);
    public final int $t;

    public static AFwS311S0000000_25 get$arr$(int i) {
        AFwS311S0000000_25 aFwS311S0000000_25 = (AFwS311S0000000_25) arr$.get(i);
        if (aFwS311S0000000_25 != null) {
            return aFwS311S0000000_25;
        }
        arr$.compareAndSet(i, null, new AFwS311S0000000_25(i));
        return (AFwS311S0000000_25) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            case 71:
                return invoke$71(this, obj, obj2);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj, obj2);
            case 73:
                return invoke$73(this, obj, obj2);
            case 74:
                return invoke$74(this, obj, obj2);
            case 75:
                return invoke$75(this, obj, obj2);
            case 76:
                return invoke$76(this, obj, obj2);
            case 77:
                return invoke$77(this, obj, obj2);
            case 78:
                return invoke$78(this, obj, obj2);
            case 79:
                return invoke$79(this, obj, obj2);
            case 80:
                return invoke$80(this, obj, obj2);
            case 81:
                return invoke$81(this, obj, obj2);
            case 82:
                return invoke$82(this, obj, obj2);
            case 83:
                return invoke$83(this, obj, obj2);
            case 84:
                return invoke$84(this, obj, obj2);
            case 85:
                return invoke$85(this, obj, obj2);
            case 86:
                return invoke$86(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS311S0000000_25(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        boolean z;
        if (obj == obj2 && obj2 == EnumC1676720tja.PostExit) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((InterfaceC1697170uGZ) obj).LJIIZILJ((Matrix) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((InterfaceC1676340tiy) obj).LJJIIZ(((Number) obj2).intValue()));
    }

    public static final Object invoke$11(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((InterfaceC1676340tiy) obj).LJJIL(((Number) obj2).intValue()));
    }

    public static final Object invoke$12(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((InterfaceC1676340tiy) obj).LJJIJ(((Number) obj2).intValue()));
    }

    public static final Object invoke$13(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((InterfaceC1676340tiy) obj).LJJII(((Number) obj2).intValue()));
    }

    public static final Object invoke$14(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return ((C1678560tmY) obj2).LIZ.LIZJ();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$18(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJ(c1685760tyA, 1.0f), 46);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJI);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_252);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1668690tWd.LIZIZ(0.0f, 6, 6, interfaceC1680500tpg, c.LJIILIIL(c1685760tyA, 36), false);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685190txF.LIZ(C0MBB.LIZIZ(2131834990, interfaceC1680500tpg), null, C1670400tZO.LIZIZ(interfaceC1680500tpg).B2(), C1693430uAX.LIZ(0, 0, 16769023, 0L, 0L, 0L, 0L, new C1693340uAO(3.0f, C1670400tZO.LIZIZ(interfaceC1680500tpg).w2(), (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), C1670400tZO.LJ(interfaceC1680500tpg).LJIIJ, null, null), 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2034);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1653990t8v interfaceC1653990t8v = (InterfaceC1653990t8v) obj2;
        ((InterfaceC1653800t8c) obj).t32(interfaceC1653990t8v.LJIIJJI(), interfaceC1653990t8v);
        return Unit.LIZ;
    }

    public static final /* synthetic */ Object invoke$23(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        return Unit.LIZ;
    }

    public static final /* synthetic */ Object invoke$24(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* synthetic */ Object invoke$25(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
        newFaceStickerBean.id = ((Effect) obj).getId();
        newFaceStickerBean.isFavorite = !zBooleanValue;
        C1440005kM.LIZ(new C1206680hVS(newFaceStickerBean));
        return Unit.LIZ;
    }

    public static final Object invoke$27(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
        newFaceStickerBean.id = ((Effect) obj).getId();
        newFaceStickerBean.isFavorite = !zBooleanValue;
        C1440005kM.LIZ(new C1206680hVS(newFaceStickerBean));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("duration", Long.valueOf(jLongValue));
        c543670LTx.LIZ.put("stickid", obj2);
        interfaceC1637880siwLIZJ.LJIIJJI(0, "upload_pic_sticker_loading_time", c543670LTx.LJ());
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$29(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        C20084613iG c20084613iGLIZJ = C20084413iE.LIZJ((C20053713dH) obj);
        int i = C1697080uGQ.LIZ[((EnumC1671200tag) obj2).ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
        } else {
            i2 = 0;
        }
        c20084613iGLIZJ.setLayoutDirection(i2);
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return new Pair(obj, Boolean.valueOf(((Boolean) obj2).booleanValue()));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$31(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return null;
    }

    public static final Object invoke$32(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("duration", Long.valueOf(jLongValue));
        c543670LTx.LIZ.put("stickid", obj2);
        interfaceC1637880siwLIZJ.LJIIJJI(0, "upload_pic_sticker_loading_time", c543670LTx.LJ());
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$33(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LJ, C1668040tVa.LJIIJJI, interfaceC1680500tpg, 54);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_252);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                float f = 20;
                C1668930tX1.LIZIZ(C1669660tYC.LJJIJL, "", C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, 4, 0.0f, 11), C1670400tZO.LIZIZ(interfaceC1680500tpg).F2(), f, f, false, interfaceC1680500tpg, 221616, 64);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131827102, interfaceC1680500tpg), null, C1670400tZO.LIZIZ(interfaceC1680500tpg).F2(), C1670400tZO.LJ(interfaceC1680500tpg).LJJIIJ, 0L, 3, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2002);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685190txF.LIZ(C0MBB.LIZIZ(2131827103, interfaceC1680500tpg), null, C1670400tZO.LIZIZ(interfaceC1680500tpg).B2(), C1670400tZO.LJ(interfaceC1680500tpg).LJJIIJ, 0L, 3, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2002);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return C1671550tbF.LIZJ(0.0f, 400.0f, new C1682900ttY(C1675670tht.LIZIZ()), 1);
    }

    public static final Object invoke$37(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1674370tfn.LIZ(null, interfaceC1680500tpg, 0, 1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LJFF;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_252);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                float f = 14;
                C1668930tX1.LIZIZ(C1669660tYC.LLZLLLL, null, c1685760tyA, C1670400tZO.LIZIZ(interfaceC1680500tpg).N3(), f, f, false, interfaceC1680500tpg, 221616, 64);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1665550tRZ.LIZ(0, 3, interfaceC1680500tpg, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$40(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$41(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        final C19292410dm c19292410dmLJI = C0CHQ.LIZ().getAccountService().LJI((String) obj, (String) obj2, EnumC1254700iku.STICKER_SHOOT);
        return new InterfaceC1638030sjB(c19292410dmLJI) { // from class: X.1DWb
            public final InterfaceC2257101DWa LIZ;

            @Override // X.InterfaceC1638030sjB
            public final boolean LIZ() {
                return this.LIZ.LIZ();
            }

            @Override // X.InterfaceC1638030sjB
            public final boolean LIZIZ() {
                return this.LIZ.LIZIZ();
            }

            @Override // X.InterfaceC1638030sjB
            public final int LIZJ() {
                return this.LIZ.LIZJ();
            }

            @Override // X.InterfaceC1638030sjB
            public final UrlModel getAvatarThumb() {
                return this.LIZ.getAvatarThumb();
            }

            @Override // X.InterfaceC1638030sjB
            public final int getFollowCount() {
                return this.LIZ.getFollowerCount();
            }

            @Override // X.InterfaceC1638030sjB
            public final int getFollowStatus() {
                return this.LIZ.getFollowStatus();
            }

            @Override // X.InterfaceC1638030sjB
            public final String getNickname() {
                return this.LIZ.getNickname();
            }

            @Override // X.InterfaceC1638030sjB
            public final String getSecUid() {
                return this.LIZ.getSecUid();
            }

            @Override // X.InterfaceC1638030sjB
            public final String getShortId() {
                return this.LIZ.getShortId();
            }

            @Override // X.InterfaceC1638030sjB
            public final String getUid() {
                return this.LIZ.getUid();
            }

            @Override // X.InterfaceC1638030sjB
            public final String getUniqueId() {
                return this.LIZ.getUniqueId();
            }

            @Override // X.InterfaceC1638030sjB
            public final String getCurrentUserId() {
                return C0CHQ.LIZ().getAccountService().getCurrentUserID();
            }

            {
                this.LIZ = c19292410dmLJI;
            }
        };
    }

    public static final Object invoke$43(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(InterfaceC1685750ty9.LIZ, 0.0f);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_252);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                Object objLJJ = interfaceC1680500tpg.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS214S0000000_25.get$arr$(465);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg.LJ();
                C1668060tVc.LIZJ(null, false, 0L, 0L, null, (Function0) objLJJ, interfaceC1680500tpg, 196608, 31);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(InterfaceC1685750ty9.LIZ, 0.0f);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_252);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                Object objLJJ = interfaceC1680500tpg.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS214S0000000_25.get$arr$(466);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg.LJ();
                C1668060tVc.LIZJ(null, false, 0L, 0L, null, (Function0) objLJJ, interfaceC1680500tpg, 196608, 31);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685190txF.LIZ(C0MBB.LIZIZ(2131850210, interfaceC1680500tpg), null, C1670400tZO.LIZIZ(interfaceC1680500tpg).K3(), C1670400tZO.LJ(interfaceC1680500tpg).LJIIJ, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2034);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1668050tVb.LIZ.getClass();
        return Integer.valueOf(C1668040tVa.LJIILIIL.LIZ(0, ((Number) obj).intValue(), (EnumC1671200tag) obj2));
    }

    public static final Object invoke$48(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((g) obj).LJI();
        return Unit.LIZ;
    }

    public static final Object invoke$49(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((g) obj).LJIIIZ((InterfaceC1690500u5o) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((g) obj).LJIIIIZZ((EnumC1671200tag) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$51(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((g) obj).LIZJ((InterfaceC20053113dB) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$52(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((g) obj).LJ((InterfaceC1685750ty9) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$53(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((g) obj).LJFF((InterfaceC20036213aS) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$54(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$56(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1696630uFh.LIZ(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1696630uFh.LIZ(interfaceC1680500tpg, 0);
            C1696370uFH.LIZ(interfaceC1680500tpg, 0);
            C1696350uFF.LIZ(interfaceC1680500tpg, 0);
            if (Build.VERSION.SDK_INT >= 24 && C1474810oTv.LJJJJZI() && C2015707v1.LIZ() == 1) {
                C1244960iVC.LIZ(interfaceC1680500tpg, 0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1696340uFE.LIZ(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return new C1644660sts((View) obj, (View) obj2);
    }

    public static final Object invoke$6(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((InterfaceC1676340tiy) obj).LJJIIZ(((Number) obj2).intValue()));
    }

    public static final Object invoke$60(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return new C1644630stp((Context) obj, (InterfaceC1644620sto) obj2);
    }

    public static final Object invoke$61(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return new C1645880svq((View) obj, (View) obj2);
    }

    public static final Object invoke$62(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return new C1644660sts((View) obj, (View) obj2);
    }

    public static final Object invoke$63(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return new C1644630stp((Context) obj, (InterfaceC1644620sto) obj2);
    }

    public static final Object invoke$64(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return new C1645880svq((View) obj, (View) obj2);
    }

    public static final Object invoke$65(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return new C1561460qjg(C1691120u6o.LIZ(1));
    }

    public static final Object invoke$66(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$67(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJJ = c.LJIJJ(c1685760tyA, null, 3);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, interfaceC1680500tpg, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJIJJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_252);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                float f = 13;
                C1668930tX1.LIZIZ(C1669660tYC.LLJJIJIIJIL, "follows you icon", C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, 3, 0.0f, 11), C1670400tZO.LIZIZ(interfaceC1680500tpg).N3(), f, f, false, interfaceC1680500tpg, 221616, 64);
                C1685190txF.LIZ(C1383370m6R.LJIIJ(2131834849), null, C1670400tZO.LIZIZ(interfaceC1680500tpg).N3(), C1670400tZO.LJ(interfaceC1680500tpg).LJIIZILJ, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2034);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$68(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(c1685760tyA, 16, 8);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, interfaceC1680500tpg, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJIIIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJI;
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJFF;
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, aFwS311S0000000_253);
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_254);
                }
                AFwS311S0000000_25 aFwS311S0000000_255 = g.a.LIZLLL;
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, aFwS311S0000000_255);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LJIILJJIL(c1685760tyA, 72, 96), C1670810ta3.LIZIZ(R.attr.br, interfaceC1680500tpg), C1669050tXD.LIZIZ(4));
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
                int iLIZ2 = C0MXE.LIZ(interfaceC1680500tpg);
                C13D2 c13d2LJJIFFI2 = interfaceC1680500tpg.LJJIFFI();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZIZ);
                if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                    interfaceC1680500tpg.LJJIII();
                    if (interfaceC1680500tpg.LJJIIZ()) {
                        interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                    } else {
                        interfaceC1680500tpg.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, aFwS311S0000000_252);
                    C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI2, aFwS311S0000000_253);
                    if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ2))) {
                        interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_254);
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_255);
                    float f = 24;
                    C1668930tX1.LIZIZ(C1669660tYC.LLZILL, null, null, C1670400tZO.LIZIZ(interfaceC1680500tpg).M3(), f, f, false, interfaceC1680500tpg, 221232, 68);
                    interfaceC1680500tpg.LJIIIZ();
                    C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 12), interfaceC1680500tpg);
                    C1685190txF.LIZ(C0MBB.LIZIZ(2131834399, interfaceC1680500tpg), c1687980u1k.LIZ(c1685760tyA, 1.0f, true), C1670400tZO.LIZIZ(interfaceC1680500tpg).N3(), C1670400tZO.LJ(interfaceC1680500tpg).LJIILJJIL, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2032);
                    interfaceC1680500tpg.LJIIIZ();
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$69(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return ((C11NZ) obj2).LJJLIIIJ(C11IR.LL).LJLI((C11NZ) obj);
    }

    public static final Object invoke$7(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((InterfaceC1676340tiy) obj).LJJIL(((Number) obj2).intValue()));
    }

    public static final Object invoke$70(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        C11NZ c11nz = (C11NZ) obj;
        C19484211Ku c19484211KuLJJLIIIJ = ((C11NZ) obj2).LJJLIIIJ(C11IR.LL);
        C1701890uOB.LIZ(c11nz, "other is null");
        return C11NZ.LJIILL(c19484211KuLJJLIIIJ, c11nz);
    }

    public static final Object invoke$71(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return ((C11NZ) obj2).LJLI((C11NZ) obj);
    }

    public static final Object invoke$72(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, 8, 0.0f, 5, 0.0f, 10);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJIIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJI;
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJFF;
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, aFwS311S0000000_253);
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_254);
                }
                AFwS311S0000000_25 aFwS311S0000000_255 = g.a.LIZLLL;
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, aFwS311S0000000_255);
                float f = 2;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIJJI = C1682520tsw.LJIIJJI(C1675980tiO.LIZIZ(C1667200tUE.LIZ(c1685760tyA, C1669050tXD.LIZIZ(4)), C1670400tZO.LIZIZ(interfaceC1680500tpg).x2(), C1669430tXp.LIZ), 3, f, 6, f);
                C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJ, interfaceC1680500tpg, 0);
                int iLIZ2 = C0MXE.LIZ(interfaceC1680500tpg);
                C13D2 c13d2LJJIFFI2 = interfaceC1680500tpg.LJJIFFI();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJIIJJI);
                if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                    interfaceC1680500tpg.LJJIII();
                    if (interfaceC1680500tpg.LJJIIZ()) {
                        interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                    } else {
                        interfaceC1680500tpg.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, aFwS311S0000000_252);
                    C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI2, aFwS311S0000000_253);
                    if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ2))) {
                        interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_254);
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_255);
                    C1668930tX1.LIZIZ(C1669660tYC.o, "", c1685760tyA, C1670400tZO.LIZIZ(interfaceC1680500tpg).b1(), 14, 13, false, interfaceC1680500tpg, 221616, 64);
                    C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, (float) 2.13d), interfaceC1680500tpg);
                    C1685190txF.LIZ(C1383370m6R.LJIIJ(2131839714), null, C1670400tZO.LIZIZ(interfaceC1680500tpg).p3(), C1670400tZO.LJ(interfaceC1680500tpg).LJIL, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2034);
                    interfaceC1680500tpg.LJIIIZ();
                    interfaceC1680500tpg.LJIIIZ();
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$73(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((InterfaceC1653800t8c) obj).t32(EnumC1653870t8j.STORY, (InterfaceC1653990t8v) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$74(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
        newFaceStickerBean.id = ((Effect) obj).getId();
        newFaceStickerBean.isFavorite = !zBooleanValue;
        C1440005kM.LIZ(new C1206680hVS(newFaceStickerBean));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$75(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return null;
    }

    public static final Object invoke$76(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, c1296860jqu, interfaceC1680500tpg, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_252);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131825779, interfaceC1680500tpg), null, C1670400tZO.LIZIZ(interfaceC1680500tpg).K3(), C1670400tZO.LJ(interfaceC1680500tpg).LJJIII, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2034);
                interfaceC1680500tpg.LJJIIJZLJL(1851416117);
                if (((Boolean) C0AQD.LIZ.getValue()).booleanValue()) {
                    String str = (String) C2553409zY.LIZ.getValue();
                    if (str.length() <= 0) {
                        str = "seedream 4.5";
                    }
                    String str2 = str;
                    C1685190txF.LIZ(str2, null, C1670400tZO.LIZIZ(interfaceC1680500tpg).N3(), C1670400tZO.LJ(interfaceC1680500tpg).LJIJI, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 0, 0, 2034);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$77(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        C1684240tvi c1684240tvi = (C1684240tvi) obj2;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Float.valueOf(c1684240tvi.LIZ());
        if (((C13FE) c1684240tvi.LJFF).getValue() == EnumC1684030tvN.Vertical) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        return C1697810uHb.LJIIJJI(objArr);
    }

    public static final Object invoke$78(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((C1693660uAu) obj2).LIZ);
    }

    public static final Object invoke$79(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        C1693520uAg c1693520uAg = (C1693520uAg) obj2;
        return C1697810uHb.LJ(Boolean.valueOf(c1693520uAg.LIZ), new C1693720uB0(c1693520uAg.LIZIZ));
    }

    public static final Object invoke$8(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((InterfaceC1676340tiy) obj).LJJIJ(((Number) obj2).intValue()));
    }

    public static final Object invoke$80(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        C1693790uB7 c1693790uB7 = (C1693790uB7) obj2;
        return C1697810uHb.LJ(new C1693830uBB(c1693790uB7.LIZ), Boolean.valueOf(c1693790uB7.LIZIZ));
    }

    public static final Object invoke$81(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return ((InterfaceC1627880sSo) obj2).getId();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$82(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((Number) obj2).floatValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$83(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$84(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$85(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return ((InterfaceC1627890sSp) obj2).getId();
    }

    public static final Object invoke$86(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1673210tdv.LJI(0, 2, interfaceC1680500tpg, null, C1383370m6R.LJIIJ(2131847794));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS311S0000000_25 aFwS311S0000000_25, Object obj, Object obj2) {
        return Integer.valueOf(((InterfaceC1676340tiy) obj).LJJII(((Number) obj2).intValue()));
    }
}
