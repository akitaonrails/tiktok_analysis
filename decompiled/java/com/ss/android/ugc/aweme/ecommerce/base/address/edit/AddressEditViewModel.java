package com.ss.android.ugc.aweme.ecommerce.base.address.edit;

import X.AnonymousClass0378;
import X.C004I;
import X.C034S;
import X.C036E;
import X.C03OX;
import X.C04CK;
import X.C0C64;
import X.C0PEM;
import X.C1019103yf;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1177960gl8;
import X.C123100dR;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1744080vUE;
import X.C1745180vW0;
import X.C1745300vWC;
import X.C1745310vWD;
import X.C1745340vWG;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1746150vXZ;
import X.C1746180vXc;
import X.C1746420vY0;
import X.C1746440vY2;
import X.C1746460vY4;
import X.C1746470vY5;
import X.C1746540vYC;
import X.C1746580vYG;
import X.C1747140vZA;
import X.C1747550vZp;
import X.C1747720va6;
import X.C1747770vaB;
import X.C1748720vbi;
import X.C19EH;
import X.C1AQS;
import X.C1AUJ;
import X.C1AUM;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23250099c;
import X.C23271099x;
import X.C2327809Ae;
import X.C2371409Qy;
import X.C259800zU;
import X.C7879035x;
import X.C817503Hh;
import X.C817603Hi;
import X.C948503nH;
import X.C973303rH;
import X.C983603sw;
import X.C990903u7;
import X.EnumC1014603xw;
import X.EnumC1154240g8s;
import X.EnumC1746650vYN;
import X.EnumC835103Ob;
import X.InterfaceC1164530gPT;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PromotionDialogInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressModule;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressPromotionResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.TrackParams;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.events.ZipCodeSelectedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailFragment2;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressEditLocationSetting;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS112S0110000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS42S1110000_26;
import kotlin.jvm.internal.AwS488S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS62S1300000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class AddressEditViewModel extends JediViewModel<AddressEditState> implements InterfaceC1164530gPT {
    public static final /* synthetic */ int LLLLZLLIL = 0;
    public Region LLILZLL;
    public String LLIZ;
    public Boolean LLIZLLLIL;
    public Address LLJ;
    public String LLJIJIL;
    public String LLJILJIL;
    public Address LLJILJILJ;
    public Address LLJILLL;
    public List<Region> LLJJ;
    public List<Region> LLJJI;
    public boolean LLJJIJI;
    public HashMap<String, Object> LLJJIJIIJIL;
    public Pair<String, Address> LLJJJ;
    public AddressPageStarter.AddressEditEnterParams LLJJJIL;
    public InputItemData LLJJJJ;
    public boolean LLJJJJJIL;
    public Address LLJJJJLIIL;
    public Address LLJJL;
    public Address LLJJLIIIJLLLLLLLZ;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public Integer LLJLLL;
    public String LLJZ;
    public ClientConfig LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public String LLLI;
    public int LLLIIII;
    public List<String> LLLIIIIL;
    public Map<String, String> LLLIIIL;
    public Integer LLLIIL;
    public boolean LLLILZ;
    public AddressBase LLLILZLLLI;
    public C1177960gl8 LLLIZZ;
    public C1177960gl8 LLLJ;
    public long LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public String LLLLIL;
    public long LLLLILI;
    public long LLLLJ;
    public int LLLLJI;
    public EnumC1746650vYN LLLLL;
    public boolean LLLLLIL;
    public Set<String> LLLLLILLIL;
    public int LLLLLJIL;
    public C983603sw LLLLLJLJLL;
    public boolean LLLLLL;
    public Integer LLLLLLIL;
    public boolean LLLLLLJ;
    public boolean LLLLLLL;
    public String LLLLLLLLL;
    public Address LLLLLLLLLL;
    public LocationUseBar LLLLLLLZIL;
    public Boolean LLLLLLZ;
    public String LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public String LLLLLZL;
    public Address LLLLZ;
    public Map<String, ? extends Object> LLLLZI;
    public String LLLLZIL;
    public final List<String> LLLLZLL;
    public final boolean LLILZIL = true;
    public String LLJI = CardStruct.IStatusCode.DEFAULT;
    public final List<String> LLJJIII = new ArrayList();
    public final C1745480vWU LLJJIJIL = new C1745480vWU(this);
    public long LLJL = -1;
    public boolean LLJZIJLIL = true;
    public final Map<String, C1746180vXc> LLLII = new LinkedHashMap();
    public long LLLIILIL = -1;
    public int LLLIL = 1;
    public final C817603Hi LLLILZJ = new C817603Hi();
    public final String LLLLIILLL = C7879035x.LIZ().getString(2131832689);

    public void JR2(CheckShippingAddressData checkShippingAddressData, int i, C1745680vWo c1745680vWo) {
    }

    public void qS2(String str) {
    }

    public View sR2(int i, View view, RecyclerView recyclerView) {
        return null;
    }

    public int yR2() {
        return 3;
    }

    public final void GR2() {
        C973303rH.LL.getClass();
        String str = C973303rH.LLILLJJLI;
        if (str != null && Intrinsics.LJFF(str, this.LLJI)) {
            C973303rH.LLIZ.storeString("ShoppingCartSelectedAddressId", "");
            C973303rH.LLILLJJLI = null;
        }
        AnonymousClass0378.LIZ().LIZ("ec_address_change", C1741890vQh.LJIIIIZZ(new AddressPageStarter.AddressEvent(this.LLJI, 2, null, null, null, null)));
    }

    public final boolean OR2() {
        ClientConfig clientConfig;
        InputItemData inputItemData = this.LLJJJJ;
        return C123100dR.LIZ((inputItemData == null || (clientConfig = inputItemData.config) == null) ? null : clientConfig.concatenateNameRule);
    }

    public final boolean PR2() {
        ClientConfig clientConfig;
        InputItemData inputItemData = this.LLJJJJ;
        return C123100dR.LIZ((inputItemData == null || (clientConfig = inputItemData.config) == null) ? null : clientConfig.concatenateAddressRule);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013 A[PHI: r6
      0x0013: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String), (r6v3 java.lang.String) binds: [B:36:0x0073, B:8:0x000d, B:10:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[Catch: IllegalArgumentException -> 0x00a4, TryCatch #0 {IllegalArgumentException -> 0x00a4, blocks: (B:38:0x0076, B:40:0x008c, B:42:0x0093, B:44:0x0097, B:45:0x0099), top: B:52:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1745340vWG SR2() {
        /*
            r15 = this;
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r1 = r15.LLJJJJ
            r10 = 0
            if (r1 == 0) goto L72
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L72
            java.lang.String r6 = r0.concatenateAddressRule
        Lb:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L13
            java.lang.String r9 = r0.concatenateAddressError
            if (r9 != 0) goto L15
        L13:
            java.lang.String r9 = r15.LLLLIILLL
        L15:
            if (r1 == 0) goto L70
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L70
            java.lang.String r2 = r0.concatenateAddressKeys
        L1d:
            if (r6 == 0) goto Lad
            r5 = 0
            if (r2 == 0) goto Lad
            int r0 = r2.length()
            if (r0 == 0) goto Lad
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r7 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r5, r0)
            java.util.List r0 = r15.XR2()
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r3 = ""
            r4 = r3
        L3e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r1 = r8.next()
            X.0vWo r1 = (X.C1745680vWo) r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r1.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = X.C13LP.LJJJJ(r0, r7)
            if (r0 == 0) goto L3e
            java.lang.Object r2 = r1.LIZIZ
            if (r2 == 0) goto L3e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r4)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L67
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L68
        L67:
            r2 = r3
        L68:
            r1.append(r2)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            goto L3e
        L70:
            r2 = r10
            goto L1d
        L72:
            r6 = r10
            if (r1 == 0) goto L13
            goto Lb
        L76:
            kotlin.text.Regex r3 = new kotlin.text.Regex     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r2 = android.util.Base64.decode(r6, r5)     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> La4
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.IllegalArgumentException -> La4
            r1.<init>(r2, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            r3.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> La4
            boolean r0 = r3.containsMatchIn(r4)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 == 0) goto La3
            X.0vWG r8 = new X.0vWG     // Catch: java.lang.IllegalArgumentException -> La4
            r11 = 1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = r15.LLJJJJ     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r0.config     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 == 0) goto La0
            java.lang.String r12 = r0.concatenateAddressErrorStarlingKey     // Catch: java.lang.IllegalArgumentException -> La4
        L99:
            r14 = 18
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.IllegalArgumentException -> La4
            goto La2
        La0:
            r12 = r10
            goto L99
        La2:
            return r8
        La3:
            return r10
        La4:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.03xw r0 = X.EnumC1014603xw.ERR60
            X.C1019103yf.LIZ(r0, r1, r10)
        Lad:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.SR2():X.0vWG");
    }

    public final boolean TR2() {
        Integer num = this.LLLIIL;
        return num != null && num.intValue() == 10;
    }

    public final String getPageName() {
        return this.LLLLIILL ? "pickup_person" : "shipping_address";
    }

    public C1745340vWG iR2() {
        ClientConfig clientConfig;
        String str;
        String str2;
        String str3;
        C1745680vWo next;
        ClientConfig clientConfig2;
        List list;
        String str4;
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
            if ((obj instanceof List) && (list = (List) obj) != null) {
                String str5 = "";
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
                        if ((obj3 instanceof String) && (str4 = (String) obj3) != null) {
                            if (i != 0 && str4.length() > 0 && str5.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(str4);
                            str5 = str4;
                        }
                    }
                    i = i2;
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

    public final boolean xS2() {
        return this.LLLLL == EnumC1746650vYN.ADD && C0C64.LJIILLIIL().LJIJ(31744, 0, "address_draft_enable", true) != 0;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new AddressEditState(0, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, false, null, null, false, null, false, false, false, false, 536870911, null);
    }

    public AddressEditViewModel() {
        C7879035x.LIZ().getString(2131832693);
        C7879035x.LIZ().getString(2131832664);
        C7879035x.LIZ().getString(2131832670);
        this.LLLLIL = "default";
        this.LLLLL = EnumC1746650vYN.ADD;
        this.LLLLLIL = true;
        this.LLLLLZ = true;
        this.LLLLZLL = C1697810uHb.LJIIJJI("name", "phone", "address", "zipcode", "email", "address_other_detail");
    }

    public final int AR2() {
        String str;
        ArrayList<C1745680vWo> arrayList;
        String str2;
        List<AddressItem> list;
        List<Region> list2;
        String str3;
        List<C1745680vWo> listXR2 = XR2();
        if (listXR2.isEmpty()) {
            return 0;
        }
        Set<String> set = this.LLLLLILLIL;
        if (set == null || set.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C1745680vWo c1745680vWo : listXR2) {
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
            this.LLLLLILLIL = linkedHashSet;
        }
        Set<String> set2 = this.LLLLLILLIL;
        if (set2 != null) {
            Address addressTR2 = tR2(XR2(), true);
            if (addressTR2 == null || (list = addressTR2.items) == null || list.isEmpty()) {
                return 0;
            }
            List<AddressItem> list3 = addressTR2.items;
            if (list3 != null) {
                for (AddressItem addressItem : list3) {
                    if (C13LP.LJJJJ(addressItem.key, set2) && ((str3 = addressItem.value) == null || str3.length() == 0)) {
                        return 0;
                    }
                }
            }
            if (set2.contains("region") && addressTR2.region == null) {
                return 0;
            }
            if (set2.contains("districts") && ((list2 = addressTR2.districts) == null || list2.isEmpty())) {
                return 0;
            }
        }
        return 1;
    }

    public final List<C1745680vWo> XR2() {
        return FQ2().getInputItemVOList();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLLLLILLIL = null;
        AnonymousClass0378.LIZ().LIZJ("ec_zipcode_selected_event", this);
        AnonymousClass0378.LIZ().LIZJ("ec_address_map_locate_event", this);
        C1746460vY4.LIZ.getClass();
        C1746460vY4.LIZLLL.clear();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        AnonymousClass0378.LIZ().LIZLLL("ec_zipcode_selected_event", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_address_map_locate_event", this);
    }

    public static List jR2(List list) {
        Integer num;
        ArrayList<C1745680vWo> arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1745680vWo c1745680vWo = (C1745680vWo) it2.next();
            Integer num2 = c1745680vWo.LIZ.type;
            if ((num2 != null && num2.intValue() == -100) || ((num = c1745680vWo.LIZ.type) != null && num.intValue() == -101)) {
                Object obj = c1745680vWo.LIZIZ;
                if ((obj instanceof ArrayList) && (arrayList = (ArrayList) obj) != null) {
                    for (C1745680vWo c1745680vWo2 : arrayList) {
                        if (!C1745310vWD.LIZ(c1745680vWo2.LIZJ)) {
                            arrayList2.add(c1745680vWo2);
                        }
                    }
                }
            } else if (!C1745310vWD.LIZ(c1745680vWo.LIZJ)) {
                arrayList2.add(c1745680vWo);
            }
        }
        return arrayList2;
    }

    public static void pR2(AddressEditViewModel addressEditViewModel) {
        addressEditViewModel.getClass();
        AwS488S0200000_26 awS488S0200000_26 = new AwS488S0200000_26(addressEditViewModel, (AddressEditViewModel) null, (Function1<? super Boolean, Unit>) 7);
        CertProviderManagerKt.findCert("bpea-ecom_address_map_locate", 1476395008, "svfi");
        try {
            C1745180vW0.LIZ(null, awS488S0200000_26);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static Address uR2(AddressEditViewModel addressEditViewModel) {
        return addressEditViewModel.tR2(addressEditViewModel.XR2(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    public final C1745340vWG AS2(C1745680vWo c1745680vWo) {
        boolean z;
        String str;
        String str2;
        String str3;
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
                            String str4 = rule.regex;
                            if (str4 != null && !a0.LJJJIL(str4) && new Regex(new String(Base64.decode(rule.regex, 0), Charsets.UTF_8)).containsMatchIn(charSequence)) {
                                if (next2 != 0) {
                                    this.LLLILZ = true;
                                }
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
                            String str5 = ((Rule) next2).regex;
                            if (str5 == null || a0.LJJJIL(str5)) {
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
                        String str6 = ((Rule) next).regex;
                        if (str6 == null || a0.LJJJIL(str6)) {
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
        C1745340vWG c1745340vWGIR2 = IR2(c1745680vWo, (Rule) c259800zU.element);
        if (c1745340vWGIR2 != null) {
            return c1745340vWGIR2;
        }
        C1745340vWG c1745340vWGBR2 = BR2(c1745680vWo, (Rule) c259800zU.element);
        if (c1745340vWGBR2 != null) {
            return c1745340vWGBR2;
        }
        Rule rule2 = (Rule) c259800zU.element;
        if (rule2 != null) {
            str = rule2.error;
        } else {
            str = null;
        }
        if (rule2 != null) {
            str2 = rule2.starlingKey;
        } else {
            str2 = null;
        }
        C1745340vWG c1745340vWG = new C1745340vWG(str, null, false, str2, null, 22);
        if (C123100dR.LIZ(c1745340vWG.LIZ)) {
            c1745680vWo.LIZJ = c1745340vWG;
        } else {
            C1745340vWG c1745340vWG2 = c1745680vWo.LIZJ;
            if (c1745340vWG2 == null || (str3 = c1745340vWG2.LIZ) == null || str3.length() == 0) {
                c1745680vWo.LIZJ = c1745340vWG;
                return c1745340vWG;
            }
        }
        return c1745340vWG;
    }

    public final void FR2(ShippingAddressPromotionResponse shippingAddressPromotionResponse) {
        PromotionDialogInfo promotionDialogInfo;
        if (shippingAddressPromotionResponse == null || (promotionDialogInfo = shippingAddressPromotionResponse.promotionDialogInfo) == null || promotionDialogInfo.dialogSchema == null) {
            return;
        }
        C983603sw c983603sw = this.LLLLLJLJLL;
        if (c983603sw == null) {
            c983603sw = new C983603sw();
        }
        C03OX c03ox = C03OX.ADDRESS_EDIT;
        String str = promotionDialogInfo.dialogSchema;
        String str2 = promotionDialogInfo.dialogData;
        if (str2 == null) {
            str2 = "";
        }
        c983603sw.LIZIZ(c03ox, str, str2, this.LLJJIJIIJIL, C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, Integer.valueOf(EnumC835103Ob.ADDRESS_EDIT.getScene()))), Boolean.FALSE, null);
        this.LLLLLJLJLL = c983603sw;
    }

    public C1745680vWo HR2(C1745680vWo c1745680vWo) {
        C1745340vWG c1745340vWG;
        if (c1745680vWo.LIZJ == null) {
            return c1745680vWo;
        }
        if (RR2(c1745680vWo.LIZ.key)) {
            if (!MR2(c1745680vWo.LIZ.key) && ((c1745340vWG = c1745680vWo.LIZJ) == null || !c1745340vWG.LIZ())) {
                return C1745680vWo.LIZ(c1745680vWo, null, null, false, null, null, null, 16379);
            }
        } else if (QR2(c1745680vWo.LIZ.key) && !LR2(c1745680vWo.LIZ.key)) {
            C1745340vWG c1745340vWG2 = c1745680vWo.LIZJ;
            if (c1745340vWG2 != null && c1745340vWG2.LIZ()) {
                return c1745680vWo;
            }
            return C1745680vWo.LIZ(c1745680vWo, null, null, false, null, null, null, 16379);
        }
        return c1745680vWo;
    }

    public final boolean LR2(String str) {
        InputItemData inputItemData;
        ClientConfig clientConfig;
        String str2;
        List listLJJLIIIJILLIZJL;
        if (str == null || (inputItemData = this.LLJJJJ) == null || (clientConfig = inputItemData.config) == null || (str2 = clientConfig.concatenateAddressKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        listLJJLIIIJILLIZJL.isEmpty();
        return Intrinsics.LJFF(str, C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL));
    }

    public final boolean MR2(String str) {
        InputItemData inputItemData;
        ClientConfig clientConfig;
        String str2;
        List listLJJLIIIJILLIZJL;
        if (str == null || (inputItemData = this.LLJJJJ) == null || (clientConfig = inputItemData.config) == null || (str2 = clientConfig.concatenateNameKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        listLJJLIIIJILLIZJL.isEmpty();
        return Intrinsics.LJFF(str, C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL));
    }

    public final boolean NR2(String str) {
        ClientConfig clientConfig;
        String str2;
        List listLJJLIIIJILLIZJL;
        InputItemData inputItemData = this.LLJJJJ;
        if (inputItemData == null || (clientConfig = inputItemData.config) == null || (str2 = clientConfig.concatenateAddressKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        return C13LP.LJJJJ(str, listLJJLIIIJILLIZJL);
    }

    public final boolean QR2(String str) {
        ClientConfig clientConfig;
        String str2;
        List listLJJLIIIJILLIZJL;
        ClientConfig clientConfig2;
        if (str == null) {
            return false;
        }
        InputItemData inputItemData = this.LLJJJJ;
        String str3 = null;
        if (inputItemData == null || (clientConfig = inputItemData.config) == null || (str2 = clientConfig.concatenateAddressKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        listLJJLIIIJILLIZJL.isEmpty();
        if (!listLJJLIIIJILLIZJL.contains(str)) {
            return false;
        }
        InputItemData inputItemData2 = this.LLJJJJ;
        if (inputItemData2 != null && (clientConfig2 = inputItemData2.config) != null) {
            str3 = clientConfig2.concatenateAddressRule;
        }
        if (!C123100dR.LIZ(str3)) {
            return false;
        }
        return true;
    }

    public final boolean RR2(String str) {
        ClientConfig clientConfig;
        String str2;
        List listLJJLIIIJILLIZJL;
        ClientConfig clientConfig2;
        if (str == null) {
            return false;
        }
        InputItemData inputItemData = this.LLJJJJ;
        String str3 = null;
        if (inputItemData == null || (clientConfig = inputItemData.config) == null || (str2 = clientConfig.concatenateNameKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        listLJJLIIIJILLIZJL.isEmpty();
        if (!listLJJLIIIJILLIZJL.contains(str)) {
            return false;
        }
        InputItemData inputItemData2 = this.LLJJJJ;
        if (inputItemData2 != null && (clientConfig2 = inputItemData2.config) != null) {
            str3 = clientConfig2.concatenateNameRule;
        }
        if (!C123100dR.LIZ(str3)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r19) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.UR2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address):void");
    }

    public final boolean VR2(String str) {
        String str2;
        List listLJJLIIIJILLIZJL;
        ClientConfig clientConfig = this.LLL;
        if (clientConfig == null || (str2 = clientConfig.singleStageSelectorKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        return C13LP.LJJJJ(str, listLJJLIIIJILLIZJL);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ac A[PHI: r5
      0x03ac: PHI (r5v13 java.lang.String) = (r5v12 java.lang.String), (r5v16 java.lang.String), (r5v16 java.lang.String) binds: [B:194:0x03a9, B:178:0x0365, B:185:0x0382] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ca A[PHI: r4
      0x04ca: PHI (r4v10 java.lang.String) = (r4v9 java.lang.String), (r4v13 java.lang.String), (r4v13 java.lang.String) binds: [B:262:0x04c7, B:247:0x0486, B:254:0x04a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List bS2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r33) {
        /*
            Method dump skipped, instruction units count: 2350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.bS2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cS2(AddressEditFragment addressEditFragment) {
        C19EH c19ehLJIIJ;
        Integer numValueOf = Integer.valueOf(addressEditFragment.getId());
        if (numValueOf != null) {
            numValueOf.intValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap<String, Object> map = this.LLJJIJIIJIL;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("fill_type", this.LLLLL.type());
            Address addressTR2 = tR2(XR2(), true);
            String string = null;
            if (addressTR2 != null) {
                C1177960gl8 c1177960gl8 = this.LLLJ;
                if (c1177960gl8 != null) {
                    String string2 = Double.valueOf(c1177960gl8.lat).toString();
                    C1177960gl8 c1177960gl82 = this.LLLJ;
                    if (c1177960gl82 != null) {
                        string = Double.valueOf(c1177960gl82.lon).toString();
                    }
                    addressTR2 = Address.LIZIZ(addressTR2, null, null, null, null, null, string, string2, 2559);
                }
            } else {
                addressTR2 = null;
            }
            AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = new AddressPageStarter.AddressMapDetailEnterParams((Integer) 1, (Integer) 1, addressTR2, C1741890vQh.LJIIIIZZ(linkedHashMap), "shipping_address", "shipping_address", (String) null, (Integer) (null == true ? 1 : 0), (Address) (null == true ? 1 : 0), (String) (null == true ? 1 : 0), numValueOf, Integer.valueOf(this.LLLLLIL ? 1 : 0), (List) this.LLJJIII, 3008);
            AddressMapDetailFragment2 addressMapDetailFragment2 = new AddressMapDetailFragment2();
            addressMapDetailFragment2.LLILZ = addressMapDetailEnterParams;
            addressMapDetailFragment2.LLJJJIL = new AwS570S0100000_26(addressEditFragment, 166);
            FragmentManager fragmentManagerDS = addressEditFragment.dS();
            if (fragmentManagerDS != null && (c19ehLJIIJ = fragmentManagerDS.LJIIJ()) != null) {
                c19ehLJIIJ.LIZJ(numValueOf.intValue(), addressMapDetailFragment2, "address_map_detail_fragment");
                c19ehLJIIJ.LJII("address_map_detail_fragment");
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    public final String hR2(Address address) {
        int size;
        List<AddressItem> list;
        List<AddressItem> list2;
        StringBuilder sb = new StringBuilder();
        if (address != null && (list2 = address.items) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        if (address != null && (list = address.items) != null) {
            for (AddressItem addressItem : list) {
                String str = addressItem.value;
                if (str != null && str.length() != 0) {
                    if (C13LP.LJJJJ(addressItem.key, this.LLLLZLL)) {
                        sb.append(addressItem.key);
                        size--;
                        if (size > 0) {
                            sb.append(",");
                        }
                    }
                }
            }
        }
        if (a0.LJJIJIL(sb, ",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public final void kR2(String str) {
        List listLJJLIIIJ;
        String str2;
        ClientConfig clientConfig = this.LLL;
        if (clientConfig == null || (str2 = clientConfig.geoAssociatedValidationItemKeys) == null || (listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{','}, false, 0, 6)) == null) {
            listLJJLIIIJ = C13BV.INSTANCE;
        }
        if (listLJJLIIIJ.contains(str)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJ) {
                if (!Intrinsics.LJFF(obj, str)) {
                    arrayList.add(obj);
                }
            }
            AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26(AFwS268S0000000_26.get$arr$(146), 8);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C1747550vZp((String) it2.next(), null));
            }
            setState(new AwS392S0200000_26(arrayList2, (List<C1747550vZp>) awS640S0100000_26, (Function2<? super C1745680vWo, ? super C1747550vZp, C1745680vWo>) 31));
            return;
        }
        if (Intrinsics.LJFF(str, "geo_l1")) {
            vS2("zipcode", AFwS268S0000000_26.get$arr$(147));
        }
    }

    public final void kS2(boolean z) {
        setState(new AwS38S0010000_26(z, 0));
    }

    public final boolean mR2(String str) {
        ClientConfig clientConfig;
        String str2;
        List listLJJLIIIJILLIZJL;
        InputItemData inputItemData = this.LLJJJJ;
        if (inputItemData == null || (clientConfig = inputItemData.config) == null || (str2 = clientConfig.enableDefocusCandidateKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        return C13LP.LJJJJ(str, listLJJLIIIJILLIZJL);
    }

    public final boolean nR2(String str) {
        ClientConfig clientConfig;
        String str2;
        List listLJJLIIIJILLIZJL;
        InputItemData inputItemData = this.LLJJJJ;
        if (inputItemData == null || (clientConfig = inputItemData.config) == null || (str2 = clientConfig.enableEditCandidateKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        return C13LP.LJJJJ(str, listLJJLIIIJILLIZJL);
    }

    public final void nS2(boolean z) {
        setStateImmediate(new AwS38S0010000_26(z, 1));
    }

    public boolean oR2(AddressEditState addressEditState) {
        int i;
        String str;
        this.LLLILZ = false;
        List<C1745680vWo> inputItemVOList = addressEditState.getInputItemVOList();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(inputItemVOList, 10));
        Iterator<C1745680vWo> it2 = inputItemVOList.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            C1745680vWo next = it2.next();
            C1745680vWo c1745680vWoLIZ = C1745680vWo.LIZ(next, null, null, false, null, null, null, 16383);
            if (!Intrinsics.LJFF(next.LIZ.key, "districts") || this.LLILZLL != null) {
                Object obj = c1745680vWoLIZ.LIZIZ;
                if (Intrinsics.LJFF(c1745680vWoLIZ.LIZ.key, "zipcode") && (obj instanceof String) && !a0.LJJJIL((CharSequence) obj)) {
                    if (Intrinsics.LJFF(c1745680vWoLIZ.LIZ.key, "zipcode") && !C1745310vWD.LIZ(c1745680vWoLIZ.LIZJ)) {
                        this.LLLILZ = true;
                    }
                } else {
                    zS2(c1745680vWoLIZ);
                    c1745680vWoLIZ = HR2(c1745680vWoLIZ);
                }
            }
            arrayList.add(c1745680vWoLIZ);
        }
        ArrayList<C1745680vWo> arrayList2 = (ArrayList) jR2(arrayList);
        Iterator it3 = arrayList2.iterator();
        while (true) {
            EnumC1154240g8s enumC1154240g8s = null;
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            C1745680vWo c1745680vWo = (C1745680vWo) next2;
            if (!C1745310vWD.LIZ(c1745680vWo.LIZJ)) {
                C1745340vWG c1745340vWG = c1745680vWo.LIZJ;
                if (c1745340vWG != null) {
                    enumC1154240g8s = c1745340vWG.LIZIZ;
                }
                if (enumC1154240g8s == EnumC1154240g8s.ERROR) {
                    if (next2 != null) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it4 = arrayList2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                if (Intrinsics.LJFF(((C1745680vWo) it4.next()).LIZ.key, "zipcode")) {
                                    withState(new AwS605S0100000_26(this, 824));
                                    break;
                                }
                            }
                        }
                        setState(new AwS605S0100000_26(arrayList, (List<C1745680vWo>) 150));
                        ArrayList arrayList3 = new ArrayList();
                        for (C1745680vWo c1745680vWo2 : arrayList2) {
                            if (C123100dR.LIZ(c1745680vWo2.LIZ.key) && (str = c1745680vWo2.LIZ.key) != null) {
                                arrayList3.add(str);
                            }
                        }
                        Address addressTR2 = tR2(addressEditState.getInputItemVOList(), false);
                        if (this.LLLILZ) {
                            i = 2;
                        }
                        jS2(this, false, arrayList3, 0L, "default", addressTR2, null, Integer.valueOf(i), 0, null, -99999999, 416);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void pS2(Address address) {
        String str;
        Double dLJII;
        String str2;
        Double dLJII2 = null;
        if (address != null) {
            str = address.latitude;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            if (address != null) {
                str2 = address.longitude;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT)) {
                return;
            }
        }
        if (address != null) {
            String str3 = address.latitude;
            if (str3 != null) {
                dLJII = C2327809Ae.LJII(str3);
            } else {
                dLJII = null;
                if (address != null) {
                }
                if (dLJII == null && dLJII2 != null) {
                    double dDoubleValue = dLJII2.doubleValue();
                    double dDoubleValue2 = dLJII.doubleValue();
                    this.LLLLII = true;
                    oS2(new C1177960gl8(dDoubleValue2, dDoubleValue), false);
                    return;
                }
            }
            String str4 = address.longitude;
            if (str4 != null) {
                dLJII2 = C2327809Ae.LJII(str4);
            }
            if (dLJII == null) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Boolean] */
    public final void wS2(boolean z) {
        C259800zU c259800zU = new C259800zU();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AddressEditLocationSetting.AddressEditLocationConfig addressEditLocationConfig = AddressEditLocationSetting.LIZ;
        AddressEditLocationSetting.AddressEditLocationConfig addressEditLocationConfig2 = (AddressEditLocationSetting.AddressEditLocationConfig) c0c64LJIILLIIL.LJJII(AddressEditLocationSetting.AddressEditLocationConfig.class, addressEditLocationConfig, "ec_address_edit_location", true);
        if (addressEditLocationConfig2 != null) {
            addressEditLocationConfig = addressEditLocationConfig2;
        }
        if (Intrinsics.LJFF(addressEditLocationConfig.needPreciseLocation, Boolean.TRUE)) {
            c259800zU.element = Boolean.valueOf(C1745180vW0.LJ());
        }
        setState(new AwS112S0110000_26(c259800zU, z, 3));
    }

    public final C1745340vWG zS2(C1745680vWo c1745680vWo) {
        Integer num;
        List<C1745680vWo> list;
        String str;
        Integer num2 = c1745680vWo.LIZ.type;
        if ((num2 != null && num2.intValue() == -100) || ((num = c1745680vWo.LIZ.type) != null && num.intValue() == -101)) {
            Object obj = c1745680vWo.LIZIZ;
            if ((obj instanceof List) && (list = (List) obj) != null) {
                boolean z = false;
                String str2 = null;
                for (C1745680vWo c1745680vWo2 : list) {
                    if (c1745680vWo2 != null) {
                        C1745340vWG c1745340vWGAS2 = AS2(c1745680vWo2);
                        if (c1745340vWGAS2.LIZ != null) {
                            z = true;
                        }
                        if (c1745340vWGAS2.LIZJ && (str = c1745340vWGAS2.LIZLLL) != null) {
                            str2 = str;
                        }
                    }
                }
                if (z) {
                    return new C1745340vWG("", null, false, str2, null, 22);
                }
            }
            return null;
        }
        return AS2(c1745680vWo);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[PHI: r5
      0x008b: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:37:0x0088, B:25:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1745340vWG BR2(X.C1745680vWo r12, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule r13) {
        /*
            r11 = this;
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "ecom_aep_verify_result_v2"
            r3 = 0
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r3)
            r4 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L18
            X.0vWG r0 = r11.YR2(r12, r13)
            return r0
        L18:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r12.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = r11.QR2(r0)
            r10 = 0
            if (r0 == 0) goto Lc0
            if (r13 != 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = r11.LLJJJJ
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r0.config
            if (r0 == 0) goto Lc0
            java.lang.String r6 = r0.concatenateAddressRule
            if (r6 == 0) goto Lc0
            java.lang.String r2 = r0.concatenateAddressKeys
            if (r2 == 0) goto Lc0
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r9 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r3, r0)
            if (r9 == 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r1 = r11.LLJJJJ
            if (r1 == 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L87
            java.lang.String r5 = r0.concatenateAddressError
        L4c:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L8b
            java.lang.String r3 = r0.concatenateAddressErrorStarlingKey
        L52:
            if (r5 == 0) goto Lc0
            int r0 = r5.length()
            if (r0 == 0) goto Lc0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.List r0 = r11.XR2()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r0.iterator()
        L6c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0vWo r0 = (X.C1745680vWo) r0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r0.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = X.C13LP.LJJJJ(r0, r9)
            if (r0 == 0) goto L6c
            r8.add(r1)
            goto L6c
        L87:
            r5 = r10
            if (r1 == 0) goto L8b
            goto L4c
        L8b:
            r3 = r10
            goto L52
        L8d:
            java.util.Iterator r2 = r8.iterator()
        L91:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r2.next()
            X.0vWo r0 = (X.C1745680vWo) r0
            java.lang.Object r1 = r0.LIZIZ
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L91
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L91
            int r0 = r1.length()
            if (r0 <= 0) goto L91
            r7.append(r1)
            goto L91
        Lb1:
            java.lang.String r0 = r7.toString()
            X.0vWG r0 = X.C1746030vXN.LIZIZ(r6, r0, r5, r3)
            if (r0 == 0) goto Lc0
            r11.LLLILZ = r4
            r12.LIZJ = r0
            return r0
        Lc0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.BR2(X.0vWo, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule):X.0vWG");
    }

    public final void CR2(Response<ChangeOrderShippingAddressResponseData> response, long j) {
        boolean z;
        String str;
        ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData = response.data;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (response.isCodeOK() && changeOrderShippingAddressResponseData != null) {
            Integer num = changeOrderShippingAddressResponseData.resultCode;
            if (num != null && num.intValue() != 0) {
                DR2(3, false, changeOrderShippingAddressResponseData, jElapsedRealtime, changeOrderShippingAddressResponseData.resultCode, changeOrderShippingAddressResponseData.toastMessage);
                return;
            }
            List<Error> list = changeOrderShippingAddressResponseData.errors;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Error error = (Error) C13LP.LJJJLL(changeOrderShippingAddressResponseData.errors);
                if (error != null) {
                    str = error.error;
                } else {
                    str = null;
                }
                DR2(3, false, changeOrderShippingAddressResponseData, jElapsedRealtime, -1, str);
                return;
            }
            DR2(-1, true, changeOrderShippingAddressResponseData, jElapsedRealtime, changeOrderShippingAddressResponseData.resultCode, changeOrderShippingAddressResponseData.toastMessage);
            return;
        }
        DR2(3, false, changeOrderShippingAddressResponseData, jElapsedRealtime, Integer.valueOf(response.code), response.message);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[PHI: r5
      0x008b: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:37:0x0088, B:25:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1745340vWG IR2(X.C1745680vWo r12, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule r13) {
        /*
            r11 = this;
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "ecom_aep_verify_result_v2"
            r3 = 0
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r3)
            r4 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L18
            X.0vWG r0 = r11.aS2(r12, r13)
            return r0
        L18:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r12.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = r11.RR2(r0)
            r10 = 0
            if (r0 == 0) goto Lc0
            if (r13 != 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = r11.LLJJJJ
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r0.config
            if (r0 == 0) goto Lc0
            java.lang.String r6 = r0.concatenateNameRule
            if (r6 == 0) goto Lc0
            java.lang.String r2 = r0.concatenateNameKeys
            if (r2 == 0) goto Lc0
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r9 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r3, r0)
            if (r9 == 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r1 = r11.LLJJJJ
            if (r1 == 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L87
            java.lang.String r5 = r0.concatenateNameError
        L4c:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L8b
            java.lang.String r3 = r0.concatenateNameErrorStarlingKey
        L52:
            if (r5 == 0) goto Lc0
            int r0 = r5.length()
            if (r0 == 0) goto Lc0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.List r0 = r11.XR2()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r0.iterator()
        L6c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0vWo r0 = (X.C1745680vWo) r0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r0.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = X.C13LP.LJJJJ(r0, r9)
            if (r0 == 0) goto L6c
            r8.add(r1)
            goto L6c
        L87:
            r5 = r10
            if (r1 == 0) goto L8b
            goto L4c
        L8b:
            r3 = r10
            goto L52
        L8d:
            java.util.Iterator r2 = r8.iterator()
        L91:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r2.next()
            X.0vWo r0 = (X.C1745680vWo) r0
            java.lang.Object r1 = r0.LIZIZ
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L91
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L91
            int r0 = r1.length()
            if (r0 <= 0) goto L91
            r7.append(r1)
            goto L91
        Lb1:
            java.lang.String r0 = r7.toString()
            X.0vWG r0 = X.C1746030vXN.LIZIZ(r6, r0, r5, r3)
            if (r0 == 0) goto Lc0
            r11.LLLILZ = r4
            r12.LIZJ = r0
            return r0
        Lc0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.IR2(X.0vWo, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule):X.0vWG");
    }

    public final C1745340vWG YR2(C1745680vWo c1745680vWo, Rule rule) {
        C1745340vWG c1745340vWGSR2;
        if (PR2() && rule == null) {
            if (((Intrinsics.LJFF(c1745680vWo.LIZ.key, "address_detail") && NR2(c1745680vWo.LIZ.key)) || (Intrinsics.LJFF(c1745680vWo.LIZ.key, "road_number") && NR2(c1745680vWo.LIZ.key))) && (c1745340vWGSR2 = SR2()) != null) {
                this.LLLILZ = true;
                c1745680vWo.LIZJ = c1745340vWGSR2;
                return c1745340vWGSR2;
            }
            return null;
        }
        return null;
    }

    public final C1745340vWG aS2(C1745680vWo c1745680vWo, Rule rule) {
        C1745340vWG c1745340vWGIR2;
        if ((Intrinsics.LJFF(c1745680vWo.LIZ.key, "first_name") || Intrinsics.LJFF(c1745680vWo.LIZ.key, "last_name")) && OR2() && rule == null && (c1745340vWGIR2 = iR2()) != null) {
            this.LLLILZ = true;
            c1745680vWo.LIZJ = c1745340vWGIR2;
            return c1745340vWGIR2;
        }
        return null;
    }

    public final void oS2(C1177960gl8 c1177960gl8, boolean z) {
        if (c1177960gl8.lat != 0.0d && c1177960gl8.lon != 0.0d) {
            this.LLLJ = c1177960gl8;
        }
        if (z && this.LLLIZZ != null) {
            return;
        }
        this.LLLIZZ = c1177960gl8;
        setState(new AwS605S0100000_26(c1177960gl8, 154));
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        String str3;
        Type type2;
        String str4 = null;
        if (Intrinsics.LJFF(str, "ec_zipcode_selected_event")) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(ZipCodeSelectedEvent.class));
                } else {
                    type = new TypeToken<ZipCodeSelectedEvent>() { // from class: X.0vZM
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof ZipCodeSelectedEvent)) {
                    objFromJson = null;
                }
                ZipCodeSelectedEvent zipCodeSelectedEvent = (ZipCodeSelectedEvent) objFromJson;
                if (zipCodeSelectedEvent != null && (str3 = zipCodeSelectedEvent.zipcode) != null) {
                    uS2(str3, "zipcode");
                    return;
                }
                return;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (Intrinsics.LJFF(str, "ec_address_map_locate_event")) {
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJII(MapLocateData.class));
                } else {
                    type2 = new TypeToken<MapLocateData>() { // from class: X.0vXV
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type2);
                if (!(objFromJson2 instanceof MapLocateData)) {
                    objFromJson2 = null;
                }
                MapLocateData mapLocateData = (MapLocateData) objFromJson2;
                if (mapLocateData != null) {
                    String str5 = "";
                    if (C1746150vXZ.LIZ()) {
                        TrackParams trackParams = mapLocateData.trackParams;
                        if (trackParams != null) {
                            str4 = trackParams.addressResult;
                        }
                        this.LLJLL = str4;
                        String str6 = mapLocateData.sessionKey;
                        if (str6 != null) {
                            str5 = str6;
                        }
                        this.LLJLIL = str5;
                        Address address = mapLocateData.shippingAddress;
                        if (address != null) {
                            tS2(this, address, null, null, null, false, false, null, null, null, null, 8186);
                            return;
                        }
                        return;
                    }
                    String str7 = mapLocateData.autoCompleteAddressId;
                    if (str7 != null && str7.length() != 0) {
                        String str8 = mapLocateData.autoCompleteAddressId;
                        TrackParams trackParams2 = mapLocateData.trackParams;
                        if (trackParams2 != null) {
                            str4 = trackParams2.addressResult;
                        }
                        this.LLJLL = str4;
                        String str9 = mapLocateData.sessionKey;
                        if (str9 != null) {
                            str5 = str9;
                        }
                        this.LLJLIL = str5;
                        dS2(this, mapLocateData.shippingAddress, str5, str8, null, null, null, null, new AwS605S0100000_26(this, 151), 112);
                    }
                }
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public final C1745680vWo rR2(C1745680vWo c1745680vWo, String str) {
        List<AddressItem> list;
        AddressItem next;
        String str2;
        Object obj = c1745680vWo.LIZIZ;
        if (obj != null && (!(obj instanceof String) || ((CharSequence) obj).length() > 0)) {
            return c1745680vWo;
        }
        String str3 = c1745680vWo.LIZ.key;
        if (xS2() && (str == null || str.length() == 0)) {
            Address address = this.LLJJL;
            if (address == null || (list = address.items) == null) {
                return c1745680vWo;
            }
            Iterator<AddressItem> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.key, str3)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AddressItem addressItem = next;
            if (addressItem == null || (str2 = addressItem.value) == null) {
                return c1745680vWo;
            }
            C1746460vY4.LJI(C1746460vY4.LIZ, str3);
            return C1745680vWo.LIZ(c1745680vWo, str2, null, false, null, null, null, 16381);
        }
        C1746460vY4.LJII(C1746460vY4.LIZ, str3);
        return C1745680vWo.LIZ(c1745680vWo, str, null, false, null, null, null, 16381);
    }

    public void rS2(C1745340vWG c1745340vWG, String str) {
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
            } else {
                arrayList2.add(c1745680vWo);
            }
        }
        setState(new AwS605S0100000_26(arrayList2, (List<C1745680vWo>) 155));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1745680vWo sS2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r13, X.C1745680vWo r14) {
        /*
            r12 = this;
            r4 = r14
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r4.LIZ
            java.lang.Integer r0 = r0.type
            r3 = 0
            if (r0 == 0) goto Lbc
            int r1 = r0.intValue()
            r0 = -100
            if (r1 != r0) goto Lbc
            r5 = 0
            r7 = 0
            r11 = 16379(0x3ffb, float:2.2952E-41)
            r6 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            X.0vWo r5 = X.C1745680vWo.LIZ(r4, r5, r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r12.LLL
            r4 = 0
            if (r0 == 0) goto L32
            java.lang.String r2 = r0.districtsConcatenateKeys
            if (r2 == 0) goto L32
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r1 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r7, r0)
            if (r1 != 0) goto L34
        L32:
            X.13BV r1 = X.C13BV.INSTANCE
        L34:
            java.lang.Object r6 = r5.LIZIZ
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto Lbb
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto Lbb
            java.util.Iterator r9 = r1.iterator()
        L42:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r2 = r9.next()
            int r8 = r4 + 1
            if (r4 < 0) goto Lb7
            java.util.Iterator r1 = r6.iterator()
        L54:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r4 = r1.next()
            r0 = r4
            X.0vWo r0 = (X.C1745680vWo) r0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r0.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L54
        L6b:
            X.0vWo r4 = (X.C1745680vWo) r4
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r13.items
            if (r0 == 0) goto Lb3
            java.util.Iterator r7 = r0.iterator()
        L75:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r2 = r7.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r1 = r0.key
            if (r4 == 0) goto Laf
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r4.LIZ
            if (r0 == 0) goto Laf
            java.lang.String r0 = r0.key
        L8c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L75
        L92:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r2
            if (r2 == 0) goto Lb3
            java.lang.String r1 = r2.value
        L98:
            if (r4 == 0) goto Lad
            java.lang.Object r0 = r4.LIZIZ
        L9c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto Laa
            if (r4 == 0) goto La8
            r4.LIZJ = r3
        La6:
            r4.LIZIZ = r1
        La8:
            r4 = r8
            goto L42
        Laa:
            if (r4 == 0) goto La8
            goto La6
        Lad:
            r0 = r3
            goto L9c
        Laf:
            r0 = r3
            goto L8c
        Lb1:
            r2 = r3
            goto L92
        Lb3:
            r1 = r3
            goto L98
        Lb5:
            r4 = r3
            goto L6b
        Lb7:
            X.C1697810uHb.LJIJI()
            throw r3
        Lbb:
            return r5
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.sS2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, X.0vWo):X.0vWo");
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address tR2(java.util.List<X.C1745680vWo> r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.tR2(java.util.List, boolean):com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address");
    }

    public final void uS2(Object obj, String str) {
        setState(new AwS392S0200000_26(Collections.singletonList(new C1747550vZp(str, null)), (List<C1747550vZp>) new AwS640S0100000_26(obj, 7), (Function2<? super C1745680vWo, ? super C1747550vZp, C1745680vWo>) 31));
    }

    public final void vS2(String str, Function1<? super C1745680vWo, C1745680vWo> function1) {
        setState(new AwS392S0200000_26(Collections.singletonList(new C1747550vZp(str, null)), (List<C1747550vZp>) new AwS640S0100000_26(function1, (Function1<? super C1745680vWo, C1745680vWo>) 6), (Function2<? super C1745680vWo, ? super C1747550vZp, C1745680vWo>) 31));
    }

    public void ER2(Address address, CheckShippingAddressData checkShippingAddressData, Integer num) {
        Integer num2;
        if (num != null && num.intValue() == 3) {
            if (checkShippingAddressData != null && checkShippingAddressData.verifyData != null && (num2 = checkShippingAddressData.verifyData.status) != null && num2.intValue() == 1) {
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

    public void KR2(C1745300vWC c1745300vWC, C1745680vWo c1745680vWo, C1745340vWG c1745340vWG) {
        SettingsManager.LIZLLL().getClass();
        if (!(!SettingsManager.LIZ("ecom_aep_verify_result_v2", false))) {
            ZR2(c1745300vWC, c1745680vWo, c1745340vWG);
            return;
        }
        if (c1745340vWG != null && c1745340vWG.LIZ()) {
            c1745300vWC.LJFF(c1745340vWG);
            return;
        }
        if (RR2(c1745680vWo.LIZ.key)) {
            setState(new AwS392S0200000_26(this, c1745340vWG, 26));
        } else if (QR2(c1745680vWo.LIZ.key)) {
            setState(new AwS392S0200000_26(this, c1745340vWG, 27));
        } else {
            c1745300vWC.LJFF(c1745340vWG);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void ZR2(C1745300vWC c1745300vWC, C1745680vWo c1745680vWo, C1745340vWG c1745340vWG) {
        C1745340vWG c1745340vWGSR2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = c1745680vWo.LIZ.key;
        if (str5 != null) {
            String str6 = null;
            switch (str5.hashCode()) {
                case -1147692044:
                    if (str5.equals("address")) {
                        if (c1745340vWG != null) {
                            str6 = c1745340vWG.LIZ;
                        }
                        if (C123100dR.LIZ(str6) && c1745340vWG != null && !c1745340vWG.LIZJ) {
                            c1745300vWC.LJFF(c1745340vWG);
                            return;
                        } else {
                            if (!PR2() || (c1745340vWGSR2 = SR2()) == null) {
                                return;
                            }
                            setState(new AwS605S0100000_26(c1745340vWGSR2, 842));
                            return;
                        }
                    }
                    break;
                case -160985414:
                    if (str5.equals("first_name")) {
                        if (c1745340vWG != null) {
                            str = c1745340vWG.LIZ;
                        } else {
                            str = null;
                        }
                        if (C123100dR.LIZ(str) && c1745340vWG != null && !c1745340vWG.LIZJ) {
                            c1745300vWC.LJFF(c1745340vWG);
                            return;
                        }
                        if (!OR2()) {
                            return;
                        }
                        if (c1745340vWG != null) {
                            str2 = c1745340vWG.LIZ;
                        } else {
                            str2 = null;
                        }
                        if (C123100dR.LIZ(str2)) {
                            c1745300vWC.LJFF(c1745340vWG);
                            return;
                        } else {
                            rS2(null, "first_name");
                            rS2(null, "last_name");
                            return;
                        }
                    }
                    break;
                case 120381180:
                    if (str5.equals("address_detail")) {
                        if (c1745340vWG != null) {
                            c1745300vWC.LJFF(c1745340vWG);
                            return;
                        }
                        if (!PR2()) {
                            return;
                        }
                        C1745340vWG c1745340vWGSR22 = SR2();
                        if (c1745340vWGSR22 != null) {
                            c1745300vWC.LJFF(c1745340vWGSR22);
                            return;
                        } else {
                            c1745300vWC.LIZIZ();
                            return;
                        }
                    }
                    break;
                case 2013122196:
                    if (str5.equals("last_name")) {
                        if (c1745340vWG != null) {
                            str3 = c1745340vWG.LIZ;
                        } else {
                            str3 = null;
                        }
                        if (C123100dR.LIZ(str3) && c1745340vWG != null && !c1745340vWG.LIZJ) {
                            c1745300vWC.LJFF(c1745340vWG);
                            return;
                        }
                        if (!OR2()) {
                            return;
                        }
                        if (c1745340vWG != null) {
                            str4 = c1745340vWG.LIZ;
                        } else {
                            str4 = null;
                        }
                        if (C123100dR.LIZ(str4)) {
                            rS2(c1745340vWG, "first_name");
                            rS2(c1745340vWG, "last_name");
                            return;
                        } else {
                            rS2(null, "first_name");
                            rS2(null, "last_name");
                            return;
                        }
                    }
                    break;
            }
        }
        c1745300vWC.LJFF(c1745340vWG);
    }

    public final void lR2(String str, String str2, boolean z) {
        if (Intrinsics.LJFF(str, "phone")) {
            this.LLLFZ = z;
            withState(new AwS112S0110000_26(this, z, 4));
        } else {
            if (!Intrinsics.LJFF(str, "tax_id")) {
                return;
            }
            this.LLLI = str2;
            C1745480vWU c1745480vWU = this.LLJJIJIL;
            HashMap<String, Object> map = this.LLJJIJIIJIL;
            c1745480vWU.getClass();
            AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
            if (addressEditFragment == null) {
                return;
            }
            C1748720vbi.LIZIZ(addressEditFragment, new C1747770vaB(), new AwS109S1200000_26(c1745480vWU, (C1745480vWU) map, (HashMap<String, Object>) str, (String) 40));
        }
    }

    public final C1745680vWo qR2(C1745680vWo c1745680vWo, CandInputData candInputData, String str) {
        ArrayList<C1745680vWo> arrayList;
        Address address;
        List<AddressItem> list;
        AddressItem next;
        List list2;
        Object obj = c1745680vWo.LIZIZ;
        String str2 = null;
        if ((obj instanceof List) && (list2 = (List) obj) != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof C1745680vWo) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (candInputData != null && (address = candInputData.address) != null && (list = address.items) != null) {
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
                str2 = addressItem.value;
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C1745680vWo c1745680vWoRR2 : arrayList) {
                if (Intrinsics.LJFF(c1745680vWoRR2.LIZ.key, str)) {
                    c1745680vWoRR2 = rR2(c1745680vWoRR2, str2);
                }
                arrayList2.add(c1745680vWoRR2);
            }
            return C1745680vWo.LIZ(c1745680vWo, arrayList2, null, false, null, null, null, 16381);
        }
        return rR2(c1745680vWo, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[Catch: Exception -> 0x01c7, TryCatch #1 {Exception -> 0x01c7, blocks: (B:61:0x00f6, B:63:0x00fe, B:65:0x0105, B:66:0x0109, B:68:0x010f, B:70:0x0122, B:71:0x0124, B:73:0x012a, B:75:0x0130, B:82:0x013c, B:84:0x014d, B:86:0x015c, B:89:0x0162, B:94:0x016d, B:96:0x0172, B:97:0x0174, B:99:0x0182, B:101:0x0186, B:102:0x018a, B:104:0x0190, B:106:0x01a3, B:108:0x01a7, B:111:0x01ae, B:115:0x01b7, B:20:0x0051, B:23:0x005f, B:25:0x0063, B:27:0x0067, B:38:0x0090, B:40:0x0094, B:42:0x009f, B:44:0x00a3, B:45:0x00ad, B:47:0x00b3, B:49:0x00bd, B:51:0x00c7, B:58:0x00dc, B:54:0x00d2, B:32:0x0072, B:34:0x007c, B:36:0x0086), top: B:123:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090 A[Catch: Exception -> 0x01c7, TryCatch #1 {Exception -> 0x01c7, blocks: (B:61:0x00f6, B:63:0x00fe, B:65:0x0105, B:66:0x0109, B:68:0x010f, B:70:0x0122, B:71:0x0124, B:73:0x012a, B:75:0x0130, B:82:0x013c, B:84:0x014d, B:86:0x015c, B:89:0x0162, B:94:0x016d, B:96:0x0172, B:97:0x0174, B:99:0x0182, B:101:0x0186, B:102:0x018a, B:104:0x0190, B:106:0x01a3, B:108:0x01a7, B:111:0x01ae, B:115:0x01b7, B:20:0x0051, B:23:0x005f, B:25:0x0063, B:27:0x0067, B:38:0x0090, B:40:0x0094, B:42:0x009f, B:44:0x00a3, B:45:0x00ad, B:47:0x00b3, B:49:0x00bd, B:51:0x00c7, B:58:0x00dc, B:54:0x00d2, B:32:0x0072, B:34:0x007c, B:36:0x0086), top: B:123:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe A[Catch: Exception -> 0x01c7, TryCatch #1 {Exception -> 0x01c7, blocks: (B:61:0x00f6, B:63:0x00fe, B:65:0x0105, B:66:0x0109, B:68:0x010f, B:70:0x0122, B:71:0x0124, B:73:0x012a, B:75:0x0130, B:82:0x013c, B:84:0x014d, B:86:0x015c, B:89:0x0162, B:94:0x016d, B:96:0x0172, B:97:0x0174, B:99:0x0182, B:101:0x0186, B:102:0x018a, B:104:0x0190, B:106:0x01a3, B:108:0x01a7, B:111:0x01ae, B:115:0x01b7, B:20:0x0051, B:23:0x005f, B:25:0x0063, B:27:0x0067, B:38:0x0090, B:40:0x0094, B:42:0x009f, B:44:0x00a3, B:45:0x00ad, B:47:0x00b3, B:49:0x00bd, B:51:0x00c7, B:58:0x00dc, B:54:0x00d2, B:32:0x0072, B:34:0x007c, B:36:0x0086), top: B:123:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yS2(X.C1745680vWo r19, java.lang.String r20, X.InterfaceC1364105Vn<? super X.C1745340vWG> r21) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.yS2(X.0vWo, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void gS2(SaveData saveData, long j, Address address, Integer num) {
        ArrayList arrayList;
        String str;
        String strLJJLIIIJ;
        List<Error> list;
        List<Error> list2;
        if (saveData != null && (list2 = saveData.errors) != null) {
            arrayList = new ArrayList();
            Iterator<Error> it2 = list2.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().key;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        } else {
            arrayList = null;
        }
        if (saveData != null) {
            str = saveData.dataInfo;
        } else {
            str = null;
        }
        int i = 0;
        if (saveData != null && saveData.LIZIZ()) {
            i = 2;
        }
        if (saveData != null && (list = saveData.errors) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Error> it3 = list.iterator();
            while (it3.hasNext()) {
                Integer num2 = it3.next().code;
                if (num2 != null) {
                    arrayList2.add(num2);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        jS2(this, false, arrayList, j, null, address, str, 3, i, strLJJLIIIJ, num, 8);
        if (saveData != null && saveData.exceptionUX != null) {
            setState(new AwS605S0100000_26(saveData, 152));
        } else {
            setState(AFwS268S0000000_26.get$arr$(148));
        }
    }

    public final void hS2(SaveData saveData, long j, Address address, Integer num) {
        Address address2;
        int i;
        ArrayList arrayList;
        List<Error> list = saveData.errors;
        String strLJJLIIIJ = null;
        if (list != null) {
            Iterator<Error> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Error next = it2.next();
                Integer num2 = next.type;
                if (num2 != null && num2.intValue() == 1) {
                    if (next != null) {
                        address2 = address;
                    }
                }
            }
            address2 = null;
        } else {
            address2 = null;
        }
        this.LLLLLLLLLL = address2;
        List<Error> list2 = saveData.errors;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<Error> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (Intrinsics.LJFF(it3.next().key, "zipcode")) {
                    withState(new AwS605S0100000_26(this, 824));
                    break;
                }
            }
        }
        setState(new AwS605S0100000_26(saveData, 153));
        if (saveData.LIZIZ()) {
            i = 2;
        } else {
            i = 0;
        }
        List<Error> list3 = saveData.errors;
        if (list3 != null) {
            arrayList = new ArrayList();
            Iterator<Error> it4 = list3.iterator();
            while (it4.hasNext()) {
                String str = it4.next().key;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        String str2 = saveData.dataInfo;
        List<Error> list4 = saveData.errors;
        if (list4 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Error> it5 = list4.iterator();
            while (it5.hasNext()) {
                Integer num3 = it5.next().code;
                if (num3 != null) {
                    arrayList2.add(num3);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        }
        jS2(this, false, arrayList, j, null, address, str2, 3, i, strLJJLIIIJ, num, 8);
    }

    public final void lS2(InputItemData inputItemData, Function0<Unit> function0, Boolean bool, Boolean bool2) {
        PudoAddress pudoAddress;
        AddressBase addressBase;
        String str;
        this.LLILZLL = inputItemData.regionInfo;
        this.LLL = inputItemData.config;
        this.LLLLLLLZIL = inputItemData.locationUseBar;
        PudoAddressModule pudoAddressModule = inputItemData.pudoAddressModule;
        if (pudoAddressModule != null && (pudoAddress = pudoAddressModule.pudoAddress) != null) {
            Address address = pudoAddress.address;
            this.LLJILJILJ = address;
            String str2 = null;
            if (address != null) {
                addressBase = address.addressBase;
            } else {
                addressBase = null;
            }
            this.LLLILZLLLI = addressBase;
            Address address2 = this.LLJ;
            if (address2 != null) {
                str = address2.id;
            } else {
                str = null;
            }
            this.LLJIJIL = str;
            if (address2 != null) {
                str2 = address2.addressId;
            }
            this.LLJILJIL = str2;
        }
        setState(new AwS235S0300000_26(this, inputItemData, bool, 11));
        if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
            withState(new AwS112S0110000_26(this, true, 19));
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void iS2(SaveData saveData, boolean z, Address address, long j, Integer num) {
        String str;
        Boolean bool;
        AddressEditFragment addressEditFragment;
        String str2 = saveData.id;
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        int i = !z ? 1 : 0;
        IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
        String str3 = saveData.id;
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        Address address2 = this.LLJILJILJ;
        if (address2 != null) {
            str = address2.pudoId;
        } else {
            str = null;
        }
        String str4 = saveData.pudoAddressId;
        C983603sw c983603sw = this.LLLLLJLJLL;
        if (c983603sw != null && Intrinsics.LJFF(c983603sw.LIZJ, Boolean.TRUE)) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        iEventCenterLIZ.LIZ("ec_address_change", C1741890vQh.LJIIIIZZ(new AddressPageStarter.AddressEvent(str3, i, null, str, str4, bool)));
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = this.LLJJJIL;
        if (addressEditEnterParams != null && addressEditEnterParams.updateCache && !Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT)) {
            C973303rH.LL.LIZIZ(str2);
        }
        if (this.LLLLL == EnumC1746650vYN.ADD) {
            C1747140vZA.LIZ.getClass();
            if (C1747140vZA.LIZ().contains("ec_address_draft")) {
                C1747140vZA.LIZ().erase("ec_address_draft");
            }
        }
        this.LLJI = str2;
        this.LLJJJ = new Pair<>(str2, address);
        setState(AFwS268S0000000_26.get$arr$(149));
        String str5 = saveData.dataInfo;
        if (this.LLLFF && (addressEditFragment = AddressEditFragment.LLLII) != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C04CK() { // from class: X.0vaD
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    return new C1748850vbv(new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("enter_from", new C1747940vaS[0]), new C1748840vbu("source_page_type", new C1747940vaS[0]), new C1748840vbu("entrance_form", new C1747940vaS[0]), new C1748840vbu("entrance_from_info", new C1747940vaS[0]), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("show_type", new C1747940vaS[0]), new C1748840vbu("mobile", new C1747940vaS[0]), new C1748840vbu("action_type", new C1747940vaS[0]), new C1748840vbu(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new C1747940vaS[0]), new C1748840vbu("fail_reason", new C1747940vaS[0]), new C1748840vbu("trigger_event", new C1747940vaS[0]), new C1748840vbu("page_show_type", new C1747940vaS[0]));
                }
            }, new AwS140S1100000_26(this, str5, 58));
        }
        jS2(this, true, C13BV.INSTANCE, j, null, address, saveData.dataInfo, null, 0, null, num, 456);
    }

    public static void WR2(AddressEditViewModel addressEditViewModel, String str, Integer num, Map map, String str2, int i) {
        Map linkedHashMap = map;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            linkedHashMap = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        addressEditViewModel.getClass();
        if (str != null) {
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            if (num == null) {
                linkedHashMap.put("is_success", "1");
            } else {
                linkedHashMap.put("is_success", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("error_code", num);
            }
            if (str2 != null) {
                linkedHashMap.put("fail_reason", str2);
            }
            linkedHashMap.put("module_type", "with_address_authorization");
            linkedHashMap.put("sug_type", "latitude_longitude");
            C1745480vWU c1745480vWU = addressEditViewModel.LLJJIJIL;
            HashMap<String, Object> map2 = addressEditViewModel.LLJJIJIIJIL;
            c1745480vWU.getClass();
            AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
            if (addressEditFragment != null) {
                C1748720vbi.LIZIZ(addressEditFragment, new C04CK() { // from class: X.0vaC
                    @Override // X.AbstractC1748790vbp
                    public final C1748850vbv LIZ() {
                        return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("enter_from_info", new C1747940vaS[0]), new C1748840vbu("entrance_form", new C1747940vaS[0]), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("fill_type", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("page_show_type", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("source_page_type", new C1747940vaS[0]), new C1748840vbu("source_previous_page", new C1747940vaS[0]), new C1748840vbu("module_name", new C1747940vaS[0]), new C1748840vbu("module_type", new C1747940vaS[0]));
                    }
                }, new AwS62S1300000_26(c1745480vWU, (C1745480vWU) map2, (HashMap<String, Object>) str, (String) linkedHashMap, (Map<String, ? extends Object>) 9));
            }
        }
    }

    public static void vR2(AddressEditViewModel addressEditViewModel, String str, String str2, String str3, InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        String str4 = str3;
        String str5 = str2;
        if ((i & 2) != 0) {
            str5 = null;
        }
        if ((i & 4) != 0) {
            str4 = null;
        }
        addressEditViewModel.wR2(str, addressEditViewModel.tR2(addressEditViewModel.XR2(), true), str5, str4, null, null, interfaceC1631620sYq);
    }

    public final void DR2(Integer num, boolean z, ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData, long j, Integer num2, String str) {
        String strLJJLIIIJ;
        List<Error> list;
        setState(new AwS109S1200000_26(num, num2, str, 3));
        if (changeOrderShippingAddressResponseData != null && (list = changeOrderShippingAddressResponseData.errors) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Error> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer num3 = it2.next().code;
                if (num3 != null) {
                    arrayList.add(num3);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C1747720va6(), new C1746580vYG(z, changeOrderShippingAddressResponseData, this, j, strLJJLIIIJ, num2));
        }
    }

    public final void eS2(int i, Context context, final String str, final String str2, boolean z, boolean z2) {
        IECommerceHostService iECommerceHostService;
        boolean z3;
        IECommerceHostService iECommerceHostService2;
        boolean z4;
        if (Intrinsics.LJFF(this.LLJI, CardStruct.IStatusCode.DEFAULT) && context != null) {
            Cert uSLocatePermissionTokenCert = null;
            String name = null;
            String name2 = null;
            if (C1745180vW0.LJFF()) {
                if (i == 1) {
                    setState(new AwS38S0010000_26(true, 19));
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        ILocationDependencyService iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                        if (iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        String name3 = ILocationDependencyService.class.getName();
                        if (iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin != null) {
                            name = iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z4);
                        iECommerceHostService2 = iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin;
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
                    }
                    Cert uSMapLocateDataTokenCert = ((ILocationDependencyService) iECommerceHostService2).getUSMapLocateDataTokenCert();
                    AwS42S1110000_26 awS42S1110000_26 = new AwS42S1110000_26(this, str2, z2, 1);
                    CertProviderManagerKt.findCert("bpea-ecom_address_map_locate", 1476395008, "svfi");
                    try {
                        C1745180vW0.LIZ(uSMapLocateDataTokenCert, awS42S1110000_26);
                        return;
                    } finally {
                    }
                }
                AwS42S1110000_26 awS42S1110000_262 = new AwS42S1110000_26(this, str2, z2, 0);
                CertProviderManagerKt.findCert("bpea-ecom_address_map_locate", 1476395008, "svfi");
                try {
                    C1745180vW0.LIZ(null, awS42S1110000_262);
                    return;
                } finally {
                }
            }
            if (z) {
                if (i == 1) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        ILocationDependencyService iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin2 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                        if (iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String name4 = ILocationDependencyService.class.getName();
                        if (iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin2 != null) {
                            name2 = iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin2.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z3);
                        iECommerceHostService = iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin2;
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
                    }
                    uSLocatePermissionTokenCert = ((ILocationDependencyService) iECommerceHostService).getUSLocatePermissionTokenCert();
                }
                C1745180vW0.LJII(context, "shipping_info", "click", "shipping_info", new C1AUJ() { // from class: X.0vVx
                    @Override // X.C1AUJ
                    public final void LIZ() {
                        this.LIZ.wS2(true);
                        AddressEditViewModel addressEditViewModel = this.LIZ;
                        addressEditViewModel.LLJJIJIL.LJIIJJI(true, addressEditViewModel.LLJJIJIIJIL, str, str2, null);
                    }

                    @Override // X.C1AUJ
                    public final void LIZIZ() {
                        AddressEditViewModel addressEditViewModel = this.LIZ;
                        addressEditViewModel.LLJJIJIL.LJIIJJI(false, addressEditViewModel.LLJJIJIIJIL, str, str2, null);
                    }

                    @Override // X.C1AUJ
                    public final void LIZJ(String str3) {
                        AddressEditViewModel addressEditViewModel = this.LIZ;
                        addressEditViewModel.LLJJIJIL.LJIIJJI(false, addressEditViewModel.LLJJIJIIJIL, str, str2, null);
                    }
                }, new C1AUM() { // from class: X.0vVz
                    @Override // X.C1AUM
                    public final void LIZ() {
                        AddressEditViewModel addressEditViewModel = this.LIZ;
                        C1745480vWU.LJIILIIL(8, addressEditViewModel.LLJJIJIL, str, str2, addressEditViewModel.LLJJIJIIJIL);
                    }
                }, uSLocatePermissionTokenCert);
            }
        }
    }

    public static void zR2(AddressEditViewModel addressEditViewModel, int i, Boolean bool, Boolean bool2, Function0 function0, Function0 function02, int i2) {
        Function0 function03 = function02;
        Function0 function04 = function0;
        Boolean bool3 = bool2;
        if ((i2 & 2) != 0) {
            bool = null;
        }
        if ((i2 & 4) != 0) {
            bool3 = Boolean.TRUE;
        }
        if ((i2 & 8) != 0) {
            function04 = null;
        }
        if ((i2 & 16) != 0) {
            function03 = null;
        }
        addressEditViewModel.getClass();
        C7879035x.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
                    addressEditViewModel.setState(new AwS38S0001000_26(0, 16));
                }
                addressEditViewModel.LLLIILIL = SystemClock.elapsedRealtime();
                C948503nH.LJFF(addressEditViewModel, C23271099x.INSTANCE, new C1746420vY0(addressEditViewModel, i, function03, function04, bool3, null));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        addressEditViewModel.setState(new AwS38S0001000_26(2, 16));
        C1745480vWU.LJIIJ(addressEditViewModel.LLJJIJIL, "", Integer.valueOf(addressEditViewModel.LLLIL));
        if (function03 != null) {
            function03.invoke();
        }
    }

    public final void wR2(String str, Address address, String str2, String str3, String str4, C1744080vUE c1744080vUE, InterfaceC1631620sYq<? super CandInputDataOptions, ? super Boolean, ? super String, Unit> interfaceC1631620sYq) {
        C7879035x.LIZ();
        try {
            if (C036E.LIZ.LIZIZ() && str != null && str.length() != 0 && address != null) {
                C948503nH.LJFF(this, C23271099x.INSTANCE, new C1746470vY5(address, c1744080vUE, this, str2, str, str3, str4, interfaceC1631620sYq, null));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        interfaceC1631620sYq.invoke(null, Boolean.TRUE, null);
    }

    public static void dS2(AddressEditViewModel addressEditViewModel, Address address, String str, String str2, Integer num, String str3, String str4, AwS570S0100000_26 awS570S0100000_26, Function1 function1, int i) {
        AwS570S0100000_26 awS570S0100000_262 = awS570S0100000_26;
        String str5 = str4;
        String str6 = str3;
        if ((i & 16) != 0) {
            str6 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            awS570S0100000_262 = null;
        }
        addressEditViewModel.getClass();
        if (address != null && str != null && str2 != null && str2.length() != 0) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C990903u7(address, str, str2, num, addressEditViewModel, str6, str5, function1, awS570S0100000_262, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public static void jS2(AddressEditViewModel addressEditViewModel, boolean z, List list, long j, String str, Address address, String str2, Integer num, int i, String str3, Integer num2, int i2) {
        String str4 = str3;
        Integer num3 = num;
        String str5 = str2;
        Address address2 = address;
        ?? r9 = i;
        String str6 = str;
        if ((i2 & 8) != 0) {
            str6 = addressEditViewModel.LLLLIL;
        }
        Integer num4 = null;
        if ((i2 & 16) != 0) {
            address2 = null;
        }
        if ((i2 & 32) != 0) {
            str5 = null;
        }
        if ((i2 & 64) != 0) {
            num3 = 0;
        }
        if ((i2 & 128) != 0) {
            r9 = z;
        }
        if ((i2 & 256) != 0) {
            str4 = null;
        }
        if ((i2 & 512) == 0) {
            num4 = num2;
        }
        addressEditViewModel.getClass();
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str5);
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C1747720va6(), new C1746440vY2(z, list, addressEditViewModel, str6, j, r9, address2, str4, num4, str5, num3, mapLJIIJ));
        }
    }

    public static void tS2(AddressEditViewModel addressEditViewModel, Address address, List list, String str, Integer num, boolean z, boolean z2, Boolean bool, Map map, String str2, String str3, int i) {
        boolean z3;
        boolean z4;
        String str4 = str3;
        Map map2 = map;
        Boolean bool2 = bool;
        boolean z5 = z2;
        boolean z6 = z;
        Integer num2 = num;
        String str5 = str;
        String str6 = str2;
        List list2 = list;
        if ((i & 2) != 0) {
            list2 = C13BV.INSTANCE;
        }
        boolean z7 = true;
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            z6 = false;
        }
        if ((i & 64) != 0) {
            z5 = false;
        }
        if ((i & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) == 0) {
            z7 = false;
        }
        if ((i & 1024) != 0) {
            map2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str4 = null;
        }
        addressEditViewModel.getClass();
        if (str6 != null) {
            if (!Intrinsics.LJFF(str6, "latitude_longitude") && !Intrinsics.LJFF(str6, "map_pin")) {
                addressEditViewModel.LLLLZ = null;
                addressEditViewModel.LLLLZI = null;
            } else {
                addressEditViewModel.LLLLZ = address;
                addressEditViewModel.LLLLZI = map2;
            }
            addressEditViewModel.LLLLLZL = str6;
            addressEditViewModel.withState(new AwS109S1200000_26(address, (Address) str6, (String) map2, (Map<String, ? extends Object>) 38));
        } else if (str4 != null) {
            addressEditViewModel.withState(new AwS109S1200000_26(address, (Address) str4, (String) map2, (Map<String, ? extends Object>) 39));
        }
        if (z3) {
            AddressEditState addressEditStateFQ2 = addressEditViewModel.FQ2();
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            List<C1745680vWo> inputItemVOList = addressEditStateFQ2.getInputItemVOList();
            c1746460vY4.getClass();
            C1746460vY4.LJIIIIZZ(address, inputItemVOList, null);
        }
        addressEditViewModel.setState(new C1746540vYC(addressEditViewModel, address, bool2, list2, z7, z4, str5, num2, z3, str6, map2, z6, z5));
    }
}
