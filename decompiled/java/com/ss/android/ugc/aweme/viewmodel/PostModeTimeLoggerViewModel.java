package com.ss.android.ugc.aweme.viewmodel;

import X.C0SQK;
import X.C0SQX;
import X.C1205210hT5;
import X.C1348720lCY;
import X.C1366720lfa;
import X.C1386180mAy;
import X.C15WT;
import X.C1893310zMv;
import X.C1ER1;
import X.C20703515zt;
import X.C2179771ASp;
import X.C2188811AlT;
import X.C696350RTd;
import X.C721260SQy;
import X.C721270SQz;
import X.EnumC721170SQp;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeTimeLoggerViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C0SQX LL = new C0SQX();
    public PhotoModeIngressEtData LLILLJJLI;
    public long LLILLL;
    public AwS555S0100000_11 LLILZ;

    public final long vQ2() {
        PhotoModeIngressEtData photoModeIngressEtData = this.LLILLJJLI;
        if (photoModeIngressEtData == null) {
            return 0L;
        }
        long j = photoModeIngressEtData.postModeDuration;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = this.LL.LIZ;
        return j + (jCurrentTimeMillis - (l != null ? l.longValue() : 0L));
    }

    public final void yQ2() {
        C0SQX c0sqx = this.LL;
        if (c0sqx.LIZJ == null) {
            c0sqx.LIZJ = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void xQ2(Aweme aweme, PostModeDetailParams postModeDetailParams) {
        long j;
        Long lValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String aid;
        String str7;
        Long l;
        String str8;
        String str9;
        String str10;
        PhotoModeIngressEtData photoModeIngressEtData;
        String str11;
        PhotoModeIngressEtData photoModeIngressEtData2;
        PhotoModeIngressEtData photoModeIngressEtData3;
        C0SQX c0sqx = this.LL;
        Long l2 = c0sqx.LIZJ;
        if (l2 != null) {
            c0sqx.LIZIZ += System.currentTimeMillis() - l2.longValue();
        }
        String str12 = null;
        c0sqx.LIZJ = null;
        if (postModeDetailParams != null && (photoModeIngressEtData3 = postModeDetailParams.photoModeIngressEtData) != null) {
            j = photoModeIngressEtData3.videoPlayTimeAccumulated;
        } else {
            j = 0;
        }
        long j2 = j + c0sqx.LIZIZ;
        if (j2 != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("duration ");
            sbLIZ.append(j2);
            sbLIZ.append(" | accuPlay ");
            sbLIZ.append(c0sqx.LIZIZ);
            sbLIZ.append(" | accTotal ");
            if (postModeDetailParams != null && (photoModeIngressEtData2 = postModeDetailParams.photoModeIngressEtData) != null) {
                lValueOf = Long.valueOf(photoModeIngressEtData2.videoPlayTimeAccumulated);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            C721260SQy.LIZ.getClass();
            C1386180mAy c1386180mAy = new C1386180mAy();
            String str13 = "";
            if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
                str = "";
            }
            c1386180mAy.LIZLLL = str;
            if (postModeDetailParams != null && (str11 = postModeDetailParams.enterMethod) != null) {
                str13 = str11;
            }
            c1386180mAy.LJJLIL = str13;
            c1386180mAy.LJLJJL = 1;
            c1386180mAy.LJIJI(aweme);
            c1386180mAy.LJJLIIIJL = j2;
            c1386180mAy.LLF = C20703515zt.LJIIZILJ(aweme) ? 1 : 0;
            c1386180mAy.LLD = C20703515zt.LJIJJLI(aweme);
            if (postModeDetailParams != null) {
                str2 = postModeDetailParams.eventType;
                str3 = postModeDetailParams.exploreFromGroupId;
            } else {
                str2 = null;
                str3 = null;
            }
            C1366720lfa.LIZIZ(aweme, c1386180mAy, str2, str3);
            c1386180mAy.LJ("from_page", "graphic_detail");
            C1ER1 c1er1 = C1ER1.LIZIZ;
            if (postModeDetailParams != null) {
                str4 = postModeDetailParams.eventType;
            } else {
                str4 = null;
            }
            c1386180mAy.LIZIZ(c1er1.I(aweme, str4));
            C15WT c15wt = C15WT.LIZIZ;
            if (postModeDetailParams != null) {
                str5 = postModeDetailParams.eventType;
                str6 = postModeDetailParams.exploreFromGroupId;
            } else {
                str5 = null;
                str6 = null;
            }
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c15wt.LJIJJLI(c1386180mAy, str5, str6, aid);
            if (postModeDetailParams != null) {
                str7 = postModeDetailParams.eventType;
                l = postModeDetailParams.exploreTabId;
                str8 = postModeDetailParams.exploreTabName;
                str9 = postModeDetailParams.fromExplorePage;
            } else {
                str7 = null;
                l = null;
                str8 = null;
                str9 = null;
            }
            c15wt.LJJIIJ(c1386180mAy, str7, l, str8, str9);
            C1348720lCY.LIZ(aweme, c1386180mAy);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str14 = c1386180mAy.LIZ;
            if (postModeDetailParams != null) {
                str10 = postModeDetailParams.btmPageId;
            } else {
                str10 = null;
            }
            C1893310zMv.LIZIZ.LJII(PageFinder.via(str10), str14, linkedHashMap, null);
            if (postModeDetailParams != null) {
                str12 = postModeDetailParams.eventType;
            }
            C1205210hT5.LIZ(aweme, linkedHashMap, str12, c1386180mAy.LIZ);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c1386180mAy.LJ((String) entry.getKey(), (String) entry.getValue());
            }
            c1386180mAy.LJIILJJIL();
            if (postModeDetailParams != null && (photoModeIngressEtData = postModeDetailParams.photoModeIngressEtData) != null) {
                photoModeIngressEtData.videoPlayTimeAccumulated = 0L;
            }
            c0sqx.LIZIZ = 0L;
        }
    }

    public final void wQ2(Aweme aweme, EnumC721170SQp enumC721170SQp, boolean z, HashMap<String, String> map) {
        long j;
        long jCurrentTimeMillis;
        long jVQ2 = vQ2();
        PhotoModeIngressEtData photoModeIngressEtData = this.LLILLJJLI;
        if (photoModeIngressEtData != null) {
            j = photoModeIngressEtData.photoModeDuration;
        } else {
            j = 0;
        }
        this.LLILLL += jVQ2 + j;
        AwS555S0100000_11 awS555S0100000_11 = this.LLILZ;
        if (awS555S0100000_11 != null) {
            awS555S0100000_11.invoke();
        }
        C696350RTd c696350RTd = C721270SQz.LLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markPauseBegin photoTotalPlayTime: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", postStayTime:");
        sbLIZ.append(jVQ2);
        sbLIZ.append(", feedStayTime: ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        c696350RTd.getClass();
        PhotoModeIngressEtData photoModeIngressEtData2 = this.LLILLJJLI;
        if ((z || enumC721170SQp == null || enumC721170SQp == EnumC721170SQp.VIEW_PAGER_PAGE_CHANGE) && aweme != null && photoModeIngressEtData2 != null) {
            Long l = this.LL.LIZ;
            if (l != null) {
                jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            } else {
                jCurrentTimeMillis = 0;
            }
            String str = photoModeIngressEtData2.exploreFromGroupId;
            if (str == null) {
                str = "";
            }
            map.put("explore_innerfeed_entrance_group_id", str);
            C0SQK.LIZ(C0SQK.LIZ, aweme, photoModeIngressEtData2.photoModeDuration, photoModeIngressEtData2.postModeDuration + jCurrentTimeMillis, photoModeIngressEtData2.paramsEventType, photoModeIngressEtData2.startVolumeValue, C2179771ASp.LJIIIIZZ(), "graphic_detail", map, null, 512);
        }
        PhotoModeIngressEtData photoModeIngressEtData3 = this.LLILLJJLI;
        if (photoModeIngressEtData3 != null) {
            photoModeIngressEtData3.postModeDuration = 0L;
            photoModeIngressEtData3.photoModeDuration = 0L;
        }
    }
}
