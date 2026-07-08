package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C01GW;
import X.C0I08;
import X.C0I0B;
import X.C0I0E;
import X.C0S1H;
import X.C0S1K;
import X.C0S1M;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0ZH1;
import X.C1076010e6h;
import X.C11JF;
import X.C11S5;
import X.C1360340lVI;
import X.C13BV;
import X.C1440005kM;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C2189821An6;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C453940Hr6;
import X.C724240Sb0;
import X.C729510SjV;
import X.C735840Sti;
import X.C738880Syc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2172611A1b;
import X.EnumC713160RyE;
import X.EnumC714710S1t;
import X.EnumC913010Zrn;
import X.InterfaceC665370Q7z;
import Y.ACListenerS146S0100000_11;
import Y.ACListenerS83S1100000_11;
import Y.AObserverS215S0100000_11;
import Y.AfS147S0200000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.IStoryCurrentSubAwemeAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class BottomFriendsV3DetailStoryDMAssem extends AbstractBottomPriorityComponent implements C0I08 {
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(49));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(50));
    public LinearLayout LLJIJIL;
    public TuxTextView LLJILJIL;
    public LinearLayout LLJILJILJ;
    public Aweme LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public C11JF LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public IViewPagerComponentAbility LLJJIJIL;
    public C738880Syc LLJJJ;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "friends_v3_detail_story_dm";
    }

    public final void So() {
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIII = null;
        if (!LJJLIL()) {
            if (this.LLJJ) {
                C786410Ut5.LJLLLLLL(8, LJJIJL());
            }
        } else {
            Aweme aweme = this.LLJILLL;
            if (aweme == null) {
                return;
            }
            this.LLJJIII = (C11JF) C0S1K.LIZIZ.LJI(aweme, EnumC713160RyE.FEED, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS147S0200000_11(aweme, this, 2), new AfS147S0200000_11(aweme, this, 3));
        }
    }

    @Override // X.C0I08
    public final void TG() {
        C1440005kM.LIZ(new C453940Hr6(true, false, 4));
    }

    public final void Vo() {
        String aid;
        C2189821An6 c2189821An6Xp0;
        ConcurrentHashMap<String, List<String>> emojiDisplaySet;
        String string;
        String nickname;
        Aweme aweme = this.LLJILLL;
        if (aweme == null) {
            return;
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        boolean zLIZ = c1618440sDa.LJJLIIIJL().LIZ(aweme, false, false, true);
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context == null) {
                string = "";
            } else if (zLIZ) {
                User author = aweme.getAuthor();
                string = (author == null || (nickname = author.getNickname()) == null || nickname.length() == 0) ? context.getString(2131830718) : context.getString(2131830719, nickname);
            } else {
                string = context.getString(2131830717);
            }
            tuxTextView.setHint(string);
        }
        LinearLayout linearLayout = this.LLJILJILJ;
        if (linearLayout == null) {
            return;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        if (zLIZ) {
            List<String> listLIZIZ = c1618440sDa.LJJLIIIJL().LIZIZ(aweme);
            if (listLIZIZ == null) {
                listLIZIZ = C13BV.INSTANCE;
            }
            int i = 0;
            for (String str : listLIZIZ) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                String str2 = str;
                ACListenerS83S1100000_11 aCListenerS83S1100000_11 = new ACListenerS83S1100000_11(this, str2, i, 0);
                TuxTextView tuxTextView2 = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                tuxTextView2.setText(str2);
                tuxTextView2.LJJJJI(22.0f);
                tuxTextView2.setGravity(17);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                layoutParams.gravity = 16;
                layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                linearLayout.addView(tuxTextView2, layoutParams);
                C786410Ut5.h9(tuxTextView2, aCListenerS83S1100000_11);
                i = i2;
            }
            Aweme aweme2 = this.LLJILLL;
            if (aweme2 == null || (aid = aweme2.getAid()) == null || (c2189821An6Xp0 = xp0()) == null || (emojiDisplaySet = c2189821An6Xp0.getEmojiDisplaySet()) == null) {
                return;
            }
            emojiDisplaySet.put(aid, listLIZIZ);
        }
    }

    public final QuickDMEventParam Zo() {
        String str;
        String aid;
        String authorUid;
        Map<String, String> extra;
        Aweme aweme = this.LLJILLL;
        C2189821An6 c2189821An6Xp0 = xp0();
        if (c2189821An6Xp0 == null || (extra = c2189821An6Xp0.getExtra()) == null || (str = extra.get("enter_position")) == null) {
            str = "feed";
        }
        String eventType = getEventType();
        if (aweme != null) {
            aid = aweme.getAid();
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            aid = null;
            authorUid = null;
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = aweme != null ? aweme.getAuthor() : null;
        c735840Sti.getClass();
        String strValueOf = String.valueOf(C735840Sti.LJIIIIZZ(author));
        String str2 = C1618440sDa.LIZIZ.LJJLIIIJL().LIZ(aweme, false, false, true) ? "1" : CardStruct.IStatusCode.DEFAULT;
        C2189821An6 c2189821An6Xp02 = xp0();
        return new QuickDMEventParam(str, eventType, aid, authorUid, strValueOf, null, str2, c2189821An6Xp02 != null ? c2189821An6Xp02.getFrom() : null, true, false, null, true, 6240);
    }

    public final void cp() {
        Aweme aweme;
        String aid;
        if (this.LLJJIJI && LJJIJL().getVisibility() == 0 && !this.LLJJI && this.LLJJ && LJJIJL().getVisibility() == 0 && (aweme = this.LLJILLL) != null && C729510SjV.LJJIJIL(aweme)) {
            this.LLJJI = true;
            ap("story_dm_input_box_show", null);
            IUnifyQuickReplyAnalytics.LIZ.getClass();
            IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
            if (iUnifyQuickReplyAnalyticsLIZ != null) {
                C0S2S c0s2s = EnumC2172611A1b.Companion;
                C2189821An6 c2189821An6Xp0 = xp0();
                String eventType = c2189821An6Xp0 != null ? c2189821An6Xp0.getEventType() : null;
                c0s2s.getClass();
                EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(eventType);
                C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
                EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
                Aweme aweme2 = this.LLJILLL;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                iUnifyQuickReplyAnalyticsLIZ.LIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, C729510SjV.LJJIJIL(this.LLJILLL) ? C0ZH1.STORY : C0ZH1.POST, C0S2R.PRIVATE, "", C0I0B.LJFF.LIZIZ());
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIII = null;
        C738880Syc c738880Syc = this.LLJJJ;
        if (c738880Syc != null && (iViewPagerComponentAbility = this.LLJJIJIL) != null) {
            iViewPagerComponentAbility.Xl0(c738880Syc);
        }
        this.LLJJJ = null;
        this.LLJJIJIL = null;
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIL() {
        Aweme awemeHo = Ho();
        if (!(awemeHo == null && (awemeHo = this.LLJILLL) == null) && C1360340lVI.LIZ(xp0())) {
            return C0S1K.LIZIZ.LIZ(awemeHo, EnumC713160RyE.FEED, null);
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Fragment parentFragment;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        IStoryCurrentSubAwemeAbility iStoryCurrentSubAwemeAbility;
        MutableLiveData mutableLiveDataIA1;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (parentFragment = fragmentLJI.getParentFragment()) == null) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(parentFragment);
        if (interfaceC665370Q7zLJ != null && (iStoryCurrentSubAwemeAbility = (IStoryCurrentSubAwemeAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IStoryCurrentSubAwemeAbility.class, null)) != null && (mutableLiveDataIA1 = iStoryCurrentSubAwemeAbility.IA1()) != null) {
            mutableLiveDataIA1.observe(parentFragment, new AObserverS215S0100000_11(this, 0));
        }
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(parentFragment, new AObserverS215S0100000_11(this, 1));
        InterfaceC665370Q7z interfaceC665370Q7zLJ2 = C1578630rBN.LJ(parentFragment);
        if (interfaceC665370Q7zLJ2 == null || (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ2, IViewPagerComponentAbility.class, null)) == null) {
            return;
        }
        C738880Syc c738880Syc = new C738880Syc(this, 1);
        iViewPagerComponentAbility.Bv0(c738880Syc);
        this.LLJJIJIL = iViewPagerComponentAbility;
        this.LLJJJ = c738880Syc;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean Go(C2189821An6 c2189821An6) {
        return C1360340lVI.LIZ(c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void No(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View viewLJJIJL = LJJIJL();
        if (!this.LLJJ && (viewLJJIJL instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewLJJIJL) != null) {
            C786410Ut5.Td(C786410Ut5.ne(viewGroup2.getContext()), R.layout.a2f, viewGroup2, true);
            this.LLJIJIL = (LinearLayout) viewGroup2.findViewById(R.id.snx);
            this.LLJILJIL = (TuxTextView) viewGroup2.findViewById(R.id.so1);
            this.LLJILJILJ = (LinearLayout) viewGroup2.findViewById(R.id.gzl);
            LinearLayout linearLayout = this.LLJIJIL;
            if (linearLayout != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(36));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a02);
                linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
                C786410Ut5.R7(linearLayout, new ACListenerS146S0100000_11(this, 59));
            }
            this.LLJJ = true;
            if (this.LLJILLL != null) {
                Vo();
                cp();
            }
        }
    }

    public final void bp(EnumC714710S1t enumC714710S1t) {
        String aid;
        C0ZH1 c0zh1;
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            String eventType = getEventType();
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(eventType);
            C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            Aweme aweme = this.LLJILLL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            if (C729510SjV.LJJIJIL(this.LLJILLL)) {
                c0zh1 = C0ZH1.STORY;
            } else {
                c0zh1 = C0ZH1.POST;
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, c0zh1, C0S2R.PRIVATE, enumC714710S1t, C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // X.C0I08
    public final void YO(C0I0E c0i0e, String str) {
        C1440005kM.LIZ(new C453940Hr6(false, false, 4));
    }

    public final void ap(String str, String str2) {
        Aweme aweme = this.LLJILLL;
        if (aweme == null || !C729510SjV.LJJIJIL(aweme)) {
            return;
        }
        C0S1M.LIZ(str, QuickDMEventParam.LIZ(Zo(), str2, null, null, 16351));
    }
}
