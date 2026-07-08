package com.ss.android.ugc.aweme.account.login.twostep;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1218200ho2;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TrustedDevicesItemCell extends PowerCell<C1218200ho2> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public Device LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TrustedDevicesItemCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/account/login/twostep/TrustedDevicesFragmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TrustedDevicesItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrustedDevicesFragmentViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 162);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(49);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 173), awS563S0100000_19, AFwS207S0000000_19.get$arr$(25), new AwS563S0100000_19((C03K6) this, 146), new AwS563S0100000_19((C03K6) this, 148), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 150), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 152), null, new AwS563S0100000_19((C03K6) this, 153));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 147);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 149);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 151);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 18));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 154);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 156);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 158);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 159);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 160);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 161), awS563S0100000_19, AFwS207S0000000_19.get$arr$(26), new AwS563S0100000_19((C03K6) this, 163), new AwS563S0100000_19((C03K6) this, 164), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 165), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 166), null, new AwS563S0100000_19((C03K6) this, 167));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 168), awS563S0100000_19, AFwS207S0000000_19.get$arr$(27), new AwS563S0100000_19((C03K6) this, 169), new AwS563S0100000_19((C03K6) this, 170), new AwS563S0100000_19((C03K6) this, 171), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 172));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 155));
        this.LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 145));
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 157));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1218200ho2 c1218200ho2 = (C1218200ho2) interfaceC1891350zJl;
        this.LLILZIL = c1218200ho2.LL;
        ((TextView) this.LLILLJJLI.getValue()).setText(c1218200ho2.LL.device_name);
        View view = (View) this.LLILLL.getValue();
        if (Intrinsics.LJFF(String.valueOf(c1218200ho2.LL.device_id), DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        C786410Ut5.a9((TuxIconView) this.LLILZ.getValue(), new ACListenerS154S0100000_19(this, 310));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a02, viewGroup, false);
    }
}
