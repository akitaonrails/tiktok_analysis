package com.ss.android.ugc.aweme.contentlanguage.api;

import X.C01GW;
import X.C04TD;
import X.C11NZ;
import X.C11S5;
import X.C1514430pVp;
import X.C1594000raA;
import X.C1701940uOG;
import X.C19269210a2;
import X.C19269410a4;
import X.C19336310kr;
import X.C19EG;
import X.C1AF0;
import X.C785410UrT;
import X.C786410Ut5;
import X.C848230XPh;
import X.InterfaceC19269510a5;
import X.InterfaceC626120Oh8;
import X.ViewOnClickListenerC19269010a0;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ContentLanguageGuideServiceImpl implements IContentLanguageGuideService {
    public static IContentLanguageGuideService LIZ() {
        Object objLIZ = C04TD.LIZ(IContentLanguageGuideService.class, false);
        if (objLIZ != null) {
            return (IContentLanguageGuideService) objLIZ;
        }
        if (C04TD.LLLLLLLLLL == null) {
            synchronized (IContentLanguageGuideService.class) {
                if (C04TD.LLLLLLLLLL == null) {
                    C04TD.LLLLLLLLLL = new ContentLanguageGuideServiceImpl();
                }
            }
        }
        return C04TD.LLLLLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LIZJ() {
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        C19269210a2.LIZ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final boolean LIZLLL() {
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        return C19269210a2.LIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final boolean LJFF() {
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        C19269410a4 c19269410a4LIZ = C19269210a2.LIZ();
        c19269410a4LIZ.getClass();
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return false;
        }
        C1594000raA c1594000raA = c19269410a4LIZ.LIZ;
        c1594000raA.getClass();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
        }
        return !c1594000raA.LIZ().LJI();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final boolean LJIIIIZZ() throws JSONException {
        boolean z;
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        C19269410a4 c19269410a4LIZ = C19269210a2.LIZ();
        String strLIZIZ = c19269410a4LIZ.LIZ.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(strLIZIZ)) {
            jSONObject.put("content_language_not_login", strLIZIZ);
        }
        if (jSONObject.length() > 0) {
            C11NZ<BaseResponse> c11nzLIZLLL = ((InterfaceC19269510a5) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC19269510a5.class)).LIZLLL("settings_not_login", C786410Ut5.J3(jSONObject));
            if (c11nzLIZLLL != null) {
                c11nzLIZLLL.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336310kr(4));
            }
            z = true;
        } else {
            z = false;
        }
        c19269410a4LIZ.LIZ.LIZJ(false);
        c19269410a4LIZ.LIZ.LIZLLL("");
        c19269410a4LIZ.LIZIZ = false;
        c19269410a4LIZ.LIZIZ();
        return z;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final String getContentLanguage() {
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        C19269410a4 c19269410a4LIZ = C19269210a2.LIZ();
        c19269410a4LIZ.getClass();
        return C848230XPh.LL.LJI() ? SharePrefCache.inst().getUserAddLanguages().LIZ() : c19269410a4LIZ.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void onFeedStop() {
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        ViewOnClickListenerC19269010a0 viewOnClickListenerC19269010a0 = C19269210a2.LIZ().LIZLLL;
        if (viewOnClickListenerC19269010a0 != null) {
            viewOnClickListenerC19269010a0.LJJLJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void setContentLanguage(String str) {
        C11NZ<BaseResponse> c11nzLIZ;
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        C19269410a4 c19269410a4LIZ = C19269210a2.LIZ();
        c19269410a4LIZ.getClass();
        if (C848230XPh.LL.LJI()) {
            InterfaceC19269510a5 interfaceC19269510a5 = (InterfaceC19269510a5) c19269410a4LIZ.LJ.getValue();
            if (interfaceC19269510a5 != null && (c11nzLIZ = interfaceC19269510a5.LIZ("content_language", str, 1)) != null) {
                c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<BaseResponse>() { // from class: X.0QUt
                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(BaseResponse baseResponse) {
                        ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LIZLLL(null);
                    }
                });
                return;
            }
            return;
        }
        c19269410a4LIZ.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LJ(Context context, Fragment fragment) {
        if (context == null) {
            return;
        }
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        C19269410a4 c19269410a4LIZ = C19269210a2.LIZ();
        if (c19269410a4LIZ.LIZIZ) {
            c19269410a4LIZ.LIZLLL(context, fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LJII(Context context, Fragment fragment) {
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        C19269210a2.LIZ().LIZLLL(context, fragment);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LJI(C19EG c19eg, Fragment fragment, Aweme aweme) {
        C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
        C19269410a4 c19269410a4LIZ = C19269210a2.LIZ();
        ViewOnClickListenerC19269010a0 viewOnClickListenerC19269010a0 = c19269410a4LIZ.LIZLLL;
        if (viewOnClickListenerC19269010a0 != null && viewOnClickListenerC19269010a0.isShowing()) {
            if (((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LJI(aweme)) {
                ViewOnClickListenerC19269010a0 viewOnClickListenerC19269010a02 = c19269410a4LIZ.LIZLLL;
                if (viewOnClickListenerC19269010a02 != null) {
                    viewOnClickListenerC19269010a02.LLJ = System.currentTimeMillis();
                    return;
                }
                return;
            }
            try {
                ViewOnClickListenerC19269010a0 viewOnClickListenerC19269010a03 = c19269410a4LIZ.LIZLLL;
                if (viewOnClickListenerC19269010a03 != null) {
                    viewOnClickListenerC19269010a03.dismiss();
                    C785410UrT.LIZ(viewOnClickListenerC19269010a03);
                }
                c19269410a4LIZ.LIZIZ = true;
                if (C848230XPh.LL.LJI()) {
                    ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().setContentLanguageDialogShown(false);
                    return;
                } else {
                    c19269410a4LIZ.LIZ.LIZJ(false);
                    c19269410a4LIZ.LIZ.LIZLLL("");
                    return;
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (!c19269410a4LIZ.LIZIZ) {
            return;
        }
        c19269410a4LIZ.LIZLLL(c19eg, fragment);
    }
}
