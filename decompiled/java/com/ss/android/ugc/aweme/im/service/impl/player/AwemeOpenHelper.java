package com.ss.android.ugc.aweme.im.service.impl.player;

import X.AbstractC1387200mCc;
import X.AnonymousClass0629;
import X.C06UN;
import X.C0I0B;
import X.C0Z92;
import X.C0ZDX;
import X.C0ZU4;
import X.C0ZU5;
import X.C0ZU6;
import X.C0ZUL;
import X.C0ZUN;
import X.C1220000hqw;
import X.C1229100i5c;
import X.C1370970lmR;
import X.C1388190mED;
import X.C13LE;
import X.C1603960rqE;
import X.C1606620ruW;
import X.C1606640ruY;
import X.C1622206Wu;
import X.C1668706g9;
import X.C1906580ziK;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C23250099c;
import X.C310720CFy;
import X.C327280CsI;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C686150Qvl;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C900360ZTu;
import X.C913060Zrs;
import X.EnumC1241110iOz;
import X.EnumC1381750m3p;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;
import com.ss.android.ugc.aweme.im.service.impl.AwemeCoverManager;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.highlights.feed.ShareHighlightCollectionFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.feed.ShareHighlightFeedSharedVM;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class AwemeOpenHelper implements IAwemeOpenHelper {
    public static final AwemeOpenHelper LIZIZ = new AwemeOpenHelper();

    public static final class Service implements IAwemeOpenHelper {
        public final /* synthetic */ AwemeOpenHelper LIZIZ = AwemeOpenHelper.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
        public final void LIZ(String str, Aweme aweme, String str2, String str3, String str4, SessionInfo sessionInfo, C0ZU4 c0zu4) {
            this.LIZIZ.LIZ(str, aweme, str2, str3, str4, sessionInfo, c0zu4);
        }

        @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
        public final void LIZIZ(Fragment fragment, String str, String str2, String str3, User user, String str4, SessionInfo sessionInfo, C869590Y9l c869590Y9l) {
            this.LIZIZ.LIZIZ(fragment, str, str2, str3, user, str4, sessionInfo, c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
        public final void LIZJ(Context context, Long l, String str, String str2, SessionInfo sessionInfo) {
            this.LIZIZ.LIZJ(context, l, str, str2, sessionInfo);
        }

        @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
        public final void LIZLLL(Context context, String str, SessionInfo sessionInfo, String str2, String str3, boolean z) {
            this.LIZIZ.LIZLLL(context, str, sessionInfo, str2, str3, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
        public final void LJ(Context context, C0Z92 c0z92, Aweme aweme, int i, List<? extends C869590Y9l> list, String str, C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str2, boolean z, String str3, String str4, String str5, View view, String str6, C0ZU4 c0zu4) {
            this.LIZIZ.LJ(context, c0z92, aweme, i, list, str, c869590Y9l, sessionInfo, str2, z, str3, str4, str5, view, str6, c0zu4);
        }

        @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
        public final void LJFF(Context context, SessionInfo sessionInfo) {
            this.LIZIZ.LJFF(context, sessionInfo);
        }

        @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
        public final void LJI(Context context, C0Z92 c0z92, int i, String str, C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str2, String str3) {
            this.LIZIZ.LJI(context, c0z92, i, str, c869590Y9l, sessionInfo, str2, str3);
        }
    }

    public static boolean LJIIIIZZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        IMAIServiceAPI.LIZ.getClass();
        return AnonymousClass0629.LIZ().LIZ().LJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
    public final void LJFF(Context context, SessionInfo sessionInfo) {
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpi$default(IAwemeImManager.class, false, false, false, 14, null);
        if (iAwemeImManager != null && iAwemeImManager.getProxy() != null) {
            IInternalShareApi.LIZ.getClass();
            C1603960rqE.LIZLLL = C1370970lmR.LIZ().LIZIZ().LJJJJJL(sessionInfo);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, new C686150Qvl("aweme://aweme/detail/").LIZJ());
        smartRouteBuildRoute.withParam("refer", "chat");
        smartRouteBuildRoute.withParam("video_from", "from_chat");
        smartRouteBuildRoute.withParam("enter_position", "effect_inline");
        smartRouteBuildRoute.withParam("conversation_id", sessionInfo.getConversationId());
        smartRouteBuildRoute.withParam("chatroom_session_uuid", sessionInfo.getUuid());
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
    public final void LIZJ(Context context, Long l, String str, String str2, SessionInfo sessionInfo) {
        Aweme awemeLLILZ;
        int enterpriseType;
        if (str == null) {
            return;
        }
        C0ZUN proxy = ((IAwemeImManager) ServiceManager.get().getService(IAwemeImManager.class)).getProxy();
        AwemeCoverManager.LIZIZ.getClass();
        Pair pairLJII = AwemeCoverManager.LJII(str);
        if (pairLJII != null) {
            awemeLLILZ = (Aweme) pairLJII.getSecond();
        } else {
            awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        }
        if (proxy != null) {
            C1603960rqE.LIZLLL = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIIJ(awemeLLILZ, l, str, str2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_from_chat_room_playing", true);
        C786410Ut5.LJJJI("conversation_id", sessionInfo.getConversationId(), bundle);
        C786410Ut5.LJJJI("chatroom_session_uuid", sessionInfo.getUuid(), bundle);
        bundle.putInt("chat_type", sessionInfo.getChatType());
        bundle.putBoolean("show_reply_panel", false);
        if (proxy != null) {
            if (awemeLLILZ != null) {
                enterpriseType = AwemeExtKt.getEnterpriseType(awemeLLILZ);
            } else {
                enterpriseType = 0;
            }
            C1606620ruW.LIZ(context, str, "chat_inline_msg", enterpriseType, null, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
    public final void LIZLLL(Context context, String str, SessionInfo sessionInfo, String str2, String str3, boolean z) {
        String str4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed DM reply message clicked: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (sessionInfo.isGroupChat()) {
            str4 = "group_chat";
        } else {
            str4 = "chat";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aweme://aweme/detail/");
        sbLIZ2.append(str);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ2)).LIZJ());
        if (C1606640ruY.LIZIZ(C0ZUL.SMART_ROUTER)) {
            if (C1606640ruY.LIZLLL()) {
                smartRouteBuildRoute.withParam("use_saf", 1);
                smartRouteBuildRoute.withParam("im_chat_to_detail_saf", true);
            } else if (C1606640ruY.LJ()) {
                smartRouteBuildRoute.withParam("use_saf", 2);
                smartRouteBuildRoute.withParam("im_chat_to_detail_saf", true);
            }
        }
        smartRouteBuildRoute.withParam("refer", str4);
        smartRouteBuildRoute.withParam("video_from", "from_chat");
        smartRouteBuildRoute.withParam("enter_method", "click_feed_dm_reply_msg");
        smartRouteBuildRoute.withParam("to_uid", str2);
        smartRouteBuildRoute.withParam("to_sec_uid", str3);
        smartRouteBuildRoute.withParam("key_from_chat_room_playing", true);
        smartRouteBuildRoute.withParam("key_from_chat_room_real_aid", str);
        smartRouteBuildRoute.withParam("conversation_id", sessionInfo.getConversationId());
        smartRouteBuildRoute.withParam("chatroom_session_uuid", sessionInfo.getUuid());
        if (z) {
            smartRouteBuildRoute.withParam("if_nudge", "1");
        }
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
    public final void LIZ(String str, Aweme aweme, String str2, String str3, String str4, SessionInfo sessionInfo, C0ZU4 c0zu4) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        Integer numValueOf;
        IStoryService iStoryService;
        C0ZU6.LIZ.getClass();
        if (aweme != null && (iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpiForReal(IStoryService.class)) != null) {
            iStoryService.LJJIIZ(aweme, str);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            HashMap map = new HashMap();
            if (str2 != null) {
                map.put("story_extra_author_uid", str2);
                map.put("enter_position", "video_cover");
            }
            int i = C0ZU5.LIZ[c0zu4.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    map.put("enter_position", EnumC1241110iOz.SHARED_VIDEO.getEtString());
                    map.put("previous_page", "chat_settings");
                }
            } else {
                map.put("tab_name", EnumC1381750m3p.SHARED_VIDEO.getEtString());
                map.put("previous_page", "chat_settings");
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, "aweme://story/detail");
            smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_DEFAULT");
            smartRouteBuildRoute.withParam("enter_from", "chat");
            smartRouteBuildRoute.withParam("enter_method", str4);
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
            smartRouteBuildRoute.withParam("feed_param_extra", map);
            smartRouteBuildRoute.withParam("conversation_id", str3);
            String uuid = null;
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
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
    public final void LIZIZ(Fragment fragment, String str, String str2, String str3, User user, String str4, SessionInfo sessionInfo, C869590Y9l c869590Y9l) {
        Fragment fragment2;
        InterfaceC497601wk viewModelScope;
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(198);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareHighlightFeedSharedVM.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(184);
        C451460Hn6 c451460Hn6 = new C451460Hn6(fragment, false);
        C451620HnM c451620HnM = new C451620HnM(fragment, true);
        C338520DOw c338520DOw = new C338520DOw(fragment);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
        boolean z = fragment instanceof HasDefaultViewModelProviderFactory;
        Fragment fragment3 = null;
        if (z) {
            fragment3 = fragment;
        }
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ, aFwS213S0000000_24, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(fragment3), aFwS264S0000000_24, c451460Hn6, c451620HnM, c338520DOw);
        AFwS213S0000000_24 aFwS213S0000000_242 = AFwS213S0000000_24.get$arr$(197);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ShareHighlightCollectionFeedSharedVM.class);
        AFwS264S0000000_24 aFwS264S0000000_242 = AFwS264S0000000_24.get$arr$(185);
        C451460Hn6 c451460Hn62 = new C451460Hn6(fragment, false);
        C451620HnM c451620HnM2 = new C451620HnM(fragment, true);
        C338520DOw c338520DOw2 = new C338520DOw(fragment);
        C1622206Wu c1622206WuLJII2 = C724750Sbp.LJII(fragment);
        if (z) {
            fragment2 = fragment;
        } else {
            fragment2 = null;
        }
        C736950SvV c736950SvV2 = new C736950SvV(c19719912DlLIZ2, aFwS213S0000000_242, c452070Ho5, c1622206WuLJII2, C1220000hqw.LIZ(fragment2), aFwS264S0000000_242, c451460Hn62, c451620HnM2, c338520DOw2);
        C0ZU6 c0zu6 = C0ZU6.LIZ;
        ShareHighlightFeedSharedVM shareHighlightFeedSharedVM = (ShareHighlightFeedSharedVM) c736950SvV.getValue();
        ShareHighlightCollectionFeedSharedVM shareHighlightCollectionFeedSharedVM = (ShareHighlightCollectionFeedSharedVM) c736950SvV2.getValue();
        Context context = fragment.getContext();
        if (context != null) {
            c0zu6.getClass();
            if (Intrinsics.LJFF(str, "share_highlight_story")) {
                viewModelScope = ViewModelKt.getViewModelScope(shareHighlightFeedSharedVM);
            } else if (!Intrinsics.LJFF(str, "share_highlight_story_collection")) {
                return;
            } else {
                viewModelScope = ViewModelKt.getViewModelScope(shareHighlightCollectionFeedSharedVM);
            }
            C23250099c.LIZLLL(viewModelScope, null, null, new C06UN(str2, str3, c869590Y9l, str, shareHighlightFeedSharedVM, context, user, str4, sessionInfo, shareHighlightCollectionFeedSharedVM, null), 3);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
    public final void LJI(Context context, C0Z92 c0z92, int i, String str, C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str2, String str3) {
        IAwemeImManager iAwemeImManager;
        boolean z;
        String strLJ;
        if (str != null && str.length() != 0 && c869590Y9l != null && (iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpi$default(IAwemeImManager.class, false, false, false, 14, null)) != null && iAwemeImManager.getProxy() != null) {
            C310720CFy c310720CFyLIZIZ = C1606620ruW.LIZIZ();
            if (c310720CFyLIZIZ != null) {
                z = c310720CFyLIZIZ.LIZJ;
            } else {
                z = false;
            }
            C913060Zrs.LIZ(str, i, 4);
            if (!z) {
                C1603960rqE.LIZLLL = new C900360ZTu(c869590Y9l.getConversationId(), c869590Y9l, null, Boolean.valueOf(sessionInfo.isMediaMsgMasking()), true, Collections.singletonList(c869590Y9l), true);
            }
            boolean zLIZIZ = C327280CsI.LIZJ.LIZIZ(str);
            IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMessageAdapterAnalytics.class, false, false, false, 14, null);
            if (iIMMessageAdapterAnalytics != null) {
                iIMMessageAdapterAnalytics.LJI(false, false, i, zLIZIZ, C0I0B.LJFF.LIZIZ());
            }
            Bundle bundle = new Bundle();
            int chatType = sessionInfo.getChatType();
            IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpi$default(IIMAnalyticsUtil.class, false, false, false, 14, null);
            if (iIMAnalyticsUtil == null || (strLJ = iIMAnalyticsUtil.LJ(sessionInfo)) == null) {
                strLJ = "";
            }
            LJII(bundle, c0z92, str, c869590Y9l, chatType, strLJ, C1229100i5c.LJI(sessionInfo.getConversationId()), true, null, sessionInfo.getUuid(), "chat", "", str2, str3, null);
            C1606620ruW.LIZ(context, str, "chat", 0, null, bundle);
            C913060Zrs.LIZIZ(str);
        }
    }

    public final Bundle LJII(Bundle bundle, C0Z92 c0z92, String str, C869590Y9l c869590Y9l, int i, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11;
        boolean zLJIL = C0ZDX.LJIL(c869590Y9l);
        C786410Ut5.LJJJI("key_im_aweme_open_from", c0z92.getFrom(), bundle);
        bundle.putBoolean("key_from_chat_room_playing", true);
        C786410Ut5.LJJJI("key_from_chat_room_real_aid", str, bundle);
        bundle.putInt("is_from_auto_message", zLJIL ? 1 : 0);
        C786410Ut5.LJJJI("conversation_id", c869590Y9l.getConversationId(), bundle);
        C786410Ut5.LJJJI("chatroom_session_uuid", str5, bundle);
        bundle.putInt("chat_type", i);
        C786410Ut5.LJJJI("chat_type_str", str2, bundle);
        C786410Ut5.LJJJI("group_type", str3, bundle);
        C786410Ut5.LJJJI("enter_method", str7, bundle);
        C786410Ut5.LJJJI("previous_page", str6, bundle);
        C786410Ut5.LJJJI("source_btm_token", str10, bundle);
        C786410Ut5.LJJIZ(bundle, "message", c869590Y9l);
        IMAIServiceAPI.LIZ.getClass();
        if (AnonymousClass0629.LIZ().LIZ().LJJIIJ(c869590Y9l)) {
            str11 = "ai_auto_share_video";
        } else {
            str11 = "default";
        }
        C786410Ut5.LJJJI("enter_position", str11, bundle);
        if (!z) {
            bundle.putLong("message_id", c869590Y9l.getMsgId());
        }
        if (Intrinsics.LJFF(str7, "click_quoted_message")) {
            bundle.putBoolean("key_from_quoted_video", true);
        }
        C786410Ut5.LJJJI("key_chat_from_user_id", str8, bundle);
        C786410Ut5.LJJJI("key_chat_from_user_nickname", str9, bundle);
        if (str4 != null && str4.length() != 0) {
            C786410Ut5.LJJJI("cid", str4, bundle);
            C786410Ut5.LJJJI("realItemId", str, bundle);
        }
        if (LJIIIIZZ(c869590Y9l.getConversationId())) {
            bundle.putBoolean("show_reply_panel", false);
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r49 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06a2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0210  */
    @Override // com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.content.Context r47, X.C0Z92 r48, com.ss.android.ugc.aweme.feed.model.Aweme r49, int r50, java.util.List<? extends X.C869590Y9l> r51, java.lang.String r52, X.C869590Y9l r53, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r54, java.lang.String r55, boolean r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, android.view.View r60, java.lang.String r61, X.C0ZU4 r62) {
        /*
            Method dump skipped, instruction units count: 1699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.player.AwemeOpenHelper.LJ(android.content.Context, X.0Z92, com.ss.android.ugc.aweme.feed.model.Aweme, int, java.util.List, java.lang.String, X.0Y9l, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, android.view.View, java.lang.String, X.0ZU4):void");
    }
}
