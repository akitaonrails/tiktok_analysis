package com.ss.android.ugc.aweme.multi.maker;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C13EA;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C729510SjV;
import X.C735370Ssx;
import X.EnumC1050190dR3;
import X.EnumC1430380nKG;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes17.dex */
public final class MinisAnchorMaker extends CommonAnchorMaker {
    public volatile String LLJILLL;

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new MinisAnchorMaker();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.MINIS_ANCHOR.getTYPE();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[PHI: r4
      0x004c: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:15:0x004a, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1400390mXt LJIILL() {
        /*
            r21 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "anchorMobConfiguration, schema:"
            r1.append(r0)
            r3 = r21
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r3.LLIZ
            r14 = 0
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r0.getSchema()
        L14:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r3.LLIZ
            java.lang.Class<com.ss.android.ugc.aweme.minis.api.IMinisApiService> r9 = com.ss.android.ugc.aweme.minis.api.IMinisApiService.class
            r10 = 0
            r16 = 0
            r13 = 14
            r8 = 0
            r11 = r10
            r12 = r10
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.minis.api.IMinisApiService r2 = (com.ss.android.ugc.aweme.minis.api.IMinisApiService) r2
            if (r2 == 0) goto Lbc
            if (r0 == 0) goto Lb9
            java.lang.String r0 = r0.getSchema()
        L39:
            kotlin.Pair r0 = r2.LJJIIZ(r0)
        L3d:
            java.lang.String r5 = ""
            if (r0 == 0) goto L49
            java.lang.Object r4 = r0.getFirst()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L4c
        L49:
            r4 = r5
            if (r0 == 0) goto L55
        L4c:
            java.lang.Object r0 = r0.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L55
            r5 = r0
        L55:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "addMinisCommonParams, minisId:"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", minisType:"
            r2.append(r0)
            r2.append(r5)
            X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "minis_id"
            r1.LJFF(r0, r4)
            java.lang.String r0 = "minis_type"
            r1.LJFF(r0, r5)
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r3.LLIZ
            if (r0 == 0) goto L9b
            java.lang.String r2 = r0.getSchema()
            if (r2 == 0) goto L9b
            java.lang.Class<com.ss.android.ugc.aweme.minis.api.IMinisApiService> r15 = com.ss.android.ugc.aweme.minis.api.IMinisApiService.class
            r17 = r16
            r18 = r16
            r19 = r13
            r20 = r14
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r15, r16, r17, r18, r19, r20)
            com.ss.android.ugc.aweme.minis.api.IMinisApiService r0 = (com.ss.android.ugc.aweme.minis.api.IMinisApiService) r0
            if (r0 == 0) goto L98
            java.util.Map r14 = r0.LJJII(r2)
        L98:
            r1.LJII(r14)
        L9b:
            X.0mXt r4 = new X.0mXt
            kotlin.jvm.internal.AwS560S0100000_16 r5 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 373(0x175, float:5.23E-43)
            r5.<init>(r1, r0)
            kotlin.jvm.internal.AwS417S0200000_16 r6 = new kotlin.jvm.internal.AwS417S0200000_16
            r0 = 27
            r6.<init>(r1, r3, r0)
            kotlin.jvm.internal.AwS560S0100000_16 r7 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 374(0x176, float:5.24E-43)
            r7.<init>(r1, r0)
            r10 = 24
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        Lb9:
            r0 = r14
            goto L39
        Lbc:
            r0 = r14
            goto L3d
        Lbe:
            r0 = r14
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.MinisAnchorMaker.LJIILL():X.0mXt");
    }

    public static String LJJIL(String str) {
        C13EA groups;
        MatchGroup matchGroupLJ;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("minis/([a-zA-Z0-9]+)/prod"), str, 0, 2, null);
        if (matchResultFind$default == null || (groups = matchResultFind$default.getGroups()) == null || (matchGroupLJ = groups.LJ(1)) == null) {
            return null;
        }
        return matchGroupLJ.LIZ;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        String strLJJIL;
        String str;
        Pair<String, String> pairLJJIIZ;
        String second;
        String strLJIIIIZZ;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String str2 = "";
        if (curUserId == null) {
            curUserId = "";
        }
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
            strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
        }
        String string = UUID.randomUUID().toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        sbLIZ.append('_');
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJILLL = strLIZIZ;
        c2344009Gk.LJFF("click_id", strLIZIZ);
        LJJIIJ(c2344009Gk);
        String schema = null;
        IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        Map<String, String> mapLJJII = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Iterator<AnchorCommonStruct> it2 = interfaceC1392640mLO.LJJLIIIJJIZ().getAnchors().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it2.next();
            if (next.getType() == type()) {
                String schema2 = next.getSchema();
                if (schema2 == null || schema2.length() == 0) {
                    break;
                }
                if (iMinisApiService != null && (strLJIIIIZZ = iMinisApiService.LJIIIIZZ(schema2, strLIZIZ)) != null) {
                    next.setSchema(strLJIIIIZZ);
                }
                strLJJIL = LJJIL(String.valueOf(next.getSchema()));
            }
        }
        strLJJIL = "";
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            schema = anchorCommonStruct.getSchema();
        }
        if (C729510SjV.LJJIJIL(LJIIZILJ())) {
            str = "story";
        } else {
            str = "anchor";
        }
        IMinisApiService iMinisApiService2 = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
        if (iMinisApiService2 != null && (pairLJJIIZ = iMinisApiService2.LJJIIZ(schema)) != null && (second = pairLJJIIZ.getSecond()) != null) {
            str2 = second;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("logMinisEntranceClick, clientKey:");
        sbLIZ2.append(strLJJIL);
        sbLIZ2.append(", minisType:");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJFF("enter_method", str);
        c2344009Gk2.LJFF("click_id", strLIZIZ);
        if (strLJJIL != null) {
            c2344009Gk2.LJFF("client_key", strLJJIL);
            c2344009Gk2.LJFF("minis_type", str2);
            if (schema != null) {
                IMinisApiService iMinisApiService3 = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                if (iMinisApiService3 != null) {
                    mapLJJII = iMinisApiService3.LJJII(schema);
                }
                c2344009Gk2.LJII(mapLJJII);
            }
        }
        C20684815ws.LJIILLIIL("minis_entrance_click", c2344009Gk2.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String str;
        String strLJJIL;
        String schema;
        String str2;
        String second;
        Map<String, String> mapLJJII;
        Pair<String, String> pairLJJIIZ;
        this.LLJI = true;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Iterator<AnchorCommonStruct> it2 = interfaceC1392640mLO.LJJLIIIJJIZ().getAnchors().iterator();
        while (true) {
            str = "";
            if (!it2.hasNext()) {
                strLJJIL = "";
                break;
            }
            AnchorCommonStruct next = it2.next();
            if (next.getType() == type()) {
                strLJJIL = LJJIL(String.valueOf(next.getSchema()));
                break;
            }
        }
        LJJIJL();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            schema = anchorCommonStruct.getSchema();
        } else {
            schema = null;
        }
        if (C729510SjV.LJJIJIL(LJIIZILJ())) {
            str2 = "story";
        } else {
            str2 = "anchor";
        }
        IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
        if (iMinisApiService == null || (pairLJJIIZ = iMinisApiService.LJJIIZ(schema)) == null || (second = pairLJJIIZ.getSecond()) == null) {
            second = "";
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logMinisEntranceShow, clientKey:");
        sbLIZ.append(strLJJIL);
        sbLIZ.append(", minisType:");
        sbLIZ.append(second);
        C2188811AlT.LIZIZ(sbLIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJFF("enter_method", str2);
        if (strLJJIL != null) {
            c2344009Gk2.LJFF("client_key", strLJJIL);
            c2344009Gk2.LJFF("minis_type", second);
            if (schema != null) {
                IMinisApiService iMinisApiService2 = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                if (iMinisApiService2 != null) {
                    mapLJJII = iMinisApiService2.LJJII(schema);
                } else {
                    mapLJJII = null;
                }
                c2344009Gk2.LJII(mapLJJII);
            }
        }
        C20684815ws.LJIILLIIL("minis_entrance_show", c2344009Gk2.LIZ);
        if (LJIL()) {
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            String strCf = interfaceC1392640mLO3.Cf();
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
            if (interfaceC1392640mLO4 != null) {
                interfaceC1392640mLO2 = interfaceC1392640mLO4;
            }
            Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
            C2344009Gk c2344009GkLJJ = LJJ();
            c2344009GkLJJ.LJIIIIZZ("enter_from", strCf);
            String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
            if (authorUid == null) {
                authorUid = "";
            }
            c2344009GkLJJ.LJIIIIZZ("author_id", authorUid);
            c2344009GkLJJ.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ));
            String aid = awemeLJJLIIIJJIZ.getAid();
            if (aid != null) {
                str = aid;
            }
            c2344009GkLJJ.LJIIIIZZ("group_id", str);
            C20684815ws.LJIILLIIL("anchor_entrance_show", c2344009GkLJJ.LIZ);
        }
    }
}
