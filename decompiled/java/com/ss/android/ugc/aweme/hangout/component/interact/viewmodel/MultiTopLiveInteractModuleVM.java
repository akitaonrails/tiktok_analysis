package com.ss.android.ugc.aweme.hangout.component.interact.viewmodel;

import X.AnonymousClass0956;
import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0IVB;
import X.C0PEM;
import X.C13BV;
import X.C15438062q;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23250099c;
import X.C452501pT;
import X.C477500Io0;
import X.C478330IpL;
import X.C478400IpS;
import X.C478410IpT;
import X.C478590Ipl;
import X.C478840IqA;
import X.C478850IqB;
import X.C479670IrV;
import X.EnumC471750Iej;
import X.EnumC479370Ir1;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC476860Imy;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.InteractionModule;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestHangoutPageData;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestHangoutPageDataSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TabModule;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.MGModuleTab;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLiveInteractModuleVM extends AssemViewModel<C478850IqB> {
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>(Boolean.FALSE);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(128));
    public AnonymousClass0956 LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        Pair pair;
        if (!TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            C13BV c13bv = C13BV.INSTANCE;
            return new C478850IqB(c13bv, c13bv, EnumC479370Ir1.DEFAULT, "defaultState");
        }
        C478590Ipl c478590Ipl = C478590Ipl.LIZ;
        TabMGTopLive tabMGTopLive = C478590Ipl.LJIIIZ;
        if (tabMGTopLive != null) {
            pair = new Pair(tabMGTopLive.interactionModule, tabMGTopLive.tabModule);
        } else {
            MultiGuestHangoutPageData settingValue = MultiGuestHangoutPageDataSetting.INSTANCE.getSettingValue();
            List<InteractionModule> list = settingValue.interactionModuleArray;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (InteractionModule interactionModule : list) {
                MGModuleInteraction mGModuleInteraction = new MGModuleInteraction();
                mGModuleInteraction.type = interactionModule.type;
                C477500Io0 c477500Io0 = C477500Io0.LIZ;
                String str = interactionModule.title;
                c477500Io0.getClass();
                String strLJIIL = C477500Io0.LJIIL(str);
                String str2 = "";
                if (strLJIIL == null) {
                    strLJIIL = "";
                }
                mGModuleInteraction.title = strLJIIL;
                String strLJIIL2 = C477500Io0.LJIIL(interactionModule.btnTitle);
                if (strLJIIL2 != null) {
                    str2 = strLJIIL2;
                }
                mGModuleInteraction.btnTitle = str2;
                mGModuleInteraction.backgroundColor = interactionModule.backgroundColor;
                mGModuleInteraction.innerFeedMgAggId = interactionModule.innerFeedMgAggId;
                mGModuleInteraction.name = interactionModule.enterMethod;
                arrayList.add(mGModuleInteraction);
            }
            List<TabModule> list2 = settingValue.tabModuleArray;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (TabModule tabModule : list2) {
                MGModuleTab mGModuleTab = new MGModuleTab();
                mGModuleTab.name = tabModule.name;
                C477500Io0 c477500Io02 = C477500Io0.LIZ;
                String str3 = tabModule.title;
                c477500Io02.getClass();
                C477500Io0.LJIIL(str3);
                mGModuleTab.title = tabModule.title;
                mGModuleTab.innerFeedMgAggId = tabModule.innerFeedMgAggId;
                arrayList2.add(mGModuleTab);
            }
            pair = new Pair(arrayList, arrayList2);
        }
        return new C478850IqB((List) pair.getFirst(), (List) pair.getSecond(), EnumC479370Ir1.INIT, "defaultState(setting)");
    }

    public final void xQ2(String str, String str2) {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL = C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C478400IpS(str2, this, str, null), 2);
    }

    public static Object yQ2(final MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVM, final EnumC479370Ir1 enumC479370Ir1, final String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        long jCurrentTimeMillis;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveTopModuleVM preloadInteractModuleData: scene=");
        sbLIZ.append(enumC479370Ir1);
        C20441214yg.LIZIZ("MultiTopLiveTopModuleVM", C2188811AlT.LIZIZ(sbLIZ));
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (EnumC479370Ir1.INIT == enumC479370Ir1) {
            jCurrentTimeMillis = System.currentTimeMillis();
            C479670IrV.LIZ.getClass();
        } else {
            jCurrentTimeMillis = 0;
        }
        final C478410IpT c478410IpT = new C478410IpT(enumC479370Ir1, multiTopLiveInteractModuleVM, jCurrentTimeMillis, null, c2252611DEt);
        final C478330IpL c478330IpL = new C478330IpL(enumC479370Ir1, jCurrentTimeMillis, null, c2252611DEt);
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        InterfaceC476860Imy interfaceC476860Imy = (InterfaceC476860Imy) multiTopLiveInteractModuleVM.LLILLJJLI.getValue();
        if (interfaceC476860Imy != null) {
            interfaceC476860Imy.LJIILIIL(new C0IVB() { // from class: X.0IpO
                @Override // X.C0IVB
                public final void LIZ(BaseListResponse baseListResponse) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MultiTopLiveTopModuleVM request skylight data succeed. scene: ");
                    sbLIZ2.append(enumC479370Ir1);
                    C20441214yg.LIZIZ("MultiTopLiveTopModuleVM", C2188811AlT.LIZIZ(sbLIZ2));
                    C23250099c.LIZLLL(multiTopLiveInteractModuleVM.getAssemVMScope(), C0PEM.LIZJ, null, new C478340IpM(baseListResponse, str, jCurrentTimeMillis2, c478330IpL, enumC479370Ir1, c478410IpT, null), 2);
                }

                @Override // X.C0IVB
                public final void onFailed(Throwable th) {
                    C477500Io0.LIZ.getClass();
                    C477680IoI c477680IoILJIJ = C477500Io0.LJIJ(th);
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    String str2 = c477680IoILJIJ.LIZJ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = c477680IoILJIJ.LIZIZ;
                    C477860Ioa.LJIIL(new C477910Iof(str, "MultiTopLiveInteractModuleVM # requestTopModuleInternal, onFailed", jCurrentTimeMillis3, "error", str2, String.valueOf(c477680IoILJIJ.LIZ), str3));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MultiTopLiveTopModuleVM scene: ");
                    sbLIZ2.append(enumC479370Ir1);
                    sbLIZ2.append(", request top_module data failed:");
                    C20441214yg.LJFF("MultiTopLiveTopModuleVM", C2188811AlT.LIZIZ(sbLIZ2), th);
                }
            }, EnumC471750Iej.MULTI_TOPLIVE_MANUAL_REFRESH);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void vQ2(EnumC479370Ir1 enumC479370Ir1, String str, List list, List list2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveTopModuleVM refreshPage: scene=");
        sbLIZ.append(enumC479370Ir1);
        C20441214yg.LIZIZ("MultiTopLiveTopModuleVM", C2188811AlT.LIZIZ(sbLIZ));
        setState(new C478840IqA(enumC479370Ir1, str, list, list2, z));
    }

    public static void wQ2(MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVM, List list, List list2, EnumC479370Ir1 enumC479370Ir1, String str, int i) {
        List list3 = list2;
        if ((i & 2) != 0) {
            list3 = C13BV.INSTANCE;
        }
        multiTopLiveInteractModuleVM.vQ2(enumC479370Ir1, str, list, list3, false);
    }
}
