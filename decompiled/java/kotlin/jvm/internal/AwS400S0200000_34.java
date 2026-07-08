package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.ActivityC2196911AyX;
import X.C069P;
import X.C09AY;
import X.C0I0B;
import X.C0KPG;
import X.C0XGR;
import X.C0ZML;
import X.C1054060dXI;
import X.C1155860gBU;
import X.C11S5;
import X.C1212680hf8;
import X.C123100dR;
import X.C1232830iBd;
import X.C1232850iBf;
import X.C1236610iHj;
import X.C12ER;
import X.C1326305Gz;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1397650mTT;
import X.C1397660mTU;
import X.C13LP;
import X.C1440005kM;
import X.C1572910r29;
import X.C15O7;
import X.C1614530s7H;
import X.C1844400y62;
import X.C1909107dp;
import X.C19489311Mt;
import X.C197039127h;
import X.C19EG;
import X.C1B3M;
import X.C1B4X;
import X.C1BLC;
import X.C1BS0;
import X.C1BSM;
import X.C1BT4;
import X.C1BTQ;
import X.C1BV2;
import X.C1BXC;
import X.C1BXD;
import X.C1DEV;
import X.C20656615sK;
import X.C20684815ws;
import X.C2162308dZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2192231Aqz;
import X.C2195221Avo;
import X.C2196051Ax9;
import X.C2196061AxA;
import X.C2197431AzN;
import X.C2197471AzR;
import X.C2197481AzS;
import X.C2197681Azm;
import X.C2197731Azr;
import X.C2201941BFw;
import X.C2202101BGm;
import X.C2206411BXb;
import X.C2206521BXm;
import X.C2206571BXr;
import X.C2214211BlL;
import X.C2214751BmD;
import X.C2214801BmI;
import X.C2215381BnE;
import X.C2216061BoK;
import X.C2216071BoL;
import X.C2216341Bom;
import X.C2216431Bov;
import X.C2216441Bow;
import X.C2238031Cif;
import X.C2238041Cig;
import X.C2238051Cih;
import X.C2238141Ciq;
import X.C2238171Cit;
import X.C2238181Ciu;
import X.C2238251Cj1;
import X.C2246381Cw8;
import X.C2344009Gk;
import X.C294000Bfi;
import X.C298480Bmw;
import X.C418440Gaw;
import X.C520050KaR;
import X.C571810Mbj;
import X.C637220Oz2;
import X.C736460Sui;
import X.C786410Ut5;
import X.C814420VxA;
import X.C829150Wfp;
import X.C830530Wi3;
import X.C888460YtI;
import X.ConditionC2216081BoM;
import X.DialogC1390150mHN;
import X.EnumC1236600iHi;
import X.EnumC1841270y0z;
import X.EnumC19415410xc;
import X.EnumC21632119lH;
import X.EnumC2193681AtK;
import X.EnumC2197791Azx;
import X.EnumC2202541BIe;
import X.EnumC2246361Cw6;
import X.InterfaceC1177250gjz;
import X.InterfaceC214902198i;
import X.InterfaceC2194541Aui;
import X.InterfaceC2194561Auk;
import X.InterfaceC2214261BlQ;
import X.InterfaceC2214741BmC;
import X.InterfaceC2214761BmE;
import X.InterfaceC2238201Ciw;
import X.InterfaceC634840OvC;
import Y.ACListenerS136S0200000_34;
import Y.ACallableS257S0200000_34;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS134S0100000_34;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.ss.android.IBootFinishEngine;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMProfileBridge;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics;
import com.ss.android.ugc.aweme.minis.model.payment.MinisTierInfo;
import com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment;
import com.ss.android.ugc.aweme.minis.payment.data.MinisRechargeSheetParams;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profilebanner.data.HighLightInfo;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerModel;
import com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl;
import com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService;
import com.ss.android.ugc.aweme.service.IPaidContentBannerService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.ButtonInfo;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel;
import com.ss.android.ugc.profile.platform.base.data.DialogButtonAction;
import com.ss.android.ugc.profile.platform.base.data.DialogButtonModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes35.dex */
public class AwS400S0200000_34 extends C09AY implements Function1 {
    public final int $t;
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
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        ((AIGCPictureUploadHandler) awS400S0200000_34.l0).LJI(((Number) obj).floatValue(), (DialogC1390150mHN) awS400S0200000_34.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) obj;
        Object obj2 = (InterfaceC214902198i) awS400S0200000_34.l0;
        if (obj2 instanceof Fragment) {
            AbstractC1387200mCc c1844400y62 = new C1844400y62((Fragment) obj2);
            C520050KaR c520050KaR = new C520050KaR(c1844400y62);
            C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
            C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
            if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                c1844400y62 = abstractC1387200mCc2;
            } else {
                synchronized (c830530Wi3) {
                    try {
                        C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                        if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                            c1844400y62 = abstractC1387200mCc;
                        } else {
                            c830530Wi3.put(c520050KaR, c520050KaR);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            interfaceC2214261BlQ.LJIJ(c1844400y62, (Bundle) awS400S0200000_34.l1);
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj2);
        sbLIZ.append(" is not a Fragment!");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final Object invoke$10(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 1 && iIntValue != 2) {
            if (iIntValue == 3) {
                ((C2238051Cih) awS400S0200000_34.l0).LLILLJJLI.LIZ.storeLong("last_click_close_time", System.currentTimeMillis());
            }
        } else {
            ((C2238051Cih) awS400S0200000_34.l0).getClass();
            C2238051Cih.LJIIL("close_button");
            ((C2238051Cih) awS400S0200000_34.l0).LLILLJJLI.LIZ.storeLong("last_click_close_time", System.currentTimeMillis());
            ((C2238051Cih) awS400S0200000_34.l0).LLILLJJLI.LIZ.storeBoolean("is_click_quit", true);
        }
        ((C20656615sK) awS400S0200000_34.l1).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C1054060dXI c1054060dXI = C1054060dXI.LIZ;
        Context context = (Context) awS400S0200000_34.l0;
        String str = ((C2214801BmI) ((InterfaceC2214761BmE) awS400S0200000_34.l1)).LIZ;
        c1054060dXI.getClass();
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.valueOf(C2162308dZ.LJFF(context, str)));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C1054060dXI c1054060dXI = C1054060dXI.LIZ;
        Context context = (Context) awS400S0200000_34.l0;
        String str = ((C2214751BmD) ((InterfaceC2214761BmE) awS400S0200000_34.l1)).LIZIZ;
        c1054060dXI.getClass();
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.valueOf(C1054060dXI.LIZJ(context, UriProtector.parse(str), null)));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C2215381BnE c2215381BnE = C2215381BnE.LIZ;
        Context context = (Context) awS400S0200000_34.l0;
        DialogButtonAction buttonAction = ((DialogButtonModel) awS400S0200000_34.l1).getButtonAction();
        Boolean dismissAfterClick = ((DialogButtonModel) awS400S0200000_34.l1).getDismissAfterClick();
        c2215381BnE.getClass();
        C2215381BnE.LIZ((C1397660mTU) obj, context, buttonAction, dismissAfterClick);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C2215381BnE c2215381BnE = C2215381BnE.LIZ;
        Context context = (Context) awS400S0200000_34.l0;
        DialogButtonAction buttonAction = ((DialogButtonModel) awS400S0200000_34.l1).getButtonAction();
        Boolean dismissAfterClick = ((DialogButtonModel) awS400S0200000_34.l1).getDismissAfterClick();
        c2215381BnE.getClass();
        C2215381BnE.LIZ((C1397660mTU) obj, context, buttonAction, dismissAfterClick);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        String remoteButtonText;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        for (DialogButtonModel dialogButtonModel : (List) awS400S0200000_34.l0) {
            Integer buttonStyle = dialogButtonModel.getButtonStyle();
            if (buttonStyle != null) {
                if (buttonStyle.intValue() == 0) {
                    String remoteButtonText2 = dialogButtonModel.getRemoteButtonText();
                    if (remoteButtonText2 != null) {
                        c1397630mTR.LIZJ(0, remoteButtonText2, new AwS400S0200000_34((Context) awS400S0200000_34.l1, dialogButtonModel, 13));
                    }
                } else if (buttonStyle.intValue() == 1 && (remoteButtonText = dialogButtonModel.getRemoteButtonText()) != null) {
                    c1397630mTR.LIZJ(1, remoteButtonText, new AwS400S0200000_34((Context) awS400S0200000_34.l1, dialogButtonModel, 14));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C2215381BnE c2215381BnE = C2215381BnE.LIZ;
        Context context = (Context) awS400S0200000_34.l0;
        DialogButtonAction buttonAction = ((DialogButtonModel) awS400S0200000_34.l1).getButtonAction();
        Boolean dismissAfterClick = ((DialogButtonModel) awS400S0200000_34.l1).getDismissAfterClick();
        c2215381BnE.getClass();
        C2215381BnE.LIZ((C1397660mTU) obj, context, buttonAction, dismissAfterClick);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C2215381BnE c2215381BnE = C2215381BnE.LIZ;
        Context context = (Context) awS400S0200000_34.l0;
        DialogButtonAction buttonAction = ((DialogButtonModel) awS400S0200000_34.l1).getButtonAction();
        Boolean dismissAfterClick = ((DialogButtonModel) awS400S0200000_34.l1).getDismissAfterClick();
        c2215381BnE.getClass();
        C2215381BnE.LIZ((C1397660mTU) obj, context, buttonAction, dismissAfterClick);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C2215381BnE c2215381BnE = C2215381BnE.LIZ;
        Context context = (Context) awS400S0200000_34.l0;
        DialogButtonAction buttonAction = ((DialogButtonModel) awS400S0200000_34.l1).getButtonAction();
        Boolean dismissAfterClick = ((DialogButtonModel) awS400S0200000_34.l1).getDismissAfterClick();
        c2215381BnE.getClass();
        C2215381BnE.LIZ((C1397660mTU) obj, context, buttonAction, dismissAfterClick);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        String str;
        int iIntValue = ((Number) obj).intValue();
        ((C20656615sK) awS400S0200000_34.l0).LIZ();
        if (iIntValue == 2) {
            ((C2238041Cig) awS400S0200000_34.l1).LLILZ.LIZ(((IPaidContentAwareBannerService) ((C2238041Cig) awS400S0200000_34.l1).LLILZLL.getValue()).LIZLLL().LJJIJIIJI(C11S5.LIZ()).LJJIIJ());
        } else {
            if (iIntValue != 0) {
                if (iIntValue != 2) {
                    str = "";
                }
            } else {
                str = "auto";
            }
            C1572910r29 c1572910r29 = C1572910r29.LIZ;
            C2238041Cig c2238041Cig = (C2238041Cig) awS400S0200000_34.l1;
            String str2 = c2238041Cig.LLILLL.awareBannerSchema;
            String str3 = c2238041Cig.LL;
            String str4 = c2238041Cig.LLILLJJLI;
            c1572910r29.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("campaign_id", str2);
            c2344009Gk.LJIIIIZZ("position", str4);
            c2344009Gk.LJIIIIZZ("enter_from", str3);
            c2344009Gk.LJIIIIZZ("type", str);
            C20684815ws.LJIILLIIL("paid_content_profile_banner_dismiss_mobile_creation", c2344009Gk.LIZ);
            return Unit.LIZ;
        }
        str = "click_close";
        C1572910r29 c1572910r292 = C1572910r29.LIZ;
        C2238041Cig c2238041Cig2 = (C2238041Cig) awS400S0200000_34.l1;
        String str22 = c2238041Cig2.LLILLL.awareBannerSchema;
        String str32 = c2238041Cig2.LL;
        String str42 = c2238041Cig2.LLILLJJLI;
        c1572910r292.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("campaign_id", str22);
        c2344009Gk2.LJIIIIZZ("position", str42);
        c2344009Gk2.LJIIIIZZ("enter_from", str32);
        c2344009Gk2.LJIIIIZZ("type", str);
        C20684815ws.LJIILLIIL("paid_content_profile_banner_dismiss_mobile_creation", c2344009Gk2.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) obj;
        Object obj2 = (InterfaceC214902198i) awS400S0200000_34.l0;
        if (obj2 instanceof Fragment) {
            AbstractC1387200mCc c1844400y62 = new C1844400y62((Fragment) obj2);
            C520050KaR c520050KaR = new C520050KaR(c1844400y62);
            C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
            C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
            if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                c1844400y62 = abstractC1387200mCc2;
            } else {
                synchronized (c830530Wi3) {
                    try {
                        C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                        if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                            c1844400y62 = abstractC1387200mCc;
                        } else {
                            c830530Wi3.put(c520050KaR, c520050KaR);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            interfaceC2214261BlQ.LJIILLIIL(c1844400y62, (Bundle) awS400S0200000_34.l1);
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj2);
        sbLIZ.append(" is not a Fragment!");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final Object invoke$20(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        String str;
        int iIntValue = ((Number) obj).intValue();
        ((C20656615sK) awS400S0200000_34.l0).LIZ();
        if (iIntValue != 2 && iIntValue != 3) {
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    str = "down_slide";
                }
            } else {
                str = "auto";
            }
            C2238141Ciq c2238141Ciq = C2238141Ciq.LIZ;
            C2238031Cif c2238031Cif = (C2238031Cif) awS400S0200000_34.l1;
            String str2 = c2238031Cif.LLILLL.paidContentBannerCampaignId;
            String str3 = c2238031Cif.LL;
            String str4 = c2238031Cif.LLILLJJLI;
            c2238141Ciq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("campaign_id", str2);
            c2344009Gk.LJIIIIZZ("position", str4);
            c2344009Gk.LJIIIIZZ("enter_from", str3);
            c2344009Gk.LJIIIIZZ("type", str);
            C20684815ws.LJIILLIIL("paid_content_profile_banner_dismiss", c2344009Gk.LIZ);
            return Unit.LIZ;
        }
        ((C2238031Cif) awS400S0200000_34.l1).LLILZ.LIZ(((IPaidContentBannerService) ((C2238031Cif) awS400S0200000_34.l1).LLILZLL.getValue()).LIZIZ(((C2238031Cif) awS400S0200000_34.l1).LLILLL.paidContentBannerCampaignId).LJJIJIIJI(C11S5.LIZ()).LJJIIJ());
        if (iIntValue != 2) {
            if (iIntValue != 3) {
                str = "";
            } else {
                str = "click_cta";
            }
        } else {
            str = "click_close";
        }
        C2238141Ciq c2238141Ciq2 = C2238141Ciq.LIZ;
        C2238031Cif c2238031Cif2 = (C2238031Cif) awS400S0200000_34.l1;
        String str22 = c2238031Cif2.LLILLL.paidContentBannerCampaignId;
        String str32 = c2238031Cif2.LL;
        String str42 = c2238031Cif2.LLILLJJLI;
        c2238141Ciq2.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("campaign_id", str22);
        c2344009Gk2.LJIIIIZZ("position", str42);
        c2344009Gk2.LJIIIIZZ("enter_from", str32);
        c2344009Gk2.LJIIIIZZ("type", str);
        C20684815ws.LJIILLIIL("paid_content_profile_banner_dismiss", c2344009Gk2.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS400S0200000_34 awS400S0200000_34, Object obj) throws InterruptedException {
        ((C2216061BoK) awS400S0200000_34.l0).LJFF(new C1212680hf8((C2216071BoL) awS400S0200000_34.l1));
        C12ER c12erLIZ = C571810Mbj.LIZ();
        int size = ((C2216061BoK) awS400S0200000_34.l0).LIZJ.size();
        c12erLIZ.getClass();
        C12ER.LIZ(size, "postOperationGet: wait pending operation executed");
        ((ConditionC2216081BoM) obj).await();
        C12ER c12erLIZ2 = C571810Mbj.LIZ();
        int size2 = ((C2216061BoK) awS400S0200000_34.l0).LIZJ.size();
        c12erLIZ2.getClass();
        C12ER.LIZ(size2, "postOperationGet: wake up");
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        ((C2238171Cit) awS400S0200000_34.l0).LIZ((FrameLayout) obj, ((OutreachBannerData) awS400S0200000_34.l1).iconUrl);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C2238171Cit c2238171Cit = (C2238171Cit) awS400S0200000_34.l0;
        c2238171Cit.LJ = false;
        c2238171Cit.LJII = null;
        c2238171Cit.LJIIIZ = null;
        if (iIntValue == 1 || iIntValue == 2) {
            C20684815ws.LJFF().execute(new ARunnableS134S0100000_34((OutreachBannerData) awS400S0200000_34.l1, 64));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        C786410Ut5.LJJJJIZL(frameLayout);
        ((C2238171Cit) awS400S0200000_34.l0).LIZ(frameLayout, ((OutreachBannerData) awS400S0200000_34.l1).iconUrl);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C786410Ut5.S7((RelativeLayout) obj, new ACListenerS136S0200000_34((C2238171Cit) awS400S0200000_34.l0, (OutreachBannerData) awS400S0200000_34.l1, 8));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        C197039127h c197039127h = (C197039127h) obj;
        ButtonInfo buttonInfo = ((OutreachBannerData) awS400S0200000_34.l0).buttonInfo;
        String str2 = null;
        if (buttonInfo != null) {
            str = buttonInfo.title;
        } else {
            str = null;
        }
        c197039127h.setText(str);
        C786410Ut5.U8(c197039127h, new ACListenerS136S0200000_34((C2238171Cit) awS400S0200000_34.l1, (OutreachBannerData) awS400S0200000_34.l0, 9));
        ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i = 0;
        if (marginLayoutParams != null) {
            if (!Intrinsics.LJFF(((OutreachBannerData) awS400S0200000_34.l0).closeButton, Boolean.FALSE)) {
                iLIZIZ = 0;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            marginLayoutParams.setMarginEnd(iLIZIZ);
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.J6(c197039127h, marginLayoutParams);
        ButtonInfo buttonInfo2 = ((OutreachBannerData) awS400S0200000_34.l0).buttonInfo;
        if (buttonInfo2 != null) {
            str2 = buttonInfo2.title;
        }
        if (!C736460Sui.LIZIZ(str2)) {
            i = 8;
        }
        C786410Ut5.LLLLLLJ(c197039127h, i);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        ((Function0) awS400S0200000_34.l0).invoke();
        IImImproveBlockExperienceAnalytics.LIZ.getClass();
        IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
        if (iImImproveBlockExperienceAnalyticsLIZ != null) {
            BlockUserController blockUserController = (BlockUserController) awS400S0200000_34.l1;
            String str = blockUserController.LLILLL;
            String str2 = blockUserController.LLILZ;
            String uid = blockUserController.LLILLJJLI.getUid();
            if (uid == null) {
                uid = "";
            }
            BlockUserController blockUserController2 = (BlockUserController) awS400S0200000_34.l1;
            String str3 = blockUserController2.LLIZLLLIL;
            String str4 = blockUserController2.LLJ;
            String str5 = blockUserController2.LLJI;
            iImImproveBlockExperienceAnalyticsLIZ.LIZIZ(C0I0B.LJFF.LIZIZ(), Integer.valueOf(BlockUserController.LJI(blockUserController2.LLILLJJLI)), str, str2, uid, str3, str4, str5);
        }
        if (!C298480Bmw.LIZ()) {
            C888460YtI c888460YtI = new C888460YtI();
            BlockUserController blockUserController3 = (BlockUserController) awS400S0200000_34.l1;
            C2201941BFw c2201941BFw = IMUser.Companion;
            IMUser iMUser = blockUserController3.LLILLJJLI;
            c2201941BFw.getClass();
            c888460YtI.LIZ = C2201941BFw.LJII(iMUser);
            C1440005kM.LIZ(c888460YtI);
        }
        IMProfileBridge.LIZ.getClass();
        IMProfileBridge iMProfileBridgeLIZ = C0ZML.LIZ();
        if (iMProfileBridgeLIZ != null) {
            ((BlockUserController) awS400S0200000_34.l1).LLILLJJLI.getUid();
            ((BlockUserController) awS400S0200000_34.l1).LLILLJJLI.getNickName();
            iMProfileBridgeLIZ.LIZ();
        }
        BlockUserController blockUserController4 = (BlockUserController) awS400S0200000_34.l1;
        String uid2 = blockUserController4.LLILLJJLI.getUid();
        IMContactApi.LIZ.getClass();
        blockUserController4.LIZJ(1, uid2, C069P.LIZ().LIZLLL().LIZJ(((BlockUserController) awS400S0200000_34.l1).LLILLJJLI));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        ((Function0) awS400S0200000_34.l0).invoke();
        IImImproveBlockExperienceAnalytics.LIZ.getClass();
        IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
        if (iImImproveBlockExperienceAnalyticsLIZ != null) {
            BlockUserController blockUserController = (BlockUserController) awS400S0200000_34.l1;
            String str = blockUserController.LLILLL;
            String str2 = blockUserController.LLILZ;
            String uid = blockUserController.LLILLJJLI.getUid();
            if (uid == null) {
                uid = "";
            }
            BlockUserController blockUserController2 = (BlockUserController) awS400S0200000_34.l1;
            String str3 = blockUserController2.LLIZLLLIL;
            String str4 = blockUserController2.LLJ;
            String str5 = blockUserController2.LLJI;
            iImImproveBlockExperienceAnalyticsLIZ.LIZIZ(C0I0B.LJFF.LIZIZ(), Integer.valueOf(BlockUserController.LJI(blockUserController2.LLILLJJLI)), str, str2, uid, str3, str4, str5);
        }
        if (!C298480Bmw.LIZ()) {
            C888460YtI c888460YtI = new C888460YtI();
            BlockUserController blockUserController3 = (BlockUserController) awS400S0200000_34.l1;
            C2201941BFw c2201941BFw = IMUser.Companion;
            IMUser iMUser = blockUserController3.LLILLJJLI;
            c2201941BFw.getClass();
            c888460YtI.LIZ = C2201941BFw.LJII(iMUser);
            C1440005kM.LIZ(c888460YtI);
        }
        IMProfileBridge.LIZ.getClass();
        IMProfileBridge iMProfileBridgeLIZ = C0ZML.LIZ();
        if (iMProfileBridgeLIZ != null) {
            ((BlockUserController) awS400S0200000_34.l1).LLILLJJLI.getUid();
            ((BlockUserController) awS400S0200000_34.l1).LLILLJJLI.getNickName();
            iMProfileBridgeLIZ.LIZ();
        }
        BlockUserController blockUserController4 = (BlockUserController) awS400S0200000_34.l1;
        String uid2 = blockUserController4.LLILLJJLI.getUid();
        IMContactApi.LIZ.getClass();
        blockUserController4.LIZJ(1, uid2, C069P.LIZ().LIZLLL().LIZJ(((BlockUserController) awS400S0200000_34.l1).LLILLJJLI));
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        if (((BlockUserController) awS400S0200000_34.l0).LJII()) {
            c1397620mTQ.LJ(R.string.fte, new AwS400S0200000_34((BlockUserController) awS400S0200000_34.l0, (Function0) awS400S0200000_34.l1, 27));
        } else {
            c1397620mTQ.LJ(2131835951, new AwS400S0200000_34((BlockUserController) awS400S0200000_34.l0, (Function0) awS400S0200000_34.l1, 28));
        }
        c1397620mTQ.LJII(R.string.f1_, new AwS613S0100000_34((BlockUserController) awS400S0200000_34.l0, 104));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) obj;
        Object obj2 = (InterfaceC214902198i) awS400S0200000_34.l0;
        if (obj2 instanceof Fragment) {
            AbstractC1387200mCc c1844400y62 = new C1844400y62((Fragment) obj2);
            C520050KaR c520050KaR = new C520050KaR(c1844400y62);
            C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
            C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
            if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                c1844400y62 = abstractC1387200mCc2;
            } else {
                synchronized (c830530Wi3) {
                    try {
                        C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                        if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                            c1844400y62 = abstractC1387200mCc;
                        } else {
                            c830530Wi3.put(c520050KaR, c520050KaR);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            interfaceC2214261BlQ.LJIIL(c1844400y62, (Bundle) awS400S0200000_34.l1);
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj2);
        sbLIZ.append(" is not a Fragment!");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final Object invoke$30(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        BlockUserController blockUserController = (BlockUserController) awS400S0200000_34.l0;
        blockUserController.getClass();
        IMContactApi.LIZ.getClass();
        blockUserController.LIZJ(0, blockUserController.LLILLJJLI.getUid(), C069P.LIZ().LIZLLL().LIZJ(blockUserController.LLILLJJLI));
        ((Function0) awS400S0200000_34.l1).invoke();
        IMProfileBridge.LIZ.getClass();
        IMProfileBridge iMProfileBridgeLIZ = C0ZML.LIZ();
        if (iMProfileBridgeLIZ != null) {
            ((BlockUserController) awS400S0200000_34.l0).LLILLJJLI.getUid();
            ((BlockUserController) awS400S0200000_34.l0).LLILLJJLI.getNickName();
            iMProfileBridgeLIZ.LIZ();
        }
        IImImproveBlockExperienceAnalytics.LIZ.getClass();
        IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
        if (iImImproveBlockExperienceAnalyticsLIZ != null) {
            BlockUserController blockUserController2 = (BlockUserController) awS400S0200000_34.l0;
            iImImproveBlockExperienceAnalyticsLIZ.LJFF(C0I0B.LJFF.LIZIZ(), blockUserController2.LLILLL, blockUserController2.LLILZ, blockUserController2.LLIZLLLIL, blockUserController2.LLJ, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        BlockUserController blockUserController = (BlockUserController) awS400S0200000_34.l0;
        blockUserController.getClass();
        IMContactApi.LIZ.getClass();
        blockUserController.LIZJ(0, blockUserController.LLILLJJLI.getUid(), C069P.LIZ().LIZLLL().LIZJ(blockUserController.LLILLJJLI));
        ((Function0) awS400S0200000_34.l1).invoke();
        IMProfileBridge.LIZ.getClass();
        IMProfileBridge iMProfileBridgeLIZ = C0ZML.LIZ();
        if (iMProfileBridgeLIZ != null) {
            ((BlockUserController) awS400S0200000_34.l0).LLILLJJLI.getUid();
            ((BlockUserController) awS400S0200000_34.l0).LLILLJJLI.getNickName();
            iMProfileBridgeLIZ.LIZ();
        }
        IImImproveBlockExperienceAnalytics.LIZ.getClass();
        IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
        if (iImImproveBlockExperienceAnalyticsLIZ != null) {
            BlockUserController blockUserController2 = (BlockUserController) awS400S0200000_34.l0;
            iImImproveBlockExperienceAnalyticsLIZ.LJFF(C0I0B.LJFF.LIZIZ(), blockUserController2.LLILLL, blockUserController2.LLILZ, blockUserController2.LLIZLLLIL, blockUserController2.LLJ, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        if (((BlockUserController) awS400S0200000_34.l0).LJII()) {
            c1397620mTQ.LJFF(R.string.fte, new AwS400S0200000_34((BlockUserController) awS400S0200000_34.l0, (Function0) awS400S0200000_34.l1, 30));
        } else {
            c1397620mTQ.LJFF(2131835958, new AwS400S0200000_34((BlockUserController) awS400S0200000_34.l0, (Function0) awS400S0200000_34.l1, 31));
        }
        c1397620mTQ.LJII(R.string.f1_, new AwS613S0100000_34((BlockUserController) awS400S0200000_34.l0, 106));
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        DFInstallBlankActivity dFInstallBlankActivity = (DFInstallBlankActivity) awS400S0200000_34.l0;
        C1BLC c1blc = (C1BLC) awS400S0200000_34.l1;
        dFInstallBlankActivity.getClass();
        C15O7.LIZIZ(new ACallableS257S0200000_34(dFInstallBlankActivity, c1blc, 4), C15O7.LJIIIIZZ, null);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        DFInstallBlankActivity dFInstallBlankActivity = (DFInstallBlankActivity) awS400S0200000_34.l0;
        C1BLC c1blc = (C1BLC) awS400S0200000_34.l1;
        dFInstallBlankActivity.getClass();
        DFInstallBlankActivity.LLLLZI(c1blc, true);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131840579, new AwS400S0200000_34((DFInstallBlankActivity) awS400S0200000_34.l0, (C1BLC) awS400S0200000_34.l1, 33));
        c1397620mTQ.LJII(2131840580, new AwS400S0200000_34((DFInstallBlankActivity) awS400S0200000_34.l0, (C1BLC) awS400S0200000_34.l1, 34));
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        InterfaceC2238201Ciw interfaceC2238201Ciw;
        int iIntValue = ((Number) obj).intValue();
        C2238181Ciu c2238181Ciu = (C2238181Ciu) awS400S0200000_34.l0;
        ProfileBannerInfoModel profileBannerInfoModel = (ProfileBannerInfoModel) awS400S0200000_34.l1;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                InterfaceC2238201Ciw interfaceC2238201Ciw2 = c2238181Ciu.LIZ;
                if (interfaceC2238201Ciw2 != null) {
                    interfaceC2238201Ciw2.LIZ(profileBannerInfoModel, "click_other");
                }
            } else {
                InterfaceC2238201Ciw interfaceC2238201Ciw3 = c2238181Ciu.LIZ;
                if (interfaceC2238201Ciw3 != null) {
                    interfaceC2238201Ciw3.LIZIZ(profileBannerInfoModel, "close_x", false);
                }
                if (!profileBannerInfoModel.dismissAfterClick && (interfaceC2238201Ciw = c2238181Ciu.LIZ) != null) {
                    interfaceC2238201Ciw.LIZ(profileBannerInfoModel, "close_x");
                }
            }
        } else {
            InterfaceC2238201Ciw interfaceC2238201Ciw4 = c2238181Ciu.LIZ;
            if (interfaceC2238201Ciw4 != null) {
                interfaceC2238201Ciw4.LIZ(profileBannerInfoModel, "click_other");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        String str;
        C2238181Ciu c2238181Ciu = (C2238181Ciu) awS400S0200000_34.l0;
        Context context = ((View) obj).getContext();
        HighLightInfo highLightInfo = ((ProfileBannerInfoModel) awS400S0200000_34.l1).highLightInfo;
        if (highLightInfo != null) {
            str = highLightInfo.schemaUrl;
        } else {
            str = null;
        }
        c2238181Ciu.getClass();
        C2238181Ciu.LIZLLL(context, str);
        InterfaceC2238201Ciw interfaceC2238201Ciw = ((C2238181Ciu) awS400S0200000_34.l0).LIZ;
        if (interfaceC2238201Ciw != null) {
            interfaceC2238201Ciw.LIZIZ((ProfileBannerInfoModel) awS400S0200000_34.l1, "click_rich_text", true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C2216441Bow c2216441Bow = (C2216441Bow) awS400S0200000_34.l0;
        ((Map.Entry) awS400S0200000_34.l1).getKey();
        c2216441Bow.LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C1BSM c1bsm = (C1BSM) obj;
        String str = ((C1BTQ) awS400S0200000_34.l0).LIZ.LJI;
        if (str != null && (!TextUtils.isEmpty(str))) {
            MapStyleOptions mapStyleOptions = new MapStyleOptions(str);
            c1bsm.getClass();
            try {
                c1bsm.LIZ.LLILLL(mapStyleOptions);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C829150Wfp(e);
            }
        }
        ((C1BTQ) awS400S0200000_34.l0).LIZ.getClass();
        c1bsm.getClass();
        try {
            c1bsm.LIZ.X0();
            C1BT4 c1bt4LIZJ = c1bsm.LIZJ();
            ((C1BTQ) awS400S0200000_34.l0).LIZ.getClass();
            c1bt4LIZJ.getClass();
            try {
                c1bt4LIZJ.LIZ.LLLLIL();
                C1BT4 c1bt4LIZJ2 = c1bsm.LIZJ();
                ((C1BTQ) awS400S0200000_34.l0).LIZ.getClass();
                c1bt4LIZJ2.getClass();
                try {
                    c1bt4LIZJ2.LIZ.LL();
                    Boolean bool = ((C1BTQ) awS400S0200000_34.l0).LIZ.LJIIIIZZ;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        C1BT4 c1bt4LIZJ3 = c1bsm.LIZJ();
                        c1bt4LIZJ3.getClass();
                        try {
                            c1bt4LIZJ3.LIZ.S0(zBooleanValue);
                        } catch (RemoteException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw new C829150Wfp(e2);
                        }
                    }
                    try {
                        c1bsm.LIZ.LLLFF(((C1BTQ) awS400S0200000_34.l0).LIZ.LJII);
                        ((Function1) awS400S0200000_34.l1).invoke(new C1BS0(c1bsm));
                        return Unit.LIZ;
                    } catch (RemoteException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        throw new C829150Wfp(e3);
                    }
                } catch (RemoteException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw new C829150Wfp(e4);
                }
            } catch (RemoteException e5) {
                TryCatchGuardChecker.doCheck(e5);
                throw new C829150Wfp(e5);
            }
        } catch (RemoteException e6) {
            TryCatchGuardChecker.doCheck(e6);
            throw new C829150Wfp(e6);
        }
    }

    public static final Object invoke$4(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) obj;
        Object obj2 = (InterfaceC214902198i) awS400S0200000_34.l0;
        if (obj2 instanceof Fragment) {
            AbstractC1387200mCc c1844400y62 = new C1844400y62((Fragment) obj2);
            C520050KaR c520050KaR = new C520050KaR(c1844400y62);
            C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
            C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
            if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                c1844400y62 = abstractC1387200mCc2;
            } else {
                synchronized (c830530Wi3) {
                    try {
                        C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                        if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                            c1844400y62 = abstractC1387200mCc;
                        } else {
                            c830530Wi3.put(c520050KaR, c520050KaR);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            interfaceC2214261BlQ.LJI(c1844400y62, (Bundle) awS400S0200000_34.l1);
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj2);
        sbLIZ.append(" is not a Fragment!");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final Object invoke$40(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        super/*X.1Ar1*/.LJII((String) obj, (String[]) awS400S0200000_34.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        super/*X.1Ar1*/.LJIIIZ((String) obj, (Set) awS400S0200000_34.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        String str;
        String str2 = (String) obj;
        C1B3M c1b3m = (C1B3M) awS400S0200000_34.l0;
        Bundle bundle = (Bundle) awS400S0200000_34.l1;
        c1b3m.getClass();
        EventBus.LIZLLL().LJJI(c1b3m);
        HashMap map = new HashMap();
        map.putAll(new C2344009Gk().LIZ);
        HashMap<String, Object> map2 = new HashMap<>();
        String string = bundle.getString("ttoclid");
        map.put("code", -2);
        String str3 = c1b3m.LIZ;
        if (str3 != null) {
            map.put("channel", str3);
        }
        String str4 = c1b3m.LIZIZ;
        if (str4 != null) {
            map.put("scopes", str4);
        }
        String str5 = c1b3m.LJI;
        if (str5 != null) {
            map.put("enter_method", str5);
        }
        if (string != null) {
            map.put("ttoclid", string);
        }
        map.put("auto_auth", 0);
        c1b3m.LIZIZ(map2);
        Map<String, String> map3 = c1b3m.LJIIIIZZ;
        if (map3 != null) {
            map.putAll(map3);
        }
        C1326305Gz.LIZ.getClass();
        C1326305Gz.LIZ("jump_open_auth_page", map, map2);
        c1b3m.LIZJ(-2, str2);
        String value = EnumC2193681AtK.ACCESS_DENIED.getValue();
        String string2 = bundle.getString("ttoclid");
        HashMap map4 = new HashMap();
        map4.putAll(new C2344009Gk().LIZ);
        map4.put("code", -2);
        map4.put("enter_source", bundle.getString("_bytedance_params_enter_source"));
        map4.put("result", "fail");
        map4.put("error_code", -2);
        map4.put("error_message", value);
        map4.put("auto_auth", 0);
        map4.put("pattern", bundle.getString("pattern", ""));
        if (string2 != null) {
            map4.put("ttoclid", string2);
        }
        String str6 = c1b3m.LIZIZ;
        if (str6 != null) {
            if (a0.LJJIIZI(str6, "user.info.open_id", false)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map4.put("is_silent_auth", str);
        }
        C1326305Gz.LIZ("auth_result", map4, null);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        boolean z;
        Activity activityLIZLLL;
        C2196061AxA c2196061AxA = (C2196061AxA) obj;
        String str = c2196061AxA.LIZ;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String clientKey = ((InterfaceC2194541Aui) awS400S0200000_34.l0).getClientKey();
            String clientKey2 = ((InterfaceC2194541Aui) awS400S0200000_34.l0).getClientKey();
            InterfaceC634840OvC interfaceC634840OvC = ((C2196051Ax9) awS400S0200000_34.l1).IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                activityLIZLLL = interfaceC634840OvC.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            C1236610iHj.LIZIZ(clientKey, "auth_success", CardStruct.IStatusCode.DEFAULT, C1236610iHj.LIZ(clientKey2, true, activityLIZLLL instanceof ActivityC2196911AyX), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
        }
        InterfaceC2194561Auk interfaceC2194561Auk = (InterfaceC2194561Auk) C1909107dp.LIZJ(InterfaceC2194561Auk.class, null);
        interfaceC2194561Auk.setAuthCode(c2196061AxA.LIZ);
        interfaceC2194561Auk.setScopes(c2196061AxA.LIZIZ);
        interfaceC2194561Auk.setErrorCode(c2196061AxA.LIZJ);
        interfaceC2194561Auk.setErrorMsg(c2196061AxA.LIZLLL);
        interfaceC2194561Auk.setStatus(c2196061AxA.LJ);
        String str2 = "";
        if (Intrinsics.LJFF(interfaceC2194561Auk.getErrorCode(), 0) && (C123100dR.LIZ(interfaceC2194561Auk.getAuthCode()) || C123100dR.LIZ(interfaceC2194561Auk.getStatus()))) {
            CompletionBlock<InterfaceC2194561Auk> completionBlock = ((C2196051Ax9) awS400S0200000_34.l1).LLILLL;
            if (completionBlock != null) {
                completionBlock.onSuccess(interfaceC2194561Auk, "");
            }
        } else {
            CompletionBlock<InterfaceC2194561Auk> completionBlock2 = ((C2196051Ax9) awS400S0200000_34.l1).LLILLL;
            if (completionBlock2 != null) {
                String errorMsg = interfaceC2194561Auk.getErrorMsg();
                if (errorMsg != null) {
                    str2 = errorMsg;
                }
                completionBlock2.onFailure(0, str2, interfaceC2194561Auk);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("popup_type", "skippable");
        c0xgr.LIZLLL("enter_from", ((C1BV2) awS400S0200000_34.l0).LIZIZ.LL);
        c0xgr.LIZLLL("btn_click", "continue");
        C20684815ws.LJIILLIIL("3p_offline_click", c0xgr.LIZ);
        ((Function0) awS400S0200000_34.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C1397650mTT c1397650mTT;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LIZJ(0, ((C1BV2) awS400S0200000_34.l0).LIZ.getString(2131850231), new AwS400S0200000_34((C1BV2) awS400S0200000_34.l0, (C1BV2) awS400S0200000_34.l1, (Function0<Unit>) 44));
        if (C294000Bfi.LIZ() && (c1397650mTT = (C1397650mTT) C13LP.LJJLIIIJL(c1397630mTR.LJ)) != null) {
            c1397650mTT.LIZ(new AwS607S0100000_28((C1BV2) awS400S0200000_34.l0, 380));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        if (activityResult.resultCode == -1) {
            LoginClient loginClient = ((LoginFragment) awS400S0200000_34.l0).LLILLL;
            loginClient.getClass();
            LoginClient.Companion.getClass();
            loginClient.LJIIIZ(EnumC2202541BIe.Login.toRequestCode(), activityResult.resultCode, activityResult.data);
        } else {
            ((C19EG) awS400S0200000_34.l1).finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        String str;
        String str2;
        String strSubstring = (String) obj;
        C1BXD c1bxdLIZIZ = C1BXD.LIZIZ();
        IBootFinishEngine iBootFinishEngine = (IBootFinishEngine) awS400S0200000_34.l0;
        String str3 = null;
        if (iBootFinishEngine != null) {
            iBootFinishEngine.LIZ();
            str = "BootFinishEngine";
        } else {
            str = null;
        }
        ((C1BXC) awS400S0200000_34.l1).getClass();
        if (u.LJJIIJZLJL(strSubstring, "boot_finish_task_", false)) {
            strSubstring = strSubstring.substring(17);
        }
        C2206571BXr c2206571BXr = (C2206571BXr) ((ConcurrentHashMap) ((C2206521BXm) c1bxdLIZIZ.LIZ(str)).LIZJ.LIZLLL).get(strSubstring);
        if (c2206571BXr != null) {
            str2 = new C2206411BXb(c2206571BXr.LIZJ).LIZ;
        } else {
            str2 = null;
        }
        IBootFinishEngine iBootFinishEngine2 = (IBootFinishEngine) awS400S0200000_34.l0;
        if (iBootFinishEngine2 != null) {
            iBootFinishEngine2.LJFF();
            str3 = "P1";
        }
        return Boolean.valueOf(Intrinsics.LJFF(str2, str3));
    }

    public static final Object invoke$48(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        ((C1DEV) awS400S0200000_34.l0).LIZIZ(awS400S0200000_34.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        String name;
        MusicShareStoryInputData musicShareStoryInputData = (MusicShareStoryInputData) obj;
        musicShareStoryInputData.setCoverUri((String) C13LP.LJJJLL(((C1B4X) awS400S0200000_34.l0).LIZIZ.mediaUriPaths));
        MusicModel musicModel = (MusicModel) awS400S0200000_34.l1;
        if (musicModel == null) {
            musicModel = new MusicModel();
        }
        musicShareStoryInputData.setMusic(musicModel);
        MusicModel musicModel2 = (MusicModel) awS400S0200000_34.l1;
        if (musicModel2 != null) {
            name = musicModel2.getName();
        } else {
            name = null;
        }
        musicShareStoryInputData.setSongName(name);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        int i;
        String str;
        EnumC1841270y0z enumC1841270y0z;
        String str2;
        MinisRechargeSheetParams minisRechargeSheetParams = (MinisRechargeSheetParams) obj;
        C786410Ut5.J4(((C2197431AzN) awS400S0200000_34.l0).LJ);
        C2197431AzN c2197431AzN = (C2197431AzN) awS400S0200000_34.l0;
        C2197481AzS c2197481AzS = c2197431AzN.LJIIJ;
        MinisRechargeFragment minisRechargeFragment = c2197431AzN.LIZLLL;
        if (minisRechargeFragment != null && minisRechargeFragment.iS()) {
            i = 1;
        } else {
            i = 0;
        }
        C2197431AzN c2197431AzN2 = (C2197431AzN) awS400S0200000_34.l0;
        if (c2197431AzN2.LJII) {
            str = "external";
        } else {
            str = "iap";
        }
        MinisRechargeFragment minisRechargeFragment2 = c2197431AzN2.LIZLLL;
        String string = null;
        if (minisRechargeFragment2 != null) {
            enumC1841270y0z = minisRechargeFragment2.LLJL;
        } else {
            enumC1841270y0z = null;
        }
        if (enumC1841270y0z == EnumC1841270y0z.WEB) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        C2197481AzS.LIZIZ(c2197481AzS, "tm_recharge_and_unlock_panel_pur_button_click", 0L, i, null, str, str2, 10);
        ((C2197431AzN) awS400S0200000_34.l0).LJIIIIZZ = true;
        C2197431AzN c2197431AzN3 = (C2197431AzN) awS400S0200000_34.l0;
        String str3 = minisRechargeSheetParams.tierId;
        MinisTierInfo minisTierInfo = (MinisTierInfo) awS400S0200000_34.l1;
        c2197431AzN3.LJIILJJIL(str3, minisTierInfo.sku_id, minisTierInfo.tokenType);
        C2197481AzS c2197481AzS2 = ((C2197431AzN) awS400S0200000_34.l0).LJIIJ;
        String str4 = c2197481AzS2.LJFF;
        String str5 = c2197481AzS2.LJ;
        String str6 = c2197481AzS2.LIZJ;
        C1232850iBf c1232850iBf = C2197731Azr.LJFF;
        EnumC2197791Azx enumC2197791Azx = EnumC2197791Azx.IAP;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZIZ = C2197681Azm.LIZIZ(enumC2197791Azx, null);
        Map mapLIZ = C2197681Azm.LIZ(str4, str5, str6);
        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
        String strValueOf = String.valueOf(c1232850iBf.LIZ);
        Integer num = c1232850iBf.LIZJ;
        if (num != null) {
            string = num.toString();
        }
        EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
        EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
        EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
        c1232830iBd.getClass();
        C1232830iBd.LIZ(strLIZ, "minis_pay_recharge_user_click", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisPayRechargeUserClick, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$50(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C786410Ut5.LJJZZIII(((C637220Oz2) awS400S0200000_34.l0).LIZIZ, new ARunnableS103S0200000_34((ProfileBannerModel) obj, (C2238251Cj1) awS400S0200000_34.l1, 54));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        int i;
        MinisRechargeSheetParams minisRechargeSheetParams = (MinisRechargeSheetParams) obj;
        C786410Ut5.J4(((C2197471AzR) awS400S0200000_34.l0).LJ);
        C2197471AzR c2197471AzR = (C2197471AzR) awS400S0200000_34.l0;
        C2197481AzS c2197481AzS = c2197471AzR.LJIIJ;
        MinisRechargeFragment minisRechargeFragment = c2197471AzR.LIZLLL;
        if (minisRechargeFragment != null && minisRechargeFragment.iS()) {
            i = 1;
        } else {
            i = 0;
        }
        String string = null;
        C2197481AzS.LIZIZ(c2197481AzS, "tm_recharge_panel_click", 0L, i, null, null, null, 58);
        ((C2197471AzR) awS400S0200000_34.l0).LJIIIIZZ = true;
        ((C2197471AzR) awS400S0200000_34.l0).LJIILJJIL(minisRechargeSheetParams.tierId, minisRechargeSheetParams.skuId, ((MinisTierInfo) awS400S0200000_34.l1).tokenType);
        C2197481AzS c2197481AzS2 = ((C2197471AzR) awS400S0200000_34.l0).LJIIJ;
        String str = c2197481AzS2.LJFF;
        String str2 = c2197481AzS2.LJ;
        String str3 = c2197481AzS2.LIZJ;
        C1232850iBf c1232850iBf = C2197731Azr.LJ;
        EnumC2197791Azx enumC2197791Azx = EnumC2197791Azx.IAP;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZIZ = C2197681Azm.LIZIZ(enumC2197791Azx, null);
        Map mapLIZ = C2197681Azm.LIZ(str, str2, str3);
        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
        String strValueOf = String.valueOf(c1232850iBf.LIZ);
        Integer num = c1232850iBf.LIZJ;
        if (num != null) {
            string = num.toString();
        }
        EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
        EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
        EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
        c1232830iBd.getClass();
        C1232830iBd.LIZ(strLIZ, "minis_recharge_user_click", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisRechargeUserClick, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        Object obj2 = ((C1155860gBU) obj).LIZIZ;
        if ((obj2 instanceof C0KPG) && obj2 != null) {
            ((C19489311Mt) awS400S0200000_34.l0).onSuccess(obj2);
        } else {
            SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl = (SeriesSubscriptionServiceImpl) awS400S0200000_34.l1;
            seriesSubscriptionServiceImpl.LIZ.onNext(new C1614530s7H(seriesSubscriptionServiceImpl.LIZJ, 2131835079));
            ((C19489311Mt) awS400S0200000_34.l0).onError(new IllegalStateException("iap rawResult null"));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        C2216341Bom c2216341Bom = (C2216341Bom) obj;
        c2216341Bom.LJ.put(CreativeModel.class, (CreativeModel) awS400S0200000_34.l0);
        c2216341Bom.LJ.put(VideoPublishEditModel.class, (VideoPublishEditModel) awS400S0200000_34.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS400S0200000_34 awS400S0200000_34, Object obj) {
        EnumC2246361Cw6 enumC2246361Cw6 = EnumC2246361Cw6.NORMAL;
        ProfileEditBioViewModel profileEditBioViewModel = (ProfileEditBioViewModel) awS400S0200000_34.l0;
        Editable editable = (Editable) awS400S0200000_34.l1;
        profileEditBioViewModel.getClass();
        String strVQ2 = ProfileEditBioViewModel.vQ2(editable);
        ProfileEditBioViewModel profileEditBioViewModel2 = (ProfileEditBioViewModel) awS400S0200000_34.l0;
        Editable editable2 = (Editable) awS400S0200000_34.l1;
        profileEditBioViewModel2.getClass();
        return C2246381Cw8.LIZ((C2246381Cw8) obj, null, ProfileEditBioViewModel.vQ2(editable2), strVQ2, null, null, enumC2246361Cw6, false, null, 217);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS400S0200000_34(X.C2238171Cit r3, com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 22: goto Lf;
                case 23: goto Lf;
                case 24: goto Lf;
                case 25: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS400S0200000_34.<init>(X.1Cit, com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS400S0200000_34(com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController r3, kotlin.jvm.functions.Function0 r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 27: goto Lf;
                case 28: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS400S0200000_34.<init>(com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController, kotlin.jvm.functions.Function0, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C637220Oz2 c637220Oz2, C2238251Cj1 c2238251Cj1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c637220Oz2;
        this.l1 = c2238251Cj1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C20656615sK c20656615sK, C2238031Cif c2238031Cif, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20656615sK;
        this.l1 = c2238031Cif;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C20656615sK c20656615sK, C2238041Cig c2238041Cig, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20656615sK;
        this.l1 = c2238041Cig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(InterfaceC214902198i interfaceC214902198i, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC214902198i;
        this.l1 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS400S0200000_34(C2192231Aqz c2192231Aqz, C2192231Aqz c2192231Aqz2, Set<String> set) {
        super(1);
        this.$t = set;
        this.l0 = c2192231Aqz;
        this.l1 = c2192231Aqz2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C2192231Aqz c2192231Aqz, String[] strArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2192231Aqz;
        this.l1 = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(InterfaceC2194541Aui interfaceC2194541Aui, C2196051Ax9 c2196051Ax9, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC2194541Aui;
        this.l1 = c2196051Ax9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C2197431AzN c2197431AzN, MinisTierInfo minisTierInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2197431AzN;
        this.l1 = minisTierInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C2197471AzR c2197471AzR, MinisTierInfo minisTierInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2197471AzR;
        this.l1 = minisTierInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C1B3M c1b3m, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1b3m;
        this.l1 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C1B4X c1b4x, MusicModel musicModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1b4x;
        this.l1 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS400S0200000_34(C1BTQ c1btq, C1BTQ c1btq2, Function1<? super InterfaceC1177250gjz, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c1btq;
        this.l1 = c1btq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS400S0200000_34(C1BV2 c1bv2, C1BV2 c1bv22, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c1bv2;
        this.l1 = c1bv22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C2216061BoK c2216061BoK, C2216071BoL c2216071BoL, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2216061BoK;
        this.l1 = c2216071BoL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS400S0200000_34(C2216441Bow c2216441Bow, C2216441Bow c2216441Bow2, Map.Entry<? extends Class<?>, ? extends C2216431Bov<?>> entry) {
        super(1);
        this.$t = entry;
        this.l0 = c2216441Bow;
        this.l1 = c2216441Bow2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C2238051Cih c2238051Cih, C20656615sK c20656615sK, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2238051Cih;
        this.l1 = c20656615sK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C2238181Ciu c2238181Ciu, ProfileBannerInfoModel profileBannerInfoModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2238181Ciu;
        this.l1 = profileBannerInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(C1DEV c1dev, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1dev;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(Context context, InterfaceC2214761BmE interfaceC2214761BmE, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = interfaceC2214761BmE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(Context context, DialogButtonModel dialogButtonModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = dialogButtonModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(Context context, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(LoginFragment loginFragment, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = loginFragment;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(IBootFinishEngine iBootFinishEngine, C1BXC c1bxc, int i) {
        super(1);
        this.$t = i;
        this.l0 = iBootFinishEngine;
        this.l1 = c1bxc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(DFInstallBlankActivity dFInstallBlankActivity, C1BLC c1blc, int i) {
        super(1);
        this.$t = i;
        this.l0 = dFInstallBlankActivity;
        this.l1 = c1blc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(CreativeModel creativeModel, VideoPublishEditModel videoPublishEditModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = creativeModel;
        this.l1 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl, C19489311Mt c19489311Mt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19489311Mt;
        this.l1 = seriesSubscriptionServiceImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(AIGCPictureUploadHandler aIGCPictureUploadHandler, DialogC1390150mHN dialogC1390150mHN, int i) {
        super(1);
        this.$t = i;
        this.l0 = aIGCPictureUploadHandler;
        this.l1 = dialogC1390150mHN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS400S0200000_34(ProfileEditBioViewModel profileEditBioViewModel, Editable editable, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileEditBioViewModel;
        this.l1 = editable;
    }
}
