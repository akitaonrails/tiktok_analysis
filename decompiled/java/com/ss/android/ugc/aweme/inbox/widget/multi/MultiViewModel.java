package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC895380ZAq;
import X.C00BC;
import X.C01GW;
import X.C036E;
import X.C0C64;
import X.C0CYK;
import X.C0DTR;
import X.C0NBD;
import X.C0OJX;
import X.C0OPX;
import X.C0ORP;
import X.C0PEM;
import X.C0XQ7;
import X.C0ZAH;
import X.C0ZBB;
import X.C0ZBF;
import X.C0ZC2;
import X.C11NJ;
import X.C1227904rF;
import X.C123100dR;
import X.C1370405Xy;
import X.C13BV;
import X.C13LP;
import X.C1440005kM;
import X.C1478305qX;
import X.C15438062q;
import X.C1599780rjU;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1720306oT;
import X.C1865510ye5;
import X.C1889120zGA;
import X.C1890430zIH;
import X.C1890440zII;
import X.C1900790zYz;
import X.C1901150zZZ;
import X.C1901580zaG;
import X.C1902710zc5;
import X.C1902750zc9;
import X.C1902770zcB;
import X.C1902780zcC;
import X.C1902810zcF;
import X.C1902830zcH;
import X.C1902840zcI;
import X.C1903660zdc;
import X.C1904150zeP;
import X.C1904490zex;
import X.C19212010Ec;
import X.C1954807lC;
import X.C19719612Di;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C279960AyA;
import X.C296730Bk7;
import X.C296840BkI;
import X.C346540DiG;
import X.C452501pT;
import X.C616950OHt;
import X.C624370OeJ;
import X.C786410Ut5;
import X.C817503Hh;
import X.C889930Yvf;
import X.C890720Yww;
import X.C895410ZAt;
import X.C895420ZAu;
import X.EnumC1889770zHD;
import X.EnumC1902760zcA;
import X.EnumC1902790zcD;
import X.EnumC1902800zcE;
import X.EnumC1903590zdV;
import X.EnumC1903600zdW;
import X.InterfaceC1891350zJl;
import Y.ARunnableS78S0200000_9;
import Y.IDFactoryS95S0000000_28;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.appdiff.IAwemeNoticeAppDiffProtocol;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment;
import com.ss.android.ugc.aweme.inbox.widget.InboxArchiveNoticeViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceCount;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceExposedInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes29.dex */
public final class MultiViewModel extends InboxArchiveNoticeViewModel {
    public static final C01GW<C1902840zcI> LLLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(212));
    public static final C01GW<IDFactoryS95S0000000_28> LLLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(213));
    public static final C01GW<String> LLLILZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(211));
    public final MutableLiveData<List<AbstractC895380ZAq>> LLILLJJLI;
    public final MutableLiveData LLILLL;
    public final MutableLiveData<List<InterfaceC1891350zJl>> LLILZ;
    public boolean LLILZIL;
    public final NextLiveData<Boolean> LLILZLL;
    public final NextLiveData<Boolean> LLIZ;
    public final C11NJ LLIZLLLIL;
    public final C1903660zdc LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C895420ZAu LLJILJIL;
    public final C01GW LLJILJILJ;
    public SkylightLiveGuidePod LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C1902750zc9 LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public Long LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public volatile ActivityPod LLJJLIIIJLLLLLLLZ;
    public final CopyOnWriteArrayList<InboxEntrancePod> LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public boolean LLL;
    public C895410ZAt LLLF;
    public long LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final int LLLIIII;
    public int LLLIIIIL;
    public InboxEntrancePod LLLIIIL;
    public NoticeCombineResponse LLLIIL;
    public InboxEntranceResponse LLLIILIL;

    public final void KQ2() {
        this.LLJJJ = true;
        this.LLJJJIL = 2;
        PQ2(false);
        Keva keva = C1890430zIH.LIZ;
        C1890430zIH.LIZ.storeLong("key_unified_push_permission", System.currentTimeMillis());
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C346540DiG(CoroutineExceptionHandler.LJJLIL, 3), null, new C1478305qX("dm_turn_on_notification_bar_v2", null), 2);
    }

    public final C895420ZAu CQ2() {
        EnumC1903600zdW enumC1903600zdWDecideDisplay$default = EnumC1903590zdV.decideDisplay$default(EnumC1903590zdV.CONTACTS, null, null, 3, null);
        if (enumC1903600zdWDecideDisplay$default != EnumC1903600zdW.TOP || ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJFF().booleanValue() || enumC1903600zdWDecideDisplay$default == null) {
            return null;
        }
        ((C895420ZAu) this.LLJIJIL.getValue()).LLILLL = enumC1903600zdWDecideDisplay$default;
        return (C895420ZAu) this.LLJIJIL.getValue();
    }

    public final Set<AbstractC895380ZAq> EQ2() {
        return (Set) this.LLLII.getValue();
    }

    public final Set<AbstractC895380ZAq> FQ2() {
        return (Set) this.LLLI.getValue();
    }

    public final void HQ2() {
        C1901580zaG.LIZ.LIZ();
        List listLJFF = C1901580zaG.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cell list size = ");
        sbLIZ.append(listLJFF != null ? Integer.valueOf(listLJFF.size()) : null);
        sbLIZ.append(", thread = ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append('}');
        C1720106oR.LJI("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C2252408s6.LJII(new AwS429S0200000_28(this, (MultiViewModel) listLJFF, (List<InboxEntranceCell>) 34));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLIZLLLIL.dispose();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxArchiveNoticeViewModel
    public final void vQ2() {
        C2252408s6.LJII(new AwS572S0100000_28(this, 262));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public MultiViewModel() {
        Object arrayList;
        List list;
        MutableLiveData<List<AbstractC895380ZAq>> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = mutableLiveData;
        if (C0CYK.LIZJ.LJIIIIZZ()) {
            String string = DQ2().getString("notice_archive_entrance_cells", "");
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Type type = new TypeToken<List<? extends InboxEntranceCell>>() { // from class: X.0zcG
                }.getType();
                c1227904rF.getClass();
                list = (List) C1227904rF.LIZJ(string, type);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getCachedArchiveItems failed, e:");
                sbLIZ.append(e);
                C1720106oR.LIZ("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ));
                list = null;
            }
            StringBuilder sb = new StringBuilder("getCachedArchiveItems, cached cells size:");
            sb.append(list != null ? Integer.valueOf(list.size()) : null);
            sb.append(" , data:");
            sb.append(list);
            C1720106oR.LJI("MultiViewModel", sb.toString());
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new InboxEntrancePod((InboxEntranceCell) it2.next(), !C889930Yvf.LIZ.LJIIL(), false, false, 102));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.LLILZ = new MutableLiveData<>(arrayList);
        this.LLILZLL = new NextLiveData<>();
        this.LLIZ = new NextLiveData<>();
        this.LLIZLLLIL = new C11NJ();
        this.LLJ = new C1903660zdc();
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 263));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1059));
        this.LLJILJIL = CQ2();
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(219));
        this.LLJJIII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(216));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(215));
        this.LLJJIJIL = new C1902750zc9();
        this.LLJJJIL = 2;
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(214));
        this.LLJJL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(217));
        this.LLJL = new CopyOnWriteArrayList<>();
        this.LLJLIL = true;
        this.LLJLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(218));
        this.LLJZ = true;
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(222));
        this.LLL = true;
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("MultiViewModel", "MultiViewModel object init ");
        this.LLLI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(221));
        this.LLLII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(220));
        this.LLLIIII = -1;
    }

    public static Keva DQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multi_view_model_keva:");
        C0XQ7.LJ();
        sbLIZ.append(C0XQ7.LIZ.LJIIJ().getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxArchiveNoticeViewModel
    public final MutableLiveData wQ2() {
        return this.LLILZ;
    }

    public static InboxEntrancePod AQ2(InboxEntranceCell inboxEntranceCell) {
        if (C0ZC2.LIZ() && inboxEntranceCell.isFollower()) {
            return new C1902830zcH(inboxEntranceCell, false, false, !C889930Yvf.LIZ.LJIIL());
        }
        return new InboxEntrancePod(inboxEntranceCell, !C889930Yvf.LIZ.LJIIL(), false, false, 102);
    }

    public static void IQ2(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("pop_up_type", "dm_push");
        c2344009Gk.LJIIIIZZ("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void xQ2(Set set) {
        InboxEntrancePod inboxEntrancePod;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if ((next instanceof InboxEntrancePod) && (inboxEntrancePod = (InboxEntrancePod) next) != null && inboxEntrancePod.LIZLLL()) {
                it2.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.0ZBB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ2(java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell> r38) {
        /*
            Method dump skipped, instruction units count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.GQ2(java.util.List):void");
    }

    public final void MQ2(EnumC1902760zcA enumC1902760zcA) {
        boolean z;
        String desc;
        C0ZAH c0zah = C0ZAH.LIZ;
        boolean z2 = this.LLJLIL;
        c0zah.getClass();
        boolean z3 = true;
        if (((Number) C279960AyA.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && C13LP.LJJJJ(enumC1902760zcA, C1697810uHb.LJIIJJI(EnumC1902760zcA.PULL_DOWN_REFRESH, EnumC1902760zcA.SWITCH_TAB_REFRESH, EnumC1902760zcA.BACK_TO_FRONT))) {
            int i = C2187451AjH.LIZ;
            if (enumC1902760zcA == null || (desc = enumC1902760zcA.getDesc()) == null) {
                desc = "";
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1370405Xy(desc, z2, null), 2);
        }
        if (this.LLILZIL) {
            return;
        }
        if (ActivityStack.getTopActivity() != null) {
            try {
                if (!C036E.LIZ.LIZIZ()) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        this.LLLIIIIL = 0;
        this.LLLFFI = false;
        this.LLLFZ = false;
        this.LLLIIIL = null;
        this.LLLFF = System.currentTimeMillis();
        this.LLILZIL = true;
        ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).inboxService().LIZLLL();
        C2252408s6.LJIIJ("onRefresh", new AwS429S0200000_28(this, enumC1902760zcA, 35));
        ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).inboxService().LIZ(C00BC.REFRESH_CART_COUNT);
        if (C1901150zZZ.LIZJ.LJI()) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1900790zYz(this, null), 2);
        }
        if (!C0OJX.LIZIZ() || C0C64.LJIILLIIL().LJIJ(31744, 0, "bulletin_board_preload_enabled", true) <= 0) {
            z3 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPreloadEnable:");
        sbLIZ.append(z3);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (z3) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C616950OHt(this, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NQ2(X.AbstractC895380ZAq r7) {
        /*
            r6 = this;
            androidx.lifecycle.MutableLiveData r0 = r6.LLILLL
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto Lb4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            int r1 = r2.indexOf(r7)
            if (r1 < 0) goto Lae
            r2.size()
            int r0 = r2.size()
            if (r1 >= r0) goto Lae
            r0 = 1
        L1f:
            r3 = 0
            if (r0 != 0) goto La8
            r1 = r3
        L23:
            boolean r0 = r1 instanceof X.C895420ZAu
            if (r0 == 0) goto L91
            r6.LLJILJIL = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r3.put(r1, r0)
            java.lang.String r1 = "platform"
            java.lang.String r0 = "contact"
            r3.put(r1, r0)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "long_press"
            r3.put(r1, r0)
            java.lang.String r1 = "position"
            java.lang.String r0 = "top"
            r3.put(r1, r0)
            java.lang.String r0 = "authorize_card_close"
            X.C20684815ws.LJIILLIIL(r0, r3)
        L4f:
            androidx.lifecycle.MutableLiveData<java.util.List<X.0ZAq>> r0 = r6.LLILLJJLI
            r0.setValue(r2)
            X.0CYK r0 = X.C0CYK.LIZJ
            boolean r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto Lb4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r2.iterator()
        L65:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.0ZAq r2 = (X.AbstractC895380ZAq) r2
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod
            if (r0 == 0) goto L65
            r0 = r2
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r0 = (com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod) r0
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r0 = r0.entranceCell
            if (r0 == 0) goto L65
            int r1 = r0.cellId
            r0 = 15
            if (r1 != r0) goto L65
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r2 = (com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod) r2
            boolean r0 = r2.LIZLLL()
            if (r0 == 0) goto L65
            r5.add(r3)
            goto L65
        L91:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.inbox.widget.multi.SkylightLiveGuidePod
            if (r0 == 0) goto L98
            r6.LLJILLL = r3
            goto L4f
        L98:
            boolean r0 = r1 instanceof X.C0ZBB
            if (r0 == 0) goto La1
            X.0zc9 r0 = r6.LLJJIJIL
            r0.LIZ = r3
            goto L4f
        La1:
            boolean r0 = r1 instanceof X.C895410ZAt
            if (r0 == 0) goto L4f
            r6.LLLF = r3
            goto L4f
        La8:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.remove(r2, r1)
            goto L23
        Lae:
            r0 = 0
            goto L1f
        Lb1:
            r6.WQ2(r5)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.NQ2(X.0ZAq):void");
    }

    public final void PQ2(boolean z) {
        Object next;
        EnumC1889770zHD enumC1889770zHD;
        InboxEntrancePod inboxEntrancePod;
        InboxEntranceCell inboxEntranceCell;
        boolean z2;
        boolean z3;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postCombinedData ");
        sbLIZ.append(C786410Ut5.u3());
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hasDMPushShowAboveSkylight = ");
        sbLIZ2.append(this.LLJJI);
        sbLIZ2.append(", hasDMPushShowBelowSkylight = ");
        sbLIZ2.append(this.LLJJ);
        sbLIZ2.append("，bulletBoardGuideShow = ");
        sbLIZ2.append(this.LLJJIJIIJIL);
        C624370OeJ.LIZIZ("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        ArrayList arrayList = new ArrayList();
        C895410ZAt c895410ZAt = this.LLLF;
        if (c895410ZAt != null) {
            arrayList.add(c895410ZAt);
        }
        C895420ZAu c895420ZAu = this.LLJILJIL;
        if (c895420ZAu != null) {
            arrayList.add(c895420ZAu);
        }
        C296840BkI.LIZ.getClass();
        if (C296840BkI.LIZ()) {
            if (this.LLJILJIL != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1440005kM.LIZ(new C1890440zII(z3));
        }
        if (!this.LLJJI && !this.LLJJIJIIJIL) {
            if (this.LLJJ) {
                if (this.LLJJJIL != 2 && this.LLJILJIL == null) {
                    arrayList.add(new C890720Yww(this.LLJJJIL));
                } else if (this.LLJJJJ) {
                    arrayList.add(new AbstractC895380ZAq() { // from class: X.0Ywm
                        public final int LLILLJJLI = 548;

                        @Override // X.InterfaceC887560Yrq
                        public final long getTimestampInInbox() {
                            return 0L;
                        }

                        @Override // X.AbstractC895380ZAq
                        public final boolean isUnread() {
                            return false;
                        }

                        @Override // X.InterfaceC1890700zIi
                        public final String itemUniqueId() {
                            return "dm_ai_group_shot_banner";
                        }

                        @Override // X.AbstractC895380ZAq
                        public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
                            return new C890610Ywl(548, 0L, this.type, false, this, null, 96);
                        }

                        @Override // X.InterfaceC1890700zIi
                        public final C0ZB9 biz() {
                            return C890710Ywv.LIZIZ;
                        }

                        @Override // X.InterfaceC887560Yrq
                        public final int getPriorityInInbox() {
                            return this.LLILLJJLI;
                        }

                        @Override // X.InterfaceC1890700zIi
                        public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
                            if (!(interfaceC1891350zJl instanceof C890620Ywm)) {
                                return C1600110rk1.LIZ("unknown");
                            }
                            return C1600110rk1.LIZJ();
                        }
                    });
                }
                C1440005kM.LIZIZ(new C1889120zGA(4));
            } else if (!C296840BkI.LIZ()) {
                if (!this.LLJJI && !this.LLJJIJIIJIL) {
                    if (C296730Bk7.LIZ() == 0) {
                        C1440005kM.LIZIZ(new C1889120zGA(3));
                    } else if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LIZLLL().contains(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
                        C1440005kM.LIZIZ(new C1889120zGA(3));
                    } else {
                        C1440005kM.LIZIZ(new C1889120zGA(1));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("MultiViewModel#getSkylightLiveGuidePod direct _skylightLiveGuidePod(isNull) = ");
                        if (this.LLJILLL == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        sbLIZ3.append(z2);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        int i2 = C1720306oT.LIZ;
                        SkylightLiveGuidePod skylightLiveGuidePod = this.LLJILLL;
                        if (skylightLiveGuidePod != null) {
                            arrayList.add(skylightLiveGuidePod);
                        }
                    }
                } else {
                    C1440005kM.LIZIZ(new C1889120zGA(2));
                }
            }
        }
        ActivityPod activityPod = this.LLJJLIIIJLLLLLLLZ;
        if (activityPod != null) {
            arrayList.add(activityPod);
        }
        arrayList.addAll(this.LLJL);
        C0ZBB c0zbb = this.LLJJIJIL.LIZ;
        if (c0zbb != null) {
            arrayList.add(c0zbb);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("postCombinedData before filter size = ");
        sbLIZ4.append(arrayList.size());
        C1720106oR.LJI("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ4));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC895380ZAq abstractC895380ZAq = (AbstractC895380ZAq) ListProtector.get(arrayList, i3);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("postCombinedData data = ");
            sbLIZ5.append(i3);
            sbLIZ5.append(' ');
            sbLIZ5.append(abstractC895380ZAq);
            C1720106oR.LJI("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ5));
            if (abstractC895380ZAq != null) {
                IAwemeNoticeAppDiffProtocol.LIZ.getClass();
                IAwemeNoticeAppDiffProtocol value = C1865510ye5.LIZIZ.getValue();
                if (abstractC895380ZAq instanceof InboxEntrancePod) {
                }
                value.LIZIZ();
                arrayList2.add(abstractC895380ZAq);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AbstractC895380ZAq abstractC895380ZAq2 = (AbstractC895380ZAq) next;
                if (!abstractC895380ZAq2.isDefaultPod && (abstractC895380ZAq2 instanceof InboxEntrancePod) && ((InboxEntrancePod) abstractC895380ZAq2).entranceCell.isSystemNoticeBox()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1904490zex c1904490zex = C1904490zex.LJFF;
        if (next != null) {
            enumC1889770zHD = EnumC1889770zHD.SUCCESS;
        } else {
            enumC1889770zHD = EnumC1889770zHD.EMPTY;
        }
        c1904490zex.LJIIJ("msg_box", enumC1889770zHD);
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("postCombinedData after filter size= ");
        sbLIZ6.append(arrayList2.size());
        C1720106oR.LJI("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ6));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((AbstractC895380ZAq) it3.next()).isLoading = z;
        }
        if (!z) {
            this.LLL = false;
        }
        List listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0OHv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                AbstractC895380ZAq abstractC895380ZAq3 = (AbstractC895380ZAq) obj;
                AbstractC895380ZAq abstractC895380ZAq4 = (AbstractC895380ZAq) obj2;
                if (abstractC895380ZAq4.getPriority$awemenotice_release() == abstractC895380ZAq3.getPriority$awemenotice_release()) {
                    return Intrinsics.LJII(abstractC895380ZAq4.getLastNoticeTime$awemenotice_release(), abstractC895380ZAq3.getLastNoticeTime$awemenotice_release());
                }
                return Intrinsics.LJI(abstractC895380ZAq4.getPriority$awemenotice_release(), abstractC895380ZAq3.getPriority$awemenotice_release());
            }
        }, arrayList2);
        if (C0CYK.LIZJ.LJIIIIZZ()) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : listLJLLLL) {
                AbstractC895380ZAq abstractC895380ZAq3 = (AbstractC895380ZAq) obj;
                if ((abstractC895380ZAq3 instanceof InboxEntrancePod) && (inboxEntrancePod = (InboxEntrancePod) abstractC895380ZAq3) != null && (inboxEntranceCell = inboxEntrancePod.entranceCell) != null && inboxEntranceCell.cellId == 15 && ((InboxEntrancePod) abstractC895380ZAq3).LIZLLL()) {
                    arrayList3.add(obj);
                } else {
                    arrayList4.add(obj);
                }
            }
            Pair pair = new Pair(arrayList3, arrayList4);
            List<? extends AbstractC895380ZAq> list = (List) pair.getFirst();
            C0DTR.LIZ(this.LLILLJJLI, pair.getSecond());
            WQ2(list);
            return;
        }
        C0DTR.LIZ(this.LLILLJJLI, listLJLLLL);
    }

    public final void QQ2(InboxEntrancePod inboxEntrancePod) {
        this.LLJL.remove(inboxEntrancePod);
        PQ2(false);
        C1901580zaG.LIZ.getClass();
        List<InboxEntranceCell> list = C1901580zaG.LIZLLL().LIZJ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            if (arrayList.remove(inboxEntrancePod.entranceCell)) {
                C1901580zaG.LJIIL(arrayList);
                return;
            }
            return;
        }
        C1901580zaG.LIZJ();
    }

    public final void WQ2(List<? extends AbstractC895380ZAq> list) {
        InboxEntrancePod inboxEntrancePod;
        InboxEntranceCell inboxEntranceCell;
        C0DTR.LIZ(this.LLILZ, list);
        ArrayList arrayList = new ArrayList();
        for (AbstractC895380ZAq abstractC895380ZAq : list) {
            if ((abstractC895380ZAq instanceof InboxEntrancePod) && (inboxEntrancePod = (InboxEntrancePod) abstractC895380ZAq) != null && (inboxEntranceCell = inboxEntrancePod.entranceCell) != null) {
                arrayList.add(inboxEntranceCell);
            }
        }
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(arrayList);
            if (strLJI == null) {
                return;
            }
            DQ2().storeString("notice_archive_entrance_cells", strLJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateArchivedItems failed, e:");
            sbLIZ.append(e);
            C1720106oR.LIZ("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void RQ2(String str, InboxEntrancePod inboxEntrancePod) {
        Object obj;
        String str2;
        String str3;
        Pair<Integer, String> pairLIZIZ = inboxEntrancePod.LIZIZ();
        int iIntValue = pairLIZIZ.getFirst().intValue();
        String second = pairLIZIZ.getSecond();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", "notification_page");
        pairArr[1] = new Pair("show_cnt", String.valueOf(iIntValue));
        pairArr[2] = new Pair("action_type", str);
        boolean z = inboxEntrancePod.isLoading;
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_loading", obj);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        List<KeyValueHolder> list = inboxEntrancePod.entranceCell.eventTrackingExtra;
        if (list != null) {
            for (KeyValueHolder keyValueHolder : list) {
                mapLJIIJ.put(keyValueHolder.key, keyValueHolder.value);
            }
        }
        Boolean pinStatus = inboxEntrancePod.entranceCell.getPinStatus();
        if (pinStatus != null) {
            if (pinStatus.booleanValue()) {
                str3 = "pin";
            } else {
                str3 = "unpin";
            }
            mapLJIIJ.put("pin_status", str3);
        }
        if (second != null) {
            mapLJIIJ.put("notice_type", second);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "inbox_activity_notice";
        if (inboxEntrancePod.entranceCell.isFollower()) {
            c259800zU.element = "inbox_follower_notice";
            if (C0ZC2.LIZ()) {
                str2 = "temporary";
            } else {
                str2 = "fixed";
            }
            mapLJIIJ.put("cell_type", str2);
        }
        if (inboxEntrancePod.entranceCell.isActivity()) {
            C1904150zeP.LIZ.getClass();
            if (((Boolean) LandInboxExperiment.LIZLLL.getValue()).booleanValue()) {
                if (C1904150zeP.LIZIZ.get()) {
                    str4 = "1";
                }
                mapLJIIJ.put("is_default_landing_inbox", str4);
            }
            if (C19212010Ec.LIZJ.LJJLIIIJLJLI()) {
                mapLJIIJ.put("activity_classification_status", "1");
            }
        }
        String str5 = C0NBD.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        mapLJIIJ.put("inbox_session_id", str5);
        mapLJIIJ.put("is_first_screen", String.valueOf(C1599780rjU.LIZ.LIZJ(inboxEntrancePod.uniqueItemIdForFirstScreen())));
        C20684815ws.LJFF().execute(new ARunnableS78S0200000_9(c259800zU, mapLJIIJ, 29));
    }

    public final InboxEntrancePod BQ2(int i, String str) {
        InboxEntrancePod inboxEntrancePod = null;
        if (C123100dR.LIZ(str)) {
            Iterator<InboxEntrancePod> it2 = this.LLJL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InboxEntrancePod next = it2.next();
                InboxEntranceCell inboxEntranceCell = next.entranceCell;
                if (inboxEntranceCell.cellId == i && Intrinsics.LJFF(inboxEntranceCell.entranceKey, str)) {
                    inboxEntrancePod = next;
                    break;
                }
            }
            return inboxEntrancePod;
        }
        Iterator<InboxEntrancePod> it3 = this.LLJL.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            InboxEntrancePod next2 = it3.next();
            if (next2.entranceCell.cellId == i) {
                inboxEntrancePod = next2;
                break;
            }
        }
        return inboxEntrancePod;
    }

    public final void LQ2(EnumC1902800zcE enumC1902800zcE, C0ZBB c0zbb) {
        boolean z;
        C1902750zc9 c1902750zc9 = this.LLJJIJIL;
        c1902750zc9.getClass();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_merge_follower_guide_offline_time", true) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C1902810zcF.LIZ[enumC1902800zcE.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LJI("FollowerEntranceHelper", "onFollowerGuideExitEvent: REAL_CELL_CLICK not affect guide");
                } else {
                    throw new C1954807lC();
                }
            } else {
                Keva kevaLIZ = C1902750zc9.LIZ();
                int i3 = kevaLIZ.getInt("follower_guide_close_count", 0) + 1;
                kevaLIZ.storeInt("follower_guide_close_count", i3);
                c1902750zc9.LIZJ = true;
                c1902750zc9.LIZ = null;
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("consumeGuideByUser count=");
                sbLIZ.append(i3);
                C1720106oR.LJI("FollowerEntranceHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            Boolean bool = c1902750zc9.LIZIZ;
            Boolean bool2 = Boolean.FALSE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                C1902750zc9.LIZ().storeBoolean("should_follower_guide_show", false);
                c1902750zc9.LIZIZ = bool2;
            }
            c1902750zc9.LIZ = null;
            int i5 = C2187451AjH.LIZ;
            C1720106oR.LJI("FollowerEntranceHelper", "permanentOfflineGuide");
        }
        int i6 = C1902780zcC.LIZ[enumC1902800zcE.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new C1954807lC();
                }
                return;
            } else {
                if (c0zbb != null) {
                    NQ2(c0zbb);
                }
                TQ2(9, null);
                return;
            }
        }
        if (c0zbb != null) {
            NQ2(c0zbb);
        }
    }

    public final void TQ2(int i, InboxEntrancePod inboxEntrancePod) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setClickFlag ");
        sbLIZ.append(i);
        C1720106oR.LJI("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLIIIIL = i;
        this.LLLIIIL = inboxEntrancePod;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r0 = X.C2187451AjH.LIZ;
        r1 = X.C2188811AlT.LIZ();
        r1.append("showEventWrapper, item=");
        r1.append(r4);
        r1.append(", list=");
        r1.append(FQ2());
        X.C2188811AlT.LIZIZ(r1);
        FQ2().add(r4);
        r5.invoke();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UQ2(X.AbstractC895380ZAq r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L46
            java.util.Set r0 = r3.FQ2()
            java.util.Iterator r2 = r0.iterator()
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0ZAq r0 = (X.AbstractC895380ZAq) r0
            boolean r0 = r0.isSameItem(r4)
            if (r0 == 0) goto La
            if (r1 != 0) goto L46
        L1f:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "showEventWrapper, item="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", list="
            r1.append(r0)
            java.util.Set r0 = r3.FQ2()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.util.Set r0 = r3.FQ2()
            r0.add(r4)
            r5.invoke()
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.UQ2(X.0ZAq, kotlin.jvm.functions.Function0):void");
    }

    public final void VQ2(InboxEntrancePod inboxEntrancePod, Function0<Unit> function0) {
        String str;
        Object next;
        InboxEntrancePod inboxEntrancePod2;
        String str2;
        String str3;
        String str4;
        C1600120rk2 c1600120rk2LIZJ;
        if (inboxEntrancePod != null) {
            Iterator<T> it2 = EQ2().iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (inboxEntrancePod.isSameItem(next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC895380ZAq abstractC895380ZAq = (AbstractC895380ZAq) next;
            if (abstractC895380ZAq != null) {
                EQ2().remove(abstractC895380ZAq);
            } else {
                abstractC895380ZAq = null;
            }
            if (abstractC895380ZAq instanceof InboxEntrancePod) {
                inboxEntrancePod2 = (InboxEntrancePod) abstractC895380ZAq;
            } else {
                inboxEntrancePod2 = null;
            }
            EQ2().add(inboxEntrancePod);
            if (inboxEntrancePod2 != null) {
                InboxEntranceCell inboxEntranceCell = inboxEntrancePod2.entranceCell;
                int i = inboxEntranceCell.unreadCount;
                InboxEntranceCell inboxEntranceCell2 = inboxEntrancePod.entranceCell;
                if (i != inboxEntranceCell2.unreadCount) {
                    c1600120rk2LIZJ = C1600110rk1.LIZ("unread_count");
                } else {
                    InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntranceCell.uiInfo;
                    if (inboxEntranceCellUIInfo != null) {
                        str2 = inboxEntranceCellUIInfo.title;
                    } else {
                        str2 = null;
                    }
                    InboxEntranceCellUIInfo inboxEntranceCellUIInfo2 = inboxEntranceCell2.uiInfo;
                    if (inboxEntranceCellUIInfo2 != null) {
                        str3 = inboxEntranceCellUIInfo2.title;
                    } else {
                        str3 = null;
                    }
                    if (!TextUtils.equals(str2, str3)) {
                        c1600120rk2LIZJ = C1600110rk1.LIZ("title");
                    } else {
                        InboxEntranceCellUIInfo inboxEntranceCellUIInfo3 = inboxEntrancePod2.entranceCell.uiInfo;
                        if (inboxEntranceCellUIInfo3 != null) {
                            str4 = inboxEntranceCellUIInfo3.content;
                        } else {
                            str4 = null;
                        }
                        InboxEntranceCellUIInfo inboxEntranceCellUIInfo4 = inboxEntrancePod.entranceCell.uiInfo;
                        if (inboxEntranceCellUIInfo4 != null) {
                            str = inboxEntranceCellUIInfo4.content;
                        }
                        if (!TextUtils.equals(str4, str)) {
                            c1600120rk2LIZJ = C1600110rk1.LIZ("content");
                        } else {
                            c1600120rk2LIZJ = C1600110rk1.LIZJ();
                        }
                    }
                }
                if (!c1600120rk2LIZJ.LIZ && inboxEntrancePod2.isLoading == inboxEntrancePod.isLoading) {
                    return;
                }
            }
            function0.invoke();
        }
    }

    public final void XQ2(int i, InboxEntrancePod inboxEntrancePod) {
        int i2;
        boolean z;
        InboxEntranceFunction next;
        CopyOnWriteArrayList<InboxEntrancePod> copyOnWriteArrayList = this.LLJL;
        InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
        InboxEntrancePod inboxEntrancePodBQ2 = BQ2(inboxEntranceCell.cellId, inboxEntranceCell.entranceKey);
        if (inboxEntrancePodBQ2 != null) {
            copyOnWriteArrayList.remove(inboxEntrancePodBQ2);
        }
        if (i == 50) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        InboxEntranceCell inboxEntranceCell2 = inboxEntrancePod.entranceCell;
        InboxEntranceCell inboxEntranceCellCopy = inboxEntranceCell2.copy(inboxEntranceCell2.cellId, i, inboxEntranceCell2.unreadCount, inboxEntranceCell2.uiInfo, inboxEntranceCell2.bizParams, inboxEntranceCell2.lastNoticeCreateTime, inboxEntranceCell2.canHide, inboxEntranceCell2.canPin, inboxEntranceCell2.filterType, inboxEntranceCell2.group, inboxEntranceCell2.systemNoticeType, inboxEntranceCell2.exposedInfo, inboxEntranceCell2.eventTrackingExtra, inboxEntranceCell2.beforeMarkUnreadCount, inboxEntranceCell2.beforeMarkUiInfo, inboxEntranceCell2.noticePreloadItem, inboxEntranceCell2.latestUnreadNoticeTime, inboxEntranceCell2.entranceKey, inboxEntranceCell2.functionList);
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        inboxEntranceCellCopy.setPinStatus(Boolean.valueOf(z));
        List<InboxEntranceFunction> list = inboxEntranceCellCopy.functionList;
        if (list != null) {
            Iterator<InboxEntranceFunction> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.functionType == C0ORP.PIN.getType()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InboxEntranceFunction inboxEntranceFunction = next;
            if (inboxEntranceFunction != null) {
                inboxEntranceFunction.setActionStatus(i2);
            }
        }
        OQ2(inboxEntrancePod.entranceCell, inboxEntranceCellCopy, true);
    }

    public final void yQ2(InboxEntrancePod inboxEntrancePod, boolean z) {
        EnumC1902790zcD enumC1902790zcD;
        this.LLJJIJIL.getClass();
        if (C0ZC2.LIZ() && (inboxEntrancePod instanceof C1902830zcH)) {
            if (C1902770zcB.LIZ(inboxEntrancePod.entranceCell)) {
                enumC1902790zcD = EnumC1902790zcD.KEEP;
            } else {
                enumC1902790zcD = EnumC1902790zcD.REMOVE;
            }
        } else {
            enumC1902790zcD = EnumC1902790zcD.NOT_HANDLED;
        }
        int i = C1902780zcC.LIZIZ[enumC1902790zcD.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    zQ2(this, inboxEntrancePod, null, z, false, 10);
                    return;
                }
                throw new C1954807lC();
            }
            InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
            C19719612Di.LJJIIJ(this.LLJL, new AwS593S0100000_14(inboxEntranceCell, 292), true);
            C1901580zaG.LIZ.getClass();
            List<InboxEntranceCell> list = C1901580zaG.LIZLLL().LIZJ;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list);
                C19719612Di.LJJIIJ(arrayList, new AwS593S0100000_14(inboxEntranceCell, 294), true);
                C1901580zaG.LJIIL(arrayList);
            } else {
                C1901580zaG.LIZJ();
            }
            if (!z) {
                return;
            }
            PQ2(false);
            return;
        }
        zQ2(this, inboxEntrancePod, null, z, true, 2);
    }

    public final void JQ2(Long l, List list, boolean z) {
        long jLongValue;
        InboxEntrancePod inboxEntrancePodBQ2;
        InboxEntranceCellUIInfo inboxEntranceCellUIInfoCopy;
        int iIntValue;
        if (list != null && !list.isEmpty() && l != null) {
            long jLongValue2 = l.longValue();
            Long l2 = this.LLJJJJJIL;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue2 <= jLongValue) {
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                EntranceCount entranceCount = (EntranceCount) it2.next();
                if (entranceCount.count > 0 && (inboxEntrancePodBQ2 = BQ2(entranceCount.entranceId, entranceCount.entranceKey)) != null) {
                    CopyOnWriteArrayList<InboxEntrancePod> copyOnWriteArrayList = this.LLJL;
                    ArrayList arrayList = new ArrayList();
                    for (InboxEntrancePod inboxEntrancePod : copyOnWriteArrayList) {
                        InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
                        if (inboxEntranceCell.cellId == entranceCount.entranceId && Intrinsics.LJFF(inboxEntranceCell.entranceKey, entranceCount.entranceKey)) {
                            arrayList.add(inboxEntrancePod);
                        }
                    }
                    this.LLJL.removeAll(C13LP.LLIIJI(arrayList));
                    InboxEntranceCell inboxEntranceCell2 = inboxEntrancePodBQ2.entranceCell;
                    int i = entranceCount.count;
                    InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntranceCell2.uiInfo;
                    if (inboxEntranceCellUIInfo != null) {
                        Integer num = entranceCount.showType;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        inboxEntranceCellUIInfoCopy = inboxEntranceCellUIInfo.copy(inboxEntranceCellUIInfo.uiStyle, inboxEntranceCellUIInfo.avatarImageUrl, inboxEntranceCellUIInfo.avatarImageUrlDark, inboxEntranceCellUIInfo.title, inboxEntranceCellUIInfo.content, iIntValue, inboxEntranceCellUIInfo.schemaUrl, inboxEntranceCellUIInfo.icons, inboxEntranceCellUIInfo.contentStruct, inboxEntranceCellUIInfo.previewUsers);
                    } else {
                        inboxEntranceCellUIInfoCopy = null;
                    }
                    InboxEntranceCell inboxEntranceCellCopy = inboxEntranceCell2.copy(inboxEntranceCell2.cellId, inboxEntranceCell2.priority, i, inboxEntranceCellUIInfoCopy, inboxEntranceCell2.bizParams, inboxEntranceCell2.lastNoticeCreateTime, inboxEntranceCell2.canHide, inboxEntranceCell2.canPin, inboxEntranceCell2.filterType, inboxEntranceCell2.group, inboxEntranceCell2.systemNoticeType, inboxEntranceCell2.exposedInfo, inboxEntranceCell2.eventTrackingExtra, inboxEntranceCell2.beforeMarkUnreadCount, inboxEntranceCell2.beforeMarkUiInfo, inboxEntranceCell2.noticePreloadItem, inboxEntranceCell2.latestUnreadNoticeTime, inboxEntranceCell2.entranceKey, inboxEntranceCell2.functionList);
                    VQ2(new InboxEntrancePod(inboxEntranceCellCopy, !C889930Yvf.LIZ.LJIIL(), false, false, 102), AFwS217S0000000_28.get$arr$(634));
                    OQ2(inboxEntrancePodBQ2.entranceCell, inboxEntranceCellCopy, false);
                }
            }
            if (z) {
                PQ2(false);
            }
        }
    }

    public final void OQ2(InboxEntranceCell inboxEntranceCell, InboxEntranceCell inboxEntranceCell2, boolean z) {
        this.LLJL.add(AQ2(inboxEntranceCell2));
        C1901580zaG.LIZ.getClass();
        List<InboxEntranceCell> list = C1901580zaG.LIZLLL().LIZJ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(inboxEntranceCell);
            arrayList.add(inboxEntranceCell2);
            C1901580zaG.LJIIL(arrayList);
        } else {
            C1901580zaG.LIZJ();
        }
        if (z) {
            PQ2(false);
        }
    }

    public final void SQ2(final String str, final String str2, final InboxEntrancePod inboxEntrancePod, Integer num) {
        String strValueOf;
        Object obj;
        Object obj2;
        String str3;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "notification_page");
        pairArr[1] = new Pair("action_type", str);
        boolean zLIZJ = C1902710zc5.LIZJ();
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (zLIZJ) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(inboxEntrancePod.entranceCell.unreadCount);
        }
        pairArr[2] = new Pair("show_cnt", strValueOf);
        pairArr[3] = new Pair("type", str2);
        if (inboxEntrancePod.isLoading) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("is_loading", obj);
        final Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.put("notice_type", inboxEntrancePod.LIZIZ().getSecond());
        List<KeyValueHolder> list = inboxEntrancePod.entranceCell.eventTrackingExtra;
        if (list != null) {
            for (KeyValueHolder keyValueHolder : list) {
                mapLJIIJ.put(keyValueHolder.key, keyValueHolder.value);
            }
        }
        C0ZBF muteStatus = inboxEntrancePod.entranceCell.getMuteStatus();
        if (muteStatus != null) {
            mapLJIIJ.put("mute_status", muteStatus.getEventName());
        }
        Boolean pinStatus = inboxEntrancePod.entranceCell.getPinStatus();
        if (pinStatus != null) {
            if (pinStatus.booleanValue()) {
                str3 = "pin";
            } else {
                str3 = "unpin";
            }
            mapLJIIJ.put("pin_status", str3);
        }
        Boolean archiveStatus = inboxEntrancePod.entranceCell.getArchiveStatus();
        if (archiveStatus != null) {
            archiveStatus.booleanValue();
            if (inboxEntrancePod.LIZLLL()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLJIIJ.put("is_archived", obj2);
        }
        if (num != null) {
            mapLJIIJ.put("client_order", String.valueOf(num.intValue()));
        }
        if (inboxEntrancePod.entranceCell.isWorkBench()) {
            mapLJIIJ.put("cell_type", "brand_partnership");
        }
        if (inboxEntrancePod.isLoading) {
            str4 = "1";
        }
        mapLJIIJ.put("is_loading", str4);
        mapLJIIJ.put("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
        String str5 = C0NBD.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        mapLJIIJ.put("inbox_session_id", str5);
        mapLJIIJ.put("is_first_screen", String.valueOf(C1599780rjU.LIZ.LIZJ(inboxEntrancePod.uniqueItemIdForFirstScreen())));
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0zcm
            public final void LIZ() {
                String str6;
                Uri uri;
                String strLIZIZ;
                Integer numLJIIJJI;
                ITakoMob iTakoMobLJJJLL;
                int i;
                C20684815ws.LJIILLIIL("inbox_message_cell", mapLJIIJ);
                if (inboxEntrancePod.entranceCell.cellId == 7 && (i = this.LLLIIII) >= 0) {
                    mapLJIIJ.put("rank", String.valueOf(i));
                    C1336205Ku.LIZ(false).getInboxAnalytics().LIZIZ(mapLJIIJ);
                }
                boolean z = true;
                if (Intrinsics.LJFF(str, "show") && inboxEntrancePod.entranceCell.isTako()) {
                    ITakoService iTakoService = (ITakoService) this.LLJZIJLIL.getValue();
                    if (iTakoService != null && (iTakoMobLJJJLL = iTakoService.LJJJLL()) != null) {
                        String strLJJIIZ = C14TF.LIZIZ.LJJIIZ();
                        String strValueOf2 = String.valueOf(inboxEntrancePod.entranceCell.unreadCount);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        InboxEntrancePod inboxEntrancePod2 = inboxEntrancePod;
                        C1246360iXS c1246360iXS = C1902890zcN.LIZ;
                        String strLIZJ = C1902890zcN.LIZJ(inboxEntrancePod2.entranceCell);
                        if (strLIZJ != null && strLIZJ.length() > 0) {
                            linkedHashMap.put("push_id", strLIZJ);
                        }
                        Map mapLIZIZ = C1902890zcN.LIZIZ(inboxEntrancePod2.entranceCell);
                        if (mapLIZIZ != null && (!mapLIZIZ.isEmpty())) {
                            linkedHashMap.putAll(mapLIZIZ);
                        }
                        iTakoMobLJJJLL.mobTikbotEntranceShow(strLJJIIZ, "message_cell", null, null, false, strValueOf2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, false);
                    }
                    ITakoService iTakoService2 = (ITakoService) this.LLJZIJLIL.getValue();
                    if (iTakoService2 != null) {
                        iTakoService2.LJJJJLI(inboxEntrancePod.entranceCell.unreadCount > 0);
                    }
                }
                InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
                int i2 = inboxEntranceCell.cellId;
                if (i2 == 10 || i2 == 15) {
                    try {
                        InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntranceCell.uiInfo;
                        if (inboxEntranceCellUIInfo == null || (str6 = inboxEntranceCellUIInfo.schemaUrl) == null || (strLIZIZ = C1907940zkW.LIZIZ((uri = UriProtector.parse(str6)), "bulletin_board_id")) == null) {
                            return;
                        }
                        String strLIZIZ2 = C1907940zkW.LIZIZ(uri, "bulletin_account_status");
                        int iIntValue = (strLIZIZ2 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ2)) == null) ? 1 : numLJIIJJI.intValue();
                        String strLIZIZ3 = C1907940zkW.LIZIZ(uri, "previous_page");
                        if (strLIZIZ3 == null) {
                            strLIZIZ3 = "";
                        }
                        mapLJIIJ.put("enter_from", strLIZIZ3);
                        if (Intrinsics.LJFF(str, "click")) {
                            Map<String, String> map = mapLJIIJ;
                            String str7 = str2;
                            map.put("click_type", Intrinsics.LJFF(str7, "enter_box") ? "enter_cell" : Intrinsics.LJFF(str7, "delete") ? "delete_click" : str2);
                        }
                        if (inboxEntrancePod.entranceCell.cellId != 10) {
                            z = false;
                            mapLJIIJ.put("is_subscribed", "1");
                        }
                        mapLJIIJ.put("channel_status", String.valueOf(iIntValue));
                        C0OPQ c0opq = C0OPQ.LIZ;
                        Map<String, String> map2 = mapLJIIJ;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        c0opq.getClass();
                        C0OPQ.LJ(boolValueOf, strLIZIZ, map2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C0OPX.LJII("entrance cell report failed");
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiViewModel@a25.reportInboxEntranceAction$6");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiViewModel@a25.reportInboxEntranceAction$6");
            }
        });
    }

    public static void zQ2(MultiViewModel multiViewModel, InboxEntrancePod inboxEntrancePod, String str, boolean z, boolean z2, int i) {
        InboxEntranceExposedInfo inboxEntranceExposedInfoCopy;
        boolean z3 = z;
        String str2 = str;
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        multiViewModel.getClass();
        if (!z2 && C0ZC2.LIZ() && (inboxEntrancePod instanceof C1902830zcH)) {
            return;
        }
        InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
        if (inboxEntranceCell.unreadCount == 0 && inboxEntranceCell.beforeMarkUnreadCount == 0) {
            return;
        }
        CopyOnWriteArrayList<InboxEntrancePod> copyOnWriteArrayList = multiViewModel.LLJL;
        ArrayList arrayList = new ArrayList();
        for (InboxEntrancePod inboxEntrancePod2 : copyOnWriteArrayList) {
            InboxEntranceCell inboxEntranceCell2 = inboxEntrancePod2.entranceCell;
            int i2 = inboxEntranceCell2.cellId;
            InboxEntranceCell inboxEntranceCell3 = inboxEntrancePod.entranceCell;
            if (i2 == inboxEntranceCell3.cellId && Intrinsics.LJFF(inboxEntranceCell2.entranceKey, inboxEntranceCell3.entranceKey)) {
                arrayList.add(inboxEntrancePod2);
            }
        }
        multiViewModel.LLJL.removeAll(C13LP.LLIIJI(arrayList));
        InboxEntranceExposedInfo inboxEntranceExposedInfo = inboxEntrancePod.entranceCell.exposedInfo;
        InboxEntranceCellUIInfo inboxEntranceCellUIInfoCopy = null;
        if (inboxEntranceExposedInfo != null) {
            inboxEntranceExposedInfoCopy = inboxEntranceExposedInfo.copy(inboxEntranceExposedInfo.notices, null, inboxEntranceExposedInfo.nextUnreadNoticePriority);
        } else {
            inboxEntranceExposedInfoCopy = null;
        }
        Pair pair = new Pair(0, 0);
        if (a0.LJJJIL(str2)) {
            InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntrancePod.entranceCell.uiInfo;
            if (inboxEntranceCellUIInfo != null) {
                inboxEntranceCellUIInfoCopy = inboxEntranceCellUIInfo.copy(inboxEntranceCellUIInfo.uiStyle, inboxEntranceCellUIInfo.avatarImageUrl, inboxEntranceCellUIInfo.avatarImageUrlDark, inboxEntranceCellUIInfo.title, inboxEntranceCellUIInfo.content, ((Number) pair.getSecond()).intValue(), inboxEntranceCellUIInfo.schemaUrl, inboxEntranceCellUIInfo.icons, inboxEntranceCellUIInfo.contentStruct, inboxEntranceCellUIInfo.previewUsers);
            }
        } else {
            InboxEntranceCellUIInfo inboxEntranceCellUIInfo2 = inboxEntrancePod.entranceCell.uiInfo;
            if (inboxEntranceCellUIInfo2 != null) {
                inboxEntranceCellUIInfoCopy = inboxEntranceCellUIInfo2.copy(inboxEntranceCellUIInfo2.uiStyle, inboxEntranceCellUIInfo2.avatarImageUrl, inboxEntranceCellUIInfo2.avatarImageUrlDark, inboxEntranceCellUIInfo2.title, str2, ((Number) pair.getSecond()).intValue(), inboxEntranceCellUIInfo2.schemaUrl, inboxEntranceCellUIInfo2.icons, inboxEntranceCellUIInfo2.contentStruct, inboxEntranceCellUIInfo2.previewUsers);
            }
        }
        InboxEntranceCell inboxEntranceCell4 = inboxEntrancePod.entranceCell;
        InboxEntranceCell inboxEntranceCellCopy = inboxEntranceCell4.copy(inboxEntranceCell4.cellId, inboxEntranceCell4.priority, ((Number) pair.getFirst()).intValue(), inboxEntranceCellUIInfoCopy, inboxEntranceCell4.bizParams, inboxEntranceCell4.lastNoticeCreateTime, inboxEntranceCell4.canHide, inboxEntranceCell4.canPin, inboxEntranceCell4.filterType, inboxEntranceCell4.group, inboxEntranceCell4.systemNoticeType, inboxEntranceExposedInfoCopy, inboxEntranceCell4.eventTrackingExtra, 0, inboxEntranceCell4.beforeMarkUiInfo, inboxEntranceCell4.noticePreloadItem, inboxEntranceCell4.latestUnreadNoticeTime, inboxEntranceCell4.entranceKey, inboxEntranceCell4.functionList);
        multiViewModel.VQ2(new InboxEntrancePod(inboxEntranceCellCopy, !C889930Yvf.LIZ.LJIIL(), false, false, 102), AFwS217S0000000_28.get$arr$(632));
        multiViewModel.OQ2(inboxEntrancePod.entranceCell, inboxEntranceCellCopy, z3);
    }
}
