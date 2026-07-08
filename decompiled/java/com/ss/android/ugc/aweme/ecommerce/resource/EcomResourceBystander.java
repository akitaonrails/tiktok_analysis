package com.ss.android.ugc.aweme.ecommerce.resource;

import X.AnonymousClass0317;
import X.C034S;
import X.C0X52;
import X.C1018703yb;
import X.C1066210dqt;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1191504lN;
import X.C1322390kW5;
import X.C1326620kcu;
import X.C1326660kcy;
import X.C1326670kcz;
import X.C1326780kdA;
import X.C1326840kdG;
import X.C1326860kdI;
import X.C1326870kdJ;
import X.C1334150kp3;
import X.C1334190kp7;
import X.C13BV;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C13LP;
import X.C1507890pLH;
import X.C1507990pLR;
import X.C1532680pzG;
import X.C1533950q1J;
import X.C1535630q41;
import X.C15438062q;
import X.C1554060qXk;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1879607Xu;
import X.C1879707Xv;
import X.C1AQS;
import X.C20156213to;
import X.C20158713uD;
import X.C20159013uG;
import X.C20160213uS;
import X.C20160313uT;
import X.C2128108Vj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2371409Qy;
import X.C259800zU;
import X.C817503Hh;
import X.EnumC1331380kka;
import X.EnumC1335820krk;
import X.EnumC1533980q1M;
import X.EnumC1778510wNl;
import X.EnumC20158813uE;
import X.InterfaceC1508110pLd;
import X.InterfaceC1631630sYr;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.tiktok.forestx.RequestParamsX;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomResourceBystander implements NetworkPartner.Bystander {
    public static final EcomResourceBystander LIZ = new EcomResourceBystander();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    public static final Bitmap.Config LJIILJJIL(EcomResourceImageModel ecomResourceImageModel) {
        Boolean bool = ecomResourceImageModel.rgb565;
        if (bool != null) {
            bool.booleanValue();
            if (ecomResourceImageModel.rgb565.booleanValue()) {
                return Bitmap.Config.RGB_565;
            }
            return Bitmap.Config.ARGB_8888;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List[]] */
    public static List[] LIZIZ(List list, Map map) {
        ?? arrayList;
        C1879707Xv next;
        C1879607Xu c1879607Xu;
        C1879707Xv c1879707Xv = new C1879707Xv(null, null, 15);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C1879707Xv c1879707Xv2 = c1879707Xv;
                for (String str : a0.LJJLIIIJILLIZJL(((EcomResourceImageModel) obj).path, new String[]{"/"}, 0, 6)) {
                    Iterator<C1879707Xv> it2 = c1879707Xv2.LIZJ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.LIZ, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C1879707Xv c1879707Xv3 = next;
                    if (c1879707Xv3 == null) {
                        LIZ.getClass();
                        String strLJJIFFI = u.LJJIFFI(str, "<.>", "<>", false);
                        if (a0.LJJIIZI(strLJJIFFI, e3.d, false)) {
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJIFFI, new String[]{e3.d}, 0, 6);
                            c1879607Xu = new C1879607Xu(u.LJJIFFI((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), "<>", e3.d, false), listLJJLIIIJILLIZJL.subList(1, listLJJLIIIJILLIZJL.size()));
                        } else {
                            c1879607Xu = new C1879607Xu(u.LJJIFFI(strLJJIFFI, "<>", e3.d, false), C13BV.INSTANCE);
                        }
                        c1879707Xv3 = new C1879707Xv(str, c1879607Xu, 12);
                        c1879707Xv2.LIZJ.add(c1879707Xv3);
                    }
                    c1879707Xv2 = c1879707Xv3;
                }
                c1879707Xv2.LIZLLL.add(Integer.valueOf(i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List[] listArr = new List[list.size()];
        LJ(list, listArr, map, c1879707Xv);
        int size = list.size();
        ?? r4 = new List[size];
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = listArr[i3];
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (C1533950q1J.LJ((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            r4[i3] = arrayList;
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.util.ArrayList] */
    public static Object LJIJ(Object obj, List list) {
        String str;
        boolean z;
        String str2;
        T tLJIIJ;
        String str3;
        Type type;
        List list2;
        T t;
        List list3;
        String string;
        boolean z2;
        List listLJJLIIIJILLIZJL;
        boolean z3;
        Map map;
        Object obj2;
        boolean z4;
        if (obj == 0) {
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = obj;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            if (c259800zU.element != 0) {
                boolean z5 = false;
                if (Intrinsics.LJFF(str4, "jsonify")) {
                    T t2 = c259800zU.element;
                    if (t2 instanceof String) {
                        str = (String) t2;
                    } else {
                        str = null;
                    }
                    if (str != null && u.LJJIIJZLJL(str, e3.e, false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        T t3 = c259800zU.element;
                        if (t3 instanceof String) {
                            str3 = (String) t3;
                        } else {
                            str3 = null;
                        }
                        try {
                            Gson gsonLJFF = C1741890vQh.LJFF();
                            C1120604Zw.LIZ.getClass();
                            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                z5 = true;
                            }
                            if (!z5) {
                                type = new TypeToken<ArrayList<HashMap<String, Object>>>() { // from class: X.0x9i
                                }.getType();
                            } else {
                                C13JX c13jx = KTypeProjection.LIZJ;
                                C13JW c13jwLJII = C13LE.LJII(String.class);
                                c13jx.getClass();
                                type = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(ArrayList.class, C13JX.LIZ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class))))));
                            }
                            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str3, type);
                            boolean z6 = objFromJson instanceof ArrayList;
                            tLJIIJ = objFromJson;
                            if (!z6) {
                                tLJIIJ = 0;
                            }
                        } catch (s e) {
                            TryCatchGuardChecker.doCheck(e);
                            tLJIIJ = 0;
                        }
                    } else {
                        T t4 = c259800zU.element;
                        if (t4 instanceof String) {
                            str2 = (String) t4;
                        } else {
                            str2 = null;
                        }
                        tLJIIJ = C1741890vQh.LJIIJ(str2);
                    }
                    c259800zU.element = tLJIIJ;
                } else if (Intrinsics.LJFF(str4, "all")) {
                    T t6 = c259800zU.element;
                    boolean z7 = t6 instanceof List;
                    T t7 = t6;
                    if (!z7) {
                        t7 = 0;
                    }
                    c259800zU.element = t7;
                } else if (TextUtils.isDigitsOnly(str4)) {
                    T t8 = c259800zU.element;
                    if (t8 instanceof List) {
                        list2 = (List) t8;
                    } else {
                        list2 = null;
                    }
                    if (list2 != null) {
                        try {
                            t = list2.get(CastIntegerProtector.parseInt(str4));
                        } catch (CancellationException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw e2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            t = 0;
                        }
                        c259800zU.element = t;
                    } else {
                        t = 0;
                        c259800zU.element = t;
                    }
                } else if (u.LJJIIJZLJL(str4, "if(", false) && u.LJIIZILJ(str4, ")", false)) {
                    String strLJJLIL = a0.LJJLIL(str4, "if(", str4);
                    String strLJJZ = a0.LJJZ(strLJJLIL, ")", strLJJLIL);
                    if (a0.LJJIIZI(strLJJZ, "==", false)) {
                        listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJZ, new String[]{"=="}, 0, 6);
                        z3 = true;
                    } else {
                        if (!a0.LJJIIZI(strLJJZ, "!=", false)) {
                            return null;
                        }
                        listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJZ, new String[]{"!="}, 0, 6);
                        z3 = false;
                    }
                    if (listLJJLIIIJILLIZJL.size() < 2) {
                        return null;
                    }
                    T t9 = c259800zU.element;
                    if (t9 instanceof Map) {
                        if (Intrinsics.LJFF(String.valueOf(((Map) t9).get(ListProtector.get(listLJJLIIIJILLIZJL, 0))), ListProtector.get(listLJJLIIIJILLIZJL, 1)) != z3) {
                            c259800zU.element = null;
                        }
                    } else if (t9 instanceof List) {
                        ?? arrayList = new ArrayList();
                        for (Object obj3 : (List) t9) {
                            if (obj3 instanceof Map) {
                                map = (Map) obj3;
                            } else {
                                map = null;
                            }
                            if (map != null) {
                                obj2 = map.get(ListProtector.get(listLJJLIIIJILLIZJL, 0));
                            } else {
                                obj2 = null;
                            }
                            if (Intrinsics.LJFF(String.valueOf(obj2), ListProtector.get(listLJJLIIIJILLIZJL, 1)) == z3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                arrayList.add(obj3);
                            }
                        }
                        c259800zU.element = arrayList;
                    }
                } else if (u.LJJIIJZLJL(str4, e3.e, false) && u.LJIIZILJ(str4, e3.f, false)) {
                    String strSubstring = str4.substring(1, str4.length() - 1);
                    LIZ.getClass();
                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(strSubstring, new String[]{"-"}, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listLJJLIIIJILLIZJL2.iterator();
                    while (true) {
                        String str5 = "";
                        while (it3.hasNext()) {
                            string = a0.LJLIIIL((String) it3.next()).toString();
                            if (string.length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                str5 = "-";
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str5);
                        sbLIZ.append(string);
                        arrayList2.add(Integer.valueOf(CastIntegerProtector.parseInt(C2188811AlT.LIZIZ(sbLIZ))));
                    }
                    T t10 = c259800zU.element;
                    if (t10 instanceof List) {
                        list3 = (List) t10;
                    } else {
                        list3 = null;
                    }
                    if (list3 != null && arrayList2.size() == 2) {
                        int iIntValue = ((Number) ListProtector.get(arrayList2, 0)).intValue();
                        if (iIntValue < 0) {
                            iIntValue += list3.size();
                        }
                        int iIntValue2 = ((Number) ListProtector.get(arrayList2, 1)).intValue();
                        if (iIntValue2 <= 0) {
                            iIntValue2 += list3.size();
                        }
                        c259800zU.element = list3.subList(iIntValue, iIntValue2);
                    }
                }
            }
        }
        return c259800zU.element;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        if (c0x52 != null && c0x52.LIZJ()) {
            EcomResourcePreloadModel[] ecomResourcePreloadModelArr = C20160313uT.LIZ;
            if (C20160313uT.LIZJ(request.getPath()) && !request.isResponseStreaming()) {
                String url = request.getUrl();
                if (url != null && a0.LJJIIZI(url, "preload=1", false)) {
                    return;
                }
                TypedInput typedInput = c0x52.LIZ.LJ;
                if (!(typedInput instanceof TypedByteArray)) {
                    return;
                }
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2128108Vj(typedInput, request, null), 3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJ(List<EcomResourceImageModel> list, List<String>[] listArr, Object obj, C1879707Xv c1879707Xv) {
        Map map;
        if (obj == 0) {
            return;
        }
        if ((!c1879707Xv.LIZLLL.isEmpty()) && (obj instanceof String)) {
            Iterator<Integer> it2 = c1879707Xv.LIZLLL.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                Integer num = ((EcomResourceImageModel) ListProtector.get(list, iIntValue)).limit;
                if (num == null || num.intValue() > 0) {
                    List<String> arrayList = listArr[iIntValue];
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        listArr[iIntValue] = arrayList;
                    }
                    if (num == null || arrayList.size() < num.intValue()) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        if (c1879707Xv.LIZJ.isEmpty()) {
            return;
        }
        for (C1879707Xv c1879707Xv2 : c1879707Xv.LIZJ) {
            C1879607Xu c1879607Xu = c1879707Xv2.LIZIZ;
            if (c1879607Xu != null) {
                LIZ.getClass();
                Object objLJIJ = null;
                if ((obj instanceof Map) && (map = (Map) obj) != null) {
                    objLJIJ = map.get(c1879607Xu.LIZ);
                    if (!c1879607Xu.LIZIZ.isEmpty()) {
                        objLJIJ = LJIJ(objLJIJ, c1879607Xu.LIZIZ);
                    }
                }
                if (objLJIJ instanceof List) {
                    Iterator it3 = ((Iterable) objLJIJ).iterator();
                    while (it3.hasNext()) {
                        LJ(list, listArr, it3.next(), c1879707Xv2);
                    }
                } else {
                    LJ(list, listArr, objLJIJ, c1879707Xv2);
                }
            }
        }
    }

    public static void LJIJI(Object obj, int i, List list, List list2) {
        Object objLJIJ;
        if (obj != null) {
            if (i == list.size()) {
                if (obj instanceof String) {
                    ((ArrayList) list2).add(obj);
                    return;
                }
                return;
            }
            String strLJJIFFI = u.LJJIFFI((String) ListProtector.get(list, i), "<.>", "<>", false);
            if (!(obj instanceof Map)) {
                return;
            }
            if (a0.LJJIIZI(strLJJIFFI, e3.d, false)) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJIFFI, new String[]{e3.d}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() < 2) {
                    return;
                }
                String strLJJIFFI2 = u.LJJIFFI((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), "<>", e3.d, false);
                EcomResourceBystander ecomResourceBystander = LIZ;
                Object obj2 = ((Map) obj).get(strLJJIFFI2);
                List listSubList = listLJJLIIIJILLIZJL.subList(1, listLJJLIIIJILLIZJL.size());
                ecomResourceBystander.getClass();
                objLJIJ = LJIJ(obj2, listSubList);
            } else {
                objLJIJ = ((Map) obj).get(u.LJJIFFI(strLJJIFFI, "<>", e3.d, false));
            }
            if (objLJIJ instanceof String) {
                LIZ.getClass();
                LJIJI(objLJIJ, i + 1, list, list2);
                return;
            }
            if (objLJIJ instanceof Map) {
                LIZ.getClass();
                LJIJI(objLJIJ, i + 1, list, list2);
            } else {
                if (!(objLJIJ instanceof List)) {
                    return;
                }
                for (Object obj3 : (Iterable) objLJIJ) {
                    LIZ.getClass();
                    LJIJI(obj3, i + 1, list, list2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: Exception -> 0x0146, TryCatch #0 {Exception -> 0x0146, blocks: (B:2:0x0000, B:4:0x000a, B:8:0x0016, B:9:0x001b, B:11:0x002c, B:13:0x0034, B:15:0x003c, B:17:0x004b, B:18:0x004f, B:24:0x005d, B:26:0x0074, B:28:0x0080, B:30:0x0088, B:33:0x0090, B:35:0x0096, B:36:0x009e, B:38:0x00a4, B:40:0x00ac, B:41:0x00c5, B:42:0x00c8, B:46:0x00cd, B:47:0x00d1, B:49:0x00d7, B:51:0x00fb, B:52:0x00ff, B:53:0x0114, B:55:0x011a, B:57:0x0127, B:58:0x012b, B:59:0x0141), top: B:63:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: Exception -> 0x0146, TryCatch #0 {Exception -> 0x0146, blocks: (B:2:0x0000, B:4:0x000a, B:8:0x0016, B:9:0x001b, B:11:0x002c, B:13:0x0034, B:15:0x003c, B:17:0x004b, B:18:0x004f, B:24:0x005d, B:26:0x0074, B:28:0x0080, B:30:0x0088, B:33:0x0090, B:35:0x0096, B:36:0x009e, B:38:0x00a4, B:40:0x00ac, B:41:0x00c5, B:42:0x00c8, B:46:0x00cd, B:47:0x00d1, B:49:0x00d7, B:51:0x00fb, B:52:0x00ff, B:53:0x0114, B:55:0x011a, B:57:0x0127, B:58:0x012b, B:59:0x0141), top: B:63:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(java.util.Map r20, java.lang.String r21, java.lang.Boolean r22, java.lang.String r23, kotlin.jvm.functions.Function2 r24) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander.LJIILLIIL(java.util.Map, java.lang.String, java.lang.Boolean, java.lang.String, kotlin.jvm.functions.Function2):void");
    }

    public static C1507990pLR LJIIL(String str, String str2, int i, String str3, InterfaceC1508110pLd interfaceC1508110pLd, String str4, String str5) {
        String strLIZIZ;
        String str6 = str;
        if (str3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("image-");
            sbLIZ.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "image";
        }
        if (str6 == null) {
            str6 = "";
        }
        return new C1507990pLR(strLIZIZ, str6, "image", i, 1, interfaceC1508110pLd, null, 2, null, str2, null, str4, str5, 1024);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static void LJIILIIL(String str, EcomResourceImageModel ecomResourceImageModel, List list, int i, EcomResourcePreloadModel ecomResourcePreloadModel, String str2, String str3, boolean z, Boolean bool, String str4, Function2 function2) {
        String str5;
        boolean z2;
        ArrayList arrayList;
        C20160213uS c20160213uS;
        EnumC1335820krk enumC1335820krk;
        long j;
        int iIntValue;
        int iIntValue2;
        double dDoubleValue;
        Integer num;
        ?? arrayList2 = list;
        if (function2 != null) {
            String str6 = ecomResourceImageModel.scene;
            if (str6 == null) {
                str6 = "";
            }
            function2.invoke(arrayList2, str6);
        }
        C1326870kdJ c1326870kdJ = new C1326870kdJ(str, str2, ecomResourceImageModel, i, arrayList2, bool);
        if (arrayList2.isEmpty()) {
            c1326870kdJ.invoke(null, Boolean.FALSE, "invalid resource path", null);
            return;
        }
        if (C20156213to.LIZ.ignoreScene) {
            str5 = ecomResourceImageModel.scene;
            if (str5 == null) {
                str5 = "default_scene";
            }
        } else {
            str5 = ecomResourceImageModel.scene;
        }
        if (ecomResourcePreloadModel != null && (num = ecomResourcePreloadModel.isWebViewResource) != null && num.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && str5 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (String str7 : arrayList2) {
                C1326840kdG c1326840kdG = C1326840kdG.LIZ;
                LIZ.getClass();
                C1066210dqt.LIZLLL(str7, "preload", new Pair("ec_biz_scene", str5));
                arrayList.add(c1326840kdG.LIZLLL(str7, true));
            }
            arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C1326860kdI) it2.next()).LIZ);
            }
        } else {
            arrayList = null;
        }
        ecomResourceImageModel.getClass();
        C20159013uG c20159013uGLIZIZ = C20158713uD.LIZIZ(ecomResourceImageModel.width, true, null, 8);
        C20159013uG c20159013uGLIZIZ2 = C20158713uD.LIZIZ(ecomResourceImageModel.height, true, null, 8);
        Integer num2 = c20159013uGLIZIZ.LIZIZ;
        if (num2 != null) {
            int iIntValue3 = num2.intValue();
            Integer num3 = c20159013uGLIZIZ2.LIZIZ;
            if (c20159013uGLIZIZ.LIZ == EnumC20158813uE.PIX) {
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = iIntValue3;
                }
                int i2 = C1334190kp7.LIZ[C1334150kp3.LIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        Double d = ecomResourceImageModel.lowWidth;
                        if (d != null) {
                            iIntValue3 = (int) d.doubleValue();
                        }
                        Double d2 = ecomResourceImageModel.lowHeight;
                        if (d2 != null || (d2 = ecomResourceImageModel.lowWidth) != null) {
                            dDoubleValue = d2.doubleValue();
                            iIntValue2 = (int) dDoubleValue;
                        }
                    }
                    c20160213uS = new C20160213uS(iIntValue3, iIntValue2);
                } else {
                    Double d3 = ecomResourceImageModel.highWidth;
                    if (d3 != null) {
                        iIntValue3 = (int) d3.doubleValue();
                    }
                    Double d4 = ecomResourceImageModel.highHeight;
                    if (d4 != null || (d4 = ecomResourceImageModel.highWidth) != null) {
                        dDoubleValue = d4.doubleValue();
                        iIntValue2 = (int) dDoubleValue;
                    }
                    c20160213uS = new C20160213uS(iIntValue3, iIntValue2);
                }
            } else {
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = iIntValue3;
                }
                c20160213uS = new C20160213uS(iIntValue3, iIntValue);
            }
        } else {
            c20160213uS = null;
        }
        String str8 = ecomResourceImageModel.priority;
        if (str8 != null) {
            EnumC1335820krk.Companion.getClass();
            EnumC1335820krk[] enumC1335820krkArrValues = EnumC1335820krk.values();
            int length = enumC1335820krkArrValues.length;
            for (int i3 = 0; i3 < length; i3++) {
                enumC1335820krk = enumC1335820krkArrValues[i3];
                if (Intrinsics.LJFF(enumC1335820krk.getValue(), str8)) {
                    break;
                }
            }
            enumC1335820krk = null;
        } else {
            enumC1335820krk = null;
        }
        Long l = ecomResourceImageModel.delayMs;
        if (l != null && l.longValue() > 0) {
            C1326660kcy c1326660kcy = C1326660kcy.LIZ;
            List<C1326670kcz> listLJ = c1326660kcy.LJ(str);
            synchronized (c1326660kcy) {
                j = C1326660kcy.LIZIZ + 1;
                C1326660kcy.LIZIZ = j;
            }
            c1326660kcy.LIZLLL(listLJ, new C1326670kcz(null, null, Long.valueOf(j), 3));
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1326780kdA(ecomResourceImageModel, str, j, ecomResourcePreloadModel, arrayList2, c1326870kdJ, c20160213uS, str2, str3, enumC1335820krk, z, str4, arrayList, null), 3);
            return;
        }
        LJIILL(ecomResourcePreloadModel, arrayList2, c1326870kdJ, c20160213uS, ecomResourceImageModel, str, str2, str3, enumC1335820krk, z, str4, arrayList);
    }

    public static final void LJIILL(EcomResourcePreloadModel ecomResourcePreloadModel, List<String> list, InterfaceC1631630sYr<? super String, ? super Boolean, ? super String, ? super C1326860kdI, Unit> interfaceC1631630sYr, C20160213uS c20160213uS, EcomResourceImageModel ecomResourceImageModel, String str, String str2, String str3, EnumC1335820krk enumC1335820krk, boolean z, String str4, List<C1326860kdI> list2) {
        boolean z2;
        Object objLJJJLL;
        Object objLJJJLL2;
        boolean z3;
        C1507890pLH c1507890pLHLIZ;
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        boolean z4;
        String name;
        Integer num;
        if (ecomResourcePreloadModel != null && (num = ecomResourcePreloadModel.isWebViewResource) != null && num.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC1331380kka frescoPriority = null;
        if (z2) {
            if (C1535630q41.LJJIII) {
                RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.WEB_CHILD_RESOURCE, byte[].class);
                requestParamsX.source = "EcomResource";
                requestParamsX.disablePrefixParser = true;
                requestParamsX.disableGecko = true;
                requestParamsX.disableAssets = true;
                for (String str5 : list) {
                    C1532680pzG.LIZ.getClass();
                    C1532680pzG.LJJ.LIZJ(str5, requestParamsX, null);
                }
            } else {
                RequestParams requestParams = new RequestParams(EnumC1533980q1M.WEB_CHILD_RESOURCE);
                requestParams.needLocalFile = Boolean.FALSE;
                requestParams.enableMemoryCache = Boolean.TRUE;
                requestParams.disableOffline = true;
                requestParams.disableBuiltin = true;
                requestParams.disablePrefixParser = true;
                for (String str6 : list) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        String name2 = IHybridDependencyService.class.getName();
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z4);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                    }
                    Forest.preload$default(((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).getForestProvider(), str6, requestParams, false, null, null, 28, null);
                }
            }
            interfaceC1631630sYr.invoke(EnumC1778510wNl.H5_MEMORY.getValue(), Boolean.TRUE, null, new C1326860kdI((String) C13LP.LJJJJZI(list), null, null));
            return;
        }
        String str7 = "";
        if (c20160213uS != null) {
            if (!ecomResourceImageModel.f61native) {
                if (str2 != null) {
                    str7 = str2;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('/');
                sbLIZ.append(ecomResourceImageModel.path);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Bitmap.Config configLJIILJJIL = LJIILJJIL(ecomResourceImageModel);
                if (configLJIILJJIL == null) {
                    configLJIILJJIL = Bitmap.Config.ARGB_8888;
                }
                if (LJIILJJIL(ecomResourceImageModel) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str8 = ecomResourceImageModel.diskCacheName;
                C1191504lN c1191504lN = C1191504lN.LIZ;
                int i = c20160213uS.LIZ;
                int i2 = c20160213uS.LIZIZ;
                if (enumC1335820krk != null) {
                    frescoPriority = enumC1335820krk.getFrescoPriority();
                }
                String strLJ = C1326620kcu.LJ(str, str8);
                c1191504lN.getClass();
                ArrayList arrayList = new ArrayList();
                for (String str9 : list) {
                    C1191504lN.LIZ.getClass();
                    C1322390kW5.LJIJJ((C1322390kW5) C1191504lN.LIZIZ.getValue(), str7, str3, strLIZIZ, str9, i, i2, false, configLJIILJJIL, z3, 0, 0, 0, 0, null, null, frescoPriority, str, z, strLJ, arrayList, str4, 32256);
                }
                if ((!arrayList.isEmpty()) && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null) {
                    c1507890pLHLIZ.LIZ(arrayList);
                }
            } else {
                if (str2 != null) {
                    str7 = str2;
                }
                Bitmap.Config configLJIILJJIL2 = LJIILJJIL(ecomResourceImageModel);
                if (configLJIILJJIL2 == null) {
                    configLJIILJJIL2 = Bitmap.Config.RGB_565;
                }
                C1326620kcu.LIZJ(list, str7, str3, configLJIILJJIL2, enumC1335820krk, str, z, ecomResourceImageModel.diskCacheName, str4);
            }
            String value = EnumC1778510wNl.MEMORY.getValue();
            Boolean bool = Boolean.TRUE;
            if (list2 != null) {
                objLJJJLL2 = C13LP.LJJJLL(list2);
            } else {
                objLJJJLL2 = null;
            }
            interfaceC1631630sYr.invoke(value, bool, null, objLJJJLL2);
            return;
        }
        if (str2 != null) {
            str7 = str2;
        }
        C1326620kcu.LIZIZ(list, str, str7, str3, enumC1335820krk, z, ecomResourceImageModel.diskCacheName, str4);
        String value2 = EnumC1778510wNl.DISK.getValue();
        Boolean bool2 = Boolean.TRUE;
        if (list2 != null) {
            objLJJJLL = C13LP.LJJJLL(list2);
        } else {
            objLJJJLL = null;
        }
        interfaceC1631630sYr.invoke(value2, bool2, null, objLJJJLL);
    }

    public static void LJIJJ(String str, boolean z, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Boolean bool, String str7, String str8) {
        C1018703yb.LIZLLL("rd_tiktokec_resource_preload", new C1554060qXk(str, z, str2, str3, str4, str5, num, num2, str6, bool, str7, str8));
    }
}
