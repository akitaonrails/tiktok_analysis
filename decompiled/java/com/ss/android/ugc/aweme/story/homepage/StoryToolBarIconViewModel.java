package com.ss.android.ugc.aweme.story.homepage;

import X.C01GW;
import X.C061U;
import X.C0LAB;
import X.C11JF;
import X.C1559260qg8;
import X.C1584320rKY;
import X.C1595530rcd;
import X.C1595550rcf;
import X.C20684815ws;
import X.C2097608Jq;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723600SZy;
import X.EnumC1595490rcZ;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS6S0020000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryToolBarIconViewModel extends AssemViewModel<C1595530rcd> {
    public static final /* synthetic */ int LLJI = 0;
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1177));
    public final HashMap<String, Boolean> LLILLJJLI;
    public final HashMap<String, Boolean> LLILLL;
    public final C01GW LLILZ;
    public final C1559260qg8 LLILZIL;
    public final C630740Ooa LLILZLL;
    public final C01GW LLIZ;
    public C11JF LLIZLLLIL;
    public boolean LLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1595530rcd(wQ2() == 1 ? "FRIENDS_FEED" : "For You", 4093);
    }

    public final int wQ2() {
        return ((Number) this.LLILZLL.getValue()).intValue();
    }

    public final boolean xQ2() {
        return ((Boolean) this.LL.getValue()).booleanValue();
    }

    public StoryToolBarIconViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LLILLJJLI = C2097608Jq.LJI(new Pair("For You", bool), new Pair("FRIENDS_FEED", bool), new Pair("Following", bool));
        this.LLILLL = C2097608Jq.LJI(new Pair("For You", bool), new Pair("FRIENDS_FEED", bool), new Pair("Following", bool));
        this.LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1176));
        this.LLILZIL = new C1559260qg8(new C723600SZy(this, C061U.class, "story_tool_bar_hierarchy_data_key"), true);
        this.LLILZLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 1178));
        this.LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(355));
    }

    public final EnterStoryParam vQ2() {
        String strLJI;
        C1595530rcd state = getState();
        if (wQ2() == 1) {
            strLJI = "homepage_friends";
        } else {
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            String str = state.LLILLJJLI;
            c1584320rKY.getClass();
            strLJI = C1584320rKY.LJI(str);
        }
        return new EnterStoryParam(null, "story_fixed_icon", strLJI, null, null, null, null, null, new ShootExtraData(strLJI, null, null, null, "story_fixed_icon", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, true, 0, 0.0f, 22, null, null, null, null, null, null, false, null, false, null, null, 67090169, null);
    }

    public final void Hk1(String str, String str2) {
        int i;
        String str3;
        String str4;
        Integer numValueOf;
        Integer numValueOf2;
        List<User> list;
        User next;
        int size;
        int size2;
        C1595530rcd state = getState();
        C0LAB c0lab = new C0LAB();
        if (state.LLILZLL == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "icon_type_camera");
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        String str5 = state.LLILLJJLI;
        c1584320rKY.getClass();
        c0lab.LJ("enter_from", C1584320rKY.LJI(str5));
        c0lab.LJ("enter_method", str);
        c0lab.LJ("enter_content", str2);
        if (state.LLIZ == 0) {
            C1595550rcf c1595550rcf = state.LLJ;
            if (c1595550rcf != null) {
                List<String> list2 = c1595550rcf.LJ.get(EnumC1595490rcZ.STORY.getType());
                if (list2 != null) {
                    size2 = list2.size();
                } else {
                    size2 = 0;
                }
                numValueOf = Integer.valueOf(size2);
            } else {
                numValueOf = null;
            }
            c0lab.LIZLLL(numValueOf, "icon_type_story");
            C1595550rcf c1595550rcf2 = state.LLJ;
            if (c1595550rcf2 != null) {
                List<String> list3 = c1595550rcf2.LJ.get(EnumC1595490rcZ.LIVE.getType());
                if (list3 != null) {
                    size = list3.size();
                } else {
                    size = 0;
                }
                numValueOf2 = Integer.valueOf(size);
            } else {
                numValueOf2 = null;
            }
            c0lab.LIZLLL(numValueOf2, "icon_type_live");
            C1595550rcf c1595550rcf3 = state.LLJ;
            if (c1595550rcf3 != null && (list = c1595550rcf3.LIZLLL) != null) {
                Iterator<User> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.roomId > 0) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                User user = next;
                if (user != null) {
                    c0lab.LIZIZ(user.roomId, "room_id");
                }
            }
        } else {
            c0lab.LIZ(0, "icon_type_story");
            c0lab.LIZ(0, "icon_type_live");
        }
        if (Intrinsics.LJFF(str2, "story") || Intrinsics.LJFF(str2, "live")) {
            C1595550rcf c1595550rcf4 = state.LLJ;
            if (c1595550rcf4 != null && (str4 = c1595550rcf4.LJFF) != null && str4.length() > 0) {
                c0lab.LJ("author_id", str4);
            }
            C1595550rcf c1595550rcf5 = state.LLJ;
            if (c1595550rcf5 != null && (str3 = c1595550rcf5.LJI) != null && str3.length() > 0) {
                c0lab.LJ("group_id", str3);
            }
        }
        C20684815ws.LJIILLIIL("story_fixed_icon_enter", c0lab.LIZ);
    }

    public final void yQ2(boolean z, boolean z2) {
        setState(new AwS6S0020000_24(z, z2, 1));
    }
}
