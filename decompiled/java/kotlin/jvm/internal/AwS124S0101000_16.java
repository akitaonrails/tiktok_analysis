package kotlin.jvm.internal;

import X.C09AY;
import X.C1000670c9B;
import X.C1001510cAX;
import X.C1001800cB0;
import X.C1002030cBN;
import X.C1002050cBP;
import X.C1002190cBd;
import X.C1005020cGC;
import X.C1009990cOD;
import X.C1011170cQ7;
import X.C1012820cSm;
import X.C1013770cUJ;
import X.C1022090chj;
import X.C1023640ckE;
import X.C1027660cqi;
import X.C1030850cvr;
import X.C1030870cvt;
import X.C1043500dGG;
import X.C1047920dNO;
import X.C1049170dPP;
import X.C1049190dPR;
import X.C1068020dto;
import X.C1068650dup;
import X.C1072510e13;
import X.C1073710e2z;
import X.C1397620mTQ;
import X.C13LP;
import X.C197039127h;
import X.C2265891DmV;
import X.C2268451Dqd;
import X.C418440Gaw;
import X.C814420VxA;
import X.EnumC1030860cvs;
import X.EnumC1072920e1i;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentConfig;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes17.dex */
public class AwS124S0101000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1030850cvr.LIZ.getClass();
        c1023640ckE.withParam(C1030850cvr.LIZIZ, EnumC1030860cvs.REQUEST);
        Map<String, Long> map = ((C1030870cvt) awS124S0101000_16.l0).LIZ;
        C1002190cBd c1002190cBd = C1030850cvr.LIZLLL;
        Long l = (Long) ((LinkedHashMap) map).get(c1002190cBd.LIZ);
        if (l != null) {
            c1023640ckE.withParam(c1002190cBd, Long.valueOf(l.longValue()));
        }
        Map<String, Long> map2 = ((C1030870cvt) awS124S0101000_16.l0).LIZ;
        C1002190cBd c1002190cBd2 = C1030850cvr.LJ;
        Long l2 = (Long) ((LinkedHashMap) map2).get(c1002190cBd2.LIZ);
        if (l2 != null) {
            c1023640ckE.withParam(c1002190cBd2, Long.valueOf(l2.longValue()));
        }
        c1023640ckE.withParam(C1030850cvr.LJII, Integer.valueOf(awS124S0101000_16.i1));
        Map<String, Long> map3 = ((C1030870cvt) awS124S0101000_16.l0).LIZ;
        C1002190cBd c1002190cBd3 = C1030850cvr.LJFF;
        Long l3 = (Long) ((LinkedHashMap) map3).get(c1002190cBd3.LIZ);
        if (l3 != null) {
            c1023640ckE.withParam(c1002190cBd3, Long.valueOf(l3.longValue()));
        }
        Map<String, Long> map4 = ((C1030870cvt) awS124S0101000_16.l0).LIZ;
        C1002190cBd c1002190cBd4 = C1030850cvr.LJI;
        Long l4 = (Long) ((LinkedHashMap) map4).get(c1002190cBd4.LIZ);
        if (l4 != null) {
            c1023640ckE.withParam(c1002190cBd4, Long.valueOf(l4.longValue()));
        }
        Map<String, Long> map5 = ((C1030870cvt) awS124S0101000_16.l0).LIZ;
        C1002190cBd c1002190cBd5 = C1030850cvr.LJIIIZ;
        Long l5 = (Long) ((LinkedHashMap) map5).get(c1002190cBd5.LIZ);
        if (l5 != null) {
            c1023640ckE.withParam(c1002190cBd5, Long.valueOf(l5.longValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1049190dPR.LIZ.getClass();
        c1023640ckE.withParam(C1049190dPR.LIZIZ, ((C1049170dPP) awS124S0101000_16.l0).LIZ);
        c1023640ckE.withParam(C1049190dPR.LJI, "anole");
        c1023640ckE.withParam(C1049190dPR.LIZJ, Integer.valueOf(awS124S0101000_16.i1));
        c1023640ckE.withParamLogic(C1049190dPR.LJII, new C1000670c9B((C1049170dPP) awS124S0101000_16.l0));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJIL, String.valueOf(awS124S0101000_16.i1));
        c1023640ckE.withParam(C1009990cOD.LJJJJZ, ((AnoleComponentModel) awS124S0101000_16.l0).type);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        String str;
        String string;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJIIIIZZ, "native");
        C1002190cBd c1002190cBd = C1043500dGG.LJFF;
        AdAutofillPopupModel adAutofillPopupModel = ((C1068650dup) awS124S0101000_16.l0).LJ;
        if (adAutofillPopupModel != null) {
            str = adAutofillPopupModel.url;
        } else {
            str = null;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        c1023640ckE.withParam(C1043500dGG.LJI, Integer.valueOf(((C1068650dup) awS124S0101000_16.l0).LIZIZ ? 1 : 0));
        c1023640ckE.withParam(C1043500dGG.LJIIIZ, Integer.valueOf(awS124S0101000_16.i1));
        C1002190cBd c1002190cBd2 = C1043500dGG.LJII;
        JSONArray jSONArrayLJIIJ = C1068020dto.LJIIJ();
        if (jSONArrayLJIIJ == null || (string = jSONArrayLJIIJ.toString()) == null) {
            string = "[]";
        }
        c1023640ckE.withParam(c1002190cBd2, string);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1022090chj.LIZ.getClass();
        c1023640ckE.withParam(C1022090chj.LJFF, Integer.valueOf(awS124S0101000_16.i1));
        Integer num = (Integer) awS124S0101000_16.l0;
        if (num != null) {
            c1023640ckE.withParam(C1022090chj.LJI, Integer.valueOf(num.intValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        String uri;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJIL, String.valueOf(awS124S0101000_16.i1));
        C1002190cBd c1002190cBd = C1009990cOD.LJJI;
        Aweme aweme = ((C1011170cQ7) awS124S0101000_16.l0).LLILZLL.getAweme();
        int i = awS124S0101000_16.i1;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null) {
            uri = urlModel.getUri();
        } else {
            uri = null;
        }
        c1023640ckE.withParam(c1002190cBd, uri);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2268451Dqd.LIZ.getClass();
        c1023640ckE.withParam(C2268451Dqd.LJIJ, Long.valueOf(awS124S0101000_16.i1));
        if (((Integer) ((C1027660cqi) awS124S0101000_16.l0).LJLLILLLL.LIZJ()) != null) {
            c1023640ckE.withParam(C2268451Dqd.LJJIII, Long.valueOf(r0.intValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1013770cUJ.LIZ.getClass();
        C1002190cBd c1002190cBd = C1013770cUJ.LIZIZ;
        Object obj2 = ((Map) awS124S0101000_16.l0).get("region");
        Object obj3 = "";
        if (obj2 == null) {
            obj2 = "";
        }
        c1023640ckE.withParam(c1002190cBd, obj2);
        C1002190cBd c1002190cBd2 = C1013770cUJ.LIZJ;
        Object obj4 = ((Map) awS124S0101000_16.l0).get("campaign");
        if (obj4 == null) {
            obj4 = "";
        }
        c1023640ckE.withParam(c1002190cBd2, obj4);
        C1002190cBd c1002190cBd3 = C1013770cUJ.LIZLLL;
        Object obj5 = ((Map) awS124S0101000_16.l0).get("gameplay");
        if (obj5 != null) {
            obj3 = obj5;
        }
        c1023640ckE.withParam(c1002190cBd3, obj3);
        c1023640ckE.withParam(C1013770cUJ.LJ, Integer.valueOf(awS124S0101000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        ((Function2) awS124S0101000_16.l0).invoke(obj, Integer.valueOf(awS124S0101000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265891DmV.LIZ.getClass();
        c1023640ckE.withParam(C2265891DmV.LJIILL, ((C1047920dNO) awS124S0101000_16.l0).LIZIZ);
        c1023640ckE.withParam(C2265891DmV.LJIJ, ((C1047920dNO) awS124S0101000_16.l0).LIZJ);
        c1023640ckE.withParam(C2265891DmV.LJIILLIIL, ((C1047920dNO) awS124S0101000_16.l0).LIZLLL);
        c1023640ckE.withParam(C2265891DmV.LJIIZILJ, Long.valueOf(awS124S0101000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1001800cB0.LIZ.getClass();
        c1023640ckE.withParam(C1001800cB0.LJ, Integer.valueOf(((C1001510cAX) awS124S0101000_16.l0).LLILLL));
        c1023640ckE.withParam(C1001800cB0.LJIIJJI, Long.valueOf(((C1001510cAX) awS124S0101000_16.l0).LLILZIL));
        c1023640ckE.withParam(C1001800cB0.LJIIL, Integer.valueOf(awS124S0101000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1005020cGC.LIZ.getClass();
        c1023640ckE.withParam(C1005020cGC.LIZIZ, Integer.valueOf(awS124S0101000_16.i1));
        c1023640ckE.withParam(C1005020cGC.LIZJ, (Integer) awS124S0101000_16.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1049190dPR.LIZ.getClass();
        c1023640ckE.withParam(C1049190dPR.LIZIZ, ((C1049170dPP) awS124S0101000_16.l0).LIZ);
        c1023640ckE.withParam(C1049190dPR.LIZJ, Integer.valueOf(awS124S0101000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1012820cSm.LIZ.getClass();
        c1023640ckE.withParam(C1012820cSm.LJIIZILJ, ((AnoleProductModel) awS124S0101000_16.l0).getProductId());
        c1023640ckE.withParam(C1012820cSm.LJIJ, ((AnoleProductModel) awS124S0101000_16.l0).getProductTitle());
        c1023640ckE.withParam(C1012820cSm.LJIJI, Integer.valueOf(awS124S0101000_16.i1 + 1));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1012820cSm.LIZ.getClass();
        c1023640ckE.withParam(C1012820cSm.LJIILJJIL, ((AnoleProductModel) awS124S0101000_16.l0).getProductId());
        c1023640ckE.withParam(C1012820cSm.LJIILL, ((AnoleProductModel) awS124S0101000_16.l0).getProductTitle());
        c1023640ckE.withParam(C1012820cSm.LJIILLIIL, Integer.valueOf(awS124S0101000_16.i1 + 1));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        int i = awS124S0101000_16.i1;
        if (i <= 0) {
            return ((FriendsEmptyPageMainSectionVM) awS124S0101000_16.l0).wQ2();
        }
        if (i < 5) {
            return new C1073710e2z(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), 44.0f, 57);
        }
        return new C1073710e2z(0, 0.0f, 63);
    }

    public static final Object invoke$3(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C197039127h c197039127hOR;
        SocialConsentConfig socialConsentConfig;
        C197039127h c197039127hOR2 = ((SocialConsentFragment) awS124S0101000_16.l0).OR();
        if ((c197039127hOR2 == null || !c197039127hOR2.LLLII) && (c197039127hOR = ((SocialConsentFragment) awS124S0101000_16.l0).OR()) != null) {
            c197039127hOR.setLoading(true);
        }
        SocialConsentFragment socialConsentFragment = (SocialConsentFragment) awS124S0101000_16.l0;
        SocialConsentConfig socialConsentConfig2 = socialConsentFragment.LLIZLLLIL;
        if (socialConsentConfig2 == null) {
            socialConsentConfig = null;
        } else {
            socialConsentConfig = socialConsentConfig2;
        }
        int i = socialConsentConfig.socialRecType;
        if (socialConsentConfig2 == null) {
            socialConsentConfig2 = null;
        }
        socialConsentFragment.WR(i, socialConsentConfig2.step);
        C1072510e13 c1072510e13 = C1072510e13.LIZ;
        int i2 = awS124S0101000_16.i1;
        c1072510e13.getClass();
        C1072510e13.LIZ(i2, "sync");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        ((SocialConsentFragment) awS124S0101000_16.l0).MR(awS124S0101000_16.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        int i;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        if (awS124S0101000_16.i1 == EnumC1072920e1i.NEW_VERSION_FACEBOOK.getValue()) {
            i = 2131848279;
        } else {
            i = 2131848280;
        }
        c1397620mTQ.LJFF(i, new AwS124S0101000_16(awS124S0101000_16.i1, (SocialConsentFragment) awS124S0101000_16.l0, 3));
        c1397620mTQ.LJII(2131848281, new AwS124S0101000_16(awS124S0101000_16.i1, (SocialConsentFragment) awS124S0101000_16.l0, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1002050cBP.LIZ.getClass();
        c1023640ckE.withParam(C1002050cBP.LJI, Integer.valueOf(awS124S0101000_16.i1 + 1));
        c1023640ckE.withParam(C1002050cBP.LJIIIZ, ((C1002030cBN) awS124S0101000_16.l0).LJJIIZI(awS124S0101000_16.i1));
        c1023640ckE.withParam(C1002050cBP.LIZJ, Integer.valueOf(((C1002030cBN) awS124S0101000_16.l0).LJJIIZ(awS124S0101000_16.i1)));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJIL, String.valueOf(awS124S0101000_16.i1));
        c1023640ckE.withParam(C1009990cOD.LJJJJZ, ((AnoleComponentModel) awS124S0101000_16.l0).type);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJJJZ, ((AnoleComponentModel) awS124S0101000_16.l0).type);
        c1023640ckE.withParam(C1009990cOD.LJJIL, String.valueOf(awS124S0101000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS124S0101000_16 awS124S0101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJIL, String.valueOf(awS124S0101000_16.i1));
        c1023640ckE.withParam(C1009990cOD.LJJJJZ, ((AnoleComponentModel) awS124S0101000_16.l0).type);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS124S0101000_16(int r3, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 7: goto Lf;
                case 8: goto L5;
                case 9: goto Lf;
                case 10: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS124S0101000_16.<init>(int, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS124S0101000_16(int r3, com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 3: goto Lf;
                case 4: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS124S0101000_16.<init>(int, com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(int i, C1002030cBN c1002030cBN, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1002030cBN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(int i, C1011170cQ7 c1011170cQ7, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1011170cQ7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(int i, C1027660cqi c1027660cqi, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1027660cqi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(int i, FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = friendsEmptyPageMainSectionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(int i, AnoleProductModel anoleProductModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = anoleProductModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(int i, Integer num, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(int i, Map map, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = map;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(int i, Function2 function2, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = function2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(C1001510cAX c1001510cAX, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1001510cAX;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(C1030870cvt c1030870cvt, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1030870cvt;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(C1047920dNO c1047920dNO, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1047920dNO;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(C1049170dPP c1049170dPP, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1049170dPP;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0101000_16(C1068650dup c1068650dup, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1068650dup;
        this.i1 = i;
    }
}
