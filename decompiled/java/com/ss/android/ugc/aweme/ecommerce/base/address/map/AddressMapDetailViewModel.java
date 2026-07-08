package com.ss.android.ugc.aweme.ecommerce.base.address.map;

import X.C004I;
import X.C1177960gl8;
import X.C123100dR;
import X.C1745290vWB;
import X.C1745340vWG;
import X.C1745680vWo;
import X.C1746400vXy;
import X.C1746880vYk;
import X.C23271099x;
import X.C259800zU;
import X.C817603Hi;
import X.C948503nH;
import android.util.Base64;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressMapDetailViewModel extends JediViewModel<AddressMapDetailState> {
    public AddressPageStarter.AddressMapDetailEnterParams LLILZIL;
    public final C817603Hi LLILZLL = new C817603Hi();
    public Address LLIZ;
    public InputItemData LLIZLLLIL;
    public String LLJ;
    public Integer LLJI;
    public String LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public HashMap<String, Object> LLJJI;
    public String LLJJIII;
    public C1177960gl8 LLJJIJI;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new AddressMapDetailState(null, null, null, false, null, 31, null);
    }

    public final void hR2(C1745680vWo c1745680vWo) {
        List<AddressItem> list;
        AddressItem next;
        String str = c1745680vWo.LIZ.key;
        Object obj = null;
        if (Intrinsics.LJFF(str, "address")) {
            Address address = this.LLIZ;
            if (address != null && (list = address.items) != null) {
                Iterator<AddressItem> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.key, c1745680vWo.LIZ.key)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AddressItem addressItem = next;
                if (addressItem != null) {
                    obj = addressItem.value;
                }
            }
            c1745680vWo.LIZIZ = obj;
            return;
        }
        if (!Intrinsics.LJFF(str, "districts")) {
            return;
        }
        Address address2 = this.LLIZ;
        if (address2 != null) {
            obj = address2.districts;
        }
        c1745680vWo.LIZIZ = C1746880vYk.LIZIZ(obj);
    }

    public final void iR2(Boolean bool) {
        String str;
        String string;
        Object obj;
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = this.LLILZIL;
        Integer num = null;
        if (addressMapDetailEnterParams != null) {
            str = addressMapDetailEnterParams.previousPage;
        } else {
            str = null;
        }
        HashMap<String, Object> map = this.LLJJI;
        if (map != null && (obj = map.get("entrance_info")) != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams2 = this.LLILZIL;
        if (addressMapDetailEnterParams2 != null) {
            num = addressMapDetailEnterParams2.pageType;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("previous_page", str);
        if (string == null) {
            string = "";
        }
        linkedHashMap.put("entrance_info", string);
        if (num != null) {
            num.intValue();
            linkedHashMap.put("page_type", num);
        }
        if (bool != null) {
            linkedHashMap.put("if_region_fill", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C1745290vWB.LJFF("tiktokec_enter_page", linkedHashMap);
    }

    public final void kR2(C1177960gl8 c1177960gl8) {
        Address addressLIZIZ;
        if (c1177960gl8 != null) {
            Address address = this.LLIZ;
            if (address != null) {
                addressLIZIZ = Address.LIZIZ(address, null, null, null, null, null, String.valueOf(c1177960gl8.lon), String.valueOf(c1177960gl8.lat), 2559);
            } else {
                addressLIZIZ = null;
            }
            this.LLIZ = addressLIZIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    public final C1745340vWG mR2(C1745680vWo c1745680vWo) {
        boolean z;
        String str;
        String str2;
        T next;
        T next2;
        C259800zU c259800zU = new C259800zU();
        List<Rule> list = c1745680vWo.LIZ.rules;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Object second = c1745680vWo.LIZIZ;
            if (second instanceof Pair) {
                second = ((Pair) second).getSecond();
            }
            if (second instanceof String) {
                CharSequence charSequence = (CharSequence) second;
                if (!a0.LJJJIL(charSequence)) {
                    Iterator<Rule> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            Rule rule = (Rule) next2;
                            String str3 = rule.regex;
                            if (str3 != null && !a0.LJJJIL(str3) && new Regex(new String(Base64.decode(rule.regex, 0), Charsets.UTF_8)).containsMatchIn(charSequence)) {
                                break;
                            }
                        } else {
                            next2 = 0;
                            break;
                        }
                    }
                } else {
                    Iterator<Rule> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            String str4 = ((Rule) next2).regex;
                            if (str4 == null || a0.LJJJIL(str4)) {
                                break;
                            }
                        } else {
                            next2 = 0;
                            break;
                        }
                    }
                }
                c259800zU.element = next2;
            } else if (second == null) {
                Iterator<Rule> it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        String str5 = ((Rule) next).regex;
                        if (str5 == null || a0.LJJJIL(str5)) {
                            break;
                        }
                    } else {
                        next = 0;
                        break;
                    }
                }
                c259800zU.element = next;
            }
        }
        Rule rule2 = (Rule) c259800zU.element;
        if (rule2 != null) {
            str = rule2.error;
        } else {
            str = null;
        }
        C1745340vWG c1745340vWG = new C1745340vWG(str, null, false, null, null, 30);
        if (C123100dR.LIZ(c1745340vWG.LIZ)) {
            c1745680vWo.LIZJ = c1745340vWG;
        } else {
            C1745340vWG c1745340vWG2 = c1745680vWo.LIZJ;
            if (c1745340vWG2 == null || (str2 = c1745340vWG2.LIZ) == null || str2.length() == 0) {
                c1745680vWo.LIZJ = c1745340vWG;
                return c1745340vWG;
            }
        }
        return c1745340vWG;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void lR2(com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel r15, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r16, java.util.List r17, int r18) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel.lR2(com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, java.util.List, int):void");
    }

    public static void jR2(AddressMapDetailViewModel addressMapDetailViewModel, Integer num, boolean z, Boolean bool, int i) {
        Boolean bool2 = bool;
        boolean z2 = z;
        Integer num2 = num;
        if ((i & 1) != 0) {
            num2 = null;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        addressMapDetailViewModel.getClass();
        C948503nH.LJFF(addressMapDetailViewModel, C23271099x.INSTANCE, new C1746400vXy(addressMapDetailViewModel, num2, bool2, z2, null));
    }
}
