package kotlin.jvm.internal;

import X.AnonymousClass0956;
import X.C04UE;
import X.C065R;
import X.C09AY;
import X.C0PEM;
import X.C0RF0;
import X.C0SD1;
import X.C0T4N;
import X.C1000880c9W;
import X.C1001660cAm;
import X.C1001880cB8;
import X.C1001890cB9;
import X.C1001930cBD;
import X.C1001940cBE;
import X.C1001980cBI;
import X.C1003300cDQ;
import X.C1004140cEm;
import X.C1004550cFR;
import X.C1006080cHu;
import X.C1006440cIU;
import X.C1010120cOQ;
import X.C1010170cOV;
import X.C1017070cZd;
import X.C1022620cia;
import X.C1022640cic;
import X.C1022650cid;
import X.C1035340d36;
import X.C11DA;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C13LP;
import X.C1434905jX;
import X.C1440005kM;
import X.C1524805y2;
import X.C1720006oQ;
import X.C1832707Ft;
import X.C1865840yec;
import X.C196600pI;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2183841AdS;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2296808zG;
import X.C23250099c;
import X.C279060Awi;
import X.C291001Au;
import X.C292430BdB;
import X.C292520BdK;
import X.C300900Bqq;
import X.C390701fV;
import X.C438710HIf;
import X.C581630MrZ;
import X.C584960Mww;
import X.C602130NjX;
import X.C631370Opb;
import X.C724270Sb3;
import X.C735200Ssg;
import X.C786410Ut5;
import X.C888460YtI;
import X.C988710bpt;
import X.C989530brD;
import X.C995840c1O;
import X.C995850c1P;
import X.C997050c3L;
import X.C997480c42;
import X.C997490c43;
import X.C997500c44;
import X.C997510c45;
import X.C998410c5X;
import X.C998500c5g;
import X.InterfaceC1006410cIR;
import X.InterfaceC1008930cMV;
import X.InterfaceC1017820caq;
import X.InterfaceC1610880s1O;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC719460SKa;
import X.InterfaceC996800c2w;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.bean.PTYCepCallbackMode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen;
import com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssem;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.cip.CIPLogicComponent;
import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.api.component.mask.AdMaskAssem;
import com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoModeAssem;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.assem.AdLightWebPageAssem;
import com.ss.android.ugc.aweme.commercialize.assem.AdLightWebPageVM;
import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AbsAdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdBesideSponsorLabelTagAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdTopInteractInfoAreaTagAssem;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendV3LiveAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareCepRuleManager;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareCepRuleVM;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.CtaButtonTextInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.FeedSubcardInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vh.MiniGameInstantPlayCardInfoAssem;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vh.MiniGameInstantPlayContentAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AFwS300S0000000_16 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(82);
    public final int $t;

    public static AFwS300S0000000_16 get$arr$(int i) {
        AFwS300S0000000_16 aFwS300S0000000_16 = (AFwS300S0000000_16) arr$.get(i);
        if (aFwS300S0000000_16 != null) {
            return aFwS300S0000000_16;
        }
        arr$.compareAndSet(i, null, new AFwS300S0000000_16(i));
        return (AFwS300S0000000_16) arr$.get(i);
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS300S0000000_16(int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C19EG activity;
        AdFeeDeductionBottomBarAssem adFeeDeductionBottomBarAssem = (AdFeeDeductionBottomBarAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(adFeeDeductionBottomBarAssem)).getAweme();
            Fragment fragment = ((VideoItemParams) C631370Opb.LIZ(adFeeDeductionBottomBarAssem)).fragment;
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                activity = null;
            }
            C1003300cDQ.LIZIZ(aweme, activity, adFeeDeductionBottomBarAssem.LLJLLIL, (String) c291001Au.LIZ, false, adFeeDeductionBottomBarAssem.LLJZIJLIL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ViewGroup viewGroup;
        AdFeeDeductionBottomBarAssem adFeeDeductionBottomBarAssem = (AdFeeDeductionBottomBarAssem) obj;
        if (obj2 != null && C1017070cZd.LLLIIL(((VideoItemParams) C631370Opb.LIZ(adFeeDeductionBottomBarAssem)).getAweme()) && (viewGroup = adFeeDeductionBottomBarAssem.LLJLLIL) != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C1022640cic c1022640cic = (C1022640cic) obj2;
        if (c1022640cic != null) {
            C2183841AdS c2183841AdS = C584960Mww.LIZ;
            String str = c1022640cic.LIZ;
            boolean z = c1022640cic.LIZIZ;
            c2183841AdS.getClass();
            c2183841AdS.LIZJ(new C1022650cid(str, z));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        String str;
        Integer numValueOf;
        CommerceInteractionComponent commerceInteractionComponent = (CommerceInteractionComponent) obj;
        C581630MrZ c581630MrZ = (C581630MrZ) obj2;
        Object obj3 = null;
        if (c581630MrZ != null) {
            str = c581630MrZ.LIZIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) C631370Opb.LIZ(commerceInteractionComponent)).getAweme().getAid()) && c581630MrZ != null && (numValueOf = Integer.valueOf(c581630MrZ.LIZ)) != null) {
            if (numValueOf.intValue() == 5) {
                C724270Sb3 c724270Sb3 = commerceInteractionComponent.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                }
                if (!C1017070cZd.LLIZLLLIL(((VideoItemParams) obj3).getAweme())) {
                    InterfaceC1008930cMV interfaceC1008930cMVIp = commerceInteractionComponent.ip();
                    if (interfaceC1008930cMVIp != null) {
                        interfaceC1008930cMVIp.LJJII(C995850c1P.LIZ);
                    }
                    commerceInteractionComponent.LLLIL = true;
                }
            } else if (numValueOf.intValue() == 3) {
                C724270Sb3 c724270Sb32 = commerceInteractionComponent.LLJI;
                if (c724270Sb32 != null) {
                    obj3 = c724270Sb32.LL;
                }
                Aweme aweme = ((VideoItemParams) obj3).getAweme();
                if (!commerceInteractionComponent.LLLIL && ((!C1010120cOQ.LJIJI(aweme) || !C292430BdB.LIZ()) && ((Boolean) C04UE.LIZ.getValue()).booleanValue())) {
                    InterfaceC1008930cMV interfaceC1008930cMVIp2 = commerceInteractionComponent.ip();
                    if (interfaceC1008930cMVIp2 != null) {
                        interfaceC1008930cMVIp2.LJJII(C995850c1P.LIZ);
                    }
                    commerceInteractionComponent.LLLIL = true;
                }
                InterfaceC1008930cMV interfaceC1008930cMVIp3 = commerceInteractionComponent.ip();
                if (interfaceC1008930cMVIp3 != null) {
                    interfaceC1008930cMVIp3.LJJII(C997510c45.LIZ);
                }
            } else if (numValueOf.intValue() == 4) {
                InterfaceC1008930cMV interfaceC1008930cMVIp4 = commerceInteractionComponent.ip();
                if (interfaceC1008930cMVIp4 != null) {
                    interfaceC1008930cMVIp4.LJJII(C997490c43.LIZ);
                }
            } else if (numValueOf.intValue() == 7) {
                InterfaceC1008930cMV interfaceC1008930cMVIp5 = commerceInteractionComponent.ip();
                if (interfaceC1008930cMVIp5 != null) {
                    interfaceC1008930cMVIp5.LJJII(C997480c42.LIZ);
                }
                InterfaceC1008930cMV interfaceC1008930cMVIp6 = commerceInteractionComponent.ip();
                if (interfaceC1008930cMVIp6 != null) {
                    interfaceC1008930cMVIp6.LJJII(C997500c44.LIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C997050c3L c997050c3L;
        AdMaskAssem adMaskAssem = (AdMaskAssem) obj;
        C581630MrZ c581630MrZ = (C581630MrZ) obj2;
        if (c581630MrZ != null && Intrinsics.LJFF(c581630MrZ.LIZIZ, ((VideoItemParams) C631370Opb.LIZ(adMaskAssem)).getAweme().getAid())) {
            int i = c581630MrZ.LIZ;
            if (i != 2) {
                if (i == 3 && (c997050c3L = adMaskAssem.LLJLIL) != null) {
                    c997050c3L.LJ(false);
                }
            } else {
                C997050c3L c997050c3L2 = adMaskAssem.LLJLIL;
                if (c997050c3L2 != null) {
                    c997050c3L2.LJ(false);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        String str;
        InteractAreaCommonAbility interactAreaCommonAbility;
        CommercePhotoModeAssem commercePhotoModeAssem = (CommercePhotoModeAssem) obj;
        if (obj2 != null) {
            commercePhotoModeAssem.LLJZ = true;
            IPhotoSlidesAbility iPhotoSlidesAbilityBo = commercePhotoModeAssem.Bo();
            if (iPhotoSlidesAbilityBo != null) {
                int iXt0 = iPhotoSlidesAbilityBo.xt0();
                commercePhotoModeAssem.Eo(iXt0);
                commercePhotoModeAssem.Co(iXt0, true);
            }
            IFeedService iFeedService = (IFeedService) commercePhotoModeAssem.LLJJJIL.getValue();
            Context context = commercePhotoModeAssem.getContext();
            C0RF0 c0rf0 = commercePhotoModeAssem.jm().LIZLLL;
            Object obj3 = null;
            if (c0rf0 != null) {
                str = c0rf0.LJIIIZ;
            } else {
                str = null;
            }
            C724270Sb3 c724270Sb3 = commercePhotoModeAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            }
            iFeedService.LJIIIIZZ(context, ((VideoItemParams) obj3).getAweme(), str);
            C1001940cBE c1001940cBE = (C1001940cBE) commercePhotoModeAssem.LLJLIL.getValue();
            if (c1001940cBE != null && c1001940cBE.LIZLLL) {
                C1001980cBI c1001980cBI = new C1001980cBI(((Number) ListProtector.get(c1001940cBE.LJIILIIL, 0)).intValue(), ((Number) ListProtector.get(c1001940cBE.LJIILJJIL, 0)).intValue(), ((Number) ListProtector.get(c1001940cBE.LJIIJJI, 0)).intValue(), ((Number) ListProtector.get(c1001940cBE.LJIIL, 0)).intValue());
                if (c1001940cBE.LJI) {
                    C1524805y2.LIZIZ(0L, new AwS417S0200000_16(c1001940cBE, c1001980cBI, 45));
                } else {
                    c1001940cBE.LJI = true;
                    C1524805y2.LIZIZ(0L, new AwS417S0200000_16(c1001940cBE, c1001980cBI, 46));
                }
            }
            if (C1832707Ft.LIZ() && (interactAreaCommonAbility = (InteractAreaCommonAbility) commercePhotoModeAssem.LLJLL.getValue()) != null) {
                interactAreaCommonAbility.xk("left_container", (View.OnLayoutChangeListener) commercePhotoModeAssem.LLJLLIL.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        InteractAreaCommonAbility interactAreaCommonAbility;
        CommercePhotoModeAssem commercePhotoModeAssem = (CommercePhotoModeAssem) obj;
        if (obj2 != null) {
            if (C1832707Ft.LIZ() && (interactAreaCommonAbility = (InteractAreaCommonAbility) commercePhotoModeAssem.LLJLL.getValue()) != null) {
                interactAreaCommonAbility.LLJJIII("left_container", (View.OnLayoutChangeListener) commercePhotoModeAssem.LLJLLIL.getValue());
            }
            C1001930cBD c1001930cBD = commercePhotoModeAssem.LLJJJJLIIL;
            c1001930cBD.LIZ = -1;
            c1001930cBD.LIZIZ = false;
            c1001930cBD.LIZLLL = 0;
            c1001930cBD.LJ = false;
            AnonymousClass0956 anonymousClass0956 = commercePhotoModeAssem.LLJJLIIIJLLLLLLLZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            Aweme aweme = commercePhotoModeAssem.LLJLILLLLZIIL;
            if (aweme != null) {
                ((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LJJIJL(aweme);
            }
            C390701fV c390701fV = commercePhotoModeAssem.LLL;
            if (c390701fV != null) {
                c390701fV.LIZJ();
            }
            commercePhotoModeAssem.LLJZ = false;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        CommercePhotoModeAssem commercePhotoModeAssem = (CommercePhotoModeAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            boolean zBooleanValue = ((Boolean) c291001Au.LIZ).booleanValue();
            C1000880c9W c1000880c9W = (C1000880c9W) C1010170cOV.LIZIZ(C1000880c9W.class);
            if (!zBooleanValue) {
                IPhotoSlidesAbility iPhotoSlidesAbilityBo = commercePhotoModeAssem.Bo();
                if (iPhotoSlidesAbilityBo != null) {
                    interfaceC719460SKaLJLIL = iPhotoSlidesAbilityBo.LJLIL();
                } else {
                    interfaceC719460SKaLJLIL = null;
                }
                commercePhotoModeAssem.Fo(interfaceC719460SKaLJLIL, 150L);
                C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C1001660cAm(c1000880c9W, commercePhotoModeAssem, null), 3);
            } else {
                commercePhotoModeAssem.LLJJJJLIIL.LJ = true;
                if (c1000880c9W != null) {
                    c1000880c9W.LIZ(true);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C390701fV c390701fV;
        CommercePhotoModeAssem commercePhotoModeAssem = (CommercePhotoModeAssem) obj;
        C581630MrZ c581630MrZ = (C581630MrZ) obj2;
        String aid = null;
        if (c581630MrZ != null && c581630MrZ.LIZIZ != null) {
            String str = c581630MrZ.LIZIZ;
            Aweme aweme = commercePhotoModeAssem.LLJLILLLLZIIL;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            if (Intrinsics.LJFF(str, aid)) {
                int i = c581630MrZ.LIZ;
                if (i != 3) {
                    if (i == 4 && commercePhotoModeAssem.LLJZ && (c390701fV = commercePhotoModeAssem.LLL) != null) {
                        c390701fV.LIZ();
                    }
                } else {
                    C390701fV c390701fV2 = commercePhotoModeAssem.LLL;
                    if (c390701fV2 != null) {
                        c390701fV2.LIZLLL(commercePhotoModeAssem.LLJZIJLIL, true);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        int iIntValue = ((Number) ((C291001Au) obj2).LIZ).intValue();
        C1389890mGx c1389890mGx = new C1389890mGx(((UIAssem) obj).LJJIJL());
        c1389890mGx.LJIIIZ(iIntValue);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C0T4N c0t4n;
        Fragment fragment;
        C19EG activity;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String lightWebUrl;
        boolean z;
        Object obj3;
        AwemeRawAd awemeRawAd;
        AdLightWebPageAssem adLightWebPageAssem = (AdLightWebPageAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        Object obj4 = null;
        if (c291001Au != null && (c0t4n = (C0T4N) c291001Au.LIZ) != null) {
            VideoItemParams item = adLightWebPageAssem.dp().getItem();
            if (item != null && (fragment = item.fragment) != null && (activity = fragment.getActivity()) != null) {
                boolean z2 = c0t4n.LIZLLL instanceof IESJsBridge;
                String str = c0t4n.LIZ;
                if (Intrinsics.LJFF(str, "openLightLandingPage")) {
                    JSONObject jSONObject = c0t4n.LIZIZ;
                    if (jSONObject != null) {
                        boolValueOf = Boolean.valueOf(jSONObject.optBoolean("inWeb"));
                    } else {
                        boolValueOf = null;
                    }
                    JSONObject jSONObject2 = c0t4n.LIZIZ;
                    if (jSONObject2 != null) {
                        boolValueOf2 = Boolean.valueOf(jSONObject2.optBoolean("show_top_bar"));
                    } else {
                        boolValueOf2 = null;
                    }
                    JSONObject jSONObject3 = c0t4n.LIZIZ;
                    if (jSONObject3 != null) {
                        lightWebUrl = jSONObject3.optString("url");
                    } else {
                        lightWebUrl = null;
                    }
                    IAdLightWebPageOpen iAdLightWebPageOpen = (IAdLightWebPageOpen) ServiceManager.get().getService(IAdLightWebPageOpen.class);
                    if (TextUtils.isEmpty(lightWebUrl)) {
                        AdLightWebPageVM adLightWebPageVMDp = adLightWebPageAssem.dp();
                        C724270Sb3 c724270Sb3 = adLightWebPageAssem.LLJI;
                        if (c724270Sb3 != null) {
                            obj3 = c724270Sb3.LL;
                        } else {
                            obj3 = null;
                        }
                        Aweme aweme = ((VideoItemParams) obj3).getAweme();
                        adLightWebPageVMDp.getClass();
                        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            lightWebUrl = awemeRawAd.getLightWebUrl();
                        } else {
                            lightWebUrl = null;
                        }
                    }
                    C724270Sb3 c724270Sb32 = adLightWebPageAssem.LLJI;
                    if (c724270Sb32 != null) {
                        obj4 = c724270Sb32.LL;
                    }
                    Aweme aweme2 = ((VideoItemParams) obj4).getAweme();
                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && Intrinsics.LJFF(boolValueOf2, Boolean.FALSE)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iAdLightWebPageOpen.LIZ(activity, aweme2, lightWebUrl, z);
                } else if (Intrinsics.LJFF(str, "closeLightLandingPage")) {
                    C1440005kM.LIZ(new C602130NjX("closeTuxSheet"));
                }
            }
        } else {
            adLightWebPageAssem.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        VideoItemParams item;
        Fragment fragment;
        VideoItemParams item2;
        VideoItemParams item3;
        Fragment fragment2;
        C19EG activity;
        VideoItemParams item4;
        Aweme aweme;
        AdLightWebPageAssem adLightWebPageAssem = (AdLightWebPageAssem) obj;
        if ((!C300900Bqq.LIZ() || obj2 != null) && (item = adLightWebPageAssem.dp().getItem()) != null && (fragment = item.fragment) != null && fragment.getActivity() != null && (item2 = adLightWebPageAssem.dp().getItem()) != null && item2.getAweme() != null && (item3 = adLightWebPageAssem.dp().getItem()) != null && (fragment2 = item3.fragment) != null && (activity = fragment2.getActivity()) != null && (item4 = adLightWebPageAssem.dp().getItem()) != null && (aweme = item4.getAweme()) != null) {
            adLightWebPageAssem.dp().getClass();
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                awemeRawAd.getLightWebUrl();
            }
            FrameLayout frameLayoutCp = adLightWebPageAssem.cp(activity);
            if (frameLayoutCp != null) {
                adLightWebPageAssem.LLJJI = frameLayoutCp;
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        if (!C300900Bqq.LIZ() || obj2 != null) {
            obj.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AdLightWebPageAssem.LLJLIL;
            obj.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        if ((!C300900Bqq.LIZ() || obj2 != null) && !adInteractiveAssem.ip().isShowing()) {
            adInteractiveAssem.ip().reset();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        adInteractiveAssem.getClass();
        adInteractiveAssem.ip().show();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C988710bpt c988710bpt;
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (!C300900Bqq.LIZ() || c291001Au != null) {
            adInteractiveAssem.getClass();
            if (c291001Au != null) {
                c988710bpt = (C988710bpt) c291001Au.LIZ;
            } else {
                c988710bpt = null;
            }
            adInteractiveAssem.ip().setVideoSize(c988710bpt);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$25(kotlin.jvm.internal.AFwS300S0000000_16 r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem r2 = (com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem) r2
            X.01Au r3 = (X.C291001Au) r3
            boolean r0 = X.C300900Bqq.LIZ()
            if (r0 == 0) goto Lf
            if (r3 != 0) goto L11
        Lc:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lf:
            if (r3 == 0) goto L20
        L11:
            T r0 = r3.LIZ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto L20
            r2.kp()
            goto Lc
        L20:
            r2.lp()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS300S0000000_16.invoke$25(kotlin.jvm.internal.AFwS300S0000000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$26(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adInteractiveAssem.kp();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$27(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (((Number) c291001Au.LIZ).intValue() == 1) {
                adInteractiveAssem.LLJLILLLLZIIL = false;
            }
            adInteractiveAssem.kp();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$28(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && ((Number) c291001Au.LIZ).intValue() == 1) {
            adInteractiveAssem.LLJLILLLLZIIL = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adInteractiveAssem.lp();
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adInteractiveAssem.kp();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adInteractiveAssem.lp();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        UrlModel urlModel;
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adInteractiveAssem.getClass();
            adInteractiveAssem.ip().LIZ();
            VideoItemParams item = adInteractiveAssem.ep().getItem();
            if (item != null && (aweme = item.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adInteractionData = awemeRawAd.getAdInteractionData()) != null && (urlModel = adInteractionData.popupImage) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                c1331670kl3LJIIIIZZ.LJJIJL(adInteractiveAssem.getContext());
                c1331670kl3LJIIIIZZ.LJJIFFI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adInteractiveAssem.ip().LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdInteractiveAssem adInteractiveAssem = (AdInteractiveAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adInteractiveAssem.ip().LJJJJJL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$35(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        float f;
        C291001Au c291001Au = (C291001Au) obj2;
        InterfaceC996800c2w interfaceC996800c2wIp = ((AdPlayFunAssem) obj).ip();
        if (c291001Au != null && !((Boolean) c291001Au.LIZ).booleanValue()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        interfaceC996800c2wIp.setAlpha(f);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((AdPlayFunAssem) obj).ip().start();
        return Unit.LIZ;
    }

    public static final Object invoke$37(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((AdPlayFunAssem) obj).ip().LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPlayFunAssem adPlayFunAssem = (AdPlayFunAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adPlayFunAssem.ip().resume();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPlayFunAssem adPlayFunAssem = (AdPlayFunAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adPlayFunAssem.ip().pause();
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$4(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$40(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPlayFunAssem adPlayFunAssem = (AdPlayFunAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (!C300900Bqq.LIZ() ? c291001Au != null : c291001Au != null) {
            C988710bpt c988710bpt = (C988710bpt) c291001Au.LIZ;
            if (c988710bpt != null) {
                adPlayFunAssem.ip().LJI(c988710bpt);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPlayFunAssem adPlayFunAssem = (AdPlayFunAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adPlayFunAssem.ip().LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPlayFunAssem adPlayFunAssem = (AdPlayFunAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adPlayFunAssem.ip().LJII();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPlayFunAssem adPlayFunAssem = (AdPlayFunAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adPlayFunAssem.ip().LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPlayFunAssem adPlayFunAssem = (AdPlayFunAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adPlayFunAssem.ip().LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPlayFunAssem adPlayFunAssem = (AdPlayFunAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            adPlayFunAssem.ip().LIZIZ();
            adPlayFunAssem.ip().setVisibility(8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((VideoPlayViewModel) ((AbsAdPopUpWebPageAssem) obj).LLJJJJ.getValue()).LJJLIIJ();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$47(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AbsAdPopUpWebPageAssem absAdPopUpWebPageAssem = (AbsAdPopUpWebPageAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            boolean zBooleanValue = ((Boolean) c291001Au.LIZ).booleanValue();
            AssemViewModel assemViewModel = (AssemViewModel) absAdPopUpWebPageAssem.LLJJJJJIL.getValue();
            assemViewModel.getClass();
            assemViewModel.setState(new AwS31S0010000_16(zBooleanValue, 12));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdPopUpWebPageAssem adPopUpWebPageAssem = (AdPopUpWebPageAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            C1035340d36 c1035340d36 = adPopUpWebPageAssem.LLJJLIIIJLLLLLLLZ;
            if (c1035340d36 != null) {
                c1035340d36.LJIJJ(true);
                C786410Ut5.LJJJLZIJ(c1035340d36, (ViewGroup) adPopUpWebPageAssem.LJJIJL());
            }
            adPopUpWebPageAssem.LLJJLIIIJLLLLLLLZ = null;
            adPopUpWebPageAssem.hp().LLILZ = false;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r2 == null) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$49(kotlin.jvm.internal.AFwS300S0000000_16 r38, java.lang.Object r39, java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS300S0000000_16.invoke$49(kotlin.jvm.internal.AFwS300S0000000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        return Boolean.FALSE;
    }

    public static final Object invoke$50(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C1035340d36 c1035340d36;
        AbsAdPopUpWebPageAssem absAdPopUpWebPageAssem = (AbsAdPopUpWebPageAssem) obj;
        if ((!C300900Bqq.LIZ() || obj2 != null) && (c1035340d36 = absAdPopUpWebPageAssem.LLJJLIIIJLLLLLLLZ) != null && c1035340d36.LJIIJJI()) {
            ((VideoPlayViewModel) absAdPopUpWebPageAssem.LLJJJJ.getValue()).pauseVideo();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$51(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdBesideSponsorLabelTagAssem adBesideSponsorLabelTagAssem = (AdBesideSponsorLabelTagAssem) obj;
        if (obj2 != null) {
            C998500c5g.LIZ(((VideoItemParams) C631370Opb.LIZ(adBesideSponsorLabelTagAssem)).getAweme().getAwemeRawAd(), 1, ((C0SD1) adBesideSponsorLabelTagAssem.LLJLLL.getValue()).getShowTagNum());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$52(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        AdTopInteractInfoAreaTagAssem adTopInteractInfoAreaTagAssem = (AdTopInteractInfoAreaTagAssem) obj;
        if (obj2 != null) {
            C998500c5g.LIZ(((VideoItemParams) C631370Opb.LIZ(adTopInteractInfoAreaTagAssem)).getAweme().getAwemeRawAd(), 2, adTopInteractInfoAreaTagAssem.Bp().getShowTagNum());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("omsdk -> tag: ");
        sbLIZ.append((String) obj);
        sbLIZ.append(", label ");
        sbLIZ.append((String) obj2);
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$54(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        User user;
        FriendV3LiveAssem friendV3LiveAssem = (FriendV3LiveAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            C786410Ut5.LJLLLLLL(0, friendV3LiveAssem.zp());
            TuxTextView tuxTextViewZp = friendV3LiveAssem.zp();
            Context context = friendV3LiveAssem.getContext();
            String string = null;
            if (context != null) {
                Object[] objArr = new Object[1];
                LiveRoomStruct liveRoomStructBp = friendV3LiveAssem.Bp();
                if (liveRoomStructBp != null && (user = liveRoomStructBp.owner) != null) {
                    string = user.getNickname();
                }
                objArr[0] = string;
                string = context.getString(2131830200, objArr);
            }
            tuxTextViewZp.setText(string);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        String str;
        Object obj3;
        InterfaceC497601wk interfaceC497601wkLIZ;
        QuickShareButtonAssem quickShareButtonAssem = (QuickShareButtonAssem) obj;
        C998410c5X c998410c5X = (C998410c5X) obj2;
        String str2 = c998410c5X.LIZ;
        if (str2 != null && (str = c998410c5X.LIZIZ) != null && Intrinsics.LJFF(str2, ((VideoItemParams) C631370Opb.LIZ(quickShareButtonAssem)).getAweme().getAid())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cep trigger ");
            C724270Sb3 c724270Sb3 = quickShareButtonAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            sbLIZ.append(QuickShareButtonAssem.Ip((VideoItemParams) obj3));
            C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
            if (C1865840yec.LIZ()) {
                interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(quickShareButtonAssem);
            } else {
                C1DFH c1dfh = C0PEM.LIZ;
                interfaceC497601wkLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
            }
            C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C1001880cB8(str, quickShareButtonAssem, null), 3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$56(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        C735200Ssg c735200Ssg;
        Object obj3;
        Object obj4;
        InterfaceC497601wk interfaceC497601wkLIZ;
        QuickShareButtonAssem quickShareButtonAssem = (QuickShareButtonAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c735200Ssg = (C735200Ssg) c291001Au.LIZ) != null && c735200Ssg.LIZLLL && c735200Ssg.LIZ == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("repost success ");
            sbLIZ.append(QuickShareButtonAssem.Ip((VideoItemParams) C631370Opb.LIZ(quickShareButtonAssem)));
            C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
            String str = c735200Ssg.LIZIZ;
            C724270Sb3 c724270Sb3 = quickShareButtonAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (Intrinsics.LJFF(str, ((VideoItemParams) obj3).getAweme().getAid())) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleRepost ");
                C724270Sb3 c724270Sb32 = quickShareButtonAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                } else {
                    obj4 = null;
                }
                sbLIZ2.append(QuickShareButtonAssem.Ip((VideoItemParams) obj4));
                C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ2));
                if (C1865840yec.LIZ()) {
                    interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(quickShareButtonAssem);
                } else {
                    C1DFH c1dfh = C0PEM.LIZ;
                    interfaceC497601wkLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
                }
                C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C1001890cB9(quickShareButtonAssem, null), 3);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$57(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        QuickShareButtonAssem quickShareButtonAssem = (QuickShareButtonAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        Object obj5 = null;
        if (c291001Au != null && (num = (Integer) c291001Au.LIZ) != null) {
            num.intValue();
            InterceptorEventViewModel interceptorEventViewModel = (InterceptorEventViewModel) quickShareButtonAssem.LLJZIJLIL.getValue();
            C1004140cEm.LIZ.getClass();
            if (C1004140cEm.LIZ().enableLikeTrigger == 1) {
                interceptorEventViewModel.vQ2(0, quickShareButtonAssem.LLLIIL);
            }
            if (C1004140cEm.LIZ().enableLoopTrigger == 1) {
                interceptorEventViewModel.vQ2(1, quickShareButtonAssem.LLLIIL);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onHolderSelectedEvent ");
            C724270Sb3 c724270Sb3 = quickShareButtonAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            sbLIZ.append(QuickShareButtonAssem.Ip((VideoItemParams) obj3));
            C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
            C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
            C724270Sb3 c724270Sb32 = quickShareButtonAssem.LLJI;
            if (c724270Sb32 != null) {
                obj4 = c724270Sb32.LL;
            } else {
                obj4 = null;
            }
            String aid = ((VideoItemParams) obj4).getAweme().getAid();
            c1004550cFR.getClass();
            if (C1004550cFR.LIZIZ(aid)) {
                C786410Ut5.LJLLLLLL(0, quickShareButtonAssem.LJJIJL());
                C724270Sb3 c724270Sb33 = quickShareButtonAssem.LLJI;
                if (c724270Sb33 != null) {
                    obj5 = c724270Sb33.LL;
                }
                quickShareButtonAssem.Up(((VideoItemParams) obj5).getAweme().getAid());
            } else {
                C786410Ut5.LJLLLLLL(8, quickShareButtonAssem.LJJIJL());
            }
            if (((Boolean) C1865840yec.LIZLLL.getValue()).booleanValue()) {
                if (!QuickShareCepRuleManager.LIZ && C065R.LIZJ() && C279060Awi.LIZ()) {
                    QuickShareCepRuleManager.LIZ = true;
                    for (Map.Entry entry : ((Map) C292520BdK.LIZIZ.getValue()).entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (str2 != null && str != null) {
                            ((ArrayList) QuickShareCepRuleManager.LIZIZ).add(str2);
                            QuickShareCepRuleManager.ManagerCepCallback managerCepCallback = new QuickShareCepRuleManager.ManagerCepCallback(str, str2);
                            InterfaceC1610880s1O interfaceC1610880s1O = (InterfaceC1610880s1O) C065R.LIZJ.getValue();
                            if (interfaceC1610880s1O != null) {
                                interfaceC1610880s1O.LIZ("quick_share_button_trigger_cep", str2, managerCepCallback, PTYCepCallbackMode.SUCCESS_AND_ERROR);
                            }
                        }
                    }
                }
            } else {
                QuickShareCepRuleVM quickShareCepRuleVM = (QuickShareCepRuleVM) quickShareButtonAssem.LLLILZ.getValue();
                if (quickShareCepRuleVM != null && !quickShareCepRuleVM.LL && C065R.LIZJ() && C279060Awi.LIZ()) {
                    quickShareCepRuleVM.LL = true;
                    for (Map.Entry entry2 : ((Map) C292520BdK.LIZIZ.getValue()).entrySet()) {
                        String str3 = (String) entry2.getKey();
                        String str4 = (String) entry2.getValue();
                        if (str4 != null && str3 != null) {
                            ((ArrayList) quickShareCepRuleVM.LLILLJJLI).add(str4);
                            QuickShareCepRuleVM.SharePTYCepCallback sharePTYCepCallback = new QuickShareCepRuleVM.SharePTYCepCallback(new WeakReference(quickShareCepRuleVM), str3, str4);
                            InterfaceC1610880s1O interfaceC1610880s1O2 = (InterfaceC1610880s1O) C065R.LIZJ.getValue();
                            if (interfaceC1610880s1O2 != null) {
                                interfaceC1610880s1O2.LIZ("quick_share_button_trigger_cep", str4, sharePTYCepCallback, PTYCepCallbackMode.SUCCESS_AND_ERROR);
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        QuickShareButtonAssem quickShareButtonAssem = (QuickShareButtonAssem) obj;
        C888460YtI c888460YtI = (C888460YtI) obj2;
        if (c888460YtI != null) {
            quickShareButtonAssem.Bp(c888460YtI.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        QuickShareButtonAssem quickShareButtonAssem = (QuickShareButtonAssem) obj;
        C1434905jX c1434905jX = (C1434905jX) obj2;
        if (c1434905jX != null) {
            C2201941BFw c2201941BFw = IMUser.Companion;
            IMUser iMUser = c1434905jX.LIZJ;
            c2201941BFw.getClass();
            quickShareButtonAssem.Bp(C2201941BFw.LJII(iMUser));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        InterfaceC1017820caq interfaceC1017820caqBo;
        String str;
        Object obj3;
        String packageName;
        Aweme aweme2;
        AwemeRawAd awemeRawAdLJJIJLIJ2;
        CIPLogicComponent cIPLogicComponent = (CIPLogicComponent) obj;
        if (obj2 != null) {
            InterfaceC1017820caq interfaceC1017820caqBo2 = cIPLogicComponent.Bo();
            Object obj4 = null;
            if (interfaceC1017820caqBo2 != null) {
                C724270Sb3 c724270Sb3 = cIPLogicComponent.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                VideoItemParams videoItemParams = (VideoItemParams) obj3;
                if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null && (awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme2)) != null) {
                    packageName = awemeRawAdLJJIJLIJ2.getPackageName();
                } else {
                    packageName = null;
                }
                interfaceC1017820caqBo2.LIZLLL(packageName);
            }
            InterfaceC1017820caq interfaceC1017820caqBo3 = cIPLogicComponent.Bo();
            if (interfaceC1017820caqBo3 != null) {
                C0RF0 c0rf0 = cIPLogicComponent.jm().LIZLLL;
                if (c0rf0 != null) {
                    str = c0rf0.LJIIIZ;
                } else {
                    str = null;
                }
                interfaceC1017820caqBo3.LJIILJJIL(str);
            }
            C724270Sb3 c724270Sb32 = cIPLogicComponent.LLJI;
            if (c724270Sb32 != null) {
                obj4 = c724270Sb32.LL;
            }
            VideoItemParams videoItemParams2 = (VideoItemParams) obj4;
            if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && (interfaceC1017820caqBo = cIPLogicComponent.Bo()) != null && interfaceC1017820caqBo.LJIIIZ(awemeRawAdLJJIJLIJ)) {
                C1022620cia.LJ("CIPLogicComponent", "CIPLogicComponent onHolderSelected execute");
                InterfaceC1017820caq interfaceC1017820caqBo4 = cIPLogicComponent.Bo();
                if (interfaceC1017820caqBo4 != null) {
                    interfaceC1017820caqBo4.LJFF(awemeRawAdLJJIJLIJ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$60(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        List<FeedSubcardInfo> list;
        FeedSubcardInfo feedSubcardInfo;
        String str;
        MiniGameInstantPlayCardInfoAssem miniGameInstantPlayCardInfoAssem = (MiniGameInstantPlayCardInfoAssem) obj;
        GameCardMaterial gameCardMaterial = (GameCardMaterial) obj2;
        if (gameCardMaterial != null && (list = gameCardMaterial.feedSubcardInfoList) != null && (feedSubcardInfo = (FeedSubcardInfo) C13LP.LJJJLL(list)) != null) {
            TextView textView = (TextView) miniGameInstantPlayCardInfoAssem.LLJLLL.getValue();
            if (textView != null) {
                textView.setText(feedSubcardInfo.title);
            }
            TextView textView2 = (TextView) miniGameInstantPlayCardInfoAssem.LLJZ.getValue();
            if (textView2 != null) {
                textView2.setText(feedSubcardInfo.text);
            }
            TextView textView3 = (TextView) miniGameInstantPlayCardInfoAssem.LLLF.getValue();
            if (textView3 != null) {
                textView3.setText(gameCardMaterial.title);
            }
            TextView textView4 = (TextView) miniGameInstantPlayCardInfoAssem.LLL.getValue();
            String str2 = null;
            if (textView4 != null) {
                CtaButtonTextInfo ctaButtonTextInfo = gameCardMaterial.ctaButtonTextInfo;
                if (ctaButtonTextInfo != null) {
                    str = ctaButtonTextInfo.rightCtaButtonText;
                } else {
                    str = null;
                }
                textView4.setText(str);
            }
            TextView textView5 = (TextView) miniGameInstantPlayCardInfoAssem.LLJZIJLIL.getValue();
            if (textView5 != null) {
                CtaButtonTextInfo ctaButtonTextInfo2 = gameCardMaterial.ctaButtonTextInfo;
                if (ctaButtonTextInfo2 != null) {
                    str2 = ctaButtonTextInfo2.leftCtaButtonText;
                }
                textView5.setText(str2);
            }
            SmartImageView smartImageView = (SmartImageView) miniGameInstantPlayCardInfoAssem.LLLFFI.getValue();
            if (smartImageView != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(feedSubcardInfo.iconUrl));
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$61(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        InterfaceC1006410cIR interfaceC1006410cIREp;
        MiniGameInstantPlayContentAssem miniGameInstantPlayContentAssem = (MiniGameInstantPlayContentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (((Boolean) c291001Au.LIZ).booleanValue()) {
                ViewGroup viewGroup = (ViewGroup) miniGameInstantPlayContentAssem.LLJZIJLIL.getValue();
                if (viewGroup != null && (interfaceC1006410cIREp = miniGameInstantPlayContentAssem.Ep()) != null) {
                    interfaceC1006410cIREp.LJI(viewGroup);
                }
                AnonymousClass0956 anonymousClass0956 = miniGameInstantPlayContentAssem.LLLFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                miniGameInstantPlayContentAssem.LLLFF = null;
                ValueAnimator valueAnimator = miniGameInstantPlayContentAssem.LLLFFI;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                miniGameInstantPlayContentAssem.LLLFFI = null;
                C1006440cIU c1006440cIUBp = miniGameInstantPlayContentAssem.Bp();
                if (c1006440cIUBp != null) {
                    miniGameInstantPlayContentAssem.LLLFZ = null;
                    miniGameInstantPlayContentAssem.LLLFF = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(miniGameInstantPlayContentAssem), null, null, new C1006080cHu(c1006440cIUBp, miniGameInstantPlayContentAssem, null), 3);
                }
            } else {
                InterfaceC1006410cIR interfaceC1006410cIREp2 = miniGameInstantPlayContentAssem.Ep();
                if (interfaceC1006410cIREp2 != null) {
                    interfaceC1006410cIREp2.LJ();
                }
                AnonymousClass0956 anonymousClass09562 = miniGameInstantPlayContentAssem.LLLFF;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                miniGameInstantPlayContentAssem.LLLFF = null;
                ValueAnimator valueAnimator2 = miniGameInstantPlayContentAssem.LLLFFI;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                miniGameInstantPlayContentAssem.LLLFFI = null;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$62(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        MiniGameInstantPlayContentAssem miniGameInstantPlayContentAssem = (MiniGameInstantPlayContentAssem) obj;
        VideoItemParams videoItemParams = miniGameInstantPlayContentAssem.Fp().getState().LLILLL;
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue()) {
            if (videoItemParams != null) {
                miniGameInstantPlayContentAssem.J1(videoItemParams.currentPosition, videoItemParams.getAweme());
            }
        } else {
            miniGameInstantPlayContentAssem.LJL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$63(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        MiniGameInstantPlayContentAssem miniGameInstantPlayContentAssem = (MiniGameInstantPlayContentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && miniGameInstantPlayContentAssem.Fp().getState().LLILZIL.LIZ.booleanValue()) {
            InterfaceC1006410cIR interfaceC1006410cIREp = miniGameInstantPlayContentAssem.Ep();
            if (((Boolean) c291001Au.LIZ).booleanValue()) {
                if (interfaceC1006410cIREp != null) {
                    interfaceC1006410cIREp.resume();
                }
            } else if (interfaceC1006410cIREp != null) {
                interfaceC1006410cIREp.pause();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        FriendV3LiveAssem friendV3LiveAssem = (FriendV3LiveAssem) obj;
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                LiveRoomStruct liveRoomStructBp = friendV3LiveAssem.Bp();
                if (liveRoomStructBp != null) {
                    liveRoomStructBp.isShow = true;
                }
            } else {
                friendV3LiveAssem.LLLIIII = 0L;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$66(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        FriendV3LiveAssem friendV3LiveAssem = (FriendV3LiveAssem) obj;
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                FriendV3LiveAssem.tp(friendV3LiveAssem);
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$67(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$68(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (Intrinsics.LJFF(map.get("product_id"), map2.get("product_id")) && !Intrinsics.LJFF(map.get("product_id"), "")) {
            return map2;
        }
        return null;
    }

    public static final Object invoke$69(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Boolean.TRUE;
    }

    public static final Object invoke$7(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        CIPLogicComponent cIPLogicComponent = (CIPLogicComponent) obj;
        if (obj2 != null) {
            C1022620cia.LJ("CIPLogicComponent", "CIPLogicComponent onHolderUnSelectedEvent execute");
            InterfaceC1017820caq interfaceC1017820caqBo = cIPLogicComponent.Bo();
            if (interfaceC1017820caqBo != null) {
                interfaceC1017820caqBo.LIZLLL(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$70(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((TextView) obj).setText(2131836505);
        ((TextView) obj2).setText(2131857692);
        return Unit.LIZ;
    }

    public static final Object invoke$71(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((TextView) obj).setText(2131848826);
        ((TextView) obj2).setText(2131848825);
        return Unit.LIZ;
    }

    public static final Object invoke$72(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((TextView) obj).setText(2131857691);
        ((TextView) obj2).setText(2131857692);
        return Unit.LIZ;
    }

    public static final Object invoke$73(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((TextView) obj).setText(2131836505);
        ((TextView) obj2).setText(2131857692);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$74(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$75(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((TextView) obj).setText(2131848826);
        ((TextView) obj2).setText(2131848825);
        return Unit.LIZ;
    }

    public static final Object invoke$76(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((TextView) obj).setText(2131836505);
        ((TextView) obj2).setText(2131857692);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$77(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$78(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        return C196600pI.LIZ(a0.LJLIIIL((String) obj2).toString(), (JSONObject) obj);
    }

    public static final Object invoke$79(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("omsdk -> tag: ");
        sbLIZ.append((String) obj);
        sbLIZ.append(", label ");
        sbLIZ.append((String) obj2);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        String str;
        CommerceInteractionComponent commerceInteractionComponent = (CommerceInteractionComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            str = (String) c291001Au.LIZ;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRenderFirstFrameEvent.sourceId is ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null && Intrinsics.LJFF(str, ((VideoItemParams) C631370Opb.LIZ(commerceInteractionComponent)).getAweme().getAid()) && C1017070cZd.LLIZLLLIL(((VideoItemParams) C631370Opb.LIZ(commerceInteractionComponent)).getAweme())) {
            InterfaceC1008930cMV interfaceC1008930cMVIp = commerceInteractionComponent.ip();
            if (interfaceC1008930cMVIp != null) {
                interfaceC1008930cMVIp.LJJII(C995850c1P.LIZ);
            }
            commerceInteractionComponent.LLLIL = true;
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$80(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$81(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bn8, viewGroup, false);
        return new C11DA(viewTd) { // from class: X.0btm
            public final View LIZ;
            public final C1235900iGa LIZIZ;
            public final TuxTextView LIZJ;

            @Override // X.C11DA
            public final View getView() {
                return this.LIZ;
            }

            {
                this.LIZ = viewTd;
                this.LIZIZ = (C1235900iGa) viewTd.findViewById(R.id.w28);
                this.LIZJ = (TuxTextView) viewTd.findViewById(R.id.p_r);
            }

            @Override // X.C11DA
            public final void LIZIZ(int i) {
                switch (i) {
                    case 241:
                        C786410Ut5.LLLLIIL(this.LIZIZ, 8);
                        C786410Ut5.LLLLZLL(this.LIZJ, 8);
                        break;
                    case 242:
                        C786410Ut5.LLLLIIL(this.LIZIZ, 0);
                        C786410Ut5.LLLLZLL(this.LIZJ, 8);
                        break;
                    case 243:
                        C786410Ut5.LLLLIIL(this.LIZIZ, 8);
                        C786410Ut5.LLLLZLL(this.LIZJ, 0);
                        break;
                    case 244:
                        C786410Ut5.LLLLIIL(this.LIZIZ, 8);
                        C786410Ut5.LLLLZLL(this.LIZJ, 8);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        Pair pair;
        CommerceInteractionComponent commerceInteractionComponent = (CommerceInteractionComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (pair = (Pair) c291001Au.LIZ) != null && Intrinsics.LJFF(pair.getFirst(), ((VideoItemParams) C631370Opb.LIZ(commerceInteractionComponent)).getAweme().getAid())) {
            InterfaceC1008930cMV interfaceC1008930cMVIp = commerceInteractionComponent.ip();
            if (interfaceC1008930cMVIp != null) {
                interfaceC1008930cMVIp.LJJII(new C995840c1O(((Number) pair.getSecond()).floatValue()));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handle SpeedChange, speed = ");
            sbLIZ.append(((Number) pair.getSecond()).floatValue());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$64(AFwS300S0000000_16 aFwS300S0000000_16, Object obj, Object obj2) {
        return obj;
    }
}
