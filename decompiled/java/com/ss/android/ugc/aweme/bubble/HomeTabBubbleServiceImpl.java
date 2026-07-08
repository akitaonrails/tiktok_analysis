package com.ss.android.ugc.aweme.bubble;

import X.C0BTQ;
import X.C0J74;
import X.C0P0T;
import X.C1584320rKY;
import X.C1586120rNS;
import X.C1618950sEP;
import X.C1619160sEk;
import X.C1619360sF4;
import X.C178300mL;
import X.C1790550whB;
import X.C1906360zhy;
import X.C1906370zhz;
import X.C1906380zi0;
import X.C1906460zi8;
import X.C1906470zi9;
import X.C1906510ziD;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2421209eE;
import X.C295090BhT;
import X.C680080Qly;
import X.EnumC1584360rKc;
import X.EnumC1619300sEy;
import X.EnumC1905820zh6;
import X.EnumC1905830zh7;
import X.InterfaceC1619130sEh;
import X.InterfaceC1790610whH;
import X.InterfaceC1906540ziG;
import android.app.Activity;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class HomeTabBubbleServiceImpl implements IHomeTabBubbleService {
    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LIZJ(EnumC1584360rKc enumC1584360rKc) {
        C1906360zhy.LIZLLL(enumC1584360rKc);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final InterfaceC1619130sEh LJ(C1906460zi8 c1906460zi8) {
        String str;
        InterfaceC1619130sEh c1619160sEk;
        C1790550whB c1790550whB = C1906360zhy.LIZ;
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShow: ");
        sbLIZ.append(c1906460zi8);
        sbLIZ.append(", curr: ");
        C1906460zi8 c1906460zi8LIZ = C1906360zhy.LIZ();
        if (c1906460zi8LIZ != null) {
            str = c1906460zi8LIZ.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c1586120rNS.getClass();
        InterfaceC1790610whH interfaceC1790610whHLIZ = C1906360zhy.LIZIZ.LIZ(c1906460zi8);
        if (interfaceC1790610whHLIZ == null) {
            c1619160sEk = C0J74.LIZ;
        } else {
            c1619160sEk = new C1619160sEk(interfaceC1790610whHLIZ.LIZ());
        }
        if (!Intrinsics.LJFF(c1619160sEk, C0J74.LIZ)) {
            C1906360zhy.LIZIZ(c1906460zi8, C1906470zi9.LIZ(c1906460zi8), c1619160sEk, interfaceC1790610whHLIZ);
        }
        return c1619160sEk;
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LJIIIIZZ(C1906460zi8 c1906460zi8) {
        C1790550whB c1790550whB = C1906360zhy.LIZ;
        C1906360zhy.LJ(C1906470zi9.LIZ(c1906460zi8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LIZ(String str, EnumC1584360rKc enumC1584360rKc) {
        C1906370zhz c1906370zhz;
        Aweme aweme;
        C1790550whB c1790550whB = C1906360zhy.LIZ;
        C1906380zi0.LIZ.getClass();
        if (C0BTQ.LIZ() && C0BTQ.LIZ()) {
            if (C1906380zi0.LIZJ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mobBubbleShow, stayTimeRecorder is null, tooltipsKey:");
                sbLIZ.append(str);
                sbLIZ.append(", tabName:");
                sbLIZ.append(enumC1584360rKc);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            C19EG c19eg = null;
            switch (str.hashCode()) {
                case -1420838694:
                    if (str.equals("live_toplive_dnu")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("mobBubbleShow, info is null, key: ");
                    sbLIZ3.append(str);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    return;
                case -1381669120:
                    if (str.equals("live_toplive_following")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ22.append(str);
                    C2188811AlT.LIZIZ(sbLIZ22);
                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                    sbLIZ32.append("mobBubbleShow, info is null, key: ");
                    sbLIZ32.append(str);
                    C2188811AlT.LIZIZ(sbLIZ32);
                    return;
                case -1304269970:
                    if (str.equals("live_toplive")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, 10000L, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ222 = C2188811AlT.LIZ();
                    sbLIZ222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ222);
                    StringBuilder sbLIZ322 = C2188811AlT.LIZ();
                    sbLIZ322.append("mobBubbleShow, info is null, key: ");
                    sbLIZ322.append(str);
                    C2188811AlT.LIZIZ(sbLIZ322);
                    return;
                case -1216183355:
                    if (str.equals("live_toplive_golive")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ2222 = C2188811AlT.LIZ();
                    sbLIZ2222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ2222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2222);
                    StringBuilder sbLIZ3222 = C2188811AlT.LIZ();
                    sbLIZ3222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ3222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ3222);
                    return;
                case -539735352:
                    if (str.equals("search_coin")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, false, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ22222 = C2188811AlT.LIZ();
                    sbLIZ22222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ22222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ22222);
                    StringBuilder sbLIZ32222 = C2188811AlT.LIZ();
                    sbLIZ32222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ32222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ32222);
                    return;
                case 119577079:
                    if (str.equals("live_following_active_watch")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ222222 = C2188811AlT.LIZ();
                    sbLIZ222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ222222);
                    StringBuilder sbLIZ322222 = C2188811AlT.LIZ();
                    sbLIZ322222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ322222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ322222);
                    return;
                case 313173638:
                    if (str.equals("search_trending_words")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ2222222 = C2188811AlT.LIZ();
                    sbLIZ2222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ2222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2222222);
                    StringBuilder sbLIZ3222222 = C2188811AlT.LIZ();
                    sbLIZ3222222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ3222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ3222222);
                    return;
                case 525954545:
                    if (str.equals("shop_cart_bubbles")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, 3000L, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ22222222 = C2188811AlT.LIZ();
                    sbLIZ22222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ22222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ22222222);
                    StringBuilder sbLIZ32222222 = C2188811AlT.LIZ();
                    sbLIZ32222222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ32222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ32222222);
                    return;
                case 901794695:
                    if (str.equals("live_toplive_active_watch")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ222222222 = C2188811AlT.LIZ();
                    sbLIZ222222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ222222222);
                    StringBuilder sbLIZ322222222 = C2188811AlT.LIZ();
                    sbLIZ322222222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ322222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ322222222);
                    return;
                case 1012098814:
                    if (str.equals("live_following")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.SWITCH_TAB);
                        break;
                    }
                    StringBuilder sbLIZ2222222222 = C2188811AlT.LIZ();
                    sbLIZ2222222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ2222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2222222222);
                    StringBuilder sbLIZ3222222222 = C2188811AlT.LIZ();
                    sbLIZ3222222222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ3222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ3222222222);
                    return;
                case 1392894798:
                    if (str.equals("inbox_message")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.SWITCH_TAB);
                        break;
                    }
                    StringBuilder sbLIZ22222222222 = C2188811AlT.LIZ();
                    sbLIZ22222222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ22222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ22222222222);
                    StringBuilder sbLIZ32222222222 = C2188811AlT.LIZ();
                    sbLIZ32222222222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ32222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ32222222222);
                    return;
                case 1433078046:
                    if (str.equals("shop_bubbles")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, 3000L, EnumC1619300sEy.SWITCH_TAB);
                        break;
                    }
                    StringBuilder sbLIZ222222222222 = C2188811AlT.LIZ();
                    sbLIZ222222222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ222222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ222222222222);
                    StringBuilder sbLIZ322222222222 = C2188811AlT.LIZ();
                    sbLIZ322222222222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ322222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ322222222222);
                    return;
                case 2005023130:
                    if (str.equals("live_toplive_discover")) {
                        c1906370zhz = new C1906370zhz(str, enumC1584360rKc, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.JUMP_NEW_PAGE);
                        break;
                    }
                    StringBuilder sbLIZ2222222222222 = C2188811AlT.LIZ();
                    sbLIZ2222222222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ2222222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2222222222222);
                    StringBuilder sbLIZ3222222222222 = C2188811AlT.LIZ();
                    sbLIZ3222222222222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ3222222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ3222222222222);
                    return;
                default:
                    StringBuilder sbLIZ22222222222222 = C2188811AlT.LIZ();
                    sbLIZ22222222222222.append("createBubbleInfo null, tooltipsKey: ");
                    sbLIZ22222222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ22222222222222);
                    StringBuilder sbLIZ32222222222222 = C2188811AlT.LIZ();
                    sbLIZ32222222222222.append("mobBubbleShow, info is null, key: ");
                    sbLIZ32222222222222.append(str);
                    C2188811AlT.LIZIZ(sbLIZ32222222222222);
                    return;
            }
            Activity activityLIZ = C2421209eE.LIZ();
            if (activityLIZ instanceof C19EG) {
                c19eg = (C19EG) activityLIZ;
            }
            if (C1906380zi0.LJI() && c19eg != null && (aweme = C680080Qly.LIZIZ(c19eg).LLJILJILJ) != null) {
                c1906370zhz.LJIL = aweme.getGroupId();
                c1906370zhz.LJJ = AwemeExtKt.getAuthorUid(aweme);
            }
            C1584320rKY.LIZ.getClass();
            String str2 = C1584320rKY.LJII;
            if (str2 != null && c1906370zhz.LJIJJ == null) {
                c1906370zhz.LJIJJ = str2;
            }
            C1906380zi0.LIZIZ.put(enumC1584360rKc, c1906370zhz);
            if (c1906370zhz.LJIILL) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("mobBubbleShow, hasReport, key: ");
                sbLIZ4.append(str);
                C2188811AlT.LIZIZ(sbLIZ4);
                return;
            }
            c1906370zhz.LJIILL = true;
            c1906370zhz.LJIIIIZZ = enumC1584360rKc;
            c1906370zhz.LJFF = System.currentTimeMillis();
            c1906370zhz.LJII = true;
            JSONObject jSONObjectLIZ = C1906380zi0.LIZ(enumC1584360rKc, c1906370zhz);
            C20684815ws.LJIJ("show_core_fdmt_tooltips_infra", jSONObjectLIZ);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("show_core_fdmt_tooltips_infra: ");
            sbLIZ5.append(jSONObjectLIZ);
            C2188811AlT.LIZIZ(sbLIZ5);
        }
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LIZIZ(String str, EnumC1584360rKc enumC1584360rKc) {
        if (C295090BhT.LIZ()) {
            C1906460zi8 c1906460zi8LIZ = C1906360zhy.LIZ();
            if (c1906460zi8LIZ != null && Intrinsics.LJFF(c1906460zi8LIZ.LIZ, str)) {
                C1906360zhy.LIZLLL(c1906460zi8LIZ.LIZIZ);
                return;
            }
            return;
        }
        C1906360zhy.LIZLLL(enumC1584360rKc);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LIZLLL(String str, EnumC1905820zh6 enumC1905820zh6) {
        if (C295090BhT.LIZ()) {
            C1906460zi8 c1906460zi8LIZ = C1906360zhy.LIZ();
            if (c1906460zi8LIZ != null && Intrinsics.LJFF(c1906460zi8LIZ.LIZ, str)) {
                C1906360zhy.LIZJ(c1906460zi8LIZ.LIZIZ, enumC1905820zh6);
                return;
            }
            return;
        }
        C1906380zi0.LIZ.getClass();
        for (Map.Entry<EnumC1584360rKc, C1906370zhz> entry : C1906380zi0.LIZIZ.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue().LIZ, str)) {
                C1906380zi0 c1906380zi0 = C1906380zi0.LIZ;
                EnumC1584360rKc key = entry.getKey();
                C1906370zhz value = entry.getValue();
                c1906380zi0.getClass();
                C1906380zi0.LIZJ(key, enumC1905820zh6, value);
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final InterfaceC1619130sEh LJFF(C1906460zi8 c1906460zi8, InterfaceC1906540ziG interfaceC1906540ziG) {
        String str;
        InterfaceC1619130sEh interfaceC1619130sEh;
        C1790550whB c1790550whB = C1906360zhy.LIZ;
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble: ");
        sbLIZ.append(c1906460zi8);
        sbLIZ.append(", curr: ");
        C1906460zi8 c1906460zi8LIZ = C1906360zhy.LIZ();
        if (c1906460zi8LIZ != null) {
            str = c1906460zi8LIZ.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c1586120rNS.getClass();
        System.currentTimeMillis();
        C1906510ziD c1906510ziD = new C1906510ziD(c1906460zi8, interfaceC1906540ziG);
        C1906370zhz c1906370zhzLIZ = C1906470zi9.LIZ(c1906460zi8);
        InterfaceC1790610whH interfaceC1790610whHLIZ = C1906360zhy.LIZIZ.LIZ(c1906460zi8);
        if (interfaceC1790610whHLIZ == null) {
            if (c1906460zi8 instanceof C1618950sEP) {
                C1618950sEP c1618950sEP = (C1618950sEP) c1906460zi8;
                Object obj = c1618950sEP.LJIIIZ.LIZ;
                if (obj != null) {
                    C178300mL.LIZ(obj, c1906460zi8.LIZ);
                }
                c1618950sEP.LJIIIZ.show();
            } else if (c1906460zi8 instanceof C1619360sF4) {
                C1619360sF4 c1619360sF4 = (C1619360sF4) c1906460zi8;
                C178300mL.LIZ(c1619360sF4.LJIIIZ, c1906460zi8.LIZ);
                C0P0T c0p0t = c1619360sF4.LJIIIZ;
                if (c0p0t != null) {
                    c0p0t.show();
                }
            }
            c1906510ziD.onShow();
            C1906360zhy.LIZJ = c1906510ziD;
            C1906360zhy.LJ(c1906370zhzLIZ);
            interfaceC1619130sEh = C0J74.LIZ;
        } else {
            C1619160sEk c1619160sEk = new C1619160sEk(interfaceC1790610whHLIZ.LIZ());
            c1906510ziD.LIZ(c1619160sEk);
            interfaceC1619130sEh = c1619160sEk;
        }
        System.currentTimeMillis();
        interfaceC1619130sEh.toString();
        C1906360zhy.LIZIZ(c1906460zi8, c1906370zhzLIZ, interfaceC1619130sEh, interfaceC1790610whHLIZ);
        return interfaceC1619130sEh;
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LJI(EnumC1584360rKc enumC1584360rKc, EnumC1905820zh6 enumC1905820zh6) {
        if (C295090BhT.LIZ()) {
            C1906360zhy.LIZJ(enumC1584360rKc, enumC1905820zh6);
        } else {
            C1906380zi0.LIZ.getClass();
            C1906380zi0.LIZJ(enumC1584360rKc, enumC1905820zh6, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LJII(EnumC1584360rKc enumC1584360rKc, EnumC1905830zh7 enumC1905830zh7) {
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDismissReason: ");
        sbLIZ.append(enumC1584360rKc);
        sbLIZ.append(", ");
        sbLIZ.append(enumC1905830zh7);
        C2188811AlT.LIZIZ(sbLIZ);
        c1586120rNS.getClass();
        C1906380zi0.LIZ.getClass();
        if (C0BTQ.LIZ()) {
            C1906370zhz c1906370zhzLIZIZ = C1906380zi0.LIZIZ(enumC1584360rKc);
            if (c1906370zhzLIZIZ == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("beyondBubbleTimeLimit, info is null, key: ");
                sbLIZ2.append(enumC1584360rKc);
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            c1906370zhzLIZIZ.LIZJ(enumC1905830zh7);
        }
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LJIIIZ(Object obj, String str) {
        C178300mL.LIZ(obj, str);
    }
}
