package com.ss.android.ugc.aweme.im.service.impl;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C051M;
import X.C069A;
import X.C069P;
import X.C09R3;
import X.C0CNO;
import X.C0I08;
import X.C0I0B;
import X.C0I29;
import X.C0PEM;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0SZG;
import X.C0Y8T;
import X.C0YI4;
import X.C0YI5;
import X.C0YNP;
import X.C0YNY;
import X.C0YSQ;
import X.C0YTZ;
import X.C0Z7K;
import X.C0ZDT;
import X.C0ZGS;
import X.C0ZGV;
import X.C0ZGW;
import X.C0ZGX;
import X.C0ZGY;
import X.C0ZH0;
import X.C0ZH1;
import X.C1209800haU;
import X.C1229100i5c;
import X.C123100dR;
import X.C1231270i97;
import X.C1336205Ku;
import X.C1360320lVG;
import X.C1360460lVU;
import X.C13DA;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C1479505qj;
import X.C1490190osj;
import X.C1512805w6;
import X.C1593906Lx;
import X.C1603860rq4;
import X.C1618506Vj;
import X.C1689106jR;
import X.C1697810uHb;
import X.C1703106lh;
import X.C1807670x8n;
import X.C1903780zdo;
import X.C1906580ziK;
import X.C1954807lC;
import X.C19EG;
import X.C19EH;
import X.C1A1H;
import X.C1BGS;
import X.C1DFB;
import X.C20271514Tp;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C278880AwQ;
import X.C298460Bmu;
import X.C300810Bqh;
import X.C452501pT;
import X.C456970Hvz;
import X.C457000Hw2;
import X.C459530I0h;
import X.C703302op;
import X.C729510SjV;
import X.C735840Sti;
import X.C786410Ut5;
import X.C830490Whz;
import X.C866530Xz1;
import X.C869590Y9l;
import X.C870340YCi;
import X.C874730YTf;
import X.C874780YTk;
import X.C874810YTn;
import X.C876310YZh;
import X.C876340YZk;
import X.C882340YjQ;
import X.C890330YwJ;
import X.C894080Z5q;
import X.C896820ZGe;
import X.C907170ZiN;
import X.C912950Zrh;
import X.C912960Zri;
import X.C913030Zrp;
import X.C913040Zrq;
import X.C913090Zrv;
import X.C913380ZsO;
import X.C914120Zta;
import X.EnumC2172611A1b;
import X.EnumC2262571Dh9;
import X.EnumC883570YlP;
import X.EnumC896890ZGl;
import X.EnumC913000Zrm;
import X.EnumC913010Zrn;
import X.InterfaceC1493505sz;
import X.InterfaceC1618460sDc;
import X.InterfaceC1743406sC;
import X.InterfaceC1808720xAU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC714750S1x;
import X.InterfaceC874680YTa;
import X.InterfaceC876950Yaj;
import X.InterfaceC913210Zs7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.im.core.api.service.IGlobalActionExecutor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteInfo;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatlist.api.model.ChatInviteViewModel;
import com.ss.android.ugc.aweme.im.chatlist.api.model.DMNavArg;
import com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.common.block.IBlockSystemMsgManager;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.content.BaseText;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.quickchat.QuickMessageService;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.router.DmRouterInterceptor;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes15.dex */
public final class IMChatService implements IIMChatService {
    public static final IMChatService LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final List<String> LJFF;
    public volatile InterfaceC1808720xAU LIZ;

