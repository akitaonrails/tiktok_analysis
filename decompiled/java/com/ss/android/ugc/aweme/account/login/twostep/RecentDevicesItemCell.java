package com.ss.android.ugc.aweme.account.login.twostep;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1157130gDX;
import X.C13LE;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2215101Bmm;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RecentDevicesItemCell extends PowerCell<C1157130gDX> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public RecommendDevice LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecentDevicesItemCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/account/login/twostep/RecentDevicesFragmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RecentDevicesItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecentDevicesFragmentViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 126);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(47);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 109), awS563S0100000_19, AFwS207S0000000_19.get$arr$(23), new AwS563S0100000_19((C03K6) this, 111), new AwS563S0100000_19((C03K6) this, 113), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 115), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 117), null, new AwS563S0100000_19((C03K6) this, 118));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 112);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 114);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 116);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 17));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 119);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 121);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 122);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 123);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 124);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 125), awS563S0100000_19, AFwS207S0000000_19.get$arr$(24), new AwS563S0100000_19((C03K6) this, 127), new AwS563S0100000_19((C03K6) this, 128), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 129), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 130), null, new AwS563S0100000_19((C03K6) this, 131));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 99), awS563S0100000_19, AFwS207S0000000_19.get$arr$(22), new AwS563S0100000_19((C03K6) this, 102), new AwS563S0100000_19((C03K6) this, 104), new AwS563S0100000_19((C03K6) this, 107), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 108));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 120));
        this.LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 100));
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 106));
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 103));
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 101));
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 105));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        assemVMLazy.getValue().asyncSubscribe(new C2217381BqS() { // from class: X.0ho1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218240ho6) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS598S0100000_19(this, 61), new AwS563S0100000_19(this, 110), new AwS598S0100000_19(this, 62));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Context context;
        String string;
        long jLongValue;
        RecommendDevice recommendDevice = ((C1157130gDX) interfaceC1891350zJl).LL;
        this.LLIZLLLIL = recommendDevice;
        if (recommendDevice != null) {
            String str = recommendDevice.os;
            if (str == null) {
                str = "";
            }
            String str2 = recommendDevice.location;
            int i = 0;
            if ((str2 != null && str2.length() != 0) || (context = getContext()) == null || (string = context.getString(2131857403)) == null) {
                string = recommendDevice.location;
            }
            ((TextView) this.LLILLJJLI.getValue()).setText(recommendDevice.deviceName);
            ((TextView) this.LLILZIL.getValue()).setText(str);
            ((TextView) this.LLILZLL.getValue()).setText(string);
            Long l = recommendDevice.lastUseTimestamp;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            ((TextView) this.LLIZ.getValue()).setText(C2215101Bmm.LIZ(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), "MMM D, YYYY h:mm A"));
            View view = (View) this.LLILZ.getValue();
            if (!Intrinsics.LJFF(recommendDevice.isLocalDevice(), Boolean.TRUE)) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
            C786410Ut5.U8((C197039127h) this.LLILLL.getValue(), new ACListenerS154S0100000_19(this, 302));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.zt, viewGroup, false);
    }
}
