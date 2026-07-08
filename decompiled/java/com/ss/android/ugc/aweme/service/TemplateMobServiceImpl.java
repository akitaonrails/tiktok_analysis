package com.ss.android.ugc.aweme.service;

import X.C0FPT;
import X.C0FQQ;
import X.C0LAB;
import X.C123100dR;
import X.C1398350mUb;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C793770VBv;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.TemplateComplexity;
import com.ss.android.ugc.aweme.interfaces.ITemplateComplexityService;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class TemplateMobServiceImpl implements ITemplateMobService {
    public final HashMap<String, NLETemplateModel> LIZ = new HashMap<>();
    public final HashMap<String, Long> LIZIZ = new HashMap<>();

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    public final NLETemplateModel LIZ(String str) {
        return this.LIZ.get(str);
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    public final Long LIZIZ(String str) {
        Long l = this.LIZIZ.get(str);
        if (l == null) {
            l = null;
        }
        return l;
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    public final void LIZLLL(String str, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            C793770VBv.LJII(str, jSONObject, null, null);
            C20684815ws.LJIILLIIL(str, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    public final void LJII(long j, String str) {
        if (C123100dR.LIZ(str) && j > 0) {
            this.LIZIZ.put(str, Long.valueOf(j));
        }
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    public final void LJIIIIZZ(String str, NLETemplateModel nLETemplateModel) {
        if (C123100dR.LIZ(str) && nLETemplateModel != null) {
            this.LIZ.put(str, nLETemplateModel);
        }
    }

    public final void LJIIJ(C0LAB c0lab, String str) {
        NLETemplateModel nLETemplateModel;
        TemplateComplexity templateComplexityLIZ;
        ITemplateComplexityService iTemplateComplexityServiceLIZLLL;
        Map<String, String> mapLIZIZ;
        ArrayList arrayList = new ArrayList();
        NLETemplateModel nLETemplateModel2 = this.LIZ.get(str);
        if (nLETemplateModel2 instanceof NLETemplateModel) {
            nLETemplateModel = nLETemplateModel2;
        } else {
            nLETemplateModel = null;
        }
        if (arrayList.isEmpty() && nLETemplateModel != null) {
            VecNLETrackSlotSPtr mutableAssetItems = nLETemplateModel.getMutableAssetItems();
            ArrayList arrayList2 = new ArrayList();
            for (NLETrackSlot nLETrackSlot : mutableAssetItems) {
                if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
                    arrayList2.add(nLETrackSlot);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((NLENode) it2.next()).getUUID());
            }
        }
        ITemplateComplexityService iTemplateComplexityServiceLIZLLL2 = TemplateComplexityImpl.LIZLLL();
        if (iTemplateComplexityServiceLIZLLL2 != null && (templateComplexityLIZ = iTemplateComplexityServiceLIZLLL2.LIZ(nLETemplateModel, arrayList)) != null && (iTemplateComplexityServiceLIZLLL = TemplateComplexityImpl.LIZLLL()) != null && (mapLIZIZ = iTemplateComplexityServiceLIZLLL.LIZIZ(templateComplexityLIZ)) != null && !mapLIZIZ.isEmpty()) {
            c0lab.LJI(mapLIZIZ);
        }
    }

    public static void LJIIJJI(C0LAB c0lab, String str, String str2) {
        if (C123100dR.LIZ(str)) {
            c0lab.LJ(str2, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    public final void LIZJ(String str, Integer num, String str2, String str3) {
        NLETemplateModel nLETemplateModelLIZ;
        String strLIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("template_id", str);
        c0lab.LIZLLL(num, "template_type");
        c0lab.LJ("template_url", str2);
        c0lab.LJ("dispatch_from", str3);
        Long l = this.LIZIZ.get(str2);
        if (l != null) {
            c0lab.LIZIZ(l.longValue(), "template_zip_size");
        }
        if (str != null && (nLETemplateModelLIZ = LIZ(str)) != null && (strLIZ = C0FPT.LIZ(nLETemplateModelLIZ)) != null && strLIZ.length() != 0) {
            c0lab.LJ("feature_code", strLIZ);
        }
        LJIIJ(c0lab, str);
        C20684815ws.LJIILLIIL("tool_performance_template_click_next", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    public final void LJFF(String str, Integer num, long j, int i, int i2, String str2, String str3) {
        C0FQQ.LIZIZ("GAME_PLAY_LOCAL_EFFECT", str, num, j, null, null, null, i, i2, str2, 0, str3, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.Long r10, java.lang.Integer r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateMobServiceImpl.LJIIIZ(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.util.Map, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    public final void LJI(String str, Integer num, String str2, String str3, String str4, long j, boolean z, int i, boolean z2, String str5, String str6, String str7, String str8, Map<String, String> map) {
        NLETemplateModel nLETemplateModelLIZ;
        String strLIZ;
        C0LAB c0lab = new C0LAB();
        LJIIJJI(c0lab, str, "template_id");
        LJIIJJI(c0lab, str2, "template_url");
        LJIIJJI(c0lab, str3, "dispatch_from");
        if (num != null && num.intValue() > 0) {
            c0lab.LIZ(num.intValue(), "template_type");
        }
        c0lab.LIZIZ(j, "cost");
        c0lab.LJFF("preload", z2);
        c0lab.LJ(Scene.SCENE_SERVICE, str4);
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMobTemplateAtomFeatureMob --- template id =");
        sbLIZ.append(str);
        sbLIZ.append(" templateUrl=");
        sbLIZ.append(str2);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        c0lab.LJ("task_param", str6);
        if (!z) {
            c0lab.LIZ(i, "error_code");
            c0lab.LJ("error_msg", str5);
        }
        if (C123100dR.LIZ(str8)) {
            c0lab.LJ("creation_id", str8);
        }
        if (C123100dR.LIZ(str7)) {
            c0lab.LJ("shoot_way", str7);
        }
        if (C123100dR.LIZ(str)) {
            c0lab.LJ("template_id", str);
        }
        if (str != null && (nLETemplateModelLIZ = LIZ(str)) != null && (strLIZ = C0FPT.LIZ(nLETemplateModelLIZ)) != null && strLIZ.length() != 0) {
            c0lab.LJ("feature_code", strLIZ);
        }
        if (!map.isEmpty()) {
            c0lab.LJI(map);
        }
        C20684815ws.LJIILLIIL("tool_performance_template_consume_children_task", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateMobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11, boolean r13, int r14, boolean r15, java.lang.String r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.String r19, java.lang.String r20, boolean r21, java.util.Map<java.lang.String, java.lang.String> r22) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateMobServiceImpl.LJ(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, long, boolean, int, boolean, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.util.Map):void");
    }
}
