package com.ss.android.ugc.aweme.api;

import X.AbstractC848400XPy;
import X.C013C;
import X.C08JS;
import X.C098200Yq;
import X.C0C64;
import X.C0XQ7;
import X.C1395050mPH;
import X.C1395070mPJ;
import X.C1395080mPK;
import X.C1395100mPM;
import X.C1395170mPT;
import X.C13LP;
import X.C1547960qNu;
import X.C189200o6;
import X.C1AM9;
import X.C1BCA;
import X.C1BCC;
import X.C212374189c;
import X.C212375189d;
import X.C212376189e;
import X.C2188811AlT;
import X.C293320Bec;
import X.C487080J8g;
import X.C729980SkG;
import X.C823050WQl;
import X.EnumC1430380nKG;
import X.EnumC1533980q1M;
import X.InterfaceC1395140mPQ;
import X.InterfaceC1474390oTF;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS24S1100000_19;
import Y.ARunnableS29S0400000_21;
import Y.ARunnableS32S0101000_21;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.video.pro.LynxVideoUI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.base.xelements.xvideo.LynxUgVideoUI;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.config.CCAnchorLandingPageFourthOpt;
import com.ss.android.ugc.aweme.config.CCAnchorLandingPageSecondOpt;
import com.ss.android.ugc.aweme.config.PreloadVideoConfigAndroidScore;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.PreloadVideoUtil;
import com.ss.ttvideoengine.TTVideoEngine;
import j27.s;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class AnchorBusinessApiImpl implements IAnchorBusinessApi {
    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final boolean LJIILIIL() {
        Boolean bool;
        C1395050mPH.LIZ.getClass();
        CCAnchorLandingPageFourthOpt cCAnchorLandingPageFourthOptLIZ = C1395050mPH.LIZ();
        if (cCAnchorLandingPageFourthOptLIZ == null || (bool = cCAnchorLandingPageFourthOptLIZ.enablePreloadOnClick) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final boolean LJIILL() {
        C1395100mPM.LIZ.getClass();
        return C1395100mPM.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final boolean LJIILLIIL() {
        Boolean bool;
        C1395050mPH.LIZ.getClass();
        CCAnchorLandingPageFourthOpt cCAnchorLandingPageFourthOptLIZ = C1395050mPH.LIZ();
        if (cCAnchorLandingPageFourthOptLIZ == null || (bool = cCAnchorLandingPageFourthOptLIZ.enablePreloadOnShow) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final boolean LJIIZILJ() {
        Boolean bool;
        C1395050mPH.LIZ.getClass();
        CCAnchorLandingPageFourthOpt cCAnchorLandingPageFourthOptLIZ = C1395050mPH.LIZ();
        if (cCAnchorLandingPageFourthOptLIZ == null || (bool = cCAnchorLandingPageFourthOptLIZ.useSimPlayer) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final String LJIJ() {
        Pair<String, String> pair;
        if (PreloadVideoUtil.LIZ == null || (pair = PreloadVideoUtil.LIZJ) == null) {
            return null;
        }
        return (String) pair.first;
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final boolean LJIJJ() {
        Integer num;
        C1395100mPM.LIZ.getClass();
        CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ = C1395100mPM.LIZ();
        return (cCAnchorLandingPageSecondOptLIZ == null || (num = cCAnchorLandingPageSecondOptLIZ.multiRate) == null || num.intValue() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final int LJIILJJIL() {
        return C1395170mPT.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final boolean LJIJJLI() {
        return C212375189d.LIZIZ() && C212376189e.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final void LJIIJJI(JSONObject jSONObject) {
        Object c098200Yq;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        try {
            SoftReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> softReference = C212374189c.LIZIZ;
            if (softReference != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = softReference.get()) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.LIZ("ccContainerDidDisappear", jSONObject);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final boolean LJIIL(Aweme aweme) {
        MusicModel musicModelConvertToMusicModel;
        AnchorCommonStruct next;
        String extra;
        Object obj;
        ArrayList arrayList;
        Integer numValueOf;
        String string;
        Music music = aweme.getMusic();
        if (music != null) {
            musicModelConvertToMusicModel = music.convertToMusicModel();
        } else {
            musicModelConvertToMusicModel = null;
        }
        if (musicModelConvertToMusicModel != null && ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ() && !musicModelConvertToMusicModel.isCommerceMusic()) {
            C487080J8g.LIZ(aweme, EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPENAME(), "shouldUseCommerceMusic", false);
            return false;
        }
        EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE;
        TemplateScene templateScene = TemplateScene.PIC_UGC;
        if (((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZ()) {
            C487080J8g.LIZ(aweme, enumC1430380nKG.getTYPENAME(), "isChildrenMode", false);
        } else {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            C013C c013c = new C013C();
            try {
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                if (anchors != null) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getType() == enumC1430380nKG.getTYPE()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AnchorCommonStruct anchorCommonStruct = next;
                    if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0) {
                        new p();
                        k kVarLIZJ = p.LIZJ(extra);
                        c013c.element = Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), kVarLIZJ.LJIILIIL().LJJIIZ("author_id").LJIL());
                        String strLJIL = kVarLIZJ.LJIILIIL().LJJIIZ("nle_summary").LJIL();
                        if (TextUtils.isEmpty(strLJIL)) {
                            C487080J8g.LIZ(aweme, enumC1430380nKG.getTYPENAME(), "nleSummary isEmpty", false);
                            return false;
                        }
                        new p();
                        n nVarLJIILIIL = p.LIZJ(strLJIL).LJIILIIL();
                        arrayList2.addAll((List) C08JS.LIZIZ().LIZLLL(nVarLJIILIIL.LJJIIZ("featurebits").LJIIL(), new TypeToken<List<? extends Long>>() { // from class: X.04aB
                        }.getType()));
                        if (nVarLJIILIIL.LJJIJIIJIL("feature_codes")) {
                            try {
                                k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("feature_codes");
                                if (kVarLJJIIZ != null) {
                                    h hVarLJIIL = kVarLJJIIZ.LJIIL();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (k kVar : hVarLJIIL) {
                                        if (kVar != null && (numValueOf = Integer.valueOf(kVar.LJIIJJI())) != null) {
                                            arrayList4.add(numValueOf);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    C13LP.LLFII(arrayList4, arrayList5);
                                    arrayList = arrayList5;
                                } else {
                                    arrayList = new ArrayList();
                                }
                                C189200o6.m2constructorimpl(arrayList);
                                obj = arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C098200Yq c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                                obj = c098200Yq;
                            }
                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
                            Object arrayList6 = obj;
                            if (thM5exceptionOrNullimpl != null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList3.addAll((ArrayList) arrayList6);
                        }
                        Object objOpt = new JSONObject(extra).opt("is_hide");
                        if (objOpt == null || (string = objOpt.toString()) == null) {
                            string = "";
                        }
                        boolean zLJFF = Intrinsics.LJFF("1", string);
                        if (!C293320Bec.LIZ && enumC1430380nKG.getTYPE() != EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE()) {
                            if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().isNleLoaded()) {
                                if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().canSupportAnchorFeatureBits(templateScene, arrayList2, arrayList3, c013c.element)) {
                                    C487080J8g.LIZ(aweme, enumC1430380nKG.getTYPENAME(), "notSupportAnchorFeatureBits", false);
                                    return false;
                                }
                            } else {
                                C823050WQl.LIZIZ().submit(new ARunnableS29S0400000_21(arrayList3, templateScene, arrayList2, c013c, 4));
                                C487080J8g.LIZ(aweme, enumC1430380nKG.getTYPENAME(), "not NleLoaded", false);
                                return false;
                            }
                        } else if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().canSupportAnchorFeatureBits(templateScene, arrayList2, arrayList3, C729980SkG.LJIIIIZZ(aweme))) {
                            C487080J8g.LIZ(aweme, enumC1430380nKG.getTYPENAME(), "notSupportAnchorFeatureBits", false);
                            return false;
                        }
                        if (zLJFF) {
                            C487080J8g.LIZ(aweme, enumC1430380nKG.getTYPENAME(), "isHide", false);
                            return false;
                        }
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ugc_photo_template_anchor", true, false)) {
                            return true;
                        }
                        C487080J8g.LIZ(aweme, EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPENAME(), "disable UgcPhotoModeTemplateAnchor exp", false);
                        return false;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String typename = enumC1430380nKG.getTYPENAME();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception ");
                sbLIZ.append(e.getMessage());
                C487080J8g.LIZ(aweme, typename, C2188811AlT.LIZIZ(sbLIZ), false);
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final UISimpleView<ViewGroup> LJIIIIZZ(final s sVar, boolean z) {
        C1395080mPK.LIZ.getClass();
        if (((IAnchorBusinessApi) ServiceManager.get().getService(IAnchorBusinessApi.class)).LJIIZILJ()) {
            return new LynxUgVideoUI(sVar);
        }
        LynxVideoUI lynxVideoUI = new LynxVideoUI(sVar, null);
        C1395070mPJ c1395070mPJ = new InterfaceC1474390oTF() { // from class: X.0mPJ
            @Override // X.InterfaceC1474390oTF
            public final void LIZ() {
            }
        };
        lynxVideoUI.LLJJJ = c1395070mPJ;
        ((C1AM9) lynxVideoUI.mView).setUrlConstructor(c1395070mPJ);
        if (z) {
            lynxVideoUI.LLJJIJI = new C1547960qNu(sVar, true, EnumC1533980q1M.LYNX_VIDEO);
        }
        ((C1AM9) lynxVideoUI.mView).setEngineFactory(new InterfaceC1395140mPQ() { // from class: X.0mPL
            @Override // X.InterfaceC1395140mPQ
            public final TTVideoEngine LIZJ(Context context) {
                boolean z2;
                Integer num;
                Float fValueOf;
                float f;
                boolean z3;
                Integer num2;
                Integer num3;
                PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore;
                PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore2;
                Integer num4;
                C1395080mPK c1395080mPK = C1395080mPK.LIZ;
                s sVar2 = sVar;
                c1395080mPK.getClass();
                C1395100mPM.LIZ.getClass();
                CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ = C1395100mPM.LIZ();
                if (cCAnchorLandingPageSecondOptLIZ != null && (num4 = cCAnchorLandingPageSecondOptLIZ.operateAsyn) != null && num4.intValue() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("operateAsyn = ");
                CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ2 = C1395100mPM.LIZ();
                HashMap map = null;
                if (cCAnchorLandingPageSecondOptLIZ2 != null) {
                    num = cCAnchorLandingPageSecondOptLIZ2.operateAsyn;
                } else {
                    num = null;
                }
                sbLIZ.append(num);
                sbLIZ.append(" deviceScore = ");
                sbLIZ.append(C2215011Bmd.LIZ());
                sbLIZ.append(" lowLevel = ");
                CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ3 = C1395100mPM.LIZ();
                if (cCAnchorLandingPageSecondOptLIZ3 != null && (preloadVideoConfigAndroidScore2 = cCAnchorLandingPageSecondOptLIZ3.androidScore) != null) {
                    fValueOf = Float.valueOf(preloadVideoConfigAndroidScore2.lowLevel);
                } else {
                    fValueOf = null;
                }
                sbLIZ.append(fValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                float fLIZ = C2215011Bmd.LIZ();
                CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ4 = C1395100mPM.LIZ();
                if (cCAnchorLandingPageSecondOptLIZ4 != null && (preloadVideoConfigAndroidScore = cCAnchorLandingPageSecondOptLIZ4.androidScore) != null) {
                    f = preloadVideoConfigAndroidScore.lowLevel;
                } else {
                    f = 0.0f;
                }
                if (Float.compare(fLIZ, f) < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 && (C2215011Bmd.LIZ() == 0 || !z3)) {
                    map = new HashMap();
                    map.put("enable_looper", Boolean.TRUE);
                }
                TTVideoEngine tTVideoEngine = new TTVideoEngine(sVar2, 0, map);
                tTVideoEngine.LIZJ(160, 1);
                tTVideoEngine.LIZJ(21, 1);
                CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ5 = C1395100mPM.LIZ();
                if (cCAnchorLandingPageSecondOptLIZ5 != null && (num3 = cCAnchorLandingPageSecondOptLIZ5.hardwareDecode) != null && num3.intValue() == 1 && (C1481060oe0.LIZJ(true) || C1481060oe0.LIZJ(false))) {
                    tTVideoEngine.LIZJ(7, 1);
                }
                CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ6 = C1395100mPM.LIZ();
                if (cCAnchorLandingPageSecondOptLIZ6 != null && (num2 = cCAnchorLandingPageSecondOptLIZ6.skipStream) != null && num2.intValue() == 1) {
                    tTVideoEngine.LIZJ(204, 1);
                }
                return tTVideoEngine;
            }
        });
        return lynxVideoUI;
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final void LJIIIZ(int i, List<AnchorCommonStruct> list) {
        Object c098200Yq;
        CCAnchorLandingPageFourthOpt cCAnchorLandingPageFourthOptLIZ;
        Boolean bool;
        try {
            C1395050mPH.LIZ.getClass();
            cCAnchorLandingPageFourthOptLIZ = C1395050mPH.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (cCAnchorLandingPageFourthOptLIZ != null && (bool = cCAnchorLandingPageFourthOptLIZ.usePreWarm) != null && bool.booleanValue()) {
            C1BCC c1bcc = new C1BCC(new ARunnableS32S0101000_21(i, list, 3));
            c1bcc.LLJIJIL = "ccAnchorPreloadVideo";
            C1BCA.LJJIIZ(c1bcc);
        } else {
            PreloadVideoUtil.LIZ.getClass();
            PreloadVideoUtil.LIZ(i, list);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x028e  */
    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme r18, X.EnumC1430380nKG r19) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.AnchorBusinessApiImpl.LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme, X.0nKG):boolean");
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final void LJIJI(Context context, String str) {
        Object c098200Yq;
        CCAnchorLandingPageFourthOpt cCAnchorLandingPageFourthOptLIZ;
        Boolean bool;
        try {
            C1395050mPH.LIZ.getClass();
            cCAnchorLandingPageFourthOptLIZ = C1395050mPH.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (cCAnchorLandingPageFourthOptLIZ != null && (bool = cCAnchorLandingPageFourthOptLIZ.usePreWarm) != null && bool.booleanValue()) {
            C1BCC c1bcc = new C1BCC(new ARunnableS24S1100000_19(context, str, 5));
            c1bcc.LLJIJIL = "ccAnchorSparkPreload";
            C1BCA.LJJIIZ(c1bcc);
        } else {
            C212374189c.LIZ(context, str);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }
}
