package com.ss.android.ugc.aweme.poi.osp.component;

import X.C1193680hAU;
import X.C13LE;
import X.C166V;
import X.C2217381BqS;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitLoadingAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C166V LLJJI = new C166V(new AwS597S0100000_18((UISlotAssem) this, 427));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSubmitLoadingAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitSlashStatusViewBinding;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e5t;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        ((C1193680hAU) c166v.LIZ(this)).LLILLJJLI.LJ();
    }
}
