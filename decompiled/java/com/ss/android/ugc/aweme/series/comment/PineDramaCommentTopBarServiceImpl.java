package com.ss.android.ugc.aweme.series.comment;

import X.C08F8;
import X.C08F9;
import X.C1227904rF;
import X.C1351600lHC;
import X.C1351610lHD;
import X.C1351740lHQ;
import X.C13LP;
import X.C19EG;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.EnumC1350510lFR;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.services.ICommentTopBarAbilityService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class PineDramaCommentTopBarServiceImpl implements ICommentTopBarImplementService {
    public final C1351610lHD LIZ = new C1351610lHD();

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean addGlobalEventListener(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final View createCustomizeTopBarView(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Integer getCustomizeTopBarViewLayout(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Drawable mapLocalIconDrawable(Context context, Integer num, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean needSetTextOnClickPressState(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean onComponentLongClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentTouchEvent(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource, MotionEvent motionEvent) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final List<Integer> getBizTypes() {
        return Collections.singletonList(Integer.valueOf(EnumC1350510lFR.DRAMA.getValue()));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendClickEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        C1351740lHQ.LIZ.getClass();
        return C1351740lHQ.LIZ(c19eg, commentTopBarComponent, aweme, commentContextSource);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendSchemaParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String aid;
        C1351740lHQ.LIZ.getClass();
        C1351600lHC c1351600lHCLIZJ = C1351740lHQ.LIZJ(commentTopBarComponent, aweme, commentContextSource);
        HashMap map = new HashMap();
        JSONObject jSONObjectLJ = C1351740lHQ.LJ(commentTopBarComponent.extra);
        if (jSONObjectLJ != null) {
            Iterator<String> itKeys = jSONObjectLJ.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObjectLJ.opt(next);
                if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                    map.put(next, objOpt.toString());
                }
            }
        }
        map.put("source_group_id", c1351600lHCLIZJ.LIZ);
        map.put("series_enter_entrance", c1351600lHCLIZJ.LIZIZ);
        map.put("enter_from", c1351600lHCLIZJ.LIZJ);
        map.put("outreach_content", c1351600lHCLIZJ.LIZLLL);
        HashMap<String, String> map2 = new HashMap<>(map);
        C1227904rF.LIZ.getClass();
        map2.put("log_extra", C1227904rF.LJI(map));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama buildSchemaParams aid=");
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        sbLIZ.append(", schemaParams=");
        sbLIZ.append(map);
        sbLIZ.append(", params=");
        sbLIZ.append(map2);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PineDrama appendSchemaParams aid=");
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        sbLIZ2.append(", bizId=");
        sbLIZ2.append(commentTopBarComponent.bizId);
        sbLIZ2.append(", params=");
        sbLIZ2.append(map2);
        C2188811AlT.LIZIZ(sbLIZ2);
        return map2;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendShowEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        C1351740lHQ.LIZ.getClass();
        return C1351740lHQ.LIZLLL(c19eg, commentTopBarComponent, aweme, commentContextSource);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean canShow(X.C19EG r17, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent r18, com.ss.android.ugc.aweme.feed.model.Aweme r19, java.lang.String r20, X.C2189821An6 r21) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.comment.PineDramaCommentTopBarServiceImpl.canShow(X.19EG, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.1An6):boolean");
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String aid;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama onBindComponentView aid=");
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizType=");
        sbLIZ.append(commentTopBarComponent.bizType);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", title=");
        CommentTopBarText commentTopBarText = commentTopBarComponent.title;
        if (commentTopBarText != null) {
            str = commentTopBarText.content;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (fragment == null) {
            return;
        }
        Integer num = commentTopBarComponent.bizType;
        String str2 = commentTopBarComponent.bizId;
        if (num != null && str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PineDrama onBindComponentView tryUpdateVisibility, aid=");
            if (aweme != null) {
                aid2 = aweme.getAid();
            }
            sbLIZ2.append(aid2);
            sbLIZ2.append(", bizType=");
            sbLIZ2.append(num);
            sbLIZ2.append(", bizId=");
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
            ICommentTopBarAbilityService iCommentTopBarAbilityService = (ICommentTopBarAbilityService) PluggableExtentionKt.pluggableSpi$default(ICommentTopBarAbilityService.class, false, false, false, 14, null);
            if (iCommentTopBarAbilityService != null) {
                iCommentTopBarAbilityService.LIZIZ(num.intValue(), fragment, str2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean onComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) throws JSONException {
        String aid;
        String aid2;
        String aid3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama onComponentClick aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        if (aweme != null) {
            aid2 = aweme.getAid();
        } else {
            aid2 = null;
        }
        sbLIZ2.append(aid2);
        sbLIZ2.append('_');
        sbLIZ2.append(commentTopBarComponent.bizType);
        sbLIZ2.append('_');
        sbLIZ2.append(commentTopBarComponent.bizId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C1351610lHD c1351610lHD = this.LIZ;
        c1351610lHD.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Intrinsics.LJFF(strLIZIZ, c1351610lHD.LIZJ) && jElapsedRealtime - c1351610lHD.LIZIZ < c1351610lHD.LIZ) {
            return true;
        }
        c1351610lHD.LIZIZ = jElapsedRealtime;
        c1351610lHD.LIZJ = strLIZIZ;
        C1351740lHQ.LIZ.getClass();
        HashMap mapLIZ = C1351740lHQ.LIZ(c19eg, commentTopBarComponent, aweme, commentContextSource);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("PineDrama reportGuideUserM2Click aid=");
        if (aweme != null) {
            aid3 = aweme.getAid();
        } else {
            aid3 = null;
        }
        sbLIZ3.append(aid3);
        sbLIZ3.append(", bizId=");
        sbLIZ3.append(commentTopBarComponent.bizId);
        sbLIZ3.append(", name=");
        sbLIZ3.append(commentTopBarComponent.name);
        sbLIZ3.append(", params=");
        sbLIZ3.append(mapLIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (Map.Entry entry : mapLIZ.entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
        }
        C20684815ws.LJIILLIIL("guide_user_m2_click", c2344009Gk.LIZ);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama onComponentHide aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) throws JSONException {
        String aid;
        String aid2;
        Long lLJIILIIL;
        ArrayList arrayList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama onComponentShow aid=");
        String aid3 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        C2188811AlT.LIZIZ(sbLIZ);
        C1351740lHQ.LIZ.getClass();
        HashMap mapLIZLLL = C1351740lHQ.LIZLLL(c19eg, commentTopBarComponent, aweme, commentContextSource);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PineDrama reportGuideUserM2Show aid=");
        if (aweme != null) {
            aid3 = aweme.getAid();
        }
        sbLIZ2.append(aid3);
        sbLIZ2.append(", bizId=");
        sbLIZ2.append(commentTopBarComponent.bizId);
        sbLIZ2.append(", name=");
        sbLIZ2.append(commentTopBarComponent.name);
        sbLIZ2.append(", params=");
        sbLIZ2.append(mapLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (Map.Entry entry : mapLIZLLL.entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
        }
        C20684815ws.LJIILLIIL("guide_user_m2_show", c2344009Gk.LIZ);
        if (aweme != null && (aid2 = aweme.getAid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(aid2)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string = ((Keva) C08F8.LIZ.getValue()).getString("exposed_aids", "");
            if (a0.LJJJIL(string)) {
                arrayList = new ArrayList();
            } else {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    C08F9 c08f9LIZIZ = C08F8.LIZIZ((String) it2.next());
                    if (c08f9LIZIZ != null) {
                        arrayList2.add(c08f9LIZIZ);
                    }
                }
                arrayList = new ArrayList(arrayList2);
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((C08F9) it3.next()).LIZ == jLongValue) {
                        return;
                    }
                }
            }
            arrayList.add(new C08F9(jLongValue, jCurrentTimeMillis));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(24L);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C08F9) obj).LIZIZ >= jCurrentTimeMillis2) {
                    arrayList3.add(obj);
                }
            }
            ((Keva) C08F8.LIZ.getValue()).storeString("exposed_aids", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(144), 30));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onPause(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama onPause aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onResumeShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama onResumeShow aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onUnBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama onUnBindComponentView aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
