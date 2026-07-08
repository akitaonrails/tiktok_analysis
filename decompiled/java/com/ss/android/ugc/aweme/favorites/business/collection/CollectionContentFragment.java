package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC1604130rqV;
import X.AbstractC1623806Xk;
import X.AbstractC21673619ry;
import X.AbstractViewOnClickListenerC372950Ejl;
import X.AnonymousClass0345;
import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C09JN;
import X.C0O2O;
import X.C0ZP4;
import X.C1170640gZK;
import X.C1170670gZN;
import X.C1170700gZQ;
import X.C1171340gaS;
import X.C1172510gcL;
import X.C1172580gcS;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11NJ;
import X.C11S5;
import X.C1206780hVc;
import X.C1208700hYi;
import X.C1365870leD;
import X.C1372630lp7;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1599690rjL;
import X.C1622206Wu;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2450909j1;
import X.C259800zU;
import X.C294880Bh8;
import X.C298410Bmp;
import X.C338490DOt;
import X.C438720HIg;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C742510TAr;
import X.C7827033x;
import X.C786410Ut5;
import X.C985403tE;
import X.C987103tV;
import X.EnumC612200Nzm;
import X.EnumC614120O6w;
import X.InterfaceC0148002o;
import X.InterfaceC1171100ga4;
import X.InterfaceC1171190gaD;
import X.InterfaceC1172550gcP;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217451BqZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import Y.ARunnableS23S0101000_12;
import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import Y.AfS35S1300000_12;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class CollectionContentFragment extends BasePage implements InterfaceC724530SbT, DeleteAbility, ReNameAbility, ChangePrivacyAbility, InterfaceC1171100ga4, InterfaceC1171190gaD, C0O2O {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlJyHELIOSogO2svJiM/LSY4ICA9ZgYjJSM2KzElJiEQJys4LCEnDjctLiI2JjE=";
    public String LLJ;
    public String LLJI;
    public Integer LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public CollectionDetail LLJJ;
    public boolean LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final InterfaceC2217451BqZ<Unit> LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public CollectionManageRequest LLJJJ;
    public String LLJJJIL;
    public long LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollectionContentFragment.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionContentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = 8;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC1171100ga4, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void Q9(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void WK(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage
    public int WR() {
        return R.layout.c6a;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void onActivityFinish() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void qO(Intent intent) {
    }

    public CollectionContentFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 266);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionContentViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 427);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(87);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), awS562S0100000_18, aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, awS562S0100000_18, aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), awS562S0100000_18, aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy;
        this.LLJJIJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(187));
        this.LLJJIJIIJIL = new C1170700gZQ(this);
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(120));
    }

    private final AbstractC1604130rqV rS() {
        return (AbstractC1604130rqV) this.LLJJIJIL.getValue();
    }

    @Override // X.InterfaceC1171190gaD
    public boolean NH() {
        ArrayList arrayList;
        Integer num;
        Long l;
        C259800zU c259800zU = new C259800zU();
        gT(mS(), new AwS597S0100000_18(c259800zU, (C259800zU<List<Aweme>>) 88));
        ShareService shareService = (ShareService) ServiceManager.get().getService(ShareService.class);
        Context contextRequireContext = requireContext();
        String str = qS().id;
        if (str == null) {
            str = "";
        }
        String str2 = qS().uid;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = qS().name;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = qS().creatorName;
        if (str4 == null) {
            str4 = "";
        }
        CollectionDetail.Statistic statistic = qS().statistic;
        if (statistic != null && (l = statistic.total) != null) {
            l.longValue();
        }
        CollectionDetail.Status status = qS().status;
        boolean z = (status == null || (num = status.state) == null || num.intValue() != 3) ? false : true;
        List list = (List) c259800zU.element;
        String str5 = this.LLJI;
        List<CollaborativeUser> list2 = qS().collaborativeUserList;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<CollaborativeUser> it2 = list2.iterator();
            while (it2.hasNext()) {
                String str6 = it2.next().uid;
                if (str6 == null) {
                    str6 = "";
                }
                arrayList.add(str6);
            }
        } else {
            arrayList = null;
        }
        Integer num2 = qS().type;
        return shareService.LJJIJL(contextRequireContext, new C1372630lp7(str, str2, str3, str4, z, list, str5, null, null, null, arrayList, num2 != null && num2.intValue() == 1));
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage
    public boolean bS() {
        C013C c013c = new C013C();
        gT(mS(), new AwS384S0200000_18(c013c, this, 41));
        return c013c.element;
    }

    public final C11NJ kS() {
        return (C11NJ) this.LLJJIJI.getValue();
    }

    public final VideoCollectionContentViewModel mS() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (VideoCollectionContentViewModel) assemVMLazy.getValue();
    }

    public final CollectionDetail qS() {
        CollectionDetail collectionDetail = this.LLJJ;
        if (collectionDetail != null) {
            return collectionDetail;
        }
        return null;
    }

    public final boolean yS() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        String curUserId = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId();
        String str = qS().uid;
        if (str != null && !Intrinsics.LJFF(str, curUserId)) {
            List<CollaborativeUser> list = qS().collaborativeUserList;
            if (list == null || list.isEmpty()) {
                return false;
            }
            Iterator<CollaborativeUser> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().uid, curUserId)) {
                }
            }
            return false;
        }
        return true;
    }

    private final void FS() {
        List<UrlModel> list;
        UrlModel urlModel;
        List<String> urlList;
        final C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        rS().LJ("CollectionContentFragment renameCollection");
        activity.getWindow().setSoftInputMode(34);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(this.LLJI, "enter_from");
        pairArr[1] = new Pair(this.LLJ, "collection_id");
        pairArr[2] = new Pair(qS().name, "collection_name");
        CollectionDetail.Status status = qS().status;
        String str = null;
        pairArr[3] = new Pair(C1172580gcS.LIZ(status != null ? status.state : null), "collection_type");
        C20684815ws.LJIJI("change_collection_name_click", pairArr);
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        String string = activity.getString(2131834464);
        String str2 = qS().name;
        String string2 = activity.getString(R.string.sg8);
        InterfaceC1172550gcP interfaceC1172550gcP = new InterfaceC1172550gcP() { // from class: X.0gZM
            @Override // X.InterfaceC1172550gcP
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1172550gcP
            public final void LIZ(int i, String str3, boolean z, boolean z2, List list2) {
                String str4;
                Integer num;
                if (this.LLJ == null) {
                    return;
                }
                if (C1170670gZN.LIZ()) {
                    str4 = this.LLJI;
                } else {
                    str4 = "collection_video";
                }
                Pair[] pairArr2 = new Pair[4];
                pairArr2[0] = new Pair(str4, "enter_from");
                pairArr2[1] = new Pair(this.LLJ, "collection_id");
                pairArr2[2] = new Pair(str3, "collection_name");
                CollectionDetail.Status status2 = this.qS().status;
                if (status2 != null) {
                    num = status2.state;
                } else {
                    num = null;
                }
                pairArr2[3] = new Pair(C1172580gcS.LIZ(num), "collection_type");
                C20684815ws.LJIJI("change_collection_name_save", pairArr2);
                CollectionManageRequest collectionManageRequest = new CollectionManageRequest(3, this.LLJ, str3, null, null, null, null, null, null, null, null, null);
                C11O8 c11o8LJJJLZIJ = new C1171340gaS().LLILLL.LLZLLIL(collectionManageRequest, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                CollectionContentFragment collectionContentFragment = this;
                C19EG c19eg = activity;
                this.kS().LIZ(c11o8LJJJLZIJ.LJJLL(new AfS35S1300000_12(collectionContentFragment, str3, collectionManageRequest, c19eg, 1), new AfS181S0100000_12(c19eg, 127)));
            }
        };
        String str3 = this.LLJILJILJ;
        if (str3 == null) {
            CollectionDetail collectionDetailQS = qS();
            if (collectionDetailQS != null && (list = collectionDetailQS.covers) != null && (urlModel = (UrlModel) C13LP.LJJJLZIJ(0, list)) != null && (urlList = urlModel.getUrlList()) != null) {
                str = (String) C13LP.LJJJLZIJ(0, urlList);
            }
        } else {
            str = str3;
        }
        C1172510gcL.LIZJ(supportFragmentManager, string, str2, string2, null, null, interfaceC1172550gcP, str, this.LLJI, null, null, 6336);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.0gZK] */
    private final void gS() {
        final C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        rS().LJ("CollectionContentFragment deleteCollection");
        final String str = C1170670gZN.LIZ() ? this.LLJI : "collection_video";
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(str, "enter_from");
        pairArr[1] = new Pair(this.LLJ, "collection_id");
        pairArr[2] = new Pair(qS().name, "collection_name");
        CollectionDetail.Status status = qS().status;
        pairArr[3] = new Pair(C1172580gcS.LIZ(status != null ? status.state : null), "collection_type");
        C20684815ws.LJIJI("delete_collection_click", pairArr);
        ?? r4 = new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0gZK
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                Integer num;
                Pair[] pairArr2 = new Pair[4];
                pairArr2[0] = new Pair(str, "enter_from");
                pairArr2[1] = new Pair(this.LLJ, "collection_id");
                pairArr2[2] = new Pair(this.qS().name, "collection_name");
                CollectionDetail.Status status2 = this.qS().status;
                if (status2 != null) {
                    num = status2.state;
                } else {
                    num = null;
                }
                pairArr2[3] = new Pair(C1172580gcS.LIZ(num), "collection_type");
                C20684815ws.LJIJI("delete_collection_confirm", pairArr2);
                CollectionManageRequest collectionManageRequest = new CollectionManageRequest(2, this.LLJ, null, null, null, null, null, null, null, null, null, null);
                this.kS().LIZ(new C1171340gaS().LLILLL.LLZLLIL(collectionManageRequest, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS148S0200000_12(collectionManageRequest, this, 41), new AfS181S0100000_12(activity, 124)));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(500L);
            }
        };
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJII = false;
        c1397580mTM.LJI(C786410Ut5.j4(activity.getString(2131834474), Arrays.copyOf(new Object[]{qS().name}, 1)));
        c1397580mTM.LIZ(2131834483);
        C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12((C1170640gZK) r4, this, 31));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        C1391850mK7.LIZIZ(c1397510mTF, "profile_collection_delete_confirm_dialog");
        c1397510mTF.LIZLLL();
    }

    public final void ES() {
        Integer num;
        Long l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJJJJ < 400) {
            return;
        }
        this.LLJJJJ = jCurrentTimeMillis;
        C259800zU c259800zU = new C259800zU();
        rS().LJ("CollectionContentFragment openSharePanel");
        gT(mS(), new AwS597S0100000_18(c259800zU, (C259800zU<List<Aweme>>) 89));
        ShareService shareService = (ShareService) ServiceManager.get().getService(ShareService.class);
        Context contextRequireContext = requireContext();
        String str = qS().id;
        if (str == null) {
            str = "";
        }
        String str2 = qS().uid;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = qS().name;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = qS().creatorName;
        if (str4 == null) {
            str4 = "";
        }
        CollectionDetail.Statistic statistic = qS().statistic;
        if (statistic != null && (l = statistic.total) != null) {
            l.longValue();
        }
        CollectionDetail.Status status = qS().status;
        boolean z = (status == null || (num = status.state) == null || num.intValue() != 3) ? false : true;
        List list = (List) c259800zU.element;
        String str5 = this.LLJI;
        CollectionDetail.ShareStruct shareStruct = qS().shareInfo;
        ArrayList arrayList = null;
        String str6 = shareStruct != null ? shareStruct.url : null;
        CollectionDetail.ShareStruct shareStruct2 = qS().shareInfo;
        String str7 = shareStruct2 != null ? shareStruct2.desc : null;
        CollectionDetail.ShareStruct shareStruct3 = qS().shareInfo;
        String str8 = shareStruct3 != null ? shareStruct3.title : null;
        List<CollaborativeUser> list2 = qS().collaborativeUserList;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<CollaborativeUser> it2 = list2.iterator();
            while (it2.hasNext()) {
                String str9 = it2.next().uid;
                if (str9 == null) {
                    str9 = "";
                }
                arrayList.add(str9);
            }
        }
        Integer num2 = qS().type;
        shareService.LJJLIIIJJI(contextRequireContext, new C1372630lp7(str, str2, str3, str4, z, list, str5, str6, str7, str8, arrayList, num2 != null && num2.intValue() == 1));
    }

    @Override // X.InterfaceC1171190gaD
    public void jc() {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        rS().LJ("CollectionContentFragment onClickButtonToMoveVideos");
        gT(mS(), new AwS384S0200000_18(activity, this, 39));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        kS().LJ();
        EventBus.LIZLLL().LJJI(this);
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber(this);
        }
        if (this.LLJJI) {
            if (Intrinsics.LJFF(this.LLJILLL, "click_inline_msg") || Intrinsics.LJFF(this.LLJILLL, "click_co_collection_card")) {
                C2450909j1.LIZJ(AFwS206S0000000_18.get$arr$(121));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        C19EG activity;
        Long l;
        super.onResume();
        CollectionManageRequest collectionManageRequest = this.LLJJJ;
        if (collectionManageRequest != null) {
            AbstractC1604130rqV abstractC1604130rqVRS = rS();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollectionContentFragment onResume cost event collectionId: ");
            sbLIZ.append(collectionManageRequest.collectionId);
            sbLIZ.append(", collectionName: ");
            sbLIZ.append(collectionManageRequest.collectionName);
            sbLIZ.append(", operation: ");
            sbLIZ.append(collectionManageRequest.operation);
            abstractC1604130rqVRS.LJ(C2188811AlT.LIZIZ(sbLIZ));
            if (collectionManageRequest.operation == 10) {
                List<String> list = collectionManageRequest.addIds;
                int size = list != null ? list.size() : 0;
                CollectionDetail.Statistic statistic = qS().statistic;
                long jLongValue = (statistic == null || (l = statistic.total) == null) ? 0L : l.longValue();
                CollectionDetail.Statistic statistic2 = qS().statistic;
                if (statistic2 != null) {
                    statistic2.total = Long.valueOf(jLongValue + ((long) size));
                }
                List<CollaborativeUser> list2 = qS().collaborativeUserList;
                if (list2 == null || list2.isEmpty()) {
                    C1440005kM.LIZ(new C438720HIg(qS()));
                    C1389890mGx c1389890mGx = new C1389890mGx(requireActivity());
                    c1389890mGx.LJIIJ(getResources().getQuantityString(2131755308, size, String.valueOf(size)));
                    c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                    c1389890mGx.LJII(R.attr.a0i);
                    c1389890mGx.LJIIJJI();
                } else {
                    C19EG activity2 = getActivity();
                    if (activity2 != null) {
                        YS(activity2, null);
                    }
                }
            }
            this.LLJJJ = null;
        }
        String str = this.LLJJJIL;
        if (str != null && (activity = getActivity()) != null) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJIIJ(str);
            c1389890mGx2.LJIIJJI();
            this.LLJJJIL = null;
        }
        Integer num = this.LLJIJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            View view = getView();
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS23S0101000_12(iIntValue, this, 7), 500L);
            }
            this.LLJIJIL = null;
        }
    }

    @Override // X.InterfaceC1171190gaD
    public void xx() {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        rS().LJ("CollectionContentFragment onClickButtonToRemoveVideos");
        gT(mS(), new AwS384S0200000_18(activity, this, 40));
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.ReNameAbility
    public void CA2() {
        FS();
    }

    @Override // X.InterfaceC1171190gaD
    public void P7() {
        gS();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.DeleteAbility
    public void UN() {
        gS();
    }

    public final String getEnterFrom() {
        return this.LLJI;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // X.InterfaceC1171100ga4
    public void gm() {
        gS();
    }

    public final int hS() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1171100ga4
    public void i8() {
        FS();
    }

    public final String iS() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1171190gaD
    public void kl() {
        FS();
    }

    public final String nS() {
        return this.LLJILJILJ;
    }

    public final String oS() {
        return this.LLJILLL;
    }

    public final CollectionManageRequest sS() {
        return this.LLJJJ;
    }

    public final String uS() {
        return this.LLJJJIL;
    }

    public final Integer wS() {
        return this.LLJIJIL;
    }

    public final void HS(int i) {
        this.LLJILJIL = i;
    }

    public final void JS(String str) {
        this.LLJ = str;
    }

    @Override // X.InterfaceC1171190gaD
    public void Jl(boolean z) {
        String str;
        Integer num;
        String str2;
        String str3;
        C1206780hVc.LIZ("click more button");
        rS().LJ("CollectionContentFragment onClickButtonToManageCollection");
        String str4 = "";
        if (z) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("collection_id", String.valueOf(getId()));
            CollectionDetail collectionDetailQS = qS();
            if (collectionDetailQS != null && (str3 = collectionDetailQS.name) != null) {
                str4 = str3;
            }
            pairArr[1] = new Pair("collection_name", str4);
            pairArr[2] = new Pair("enter_from", this.LLJI);
            C20684815ws.LJIILLIIL("click_collection_share", C2097608Jq.LJIIJ(pairArr));
        } else {
            if (C1170670gZN.LIZ()) {
                str = this.LLJI;
            } else {
                str = "collection_video";
            }
            Pair[] pairArr2 = new Pair[4];
            pairArr2[0] = new Pair(str, "enter_from");
            pairArr2[1] = new Pair(this.LLJ, "collection_id");
            CollectionDetail collectionDetailQS2 = qS();
            if (collectionDetailQS2 != null && (str2 = collectionDetailQS2.name) != null) {
                str4 = str2;
            }
            pairArr2[2] = new Pair(str4, "collection_name");
            CollectionDetail.Status status = qS().status;
            if (status != null) {
                num = status.state;
            } else {
                num = null;
            }
            pairArr2[3] = new Pair(C1172580gcS.LIZ(num), "collection_type");
            C20684815ws.LJIJI("collection_setting_click", pairArr2);
        }
        ES();
    }

    public final void NS(String str) {
        this.LLJILJILJ = str;
    }

    public final void PS(String str) {
        this.LLJI = str;
    }

    public final void QS(String str) {
        this.LLJILLL = str;
    }

    public final void RS(CollectionDetail collectionDetail) {
        this.LLJJ = collectionDetail;
    }

    public final void US(CollectionManageRequest collectionManageRequest) {
        this.LLJJJ = collectionManageRequest;
    }

    public final void VS(String str) {
        this.LLJJJIL = str;
    }

    @Override // X.InterfaceC1171190gaD
    public void Wq(boolean z) {
        tI2(false, AFwS256S0000000_18.get$arr$(89));
    }

    public final void XS(Integer num) {
        this.LLJIJIL = num;
    }

    public final void cS(View view) {
        Integer num = null;
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(this, view, 38), 3);
        EventBus.LIZLLL().LJIJJ(this);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ReNameAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, DeleteAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ChangePrivacyAbility.class, null, null);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("collection_id", this.LLJ);
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJI);
        CollectionDetail.Status status = qS().status;
        if (status != null) {
            num = status.state;
        }
        c2344009Gk.LJIIIIZZ("collection_type", C1172580gcS.LIZ(num));
        c2344009Gk.LJIIIIZZ("enter_type", this.LLJILLL);
        C20684815ws.LJIILLIIL("ttsocial_collection_detail_page_enter", c2344009Gk.LIZ);
    }

    @C14EU
    public final void handleOnCollectAwemeEvent(AnonymousClass0345 anonymousClass0345) {
        int i;
        long jLongValue;
        Long l;
        AbstractC1604130rqV abstractC1604130rqVRS = rS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionContentFragment handleOnCollectAwemeEvent action: ");
        sbLIZ.append(anonymousClass0345.LIZIZ);
        abstractC1604130rqVRS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (anonymousClass0345.LIZIZ == 0) {
            i = -1;
        } else {
            i = 0;
        }
        CollectionDetail.Statistic statistic = qS().statistic;
        if (statistic != null && (l = statistic.total) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        CollectionDetail.Statistic statistic2 = qS().statistic;
        if (statistic2 != null) {
            statistic2.total = Long.valueOf(jLongValue + ((long) i));
        }
        C1440005kM.LIZ(new C438720HIg(qS()));
    }

    @C14EU
    public final void handleOnCollectionToastEvent(C7827033x c7827033x) {
        this.LLJJJIL = c7827033x.LIZ;
    }

    @C14EU
    public final void handleOnOperationEvent(C742510TAr c742510TAr) {
        CollectionManageRequest collectionManageRequest = c742510TAr.LIZ;
        int i = collectionManageRequest.operation;
        if (i == 10) {
            this.LLJJJ = collectionManageRequest;
        } else if (i == 2) {
            return;
        }
        mS().vQ2(true);
    }

    @C14EU
    public final void handleOnShareCompleteEvent(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF("video_collection", c1365870leD.LIZLLL)) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(getActivity(), getView(), c1365870leD);
        }
    }

    @C14EU
    public final void handleOnVideoCollectionDetailChangeEvent(C438720HIg c438720HIg) {
        Long l;
        Long l2;
        Integer num;
        Integer num2;
        RecyclerView recyclerView;
        AbstractC21673619ry adapter;
        CollectionDetail.Statistic statistic;
        Long l3;
        if (C294880Bh8.LIZ() && !Intrinsics.LJFF(c438720HIg.LIZ, qS()) && Intrinsics.LJFF(c438720HIg.LIZ.id, qS().id)) {
            if (!Intrinsics.LJFF(qS().name, c438720HIg.LIZ.name)) {
                qS().name = c438720HIg.LIZ.name;
            }
            CollectionDetail.Statistic statistic2 = qS().statistic;
            Integer num3 = null;
            if (statistic2 != null) {
                l = statistic2.total;
            } else {
                l = null;
            }
            CollectionDetail.Statistic statistic3 = c438720HIg.LIZ.statistic;
            if (statistic3 != null) {
                l2 = statistic3.total;
            } else {
                l2 = null;
            }
            if (!Intrinsics.LJFF(l, l2) && (statistic = qS().statistic) != null) {
                CollectionDetail.Statistic statistic4 = c438720HIg.LIZ.statistic;
                if (statistic4 != null) {
                    l3 = statistic4.total;
                } else {
                    l3 = null;
                }
                statistic.total = l3;
            }
            CollectionDetail.Status status = qS().status;
            if (status != null) {
                num = status.state;
            } else {
                num = null;
            }
            CollectionDetail.Status status2 = c438720HIg.LIZ.status;
            if (status2 != null) {
                num2 = status2.state;
            } else {
                num2 = null;
            }
            if (!Intrinsics.LJFF(num, num2)) {
                CollectionDetail.Status status3 = qS().status;
                if (status3 != null) {
                    CollectionDetail.Status status4 = c438720HIg.LIZ.status;
                    if (status4 != null) {
                        num3 = status4.state;
                    }
                    status3.state = num3;
                }
                View view = getView();
                if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.e6g)) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyItemChanged(0);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber(this);
        }
    }

    @Override // X.InterfaceC1171100ga4
    public void qt(boolean z) {
        tI2(false, AFwS256S0000000_18.get$arr$(88));
    }

    @Override // X.InterfaceC1171100ga4
    public void xJ(Aweme aweme) {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        AbstractC1604130rqV abstractC1604130rqVRS = rS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionContentFragment onClickItemViewHolderToRemoveUnableVideos aid: ");
        sbLIZ.append(aweme.getAid());
        abstractC1604130rqVRS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIJI("remove_unavailable_from_collection", new Pair("collection_video", "enter_from"));
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJII = false;
        c1397580mTM.LJI(activity.getResources().getString(2131834488));
        c1397580mTM.LIZ(2131834486);
        C985403tE.LIZ(c1397580mTM, new AwS227S0300000_18(aweme, this, activity, 14));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.InterfaceC1171100ga4
    public void Po(View view, Aweme aweme) {
        AbstractC1604130rqV abstractC1604130rqVRS = rS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionContentFragment onClickItemViewHolderToEnterAwemeDetail aid: ");
        sbLIZ.append(aweme.getAid());
        abstractC1604130rqVRS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        gT(mS(), new AwS227S0300000_18(aweme, view, this, 13));
    }

    public final void YS(C19EG c19eg, List<CollaborativeUser> list) {
        C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZIZ = 0;
        c1389910mGz.LJ(3000L);
        Context context = getContext();
        String string = null;
        if (context != null) {
            Object[] objArr = new Object[1];
            CollectionDetail collectionDetailQS = qS();
            if (collectionDetailQS != null) {
                string = collectionDetailQS.name;
            }
            objArr[0] = string;
            string = context.getString(2131847951, objArr);
        }
        c1389910mGz.LJIIJ(string);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZLLL = 2;
        c1389910mGz.LJFF(2131847952);
        c1389910mGz.LIZ.LJIIIIZZ = new C1208700hYi(this, (List) list, c19eg, 0);
        c1389910mGz.LJIIJJI();
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, R> R gT(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return (R) C736680Sv4.LJIJJ(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o> void hT(VM1 vm1, Function1<? super S1, Unit> function1) {
        C736680Sv4.LJIJJLI(vm1, function1);
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1604130rqV abstractC1604130rqVRS = rS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionContentFragment onViewCreated: ");
        sbLIZ.append(this.LLJ);
        abstractC1604130rqVRS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        C1206780hVc.LIZ(C786410Ut5.j4("enter video collection detail, collection id is %s", Arrays.copyOf(new Object[]{this.LLJ}, 1)));
        AssemViewModel.asyncSubscribe$default(mS(), new C2217381BqS() { // from class: X.0gZR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1170570gZD) obj).LL;
            }
        }, null, new AwS384S0200000_18(this, view, 42), null, new AwS384S0200000_18(this, view, 43), 10, null);
        VideoCollectionContentViewModel.wQ2(mS());
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.ChangePrivacyAbility
    public void tI2(final boolean z, final Function1<? super Boolean, Unit> function1) {
        boolean z2;
        Integer num;
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        rS().LJ("CollectionContentFragment changePrivacy");
        CollectionDetail.Status status = qS().status;
        int i = 3;
        if (status != null && (num = status.state) != null && num.intValue() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        final boolean z3 = !z2;
        String str = this.LLJ;
        if (!z3) {
            i = 1;
        }
        kS().LIZ(new C1171340gaS().LLILLL.LLZLLIL(new CollectionManageRequest(4, str, null, null, null, null, null, null, Integer.valueOf(i), null, null, null), false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0gZO
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str2;
                int i2;
                RecyclerView recyclerView;
                AbstractC21673619ry adapter;
                CollectionDetail.Status status2;
                int i3;
                C1C7U.LIZ("CollectionContentFragment@3f31.changePrivacy$1");
                function1.invoke(Boolean.valueOf(z3));
                C1440005kM.LIZ(new C1170740gZU(this.LLJ, z3));
                C1170720gZS c1170720gZS = new C1170720gZS();
                CollectionContentFragment collectionContentFragment = this;
                c1170720gZS.LIZLLL = collectionContentFragment.LLJI;
                c1170720gZS.LJIILLIIL = collectionContentFragment.LLJ;
                c1170720gZS.LJIIZILJ = collectionContentFragment.qS().name;
                if (z3) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                c1170720gZS.LJIJ = str2;
                c1170720gZS.LJIILJJIL();
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                if (z3) {
                    i2 = 2131837010;
                } else {
                    i2 = 2131837006;
                }
                c1389890mGx.LJIIIZ(i2);
                c1389890mGx.LJIIJJI();
                CollectionDetail collectionDetailQS = this.qS();
                if (collectionDetailQS != null && (status2 = collectionDetailQS.status) != null) {
                    if (z3) {
                        i3 = 3;
                    } else {
                        i3 = 1;
                    }
                    status2.state = i3;
                }
                C1440005kM.LIZ(new C438720HIg(this.qS()));
                View view = this.getView();
                if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.e6g)) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyItemChanged(0);
                }
                if (z) {
                    this.ES();
                }
                C1C7U.LIZIZ("CollectionContentFragment@3f31.changePrivacy$1");
            }
        }, new AfS181S0100000_12(activity, 123)));
    }

    public void BS(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        Wz(str, z, enumC612200Nzm);
    }

    @Override // X.C0O2O
    public void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        if (enumC612200Nzm == EnumC612200Nzm.MUTATION) {
            AbstractC1604130rqV abstractC1604130rqVRS = rS();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollectionContentFragment onAwemeCollectionStateChange id: ");
            sbLIZ.append(str);
            sbLIZ.append(", newState: ");
            sbLIZ.append(z);
            abstractC1604130rqVRS.LJ(C2188811AlT.LIZIZ(sbLIZ));
            if (!z) {
                gT(mS(), new AwS132S1100000_18(this, str, 2));
            }
            mS().vQ2(true);
        }
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, R> R fT(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C736680Sv4.LJIJI(vm1, vm2, function2);
    }

    @Override // X.InterfaceC612260Nzs
    public /* bridge */ /* synthetic */ void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
        BS(str, bool.booleanValue(), enumC612200Nzm);
    }

    public final void zS(String str, Object obj, EnumC614120O6w enumC614120O6w) {
        if (enumC614120O6w == EnumC614120O6w.Mutation) {
            AbstractC1604130rqV abstractC1604130rqVRS = rS();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollectionContentFragment onCollectionStateChange id: ");
            sbLIZ.append(str);
            sbLIZ.append(", newState: ");
            sbLIZ.append(obj);
            abstractC1604130rqVRS.LJ(C2188811AlT.LIZIZ(sbLIZ));
            mS().vQ2(true);
        }
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, VM3 extends AssemViewModel<S3>, S3 extends InterfaceC0148002o, R> R eT(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C736680Sv4.LJIJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public <S extends InterfaceC0148002o, A, B> C0ZP4 GS(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, Function1<? super Throwable, Unit> function1, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LJIILIIL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    public <S extends InterfaceC0148002o, T> C0ZP4 dS(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function2<? super C03H5, ? super Throwable, Unit> function2, Function1<? super C03H5, Unit> function1, Function2<? super C03H5, ? super T, Unit> function22) {
        return C736680Sv4.LIZ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function2, function1, function22);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
