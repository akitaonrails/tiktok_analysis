package com.ss.android.ugc.aweme.portrait.generate.scene;

import X.AbstractC214814194y;
import X.C01GW;
import X.C098200Yq;
import X.C0ET4;
import X.C0LOM;
import X.C1659700tI8;
import X.C189200o6;
import X.C19EG;
import X.C1DRF;
import X.C2188811AlT;
import X.C452501pT;
import X.C539960LFq;
import X.C546860Lca;
import X.C547790Le5;
import X.C548630LfR;
import X.C549530Lgt;
import X.C549550Lgv;
import X.C549780LhI;
import X.C549800LhK;
import X.C549820LhM;
import X.C549840LhO;
import X.C550050Lhj;
import X.C550110Lhp;
import X.C553520LnK;
import X.C559610Lx9;
import X.EnumC1642750sqn;
import X.InterfaceC546090LbL;
import X.InterfaceC548530LfH;
import X.InterfaceC548670LfV;
import X.InterfaceC548750Lfd;
import X.InterfaceC549900LhU;
import X.InterfaceC550060Lhk;
import X.InterfaceC550070Lhl;
import X.InterfaceC550170Lhv;
import X.InterfaceC550350LiD;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitSessionModel;
import com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import java.util.ArrayList;
import java.util.Collections;
import jg5.AvS540S0100000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitGenerationRootScene extends AIGCLoadingScene {
    public OpenGenerationPageParams LLLF;
    public final C0LOM LLJZIJLIL = C0LOM.LIZ;
    public final String LLL = "AIPortraitGenerationRootScene";
    public boolean LLLFF = true;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 161));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 162));

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC548750Lfd LLLLLLL() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams r2 = r3.LLLF
            r0 = 0
            if (r2 == 0) goto Ld
            com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel r1 = r2.contextModel
            if (r1 == 0) goto Ld
            X.0Lfd r0 = X.C548790Lfh.LIZ(r1, r2)
        Ld:
            com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams r1 = r3.LLLF
            if (r1 == 0) goto L20
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r2 = r1.creativeInfo
            if (r2 == 0) goto L20
            if (r0 == 0) goto L22
            X.0Lni r1 = new X.0Lni
            r1.<init>(r2)
            X.0Lfd r0 = X.C548790Lfh.LIZ(r0, r1)
        L20:
            if (r0 != 0) goto L24
        L22:
            X.0Lj9 r0 = X.C550930Lj9.LL
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.generate.scene.AIPortraitGenerationRootScene.LLLLLLL():X.0Lfd");
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549530Lgt<InterfaceC548530LfH, C549780LhI> LLLLLLLLL() {
        return (C549530Lgt) this.LLLFFI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549530Lgt<InterfaceC549900LhU, C549800LhK> LLLLLLLLLL() {
        return (C549530Lgt) this.LLLFZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549840LhO LLLLLLLZIL() {
        C549840LhO c549840LhO = new C549840LhO();
        c549840LhO.showDraftButton(this.LLLFF);
        return c549840LhO;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549820LhM LLLLLLZZ() {
        C549820LhM c549820LhM = new C549820LhM();
        c549820LhM.shouldShowRetentionDialog(false);
        return c549820LhM;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549800LhK LLLLLZ() {
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitInputInfo aIPortraitInputInfo;
        String str;
        C549800LhK c549800LhK = new C549800LhK();
        OpenGenerationPageParams openGenerationPageParams = this.LLLF;
        if (openGenerationPageParams != null && (aIPortraitContextModel = openGenerationPageParams.contextModel) != null && (aIPortraitInputInfo = aIPortraitContextModel.inputInfo) != null && (str = aIPortraitInputInfo.coverPath) != null) {
            c549800LhK.backgroundImageUrl(str);
        }
        return c549800LhK;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        Object c098200Yq;
        super.onResume();
        try {
            c098200Yq = requireFragmentActivity();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C19EG c19eg = (C19EG) c098200Yq;
        if (c19eg != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
            tuxImmersionBar.LJIIIZ(0);
            tuxImmersionBar.LJFF(0);
            immersionBarLJIILJJIL.LJIIJ(false);
            immersionBarLJIILJJIL.LJII(false);
            tuxImmersionBar.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final InterfaceC546090LbL LLLLLIL() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final String LLLLLL() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene, com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLJI(C539960LFq c539960LFq) {
        super.LLLLJI(c539960LFq);
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C550110Lhp.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC550070Lhl.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC550070Lhl.class, C550110Lhp.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, (AbstractC214814194y) this, 37));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C548630LfR.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC550060Lhk.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC550060Lhk.class, C548630LfR.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 83));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("register component ");
        sbLIZ3.append(C550050Lhj.class.getName());
        sbLIZ3.append(" api ");
        sbLIZ3.append(InterfaceC548670LfV.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC548670LfV.class, C550050Lhj.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, this, 38));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("register component ");
        sbLIZ4.append(C553520LnK.class.getName());
        sbLIZ4.append(" api ");
        sbLIZ4.append(InterfaceC550170Lhv.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC550170Lhv.class, C553520LnK.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 84));
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLL(C1DRF c1drf) {
        c1drf.LJFF(C549550Lgv.class, null, new AvS540S0100000_8(this, 169));
        c1drf.LJFF(InterfaceC548750Lfd.class, null, new AvS540S0100000_8(this, 170));
        c1drf.LJFF(Context.class, null, new AvS540S0100000_8(this, 20));
        c1drf.LJFF(CreativeModel.class, null, new AvS540S0100000_8(this, 21));
        c1drf.LJFF(CreativeInfo.class, null, new AvS540S0100000_8(this, 22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        OpenGenerationPageParams openGenerationPageParams;
        boolean z;
        InterfaceC550350LiD interfaceC550350LiDLIZLLL;
        CreativeModel creativeModel;
        DraftInfoModel draftInfoModel;
        CreativeModel creativeModel2;
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AIGCBusinessModelSet aIGCBusinessModelSet2;
        String string;
        OpenGenerationPageParams openGenerationPageParams2;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitInputInfo aIPortraitInputInfo;
        String string2;
        OpenGenerationPageParams openGenerationPageParams3;
        AIPortraitContextModel aIPortraitContextModel2;
        AIPortraitInputInfo aIPortraitInputInfo2;
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AIPortraitContextModel aIPortraitContextModel3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        Object[] objArr55 = 0;
        Object[] objArr56 = 0;
        Object[] objArr57 = 0;
        Object[] objArr58 = 0;
        Object[] objArr59 = 0;
        Object[] objArr60 = 0;
        Object[] objArr61 = 0;
        Object[] objArr62 = 0;
        Object[] objArr63 = 0;
        Object[] objArr64 = 0;
        Object[] objArr65 = 0;
        Object[] objArr66 = 0;
        Object[] objArr67 = 0;
        Object[] objArr68 = 0;
        Object[] objArr69 = 0;
        Object[] objArr70 = 0;
        Object[] objArr71 = 0;
        Object[] objArr72 = 0;
        Object[] objArr73 = 0;
        Object[] objArr74 = 0;
        Object[] objArr75 = 0;
        Object[] objArr76 = 0;
        Object[] objArr77 = 0;
        Object[] objArr78 = 0;
        Object[] objArr79 = 0;
        Object[] objArr80 = 0;
        Object[] objArr81 = 0;
        Object[] objArr82 = 0;
        Object[] objArr83 = 0;
        Object[] objArr84 = 0;
        Object[] objArr85 = 0;
        Object[] objArr86 = 0;
        Object[] objArr87 = 0;
        Object[] objArr88 = 0;
        Object[] objArr89 = 0;
        Object[] objArr90 = 0;
        Object[] objArr91 = 0;
        Object[] objArr92 = 0;
        Object[] objArr93 = 0;
        Object[] objArr94 = 0;
        Object[] objArr95 = 0;
        Object[] objArr96 = 0;
        Object[] objArr97 = 0;
        Object[] objArr98 = 0;
        Object[] objArr99 = 0;
        Object[] objArr100 = 0;
        Object[] objArr101 = 0;
        Object[] objArr102 = 0;
        Object[] objArr103 = 0;
        Object[] objArr104 = 0;
        Object[] objArr105 = 0;
        Object[] objArr106 = 0;
        Object[] objArr107 = 0;
        Object[] objArr108 = 0;
        Object[] objArr109 = 0;
        Object[] objArr110 = 0;
        Object[] objArr111 = 0;
        Object[] objArr112 = 0;
        Object[] objArr113 = 0;
        Object[] objArr114 = 0;
        Object[] objArr115 = 0;
        Object[] objArr116 = 0;
        Object[] objArr117 = 0;
        Object[] objArr118 = 0;
        Object[] objArr119 = 0;
        Object[] objArr120 = 0;
        Object[] objArr121 = 0;
        Object[] objArr122 = 0;
        Object[] objArr123 = 0;
        Object[] objArr124 = 0;
        Object[] objArr125 = 0;
        Object[] objArr126 = 0;
        Object[] objArr127 = 0;
        Object[] objArr128 = 0;
        Object[] objArr129 = 0;
        Object[] objArr130 = 0;
        Object[] objArr131 = 0;
        Object[] objArr132 = 0;
        Object[] objArr133 = 0;
        Object[] objArr134 = 0;
        Object[] objArr135 = 0;
        Object[] objArr136 = 0;
        Object[] objArr137 = 0;
        Object[] objArr138 = 0;
        Object[] objArr139 = 0;
        Object[] objArr140 = 0;
        Object[] objArr141 = 0;
        Object[] objArr142 = 0;
        Object[] objArr143 = 0;
        Object[] objArr144 = 0;
        Object[] objArr145 = 0;
        Object[] objArr146 = 0;
        Object[] objArr147 = 0;
        Object[] objArr148 = 0;
        Object[] objArr149 = 0;
        Object[] objArr150 = 0;
        Object[] objArr151 = 0;
        Object[] objArr152 = 0;
        Object[] objArr153 = 0;
        Object[] objArr154 = 0;
        Object[] objArr155 = 0;
        Object[] objArr156 = 0;
        Object[] objArr157 = 0;
        Object[] objArr158 = 0;
        Object[] objArr159 = 0;
        Object[] objArr160 = 0;
        Object[] objArr161 = 0;
        Object[] objArr162 = 0;
        Object[] objArr163 = 0;
        Object[] objArr164 = 0;
        Object[] objArr165 = 0;
        Object[] objArr166 = 0;
        Object[] objArr167 = 0;
        Object[] objArr168 = 0;
        Object[] objArr169 = 0;
        Object[] objArr170 = 0;
        Object[] objArr171 = 0;
        Object[] objArr172 = 0;
        Object[] objArr173 = 0;
        Object[] objArr174 = 0;
        Object[] objArr175 = 0;
        Object[] objArr176 = 0;
        Object[] objArr177 = 0;
        Object[] objArr178 = 0;
        Object[] objArr179 = 0;
        Object[] objArr180 = 0;
        Object[] objArr181 = 0;
        Object[] objArr182 = 0;
        Object[] objArr183 = 0;
        Object[] objArr184 = 0;
        Object[] objArr185 = 0;
        Object[] objArr186 = 0;
        Object[] objArr187 = 0;
        Object[] objArr188 = 0;
        Object[] objArr189 = 0;
        Object[] objArr190 = 0;
        Object[] objArr191 = 0;
        Object[] objArr192 = 0;
        Object[] objArr193 = 0;
        Object[] objArr194 = 0;
        Object[] objArr195 = 0;
        Object[] objArr196 = 0;
        Object[] objArr197 = 0;
        Object[] objArr198 = 0;
        Object[] objArr199 = 0;
        Object[] objArr200 = 0;
        Object[] objArr201 = 0;
        Object[] objArr202 = 0;
        Object[] objArr203 = 0;
        Object[] objArr204 = 0;
        Object[] objArr205 = 0;
        Object[] objArr206 = 0;
        Object[] objArr207 = 0;
        Object[] objArr208 = 0;
        if (bundle2 != null) {
            openGenerationPageParams = (OpenGenerationPageParams) bundle2.getParcelable("enter_params");
        } else {
            openGenerationPageParams = null;
        }
        this.LLLF = openGenerationPageParams;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string2 = bundle3.getString("cameo_id")) != null && (openGenerationPageParams3 = this.LLLF) != null && (aIPortraitContextModel2 = openGenerationPageParams3.contextModel) != null && (aIPortraitInputInfo2 = aIPortraitContextModel2.inputInfo) != null) {
            aIPortraitInputInfo2.cameoIdList = Collections.singletonList(string2);
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && (string = bundle4.getString("cameo_image")) != null && (openGenerationPageParams2 = this.LLLF) != null && (aIPortraitContextModel = openGenerationPageParams2.contextModel) != null && (aIPortraitInputInfo = aIPortraitContextModel.inputInfo) != null) {
            aIPortraitInputInfo.cameoImageList = Collections.singletonList(string);
        }
        OpenGenerationPageParams openGenerationPageParams4 = this.LLLF;
        if (openGenerationPageParams4 != null && openGenerationPageParams4.creativeInfo == null) {
            openGenerationPageParams4.creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        }
        OpenGenerationPageParams openGenerationPageParams5 = this.LLLF;
        if (openGenerationPageParams5 != null && openGenerationPageParams5.creativeModel == null) {
            int i = -1;
            openGenerationPageParams5.creativeModel = new CreativeModel(objArr208 == true ? 1 : 0, objArr207 == true ? 1 : 0, objArr206 == true ? 1 : 0, objArr205 == true ? 1 : 0, objArr204 == true ? 1 : 0, objArr203 == true ? 1 : 0, objArr202 == true ? 1 : 0, objArr201 == true ? 1 : 0, objArr200 == true ? 1 : 0, objArr199 == true ? 1 : 0, objArr198 == true ? 1 : 0, objArr197 == true ? 1 : 0, objArr196 == true ? 1 : 0, objArr195 == true ? 1 : 0, objArr194 == true ? 1 : 0, objArr193 == true ? 1 : 0, objArr192 == true ? 1 : 0, objArr191 == true ? 1 : 0, objArr190 == true ? 1 : 0, objArr189 == true ? 1 : 0, objArr188 == true ? 1 : 0, objArr187 == true ? 1 : 0, objArr186 == true ? 1 : 0, objArr185 == true ? 1 : 0, objArr184 == true ? 1 : 0, objArr183 == true ? 1 : 0, objArr182 == true ? 1 : 0, objArr181 == true ? 1 : 0, objArr180 == true ? 1 : 0, objArr179 == true ? 1 : 0, objArr178 == true ? 1 : 0, objArr177 == true ? 1 : 0, objArr176 == true ? 1 : 0, objArr175 == true ? 1 : 0, objArr174 == true ? 1 : 0, objArr173 == true ? 1 : 0, objArr172 == true ? 1 : 0, objArr171 == true ? 1 : 0, objArr170 == true ? 1 : 0, objArr169 == true ? 1 : 0, 0, objArr168 == true ? 1 : 0, objArr167 == true ? 1 : 0, objArr166 == true ? 1 : 0, objArr165 == true ? 1 : 0, objArr164 == true ? 1 : 0, objArr163 == true ? 1 : 0, objArr162 == true ? 1 : 0, objArr161 == true ? 1 : 0, objArr160 == true ? 1 : 0, objArr159 == true ? 1 : 0, objArr158 == true ? 1 : 0, objArr157 == true ? 1 : 0, objArr156 == true ? 1 : 0, objArr155 == true ? 1 : 0, 0 == true ? 1 : 0, objArr154 == true ? 1 : 0, objArr153 == true ? 1 : 0, objArr152 == true ? 1 : 0, objArr151 == true ? 1 : 0, objArr150 == true ? 1 : 0, objArr149 == true ? 1 : 0, objArr148 == true ? 1 : 0, objArr147 == true ? 1 : 0, objArr146 == true ? 1 : 0, objArr145 == true ? 1 : 0, objArr144 == true ? 1 : 0, objArr143 == true ? 1 : 0, objArr142 == true ? 1 : 0, objArr141 == true ? 1 : 0, objArr140 == true ? 1 : 0, objArr139 == true ? 1 : 0, objArr138 == true ? 1 : 0, objArr137 == true ? 1 : 0, objArr136 == true ? 1 : 0, objArr135 == true ? 1 : 0, objArr134 == true ? 1 : 0, objArr133 == true ? 1 : 0, objArr132 == true ? 1 : 0, objArr131 == true ? 1 : 0, objArr130 == true ? 1 : 0, objArr129 == true ? 1 : 0, objArr128 == true ? 1 : 0, objArr127 == true ? 1 : 0, objArr126 == true ? 1 : 0, objArr125 == true ? 1 : 0, objArr124 == true ? 1 : 0, objArr123 == true ? 1 : 0, objArr122 == true ? 1 : 0, objArr121 == true ? 1 : 0, objArr120 == true ? 1 : 0, objArr119 == true ? 1 : 0, 0 == true ? 1 : 0, objArr118 == true ? 1 : 0, objArr117 == true ? 1 : 0, objArr116 == true ? 1 : 0, objArr115 == true ? 1 : 0, objArr114 == true ? 1 : 0, objArr113 == true ? 1 : 0, objArr112 == true ? 1 : 0, objArr111 == true ? 1 : 0, objArr110 == true ? 1 : 0, objArr109 == true ? 1 : 0, objArr108 == true ? 1 : 0, objArr107 == true ? 1 : 0, objArr106 == true ? 1 : 0, objArr105 == true ? 1 : 0, objArr104 == true ? 1 : 0, objArr103 == true ? 1 : 0, objArr102 == true ? 1 : 0, objArr101 == true ? 1 : 0, objArr100 == true ? 1 : 0, objArr99 == true ? 1 : 0, objArr98 == true ? 1 : 0, objArr97 == true ? 1 : 0, objArr96 == true ? 1 : 0, objArr95 == true ? 1 : 0, objArr94 == true ? 1 : 0, objArr93 == true ? 1 : 0, objArr92 == true ? 1 : 0, objArr91 == true ? 1 : 0, objArr90 == true ? 1 : 0, objArr89 == true ? 1 : 0, objArr88 == true ? 1 : 0, objArr87 == true ? 1 : 0, objArr86 == true ? 1 : 0, objArr85 == true ? 1 : 0, objArr84 == true ? 1 : 0, objArr83 == true ? 1 : 0, objArr82 == true ? 1 : 0, objArr81 == true ? 1 : 0, objArr80 == true ? 1 : 0, objArr79 == true ? 1 : 0, objArr78 == true ? 1 : 0, objArr77 == true ? 1 : 0, objArr76 == true ? 1 : 0, objArr75 == true ? 1 : 0, objArr74 == true ? 1 : 0, objArr73 == true ? 1 : 0, objArr72 == true ? 1 : 0, objArr71 == true ? 1 : 0, objArr70 == true ? 1 : 0, objArr69 == true ? 1 : 0, objArr68 == true ? 1 : 0, objArr67 == true ? 1 : 0, objArr66 == true ? 1 : 0, objArr65 == true ? 1 : 0, objArr64 == true ? 1 : 0, objArr63 == true ? 1 : 0, objArr62 == true ? 1 : 0, objArr61 == true ? 1 : 0, objArr60 == true ? 1 : 0, objArr59 == true ? 1 : 0, objArr58 == true ? 1 : 0, objArr57 == true ? 1 : 0, objArr56 == true ? 1 : 0, objArr55 == true ? 1 : 0, objArr54 == true ? 1 : 0, objArr53 == true ? 1 : 0, objArr52 == true ? 1 : 0, objArr51 == true ? 1 : 0, objArr50 == true ? 1 : 0, objArr49 == true ? 1 : 0, objArr48 == true ? 1 : 0, objArr47 == true ? 1 : 0, objArr46 == true ? 1 : 0, objArr45 == true ? 1 : 0, objArr44 == true ? 1 : 0, objArr43 == true ? 1 : 0, objArr42 == true ? 1 : 0, objArr41 == true ? 1 : 0, objArr40 == true ? 1 : 0, objArr39 == true ? 1 : 0, objArr38 == true ? 1 : 0, objArr37 == true ? 1 : 0, objArr36 == true ? 1 : 0, objArr35 == true ? 1 : 0, objArr34 == true ? 1 : 0, objArr33 == true ? 1 : 0, objArr32 == true ? 1 : 0, objArr31 == true ? 1 : 0, objArr30 == true ? 1 : 0, objArr29 == true ? 1 : 0, objArr28 == true ? 1 : 0, objArr27 == true ? 1 : 0, objArr26 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr25 == true ? 1 : 0, 0 == true ? 1 : 0, objArr24 == true ? 1 : 0, objArr23 == true ? 1 : 0, objArr22 == true ? 1 : 0, objArr21 == true ? 1 : 0, objArr20 == true ? 1 : 0, objArr19 == true ? 1 : 0, objArr18 == true ? 1 : 0, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, objArr14 == true ? 1 : 0, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i, i, i, i, i, i, 2097151, objArr == true ? 1 : 0);
        }
        OpenGenerationPageParams openGenerationPageParams6 = this.LLLF;
        if (openGenerationPageParams6 != null && ((creativeModel2 = openGenerationPageParams6.creativeModel) == null || (aIGCBusinessModelSet2 = creativeModel2.aigcBusinessModel) == null || aIGCBusinessModelSet2.aiPortraitModel == null)) {
            AIPortraitModel aIPortraitModel = new AIPortraitModel(null, null, null, null);
            CreativeInfo creativeInfo = openGenerationPageParams6.creativeInfo;
            if (creativeInfo != null) {
                String creationId = creativeInfo.getCreationId();
                AIGCSessionModel.Companion.getClass();
                aIPortraitModel.sessionModel = new AIPortraitSessionModel(C546860Lca.LIZ(), creationId);
            }
            aIPortraitModel.creationModel = new AIPortraitCreationModel(new ArrayList(), false, false, false, false);
            AIPortraitContextModel aIPortraitContextModel4 = openGenerationPageParams6.contextModel;
            if (aIPortraitContextModel4 != null) {
                aIPortraitContextModel4.generatingModel.startTime = System.currentTimeMillis();
                aIPortraitContextModel3 = aIPortraitContextModel4;
            }
            aIPortraitModel.contextModel = aIPortraitContextModel3;
            aIPortraitModel.consumptionModel = openGenerationPageParams6.consumptionModel;
            CreativeModel creativeModel3 = openGenerationPageParams6.creativeModel;
            if (creativeModel3 != null && (aIGCBusinessModelSet = creativeModel3.aigcBusinessModel) != null) {
                aIGCBusinessModelSet.aiPortraitModel = aIPortraitModel;
            }
        }
        OpenGenerationPageParams openGenerationPageParams7 = this.LLLF;
        if (openGenerationPageParams7 != null && (creativeModel = openGenerationPageParams7.creativeModel) != null && (draftInfoModel = creativeModel.draftInfoModel) != null && draftInfoModel.isDraft) {
            z = true;
        } else {
            z = false;
        }
        this.LLLFF = !z;
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && (interfaceC550350LiDLIZLLL = iAIPortraitFeatureServiceLIZ.LIZLLL()) != null) {
            interfaceC550350LiDLIZLLL.LIZIZ();
        }
    }
}
