package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel;

import X.AbstractC1812500xGa;
import X.AbstractC1812820xH6;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C0KPJ;
import X.C0QSJ;
import X.C0TJY;
import X.C0TNA;
import X.C0TNB;
import X.C0TNC;
import X.C0TND;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C127G;
import X.C13LE;
import X.C1622206Wu;
import X.C16FZ;
import X.C1770850wBP;
import X.C1812670xGr;
import X.C1814370xJb;
import X.C1814720xKA;
import X.C1814730xKB;
import X.C1815740xLo;
import X.C1815750xLp;
import X.C1815760xLq;
import X.C1815770xLr;
import X.C1815780xLs;
import X.C1815790xLt;
import X.C1815800xLu;
import X.C1815810xLv;
import X.C1815820xLw;
import X.C1815890xM3;
import X.C1815900xM4;
import X.C1815920xM6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C500980Jkm;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C758490Tp9;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1813000xHO;
import X.InterfaceC1813270xHp;
import X.InterfaceC1815150xKr;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.ExitBoardManagement;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.vm.IntelligentBoardTemplatePreviewViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsFunctionsViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.util.BoardsPageDialogActionChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveBoardsPageDialogFragment extends LiveDialogFragment implements InterfaceC724530SbT, InterfaceC1813000xHO, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C0TND LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE0OiHELIOSo7PSd9LCAvJj0yPCwjJ2ExJyQ+LTwjKSspJWEfITMpCyAyOiE/GS40LQElKCM8LwM+KCg+LSs4";
    public View LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public C1814370xJb LLILZIL;
    public boolean LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C1814730xKB LLJI;
    public C127G LLJIJIL;
    public InterfaceC1815150xKr LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveBoardsPageDialogFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(LiveBoardsPageDialogFragment.class, "intelligentBoardTemplatePreviewViewModel", "getIntelligentBoardTemplatePreviewViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/intelligent/vm/IntelligentBoardTemplatePreviewViewModel;", 0), new C2217381BqS(LiveBoardsPageDialogFragment.class, "functionVM", "getFunctionVM()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsFunctionsViewModel;", 0)};
        LLJILJILJ = new C0TND();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BoardPageScope.class}).unbindAbility(MR(), InterfaceC1815150xKr.class);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1815150xKr.class) {
            this.LLJILJIL = (InterfaceC1815150xKr) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BoardPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1815150xKr.class) {
            return this.LLJILJIL;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BoardPageScope.class}).bindAbility(MR(), InterfaceC1815150xKr.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1815150xKr.class) {
            this.LLJILJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public LiveBoardsPageDialogFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        boolean z3;
        AssemVMLazy assemVMLazy3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardsPageViewModel.class);
        C0TNB c0tnb = new C0TNB(c19719912DlLIZ);
        C1815890xM3 c1815890xM3 = new C1815890xM3();
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0tnb, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1815780xLs(this), c1815890xM3, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0tnb, new C1815790xLt(this), c1815890xM3, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0tnb, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1815800xLu(this), c1815890xM3, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IntelligentBoardTemplatePreviewViewModel.class);
        C0TNC c0tnc = new C0TNC(c19719912DlLIZ2);
        C1815900xM4 c1815900xM4 = new C1815900xM4();
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0tnc, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new C1815810xLv(this), c1815900xM4, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
            z3 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0tnc, new C1815820xLw(this), c1815900xM4, null, null, null);
            z2 = true;
            z3 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            z3 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0tnc, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1815740xLo(this), c1815900xM4, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LiveBoardsFunctionsViewModel.class);
        C0TNA c0tna = new C0TNA(c19719912DlLIZ3);
        C1815920xM6 c1815920xM6 = new C1815920xM6();
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0tna, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new C1815750xLp(this), c1815920xM6, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0tna, new C1815760xLq(this), c1815920xM6, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0tna, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1815770xLr(this), c1815920xM6, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
        }
        this.LLJ = assemVMLazy3;
        this.LLJI = new C1814730xKB(this);
    }

    public final IntelligentBoardTemplatePreviewViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (IntelligentBoardTemplatePreviewViewModel) assemVMLazy.getValue();
    }

    public final LiveBoardsPageViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (LiveBoardsPageViewModel) assemVMLazy.getValue();
    }

    public final void OR() {
        C16FZ c16fz;
        View view = this.LL;
        if (view == null || (c16fz = (C16FZ) view.findViewById(R.id.c7i)) == null) {
            return;
        }
        C786410Ut5.LLLIZZ(c16fz, 8);
    }

    public final boolean RR() {
        if (TextUtils.equals(this.LLILLJJLI, "live_detail")) {
            return false;
        }
        String str = this.LLILZ;
        return str == null || str.length() == 0 || TextUtils.equals(this.LLILZ, CardStruct.IStatusCode.DEFAULT);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g4u);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = (RR() && MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) ? 73 : 60;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{LiveBoardsPageViewModel.class, new Function0() { // from class: X.0xLm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            LiveBoardsPageDialogFragment liveBoardsPageDialogFragment = this.LL;
                            String str = LiveBoardsPageDialogFragment._pnsPageId;
                            return new LiveBoardsPageViewModel(liveBoardsPageDialogFragment.MR());
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DataChannel dataChannel;
        Handler handler;
        C0KPJ.nf.LJFF(Long.valueOf(MR().LLIZ));
        super.onDestroyView();
        View view = this.LL;
        if (view != null && (handler = view.getHandler()) != null) {
            handler.removeCallbacks(new C0TJY(this.LLJI));
        }
        C1814370xJb c1814370xJb = this.LLILZIL;
        if (c1814370xJb != null && c1814370xJb.LIZ.status != 2 && (dataChannel = this.dataChannel) != null) {
            dataChannel.LC0(ExitBoardManagement.class, Long.valueOf(c1814370xJb.LIZ.id));
        }
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC1813000xHO
    public final String getEntrance() {
        return this.LLILLJJLI;
    }

    public final void PR(boolean z) {
        if (z && !this.LLILZLL) {
            final String str = this.LLILZ;
            final Context context = getContext();
            final DataChannel dataChannel = this.dataChannel;
            final C1814720xKA c1814720xKA = new C1814720xKA(this);
            new InterfaceC1813270xHp<C1812670xGr, AbstractC1812500xGa, AbstractC1812820xH6, AiSummaryViewModel>(str, this, context, dataChannel, this, c1814720xKA) { // from class: X.0xHB
                public final InterfaceC1813000xHO LL;
                public final Context LLILLJJLI;
                public final DataChannel LLILLL;
                public final LifecycleOwner LLILZ;
                public final Function1<AbstractC1812590xGj, Unit> LLILZIL;

                @Override // X.InterfaceC1813270xHp
                public final void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
                    C1812670xGr c1812670xGr = (C1812670xGr) interfaceC775640Ubi;
                    if (c1812670xGr.LIZIZ == EnumC1812620xGm.SUCCESS) {
                        this.LLILZIL.invoke(c1812670xGr.LIZ);
                    }
                }

                @Override // X.InterfaceC1813270xHp
                public final void gn(InterfaceC1180504jb interfaceC1180504jb) {
                    Context context2;
                    AbstractC1812820xH6 abstractC1812820xH6 = (AbstractC1812820xH6) interfaceC1180504jb;
                    DataChannel dataChannel2 = this.LLILLL;
                    if (dataChannel2 != null && (context2 = this.LLILLJJLI) != null) {
                        C1812880xHC.LIZJ(abstractC1812820xH6, this.LL, context2, dataChannel2);
                    }
                }

                {
                    String str2 = str;
                    this.LL = this;
                    this.LLILLJJLI = context;
                    this.LLILLL = dataChannel;
                    this.LLILZ = this;
                    this.LLILZIL = c1814720xKA;
                    EnumC768840UDy enumC768840UDyLIZ = C497700JfU.LIZ.LIZ();
                    C1813280xHq.LIZ(this, (MviViewModel) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createViewModel(AiSummaryViewModel.class), this);
                    int i = C768850UDz.LIZ[enumC768840UDyLIZ.ordinal()];
                    int i2 = 1;
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            i2 = 0;
                        }
                    }
                    MviViewModel mviViewModel = (MviViewModel) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createViewModel(AiSummaryViewModel.class);
                    str2 = str2 == null ? CardStruct.IStatusCode.DEFAULT : str2;
                    String entrance = this.getEntrance();
                    mviViewModel.vQ2(new C1812520xGc(enumC768840UDyLIZ, i2, str2, entrance == null ? "" : entrance, 1));
                }
            };
            this.LLILZLL = true;
        }
    }

    @Override // X.InterfaceC1813000xHO
    public final void close(int i) {
        dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(BoardsPageDialogActionChannel.class, C758490Tp9.LIZ);
        }
        super.onCancel(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C687700QyG.LJI(this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0341  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
