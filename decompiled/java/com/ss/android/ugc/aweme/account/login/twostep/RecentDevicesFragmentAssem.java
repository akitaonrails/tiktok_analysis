package com.ss.android.ugc.aweme.account.login.twostep;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.account.login.twostep.RecommendDeviceResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RecentDevicesFragmentAssem extends UIListContentAssem<RecentDevicesFragmentViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 89));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 95));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 90));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 93));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 88));
    public final AssemVMLazy LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecentDevicesFragmentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/account/login/twostep/RecentDevicesFragmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RecentDevicesFragmentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecentDevicesFragmentViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 94), AFwS257S0000000_19.get$arr$(46), null, true);
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
    public final RecentDevicesFragmentViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (RecentDevicesFragmentViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C786410Ut5.LJIIJ(Lo());
    }

    public final void So(RecommendDeviceResponse recommendDeviceResponse) {
        boolean zIsEmpty;
        int i;
        RecommendDeviceResponse.Data data;
        List<RecommendDevice> list;
        Lo().hide();
        if (recommendDeviceResponse != null && (data = recommendDeviceResponse.data) != null && (list = data.deviceInfo) != null) {
            zIsEmpty = list.isEmpty();
        } else {
            zIsEmpty = true;
        }
        View view = (View) this.LLJIJIL.getValue();
        int i2 = 0;
        if (!zIsEmpty) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        View view2 = (View) this.LLJILJIL.getValue();
        if (!zIsEmpty) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view2);
        C786410Ut5.LJLLLLLL(8, No());
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().setLayoutManager(new LinearLayoutManager(LJJIJL().getContext()));
        Jo().asyncSubscribe(new C2217381BqS() { // from class: X.0ho7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218240ho6) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS598S0100000_19(this, 56), new AwS563S0100000_19(this, 91), new AwS598S0100000_19(this, 57));
        Jo().asyncSubscribe(new C2217381BqS() { // from class: X.0ho8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218240ho6) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS598S0100000_19(this, 58), new AwS563S0100000_19(this, 92), new AwS598S0100000_19(this, 59));
        Jo().vQ2(false);
    }
}
