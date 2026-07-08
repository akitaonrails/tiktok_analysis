package com.ss.android.ugc.aweme.creativedetail.assem;

import X.C019F;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C627700Ojg;
import X.C627830Ojt;
import X.C627890Ojz;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creativedetail.viewmodel.CreativeToolDetailViewModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class CreativeToolNotAvailableFullPageAssem extends DetailPageStatusViewAssem {
    public static final C627700Ojg LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJJ;
    public final C1559260qg8 LLJJJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Ojg] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreativeToolNotAvailableFullPageAssem.class, "templateDetailVM", "getTemplateDetailVM()Lcom/ss/android/ugc/aweme/creativedetail/viewmodel/CreativeToolDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJ = new Object() { // from class: X.0Ojg
        };
    }

    public CreativeToolNotAvailableFullPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CreativeToolDetailViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 91), AFwS240S0000000_9.get$arr$(68), null, true);
        this.LLJJJIL = new C1559260qg8(new C723590SZx(this, C627830Ojt.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public final void t0() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Ojr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C627720Oji) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 77), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        C627830Ojt c627830Ojt = (C627830Ojt) this.LLJJJIL.getValue();
        if (c627830Ojt != null) {
            Map<String, Object> map = getConfig().LLILZ;
            int i = C627890Ojz.LIZ[c627830Ojt.getBusinessType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    str = "DETAIL_CREATIVE_TOOL_AI_MAGIC";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "DETAIL_CREATIVE_TOOL_DUET";
            }
            map.put(Scene.SCENE_SERVICE, str);
        }
        super.onViewCreated(view);
    }
}
