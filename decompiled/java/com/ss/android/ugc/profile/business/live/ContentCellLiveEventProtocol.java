package com.ss.android.ugc.profile.business.live;

import X.AbstractC848400XPy;
import X.C08JS;
import X.C0TWG;
import X.C0XQ7;
import X.C1101540els;
import X.C1251210ifH;
import X.C1253930ijf;
import X.C1260740iue;
import X.C1266320j3e;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1546500qLY;
import X.C1546560qLe;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C5183020f;
import X.C5185020h;
import X.C746860TRk;
import X.InterfaceC1101550elt;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellLiveEventProtocol extends ContentCellProtocol implements GenericLifecycleObserver {
    public List<LiveEventStruct> LLL;
    public LiveEventStruct LLLF;
    public LiveEventData LLLFF;
    public long LLLFFI;
    public String LLLFZ;
    public boolean LLLI;
    public int LLLII;
    public int LLLIIII;
    public long LLLIIIIL;
    public long LLLIIIL;
    public final AwS598S0100000_19 LLLIIL = new AwS598S0100000_19(this, 314);
    public final AwS633S0100000_19 LLLIILIL = new AwS633S0100000_19(this, 111);
    public final AwS598S0100000_19 LLLIL = new AwS598S0100000_19(this, 313);
    public final AwS598S0100000_19 LLLILZ = new AwS598S0100000_19(this, 312);

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    public final void LJLLL() {
        this.LLLFZ = null;
        this.LLLI = true;
        if (this.LLLII != 0) {
            this.LLLII = 0;
            InterfaceC1101550elt interfaceC1101550eltW6 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w6();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("live_info");
            sbLIZ.append(getUser().getUid());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            interfaceC1101550eltW6.getClass();
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL(strLIZIZ);
        }
        if (this.LLLIIII != 0) {
            this.LLLIIII = 0;
            InterfaceC1101550elt interfaceC1101550eltW62 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w6();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("live_info");
            sbLIZ2.append(getUser().getUid());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            interfaceC1101550eltW62.getClass();
            C1546560qLe.LIZ.getClass();
            C1546500qLY.LJIIIIZZ(strLIZIZ2);
        }
        this.LLLIIIIL = 0L;
        this.LLLIIIL = 0L;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        this.LLLFZ = null;
        LJLLL();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_live_events";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.JQ2(new AwS598S0100000_19(this, 311));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        User user = getUser();
        if (user != null) {
            LiveEventData liveEventData = this.LLLFF;
            user.setLiveEventStructList(liveEventData != null ? liveEventData.getLiveEventStructList() : null);
        }
        if (System.currentTimeMillis() - this.LLLFFI <= 500 || !LJJLJLI()) {
            return false;
        }
        this.LLLFFI = System.currentTimeMillis();
        return false;
    }

    public final User getUser() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        Fragment fragment;
        C19EG activity;
        FragmentManager supportFragmentManager;
        String str;
        String str2;
        String curUserId;
        String strLIZIZ;
        User user = getUser();
        C1251210ifH.LIZ.getClass();
        String str3 = "";
        if (C1251210ifH.LIZIZ()) {
            Context context = getContext();
            boolean z = this.LLJI;
            String uid = getUser().getUid();
            if (uid == null) {
                uid = "";
            }
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
                curUserId = "";
            }
            List<LiveEventStruct> list = this.LLL;
            Integer numValueOf = Integer.valueOf(this.LLJ);
            if (this.LLLII != 2 && this.LLLIIII != 1) {
                strLIZIZ = null;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("live_info");
                sbLIZ.append(getUser().getUid());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C0TWG.LIZIZ(context, z, uid, curUserId, list, numValueOf, strLIZIZ, new C1266320j3e(this, 0), null);
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            int i = this.LLJ;
            String uid2 = getUser().getUid();
            if (uid2 != null) {
                str3 = uid2;
            }
            C1253930ijf.LJFF(c1253930ijf, "livesdk_liveinfo_entrance_click", "anchor", i, str3, null, "feature_center", 16);
            return true;
        }
        List<LiveEventStruct> list2 = this.LLL;
        if (list2 != null && list2.size() == 1) {
            LiveEventStruct liveEventStruct = this.LLLF;
            if (liveEventStruct != null) {
                C0TWG.LIZ(getContext(), liveEventStruct);
            }
        } else {
            if (this.LLL != null && (!r2.isEmpty()) && (fragment = this.LLILZ) != null && (activity = fragment.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                C746860TRk.LIZ(supportFragmentManager, user, this.LLL);
            }
        }
        boolean z2 = this.LLJI;
        if (z2) {
            str = "livesdk_live_event_anchor_entrance_click";
        } else {
            str = "livesdk_live_event_user_entrance_click";
        }
        if (z2) {
            str2 = "personal_live_event_card";
        } else {
            str2 = "others_live_event_card";
        }
        C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
        String str4 = this.LLJJIJIL;
        LiveEventStruct liveEventStruct2 = this.LLLF;
        List<LiveEventStruct> list3 = this.LLL;
        String uid3 = getUser().getUid();
        if (uid3 != null) {
            str3 = uid3;
        }
        c1253930ijf2.getClass();
        C1253930ijf.LIZLLL(str, "click", str4, str2, liveEventStruct2, list3, str3, "feature_center");
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        LiveEventStruct liveEventStruct;
        LiveEventData liveEventData = (LiveEventData) C08JS.LIZ(nVar.toString(), LiveEventData.class);
        this.LLLFF = liveEventData;
        this.LLJJJJ = liveEventData;
        if (liveEventData != null) {
            List<LiveEventStruct> liveEventStructList = liveEventData.getLiveEventStructList();
            this.LLL = liveEventStructList;
            if (liveEventStructList != null && Boolean.valueOf(!liveEventStructList.isEmpty()).booleanValue() && (liveEventStruct = (LiveEventStruct) ListProtector.get(liveEventStructList, 0)) != null) {
                this.LLLF = liveEventStruct;
            } else {
                return;
            }
        }
        this.LLJILJIL = this.LLLFF;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJLL(Map map, boolean z) {
        String str;
        String str2;
        ServiceManager serviceManager;
        ILiveOuterService iLiveOuterService;
        boolean zLIZ;
        String curUserId;
        String str3;
        String curUserId2;
        ServiceManager serviceManager2;
        ILiveOuterService iLiveOuterService2;
        if (z) {
            this.LLLI = false;
            C1251210ifH c1251210ifH = C1251210ifH.LIZ;
            c1251210ifH.getClass();
            String str4 = "";
            if (C1251210ifH.LIZIZ() && ((this.LLJI && (serviceManager2 = ServiceManager.get()) != null && (iLiveOuterService2 = (ILiveOuterService) serviceManager2.getService(ILiveOuterService.class)) != null && Intrinsics.LJFF(iLiveOuterService2.LIZJ(Boolean.FALSE, "live_info_preload_owner"), Boolean.TRUE)) || (!this.LLJI && (serviceManager = ServiceManager.get()) != null && (iLiveOuterService = (ILiveOuterService) serviceManager.getService(ILiveOuterService.class)) != null && Intrinsics.LJFF(iLiveOuterService.LIZJ(Boolean.FALSE, "live_info_preload_viewer"), Boolean.TRUE)))) {
                if (this.LLLFZ == null) {
                    boolean z2 = this.LLJI;
                    String uid = getUser().getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                    if (iAccountUserServiceLJFF == null || (curUserId2 = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
                        curUserId2 = "";
                    }
                    List<LiveEventStruct> list = this.LLL;
                    Integer numValueOf = Integer.valueOf(this.LLJ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("live_info");
                    sbLIZ.append(getUser().getUid());
                    String strLIZJ = C0TWG.LIZJ(z2, uid, curUserId2, list, numValueOf, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    if (strLIZJ != null && strLIZJ.length() != 0) {
                        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                        getContext();
                        this.LLLFZ = iLiveOuterService3.a4(UriProtector.parse(strLIZJ));
                    }
                }
                if (!this.LLJI && this.LLLIIII == 0) {
                    this.LLLIIII = 1;
                    String str5 = this.LLLFZ;
                    if (str5 != null) {
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w6();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("live_info");
                        sbLIZ2.append(getUser().getUid());
                        C1101540els.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), str5);
                    }
                }
                if (this.LLLII == 0) {
                    InterfaceC1101550elt interfaceC1101550eltW6 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w6();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("live_info");
                    sbLIZ3.append(getUser().getUid());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    String str6 = this.LLLFZ;
                    interfaceC1101550eltW6.getClass();
                    if (str6 == null) {
                        zLIZ = false;
                    } else {
                        C1537060q6K c1537060q6K = C1529590puH.LIZ;
                        zLIZ = C1537060q6K.LIZ(strLIZIZ, str6);
                    }
                    if (zLIZ) {
                        this.LLLII = 2;
                    } else {
                        this.LLLII = 1;
                        this.LLLIIIL = System.currentTimeMillis();
                        WeakReference weakReference = new WeakReference(this.LLLIIL);
                        WeakReference weakReference2 = new WeakReference(this.LLLIILIL);
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w6();
                        Pair[] pairArr = new Pair[3];
                        IAccountUserService iAccountUserServiceLJFF2 = C0XQ7.LJFF();
                        if (iAccountUserServiceLJFF2 == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF2).getCurUserId()) == null) {
                            curUserId = "";
                        }
                        pairArr[0] = new Pair("current_uid", curUserId);
                        String uid2 = getUser().getUid();
                        if (uid2 == null) {
                            uid2 = "";
                        }
                        pairArr[1] = new Pair("liveinfo_owner_uid", uid2);
                        if (getUser().isLive() && C1260740iue.LIZ()) {
                            str3 = "1";
                        } else {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        pairArr[2] = new Pair("is_profile_owner_living", str3);
                        C1101540els.LIZJ(C2097608Jq.LJIIIIZZ(pairArr), Boolean.TYPE, new C5183020f(weakReference, (WeakReference<Function1<String, Unit>>) 273), new C5185020h(weakReference2, (WeakReference<Function2<Integer, String, Unit>>) 46));
                    }
                }
            }
            c1251210ifH.getClass();
            if (C1251210ifH.LIZIZ()) {
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                int i = this.LLJ;
                String uid3 = getUser().getUid();
                if (uid3 != null) {
                    str4 = uid3;
                }
                C1253930ijf.LJFF(c1253930ijf, "livesdk_liveinfo_entrance_show", "anchor", i, str4, null, "feature_center", 16);
                return;
            }
            boolean z3 = this.LLJI;
            if (z3) {
                str = "livesdk_live_event_anchor_entrance_show";
            } else {
                str = "livesdk_live_event_user_entrance_show";
            }
            if (z3) {
                str2 = "personal_live_event_card";
            } else {
                str2 = "others_live_event_card";
            }
            C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
            String str7 = this.LLJJIJIL;
            LiveEventStruct liveEventStruct = this.LLLF;
            List<LiveEventStruct> list2 = this.LLL;
            String uid4 = getUser().getUid();
            if (uid4 != null) {
                str4 = uid4;
            }
            c1253930ijf2.getClass();
            C1253930ijf.LIZLLL(str, "show", str7, str2, liveEventStruct, list2, str4, "feature_center");
        }
    }
}
