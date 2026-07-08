package com.bytedance.tiktok.homepage.mainpagefragment.notification;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0ALV;
import X.C0CN5;
import X.C0X35;
import X.C0XQ7;
import X.C11S5;
import X.C1440005kM;
import X.C1569370qwR;
import X.C1570480qyE;
import X.C1618510sDh;
import X.C1618580sDo;
import X.C1618600sDq;
import X.C1618640sDu;
import X.C1618710sE1;
import X.C1618730sE3;
import X.C1619250sEt;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C2277881EDy;
import X.C2344809Gs;
import X.C285090BFj;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1618650sDv;
import X.InterfaceC19474811He;
import X.InterfaceC494301wD;
import Y.ARunnableS124S0100000_24;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsg;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsgResponse;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import com.ss.android.ugc.aweme.notice.api.services.IProfileRedDotService;
import com.ss.android.ugc.profile.business.drama.ISettingRedDotManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class NoticeAssem extends BaseMainPageFragmentUIAssem implements NoticeAbility, InterfaceC1554640qYg {
    public View LLJ;
    public SafeInfoNoticePopupWindowHelp LLJILJIL;
    public FissionPopupWindowHelp LLJILJILJ;
    public C1618580sDo LLJJI;
    public final C01GW LLJI = C452501pT.LIZIZ(new C1569370qwR(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1570480qyE(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C1618710sE1());
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1618600sDq(this));
    public boolean LLJJIII = true;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1649727721) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void GJ1() {
        C1618510sDh c1618510sDhGo;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) this.LLJIJIL.getValue();
        if (scrollSwitchStateManager != null && (c1618510sDhGo = Go()) != null) {
            c1618510sDhGo.LJII(scrollSwitchStateManager);
        }
        C1440005kM.LIZ(new C1618730sE3());
    }

    public final C1618510sDh Go() {
        return (C1618510sDh) this.LLJJ.getValue();
    }

    public final INoticeCountTabBadgePresentService Ho() {
        return (INoticeCountTabBadgePresentService) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void yl() {
        ViewStub viewStub;
        FissionPopupWindowHelp fissionPopupWindowHelp = this.LLJILJILJ;
        if (fissionPopupWindowHelp == null || (viewStub = fissionPopupWindowHelp.LLIZ) == null) {
            return;
        }
        C786410Ut5.LLIIIJ(viewStub, 8);
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void EF() {
        Ho().LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC1570850qyp
    public final void N5() {
        Ho().LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final boolean Rq1() {
        return (Ho().isShowing() || TextUtils.equals("USER", ((TabChangeManager) this.LLJI.getValue()).CQ2())) ? false : true;
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void fp() {
        C1618510sDh c1618510sDhGo = Go();
        if (c1618510sDhGo != null) {
            c1618510sDhGo.LJ(false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Ho().LJIIIZ(false);
        C1618510sDh c1618510sDhGo = Go();
        if (c1618510sDhGo != null) {
            EventBus.LIZLLL().LJJI(c1618510sDhGo);
            C1618510sDh.LJII = false;
            c1618510sDhGo.LIZ = null;
            ISettingRedDotManager iSettingRedDotManager = (ISettingRedDotManager) PluggableExtentionKt.pluggableSpi$default(ISettingRedDotManager.class, false, false, false, 14, null);
            if (iSettingRedDotManager != null) {
                iSettingRedDotManager.LIZIZ();
            }
        }
        C1618580sDo c1618580sDo = this.LLJJI;
        if (c1618580sDo != null) {
            EventBus.LIZLLL().LJJI(c1618580sDo);
            C1618580sDo.LJI = false;
        }
        this.LLJJI = null;
        SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp = this.LLJILJIL;
        if (safeInfoNoticePopupWindowHelp != null) {
            EventBus.LIZLLL().LJJI(safeInfoNoticePopupWindowHelp);
            C1619250sEt c1619250sEt = safeInfoNoticePopupWindowHelp.LLILZIL;
            if (c1619250sEt != null) {
                c1619250sEt.LJJIIJZLJL();
                safeInfoNoticePopupWindowHelp.LLILZIL = null;
            }
        }
        FissionPopupWindowHelp fissionPopupWindowHelp = this.LLJILJILJ;
        if (fissionPopupWindowHelp != null) {
            EventBus.LIZLLL().LJJI(fissionPopupWindowHelp);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJJIII) {
            this.LLJJIII = false;
            return;
        }
        C1618510sDh c1618510sDhGo = Go();
        if (c1618510sDhGo != null) {
            IProfileRedDotService iProfileRedDotService = c1618510sDhGo.LJFF;
            new AwS603S0100000_24(c1618510sDhGo, 496);
            iProfileRedDotService.LIZ(new AwS568S0100000_24(c1618510sDhGo, 1726));
        }
        Ho().onResume();
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void Ec0(boolean z) {
        Ho().LIZJ(z);
        Ho().LIZLLL();
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void Zi(ScrollSwitchStateManager scrollSwitchStateManager) {
        C1618510sDh c1618510sDhGo = Go();
        if (c1618510sDhGo != null) {
            c1618510sDhGo.LJII(scrollSwitchStateManager);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC1570850qyp
    public final void onNewIntent(Intent intent) {
        String stringExtra;
        try {
            if (!intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false)) {
                try {
                    stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
                boolean booleanExtra = intent.getBooleanExtra("need_clear_all_inbox_tab_count", true);
                C0ALV.LIZ.getClass();
                if (((Number) C0ALV.LIZIZ.getValue()).intValue() != 1 && stringExtra.length() > 0 && booleanExtra) {
                    Ho().onReset();
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2344809Gs.LJ(e2.getMessage());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0X35.LIZ("notice_assem_part_1", false);
        super.onViewCreated(view);
        this.LLJ = view.findViewById(R.id.nwe);
        C0CN5.LIZJ(Long.valueOf(C285090BFj.LIZIZ()), new ARunnableS124S0100000_24(this, 14), false);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC1570850qyp
    public final void t(String str, Fragment fragment, Fragment fragment2) {
        final SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp;
        C1618510sDh c1618510sDhGo;
        if (C2277881EDy.LIZIZ.isI18nMyProfileFragment(fragment) && SharePrefCache.inst().getEnableProfileActivityLink().LIZ().booleanValue() && (c1618510sDhGo = Go()) != null) {
            c1618510sDhGo.LIZJ();
        }
        if (fragment != null && (safeInfoNoticePopupWindowHelp = this.LLJILJIL) != null && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prior_to_safe_info_");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                safeInfoNoticePopupWindowHelp.LIZ();
                return;
            }
            if (!(fragment instanceof InterfaceC1593630rZZ)) {
                Keva repo2 = Keva.getRepo("account_security_keva_name");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("last_time_fetch_safe_info_");
                sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                long j = repo2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
                if (j != 0 && j >= System.currentTimeMillis()) {
                    safeInfoNoticePopupWindowHelp.LIZIZ(false);
                    return;
                } else {
                    InterfaceC1618650sDv.LIZ.getClass();
                    C1618640sDu.LIZ().LIZ(((AccountUserService) C0XQ7.LJFF()).LIZ()).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<SafeInfoNoticeMsgResponse>() { // from class: X.0sDw
                        @Override // X.InterfaceC19474811He
                        public final void onError(Throwable th) {
                        }

                        @Override // X.InterfaceC19474811He
                        public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        }

                        @Override // X.InterfaceC19474811He
                        public final void onSuccess(SafeInfoNoticeMsgResponse safeInfoNoticeMsgResponse) {
                            Keva repo3 = Keva.getRepo("account_security_keva_name");
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("last_time_fetch_safe_info_");
                            sbLIZ3.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                            SettingsManager.LIZLLL().getClass();
                            repo3.storeLong(strLIZIZ, jCurrentTimeMillis + (j2 * SettingsManager.LJFF("safe_info_notice_frequency", 86400L)));
                            SafeInfoNoticeMsg safeInfoNoticeMsg = safeInfoNoticeMsgResponse.data;
                            if (safeInfoNoticeMsg != null && !TextUtils.isEmpty(safeInfoNoticeMsg.notice)) {
                                Gson gson = new Gson();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("safe_info_");
                                sbLIZ4.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                                repo3.storeString(C2188811AlT.LIZIZ(sbLIZ4), GsonProtectorUtils.toJson(gson, safeInfoNoticeMsg));
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("safe_info_need_show_");
                                sbLIZ5.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                                repo3.storeBoolean(C2188811AlT.LIZIZ(sbLIZ5), true);
                            }
                            safeInfoNoticePopupWindowHelp.LIZIZ(true);
                        }
                    });
                    return;
                }
            }
            safeInfoNoticePopupWindowHelp.LIZ();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC1570850qyp
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        FissionPopupWindowHelp fissionPopupWindowHelp;
        if (Intrinsics.LJFF("USER", str) && (fissionPopupWindowHelp = this.LLJILJILJ) != null) {
            fissionPopupWindowHelp.LIZ();
        }
    }
}
