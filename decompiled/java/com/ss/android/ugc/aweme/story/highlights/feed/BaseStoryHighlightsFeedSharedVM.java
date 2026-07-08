package com.ss.android.ugc.aweme.story.highlights.feed;

import X.AbstractC316870CbV;
import X.C06US;
import X.C0B0Z;
import X.C0LAB;
import X.C1388190mED;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2189821An6;
import X.C317290CcB;
import X.C325910Cq5;
import X.C627660Ojc;
import X.C710330Rtf;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS32S2100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class BaseStoryHighlightsFeedSharedVM extends BaseDetailShareVM<C325910Cq5, InterfaceC1891350zJl, Long> {
    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325910Cq5(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        List<Aweme> list = ((C325910Cq5) getState()).LLILLJJLI;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public static void DQ2(Context context) {
        if (!((Boolean) C0B0Z.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://story/detail");
        smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_HIGHLIGHTS");
        smartRouteBuildRoute.withParam("enter_from", "chat");
        smartRouteBuildRoute.withParam("share_unavailable_high_light", true);
        smartRouteBuildRoute.withParam("story_cover_transition", false);
        smartRouteBuildRoute.open();
    }

    public static void EQ2(UserStory userStory) {
        Aweme awemeLLILLL;
        List<Aweme> stories = userStory.getStories();
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : stories) {
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (iAwemeService != null && (awemeLLILLL = iAwemeService.LLILLL(aweme)) != null) {
                aweme = awemeLLILLL;
            }
            arrayList.add(aweme);
        }
        userStory.setStories(arrayList);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Number) obj).longValue();
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return 0L;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void BQ2(Context context, String str, List<? extends Aweme> list, String str2, String str3, String str4, String str5, SessionInfo sessionInfo) {
        String str6;
        String str7;
        Integer numValueOf;
        setState(new AwS32S2100000_4((List) list, (List<? extends Aweme>) str2, str3, (String) 2));
        String str8 = "click_entire_highlight";
        switch (str.hashCode()) {
            case -1694530411:
                str6 = str.equals("skylight") ? "story_top_anchor" : "homepage_entrance";
                break;
            case 293534484:
                str6 = str.equals("page_key_share_story_in_highlight") ? "click_story_in_highlight" : "homepage_entrance";
                break;
            case 838987001:
                str6 = str.equals("page_key_share_highlight_collection") ? "click_entire_highlight" : "homepage_entrance";
                break;
            case 1404731365:
                str6 = str.equals("inbox_skylight_feed_anchor") ? "story_top_cell_anchor" : "homepage_entrance";
                break;
            default:
                str6 = "homepage_entrance";
                break;
        }
        HashMap mapLJI = C2097608Jq.LJI(new Pair("enter_position", str6), new Pair("story_highlights_page_key", str));
        if (str3 != null) {
            mapLJI.put("story_card_target_aid", str3);
        }
        if (Intrinsics.LJFF(str, "other_profile")) {
            str7 = "others_homepage";
        } else if (Intrinsics.LJFF(str, "my_profile")) {
            str7 = "personal_homepage";
        } else if (str4 == null) {
            str7 = "";
        } else {
            str7 = str4;
        }
        switch (str.hashCode()) {
            case -1694530411:
                str8 = str.equals("skylight") ? "story_top_anchor" : "homepage_entrance";
                break;
            case 293534484:
                str8 = str.equals("page_key_share_story_in_highlight") ? "click_story_in_highlight" : "homepage_entrance";
                break;
            case 838987001:
                if (!str.equals("page_key_share_highlight_collection")) {
                    str8 = "homepage_entrance";
                }
                break;
            case 1404731365:
                str8 = str.equals("inbox_skylight_feed_anchor") ? "story_top_cell_anchor" : "homepage_entrance";
                break;
            default:
                str8 = "homepage_entrance";
                break;
        }
        C06US.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str7);
        c0lab.LJ("enter_method", str8);
        c0lab.LJ("flow_type", "highlight");
        c0lab.LJ("story_highlight_id", str2);
        C20684815ws.LJIILLIIL("ttsocial_story_immersive_flow_enter", c0lab.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://story/detail");
        smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_HIGHLIGHTS");
        smartRouteBuildRoute.withParam("enter_from", str4);
        smartRouteBuildRoute.withParam("feed_param_extra", mapLJI);
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str2);
        String uuid = null;
        C19EG c19eg = null;
        if (!Intrinsics.LJFF(str, "page_key_share_story_in_highlight") && !Intrinsics.LJFF(str, "page_key_share_highlight_collection")) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ instanceof C19EG) {
                c19eg = (C19EG) activityLIZ;
            }
            C710330Rtf.LIZLLL(smartRouteBuildRoute, c19eg, "STORY_ENTRANCE_HIGHLIGHTS");
            smartRouteBuildRoute.withParam("story_cover_transition", true);
        } else {
            smartRouteBuildRoute.withParam("enter_method", "click");
            smartRouteBuildRoute.withParam("conversation_id", str5);
            if (sessionInfo != null) {
                numValueOf = Integer.valueOf(sessionInfo.getChatType());
            } else {
                numValueOf = null;
            }
            smartRouteBuildRoute.withParam("chat_type", numValueOf);
            if (sessionInfo != null) {
                uuid = sessionInfo.getUuid();
            }
            smartRouteBuildRoute.withParam("chatroom_session_uuid", uuid);
            smartRouteBuildRoute.withParam("story_cover_transition", false);
        }
        smartRouteBuildRoute.open();
    }
}
