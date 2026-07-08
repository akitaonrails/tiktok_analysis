package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C05YD;
import X.C0CWT;
import X.C0GRD;
import X.C0H4V;
import X.C0H5X;
import X.C0H6M;
import X.C0H7E;
import X.C0HHA;
import X.C0HN1;
import X.C0HN3;
import X.C0HPQ;
import X.C0HQH;
import X.C0HQJ;
import X.C0HQK;
import X.C0HVP;
import X.C0HWW;
import X.C0HYP;
import X.C0HZ2;
import X.C0P0T;
import X.C0RF0;
import X.C0ZDN;
import X.C1181890grT;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1388190mED;
import X.C1391190mJ3;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1662100tM0;
import X.C1858110yS9;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C23250099c;
import X.C2344009Gk;
import X.C2471909mP;
import X.C291001Au;
import X.C343970De7;
import X.C420500GeG;
import X.C434640H2o;
import X.C438980HJg;
import X.C441690HTr;
import X.C442090HVf;
import X.C442110HVh;
import X.C724240Sb0;
import X.EnumC437540HDs;
import X.InterfaceC439080HJq;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceBottomPhotosAssem;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.IPoiTagAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell.PoiHighLightIconCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.container.ReferenceSheetFragment;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.HomePageElementRowPowerCell;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.mixstudio.StoryMixStudioButtonComponent;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarSheetFragment;
import com.ss.android.ugc.aweme.tako.botpage.components.botmarket.TakoBotMarketHubAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class AkS52S0200000_6 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS52S0200000_6 akS52S0200000_6, View view) {
        new C0ZDN((Context) akS52S0200000_6.l0).LIZ(0);
        ((C0HN1) akS52S0200000_6.l1).LL.cancelAnimation();
        ((C0HN1) akS52S0200000_6.l1).LL.playAnimation();
        ((C0HN1) akS52S0200000_6.l1).LIZ();
        C0HN3 c0hn3 = ((C0HN1) akS52S0200000_6.l1).LLILZIL;
        if (c0hn3 != null) {
            c0hn3.LIZ();
        }
    }

    public static final void LIZ$1(AkS52S0200000_6 akS52S0200000_6, View view) {
        MixStudioHomePageViewModel mixStudioHomePageViewModelMp = ((MixStudioHomePageAssem) akS52S0200000_6.l0).mp();
        int i = ((C0GRD) akS52S0200000_6.l1).LLIZ;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        mixStudioHomePageViewModelMp.getClass();
        mixStudioHomePageViewModelMp.setState(new AwS21S0010000_6(z, 17));
    }

    public static final void LIZ$10(AkS52S0200000_6 akS52S0200000_6, View view) {
        View view2;
        WeakReference<View> weakReference = ((ReferenceSheetFragment) akS52S0200000_6.l0).LLILZLL;
        if (weakReference != null && (view2 = weakReference.get()) != null) {
            ReferenceSheetFragment referenceSheetFragment = (ReferenceSheetFragment) akS52S0200000_6.l0;
            referenceSheetFragment.LLIZLLLIL = new AwS407S0200000_6(view2, (C434640H2o) akS52S0200000_6.l1, 79);
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(referenceSheetFragment, C343970De7.LIZ);
        }
    }

    public static final void LIZ$11(AkS52S0200000_6 akS52S0200000_6, View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        IPoiTagAbility iPoiTagAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiHighLightIconCell) akS52S0200000_6.l0);
        String strMobPicMode = null;
        if (fragmentLJIIJ != null && (iPoiTagAbility = (IPoiTagAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiTagAbility.class, null)) != null) {
            iPoiTagAbility.DD(((PoiHighLightIconCell) akS52S0200000_6.l0).itemView, null, "highlight", "click_tag");
        }
        PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C1189060h32.LJIIJ((PoiHighLightIconCell) akS52S0200000_6.l0));
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ((PoiHighLightIconCell) akS52S0200000_6.l0);
        if (fragmentLJIIJ2 != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        String str = ((C0H4V) akS52S0200000_6.l1).LLILLJJLI.tagId;
        if (poiDetailResponseLIZ != null) {
            strMobPicMode = poiDetailResponseLIZ.mobPicMode();
        }
        PageFinder pageFinderVia = PageFinder.via((PoiHighLightIconCell) akS52S0200000_6.l0);
        c1185430gxB.getClass();
        C1185430gxB.LJJIZ(pageFinderVia, interfaceC665370Q7zLJFF, str, null, strMobPicMode, "highlight", true);
    }

    public static final void LIZ$12(AkS52S0200000_6 akS52S0200000_6, View view) {
        C0P0T tooltip = ((C441690HTr) akS52S0200000_6.l0).getTooltip();
        if (tooltip != null) {
            tooltip.dismiss();
        }
        Function0<Boolean> function0 = ((C1662100tM0) akS52S0200000_6.l1).LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$13(AkS52S0200000_6 akS52S0200000_6, View view) {
        List<TakoBotInfo> list;
        TakoBotInfo takoBotInfo;
        BotMarketInfo botMarketInfoLJLLLL = ((C0H5X) akS52S0200000_6.l0).LJLLLL();
        if (botMarketInfoLJLLLL != null && (list = botMarketInfoLJLLLL.bots) != null && (takoBotInfo = (TakoBotInfo) C13LP.LJJJLL(list)) != null) {
            C1858110yS9.LIZ(takoBotInfo, ((TakoBotMarketHubAssem) akS52S0200000_6.l1).getContext(), C1558520qew.LJIIL((TakoBotMarketHubAssem) akS52S0200000_6.l1), (View) ((TakoBotMarketHubAssem) akS52S0200000_6.l1).LLJLIL.getValue());
        }
    }

    public static final void LIZ$14(AkS52S0200000_6 akS52S0200000_6, View view) {
        ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).SR().LQ2("click");
        ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).LLJ.getValue();
        if (iSocialAvatarService != null) {
            Context context = ((C197039127h) akS52S0200000_6.l1).getContext();
            String str = ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).SR().LLJJIJIL;
            if (str == null) {
                str = "";
            }
            iSocialAvatarService.LJIILLIIL(new C0HHA(context, "click_avatar_thought_pop_up_banner", str, null, null, 2, true, false, C0HZ2.UNKNOWN, false, null, 3072), null, null);
        }
    }

    public static final void LIZ$15(AkS52S0200000_6 akS52S0200000_6, View view) {
        AccountUserService accountUserServiceLJIIJ;
        InterfaceC439080HJq value;
        EnumC437540HDs enumC437540HDs;
        C05YD<InterfaceC439080HJq> c05ydLIZIZ;
        ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).SR().PQ2("click");
        if (((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).SR().LLLIIIL) {
            ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).SR().LLLIIII.setValue(Boolean.TRUE);
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            String curUserId = accountUserServiceLJIIJ.getCurUserId();
            SocialAvatarFastFlowService socialAvatarFastFlowService = (SocialAvatarFastFlowService) ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).LLIZLLLIL.getValue();
            if (socialAvatarFastFlowService != null && (c05ydLIZIZ = socialAvatarFastFlowService.LIZIZ(curUserId)) != null) {
                value = c05ydLIZIZ.getValue();
            } else {
                value = null;
            }
            if (value instanceof C438980HJg) {
                enumC437540HDs = EnumC437540HDs.START_REGENERATE;
            } else {
                enumC437540HDs = EnumC437540HDs.IDLE;
            }
            ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).LLJ.getValue();
            if (iSocialAvatarService != null) {
                Context context = ((C197039127h) akS52S0200000_6.l1).getContext();
                String str = ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).SR().LLJJIJIL;
                if (str == null) {
                    str = "";
                }
                iSocialAvatarService.LJIILLIIL(new C0HHA(context, "click_avatar_thought_pop_up_banner", str, null, null, 0, false, false, null, true, null, 2808), enumC437540HDs, null);
            }
            ((StoryThoughtAvatarSheetFragment) akS52S0200000_6.l0).SR().LLLLLZL.setValue(Unit.LIZ);
        }
    }

    public static final void LIZ$16(AkS52S0200000_6 akS52S0200000_6, View view) {
        C291001Au<CopyOnWriteArrayList<C0H7E>> c291001Au;
        CopyOnWriteArrayList<C0H7E> copyOnWriteArrayList;
        Map<String, String> map;
        ArrayList arrayList;
        C291001Au<CopyOnWriteArrayList<C0H7E>> c291001Au2;
        CopyOnWriteArrayList<C0H7E> copyOnWriteArrayList2;
        AlbumTrackParams albumTrackParams;
        C0HVP state = ((LocalServiceBottomPhotosAssem) akS52S0200000_6.l0).Ho().getState();
        if (state != null && (c291001Au = state.LLIZLLLIL) != null && (copyOnWriteArrayList = c291001Au.LIZ) != null && (!copyOnWriteArrayList.isEmpty())) {
            PageFinder pageFinderVia = PageFinder.via(((LocalServiceBottomPhotosAssem) akS52S0200000_6.l0).LJJIJL());
            C442110HVh c442110HVh = ((LocalServiceBottomPhotosAssem) akS52S0200000_6.l0).Ho().LLJI;
            C19EG c19egLIZIZ = null;
            if (c442110HVh != null && (albumTrackParams = c442110HVh.LJFF) != null) {
                map = albumTrackParams.generalMobParams;
            } else {
                map = null;
            }
            C442090HVf.LIZLLL(pageFinderVia, "confirm_click", "", map);
            LocalServiceAlbumVM localServiceAlbumVMHo = ((LocalServiceBottomPhotosAssem) akS52S0200000_6.l0).Ho();
            Context context = ((TuxTextView) akS52S0200000_6.l1).getContext();
            if (context != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(context);
            }
            C0HVP state2 = ((LocalServiceBottomPhotosAssem) akS52S0200000_6.l0).Ho().getState();
            if (state2 != null && (c291001Au2 = state2.LLIZLLLIL) != null && (copyOnWriteArrayList2 = c291001Au2.LIZ) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList2, 10));
                Iterator<C0H7E> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C2471909mP.LJIILIIL(it2.next().LIZ.LJFF()));
                }
            } else {
                arrayList = new ArrayList();
            }
            localServiceAlbumVMHo.AQ2(c19egLIZIZ, arrayList, "album", new AwS550S0100000_6((LocalServiceBottomPhotosAssem) akS52S0200000_6.l0, 1606));
        }
    }

    public static final void LIZ$2(AkS52S0200000_6 akS52S0200000_6, View view) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((MixStudioResultsBaseAssem) akS52S0200000_6.l0), null, null, new C0HQH((MixStudioResultsBaseAssem) akS52S0200000_6.l0, (C197039127h) akS52S0200000_6.l1, null), 3);
    }

    public static final void LIZ$3(AkS52S0200000_6 akS52S0200000_6, View view) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((MixStudioResultsBaseAssem) akS52S0200000_6.l0), null, null, new C0HQK((MixStudioResultsBaseAssem) akS52S0200000_6.l0, (Context) akS52S0200000_6.l1, null), 3);
    }

    public static final void LIZ$4(AkS52S0200000_6 akS52S0200000_6, View view) {
        MixStudioResultsBaseAssem mixStudioResultsBaseAssem = (MixStudioResultsBaseAssem) akS52S0200000_6.l0;
        mixStudioResultsBaseAssem.LLJJJIL = true;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(mixStudioResultsBaseAssem), null, null, new C0HQJ((MixStudioResultsBaseAssem) akS52S0200000_6.l0, (Context) akS52S0200000_6.l1, null), 3);
    }

    public static final void LIZ$5(AkS52S0200000_6 akS52S0200000_6, View view) {
        C0RF0 c0rf0;
        Fragment fragment;
        LifecycleCoroutineScope lifecycleScope;
        C19EG c19egLIZ = C724240Sb0.LIZ((StoryMixStudioButtonComponent) akS52S0200000_6.l0);
        if (c19egLIZ != null && (c0rf0 = ((StoryMixStudioButtonComponent) akS52S0200000_6.l0).jm().LIZLLL) != null && (fragment = c0rf0.LIZJ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C0CWT((StoryMixStudioButtonComponent) akS52S0200000_6.l0, c19egLIZ, (View) akS52S0200000_6.l1, null), 3);
        }
    }

    public static final void LIZ$6(AkS52S0200000_6 akS52S0200000_6, View view) {
        C0HWW.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("social_avatar_edit_profile_top_banner", c2344009Gk.LIZ);
        ((MusProfileEditFragment) akS52S0200000_6.l0).CT().LJIILLIIL(new C0HHA((Context) akS52S0200000_6.l1, "click_edit_profile_top_banner", "personal_homepage", null, null, 4, false, false, C0HZ2.PROMO_EDIT_PROFILE_BANNER, false, null, 3512), null, null);
        ((MusProfileEditFragment) akS52S0200000_6.l0).ET();
        C0HYP.LIZ.getClass();
        C0HYP.LJ().storeBoolean("edit_profile_banner_clicked", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$7(irm.AkS52S0200000_6 r11, android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS52S0200000_6.LIZ$7(irm.AkS52S0200000_6, android.view.View):void");
    }

    public static final void LIZ$8(AkS52S0200000_6 akS52S0200000_6, View view) {
        C0HPQ c0hpqL5;
        C0H6M elementDisplayStrategy = ((C420500GeG) akS52S0200000_6.l0).getElementDisplayStrategy();
        if (elementDisplayStrategy != null && (c0hpqL5 = ((HomePageElementRowPowerCell) akS52S0200000_6.l1).L5()) != null) {
            c0hpqL5.vl(elementDisplayStrategy);
        }
    }

    public static final void LIZ$9(AkS52S0200000_6 akS52S0200000_6, View view) {
        C0H6M elementDisplayStrategy = ((C420500GeG) akS52S0200000_6.l0).getElementDisplayStrategy();
        if (elementDisplayStrategy != null) {
            ((MixStudioHomePageAssem) akS52S0200000_6.l1).lp(elementDisplayStrategy);
        }
    }

    public AkS52S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
