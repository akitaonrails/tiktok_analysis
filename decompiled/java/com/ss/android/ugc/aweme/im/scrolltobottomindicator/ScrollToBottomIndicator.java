package com.ss.android.ugc.aweme.im.scrolltobottomindicator;

import X.AbstractC2238408pq;
import X.AnonymousClass0956;
import X.C01GW;
import X.C01M8;
import X.C06Q7;
import X.C06R7;
import X.C0I0B;
import X.C0OBV;
import X.C0PEM;
import X.C1BNE;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2252321DDq;
import X.C23250099c;
import X.C384050F3z;
import X.C414301jJ;
import X.C418440Gaw;
import X.C452501pT;
import X.C596050NZj;
import X.C596060NZk;
import X.C638950P4j;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC346201Wa;
import X.InterfaceC497601wk;
import Y.ACListenerS144S0100000_9;
import Y.AsS36S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS143S0400000_14;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ScrollToBottomIndicator implements LifecycleEventObserver, InterfaceC497601wk {
    public final View LL;
    public final RecyclerView LLILLJJLI;
    public final C06R7 LLILLL;
    public final Function0<Boolean> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final InterfaceC346201Wa<Boolean> LLIZLLLIL;
    public final SessionInfo LLJ;
    public final Context LLJI;
    public final LinearLayout LLJILJIL;
    public final LinearLayout LLJILJILJ;
    public final TextView LLJILLL;
    public final TuxIconView LLJJ;
    public AnonymousClass0956 LLJJI;
    public AnonymousClass0956 LLJJIII;
    public boolean LLJJIJI;
    public final AbstractC2238408pq LLJJIJIIJIL;
    public volatile int LLJJIJIL;
    public final C2252321DDq LLJJJ;
    public final C414301jJ LLJJJIL;
    public final int LLILZLL = 2131835824;
    public final int LLIZ = 2131755646;
    public final C01GW LLJIJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS553S0100000_9(this, 1663));

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLJJIJIIJIL;
    }

    public static final void LIZ(View view) {
        if (view == null) {
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c3);
        view.setBackground(c384050F3z.LIZ(view.getContext()));
    }

    public final void LIZJ(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJILJIL.getLayoutParams();
        marginLayoutParams.setMarginEnd((int) ((i * this.LLJILJIL.getResources().getDisplayMetrics().density) + 0.5f));
        C786410Ut5.d6(this.LLJILJIL, marginLayoutParams);
    }

    public final void LIZIZ(boolean z, Integer num) {
        String str;
        String strLIZJ;
        if (this.LLJ.isChatroomAnalyticsBlocked()) {
            return;
        }
        if (z) {
            str = "ttsocial_dm_back_btn_click";
        } else {
            str = "ttsocial_dm_back_btn_show";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IIMChatRoomAnalytics.LIZ.getClass();
        IIMChatRoomAnalytics iIMChatRoomAnalyticsLIZ = C06Q7.LIZ();
        if (iIMChatRoomAnalyticsLIZ == null || (strLIZJ = iIMChatRoomAnalyticsLIZ.LIZJ(this.LLJ)) == null) {
            strLIZJ = "";
        }
        linkedHashMap.put("conversation_id", this.LLJ.getConversationId());
        if (num != null) {
            linkedHashMap.put("message_num", num.toString());
        }
        linkedHashMap.put("position", "dm_bottom");
        linkedHashMap.put("chat_type", strLIZJ);
        linkedHashMap.put("enter_from", "chat");
        linkedHashMap.put("notice_type", "notice_number");
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C0OBV.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                AnonymousClass0956 anonymousClass0956 = this.LLJJI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                AnonymousClass0956 anonymousClass09562 = this.LLJJIII;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass0956 anonymousClass09563 = this.LLJJI;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        this.LLJJI = C23250099c.LIZLLL(this, null, null, new C596060NZk(this, null), 3);
        AnonymousClass0956 anonymousClass09564 = this.LLJJIII;
        if (anonymousClass09564 != null) {
            anonymousClass09564.LIZIZ(null);
        }
        this.LLJJIII = C23250099c.LIZLLL(this, null, null, new C596050NZj(this, null), 3);
    }

    public ScrollToBottomIndicator(View view, RecyclerView recyclerView, C06R7 c06r7, AwS553S0100000_9 awS553S0100000_9, AwS143S0400000_14 awS143S0400000_14, C638950P4j c638950P4j, SessionInfo sessionInfo) {
        this.LL = view;
        this.LLILLJJLI = recyclerView;
        this.LLILLL = c06r7;
        this.LLILZ = awS553S0100000_9;
        this.LLILZIL = awS143S0400000_14;
        this.LLIZLLLIL = c638950P4j;
        this.LLJ = sessionInfo;
        this.LLJI = view.getContext();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.u3_);
        this.LLJILJIL = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.u3a);
        this.LLJILJILJ = linearLayout2;
        this.LLJILLL = (TextView) view.findViewById(R.id.u38);
        this.LLJJ = (TuxIconView) view.findViewById(R.id.u39);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJIJIIJIL = C2107308Nj.LIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LLJJJ = c2252321DDqLIZ;
        this.LLJJJIL = new C414301jJ(c638950P4j, c2252321DDqLIZ, new C01M8(null));
        LIZ(linearLayout);
        LIZ(linearLayout2);
        recyclerView.addOnScrollListener(new AsS36S0100000_9(this, 8));
        C786410Ut5.R7(linearLayout, new ACListenerS144S0100000_9(this, 97));
    }
}
