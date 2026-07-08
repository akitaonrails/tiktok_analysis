package com.ss.android.ugc.aweme.contentlanguage;

import X.C0COI;
import X.C1017070cZd;
import X.C1030680cva;
import X.C1035180d2q;
import X.C10FJ;
import X.C128Y;
import X.C1388190mED;
import X.C1514430pVp;
import X.C1591880rWk;
import X.C1594040raE;
import X.C19EG;
import X.C2214201BlK;
import X.InterfaceC1566480qrm;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1594050raF;
import X.InterfaceC1603190roz;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public class ContentLanguageServiceImpl implements IContentLanguageService {
    public final InterfaceC1594050raF LIZ = C1591880rWk.LIZIZ.LJIILLIIL();
    public List<String> LIZIZ = null;

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LJIIIIZZ() {
        this.LIZIZ = null;
        this.LIZIZ = new ArrayList();
        String strLIZ = SharePrefCache.inst().getUserAddLanguages().LIZ();
        if (TextUtils.isEmpty(strLIZ)) {
            return;
        }
        this.LIZIZ.addAll(Arrays.asList(strLIZ.split(",")));
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final Activity getCurrentActivity() {
        return C2214201BlK.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final String LIZ() {
        return C1591880rWk.LIZIZ.LJIILLIIL().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final List<String> getLanguage() {
        return this.LIZ.getLanguage();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final String getContentLanguage() {
        return ContentLanguageGuideServiceImpl.LIZ().getContentLanguage();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LIZIZ(ContentLanguage contentLanguage) {
        this.LIZ.LIZIZ(contentLanguage);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LIZJ(String str) {
        this.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LIZLLL(C10FJ c10fj) {
        boolean zLJI = MethodIDManager.LJI(137844);
        C0COI.LIZIZ.LIZLLL(c10fj);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final boolean LJI(Aweme aweme) {
        boolean z = C1035180d2q.LIZ;
        if (!C1035180d2q.LIZLLL && !C1030680cva.LJIIIZ() && !C1017070cZd.LJJLIIIIJ(aweme) && !C1017070cZd.LLIZLLLIL(aweme)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Boolean, String> LJIIIZ(Context context) {
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(context);
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
        if (iMainService != null && (componentCallbacks2LIZ instanceof C19EG) && iMainService.isMainActivity((C19EG) componentCallbacks2LIZ)) {
            C128Y curFragment = ((InterfaceC1603190roz) componentCallbacks2LIZ).getCurFragment();
            if (curFragment instanceof InterfaceC1593630rZZ) {
                FeedFragment feedFragmentUx = ((InterfaceC1593630rZZ) curFragment).ux();
                if ((feedFragmentUx instanceof InterfaceC1566480qrm) && feedFragmentUx.isResumed() && feedFragmentUx.getUserVisibleHint()) {
                    Aweme awemeLJIIIIZZ = null;
                    if (C1514430pVp.LIZLLL().booleanValue() && ((InterfaceC1566480qrm) feedFragmentUx).Os().LJLLJ() == 0) {
                        return new Pair<>(Boolean.FALSE, null);
                    }
                    InterfaceC1566480qrm interfaceC1566480qrm = (InterfaceC1566480qrm) feedFragmentUx;
                    if (interfaceC1566480qrm.Os() != null) {
                        awemeLJIIIIZZ = interfaceC1566480qrm.Os().LJIIIIZZ();
                    }
                    if (LJI(awemeLJIIIIZZ)) {
                        return new Pair<>(Boolean.TRUE, feedFragmentUx.LLILLJJLI);
                    }
                }
            }
        }
        return new Pair<>(Boolean.FALSE, "");
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final C1594040raE LJ(List<String> list, List<? extends ContentLanguage> list2) {
        return this.LIZ.LJ(list, list2);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LJFF(Activity activity, Fragment fragment) {
        if (activity != null) {
            ContentLanguageGuideServiceImpl.LIZ().LJII(activity, fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final Pair<Boolean, String> LJII(Context context, Fragment fragment) {
        if (fragment == null) {
            return LJIIIZ(context);
        }
        if (fragment instanceof InterfaceC1603190roz) {
            return LJIIIZ(context);
        }
        return null;
    }
}
