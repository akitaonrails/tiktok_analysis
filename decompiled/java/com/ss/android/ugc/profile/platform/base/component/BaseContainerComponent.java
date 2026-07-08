package com.ss.android.ugc.profile.platform.base.component;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01TN;
import X.C01TO;
import X.C0PEM;
import X.C1248210iaR;
import X.C1248930ibb;
import X.C1248960ibe;
import X.C1250680ieQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C287560BOw;
import X.C299970BpL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.EnumC1253850ijX;
import X.InterfaceC1248970ibf;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS119S0100000_19;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.mode.ProfileModesAndFeaturesInfo;
import com.ss.android.ugc.profile.platform.base.mode.ProfileSingleModeAndFeaturesList;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS11S1000100_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseContainerComponent extends UIContentAssem implements InterfaceC1248970ibf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final Map<String, C1248930ibb> LLIZLLLIL = new LinkedHashMap();
    public final List<String> LLJ;
    public final List<String> LLJI;
    public final Map<String, Map<Integer, ProfileComponents>> LLJIJIL;
    public final Map<String, String> LLJILJIL;
    public final Map<String, Integer> LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseContainerComponent.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseContainerComponent() {
        new LinkedHashMap();
        this.LLJ = new ArrayList();
        this.LLJI = new ArrayList();
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJIL = new LinkedHashMap();
        this.LLJILJILJ = new LinkedHashMap();
        this.LLJJ = -1;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2455), AFwS257S0000000_19.get$arr$(483), null, true);
    }

    public void Go() {
    }

    public void Hj(ProfileComponents profileComponents) {
    }

    public void Lo() {
    }

    public abstract void No();

    public final ProfilePlatformViewModel So() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || !fragmentLJI.isDetached()) {
            AssemVMLazy assemVMLazy = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
            return (ProfilePlatformViewModel) assemVMLazy.getValue();
        }
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        String str = this.assemTagInternal;
        if (str == null) {
            str = "container empty assemTag";
        }
        c1250680ieQ.getClass();
        C1250680ieQ.LJFF(str);
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        this.LLJILLL = profileBaseAbility != null ? profileBaseAbility.q1() : false;
        new AwS563S0100000_19(this, 2454).invoke();
        Lo();
        long jCurrentTimeMillis = System.currentTimeMillis();
        No();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (C299970BpL.LIZ()) {
            return;
        }
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
        c1250680ieQ.getClass();
        Map<String, Boolean> map = C1250680ieQ.LIZLLL;
        Object obj = ((LinkedHashMap) map).get(str);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool)) {
            return;
        }
        C20684815ws.LJFF().execute(new ARunnableS119S0100000_19((Function0) new AwS11S1000100_19(str, j, 0), 222));
        map.put(str, bool);
    }

    public final C1248930ibb Oo(String str) {
        if (this.LLIZLLLIL.containsKey(str)) {
            return (C1248930ibb) ((LinkedHashMap) this.LLIZLLLIL).get(str);
        }
        return null;
    }

    public final boolean Vo(String str) {
        ProfileSingleModeAndFeaturesList next;
        ProfilePlatformViewModel profilePlatformViewModelSo = So();
        if (profilePlatformViewModelSo == null) {
            return false;
        }
        ProfileModesAndFeaturesInfo profileModesAndFeaturesInfo = C1248960ibe.LIZ;
        ProfileModesAndFeaturesInfo profileModesAndFeaturesInfo2 = (ProfileModesAndFeaturesInfo) SettingsManager.LIZLLL().LJIIIIZZ("profile_modes_and_features_config", ProfileModesAndFeaturesInfo.class, C1248960ibe.LIZ);
        if (profileModesAndFeaturesInfo2 == null) {
            profileModesAndFeaturesInfo2 = new ProfileModesAndFeaturesInfo(0, null, 3, null);
        }
        Iterator<ProfileSingleModeAndFeaturesList> it2 = profileModesAndFeaturesInfo2.modes.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.name, profilePlatformViewModelSo.LL)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ProfileSingleModeAndFeaturesList next2 = next;
        if (next2 == null) {
            Iterator<ProfileSingleModeAndFeaturesList> it3 = new ProfileModesAndFeaturesInfo(0, null, 3, null).modes.iterator();
            while (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(next2.name, profilePlatformViewModelSo.LL)) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        List<String> list = next2.support_components;
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }

    @Override // X.InterfaceC1248970ibf
    public final void Xn(int i) {
        this.LLJJ = i;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean zQ1;
        super.onViewCreated(view);
        if (((Boolean) C287560BOw.LIZ.getValue()).booleanValue()) {
            ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
            if (profileBaseAbility != null) {
                zQ1 = profileBaseAbility.q1();
            } else {
                zQ1 = false;
            }
            this.LLJILLL = zQ1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Zo(int i, ProfileComponents profileComponents, String str) {
        AssemSupervisor assemSupervisorLJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        if (profileComponents != null && (assemSupervisorLJ = C724240Sb0.LJ(this)) != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (Intrinsics.LJFF(abstractC738140SxQ.assemTagInternal, str)) {
                    String str2 = "";
                    if (abstractC738140SxQ instanceof InterfaceC1248970ibf) {
                        this.LLJILJILJ.put(str, Integer.valueOf(i));
                        InterfaceC1248970ibf interfaceC1248970ibf = (InterfaceC1248970ibf) abstractC738140SxQ;
                        interfaceC1248970ibf.Xn(i);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateComponentDataWhenUserUpdate componentTag=");
                        sbLIZ.append(str);
                        sbLIZ.append(", index=");
                        sbLIZ.append(i);
                        C1248210iaR.LJ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.BUSINESS, "UpdateComponent");
                        interfaceC1248970ibf.Hj(profileComponents);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (C299970BpL.LIZ() && !this.LLJILLL) {
                            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                            String str3 = abstractC738140SxQ.assemTagInternal;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                            c1250680ieQ.getClass();
                            Map<String, Boolean> map = C1250680ieQ.LJII;
                            Object obj = ((LinkedHashMap) map).get(str2);
                            Boolean bool = Boolean.TRUE;
                            if (!Intrinsics.LJFF(obj, bool)) {
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TO(j, str2, null), 3);
                                map.put(str2, bool);
                                return;
                            }
                            return;
                        }
                        C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                        String str4 = abstractC738140SxQ.assemTagInternal;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        long j2 = jCurrentTimeMillis2 - jCurrentTimeMillis;
                        c1250680ieQ2.getClass();
                        Map<String, Boolean> map2 = C1250680ieQ.LJI;
                        Object obj2 = ((LinkedHashMap) map2).get(str2);
                        Boolean bool2 = Boolean.TRUE;
                        if (Intrinsics.LJFF(obj2, bool2)) {
                            return;
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TN(j2, str2, null), 3);
                        map2.put(str2, bool2);
                        return;
                    }
                    C1250680ieQ c1250680ieQ3 = C1250680ieQ.LIZ;
                    String str5 = abstractC738140SxQ.assemTagInternal;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    boolean z = this.LLJILLL;
                    c1250680ieQ3.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJ(Boolean.valueOf(z), "is_my_profile");
                    c2344009Gk.LJIIIIZZ("report_scene", "profile_component_update_not_impl_interface");
                    c2344009Gk.LJIIIIZZ("component_tag", str2);
                    C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
                }
            }
        }
    }

    public final void Ho(String str, C19719912Dl c19719912Dl, View view, int i, boolean z) {
        this.LLIZLLLIL.put(str, new C1248930ibb(str, c19719912Dl, view, Integer.valueOf(i), z));
    }
}
