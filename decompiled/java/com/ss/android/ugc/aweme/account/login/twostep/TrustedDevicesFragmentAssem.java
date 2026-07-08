package com.ss.android.ugc.aweme.account.login.twostep;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TrustedDevicesFragmentAssem extends UIListContentAssem<TrustedDevicesFragmentViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 136));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 141));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 137));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 134));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 142));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 135));
    public final AssemVMLazy LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TrustedDevicesFragmentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/account/login/twostep/TrustedDevicesFragmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TrustedDevicesFragmentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrustedDevicesFragmentViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 140), AFwS257S0000000_19.get$arr$(48), null, true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        return new C20603715jn();
    }

    public final DialogC1389620mGW Lo() {
        return (DialogC1389620mGW) this.LLJI.getValue();
    }

    public final C1749280vcc No() {
        return (C1749280vcc) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final TrustedDevicesFragmentViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (TrustedDevicesFragmentViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C786410Ut5.LJIIJ(Lo());
    }

    public final void So(AuthDeviceResponse authDeviceResponse) {
        boolean zIsEmpty;
        int i;
        int i2;
        String string;
        int i3;
        int i4;
        AuthDeviceResponse.Data data;
        List<Device> list;
        Lo().hide();
        if (authDeviceResponse != null && (data = authDeviceResponse.data) != null && (list = data.auth_device) != null) {
            zIsEmpty = list.isEmpty();
        } else {
            zIsEmpty = true;
        }
        View view = (View) this.LLJILJIL.getValue();
        if (!zIsEmpty) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        View view2 = (View) this.LLJILJILJ.getValue();
        if (zIsEmpty) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view2);
        C786410Ut5.LJLLLLLL(0, (View) this.LLJIJIL.getValue());
        C786410Ut5.LJLLLLLL(8, No());
        C197039127h c197039127h = (C197039127h) this.LLJIJIL.getValue();
        Context context = c197039127h.getContext();
        if (context == null || (string = context.getString(2131857391)) == null) {
            string = "";
        }
        c197039127h.setText(string);
        if (zIsEmpty) {
            i3 = 67;
            i4 = 200;
        } else {
            i3 = 32;
            i4 = 50;
        }
        C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(i3), 0, Integer.valueOf(i3), Integer.valueOf(i4), false, 16);
        C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19(this, 38));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().setLayoutManager(new LinearLayoutManager(LJJIJL().getContext()));
        Jo().asyncSubscribe(new C2217381BqS() { // from class: X.0ho4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218230ho5) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS598S0100000_19(this, 64), new AwS563S0100000_19(this, 138), new AwS598S0100000_19(this, 65));
        Jo().asyncSubscribe(new C2217381BqS() { // from class: X.0ho3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218230ho5) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS598S0100000_19(this, 66), new AwS563S0100000_19(this, 139), new AwS598S0100000_19(this, 67));
        Jo().wQ2(true);
    }
}
