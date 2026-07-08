package kotlin.jvm.internal;

import X.AbstractC1264080j02;
import X.AbstractC331870Czh;
import X.AbstractC332980D3o;
import X.AbstractC334740DAi;
import X.C00Y8;
import X.C013C;
import X.C01GW;
import X.C05P0;
import X.C05XL;
import X.C05YC;
import X.C098200Yq;
import X.C09AY;
import X.C0CM8;
import X.C0CMX;
import X.C0CUB;
import X.C0CUC;
import X.C0CVI;
import X.C0D0E;
import X.C0D0F;
import X.C0D0Z;
import X.C0D21;
import X.C0D2Y;
import X.C0D3K;
import X.C0DA7;
import X.C0DOU;
import X.C0DT6;
import X.C0DZU;
import X.C0PEM;
import X.C118300cf;
import X.C1308910kAL;
import X.C15433062l;
import X.C1863760ybG;
import X.C189200o6;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23250099c;
import X.C259800zU;
import X.C312230CLt;
import X.C320610ChX;
import X.C320640Cha;
import X.C320800Chq;
import X.C320830Cht;
import X.C321020CiC;
import X.C321110CiL;
import X.C321400Cio;
import X.C321410Cip;
import X.C321490Cix;
import X.C321970Cjj;
import X.C323610CmN;
import X.C326880Cre;
import X.C329680CwA;
import X.C329910CwX;
import X.C331730CzT;
import X.C332130D0h;
import X.C332690D2l;
import X.C334500D9k;
import X.C336720DHy;
import X.C339190DRl;
import X.C340880DXy;
import X.C341220DZg;
import X.C346500DiC;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426401lG;
import X.C481090Itn;
import X.C566110MIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.C903300Zc8;
import X.EnumC1262370ixH;
import X.EnumC12936054k;
import X.EnumC323250Cln;
import X.EnumC346100DhY;
import X.InterfaceC1467705op;
import X.InterfaceC20236714Gf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC332200D0o;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;
import com.bytedance.android.live.publicscreen.impl.caption.split.CaptionSplitWidget;
import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionTranslateWidget;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.MessagePatch;
import com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentContentAssem;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerViewModel;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryCell;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel;
import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment;
import com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedPanelFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;
import com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AwS405S0200000_4 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS405S0200000_4 awS405S0200000_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bad patch msg id not equals ");
        sbLIZ.append(((MessagePatch) awS405S0200000_4.l0).msgId);
        sbLIZ.append(" with ");
        sbLIZ.append(((Message) awS405S0200000_4.l1).msgId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS405S0200000_4 awS405S0200000_4) {
        ((C320830Cht) awS405S0200000_4.l0).LJIIIIZZ((C321020CiC) awS405S0200000_4.l1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
        if (!(viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
            return ((Fragment) awS405S0200000_4.l0).getDefaultViewModelProviderFactory();
        }
        return defaultViewModelProviderFactory;
    }

    public static final Object invoke$11(AwS405S0200000_4 awS405S0200000_4) {
        List<? extends InterfaceC1467705op> list;
        CommerceAgentContentAssem commerceAgentContentAssem = (CommerceAgentContentAssem) awS405S0200000_4.l0;
        if (!commerceAgentContentAssem.LLJZIJLIL && (list = commerceAgentContentAssem.LLJJJJLIIL) != null && (!list.isEmpty())) {
            CommerceAgentContentAssem commerceAgentContentAssem2 = (CommerceAgentContentAssem) awS405S0200000_4.l0;
            AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4((C481090Itn) awS405S0200000_4.l1, 47);
            commerceAgentContentAssem2.LLJZIJLIL = true;
            AssemVMLazy assemVMLazy = commerceAgentContentAssem2.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommerceAgentContentAssem.LLLF;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(assemVMLazy.getValue()), C0PEM.LIZJ, null, new C426401lG(commerceAgentContentAssem2, awS583S0100000_4, null), 2);
        } else {
            ((C481090Itn) awS405S0200000_4.l1).setRefreshing(false);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
            if ((viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) != null) {
                return hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras();
            }
            return C903300Zc8.LIZJ;
        }
        return objInvoke;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
            if ((viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) != null) {
                return hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras();
            }
            return C903300Zc8.LIZJ;
        }
        return objInvoke;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
        if (!(viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
            return ((Fragment) awS405S0200000_4.l0).getDefaultViewModelProviderFactory();
        }
        return defaultViewModelProviderFactory;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
            if ((viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) != null) {
                return hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras();
            }
            return C903300Zc8.LIZJ;
        }
        return objInvoke;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
        if (!(viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
            return ((Fragment) awS405S0200000_4.l0).getDefaultViewModelProviderFactory();
        }
        return defaultViewModelProviderFactory;
    }

    public static final Object invoke$17(AwS405S0200000_4 awS405S0200000_4) {
        int i;
        String str;
        String str2;
        String str3;
        C0D0F c0d0f;
        UcpRecommendationItem product;
        C0D21 c0d21;
        C0D3K pageData;
        C332690D2l c332690D2lInvoke = ((C0D2Y) awS405S0200000_4.l0).LIZLLL.invoke();
        if (c332690D2lInvoke != null) {
            i = c332690D2lInvoke.protocolType;
        } else {
            i = 0;
        }
        C0D2Y c0d2y = (C0D2Y) awS405S0200000_4.l0;
        C331730CzT c331730CzT = c0d2y.LIZ;
        if (i == 1) {
            str = "";
        } else if (c332690D2lInvoke == null || (str = c332690D2lInvoke.productId) == null) {
            str = ((C0D3K) awS405S0200000_4.l1).productId;
        }
        InterfaceC332200D0o interfaceC332200D0o = null;
        if (c332690D2lInvoke != null) {
            str2 = c332690D2lInvoke.tiktokSpuId;
            str3 = c332690D2lInvoke.tiktokShopId;
        } else {
            str2 = null;
            str3 = null;
        }
        Map<String, String> mapInvoke = c0d2y.LJFF.invoke();
        c331730CzT.LJ.getClass();
        C15433062l.LJ("/api/ad/v1/ac/related_product", C0D0E.LIZ(str, str2, str3, mapInvoke).toQueryMap());
        AbstractC332980D3o value = ((C0D2Y) awS405S0200000_4.l0).LIZJ.getValue();
        if ((value instanceof C0D21) && (c0d21 = (C0D21) value) != null && (pageData = c0d21.getPageData()) != null) {
            interfaceC332200D0o = pageData.moreFromShop;
        }
        if (interfaceC332200D0o instanceof C0D0Z) {
            List<AbstractC331870Czh> slots = ((C0D0Z) interfaceC332200D0o).getSlots();
            ArrayList<UcpRecommendationItem> arrayList = new ArrayList();
            for (AbstractC331870Czh abstractC331870Czh : slots) {
                if ((abstractC331870Czh instanceof C0D0F) && (c0d0f = (C0D0F) abstractC331870Czh) != null && (product = c0d0f.getProduct()) != null) {
                    arrayList.add(product);
                }
            }
            for (UcpRecommendationItem ucpRecommendationItem : arrayList) {
                if (ucpRecommendationItem.getProtocolType() != 1) {
                    C15433062l.LJ("/api/v1/ucp/product", C2097908Jt.LIZJ(new Pair(FollowStatusChangeMethod.PARAM_UID, ucpRecommendationItem.getProductId())));
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS405S0200000_4 awS405S0200000_4) {
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            return ((ComponentActivity) awS405S0200000_4.l1).getDefaultViewModelCreationExtras();
        }
        return objInvoke;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AwS405S0200000_4 awS405S0200000_4) {
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            return ((ComponentActivity) awS405S0200000_4.l1).getDefaultViewModelCreationExtras();
        }
        return objInvoke;
    }

    public static final Object invoke$2(AwS405S0200000_4 awS405S0200000_4) {
        C566110MIf.LIZ.getClass();
        C566110MIf.LIZLLL("exit");
        ((Function0) awS405S0200000_4.l0).invoke();
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(AwS405S0200000_4 awS405S0200000_4) {
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            return ((ComponentActivity) awS405S0200000_4.l1).getDefaultViewModelCreationExtras();
        }
        return objInvoke;
    }

    public static final Object invoke$21(AwS405S0200000_4 awS405S0200000_4) {
        EnumC12936054k enumC12936054k = EnumC12936054k.STORY_TOOLBAR_ASSEM;
        AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2((MFBizIconsAssem) awS405S0200000_4.l0, (View) awS405S0200000_4.l1, 51);
        C013C c013c = new C013C();
        C321410Cip c321410Cip = new C321410Cip(awS368S0200000_2, new C321400Cio(c013c));
        C0CUC c0cuc = new C0CUC(c321410Cip);
        c321410Cip.invoke();
        if (!c013c.element) {
            C0CUB.LIZ.put(enumC12936054k, c0cuc);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AwS405S0200000_4 awS405S0200000_4) {
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            return ((ComponentActivity) awS405S0200000_4.l1).getDefaultViewModelCreationExtras();
        }
        return objInvoke;
    }

    public static final Object invoke$23(AwS405S0200000_4 awS405S0200000_4) {
        final User user = (User) awS405S0200000_4.l0;
        final EnumC323250Cln enumC323250Cln = (EnumC323250Cln) awS405S0200000_4.l1;
        return new ViewModelProvider.Factory(user, enumC323250Cln) { // from class: X.0D4b
            public final User LIZ;
            public final EnumC323250Cln LIZIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                Aweme firstAweme;
                ArrayList arrayList = new ArrayList();
                LatestUnreadVideoInfo latestUnreadVideoInfo = this.LIZ.getLatestUnreadVideoInfo();
                if (latestUnreadVideoInfo != null && (firstAweme = latestUnreadVideoInfo.getFirstAweme()) != null) {
                    arrayList.add(firstAweme);
                }
                return new FriendNewVideoSharedVM(this.LIZ, this.LIZIZ, arrayList);
            }

            {
                this.LIZ = user;
                this.LIZIZ = enumC323250Cln;
            }
        };
    }

    public static final Object invoke$24(AwS405S0200000_4 awS405S0200000_4) {
        final User user = (User) awS405S0200000_4.l0;
        final C323610CmN c323610CmN = new C323610CmN((EnumC1262370ixH) awS405S0200000_4.l1, user.getSecUid());
        final EnumC1262370ixH enumC1262370ixH = (EnumC1262370ixH) awS405S0200000_4.l1;
        return new ViewModelProvider.Factory(user, c323610CmN, enumC1262370ixH) { // from class: X.0D4Y
            public final User LIZ;
            public final InterfaceC323360Cly LIZIZ;
            public final EnumC1262370ixH LIZJ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new RecUserVideoListSharedVM(this.LIZ, this.LIZIZ, this.LIZJ);
            }

            {
                this.LIZ = user;
                this.LIZIZ = c323610CmN;
                this.LIZJ = enumC1262370ixH;
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AwS405S0200000_4 awS405S0200000_4) {
        if (((Fragment) awS405S0200000_4.l0) instanceof DialogFragment) {
            C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS73S0200000_4((Fragment) awS405S0200000_4.l0, (C259800zU) awS405S0200000_4.l1, 15));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS405S0200000_4 awS405S0200000_4) {
        C341220DZg c341220DZg = C341220DZg.LIZ;
        SocialThoughtPanelFragment socialThoughtPanelFragment = (SocialThoughtPanelFragment) awS405S0200000_4.l0;
        String str = socialThoughtPanelFragment.LLIZLLLIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = socialThoughtPanelFragment.LLJ;
        if (str3 == null) {
            str3 = "";
        }
        c341220DZg.getClass();
        C341220DZg.LJIIZILJ("ttsocial_friends_thoughts_entrance_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str3), new Pair("position", "guest_thought_view_panel")));
        SocialThoughtPanelFragment socialThoughtPanelFragment2 = (SocialThoughtPanelFragment) awS405S0200000_4.l0;
        socialThoughtPanelFragment2.LLJIJIL = true;
        String str4 = SocialThoughtAggregatedPanelFragment._pnsPageId;
        String str5 = socialThoughtPanelFragment2.LLIZLLLIL;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = socialThoughtPanelFragment2.LLJ;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = ((ThoughtInfo) awS405S0200000_4.l1).thoughtId;
        if (str7 != null) {
            str2 = str7;
        }
        SocialThoughtAggregatedPanelFragment socialThoughtAggregatedPanelFragment = new SocialThoughtAggregatedPanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str5, bundle);
        C786410Ut5.LJJJI("enter_method", str6, bundle);
        C786410Ut5.LJJJI("from_thought_id", str2, bundle);
        socialThoughtAggregatedPanelFragment.setArguments(bundle);
        C0DZU c0dzu = C0DZU.LIZ;
        SocialThoughtPanelFragment socialThoughtPanelFragment3 = (SocialThoughtPanelFragment) awS405S0200000_4.l0;
        c0dzu.getClass();
        C0DZU.LIZ(socialThoughtPanelFragment3, socialThoughtAggregatedPanelFragment);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
            if ((viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) != null) {
                return hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras();
            }
            return C903300Zc8.LIZJ;
        }
        return objInvoke;
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
        if (!(viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
            return ((Fragment) awS405S0200000_4.l0).getDefaultViewModelProviderFactory();
        }
        return defaultViewModelProviderFactory;
    }

    public static final Object invoke$29(AwS405S0200000_4 awS405S0200000_4) {
        C339190DRl.LIZIZ(((InvitableListAssem) awS405S0200000_4.l0).Vo());
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS405S0200000_4 awS405S0200000_4) {
        String str;
        com.ss.android.ugc.aweme.tako.ccl.model.api.Message messageLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tako postStateProcessor lastMessageId=");
        C326880Cre c326880Cre = (C326880Cre) awS405S0200000_4.l0;
        String str2 = null;
        if (c326880Cre != null && (messageLIZ = C321970Cjj.LIZ(c326880Cre)) != null) {
            str = messageLIZ.msgId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" answerMessageId=");
        com.ss.android.ugc.aweme.tako.ccl.model.api.Message message = (com.ss.android.ugc.aweme.tako.ccl.model.api.Message) awS405S0200000_4.l1;
        if (message != null) {
            str2 = message.msgId;
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$30(AwS405S0200000_4 awS405S0200000_4) {
        Map<String, String> map = ((C329680CwA) awS405S0200000_4.l0).LLILZLL;
        String aid = ((C329910CwX) awS405S0200000_4.l1).LLILLJJLI.getAid();
        if (aid == null) {
            aid = "";
        }
        return C2097608Jq.LJIIL(map, C2097908Jt.LIZJ(new Pair("search_third_item_id", aid)));
    }

    public static final Object invoke$31(AwS405S0200000_4 awS405S0200000_4) {
        int height;
        if (((View) awS405S0200000_4.l0).getVisibility() == 0) {
            height = ((View) awS405S0200000_4.l0).getHeight();
        } else {
            height = 0;
        }
        if (((PoiGalleryCell) awS405S0200000_4.l1).itemView.getPaddingBottom() != height) {
            View view = ((PoiGalleryCell) awS405S0200000_4.l1).itemView;
            view.setPadding(view.getPaddingLeft(), ((PoiGalleryCell) awS405S0200000_4.l1).itemView.getPaddingTop(), ((PoiGalleryCell) awS405S0200000_4.l1).itemView.getPaddingRight(), height);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS405S0200000_4 awS405S0200000_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: findStartRefreshTypeForFilterSort: found startRefreshType=");
        sbLIZ.append(((C118300cf) awS405S0200000_4.l0).element);
        sbLIZ.append(", maxOrder=");
        sbLIZ.append(((C118300cf) awS405S0200000_4.l1).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$33(AwS405S0200000_4 awS405S0200000_4) {
        if (((InterfaceC20236714Gf) awS405S0200000_4.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS405S0200000_4.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) awS405S0200000_4.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS405S0200000_4 awS405S0200000_4) {
        ((C05XL) awS405S0200000_4.l0).LJIIZILJ("");
        CreativeLoadingDialog creativeLoadingDialog = (CreativeLoadingDialog) ((C259800zU) awS405S0200000_4.l1).element;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$35(AwS405S0200000_4 awS405S0200000_4) {
        ((Function1) awS405S0200000_4.l0).invoke(((Intent) awS405S0200000_4.l1).getParcelableArrayListExtra("key_choose_media_data"));
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS405S0200000_4 awS405S0200000_4) {
        ((C332130D0h) awS405S0200000_4.l0).LIZJ.invoke((PdpSupplementData) awS405S0200000_4.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS405S0200000_4 awS405S0200000_4) {
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS405S0200000_4 awS405S0200000_4) {
        C1863760ybG.LJ(((TakoEnterParams) awS405S0200000_4.l0).processId);
        if (((InterfaceC20236714Gf) awS405S0200000_4.l1).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS405S0200000_4.l1;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS405S0200000_4 awS405S0200000_4) {
        EffectDraftDetailViewModel effectDraftDetailViewModelHp = ((EffectDraftDetailAssem) awS405S0200000_4.l0).hp();
        effectDraftDetailViewModelHp.withState(new AwS583S0100000_4(effectDraftDetailViewModelHp, 259));
        ((EffectDraftDetailAssem) awS405S0200000_4.l0).kp("delete");
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS405S0200000_4 awS405S0200000_4) {
        CaptionTextWidgetV2 captionTextWidgetV2 = (CaptionTextWidgetV2) awS405S0200000_4.l0;
        captionTextWidgetV2.LLIZLLLIL = true;
        captionTextWidgetV2.x1();
        C0DT6 c0dt6 = ((CaptionTextWidgetV2) awS405S0200000_4.l0).LLJZ;
        if (c0dt6 != null) {
            ((ArrayList) ((C0CVI) awS405S0200000_4.l1).LJ).add(c0dt6);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS405S0200000_4 awS405S0200000_4) {
        ((EffectDraftDetailAssem) awS405S0200000_4.l0).kp("keep");
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS405S0200000_4 awS405S0200000_4) {
        EffectDraftDetailViewModel effectDraftDetailViewModel = (EffectDraftDetailViewModel) awS405S0200000_4.l0;
        List list = (List) awS405S0200000_4.l1;
        effectDraftDetailViewModel.getClass();
        effectDraftDetailViewModel.withState(new AwS370S0200000_4(effectDraftDetailViewModel, (EffectDraftDetailViewModel) list, (List<String>) 23));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$42(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
            if ((viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) != null) {
                return hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras();
            }
            return C903300Zc8.LIZJ;
        }
        return objInvoke;
    }

    public static /* bridge */ /* synthetic */ Object invoke$43(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
        if (!(viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
            return ((Fragment) awS405S0200000_4.l0).getDefaultViewModelProviderFactory();
        }
        return defaultViewModelProviderFactory;
    }

    public static final Object invoke$44(AwS405S0200000_4 awS405S0200000_4) {
        ((Function1) awS405S0200000_4.l0).invoke(((C05P0) awS405S0200000_4.l1).getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS405S0200000_4 awS405S0200000_4) {
        boolean z = !((Boolean) ((C05P0) awS405S0200000_4.l1).getValue()).booleanValue();
        ((C05P0) awS405S0200000_4.l1).setValue(Boolean.valueOf(z));
        ((Function2) awS405S0200000_4.l0).invoke(Boolean.valueOf(z), "click_like");
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS405S0200000_4 awS405S0200000_4) {
        C19EG c19eg = (C19EG) awS405S0200000_4.l0;
        if (c19eg != null) {
            c19eg.finish();
        }
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS405S0200000_4 awS405S0200000_4) {
        ((C19EG) awS405S0200000_4.l0).finish();
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS405S0200000_4 awS405S0200000_4) {
        ContainerAbility containerAbilityRR = ((SchoolUsersListFragment) awS405S0200000_4.l0).RR();
        if (containerAbilityRR != null) {
            containerAbilityRR.X11(EnumC346100DhY.CLICK_CANCEL_GRADUATION_YEAR_POPUP, null);
        }
        ((TuxSheet) awS405S0200000_4.l1).dismiss();
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS405S0200000_4 awS405S0200000_4) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentFlow observe message ");
        sbLIZ.append((C05YC) awS405S0200000_4.l0);
        sbLIZ.append(' ');
        C320610ChX c320610ChX = C320640Cha.LJIIJ;
        C320640Cha c320640Cha = ((MessageViewModel) awS405S0200000_4.l1).LLILLL;
        Integer numValueOf = null;
        if (c320640Cha != null) {
            lValueOf = Long.valueOf(c320640Cha.LIZLLL);
        } else {
            lValueOf = null;
        }
        C320640Cha c320640Cha2 = ((MessageViewModel) awS405S0200000_4.l1).LLILLL;
        if (c320640Cha2 != null) {
            numValueOf = Integer.valueOf(c320640Cha2.LJ);
        }
        sbLIZ.append(c320610ChX.LIZIZ(numValueOf, lValueOf));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS405S0200000_4 awS405S0200000_4) {
        ((CaptionSplitWidget) awS405S0200000_4.l0).A1((C0CVI) awS405S0200000_4.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS405S0200000_4 awS405S0200000_4) {
        String str;
        Message messageLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgent postStateProcessor lastMessageId=");
        C321490Cix c321490Cix = (C321490Cix) awS405S0200000_4.l0;
        String str2 = null;
        if (c321490Cix != null && (messageLIZ = C320800Chq.LIZ(c321490Cix)) != null) {
            str = messageLIZ.msgId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" answerMessageId=");
        Message message = (Message) awS405S0200000_4.l1;
        if (message != null) {
            str2 = message.msgId;
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$51(AwS405S0200000_4 awS405S0200000_4) {
        TuxTextView tuxTextView = new TuxTextView((Context) awS405S0200000_4.l0, null, 6, 0);
        tuxTextView.setId(((C0DOU) awS405S0200000_4.l1).getContentViewId());
        tuxTextView.setTuxFont(102);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setMaxLines(2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        return tuxTextView;
    }

    public static /* bridge */ /* synthetic */ Object invoke$52(AwS405S0200000_4 awS405S0200000_4) {
        TuxTextView tuxTextView = new TuxTextView((Context) awS405S0200000_4.l0, null, 6, 0);
        tuxTextView.setId(((C0DOU) awS405S0200000_4.l1).getCtaTextViewId());
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.a1m);
        return tuxTextView;
    }

    public static /* bridge */ /* synthetic */ Object invoke$53(AwS405S0200000_4 awS405S0200000_4) {
        ImageView imageView = new ImageView((Context) awS405S0200000_4.l0);
        C0DOU c0dou = (C0DOU) awS405S0200000_4.l1;
        Context context = (Context) awS405S0200000_4.l0;
        imageView.setId(c0dou.getIconViewId());
        C786410Ut5.LJLLLLLL(8, imageView);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        imageView.setImageDrawable(c419910GdJ.LIZ(context));
        return imageView;
    }

    public static final Object invoke$54(AwS405S0200000_4 awS405S0200000_4) {
        TuxTextView tuxTextView = new TuxTextView((Context) awS405S0200000_4.l0, null, 6, 0);
        tuxTextView.setId(((C0DOU) awS405S0200000_4.l1).getTitleViewId());
        tuxTextView.setTuxFont(52);
        tuxTextView.setTextColorRes(R.attr.a1k);
        return tuxTextView;
    }

    public static final Object invoke$55(AwS405S0200000_4 awS405S0200000_4) {
        Object c098200Yq;
        Bitmap bitmap = (Bitmap) awS405S0200000_4.l0;
        TuxTextView tuxTextView = (TuxTextView) awS405S0200000_4.l1;
        if (bitmap != null) {
            try {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(tuxTextView.getResources(), bitmap);
                tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                boolean z = true;
                if (tuxTextView.getLayoutDirection() != 1) {
                    z = false;
                }
                if (z) {
                    tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, bitmapDrawable, (Drawable) null);
                } else {
                    tuxTextView.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS405S0200000_4 awS405S0200000_4) {
        ((Function0) awS405S0200000_4.l0).invoke();
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$57(AwS405S0200000_4 awS405S0200000_4) {
        ImageView imageView = new ImageView((Context) awS405S0200000_4.l0);
        C340880DXy c340880DXy = (C340880DXy) awS405S0200000_4.l1;
        Context context = (Context) awS405S0200000_4.l0;
        C786410Ut5.c6(imageView, new ViewGroup.LayoutParams(-1, -1));
        imageView.setScaleType(c340880DXy.LLILZLL);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, context);
        imageView.setBackground(c384050F3z.LIZ(context));
        return imageView;
    }

    public static final Object invoke$58(AwS405S0200000_4 awS405S0200000_4) {
        ((Function0) awS405S0200000_4.l0).invoke();
        ((Function0) awS405S0200000_4.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$59(AwS405S0200000_4 awS405S0200000_4) {
        ((Set) C312230CLt.LJIILIIL.getValue()).remove(((C0CM8) awS405S0200000_4.l0).LLILLJJLI);
        ((CopyOnWriteArrayList) awS405S0200000_4.l1).remove((C0CM8) awS405S0200000_4.l0);
        ((Boolean) C0CMX.LJIIIIZZ.getValue()).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS405S0200000_4 awS405S0200000_4) {
        ((CaptionTranslateWidget) awS405S0200000_4.l0).A1((C0CVI) awS405S0200000_4.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS405S0200000_4 awS405S0200000_4) {
        C312230CLt.LJII((C0CM8) awS405S0200000_4.l0, (CopyOnWriteArrayList) awS405S0200000_4.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$61(AwS405S0200000_4 awS405S0200000_4) {
        C312230CLt.LJII((C0CM8) awS405S0200000_4.l0, (CopyOnWriteArrayList) awS405S0200000_4.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$62(AwS405S0200000_4 awS405S0200000_4) {
        ((CheckoutViewModel) awS405S0200000_4.l0).dR2(((C0DA7) ((AbstractC334740DAi) awS405S0200000_4.l1)).LIZ.LIZ);
        ((CheckoutViewModel) awS405S0200000_4.l0).LLJ.LIZJ.setValue(new C334500D9k(((C0DA7) ((AbstractC334740DAi) awS405S0200000_4.l1)).LIZ.LIZJ, C00Y8.IDLE));
        return Unit.LIZ;
    }

    public static final Object invoke$63(AwS405S0200000_4 awS405S0200000_4) {
        ((LiveShareStickerViewModel) awS405S0200000_4.l0).LL.postValue(Boolean.valueOf(((RoomStatsModel) awS405S0200000_4.l1).alive));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS405S0200000_4 awS405S0200000_4) {
        Function1 function1 = (Function1) awS405S0200000_4.l0;
        if (function1 != null) {
            function1.invoke((AbstractC1264080j02) awS405S0200000_4.l1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS405S0200000_4 awS405S0200000_4) {
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            return ((Fragment) awS405S0200000_4.l1).requireActivity().getDefaultViewModelCreationExtras();
        }
        return objInvoke;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS405S0200000_4 awS405S0200000_4) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Object objInvoke;
        Function0 function0 = (Function0) awS405S0200000_4.l0;
        if (function0 == null || (objInvoke = function0.invoke()) == null) {
            ViewModelStoreOwner viewModelStoreOwnerLIZJ = C336720DHy.LIZJ((C01GW) awS405S0200000_4.l1);
            if ((viewModelStoreOwnerLIZJ instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZJ) != null) {
                return hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras();
            }
            return C903300Zc8.LIZJ;
        }
        return objInvoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C118300cf c118300cf, C118300cf c118300cf2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C259800zU c259800zU, C2252611DEt c2252611DEt, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2252611DEt;
        this.l1 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C05P0 c05p0, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = function1;
        this.l1 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C05P0 c05p0, Function2 function2, int i) {
        super(0);
        this.$t = i;
        this.l0 = function2;
        this.l1 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(C05XL c05xl, C05XL<String> c05xl2, C259800zU<CreativeLoadingDialog> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = c05xl;
        this.l1 = c05xl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(C05YC c05yc, C05YC<C321110CiL> c05yc2, MessageViewModel messageViewModel) {
        super(0);
        this.$t = messageViewModel;
        this.l0 = c05yc;
        this.l1 = c05yc2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(C0CM8 c0cm8, C0CM8 c0cm82, CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList) {
        super(0);
        this.$t = copyOnWriteArrayList;
        this.l0 = c0cm8;
        this.l1 = c0cm82;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C320830Cht c320830Cht, C321020CiC c321020CiC, int i) {
        super(0);
        this.$t = i;
        this.l0 = c320830Cht;
        this.l1 = c321020CiC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C321490Cix c321490Cix, Message message, int i) {
        super(0);
        this.$t = i;
        this.l0 = c321490Cix;
        this.l1 = message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C326880Cre c326880Cre, com.ss.android.ugc.aweme.tako.ccl.model.api.Message message, int i) {
        super(0);
        this.$t = i;
        this.l0 = c326880Cre;
        this.l1 = message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C329680CwA c329680CwA, C329910CwX c329910CwX, int i) {
        super(0);
        this.$t = i;
        this.l0 = c329680CwA;
        this.l1 = c329910CwX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C332130D0h c332130D0h, PdpSupplementData pdpSupplementData, int i) {
        super(0);
        this.$t = i;
        this.l0 = c332130D0h;
        this.l1 = pdpSupplementData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C0D2Y c0d2y, C0D3K c0d3k, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0d2y;
        this.l1 = c0d3k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(C19EG c19eg, C19EG c19eg2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c19eg;
        this.l1 = c19eg2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(Context context, C0DOU c0dou, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c0dou;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(Context context, C340880DXy c340880DXy, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c340880DXy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(View view, PoiGalleryCell poiGalleryCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = poiGalleryCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(Fragment fragment, Fragment fragment2, C259800zU<Integer> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = fragment;
        this.l1 = fragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(Fragment fragment, C01GW c01gw, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c01gw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(CaptionTextWidgetV2 captionTextWidgetV2, C0CVI c0cvi, int i) {
        super(0);
        this.$t = i;
        this.l0 = captionTextWidgetV2;
        this.l1 = c0cvi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(CaptionSplitWidget captionSplitWidget, C0CVI c0cvi, int i) {
        super(0);
        this.$t = i;
        this.l0 = captionSplitWidget;
        this.l1 = c0cvi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(CaptionTranslateWidget captionTranslateWidget, C0CVI c0cvi, int i) {
        super(0);
        this.$t = i;
        this.l0 = captionTranslateWidget;
        this.l1 = c0cvi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(Message message, MessagePatch messagePatch, int i) {
        super(0);
        this.$t = i;
        this.l0 = messagePatch;
        this.l1 = message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(CommerceAgentContentAssem commerceAgentContentAssem, C481090Itn c481090Itn, int i) {
        super(0);
        this.$t = i;
        this.l0 = commerceAgentContentAssem;
        this.l1 = c481090Itn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(CheckoutViewModel checkoutViewModel, AbstractC334740DAi abstractC334740DAi, int i) {
        super(0);
        this.$t = i;
        this.l0 = checkoutViewModel;
        this.l1 = abstractC334740DAi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(LiveShareStickerViewModel liveShareStickerViewModel, RoomStatsModel roomStatsModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveShareStickerViewModel;
        this.l1 = roomStatsModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(MFBizIconsAssem mFBizIconsAssem, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = mFBizIconsAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(User user, EnumC323250Cln enumC323250Cln, int i) {
        super(0);
        this.$t = i;
        this.l0 = user;
        this.l1 = enumC323250Cln;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(User user, EnumC1262370ixH enumC1262370ixH, int i) {
        super(0);
        this.$t = i;
        this.l0 = user;
        this.l1 = enumC1262370ixH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(EffectDraftDetailAssem effectDraftDetailAssem, EffectDraftDetailAssem effectDraftDetailAssem2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = effectDraftDetailAssem;
        this.l1 = effectDraftDetailAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(EffectDraftDetailViewModel effectDraftDetailViewModel, EffectDraftDetailViewModel effectDraftDetailViewModel2, List<String> list) {
        super(0);
        this.$t = list;
        this.l0 = effectDraftDetailViewModel;
        this.l1 = effectDraftDetailViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(SocialThoughtPanelFragment socialThoughtPanelFragment, ThoughtInfo thoughtInfo, int i) {
        super(0);
        this.$t = i;
        this.l0 = socialThoughtPanelFragment;
        this.l1 = thoughtInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(TakoEnterParams takoEnterParams, TakoEnterParams takoEnterParams2, InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf) {
        super(0);
        this.$t = interfaceC20236714Gf;
        this.l0 = takoEnterParams;
        this.l1 = takoEnterParams2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(SchoolUsersListFragment schoolUsersListFragment, TuxSheet tuxSheet, int i) {
        super(0);
        this.$t = i;
        this.l0 = schoolUsersListFragment;
        this.l1 = tuxSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(InvitableListAssem invitableListAssem, InvitableListAssem<T> invitableListAssem2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = invitableListAssem;
        this.l1 = invitableListAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(Function0 function0, C01GW c01gw, int i) {
        super(0);
        this.$t = i;
        this.l0 = function0;
        this.l1 = c01gw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(Function0 function0, ComponentActivity componentActivity, int i) {
        super(0);
        this.$t = i;
        this.l0 = function0;
        this.l1 = componentActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(Function0 function0, Fragment fragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = function0;
        this.l1 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(Function0 function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(0);
        this.$t = function03;
        this.l0 = function0;
        this.l1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(Function1 function1, Function1<? super AbstractC1264080j02<ITEM>, Unit> function12, AbstractC1264080j02<ITEM> abstractC1264080j02) {
        super(0);
        this.$t = abstractC1264080j02;
        this.l0 = function1;
        this.l1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS405S0200000_4(Function1 function1, Function1<? super List<? extends TikTokMediaModel>, Unit> function12, Intent intent) {
        super(0);
        this.$t = intent;
        this.l0 = function1;
        this.l1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS405S0200000_4(C346500DiC c346500DiC, Bitmap bitmap, TuxTextView tuxTextView, int i) {
        super(0);
        this.$t = i;
        this.l0 = bitmap;
        this.l1 = tuxTextView;
    }
}
