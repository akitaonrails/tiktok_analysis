package com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation;

import X.C019F;
import X.C01GW;
import X.C1158280gFO;
import X.C1198060hHY;
import X.C1198070hHZ;
import X.C1198080hHa;
import X.C1198160hHi;
import X.C1198270hHt;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C622680Oba;
import X.C723590SZx;
import X.C724750Sbp;
import X.EnumC1991007r2;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AddLocationVideoAssem extends UIListContentAssem<AddLocationVideoViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public SmartImageView LLJ;
    public SmartImageView LLJI;
    public TuxTextView LLJIJIL;
    public View LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddLocationVideoAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/content/poicampaign/addlocation/AddLocationVideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddLocationVideoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddLocationVideoViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 735), AFwS256S0000000_18.get$arr$(307), null, true);
        checkSupervisorPrepared();
        new C723590SZx(this, C1198160hHi.class, "MyMomentsAddLocationStatusHierarchyData");
        this.LLJILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 958));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZ = 4;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final AddLocationVideoViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (AddLocationVideoViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onPoiRetagAccomplished(C1198060hHY c1198060hHY) {
        C1198070hHZ c1198070hHZ;
        Activity activityLIZ;
        Activity activityLIZ2;
        EnumC1991007r2 enumC1991007r2 = c1198060hHY.LIZ;
        EnumC1991007r2 enumC1991007r22 = EnumC1991007r2.ADD_POI_ACCOMPLISHED_EVENT;
        if (enumC1991007r2 != enumC1991007r22 && enumC1991007r2 != EnumC1991007r2.ADD_POI_FAILED_EVENT) {
            return;
        }
        try {
            Object obj = c1198060hHY.LIZIZ;
            if ((obj instanceof C1198070hHZ) && (c1198070hHZ = (C1198070hHZ) obj) != null) {
                String str = c1198070hHZ.LIZ;
                String str2 = c1198070hHZ.LIZIZ;
                String str3 = c1198070hHZ.LIZJ;
                int i = 0;
                if (enumC1991007r2 == enumC1991007r22 && (str.length() == 0 || str2.length() == 0 || str3.length() == 0)) {
                    return;
                }
                int i2 = -1;
                for (InterfaceC1891350zJl interfaceC1891350zJl : Go().getListItems()) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                        if (Intrinsics.LJFF(((C1158280gFO) interfaceC1891350zJl2).LLILLL.getAid(), str3)) {
                            i2 = i;
                        }
                        i = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                if (i2 == -1) {
                    return;
                }
                C1158280gFO c1158280gFO = (C1158280gFO) Go().getState().LJI(i2);
                if (c1198060hHY.LIZ == EnumC1991007r2.ADD_POI_FAILED_EVENT) {
                    Go().getState().LJIILJJIL(i2, new C1158280gFO(c1158280gFO.LLILLL, c1158280gFO.LL, true));
                    Context context = getContext();
                    if (context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ2);
                        c1389890mGx.LJIIIZ(2131823044);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                Go().getState().LJIILJJIL(i2, new C1158280gFO(c1158280gFO.LLILLL, true, c1158280gFO.LLILLJJLI));
                AddLocationVideoViewModel addLocationVideoViewModelJo = Jo();
                String str4 = ((C1198080hHa) Jo().getState()).LLILLL;
                if (str4 == null) {
                    str4 = "";
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(addLocationVideoViewModelJo), null, null, new C1198270hHt(str4, str3, str, addLocationVideoViewModelJo, null), 3);
                Context context2 = getContext();
                if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                    c1389890mGx2.LJIIIZ(2131823057);
                    c1389890mGx2.LJIIJJI();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020b  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoAssem.onViewCreated(android.view.View):void");
    }
}