    public static final class Service implements IIMChatService {
        public final /* synthetic */ IMChatService LIZ = IMChatService.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LIZ() {
            this.LIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LIZIZ(C19EG c19eg, FragmentManager fragmentManager, User user, Aweme aweme, String str, String str2, Function1 function1, C0SZG c0szg, boolean z, boolean z2, EnumC896890ZGl enumC896890ZGl, String str3, String str4, String str5, QuickDMEventParam quickDMEventParam, C0I08 c0i08, C0ZH0 c0zh0, String str6, String str7, InterfaceC714750S1x interfaceC714750S1x, boolean z3, Function1 function12, Function0 function0) {
            this.LIZ.LIZIZ(c19eg, fragmentManager, user, aweme, str, str2, function1, c0szg, z, z2, enumC896890ZGl, str3, str4, str5, quickDMEventParam, c0i08, c0zh0, str6, str7, interfaceC714750S1x, z3, function12, function0);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final boolean LIZJ(Activity activity, Uri uri) {
            return this.LIZ.LIZJ(activity, uri);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final ChatRootFragment LIZLLL(Bundle bundle) {
            return this.LIZ.LIZLLL(bundle);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final ChatInviteViewModel LJ(C19EG c19eg) {
            return this.LIZ.LJ(c19eg);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJFF(C19EG c19eg, FragmentManager fragmentManager, String str, String str2, String str3, C869590Y9l c869590Y9l, Function1<? super CharSequence, Unit> function1, C0I08 c0i08, String str4, boolean z, String str5, String str6) {
            this.LIZ.LJFF(c19eg, fragmentManager, str, str2, str3, c869590Y9l, function1, c0i08, str4, z, str5, str6);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJI(Activity activity, String str, Bundle bundle) {
            this.LIZ.LJI(activity, str, bundle);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJII(EnterChatParams enterChatParams, boolean z) {
            this.LIZ.LJII(enterChatParams, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIIIIZZ(C19EG c19eg, String str, String str2, String str3) {
            this.LIZ.LJIIIIZZ(c19eg, str, str2, str3);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIIIZ(Fragment fragment) {
            this.LIZ.LJIIIZ(fragment);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIIJ(Map map, AwS590S0100000_11 awS590S0100000_11) {
            this.LIZ.LJIIJ(map, awS590S0100000_11);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final EnterChatParams LJIIJJI(RouteIntent routeIntent) {
            return this.LIZ.LJIIJJI(routeIntent);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIIL(Context context, Bundle bundle, boolean z, Integer num) {
            this.LIZ.LJIIL(context, bundle, z, num);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final ChatRootFragment LJIILIIL(EnterChatParams enterChatParams) {
            return this.LIZ.LJIILIIL(enterChatParams);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIILJJIL(Context context, String str, String str2, boolean z) {
            this.LIZ.LJIILJJIL(context, str, str2, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIILL(C19EG c19eg, FragmentManager fragmentManager, User user, Aweme aweme, String str, String str2, Function2 function2, C0SZG c0szg, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, C0ZH0 c0zh0, String str3, String str4, C459530I0h c459530I0h, AttachmentTypeComponent attachmentTypeComponent, InterfaceC714750S1x interfaceC714750S1x) {
            this.LIZ.LJIILL(c19eg, fragmentManager, user, aweme, str, str2, function2, c0szg, enumC896890ZGl, quickDMEventParam, c0i08, c0zh0, str3, str4, c459530I0h, attachmentTypeComponent, interfaceC714750S1x);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final boolean LJIILLIIL(EnterChatParams enterChatParams, InterfaceC913210Zs7 interfaceC913210Zs7) {
            return this.LIZ.LJIILLIIL(enterChatParams, interfaceC913210Zs7);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIIZILJ(Context context, Long l, String str) throws Throwable {
            this.LIZ.LJIIZILJ(context, l, str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIJ() {
            this.LIZ.LJIJ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final DetailFeedQuickDMFragment LJIJJ(View view, FragmentManager fragmentManager, Bundle bundle, Aweme aweme, C1209800haU c1209800haU) {
            return this.LIZ.LJIJJ(view, fragmentManager, bundle, aweme, c1209800haU);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final IRemindUsersViewHelper LJIJJLI() {
            return this.LIZ.LJIJJLI();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJIL(C19EG c19eg, FragmentManager fragmentManager, Aweme aweme, String str, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, String str2, Function1 function1) {
            this.LIZ.LJIL(c19eg, fragmentManager, aweme, str, enumC896890ZGl, quickDMEventParam, c0i08, str2, function1);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final boolean LJJ(String str) {
            return this.LIZ.LJJ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJJI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
            this.LIZ.LJJI(str, str2, str3, str4, str5, str6, str7, str8, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJJIFFI() {
            this.LIZ.LJJIFFI();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final boolean LJJII(Intent intent) {
            return this.LIZ.LJJII(intent);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJJIII() {
            this.LIZ.LJJIII();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final DetailFeedReplyMessageFragment LJJIIJ(View view, FragmentManager fragmentManager, Bundle bundle, String str, C1603860rq4 c1603860rq4, String str2) {
            return this.LIZ.LJJIIJ(view, fragmentManager, bundle, str, c1603860rq4, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJJIIJZLJL(C19EG c19eg, FragmentManager fragmentManager, C0Y8T c0y8t, User user, Aweme aweme, String str, String str2, Function1 function1, C0SZG c0szg, boolean z, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, String str3, String str4, String str5, boolean z2) {
            this.LIZ.LJJIIJZLJL(c19eg, fragmentManager, c0y8t, user, aweme, str, str2, function1, c0szg, z, enumC896890ZGl, quickDMEventParam, c0i08, str3, str4, str5, z2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final String LJJIIZ(String str) {
            return this.LIZ.LJJIIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final void LJJIIZI(Context context, Aweme aweme) {
            this.LIZ.LJJIIZI(context, aweme);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
        public final DmRouterInterceptor LJIJI() {
            this.LIZ.getClass();
            return (DmRouterInterceptor) IMChatService.LIZLLL.getValue();
        }
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMChatService.class, "userScopedGiphyResultCache", "getUserScopedGiphyResultCache()Lcom/ss/android/ugc/aweme/im/sticker/api/cache/TypingRecommendationStickerCache;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMChatService.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        c09r3.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LIZIZ = new IMChatService();
        LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(249));
        LJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(276));
        LJFF = C1697810uHb.LJIIJJI("outer_streak_restore", "outer_streak_countdown_reminder", "outer_spark", "outer_unlock_streak");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LIZ() {
        C1440005kM.LIZ(new IEvent() { // from class: X.0YuQ
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJJJ().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final DmRouterInterceptor LJIJI() {
        return (DmRouterInterceptor) LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final IRemindUsersViewHelper LJIJJLI() {
        IRemindUsersViewHelper.LIZ.getClass();
        IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
        if (iRemindUsersViewHelperLIZ != null) {
            return iRemindUsersViewHelperLIZ;
        }
        throw new IllegalArgumentException("cannot find IRemindUsersViewHelper");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJJIFFI() {
        C19EG c19eg;
        if (((Number) C278880AwQ.LIZ.getValue()).intValue() == 1) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            Activity activityLIZIZ = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZIZ() : null;
            if (!(activityLIZIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZIZ) == null) {
                return;
            }
            C0CNO.LIZLLL(0L, new AwS560S0100000_16(c19eg, 312));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJJIII() {
        C1490190osj c1490190osj = C1490190osj.LIZIZ;
        Set<EnumC2262571Dh9> setLJ = c1490190osj.LJ();
        C913030Zrp.LIZ.getClass();
        if (setLJ.contains(EnumC2262571Dh9.BIZ_DM_CHAT_ROOM)) {
            return;
        }
        C913040Zrq c913040Zrq = C913040Zrq.LIZ;
        C913090Zrv.LIZ(c913040Zrq);
        if (c913040Zrq.getConfig() != null) {
            c1490190osj.LIZ(c913040Zrq.getScene());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIJ() {
        if (C300810Bqh.LIZ()) {
            IGlobalActionExecutor.LJIIJJI.getClass();
            IGlobalActionExecutor value = C894080Z5q.LIZIZ.getValue();
            if (value != null) {
                value.LIZLLL();
            }
        }
    }

    public static Bundle LJJIJ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final ChatRootFragment LIZLLL(Bundle bundle) {
        ChatRootFragment chatRootFragment = new ChatRootFragment();
        chatRootFragment.setArguments(bundle);
        return chatRootFragment;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final ChatInviteViewModel LJ(C19EG c19eg) {
        IMChatListApi.LJJIII.getClass();
        return C890330YwJ.LIZ().LJ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIIIZ(Fragment fragment) {
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String strDecode;
        Long lLJIILIIL;
        Integer numLJIIJJI;
        Long lLJIILIIL2;
        int iIntValue4;
        DMNavArg dMNavArg;
        Long lLJIILIIL3;
        String groupInviteUrl;
        String jumpedFromInviteId;
        DMNavArg.Companion.getClass();
        Bundle arguments = fragment.getArguments();
        String groupInviteUrl2 = null;
        if (arguments == null) {
            dMNavArg = null;
        } else {
            String string = arguments.getString("enter_from");
            String string2 = arguments.getString("enter_method");
            Integer numValueOf = Integer.valueOf(arguments.getInt("message_cnt"));
            String string3 = arguments.getString("notice_type");
            String string4 = arguments.getString("im_group_invite_id");
            String string5 = arguments.getString("conv_id");
            if (string5 == null || string5.length() <= 0) {
                string5 = arguments.getString("conversation_id");
            }
            String string6 = arguments.getString("msg_id");
            if (string6 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(string6)) != null) {
                jLongValue = lLJIILIIL3.longValue();
            } else {
                jLongValue = 0;
            }
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(arguments.getString("is_mem", CardStruct.IStatusCode.DEFAULT));
            if (numLJIIJJI2 == null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(arguments.getString("is_member_request", CardStruct.IStatusCode.DEFAULT))) == null) {
                iIntValue = 0;
            } else {
                iIntValue = numLJIIJJI2.intValue();
            }
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            Integer numLJIIJJI3 = C2095008Iq.LJIIJJI(arguments.getString("chat_type", CardStruct.IStatusCode.DEFAULT));
            if (numLJIIJJI3 != null) {
                iIntValue2 = numLJIIJJI3.intValue();
            } else {
                iIntValue2 = 0;
            }
            Integer numValueOf3 = Integer.valueOf(iIntValue2);
            Integer numLJIIJJI4 = C2095008Iq.LJIIJJI(arguments.getString("preview", CardStruct.IStatusCode.DEFAULT));
            if (numLJIIJJI4 == null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(arguments.getString("message_preview_enabled", CardStruct.IStatusCode.DEFAULT))) == null) {
                iIntValue3 = 0;
            } else {
                iIntValue3 = numLJIIJJI4.intValue();
            }
            Integer numValueOf4 = Integer.valueOf(iIntValue3);
            String string7 = arguments.getString("content");
            if (string7 == null || (strDecode = Uri.decode(string7)) == null) {
                String string8 = arguments.getString("reply_to_message_content");
                if (string8 != null) {
                    strDecode = Uri.decode(string8);
                } else {
                    strDecode = null;
                }
            }
            String string9 = arguments.getString("msg_id");
            if (string9 == null || (lLJIILIIL = C2095008Iq.LJIILIIL(string9)) == null) {
                String string10 = arguments.getString("reply_to_message_server_id");
                if (string10 != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(string10);
                } else {
                    lLJIILIIL = null;
                }
            }
            String string11 = arguments.getString("msg_type");
            if (string11 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(string11)) == null) {
                String string12 = arguments.getString("reply_to_message_type");
                if (string12 != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(string12);
                } else {
                    numLJIIJJI = null;
                }
            }
            String string13 = arguments.getString("from");
            if (string13 == null || (lLJIILIIL2 = C2095008Iq.LJIILIIL(string13)) == null) {
                String string14 = arguments.getString("reply_to_message_from_uid");
                if (string14 != null) {
                    lLJIILIIL2 = C2095008Iq.LJIILIIL(string14);
                } else {
                    lLJIILIIL2 = null;
                }
            }
            String string15 = arguments.getString("route_from");
            String string16 = arguments.getString("route_to");
            String string17 = arguments.getString("gd_label");
            String string18 = arguments.getString("open_panel_type");
            Integer numLJIIJJI5 = C2095008Iq.LJIIJJI(arguments.getString("showKeyboardByDefault", CardStruct.IStatusCode.DEFAULT));
            if (numLJIIJJI5 != null) {
                iIntValue4 = numLJIIJJI5.intValue();
            } else {
                iIntValue4 = 0;
            }
            Integer numValueOf5 = Integer.valueOf(iIntValue4);
            String str = "";
            String string19 = arguments.getString("key_group_invite_url", "");
            if (string19 != null) {
                str = string19;
            }
            dMNavArg = new DMNavArg(string, string2, numValueOf, string3, string4, string5, jLongValue, numValueOf2, numValueOf3, numValueOf4, strDecode, lLJIILIIL, numLJIIJJI, lLJIILIIL2, string15, string16, string17, string18, numValueOf5, str, arguments.getString("source_btm_token"));
        }
        new C912950Zrh(0).LIZIZ(fragment.requireActivity(), dMNavArg);
        if (dMNavArg != null) {
            String jumpedFromInviteId2 = dMNavArg.getJumpedFromInviteId();
            if ((jumpedFromInviteId2 == null || jumpedFromInviteId2.length() == 0) && (dMNavArg == null || (groupInviteUrl = dMNavArg.getGroupInviteUrl()) == null || groupInviteUrl.length() == 0)) {
                return;
            }
            IMGroupChatApi.LIZIZ.getClass();
            C1231270i97 value = C1618506Vj.LJ.getValue();
            C19EG c19egRequireActivity = fragment.requireActivity();
            if (dMNavArg != null) {
                jumpedFromInviteId = dMNavArg.getJumpedFromInviteId();
                groupInviteUrl2 = dMNavArg.getGroupInviteUrl();
            } else {
                jumpedFromInviteId = null;
            }
            value.LIZIZ(c19egRequireActivity, jumpedFromInviteId, groupInviteUrl2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x02c6  */
    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams LJIIJJI(com.bytedance.router.RouteIntent r10) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.IMChatService.LJIIJJI(com.bytedance.router.RouteIntent):com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final ChatRootFragment LJIILIIL(EnterChatParams enterChatParams) {
        String str;
        DurationPerfMon.LIZ.LIZIZ(new C1512805w6("chatroom_navigation"), false);
        ChatRootFragment chatRootFragment = new ChatRootFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "key_enter_chat_params", enterChatParams);
        chatRootFragment.setArguments(bundle);
        if (enterChatParams.isFullScreen()) {
            str = "chat_room";
        } else {
            str = "quick_chat_sheet";
        }
        IIMChatPerfLogger.LIZ.getClass();
        IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
        if (iIMChatPerfLoggerLIZ != null) {
            iIMChatPerfLoggerLIZ.LJIIIIZZ(str);
        }
        return chatRootFragment;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final boolean LJJ(String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(C1479505qj.LIZ.LIZLLL(str));
        if (c0y8tLIZ != null && c0y8tLIZ.getLastShowMessage() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final boolean LJJII(Intent intent) {
        String conversationId;
        Integer messagePreviewEnabled;
        LIZLLL.getValue().getClass();
        boolean z = false;
        String strLJJIFFI = u.LJJIFFI(String.valueOf(intent.getData()), "chat/center", "chat/center2", false);
        Uri uri = UriProtector.parse(strLJJIFFI);
        Uri data = intent.getData();
        intent.setData(uri);
        DMNavArg.Companion.getClass();
        DMNavArg dMNavArgLIZIZ = C912960Zri.LIZIZ(intent);
        if (!Intrinsics.LJFF(Util.sliceUrlParams(strLJJIFFI).get("enter_method"), "deeplink_email") && (conversationId = dMNavArgLIZIZ.getConversationId()) != null && conversationId.length() > 0 && (((messagePreviewEnabled = dMNavArgLIZIZ.getMessagePreviewEnabled()) != null && messagePreviewEnabled.intValue() == 1) || Intrinsics.LJFF(dMNavArgLIZIZ.getPushLabel(), "click_push_im_msg_req"))) {
            z = true;
        }
        intent.setData(data);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final String LJJIIZ(String str) {
        if (str == null) {
            return "";
        }
        return C0YNP.LJ(str);
    }

    public static String LJJIJIIJI(EnumC896890ZGl enumC896890ZGl, C0ZGS c0zgs) {
        if (enumC896890ZGl != null) {
            int i = C896820ZGe.LIZ[enumC896890ZGl.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "recommend_panel";
                    }
                    return "quick_reply_cell";
                }
                return "quick_reply";
            }
            int i2 = C896820ZGe.LIZIZ[c0zgs.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return "story_float_avatar";
                    }
                    throw new C1954807lC();
                }
                return "story_float_emoji";
            }
            return "story_message_input_box";
        }
        return "quick_reply_cell";
    }

    public static void LJJIL(List list, Map map) {
        String text;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
                TextContent textContent = (TextContent) C051M.LIZIZ(TextContent.class, c869590Y9l.getContent());
                if (textContent != null && (text = textContent.getText()) != null) {
                    c869590Y9l.getLocalExt().put("story_msg_text", text);
                    map.put(Long.valueOf(c869590Y9l.getMsgId()), c869590Y9l);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final boolean LIZJ(Activity activity, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        int iIntValue;
        Integer numLJIIJJI;
        Long lLJIILIIL;
        long jLongValue;
        Long lLJIILIIL2;
        IIMChatPerfLogger.LIZ.getClass();
        IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
        if (iIMChatPerfLoggerLIZ != null) {
            iIMChatPerfLoggerLIZ.LJ(System.currentTimeMillis());
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "conv_id");
        if ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() > 0) || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "conversation_id")) != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inbox_type");
            if ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) || ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chat_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null)) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) != null) {
                long jLongValue2 = lLJIILIIL.longValue();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "conv_short_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) != null) {
                    jLongValue = lLJIILIIL2.longValue();
                } else {
                    jLongValue = 0;
                }
                C913040Zrq c913040Zrq = C913040Zrq.LIZ;
                C913090Zrv.LIZ(c913040Zrq);
                if (c913040Zrq.getConfig() != null) {
                    C1490190osj.LIZIZ.LIZ(c913040Zrq.getScene());
                }
                C876340YZk c876340YZk = C876340YZk.LIZ;
                ((C876310YZh) C876340YZk.LIZ(c876340YZk)).LIZJ(EnumC883570YlP.LAUNCH_FROM_OUT_PUSH);
                C0YI5 c0yi5LIZ = C876340YZk.LIZ(c876340YZk);
                C870340YCi c870340YCi = new C870340YCi();
                c870340YCi.LIZLLL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                c870340YCi.LJ = Long.valueOf(jLongValue);
                c870340YCi.LJFF = Long.valueOf(jLongValue2);
                C0YI4.LIZ(c0yi5LIZ, Collections.singletonList(c870340YCi.build()), iIntValue, Long.valueOf(jLongValue2));
            }
        }
        if (!C13LP.LJJJJ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method"), LJFF)) {
            return false;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, uri.toString());
        smartRouteBuildRoute.withParam("enter_from", "outer_push");
        smartRouteBuildRoute.open();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJII(EnterChatParams enterChatParams, boolean z) {
        String strLJIL;
        if (Intrinsics.LJFF("live", enterChatParams.getEnterFromForMob()) && z) {
            IIMChatPerfLogger.LIZ.getClass();
            IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
            if (iIMChatPerfLoggerLIZ != null) {
                iIMChatPerfLoggerLIZ.LJIILIIL();
            }
        }
        if (!enterChatParams.getNoEnterChatEvent()) {
            IMUser imUser = enterChatParams.getImUser();
            if (imUser != null && !enterChatParams.isTCM()) {
                IMContactApi.LIZ.getClass();
                strLJIL = C069P.LIZ().LIZ().LJIL(imUser);
            } else {
                strLJIL = "-1";
            }
            String sessionId = enterChatParams.getSessionId();
            if (sessionId == null) {
                sessionId = "";
            }
            C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(sessionId);
            int chatType = enterChatParams.getChatType();
            if (chatType != 1 && chatType != 3) {
                C1593906Lx.LIZ(IMChatRoomAnalytics.LIZIZ, enterChatParams, strLJIL, c866530Xz1LIZIZ, false, null, 4084);
                return;
            }
            IMChatRoomAnalytics iMChatRoomAnalytics = IMChatRoomAnalytics.LIZIZ;
            InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
            InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
            String fromGroupId = C1336205Ku.LIZ(false).getImVideoService().getFromGroupId();
            C1DFB c1dfb = C0PEM.LIZJ;
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(enterChatParams, 414);
            iMChatRoomAnalytics.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), null, null, new C0Z7K(enterChatParams, strLJIL, new C830490Whz(), interfaceC876950YajLIZIZ, c866530Xz1LIZIZ, interfaceC1493505szLIZIZ, true, fromGroupId, awS581S0100000_2, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIIJ(Map map, AwS590S0100000_11 awS590S0100000_11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
        List<C869590Y9l> listLJJIJIIJIL = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJIJIIJIL(C13LP.LLIIII(linkedHashMap2.keySet()));
        LIZIZ.getClass();
        LJJIL(listLJJIJIIJIL, linkedHashMap);
        if (linkedHashMap.size() == map.size()) {
            awS590S0100000_11.invoke(linkedHashMap);
            return;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (!linkedHashMap.containsKey(entry.getKey())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIILIIL(linkedHashMap3, new C914120Zta(linkedHashMap, awS590S0100000_11, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x029f, code lost:
    
        if (r7 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a1, code lost:
    
        r12.LIZ();
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0351, code lost:
    
        if (r10.LIZLLL() == true) goto L166;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0473  */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL(com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams r28, X.InterfaceC913210Zs7 r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.IMChatService.LJIILLIIL(com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams, X.0Zs7):boolean");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJJIIZI(Context context, Aweme aweme) {
        ((InterfaceC1618460sDc) LJ.getValue()).LJIIJ(new C20271514Tp(context, aweme, "dm", null, null, null, 0, -1, null, false, null, null, C298460Bmu.LIZ(), false, null, null, null, null, 1031672));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJI(Activity activity, String str, Bundle bundle) {
        C869590Y9l c869590Y9l;
        String conversationId;
        C0Y8T c0y8tLIZ;
        String strLIZLLL;
        Object obj = null;
        if (bundle != null) {
            try {
                obj = bundle.get("message");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (!(obj instanceof C869590Y9l) || (c869590Y9l = (C869590Y9l) obj) == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ((conversationId = c869590Y9l.getConversationId()))) == null) {
            return;
        }
        IReportUtils.LIZ.getClass();
        IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
        if (iReportUtilsLIZ != null) {
            c869590Y9l = c869590Y9l;
            iReportUtilsLIZ.LIZ(new C1689106jR(c869590Y9l, "button", str, null, 24), activity, "11", c869590Y9l, true);
        }
        if (c0y8tLIZ.isGroupChat()) {
            strLIZLLL = C1229100i5c.LIZLLL(conversationId);
        } else if (C882340YjQ.LJ(c0y8tLIZ)) {
            strLIZLLL = "stranger";
        } else {
            strLIZLLL = "private";
        }
        IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMessageAdapterAnalytics.class, false, false, false, 14, null);
        if (iIMMessageAdapterAnalytics != null) {
            iIMMessageAdapterAnalytics.LJFF(String.valueOf(c869590Y9l.getSender()), "button", str, strLIZLLL, c869590Y9l, C0I0B.LJFF.LIZIZ(), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIIZILJ(Context context, Long l, String str) throws Throwable {
        String strLJIIJ;
        if (l != null) {
            l.longValue();
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
            if (c0y8tLIZ == null) {
                return;
            }
            if (c0y8tLIZ.isGroupChat()) {
                EnterChatParams enterChatParams = new EnterChatParams(context, 3, c0y8tLIZ.getConversationId());
                enterChatParams.setEnterFromForMob("dm_search_page");
                enterChatParams.setEnterMethodForMob("click_dm_search_cell");
                enterChatParams.setStickyTop(c0y8tLIZ.isStickTop());
                enterChatParams.setUnreadCount((int) c0y8tLIZ.getUnreadCount());
                enterChatParams.setInboxSearchTabName("detail_media_grid");
                enterChatParams.setSearchTargetIndex(l);
                enterChatParams.setImSearchNeedBounce(Boolean.TRUE);
                LJIILLIIL(enterChatParams, null);
                return;
            }
            long jLJII = C0YNP.LJII(str);
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String strValueOf = String.valueOf(jLJII);
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null) {
                strLJIIJ = iIMContactUtilServiceLIZ.LJIIJ(str);
            } else {
                strLJIIJ = null;
            }
            EnterChatParams enterChatParams2 = new EnterChatParams(context, c1bgsLJ.LIZLLL(strValueOf, strLJIIJ, "im_chat_detail"));
            enterChatParams2.setEnterFromForMob("dm_search_page");
            enterChatParams2.setEnterMethodForMob("click_dm_search_cell");
            enterChatParams2.setStickyTop(c0y8tLIZ.isStickTop());
            enterChatParams2.setUnreadCount((int) c0y8tLIZ.getUnreadCount());
            enterChatParams2.setSearchTargetIndex(l);
            enterChatParams2.setInboxSearchTabName("detail_media_grid");
            enterChatParams2.setImSearchNeedBounce(Boolean.TRUE);
            enterChatParams2.setChatType(C882340YjQ.LJ(c0y8tLIZ) ? 1 : 0);
            LJIILLIIL(enterChatParams2, null);
        }
    }

    public static C0S2U LJJIJIIJIL(EnumC896890ZGl enumC896890ZGl, boolean z, Aweme aweme, String str) {
        List<UpvoteStruct> list;
        UpvoteInfo upvoteInfo;
        List<UpvoteStruct> list2;
        UpvoteInfo upvoteInfo2;
        List<UpvoteStruct> list3;
        UpvoteInfo upvoteInfo3;
        if (z) {
            return C0S2U.SHARE_LINK;
        }
        C0S2U c0s2u = C0S2U.MUF_SHARE_VIDEO;
        if (Intrinsics.LJFF(str, c0s2u.getEtString())) {
            return c0s2u;
        }
        if (enumC896890ZGl == EnumC896890ZGl.TYPE_MAIN_FEED_MUF_ENTRANCE && C1A1H.LIZLLL(aweme)) {
            C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
            UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(aweme.getAid());
            if (upvoteListLJIIIIZZ != null && (list3 = upvoteListLJIIIIZZ.upvotes) != null && list3.size() == 1 && (upvoteInfo3 = aweme.getUpvoteInfo()) != null && Intrinsics.LJFF(upvoteInfo3.userReposted, Boolean.TRUE)) {
                return C0S2U.MUF_POST;
            }
            UpvoteList upvoteListLJIIIIZZ2 = c1360460lVU.LJIIIIZZ(aweme.getAid());
            if (upvoteListLJIIIIZZ2 != null && (list2 = upvoteListLJIIIIZZ2.upvotes) != null && list2.size() == 1 && (upvoteInfo2 = aweme.getUpvoteInfo()) != null && Intrinsics.LJFF(upvoteInfo2.userReposted, Boolean.FALSE)) {
                return C0S2U.REPOST_SINGLE;
            }
            UpvoteList upvoteListLJIIIIZZ3 = c1360460lVU.LJIIIIZZ(aweme.getAid());
            if (upvoteListLJIIIIZZ3 != null && (list = upvoteListLJIIIIZZ3.upvotes) != null && list.size() == 2 && (upvoteInfo = aweme.getUpvoteInfo()) != null && Intrinsics.LJFF(upvoteInfo.userReposted, Boolean.TRUE)) {
                return C0S2U.REPOST_SINGLE;
            }
            return C0S2U.REPOST_MULTIPLE;
        }
        return C0S2U.FIXED_ENTRANCE;
    }

    public static final Map<String, String> LJJIJIL(String str, Aweme aweme, QuickDMEventParam quickDMEventParam, C0ZGS c0zgs) {
        String strLJIIJ;
        String str2;
        String str3;
        String str4;
        C13DA c13da = new C13DA();
        c13da.put("enter_from", str);
        c13da.put("group_id", aweme.getAid());
        String str5 = null;
        if (C729510SjV.LJJIJIL(aweme) && quickDMEventParam != null && quickDMEventParam.needFixStoryEnterPosition) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            String str6 = quickDMEventParam.storyFrom;
            c735840Sti.getClass();
            strLJIIJ = C735840Sti.LJIIJ(null, str, str6);
        } else {
            strLJIIJ = "message_tab";
        }
        c13da.put("enter_position", strLJIIJ);
        if (c0zgs.isQuickReply()) {
            str2 = "emoji";
        } else {
            str2 = "text";
        }
        c13da.put("dm_reply_type", str2);
        if (C729510SjV.LJJIJIL(aweme)) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        c13da.put("story_type", str3);
        if (C123100dR.LIZ(AwemeExtKt.getAuthorUid(aweme))) {
            c13da.put("author_id", AwemeExtKt.getAuthorUid(aweme));
        }
        if (C729510SjV.LJJIJIL(aweme)) {
            C735840Sti.LIZ.getClass();
            c13da.put("story_style_version", String.valueOf(C735840Sti.LJIJJ(aweme)));
        }
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null) {
            c13da.put("is_from_push", String.valueOf(mobParams.get("is_from_push")));
            c13da.put("push_type", String.valueOf(mobParams.get("push_type")));
            c13da.put("push_id", String.valueOf(mobParams.get("push_id")));
        }
        if (quickDMEventParam != null) {
            str5 = quickDMEventParam.friendsV3TrackScene;
        }
        if (C703302op.LIZ(str5)) {
            if (quickDMEventParam == null || (str4 = quickDMEventParam.friendsV3TrackScene) == null) {
                str4 = "";
            }
            c13da.put("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str4))));
            c13da.put("friends_tab_version", "v3.0");
            c13da.put("is_collapse_reposts", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZIZ(str4))));
            c13da.put("enter_position", "feed");
            if (C729510SjV.LJJIJIL(aweme)) {
                String strLJII = C729510SjV.LJII(aweme);
                if (strLJII.length() > 0) {
                    c13da.put("from_story_collection_id", strLJII);
                }
            }
        }
        return c13da.build();
    }

    public static final String LJJIJL(QuickDMEventParam quickDMEventParam, boolean z, EnumC896890ZGl enumC896890ZGl, C0ZGS c0zgs) {
        String str;
        if (quickDMEventParam != null) {
            str = quickDMEventParam.friendsV3TrackScene;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            boolean zLIZJ = C1360320lVG.LIZJ(str);
            boolean zLIZIZ = C1360320lVG.LIZIZ(str);
            if (c0zgs == C0ZGS.STICKER) {
                return "friend_tab_message_box_exposed_avatar";
            }
            if (c0zgs == C0ZGS.EMOJI) {
                return "friend_tab_message_box_exposed_emoji";
            }
            if (!zLIZJ && !zLIZIZ) {
                return "friend_tab_message_button";
            }
            return "friend_tab_message_box_input";
        }
        if (z) {
            LIZIZ.getClass();
            return LJJIJIIJI(enumC896890ZGl, c0zgs);
        }
        return "quick_reply_pannel";
    }

    public static final Map<String, String> LJJIJLIJ(User user, Aweme aweme, QuickDMEventParam quickDMEventParam, C0ZGS c0zgs) {
        String str;
        String str2;
        C13DA c13da = new C13DA();
        if (Intrinsics.LJFF(user.getUid(), AwemeExtKt.getAuthorUid(aweme))) {
            if (c0zgs.isQuickReply()) {
                str = "emoji";
            } else {
                str = "text";
            }
            c13da.put("dm_reply_type", str);
            if (C729510SjV.LJJIJIL(aweme)) {
                str2 = "story";
            } else {
                str2 = "post";
            }
            c13da.put("story_type", str2);
        }
        String str3 = null;
        if (quickDMEventParam != null) {
            str3 = quickDMEventParam.friendsV3TrackScene;
        }
        if (C123100dR.LIZ(str3)) {
            c13da.put("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str3))));
            c13da.put("friends_tab_version", "v3.0");
            c13da.put("is_collapse_reposts", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZIZ(str3))));
            c13da.put("enter_position", "feed");
            if (C729510SjV.LJJIJIL(aweme)) {
                String strLJII = C729510SjV.LJII(aweme);
                if (strLJII.length() > 0) {
                    c13da.put("from_story_collection_id", strLJII);
                }
            }
        }
        return c13da.build();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIIIIZZ(C19EG c19eg, String str, String str2, String str3) {
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LJ.getValue().LIZLLL(c19eg, str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIIL(Context context, Bundle bundle, boolean z, Integer num) {
        IQuickChatRoomSheetFactory iQuickChatRoomSheetFactory;
        if (z && (iQuickChatRoomSheetFactory = (IQuickChatRoomSheetFactory) PluggableExtentionKt.pluggableSpi$default(IQuickChatRoomSheetFactory.class, false, false, false, 14, null)) != null) {
            iQuickChatRoomSheetFactory.LIZLLL();
        }
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIIIIZZ().LIZ(System.currentTimeMillis());
        if (bundle != null) {
            if (!bundle.containsKey("message_cnt")) {
                bundle.putInt("message_cnt", C1903780zdo.LJIIJ(99));
            }
            bundle.putBoolean("need_clear_all_inbox_tab_count", false);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//chat/center");
        if (bundle != null) {
            smartRouteBuildRoute.withParam(bundle);
        }
        if (num != null) {
            smartRouteBuildRoute.addFlags(num.intValue());
        }
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIILJJIL(Context context, String str, String str2, boolean z) {
        if (str.length() > 0) {
            IBlockSystemMsgManager iBlockSystemMsgManager = (IBlockSystemMsgManager) PluggableExtentionKt.pluggableSpi$default(IBlockSystemMsgManager.class, false, false, false, 14, null);
            if (iBlockSystemMsgManager != null) {
                iBlockSystemMsgManager.LIZ(context, str, z);
                return;
            }
            return;
        }
        if (str2.length() <= 0) {
            return;
        }
        InterfaceC1808720xAU interfaceC1808720xAU = this.LIZ;
        if (interfaceC1808720xAU == null) {
            synchronized (this) {
                interfaceC1808720xAU = this.LIZ;
                if (interfaceC1808720xAU == null) {
                    interfaceC1808720xAU = (InterfaceC1808720xAU) C1807670x8n.LLLLZLL();
                    this.LIZ = interfaceC1808720xAU;
                }
            }
        }
        interfaceC1808720xAU.block(str2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final DetailFeedQuickDMFragment LJIJJ(View view, FragmentManager fragmentManager, Bundle bundle, Aweme aweme, C1209800haU c1209800haU) {
        DetailFeedQuickDMFragment detailFeedQuickDMFragment = null;
        if (aweme == null) {
            return null;
        }
        String str = DetailFeedQuickDMFragment._pnsPageId;
        if (view != null && fragmentManager != null) {
            View viewFindViewById = view.findViewById(R.id.ka1);
            Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("quick_dm_fragment_tag");
            if (fragmentLJJJJZI != null) {
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    detailFeedQuickDMFragment = (DetailFeedQuickDMFragment) fragmentLJJJJZI;
                    if (detailFeedQuickDMFragment != null) {
                        detailFeedQuickDMFragment.LLJI = c1209800haU;
                        detailFeedQuickDMFragment.LJLJJI(aweme);
                    }
                } else {
                    C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                    c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                    c19ehLJIIJ.LJIIJ();
                }
            } else {
                if (viewFindViewById == null) {
                }
                detailFeedQuickDMFragment = new DetailFeedQuickDMFragment();
                detailFeedQuickDMFragment.setArguments(bundle);
                C19EH c19ehLJIIJ2 = fragmentManager.LJIIJ();
                c19ehLJIIJ2.LIZJ(R.id.ka1, detailFeedQuickDMFragment, "quick_dm_fragment_tag");
                c19ehLJIIJ2.LJIIJ();
                detailFeedQuickDMFragment.LLJI = c1209800haU;
                detailFeedQuickDMFragment.LJLJJI(aweme);
            }
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            linearLayout.setId(R.id.ka1);
            ((ViewGroup) view).addView(linearLayout);
            detailFeedQuickDMFragment = new DetailFeedQuickDMFragment();
            detailFeedQuickDMFragment.setArguments(bundle);
            C19EH c19ehLJIIJ22 = fragmentManager.LJIIJ();
            c19ehLJIIJ22.LIZJ(R.id.ka1, detailFeedQuickDMFragment, "quick_dm_fragment_tag");
            c19ehLJIIJ22.LJIIJ();
            detailFeedQuickDMFragment.LLJI = c1209800haU;
            detailFeedQuickDMFragment.LJLJJI(aweme);
        }
        return detailFeedQuickDMFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment LJJIIJ(android.view.View r8, androidx.fragment.app.FragmentManager r9, android.os.Bundle r10, java.lang.String r11, X.C1603860rq4 r12, java.lang.String r13) {
        /*
            r7 = this;
            java.lang.String r0 = com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment._pnsPageId
            r2 = 0
            if (r8 == 0) goto L3c
            if (r9 == 0) goto L3c
            r4 = 2131376051(0x7f0a37b3, float:1.8372267E38)
            android.view.View r5 = r8.findViewById(r4)
            java.lang.String r3 = "reply_fragment_tag"
            androidx.fragment.app.Fragment r2 = r9.LJJJJZI(r3)
            r1 = 0
            if (r2 == 0) goto L48
            if (r10 == 0) goto L2e
            java.lang.String r0 = "from_repost_feed"
            boolean r6 = r10.getBoolean(r0)
            r0 = 1
            if (r6 != r0) goto L2e
            boolean r0 = r2 instanceof X.InterfaceC913270ZsD
            if (r0 == 0) goto L2e
            r0 = r2
            X.0ZsD r0 = (X.InterfaceC913270ZsD) r0
            if (r0 == 0) goto L2e
            r0.nm(r13)
        L2e:
            if (r5 == 0) goto L3d
            X.C786410Ut5.LJLLLLLL(r1, r5)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment r2 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment) r2
            if (r2 == 0) goto L3c
        L37:
            r2.LLJJJIL = r12
            r2.wL(r11)
        L3c:
            return r2
        L3d:
            X.19EH r0 = r9.LJIIJ()
            r0.LJIIZILJ(r2)
            r0.LJIIJ()
            goto L4a
        L48:
            if (r5 != 0) goto L5b
        L4a:
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r0 = r8.getContext()
            r5.<init>(r0)
            r5.setId(r4)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r8.addView(r5)
        L5b:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment r2 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment
            r2.<init>()
            if (r13 == 0) goto L64
            r2.LLJLILLLLZIIL = r13
        L64:
            if (r10 == 0) goto L69
            r2.setArguments(r10)
        L69:
            X.19EH r0 = r9.LJIIJ()
            r0.LIZJ(r4, r2, r3)
            r0.LJIIJ()
            X.C786410Ut5.LJLLLLLL(r1, r5)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.IMChatService.LJJIIJ(android.view.View, androidx.fragment.app.FragmentManager, android.os.Bundle, java.lang.String, X.0rq4, java.lang.String):com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIL(C19EG c19eg, FragmentManager fragmentManager, Aweme aweme, String str, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, String str2, Function1 function1) {
        boolean z;
        EnumC913000Zrm enumC913000Zrm;
        C0ZH1 c0zh1;
        String strLJ = C0YNP.LJ(AwemeExtKt.getAuthorUid(aweme));
        if (strLJ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String nickname = null;
        if (!z) {
            strLJ = null;
        }
        QuickMessageService quickMessageService = (QuickMessageService) PluggableExtentionKt.pluggableSpi$default(QuickMessageService.class, false, false, false, 14, null);
        if (quickMessageService != null) {
            User author = aweme.getAuthor();
            if (author != null) {
                nickname = author.getNickname();
            }
            String str3 = "";
            if (nickname == null) {
                nickname = "";
            }
            C457000Hw2 c457000Hw2 = new C457000Hw2(nickname);
            String aid = aweme.getAid();
            EnumC2172611A1b.Companion.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str);
            if (C729510SjV.LJJIJIL(aweme)) {
                enumC913000Zrm = EnumC913000Zrm.CLICK_STORY_BOTTOM_INPUT_BOX;
            } else {
                enumC913000Zrm = EnumC913000Zrm.CLICK_VIDEO_BOTTOM_INPUT_BOX;
            }
            if (C729510SjV.LJJIJIL(aweme)) {
                c0zh1 = C0ZH1.STORY;
            } else {
                c0zh1 = C0ZH1.POST;
            }
            C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.MESSAGE_BTN;
            C0S2R c0s2r = C0S2R.PRIVATE;
            String aid2 = aweme.getAid();
            if (aid2 != null) {
                str3 = aid2;
            }
            quickMessageService.LIZ(fragmentManager, new C456970Hvz(c457000Hw2, strLJ, "private", str2, null, false, aid, enumC2172611A1bLIZ, enumC913000Zrm, c0zh1, c0s2u, enumC913010Zrn, c0s2r, str3, null, 98416), c0i08, new C0ZGY(enumC896890ZGl, quickDMEventParam, aweme, c19eg, strLJ, str, function1));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJJI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        boolean z2;
        String str9;
        String str10 = str6;
        if (str3.length() != 0 && str5.length() != 0) {
            String strLJ = C0YNP.LJ(str3);
            if (strLJ.length() > 0 && 1 != 0) {
                TextContent textContentObtain = TextContent.Companion.obtain(a0.LJLIIIL(str5).toString(), null, null, null, new FeatureAttachmentContent(14, str, C2095008Iq.LJIILIIL(str2), null, new BaseText(str4, null, null)), null);
                if (str10.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str11 = "thought_like_list_panel";
                if (z2) {
                    str10 = "thought_like_list_panel";
                }
                if (str7.length() != 0) {
                    str11 = str7;
                }
                C0ZDT.LIZ.getClass();
                Map<String, String> mapLJFF = C0ZDT.LJFF(null, str11, null, null, null);
                mapLJFF.put("enter_from", str10);
                mapLJFF.put("enter_method", str11);
                if (str8.length() > 0) {
                    mapLJFF.put("enter_position", str8);
                }
                CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                c874730YTfLIZ.LIZIZ.LJFF = strLJ;
                c874730YTfLIZ.LIZIZ(textContentObtain);
                C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
                c0ytz.LJIILIIL = mapLJFF;
                if (z) {
                    str9 = "thought_reaction";
                } else {
                    str9 = "";
                }
                c0ytz.LJIIL = str9;
                c874730YTfLIZ.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJFF(C19EG c19eg, FragmentManager fragmentManager, String str, String str2, String str3, C869590Y9l c869590Y9l, Function1<? super CharSequence, Unit> function1, C0I08 c0i08, String str4, boolean z, String str5, String str6) {
        String conversationId;
        C0Y8T c0y8tLIZ;
        int i;
        String str7;
        C0S2R c0s2r;
        if (c869590Y9l != null && (conversationId = c869590Y9l.getConversationId()) != null && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId)) != null) {
            boolean zIsGroupChat = c0y8tLIZ.isGroupChat();
            if (Intrinsics.LJFF(str4, "shared_feed_like_history")) {
                i = 12;
            } else {
                i = 11;
            }
            QuickMessageService quickMessageService = (QuickMessageService) PluggableExtentionKt.pluggableSpi$default(QuickMessageService.class, false, false, false, 14, null);
            if (quickMessageService != null) {
                C457000Hw2 c457000Hw2 = new C457000Hw2(str);
                if (zIsGroupChat) {
                    str7 = "group";
                } else {
                    str7 = "private";
                }
                EnumC2172611A1b.Companion.getClass();
                EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str4);
                EnumC913000Zrm enumC913000Zrm = EnumC913000Zrm.MESSAGE_CELL;
                C0ZH1 c0zh1 = C0ZH1.POST;
                C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
                EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.MESSAGE_CELL;
                if (zIsGroupChat) {
                    c0s2r = C0S2R.GROUP;
                } else {
                    c0s2r = C0S2R.PRIVATE;
                }
                quickMessageService.LIZ(fragmentManager, new C456970Hvz(c457000Hw2, conversationId, str7, null, null, false, str3, enumC2172611A1bLIZ, enumC913000Zrm, c0zh1, c0s2u, enumC913010Zrn, c0s2r, str3, null, 98424), c0i08, new C0I29(c869590Y9l, zIsGroupChat, c19eg, conversationId, str, str4, str5, str6, i, str3, function1));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJIILL(C19EG c19eg, FragmentManager fragmentManager, User user, Aweme aweme, String str, String str2, Function2 function2, C0SZG c0szg, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, C0ZH0 c0zh0, String str3, String str4, C459530I0h c459530I0h, AttachmentTypeComponent attachmentTypeComponent, InterfaceC714750S1x interfaceC714750S1x) {
        QuickMessageService quickMessageService = (QuickMessageService) PluggableExtentionKt.pluggableSpi$default(QuickMessageService.class, false, false, false, 14, null);
        if (quickMessageService != null) {
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            C457000Hw2 c457000Hw2 = new C457000Hw2(nickname);
            String strLJJIIZ = LJJIIZ(user.getUid());
            String aid = aweme.getAid();
            EnumC2172611A1b.Companion.getClass();
            quickMessageService.LIZ(fragmentManager, new C456970Hvz(c457000Hw2, strLJJIIZ, "private", str4, null, false, aid, C0S2S.LIZ(str), EnumC913000Zrm.CLICK_REPOST_PANEL_DM_BTN, C0ZH1.REPOST, C0S2U.FIXED_ENTRANCE, EnumC913010Zrn.MESSAGE_BTN, C0S2R.PRIVATE, aweme.getAid(), null, 98416), c0i08, new C0ZGW(c0zh0, user, c19eg, str, enumC896890ZGl, aweme, attachmentTypeComponent, str2, str3, interfaceC714750S1x, function2, c0szg));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LJJIIJZLJL(C19EG c19eg, FragmentManager fragmentManager, C0Y8T c0y8t, User user, Aweme aweme, String str, String str2, Function1 function1, C0SZG c0szg, boolean z, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, String str3, String str4, String str5, boolean z2) {
        String str6;
        EnumC913010Zrn enumC913010Zrn;
        String str7;
        EnumC913000Zrm enumC913000Zrm;
        C0ZH1 c0zh1;
        C0S2R c0s2r;
        if (quickDMEventParam != null) {
            str6 = quickDMEventParam.friendsV3TrackScene;
        } else {
            str6 = null;
        }
        if (Intrinsics.LJFF(str6, "friends_v3_feeds")) {
            enumC913010Zrn = EnumC913010Zrn.MESSAGE_BTN;
        } else {
            enumC913010Zrn = EnumC913010Zrn.LIKE_VIDEO;
            if (!Intrinsics.LJFF(str4, enumC913010Zrn.getEtString())) {
                enumC913010Zrn = EnumC913010Zrn.AUTO;
            }
        }
        QuickMessageService quickMessageService = (QuickMessageService) PluggableExtentionKt.pluggableSpi$default(QuickMessageService.class, false, false, false, 14, null);
        if (quickMessageService != null) {
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            C457000Hw2 c457000Hw2 = new C457000Hw2(nickname);
            String conversationId = c0y8t.getConversationId();
            if (c0y8t.isGroupChat()) {
                str7 = "group";
            } else {
                str7 = "private";
            }
            String aid = aweme.getAid();
            EnumC2172611A1b.Companion.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str);
            if (C729510SjV.LJJIJIL(aweme)) {
                enumC913000Zrm = EnumC913000Zrm.CLICK_STORY_BOTTOM_INPUT_BOX;
            } else {
                enumC913000Zrm = EnumC913000Zrm.CLICK_VIDEO_BOTTOM_INPUT_BOX;
            }
            if (C729510SjV.LJJIJIL(aweme)) {
                c0zh1 = C0ZH1.STORY;
            } else if (C1A1H.LIZLLL(aweme)) {
                c0zh1 = C0ZH1.REPOST;
            } else {
                c0zh1 = C0ZH1.POST;
            }
            C0S2U c0s2uLJJIJIIJIL = LJJIJIIJIL(enumC896890ZGl, false, aweme, str5);
            if (c0y8t.isGroupChat()) {
                c0s2r = C0S2R.GROUP;
            } else {
                c0s2r = C0S2R.PRIVATE;
            }
            quickMessageService.LIZ(fragmentManager, new C456970Hvz(c457000Hw2, conversationId, str7, null, null, false, aid, enumC2172611A1bLIZ, enumC913000Zrm, c0zh1, c0s2uLJJIJIIJIL, enumC913010Zrn, c0s2r, aweme.getAid(), null, 98424), c0i08, new C0ZGX(c0y8t, c19eg, str, aweme, z, enumC896890ZGl, str2, str3, c0szg, z2, function1));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMChatService
    public final void LIZIZ(C19EG c19eg, FragmentManager fragmentManager, User user, Aweme aweme, String str, String str2, Function1 function1, C0SZG c0szg, boolean z, boolean z2, EnumC896890ZGl enumC896890ZGl, String str3, String str4, String str5, QuickDMEventParam quickDMEventParam, C0I08 c0i08, C0ZH0 c0zh0, String str6, String str7, InterfaceC714750S1x interfaceC714750S1x, boolean z3, Function1 function12, Function0 function0) {
        String str8;
        EnumC913010Zrn enumC913010Zrn;
        EnumC913000Zrm enumC913000Zrm;
        C0ZH1 c0zh1;
        String str9;
        String str10 = str2;
        if (quickDMEventParam != null && (str9 = quickDMEventParam.friendsV3TrackScene) != null && str9.length() > 0) {
            str10 = "feed";
        }
        if (quickDMEventParam != null) {
            str8 = quickDMEventParam.friendsV3TrackScene;
        } else {
            str8 = null;
        }
        if (Intrinsics.LJFF(str8, "friends_v3_feeds")) {
            enumC913010Zrn = EnumC913010Zrn.MESSAGE_BTN;
        } else {
            enumC913010Zrn = EnumC913010Zrn.LIKE_VIDEO;
            if (!Intrinsics.LJFF(str4, enumC913010Zrn.getEtString())) {
                enumC913010Zrn = EnumC913010Zrn.AUTO;
            }
        }
        QuickMessageService quickMessageService = (QuickMessageService) PluggableExtentionKt.pluggableSpi$default(QuickMessageService.class, false, false, false, 14, null);
        if (quickMessageService != null) {
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            C457000Hw2 c457000Hw2 = new C457000Hw2(nickname);
            String strLJJIIZ = LJJIIZ(user.getUid());
            String aid = aweme.getAid();
            EnumC2172611A1b.Companion.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str);
            if (C729510SjV.LJJIJIL(aweme)) {
                enumC913000Zrm = EnumC913000Zrm.CLICK_STORY_BOTTOM_INPUT_BOX;
            } else {
                enumC913000Zrm = EnumC913000Zrm.CLICK_VIDEO_BOTTOM_INPUT_BOX;
            }
            if (C729510SjV.LJJIJIL(aweme)) {
                c0zh1 = C0ZH1.STORY;
            } else if (C1A1H.LIZLLL(aweme)) {
                c0zh1 = C0ZH1.REPOST;
            } else {
                c0zh1 = C0ZH1.POST;
            }
            quickMessageService.LIZ(fragmentManager, new C456970Hvz(c457000Hw2, strLJJIIZ, "private", str7, null, false, aid, enumC2172611A1bLIZ, enumC913000Zrm, c0zh1, LJJIJIIJIL(enumC896890ZGl, z2, aweme, str5), enumC913010Zrn, C0S2R.PRIVATE, aweme.getAid(), null, 98416), c0i08, new C0ZGV(c0zh0, user, c19eg, str, quickDMEventParam, z, enumC896890ZGl, aweme, str10, str6, interfaceC714750S1x, c0szg, z3, function1, function12, function0));
        }
    }
}
