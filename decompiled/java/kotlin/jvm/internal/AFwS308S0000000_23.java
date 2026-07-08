package kotlin.jvm.internal;

import X.C03IT;
import X.C07YX;
import X.C098200Yq;
import X.C09AY;
import X.C0N6Z;
import X.C0RF0;
import X.C0T2H;
import X.C100C;
import X.C1017070cZd;
import X.C1024380clQ;
import X.C1031030cw9;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13SZ;
import X.C1479300obA;
import X.C1479720obq;
import X.C1481200oeE;
import X.C1481240oeI;
import X.C1483340ohg;
import X.C1518550pcT;
import X.C1520080pew;
import X.C1520360pfO;
import X.C1535250q3P;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C291001Au;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC1518670pcf;
import X.EnumC993170bx5;
import X.InterfaceC1483810oiR;
import X.InterfaceC1554220qY0;
import X.InterfaceC585470Mxl;
import X.InterfaceC739770T0d;
import X.InterfaceC990700bt6;
import Y.ARunnableS45S0300000_12;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AFwS308S0000000_23 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(27);
    public final int $t;

    public static AFwS308S0000000_23 get$arr$(int i) {
        AFwS308S0000000_23 aFwS308S0000000_23 = (AFwS308S0000000_23) arr$.get(i);
        if (aFwS308S0000000_23 != null) {
            return aFwS308S0000000_23;
        }
        arr$.compareAndSet(i, null, new AFwS308S0000000_23(i));
        return (AFwS308S0000000_23) arr$.get(i);
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS308S0000000_23(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$1(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$10(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        return Boolean.valueOf(((InterfaceC1554220qY0) obj).LJIJJ((SparkPopup) obj2));
    }

    public static final Object invoke$11(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).onViewDetachedFromWindow();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        return Boolean.valueOf(((InterfaceC1554220qY0) obj).LJIJI((SparkPopup) obj2));
    }

    public static final Object invoke$13(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJJIIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJJI((SparkPopup) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIL((SparkPopup) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIIIIZZ();
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJJIIJ((SparkPopup) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIIIZ();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIIZILJ((SparkPopup) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        try {
            C100C.LIZ.LIZJ().LIZ((String) obj, (Map) obj2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$22(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        Aweme aweme;
        String str;
        InterfaceC585470Mxl interfaceC585470MxlLIZIZ;
        PlayerController playerControllerLJJJJJL;
        VideoUrlModel playAddr;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        InterfaceC739770T0d interfaceC739770T0dP2;
        InterfaceC739770T0d interfaceC739770T0dP22;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        midAdCellComponent.LLLIL = ((Boolean) c291001Au.LIZ).booleanValue();
        if (((Boolean) c291001Au.LIZ).booleanValue() && (aweme = midAdCellComponent.Tp().LLILLJJLI) != null) {
            C1031030cw9 c1031030cw9 = C1031030cw9.LIZ;
            C0RF0 c0rf0 = midAdCellComponent.jm().LIZLLL;
            List<String> urlList = null;
            if (c0rf0 != null) {
                str = c0rf0.LJIIIZ;
            } else {
                str = null;
            }
            c1031030cw9.getClass();
            C1483340ohg.LJIL(0, aweme);
            C1024380clQ c1024380clQ = C1024380clQ.LIZ;
            C1024380clQ.LJIILIIL(C1697810uHb.LJ(aweme), str, null);
            MidAdVM midAdVMTp = midAdCellComponent.Tp();
            Context context = midAdCellComponent.getContext();
            midAdVMTp.getClass();
            Iterator<InterfaceC990700bt6> it2 = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIIJ().iterator();
            while (it2.hasNext()) {
                C823050WQl.LIZLLL().execute(new ARunnableS85S0200000_16(it2.next(), aweme, 65));
            }
            Iterator<C0T2H> it3 = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LIZLLL().iterator();
            while (it3.hasNext()) {
                C823050WQl.LIZLLL().execute(new ARunnableS45S0300000_12(context, it3.next(), aweme, 32));
            }
            C1479300obA c1479300obALJII = ISimPlayerService.LIZ.get().LJII();
            InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL = c1479300obALJII.LJIILIIL();
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) midAdCellComponent.LLLI.getValue();
            if (iFeedPanelPlatformAbility != null && (interfaceC739770T0dP22 = iFeedPanelPlatformAbility.P2()) != null) {
                interfaceC585470MxlLIZIZ = interfaceC739770T0dP22.LIZIZ();
            } else {
                interfaceC585470MxlLIZIZ = null;
            }
            interfaceC1483810oiRLJIILIIL.LIZ(interfaceC585470MxlLIZIZ);
            c1479300obALJII.LJIILIIL().LIZIZ(new C1481200oeE());
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) midAdCellComponent.LLLI.getValue();
            if (iFeedPanelPlatformAbility2 != null && (interfaceC739770T0dP2 = iFeedPanelPlatformAbility2.P2()) != null) {
                playerControllerLJJJJJL = interfaceC739770T0dP2.LJJJJJL();
            } else {
                playerControllerLJJJJJL = null;
            }
            c1479300obALJII.LJJIJ(playerControllerLJJJJJL);
            midAdCellComponent.LLLJ = c1479300obALJII;
            C1479720obq c1479720obq = new C1479720obq();
            Video video = aweme.getVideo();
            if (video != null) {
                playAddr = video.getPlayAddr();
            } else {
                playAddr = null;
            }
            c1479720obq.LIZ.LJII = C1481240oeI.LJ(playAddr);
            c1479300obALJII.LJJJLZIJ(c1479720obq.LIZ());
            HashMap<String, Aweme> map = C0N6Z.LIZ;
            C0N6Z.LJIIJ = midAdCellComponent.LLLJ;
            if (C1017070cZd.LLIIL(aweme) && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (!imageList.isEmpty())) {
                UrlModel urlModel = ((PhotoModeImageUrlModel) ListProtector.get(imageList, 0)).displayImageNoWatermark;
                if (urlModel != null) {
                    urlList = urlModel.getUrlList();
                }
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlList));
                c1331670kl3LJIIJ.LJJIJL(midAdCellComponent.getContext());
                c1331670kl3LJIIJ.LJIILIIL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String str = (String) obj;
        String str2 = (String) obj2;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "minis_client_key");
        }
        boolean z = false;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = str;
        }
        Uri uri2 = UriProtector.parse(str2);
        if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "minis_client_key")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str2;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            z = true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerPreloadInfo, isMatchView:");
        sbLIZ.append(z);
        sbLIZ.append(", schema1:");
        sbLIZ.append(str);
        sbLIZ.append(", schema2:");
        sbLIZ.append(str2);
        sbLIZ.append("，schema1ClientKey:");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        sbLIZ.append(", schema2ClientKey:");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        C2188811AlT.LIZIZ(sbLIZ);
        return Boolean.valueOf(z);
    }

    public static final Object invoke$24(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String str = (String) obj;
        String str2 = (String) obj2;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "minis_client_key");
        }
        boolean z = false;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = str;
        }
        Uri uri2 = UriProtector.parse(str2);
        if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "minis_client_key")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str2;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            z = true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reuseConfig, isMatchView:");
        sbLIZ.append(z);
        sbLIZ.append(", schema1:");
        sbLIZ.append(str);
        sbLIZ.append(", schema2:");
        sbLIZ.append(str2);
        sbLIZ.append("，schema1ClientKey:");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        sbLIZ.append(", schema2ClientKey:");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        C2188811AlT.LIZIZ(sbLIZ);
        return Boolean.valueOf(z);
    }

    public static final Object invoke$25(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reuseConfig, view:");
        sbLIZ.append(obj);
        sbLIZ.append(", reason:");
        sbLIZ.append(obj2);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String str = (String) obj;
        String str2 = (String) obj2;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "minis_client_key");
        }
        boolean z = false;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = str;
        }
        Uri uri2 = UriProtector.parse(str2);
        if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "minis_client_key")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str2;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            z = true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerPreloadInfo, isMatchView:");
        sbLIZ.append(z);
        sbLIZ.append(", schema1:");
        sbLIZ.append(str);
        sbLIZ.append(", schema2:");
        sbLIZ.append(str2);
        sbLIZ.append("，schema1ClientKey:");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        sbLIZ.append(", schema2ClientKey:");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        C2188811AlT.LIZIZ(sbLIZ);
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) throws JSONException {
        C1535250q3P c1535250q3P = (C1535250q3P) obj2;
        C1520360pfO c1520360pfO = new C1520360pfO((String) obj);
        c1520360pfO.LIZIZ = "hybridkit_default_bid";
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        JSONObject jSONObject = c1535250q3P.LJI;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("tag", c1535250q3P.LIZ);
        jSONObject.put("functionName", c1535250q3P.LIZIZ);
        String str = c1535250q3P.LIZJ;
        if (str == null) {
            str = "";
        }
        jSONObject.put("message", str);
        Throwable th = c1535250q3P.LJ;
        if (th != null) {
            jSONObject.put("error", c1535250q3P.toString());
            jSONObject.put("errorStack", C13SZ.LIZIZ(th));
        }
        c1520360pfO.LIZLLL = jSONObject;
        C1520080pew.LIZ("", c1520360pfO.LIZ());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        List list = (List) obj;
        int iIntValue = ((Number) obj2).intValue();
        ArrayList<NetworkUniversalPopupResponse> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C07YX) it2.next()).LIZ);
        }
        for (NetworkUniversalPopupResponse networkUniversalPopupResponse : arrayList) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("swipe_count", String.valueOf(iIntValue), bundle);
            C786410Ut5.LJJJI("business", networkUniversalPopupResponse.popupMeta.business, bundle);
            AppLogNewUtils.LJ("pns_uc_cache_popup_prepare", bundle);
        }
        TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
        if (tTKUserCommunicationService != null && tTKUserCommunicationService.LJI() != null) {
            C1518550pcT.LJI(new UserCommunicationProcessorModel("PopupShowProcessorLocal", new NetworkUniversalPopupDispatchResponse(null, arrayList, null, null, null, null, 61, null), null), Integer.valueOf(EnumC1518670pcf.SCENE_DYNAMIC.getValue()), C2097908Jt.LIZJ(new Pair("enter_from", "DynamicProcessor")));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJJ();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIILJJIL((SparkPopup) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIILLIIL();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS308S0000000_23 aFwS308S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).onViewAttachedToWindow();
        return Unit.LIZ;
    }
}
