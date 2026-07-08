package com.ss.android.ugc.profile.platform.base.component;

import X.AbstractC738140SxQ;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C01TL;
import X.C01TM;
import X.C09R3;
import X.C0PEM;
import X.C1248730ibH;
import X.C1248750ibJ;
import X.C1248760ibK;
import X.C1248890ibX;
import X.C1248940ibc;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1250680ieQ;
import X.C1251670ig1;
import X.C1252220igu;
import X.C1252480ihK;
import X.C1253930ijf;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C299970BpL;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1248370iah;
import X.InterfaceC1248970ibf;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.MineProfileAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.BioTranslationViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseUIComponent extends UIContentAssem implements InterfaceC1248970ibf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public int LLJILLL;
    public View LLJJ;
    public C1248950ibd LLJJI;
    public boolean LLJJIII;
    public final Map<String, Long> LLJJIJI;
    public BizBaseData LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public ProfileComponents LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseUIComponent.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BaseUIComponent.class, "bioTranslationViewModel", "getBioTranslationViewModel()Lcom/ss/android/ugc/profile/platform/business/header/business/bio/business/signature/base/BioTranslationViewModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BaseUIComponent() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS257S0000000_19.get$arr$(484));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS546S0100000_2(c19719912DlLIZ, 889), AFwS257S0000000_19.get$arr$(487), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BioTranslationViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ2, 890), AFwS257S0000000_19.get$arr$(488), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2465));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2456));
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLJILLL = -1;
        this.LLJJIJI = new LinkedHashMap();
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2457));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2464));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2463));
    }

    public void Go() {
    }

    public void Ho() {
    }

    public void Jo() {
    }

    public void Lo() {
    }

    public void No() {
    }

    public abstract void Oo();

    public View So(ProfileComponentUIConfig profileComponentUIConfig) {
        return null;
    }

    public boolean sp() {
        return true;
    }

    public void tp() {
    }

    public final ProfilePlatformProtocol<BizBaseData> ap() {
        return (ProfilePlatformProtocol) this.LLJJJIL.getValue();
    }

    public void bp() {
        C1248950ibd c1248950ibd = (C1248950ibd) new C1559260qg8(new C723580SZw(this, C1248950ibd.class, this.assemTagInternal), checkSupervisorPrepared()).getValue();
        this.LLJJI = c1248950ibd;
        this.LLJJJ = c1248950ibd != null ? c1248950ibd.LLILLJJLI : null;
        this.LLJILLL = c1248950ibd != null ? c1248950ibd.LL : -1;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        String str;
        super.onCreate();
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        this.LLJJIII = profileBaseAbility != null ? profileBaseAbility.q1() : false;
        if (sp()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            bp();
            hp(AFwS207S0000000_19.get$arr$(746), new AwS598S0100000_19(this, 457));
            C013C c013c = new C013C();
            c013c.element = true;
            hp(new AwS420S0200000_19(c013c, this, 120), new AwS598S0100000_19(c013c, 458));
            if (c013c.element) {
                this.LLJJIJI.put("init_base_data_cost_time", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                hp(new AwS563S0100000_19(this, 2459), new AwS598S0100000_19(this, 459));
                this.LLJJIJI.put("parse_biz_data_cost_time", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                hp(new AwS563S0100000_19(this, 2460), new AwS598S0100000_19(this, 460));
                View view = this.LLJJ;
                ProfileComponents profileComponents = this.LLJJJ;
                C1251670ig1.LIZ(view, profileComponents != null ? profileComponents.componentName : null);
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                View view2 = this.LLJJ;
                if (view2 != null) {
                    C786410Ut5.I7(new ACListenerS154S0100000_19(this, 185), view2);
                }
                hp(new AwS563S0100000_19(this, 2462), new AwS598S0100000_19(this, 455));
                this.LLJJIJI.put("generate_view_cost_time", Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3));
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                Ho();
                hp(AFwS207S0000000_19.get$arr$(746), AFwS257S0000000_19.get$arr$(485));
                this.LLJJIJI.put("actions_before_update_ui_cost_time", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis5));
                long jCurrentTimeMillis6 = System.currentTimeMillis();
                hp(new AwS563S0100000_19(this, 2458), new AwS598S0100000_19(this, 456));
                this.LLJJIJI.put("update_ui_and_data_cost_time", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis6));
                long jCurrentTimeMillis7 = System.currentTimeMillis();
                hp(AFwS207S0000000_19.get$arr$(746), AFwS257S0000000_19.get$arr$(486));
                Go();
                this.LLJJIJI.put("actions_after_update_ui_cost_time", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis7));
                boolean z = this.LLJJIII;
                if (C299970BpL.LIZ()) {
                    C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                    String str2 = this.assemTagInternal;
                    str = str2 != null ? str2 : "";
                    Long l = (Long) ((LinkedHashMap) this.LLJJIJI).get("init_base_data_cost_time");
                    long jLongValue = l != null ? l.longValue() : 0L;
                    Long l2 = (Long) ((LinkedHashMap) this.LLJJIJI).get("parse_biz_data_cost_time");
                    long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                    Long l3 = (Long) ((LinkedHashMap) this.LLJJIJI).get("generate_view_cost_time");
                    long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                    Long l4 = (Long) ((LinkedHashMap) this.LLJJIJI).get("actions_before_update_ui_cost_time");
                    long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                    Long l5 = (Long) ((LinkedHashMap) this.LLJJIJI).get("update_ui_and_data_cost_time");
                    long jLongValue5 = l5 != null ? l5.longValue() : 0L;
                    Long l6 = (Long) ((LinkedHashMap) this.LLJJIJI).get("actions_after_update_ui_cost_time");
                    long jLongValue6 = l6 != null ? l6.longValue() : 0L;
                    c1250680ieQ.getClass();
                    if (!z ? !Intrinsics.LJFF(((LinkedHashMap) C1250680ieQ.LIZJ).get(str), Boolean.TRUE) : !Intrinsics.LJFF(((LinkedHashMap) C1250680ieQ.LIZIZ).get(str), Boolean.TRUE)) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TL(str, jLongValue, jLongValue2, jLongValue3, jLongValue4, jLongValue5, jLongValue6, z, null), 3);
                        if (z) {
                            C1250680ieQ.LIZIZ.put(str, Boolean.TRUE);
                        } else {
                            C1250680ieQ.LIZJ.put(str, Boolean.TRUE);
                        }
                    }
                } else {
                    C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                    String str3 = this.assemTagInternal;
                    str = str3 != null ? str3 : "";
                    Long l7 = (Long) ((LinkedHashMap) this.LLJJIJI).get("init_base_data_cost_time");
                    long jLongValue7 = l7 != null ? l7.longValue() : 0L;
                    Long l8 = (Long) ((LinkedHashMap) this.LLJJIJI).get("parse_biz_data_cost_time");
                    long jLongValue8 = l8 != null ? l8.longValue() : 0L;
                    Long l9 = (Long) ((LinkedHashMap) this.LLJJIJI).get("generate_view_cost_time");
                    long jLongValue9 = l9 != null ? l9.longValue() : 0L;
                    Long l10 = (Long) ((LinkedHashMap) this.LLJJIJI).get("actions_before_update_ui_cost_time");
                    long jLongValue10 = l10 != null ? l10.longValue() : 0L;
                    Long l11 = (Long) ((LinkedHashMap) this.LLJJIJI).get("update_ui_and_data_cost_time");
                    long jLongValue11 = l11 != null ? l11.longValue() : 0L;
                    Long l12 = (Long) ((LinkedHashMap) this.LLJJIJI).get("actions_after_update_ui_cost_time");
                    long jLongValue12 = l12 != null ? l12.longValue() : 0L;
                    c1250680ieQ2.getClass();
                    Map<String, Boolean> map = C1250680ieQ.LIZIZ;
                    Object obj = ((LinkedHashMap) map).get(str);
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.LJFF(obj, bool)) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TM(str, jLongValue7, jLongValue8, jLongValue9, jLongValue10, jLongValue11, jLongValue12, null), 3);
                        map.put(str, bool);
                    }
                }
                ((LinkedHashMap) this.LLJJIJI).clear();
            }
        }
    }

    public final ProfileCommonInfo Vo() {
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            return iProfileBaseAbility.wG2();
        }
        return null;
    }

    public final ProfilePlatformViewModel Zo() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.getFragmentManager() != null) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
            return (ProfilePlatformViewModel) assemVMLazy.getValue();
        }
        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
        String str = this.assemTagInternal;
        if (str == null) {
            str = "empty assemTag";
        }
        c1250680ieQ.getClass();
        C1250680ieQ.LJFF(str);
        return null;
    }

    public final boolean cp() {
        String str;
        ProfileComponents profileComponents;
        AbstractC738140SxQ abstractC738140SxQ;
        if (!C1248730ibH.LIZIZ()) {
            return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
        }
        LifecycleOwner parent = getParent();
        String str2 = (!(parent instanceof AbstractC738140SxQ) || (abstractC738140SxQ = (AbstractC738140SxQ) parent) == null) ? null : abstractC738140SxQ.assemTagInternal;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (str = profileComponents.componentId) == null) {
            str = this.LLJILJIL;
        }
        if (!Intrinsics.LJFF(str, "nav_bar_base_item")) {
            boolean zBooleanValue = ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
            String str3 = (String) ((Map) C1248890ibX.LIZLLL.getValue()).get(str2);
            C1248950ibd c1248950ibd2 = this.LLJJI;
            return C1248730ibH.LIZ(zBooleanValue, str3, null, c1248950ibd2 != null ? c1248950ibd2.LLILLJJLI : null, ap() != null, 4);
        }
        String str4 = this.assemTagInternal;
        if (str4 == null) {
            str4 = "";
        }
        C1248940ibc c1248940ibc = (C1248940ibc) new C1559260qg8(new C723580SZw(this, C1248940ibc.class, str4), checkSupervisorPrepared()).getValue();
        return C1248730ibH.LIZ(((Boolean) this.LLJJIJIL.getValue()).booleanValue(), (String) ((Map) C1248890ibX.LIZLLL.getValue()).get(str2), null, c1248940ibc != null ? c1248940ibc.LLILLL : null, ap() != null, 4);
    }

    public void dp() {
        ProfileComponents profileComponents;
        n nVar;
        if (cp()) {
            hp(AFwS207S0000000_19.get$arr$(746), new AwS598S0100000_19(this, 816));
            return;
        }
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (nVar = profileComponents.bizData) == null) {
            return;
        }
        ep(nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r5 = this;
            super.onDestroy()
            boolean r0 = r5.cp()
            if (r0 != 0) goto La
            return
        La:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r5)
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility> r0 = com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility.class
            r4 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility r0 = (com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility) r0
            r3 = 0
            if (r0 == 0) goto L52
            boolean r0 = r0.q1()
            r2 = 1
            if (r0 != r2) goto L52
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r0 = r5.Vo()
            if (r0 == 0) goto L33
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r0.getUserProfileInfo()
            if (r0 == 0) goto L33
            java.lang.String r4 = r0.getUid()
            if (r4 != 0) goto L3d
        L33:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r4 = r0.getCurUserId()
        L3d:
            X.0ibS r1 = X.C1248840ibS.LIZ
            com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol r0 = r5.ap()
            if (r0 == 0) goto L49
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = r0.LLJILJILJ
            if (r0 != 0) goto L4b
        L49:
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = r5.LLJJJ
        L4b:
            r1.getClass()
            X.C1248840ibS.LIZJ(r0, r4, r2, r3)
            return
        L52:
            r2 = 0
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r0 = r5.Vo()
            if (r0 == 0) goto L67
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r0.getUserProfileInfo()
            if (r0 == 0) goto L67
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L67
            r4 = r0
            goto L3d
        L67:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r5)
            java.lang.Class<com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility> r0 = com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility r0 = (com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility) r0
            if (r0 == 0) goto L3d
            X.0igu r0 = r0.getOtherParams()
            if (r0 == 0) goto L3d
            java.lang.String r4 = r0.LIZ
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.component.BaseUIComponent.onDestroy():void");
    }

    public void Hj(ProfileComponents profileComponents) {
        hp(new AwS420S0200000_19(this, profileComponents, 121), new AwS385S0200000_19(this, profileComponents, 69));
    }

    @Override // X.InterfaceC1248970ibf
    public void Xn(int i) {
        this.LLJILLL = i;
        hp(AFwS207S0000000_19.get$arr$(746), new AwS33S0001000_19(i, 5));
    }

    public void ep(n nVar) {
        BizBaseData bizBaseData;
        if (!cp()) {
            return;
        }
        try {
            bizBaseData = (BizBaseData) C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bizBaseData = null;
        }
        this.LLJJIJIIJIL = bizBaseData;
    }

    public final void mp(ProfileComponents profileComponents) {
        if (!cp()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1248760ibK(this, profileComponents, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(java.lang.Boolean r7) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.component.BaseUIComponent.op(java.lang.Boolean):void");
    }

    public void hp(Function0<Unit> function0, Function1<? super ProfilePlatformProtocol<BizBaseData>, Unit> function1) {
        if (cp()) {
            function1.invoke(ap());
        } else {
            function0.invoke();
        }
    }

    public final void kp(String str, EnumC1248370iah enumC1248370iah) {
        String str2;
        String uid;
        C1248750ibJ c1248750ibJN21;
        C1252220igu otherParams;
        C1252480ihK c1252480ihK;
        Aweme aweme;
        String aid;
        UserProfileInfo userProfileInfo;
        C1252480ihK c1252480ihK2 = null;
        MyProfileAbility myProfileAbility = (MyProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MyProfileAbility.class, null);
        if (myProfileAbility != null && myProfileAbility.Om()) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        ProfileCommonInfo profileCommonInfoVo = Vo();
        String str3 = "";
        if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
            uid = "";
        }
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null && (aweme = profilePlatformViewModelZo.getAweme()) != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null && (otherParams = userProfileAbility.getOtherParams()) != null && (c1252480ihK = otherParams.LJIJI) != null) {
            c1252480ihK2 = c1252480ihK;
        } else {
            MineProfileAbility mineProfileAbility = (MineProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MineProfileAbility.class, null);
            if (mineProfileAbility != null && (c1248750ibJN21 = mineProfileAbility.N21()) != null) {
                c1252480ihK2 = c1248750ibJN21.LIZ;
            }
        }
        C1253930ijf.LJJIII(C1253930ijf.LIZ, str2, uid, str3, str, enumC1248370iah, null, c1252480ihK2, 32);
    }

    public final Map<String, String> uP(int i, String str) {
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        if (cp() && (profilePlatformProtocolAp = ap()) != null) {
            return profilePlatformProtocolAp.uP(i, str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(X.EnumC1248370iah r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            X.0Q7z r1 = X.C1558520qew.LJIIL(r5)
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility> r0 = com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility.class
            r4 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility r0 = (com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility) r0
            if (r0 == 0) goto L35
            boolean r0 = r0.q1()
            r3 = 1
            if (r0 != r3) goto L35
        L16:
            X.0iVo r2 = X.C1245340iVo.LIZ
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r7.toLowerCase(r0)
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r0 = r5.Vo()
            if (r0 == 0) goto L2e
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r0.getUserProfileInfo()
            if (r0 == 0) goto L2e
            java.lang.String r4 = r0.getUid()
        L2e:
            r2.getClass()
            X.C1245340iVo.LJIIJJI(r3, r6, r1, r8, r4)
            return
        L35:
            r3 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.component.BaseUIComponent.lp(X.0iah, java.lang.String, boolean):void");
    }
}
