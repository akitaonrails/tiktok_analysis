package com.ss.android.ugc.aweme.contentlanguage.viewmodel;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C086I;
import X.C0XIR;
import X.C0XQ7;
import X.C10FJ;
import X.C11NZ;
import X.C11S5;
import X.C1389890mGx;
import X.C1701940uOG;
import X.C19336410ks;
import X.C2188811AlT;
import X.C452501pT;
import X.C747580TUe;
import X.InterfaceC19269510a5;
import X.InterfaceC19270010aA;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class ContentPreferenceViewModel extends ViewModel implements InterfaceC19270010aA {
    public int LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public boolean LLILZIL;

    public final MutableLiveData<ArrayList<ContentLanguage>> wQ2() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    public final MutableLiveData<ArrayList<C747580TUe>> xQ2() {
        return (MutableLiveData) this.LLILZ.getValue();
    }

    public ContentPreferenceViewModel() {
        vQ2();
        this.LL = -1;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 179));
        this.LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(131));
        this.LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(132));
    }

    @Override // X.InterfaceC19270010aA
    public final void A() {
        ContentLanguage contentLanguage;
        ArrayList<ContentLanguage> value = wQ2().getValue();
        int iIntValue = (value != null ? Integer.valueOf(value.size()) : null).intValue();
        String strLIZIZ = "";
        for (int i = 0; i < iIntValue; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            ArrayList<ContentLanguage> value2 = wQ2().getValue();
            sbLIZ.append((value2 == null || (contentLanguage = (ContentLanguage) ListProtector.get(value2, i)) == null) ? null : contentLanguage.getLanguageCode());
            sbLIZ.append(',');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        SharePrefCache.inst().getUserAddLanguages().LJ(strLIZIZ);
    }

    public final void vQ2() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LIZLLL(new C10FJ() { // from class: X.10aB
                @Override // X.C10FJ
                public final void onFailed(Exception exc) {
                }

                @Override // X.C10FJ
                public final void Hl(PushSettings pushSettings) {
                    this.LL.yQ2(pushSettings.selectedContentLanguage, pushSettings.unSelectedContentLanguage);
                }
            });
            return;
        }
        List<String> language = ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).getLanguage();
        C11NZ<ConfigListResponse> c11nzLIZIZ = ((InterfaceC19269510a5) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC19269510a5.class)).LIZIZ("content_language_region", ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LIZ());
        if (c11nzLIZIZ != null) {
            c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336410ks(language, this, 1));
        }
    }

    @Override // X.InterfaceC19270010aA
    public final void Fa2(Throwable th) {
        if (th instanceof ExecutionException) {
            th = th.getCause();
        }
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            int errorCode = c0xir.getErrorCode();
            c0xir.getResponse();
            if (errorCode == 2090) {
                Activity currentActivity = ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).getCurrentActivity();
                if (currentActivity != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(currentActivity);
                    c1389890mGx.LJIIIZ(2131848733);
                    c1389890mGx.LJIIJJI();
                }
                ArrayList<ContentLanguage> value = wQ2().getValue();
                if (C086I.LIZIZ(value)) {
                    return;
                }
                if (value != null) {
                    ListProtector.remove(value, value.size() - 1);
                }
                wQ2().setValue(value);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yQ2(List<? extends ContentLanguage> list, List<? extends ContentLanguage> list2) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        if (!C086I.LIZIZ(list)) {
            wQ2().setValue(list);
        }
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null && !C086I.LIZIZ(list2)) {
            ArrayList<C747580TUe> arrayList = new ArrayList<>();
            for (ContentLanguage contentLanguage : list2) {
                arrayList.add(new C747580TUe(i18nManagerServiceApiLIZ.LJIILLIIL(contentLanguage.getEnglishName(), contentLanguage.getLanguageCode(), contentLanguage.getLocalName()), false));
            }
            xQ2().setValue(arrayList);
        }
    }
}
