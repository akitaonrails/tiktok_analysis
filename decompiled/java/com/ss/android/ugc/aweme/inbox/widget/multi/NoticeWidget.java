package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC1903430zdF;
import X.AbstractC895380ZAq;
import X.C01GW;
import X.C09JN;
import X.C0BM5;
import X.C0C39;
import X.C0OKV;
import X.C0OOE;
import X.C0ORP;
import X.C0QSJ;
import X.C0Z32;
import X.C0ZBB;
import X.C1057400dcg;
import X.C1204000hR8;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C15438062q;
import X.C1558520qew;
import X.C1598660rhg;
import X.C1599120riQ;
import X.C1619080sEc;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1900840zZ4;
import X.C1902740zc8;
import X.C1902830zcH;
import X.C1902910zcP;
import X.C1902920zcQ;
import X.C1902940zcS;
import X.C1902970zcV;
import X.C1903130zcl;
import X.C1903400zdC;
import X.C1903460zdI;
import X.C1903610zdX;
import X.C1903780zdo;
import X.C1903860zdw;
import X.C1903880zdy;
import X.C1904220zeW;
import X.C19328310jZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252408s6;
import X.C23250099c;
import X.C296730Bk7;
import X.C296840BkI;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C824390WVp;
import X.C890620Ywm;
import X.C890660Ywq;
import X.C890690Ywt;
import X.C890720Yww;
import X.C895410ZAt;
import X.C895420ZAu;
import X.EnumC1593290rZ1;
import X.EnumC1902760zcA;
import X.EnumC1904380zem;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.AObserverS230S0100000_28;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.multiapp.ISystemPushInboxBannerAppDiffService;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceCount;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.aweme.story.widget.IStoryWidgetService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeWidget extends InboxWidget implements InboxAbilityCenter$INoticeWidgetAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public volatile InboxAbilityCenter$IInboxImFilterAbility LLJJIII;
    public InterfaceC665370Q7z LLJJIJI;
    public C0QSJ LLJJIJIIJIL;
    public final int LLIZLLLIL = 1;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1060));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(223));
    public final AwS572S0100000_28 LLJJ = new AwS572S0100000_28(this, 266);
    public final AwS572S0100000_28 LLJJI = new AwS572S0100000_28(this, 265);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NoticeWidget.class, "inboxImFilterAbility", "getInboxImFilterAbility()Lcom/ss/android/ugc/aweme/inbox/widget/v2/ability/InboxAbilityCenter$IInboxImFilterAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        new Object() { // from class: X.0zcX
        };
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility
    public final void IO0() {
        this.LLJILJIL = true;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InboxFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InboxFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -108806088) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        C296840BkI.LIZ.getClass();
        return C296840BkI.LIZ() ? C1697810uHb.LJIIJJI(C13LE.LIZ(C890660Ywq.class), C13LE.LIZ(C890690Ywt.class), C13LE.LIZ(ActivityPod.class), C13LE.LIZ(C895420ZAu.class), C13LE.LIZ(C0ZBB.class), C13LE.LIZ(C1902830zcH.class), C13LE.LIZ(InboxEntrancePod.class), C13LE.LIZ(C895410ZAt.class)) : C1697810uHb.LJIIJJI(C13LE.LIZ(C890660Ywq.class), C13LE.LIZ(C890690Ywt.class), C13LE.LIZ(SkylightLiveGuidePod.class), C13LE.LIZ(C890720Yww.class), C13LE.LIZ(ActivityPod.class), C13LE.LIZ(C895420ZAu.class), C13LE.LIZ(C0ZBB.class), C13LE.LIZ(C1902830zcH.class), C13LE.LIZ(InboxEntrancePod.class), C13LE.LIZ(C890620Ywm.class), C13LE.LIZ(C895410ZAt.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility Ho() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJIII
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJIII     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJI = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope> r1 = com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIIJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = (com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJIII = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.NoticeWidget.Ho():com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility");
    }

    public final MultiViewModel Jo() {
        return (MultiViewModel) this.LLJ.getValue();
    }

    public final void Oo() {
        MultiViewModel multiViewModelJo;
        C1903610zdX.LIZ.getClass();
        if (!C1903610zdX.LIZ() || (multiViewModelJo = Jo()) == null || !C1903610zdX.LIZ() || multiViewModelJo.LLJILJIL == null) {
            return;
        }
        C1903130zcl c1903130zcl = (C1903130zcl) multiViewModelJo.LLJILJILJ.getValue();
        c1903130zcl.getClass();
        if (C1903610zdX.LIZIZ().exposureWindowHours != 0) {
            long j = c1903130zcl.LIZ().getLong("last_exposure_timestamp", 0L);
            if (j != 0) {
                long j2 = 60;
                if (System.currentTimeMillis() - j <= ((long) C1903610zdX.LIZIZ().exposureWindowHours) * j2 * j2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT) || ((C1903130zcl) multiViewModelJo.LLJILJILJ.getValue()).LIZIZ()) {
                    return;
                }
                multiViewModelJo.LLJILJIL = null;
                multiViewModelJo.PQ2(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        NoticeList noticeList;
        Long l;
        MutableLiveData mutableLiveData;
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$INoticeWidgetAbility.class, null, null);
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            inboxAbilityCenter$IInboxFragmentAbility.pE(this.LLJJ, this.LLJJI);
        }
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null && (mutableLiveData = multiViewModelJo.LLILLL) != null) {
            mutableLiveData.observe(this, new AObserverS230S0100000_28(this, 76));
        }
        ISystemPushInboxBannerAppDiffService.LIZ.getClass();
        C1902920zcQ.LIZ().LIZ();
        C1903880zdy.LIZ.getClass();
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(250);
        C1903860zdw c1903860zdw = C1903880zdy.LIZIZ;
        if (c1903860zdw != null) {
            aFwS271S0000000_28.invoke(c1903860zdw);
        }
        MultiViewModel multiViewModelJo2 = Jo();
        if (multiViewModelJo2 != null) {
            if (multiViewModelJo2.LLJL.isEmpty()) {
                EnumC1904380zem.ENTRANCE_LIST_IS_PRELOAD.setValue((Object) 0);
                multiViewModelJo2.HQ2();
            } else {
                EnumC1904380zem.ENTRANCE_LIST_IS_PRELOAD.setValue((Object) 1);
            }
            if (((Number) C0BM5.LIZ.getValue()).intValue() > 0) {
                C1904220zeW.LL.getClass();
                List<EntranceCount> list = C1904220zeW.LLJILJILJ;
                if (list != null && (l = C1904220zeW.LLJILLL) != null) {
                    multiViewModelJo2.JQ2(Long.valueOf(l.longValue()), list, false);
                }
            }
            multiViewModelJo2.PQ2(true);
            multiViewModelJo2.LLJZ = PreloadManager.LIZ();
            if (C0C39.LIZ() && !multiViewModelJo2.LLJZ && (noticeList = PreloadManager.LIZJ.get()) != null) {
                C1903780zdo.LJII().LJJI(noticeList).LJJLL(new C09JN() { // from class: X.00ra
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("MultiViewModel@a25.handleInboxUnreadCount$1$1");
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("rxInitNoticeCount,onNext result = ");
                        sbLIZ.append(obj);
                        C1720106oR.LJI("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("MultiViewModel@a25.handleInboxUnreadCount$1$1");
                    }
                }, new C09JN() { // from class: X.00rb
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("MultiViewModel@a25.handleInboxUnreadCount$1$2");
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("rxInitNoticeCount,onError result = ");
                        sbLIZ.append(obj);
                        C1720106oR.LJI("MultiViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("MultiViewModel@a25.handleInboxUnreadCount$1$2");
                    }
                });
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(multiViewModelJo2), null, null, new C1057400dcg(multiViewModelJo2, null), 3);
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LIZIZ("NOTIFICATION", EnumC1593290rZ1.VIEW, false);
            }
        }
        MultiViewModel multiViewModelJo3 = Jo();
        if (multiViewModelJo3 != null) {
            multiViewModelJo3.MQ2(EnumC1902760zcA.SWITCH_TAB_REFRESH);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        MutableLiveData mutableLiveData;
        List<InterfaceC1891350zJl> list;
        MultiViewModel multiViewModelJo;
        MutableLiveData mutableLiveData2;
        List list2;
        InboxAbilityCenter$IInboxImFilterAbility inboxAbilityCenter$IInboxImFilterAbilityHo = Ho();
        if (inboxAbilityCenter$IInboxImFilterAbilityHo == null || !Intrinsics.LJFF(inboxAbilityCenter$IInboxImFilterAbilityHo.Ef2((Pair) inboxAbilityCenter$IInboxImFilterAbilityHo.jp2().getValue()), Boolean.TRUE) || (multiViewModelJo = Jo()) == null || (mutableLiveData2 = multiViewModelJo.LLILLL) == null || (list2 = (List) mutableLiveData2.getValue()) == null) {
            MultiViewModel multiViewModelJo2 = Jo();
            return (multiViewModelJo2 == null || (mutableLiveData = multiViewModelJo2.LLILLL) == null || (list = (List) mutableLiveData.getValue()) == null) ? C13BV.INSTANCE : list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((AbstractC895380ZAq) obj).getPriorityInInbox() >= 540) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean No() {
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        return inboxAbilityCenter$IInboxFragmentAbility != null && inboxAbilityCenter$IInboxFragmentAbility.zE1(C724240Sb0.LJI(this));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        this.LLJI = true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            inboxAbilityCenter$IInboxFragmentAbility.ZE1(this.LLJJ, this.LLJJI);
        }
        C1558520qew.LJIIJ(this, InboxFragmentScope.class, InboxAbilityCenter$INoticeWidgetAbility.class, null);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJILJILJ = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        MultiViewModel multiViewModelJo;
        MultiViewModel multiViewModelJo2;
        boolean zLJI = MethodIDManager.LJI(71905);
        super.onResume();
        this.LLJILJILJ = true;
        if (this.LLJI) {
            this.LLJI = false;
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("NoticeWidget", "onResume by created");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!No()) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("NoticeWidget", "onResume but not in inbox tab");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1598660rhg.LIZ.getClass();
        SkylightListViewModel skylightListViewModelLJII = C1598660rhg.LJII(this);
        boolean z = skylightListViewModelLJII.LLJ != null;
        skylightListViewModelLJII.LLJ = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume hasNewNotice=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", backFromStoryPlayer=");
        sbLIZ.append(z);
        sbLIZ.append(", noticeDeleted=");
        MultiViewModel multiViewModelJo3 = Jo();
        sbLIZ.append(multiViewModelJo3 != null ? Boolean.valueOf(multiViewModelJo3.LLLFFI) : null);
        sbLIZ.append(", noticeUpdate=");
        MultiViewModel multiViewModelJo4 = Jo();
        sbLIZ.append(multiViewModelJo4 != null ? Boolean.valueOf(multiViewModelJo4.LLLFZ) : null);
        C1720106oR.LJI("NoticeWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (z && getContext() != null) {
            ((IStoryWidgetService) this.LLJILLL.getValue()).LIZ();
        }
        MultiViewModel multiViewModelJo5 = Jo();
        if (multiViewModelJo5 != null && multiViewModelJo5.LLJJJ && C824390WVp.LIZJ(getContext()) && C19328310jZ.LIZIZ.LIZJ() && (multiViewModelJo2 = Jo()) != null) {
            multiViewModelJo2.KQ2();
        }
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            C1903880zdy.LIZ.getClass();
            AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(250);
            C1903860zdw c1903860zdw = C1903880zdy.LIZIZ;
            if (c1903860zdw != null) {
                aFwS271S0000000_28.invoke(c1903860zdw);
            }
            MultiViewModel multiViewModelJo6 = Jo();
            if (multiViewModelJo6 != null) {
                multiViewModelJo6.MQ2(EnumC1902760zcA.BACK_TO_FRONT);
            }
        } else {
            MultiViewModel multiViewModelJo7 = Jo();
            if ((multiViewModelJo7 == null || !multiViewModelJo7.LLLFFI) && ((multiViewModelJo = Jo()) == null || !multiViewModelJo.LLLFZ)) {
                MultiViewModel multiViewModelJo8 = Jo();
                if (C1903400zdC.LIZ(multiViewModelJo8 != null ? multiViewModelJo8.LLLFF : 0L)) {
                    C1903880zdy.LIZ.getClass();
                    AFwS271S0000000_28 aFwS271S0000000_282 = AFwS271S0000000_28.get$arr$(250);
                    C1903860zdw c1903860zdw2 = C1903880zdy.LIZIZ;
                    if (c1903860zdw2 != null) {
                        aFwS271S0000000_282.invoke(c1903860zdw2);
                    }
                    MultiViewModel multiViewModelJo9 = Jo();
                    if (multiViewModelJo9 != null) {
                        multiViewModelJo9.MQ2(EnumC1902760zcA.BACK_TO_FRONT);
                    }
                } else {
                    MultiViewModel multiViewModelJo10 = Jo();
                    if (multiViewModelJo10 != null && multiViewModelJo10.LLLIIIIL != 0) {
                        C2252408s6.LJIIJ("localRefresh", new AwS572S0100000_28(multiViewModelJo10, 855));
                    }
                    C1598660rhg.LJII(this).setState(AFwS264S0000000_24.get$arr$(748));
                }
            } else {
                C1903880zdy.LIZ.getClass();
                AFwS271S0000000_28 aFwS271S0000000_283 = AFwS271S0000000_28.get$arr$(250);
                C1903860zdw c1903860zdw3 = C1903880zdy.LIZIZ;
                if (c1903860zdw3 != null) {
                    aFwS271S0000000_283.invoke(c1903860zdw3);
                }
                MultiViewModel multiViewModelJo11 = Jo();
                if (multiViewModelJo11 != null) {
                    multiViewModelJo11.MQ2(EnumC1902760zcA.BACK_TO_FRONT);
                }
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility
    public final void H7(int i) {
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            multiViewModelJo.LLJJJ = true;
            multiViewModelJo.LLJJJIL = i;
            multiViewModelJo.PQ2(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility
    public final void Wx(boolean z) {
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            multiViewModelJo.LLJJIJIIJIL = z;
            multiViewModelJo.PQ2(false);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFollowRequestFinished(C1903460zdI c1903460zdI) {
        Jo();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveNoticeReceive(C1599120riQ c1599120riQ) {
        List<InboxLiveNotice> list = c1599120riQ.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InboxLiveNotice inboxLiveNotice : list) {
            arrayList.add(new InboxLiveNotice(inboxLiveNotice.user, inboxLiveNotice.type, inboxLiveNotice.roomInfo, false, 0, false, System.currentTimeMillis()));
        }
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            if (C296730Bk7.LIZ() != 2) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    User user = ((InboxLiveNotice) obj).user;
                    if (user == null || user.getFollowStatus() != 2) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            multiViewModelJo.LLJILLL = new SkylightLiveGuidePod(arrayList);
            multiViewModelJo.PQ2(false);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMarkEntranceReadEvent(C1902910zcP c1902910zcP) {
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            multiViewModelJo.JQ2(c1902910zcP.LIZIZ, c1902910zcP.LIZ, true);
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangedEvent(C1619080sEc c1619080sEc) {
        if (c1619080sEc.LIZJ != 2) {
            return;
        }
        int i = c1619080sEc.LIZLLL;
        if (i == 301) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("NoticeWidget", "refactor notice count init finish");
            return;
        }
        if (i != 201) {
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRedPointUpdate isResume=");
        sbLIZ.append(this.LLJILJILJ);
        C1720106oR.LJI("NoticeWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJILJILJ && No()) {
            C1720106oR.LJI("NoticeWidget", "onRedPointUpdate need refresh");
            this.LLJIJIL = false;
            MultiViewModel multiViewModelJo = Jo();
            if (multiViewModelJo != null) {
                multiViewModelJo.MQ2(EnumC1902760zcA.NOTICE_COUNT_KEEP_ALIVE);
                return;
            }
            return;
        }
        this.LLJIJIL = true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoticeDeleted(C1900840zZ4 c1900840zZ4) {
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            multiViewModelJo.LLLFFI = true;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoticeUpdate(C0OKV c0okv) {
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            multiViewModelJo.LLLFZ = true;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRefreshEntranceEvent(C0OOE c0ooe) {
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            multiViewModelJo.MQ2(EnumC1902760zcA.INBOX_BACKGROUND_REFRESH);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRefreshSpecificEntranceEvent(C1902940zcS c1902940zcS) {
        InboxEntrancePod inboxEntrancePodBQ2;
        MultiViewModel multiViewModelJo;
        InboxEntrancePod next;
        MultiViewModel multiViewModelJo2 = Jo();
        if (multiViewModelJo2 != null && (inboxEntrancePodBQ2 = multiViewModelJo2.BQ2(c1902940zcS.LIZ, c1902940zcS.LIZLLL)) != null) {
            int i = c1902940zcS.LIZIZ;
            if (i == C0ORP.MUTE.getType()) {
                MultiViewModel multiViewModelJo3 = Jo();
                if (multiViewModelJo3 != null) {
                    C1902740zc8 c1902740zc8 = C1902740zc8.LIZ;
                    int i2 = c1902940zcS.LIZJ;
                    c1902740zc8.getClass();
                    InboxEntranceCell inboxEntranceCellLIZLLL = C1902740zc8.LIZLLL(i2, inboxEntrancePodBQ2);
                    CopyOnWriteArrayList<InboxEntrancePod> copyOnWriteArrayList = multiViewModelJo3.LLJL;
                    InboxEntranceCell inboxEntranceCell = inboxEntrancePodBQ2.entranceCell;
                    InboxEntrancePod inboxEntrancePodBQ22 = multiViewModelJo3.BQ2(inboxEntranceCell.cellId, inboxEntranceCell.entranceKey);
                    if (inboxEntrancePodBQ22 != null) {
                        copyOnWriteArrayList.remove(inboxEntrancePodBQ22);
                    }
                    multiViewModelJo3.OQ2(inboxEntrancePodBQ2.entranceCell, inboxEntranceCellLIZLLL, true);
                }
                C1904220zeW c1904220zeW = C1904220zeW.LL;
                InboxEntranceCell inboxEntranceCell2 = inboxEntrancePodBQ2.entranceCell;
                int i3 = inboxEntranceCell2.group;
                int i4 = c1902940zcS.LIZJ;
                int i5 = inboxEntranceCell2.filterType;
                c1904220zeW.getClass();
                C1904220zeW.LJJIIJ(i3, i4, i5);
                InboxEntranceCell inboxEntranceCell3 = inboxEntrancePodBQ2.entranceCell;
                C1904220zeW.LJJIII(new EntranceKey(inboxEntranceCell3.cellId, inboxEntranceCell3.entranceKey), c1902940zcS.LIZJ);
                return;
            }
            int i6 = 0;
            if (i == C0ORP.PIN.getType()) {
                if (c1902940zcS.LIZJ == 1) {
                    i6 = 50;
                }
                MultiViewModel multiViewModelJo4 = Jo();
                if (multiViewModelJo4 == null) {
                    return;
                }
                multiViewModelJo4.XQ2(i6, inboxEntrancePodBQ2);
                return;
            }
            if (i == C0ORP.DELETE.getType()) {
                MultiViewModel multiViewModelJo5 = Jo();
                if (multiViewModelJo5 == null) {
                    return;
                }
                int i7 = c1902940zcS.LIZ;
                String str = c1902940zcS.LIZLLL;
                Iterator<InboxEntrancePod> it2 = multiViewModelJo5.LLJL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        InboxEntranceCell inboxEntranceCell4 = next.entranceCell;
                        if (inboxEntranceCell4.cellId == i7 && Intrinsics.LJFF(inboxEntranceCell4.entranceKey, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InboxEntrancePod inboxEntrancePod = next;
                if (inboxEntrancePod == null || inboxEntrancePod.entranceCell.isActivity() || inboxEntrancePod.entranceCell.isFollower()) {
                    return;
                }
                InboxEntranceCell inboxEntranceCell5 = inboxEntrancePod.entranceCell;
                int i8 = inboxEntranceCell5.filterType;
                if (i8 != Integer.MIN_VALUE) {
                    C1903780zdo.LIZLLL(i8);
                } else {
                    int i9 = inboxEntranceCell5.group;
                    if (i9 != 0) {
                        C1903780zdo.LIZJ(i9);
                    }
                }
                InboxEntranceCell inboxEntranceCell6 = inboxEntrancePod.entranceCell;
                C1903780zdo.LIZIZ(new EntranceKey(inboxEntranceCell6.cellId, inboxEntranceCell6.entranceKey));
                multiViewModelJo5.QQ2(inboxEntrancePod);
                return;
            }
            if (i == C0ORP.ARCHIVE.getType()) {
                MultiViewModel multiViewModelJo6 = Jo();
                if (multiViewModelJo6 != null) {
                    C1902740zc8 c1902740zc82 = C1902740zc8.LIZ;
                    int i10 = c1902940zcS.LIZJ;
                    c1902740zc82.getClass();
                    InboxEntranceCell inboxEntranceCellLIZJ = C1902740zc8.LIZJ(i10, inboxEntrancePodBQ2);
                    CopyOnWriteArrayList<InboxEntrancePod> copyOnWriteArrayList2 = multiViewModelJo6.LLJL;
                    InboxEntranceCell inboxEntranceCell7 = inboxEntrancePodBQ2.entranceCell;
                    InboxEntrancePod inboxEntrancePodBQ23 = multiViewModelJo6.BQ2(inboxEntranceCell7.cellId, inboxEntranceCell7.entranceKey);
                    if (inboxEntrancePodBQ23 != null) {
                        copyOnWriteArrayList2.remove(inboxEntrancePodBQ23);
                    }
                    multiViewModelJo6.OQ2(inboxEntrancePodBQ2.entranceCell, inboxEntranceCellLIZJ, true);
                }
                C1904220zeW c1904220zeW2 = C1904220zeW.LL;
                InboxEntranceCell inboxEntranceCell8 = inboxEntrancePodBQ2.entranceCell;
                EntranceKey entranceKey = new EntranceKey(inboxEntranceCell8.cellId, inboxEntranceCell8.entranceKey);
                int i11 = c1902940zcS.LIZJ;
                c1904220zeW2.getClass();
                C1904220zeW.LJJII(entranceKey, i11);
                return;
            }
            if (i != C0ORP.CLEAR_UNREAD.getType() || (multiViewModelJo = Jo()) == null) {
                return;
            }
            multiViewModelJo.yQ2(inboxEntrancePodBQ2, true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRemoveEntranceEvent(C1902970zcV c1902970zcV) {
        InboxEntrancePod next;
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            int i = c1902970zcV.LIZ;
            Iterator<InboxEntrancePod> it2 = multiViewModelJo.LLJL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.entranceCell.cellId == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InboxEntrancePod inboxEntrancePod = next;
            if (inboxEntrancePod != null && !inboxEntrancePod.entranceCell.isActivity() && !inboxEntrancePod.entranceCell.isFollower()) {
                InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
                int i2 = inboxEntranceCell.filterType;
                if (i2 != Integer.MIN_VALUE) {
                    C1903780zdo.LIZLLL(i2);
                } else {
                    int i3 = inboxEntranceCell.group;
                    if (i3 != 0) {
                        C1903780zdo.LIZJ(i3);
                    }
                }
                InboxEntranceCell inboxEntranceCell2 = inboxEntrancePod.entranceCell;
                C1903780zdo.LIZIZ(new EntranceKey(inboxEntranceCell2.cellId, inboxEntranceCell2.entranceKey));
                multiViewModelJo.QQ2(inboxEntrancePod);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility
    public final void tr(boolean z) {
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            multiViewModelJo.LLJJJJ = z;
            multiViewModelJo.PQ2(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vo(X.EnumC1599580rjA r13) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.NoticeWidget.vo(X.0rjA):void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void xo(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC1903430zdF) {
            ((AbstractC1903430zdF) viewHolder).onAttach();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void yo(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC1903430zdF) {
            ((AbstractC1903430zdF) viewHolder).onDetach();
        } else {
            if (!(viewHolder instanceof C0Z32)) {
                return;
            }
            ((C0Z32) viewHolder).onDetach();
        }
    }

    public static View Lo(int i, ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility
    public final void kb2(boolean z, boolean z2) {
        MultiViewModel multiViewModelJo = Jo();
        if (multiViewModelJo != null) {
            multiViewModelJo.LLJJ = z2;
            multiViewModelJo.LLJJI = z;
            multiViewModelJo.PQ2(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder uo(android.view.ViewGroup r6, X.C13IQ<? extends X.InterfaceC1891350zJl> r7) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.NoticeWidget.uo(android.view.ViewGroup, X.13IQ):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
