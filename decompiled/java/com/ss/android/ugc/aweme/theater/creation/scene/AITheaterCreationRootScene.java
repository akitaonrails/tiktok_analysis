package com.ss.android.ugc.aweme.theater.creation.scene;

import X.AbstractC214814194y;
import X.AbstractC548230Len;
import X.C01GW;
import X.C05YF;
import X.C0ET4;
import X.C0LN8;
import X.C0LOK;
import X.C0MWU;
import X.C0VSJ;
import X.C1322110kVd;
import X.C14K9;
import X.C1659700tI8;
import X.C1697810uHb;
import X.C1895807bg;
import X.C19EG;
import X.C1DRF;
import X.C20622515mp;
import X.C2188811AlT;
import X.C2274921E2o;
import X.C452501pT;
import X.C537540L6i;
import X.C539960LFq;
import X.C546890Lcd;
import X.C547140Ld2;
import X.C547860LeC;
import X.C547930LeJ;
import X.C548430Lf7;
import X.C549180LgK;
import X.C549480Lgo;
import X.C549490Lgp;
import X.C549500Lgq;
import X.C549510Lgr;
import X.C549540Lgu;
import X.C549560Lgw;
import X.C549720LhC;
import X.C550000Lhe;
import X.C550940LjA;
import X.C551340Ljo;
import X.C553840Lnq;
import X.C555080Lpq;
import X.C558320Lv4;
import X.C558390LvB;
import X.C559610Lx9;
import X.C560750Lyz;
import X.EnumC1642750sqn;
import X.EnumC549220LgO;
import X.EnumC550780Liu;
import X.InterfaceC1659430tHh;
import X.InterfaceC20597015ii;
import X.InterfaceC546090LbL;
import X.InterfaceC548570LfL;
import X.InterfaceC548750Lfd;
import X.InterfaceC549260LgS;
import X.InterfaceC549270LgT;
import X.InterfaceC549370Lgd;
import X.InterfaceC558600LvW;
import X.InterfaceC558620LvY;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.aiuikit.api.pages.creation.AICreationScene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.mention.RecommendMentionAndPrompt;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel;
import com.ss.android.ugc.aweme.theater.model.WritableAITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.zhiliaoapp.musically.R;
import jg5.AvS540S0100000_8;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS148S0101000_8;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCreationRootScene extends AICreationScene {
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 429));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 428));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 426));
    public final MutableLiveData<InterfaceC549270LgT> LLLFF;
    public final MutableLiveData<RecommendMentionAndPrompt> LLLFFI;
    public final MutableLiveData<EnumC549220LgO> LLLFZ;
    public final MutableLiveData<Boolean> LLLI;
    public final C0LOK LLLII;
    public final String LLLIIII;
    public final C0MWU LLLIIIIL;
    public final C549500Lgq LLLIIIL;
    public final C549560Lgw LLLIIL;
    public final C549480Lgo LLLIILIL;

    public AITheaterCreationRootScene() {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        MutableLiveData<InterfaceC549270LgT> mutableLiveData = new MutableLiveData<>();
        this.LLLFF = mutableLiveData;
        MutableLiveData<RecommendMentionAndPrompt> mutableLiveData2 = new MutableLiveData<>();
        this.LLLFFI = mutableLiveData2;
        this.LLLFZ = new MutableLiveData<>();
        this.LLLI = new MutableLiveData<>(Boolean.FALSE);
        this.LLLII = C0LOK.LIZ;
        this.LLLIIII = "AITheaterCreationRootScene";
        C0MWU c0mwu = new C0MWU();
        c0mwu.LIZJ = R.style.y0;
        c0mwu.LJ = 16;
        this.LLLIIIIL = c0mwu;
        C549500Lgq c549500Lgq = new C549500Lgq();
        c549500Lgq.initVideoUri(new C550000Lhe<>(new AwS552S0100000_8(this, 424)), new C550000Lhe<>(new AwS552S0100000_8(this, 425)));
        c549500Lgq.backgroundText(new C550000Lhe<>(new AwS148S0101000_8(new Object[0], 9)));
        c549500Lgq.setOnClickXOnPreviewListener(!C558390LvB.LIZ().supportFollowPathToCreateNew ? null : new AwS552S0100000_8(this, 427));
        c549500Lgq.build();
        this.LLLIIIL = c549500Lgq;
        C549560Lgw c549560Lgw = new C549560Lgw();
        String strLIZ = C547930LeJ.LIZ(2131826236, new Object[0]);
        strLIZ = strLIZ == null ? "" : strLIZ;
        String strLIZ2 = C547930LeJ.LIZ(2131826063, new Object[0]);
        strLIZ2 = strLIZ2 == null ? "Dreamina Seedance 2.0" : strLIZ2;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        c549560Lgw.input(new C1895807bg(strLIZ, strLIZ2, (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.LIZLLL()) ? false : true));
        c549560Lgw.build();
        this.LLLIIL = c549560Lgw;
        C549480Lgo c549480Lgo = new C549480Lgo();
        C549510Lgr c549510Lgr = new C549510Lgr();
        c549510Lgr.targetMaxEdgeSize(C558390LvB.LIZ().uploadPhotoMaxEdge);
        c549510Lgr.fileResourceType(new C0LN8() { // from class: X.0Lgz
            @Override // X.C0LN8
            public final String getTag() {
                return "ai_theater";
            }
        });
        c549510Lgr.build();
        c549480Lgo.albumConfig(c549510Lgr);
        C553840Lnq c553840Lnq = new C553840Lnq();
        c553840Lnq.mentionLimit(C558390LvB.LIZ().maxMentionCount);
        c553840Lnq.maxInputCharCount(C558390LvB.LIZ().maxInputCharCount);
        c553840Lnq.panelTopY(new AwS552S0100000_8(this, 437));
        c553840Lnq.uiTextConfig(new C555080Lpq(C547930LeJ.LIZ(2131826229, Integer.valueOf(C558390LvB.LIZ().maxMentionCount)), C547930LeJ.LIZ(2131826182, Integer.valueOf(C558390LvB.LIZ().maxMentionCount)), C547930LeJ.LIZ(2131826180, new Object[0]), C547930LeJ.LIZ(2131826187, new Object[0]), C547930LeJ.LIZ(2131826209, new Object[0]), C547930LeJ.LIZ(2131826174, new Object[0]), C1697810uHb.LJIIJJI(C547930LeJ.LIZ(2131826203, new Object[0]), C547930LeJ.LIZ(2131826204, new Object[0]), C547930LeJ.LIZ(2131826205, new Object[0]), C547930LeJ.LIZ(2131826206, new Object[0]), C547930LeJ.LIZ(2131826207, new Object[0])), C547930LeJ.LIZ(2131826208, new Object[0]), C547930LeJ.LIZ(2131826184, new Object[0]), C547930LeJ.LIZ(2131826183, new Object[0]), C547930LeJ.LIZ(2131825983, new Object[0]), C547930LeJ.LIZ(2131826178, new Object[0]), C547930LeJ.LIZ(2131826179, new Object[0]), C547930LeJ.LIZ(2131826176, new Object[0]), C547930LeJ.LIZ(2131826181, new Object[0]), AFwS239S0000000_8.get$arr$(148)));
        c553840Lnq.tooltipOperator(new C558320Lv4(new AwS552S0100000_8(this, 438), new AwS552S0100000_8(this, 439), this));
        c553840Lnq.build();
        c549480Lgo.mentionConfig(c553840Lnq);
        c549480Lgo.initMediaPath(new C550000Lhe<>(new AwS552S0100000_8(this, 440)));
        c549480Lgo.enableSearchPagination(new C550000Lhe<>(AFwS190S0000000_4.get$arr$(2118)));
        c549480Lgo.enableEmptySearchRefresh(new C550000Lhe<>(AFwS190S0000000_4.get$arr$(2119)));
        c549480Lgo.initInputBlocks(new C550000Lhe<>(new AwS552S0100000_8(this, 441)));
        c549480Lgo.initFollowPathUserInfo(new C550000Lhe<>(new AwS552S0100000_8(this, 442)));
        c549480Lgo.initUserSwitchInfos(new C550000Lhe<>(new AwS552S0100000_8(this, 430)));
        c549480Lgo.enableCameoMenu(new C550000Lhe<>(new AwS552S0100000_8(this, 431)));
        c549480Lgo.cameoStatusLiveData(mutableLiveData);
        c549480Lgo.restQuotaProvider(new C550000Lhe<>(new AwS552S0100000_8(this, 432)));
        c549480Lgo.recommendMentionResultLiveData(mutableLiveData2);
        c549480Lgo.mentionListLeftTopText(new C550000Lhe<>(new AwS552S0100000_8(this, 433)));
        c549480Lgo.forceInsertRecommendItems(new C550000Lhe<>(new AwS552S0100000_8(this, 434)));
        C551340Ljo[] c551340LjoArr = new C551340Ljo[2];
        String strLIZ3 = C547930LeJ.LIZ(2131826217, new Object[0]);
        c551340LjoArr[0] = new C551340Ljo(strLIZ3 == null ? "" : strLIZ3, R.raw.icon_gear, new AwS552S0100000_8(this, 435));
        String strLIZ4 = C547930LeJ.LIZ(2131826218, new Object[0]);
        c551340LjoArr[1] = new C551340Ljo(strLIZ4 != null ? strLIZ4 : "", R.raw.icon_arrow_double_direction_circle, new AwS552S0100000_8(this, 436));
        c549480Lgo.ellipsisMenuItems(C1697810uHb.LJIIJJI(c551340LjoArr));
        c549480Lgo.build();
        this.LLLIILIL = c549480Lgo;
    }

    public final AITheaterModel LLLLLLL() {
        return (AITheaterModel) this.LLLF.getValue();
    }

    public final IAITheaterCreationLauncher.EnterParams LLLLLLLLLL() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLJZIJLIL.getValue();
    }

    public final AITheaterConsumptionModel LLLLLLLLL() {
        AITheaterConsumptionModel aITheaterConsumptionModel;
        IAITheaterCreationLauncher.EnterParams enterParamsLLLLLLLLLL = LLLLLLLLLL();
        return (enterParamsLLLLLLLLLL == null || (aITheaterConsumptionModel = enterParamsLLLLLLLLLL.consumptionModel) == null) ? LLLLLLL().getConsumptionModel() : aITheaterConsumptionModel;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.creation.AICreationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (Intrinsics.LJFF(this.LLLI.getValue(), Boolean.TRUE)) {
            return;
        }
        C2274921E2o c2274921E2o = this.LLJLILLLLZIIL;
        if (c2274921E2o != null) {
            c2274921E2o.Eu0(this.LLJLIL ? EnumC550780Liu.ENTER : EnumC550780Liu.RESUME);
        }
        this.LLJLIL = false;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final InterfaceC546090LbL LLLLLIL() {
        return this.LLLII;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final C0MWU LLLLLJLJLL() {
        return this.LLLIIIIL;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final String LLLLLL() {
        return this.LLLIIII;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLJI(C539960LFq c539960LFq) {
        InterfaceC558620LvY interfaceC558620LvYLJIIIIZZ;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C2274921E2o.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC549370Lgd.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC549370Lgd.class, C2274921E2o.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, (AICreationScene) this, 182));
        C19EG c19eg = (C19EG) this.mActivity;
        if (c19eg != null) {
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, ImmersionBar.LJIILJJIL(c19eg));
            tuxImmersionBar.LJ(R.attr.uk);
            tuxImmersionBar.LJIIIIZZ(R.attr.uk);
            tuxImmersionBar.LIZLLL();
            c19eg.getWindow().setSoftInputMode(16);
        }
        View view = this.mView;
        if (!view.getFitsSystemWindows()) {
            C14K9.LJIJJ(view, C560750Lyz.LL);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C549180LgK.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC549260LgS.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC549260LgS.class, C549180LgK.class, new AwS217S0300000_8(new C0ET4(), (C559610Lx9) c539960LFq, (AbstractC214814194y) this, this, 25));
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558620LvYLJIIIIZZ = iAITheaterFeatureServiceLIZ.LJIIIIZZ()) != null && interfaceC558620LvYLJIIIIZZ.LIZ() > 0) {
            C549490Lgp.LLILZIL.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("register component ");
            sbLIZ3.append(C549490Lgp.class.getName());
            sbLIZ3.append(" api ");
            sbLIZ3.append(C05YF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C549490Lgp.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 310));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("register component ");
            sbLIZ4.append(C550940LjA.class.getName());
            sbLIZ4.append(" api ");
            sbLIZ4.append(InterfaceC548570LfL.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC548570LfL.class, C550940LjA.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 311));
            C546890Lcd.LIZ.getClass();
            C546890Lcd.LIZ().mw(c539960LFq, new AITheaterCreationModel(new AITheaterSessionModel(null, null, 0, null, 15, null), new WritableAITheaterGenerationModel(null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194303, null)));
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("register component ");
        sbLIZ5.append(AbstractC548230Len.class.getName());
        sbLIZ5.append(" api ");
        sbLIZ5.append(C05YF.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, AbstractC548230Len.class, new AwS217S0300000_8(new C0ET4(), (C559610Lx9) c539960LFq, this, (AbstractC214814194y) this, 26));
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLL(C1DRF c1drf) {
        c1drf.LJFF(C549540Lgu.class, null, new AvS540S0100000_8(this, 166));
        c1drf.LJFF(InterfaceC548750Lfd.class, null, new AvS540S0100000_8(this, 167));
        c1drf.LJFF(IAITheaterCreationLauncher.EnterParams.class, null, new AvS540S0100000_8(this, 122));
        c1drf.LJFF(CreativeModel.class, null, new AvS540S0100000_8(this, 123));
        c1drf.LJFF(AITheaterModel.class, null, new AvS540S0100000_8(this, 124));
        c1drf.LJFF(Context.class, null, new AvS540S0100000_8(this, 125));
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLLLJ(ViewGroup viewGroup) {
        C1322110kVd c1322110kVd;
        C547860LeC.LIZ.getClass();
        String strLIZ = C547860LeC.LJI().LIZ(C548430Lf7.LIZ);
        if (strLIZ != null && (c1322110kVd = (C1322110kVd) viewGroup.findViewById(R.id.bp1)) != null) {
            c1322110kVd.setImageURI(Uri.fromFile(new C0VSJ(strLIZ)));
        }
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        InterfaceC1659430tHh interfaceC1659430tHhLIZLLL;
        super.onCreate(bundle);
        if (LLLLLLLLLL() == null) {
            C537540L6i.LIZ.LIZIZ("AITheaterCreationRootScene", "onCreate: enterParams is missing, finishing scene", null);
            finish();
            return;
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC1659430tHhLIZLLL = iAITheaterFeatureServiceLIZ.LIZLLL()) != null) {
            interfaceC1659430tHhLIZLLL.LJI();
        }
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate: enterParams: ");
        sbLIZ.append(LLLLLLLLLL());
        c547140Ld2.LIZ("AITheaterCreationRootScene", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
        if (interfaceC20597015iiLJ != null) {
            interfaceC20597015iiLJ.ac(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene, X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        EnumC550780Liu enumC550780Liu;
        super.onActivityResult(i, i2, intent);
        if (i == 12001) {
            if (intent != null && intent.getBooleanExtra("has_cameo_change", false)) {
                LLLLLLL().getContextModel().aigcEntranceInfo.hasCameoChange = Boolean.TRUE;
            }
            C2274921E2o c2274921E2o = this.LLJLILLLLZIIL;
            if (c2274921E2o != null) {
                if (this.LLJLIL) {
                    enumC550780Liu = EnumC550780Liu.ENTER;
                } else {
                    enumC550780Liu = EnumC550780Liu.RESUME;
                }
                c2274921E2o.Eu0(enumC550780Liu);
            }
            this.LLJLIL = false;
        }
    }
}
