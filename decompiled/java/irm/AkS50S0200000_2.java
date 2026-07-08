package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C06US;
import X.C0LAB;
import X.C0QSJ;
import X.C0XF1;
import X.C1212040he6;
import X.C1370970lmR;
import X.C1388190mED;
import X.C1519805xE;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C631370Opb;
import X.C687700QyG;
import X.InterfaceC1519705xD;
import X.InterfaceC1682240tsU;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelListCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsShareComponent;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoNoNetworkAssem;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsBannerComponent;

/* JADX INFO: loaded from: classes3.dex */
public class AkS50S0200000_2 extends AbstractViewOnClickListenerC1173120gdK {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS50S0200000_2 akS50S0200000_2, View view) {
        TakoAIVideoNoNetworkAssem takoAIVideoNoNetworkAssem = (TakoAIVideoNoNetworkAssem) akS50S0200000_2.l0;
        View view2 = (View) akS50S0200000_2.l1;
        takoAIVideoNoNetworkAssem.getClass();
        C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
        Context context = view2.getContext();
        c1519805xE.getClass();
        if (!C0XF1.LIZLLL(context)) {
            C1212040he6.LIZIZ(2131827517, view2);
            takoAIVideoNoNetworkAssem.LLJJI.setValue(Boolean.TRUE);
            return;
        }
        takoAIVideoNoNetworkAssem.LLJJI.setValue(Boolean.FALSE);
        InterfaceC1682240tsU interfaceC1682240tsU = takoAIVideoNoNetworkAssem.LLJJIJIIJIL;
        if (interfaceC1682240tsU == null) {
            synchronized (takoAIVideoNoNetworkAssem) {
                interfaceC1682240tsU = takoAIVideoNoNetworkAssem.LLJJIJIIJIL;
                if (interfaceC1682240tsU == null) {
                    C0QSJ c0qsjHp = takoAIVideoNoNetworkAssem.hp();
                    if (c0qsjHp != null) {
                        interfaceC1682240tsU = (InterfaceC1682240tsU) c0qsjHp.getAbility(InterfaceC1682240tsU.class);
                        C687700QyG.LJ(interfaceC1682240tsU, InterfaceC1682240tsU.class);
                    } else {
                        interfaceC1682240tsU = null;
                    }
                    takoAIVideoNoNetworkAssem.LLJJIJIIJIL = interfaceC1682240tsU;
                }
            }
        }
        interfaceC1682240tsU.wf();
    }

    public static final void LIZ$1(AkS50S0200000_2 akS50S0200000_2, View view) {
        String eventType;
        String enterMethodValue;
        String eventType2;
        StoryHighlightCollection storyHighlightCollection;
        String str;
        ShareService shareService = (ShareService) PluggableExtentionKt.pluggableSpi$default(ShareService.class, false, false, false, 14, null);
        if (shareService != null) {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((StoryHighlightsShareComponent) akS50S0200000_2.l0)).getAweme();
            StoryHighlightInfo storyHighlightInfo = aweme.storyHighlightInfo;
            if (storyHighlightInfo != null) {
                storyHighlightInfo.setSharedFromHighlightImmersiveFeed(true);
            }
            C19EG c19eg = (C19EG) akS50S0200000_2.l1;
            C2189821An6 c2189821An6 = (C2189821An6) ((StoryHighlightsShareComponent) akS50S0200000_2.l0).LLJLLIL.getValue();
            String str2 = "";
            if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
                eventType = "";
            }
            C2189821An6 c2189821An62 = (C2189821An6) ((StoryHighlightsShareComponent) akS50S0200000_2.l0).LLJLLIL.getValue();
            if (c2189821An62 == null || (enterMethodValue = c2189821An62.getEnterMethodValue()) == null) {
                enterMethodValue = "";
            }
            AwemeSharePackage awemeSharePackageLJJIFFI = shareService.LJJIFFI(c19eg, eventType, aweme, enterMethodValue);
            if (awemeSharePackageLJJIFFI != null) {
                C06US c06us = C06US.LIZ;
                C2189821An6 c2189821An63 = (C2189821An6) ((StoryHighlightsShareComponent) akS50S0200000_2.l0).LLJLLIL.getValue();
                if (c2189821An63 == null || (eventType2 = c2189821An63.getEventType()) == null) {
                    eventType2 = "";
                }
                StoryHighlightInfo storyHighlightInfo2 = ((VideoItemParams) C631370Opb.LIZ((StoryHighlightsShareComponent) akS50S0200000_2.l0)).getAweme().storyHighlightInfo;
                if (storyHighlightInfo2 != null && (storyHighlightCollection = storyHighlightInfo2.containerCollectionInfo) != null && (str = storyHighlightCollection.collectionId) != null) {
                    str2 = str;
                }
                c06us.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", eventType2);
                c0lab.LJ("content_type", "story_highlight");
                c0lab.LJ("story_highlight_id", str2);
                C20684815ws.LJIILLIIL("click_more_button", c0lab.LIZ);
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZIZ().LJFF((C19EG) akS50S0200000_2.l1, awemeSharePackageLJJIFFI, null, null, false, null, false, null, false, true, Boolean.TRUE, false, false, null);
            }
        }
    }

    public static final void LIZ$2(AkS50S0200000_2 akS50S0200000_2, View view) {
        RepostPanelListCell repostPanelListCell = (RepostPanelListCell) akS50S0200000_2.l0;
        User user = (User) akS50S0200000_2.l1;
        repostPanelListCell.getClass();
        if (user != null) {
            ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LIZ(user);
            Activity activityLIZ = C1388190mED.LIZ(repostPanelListCell.itemView.getContext());
            if (activityLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://user/profile/");
                sbLIZ.append(user.getUid());
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, C2188811AlT.LIZIZ(sbLIZ));
                smartRouteBuildRoute.withParam("uid", user.getUid());
                smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
                smartRouteBuildRoute.withParam("enter_from", "live_repost_list");
                smartRouteBuildRoute.open();
            }
        }
    }

    public static final void LIZ$3(AkS50S0200000_2 akS50S0200000_2, View view) {
        AssemVMLazy assemVMLazy = ((HeaderStoryHighlightsBannerComponent) akS50S0200000_2.l0).LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HeaderStoryHighlightsBannerComponent.LLJLIL;
        assemVMLazy.getValue();
        C06US.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        c0lab.LJ("enter_method", "new_user_prompt");
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_create_btn_click", c0lab.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) akS50S0200000_2.l1, "//story/highlights_creation");
        smartRouteBuildRoute.withParam("enter_method", "new_user_prompt");
        smartRouteBuildRoute.open();
    }

    public AkS50S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
