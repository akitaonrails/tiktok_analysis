package com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail;

import X.C004I;
import X.C034S;
import X.C1120604Zw;
import X.C13LP;
import X.C1745340vWG;
import X.C1745680vWo;
import X.C1746060vXQ;
import X.C1746180vXc;
import X.C1AQS;
import X.C259800zU;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class AddressEditDetailViewModel extends JediViewModel<AddressEditDetailState> {
    public CandInputData LLILZLL;
    public Address LLIZ;
    public boolean LLIZLLLIL;
    public HashMap<String, Object> LLJ;
    public C1746060vXQ LLJI;
    public InputItemData LLJIJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public Integer LLJJ;
    public String LLJJI;
    public ClientConfig LLJJIII;
    public Set<String> LLJJIJIIJIL;
    public final boolean LLILZIL = true;
    public final long LLJILJIL = -1;
    public final Map<String, C1746180vXc> LLJJIJI = new LinkedHashMap();

    public final int hR2() {
        String str;
        ArrayList<C1745680vWo> arrayList;
        String str2;
        Address addressIR2;
        List<AddressItem> list;
        String str3;
        Set<String> set = this.LLJJIJIIJIL;
        if (set == null || set.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C1745680vWo c1745680vWo : FQ2().getInputItemVOList()) {
                Integer num = c1745680vWo.LIZ.type;
                if (num != null && (num.intValue() == -100 || num.intValue() == -101)) {
                    Object obj = c1745680vWo.LIZIZ;
                    if ((obj instanceof ArrayList) && (arrayList = (ArrayList) obj) != null) {
                        for (C1745680vWo c1745680vWo2 : arrayList) {
                            if (c1745680vWo2.LJI && (str2 = c1745680vWo2.LIZ.key) != null) {
                                linkedHashSet.add(str2);
                            }
                        }
                    }
                } else if (c1745680vWo.LJI && (str = c1745680vWo.LIZ.key) != null) {
                    linkedHashSet.add(str);
                }
            }
            this.LLJJIJIIJIL = linkedHashSet;
        }
        Set<String> set2 = this.LLJJIJIIJIL;
        if (set2 != null && (addressIR2 = iR2(FQ2().getInputItemVOList())) != null && (list = addressIR2.items) != null) {
            for (AddressItem addressItem : list) {
                if (C13LP.LJJJJ(addressItem.key, set2) && ((str3 = addressItem.value) == null || str3.length() == 0)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new AddressEditDetailState(0, null, null, false, null, 31, null);
    }

    public AddressEditDetailViewModel() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService).getApplication().getString(2131832664);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJJIJIIJIL = null;
    }

    public final Address iR2(List<C1745680vWo> list) {
        Address addressLIZIZ;
        String str;
        AddressItem addressItem;
        Object obj;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator<C1745680vWo> it2 = list.iterator();
        while (true) {
            addressLIZIZ = null;
            if (!it2.hasNext()) {
                break;
            }
            C1745680vWo next = it2.next();
            String str4 = next.LIZ.key;
            if (str4 != null) {
                int iHashCode = str4.hashCode();
                if (iHashCode != -1768739439) {
                    if (iHashCode != -1147692044) {
                        if (iHashCode == 120381180 && str4.equals("address_detail")) {
                            obj = next.LIZIZ;
                            if (!(obj instanceof String) && (str2 = (String) obj) != null) {
                                addressItem = new AddressItem(str4, a0.LJLIIIL(str2).toString());
                                arrayList.add(addressItem);
                            }
                        }
                    } else if (str4.equals("address")) {
                        Object obj2 = next.LIZIZ;
                        if (obj2 != null) {
                            if ((obj2 instanceof String) && (str3 = (String) obj2) != null) {
                                addressItem = new AddressItem(str4, a0.LJLIIIL(str3).toString());
                            }
                        } else {
                            addressItem = new AddressItem(str4, "");
                        }
                        arrayList.add(addressItem);
                    }
                } else if (str4.equals("unit_floor")) {
                    obj = next.LIZIZ;
                    if (!(obj instanceof String)) {
                    }
                }
            }
            Object obj3 = next.LIZIZ;
            if ((obj3 instanceof String) && (str = (String) obj3) != null) {
                addressItem = new AddressItem(str4, a0.LJLIIIL(str).toString());
                arrayList.add(addressItem);
            }
        }
        Address address = this.LLIZ;
        if (address != null) {
            addressLIZIZ = Address.LIZIZ(address, arrayList, null, null, null, null, null, null, 4093);
        }
        this.LLIZ = addressLIZIZ;
        return addressLIZIZ;
    }

    public final void jR2(boolean z) {
        setState(new AwS38S0010000_26(z, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    public final C1745340vWG kR2(C1745680vWo c1745680vWo) {
        boolean z;
        T next;
        T next2;
        C259800zU c259800zU = new C259800zU();
        List<Rule> list = c1745680vWo.LIZ.rules;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String str = null;
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
                            String str2 = rule.regex;
                            if (str2 != null && !a0.LJJJIL(str2) && new Regex(new String(Base64.decode(rule.regex, 0), Charsets.UTF_8)).containsMatchIn(charSequence)) {
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
                            String str3 = ((Rule) next2).regex;
                            if (str3 == null || a0.LJJJIL(str3)) {
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
                        String str4 = ((Rule) next).regex;
                        if (str4 == null || a0.LJJJIL(str4)) {
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
        }
        C1745340vWG c1745340vWG = new C1745340vWG(str, null, false, null, null, 30);
        c1745680vWo.LIZJ = c1745340vWG;
        return c1745340vWG;
    }
}
