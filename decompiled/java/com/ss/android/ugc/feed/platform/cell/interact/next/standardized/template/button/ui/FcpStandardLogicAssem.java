package com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.button.ui;

import X.AbstractC705350Rld;
import X.C01GW;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C703580Rim;
import X.C703600Rio;
import X.C703610Rip;
import X.C704810Rkl;
import X.C704820Rkm;
import X.C704830Rkn;
import X.C704850Rkp;
import X.C704890Rkt;
import X.C704910Rkv;
import X.C704960Rl0;
import X.C704990Rl3;
import X.C705000Rl4;
import X.C705340Rlc;
import X.InterfaceC702850Rhb;
import X.InterfaceC703750Rj3;
import X.InterfaceC705020Rl6;
import X.InterfaceC705050Rl9;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.api.ComponentElementChangeAbility;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.button.ui.FcpStandardLogicAssem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpStandardLogicAssem extends BaseCellLogicComponent<FcpStandardLogicAssem> implements InterfaceC702850Rhb {
    public final C704830Rkn LLJJIJIIJIL;
    public C704960Rl0 LLJJJIL;
    public final /* synthetic */ C703600Rio<VideoItemParams, InterfaceC703750Rj3> LLJJIJI = new C703600Rio<>();
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1283));
    public final C704890Rkt LLJJJ = new InterfaceC705020Rl6() { // from class: X.0Rkt
        @Override // X.InterfaceC705020Rl6
        public final void LIZ() {
            FcpStandardLogicAssem fcpStandardLogicAssem = this.LIZ;
            fcpStandardLogicAssem.LLJJIJI.LIZJ("update_content", new AwS590S0100000_11(fcpStandardLogicAssem, 358));
        }

        @Override // X.InterfaceC705020Rl6
        public final void hide() {
            this.LIZ.Bo("hide_content", null);
        }

        @Override // X.InterfaceC705020Rl6
        public final void show() {
            this.LIZ.Bo("show_content", null);
        }
    };

    public final void Bo(String str, Function1<? super InterfaceC703750Rj3, Unit> function1) {
        this.LLJJIJI.LIZJ(str, function1);
    }

    @Override // X.InterfaceC702850Rhb
    public final InterfaceC703750Rj3 gc() {
        return this.LLJJIJI.gc();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C704910Rkv c704910RkvLIZJ;
        if (this.LLJJI.LLILZLL != null) {
            C704960Rl0 c704960Rl0 = this.LLJJJIL;
            if (Intrinsics.LJFF((c704960Rl0 == null || (c704910RkvLIZJ = c704960Rl0.LIZJ()) == null) ? null : c704910RkvLIZJ.LIZ, "active")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("component key: ");
                sbLIZ.append(this.LLJJI.LLILLL);
                sbLIZ.append(", onHolderUnSelected invoked");
                C2188811AlT.LIZIZ(sbLIZ);
                C704960Rl0 c704960Rl02 = this.LLJJJIL;
                if (c704960Rl02 != null) {
                    c704960Rl02.LJIIJJI();
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component key: ");
        sbLIZ.append(this.LLJJI.LLILLL);
        sbLIZ.append(", onActive invoked");
        C2188811AlT.LIZIZ(sbLIZ);
        C704960Rl0 c704960Rl0 = this.LLJJJIL;
        if (c704960Rl0 != null) {
            c704960Rl0.LIZJ().LIZ = "active";
            c704960Rl0.LJIILLIIL();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        getContext();
        this.LLJJIJI.LIZIZ(new AwS590S0100000_11(this, 359), (ComponentElementChangeAbility) this.LLJJIJIL.getValue());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component key: ");
        sbLIZ.append(this.LLJJI.LLILLL);
        sbLIZ.append(", onInActive invoked");
        C2188811AlT.LIZIZ(sbLIZ);
        C704960Rl0 c704960Rl0 = this.LLJJJIL;
        if (c704960Rl0 != null) {
            c704960Rl0.LIZJ().LIZ = "inactive";
            InterfaceC705050Rl9.LIZ.getClass();
            C705340Rlc c705340Rlc = c704960Rl0.LJIILIIL;
            if (c705340Rlc != null) {
                c705340Rlc.LIZ("exposure_action");
            }
            C705340Rlc c705340Rlc2 = c704960Rl0.LJIILIIL;
            if (c705340Rlc2 != null) {
                c705340Rlc2.LIZIZ("exposure_over_action");
            }
            c704960Rl0.LIZ("inactive");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component key: ");
        sbLIZ.append(this.LLJJI.LLILLL);
        sbLIZ.append(", unBind invoked");
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJI.LLILZLL = null;
        C704960Rl0 c704960Rl0 = this.LLJJJIL;
        if (c704960Rl0 != null) {
            c704960Rl0.LJIILIIL();
        }
        C703610Rip<VideoItemParams, ELEMENT> c703610Rip = this.LLJJIJI.LL;
        Function0<Unit> function0 = c703610Rip.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = c703610Rip.LJ;
        if (function02 != null) {
            function02.invoke();
        }
        C703580Rim c703580Rim = c703610Rip.LIZ;
        if (c703580Rim != null) {
            c703580Rim.LIZ(null, "clear_store_action");
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Rkt] */
    public FcpStandardLogicAssem(C704830Rkn c704830Rkn) {
        this.LLJJIJIIJIL = c704830Rkn;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        String str;
        C704910Rkv c704910RkvLIZJ;
        if (this.LLJJI.LLILZLL != null) {
            C704960Rl0 c704960Rl0 = this.LLJJJIL;
            if (c704960Rl0 != null && (c704910RkvLIZJ = c704960Rl0.LIZJ()) != null) {
                str = c704910RkvLIZJ.LIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "active")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("component key: ");
                sbLIZ.append(this.LLJJI.LLILLL);
                sbLIZ.append(", onHolderResume invoked");
                C2188811AlT.LIZIZ(sbLIZ);
                C704960Rl0 c704960Rl02 = this.LLJJJIL;
                if (c704960Rl02 != null) {
                    c704960Rl02.LJIIJ();
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Long l;
        C705000Rl4 c705000Rl4;
        C704990Rl3 c704990Rl3;
        Map<String, FcpTemplateActionGroup> map;
        String aid;
        Long l2;
        VideoItemParams videoItemParams2 = videoItemParams;
        String str = this.LLJJI.LLILLL;
        if (str == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component key: ");
        sbLIZ.append(str);
        sbLIZ.append(", onBind invoked");
        C2188811AlT.LIZIZ(sbLIZ);
        FcpUiTemplate fcpUiTemplate = this.LLJJI.LLILZLL;
        Map<String, List<AbstractC705350Rld>> map2 = null;
        if (fcpUiTemplate != null) {
            l = fcpUiTemplate.type;
        } else {
            l = null;
        }
        if (Intrinsics.LJFF(C704850Rkp.LIZ(l), "Plain_InfoBar") && fcpUiTemplate != null) {
            c705000Rl4 = new C705000Rl4(fcpUiTemplate, str);
            c705000Rl4.LIZ();
            Map<String, FcpTemplateActionGroup> actionsMap = fcpUiTemplate.getActionsMap();
            if (actionsMap == null) {
                actionsMap = C2097608Jq.LJ();
            }
            c705000Rl4.LIZLLL = actionsMap;
        } else {
            c705000Rl4 = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("component key: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", created template config: ");
        if (c705000Rl4 != null) {
            c704990Rl3 = c705000Rl4.LIZJ;
        } else {
            c704990Rl3 = null;
        }
        sbLIZ2.append(c704990Rl3);
        sbLIZ2.append(", actions: ");
        if (c705000Rl4 != null) {
            map = c705000Rl4.LIZLLL;
        } else {
            map = null;
        }
        sbLIZ2.append(map);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LLJJJIL == null) {
            FcpUiTemplate fcpUiTemplate2 = this.LLJJI.LLILZLL;
            if (fcpUiTemplate2 != null) {
                l2 = fcpUiTemplate2.type;
            } else {
                l2 = null;
            }
            String strLIZ = C704850Rkp.LIZ(l2);
            Context context = getContext();
            C704830Rkn c704830Rkn = this.LLJJIJIIJIL;
            String str2 = c704830Rkn.LIZJ;
            if (str2 == null) {
                str2 = c704830Rkn.LIZIZ;
            }
            this.LLJJJIL = new C704960Rl0(context, str, str2, c704830Rkn.LJ, this.LLJJJ, new AwS555S0100000_11(this, 1686));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("component key: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", created template entity, type: ");
            sbLIZ3.append(strLIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C704820Rkm c704820RkmLIZ = C704810Rkl.LIZ(str, aid, this.LLJJIJIIJIL, c705000Rl4, LifecycleOwnerKt.getLifecycleScope(this));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("component key: ");
        sbLIZ4.append(str);
        sbLIZ4.append(", created action store, action store: ");
        C705340Rlc c705340Rlc = c704820RkmLIZ.LIZ;
        if (c705340Rlc != null) {
            map2 = c705340Rlc.LIZ;
        }
        sbLIZ4.append(map2);
        sbLIZ4.append(", overrideApplied: ");
        sbLIZ4.append(c704820RkmLIZ.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        C704830Rkn c704830Rkn2 = this.LLJJIJIIJIL;
        C705340Rlc c705340Rlc2 = c704820RkmLIZ.LIZ;
        c704830Rkn2.LJI = c705340Rlc2;
        if (c705000Rl4 != null) {
            C704960Rl0 c704960Rl0 = this.LLJJJIL;
            if (c704960Rl0 != null) {
                c704960Rl0.LJIIIZ(videoItemParams2, c705000Rl4, c705340Rlc2);
            }
            C704960Rl0 c704960Rl02 = this.LLJJJIL;
            if (c704960Rl02 != null) {
                c704960Rl02.LJIILLIIL();
            }
        }
        this.LLJJIJI.LIZ(videoItemParams2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        if (this.LLJJI.LLILZLL != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent
    /* JADX INFO: renamed from: zo */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (this.LLJJI.LLILZLL != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String str;
        C704910Rkv c704910RkvLIZJ;
        if (this.LLJJI.LLILZLL != null) {
            C704960Rl0 c704960Rl0 = this.LLJJJIL;
            if (c704960Rl0 != null && (c704910RkvLIZJ = c704960Rl0.LIZJ()) != null) {
                str = c704910RkvLIZJ.LIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "active")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("component key: ");
                sbLIZ.append(this.LLJJI.LLILLL);
                sbLIZ.append(", onHolderSelected invoked");
                C2188811AlT.LIZIZ(sbLIZ);
                C704960Rl0 c704960Rl02 = this.LLJJJIL;
                if (c704960Rl02 != null) {
                    c704960Rl02.LJIIJ();
                }
            }
        }
    }
}
