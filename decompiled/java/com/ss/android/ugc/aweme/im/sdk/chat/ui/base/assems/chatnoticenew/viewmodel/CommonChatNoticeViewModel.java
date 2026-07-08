package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel;

import X.AnonymousClass0629;
import X.C01GW;
import X.C068G;
import X.C068V;
import X.C06NK;
import X.C06NU;
import X.C06O6;
import X.C06OO;
import X.C09AE;
import X.C0PEM;
import X.C1147304eF;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LQ;
import X.C1477105qL;
import X.C1600706On;
import X.C1636306av;
import X.C1640306bZ;
import X.C1671006gW;
import X.C1DFB;
import X.C23250099c;
import X.C824390WVp;
import X.EnumC15556067e;
import X.EnumC1596306Mv;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonChatNoticeViewModel extends BaseCommonChatNoticeViewModel {
    public static final /* synthetic */ int LLJI = 0;

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void PQ2() {
        xQ2(EnumC1596306Mv.COLLABORATIVE_COLLECTION_POP_UP.toTask());
    }

    @Override // com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel, com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final C09AE vQ2(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C068G(this, function2, null), 3);
    }

    public CommonChatNoticeViewModel(IChatNoticeFlowEngine iChatNoticeFlowEngine, C1DFB c1dfb) {
        super(iChatNoticeFlowEngine, c1dfb, C1477105qL.LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void GQ2(Context context, boolean z) {
        Activity activityLIZ;
        if (z && C824390WVp.LIZJ(context)) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ.plus(this.LLIZLLLIL), null, new C1640306bZ(this, null), 2);
            if (C06NU.LIZ() && context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131831698);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.a1h);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final IChatNoticeFlowEngine IQ2(C1600706On c1600706On, List<? extends C06O6<? extends C06OO>> list) {
        C1671006gW c1671006gW;
        IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LL;
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.GAME_CHALLENGE_GET_STARTED_CREATION), new AwS546S0100000_2(c1600706On, 508));
        iChatNoticeFlowEngine.LJIILL(C13LQ.LJLIIL(new EnumC1596306Mv[]{EnumC1596306Mv.GROUP_SHOT_GET_STARTED_CREATION, EnumC1596306Mv.GROUP_SHOT_GET_STARTED_PROMOTION}), new AwS546S0100000_2(c1600706On, 515));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.PRESHOWN_STICKERS), new AwS546S0100000_2(c1600706On, 491));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.BLOCK), new AwS546S0100000_2(c1600706On, 492));
        iChatNoticeFlowEngine.LJIILL(C13LQ.LJLIIL(new EnumC1596306Mv[]{EnumC1596306Mv.CHAT_UNAVAILABLE_ACCOUNT, EnumC1596306Mv.CHAT_UNAVAILABLE_DM}), new AwS546S0100000_2(c1600706On, 494));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.CHAT_REQUEST_BLOCKER), new AwS546S0100000_2(c1600706On, 496));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.MESSAGE_REQUEST_BANNER), new AwS546S0100000_2(c1600706On, 498));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.TYPING_RECOMMENDATION), new AwS546S0100000_2(c1600706On, 500));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.REPLY_STICKER_RECOMMENDATION), new AwS546S0100000_2(c1600706On, 502));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.MEDIA_NUDE_FILTER), new AwS546S0100000_2(c1600706On, 493));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.MATCHED_FRIEND), new AwS546S0100000_2(c1600706On, 495));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.CHAT_REQUEST_SENT), new AwS546S0100000_2(c1600706On, 497));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.CHAT_REQUEST_START), new AwS546S0100000_2(c1600706On, 499));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.PERSONALIZED_STICKER_RECOMMEND_POPUP), new AwS546S0100000_2(c1600706On, 501));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.READ_RECEIPT_BOTTOM), new AwS546S0100000_2(c1600706On, 503));
        iChatNoticeFlowEngine.LJIILL(C13LQ.LJLIIL(new EnumC1596306Mv[]{EnumC1596306Mv.RECENT_ACTIVITY, EnumC1596306Mv.RECENT_ACTIVITY_FROM_INBOX}), new AwS546S0100000_2(c1600706On, 504));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.SAFE_CONVERSATION), new AwS546S0100000_2(c1600706On, 505));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.WHEE_BUBBLE_DIVERSION_CARD), new AwS546S0100000_2(c1600706On, 506));
        if (C1636306av.LIZ()) {
            iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.STREAK_REMIND_PERMISSION), new AwS546S0100000_2(c1600706On, 507));
            iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.ONGOING_GROUP_SHOT), new AwS546S0100000_2(c1600706On, 509));
            iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.PERMISSION_OFF), new AwS546S0100000_2(c1600706On, 510));
            C01GW<View> c01gw = c1600706On.LIZ.LIZ;
            View value = null;
            if (c01gw != null) {
                value = c01gw.getValue();
            }
            if ((value instanceof C1671006gW) && (c1671006gW = (C1671006gW) value) != null) {
                iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.PERMISSION_MESSAGE), new AwS403S0200000_2(c1600706On, c1671006gW, 20));
                iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.BUSINESS_MESSAGE_REQUEST_STRAIGHT_TO_INBOX), new AwS403S0200000_2(c1600706On, c1671006gW, 21));
                iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.READ_RECEIPT_TOP), new AwS403S0200000_2(c1600706On, c1671006gW, 22));
            }
        }
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.PHOTO_COMMENT_STICKER_RECOMMENDATION_BANNER), new AwS546S0100000_2(c1600706On, 511));
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.PHOTO_COMMENT_STICKER_RECOMMENDATION_MESSAGE), new AwS546S0100000_2(c1600706On, 512));
        IMAIServiceAPI.LIZ.getClass();
        C06O6<C06OO> c06o6LJJIL = AnonymousClass0629.LIZ().LIZ().LJJIL(c1600706On);
        if (c06o6LJJIL != null) {
            iChatNoticeFlowEngine.LJIIJJI(c06o6LJJIL);
        }
        if (C06NK.LIZ()) {
            iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.OUT_PUSH_GUIDE_POPUP), new AwS546S0100000_2(c1600706On, 513));
            iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.EC_SELLER), new AwS546S0100000_2(c1600706On, 514));
            iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.AI_MOJI_SUGGESTED), new AwS546S0100000_2(c1600706On, 516));
            iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.COLLABORATIVE_COLLECTION_POP_UP), new AwS546S0100000_2(c1600706On, 517));
        }
        iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.STORY_REVEAL_PROMOTION_CARD), new AwS546S0100000_2(c1600706On, 489));
        if (C1147304eF.LIZ()) {
            iChatNoticeFlowEngine.LJIILL(Collections.singleton(EnumC1596306Mv.STREAK_EXCLUSIVE_OUTFIT_FOR_WHEE), new AwS546S0100000_2(c1600706On, 490));
        }
        Iterator<? extends C06O6<? extends C06OO>> it2 = list.iterator();
        while (it2.hasNext()) {
            iChatNoticeFlowEngine.LJIIJJI(it2.next());
        }
        return iChatNoticeFlowEngine;
    }

    @Override // com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel, com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel
    public final void DQ2(EnumC15556067e enumC15556067e, String str, String str2, long j) {
        SessionInfo sessionInfoRQ2 = RQ2();
        if (sessionInfoRQ2 == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), this.LLIZLLLIL, null, new C068V(j, this, enumC15556067e, str, str2, sessionInfoRQ2, null), 2);
    }
}
