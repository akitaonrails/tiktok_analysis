package com.ss.android.ugc.aweme.im.utils;

import X.C04TD;
import X.C0Y8T;
import X.C0YNP;
import X.C1240410iNr;
import X.C13DA;
import X.C1D0F;
import X.C20684815ws;
import X.C2344009Gk;
import X.C461720I8s;
import X.C830490Whz;
import X.C879390Yef;
import X.EnumC1240610iOB;
import X.EnumC1240620iOC;
import X.EnumC1240630iOD;
import X.EnumC1240670iOH;
import X.EnumC1240680iOI;
import X.InterfaceC1493105sv;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class IMSearchAnalyticsUtilsImpl implements IIMSearchAnalyticsUtils {
    public static IIMSearchAnalyticsUtils LJI() {
        Object objLIZ = C04TD.LIZ(IIMSearchAnalyticsUtils.class, false);
        if (objLIZ != null) {
            return (IIMSearchAnalyticsUtils) objLIZ;
        }
        if (C04TD.m1 == null) {
            synchronized (IIMSearchAnalyticsUtils.class) {
                if (C04TD.m1 == null) {
                    C04TD.m1 = new IMSearchAnalyticsUtilsImpl();
                }
            }
        }
        return C04TD.m1;
    }

    public static String LJII(C0Y8T c0y8t) {
        if (c0y8t != null) {
            if (C879390Yef.LIZJ(c0y8t)) {
                return EnumC1240670iOH.TYPE_TCM.getValue();
            }
            if (c0y8t.isGroupChat()) {
                return EnumC1240670iOH.TYPE_GROUP.getValue();
            }
            if (c0y8t.isStranger()) {
                return EnumC1240670iOH.STRANGER.getValue();
            }
        }
        return EnumC1240670iOH.TYPE_PRIVATE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final Map<String, String> LIZJ(EnumC1240630iOD enumC1240630iOD, Map<String, String> map) {
        C13DA c13da = new C13DA();
        if (map != null) {
            c13da.putAll(map);
        }
        c13da.put("action", enumC1240630iOD.getValue());
        return c13da.build();
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final void LIZIZ(EnumC1240630iOD enumC1240630iOD, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        C13DA c13da = new C13DA();
        if (map != null) {
            c13da.putAll(map);
        }
        c13da.put("action", enumC1240630iOD.getValue());
        c13da.put("enter_from", "dm_search_page");
        interfaceC1493105sv.sendEvent("click_dm_search_cell_folded", c13da.build());
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final Map<String, String> LJ(EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC, C0Y8T c0y8t, int i, int i2, boolean z) {
        String conversationId;
        C13DA c13da = new C13DA();
        c13da.put("cell_type", enumC1240610iOB.getValue());
        c13da.put("tab_name", enumC1240620iOC.getValue());
        EnumC1240680iOI enumC1240680iOI = EnumC1240680iOI.RESULT;
        c13da.put("position", enumC1240680iOI.getValue());
        if (c0y8t == null || (conversationId = c0y8t.getConversationId()) == null) {
            conversationId = "";
        }
        c13da.put("conversation_id", conversationId);
        c13da.put("rank_num", String.valueOf(i));
        c13da.put("chat_type", LJII(c0y8t));
        if (!z) {
            c13da.put("item_num", String.valueOf(i2));
        }
        c13da.put("position", enumC1240680iOI.getValue());
        return c13da.build();
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "inbox");
        c2344009Gk.LJIIIIZZ("search_keyword", str3);
        c2344009Gk.LIZJ(i, "rank");
        c2344009Gk.LIZJ(i2, "relation");
        c2344009Gk.LIZJ(i3, "follow_status");
        c2344009Gk.LIZJ(i4, "follower_status");
        c2344009Gk.LJIIIIZZ("search_source", str4);
        C20684815ws.LJIILLIIL("social_search_result_select", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final Map<String, String> LIZLLL(EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC, IMUser iMUser, C0Y8T c0y8t, int i, int i2, boolean z, Integer num) {
        String uid;
        String conversationId;
        int iIntValue;
        String str;
        String recType;
        C13DA c13da = new C13DA();
        c13da.put("cell_type", enumC1240610iOB.getValue());
        c13da.put("tab_name", enumC1240620iOC.getValue());
        EnumC1240680iOI enumC1240680iOI = EnumC1240680iOI.RESULT;
        c13da.put("position", enumC1240680iOI.getValue());
        String strLJ = "";
        if (iMUser == null || (uid = iMUser.getUid()) == null) {
            uid = "";
        }
        c13da.put("to_user_id", uid);
        if (iMUser != null) {
            strLJ = C0YNP.LJ(iMUser.getUid());
        } else if (c0y8t != null && (conversationId = c0y8t.getConversationId()) != null) {
            strLJ = conversationId;
        }
        c13da.put("conversation_id", strLJ);
        c13da.put("rank_num", String.valueOf(i));
        C1240410iNr c1240410iNr = C1240410iNr.LIZ;
        Integer numValueOf = null;
        if (iMUser != null) {
            numValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        c1240410iNr.getClass();
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        c13da.put("relation_tag", String.valueOf(iIntValue));
        if (iMUser != null && (recType = iMUser.getRecType()) != null) {
            c13da.put("rec_type", recType);
        }
        c13da.put("chat_type", LJII(c0y8t));
        if (!z) {
            c13da.put("item_num", String.valueOf(i2));
        }
        if (num != null) {
            num.intValue();
            if (num.intValue() == 5) {
                str = "alias_name";
            } else if (num.intValue() == 0) {
                str = "nick_name";
            }
            c13da.put("search_content_type", str);
        }
        c13da.put("position", enumC1240680iOI.getValue());
        return c13da.build();
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final void LJFF(String str, String str2, String str3, String str4, Boolean bool, String str5, int i, InterfaceC1493105sv interfaceC1493105sv) {
        String str6;
        boolean z;
        if (str == null) {
            return;
        }
        C830490Whz c830490Whz = new C830490Whz();
        if (C461720I8s.LJI(str)) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_self", str6);
        c830490Whz.put("to_user_id", str);
        c830490Whz.put("enter_from", "dm_search_page");
        c830490Whz.put("enter_method", "click_dm_search_cell");
        c830490Whz.put("profile_entrance_id", String.valueOf(System.currentTimeMillis()));
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && str2 != null) {
            c830490Whz.put("inbox_search_position", str2);
        }
        if (str3 != null && str3.length() != 0) {
            c830490Whz.put("inbox_search_cell_type", str3);
        }
        if (str4 != null && str4.length() != 0) {
            c830490Whz.put("inbox_search_tab_name", str4);
        }
        C1D0F c1d0f = C1D0F.LIZ;
        c830490Whz.put(c1d0f.LIZ(), String.valueOf(bool));
        c830490Whz.put(c1d0f.LIZIZ(), str5);
        interfaceC1493105sv.sendEvent("enter_personal_detail", c830490Whz);
    }
}
