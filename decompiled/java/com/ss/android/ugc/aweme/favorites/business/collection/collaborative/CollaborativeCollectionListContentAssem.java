package com.ss.android.ugc.aweme.favorites.business.collection.collaborative;

import X.AbstractC1604130rqV;
import X.C019F;
import X.C01GW;
import X.C0O2O;
import X.C1170860gZg;
import X.C1170870gZh;
import X.C1170900gZk;
import X.C11NJ;
import X.C1206780hVc;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C298410Bmp;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C742510TAr;
import X.EnumC612200Nzm;
import X.EnumC614120O6w;
import X.InterfaceC1170330gYp;
import X.InterfaceC1170340gYq;
import X.InterfaceC1206430hV3;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS147S0400000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes19.dex */
public final class CollaborativeCollectionListContentAssem extends UISlotAssem implements InterfaceC1170340gYq, InterfaceC1170330gYp, C0O2O, InterfaceC1206430hV3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final C01GW LLJJIJI;
    public int LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public CollectionManageRequest LLJJJ;
    public final InterfaceC1631620sYq<String, Object, EnumC614120O6w, Unit> LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollaborativeCollectionListContentAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = 8;
    }

    public CollaborativeCollectionListContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 193), AFwS256S0000000_18.get$arr$(101), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C1170870gZh.class, null), checkSupervisorPrepared());
        this.LLJJIJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(132));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(131));
        this.LLJJJIL = new AwS667S0100000_18(this, 7);
    }

    @Override // X.InterfaceC1170340gYq
    public void CR() {
        C19EG c19eg;
        lp().LJ("CollaborativeCollectionListContentAssem onClickViewHolderToCreateCollection");
        C1206780hVc.LIZ("click create new collection in collection list");
        C1170900gZk c1170900gZk = new C1170900gZk();
        c1170900gZk.LIZLLL = "chat_settings";
        c1170900gZk.LJIIZILJ = "click_chat_setting";
        c1170900gZk.LJIJI = "click_chat_setting";
        c1170900gZk.LJIILJJIL();
        Context context = LJJIJL().getContext();
        if (!(context instanceof C19EG) || (c19eg = (C19EG) context) == null) {
            return;
        }
        new AwS147S0400000_18(this, c19eg, context, new C1170860gZg(c19eg, this), 1).invoke();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.acs;
    }

    @Override // X.InterfaceC1170340gYq, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC1206430hV3
    public void VE(String str) {
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    private final C1170870gZh kp() {
        return (C1170870gZh) this.LLJJIII.getValue();
    }

    public final C11NJ hp() {
        return (C11NJ) this.LLJJIJIL.getValue();
    }

    public final VideoCollectionListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (VideoCollectionListViewModel) assemVMLazy.getValue();
    }

    public final AbstractC1604130rqV lp() {
        return (AbstractC1604130rqV) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC1170330gYp
    public void Y0() {
        ip().vQ2(null, true, false, false, false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        IStateNotifier iStateNotifier;
        super.onCreate();
        if (!C298410Bmp.LIZ() || (iStateNotifier = (IStateNotifier) PluggableExtentionKt.pluggableSpiForReal(IAwemeCollectionStateNotifier.class)) == null) {
            return;
        }
        iStateNotifier.addSubscriber(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        IStateNotifier iStateNotifier;
        super.onDestroy();
        hp().LJ();
        EventBus.LIZLLL().LJJI(this);
        if (!C298410Bmp.LIZ() || (iStateNotifier = (IStateNotifier) PluggableExtentionKt.pluggableSpiForReal(IAwemeCollectionStateNotifier.class)) == null) {
            return;
        }
        iStateNotifier.removeSubscriber(this);
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        Context context = LJJIJL().getContext();
        CollectionManageRequest collectionManageRequest = this.LLJJJ;
        if (collectionManageRequest != null) {
            AbstractC1604130rqV abstractC1604130rqVLp = lp();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollaborativeCollectionListContentAssem onResume cost event collectionId: ");
            sbLIZ.append(collectionManageRequest.collectionId);
            sbLIZ.append(", collectionName: ");
            sbLIZ.append(collectionManageRequest.collectionName);
            sbLIZ.append(", operation: ");
            sbLIZ.append(collectionManageRequest.operation);
            abstractC1604130rqVLp.LJ(C2188811AlT.LIZIZ(sbLIZ));
            if (collectionManageRequest.operation == 2) {
                C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
                c1389890mGx.LJIIIZ(2131834475);
                c1389890mGx.LJIIJJI();
                C19719512Dh.LIZJ(VideoCollectionListViewModel.LLIZLLLIL).remove(collectionManageRequest.collectionId);
            }
            if (collectionManageRequest.operation == 1) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(LJJIJL());
                c1389890mGx2.LJIIIZ(2131834467);
                c1389890mGx2.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx2.LJII(R.attr.a0i);
                c1389890mGx2.LJIIJJI();
            }
            if (collectionManageRequest.operation == 10) {
                CollectionDetail collectionDetail = (CollectionDetail) ((LinkedHashMap) VideoCollectionListViewModel.LLIZLLLIL).get(collectionManageRequest.collectionId);
                if (collectionDetail != null) {
                    collectionDetail.statistic = new CollectionDetail.Statistic(Long.valueOf(collectionManageRequest.addIds != null ? r0.size() : 0L), true);
                }
                withState(ip(), new AwS227S0300000_18(context, this, collectionManageRequest, 21));
            }
            this.LLJJJ = null;
        }
    }

    public void op() {
        VideoCollectionListViewModel videoCollectionListViewModelIp = ip();
        videoCollectionListViewModelIp.getClass();
        videoCollectionListViewModelIp.setStateImmediate(new AwS32S0001000_18(13));
    }

    public final CollectionManageRequest mp() {
        return this.LLJJJ;
    }

    @C14EU
    public final void handleOnOperationEvent(C742510TAr c742510TAr) {
        ip().vQ2(null, true, false, false, false);
        if (c742510TAr.LIZ.operation == 10 && !Intrinsics.LJFF(c742510TAr.LIZIZ, "create_collection")) {
            return;
        }
        if (c742510TAr.LIZ.operation == 1 && !Intrinsics.LJFF(c742510TAr.LIZIZ, "create_collection")) {
            return;
        }
        this.LLJJJ = c742510TAr.LIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Function1<View, Unit> function1;
        Integer num;
        C1749280vcc c1749280vcc;
        lp().LJ("CollaborativeCollectionListContentAssem onViewCreated");
        C1170870gZh c1170870gZhKp = kp();
        if (c1170870gZhKp != null) {
            ip().LLILLJJLI = c1170870gZhKp.LL;
            ip().LL = c1170870gZhKp.LLILLJJLI;
            ip().LLILLL = c1170870gZhKp.LLILLL;
            ip().LLILZIL = c1170870gZhKp.LLILZ;
            ip().LLILZLL = c1170870gZhKp.LLILZIL;
        }
        C723850SaN.LIZLLL(this, new AwS368S0200000_2(this, view, 30));
        C1170870gZh c1170870gZhKp2 = kp();
        if (c1170870gZhKp2 != null && (num = c1170870gZhKp2.LLILZLL) != null) {
            int iIntValue = num.intValue();
            View viewFindViewById = view.findViewById(R.id.w28);
            if ((viewFindViewById instanceof C1749280vcc) && (c1749280vcc = (C1749280vcc) viewFindViewById) != null) {
                c1749280vcc.setTopMargin(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            }
        }
        C1170870gZh c1170870gZhKp3 = kp();
        if (c1170870gZhKp3 != null && (function1 = c1170870gZhKp3.LLIZ) != null) {
            function1.invoke(view.findViewById(R.id.w28));
        }
        EventBus.LIZLLL().LJIJJ(this);
        ip().vQ2(null, true, false, false, false);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0gZl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1160250gIZ) obj).LL;
            }
        }, null, null, null, new AwS597S0100000_18(this, 99), 14, null);
    }

    public final void tp(CollectionManageRequest collectionManageRequest) {
        this.LLJJJ = collectionManageRequest;
    }

    @Override // X.C0O2O
    public void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        if (enumC612200Nzm == EnumC612200Nzm.MUTATION) {
            AbstractC1604130rqV abstractC1604130rqVLp = lp();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollaborativeCollectionListContentAssem onAwemeCollectionStateChange id: ");
            sbLIZ.append(str);
            sbLIZ.append(", newState: ");
            sbLIZ.append(z);
            abstractC1604130rqVLp.LJ(C2188811AlT.LIZIZ(sbLIZ));
            ip().vQ2(null, true, false, false, false);
        }
    }

    public void sp(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        Wz(str, z, enumC612200Nzm);
    }

    @Override // X.InterfaceC612260Nzs
    public /* bridge */ /* synthetic */ void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
        sp(str, bool.booleanValue(), enumC612200Nzm);
    }
}
