package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.AbstractC1906720ziY;
import X.AnonymousClass0317;
import X.C00X6;
import X.C019F;
import X.C01GW;
import X.C034S;
import X.C036E;
import X.C03HG;
import X.C09R3;
import X.C0PEM;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1324460kZQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1738910vLt;
import X.C1739410vMh;
import X.C1750670ver;
import X.C1750690vet;
import X.C1750760vf0;
import X.C1750800vf4;
import X.C1751070vfV;
import X.C1751130vfb;
import X.C1751140vfc;
import X.C1751170vff;
import X.C1751180vfg;
import X.C1751210vfj;
import X.C19719912Dl;
import X.C1AQS;
import X.C20600815jK;
import X.C20603715jn;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C481050Itj;
import X.C723590SZx;
import X.C724750Sbp;
import X.C770702zh;
import X.C814420VxA;
import X.EnumC1242360iR0;
import X.EnumC1751090vfX;
import X.InterfaceC1739440vMk;
import X.InterfaceC19341710lj;
import X.InterfaceC2217461Bqa;
import Y.AsS46S0100000_19;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class MessageCenterAssem extends UIContentAssem implements InterfaceC19341710lj, InterfaceC1739440vMk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public TuxNavBar LLIZLLLIL;
    public C1324460kZQ LLJ;
    public C481050Itj LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C1559260qg8 LLJILJILJ;
    public final C1559260qg8 LLJILLL;
    public final C20603715jn LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public AbstractC1906720ziY LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final AsS46S0100000_19 LLJL;
    public boolean LLJLIL;
    public View LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageCenterAssem.class, "sellerMessageViewModel", "getSellerMessageViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/messagecenter/SellerMessageListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageCenterAssem.class, "messageCenterViewModel", "getMessageCenterViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterViewModel;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MessageCenterAssem() {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SellerMessageListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 1072), AFwS268S0000000_26.get$arr$(172), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageCenterViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1073), AFwS268S0000000_26.get$arr$(173), null, true);
        this.LLJILJILJ = new C1559260qg8(new C723590SZx(this, C1738910vLt.class, null), checkSupervisorPrepared());
        this.LLJILLL = new C1559260qg8(new C723590SZx(this, C1751140vfc.class, null), checkSupervisorPrepared());
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 2;
        c20603715jn.LIZJ = false;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IBusinessDependencyService.class.getName(), anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        Class<? extends PowerLoadingCell> tuxLoadingFooterCell = ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).getTuxLoadingFooterCell();
        if (tuxLoadingFooterCell != null) {
            c20603715jn.LIZLLL = tuxLoadingFooterCell;
        }
        this.LLJJ = c20603715jn;
        this.LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 219));
        this.LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 215));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 218));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 213));
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 214));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(81));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(83));
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = -1L;
        this.LLJJL = -1L;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(82));
        this.LLJL = new AsS46S0100000_19(this, 3);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1739440vMk
    public final void onHiddenChanged(boolean z) {
    }

    public final C1751140vfc Go() {
        return (C1751140vfc) this.LLJILLL.getValue();
    }

    public final MessageCenterViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (MessageCenterViewModel) assemVMLazy.getValue();
    }

    public final TuxNavBar Lo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.p15) : null;
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final C1750670ver No() {
        return (C1750670ver) this.LLJJIII.getValue();
    }

    public final C1738910vLt Oo() {
        return (C1738910vLt) this.LLJILJILJ.getValue();
    }

    public final C1751180vfg So() {
        return (C1751180vfg) this.LLJJJIL.getValue();
    }

    public final AtomicInteger Vo() {
        return (AtomicInteger) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C1751210vfj Zo() {
        return (C1751210vfj) this.LLJJIJIIJIL.getValue();
    }

    public final SellerMessageListViewModel ap() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (SellerMessageListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1750800vf4 Jo() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterAssem.Jo():X.0vf4");
    }

    public final boolean bp() {
        if (Go().LLIZ) {
            return Go().LLILZ || Go().LLILZLL;
        }
        return false;
    }

    public final void cp() {
        this.LLJJL = SystemClock.elapsedRealtime();
        Ho().wQ2(EnumC1751090vfX.REFRESHING);
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                View viewFindViewById = this.LLJ;
                if (viewFindViewById == null) {
                    View viewLJJIJL = LJJIJL();
                    viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.o9l) : null;
                    this.LLJ = (C1324460kZQ) viewFindViewById;
                }
                C2211751BhN.LIZIZ((ViewGroup) viewFindViewById);
                MessageCenterViewModel messageCenterViewModelHo = Ho();
                int i = !Go().LL ? 2 : 3;
                if (!Go().LLILZ) {
                    i--;
                }
                if (!Go().LLIZ) {
                    i--;
                }
                messageCenterViewModelHo.LL = i;
                if (Go().LLILLL) {
                    MessageCenterViewModel messageCenterViewModelHo2 = Ho();
                    C1750760vf0.LIZ.getClass();
                    TradeEntranceInfo tradeEntranceInfo = C1750760vf0.LIZJ;
                    if (C770702zh.LIZIZ(tradeEntranceInfo.schema)) {
                        messageCenterViewModelHo2.setState(new AwS605S0100000_26(tradeEntranceInfo, 519));
                    } else {
                        C1750760vf0.LIZJ(new AwS605S0100000_26(messageCenterViewModelHo2, 518));
                    }
                }
                C1751170vff c1751170vff = (C1751170vff) this.LLJJI.getValue();
                if (c1751170vff != null) {
                    C23250099c.LIZLLL(c1751170vff.LLIZLLLIL.getAssemVMScope(), C0PEM.LIZJ, null, new C1751070vfV(c1751170vff, null), 2);
                }
                if (Go().LLIZ) {
                    ap().manualListRefresh();
                }
                if (Go().LLILZ) {
                    ((LiveData) No().LLILLL.getValue()).setValue(EnumC1242360iR0.REFRESH);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Ho().wQ2(EnumC1751090vfX.NETWORK_UNAVAILABLE);
    }

    public final void dp() {
        if (!Go().LLIZLLLIL || this.LLJLIL) {
            return;
        }
        this.LLJLIL = true;
        SettingsManager.LIZLLL().getClass();
        Uri.Builder builderBuildUpon = UriProtector.parse(SettingsManager.LJI("ec_shop_message_recommend_schema", "sslocal://lynxview?url=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_ecom_rec_pages/message_ymal/template.js")).buildUpon();
        builderBuildUpon.appendQueryParameter("enter_from", Oo().LLILLJJLI);
        builderBuildUpon.appendQueryParameter("previous_page", Oo().LLILLL);
        if (C770702zh.LIZIZ(Oo().LLIZLLLIL)) {
            builderBuildUpon.appendQueryParameter("traffic_source", Oo().LLIZLLLIL);
        }
        if (C770702zh.LIZIZ(Oo().LLJ)) {
            builderBuildUpon.appendQueryParameter("traffic_source_list", Oo().LLJ);
        }
        String string = builderBuildUpon.build().toString();
        C20600815jK.LIZJ(So().LLILZLL, new C03HG(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), R.attr.na, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 52));
        C20600815jK.LIZJ(So().LLILZLL, new C00X6(string));
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        this.LLJJJJLIIL = SystemClock.elapsedRealtime();
        Ho().LLJ = "close";
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (this.LLJJJJLIIL != -1) {
            C1750800vf4 c1750800vf4Jo = Jo();
            EnumC1751090vfX enumC1751090vfX = Ho().getState().LL.LIZ;
            int i = 0;
            int i2 = (enumC1751090vfX == EnumC1751090vfX.BOTH || enumC1751090vfX == EnumC1751090vfX.NOTICE_ONLY || enumC1751090vfX == EnumC1751090vfX.EMPTY || enumC1751090vfX == EnumC1751090vfX.MESSAGE_ONLY) ? 1 : 0;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1739410vMh c1739410vMh = C1739410vMh.LIZ;
            int i3 = c1750800vf4Jo.LIZ;
            int i4 = c1750800vf4Jo.LIZIZ;
            int i5 = c1750800vf4Jo.LIZJ;
            String str = Ho().LLJ;
            int i6 = (int) (jElapsedRealtime - this.LLJJJJLIIL);
            Map<String, String> mapLIZ = Oo().LIZ();
            c1739410vMh.getClass();
            HashMap map = new HashMap();
            map.put("ec_message_cnt", Integer.valueOf(i3));
            map.put("seller_message_cnt", Integer.valueOf(i4));
            map.put("is_load_data", Integer.valueOf(i2));
            map.put("quit_type", str);
            map.put("stay_time", Integer.valueOf(i6));
            map.put("collaborator_message_cnt", Integer.valueOf(i5));
            map.putAll(mapLIZ);
            C1018703yb.LIZIZ("tiktokec_stay_page", map);
            int i7 = C1751130vfb.LIZ[Ho().getState().LL.LIZ.ordinal()];
            if (i7 == 1) {
                Ho().LLJI = 0;
                Ho().LLJIJIL = 0;
                return;
            }
            if (i7 == 2) {
                MessageCenterViewModel messageCenterViewModelHo = Ho();
                Integer value = No().LIZ().getValue();
                messageCenterViewModelHo.LLJI = value != null ? value.intValue() : 0;
                Ho().LLJIJIL = 0;
                return;
            }
            if (i7 == 3 || i7 == 4) {
                MessageCenterViewModel messageCenterViewModelHo2 = Ho();
                Integer value2 = No().LIZ().getValue();
                messageCenterViewModelHo2.LLJI = value2 != null ? value2.intValue() : 0;
                MessageCenterViewModel messageCenterViewModelHo3 = Ho();
                if (Go().LLIZ) {
                    int size = Zo().getItems().size();
                    int size2 = Zo().getItems().size();
                    while (i < size2 && !(ListProtector.get(Zo().getItems(), i) instanceof C1750690vet)) {
                        size--;
                        i++;
                    }
                    i = size;
                }
                messageCenterViewModelHo3.LLJIJIL = i;
            }
        }
    }

    @Override // X.InterfaceC19341710lj
    public final void LJFF() {
        cp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02e4  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterAssem.onViewCreated(android.view.View):void");
    }
}
