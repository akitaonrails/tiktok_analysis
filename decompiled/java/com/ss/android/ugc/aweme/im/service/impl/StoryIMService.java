package com.ss.android.ugc.aweme.im.service.impl;

import X.C01GW;
import X.C069O;
import X.C0I08;
import X.C0S1L;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C0ZGS;
import X.C0ZGU;
import X.C0ZH1;
import X.C10EU;
import X.C11NZ;
import X.C1266230j3V;
import X.C1336205Ku;
import X.C1360320lVG;
import X.C1365810le7;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13DA;
import X.C1479905qn;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C1766306vt;
import X.C19600211mK;
import X.C19EG;
import X.C2097608Jq;
import X.C281310B0v;
import X.C452501pT;
import X.C456970Hvz;
import X.C457000Hw2;
import X.C497820Jfg;
import X.C713170RyF;
import X.C714660S1o;
import X.C729510SjV;
import X.C913340ZsK;
import X.EnumC2172611A1b;
import X.EnumC456980Hw0;
import X.EnumC713160RyE;
import X.EnumC913000Zrm;
import X.EnumC913010Zrn;
import X.InterfaceC1361990lXx;
import X.InterfaceC1365380ldQ;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.IShareMessageToastHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.quickchat.QuickMessageService;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import com.ss.android.ugc.aweme.im.service.service.IStoryIMService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryIMService implements IStoryIMService {
    public static final /* synthetic */ int LJ = 0;
    public PointF LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1479905qn());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C069O());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C714660S1o());

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final PointF LJFF() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LJ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        if (i >= 0) {
            if (i > C497820Jfg.LIZIZ(view.getContext()) && C497820Jfg.LIZIZ(view.getContext()) > 0) {
                return;
            }
            this.LIZ = new PointF(iArr[0] + (view.getWidth() / 2.0f), iArr[1] + (view.getHeight() / 2.0f));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final C1389880mGw LJIIIIZZ(C19EG c19eg) {
        if (c19eg != null) {
            C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
            c1389880mGw.LJIIIIZZ(2131822805);
            c1389880mGw.LJI(R.attr.a0i);
            c1389880mGw.LIZLLL(2000L);
            return c1389880mGw;
        }
        return null;
    }

    public static final String LJIIJJI(C0ZGS c0zgs, String str) {
        if (str != null) {
            return "quick_reply";
        }
        if (c0zgs == C0ZGS.EMOJI) {
            return "story_float_emoji";
        }
        if (c0zgs == C0ZGS.STICKER) {
            return "story_float_avatar";
        }
        return "story_message_input_box";
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final String LJII(Context context, boolean z) {
        String string;
        if (context == null || (string = context.getString(2131830718)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final C1389890mGx LJIIIZ(Activity activity, String str) {
        IShareMessageToastHelper iShareMessageToastHelper;
        String strYs;
        if (activity != null && (iShareMessageToastHelper = (IShareMessageToastHelper) PluggableExtentionKt.pluggableSpi$default(IShareMessageToastHelper.class, false, false, false, 14, null)) != null && (strYs = iShareMessageToastHelper.ys(str)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(strYs);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            return c1389890mGx;
        }
        return null;
    }

    public static void LJIIJ(Aweme aweme, Map map, Map map2) {
        String str;
        if (map2 != null && (str = (String) map2.get("friends_v3_track_scene")) != null && str.length() > 0 && 1 != 0) {
            map.put("friends_tab_version", "v3.0");
            map.put("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str))));
            if (aweme != null && C729510SjV.LJJIJIL(aweme)) {
                String strLJII = C729510SjV.LJII(aweme);
                if (strLJII.length() > 0) {
                    map.put("from_story_collection_id", strLJII);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final boolean LIZ(Aweme aweme, EnumC713160RyE enumC713160RyE, Fragment fragment) {
        boolean zLIZ;
        if (aweme == null) {
            return false;
        }
        if (C713170RyF.LIZ[enumC713160RyE.ordinal()] == 1) {
            zLIZ = C281310B0v.LIZ();
        } else {
            zLIZ = C281310B0v.LIZ();
        }
        if (!zLIZ) {
            return false;
        }
        boolean zLJJIIJZLJL = C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(fragment);
        if (AwemeBizExtKt.isStoryFakeAweme(aweme) || (!C729510SjV.LJJIJIL(aweme) && !zLJJIIJZLJL)) {
            return false;
        }
        Story story = aweme.getStory();
        if ((story != null && Intrinsics.LJFF(story.chatDisable, Boolean.TRUE)) || C1336205Ku.LIZJ().LIZJ() || C10EU.LJIILLIIL(aweme.getAuthor())) {
            return false;
        }
        Story story2 = aweme.getStory();
        String uid = null;
        if (story2 != null && story2.chatDisable != null) {
            return true;
        }
        IShareStatusKeva iShareStatusKeva = (IShareStatusKeva) this.LIZIZ.getValue();
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        }
        int iLIZJ = iShareStatusKeva.LIZJ(uid);
        if (iLIZJ != 1 && iLIZJ != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final C11NZ<C0S1L> LJI(Aweme aweme, EnumC713160RyE enumC713160RyE, Fragment fragment) {
        Boolean bool;
        boolean z = false;
        if (aweme != null && LIZ(aweme, enumC713160RyE, fragment)) {
            Story story = aweme.getStory();
            String uid = null;
            if (story != null) {
                bool = story.chatDisable;
            } else {
                bool = null;
            }
            if (bool != null) {
                return C11NZ.LJJJJZ(new C0S1L(aweme, !bool.booleanValue()));
            }
            IShareStatusKeva iShareStatusKeva = (IShareStatusKeva) this.LIZIZ.getValue();
            User author = aweme.getAuthor();
            if (author != null) {
                uid = author.getUid();
            }
            int iLIZJ = iShareStatusKeva.LIZJ(uid);
            if (iLIZJ > 0) {
                if (iLIZJ == 1) {
                    z = true;
                }
                return C11NZ.LJJJJZ(new C0S1L(aweme, z));
            }
            return C11NZ.LJIJJLI(new C1266230j3V(aweme, 1));
        }
        return C11NZ.LJJJJZ(new C0S1L(aweme, false));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZIZ(User user, boolean z, String str, String str2) {
        IIMContactUtilService iIMContactUtilService;
        IMContact iMContactLJI;
        if (user != null && user.getUid() != null) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(C0YNP.LJ(user.getUid()));
            if (c0y8tLIZ != null && (iIMContactUtilService = (IIMContactUtilService) PluggableExtentionKt.pluggableSpi$default(IIMContactUtilService.class, false, false, false, 14, null)) != null && (iMContactLJI = iIMContactUtilService.LJI(c0y8tLIZ)) != null) {
                List listSingletonList = Collections.singletonList(iMContactLJI);
                IShareMessageToastHelper.LIZ.getClass();
                IShareMessageToastHelper iShareMessageToastHelperLIZ = C913340ZsK.LIZ();
                if (iShareMessageToastHelperLIZ != null) {
                    iShareMessageToastHelperLIZ.zs(new C1365810le7(listSingletonList, "exposed_emoji", str2, "story_exposed_emoji", str, false, false, 0, C1766306vt.LIZ(listSingletonList), null, null, null, false, z, 7680));
                }
            }
        }
    }

    public static final Map<String, String> LJIIL(Aweme aweme, QuickDMEventParam quickDMEventParam, Map<String, String> map, StoryIMService storyIMService, String str, String str2, String str3, C0ZGS c0zgs) {
        String str4;
        String str5;
        String aid;
        Map<String, String> mapLJIILLIIL;
        StoryNoteInfo storyNoteInfo;
        String strLJIJJLI;
        String str6;
        String requestId;
        Pair[] pairArr = new Pair[3];
        if (c0zgs.isQuickReply()) {
            str4 = "emoji";
        } else {
            str4 = "text";
        }
        pairArr[0] = new Pair("dm_reply_type", str4);
        if (C729510SjV.LJJIJIL(aweme)) {
            str5 = "story";
        } else {
            str5 = "post";
        }
        pairArr[1] = new Pair("story_type", str5);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        pairArr[2] = new Pair("use_story_gid", aid);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (quickDMEventParam != null && quickDMEventParam.isImmersiveFeed && aweme != null && (requestId = aweme.getRequestId()) != null) {
            mapLJIIJ.put("request_id", requestId);
        }
        if (map != null && (str6 = map.get("is_centralized_avatar")) != null) {
            mapLJIIJ.put("is_centralized_avatar", str6);
        }
        if (aweme != null && (storyNoteInfo = aweme.storyNoteInfo) != null && (strLJIJJLI = C1609930rzr.LJIJJLI(Integer.valueOf(storyNoteInfo.subType))) != null) {
            mapLJIIJ.put("holiday_type", strLJIJJLI);
            mapLJIIJ.put("has_festivals_custom", "1");
        }
        storyIMService.getClass();
        LJIIJ(aweme, mapLJIIJ, map);
        if (aweme != null && (mapLJIILLIIL = ((InterfaceC1365380ldQ) storyIMService.LIZLLL.getValue()).LJIILLIIL(aweme, str, LJIIJJI(c0zgs, str3), str2, null, null, null, mapLJIIJ)) != null) {
            return mapLJIILLIIL;
        }
        return mapLJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZJ(final String str, User user, Aweme aweme, String str2, String str3, String str4, Boolean bool, boolean z, Map<String, String> map, final Function1<? super String, Unit> function1) {
        String str5;
        String aid;
        StoryNoteInfo storyNoteInfo;
        String strLJIJJLI;
        String str6;
        InterfaceC1365380ldQ interfaceC1365380ldQ = (InterfaceC1365380ldQ) this.LIZLLL.getValue();
        if (z) {
            str5 = "story_exposed_emoji";
        } else {
            str5 = "story_message_input_box";
        }
        C13DA c13da = new C13DA();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c13da.put("use_story_gid", aid);
        if (map != null && (str6 = map.get("is_centralized_avatar")) != null) {
            c13da.put("is_centralized_avatar", str6);
        }
        if (aweme != null && (storyNoteInfo = aweme.storyNoteInfo) != null && (strLJIJJLI = C1609930rzr.LJIJJLI(Integer.valueOf(storyNoteInfo.subType))) != null) {
            c13da.put("holiday_type", strLJIJJLI);
            c13da.put("has_festivals_custom", "1");
        }
        LJIIJ(aweme, c13da, map);
        interfaceC1365380ldQ.LJIJJ(str, null, user, aweme, str2, str5, str4, bool, true, null, null, null, c13da.build(), new InterfaceC1361990lXx() { // from class: X.0SVK
            @Override // X.InterfaceC1361990lXx
            public final /* synthetic */ void LIZIZ(HashMap map2) {
            }

            @Override // X.InterfaceC1361990lXx
            public final void LIZ() {
                Function1<String, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(str);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZLLL(C19EG c19eg, View view, FragmentManager fragmentManager, QuickDMEventParam quickDMEventParam, Aweme aweme, User user, String str, String str2, String str3, boolean z, C0I08 c0i08, Function0 function0, C19600211mK c19600211mK, String str4, Integer num, Integer num2, boolean z2, boolean z3, boolean z4, Fragment fragment, Map map) {
        String nickname;
        String uid;
        String aid;
        if (fragmentManager == null) {
            return;
        }
        String aid2 = null;
        QuickMessageService quickMessageService = (QuickMessageService) PluggableExtentionKt.pluggableSpi$default(QuickMessageService.class, false, false, false, 14, null);
        if (quickMessageService != null) {
            Integer numValueOf = null;
            if (user != null) {
                nickname = user.getNickname();
            } else {
                nickname = null;
            }
            String str5 = "";
            if (nickname == null) {
                nickname = "";
            }
            C457000Hw2 c457000Hw2 = new C457000Hw2(nickname);
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            String strLJ = C0YNP.LJ(uid);
            boolean z5 = !z;
            EnumC456980Hw0 enumC456980Hw0 = EnumC456980Hw0.FORCE_SHOW;
            if (aweme != null) {
                aid2 = aweme.getAid();
            }
            EnumC2172611A1b.Companion.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str);
            EnumC913000Zrm enumC913000Zrm = EnumC913000Zrm.CLICK_STORY_BOTTOM_INPUT_BOX;
            C0ZH1 c0zh1 = C0ZH1.STORY;
            C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            C0S2R c0s2r = C0S2R.PRIVATE;
            if (aweme != null && (aid = aweme.getAid()) != null) {
                str5 = aid;
            }
            if (fragment != null) {
                numValueOf = Integer.valueOf(fragment.hashCode());
            }
            quickMessageService.LIZ(fragmentManager, new C456970Hvz(c457000Hw2, strLJ, "private", str3, enumC456980Hw0, z5, aid2, enumC2172611A1bLIZ, enumC913000Zrm, c0zh1, c0s2u, enumC913010Zrn, c0s2r, str5, numValueOf, 32832), c0i08, new C0ZGU(user, str, c19eg, z, this, aweme, str4, quickDMEventParam, map, str2, function0, c19600211mK));
        }
    }
}
