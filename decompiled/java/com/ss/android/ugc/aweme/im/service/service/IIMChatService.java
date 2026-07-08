package com.ss.android.ugc.aweme.im.service.service;

import X.C0I08;
import X.C0SZG;
import X.C0Y8T;
import X.C0ZH0;
import X.C1209800haU;
import X.C1603860rq4;
import X.C19EG;
import X.C459530I0h;
import X.C869590Y9l;
import X.EnumC896890ZGl;
import X.InterfaceC714750S1x;
import X.InterfaceC913210Zs7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatlist.api.model.ChatInviteViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.router.DmRouterInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes15.dex */
public interface IIMChatService {
    void LIZ();

    void LIZIZ(C19EG c19eg, FragmentManager fragmentManager, User user, Aweme aweme, String str, String str2, Function1 function1, C0SZG c0szg, boolean z, boolean z2, EnumC896890ZGl enumC896890ZGl, String str3, String str4, String str5, QuickDMEventParam quickDMEventParam, C0I08 c0i08, C0ZH0 c0zh0, String str6, String str7, InterfaceC714750S1x interfaceC714750S1x, boolean z3, Function1 function12, Function0 function0);

    boolean LIZJ(Activity activity, Uri uri);

    ChatRootFragment LIZLLL(Bundle bundle);

    ChatInviteViewModel LJ(C19EG c19eg);

    void LJFF(C19EG c19eg, FragmentManager fragmentManager, String str, String str2, String str3, C869590Y9l c869590Y9l, Function1<? super CharSequence, Unit> function1, C0I08 c0i08, String str4, boolean z, String str5, String str6);

    void LJI(Activity activity, String str, Bundle bundle);

    void LJII(EnterChatParams enterChatParams, boolean z);

    void LJIIIIZZ(C19EG c19eg, String str, String str2, String str3);

    void LJIIIZ(Fragment fragment);

    void LJIIJ(Map map, AwS590S0100000_11 awS590S0100000_11);

    EnterChatParams LJIIJJI(RouteIntent routeIntent);

    void LJIIL(Context context, Bundle bundle, boolean z, Integer num);

    ChatRootFragment LJIILIIL(EnterChatParams enterChatParams);

    void LJIILJJIL(Context context, String str, String str2, boolean z);

    void LJIILL(C19EG c19eg, FragmentManager fragmentManager, User user, Aweme aweme, String str, String str2, Function2 function2, C0SZG c0szg, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, C0ZH0 c0zh0, String str3, String str4, C459530I0h c459530I0h, AttachmentTypeComponent attachmentTypeComponent, InterfaceC714750S1x interfaceC714750S1x);

    boolean LJIILLIIL(EnterChatParams enterChatParams, InterfaceC913210Zs7 interfaceC913210Zs7);

    void LJIIZILJ(Context context, Long l, String str);

    void LJIJ();

    DmRouterInterceptor LJIJI();

    DetailFeedQuickDMFragment LJIJJ(View view, FragmentManager fragmentManager, Bundle bundle, Aweme aweme, C1209800haU c1209800haU);

    IRemindUsersViewHelper LJIJJLI();

    void LJIL(C19EG c19eg, FragmentManager fragmentManager, Aweme aweme, String str, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, String str2, Function1 function1);

    boolean LJJ(String str);

    void LJJI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z);

    void LJJIFFI();

    boolean LJJII(Intent intent);

    void LJJIII();

    DetailFeedReplyMessageFragment LJJIIJ(View view, FragmentManager fragmentManager, Bundle bundle, String str, C1603860rq4 c1603860rq4, String str2);

    void LJJIIJZLJL(C19EG c19eg, FragmentManager fragmentManager, C0Y8T c0y8t, User user, Aweme aweme, String str, String str2, Function1 function1, C0SZG c0szg, boolean z, EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, C0I08 c0i08, String str3, String str4, String str5, boolean z2);

    String LJJIIZ(String str);

    void LJJIIZI(Context context, Aweme aweme);
}
