package com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable;

import X.C019F;
import X.C01GW;
import X.C0I73;
import X.C0ZN0;
import X.C0ZN6;
import X.C0ZNK;
import X.C0ZNV;
import X.C127G;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1677606ha;
import X.C1693106k5;
import X.C1697806kq;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C461530I7z;
import X.C511701z1;
import X.C723590SZx;
import X.C724750Sbp;
import X.C814420VxA;
import X.C869590Y9l;
import X.C897700ZJo;
import X.C898900ZOe;
import X.C985403tE;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.AObjectS67S0000000_14;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaSafetyBridgeApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class UnavailableCardCardAssem extends ReusedUISlotAssem<UnavailableCardCardAssem> implements InterfaceC712990Rxx<C0ZNK> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UnavailableCardCardAssem.class, "availabilityViewModel", "getAvailabilityViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/IAwemeStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public UnavailableCardCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IAwemeStatusViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 927), AFwS248S0000000_14.get$arr$(263), null, true);
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 928));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 926));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cmc;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C457780HxI sp() {
        return (C457780HxI) this.LLJL.getValue();
    }

    public final Context tp() {
        return (Context) this.LLJLILLLLZIIL.getValue();
    }

    public final TuxTextView zp() {
        return (TuxTextView) this.LLJLIL.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IAwemeStatusViewModel.class, new AObjectS67S0000000_14(this, 9)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0ZNK r18) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.UnavailableCardCardAssem.up(X.0ZNK):void");
    }

    public final void Bp(C869590Y9l c869590Y9l) {
        int i;
        CharSequence string;
        SessionInfo sessionInfo = sp().LL;
        if (C1693106k5.LIZJ()) {
            i = 2131846702;
        } else {
            i = 2131831722;
        }
        if (C1693106k5.LIZJ()) {
            String string2 = tp().getString(2131846703);
            string = yp(62, tp().getString(2131846699, string2), string2, new AwS593S0100000_14(this, 107));
        } else {
            string = tp().getString(2131831721);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(tp());
        c1397580mTM.LJFF(i);
        c1397580mTM.LIZIZ(string);
        C985403tE.LIZ(c1397580mTM, new AwS223S0300000_14(c869590Y9l, this, sessionInfo, 6));
        new C1397510mTF(c1397580mTM).LIZLLL();
        IMMediaSafetyBridgeApi.LIZ.getClass();
        IMMediaSafetyBridgeApi iMMediaSafetyBridgeApiLIZ = C0ZN6.LIZ();
        if (iMMediaSafetyBridgeApiLIZ != null) {
            String strLIZ = C1677606ha.LIZ(sessionInfo.getChatType());
            c869590Y9l.getMsgType();
            iMMediaSafetyBridgeApiLIZ.LIZIZ("chat", strLIZ);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1697806kq.LIZ(zp());
        zp().setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        zp().setMinimumHeight((int) ((C0I73.LIZ * 2) + C418440Gaw.LIZIZ(2)));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZNK c0znk) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZNK c0znk) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZNV c0znv;
        C0ZNK c0znk = (C0ZNK) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C0ZNV) && (c0znv = (C0ZNV) obj2) != null && c0znv.LIZ) {
                    up(c0znk);
                }
            }
            return;
        }
        up(c0znk);
    }

    public final SpannableString op(int i, String str, C0ZN0 c0zn0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Context contextTp = tp();
        String string = tp().getString(i, strLIZIZ);
        String authorId = c0zn0.getAuthorId();
        if (authorId == null) {
            authorId = "";
        }
        return C897700ZJo.LIZ(contextTp, string, strLIZIZ, authorId, new AwS415S0200000_14(this, c0zn0, 45));
    }

    public final CharSequence up(int i, int i2, Function1<? super View, Unit> function1) {
        String string = tp().getString(i2);
        return yp(62, tp().getString(i, string), string, function1);
    }

    public static CharSequence yp(int i, String str, String str2, Function1 function1) {
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        if (iLJJJ == -1) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.substring(0, iLJJJ));
        sbLIZ.append(str2);
        sbLIZ.append(str.substring(str2.length() + iLJJJ));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C1697806kq.LIZIZ(spannableStringBuilder, new C511701z1(function1, 2), iLJJJ, iLJJJ + str2.length(), i, R.attr.a1n);
        SpannableString.valueOf(spannableStringBuilder);
        return spannableStringBuilder;
    }
}
