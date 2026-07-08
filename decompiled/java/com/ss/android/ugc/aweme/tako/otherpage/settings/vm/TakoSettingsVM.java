package com.ss.android.ugc.aweme.tako.otherpage.settings.vm;

import X.AnonymousClass1426;
import X.C076O;
import X.C1155400gAk;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1581450rFv;
import X.C1697810uHb;
import X.C18076076c;
import X.C1856050yOp;
import X.C1857750yRZ;
import X.C1863380yae;
import X.C20041213bG;
import X.C2097608Jq;
import X.C597040NbK;
import X.InterfaceC0148002o;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS129S1000000_29;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSettingsVM extends AssemViewModel<C1155400gAk> {
    public C1863380yae LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155400gAk(yQ2(C2097608Jq.LJ()), 1);
    }

    public static boolean DQ2(Map map) {
        if (C18076076c.LIZ() && !map.containsKey("2")) {
            return true;
        }
        return false;
    }

    public static Map EQ2(String str) {
        Map map;
        if (str == null || str.length() <= 0 || (map = (Map) GsonProtectorUtils.fromJson(C597040NbK.LIZ(), str, new TypeToken<Map<String, Boolean>>() { // from class: X.13bE
        }.getType())) == null) {
            return C2097608Jq.LJ();
        }
        return map;
    }

    public static String FQ2(Map map) {
        String json;
        if (map == null || !(!map.isEmpty()) || (json = GsonProtectorUtils.toJson(C597040NbK.LIZ(), map)) == null) {
            return "";
        }
        return json;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int xQ2(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 49) {
            if (iHashCode != 50) {
                if (iHashCode != 46730162) {
                    switch (iHashCode) {
                        case 1444:
                            if (!str.equals("-1")) {
                                return R.raw.icon_info_circle_fill;
                            }
                            return R.raw.icon_pen_on_doc_fill;
                        case 1445:
                            str.equals("-2");
                            return R.raw.icon_info_circle_fill;
                        case 1446:
                            if (!str.equals("-3")) {
                                return R.raw.icon_info_circle_fill;
                            }
                            return R.raw.icon_gear_fill;
                        case 1447:
                            if (!str.equals("-4")) {
                                return R.raw.icon_info_circle_fill;
                            }
                            return R.raw.icon_phone_fill;
                        case 1448:
                            if (!str.equals("-5")) {
                                return R.raw.icon_info_circle_fill;
                            }
                            return R.raw.icon_file_tick_fill;
                        case 1449:
                            if (!str.equals("-6")) {
                                return R.raw.icon_info_circle_fill;
                            }
                            return R.raw.icon_text_background;
                        default:
                            return R.raw.icon_info_circle_fill;
                    }
                }
                if (!str.equals("10001")) {
                    return R.raw.icon_info_circle_fill;
                }
                return R.raw.icon_bell_fill;
            }
            if (!str.equals("2")) {
                return R.raw.icon_info_circle_fill;
            }
            return R.raw.icon_light_bulb_fill;
        }
        if (!str.equals("1")) {
            return R.raw.icon_info_circle_fill;
        }
        return R.raw.icon_bubble_ellipsis_right_fill;
    }

    public static String zQ2(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 49) {
            if (iHashCode != 50) {
                if (iHashCode == 1449 && str.equals("-6")) {
                    return C1857750yRZ.LJII(2131849830);
                }
                return null;
            }
            if (str.equals("2")) {
                return C1857750yRZ.LJII(2131849698);
            }
            return null;
        }
        if (str.equals("1")) {
            return C1857750yRZ.LJII(2131849834);
        }
        return null;
    }

    public final List<C20041213bG> AQ2(Map<String, Boolean> map) {
        boolean z;
        boolean z2;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("10001");
        if (((Number) C076O.LIZ.getValue()).intValue() == 1) {
            listLJIILJJIL.add("1");
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listLJIILJJIL) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) obj;
                Boolean bool = (Boolean) C1856050yOp.LIZIZ(str, map);
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    String strBQ2 = BQ2(str);
                    String strZQ2 = zQ2(str);
                    int iXQ2 = xQ2(str);
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!DQ2(map) && i == listLJIILJJIL.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new C20041213bG(strBQ2, strZQ2, str, Integer.valueOf(iXQ2), Boolean.valueOf(zBooleanValue), z, z2, 8));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String BQ2(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 49) {
            if (iHashCode != 50) {
                if (iHashCode != 46730162) {
                    switch (iHashCode) {
                        case 1444:
                            if (!str.equals("-1")) {
                                return "";
                            }
                            return C1857750yRZ.LJII(2131849658);
                        case 1445:
                            if (!str.equals("-2")) {
                                return "";
                            }
                            return C1857750yRZ.LJII(2131849772);
                        case 1446:
                            if (!str.equals("-3")) {
                                return "";
                            }
                            return C1857750yRZ.LJII(2131849883);
                        case 1447:
                            if (!str.equals("-4")) {
                                return "";
                            }
                            return C1857750yRZ.LJII(2131849796);
                        case 1448:
                            if (!str.equals("-5")) {
                                return "";
                            }
                            return C1857750yRZ.LJII(2131849696);
                        case 1449:
                            if (!str.equals("-6")) {
                                return "";
                            }
                            return C1857750yRZ.LJII(2131849831);
                        default:
                            return "";
                    }
                }
                if (!str.equals("10001")) {
                    return "";
                }
                return C1857750yRZ.LJII(2131835743);
            }
            if (!str.equals("2")) {
                return "";
            }
            return C1857750yRZ.LJII(2131849697);
        }
        if (!str.equals("1")) {
            return "";
        }
        return C1857750yRZ.LJII(2131849835);
    }

    public final List<C20041213bG> wQ2(Map<String, Boolean> map) {
        boolean z;
        boolean z2;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("-1", "-2", "-3");
        if (DQ2(map)) {
            ListProtector.add(listLJIILJJIL, 0, "-4");
        }
        int size = listLJIILJJIL.size();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIILJJIL, 10));
        int i = 0;
        for (Object obj : listLJIILJJIL) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) obj;
                String strBQ2 = BQ2(str);
                String strZQ2 = zQ2(str);
                Integer numValueOf = Integer.valueOf(xQ2(str));
                if (!DQ2(map) ? i == 0 : i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!DQ2(map) ? i == size - 1 : !(i != 0 && i != size - 1)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new C20041213bG(strBQ2, strZQ2, str, numValueOf, (Boolean) null, z, z2, 40));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public final List<C20041213bG> yQ2(Map<String, Boolean> map) {
        Iterable iterable;
        C1581450rFv.LIZ.getClass();
        if (C1581450rFv.LIZ()) {
            List listSingletonList = Collections.singletonList(new C20041213bG("", "", "-1000", (Integer) null, (Boolean) null, false, false, 248));
            List listLJIILJJIL = C1697810uHb.LJIILJJIL("10001");
            if (((Number) C076O.LIZ.getValue()).intValue() == 1) {
                listLJIILJJIL.add("1");
            }
            List listLJLIL = C13LP.LJLIL(vQ2("-1002", listLJIILJJIL, map), listSingletonList);
            ArrayList arrayList = new ArrayList();
            if (map.containsKey("2")) {
                arrayList.add("2");
                arrayList.add("-5");
            }
            AnonymousClass1426.LIZ.getClass();
            if (AnonymousClass1426.LIZ()) {
                arrayList.add("-6");
            }
            List listLJLIL2 = C13LP.LJLIL(vQ2("-1002", arrayList, map), listLJLIL);
            ArrayList arrayList2 = new ArrayList();
            if (C18076076c.LIZ()) {
                arrayList2.add("-4");
            }
            arrayList2.add("-1");
            arrayList2.add("-2");
            arrayList2.add("-3");
            return C13LP.LJLIL(vQ2("-1003", arrayList2, map), listLJLIL2);
        }
        if (map.containsKey("2")) {
            List<C20041213bG> listAQ2 = AQ2(map);
            Boolean bool = (Boolean) C1856050yOp.LIZIZ("2", map);
            ArrayList arrayList3 = new ArrayList();
            String strBQ2 = BQ2("2");
            arrayList3.add(new C20041213bG(strBQ2, zQ2("2"), "2", (Function2<? super Context, ? super Function0<Unit>, ? extends CharSequence>) new AwS129S1000000_29(strBQ2, 1), Integer.valueOf(xQ2("2")), bool, true, false));
            arrayList3.add(new C20041213bG(BQ2("-5"), zQ2("-5"), "-5", Integer.valueOf(xQ2("-5")), (Boolean) null, false, true, 40));
            List listLJLIL3 = C13LP.LJLIL(arrayList3, listAQ2);
            if (!C18076076c.LIZ()) {
                iterable = C13BV.INSTANCE;
            } else {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new C20041213bG(BQ2("-4"), zQ2("-4"), "-4", Integer.valueOf(xQ2("-4")), (Boolean) null, true, true, 40));
                iterable = arrayList4;
            }
            return C13LP.LJLIL(wQ2(map), C13LP.LJLIL(iterable, listLJLIL3));
        }
        return C13LP.LJLIL(wQ2(map), AQ2(map));
    }

    public final void CQ2(Map<String, Boolean> map, boolean z) {
        setState(new AwS609S0100000_30(map, (Map<String, String>) 111));
        if (!z) {
            setState(new AwS396S0200000_30(this, (TakoSettingsVM) map, (Map<String, Boolean>) 24));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List vQ2(java.lang.String r19, java.util.List r20, java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM.vQ2(java.lang.String, java.util.List, java.util.Map):java.util.List");
    }
}
