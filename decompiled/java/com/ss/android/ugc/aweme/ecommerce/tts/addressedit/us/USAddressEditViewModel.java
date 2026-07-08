package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us;

import X.AnonymousClass0378;
import X.C013C;
import X.C1019103yf;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1745300vWC;
import X.C1745310vWD;
import X.C1745340vWG;
import X.C1745680vWo;
import X.C1747550vZp;
import X.C756302xN;
import X.C770702zh;
import X.EnumC1014603xw;
import X.EnumC1154240g8s;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcAddressEditFixConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class USAddressEditViewModel extends AddressEditViewModel {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final C1745680vWo HR2(C1745680vWo c1745680vWo) {
        return c1745680vWo;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final int yR2() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final C1745340vWG iR2() {
        ClientConfig clientConfig;
        String str;
        String str2;
        String str3;
        C1745680vWo next;
        C1745680vWo next2;
        String str4;
        ClientConfig clientConfig2;
        String str5;
        String str6;
        InputItemData inputItemData = this.LLJJJJ;
        if (inputItemData == null || (clientConfig = inputItemData.config) == null || (str = clientConfig.concatenateNameRule) == null || (str2 = clientConfig.concatenateNameKeys) == null || (str3 = clientConfig.concatenateNameError) == null || str3.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6);
        Iterator<C1745680vWo> it2 = XR2().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Integer num = next.LIZ.type;
            if (num != null && num.intValue() == -101) {
                break;
            }
        }
        C1745680vWo c1745680vWo = next;
        if (c1745680vWo != null) {
            Object obj = c1745680vWo.LIZIZ;
            List list = obj instanceof List ? (List) obj : null;
            if (EcAddressEditFixConfig.LIZ().euNewCountryLaunch) {
                if (list != null) {
                    int i = 0;
                    for (Object obj2 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        C1745680vWo c1745680vWo2 = (C1745680vWo) obj2;
                        if (C13LP.LJJJJ(c1745680vWo2.LIZ.key, listLJJLIIIJILLIZJL)) {
                            Object obj3 = c1745680vWo2.LIZIZ;
                            if ((obj3 instanceof String) && (str5 = (String) obj3) != null) {
                                sb.append(str5);
                            }
                        }
                        i = i2;
                    }
                }
            } else if (list != null) {
                String str7 = "";
                int i3 = 0;
                for (Object obj4 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    C1745680vWo c1745680vWo3 = (C1745680vWo) obj4;
                    if (C13LP.LJJJJ(c1745680vWo3.LIZ.key, listLJJLIIIJILLIZJL)) {
                        Object obj5 = c1745680vWo3.LIZIZ;
                        if ((obj5 instanceof String) && (str6 = (String) obj5) != null) {
                            if (i3 != 0 && str6.length() > 0 && str7.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(str6);
                            str7 = str6;
                        }
                    }
                    i3 = i4;
                }
            }
        } else if (EcAddressEditFixConfig.LIZ().euNewCountryLaunch) {
            for (Object obj6 : listLJJLIIIJILLIZJL) {
                if (Intrinsics.LJFF(obj6, "first_name") || Intrinsics.LJFF(obj6, "last_name")) {
                    Iterator<C1745680vWo> it3 = XR2().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.LIZ.key, obj6)) {
                            break;
                        }
                    }
                    C1745680vWo c1745680vWo4 = next2;
                    if (c1745680vWo4 != null) {
                        Object obj7 = c1745680vWo4.LIZIZ;
                        if ((obj7 instanceof String) && (str4 = (String) obj7) != null && str4.length() > 0) {
                            sb.append(str4);
                        }
                    }
                }
            }
        }
        try {
            if (!new Regex(new String(Base64.decode(str, 0), Charsets.UTF_8)).containsMatchIn(sb.toString())) {
                return null;
            }
            InputItemData inputItemData2 = this.LLJJJJ;
            return new C1745340vWG(str3, null, true, (inputItemData2 == null || (clientConfig2 = inputItemData2.config) == null) ? null : clientConfig2.concatenateNameErrorStarlingKey, null, 18);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR60, e, null);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0108 A[EDGE_INSN: B:416:0x0108->B:65:0x0108 BREAK  A[LOOP:3: B:58:0x00ed->B:419:0x00ed], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d2  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List bS2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r34) {
        /*
            Method dump skipped, instruction units count: 2126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.USAddressEditViewModel.bS2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final boolean oR2(AddressEditState addressEditState) {
        EnumC1154240g8s enumC1154240g8s;
        Integer num;
        List list;
        EnumC1154240g8s enumC1154240g8s2;
        List<C1745680vWo> inputItemVOList = addressEditState.getInputItemVOList();
        C013C c013c = new C013C();
        List<C1745680vWo> listJR2 = AddressEditViewModel.jR2(inputItemVOList);
        Iterator it2 = ((ArrayList) listJR2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C1745680vWo c1745680vWo = (C1745680vWo) next;
            if (!C1745310vWD.LIZ(c1745680vWo.LIZJ)) {
                C1745340vWG c1745340vWG = c1745680vWo.LIZJ;
                if (c1745340vWG != null) {
                    enumC1154240g8s2 = c1745340vWG.LIZIZ;
                } else {
                    enumC1154240g8s2 = null;
                }
                if (enumC1154240g8s2 == EnumC1154240g8s.ERROR) {
                    if (next != null) {
                        BS2(listJR2, addressEditState);
                        return false;
                    }
                }
            }
        }
        AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(c013c, this, 58);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(inputItemVOList, 10));
        Iterator<C1745680vWo> it3 = inputItemVOList.iterator();
        while (it3.hasNext()) {
            C1745680vWo c1745680vWoLIZ = C1745680vWo.LIZ(it3.next(), null, null, false, null, null, null, 16383);
            Object obj = c1745680vWoLIZ.LIZIZ;
            Integer num2 = c1745680vWoLIZ.LIZ.type;
            if ((num2 != null && num2.intValue() == -100) || ((num = c1745680vWoLIZ.LIZ.type) != null && num.intValue() == -101)) {
                if ((obj instanceof List) && (list = (List) obj) != null) {
                    ArrayList<C1745680vWo> arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof C1745680vWo) {
                            arrayList2.add(obj2);
                        }
                    }
                    for (C1745680vWo c1745680vWo2 : arrayList2) {
                        c1745680vWo2.LIZJ = (C1745340vWG) awS392S0200000_26.invoke(c1745680vWo2);
                    }
                }
            } else {
                c1745680vWoLIZ.LIZJ = (C1745340vWG) awS392S0200000_26.invoke(c1745680vWoLIZ);
            }
            arrayList.add(c1745680vWoLIZ);
        }
        if (!c013c.element) {
            return super.oR2(addressEditState);
        }
        List<C1745680vWo> listJR22 = AddressEditViewModel.jR2(arrayList);
        Iterator it4 = ((ArrayList) listJR22).iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            C1745680vWo c1745680vWo3 = (C1745680vWo) next2;
            if (!C1745310vWD.LIZ(c1745680vWo3.LIZJ)) {
                C1745340vWG c1745340vWG2 = c1745680vWo3.LIZJ;
                if (c1745340vWG2 != null) {
                    enumC1154240g8s = c1745340vWG2.LIZIZ;
                } else {
                    enumC1154240g8s = null;
                }
                if (enumC1154240g8s == EnumC1154240g8s.ERROR) {
                    if (next2 != null) {
                        setState(new AwS605S0100000_26(arrayList, (List<C1745680vWo>) 279));
                        BS2(listJR22, addressEditState);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final void qS2(String str) {
        boolean z;
        ArrayList arrayList;
        ?? arrayList2;
        String str2;
        List listLJJLIIIJILLIZJL;
        List<Region> list = this.LLJJI;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ClientConfig clientConfig = this.LLL;
            if (clientConfig != null && (str2 = clientConfig.districtItemKeys) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Region("", null, null, (String) it2.next(), null, null, null));
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            this.LLJJI = arrayList2;
        }
        List<Region> list2 = this.LLJJI;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (Region region : list2) {
                if (Intrinsics.LJFF(region.districtKey, "geo_l3")) {
                    region = new Region(str, null, null, "geo_l3", null, null, null);
                }
                arrayList.add(region);
            }
        } else {
            arrayList = null;
        }
        this.LLJJI = arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final C1745340vWG BR2(C1745680vWo c1745680vWo, Rule rule) {
        return YR2(c1745680vWo, rule);
    }

    public final void BS2(List<C1745680vWo> list, AddressEditState addressEditState) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (C1745680vWo c1745680vWo : (ArrayList) list) {
            if (C770702zh.LIZIZ(c1745680vWo.LIZ.key) && (str = c1745680vWo.LIZ.key) != null) {
                arrayList.add(str);
            }
        }
        AddressEditViewModel.jS2(this, false, arrayList, 0L, "default", tR2(addressEditState.getInputItemVOList(), false), null, 1, 0, null, -99999999, 416);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final C1745340vWG IR2(C1745680vWo c1745680vWo, Rule rule) {
        return aS2(c1745680vWo, rule);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final void rS2(C1745340vWG c1745340vWG, String str) {
        ArrayList<C1745680vWo> arrayList;
        if (str.length() == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C1745680vWo c1745680vWo : XR2()) {
            Integer num = c1745680vWo.LIZ.type;
            if (num != null && num.intValue() == -101) {
                Object obj = c1745680vWo.LIZIZ;
                if (obj instanceof ArrayList) {
                    arrayList = (ArrayList) obj;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    for (C1745680vWo c1745680vWo2 : arrayList) {
                        if (Intrinsics.LJFF(c1745680vWo2.LIZ.key, str)) {
                            if (Intrinsics.LJFF(c1745680vWo2.LIZ.key, "first_name")) {
                                if (C1745310vWD.LIZ(c1745680vWo2.LIZJ)) {
                                    c1745680vWo2.LIZJ = c1745340vWG;
                                } else {
                                    C1745340vWG c1745340vWG2 = c1745680vWo2.LIZJ;
                                    if (c1745340vWG2 != null && c1745340vWG2.LIZJ) {
                                        c1745680vWo2.LIZJ = c1745340vWG;
                                    }
                                }
                            } else {
                                c1745680vWo2.LIZJ = c1745340vWG;
                            }
                        }
                    }
                }
                arrayList2.add(C1745680vWo.LIZ(c1745680vWo, arrayList, c1745340vWG, false, null, null, null, 16377));
            } else if (EcAddressEditFixConfig.LIZ().euNewCountryLaunch && Intrinsics.LJFF(c1745680vWo.LIZ.key, str)) {
                C1745340vWG c1745340vWG3 = c1745680vWo.LIZJ;
                if (C1745310vWD.LIZ(c1745340vWG3)) {
                    c1745340vWG3 = c1745340vWG;
                } else {
                    C1745340vWG c1745340vWG4 = c1745680vWo.LIZJ;
                    if (c1745340vWG4 != null && c1745340vWG4.LIZJ) {
                        c1745340vWG3 = c1745340vWG;
                    }
                }
                arrayList2.add(C1745680vWo.LIZ(c1745680vWo, null, c1745340vWG3, false, null, null, null, 16379));
            } else {
                arrayList2.add(c1745680vWo);
            }
        }
        setState(new AwS605S0100000_26(arrayList2, (List<C1745680vWo>) 280));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1745680vWo sS2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r18, X.C1745680vWo r19) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.USAddressEditViewModel.sS2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, X.0vWo):X.0vWo");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final Address tR2(List<C1745680vWo> list, boolean z) {
        C1745680vWo next;
        Object obj;
        List<Region> list2;
        List listLJJLIIIJILLIZJL;
        List listLJJLIIIJILLIZJL2;
        List listLJJLIIIJ;
        DeliveryInstructionInfo deliveryInstructionInfo;
        C1745680vWo next2;
        C1745680vWo next3;
        Integer num;
        List<AddressItem> list3;
        Pair pair;
        Pair pair2;
        List<C1745680vWo> list4;
        String string;
        Region region;
        String str;
        List<C1745680vWo> list5;
        String string2;
        String str2;
        List list6;
        String string3;
        String str3;
        String string4;
        String str4;
        String str5;
        String str6;
        String str7;
        Iterator<C1745680vWo> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.key, "districts")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1745680vWo c1745680vWo = next;
        if (c1745680vWo != null) {
            obj = c1745680vWo.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof List) {
            list2 = (List) obj;
        } else {
            list2 = null;
        }
        if (list2 == null || list2.isEmpty()) {
            list2 = this.LLJJI;
        }
        ArrayList arrayList = new ArrayList();
        ClientConfig clientConfig = this.LLL;
        if (clientConfig == null || (str7 = clientConfig.districtsConcatenateKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str7, new String[]{","}, 0, 6)) == null) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        ClientConfig clientConfig2 = this.LLL;
        if (clientConfig2 == null || (str6 = clientConfig2.singleLineNameKeys) == null || (listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str6, new String[]{","}, 0, 6)) == null) {
            listLJJLIIIJILLIZJL2 = C13BV.INSTANCE;
        }
        ClientConfig clientConfig3 = this.LLL;
        if (clientConfig3 == null || (str5 = clientConfig3._searchConcatenateKeys) == null || (listLJJLIIIJ = a0.LJJLIIIJ(str5, new char[]{','}, false, 0, 6)) == null) {
            listLJJLIIIJ = C13BV.INSTANCE;
        }
        loop1: while (true) {
            deliveryInstructionInfo = null;
            for (C1745680vWo c1745680vWo2 : list) {
                String str8 = c1745680vWo2.LIZ.key;
                if (str8 != null && !Intrinsics.LJFF(str8, "districts") && !Intrinsics.LJFF(str8, "phone") && !Intrinsics.LJFF(str8, "alternate_phone")) {
                    if (listLJJLIIIJILLIZJL.contains(str8)) {
                        Object obj2 = c1745680vWo2.LIZIZ;
                        if ((obj2 instanceof List) && (list4 = (List) obj2) != null) {
                            for (C1745680vWo c1745680vWo3 : list4) {
                                Object obj3 = c1745680vWo3.LIZIZ;
                                if ((obj3 instanceof String) && (str = (String) obj3) != null) {
                                    string = a0.LJLIIIL(str).toString();
                                } else {
                                    string = null;
                                }
                                if (VR2(c1745680vWo3.LIZ.key)) {
                                    List<Region> list7 = this.LLJJI;
                                    if (list7 != null && (region = (Region) C13LP.LJJJLZIJ(0, list7)) != null) {
                                        string = region.name;
                                    } else {
                                        string = null;
                                    }
                                }
                                arrayList.add(new AddressItem(c1745680vWo3.LIZ.key, string));
                            }
                        }
                    } else if (listLJJLIIIJILLIZJL2.contains(str8)) {
                        Object obj4 = c1745680vWo2.LIZIZ;
                        if ((obj4 instanceof List) && (list5 = (List) obj4) != null) {
                            for (C1745680vWo c1745680vWo4 : list5) {
                                Object obj5 = c1745680vWo4.LIZIZ;
                                if ((obj5 instanceof String) && (str2 = (String) obj5) != null) {
                                    string2 = a0.LJLIIIL(str2).toString();
                                } else {
                                    string2 = null;
                                }
                                arrayList.add(new AddressItem(c1745680vWo4.LIZ.key, string2));
                            }
                        }
                    } else if (listLJJLIIIJ.contains(str8)) {
                        Object obj6 = c1745680vWo2.LIZIZ;
                        if ((obj6 instanceof List) && (list6 = (List) obj6) != null) {
                            ArrayList<C1745680vWo> arrayList2 = new ArrayList();
                            for (Object obj7 : list6) {
                                if (!Intrinsics.LJFF(((C1745680vWo) obj7).LIZ.key, "region")) {
                                    arrayList2.add(obj7);
                                }
                            }
                            for (C1745680vWo c1745680vWo5 : arrayList2) {
                                Object obj8 = c1745680vWo5.LIZIZ;
                                if ((obj8 instanceof String) && (str3 = (String) obj8) != null) {
                                    string3 = a0.LJLIIIL(str3).toString();
                                } else {
                                    string3 = null;
                                }
                                arrayList.add(new AddressItem(c1745680vWo5.LIZ.key, string3));
                            }
                        }
                    } else if (Intrinsics.LJFF(str8, "region")) {
                        continue;
                    } else if (Intrinsics.LJFF(str8, "delivery_instruction")) {
                        Object obj9 = c1745680vWo2.LIZIZ;
                        if (obj9 instanceof DeliveryInstructionInfo) {
                            deliveryInstructionInfo = (DeliveryInstructionInfo) obj9;
                        }
                    } else {
                        Object obj10 = c1745680vWo2.LIZIZ;
                        if ((obj10 instanceof String) && (str4 = (String) obj10) != null) {
                            string4 = a0.LJLIIIL(str4).toString();
                        } else {
                            string4 = null;
                        }
                        arrayList.add(new AddressItem(str8, string4));
                    }
                }
            }
        }
        Iterator<C1745680vWo> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(next2.LIZ.key, "phone")) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        C1745680vWo c1745680vWo6 = next2;
        if (c1745680vWo6 != null) {
            Object obj11 = c1745680vWo6.LIZIZ;
            if ((obj11 instanceof Pair) && (pair2 = (Pair) obj11) != null) {
                String str9 = (String) pair2.getFirst();
                if (str9 != null) {
                    arrayList.add(new AddressItem("phone_region_code", str9));
                }
                String str10 = (String) pair2.getSecond();
                if (str10 != null) {
                    arrayList.add(new AddressItem("phone", str10));
                }
            }
        }
        Iterator<C1745680vWo> it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                next3 = it4.next();
                if (Intrinsics.LJFF(next3.LIZ.key, "alternate_phone")) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        C1745680vWo c1745680vWo7 = next3;
        if (c1745680vWo7 != null) {
            Object obj12 = c1745680vWo7.LIZIZ;
            if ((obj12 instanceof Pair) && (pair = (Pair) obj12) != null) {
                String str11 = (String) pair.getFirst();
                if (str11 != null) {
                    arrayList.add(new AddressItem("alternate_phone_region_code", str11));
                }
                String str12 = (String) pair.getSecond();
                if (str12 != null) {
                    arrayList.add(new AddressItem("alternate_phone", str12));
                }
            }
        }
        if (!z && !C756302xN.LIZ(list2) && !list.isEmpty()) {
            Iterator<C1745680vWo> it5 = list.iterator();
            while (it5.hasNext()) {
                if (Intrinsics.LJFF(it5.next().LIZ.key, "districts")) {
                    return null;
                }
            }
        }
        Integer num2 = this.LLLIIL;
        if ((num2 == null || num2.intValue() != 4) && ((num = this.LLLIIL) == null || num.intValue() != 10)) {
            return new Address(this.LLJI, arrayList, this.LLILZLL, list2, null, deliveryInstructionInfo, null, this.LLLILZLLLI, null, null, null, null);
        }
        ArrayList arrayList3 = new ArrayList();
        List listLJIIJJI = C1697810uHb.LJIIJJI("email", "phone", "phone_region_code", "name", "first_name", "last_name");
        Address address = this.LLJILJILJ;
        if (address != null && (list3 = address.items) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (AddressItem addressItem : list3) {
                if (!C13LP.LJJJJ(addressItem.key, listLJIIJJI)) {
                    arrayList4.add(addressItem);
                }
            }
            arrayList3.addAll(arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj13 : arrayList) {
            if (C13LP.LJJJJ(((AddressItem) obj13).key, listLJIIJJI)) {
                arrayList5.add(obj13);
            }
        }
        arrayList3.addAll(arrayList5);
        Address address2 = this.LLJILJILJ;
        if (address2 == null) {
            return null;
        }
        return Address.LIZIZ(address2, arrayList3, null, null, C13BV.INSTANCE, null, null, null, 4029);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final void ER2(Address address, CheckShippingAddressData checkShippingAddressData, Integer num) {
        Integer num2;
        if (checkShippingAddressData != null && num != null && num.intValue() == 4) {
            List<Error> list = checkShippingAddressData.errors;
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (Error error : list) {
                    arrayList.add(new C1747550vZp(error.key, error.error));
                }
                setState(new AwS392S0200000_26(arrayList, (List<C1747550vZp>) AFwS313S0000000_26.get$arr$(12), (Function2<? super C1745680vWo, ? super C1747550vZp, C1745680vWo>) 31));
                return;
            }
            AddressVerifyData addressVerifyData = checkShippingAddressData.verifyData;
            if (addressVerifyData != null && (num2 = addressVerifyData.status) != null && num2.intValue() == 1) {
                if (checkShippingAddressData.verifyData.tipInfo != null) {
                    AnonymousClass0378.LIZ().LIZ("ec_show_check_address_result", C1741890vQh.LJIIIIZZ(checkShippingAddressData));
                    return;
                } else {
                    UR2(address);
                    return;
                }
            }
            UR2(address);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final void JR2(CheckShippingAddressData checkShippingAddressData, int i, C1745680vWo c1745680vWo) {
        AddressVerifyData addressVerifyData;
        Address address;
        String str;
        InputItemDTO inputItemDTO;
        if ((i != 1 && i != 2) || (addressVerifyData = checkShippingAddressData.verifyData) == null || (address = addressVerifyData.shippingAddress) == null) {
            return;
        }
        if (c1745680vWo != null && (inputItemDTO = c1745680vWo.LIZ) != null) {
            str = inputItemDTO.key;
        } else {
            str = null;
        }
        AddressEditViewModel.tS2(this, address, Collections.singletonList(str), null, null, false, false, null, null, null, null, 8188);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final void KR2(C1745300vWC c1745300vWC, C1745680vWo c1745680vWo, C1745340vWG c1745340vWG) {
        ZR2(c1745300vWC, c1745680vWo, c1745340vWG);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[PHI: r3
      0x0058: PHI (r3v2 java.lang.Integer) = (r3v1 java.lang.Integer), (r3v1 java.lang.Integer), (r3v4 java.lang.Integer) binds: [B:22:0x0053, B:17:0x003c, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View sR2(int r10, android.view.View r11, androidx.recyclerview.widget.RecyclerView r12) {
        /*
            r9 = this;
            r0 = 2
            r8 = 0
            if (r10 == r0) goto L5
            return r8
        L5:
            r0 = 30
            android.view.View r7 = X.C998620c5s.LIZ(r11, r12, r0)     // Catch: java.lang.Exception -> L96
            if (r7 != 0) goto Le
            return r8
        Le:
            X.0e8y r2 = new X.0e8y     // Catch: java.lang.Exception -> L96
            r1 = r12
            X.0Hlw r1 = (X.C450740Hlw) r1     // Catch: java.lang.Exception -> L96
            r0 = 37
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L96
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L96
            r6.<init>()     // Catch: java.lang.Exception -> L96
            java.util.Iterator r5 = r2.iterator()     // Catch: java.lang.Exception -> L96
            r4 = 0
            r3 = r8
        L23:
            r1 = r5
            X.0e8x r1 = (X.C1077410e8x) r1     // Catch: java.lang.Exception -> L96
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L64
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Exception -> L96
            int r2 = r4 + 1
            if (r4 < 0) goto L60
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Exception -> L96
            if (r3 != 0) goto L4d
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r7)     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L58
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L96
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r12.getChildViewHolder(r1)     // Catch: java.lang.Exception -> L96
            boolean r0 = r1 instanceof X.InterfaceC998610c5r     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L58
            X.0c5r r1 = (X.InterfaceC998610c5r) r1     // Catch: java.lang.Exception -> L96
            goto L59
        L4d:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r12.getChildViewHolder(r1)     // Catch: java.lang.Exception -> L96
            boolean r0 = r1 instanceof X.InterfaceC998610c5r     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L58
            X.0c5r r1 = (X.InterfaceC998610c5r) r1     // Catch: java.lang.Exception -> L96
            goto L59
        L58:
            r1 = r8
        L59:
            if (r1 == 0) goto L5e
            r6.add(r1)     // Catch: java.lang.Exception -> L96
        L5e:
            r4 = r2
            goto L23
        L60:
            X.C1697810uHb.LJIJI()     // Catch: java.lang.Exception -> L96
            throw r8     // Catch: java.lang.Exception -> L96
        L64:
            if (r3 == 0) goto L95
            r3.intValue()     // Catch: java.lang.Exception -> L96
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L70
            return r11
        L70:
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Exception -> L96
        L74:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L90
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L96
            r0 = r1
            X.0c5r r0 = (X.InterfaceC998610c5r) r0     // Catch: java.lang.Exception -> L96
            boolean r0 = r0.w2()     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L74
        L87:
            X.0c5r r1 = (X.InterfaceC998610c5r) r1     // Catch: java.lang.Exception -> L96
            if (r1 == 0) goto L95
            android.view.View r0 = r1.l()     // Catch: java.lang.Exception -> L96
            goto L92
        L90:
            r1 = r8
            goto L87
        L92:
            if (r0 == 0) goto L95
            return r0
        L95:
            return r8
        L96:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.USAddressEditViewModel.sR2(int, android.view.View, androidx.recyclerview.widget.RecyclerView):android.view.View");
    }
}
