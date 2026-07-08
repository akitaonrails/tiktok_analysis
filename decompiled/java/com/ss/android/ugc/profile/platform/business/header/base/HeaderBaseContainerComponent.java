package com.ss.android.ugc.profile.platform.business.header.base;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09RD;
import X.C09RE;
import X.C1214750hiT;
import X.C1214780hiW;
import X.C1248210iaR;
import X.C1248730ibH;
import X.C1248840ibS;
import X.C1248890ibX;
import X.C1248900ibY;
import X.C1248950ibd;
import X.C1250680ieQ;
import X.C13IQ;
import X.C1558520qew;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C299970BpL;
import X.C300150Bpd;
import X.C452501pT;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1253850ijX;
import Y.ARunnableS119S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S1010100_19;
import kotlin.jvm.internal.AwS11S1000100_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HeaderBaseContainerComponent extends BaseContainerComponent {
    public ViewGroup LLJJIJIIJIL;
    public int LLJJJ;
    public boolean LLJJL;
    public final String LLJJIJI = "divider";
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2468));
    public final Set<String> LLJJJIL = new LinkedHashSet();
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2470));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2471));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2469));

    public abstract void hp(ProfileComponentUIConfig profileComponentUIConfig);

    public void ip() {
    }

    public View kp(View view, ViewGroup viewGroup) {
        return view;
    }

    public boolean op() {
        return false;
    }

    public void sp(String str) {
    }

    public void cp() {
        IHeaderBaseAbility iHeaderBaseAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderBaseAbility = (IHeaderBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBaseAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderBaseAbility.LJIIIZ(this.LLJJ, viewGroup, str);
    }

    public final C1248950ibd mp() {
        return (C1248950ibd) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        String str;
        super.onCreate();
        C1248950ibd c1248950ibdMp = mp();
        this.LLJJ = c1248950ibdMp != null ? c1248950ibdMp.LL : -1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        hp((ProfileComponentUIConfig) this.LLJJJJLIIL.getValue());
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (C299970BpL.LIZ()) {
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            String str2 = this.assemTagInternal;
            str = str2 != null ? str2 : "";
            long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
            boolean z = this.LLJILLL;
            c1250680ieQ.getClass();
            if (!z ? !Intrinsics.LJFF(((LinkedHashMap) C1250680ieQ.LJFF).get(str), Boolean.TRUE) : !Intrinsics.LJFF(((LinkedHashMap) C1250680ieQ.LJ).get(str), Boolean.TRUE)) {
                C20684815ws.LJFF().execute(new ARunnableS119S0100000_19((Function0) new AwS0S1010100_19(str, z, j, 0), 222));
                if (z) {
                    C1250680ieQ.LJ.put(str, Boolean.TRUE);
                } else {
                    C1250680ieQ.LJFF.put(str, Boolean.TRUE);
                }
            }
        } else {
            C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
            String str3 = this.assemTagInternal;
            str = str3 != null ? str3 : "";
            long j2 = jCurrentTimeMillis2 - jCurrentTimeMillis;
            c1250680ieQ2.getClass();
            Map<String, Boolean> map = C1250680ieQ.LJ;
            Object obj = ((LinkedHashMap) map).get(str);
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(obj, bool)) {
                C20684815ws.LJFF().execute(new ARunnableS119S0100000_19((Function0) new AwS11S1000100_19(str, j2, 1), 222));
                map.put(str, bool);
            }
        }
        cp();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public void Hj(ProfileComponents profileComponents) {
        dp(profileComponents.components);
    }

    public void dp(List<? extends ProfileComponents> list) {
        int size;
        Iterator it2;
        ArrayList arrayList = null;
        if (list != null) {
            arrayList = new ArrayList(list);
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assembleComponent start container=");
        sbLIZ.append(str);
        sbLIZ.append(", componentCount=");
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        C1248210iaR.LJ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.BUSINESS, "AssembleStart");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (arrayList != null && (it2 = arrayList.iterator()) != null) {
            while (it2.hasNext()) {
                String str2 = ((ProfileComponents) it2.next()).componentName;
                if (str2 == null) {
                    str2 = "";
                }
                if (!linkedHashSet.add(str2)) {
                    it2.remove();
                }
            }
        }
        C723850SaN.LIZLLL(this, new C1248900ibY(this, arrayList, str));
    }

    public final void ep(boolean z) {
        ProfileCommonInfo profileCommonInfoWG2;
        String uid;
        UserProfileInfo userProfileInfo;
        if (!((ArrayList) this.LLJI).isEmpty()) {
            if (((!this.LLJILJIL.isEmpty()) && !z) || this.LLJJL) {
                return;
            }
            for (String str : (ArrayList) this.LLJI) {
                if (!this.LLJILJIL.containsKey(str)) {
                    IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) this.LLJJJJJIL.getValue();
                    String strSa0 = null;
                    if (iProfileBaseAbility != null) {
                        profileCommonInfoWG2 = iProfileBaseAbility.wG2();
                    } else {
                        profileCommonInfoWG2 = null;
                    }
                    C1248840ibS c1248840ibS = C1248840ibS.LIZ;
                    if (profileCommonInfoWG2 != null && (userProfileInfo = profileCommonInfoWG2.getUserProfileInfo()) != null) {
                        uid = userProfileInfo.getUid();
                    } else {
                        uid = null;
                    }
                    boolean z2 = this.LLJILLL;
                    String str2 = this.assemTagInternal;
                    IProfileBaseAbility iProfileBaseAbility2 = (IProfileBaseAbility) this.LLJJJJJIL.getValue();
                    if (iProfileBaseAbility2 != null) {
                        strSa0 = iProfileBaseAbility2.sa0();
                    }
                    c1248840ibS.getClass();
                    C1248840ibS.LIZLLL(str, uid, str2, strSa0, z2);
                }
            }
            this.LLJJL = this.LLJILJIL.isEmpty();
        }
    }

    public void tp(String str, C13IQ<? extends AbstractC738140SxQ> c13iq) {
        int iIntValue;
        C723850SaN.LJII(this, c13iq, str);
        boolean z = true;
        if (!this.LLJJJIL.contains(str)) {
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            z = false;
            if (viewGroup != null) {
                Iterator<View> it2 = new C09RD(viewGroup).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (!c09re.hasNext()) {
                        break;
                    }
                    View view = (View) c09re.next();
                    if (Intrinsics.LJFF(view.getTag(R.id.s10), str)) {
                        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(view, viewGroup2);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            Integer num = (Integer) ((LinkedHashMap) this.LLJILJILJ).get(str);
            if (num != null && (iIntValue = num.intValue()) != -1) {
                for (Map.Entry entry : ((LinkedHashMap) this.LLJILJILJ).entrySet()) {
                    Object key = entry.getKey();
                    int iIntValue2 = ((Number) entry.getValue()).intValue();
                    if (iIntValue2 > iIntValue) {
                        this.LLJILJILJ.put((String) key, Integer.valueOf(iIntValue2 - 1));
                    }
                }
            }
            this.LLJILJIL.remove(str);
            this.LLJILJILJ.remove(str);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unloadAssemAndClearData warning: ");
            sbLIZ.append(str);
            sbLIZ.append(", indexOfComponentMap not found");
            C1248210iaR.LIZJ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("componentTag=");
        sbLIZ2.append(str);
        sbLIZ2.append(", hasRemoved=");
        sbLIZ2.append(z);
        C1248210iaR.LJ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ2), EnumC1253850ijX.BUSINESS, "unloadAssemAndClearData");
    }

    public static boolean lp(HeaderBaseContainerComponent headerBaseContainerComponent, ProfileComponents profileComponents, List list, int i) {
        ProfileComponents profileComponents2 = profileComponents;
        List list2 = null;
        if ((i & 2) != 0) {
            profileComponents2 = null;
        }
        if ((i & 4) == 0) {
            list2 = list;
        }
        headerBaseContainerComponent.getClass();
        if (C1248730ibH.LIZIZ()) {
            boolean zBooleanValue = ((Boolean) headerBaseContainerComponent.LLJJJJ.getValue()).booleanValue();
            String str = (String) ((Map) C1248890ibX.LIZLLL.getValue()).get(headerBaseContainerComponent.assemTagInternal);
            if (str == null) {
                str = "";
            }
            if (C1248730ibH.LIZ(zBooleanValue, str, list2, profileComponents2, false, 16)) {
                return true;
            }
            return false;
        }
        return ((Boolean) headerBaseContainerComponent.LLJJJJ.getValue()).booleanValue();
    }

    public final void ap(View view, ViewGroup viewGroup, View view2, boolean z, int i, boolean z2) {
        boolean z3;
        Object tag;
        int measuredHeight;
        boolean z4;
        ViewGroup viewGroup2;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup2);
        }
        if (op() && C300150Bpd.LIZ()) {
            View viewKp = kp(view, viewGroup);
            if (viewKp == null || viewKp.getVisibility() != 0 || viewKp.getMeasuredHeight() == 0) {
                BPEAHandler bPEAHandler = C1214750hiT.LIZ;
                String str = this.assemTagInternal;
                if (viewKp != null) {
                    measuredHeight = viewKp.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                ip();
                if (C300150Bpd.LIZ() && str != null && viewKp != null) {
                    int iHashCode = str.hashCode() + 1;
                    BPEAHandler bPEAHandler2 = C1214750hiT.LIZ;
                    if (!bPEAHandler2.hasMessages(iHashCode)) {
                        C786410Ut5.LJLLLLLL(8, viewKp);
                        viewKp.setTag(R.id.s0z, new C1214780hiW(str, measuredHeight, true, null, null, null, null));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("startComponentAnimation v1, whatValue=");
                        sbLIZ.append(iHashCode);
                        sbLIZ.append(", tag=");
                        sbLIZ.append(str);
                        sbLIZ.append(", view=");
                        sbLIZ.append(viewKp);
                        sbLIZ.append("， visible = ");
                        if (viewKp.getVisibility() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        sbLIZ.append(z4);
                        sbLIZ.append(", current height = ");
                        sbLIZ.append(viewKp.getHeight());
                        sbLIZ.append(", ");
                        sbLIZ.append(viewKp.getMeasuredHeight());
                        C2188811AlT.LIZIZ(sbLIZ);
                        C786410Ut5.LJLJLJ(bPEAHandler2, bPEAHandler2.obtainMessage(iHashCode, str.hashCode(), 0, viewKp), 5L);
                    }
                }
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addView startComponentAnimation, containerView = ");
            sbLIZ2.append(viewKp);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (viewGroup.getChildAt(i - 1) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && view2 != null && viewGroup.getChildCount() != 0 && z3) {
            View childAt = viewGroup.getChildAt(i - 1);
            if (childAt != null) {
                tag = childAt.getTag();
            } else {
                tag = null;
            }
            if (!Intrinsics.LJFF(tag, this.LLJJIJI)) {
                viewGroup.addView(view2, i);
                viewGroup.addView(view, 1 + i);
                return;
            }
        }
        viewGroup.addView(view, i);
        if (view2 == null || z2) {
            return;
        }
        view2.setTag(this.LLJJIJI);
        viewGroup.addView(view2, 1 + i);
    }

    public static void bp(HeaderBaseContainerComponent headerBaseContainerComponent, String str, int i, View view, ViewGroup viewGroup, View view2, boolean z, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        View view3 = view2;
        ViewGroup viewGroup2 = viewGroup;
        if ((i2 & 8) != 0) {
            viewGroup2 = headerBaseContainerComponent.LLJJIJIIJIL;
        }
        if ((i2 & 16) != 0) {
            view3 = null;
        }
        if ((i2 & 32) != 0) {
            z = false;
        }
        headerBaseContainerComponent.getClass();
        if (viewGroup2 != null) {
            if (view3 == null && !z && !Intrinsics.LJFF(str, "advanced_feature")) {
                z2 = false;
                headerBaseContainerComponent.LLJJJIL.remove(str);
            } else {
                z2 = true;
                headerBaseContainerComponent.LLJJJIL.add(str);
            }
            if (headerBaseContainerComponent.LLJJIJIIJIL == null) {
                headerBaseContainerComponent.LLJJIJIIJIL = viewGroup2;
            }
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addViewToContainerView: componentName = ");
            sbLIZ.append(str);
            sbLIZ.append(", index = ");
            sbLIZ.append(i);
            sbLIZ.append(", hasDivider = ");
            sbLIZ.append(z2);
            sbLIZ.append("， from = ");
            sbLIZ.append(headerBaseContainerComponent.assemTagInternal);
            C2188811AlT.LIZIZ(sbLIZ);
            view.setTag(R.id.s10, str);
            if (i != -1 && viewGroup2.indexOfChild(view) != i) {
                if (viewGroup2.indexOfChild(view) != -1) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup2);
                }
                if (headerBaseContainerComponent.LLJJJ == 0) {
                    if (1 == headerBaseContainerComponent.LLJILJILJ.size()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (headerBaseContainerComponent.LLJJJ + 1 == headerBaseContainerComponent.LLJILJILJ.size()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    headerBaseContainerComponent.ap(view, viewGroup2, view3, z6, 0, z7);
                    headerBaseContainerComponent.LLJJJ++;
                    return;
                }
                int childCount = viewGroup2.getChildCount();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup2.getChildAt(i6);
                    if (childAt != null) {
                        if (Intrinsics.LJFF(childAt.getTag(), headerBaseContainerComponent.LLJJIJI)) {
                            i5++;
                            i4++;
                        } else if (i6 >= i + i4) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                Map<String, Integer> map = headerBaseContainerComponent.LLJILJILJ;
                if (!map.isEmpty()) {
                    Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
                    while (it2.hasNext()) {
                        if (((Number) ((Map.Entry) it2.next()).getValue()).intValue() > i) {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = false;
                } else {
                    z3 = false;
                }
                int i7 = headerBaseContainerComponent.LLJJJ + 1;
                headerBaseContainerComponent.LLJJJ = i7;
                if (i7 == headerBaseContainerComponent.LLJILJILJ.size() && !z3) {
                    z4 = true;
                } else {
                    z4 = false;
                    if (!z3 && 0 == 0) {
                        z5 = false;
                    }
                    headerBaseContainerComponent.ap(view, viewGroup2, view3, z5, i5, z4);
                }
                z5 = true;
                headerBaseContainerComponent.ap(view, viewGroup2, view3, z5, i5, z4);
            }
        }
    }
}
