package com.ss.android.ugc.aweme.ecommerce.search.vision.request;

import X.C1499810p8F;
import X.C1515820pY4;
import X.C15O7;
import X.C2188811AlT;
import X.C674800QdS;
import X.C674810QdT;
import X.C674830QdV;
import X.C674850QdX;
import X.C674890Qdb;
import X.C674940Qdg;
import X.C674980Qdk;
import X.C675150Qe1;
import X.C676050QfT;
import X.C786410Ut5;
import X.EnumC675700Qeu;
import X.EnumC676230Qfl;
import X.InterfaceC2385309Wh;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.config.ECSearchVerticalChunkSizeListSettings;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchForceInterveneCard;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class MixPhotoSearchPreload implements InterfaceC727570SgN<EcSearchMixApi.RealApi, C15O7<C1515820pY4<n>>> {
    public static final int $stable = 0;
    public static final C674890Qdb Companion = new C674890Qdb();

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    private final C674800QdS createRequestParam() throws Exception {
        try {
            return new C674800QdS("", "", "", 0, 0, "", null, 0L, 0, "", null, null, null, null, null, null, null, null, null, null, 0, null, "1.0", null, null, null, null, null, null, null, null, null, null, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    private final PreloadExtraInfo getPreloadExtraInfo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key_preload_hash");
        return new PreloadExtraInfo(-1, "search_result", "search_result", "/aweme/v1/search/photo/bff/ecom/", arrayList);
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, EcSearchMixApi.LIZ, null, 30000, false, 24);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C15O7<C1515820pY4<n>> preload2(Bundle bundle, Function1<? super Class<EcSearchMixApi.RealApi>, ? extends EcSearchMixApi.RealApi> function1) {
        Serializable serializable;
        C674850QdX c674850QdX;
        String str;
        if (bundle != null) {
            serializable = bundle.getSerializable("photo_search_request");
        } else {
            serializable = null;
        }
        if (serializable instanceof C674850QdX) {
            c674850QdX = (C674850QdX) serializable;
        } else {
            c674850QdX = null;
        }
        if (c674850QdX != null) {
            C675150Qe1 c675150Qe1 = new C675150Qe1(ECSearchVerticalChunkSizeListSettings.LIZ().chunkSizeList.toString(), EcSearchMixApi.LIZ, createRequestParam(), null, c674850QdX, 8);
            c675150Qe1.LIZ = 0L;
            c675150Qe1.LIZIZ = 0;
            c675150Qe1.LIZJ = EnumC675700Qeu.FIRST_SCREEN.getValue();
            c675150Qe1.LJIIIZ = EnumC676230Qfl.USER_INTERACTION_TYPE_FIRST_REQUEST.getValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Thread threadU3 = C786410Ut5.u3();
            String name = threadU3.getName();
            long id = threadU3.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload: [PRELOAD_REQUEST] calling searchPhotoMixListByChunkPost, timestamp=");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(", threadName=");
            sbLIZ.append(name);
            sbLIZ.append(", threadId=");
            sbLIZ.append(id);
            sbLIZ.append(", imageTosUrl=");
            C676050QfT c676050QfT = c674850QdX.photoSearch;
            if (c676050QfT != null) {
                str = c676050QfT.imageTosUri;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(", searchId=");
            sbLIZ.append(c674850QdX.searchId);
            C2188811AlT.LIZIZ(sbLIZ);
            Companion.getClass();
            C674940Qdg c674940QdgLIZ = C674890Qdb.LIZ(c674850QdX, null);
            String strValueOf = String.valueOf(c674940QdgLIZ.hashCode());
            C15O7<C1515820pY4<n>> c15o7CreateBusinessFetchTask = createBusinessFetchTask(c675150Qe1, getPreloadExtraInfo(), strValueOf, function1);
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C674810QdT.LIZJ.put("/aweme/v1/search/photo/bff/ecom/", new C674980Qdk(strValueOf, c674940QdgLIZ, jCurrentTimeMillis2));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("recordPhotoPreloadRequest: preloadKey=");
                sbLIZ2.append(strValueOf);
                sbLIZ2.append(", path=");
                sbLIZ2.append("/aweme/v1/search/photo/bff/ecom/");
                sbLIZ2.append(", imageTosUrl=");
                sbLIZ2.append(c674940QdgLIZ.LIZ);
                sbLIZ2.append(", startTime=");
                sbLIZ2.append(jCurrentTimeMillis2);
                C2188811AlT.LIZIZ(sbLIZ2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (c15o7CreateBusinessFetchTask != null) {
                c15o7CreateBusinessFetchTask.LIZLLL(new InterfaceC2385309Wh() { // from class: X.0Qdh
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("MixPhotoSearchPreload@e458.preload$1");
                        c15o7.LJIILL();
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("MixPhotoSearchPreload@e458.preload$1");
                        return unit;
                    }
                });
            }
            if (c15o7CreateBusinessFetchTask != null) {
                return c15o7CreateBusinessFetchTask;
            }
            throw new IllegalStateException("Failed to create business fetch task");
        }
        throw new IllegalArgumentException("PhotoSearchRequest is required");
    }

    private final C15O7<C1515820pY4<n>> createBusinessFetchTask(C675150Qe1 c675150Qe1, PreloadExtraInfo preloadExtraInfo, String str, Function1<? super Class<EcSearchMixApi.RealApi>, ? extends EcSearchMixApi.RealApi> function1) {
        TypedByteArray typedByteArray;
        String str2;
        String str3;
        String str4;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String strLJLIL;
        C674850QdX c674850QdX = c675150Qe1.LJII;
        if (c674850QdX == null) {
            c674850QdX = new C674850QdX(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        String str5 = c675150Qe1.LJ;
        C674830QdV c674830QdV = new C674830QdV();
        String str6 = c674850QdX.apiVersion;
        C676050QfT c676050QfT = c674850QdX.photoSearch;
        if (c676050QfT != null) {
            typedByteArray = c676050QfT.image;
            str2 = c676050QfT.imageTosUri;
            str3 = c676050QfT.detection;
            str4 = c676050QfT.detectionIdx;
        } else {
            typedByteArray = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        String str7 = c674850QdX.searchChannel;
        if (str7 == null) {
            str7 = "tiktok_ecom";
        }
        long j = c675150Qe1.LIZ;
        String str8 = c674850QdX.keyword;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = c674850QdX.enterFrom;
        Integer num = c674850QdX.count;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = c674850QdX.hotSearch;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        String str10 = c674850QdX.searchId;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = c674850QdX.lastSearchId;
        String str12 = c674850QdX.source;
        if (str12 == null) {
            str12 = "";
        }
        String str13 = c674850QdX.searchSource;
        if (str13 == null) {
            str13 = "";
        }
        Integer num3 = c674850QdX.correctType;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        String str14 = c674850QdX.searchContext;
        String str15 = c674850QdX.attachProducts;
        String str16 = c674850QdX.trafficSourceList;
        String str17 = c674850QdX.ecSearchSessionId;
        String str18 = c674850QdX.searchSessionId;
        String str19 = c674850QdX.productDetailUri;
        Integer num4 = c674850QdX.recallShield;
        String str20 = c674850QdX.photoSearchExtra;
        List<PhotoSearchForceInterveneCard> list = c674850QdX.forceInterveneCard;
        Long l = c674850QdX.endToEndSearchSessionId;
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null) {
            strLJLIL = iEcomSearchService.LJLIL(null, "");
        } else {
            strLJLIL = null;
        }
        return C674830QdV.LIZ(c674830QdV, str5, str7, j, str8, str9, iIntValue, iIntValue2, str10, str11, str12, str13, iIntValue3, str14, str15, str16, str17, c674850QdX.userRtActs, str6, str18, c674850QdX.passThroughParams, c674850QdX.enterFromSecond, strLJLIL, c675150Qe1.LJIIIZ, c674850QdX.rootEnterFromType, typedByteArray, str2, str3, str4, c674850QdX.photoProductInfo, c674850QdX.ecPageFeatureParams, list, Long.valueOf(c675150Qe1.LIZIZ), str19, num4, str20, l, preloadExtraInfo, null, str, function1, 32);
    }
}
