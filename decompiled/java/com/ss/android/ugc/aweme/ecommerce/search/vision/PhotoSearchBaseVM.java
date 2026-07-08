package com.ss.android.ugc.aweme.ecommerce.search.vision;

import X.AnonymousClass0956;
import X.C01GW;
import X.C07KY;
import X.C0PEM;
import X.C0QXR;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C123100dR;
import X.C1361400lX0;
import X.C13LP;
import X.C1499780p8C;
import X.C1507790pL7;
import X.C1701940uOG;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C21246818Cs;
import X.C2177208fy;
import X.C2188811AlT;
import X.C23250099c;
import X.C2365409Oq;
import X.C256740A4i;
import X.C275020AqC;
import X.C452501pT;
import X.C674850QdX;
import X.C674890Qdb;
import X.C674940Qdg;
import X.C675090Qdv;
import X.C675150Qe1;
import X.C675670Qer;
import X.C675920QfG;
import X.C675940QfI;
import X.C675950QfJ;
import X.C675970QfL;
import X.C676050QfT;
import X.C676090QfX;
import X.C676120Qfa;
import X.C676130Qfb;
import X.C676320Qfu;
import X.C676360Qfy;
import X.C676410Qg3;
import X.C676650QgR;
import X.C676770Qgd;
import X.C678130Qip;
import X.C724240Sb0;
import X.EnumC675700Qeu;
import X.EnumC675750Qez;
import X.EnumC675960QfK;
import X.EnumC675990QfN;
import X.EnumC676230Qfl;
import X.InterfaceC1478005qU;
import X.InterfaceC497601wk;
import X.InterfaceC676400Qg2;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig;
import com.ss.android.ugc.aweme.ecommerce.search.vision.mix.MixPhotoSearchAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchImageResponse;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.ecommerce.search.vision.request.MixPhotoSearchPreload;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS124S1100000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchBaseVM extends ViewModel implements InterfaceC676400Qg2 {
    public static final /* synthetic */ int LLJLLIL = 0;
    public PhotoSearchEntranceConfig LLILLJJLI;
    public PhotoSearchEnterParams LLILLL;
    public SearchResultParam LLILZ;
    public PhotoSearchResponse LLIZ;
    public JSONObject LLIZLLLIL;
    public List<String> LLJ;
    public RDPhotoSearchTraceTime LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public int LLJJJIL;
    public PageFinder LLJJJJ;
    public Map<String, ? extends Object> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public C1361400lX0 LLJLILLLLZIIL;
    public MixPhotoSearchAssem LLJLL;
    public final MutableLiveData<C676090QfX<PhotoSearchResponse>> LL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLILZIL = new MutableLiveData<>();
    public C674850QdX LLILZLL = new C674850QdX(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(118));
    public int LLJJJ = -1;

    public final void AQ2() {
        C674890Qdb c674890Qdb = MixPhotoSearchPreload.Companion;
        C674850QdX c674850QdX = this.LLILZLL;
        c674890Qdb.getClass();
        if (((Boolean) C256740A4i.LIZ.getValue()).booleanValue()) {
            C1499780p8C.LIZIZ("/aweme/v1/search/photo/bff/ecom/", null);
        } else if (c674850QdX != null) {
            C674940Qdg c674940QdgLIZ = C674890Qdb.LIZ(c674850QdX, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key_preload_hash", String.valueOf(c674940QdgLIZ.hashCode()));
            C1499780p8C.LIZIZ("/aweme/v1/search/photo/bff/ecom/", linkedHashMap);
        }
    }

    public final void BQ2() {
        if (this.LLJJL) {
            return;
        }
        this.LLJJL = true;
        CQ2("photo_search_result_action", new AwS589S0100000_10(this, 94));
    }

    public final void FQ2() {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams = this.LLILLL;
        if (photoSearchEnterParams == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null || photoSearchBusinessEnterParams.rootEnterFromType != C0QXR.VISUAL_SEARCH_FEED_MALL_BUTTON.getValue()) {
            return;
        }
        zQ2(null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (((Boolean) C275020AqC.LIZ.getValue()).booleanValue()) {
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZJ.clear();
            C675950QfJ.LIZLLL.clear();
        }
    }

    public static C11O8 wQ2(final String str) {
        C676320Qfu.LIZJ(AFwS241S0000000_10.get$arr$(427));
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0QgZ
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<C676050QfT> c09aj) {
                C1C7U.LIZ("PhotoSearchBaseVM@68d3.fetchImageModelByUri$2");
                C09JS c09js = C09JS.LIZ;
                String str2 = str;
                c09js.getClass();
                C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                new AwS124S1100000_10(c19482611Ke, str, 14).invoke(C1325290kal.LJFF(UriProtector.parse(C09JS.LIZ(str2))));
                C1C7U.LIZIZ("PhotoSearchBaseVM@68d3.fetchImageModelByUri$2");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final MutableLiveData DQ2(C674850QdX c674850QdX) {
        int value;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams = this.LLILLL;
        if (photoSearchEnterParams != null && (photoSearchToolsEnterParams = photoSearchEnterParams.toolsParams) != null) {
            photoSearchToolsEnterParams.setSearchSource(c674850QdX.searchSource);
        }
        PhotoSearchEnterParams photoSearchEnterParams2 = this.LLILLL;
        if (photoSearchEnterParams2 != null && (photoSearchBusinessEnterParams = photoSearchEnterParams2.businessParams) != null) {
            photoSearchBusinessEnterParams.setEnterMethod(c674850QdX.searchSource);
        }
        C675090Qdv.LIZ(c674850QdX, this.LLILLL, this.LLILLJJLI, this.LLJIJIL);
        this.LLILZLL = c674850QdX;
        AnonymousClass0956 anonymousClass0956LJ = null;
        Map<String, String> map = null;
        this.LL.setValue(new C676090QfX<>(null, EnumC675990QfN.START));
        this.LLIZ = null;
        this.LL.setValue(new C676090QfX<>(null, EnumC675990QfN.LOADING));
        long jCurrentTimeMillis = System.currentTimeMillis();
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime = this.LLJI;
        if (rDPhotoSearchTraceTime != null) {
            rDPhotoSearchTraceTime.setNetRequest(Long.valueOf(jCurrentTimeMillis));
        }
        int i = this.LLJJI;
        if (i > 0) {
            this.LLJJ = true;
        }
        this.LLJJI = i + 1;
        MixPhotoSearchAssem mixPhotoSearchAssem = this.LLJLL;
        if (mixPhotoSearchAssem != null) {
            C676320Qfu.LIZJ(AFwS241S0000000_10.get$arr$(430));
            if (mixPhotoSearchAssem.LLJJJJJIL) {
                mixPhotoSearchAssem.hp().reset();
                if (C724240Sb0.LIZ(mixPhotoSearchAssem) != null) {
                    NextLiveData<C675970QfL> nextLiveData = mixPhotoSearchAssem.hp().LLJJ;
                    PhotoSearchBaseVM photoSearchBaseVM = mixPhotoSearchAssem.LLJJIJIIJIL;
                    if (photoSearchBaseVM != null && photoSearchBaseVM.LLJJJJLIIL) {
                        value = EnumC675750Qez.LOADING_STYLE_DUAL_BALL.getValue();
                    } else {
                        value = EnumC675750Qez.LOADING_STYLE_SKELETON.getValue();
                    }
                    nextLiveData.setValue(new C675970QfL(value, mixPhotoSearchAssem.LLJJJJLIIL));
                }
                C678130Qip c678130Qip = mixPhotoSearchAssem.LLJJIJIL;
                if (c678130Qip != null) {
                    c678130Qip.LJFF();
                }
            }
            if (mixPhotoSearchAssem.getContext() != null) {
                AnonymousClass0956 anonymousClass0956 = mixPhotoSearchAssem.LLJJJJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C675670Qer c675670Qer = mixPhotoSearchAssem.LLJJJ;
                if (c675670Qer != null) {
                    EnumC675700Qeu enumC675700Qeu = EnumC675700Qeu.FIRST_SCREEN;
                    EnumC676230Qfl enumC676230Qfl = EnumC676230Qfl.USER_INTERACTION_TYPE_FIRST_REQUEST;
                    C675150Qe1 c675150Qe1 = mixPhotoSearchAssem.hp().LLILZ;
                    if (c675150Qe1 != null) {
                        map = c675150Qe1.LJIIJJI;
                    }
                    anonymousClass0956LJ = c675670Qer.LJ(enumC675700Qeu, enumC676230Qfl, c674850QdX, map, false);
                }
                mixPhotoSearchAssem.LLJJJJ = anonymousClass0956LJ;
            }
        }
        return this.LL;
    }

    public final void EQ2(PhotoSearchEnterParams photoSearchEnterParams) {
        PhotoSearchEntranceConfig photoSearchEntranceConfigLIZ;
        this.LLILLL = photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams;
        if (photoSearchBusinessEnterParams != null) {
            photoSearchEntranceConfigLIZ = C07KY.LIZ(Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType));
        } else {
            photoSearchEntranceConfigLIZ = null;
        }
        this.LLILLJJLI = photoSearchEntranceConfigLIZ;
    }

    public final void vQ2(View view) {
        String str;
        List listLJJLIIIJILLIZJL;
        try {
            PageFinder pageFinderVia = PageFinder.via(view);
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21246818Cs btmPageInfoV2 = btmSDK.getBtmPageInfoV2(pageFinderVia);
            String str2 = null;
            if (btmPageInfoV2 != null && (str = btmPageInfoV2.LIZIZ) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) != null) {
                str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a2270.");
            sbLIZ.append(str2);
            sbLIZ.append(".c0.d0");
            this.LLJJJJJIL = BtmSDK.createReportParams$default(btmSDK, C2188811AlT.LIZIZ(sbLIZ), pageFinderVia, null, 4, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final String xQ2(String str) {
        if (str != null && C123100dR.LIZ(str)) {
            return (String) ((ConcurrentHashMap) this.LLJILJILJ.getValue()).get(str);
        }
        return this.LLJIJIL;
    }

    public final void yQ2(C676770Qgd c676770Qgd) {
        Integer numValueOf;
        String str;
        String str2;
        int i;
        String str3;
        int i2;
        String str4;
        Integer numValueOf2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchImageResponse photoSearchImageResponse;
        List<String> boxDetection;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams4;
        int i3 = 0;
        this.LLJJJIL = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime = this.LLJI;
        if (rDPhotoSearchTraceTime != null) {
            rDPhotoSearchTraceTime.setNetReceive(Long.valueOf(jCurrentTimeMillis));
        }
        Throwable exc = c676770Qgd.LIZJ;
        if (exc == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mix failed: ");
            sbLIZ.append(c676770Qgd.LIZ);
            exc = new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("root_enter_from_type: ");
        PhotoSearchEnterParams photoSearchEnterParams = this.LLILLL;
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams4 = photoSearchEnterParams.businessParams) != null) {
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams4.rootEnterFromType);
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append("; enter_method: ");
        PhotoSearchEnterParams photoSearchEnterParams2 = this.LLILLL;
        if (photoSearchEnterParams2 != null && (photoSearchBusinessEnterParams3 = photoSearchEnterParams2.businessParams) != null) {
            str = photoSearchBusinessEnterParams3.enterMethod;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(";photo_search_module: ");
        PhotoSearchEnterParams photoSearchEnterParams3 = this.LLILLL;
        if (photoSearchEnterParams3 != null && (photoSearchLogEnterParams = photoSearchEnterParams3.logParams) != null) {
            str2 = photoSearchLogEnterParams.photoSearchModule;
        } else {
            str2 = null;
        }
        sbLIZ2.append(str2);
        sbLIZ2.append(';');
        C1AF0.LJ(new Exception(C2188811AlT.LIZIZ(sbLIZ2), exc));
        try {
            C676320Qfu.LIZ(exc.toString());
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (!this.LLJJ) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("request_type", i);
            jSONObject.put("params", 0);
            jSONObject.put("api_path", "/aweme/v1/search/photo/ecom/");
            jSONObject.put("rd_page_type", "native");
            jSONObject.put("page_name", "photo_search_result");
            PhotoSearchEnterParams photoSearchEnterParams4 = this.LLILLL;
            if (photoSearchEnterParams4 != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams4.businessParams) != null) {
                str3 = photoSearchBusinessEnterParams2.enterMethod;
            } else {
                str3 = null;
            }
            jSONObject.put("enter_method", str3);
            jSONObject.put("is_success", 0);
            C676050QfT c676050QfT = this.LLILZLL.photoSearch;
            if (c676050QfT != null && c676050QfT.image != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("has_request_image", i2);
            C676050QfT c676050QfT2 = this.LLILZLL.photoSearch;
            if (c676050QfT2 != null) {
                str4 = c676050QfT2.detectionIdx;
            } else {
                str4 = null;
            }
            jSONObject.put("request_detection_index", str4);
            PhotoSearchResponse photoSearchResponse = this.LLIZ;
            if (photoSearchResponse != null && (photoSearchImageResponse = photoSearchResponse.LIZ) != null && (boxDetection = photoSearchImageResponse.getBoxDetection()) != null && (!boxDetection.isEmpty())) {
                i3 = 1;
            }
            jSONObject.put("has_response_detection", i3);
            jSONObject.put(Scene.SCENE_SERVICE, "result");
            jSONObject.put("msg", String.valueOf(exc.getMessage()));
            jSONObject.put("code", String.valueOf(C2177208fy.LIZ(exc)));
            PhotoSearchEnterParams photoSearchEnterParams5 = this.LLILLL;
            if (photoSearchEnterParams5 != null && (photoSearchBusinessEnterParams = photoSearchEnterParams5.businessParams) != null) {
                numValueOf2 = Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType);
            } else {
                numValueOf2 = null;
            }
            jSONObject.put("root_enter_from_type", numValueOf2);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_photo_search_request", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJJ = true;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C675920QfG(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(android.view.View r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM.zQ2(android.view.View):void");
    }

    public final void CQ2(String str, Function1<? super JSONObject, Unit> function1) {
        C675940QfI.LIZIZ(str, this.LLILLL, function1);
    }

    @Override // X.InterfaceC676400Qg2
    public final void FD1(C676120Qfa c676120Qfa, Context context, Function0<Unit> function0) {
        String searchSource;
        String str;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        C676650QgR c676650QgR;
        C674850QdX c674850QdX;
        String str5;
        String str6;
        String str7;
        C676050QfT c676050QfT;
        C676050QfT c676050QfT2;
        String str8;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        String str9;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        Map<String, Object> map;
        HashMap<String, Object> map2;
        C676360Qfy c676360Qfy = c676120Qfa.LIZLLL;
        if (c676360Qfy != null && (map = c676360Qfy.LIZJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                PhotoSearchEnterParams photoSearchEnterParams2 = this.LLILLL;
                if (photoSearchEnterParams2 != null && (map2 = photoSearchEnterParams2.photoSearchExtra) != null) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        C676360Qfy c676360Qfy2 = c676120Qfa.LIZLLL;
        if (c676360Qfy2 == null || (searchSource = c676360Qfy2.LIZ) == null) {
            searchSource = c676120Qfa.LIZ.getSearchSource();
        }
        PhotoSearchEnterParams photoSearchEnterParams3 = this.LLILLL;
        if (photoSearchEnterParams3 != null && (photoSearchBusinessEnterParams3 = photoSearchEnterParams3.businessParams) != null) {
            photoSearchBusinessEnterParams3.setEnterMethod(searchSource);
        }
        PhotoSearchEnterParams photoSearchEnterParams4 = this.LLILLL;
        TypedByteArray typedByteArrayLIZIZ = null;
        if (photoSearchEnterParams4 != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams4.businessParams) != null) {
            C676410Qg3 c676410Qg3 = c676120Qfa.LIZIZ;
            if (c676410Qg3 != null) {
                str9 = c676410Qg3.LIZ;
            } else {
                str9 = null;
            }
            photoSearchBusinessEnterParams2.setEnterProductId(str9);
        }
        PhotoSearchEnterParams photoSearchEnterParams5 = this.LLILLL;
        if (photoSearchEnterParams5 != null && (photoSearchToolsEnterParams = photoSearchEnterParams5.toolsParams) != null) {
            photoSearchToolsEnterParams.setSearchSource(searchSource);
        }
        C676410Qg3 c676410Qg32 = c676120Qfa.LIZIZ;
        if (c676410Qg32 != null) {
            str = c676410Qg32.LIZ;
        } else {
            str = null;
        }
        this.LLJILJIL = str;
        C676360Qfy c676360Qfy3 = c676120Qfa.LIZLLL;
        if (c676360Qfy3 != null && (str8 = c676360Qfy3.LIZIZ) != null && (photoSearchEnterParams = this.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            photoSearchBusinessEnterParams.setAttachProducts(str8);
        }
        FQ2();
        EnumC675960QfK enumC675960QfK = c676120Qfa.LIZ;
        if (enumC675960QfK != EnumC675960QfK.SWITCH_ENTITY && enumC675960QfK != EnumC675960QfK.USER_DRAW && enumC675960QfK != EnumC675960QfK.VISUAL_NON_SHOPPABLE_VIDEOS && (c676650QgR = c676120Qfa.LIZJ) != null && (c674850QdX = this.LLILZLL) != null && c674850QdX.photoSearch != null) {
            String str10 = c676650QgR.LIZIZ;
            if (c674850QdX != null && (c676050QfT2 = c674850QdX.photoSearch) != null) {
                str5 = c676050QfT2.detectionIdx;
            } else {
                str5 = null;
            }
            if (Intrinsics.LJFF(str10, str5)) {
                C676650QgR c676650QgR2 = c676120Qfa.LIZJ;
                if (c676650QgR2 != null) {
                    str6 = c676650QgR2.LIZ;
                } else {
                    str6 = null;
                }
                C674850QdX c674850QdX2 = this.LLILZLL;
                if (c674850QdX2 != null && (c676050QfT = c674850QdX2.photoSearch) != null) {
                    str7 = c676050QfT.detection;
                } else {
                    str7 = null;
                }
                if (Intrinsics.LJFF(str6, str7)) {
                    return;
                }
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
        AwS219S0300000_10 awS219S0300000_10 = new AwS219S0300000_10(this, c676120Qfa, context, 15);
        C676050QfT c676050QfT3 = new C676050QfT(null, null, null, null, null, null, null);
        C676650QgR c676650QgR3 = c676120Qfa.LIZJ;
        if (c676650QgR3 != null) {
            str2 = c676650QgR3.LIZ;
        } else {
            str2 = null;
        }
        c676050QfT3.setDetection(str2);
        C676650QgR c676650QgR4 = c676120Qfa.LIZJ;
        if (c676650QgR4 != null) {
            str3 = c676650QgR4.LIZIZ;
        } else {
            str3 = null;
        }
        c676050QfT3.setDetectionIdx(str3);
        C676410Qg3 c676410Qg33 = c676120Qfa.LIZIZ;
        if (c676410Qg33 != null) {
            str4 = c676410Qg33.LIZ;
        } else {
            str4 = null;
        }
        String strXQ2 = xQ2(str4);
        if (C123100dR.LIZ(strXQ2)) {
            c676050QfT3.setImageTosUri(strXQ2);
            awS219S0300000_10.invoke(c676050QfT3);
            return;
        }
        C676410Qg3 c676410Qg34 = c676120Qfa.LIZIZ;
        if (c676410Qg34 != null && (bArr = c676410Qg34.LIZIZ) != null && bArr.length != 0) {
            byte[] bArr2 = c676410Qg34.LIZIZ;
            if (bArr2 != null) {
                typedByteArrayLIZIZ = C2365409Oq.LIZIZ(bArr2);
            }
            c676050QfT3.setImage(typedByteArrayLIZIZ);
            awS219S0300000_10.invoke(c676050QfT3);
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C676130Qfb(c676120Qfa, this, c676050QfT3, System.currentTimeMillis(), awS219S0300000_10, null), 2);
    }
}
