package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.C1069960dww;
import X.C1720106oR;
import X.C2187451AjH;
import X.EnumC1070410dxf;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AnimationAuthVM extends AssemViewModel<C1069960dww> {
    public final Map<EnumC1070410dxf, Boolean> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1069960dww(0);
    }

    public final void vQ2() {
        int i = C2187451AjH.LIZ;
        Object obj = ((LinkedHashMap) this.LL).get(EnumC1070410dxf.CONTACT);
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.LJFF(obj, bool)) {
            setState(AFwS252S0000000_16.get$arr$(323));
            return;
        }
        if (Intrinsics.LJFF(((LinkedHashMap) this.LL).get(EnumC1070410dxf.FACEBOOK), bool)) {
            setState(AFwS252S0000000_16.get$arr$(324));
        } else {
            setStateImmediate(AFwS252S0000000_16.get$arr$(5));
            C1720106oR.LJI("[ffp]_Anim", "auth flow end!");
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        for (EnumC1070410dxf enumC1070410dxf : EnumC1070410dxf.values()) {
            this.LL.put(enumC1070410dxf, Boolean.valueOf(enumC1070410dxf.isGrant()));
        }
        runOnWorkThread(new AwS588S0100000_9(this, 3));
    }
}
