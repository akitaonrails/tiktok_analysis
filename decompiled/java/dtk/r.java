package dtk;

import X.C01GW;
import X.C036E;
import X.C08QQ;
import X.C0CHQ;
import X.C0LAB;
import X.C13LP;
import X.C13LQ;
import X.C1442070nd7;
import X.C1624570sNT;
import X.C1625440sOs;
import X.C1629340sVA;
import X.C1629620sVc;
import X.C20012413Ry;
import X.C2188811AlT;
import X.C2341909Fp;
import X.C305790Byj;
import X.C452501pT;
import X.C543670LTx;
import X.InterfaceC1629750sVp;
import X.InterfaceC1637880siw;
import X.InterfaceC2342209Fs;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public final class r implements InterfaceC1629750sVp {
    public final String LIZ = "shoot_horizontal_carousel";
    public final String LIZIZ = "prop_panel";
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(401));

    public static void LIZLLL(C1629340sVA c1629340sVA, C0LAB c0lab) {
        String string;
        Bundle bundle;
        Bundle bundle2;
        C1625440sOs c1625440sOs = c1629340sVA.LIZJ;
        String string2 = null;
        if (c1625440sOs != null && (bundle2 = c1625440sOs.LJ) != null) {
            string = bundle2.getString("prop_launch_ui_point", "");
        } else {
            string = null;
        }
        if (C13LP.LJJJJ(string, C13LQ.LJLIIL(new String[]{"half_width_scroll_carousel", "full_width_scroll_carousel"}))) {
            c0lab.LJ("prop_launch_ui_point", string);
            return;
        }
        C1625440sOs c1625440sOs2 = c1629340sVA.LIZJ;
        if (c1625440sOs2 != null && (bundle = c1625440sOs2.LJ) != null) {
            string2 = bundle.getString("tab_type", "");
        }
        if (!u.LJIJI(string2, "main_panel", false)) {
            return;
        }
        c0lab.LJ("prop_launch_ui_point", "effect_panel");
    }

    @Override // X.InterfaceC1632630saT
    public final void LIZ(Long l, Object obj, Object obj2) {
        boolean zLIZIZ;
        long jLJIIJ;
        String string;
        String string2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        boolean z;
        long j;
        C1629340sVA c1629340sVA = (C1629340sVA) obj;
        C1629620sVc c1629620sVc = (C1629620sVc) obj2;
        Effect effect = c1629340sVA.LIZ;
        long jLongValue = 0;
        if (c1629620sVc != null) {
            long j2 = c1629620sVc.LIZJ;
            if (j2 != 0) {
                C1442070nd7.LIZIZ(effect, j2);
            }
        }
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            boolean zLJFF = C1624570sNT.LJFF(effect);
            InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("type", String.valueOf(zLJFF ? 1 : 0));
            c543670LTx.LIZ.put("url", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), effect.getFileUrl()));
            c543670LTx.LIZ.put("zip_model", 0);
            c543670LTx.LIZ.put("duration", String.valueOf(l));
            interfaceC1637880siwLIZJ.LJIIJJI(0, "sticker_download_error_rate", c543670LTx.LJ());
            InterfaceC1637880siw interfaceC1637880siwLIZJ2 = C0CHQ.LIZ().LIZJ();
            C543670LTx c543670LTx2 = new C543670LTx();
            c543670LTx2.LIZ.put("duration", l);
            if (zLJFF) {
                z = true;
            } else {
                z = false;
            }
            c543670LTx2.LIZ.put("isAr", Boolean.valueOf(z));
            interfaceC1637880siwLIZJ2.LJII("type_av_sticker_download_time", c543670LTx2.LJ());
            C543670LTx c543670LTx3 = new C543670LTx();
            c543670LTx3.LIZ.put("duration", l);
            JSONObject jSONObjectLJ = c543670LTx3.LJ();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("tag", "ttlive_sdk");
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C0CHQ.LIZ().LIZJ().LJIIIZ("ttlive_download_sticker_all", 0, jSONObjectLJ, jSONObject);
            if (c1629620sVc != null) {
                j = c1629620sVc.LIZJ;
            } else {
                j = 0;
            }
            if (l != null) {
                jLongValue = l.longValue();
            }
            C1442070nd7.LIZ(effect, j, jLongValue, 0, null);
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_type", "effect");
        c0lab.LIZLLL(l, "duration");
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("resource_id", effect.getEffectId());
        c0lab.LJFF("is_auto_download", c1629340sVA.LIZIZ);
        String unzipPath = effect.getUnzipPath();
        if (((Boolean) this.LIZJ.getValue()).booleanValue()) {
            jLJIIJ = C08QQ.LIZ(unzipPath);
        } else {
            jLJIIJ = C20012413Ry.LJIIJ(unzipPath);
        }
        c0lab.LIZIZ(jLJIIJ, "source_file_size");
        LIZLLL(c1629340sVA, c0lab);
        C1625440sOs c1625440sOs = c1629340sVA.LIZJ;
        if (c1625440sOs != null && (bundle3 = c1625440sOs.LJ) != null) {
            string = bundle3.getString("prop_selected_from", "");
        } else {
            string = null;
        }
        if (u.LJIJI(string, "prop_carousel_trending", false)) {
            c0lab.LJ(Scene.SCENE_SERVICE, this.LIZ);
        } else {
            C1625440sOs c1625440sOs2 = c1629340sVA.LIZJ;
            if (c1625440sOs2 != null && (bundle = c1625440sOs2.LJ) != null) {
                string2 = bundle.getString("tab_type", "");
            } else {
                string2 = null;
            }
            if (u.LJIJI(string2, "main_panel", false)) {
                c0lab.LJ(Scene.SCENE_SERVICE, this.LIZIZ);
            }
        }
        C1625440sOs c1625440sOs3 = c1629340sVA.LIZJ;
        if (c1625440sOs3 != null && (bundle2 = c1625440sOs3.LJ) != null && bundle2.getBoolean("is_preload", false)) {
            c0lab.LIZ(1, "is_preload");
        } else {
            c0lab.LIZ(0, "is_preload");
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
        C305790Byj.LIZ(null, l);
    }

    @Override // X.InterfaceC1632630saT
    public final /* bridge */ /* synthetic */ void LIZIZ(int i, int i2, C1629340sVA c1629340sVA) {
    }

    @Override // X.InterfaceC1632630saT
    public final void LIZJ(C1629340sVA c1629340sVA, Long l, Exception exc, C1629620sVc c1629620sVc) {
        boolean zLIZIZ;
        long j;
        long jLongValue;
        String str;
        Integer num;
        String str2;
        String string;
        String string2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Integer num2;
        String str3;
        Object stackTrace;
        String string3;
        Integer num3;
        Integer num4;
        Integer num5;
        C1629340sVA c1629340sVA2 = c1629340sVA;
        C1629620sVc c1629620sVc2 = c1629620sVc;
        Effect effect = c1629340sVA2.LIZ;
        if (c1629620sVc2 != null) {
            long j2 = c1629620sVc2.LIZJ;
            if (j2 != 0) {
                C1442070nd7.LIZIZ(effect, j2);
            }
        }
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (c1629620sVc2 != null) {
                str3 = c1629620sVc2.LIZIZ;
            } else {
                str3 = null;
            }
            sbLIZ.append(str3);
            if (c1629620sVc2 == null || (num5 = c1629620sVc2.LIZ) == null || num5.intValue() != -1) {
                stackTrace = "";
            } else if (exc != null) {
                stackTrace = exc.getStackTrace();
            } else {
                stackTrace = null;
            }
            sbLIZ.append(stackTrace);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("sticker_id", effect.getEffectId());
            if (c1629620sVc2 != null && (num4 = c1629620sVc2.LIZ) != null) {
                string3 = num4.toString();
            } else {
                string3 = null;
            }
            c543670LTx.LIZ.put("errorCode", string3);
            c543670LTx.LIZ.put("errorMsg", strLIZIZ);
            c543670LTx.LIZ.put("zip_model", 0);
            c543670LTx.LIZ.put("url", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), effect.getFileUrl()));
            interfaceC1637880siwLIZJ.LJIIJJI(1, "sticker_download_error_rate", c543670LTx.LJ());
            C543670LTx c543670LTx2 = new C543670LTx();
            if (c1629620sVc2 != null) {
                num3 = c1629620sVc2.LIZ;
            } else {
                num3 = null;
            }
            c543670LTx2.LIZ.put("error_code", num3);
            c543670LTx2.LIZ.put("error_msg", strLIZIZ);
            JSONObject jSONObjectLJ = c543670LTx2.LJ();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("tag", "ttlive_sdk");
                if (jSONObjectLJ != null) {
                    jSONObject.put("extra", jSONObjectLJ);
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C0CHQ.LIZ().LIZJ().LJIIIZ("ttlive_download_sticker_all", 1, null, jSONObject);
            C0CHQ.LIZ().LIZJ().LJIIJJI(1, "ttlive_download_sticker_error", jSONObjectLJ);
        }
        Effect effect2 = c1629340sVA2.LIZ;
        if (c1629620sVc2 != null) {
            j = c1629620sVc2.LIZJ;
        } else {
            j = 0;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ExceptionResult exceptionResult = new ExceptionResult(exc);
        if (c1629620sVc2 != null) {
            str = c1629620sVc2.LIZIZ;
        } else {
            str = null;
        }
        exceptionResult.setMsg(str);
        if (c1629620sVc2 != null && (num2 = c1629620sVc2.LIZ) != null) {
            exceptionResult.setErrorCode(num2.intValue());
        }
        C1442070nd7.LIZ(effect2, j, jLongValue, -1, exceptionResult);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_type", "effect");
        c0lab.LIZLLL(l, "duration");
        c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("resource_id", effect.getEffectId());
        c0lab.LIZLLL(ListProtector.get(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getHosts(), 0), "error_domain");
        if (c1629620sVc2 != null) {
            num = c1629620sVc2.LIZ;
        } else {
            num = null;
        }
        c0lab.LIZLLL(num, "error_code");
        if (c1629620sVc2 == null || (str2 = c1629620sVc2.LIZIZ) == null) {
            str2 = "empty_error_msg";
        }
        c0lab.LJ("error_msg", str2);
        c0lab.LJFF("is_auto_download", c1629340sVA2.LIZIZ);
        LIZLLL(c1629340sVA2, c0lab);
        C1625440sOs c1625440sOs = c1629340sVA2.LIZJ;
        if (c1625440sOs != null && (bundle3 = c1625440sOs.LJ) != null) {
            string = bundle3.getString("prop_selected_from", "");
        } else {
            string = null;
        }
        if (u.LJIJI(string, "prop_carousel_trending", false)) {
            c0lab.LJ(Scene.SCENE_SERVICE, this.LIZ);
        } else {
            C1625440sOs c1625440sOs2 = c1629340sVA2.LIZJ;
            if (c1625440sOs2 != null && (bundle = c1625440sOs2.LJ) != null) {
                string2 = bundle.getString("tab_type", "");
            } else {
                string2 = null;
            }
            if (u.LJIJI(string2, "main_panel", false)) {
                c0lab.LJ(Scene.SCENE_SERVICE, this.LIZIZ);
            }
        }
        C1625440sOs c1625440sOs3 = c1629340sVA2.LIZJ;
        if (c1625440sOs3 != null && (bundle2 = c1625440sOs3.LJ) != null && bundle2.getBoolean("is_preload", false)) {
            c0lab.LIZ(1, "is_preload");
        } else {
            c0lab.LIZ(0, "is_preload");
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
        C305790Byj.LIZ(null, l);
    }
}
