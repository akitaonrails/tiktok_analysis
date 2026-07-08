package kotlin.jvm.internal;

import X.AbstractC1017850cat;
import X.AbstractC1033200cze;
import X.AbstractC1033330czr;
import X.AbstractC1033380czw;
import X.AbstractC1033390czx;
import X.AbstractC1051250dSl;
import X.AbstractC1539010q9T;
import X.AbstractC1542200qEc;
import X.C013C;
import X.C098200Yq;
import X.C09AY;
import X.C0SCL;
import X.C0WZX;
import X.C1002190cBd;
import X.C1002930cCp;
import X.C1009990cOD;
import X.C1010440cOw;
import X.C1017070cZd;
import X.C1017870cav;
import X.C1017880caw;
import X.C1017890cax;
import X.C1023640ckE;
import X.C1031310cwb;
import X.C1031480cws;
import X.C1031860cxU;
import X.C1032520cyY;
import X.C1032800cz0;
import X.C1032810cz1;
import X.C1032820cz2;
import X.C1032890cz9;
import X.C1032900czA;
import X.C1032910czB;
import X.C1032990czJ;
import X.C1033190czd;
import X.C1033210czf;
import X.C1033260czk;
import X.C1033310czp;
import X.C1033370czv;
import X.C1033400czy;
import X.C1033410czz;
import X.C1035880d3y;
import X.C1039830dAL;
import X.C1040120dAo;
import X.C1040160dAs;
import X.C1043500dGG;
import X.C1047370dMV;
import X.C1051290dSp;
import X.C1067900dtc;
import X.C1067990dtl;
import X.C1068220du8;
import X.C1074770e4h;
import X.C1092640eXW;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LP;
import X.C189200o6;
import X.C1954807lC;
import X.C2084808Es;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C259800zU;
import X.C301090Br9;
import X.C588990N8f;
import X.C622570ObP;
import X.C811103Ev;
import X.C989160bqc;
import X.EnumC993300bxI;
import X.InterfaceC1008930cMV;
import X.InterfaceC1051160dSc;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.cip.CIPLogicComponent;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillGetResponse;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ad.AdCipInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AwS100S1200000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        InterfaceC1051160dSc interfaceC1051160dSc = (InterfaceC1051160dSc) obj;
        if (interfaceC1051160dSc != null) {
            SparkContext sparkContextLLIILZL = interfaceC1051160dSc.LLIILZL();
            if (sparkContextLLIILZL != null) {
                ((AbstractC1051250dSl) awS100S1200000_16.l1).tryRegisterLynxSSRCallback(sparkContextLLIILZL, (C1051290dSp) awS100S1200000_16.l2);
            }
            interfaceC1051160dSc.LIZIZ();
        }
        C301090Br9.LIZIZ(new AwS132S1200000_16((AbstractC1051250dSl) awS100S1200000_16.l1, awS100S1200000_16.s0, interfaceC1051160dSc, 3));
        C811103Ev.LIZ(((AbstractC1051250dSl) awS100S1200000_16.l1).getTag());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LLFZ, awS100S1200000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LJJIJIIJI, 0);
        c1023640ckE.withParam(C1043500dGG.LLIZLLLIL, (Integer) awS100S1200000_16.l1);
        c1023640ckE.withParam(C1043500dGG.LLJ, (Long) awS100S1200000_16.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((ContactMaFWidgetVM) awS100S1200000_16.l1).LLILZ.storeLong(C2084808Es.LIZ(awS100S1200000_16.s0), System.currentTimeMillis());
            ((ContactMaFWidgetVM) awS100S1200000_16.l1).setState(new AwS595S0100000_16((C1074770e4h) awS100S1200000_16.l2, 461));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJJZI((AbstractC1542200qEc) awS100S1200000_16.l1);
        final LynxViewClient lynxViewClient = (LynxViewClient) awS100S1200000_16.l2;
        final String str = awS100S1200000_16.s0;
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0dta
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
                if ((interfaceC1531560pxS instanceof C1537910q7h) && ((copyOnWriteArrayList = (c1537910q7h = (C1537910q7h) interfaceC1531560pxS).LJJJIL) == null || !copyOnWriteArrayList.contains(lynxViewClient))) {
                    c1537910q7h.LJIIIIZZ(lynxViewClient);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (C1067890dtb.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
                        String str2 = str;
                        C1067460dsu c1067460dsuLIZIZ = C1067320dsg.LIZIZ("");
                        c1067460dsuLIZIZ.LIZ("initial_data", new JSONObject(str2));
                        ((C1537910q7h) interfaceC1531560pxS).LJIJJLI(c1067460dsuLIZIZ);
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1040160dAs.LIZ.getClass();
        c1023640ckE.withParam(C1040160dAs.LIZIZ, ((C1039830dAL) awS100S1200000_16.l1).LIZLLL);
        c1023640ckE.withParam(C1040160dAs.LIZJ, awS100S1200000_16.s0);
        C1002190cBd c1002190cBd = C1040160dAs.LIZLLL;
        ((C1040120dAo) awS100S1200000_16.l2).getClass();
        c1023640ckE.withParam(c1002190cBd, "AI_AUTOFILL");
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        Object obj2;
        String string;
        Object obj3;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1068220du8.LIZ.getClass();
        C1002190cBd c1002190cBd = C1068220du8.LIZIZ;
        Integer num = ((AdAutofillGetResponse) awS100S1200000_16.l1).statusCode;
        String str = "1";
        if (num != null && num.intValue() == 0) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd, obj2);
        c1023640ckE.withParam(C1068220du8.LIZJ, awS100S1200000_16.s0);
        C1002190cBd c1002190cBd2 = C1068220du8.LIZLLL;
        Integer num2 = ((AdAutofillGetResponse) awS100S1200000_16.l1).statusCode;
        if (num2 != null) {
            string = num2.toString();
        } else {
            string = null;
        }
        c1023640ckE.withParam(c1002190cBd2, string);
        c1023640ckE.withParam(C1068220du8.LJ, ((C259800zU) awS100S1200000_16.l2).element);
        C1002190cBd c1002190cBd3 = C1068220du8.LJFF;
        if (C1067990dtl.LJIIZILJ()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd3, obj3);
        C1002190cBd c1002190cBd4 = C1068220du8.LJI;
        if (!C1067990dtl.LJJI()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd4, str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        Object c098200Yq3;
        Object obj2;
        Object c098200Yq4;
        Object obj3;
        Object c098200Yq5;
        Object obj4;
        AbstractC1033380czw abstractC1033380czw = (AbstractC1033380czw) obj;
        if (abstractC1033380czw instanceof C1033190czd) {
            C1032990czJ c1032990czJ = (C1032990czJ) awS100S1200000_16.l1;
            C1032810cz1 c1032810cz1 = (C1032810cz1) awS100S1200000_16.l2;
            n nVar = ((C1033190czd) abstractC1033380czw).LIZ;
            String str = awS100S1200000_16.s0;
            c1032990czJ.getClass();
            try {
                c098200Yq = Integer.valueOf(nVar.LJJIIZ("status_code").LJIIJJI());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj5 = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null) {
                iIntValue = num.intValue();
                if (iIntValue == 0) {
                    try {
                        c098200Yq3 = nVar.LJJIIZ("aweme_list").LJIIL();
                        C189200o6.m2constructorimpl(c098200Yq3);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq3 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq3);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                        obj2 = null;
                    } else {
                        obj2 = c098200Yq3;
                    }
                    h hVar = (h) obj2;
                    if (hVar == null) {
                        C1032990czJ.LIZ(c1032810cz1, C1033400czy.LIZ);
                        C1032990czJ.LIZIZ(c1032810cz1, "empty-" + C1033260czk.LIZJ(c098200Yq3, "awemesParseResult"), str);
                    } else {
                        try {
                            c098200Yq4 = hVar.LJJIIJZLJL(0);
                            C189200o6.m2constructorimpl(c098200Yq4);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            c098200Yq4 = new C098200Yq(th3);
                            C189200o6.m2constructorimpl(c098200Yq4);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                            obj3 = null;
                        } else {
                            obj3 = c098200Yq4;
                        }
                        k kVar = (k) obj3;
                        if (kVar == null) {
                            C1032990czJ.LIZ(c1032810cz1, C1033400czy.LIZ);
                            C1032990czJ.LIZIZ(c1032810cz1, "empty-" + C1033260czk.LIZJ(c098200Yq4, "awemeJSONParseResult"), str);
                        } else {
                            C1032890cz9.LIZ.getClass();
                            Aweme awemeLJII = C1032890cz9.LJII(kVar);
                            c1032810cz1.setHostModel(awemeLJII);
                            try {
                                c098200Yq5 = (RewardAdModel) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LIZJ(kVar, RewardAdModel.class);
                                C189200o6.m2constructorimpl(c098200Yq5);
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                c098200Yq5 = new C098200Yq(th4);
                                C189200o6.m2constructorimpl(c098200Yq5);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq5)) {
                                obj4 = null;
                            } else {
                                obj4 = c098200Yq5;
                            }
                            RewardAdModel rewardAdModel = (RewardAdModel) obj4;
                            c1032810cz1.setPreload(false);
                            c1032810cz1.setRewardAdModel(rewardAdModel);
                            if (rewardAdModel == null) {
                                C1032990czJ.LIZ(c1032810cz1, C1033400czy.LIZ);
                                C1032990czJ.LIZIZ(c1032810cz1, "empty-" + C1033260czk.LIZJ(c098200Yq5, "rewardAdModelParseResult"), str);
                            } else {
                                c1032810cz1.getHostDelegate().loadDataSuccess(c1032810cz1.getHostModel());
                                c1032810cz1.updateState(C1031860cxU.LIZ);
                                c1032810cz1.getHostDelegate().trackEvent(new C1031310cwb("receive", null, 12), c1032810cz1.getHostModel());
                                C989160bqc.LIZ(awemeLJII);
                                C1032910czB.LIZLLL(c1032810cz1, true, null, null, str, false);
                            }
                        }
                    }
                }
            } else {
                iIntValue = -1;
            }
            try {
                c098200Yq2 = nVar.LJJIIZ("status_msg").LJIL();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                c098200Yq2 = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj5 = c098200Yq2;
            }
            String str2 = (String) obj5;
            if (str2 == null) {
                str2 = "";
            }
            C1032990czJ.LIZ(c1032810cz1, new C1033210czf(iIntValue, str2));
            C1032990czJ.LIZIZ(c1032810cz1, iIntValue + '-' + str2, str);
        } else if (abstractC1033380czw instanceof AbstractC1033200cze) {
            ((C1032990czJ) awS100S1200000_16.l1).getClass();
            C1032990czJ.LIZ((C1032810cz1) awS100S1200000_16.l2, (AbstractC1033200cze) abstractC1033380czw);
            C1032990czJ c1032990czJ2 = (C1032990czJ) awS100S1200000_16.l1;
            C1032810cz1 c1032810cz12 = (C1032810cz1) awS100S1200000_16.l2;
            String str3 = awS100S1200000_16.s0;
            c1032990czJ2.getClass();
            C1032990czJ.LIZIZ(c1032810cz12, "unknown", str3);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS100S1200000_16 r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S1200000_16.invoke$3(kotlin.jvm.internal.AwS100S1200000_16, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1002930cCp.LIZ.getClass();
        c1023640ckE.withParam(C1002930cCp.LJI, awS100S1200000_16.s0);
        C588990N8f.LIZIZ(c1023640ckE, (C622570ObP) awS100S1200000_16.l1);
        Function1 function1 = (Function1) awS100S1200000_16.l2;
        if (function1 != null) {
            function1.invoke(c1023640ckE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1002930cCp.LIZ.getClass();
        c1023640ckE.withParam(C1002930cCp.LJI, awS100S1200000_16.s0);
        C588990N8f.LIZIZ(c1023640ckE, (C622570ObP) awS100S1200000_16.l1);
        Function1 function1 = (Function1) awS100S1200000_16.l2;
        if (function1 != null) {
            function1.invoke(c1023640ckE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS100S1200000_16 awS100S1200000_16, Object obj) throws Throwable {
        C1047370dMV.LJ((C1035880d3y) awS100S1200000_16.l1, "location", 0, 3);
        C1047370dMV.LIZJ((C1035880d3y) awS100S1200000_16.l1, "location", 1, 0);
        GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) awS100S1200000_16.l2;
        if (callback != null) {
            C2204961BRm.LLJI(callback, awS100S1200000_16.s0, false, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHe2SDcuVPPA9qvIScSqO3DrTNbubo5w0Ps8Fqb/frn", null));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS100S1200000_16 awS100S1200000_16, Object obj) throws JSONException {
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ;
        Activity activityLIZ;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AdCipInfo cipInfo;
        String str;
        IFeedService iFeedServiceLIZIZ;
        AbstractC1017850cat abstractC1017850cat = (AbstractC1017850cat) obj;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null) {
            interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(((CIPLogicComponent) awS100S1200000_16.l1).getContext(), (Aweme) awS100S1200000_16.l2, awS100S1200000_16.s0, true);
        } else {
            interfaceC1008930cMVLIZJ = null;
        }
        if (abstractC1017850cat instanceof C1017890cax) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", "cipOnError");
            C1017890cax c1017890cax = (C1017890cax) abstractC1017850cat;
            jSONObject.put("packageName", c1017890cax.LIZIZ);
            jSONObject.put("errorCode", c1017890cax.LIZ);
            C0SCL c0scl = new C0SCL(jSONObject);
            if (interfaceC1008930cMVLIZJ != null) {
                interfaceC1008930cMVLIZJ.LJIILL(c0scl);
            }
            Context context = ((CIPLogicComponent) awS100S1200000_16.l1).getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ((Aweme) awS100S1200000_16.l2)) != null && (cipInfo = awemeRawAdLJJIJLIJ.getCipInfo()) != null && (str = cipInfo.downloadFailedText) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
        } else if (abstractC1017850cat instanceof C1017870cav) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event", "cipOnProgressUpdate");
            C1017870cav c1017870cav = (C1017870cav) abstractC1017850cat;
            jSONObject2.put("packageName", c1017870cav.LIZJ);
            jSONObject2.put("totalSize", c1017870cav.LIZIZ);
            jSONObject2.put("progress", Float.valueOf(c1017870cav.LIZ));
            C0SCL c0scl2 = new C0SCL(jSONObject2);
            if (interfaceC1008930cMVLIZJ != null) {
                interfaceC1008930cMVLIZJ.LJIILL(c0scl2);
            }
        } else if (abstractC1017850cat instanceof C1017880caw) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("event", "cipOnStateChange");
            C1017880caw c1017880caw = (C1017880caw) abstractC1017850cat;
            jSONObject3.put("packageName", c1017880caw.LIZIZ);
            jSONObject3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c1017880caw.LIZ.getValue());
            C0SCL c0scl3 = new C0SCL(jSONObject3);
            if (interfaceC1008930cMVLIZJ != null) {
                interfaceC1008930cMVLIZJ.LJIILL(c0scl3);
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        Object c098200Yq3;
        Object obj2;
        Object c098200Yq4;
        GmtRewardAdModel gmtRewardAdModel;
        AbstractC1033390czx abstractC1033390czx = (AbstractC1033390czx) obj;
        if (abstractC1033390czx instanceof C1033370czv) {
            C1032820cz2 c1032820cz2 = (C1032820cz2) awS100S1200000_16.l1;
            C1032800cz0 c1032800cz0 = (C1032800cz0) awS100S1200000_16.l2;
            n nVar = ((C1033370czv) abstractC1033390czx).LIZ;
            String str = awS100S1200000_16.s0;
            c1032820cz2.getClass();
            try {
                c098200Yq = Integer.valueOf(nVar.LJJIIZ("status_code").LJIIJJI());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj3 = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null) {
                iIntValue = num.intValue();
                if (iIntValue == 0) {
                    try {
                        c098200Yq3 = nVar.LJJIIZ("aweme_list").LJIIL();
                        C189200o6.m2constructorimpl(c098200Yq3);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq3 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq3);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                        obj2 = null;
                    } else {
                        obj2 = c098200Yq3;
                    }
                    h hVar = (h) obj2;
                    if (hVar == null) {
                        C1032820cz2.LIZ(c1032800cz0, C1033410czz.LIZ);
                        C1032820cz2.LIZJ(c1032800cz0, "empty-" + C1033260czk.LIZJ(c098200Yq3, "awemesParseResult"), str);
                    } else if (hVar.size() == 0) {
                        C1032820cz2.LIZ(c1032800cz0, C1033410czz.LIZ);
                        C1032820cz2.LIZJ(c1032800cz0, "empty-awemes", str);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            int size = hVar.size();
                            for (int i = 0; i < size; i++) {
                                k kVarLJJIIJZLJL = hVar.LJJIIJZLJL(i);
                                Object objParsingHostModel = c1032800cz0.parsingHostModel(kVarLJJIIJZLJL);
                                if (objParsingHostModel != null) {
                                    arrayList.add(objParsingHostModel);
                                }
                                Gson gson = c1032800cz0.getGson();
                                if (gson != null && (gmtRewardAdModel = (GmtRewardAdModel) gson.LIZJ(kVarLJJIIJZLJL, GmtRewardAdModel.class)) != null) {
                                    arrayList2.add(gmtRewardAdModel);
                                }
                            }
                            c1032800cz0.setPreload(false);
                            if (arrayList2.isEmpty()) {
                                C1032820cz2.LIZ(c1032800cz0, C1033410czz.LIZ);
                                C1032820cz2.LIZJ(c1032800cz0, "empty-rewardModelList", str);
                            } else if (arrayList.isEmpty()) {
                                C1032820cz2.LIZ(c1032800cz0, C1033410czz.LIZ);
                                C1032820cz2.LIZJ(c1032800cz0, "empty-hostModelList", str);
                            } else {
                                try {
                                    c098200Yq4 = Integer.valueOf(nVar.LJJIIZ("scene_type").LJIIJJI());
                                    C189200o6.m2constructorimpl(c098200Yq4);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    c098200Yq4 = new C098200Yq(th3);
                                    C189200o6.m2constructorimpl(c098200Yq4);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                                    c098200Yq4 = null;
                                }
                                Integer num2 = (Integer) c098200Yq4;
                                c1032800cz0.setSceneType(num2);
                                c1032800cz0.setRewardAdModel(arrayList2);
                                Object objLJJJLL = C13LP.LJJJLL(arrayList);
                                c1032800cz0.setHostModel((List<Object>) arrayList);
                                c1032800cz0.getHostDelegate().loadDataSuccess(arrayList);
                                c1032800cz0.getHostDelegate().onAdSelected(objLJJJLL);
                                c1032800cz0.getDelegate().onRewardAdDataReady();
                                c1032800cz0.notifyBusinessUpdateBubbleTip();
                                if (c1032800cz0.getSceneType().isOneToN()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        c1032800cz0.trackEvent(new C1031480cws("receive", null, 12), it2.next());
                                    }
                                } else {
                                    Object objLJJJLL2 = C13LP.LJJJLL(arrayList);
                                    if (objLJJJLL2 != null) {
                                        c1032800cz0.trackEvent(new C1031480cws("receive", null, 12), objLJJJLL2);
                                    }
                                }
                                c1032800cz0.updateState(C1032520cyY.LIZ);
                                C1032900czA.LJI(c1032800cz0, true, null, null, str, false, num2, Integer.valueOf(hVar.size()), 12);
                                c1032800cz0.setRewardAdDataStatus(EnumC993300bxI.SUCCESS);
                            }
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            C1032820cz2.LIZ(c1032800cz0, C1033410czz.LIZ);
                            C1032820cz2.LIZJ(c1032800cz0, C1033260czk.LIZIZ("parseLoop", th4), str);
                        }
                    }
                }
            } else {
                iIntValue = -1;
            }
            try {
                c098200Yq2 = nVar.LJJIIZ("status_msg").LJIL();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                c098200Yq2 = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj3 = c098200Yq2;
            }
            String str2 = (String) obj3;
            if (str2 == null) {
                str2 = "";
            }
            C1032820cz2.LIZ(c1032800cz0, new C1033310czp(iIntValue, str2));
            C1032820cz2.LIZJ(c1032800cz0, iIntValue + '-' + str2, str);
        } else if (abstractC1033390czx instanceof AbstractC1033330czr) {
            C1032820cz2 c1032820cz22 = (C1032820cz2) awS100S1200000_16.l1;
            C1032800cz0 c1032800cz02 = (C1032800cz0) awS100S1200000_16.l2;
            AbstractC1033330czr abstractC1033330czr = (AbstractC1033330czr) abstractC1033390czx;
            c1032820cz22.getClass();
            C1032820cz2.LIZ(c1032800cz02, abstractC1033330czr);
            C1032820cz2 c1032820cz23 = (C1032820cz2) awS100S1200000_16.l1;
            C1032800cz0 c1032800cz03 = (C1032800cz0) awS100S1200000_16.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request_failed-");
            sbLIZ.append(abstractC1033330czr.LIZ());
            sbLIZ.append('-');
            sbLIZ.append(abstractC1033330czr.LIZIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str3 = awS100S1200000_16.s0;
            c1032820cz23.getClass();
            C1032820cz2.LIZJ(c1032800cz03, strLIZIZ, str3);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS100S1200000_16 awS100S1200000_16, Object obj) {
        String str;
        Object objLJJJLIIL;
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentRelationModel> map;
        Set<String> setKeySet;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJJJLI, awS100S1200000_16.s0);
        C1002190cBd c1002190cBd = C1009990cOD.LJJJJLL;
        if (((C013C) awS100S1200000_16.l1).element) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        C1002190cBd c1002190cBd2 = C1009990cOD.LJJJJZ;
        Aweme aweme = ((C1010440cOw) awS100S1200000_16.l2).LLILZIL;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.componentRelations) != null && (setKeySet = map.keySet()) != null) {
            objLJJJLIIL = C13LP.LJJJLIIL(setKeySet);
        } else {
            objLJJJLIIL = null;
        }
        c1023640ckE.withParam(c1002190cBd2, objLJJJLIIL);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(C1010440cOw c1010440cOw, String str, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c013c;
        this.l2 = c1010440cOw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(C1032820cz2 c1032820cz2, C1032800cz0 c1032800cz0, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1032820cz2;
        this.l2 = c1032800cz0;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(C1032990czJ c1032990czJ, C1032810cz1 c1032810cz1, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1032990czJ;
        this.l2 = c1032810cz1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(C1035880d3y c1035880d3y, Long l, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = l;
        this.s0 = str;
        this.l2 = c1035880d3y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(C1039830dAL c1039830dAL, String str, C1040120dAo c1040120dAo, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1039830dAL;
        this.s0 = str;
        this.l2 = c1040120dAo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(AbstractC1051250dSl abstractC1051250dSl, C1051290dSp c1051290dSp, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractC1051250dSl;
        this.l2 = c1051290dSp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(C1067900dtc c1067900dtc, C1092640eXW c1092640eXW, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1067900dtc;
        this.l2 = c1092640eXW;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(GeolocationPermissions.Callback callback, C1035880d3y c1035880d3y, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1035880d3y;
        this.l2 = callback;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(CIPLogicComponent cIPLogicComponent, String str, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l1 = cIPLogicComponent;
        this.s0 = str;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S1200000_16(AdAutofillGetResponse adAutofillGetResponse, AdAutofillGetResponse adAutofillGetResponse2, String str, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l1 = adAutofillGetResponse;
        this.s0 = adAutofillGetResponse2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(ContactMaFWidgetVM contactMaFWidgetVM, String str, C1074770e4h c1074770e4h, int i) {
        super(1);
        this.$t = i;
        this.l1 = contactMaFWidgetVM;
        this.s0 = str;
        this.l2 = c1074770e4h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S1200000_16(String str, String str2, C622570ObP c622570ObP, Function1<? super C1023640ckE, Unit> function1) {
        super(1);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c622570ObP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1200000_16(String str, Integer num, Long l, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
        this.l2 = l;
    }
}
