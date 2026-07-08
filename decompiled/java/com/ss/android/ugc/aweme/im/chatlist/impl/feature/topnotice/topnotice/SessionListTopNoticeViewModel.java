package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice;

import X.AbstractC1868670yjB;
import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.C01GW;
import X.C054G;
import X.C067Y;
import X.C067Z;
import X.C06NU;
import X.C09AY;
import X.C0I0B;
import X.C0PEM;
import X.C0ZJT;
import X.C1309005Ai;
import X.C1389890mGx;
import X.C13LP;
import X.C1400340mXo;
import X.C1477105qL;
import X.C15553067b;
import X.C1555780qaW;
import X.C1697810uHb;
import X.C1701006lM;
import X.C1890410zIF;
import X.C1890430zIH;
import X.C1906130zhb;
import X.C19212010Ec;
import X.C1DFB;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2185208hG;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C639060P4u;
import X.C897370ZIh;
import X.EnumC15556067e;
import X.EnumC1874080yru;
import X.InterfaceC1493105sv;
import X.InterfaceC1493505sz;
import X.InterfaceC1868680yjC;
import X.InterfaceC1887820zE4;
import X.InterfaceC897380ZIi;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes29.dex */
public class SessionListTopNoticeViewModel extends ViewModel {
    public static final List<String> LLJLLIL;
    public final String LL;
    public final TikTokImApi LLILLJJLI;
    public final InterfaceC1493105sv LLILLL;
    public final C1906130zhb LLILZ;
    public final AbstractC2252651DEx LLILZIL;
    public final C0ZJT LLILZLL;
    public final Function2<String, InterfaceC1887820zE4, Boolean> LLIZ;
    public final C067Z LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final Function1<Integer, Unit> LLJI;
    public final Function0<C1389890mGx> LLJIJIL;
    public final MutableLiveData<C1555780qaW<Unit>> LLJILJIL;
    public final MutableLiveData LLJILJILJ;
    public final MutableLiveData LLJILLL;
    public List<IMNoticeMsgStruct> LLJJ;
    public int LLJJI;
    public final MutableLiveData<EnumC1874080yru> LLJJIII;
    public final MutableLiveData LLJJIJI;
    public final C054G LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public Integer LLJJJ;
    public C09AY LLJJJIL;
    public C09AY LLJJJJ;
    public AwS603S0100000_24 LLJJJJJIL;
    public C09AY LLJJJJLIIL;
    public AwS568S0100000_24 LLJJL;
    public AwS603S0100000_24 LLJJLIIIJLLLLLLLZ;
    public volatile boolean LLJL;
    public final C01GW LLJLIL;
    public final C639060P4u LLJLILLLLZIIL;
    public final C639060P4u LLJLL;

