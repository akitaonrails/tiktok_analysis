package com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC479160Iqg;
import X.C09YA;
import X.C0IM1;
import X.C0ISY;
import X.C1161920gLG;
import X.C1263104wv;
import X.C1623706Xj;
import X.C20441214yg;
import X.C2188811AlT;
import X.C316650Cb9;
import X.C478590Ipl;
import X.C478750Iq1;
import X.C478920IqI;
import X.C478950IqL;
import X.C479320Iqw;
import X.C479440Ir8;
import X.C479450Ir9;
import X.C479490IrD;
import X.C500260Jjc;
import X.C627660Ojc;
import X.EnumC323450Cm7;
import X.EnumC479370Ir1;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC480510Isr;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveParmasConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS121S1100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS92S1200000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.MGModuleTab;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLivePlayFeedListViewModel extends AssemListViewModel<C479490IrD, AbstractC479160Iqg, C1263104wv> {
    public MGModuleTab LL;
    public AbstractC316870CbV<C1263104wv> LLILLJJLI;
    public Long LLILLL;
    public boolean LLILZ;
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>(Boolean.FALSE);
    public final C09YA LLILZLL = new C09YA(this, AFwS193S0000000_7.get$arr$(137));

    public final void CQ2() {
        C479320Iqw c479320Iqw;
        InterfaceC480510Isr interfaceC480510Isr;
        this.LLILLL = null;
        C0IM1 c0im1Bp1 = bp1();
        if (c0im1Bp1 == null || (interfaceC480510Isr = (c479320Iqw = (C479320Iqw) c0im1Bp1).LIZ) == null) {
            return;
        }
        String playerTag = c479320Iqw.LIZIZ;
        if (playerTag == null && (playerTag = interfaceC480510Isr.getPlayerTag()) == null) {
            return;
        }
        c479320Iqw.LIZ(interfaceC480510Isr, playerTag);
    }

    public static boolean xQ2() {
        C479450Ir9 c479450Ir9;
        if (!TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            return false;
        }
        C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
        return Intrinsics.LJFF((c479440Ir8 == null || (c479450Ir9 = c479440Ir8.LIZIZ) == null) ? null : c479450Ir9.LIZIZ, "requesting");
    }

    public final C0IM1 bp1() {
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null) {
            return iPullStreamService.bp1();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C479490IrD(0);
    }

    public final boolean DQ2(EnumC479370Ir1 enumC479370Ir1) {
        Pair pairLJ;
        Integer numValueOf;
        C479440Ir8 c479440Ir8;
        C479450Ir9 c479450Ir9;
        TiktokLiveTopLiveArchitectureOptSetting tiktokLiveTopLiveArchitectureOptSetting = TiktokLiveTopLiveArchitectureOptSetting.INSTANCE;
        if (tiktokLiveTopLiveArchitectureOptSetting.isArchOpt()) {
            C478590Ipl c478590Ipl = C478590Ipl.LIZ;
            pairLJ = C478590Ipl.LJ();
        } else {
            C478920IqI.LIZ.getClass();
            pairLJ = C478920IqI.LJ("tryPreRenderInstantDisplay");
        }
        List list = (List) pairLJ.getSecond();
        boolean zBooleanValue = ((Boolean) pairLJ.getFirst()).booleanValue();
        if (C500260Jjc.LJJIJIIJI(list) && !zBooleanValue) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayFeedListViewModel Using cached play feed data with ");
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(" items");
            C20441214yg.LIZIZ("MultiTopLivePlayFeedListVM", C2188811AlT.LIZIZ(sbLIZ));
            if (tiktokLiveTopLiveArchitectureOptSetting.isArchOpt() && (c479440Ir8 = C478750Iq1.LIZ) != null && (c479450Ir9 = c479440Ir8.LIZIZ) != null) {
                c479450Ir9.LIZIZ(System.currentTimeMillis(), "tryPreRenderInstantDisplay");
            }
            setState(new AwS92S1200000_7(list, enumC479370Ir1, 1));
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<AbstractC479160Iqg> c627660Ojc) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayFeedListViewModel newState: newListState=");
        List<AbstractC479160Iqg> list = c627660Ojc.LLILZ;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("MultiTopLivePlayFeedListVM", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS586S0100000_7(c627660Ojc, (C627660Ojc<AbstractC479160Iqg>) 232));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0Ir1] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263104wv>> r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final String vQ2(int i) {
        String feedCardEnterMethodV2;
        MultiGuestTopLiveParmasConfigSetting multiGuestTopLiveParmasConfigSetting = MultiGuestTopLiveParmasConfigSetting.INSTANCE;
        String topLivePageEnterFrom = multiGuestTopLiveParmasConfigSetting.getTopLivePageEnterFrom();
        MGModuleTab mGModuleTab = this.LL;
        if (mGModuleTab == null || (feedCardEnterMethodV2 = mGModuleTab.name) == null) {
            feedCardEnterMethodV2 = multiGuestTopLiveParmasConfigSetting.getFeedCardEnterMethodV2();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0ISY c0isy = LiveFeedDraw.Companion;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(topLivePageEnterFrom);
        sbLIZ2.append('_');
        sbLIZ2.append(feedCardEnterMethodV2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c0isy.getClass();
        sbLIZ.append(C0ISY.LIZIZ(strLIZIZ));
        sbLIZ.append("_preload");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1364105Vn r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C479360Ir0
            r4 = r10
            if (r0 == 0) goto L48
            r9 = r11
            X.0Ir0 r9 = (X.C479360Ir0) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r9.LLILLL = r2
        L13:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L4e
            X.C155000ia.LIZIZ(r3)
        L23:
            r0 = 285(0x11d, float:4.0E-43)
            kotlin.jvm.internal.AFwS237S0000000_7 r0 = kotlin.jvm.internal.AFwS237S0000000_7.get$arr$(r0)
            r4.setState(r0)
            return r3
        L2d:
            X.C155000ia.LIZIZ(r3)
            r0 = 284(0x11c, float:3.98E-43)
            kotlin.jvm.internal.AFwS237S0000000_7 r0 = kotlin.jvm.internal.AFwS237S0000000_7.get$arr$(r0)
            r4.setState(r0)
            X.0Ir1 r5 = X.EnumC479370Ir1.LOAD_MORE
            java.lang.String r6 = "load_more"
            r7 = 0
            r9.LLILLL = r1
            r8 = 0
            java.lang.Object r3 = r4.wQ2(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L23
            return r2
        L48:
            X.0Ir0 r9 = new X.0Ir0
            r9.<init>(r4, r11)
            goto L13
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel.yQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(X.C479170Iqh r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel.AQ2(X.0Iqh, java.lang.String):void");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(C1263104wv c1263104wv, InterfaceC1364105Vn<? super AbstractC316870CbV<C1263104wv>> interfaceC1364105Vn) {
        return yQ2(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void BQ2(EnumC479370Ir1 enumC479370Ir1, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayFeedListViewModel refreshPage: scene=");
        sbLIZ.append(enumC479370Ir1);
        sbLIZ.append(", forceRefresh=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiTopLivePlayFeedListVM", C2188811AlT.LIZIZ(sbLIZ));
        C479490IrD c479490IrD = (C479490IrD) getState();
        c479490IrD.getClass();
        if (c479490IrD.getListState().LL instanceof C1623706Xj) {
            C20441214yg.LIZIZ("MultiTopLivePlayFeedListVM", "PlayFeedListViewModel refreshPage: refresh already in progress, skipping");
            return;
        }
        if (!z && !C478950IqL.LIZ()) {
            C20441214yg.LIZIZ("MultiTopLivePlayFeedListVM", "PlayFeedListViewModel Card feed data not expired, skipping refresh");
            return;
        }
        C20441214yg.LIZIZ("MultiTopLivePlayFeedListVM", "PlayFeedListViewModel Card feed data expired or force refresh, performing actual refresh");
        setState(new AwS121S1100000_7(enumC479370Ir1, str, 2));
        withState(new AwS586S0100000_7(this, 233));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<AbstractC479160Iqg> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<? extends AbstractC479160Iqg> list, List<? extends AbstractC479160Iqg> list2) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayFeedListViewModel onLoadPageAddData: type=");
            sbLIZ.append(enumC323450Cm7);
            sbLIZ.append(" originItem=");
            sbLIZ.append(list);
            sbLIZ.append(" newData=");
            sbLIZ.append(list2);
            C20441214yg.LIZIZ("MultiTopLivePlayFeedListVM", C2188811AlT.LIZIZ(sbLIZ));
        }
        List<AbstractC479160Iqg> listOnLoadPageAddData = super.onLoadPageAddData(enumC323450Cm7, list, list2);
        if (enumC323450Cm7 == EnumC323450Cm7.Refresh && list2.isEmpty() && (this.LLILLJJLI instanceof C316650Cb9)) {
            return new ArrayList(list);
        }
        return listOnLoadPageAddData;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.EnumC479370Ir1 r14, java.lang.String r15, X.C479450Ir9 r16, X.InterfaceC1364105Vn<? super java.util.List<X.C479150Iqf>> r17) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel.zQ2(X.0Ir1, java.lang.String, X.0Ir9, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0336 A[Catch: Exception -> 0x0371, TryCatch #4 {Exception -> 0x0371, blocks: (B:67:0x016f, B:69:0x0175, B:78:0x0187, B:79:0x018f, B:81:0x01a6, B:87:0x01b2, B:90:0x01bc, B:92:0x01e3, B:93:0x01ec, B:96:0x01f6, B:98:0x0209, B:99:0x021e, B:121:0x02c0, B:122:0x02c9, B:124:0x02cf, B:126:0x02d3, B:128:0x02d7, B:129:0x02e0, B:131:0x02e4, B:133:0x02e8, B:134:0x02ef, B:136:0x02f5, B:137:0x02f7, B:138:0x0300, B:102:0x0249, B:104:0x0277, B:105:0x0280, B:107:0x0286, B:109:0x028a, B:111:0x028e, B:112:0x0297, B:114:0x029b, B:116:0x029f, B:117:0x02a6, B:119:0x02b5, B:120:0x02b7, B:140:0x0303, B:143:0x0329, B:149:0x0344, B:150:0x034d, B:152:0x0353, B:154:0x0357, B:156:0x035b, B:157:0x0364, B:144:0x0336), top: B:196:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0344 A[Catch: Exception -> 0x0371, TryCatch #4 {Exception -> 0x0371, blocks: (B:67:0x016f, B:69:0x0175, B:78:0x0187, B:79:0x018f, B:81:0x01a6, B:87:0x01b2, B:90:0x01bc, B:92:0x01e3, B:93:0x01ec, B:96:0x01f6, B:98:0x0209, B:99:0x021e, B:121:0x02c0, B:122:0x02c9, B:124:0x02cf, B:126:0x02d3, B:128:0x02d7, B:129:0x02e0, B:131:0x02e4, B:133:0x02e8, B:134:0x02ef, B:136:0x02f5, B:137:0x02f7, B:138:0x0300, B:102:0x0249, B:104:0x0277, B:105:0x0280, B:107:0x0286, B:109:0x028a, B:111:0x028e, B:112:0x0297, B:114:0x029b, B:116:0x029f, B:117:0x02a6, B:119:0x02b5, B:120:0x02b7, B:140:0x0303, B:143:0x0329, B:149:0x0344, B:150:0x034d, B:152:0x0353, B:154:0x0357, B:156:0x035b, B:157:0x0364, B:144:0x0336), top: B:196:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.EnumC479370Ir1 r27, java.lang.String r28, boolean r29, X.C479450Ir9 r30, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263104wv>> r31) {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel.wQ2(X.0Ir1, java.lang.String, boolean, X.0Ir9, X.05Vn):java.lang.Object");
    }
}
