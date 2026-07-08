package com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service;

import X.C098200Yq;
import X.C1388190mED;
import X.C13LP;
import X.C1521105xR;
import X.C1740590vOb;
import X.C1740600vOc;
import X.C1740710vOn;
import X.C1768000w6o;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C21244318Bt;
import X.C2341109Fh;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import X.EnumC1741460vQ0;
import X.EnumC1741490vQ3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.BackButtonConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.NodeTagAssem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgBackButtonServiceOfficial implements IEcUgBackButtonServiceOfficial {
    public WeakReference<NodeTagAssem> LIZ;
    public String LIZIZ;
    public String LIZJ;
    public ImageUrlModel LIZLLL;
    public String LJ;
    public final List<Function0<Unit>> LJFF = new ArrayList();
    public final Map<Activity, C1740710vOn> LJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final void releaseBackButton() {
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AFwS215S0000000_26 aFwS215S0000000_26 = AFwS215S0000000_26.get$arr$(179);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(aFwS215S0000000_26);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final String LIZ() {
        NodeTagAssem nodeTagAssem;
        WeakReference<NodeTagAssem> weakReference = this.LIZ;
        if (weakReference == null || (nodeTagAssem = weakReference.get()) == null) {
            return null;
        }
        return nodeTagAssem.LL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final NodeTagAssem LIZJ() {
        NodeTagAssem nodeTagAssem = new NodeTagAssem();
        this.LIZ = new WeakReference<>(nodeTagAssem);
        return nodeTagAssem;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final boolean getInFYP() {
        return Intrinsics.LJFF(LIZ(), "For You") || Intrinsics.LJFF(LIZ(), "page_profile");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final boolean getInMallTab() {
        return Intrinsics.LJFF(LIZ(), "SHOP_MALL") || Intrinsics.LJFF(LIZ(), "Shop");
    }

    public static C1740600vOc LJII(PageFinder pageFinder) {
        try {
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = EnumC1741460vQ0.DIVERSION_BACK_BUTTON.getCCode() + '.' + EnumC1741490vQ3.DIVERSION_BACK_BUTTON.getDCode();
            c21244318Bt.LIZIZ = pageFinder;
            return new C1740600vOc(c21244318Bt, null);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static Integer LJIIIIZZ(String str) {
        Object c098200Yq;
        if (str.length() == 9 && str.charAt(0) == '#') {
            str = "#" + str.substring(7) + str.substring(1, 7);
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final boolean LIZLLL(BackButtonConfig backButtonConfig) {
        String str = backButtonConfig.schema;
        if (str == null || a0.LJJJIL(str)) {
            if (!C13LP.LJJJJ(backButtonConfig.logicType, BackButtonConfig.LIZ)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final void LJ(Function0<Unit> function0) {
        if (!((ArrayList) this.LJFF).contains(function0)) {
            ((ArrayList) this.LJFF).add(function0);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final void LJI(AwS570S0100000_26 awS570S0100000_26) {
        ((ArrayList) this.LJFF).remove(awS570S0100000_26);
    }

    public static void LJIIJ(Map map, boolean z) {
        if (z) {
            map.put("page_name", "mall");
            map.remove("page_url");
        } else {
            map.remove("page_name");
        }
        C1768000w6o.LIZ.getClass();
        C1768000w6o.LIZIZ("tiktokec_button_show", map);
    }

    public static void LJIIJJI(View view, String str) {
        int marginStart;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginEnd = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        Integer numValueOf = Integer.valueOf(marginStart);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
        }
        Integer numValueOf3 = Integer.valueOf(marginEnd);
        if (Intrinsics.LJFF(str, "center_style")) {
            i2 = 26;
        } else {
            i2 = 28;
        }
        C426750GoL.LJIIIZ(view, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)))), false, 16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    public final void prepareBackButton(String str, ImageUrlModel imageUrlModel, String str2) {
        String strLIZ;
        this.LIZJ = str;
        this.LIZLLL = imageUrlModel;
        this.LJ = str2;
        if (getInMallTab()) {
            strLIZ = null;
        } else {
            strLIZ = LIZ();
        }
        this.LIZIZ = strLIZ;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 652);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS570S0100000_26);
    }

    public static void LJIIIZ(Context context, C1740600vOc c1740600vOc, String str, String str2) {
        String strLIZJ;
        String string;
        if (str != null && !a0.LJJJIL(str)) {
            Uri uriBuild = UriProtector.parse(str);
            Pair[] pairArr = {new Pair("init_time", Long.valueOf(System.currentTimeMillis()))};
            if (!uriBuild.isOpaque()) {
                Set<String> setLLIIIZ = C13LP.LLIIIZ(UriProtector.getQueryParameterNames(uriBuild));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair pair = pairArr[0];
                Object first = pair.getFirst();
                Object second = pair.getSecond();
                if (second != null) {
                    string = second.toString();
                } else {
                    string = null;
                }
                String strLIZ = C1521105xR.LIZ(string);
                if (strLIZ != null && setLLIIIZ.remove(first)) {
                    linkedHashMap.put(first, strLIZ);
                }
                if (!linkedHashMap.isEmpty()) {
                    Uri.Builder builderClearQuery = uriBuild.buildUpon().clearQuery();
                    for (String str3 : setLLIIIZ) {
                        builderClearQuery.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, str3));
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    uriBuild = builderClearQuery.build();
                }
            }
            String string2 = uriBuild.toString();
            if (c1740600vOc != null && (strLIZJ = C1740590vOb.LIZJ(c1740600vOc, string2)) != null) {
                string2 = strLIZJ;
            }
            SmartRouter.buildRoute(context, string2).open();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && str2 != null) {
            Hox.LLJILJIL.LIZ(c19egLIZIZ).TQ2(new Bundle(), str2, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01ac  */
    /* JADX WARN: Type inference failed for: r0v49, types: [X.0vOo] */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1740720vOo LJFF(com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment r23, final android.view.ViewGroup r24, com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg r25, java.util.Map r26, kotlin.jvm.internal.AwS570S0100000_26 r27) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.EcUgBackButtonServiceOfficial.LJFF(com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment, android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg, java.util.Map, kotlin.jvm.internal.AwS570S0100000_26):X.0vOo");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:38|(2:40|(1:96)(1:44))(1:97)|45|(1:47)|48|(1:95)(1:52)|(1:54)|55|(1:61)(1:94)|62|(1:64)|65|(3:67|(1:69)(2:90|(1:92))|70)(1:93)|71|(1:89)(1:75)|(1:77)|78|(1:88)(1:82)|(1:84)|85|(26:226|98|(1:100)|(12:228|105|(22:109|221|(8:242|114|(3:116|(3:119|(3:253|121|125)(1:254)|117)|252)|124|(1:130)(1:129)|131|(1:133)(1:134)|135)(2:113|136)|137|(1:139)(1:140)|141|246|172|244|173|219|174|(0)|177|(0)|181|(0)|(0)|186|(0)|189|190)|200|251|(3:240|203|250)|206|(0)|(0)|211|(0)|214)|146|236|147|(13:238|149|234|150|222|151|217|152|248|153|(1:155)|156|(1:158)(1:159))(1:170)|224|171|246|172|244|173|219|174|(0)|177|(0)|181|(0)|(0)|186|(0)|189|190)|103|(0)|146|236|147|(0)(0)|224|171|246|172|244|173|219|174|(0)|177|(0)|181|(0)|(0)|186|(0)|189|190) */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03ea, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03eb, code lost:
    
        r2 = null;
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b1 A[Catch: all -> 0x03e2, TryCatch #1 {all -> 0x03e2, blocks: (B:174:0x038d, B:176:0x03b1), top: B:219:0x038d }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.19EG, android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [X.19EG] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [X.19EG] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.view.ViewGroup r31, X.C1740690vOl r32, java.lang.String r33, kotlin.jvm.internal.AwS570S0100000_26 r34, X.C1740700vOm r35, X.InterfaceC1364105Vn r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.EcUgBackButtonServiceOfficial.LIZIZ(android.view.ViewGroup, X.0vOl, java.lang.String, kotlin.jvm.internal.AwS570S0100000_26, X.0vOm, X.05Vn):java.lang.Object");
    }
}
