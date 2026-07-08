package com.ss.android.ugc.profile.business.live;

import X.AbstractC848400XPy;
import X.C08JS;
import X.C0TWG;
import X.C0XQ7;
import X.C1216270hkv;
import X.C1251210ifH;
import X.C1253930ijf;
import X.C1266320j3e;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1546500qLY;
import X.C1546560qLe;
import X.C19EG;
import X.C2188811AlT;
import X.C2215101Bmm;
import X.C299980BpM;
import X.C444960Hcc;
import X.C746860TRk;
import X.InterfaceC1101550elt;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeatureLiveEventProtocol extends AdvancedFeatureProtocol implements GenericLifecycleObserver {
    public List<LiveEventStruct> LLJL;
    public LiveEventStruct LLJLIL;
    public LiveEventData LLJLILLLLZIIL;
    public long LLJLL;
    public String LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public long LLL;
    public long LLLF;
    public boolean LLLFF;
    public final AwS598S0100000_19 LLLFFI = new AwS598S0100000_19(this, 320);
    public final AwS633S0100000_19 LLLFZ = new AwS633S0100000_19(this, 112);
    public final AwS598S0100000_19 LLLI = new AwS598S0100000_19(this, 319);
    public final AwS598S0100000_19 LLLII = new AwS598S0100000_19(this, 318);

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    public final void LJLILLLLZI() {
        this.LLJLLIL = null;
        this.LLJLLL = true;
        if (this.LLJZ != 0) {
            this.LLJZ = 0;
            InterfaceC1101550elt interfaceC1101550eltW6 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w6();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("live_info");
            User user = getUser();
            sbLIZ.append(user != null ? user.getUid() : null);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            interfaceC1101550eltW6.getClass();
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL(strLIZIZ);
        }
        if (this.LLJZIJLIL != 0) {
            this.LLJZIJLIL = 0;
            InterfaceC1101550elt interfaceC1101550eltW62 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w6();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("live_info");
            User user2 = getUser();
            sbLIZ2.append(user2 != null ? user2.getUid() : null);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            interfaceC1101550eltW62.getClass();
            C1546560qLe.LIZ.getClass();
            C1546500qLY.LJIIIIZZ(strLIZIZ2);
        }
        this.LLL = 0L;
        this.LLLF = 0L;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_live_events";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        ProfileHeaderAdvancedFeatureViewModel profileHeaderAdvancedFeatureViewModel = this.LLJJJIL;
        if (profileHeaderAdvancedFeatureViewModel != null) {
            profileHeaderAdvancedFeatureViewModel.vQ2(new AwS598S0100000_19(this, 316));
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.JQ2(new AwS598S0100000_19(this, 317));
        }
    }

    public final boolean LJLJJLL() {
        ILiveOuterService iLiveOuterService;
        Boolean bool;
        if (this.LLJI) {
            C1251210ifH.LIZ.getClass();
            return C1251210ifH.LIZIZ();
        }
        C1251210ifH.LIZ.getClass();
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager == null || (iLiveOuterService = (ILiveOuterService) serviceManager.getService(ILiveOuterService.class)) == null || (bool = (Boolean) iLiveOuterService.LIZJ(Boolean.FALSE, "user_show_live_info")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final User getUser() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            return iProfilePlatformVM.vQ2();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String LJJIFFI() {
        return LJLJJLL() ? C1216270hkv.LIZJ(2131853356) : C1216270hkv.LIZJ(2131834289);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        AwS563S0100000_19 awS563S0100000_19;
        User user = getUser();
        if (user != null) {
            LiveEventData liveEventData = this.LLJLILLLLZIIL;
            user.setLiveEventStructList(liveEventData != null ? liveEventData.getLiveEventStructList() : null);
        }
        LJLI(LJLJI());
        if (System.currentTimeMillis() - this.LLJLL > 500 && LJJLJLI()) {
            this.LLJLL = System.currentTimeMillis();
        }
        if (!C299980BpM.LIZ() || (awS563S0100000_19 = this.LLJJL) == null) {
            return true;
        }
        awS563S0100000_19.invoke();
        return true;
    }

    public final String LJLJI() {
        Resources resources;
        Resources resources2;
        String strLJIIJ = null;
        if (LJLJJLL()) {
            List<LiveEventStruct> list = this.LLJL;
            if (list == null || list.isEmpty()) {
                return C1216270hkv.LIZJ(2131853356);
            }
            Context context = getContext();
            if (context != null && (resources2 = context.getResources()) != null) {
                Object[] objArr = new Object[1];
                LiveEventStruct liveEventStruct = this.LLJLIL;
                if (liveEventStruct != null) {
                    strLJIIJ = C2215101Bmm.LJIIJ(liveEventStruct.getStartTime());
                    if (C444960Hcc.LIZJ(getContext())) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((char) 8207);
                        sbLIZ.append(strLJIIJ);
                        strLJIIJ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                objArr[0] = strLJIIJ;
                String string = resources2.getString(2131853357, objArr);
                if (string != null) {
                    return string;
                }
            }
        } else {
            Context context2 = getContext();
            if (context2 != null && (resources = context2.getResources()) != null) {
                Object[] objArr2 = new Object[1];
                LiveEventStruct liveEventStruct2 = this.LLJLIL;
                if (liveEventStruct2 != null) {
                    strLJIIJ = C2215101Bmm.LJIIJ(liveEventStruct2.getStartTime());
                    if (C444960Hcc.LIZJ(getContext())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((char) 8207);
                        sbLIZ2.append(strLJIIJ);
                        strLJIIJ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                objArr2[0] = strLJIIJ;
                String string2 = resources.getString(2131834289, objArr2);
                if (string2 != null) {
                    return string2;
                }
            }
        }
        return "";
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LJLILLLLZI();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        Fragment fragment;
        C19EG activity;
        FragmentManager supportFragmentManager;
        String str;
        String str2;
        String uid;
        String uid2;
        String curUserId;
        String str3;
        String uid3;
        User user = getUser();
        if (user == null) {
            return true;
        }
        Map<String, String> mapLJLJJI = LJLJJI("livesdk_liveinfo_entrance_click");
        this.LLLFF = true;
        String str4 = "";
        if (LJLJJLL()) {
            Context context = getContext();
            boolean z = this.LLJI;
            User user2 = getUser();
            if (user2 == null || (uid2 = user2.getUid()) == null) {
                uid2 = "";
            }
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
                curUserId = "";
            }
            List<LiveEventStruct> list = this.LLJL;
            Integer numValueOf = Integer.valueOf(this.LLJ);
            String strLIZIZ = null;
            if (this.LLJZ == 2 || this.LLJZIJLIL == 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("live_info");
                User user3 = getUser();
                if (user3 != null) {
                    strLIZIZ = user3.getUid();
                }
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C0TWG.LIZIZ(context, z, uid2, curUserId, list, numValueOf, strLIZIZ, new C1266320j3e(this, 1), mapLJLJJI);
            if (this.LLJI) {
                str3 = "anchor";
            } else {
                str3 = "viewer";
            }
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            int i = this.LLJ;
            User user4 = getUser();
            if (user4 != null && (uid3 = user4.getUid()) != null) {
                str4 = uid3;
            }
            C1253930ijf.LJFF(c1253930ijf, "livesdk_liveinfo_entrance_click", str3, i, str4, mapLJLJJI, null, 32);
            return true;
        }
        List<LiveEventStruct> list2 = this.LLJL;
        if (list2 != null && list2.size() == 1) {
            LiveEventStruct liveEventStruct = this.LLJLIL;
            if (liveEventStruct != null) {
                C0TWG.LIZ(getContext(), liveEventStruct);
            }
        } else {
            if (this.LLJL != null && (!r2.isEmpty()) && (fragment = this.LLILZ) != null && (activity = fragment.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                C746860TRk.LIZ(supportFragmentManager, user, this.LLJL);
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
        String str5 = this.LLJJIJIL;
        LiveEventStruct liveEventStruct2 = this.LLJLIL;
        List<LiveEventStruct> list3 = this.LLJL;
        User user5 = getUser();
        if (user5 != null && (uid = user5.getUid()) != null) {
            str4 = uid;
        }
        c1253930ijf2.getClass();
        C1253930ijf.LIZLLL(str, "click", str5, str2, liveEventStruct2, list3, str4, "");
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        LiveEventStruct liveEventStruct;
        LiveEventData liveEventData = (LiveEventData) C08JS.LIZ(nVar.toString(), LiveEventData.class);
        this.LLJLILLLLZIIL = liveEventData;
        this.LLJJJJ = liveEventData;
        if (liveEventData != null) {
            List<LiveEventStruct> liveEventStructList = liveEventData.getLiveEventStructList();
            this.LLJL = liveEventStructList;
            if (liveEventStructList != null && Boolean.valueOf(!liveEventStructList.isEmpty()).booleanValue() && (liveEventStruct = (LiveEventStruct) ListProtector.get(liveEventStructList, 0)) != null) {
                this.LLJLIL = liveEventStruct;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[PHI: r4
      0x0060: PHI (r4v1 X.0igu) = (r4v0 X.0igu), (r4v0 X.0igu), (r4v3 X.0igu), (r4v3 X.0igu), (r4v3 X.0igu) binds: [B:9:0x001c, B:11:0x002a, B:13:0x0030, B:15:0x0034, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJLJJI(java.lang.String r6) {
        /*
            r5 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r0 = r5.LLJI
            if (r0 != 0) goto L5f
            java.lang.String r0 = "livesdk_liveinfo_entrance_show"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = "livesdk_liveinfo_entrance_click"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L5f
        L19:
            androidx.fragment.app.Fragment r0 = r5.LLILZ
            r4 = 0
            if (r0 == 0) goto L60
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r4)
            java.lang.Class<com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility> r0 = com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility r0 = (com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility) r0
            if (r0 == 0) goto L60
            X.0igu r4 = r0.getOtherParams()
            if (r4 == 0) goto L60
            java.lang.String r0 = r4.LJIIJJI
            if (r0 == 0) goto L60
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L60
        L3f:
            java.lang.String r2 = ""
            if (r1 == 0) goto L62
            java.lang.String r1 = r4.LJIIJJI
            if (r1 != 0) goto L48
            r1 = r2
        L48:
            java.lang.String r0 = "from_room_id"
            r3.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LJIIL
            if (r1 == 0) goto L5a
            java.lang.String r0 = "room_request_id"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L5a
            r2 = r0
        L5a:
            java.lang.String r0 = "request_id"
            r3.put(r0, r2)
        L5f:
            return r3
        L60:
            r1 = 0
            goto L3f
        L62:
            if (r4 == 0) goto L69
            java.lang.String r0 = r4.LJIILL
            if (r0 == 0) goto L69
            r2 = r0
        L69:
            java.lang.String r0 = "item_id"
            r3.put(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.live.ProfileAdvancedFeatureLiveEventProtocol.LJLJJI(java.lang.String):java.util.Map");
    }
}
