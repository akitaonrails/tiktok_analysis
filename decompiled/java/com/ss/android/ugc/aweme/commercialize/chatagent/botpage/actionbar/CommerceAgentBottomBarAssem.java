package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar;

import X.AbstractC421070GfB;
import X.C019F;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C436690HAl;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.vm.CommerceAgentFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public abstract class CommerceAgentBottomBarAssem<T> extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public FrameLayout LLJJI;
    public C436690HAl LLJJIII;
    public LinearLayout LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public final List<AbstractC421070GfB<T>> LLJJIJIL = new ArrayList();
    public CommerceAgentActiveActionItem LLJJJ;
    public volatile boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceAgentBottomBarAssem.class, "fragmentViewModel", "getFragmentViewModel()Lcom/ss/android/ugc/aweme/commercialize/chatagent/vm/CommerceAgentFragmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommerceAgentBottomBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentFragmentViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 153), AFwS252S0000000_16.get$arr$(109), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ajq;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = (FrameLayout) view.findViewById(R.id.efl);
    }
}
