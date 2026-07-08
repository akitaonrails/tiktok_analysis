package com.ss.android.ugc.aweme.im.service.impl;

import X.C04T4;
import X.C07WK;
import X.C0YM2;
import X.C0YNW;
import X.C0YUC;
import X.C1224804qk;
import X.C1366690lfX;
import X.C1759206uk;
import X.C1865360ydq;
import X.C19212010Ec;
import X.C21511719Gp;
import X.C2188811AlT;
import X.C876310YZh;
import X.C876340YZk;
import X.C876610YaB;
import X.C882400YjW;
import X.C882420YjY;
import X.C882670Yjx;
import X.C883250Ykt;
import X.C890330YwJ;
import X.EnumC871430YGn;
import X.InterfaceC1224904ql;
import X.InterfaceC882680Yjy;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.common.IMCommonApi;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.IStopwatchFactory;
import com.ss.android.ugc.aweme.im.service.service.IMPerformanceService;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class IMPerformanceServiceImpl implements IMPerformanceService {
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    @Override // com.ss.android.ugc.aweme.im.service.service.IMPerformanceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ() {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.IMPerformanceServiceImpl.LJ():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMPerformanceService
    public final String LIZJ() {
        SettingsManager.LIZLLL().getClass();
        String strLIZIZ = "";
        if (!SettingsManager.LIZ("tt_im_user_debug_snapshot", false)) {
            return "";
        }
        C882670Yjx c882670Yjx = new Object() { // from class: X.0Yjx
        };
        C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        c882670Yjx.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(((C0YNW) C0YUC.LIZ(c0ym2)).LIZ.LJIL().LLLFFI());
        IIMCoreDependProxyService.LIZ.getClass();
        IIMCoreDependProxyService iIMCoreDependProxyServiceLIZ = C882420YjY.LIZ();
        if (iIMCoreDependProxyServiceLIZ != null) {
            iIMCoreDependProxyServiceLIZ.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            long j = C883250Ykt.LLILLL;
            if (j > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(", millis_after_switch_acct:");
                sbLIZ.append(SystemClock.uptimeMillis() - j);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("{im_init_state:");
        C876340YZk c876340YZk = C876340YZk.LIZ;
        sbLIZ2.append(((C876310YZh) C876340YZk.LIZ(c876340YZk)).LIZIZ.LJFF());
        sbLIZ2.append(",imsdk_init_state:");
        C882400YjW c882400YjW = C882400YjW.LIZ;
        C0YM2 c0ym22 = C0YM2.TIKTOK_SOCIAL_IM;
        c882400YjW.getClass();
        sbLIZ2.append(C882400YjW.LIZIZ(c0ym22).LJIIZILJ().getValue());
        sbLIZ2.append(", imsdk_is_login:");
        sbLIZ2.append(((C876310YZh) C876340YZk.LIZ(c876340YZk)).LIZIZ());
        sbLIZ2.append(", is_creator_enable:");
        sbLIZ2.append(C19212010Ec.LIZJ.LJLLLLLL());
        sbLIZ2.append(", is_u16:");
        sbLIZ2.append(C21511719Gp.LIZIZ(C21511719Gp.LIZ));
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("{total_dm_unread_count:");
        sbLIZ3.append(((C0YNW) C0YUC.LIZ(c0ym2)).LJ.LIZ());
        sbLIZ3.append(", inbox_dm_unread_count: ");
        IMChatListApi.LJJIII.getClass();
        Pair pair = (Pair) C890330YwJ.LIZ().LJIIIZ().LIZ().getValue();
        sbLIZ3.append(pair != null ? pair.getFirst() : null);
        sbLIZ3.append('}');
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sb = new StringBuilder("{ ");
        InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
        if (interfaceC882680YjyLJJIL != null) {
            interfaceC882680YjyLJJIL.LJFF(sb);
        }
        sb.append(" }");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("{ status:");
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append(", unread_count:");
        sbLIZ4.append(strLIZIZ3);
        sbLIZ4.append(", invalid_conv_count:");
        sbLIZ4.append((Object) sb);
        sbLIZ4.append(" }");
        linkedHashMap.put("inbox_meta_info", C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sb2 = new StringBuilder("{ ");
        InterfaceC882680Yjy interfaceC882680YjyLJJIL2 = C890330YwJ.LIZ().LJJIL();
        if (interfaceC882680YjyLJJIL2 != null) {
            interfaceC882680YjyLJJIL2.LJ(sb2);
        }
        sb2.append(" }");
        C876610YaB c876610YaBLJIIIIZZ = C890330YwJ.LIZ().LJIIJJI().LJIIIIZZ();
        int size = -1;
        int iLIZJ = c876610YaBLJIIIIZZ != null ? c876610YaBLJIIIIZZ.LIZJ() : -1;
        C876610YaB c876610YaBLJIIIIZZ2 = C890330YwJ.LIZ().LJIIJJI().LJIIIIZZ();
        if (c876610YaBLJIIIIZZ2 != null) {
            C07WK c07wk = c876610YaBLJIIIIZZ2.LIZ.get(EnumC871430YGn.ALL_RISKY);
            size = c07wk != null ? c07wk.LIZJ.size() : 0;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("{ sessionCount:");
        sbLIZ5.append((Object) sb2);
        sbLIZ5.append(", stranger_count:");
        sbLIZ5.append(iLIZJ);
        sbLIZ5.append(", risky_count:");
        sbLIZ5.append(size);
        sbLIZ5.append(" }");
        linkedHashMap.put("conversation_in_memory", C2188811AlT.LIZIZ(sbLIZ5));
        linkedHashMap.put("conversation_loading_logs", C890330YwJ.LIZ().LJJIJIL().LIZIZ());
        boolean zLIZ = C1865360ydq.LIZ();
        C1759206uk c1759206uk = C1759206uk.LIZ;
        boolean zLIZ2 = C1759206uk.LIZ();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("{ is_camera_on: ");
        sbLIZ6.append(zLIZ);
        sbLIZ6.append(", is_group_chat_on: ");
        sbLIZ6.append(zLIZ2);
        sbLIZ6.append(" }");
        linkedHashMap.put("feature_info", C2188811AlT.LIZIZ(sbLIZ6));
        return linkedHashMap.toString();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMPerformanceService
    public final IStopwatchFactory LIZLLL() {
        return (IStopwatchFactory) ServiceManager.get().getService(IStopwatchFactory.class);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMPerformanceService
    public final C1366690lfX LIZIZ() {
        return DurationPerfMon.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMPerformanceService
    public final void LIZ(View view, InterfaceC1224904ql interfaceC1224904ql) {
        IMCommonApi.LIZ.getClass();
        C04T4.LIZIZ.getValue().LIZ();
        C1224804qk.LIZ(view, interfaceC1224904ql);
    }
}
