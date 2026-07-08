package com.ss.android.ugc.aweme.publish.detail;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1775760wJK;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnLongClickListenerC1775840wJS;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectPublishPkgSizeMonitorAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1118));
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectPublishPkgSizeMonitorAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publish/EffectMobilePublishVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectPublishPkgSizeMonitorAssem() {
        new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectMobilePublishVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS570S0100000_26(c19719912DlLIZ, 1121), AFwS268S0000000_26.get$arr$(463), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1119));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1120));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(253));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.rm;
    }

    public final int hp() {
        return ((Number) this.LLJJIJIL.getValue()).intValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        Context context;
        super.onViewCreated(view);
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(12);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.nz);
        view.setBackground(c384050F3z.LIZ((Context) this.LLJJI.getValue()));
        C197039127h c197039127h = (C197039127h) this.LLJJIJI.getValue();
        if (c197039127h != null) {
            c197039127h.LJJJJL(new AwS585S0100000_6(this, 146));
        }
        View view2 = (View) this.LLJJIJI.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new C1775760wJK(this, 0), view2);
        }
        View view3 = (View) this.LLJJIJI.getValue();
        if (view3 != null) {
            view3.setOnLongClickListener(new ViewOnLongClickListenerC1775840wJS(this, 0));
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0vHP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
            }
        }, getContentView());
        int iHp = (hp() / 1024) / 1024;
        TextView textView = (TextView) this.LLJJIJIIJIL.getValue();
        if (textView != null) {
            View view4 = (View) this.LLJJIJIIJIL.getValue();
            if (view4 != null && (context = view4.getContext()) != null) {
                string = context.getString(2131821238, String.valueOf(iHp));
            } else {
                string = null;
            }
            textView.setText(string);
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0vHL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1736830vIX) obj).LLJJIII);
            }
        }, null, new AwS617S0100000_3(this, 17), 6);
    }
}