    public SessionListTopNoticeViewModel() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void AQ2() {
        ?? r1;
        synchronized (this) {
            try {
                if (this.LLJJI >= this.LLJJ.size()) {
                    this.LLJJIII.setValue(EnumC1874080yru.EmptyTopNoticeView);
                    yQ2(false, false);
                    AwS568S0100000_24 awS568S0100000_24 = this.LLJJL;
                    if (awS568S0100000_24 != null) {
                        awS568S0100000_24.invoke();
                    }
                    return;
                }
                while (this.LLJJI < this.LLJJ.size()) {
                    List<IMNoticeMsgStruct> list = this.LLJJ;
                    int i = this.LLJJI;
                    this.LLJJI = i + 1;
                    IMNoticeMsgStruct iMNoticeMsgStruct = (IMNoticeMsgStruct) C13LP.LJJJLZIJ(i, list);
                    EnumC1874080yru enumC1874080yruBQ2 = BQ2(iMNoticeMsgStruct != null ? iMNoticeMsgStruct.noticeCode : null);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("process result: ");
                    sbLIZ.append(enumC1874080yruBQ2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LLJJIII.setValue(enumC1874080yruBQ2);
                    EnumC1874080yru enumC1874080yru = EnumC1874080yru.DM_TRY_AI_GROUP_SHOT;
                    if (enumC1874080yruBQ2 != enumC1874080yru && (r1 = this.LLJJJJLIIL) != 0) {
                        r1.invoke(Boolean.FALSE);
                    }
                    AwS603S0100000_24 awS603S0100000_24 = this.LLJJJJJIL;
                    if (awS603S0100000_24 != null) {
                        awS603S0100000_24.invoke(enumC1874080yruBQ2 == EnumC1874080yru.RECOMMEND_CREATE_GROUP_BANNER ? iMNoticeMsgStruct : null);
                    }
                    AwS603S0100000_24 awS603S0100000_242 = this.LLJJLIIIJLLLLLLLZ;
                    if (awS603S0100000_242 != null) {
                        awS603S0100000_242.invoke(iMNoticeMsgStruct);
                    }
                    if (enumC1874080yruBQ2 == EnumC1874080yru.TURN_ON_NOTIFICATION_VIEW_V2 || enumC1874080yruBQ2 == EnumC1874080yru.DM_BA_MSG_TONE_ALERT_BANNER || enumC1874080yruBQ2 == enumC1874080yru) {
                        yQ2(false, true);
                    } else if (enumC1874080yruBQ2 == EnumC1874080yru.EmptyTopNoticeView) {
                        yQ2(false, false);
                    } else {
                        yQ2(true, false);
                    }
                    if (enumC1874080yruBQ2 != EnumC1874080yru.EmptyTopNoticeView) {
                        break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    static {
        new Object() { // from class: X.0zIG
        };
        LLJLLIL = new ArrayList();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2296808zG.LIZJ(this.LLJJIJIIJIL, null);
        Set set = (Set) this.LLJLIL.getValue();
        if (set != null) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((PrivacySettingsFeature) this.LLJJIJIL.getValue()).LJJII((String) it2.next());
            }
        }
        Set set2 = (Set) this.LLJLIL.getValue();
        if (set2 != null) {
            set2.clear();
        }
    }

    public static boolean wQ2(String str) {
        return C13LP.LJJJJ(str, C1697810uHb.LJIIJJI(EnumC1874080yru.DM_TURN_ON_PERMISSION_FRIENDS_REVAMP.getNoticeCode(), EnumC1874080yru.DM_TURN_ON_PERMISSION_CREATOR_REVAMP.getNoticeCode(), EnumC1874080yru.DM_TURN_ON_PERMISSION_CREATOR_OTHERS_ONLY.getNoticeCode()));
    }

    public static boolean xQ2(String str) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1874080yru.DM_TRY_AI_GROUP_SHOT.getNoticeCode(), EnumC1874080yru.DM_BA_MSG_TONE_ALERT_BANNER.getNoticeCode(), EnumC1874080yru.DM_TURN_ON_PERMISSION_FRIENDS_REVAMP.getNoticeCode(), EnumC1874080yru.DM_TURN_ON_PERMISSION_CREATOR_REVAMP.getNoticeCode(), EnumC1874080yru.DM_TURN_ON_PERMISSION_CREATOR_OTHERS_ONLY.getNoticeCode());
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(str, it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final EnumC1874080yru BQ2(String str) {
        EnumC1874080yru next;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("process with notice code ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            return EnumC1874080yru.EmptyTopNoticeView;
        }
        if (this.LLIZ.invoke(str, new C1890410zIF(this)).booleanValue()) {
            EnumC1874080yru enumC1874080yru = EnumC1874080yru.UPDATES_TO_DIRECT_MESSAGE_SETTINGS;
            if (!Intrinsics.LJFF(str, enumC1874080yru.getNoticeCode())) {
                return EnumC1874080yru.PERMISSION_UPDATED_SHEET;
            }
            return enumC1874080yru;
        }
        if (xQ2(str)) {
            if (C13LP.LJJJJ(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId(), LLJLLIL)) {
                return EnumC1874080yru.EmptyTopNoticeView;
            }
            if (wQ2(str)) {
                str2 = "inbox_banner";
            } else {
                str2 = "notification_page";
            }
            ((IRemindUsersAnalytics) ServiceManager.get().getService(IRemindUsersAnalytics.class)).LIZ(str2, "inbox_top", C0I0B.LJFF.LIZIZ());
        }
        if (Intrinsics.LJFF(str, "inbox_activity_status")) {
            this.LLIZLLLIL.LIZIZ();
            this.LLILZLL.LJIIL(true);
        }
        Iterator<EnumC1874080yru> it2 = EnumC1874080yru.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getNoticeCode(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1874080yru enumC1874080yru2 = next;
        if (enumC1874080yru2 == null) {
            enumC1874080yru2 = EnumC1874080yru.EmptyTopNoticeView;
        }
        if (enumC1874080yru2 == EnumC1874080yru.PermissionUpdatedNoticeView) {
            if (this.LLILZ.LIZ.getInt("permission_updated_notice_show_count", 0) < 3 && this.LLILZ.LIZ.getLong("permission_updated_notice_last_show", 0L) < System.currentTimeMillis() - 86400000) {
                C1906130zhb c1906130zhb = this.LLILZ;
                c1906130zhb.LIZ.edit().putInt("permission_updated_notice_show_count", c1906130zhb.LIZ.getInt("permission_updated_notice_show_count", 0) + 1).commit();
                C1906130zhb c1906130zhb2 = this.LLILZ;
                c1906130zhb2.LIZ.edit().putLong("permission_updated_notice_last_show", System.currentTimeMillis()).commit();
            } else {
                enumC1874080yru2 = EnumC1874080yru.EmptyTopNoticeView;
            }
        }
        if (enumC1874080yru2 == EnumC1874080yru.TURN_ON_NOTIFICATION_VIEW_V2) {
            if (C06NU.LIZ() && C1890430zIH.LIZ()) {
                Integer num = this.LLJJJ;
                if (num != null) {
                    int iIntValue = num.intValue();
                    ?? r1 = this.LLJJJJ;
                    if (r1 != 0) {
                        r1.invoke(Integer.valueOf(iIntValue));
                    }
                }
            } else {
                enumC1874080yru2 = EnumC1874080yru.EmptyTopNoticeView;
            }
        }
        if (enumC1874080yru2 == EnumC1874080yru.DM_TRY_AI_GROUP_SHOT) {
            if (C1701006lM.LIZIZ.LJI()) {
                ?? r12 = this.LLJJJJLIIL;
                if (r12 != 0) {
                    r12.invoke(Boolean.TRUE);
                }
            } else {
                enumC1874080yru2 = EnumC1874080yru.EmptyTopNoticeView;
            }
        }
        if (enumC1874080yru2 != EnumC1874080yru.EmptyTopNoticeView) {
            CQ2("notification_setting_alert_show");
        }
        return enumC1874080yru2;
    }

    public final void CQ2(String str) {
        AbstractC1868670yjB abstractC1868670yjB;
        String strLIZ;
        EnumC1874080yru value = this.LLJJIII.getValue();
        InterfaceC1868680yjC config = null;
        if (value != null) {
            config = value.getConfig();
        }
        if ((config instanceof AbstractC1868670yjB) && (abstractC1868670yjB = (AbstractC1868670yjB) config) != null && (strLIZ = abstractC1868670yjB.LIZ()) != null) {
            this.LLILLL.sendEvent(str, C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LL), new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("pop_up_type", strLIZ)));
        }
    }

    public final void zQ2(String str) {
        String noticeCode;
        EnumC1874080yru value = this.LLJJIII.getValue();
        if (value != null) {
            noticeCode = value.getNoticeCode();
        } else {
            noticeCode = null;
        }
        DQ2(1, noticeCode, str, "");
        CQ2("notification_setting_alert_close");
        AQ2();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.functions.Function2] */
    public final void yQ2(boolean z, boolean z2) {
        ?? r2 = this.LLJJJIL;
        if (r2 != 0) {
            r2.invoke(Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    public SessionListTopNoticeViewModel(Function2 function2, Function0 function0, Function1 function1, Function0 function02) {
        TikTokImApi tikTokImApiLIZJ = C1477105qL.LIZJ();
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        C1906130zhb c1906130zhbLIZ = C1906130zhb.LIZ();
        C1DFB c1dfb = C0PEM.LIZJ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        InterfaceC897380ZIi.LIZIZ.getClass();
        C0ZJT c0zjtLJ = C897370ZIh.LIZ().LJ();
        C067Z c067z = new C067Z() { // from class: X.06Ag
            @Override // X.C067Z
            public final void LIZIZ() {
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJFF();
                C0ZJ9.LIZLLL(C0I0B.LJFF.LIZIZ());
            }

            @Override // X.C067Z
            public final void LIZ(int i, boolean z) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJFF();
                C0ZJ9.LIZJ(i, z, C0I0B.LJFF.LIZIZ());
            }
        };
        this.LL = "notification_page";
        this.LLILLJJLI = tikTokImApiLIZJ;
        this.LLILLL = interfaceC1493505szLIZIZ;
        this.LLILZ = c1906130zhbLIZ;
        this.LLILZIL = abstractC2238408pq;
        this.LLILZLL = c0zjtLJ;
        this.LLIZ = function2;
        this.LLIZLLLIL = c067z;
        this.LLJ = function0;
        this.LLJI = function1;
        this.LLJIJIL = function02;
        MutableLiveData<C1555780qaW<Unit>> mutableLiveData = new MutableLiveData<>();
        this.LLJILJIL = mutableLiveData;
        this.LLJILJILJ = mutableLiveData;
        this.LLJILLL = new MutableLiveData();
        this.LLJJ = new ArrayList();
        MutableLiveData<EnumC1874080yru> mutableLiveData2 = new MutableLiveData<>();
        this.LLJJIII = mutableLiveData2;
        this.LLJJIJI = mutableLiveData2;
        this.LLJJIJIIJIL = C2296808zG.LIZ(c1dfb.plus(C2296908zH.LIZ()));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(115));
        this.LLJLIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(496));
        C2185208hG c2185208hG = CoroutineExceptionHandler.LJJLIL;
        this.LLJLILLLLZIIL = new C639060P4u(c2185208hG, 18);
        this.LLJLL = new C639060P4u(c2185208hG, 19);
    }

    public static void vQ2(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, int i, int i2, int i3) {
        boolean z;
        EnumC15556067e enumC15556067e;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activity_status_");
        sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        sessionListTopNoticeViewModel.getClass();
        IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService != null) {
            iDmToolsDebugService.LJIJI();
        }
        IDmToolsDebugService iDmToolsDebugService2 = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService2 != null) {
            iDmToolsDebugService2.LJIL();
        }
        IDmToolsDebugService iDmToolsDebugService3 = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService3 != null) {
            iDmToolsDebugService3.LJIILL();
        }
        if (i2 == 2) {
            z = true;
        } else {
            z = false;
        }
        sessionListTopNoticeViewModel.LLJJJ = Integer.valueOf(i2);
        if (z) {
            enumC15556067e = EnumC15556067e.PUSH_STATUS_ON;
        } else {
            enumC15556067e = EnumC15556067e.PUSH_STATUS_OFF;
        }
        boolean zContains = repo.contains("has_permission_sheet_shown");
        C15553067b.LIZIZ.getClass();
        C23250099c.LIZLLL(sessionListTopNoticeViewModel.LLJJIJIIJIL, sessionListTopNoticeViewModel.LLJLILLLLZIIL, null, new C067Y(sessionListTopNoticeViewModel, enumC15556067e, i, C15553067b.LIZ(), zContains, i3, null), 2);
    }

    public final void DQ2(int i, String str, String str2, String str3) {
        if (str != null && !a0.LJJJIL(str)) {
            C23250099c.LIZLLL(this.LLJJIJIIJIL, this.LLJLL, null, new C1309005Ai(this, str, str2, i, str3, null), 2);
        }
    }
}
