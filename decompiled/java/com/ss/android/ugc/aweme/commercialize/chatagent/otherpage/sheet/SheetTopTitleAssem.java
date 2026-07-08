package com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet;

import X.C019F;
import X.C0DJ1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SheetTopTitleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public TuxIconView LLJJI;
    public TuxIconView LLJJIII;
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SheetTopTitleAssem.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/otherpage/sheet/CommerceAgentSheetVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SheetTopTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentSheetVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 130), AFwS256S0000000_18.get$arr$(43), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ajw;
    }

    public final CommerceAgentSheetVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (CommerceAgentSheetVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        Resources resources;
        super.onViewCreated(view);
        TextView textView = (TextView) view.findViewById(R.id.efv);
        if (textView != null) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(2131820782);
            } else {
                string = null;
            }
            textView.setText(string);
        }
        this.LLJJI = (TuxIconView) view.findViewById(R.id.efx);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.efy);
        view.findViewById(R.id.dat);
        TuxIconView tuxIconView = this.LLJJI;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS153S0100000_18(this, 6));
        }
        TuxIconView tuxIconView2 = this.LLJJIII;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS153S0100000_18(this, 7));
        }
        TuxIconView tuxIconView3 = this.LLJJI;
        if (tuxIconView3 != null) {
            C0DJ1.LIZJ(tuxIconView3);
        }
        TuxIconView tuxIconView4 = this.LLJJIII;
        if (tuxIconView4 != null) {
            C0DJ1.LIZJ(tuxIconView4);
        }
        AssemViewModel.selectSubscribe$default(hp(), new C2217381BqS() { // from class: X.0gLT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159030gGb) obj).LL;
            }
        }, null, null, null, new AwS597S0100000_18(new AwS562S0100000_18(this, 129), 733), 14, null);
    }
}
