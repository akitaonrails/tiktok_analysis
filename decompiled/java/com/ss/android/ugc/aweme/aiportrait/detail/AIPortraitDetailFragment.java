package com.ss.android.ugc.aweme.aiportrait.detail;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0LQY;
import X.C0TVI;
import X.C13LE;
import X.C14K9;
import X.C1546210qL5;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C2217381BqS;
import X.C327850CtD;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C531080KsE;
import X.C547790Le5;
import X.C549290LgV;
import X.C550730Lip;
import X.C558690Lvf;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.EnumC1419230n2H;
import X.EnumC550430LiL;
import X.EnumC550780Liu;
import X.EnumC570120MXq;
import X.InterfaceC1401270mZJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC549230LgP;
import X.InterfaceC550750Lir;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.feed.model.AIPortraitInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitGeneration;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;
import com.ss.android.ugc.aweme.theater.common.ContinueConfig;
import com.ss.android.ugc.aweme.theater.common.ProfileCustomConfig;
import com.ss.android.ugc.aweme.theater.common.SkipConfig;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.zhiliaoapp.musically.R;
import irm.AkS92S0100000_25;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
@InterfaceC836760Ws6
public final class AIPortraitDetailFragment extends DetailBaseFragment implements RefreshAbility, InterfaceC1401270mZJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQlOSAhPDctIDHELIOSt9LCA4KCY/ZgQFGSAhPDctIDsXLTEtICMVOiQrJCo9PA==";
    public final AssemVMLazy LLIZ;
    public AIPortraitDetailHeaderModel LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIPortraitDetailFragment.class, "detailVM", "getDetailVM()Lcom/ss/android/ugc/aweme/aiportrait/detail/model/AIPortraitDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1401270mZJ
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return "ai_portrait_detail";
    }

    @Override // X.InterfaceC1401270mZJ
    public final void V() {
    }

    public AIPortraitDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIPortraitDetailViewModel.class);
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(c19719912DlLIZ, 139);
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(85);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS569S0100000_25, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS569S0100000_25((HasDefaultViewModelProviderFactory) this, 140), aFwS266S0000000_25, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS569S0100000_25, new AwS569S0100000_25((Fragment) this, 141), aFwS266S0000000_25, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS569S0100000_25, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS569S0100000_25((HasDefaultViewModelProviderFactory) this, 142), aFwS266S0000000_25, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(90));
    }

    public static AIPortraitEventService cS() {
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null) {
            return iAIPortraitFeatureServiceLIZ.LJIIIIZZ();
        }
        return null;
    }

    public final C197039127h VR() {
        C197039127h c197039127h = new C197039127h(requireContext(), null, 6, 0);
        c197039127h.setText(c197039127h.getResources().getString(2131825814));
        c197039127h.setButtonVariant(0);
        c197039127h.setButtonSize(3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        C1546210qL5.LIZ.getClass();
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C1546210qL5.LIZ(85)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C1546210qL5.LIZ(85)));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C1546210qL5.LIZ(40));
        C786410Ut5.J6(c197039127h, layoutParams);
        C14K9.LJIJJ(c197039127h, new C0TVI() { // from class: X.0u0S
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                FrameLayout.LayoutParams layoutParams2;
                C20244914Jj c20244914JjLIZIZ = c20246014Ju.LIZIZ(2);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    C1546210qL5.LIZ.getClass();
                    layoutParams2.bottomMargin = C814420VxA.LIZIZ(C1546210qL5.LIZ(40)) + c20244914JjLIZIZ.LIZLLL;
                    C786410Ut5.W5(view, layoutParams2);
                }
                return c20246014Ju;
            }
        });
        C20097313kJ.LIZJ(c197039127h);
        C786410Ut5.I7(new AkS92S0100000_25(this, 0), c197039127h);
        return c197039127h;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel ZR() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment.ZR():com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel");
    }

    public final AIPortraitDetailViewModel aS() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (AIPortraitDetailViewModel) assemVMLazy.getValue();
    }

    public final String getCreationId() {
        return (String) this.LLJ.getValue();
    }

    public final boolean hS() {
        AIPortraitDetailHeaderModel aIPortraitDetailHeaderModel;
        Integer hasCameo;
        InterfaceC550750Lir interfaceC550750LirG9;
        Integer hasCameo2;
        AIPortraitDetailHeaderModel aIPortraitDetailHeaderModel2 = this.LLIZLLLIL;
        boolean z = ((aIPortraitDetailHeaderModel2 == null || (hasCameo2 = aIPortraitDetailHeaderModel2.getHasCameo()) == null || hasCameo2.intValue() != 1) && ((aIPortraitDetailHeaderModel = this.LLIZLLLIL) == null || (hasCameo = aIPortraitDetailHeaderModel.getHasCameo()) == null || hasCameo.intValue() != 2)) ? false : true;
        AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
        return z || Intrinsics.LJFF((aITheaterProfileService == null || (interfaceC550750LirG9 = aITheaterProfileService.g9()) == null) ? null : Boolean.valueOf(interfaceC550750LirG9.LJIIL()), Boolean.TRUE) || (iS() instanceof C549290LgV);
    }

    public final Aweme getAweme() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("ai_portrait_aweme") : null;
        if (serializable instanceof Aweme) {
            return (Aweme) serializable;
        }
        return null;
    }

    public final String getTemplateId() {
        AIPortraitInfo aIPortraitInfo;
        String promptId;
        Aweme aweme = getAweme();
        return (aweme == null || (aIPortraitInfo = aweme.aiPortraitInfo) == null || (promptId = aIPortraitInfo.getPromptId()) == null) ? "" : promptId;
    }

    public final InterfaceC549230LgP iS() {
        InterfaceC550750Lir interfaceC550750LirG9;
        InterfaceC549230LgP interfaceC549230LgP = (InterfaceC549230LgP) aS().LLILZIL.getValue();
        if (!(interfaceC549230LgP instanceof C558690Lvf)) {
            return interfaceC549230LgP;
        }
        AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
        if (aITheaterProfileService == null || (interfaceC550750LirG9 = aITheaterProfileService.g9()) == null) {
            return null;
        }
        return interfaceC550750LirG9.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        aS().vQ2(true);
    }

    public static EnumC550430LiL nS(String str) {
        String lowerCase = a0.LJLIIIL(str).toString().toLowerCase(Locale.ROOT);
        EnumC550430LiL enumC550430LiL = EnumC550430LiL.PRESET;
        if (!Intrinsics.LJFF(lowerCase, enumC550430LiL.getValue())) {
            EnumC550430LiL enumC550430LiL2 = EnumC550430LiL.MANUAL;
            if (!Intrinsics.LJFF(lowerCase, enumC550430LiL2.getValue())) {
                EnumC550430LiL enumC550430LiL3 = EnumC550430LiL.PRESET_MODIFIED;
                if (!Intrinsics.LJFF(lowerCase, enumC550430LiL3.getValue())) {
                    EnumC550430LiL enumC550430LiL4 = EnumC550430LiL.UNKNOWN;
                    Intrinsics.LJFF(lowerCase, enumC550430LiL4.getValue());
                    return enumC550430LiL4;
                }
                return enumC550430LiL3;
            }
            return enumC550430LiL2;
        }
        return enumC550430LiL;
    }

    public static RefImageType oS(int i) {
        RefImageType refImageType = RefImageType.NONE;
        if (i != refImageType.getValue()) {
            RefImageType refImageType2 = RefImageType.USER_UPLOAD;
            if (i != refImageType2.getValue()) {
                refImageType2 = RefImageType.PRESET;
                if (i == refImageType2.getValue()) {
                }
            }
            return refImageType2;
        }
        return refImageType;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.portrait.service.AIPortraitProfileParam WR(java.lang.String r11) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.portrait.service.AIPortraitProfileParam r3 = new com.ss.android.ugc.aweme.portrait.service.AIPortraitProfileParam
            r2 = 0
            com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo r4 = r10.bS(r2, r2)
            r5 = 0
            java.lang.String r6 = "passive_create_cameo"
            X.0LgP r1 = r10.iS()
            com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel r0 = r10.LLIZLLLIL
            if (r0 == 0) goto L16
            java.lang.Integer r2 = r0.getHasCameo()
        L16:
            boolean r0 = r1 instanceof X.C316340Cae
            if (r0 == 0) goto L23
            java.lang.String r7 = "4"
        L1c:
            java.lang.String r8 = "template_detail_page"
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L23:
            if (r2 == 0) goto L42
            int r0 = r2.intValue()
            if (r0 != 0) goto L2e
            java.lang.String r7 = "2"
            goto L1c
        L2e:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L38
            java.lang.String r7 = "3"
            goto L1c
        L38:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L42
            java.lang.String r7 = "1"
            goto L1c
        L42:
            java.lang.String r7 = ""
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment.WR(java.lang.String):com.ss.android.ugc.aweme.portrait.service.AIPortraitProfileParam");
    }

    public final AIPortraitGeneration dS(String str) {
        EnumC1419230n2H enumC1419230n2H;
        RefImageType refImageTypeOS;
        EnumC550430LiL enumC550430LiLNS;
        Integer numValueOf;
        AIPortraitInfo aIPortraitInfo;
        String prompt;
        String promptSource;
        Integer numIsRefImg;
        String taskId = null;
        AIGCEntranceInfo aIGCEntranceInfoBS = bS(null, null);
        String templateId = getTemplateId();
        AIPortraitDetailHeaderModel aIPortraitDetailHeaderModel = this.LLIZLLLIL;
        if (aIPortraitDetailHeaderModel != null && aIPortraitDetailHeaderModel.getAuthor() != null) {
            enumC1419230n2H = EnumC1419230n2H.UGC;
        } else {
            enumC1419230n2H = EnumC1419230n2H.OFFICIAL;
        }
        EnumC570120MXq enumC570120MXq = EnumC570120MXq.FOLLOW_ANCHOR;
        AIPortraitDetailHeaderModel aIPortraitDetailHeaderModel2 = this.LLIZLLLIL;
        if (aIPortraitDetailHeaderModel2 != null && (numIsRefImg = aIPortraitDetailHeaderModel2.isRefImg()) != null) {
            refImageTypeOS = oS(numIsRefImg.intValue());
        } else {
            refImageTypeOS = null;
        }
        AIPortraitDetailHeaderModel aIPortraitDetailHeaderModel3 = this.LLIZLLLIL;
        if (aIPortraitDetailHeaderModel3 != null && (promptSource = aIPortraitDetailHeaderModel3.getPromptSource()) != null) {
            enumC550430LiLNS = nS(promptSource);
        } else {
            enumC550430LiLNS = null;
        }
        AIPortraitDetailHeaderModel aIPortraitDetailHeaderModel4 = this.LLIZLLLIL;
        if (aIPortraitDetailHeaderModel4 != null && (prompt = aIPortraitDetailHeaderModel4.getPrompt()) != null) {
            numValueOf = Integer.valueOf(prompt.length());
        } else {
            numValueOf = null;
        }
        EnumC550780Liu enumC550780Liu = EnumC550780Liu.ENTER;
        Aweme aweme = getAweme();
        if (aweme != null && (aIPortraitInfo = aweme.aiPortraitInfo) != null) {
            taskId = aIPortraitInfo.getTaskId();
        }
        return new AIPortraitGeneration(aIGCEntranceInfoBS, str, templateId, enumC1419230n2H, enumC570120MXq, null, refImageTypeOS, enumC550430LiLNS, numValueOf, enumC550780Liu, CardStruct.IStatusCode.DEFAULT, "implicit", "template_detail_page", 0, taskId, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4 A[PHI: r3
      0x00d4: PHI (r3v1 X.0n2H) = (r3v0 X.0n2H), (r3v0 X.0n2H), (r3v0 X.0n2H), (r3v4 X.0n2H), (r3v4 X.0n2H) binds: [B:35:0x0079, B:37:0x007f, B:39:0x0085, B:41:0x0093, B:43:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams gS(java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment.gS(java.lang.String):com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams");
    }

    public final void mS(String str) {
        AIPortraitEventService aIPortraitEventServiceCS = cS();
        if (aIPortraitEventServiceCS != null) {
            aIPortraitEventServiceCS.reportEntranceClick(UR(null, null, str));
        }
        AIPortraitEventService aIPortraitEventServiceCS2 = cS();
        if (aIPortraitEventServiceCS2 != null) {
            aIPortraitEventServiceCS2.reportShoot(str, bS(null, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C327850CtD.LIZIZ("ai_portrait_detail");
        super.onCreate(bundle);
    }

    public final AIGCEntranceInfo bS(AIGC.AICreationSceneName aICreationSceneName, AIGC.RefPageName refPageName) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("ai_portrait_enter_from")) == null) {
            string = "";
        }
        if (refPageName == null) {
            refPageName = new AIGC.RefPageName.Custom(string);
        }
        if (aICreationSceneName == null) {
            aICreationSceneName = AIGC.AICreationSceneName.AI_PORTRAIT_ANCHOR.INSTANCE;
        }
        return C550730Lip.LIZ("ai_portrait_follow", aICreationSceneName, refPageName, string);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment for r15v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams UR(com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.AICreationSceneName r26, com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment.UR(com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$AICreationSceneName, com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$RefPageName, java.lang.String):com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams");
    }

    public final void kS(Activity activity, String str, ContinueConfig continueConfig) {
        AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
        if (aITheaterProfileService != null) {
            C0LQY c0lqy = C0LQY.AI_PORTRAIT;
            String str2 = bS(null, null).enterFrom;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String strValueOf = String.valueOf(bS(null, null).recallWay);
            String str4 = bS(null, null).shootWay;
            if (str4 != null) {
                str3 = str4;
            }
            aITheaterProfileService.Y8(activity, new C531080KsE(true, "ai_theater_profile_intro", null, null, null, new AITheaterProfileEventModel(c0lqy, str, str2, "ai_portrait_follow_crt", strValueOf, str3, null, "ai_portrait", null, null, null, false, 3904), false, false, true, new ProfileCustomConfig((SkipConfig) null, continueConfig, 3), 220), null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        C19GS c19gs = null;
        try {
            frameLayout = new FrameLayout(requireContext());
            frameLayout.setFitsSystemWindows(false);
            FrameLayout frameLayout2 = new FrameLayout(requireContext());
            C786410Ut5.a6(frameLayout2, new ViewGroup.LayoutParams(-1, -2));
            frameLayout2.setId(R.id.evm);
            frameLayout.addView(frameLayout2);
            LinearLayout linearLayout = new LinearLayout(requireContext());
            linearLayout.setOrientation(1);
            Space space = new Space(requireContext());
            space.setId(R.id.w0u);
            linearLayout.addView(space);
            FrameLayout frameLayout3 = new FrameLayout(requireContext());
            frameLayout3.setFitsSystemWindows(true);
            frameLayout3.setId(R.id.ex3);
            linearLayout.addView(frameLayout3);
            frameLayout.addView(linearLayout);
            frameLayout.addView(VR());
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            frameLayout = null;
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return frameLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return frameLayout;
    }
}
