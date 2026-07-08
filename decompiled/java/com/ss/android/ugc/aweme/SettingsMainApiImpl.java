package com.ss.android.ugc.aweme;

import X.C020Y;
import X.C04TD;
import X.C07FG;
import X.C0B6K;
import X.C0BFZ;
import X.C0C64;
import X.C0CG1;
import X.C0CG3;
import X.C1029570ctn;
import X.C10FJ;
import X.C1492110ovp;
import X.C19719612Di;
import X.C2162308dZ;
import X.C259800zU;
import X.C310710CFx;
import X.C310720CFy;
import X.C316660CbA;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.network.IZstdService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.serverpush.presenter.IGetPushSettingCallback;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.tiktok.ttf.network.zstd.ZstdService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class SettingsMainApiImpl implements ISettingsMainApi {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final C310720CFy LIZLLL() {
        C310720CFy c310720CFy = new C310720CFy();
        c310720CFy.LIZ = 10;
        c310720CFy.LIZJ = false;
        c310720CFy.LIZLLL = 3;
        c310720CFy.LIZ = SharePrefCache.inst().getMultiSelectLimit();
        return c310720CFy;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final List<C10FJ> LJI() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ServiceManager.get().getServices(IGetPushSettingCallback.class).iterator();
        while (it2.hasNext()) {
            arrayList.add(((IGetPushSettingCallback) it2.next()).getPushSettingCallback());
        }
        arrayList.add(new C10FJ() { // from class: X.0CG0
            @Override // X.C10FJ
            public final void Hl(PushSettings pushSettings) {
            }

            @Override // X.C10FJ
            public final void onFailed(Exception exc) {
            }
        });
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final boolean shouldUseRecyclerPartialUpdate() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "share_useNotifySingle", true, false);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZ(Context context) {
        IZstdService zstdService;
        if (C2162308dZ.LJI(context)) {
            KevaImpl.getRepo("ab_iorap_repo", 0).storeBoolean("iorap_enable_prefetch", C0C64.LJIILLIIL().LJIIIZ(31744, "iorap_enable_prefetch", true, false));
        }
        if (C0BFZ.LIZ <= -1) {
            Object objLIZ = C04TD.LIZ(IZstdService.class, false);
            if (objLIZ != null) {
                zstdService = (IZstdService) objLIZ;
            } else {
                zstdService = new ZstdService();
            }
            zstdService.LIZ();
        }
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZ(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZIZ(n nVar) {
        synchronized (C310710CFx.LIZ) {
            if (((Boolean) C0B6K.LIZ.getValue()).booleanValue()) {
                return;
            }
            C259800zU c259800zU = new C259800zU();
            C1492110ovp.LIZJ("GetABTestHelper", new C020Y(nVar, (n) c259800zU, (C259800zU<JSONObject>) 44), new C020Y(nVar, (n) c259800zU, (C259800zU<JSONObject>) 45), ((Boolean) C07FG.LJ.getValue()).booleanValue());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = (JSONObject) c259800zU.element;
            if (jSONObject2 != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    String[] strArr = (String[]) SettingsManager.LJII("hybrid_get_ab_test", String[].class);
                    if (strArr != null) {
                        C19719612Di.LJJII(C310710CFx.LIZJ, strArr);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                for (String str : C310710CFx.LIZJ) {
                    Object objOpt = jSONObject2.opt(str);
                    if (objOpt != null) {
                        jSONObject.put(str, objOpt);
                    }
                }
                ((Keva) C310710CFx.LIZIZ.getValue()).storeString("hybrid_abtest", C786410Ut5.J3(jSONObject));
                return;
            }
            ((Keva) C310710CFx.LIZIZ.getValue()).storeString("hybrid_abtest", C786410Ut5.J3(jSONObject));
            return;
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LJFF(C0CG1 c0cg1) {
        Object obj = c0cg1.LIZ;
        if (obj == null || (obj instanceof C0CG3)) {
            C1029570ctn c1029570ctn = C1029570ctn.LIZ;
            if (obj != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    String[] strArr = (String[]) SettingsManager.LJII("aweme_ad_link_priority", String[].class);
                    if (strArr != null) {
                        List<String> listAsList = Arrays.asList(strArr);
                        if (listAsList != null && (!listAsList.isEmpty())) {
                            C1029570ctn.LIZIZ = listAsList;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZJ(Activity activity, Fragment fragment) {
        IContentLanguageGuideService iContentLanguageGuideServiceLIZ = ContentLanguageGuideServiceImpl.LIZ();
        if (activity != null && iContentLanguageGuideServiceLIZ.LJFF()) {
            iContentLanguageGuideServiceLIZ.LJII(activity, fragment);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:14:0x0042). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final C310720CFy LJ(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        C310720CFy c310720CFy = new C310720CFy();
        try {
            if (iESSettingsProxy.getImContactsMultiSelectLimit().intValue() > 0) {
                SharePrefCache.inst().getMultiSelectLimitItem().LJFF(editor, iESSettingsProxy.getImContactsMultiSelectLimit());
                c310720CFy.LIZ = iESSettingsProxy.getImContactsMultiSelectLimit().intValue();
            } else {
                c310720CFy.LIZ = SharePrefCache.inst().getMultiSelectLimit();
            }
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            c310720CFy.LIZ = SharePrefCache.inst().getMultiSelectLimit();
        }
        try {
            c310720CFy.LIZJ = iESSettingsProxy.getDisableImMessageFullFeedSlide().booleanValue();
        } catch (C316660CbA e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c310720CFy.LIZLLL = 3;
        c310720CFy.LIZIZ = iESSettingsProxy.getImImageDomains();
        return c310720CFy;
    }
}
