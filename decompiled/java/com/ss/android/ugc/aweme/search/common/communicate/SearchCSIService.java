package com.ss.android.ugc.aweme.search.common.communicate;

import X.C07BK;
import X.C12E4;
import X.C12E5;
import X.C13LP;
import X.C1889807ai;
import X.C19720512Dr;
import X.C2097908Jt;
import X.C2193061AsK;
import X.C2193081AsM;
import X.C2193201AsY;
import X.C2193431Asv;
import X.EnumC2193121AsQ;
import X.EnumC2193151AsT;
import X.EnumC2193181AsW;
import X.EnumC2193221Asa;
import X.InterfaceC1259480isc;
import X.InterfaceC1259690isx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.csi.ISearchCSIService;
import com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPI;
import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.editor.services.IProfileBannerService;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class SearchCSIService implements ISearchCSIService {
    @Override // com.ss.android.ugc.aweme.search.csi.ISearchCSIService
    public final List<C12E4> LIZIZ() {
        CopyOnWriteArrayList<C12E4> copyOnWriteArrayList = C12E5.LIZ;
        return C12E5.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Asv] */
    @Override // com.ss.android.ugc.aweme.search.csi.ISearchCSIService
    public final C2193431Asv LJI() {
        return new InterfaceC1259480isc() { // from class: X.1Asv
            @Override // X.InterfaceC1259480isc
            public final AbstractC1259530ish LIZ(ViewGroup viewGroup, final InterfaceC1259690isx interfaceC1259690isx) {
                InterfaceC2193211AsZ interfaceC2193211AsZ;
                if (interfaceC1259690isx instanceof InterfaceC2193211AsZ) {
                    interfaceC2193211AsZ = (InterfaceC2193211AsZ) interfaceC1259690isx;
                } else {
                    interfaceC2193211AsZ = new InterfaceC2193211AsZ(interfaceC1259690isx) { // from class: X.1AsU
                        public final InterfaceC1259690isx LIZIZ;

                        @Override // X.InterfaceC2193211AsZ
                        public final void LIZLLL(C2193291Ash c2193291Ash) {
                        }

                        @Override // X.InterfaceC2193211AsZ
                        public final void LJFF() {
                        }

                        @Override // X.InterfaceC2193211AsZ
                        public final void initialize() {
                        }

                        @Override // X.InterfaceC2193211AsZ
                        public final InterfaceC346201Wa<C19720512Dr> LIZ() {
                            return this.LIZIZ.LIZ();
                        }

                        @Override // X.InterfaceC2193211AsZ
                        public final void destroy() {
                            this.LIZIZ.destroy();
                        }

                        {
                            this.LIZIZ = interfaceC1259690isx;
                        }

                        @Override // X.InterfaceC2193211AsZ
                        public final void LIZIZ(List<? extends Aweme> list) {
                            this.LIZIZ.LIZIZ(list);
                        }

                        @Override // X.InterfaceC2193211AsZ
                        public final void LIZJ(String str) {
                            this.LIZIZ.LIZJ(str);
                        }

                        @Override // X.InterfaceC2193211AsZ
                        public final void LJIIIIZZ(EnumC2193221Asa enumC2193221Asa) {
                            EnumC2193151AsT enumC2193151AsT;
                            switch (C2193191AsX.LIZ[enumC2193221Asa.ordinal()]) {
                                case 1:
                                    enumC2193151AsT = EnumC2193151AsT.INIT;
                                    break;
                                case 2:
                                    enumC2193151AsT = EnumC2193151AsT.PULL_TO_REFRESH;
                                    break;
                                case 3:
                                    enumC2193151AsT = EnumC2193151AsT.VISIBILITY_CHANGE;
                                    break;
                                case 4:
                                    enumC2193151AsT = EnumC2193151AsT.CLICK_PUBLISH;
                                    break;
                                case 5:
                                    enumC2193151AsT = EnumC2193151AsT.DRAFT_SAVED;
                                    break;
                                case 6:
                                    enumC2193151AsT = EnumC2193151AsT.DRAFT_DELETED;
                                    break;
                                case 7:
                                    enumC2193151AsT = EnumC2193151AsT.DELETE_POST;
                                    break;
                                default:
                                    throw new C1954807lC();
                            }
                            this.LIZIZ.LJII(enumC2193151AsT);
                        }

                        @Override // X.InterfaceC2193211AsZ
                        public final void LJ(C19720512Dr c19720512Dr, EnumC2193181AsW enumC2193181AsW, Map<String, ? extends Object> map) {
                            EnumC2193121AsQ enumC2193121AsQ;
                            Object obj;
                            int i = C2193191AsX.LIZIZ[enumC2193181AsW.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        return;
                                    } else {
                                        enumC2193121AsQ = EnumC2193121AsQ.CLOSE;
                                    }
                                } else {
                                    enumC2193121AsQ = EnumC2193121AsQ.CLICK;
                                }
                            } else {
                                enumC2193121AsQ = EnumC2193121AsQ.SHOW;
                            }
                            String str = null;
                            if (map != null) {
                                obj = map.get("itemId");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof String) {
                                str = (String) obj;
                            }
                            this.LIZIZ.LJI(c19720512Dr, enumC2193121AsQ, str);
                        }
                    };
                }
                final C19721212Dy c19721212Dy = new C19721212Dy(viewGroup, interfaceC2193211AsZ);
                final View view = c19721212Dy.itemView;
                return new AbstractC1259530ish(view) { // from class: X.1Asw
                    @Override // X.AbstractC1259530ish, X.InterfaceC1259590isn
                    public final void LLIIZ(C19720512Dr c19720512Dr, boolean z) {
                        c19721212Dy.LLIIZ(c19720512Dr, z);
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.csi.ISearchCSIService
    public final void LJII() {
        List<C12E4> listLIZ;
        IProfileBannerService iProfileBannerService = (IProfileBannerService) PluggableExtentionKt.pluggableSpi$default(IProfileBannerService.class, false, false, false, 14, null);
        if (iProfileBannerService == null || (listLIZ = iProfileBannerService.LIZ()) == null) {
            return;
        }
        Iterator<C12E4> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            C12E5.LIZ.add(it2.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.csi.ISearchCSIService
    public final void LIZ() {
        C2193081AsM c2193081AsM;
        SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3;
        if (C07BK.LIZ()) {
            SearchCSIProfileBannerRepoV3.LJJIIJ.getClass();
            WeakReference<SearchCSIProfileBannerRepoV3> weakReference = SearchCSIProfileBannerRepoV3.LJJIIZ;
            if (weakReference == null || (searchCSIProfileBannerRepoV3 = weakReference.get()) == null) {
                return;
            }
            searchCSIProfileBannerRepoV3.LJIIIIZZ(EnumC2193221Asa.CLICK_PUBLISH);
            return;
        }
        WeakReference<C2193081AsM> weakReference2 = C2193081AsM.LJIIIZ;
        if (weakReference2 != null && (c2193081AsM = weakReference2.get()) != null) {
            c2193081AsM.LJII(EnumC2193151AsT.CLICK_PUBLISH);
            return;
        }
        C2193061AsK c2193061AsK = C2193081AsM.LJIIJ;
        if (c2193061AsK != null) {
            C2193081AsM.LJIIJJI = c2193061AsK;
            c2193061AsK.LIZJ = true;
            C2193061AsK.LJI.add(Integer.valueOf(c2193061AsK.LIZ.hashCode()));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.csi.ISearchCSIService
    public final boolean LIZJ(Object obj) {
        String str;
        if (!(obj instanceof ShortVideoContext)) {
            return false;
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) obj;
        if (!Intrinsics.LJFF(shortVideoContext.shootWay, "educate_phase_iii")) {
            return false;
        }
        HashMap<String, String> extraLogParams = shortVideoContext.creativeFlowData.getExtraLogParams();
        String strOptString = null;
        if (extraLogParams != null) {
            str = extraLogParams.get("post_chain");
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "photo")) {
            return true;
        }
        String str2 = shortVideoContext.creativeModel.commonMobModel.searchExtra;
        if (str2 != null) {
            strOptString = new JSONObject(str2).optString("banner_post_chain");
        }
        if (Intrinsics.LJFF(strOptString, "photo")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.csi.ISearchCSIService
    public final void LIZLLL(String str) {
        C2193081AsM c2193081AsM;
        C19720512Dr c19720512Dr;
        SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3;
        String str2 = str;
        if (C07BK.LIZ()) {
            SearchCSIProfileBannerRepoV3.LJJIIJ.getClass();
            if (str2 != null && str2.length() > 0) {
                LinkedHashMap<String, C1889807ai> linkedHashMap = SearchCSIProfileBannerRepoV3.LJJIJ;
                synchronized (linkedHashMap) {
                    try {
                        linkedHashMap.put(str2, new C1889807ai(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), null));
                        while (true) {
                            LinkedHashMap<String, C1889807ai> linkedHashMap2 = SearchCSIProfileBannerRepoV3.LJJIJ;
                            if (linkedHashMap2.size() <= 8) {
                                break;
                            } else {
                                linkedHashMap2.remove(C13LP.LJJJJZ(linkedHashMap2.keySet()));
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            WeakReference<SearchCSIProfileBannerRepoV3> weakReference = SearchCSIProfileBannerRepoV3.LJJIIZ;
            if (weakReference != null && (searchCSIProfileBannerRepoV3 = weakReference.get()) != null) {
                C19720512Dr c19720512Dr2 = SearchCSIProfileBannerRepoV3.LJJIIZI;
                if (c19720512Dr2 != null || (c19720512Dr2 = searchCSIProfileBannerRepoV3.LJII) != null) {
                    EnumC2193181AsW enumC2193181AsW = EnumC2193181AsW.PUBLISH;
                    if (str2 == null) {
                        str2 = "";
                    }
                    searchCSIProfileBannerRepoV3.LJ(c19720512Dr2, enumC2193181AsW, C2097908Jt.LIZJ(new Pair("itemId", str2)));
                    return;
                }
                return;
            }
            C19720512Dr c19720512Dr3 = SearchCSIProfileBannerRepoV3.LJJIIZI;
            if (c19720512Dr3 != null) {
                SearchCSIProfilerBannerAPI searchCSIProfilerBannerAPI = SearchCSIProfilerBannerAPI.LIZIZ;
                String str3 = c19720512Dr3.LJ;
                EnumC2193121AsQ enumC2193121AsQ = EnumC2193121AsQ.PUBLISH;
                String str4 = c19720512Dr3.LJIIZILJ;
                Integer num = c19720512Dr3.LJIIJ;
                String str5 = c19720512Dr3.LJIILL;
                searchCSIProfilerBannerAPI.getClass();
                SearchCSIProfilerBannerAPI.LIZ(str3, enumC2193121AsQ, str2, str4, num, str5, "v2", "banner");
                return;
            }
            return;
        }
        WeakReference<C2193081AsM> weakReference2 = C2193081AsM.LJIIIZ;
        if (weakReference2 != null && (c2193081AsM = weakReference2.get()) != null) {
            C2193061AsK c2193061AsK = C2193081AsM.LJIIJJI;
            if (c2193061AsK != null && (c19720512Dr = c2193061AsK.LIZ) != null) {
                c2193081AsM.LJI(c19720512Dr, EnumC2193121AsQ.PUBLISH, str2);
                return;
            }
            return;
        }
        C2193061AsK c2193061AsK2 = C2193081AsM.LJIIJJI;
        if (c2193061AsK2 == null) {
            return;
        }
        SearchCSIProfilerBannerAPI searchCSIProfilerBannerAPI2 = SearchCSIProfilerBannerAPI.LIZIZ;
        C19720512Dr c19720512Dr4 = c2193061AsK2.LIZ;
        String str6 = c19720512Dr4.LJ;
        EnumC2193121AsQ enumC2193121AsQ2 = EnumC2193121AsQ.PUBLISH;
        String str7 = c19720512Dr4.LJIIZILJ;
        Integer num2 = c19720512Dr4.LJIIJ;
        String str8 = c19720512Dr4.LJIILL;
        searchCSIProfilerBannerAPI2.getClass();
        SearchCSIProfilerBannerAPI.LIZ(str6, enumC2193121AsQ2, str2, str7, num2, str8, "v2", "banner");
    }

    @Override // com.ss.android.ugc.aweme.search.csi.ISearchCSIService
    public final InterfaceC1259690isx LJFF(AwemeListFragmentImpl awemeListFragmentImpl) {
        if (C07BK.LIZ()) {
            return new C2193201AsY(awemeListFragmentImpl, new SearchCSIProfileBannerRepoV3(awemeListFragmentImpl));
        }
        return new C2193081AsM(awemeListFragmentImpl);
    }

    @Override // com.ss.android.ugc.aweme.search.csi.ISearchCSIService
    public final void LJ(String str, EnumC2193121AsQ enumC2193121AsQ, String str2, String str3, Integer num, String str4) {
        SearchCSIProfilerBannerAPI.LIZIZ.getClass();
        SearchCSIProfilerBannerAPI.LIZ(str, enumC2193121AsQ, str2, str3, num, str4, "v3", "card");
    }
}
