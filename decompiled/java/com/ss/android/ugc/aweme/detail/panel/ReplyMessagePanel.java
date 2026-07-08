package com.ss.android.ugc.aweme.detail.panel;

import X.C01GW;
import X.C0I0B;
import X.C0SZG;
import X.C0T2Y;
import X.C128Y;
import X.C1336205Ku;
import X.C1389300mG0;
import X.C1558520qew;
import X.C1620930sHb;
import X.C19606111nH;
import X.C19719512Dh;
import X.C19EH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C281310B0v;
import X.C452501pT;
import X.C484220Iyq;
import X.C729510SjV;
import X.C740740T3w;
import X.C786410Ut5;
import X.C912110ZqL;
import X.InterfaceC1209130hZP;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC714600S1i;
import X.InterfaceC913270ZsD;
import Y.ARunnableS93S0200000_24;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.vibefeed.ability.IVibeDataAbility;
import com.ss.android.ugc.feed.platform.cell.im.safety.SafetyViewModel;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class ReplyMessagePanel extends DetailFragmentPanel {
    public final C2189821An6 A0;
    public List<Aweme> B0;
    public boolean C0;
    public C19606111nH D0;
    public SafetyViewModel E0;
    public boolean F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean I0;
    public final C01GW J0;
    public String K0;
    public Fragment L0;
    public final Bundle z0;

    public final boolean F0() {
        Activity activity = this.activity;
        return activity == null || activity.isFinishing() || this.activity.isDestroyed() || getFragment() == null;
    }

    public final void L0() {
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        FragmentManager childFragmentManager2;
        Fragment fragmentLJJJJZI = this.L0;
        if ((fragmentLJJJJZI != null || ((childFragmentManager2 = getChildFragmentManager()) != null && (fragmentLJJJJZI = childFragmentManager2.LJJJJZI("reply_fragment_tag")) != null)) && (childFragmentManager = getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LJIILL(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIJ();
        }
        super.Cu1();
        InterfaceC1209130hZP interfaceC1209130hZP = this.I;
        if (interfaceC1209130hZP != null) {
            interfaceC1209130hZP.p5(true);
            interfaceC1209130hZP.W3();
            interfaceC1209130hZP.ry();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        if (F0() || LJIIIIZZ() == null) {
            return;
        }
        N0(null);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void g() {
        if (!F0() && this.C0) {
            this.LLJJIJI.setDisableScroll(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroyView() {
        super.onDestroyView();
        C19606111nH c19606111nH = this.D0;
        if (c19606111nH != null) {
            c19606111nH.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLLLLZL(int i) {
        if (F0()) {
            return;
        }
        if (i != 1 && i != 2 && i != 4) {
            return;
        }
        Activity activity = this.activity;
        if (activity instanceof DetailActivity) {
            ((DetailActivity) activity).onBackPressed();
        } else {
            if (activity == null) {
                return;
            }
            activity.onBackPressed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel.N0(java.lang.String):void");
    }

    public final void O0(String str) {
        String aid;
        String str2 = this.K0;
        Aweme awemeO = o();
        String aid2 = null;
        if (awemeO != null) {
            aid = awemeO.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str2, aid)) {
            return;
        }
        Aweme awemeO2 = o();
        if (awemeO2 != null) {
            aid2 = awemeO2.getAid();
        }
        this.K0 = aid2;
        InterfaceC714600S1i quickReplyAnalytics = C1336205Ku.LIZ(false).getQuickReplyAnalytics();
        if (str == null) {
            str = getEventType();
        }
        quickReplyAnalytics.LIZIZ(str, "quick_reply_auto", "", C0I0B.LJFF.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void g0(boolean z) {
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        if (awemeLLLLLJLJLL != null && !C281310B0v.LIZ() && C729510SjV.LJJIJIL(awemeLLLLLJLJLL) && !AwemeBizExtKt.isStoryFakeAweme(awemeLLLLLJLJLL)) {
            super.g0(z);
        }
    }

    @Override // X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Intrinsics.LJFF(this.LLLLIIIILLL.getEnterMethodValue(), "click_quoted_message") || Intrinsics.LJFF(this.LLLLIIIILLL.getEnterMethodValue(), "story_friend_anniversary_card") || Intrinsics.LJFF(this.LLLLIIIILLL.getEnterMethodValue(), "activity_post_card") || Intrinsics.LJFF(this.LLLLIIIILLL.getEnterMethodValue(), "activity_repost_card") || Intrinsics.LJFF(this.LLLLIIIILLL.getEnterMethodValue(), "click_feed_dm_reply_msg")) {
            this.C0 = true;
            this.LLL = true;
            Bundle bundle2 = this.z0;
            if (bundle2 != null) {
                C786410Ut5.LJJJI("enter_method", this.LLLLIIIILLL.getEnterMethodValue(), bundle2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enter method: ");
        sbLIZ.append(this.LLLLIIIILLL.getEnterMethodValue());
        sbLIZ.append(" aid: ");
        sbLIZ.append(this.LLLLIIIILLL.getAid());
        sbLIZ.append(" playing aid:");
        sbLIZ.append(this.LLLLIIIILLL.getChatRoomPlayingRealAid());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String strOptString;
        super.onJsBroadCastEvent(c484220Iyq);
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("eventName");
        } else {
            strOptString = null;
        }
        if (Intrinsics.LJFF(strOptString, "really_chat_report_submit")) {
            SafetyViewModel safetyViewModel = this.E0;
            if (safetyViewModel != null && !safetyViewModel.LL) {
                safetyViewModel.LL = true;
            }
            Activity activity = this.activity;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public ReplyMessagePanel(Bundle bundle, C2189821An6 c2189821An6) {
        boolean z;
        boolean z2;
        super(c2189821An6);
        this.z0 = bundle;
        this.A0 = c2189821An6;
        this.F0 = true;
        if (bundle != null) {
            z = bundle.getBoolean("is_encourage_muf_panel");
        } else {
            z = false;
        }
        this.G0 = z;
        if (bundle != null) {
            z2 = bundle.getBoolean("from_profile_page_repost_tab");
        } else {
            z2 = false;
        }
        this.H0 = z2;
        this.I0 = bundle != null ? bundle.getBoolean("from_repost_feed") : false;
        this.J0 = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(94));
    }

    public final void I0(String str, String str2) {
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        InterfaceC1209130hZP interfaceC1209130hZP = this.I;
        if (interfaceC1209130hZP != null) {
            interfaceC1209130hZP.p5(false);
        }
        Fragment fragmentLJJJJZI = null;
        this.I = null;
        if (this.L0 == null) {
            M0(str, str2);
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            if (childFragmentManager2 != null) {
                fragmentLJJJJZI = childFragmentManager2.LJJJJZI("reply_fragment_tag");
            }
            this.L0 = fragmentLJJJJZI;
        }
        Fragment fragment = this.L0;
        if (fragment != null && (childFragmentManager = getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LJJIFFI(fragment);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        Object objValueOf;
        this.B0 = C19719512Dh.LIZIZ(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshResult size: ");
        if (list != null) {
            objValueOf = Integer.valueOf(list.size());
        } else {
            objValueOf = "null";
        }
        sbLIZ.append(objValueOf);
        sbLIZ.append(", hasMore:");
        sbLIZ.append(z);
        sbLIZ.append(", isFromQuoteMessage:");
        sbLIZ.append(this.C0);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.C0) {
            super.LLJJJIL(list, false);
        } else {
            super.LLJJJIL(list, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0rq4] */
    public final void M0(String str, String str2) {
        View view;
        Bundle bundle;
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        InterfaceC913270ZsD interfaceC913270ZsD;
        C128Y c128y = this.L0;
        String strPa2 = null;
        if (c128y != null) {
            if ((c128y instanceof InterfaceC913270ZsD) && (interfaceC913270ZsD = (InterfaceC913270ZsD) c128y) != null) {
                interfaceC913270ZsD.wL(str);
            }
            Fragment fragment = this.L0;
            if (fragment != null && fragment.isHidden() && (childFragmentManager = getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJJIFFI(fragment);
                c19ehLJIIJ.LJIIJ();
            }
            if (Intrinsics.LJFF(this.LLLLIIIILLL.getEventType(), "shared_feed") || Intrinsics.LJFF(this.LLLLIIIILLL.getEventType(), "shared_feed_like_history")) {
                O0(this.LLLLIIIILLL.getEventType());
                return;
            }
            return;
        }
        Fragment fragment2 = getFragment();
        if (fragment2 != null) {
            view = fragment2.getView();
        } else {
            view = null;
        }
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        if (Intrinsics.LJFF(this.LLLLIIIILLL.getEventType(), "shared_feed_like_history")) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z != null) {
                InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IFeedFragmentAbility.class, null);
                if (!(interfaceC494301wDLIZ instanceof IVibeDataAbility)) {
                    interfaceC494301wDLIZ = null;
                }
                IVibeDataAbility iVibeDataAbility = (IVibeDataAbility) interfaceC494301wDLIZ;
                if (iVibeDataAbility != null) {
                    strPa2 = iVibeDataAbility.Pa2();
                }
            }
            Bundle bundle2 = this.z0;
            if (bundle2 != null) {
                C786410Ut5.LJJJI("refresh_time_for_shared_feed_aweme", strPa2, bundle2);
            }
        }
        Bundle bundle3 = this.z0;
        if (bundle3 != null) {
            C786410Ut5.LJJJI("trigger_reason", "fixed_entrance", bundle3);
        }
        Bundle bundle4 = this.z0;
        if (bundle4 != null) {
            C786410Ut5.LJJJI("friends_v3_track_scene", C1389300mG0.LIZIZ(getFragment()), bundle4);
        }
        String externalShareAwemeId = this.A0.getExternalShareAwemeId();
        if (externalShareAwemeId != null && externalShareAwemeId.length() != 0 && (bundle = this.z0) != null) {
            C786410Ut5.LJJJI("share_link", this.A0.getExternalShareAwemeId(), bundle);
        }
        this.L0 = C1336205Ku.LIZ(false).getImChatService().LJJIIJ(view, getChildFragmentManager(), this.z0, str, new C0SZG() { // from class: X.0rq4
            @Override // X.C0SZG
            public final void LIZ() {
            }

            @Override // X.C0SZG
            public final void LIZIZ(View view2, CharSequence charSequence) {
                EmojiAnimPlayground emojiAnimPlayground;
                ReplyMessagePanel replyMessagePanel = this.LIZ;
                C19606111nH c19606111nH = replyMessagePanel.D0;
                if (c19606111nH == null) {
                    ViewStub viewStub = (ViewStub) replyMessagePanel.E.findViewById(R.id.b48);
                    View viewLJLLLL = null;
                    if (viewStub != null) {
                        viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                    }
                    if ((viewLJLLLL instanceof EmojiAnimPlayground) && (emojiAnimPlayground = (EmojiAnimPlayground) viewLJLLLL) != null) {
                        replyMessagePanel.D0 = new C19606111nH(emojiAnimPlayground);
                        HandlerHook.viewPost(emojiAnimPlayground, new ARunnableS93S0200000_24(replyMessagePanel, charSequence, 3));
                        return;
                    }
                    return;
                }
                c19606111nH.LIZIZ(charSequence.toString());
            }
        }, str2);
        if (Intrinsics.LJFF(this.LLLLIIIILLL.getEventType(), "shared_feed") || Intrinsics.LJFF(this.LLLLIIIILLL.getEventType(), "shared_feed_like_history")) {
            O0(this.LLLLIIIILLL.getEventType());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        if (!this.C0) {
            super.Pj(list, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void mE(List<Aweme> list, boolean z) {
        if (this.C0) {
            super.mE(list, false);
        } else {
            super.mE(list, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        IRefreshAbility iRefreshAbility;
        super.onViewCreated(view, bundle);
        if (this.C0 && (iRefreshAbility = this.LLILZIL) != null) {
            iRefreshAbility.setEnabled(false);
        }
        this.E0 = C912110ZqL.LIZ(getFragment());
        Fragment fragment = getFragment();
        if (fragment != null) {
            C740740T3w.LIZ(fragment, fragment, new C0T2Y() { // from class: X.0rpQ
                @Override // X.C0T2Y
                public final void Y3(Aweme aweme) {
                    C0R6I mediaSafetyModel;
                    SafetyViewModel safetyViewModel;
                    ReplyMessagePanel replyMessagePanel = this.LL;
                    if (replyMessagePanel.F0) {
                        replyMessagePanel.N0(null);
                        this.LL.F0 = false;
                    }
                    Aweme awemeLIZLLL = C729980SkG.LIZLLL(this.LL.LJIIIIZZ());
                    if (awemeLIZLLL != null && (mediaSafetyModel = AwemeBizExtKt.getMediaSafetyModel(awemeLIZLLL)) != null && (safetyViewModel = this.LL.E0) != null) {
                        boolean z = mediaSafetyModel.hasNegativeAction;
                        String str = mediaSafetyModel.msgUuid;
                        boolean zIsUnmaskedNudeMsg = mediaSafetyModel.isUnmaskedNudeMsg();
                        safetyViewModel.LLILLJJLI = z;
                        safetyViewModel.LLILZ = str;
                        safetyViewModel.LLILLL = zIsUnmaskedNudeMsg;
                    }
                }
            });
        }
        this.LLJJIJI.LIZJ(new C1620930sHb(this, 5));
    }
}
