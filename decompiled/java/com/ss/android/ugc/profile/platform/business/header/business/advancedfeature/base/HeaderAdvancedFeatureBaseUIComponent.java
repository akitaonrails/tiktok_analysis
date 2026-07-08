package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base;

import X.C019F;
import X.C01GW;
import X.C09YG;
import X.C0BMT;
import X.C0H5S;
import X.C0P0T;
import X.C0XPD;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1250210idf;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1720106oR;
import X.C1721460utk;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2537109wv;
import X.C268330AfP;
import X.C299980BpM;
import X.C300150Bpd;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C698190Ra5;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.AObjectS71S0000000_19;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;
import com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class HeaderAdvancedFeatureBaseUIComponent extends BaseUIComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(549));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(548));
    public boolean LLJL;
    public final AssemVMLazy LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public AdvancedFeatureBaseData LLJLLIL;
    public String LLJLLL;
    public Integer LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public C0P0T LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public String LLLIIIIL;
    public boolean LLLIIIL;
    public C127G LLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderAdvancedFeatureBaseUIComponent.class, "profileHeaderAdvancedFeatureViewModel", "getProfileHeaderAdvancedFeatureViewModel()Lcom/ss/android/ugc/profile/platform/business/header/business/advancedfeature/base/ProfileHeaderAdvancedFeatureViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HeaderAdvancedFeatureBaseUIComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileHeaderAdvancedFeatureViewModel.class);
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2487), AFwS257S0000000_19.get$arr$(492), null, true);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2484));
        this.LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2478));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(547));
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2476));
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2481));
        this.LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2482));
        this.LLLFZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2486));
        this.LLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2477));
        this.LLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2485));
        this.LLLIIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2483));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        ProfilePlatformViewModel profilePlatformViewModelZo;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        Vp();
        C1248950ibd c1248950ibd = this.LLJJI;
        String str = null;
        if (Intrinsics.LJFF((c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null) ? null : profileComponents2.componentId, "advanced_feature_base_item")) {
            AssemVMLazy assemVMLazy = this.LLJLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ib1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C233500vF) obj).LL;
                }
            }, null, new AwS633S0100000_19(this, 155), 6);
            C1248950ibd c1248950ibd2 = this.LLJJI;
            if (c1248950ibd2 != null && (profileComponents = c1248950ibd2.LLILLJJLI) != null) {
                str = profileComponents.componentId;
            }
            if (Intrinsics.LJFF(str, "advanced_feature_base_item")) {
                op(Boolean.valueOf(this.LLLIIIL));
            }
        }
        ProfilePlatformViewModel profilePlatformViewModelZo2 = Zo();
        if (profilePlatformViewModelZo2 != null) {
            profilePlatformViewModelZo2.FQ2(new AwS598S0100000_19(this, 474));
        }
        if (!C0BMT.LIZ() || (profilePlatformViewModelZo = Zo()) == null) {
            return;
        }
        AssemViewModel.selectSubscribe$default(profilePlatformViewModelZo, new C2217381BqS() { // from class: X.0ib5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLL;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS598S0100000_19(new AwS598S0100000_19(this, 475), 4), 12, null);
    }

    public final void Vp() {
        this.LLLIIIL = true;
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            C2097608Jq.LJ();
            iHeaderAdvancedFeatureAbility.OY1(str);
        }
        op(Boolean.valueOf(this.LLLIIIL));
    }

    public final AdvancedFeatureProtocol Fp() {
        return (AdvancedFeatureProtocol) this.LLJLL.getValue();
    }

    public final Keva Gp() {
        return (Keva) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility;
        View view = this.LLJJ;
        if (view == null || (iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null)) == null) {
            return;
        }
        iHeaderAdvancedFeatureAbility.LJIIIZ(this.LLJILLL, view, this.assemTagInternal);
    }

    public final boolean Jp() {
        return ((Boolean) this.LLLIIII.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lo() {
        /*
            r4 = this;
            com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData r0 = r4.LLJLLIL
            if (r0 == 0) goto L17
            java.lang.Integer r2 = r0.getRecordType()
            X.082s r0 = X.EnumC20536082s.ONLY_RECORD
            int r1 = r0.getType()
            if (r2 == 0) goto L17
            int r0 = r2.intValue()
            if (r0 != r1) goto L17
            goto L2d
        L17:
            com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData r0 = r4.LLJLLIL
            if (r0 == 0) goto L4b
            java.lang.Integer r2 = r0.getRecordType()
            X.082s r0 = X.EnumC20536082s.RECORD_REQUEST_SELF
            int r1 = r0.getType()
            if (r2 == 0) goto L4b
            int r0 = r2.intValue()
            if (r0 != r1) goto L4b
        L2d:
            X.08dz r3 = X.C2164908dz.LIZ     // Catch: java.lang.Exception -> L47
            X.082t r0 = X.EnumC20537082t.ACTION_TYPE_ADVANCED     // Catch: java.lang.Exception -> L47
            int r2 = r0.getType()     // Catch: java.lang.Exception -> L47
            java.lang.String r1 = r4.assemTagInternal     // Catch: java.lang.Exception -> L47
            if (r1 != 0) goto L3b
            java.lang.String r1 = ""
        L3b:
            r0 = 3
            kotlin.jvm.internal.AFwS341S0000000_19 r0 = kotlin.jvm.internal.AFwS341S0000000_19.get$arr$(r0)     // Catch: java.lang.Exception -> L47
            r3.getClass()     // Catch: java.lang.Exception -> L47
            X.C2164908dz.LIZ(r2, r1, r0)     // Catch: java.lang.Exception -> L47
            return
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent.Lo():void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void No() {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility;
        View view;
        View view2 = this.LLJJ;
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, new ARunnableS119S0100000_19(this, 113), 1000L);
        }
        if (C268330AfP.LJ() || ((iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) this.LLLI.getValue()) != null && iHeaderAdvancedFeatureAbility.LG(this.LLJILLL))) {
            View view3 = this.LLJJ;
            if (view3 != null) {
                C426750GoL.LJIIIZ(view3, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
                return;
            }
            return;
        }
        if (!Jp() || (view = this.LLJJ) == null) {
            return;
        }
        C426750GoL.LJIIIZ(view, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, false, 16);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        ProfileComponents profileComponents;
        List<EventParams> list;
        ProfileComponents profileComponents2;
        List<Action> list2;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd != null && (profileComponents2 = c1248950ibd.LLILLJJLI) != null && (list2 = profileComponents2.actions) != null) {
            Ip(list2);
        }
        C1248950ibd c1248950ibd2 = this.LLJJI;
        if (c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null || (list = profileComponents.eventParams) == null) {
            return;
        }
        C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_CLICK.getType(), list, new AwS668S0100000_19(this, 43), 4);
    }

    public final boolean Qp() {
        return ((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue();
    }

    public final String zp() {
        Describe describe;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        BizBaseData bizBaseData = this.LLJLLIL;
        if ((bizBaseData == null && ((profilePlatformProtocolAp = ap()) == null || (bizBaseData = profilePlatformProtocolAp.LLJILJIL) == null)) || (describe = bizBaseData.getDescribe()) == null) {
            return null;
        }
        return describe.getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.0iay] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tp() {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent.Tp():void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void bp() {
        AdvancedFeatureProtocol advancedFeatureProtocolFp;
        super.bp();
        AdvancedFeatureProtocol advancedFeatureProtocolFp2 = Fp();
        if (advancedFeatureProtocolFp2 != null) {
            AssemVMLazy assemVMLazy = this.LLJLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
            advancedFeatureProtocolFp2.LLJJJIL = (ProfileHeaderAdvancedFeatureViewModel) assemVMLazy.getValue();
        }
        AdvancedFeatureProtocol advancedFeatureProtocolFp3 = Fp();
        if (advancedFeatureProtocolFp3 != null) {
            advancedFeatureProtocolFp3.LLJJJJLIIL = new AwS563S0100000_19(this, 2479);
        }
        if (C299980BpM.LIZ() && (advancedFeatureProtocolFp = Fp()) != null) {
            advancedFeatureProtocolFp.LLJJL = new AwS563S0100000_19(this, 2480);
        }
        AdvancedFeatureProtocol advancedFeatureProtocolFp4 = Fp();
        if (advancedFeatureProtocolFp4 != null) {
            advancedFeatureProtocolFp4.LLJJLIIIJLLLLLLLZ = new AwS598S0100000_19(this, 476);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ProfileHeaderAdvancedFeatureViewModel.class, new AObjectS71S0000000_19(this, 8)}, defaultViewModelProviderFactory);
                    this.LLLIIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            iHeaderAdvancedFeatureAbility.Vf0(this.assemTagInternal, new AwS598S0100000_19(this, 477));
        }
        super.onCreate();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Up(true);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        ProfilePlatformViewModel profilePlatformViewModelZo;
        User userVQ2;
        String strZp;
        Integer numYp;
        AdvancedFeatureProtocol advancedFeatureProtocolFp;
        if (Fp() == null || (advancedFeatureProtocolFp = Fp()) == null || !advancedFeatureProtocolFp.LJJLIIIJILLIZJL()) {
            Integer numYp2 = yp();
            if (!Intrinsics.LJFF(numYp2, this.LLJZ) && (numYp = yp()) != null) {
                int iIntValue = numYp.intValue();
                IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
                if (iHeaderAdvancedFeatureAbility != null) {
                    String str = this.assemTagInternal;
                    if (str == null) {
                        str = "";
                    }
                    iHeaderAdvancedFeatureAbility.Ur0(iIntValue, str);
                }
                this.LLJZ = numYp2;
            }
            String strZp2 = zp();
            if (!Intrinsics.LJFF(this.LLJLLL, strZp2) && (strZp = zp()) != null) {
                IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility2 = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
                if (iHeaderAdvancedFeatureAbility2 != null) {
                    String str2 = this.assemTagInternal;
                    iHeaderAdvancedFeatureAbility2.eW1(strZp, str2 != null ? str2 : "");
                }
                this.LLJLLL = strZp2;
            }
            if (!Qp() && (profilePlatformViewModelZo = Zo()) != null && (userVQ2 = profilePlatformViewModelZo.vQ2()) != null && !userVQ2.isBlock) {
                Vp();
            }
            AdvancedFeatureProtocol advancedFeatureProtocolFp2 = Fp();
            if (advancedFeatureProtocolFp2 != null) {
                advancedFeatureProtocolFp2.LJJLIIIJLJLI();
            }
            up();
        }
    }

    public final void up() {
        View view;
        View view2;
        if (C299980BpM.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkReportShowData assemTag: ");
            sbLIZ.append(this.assemTagInternal);
            sbLIZ.append(" isValid: ");
            View view3 = this.LLJJ;
            sbLIZ.append(view3 != null ? Integer.valueOf(view3.getWidth()) : null);
            sbLIZ.append(", height: ");
            View view4 = this.LLJJ;
            sbLIZ.append(view4 != null ? Integer.valueOf(view4.getHeight()) : null);
            sbLIZ.append(", isAttach: ");
            View view5 = this.LLJJ;
            sbLIZ.append(view5 != null ? Boolean.valueOf(view5.isAttachedToWindow()) : null);
            C1720106oR.LJI("AdvancedBaseUIComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (C300150Bpd.LIZ()) {
                View view6 = this.LLJJ;
                if (view6 != null) {
                    HandlerHook.viewPostDelay(view6, new ARunnableS119S0100000_19(this, 114), 300L);
                    return;
                }
                return;
            }
            View view7 = this.LLJJ;
            if (view7 != null && view7.getWidth() > 0 && (view = this.LLJJ) != null && view.getHeight() > 0 && (view2 = this.LLJJ) != null && view2.isAttachedToWindow()) {
                Tp();
                return;
            }
            View view8 = this.LLJJ;
            if (view8 != null) {
                HandlerHook.viewPost(view8, new ARunnableS119S0100000_19(this, 115));
            }
        }
    }

    public final Integer yp() {
        Icon icon;
        Icon icon2;
        String str;
        ProfileComponents profileComponents;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp2;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Map<Integer, Integer> map = C1721460utk.LIZ;
        BizBaseData bizBaseData = this.LLJLLIL;
        String localIcon = ((bizBaseData == null && ((profilePlatformProtocolAp2 = ap()) == null || (bizBaseData = profilePlatformProtocolAp2.LLJILJIL) == null)) || (icon = bizBaseData.getIcon()) == null) ? null : icon.getLocalIcon();
        BizBaseData bizBaseData2 = this.LLJLLIL;
        String iconColor = ((bizBaseData2 == null && ((profilePlatformProtocolAp = ap()) == null || (bizBaseData2 = profilePlatformProtocolAp.LLJILJIL) == null)) || (icon2 = bizBaseData2.getIcon()) == null) ? null : icon2.getIconColor();
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (str = profileComponents.componentId) == null) {
            str = "";
        }
        C698190Ra5 c698190Ra5LIZJ = C1721460utk.LIZJ(context, localIcon, iconColor, str, "");
        if (c698190Ra5LIZJ != null) {
            return Integer.valueOf(c698190Ra5LIZJ.LIZ);
        }
        return null;
    }

    public final void Bp(TuxIconView tuxIconView) {
        float fLIZIZ;
        float fLIZIZ2;
        tuxIconView.setId(R.id.aiz);
        int i = 16;
        if (C268330AfP.LJ()) {
            fLIZIZ = C418440Gaw.LIZIZ(12);
        } else if (C2537109wv.LIZJ()) {
            fLIZIZ = C418440Gaw.LIZIZ(16);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(20);
        }
        int iLIZIZ = C814420VxA.LIZIZ(fLIZIZ);
        if (C268330AfP.LJ()) {
            fLIZIZ2 = C418440Gaw.LIZIZ(12);
        } else {
            if (!C2537109wv.LIZJ()) {
                i = 18;
            }
            fLIZIZ2 = C418440Gaw.LIZIZ(i);
        }
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(iLIZIZ, C814420VxA.LIZIZ(fLIZIZ2)));
        if (!C268330AfP.LJ()) {
            Wp(tuxIconView.getContext(), tuxIconView);
        }
        if (!C2537109wv.LIZJ() && !C268330AfP.LJ()) {
            C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
        }
    }

    public final void Ep(TuxTextView tuxTextView) {
        int iLIZIZ;
        int iIntValue;
        tuxTextView.setId(R.id.aj1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (!C2537109wv.LIZJ() && !C268330AfP.LJ()) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
        layoutParams.setMarginStart(iLIZIZ);
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setGravity(16);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        Wp(tuxTextView.getContext(), tuxTextView);
        tuxTextView.setMaxLines(1);
        if (this.LLJL) {
            iIntValue = ((Number) this.LLJJL.getValue()).intValue();
        } else {
            iIntValue = ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue();
        }
        tuxTextView.setMaxWidth(iIntValue);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        AdvancedFeatureProtocol advancedFeatureProtocolFp;
        if (this.LLJJJJJIL) {
            return;
        }
        AdvancedFeatureProtocol advancedFeatureProtocolFp2 = Fp();
        if (advancedFeatureProtocolFp2 != null) {
            advancedFeatureProtocolFp2.LLJILJILJ = profileComponents;
        }
        if (Fp() != null && (advancedFeatureProtocolFp = Fp()) != null && advancedFeatureProtocolFp.LJJLIIIJJIZ(profileComponents)) {
            return;
        }
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd != null) {
            c1248950ibd.LLILLJJLI = profileComponents;
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.Vk1(this.LLJILLL, str);
        }
        n nVar = profileComponents.bizData;
        if (nVar == null) {
            return;
        }
        ep(nVar);
        tp();
        No();
    }

    public final void Ip(List<Action> list) {
        String url;
        C19EG c19egLIZ;
        Action.SheetInfo sheet;
        Integer sheetType;
        String str;
        for (Action action : list) {
            String type = action.getType();
            SmartRoute smartRouteBuildRoute = null;
            if (Intrinsics.LJFF(type, "router")) {
                Action.RouterInfo router = action.getRouter();
                if (router != null && (url = router.getUrl()) != null && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
                    smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZ, url);
                }
                Fp();
                if (smartRouteBuildRoute != null) {
                    smartRouteBuildRoute.open();
                }
            } else if (Intrinsics.LJFF(type, "sheet") && (sheet = action.getSheet()) != null && (sheetType = sheet.getSheetType()) != null && sheetType.intValue() == 1) {
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (Qp()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C0XPD.LIZJ(fragmentLJI, str, "click_add_yours_button", null, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r16) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent.So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):android.view.View");
    }

    public final void Up(boolean z) {
        this.LLLIIIL = false;
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            C2097608Jq.LJ();
            iHeaderAdvancedFeatureAbility.F00(str, z);
        }
        op(Boolean.valueOf(this.LLLIIIL));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        AdvancedFeatureBaseData advancedFeatureBaseData;
        AdvancedFeatureProtocol advancedFeatureProtocolFp = Fp();
        if (advancedFeatureProtocolFp != null) {
            advancedFeatureProtocolFp.LJJJLZIJ(nVar);
        }
        AdvancedFeatureProtocol advancedFeatureProtocolFp2 = Fp();
        if (advancedFeatureProtocolFp2 == null || (advancedFeatureBaseData = advancedFeatureProtocolFp2.LLJJJJ) == null) {
            advancedFeatureBaseData = (AdvancedFeatureBaseData) C1250210idf.LIZ(nVar.toString(), AdvancedFeatureBaseData.class);
        }
        this.LLJLLIL = advancedFeatureBaseData;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ap(android.content.Context r15, android.widget.LinearLayout r16) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent.Ap(android.content.Context, android.widget.LinearLayout):void");
    }

    public final void Wp(Context context, View view) {
        ProfileComponents profileComponents;
        ProfileUIData profileUIData;
        String str;
        int iIntValue;
        ProfileComponents profileComponents2;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (profileUIData = profileComponents.uiData) != null && profileUIData.bgColor != null) {
            Map<Integer, Integer> map = C1721460utk.LIZ;
            String str2 = profileUIData.bgColor;
            if (c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null || (str = profileComponents2.componentId) == null) {
                str = "";
            }
            Integer numLIZIZ = C1721460utk.LIZIZ(context, str2, str);
            if (C2537109wv.LIZJ()) {
                iIntValue = R.attr.a03;
            } else {
                iIntValue = R.attr.a0n;
            }
            if (numLIZIZ != null && C0H5S.LIZ(Integer.valueOf(numLIZIZ.intValue()))) {
                iIntValue = numLIZIZ.intValue();
            }
            Integer numLIZJ = C1308910kAL.LIZJ(iIntValue, context);
            if (numLIZJ != null) {
                view.setBackgroundColor(numLIZJ.intValue());
            }
        }
    }
}
