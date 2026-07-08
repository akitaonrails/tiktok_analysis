package com.ss.android.ugc.aweme.setting.page;

import X.AbstractC19318610i0;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C09S2;
import X.C0C64;
import X.C0OM1;
import X.C0XQ7;
import X.C1070560dxu;
import X.C11U6;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12N1;
import X.C12N4;
import X.C135Q;
import X.C19290910dX;
import X.C19318810i2;
import X.C19319010i4;
import X.C19319110i5;
import X.C20684815ws;
import X.C20694015yM;
import X.C2188811AlT;
import X.C2277881EDy;
import X.C2344009Gk;
import X.C419910GdJ;
import X.C452501pT;
import X.ExecutorC1592406Li;
import X.InterfaceC2661011f;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS139S0100000_4;
import Y.ACListenerS163S0100000_29;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.setting.model.LiveReplayEntranceResponse;
import com.ss.android.ugc.aweme.setting.page.LivePage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS143S1100000_29;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC836760Ws6
public final class LivePage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZjYpPTs6JiJiOS40LWsAIDk2GCQrLA==";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public TuxNavBar LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(129));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 193));
    public C12N4 LLJILJILJ;
    public C12N4 LLJILLL;
    public C12N4 LLJJ;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f78;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
        this.LLJI = null;
    }

    public static void ZR(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "creator_account");
        c2344009Gk.LJIIIIZZ("event_page", "setting");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("livesdk_live_center_replay", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
        super.Q9(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object objCreate;
        super.onViewCreated(view, bundle);
        NR(AFwS273S0000000_29.get$arr$(100));
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (TuxNavBar) viewFindViewById;
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        ((TuxNavBar) viewFindViewById).LJIIZILJ(false);
        View viewFindViewById2 = this.LLJI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.p15);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJI = (TuxNavBar) viewFindViewById2;
        }
        C0OM1 c0om1 = new C0OM1();
        boolean z2 = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LJIIIIZZ = getString(2131823332);
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 209));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(R.string.l1c);
        c0om1.LIZJ = c1250250idj;
        ((TuxNavBar) viewFindViewById2).setNavActions(c0om1);
        String string = getString(2131845452);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_calendar_star_fill;
        CharSequence charSequence = null;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        this.LLJILJILJ = new C12N4(new C20694015yM(string, c419910GdJ, new ACListenerS163S0100000_29(this, 72), "live_events", z, objArr15 == true ? 1 : 0, null, 16777184));
        String string2 = getString(2131844425);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_star_ring_fill;
        this.LLJILLL = new C12N4(new C20694015yM(string2, c419910GdJ2, new ACListenerS163S0100000_29(this, 73), "live_subscription", objArr14 == true ? 1 : 0, objArr13 == true ? 1 : 0, 0 == true ? 1 : 0, 16777200));
        String string3 = getString(2131853555);
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_replay_fill;
        this.LLJJ = new C12N4(new C20694015yM(string3, c419910GdJ3, new ACListenerS139S0100000_4(this, 48), "notification_manager", objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, 0 == true ? 1 : 0, 16777184));
        ((C19318810i2) this.LLJILJIL.getValue()).LIZ(new C19319110i5(new C19319010i4("", objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, z2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, 65502)));
        C19318810i2 c19318810i2 = (C19318810i2) this.LLJILJIL.getValue();
        AbstractC19318610i0<?> abstractC19318610i0 = this.LLJILJILJ;
        if (abstractC19318610i0 == null) {
            abstractC19318610i0 = null;
        }
        c19318810i2.LIZ(abstractC19318610i0);
        C19318810i2 c19318810i22 = (C19318810i2) this.LLJILJIL.getValue();
        AbstractC19318610i0<?> abstractC19318610i02 = this.LLJILLL;
        if (abstractC19318610i02 == null) {
            abstractC19318610i02 = null;
        }
        c19318810i22.LIZ(abstractC19318610i02);
        C19318810i2 c19318810i23 = (C19318810i2) this.LLJILJIL.getValue();
        AbstractC19318610i0<?> abstractC19318610i03 = this.LLJJ;
        if (abstractC19318610i03 == null) {
            abstractC19318610i03 = null;
        }
        c19318810i23.LIZ(abstractC19318610i03);
        ((C19318810i2) this.LLJILJIL.getValue()).LIZ(new C19319110i5(new C19319010i4("", objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, z2, objArr3 == true ? 1 : 0, charSequence, objArr19 == true ? 1 : 0, objArr18 == true ? 1 : 0, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 65518)));
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && C2277881EDy.LIZIZ.canShowProfileFixedEntrance()) {
            C12N4 c12n4 = this.LLJILJILJ;
            if (c12n4 == null) {
                c12n4 = null;
            }
            c12n4.LJFF(true);
            C12N4 c12n42 = this.LLJILJILJ;
            if (c12n42 == null) {
                c12n42 = null;
            }
            c12n42.getClass();
            c12n42.LJI(new AwS143S1100000_29(c12n42, 16));
            C12N4 c12n43 = this.LLJILJILJ;
            if (c12n43 == null) {
                c12n43 = null;
            }
            c12n43.getClass();
            c12n43.LJI(new AwS143S1100000_29(c12n43, 15));
            C12N4 c12n44 = this.LLJILJILJ;
            if (c12n44 == null) {
                c12n44 = null;
            }
            c12n44.getClass();
            c12n44.LJI(new AwS143S1100000_29(c12n44, 14));
            Keva repo = Keva.getRepo("SettingsLiveEvents");
            String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(curSecUserId);
            sbLIZ.append("_has_see_live_events");
            boolean z3 = repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(curSecUserId);
            sbLIZ2.append("_has_highlight_live_events");
            if (!repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false) && !z3) {
                Keva repo2 = Keva.getRepo("SettingsLiveEvents");
                String curSecUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(curSecUserId2);
                sbLIZ3.append("_has_see_live_events");
                repo2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ3), true);
                C12N4 c12n45 = this.LLJILJILJ;
                if (c12n45 == null) {
                    c12n45 = null;
                }
                c12n45.getClass();
                c12n45.LJI(new AwS115S0110000_29(c12n45, true, 7));
            }
            C1070560dxu.LIZ.getClass();
            C1070560dxu.LIZIZ("show");
        }
        if (C19290910dX.LJIIJ()) {
            C12N4 c12n46 = this.LLJILLL;
            if (c12n46 == null) {
                c12n46 = null;
            }
            c12n46.LJFF(true);
            C12N4 c12n47 = this.LLJILLL;
            if (c12n47 == null) {
                c12n47 = null;
            }
            boolean zLJ = C19290910dX.LJ();
            c12n47.getClass();
            c12n47.LJI(new AwS115S0110000_29(c12n47, zLJ, 7));
        } else {
            C12N4 c12n48 = this.LLJILLL;
            if (c12n48 == null) {
                c12n48 = null;
            }
            c12n48.LJFF(false);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_live_setting_replay_cache", true, false)) {
            C12N4 c12n49 = this.LLJJ;
            if (c12n49 == null) {
                c12n49 = null;
            }
            c12n49.LJFF(((Keva) this.LLJIJIL.getValue()).getBoolean("replay_entry_show", false));
        }
        C12N1.LIZ.getClass();
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(Api.LIZ);
        if (interfaceC2661011fLIZ != null) {
            objCreate = interfaceC2661011fLIZ.create(C12N1.class);
        } else {
            objCreate = null;
        }
        ListenableFuture<LiveReplayEntranceResponse> listenableFutureLIZ = ((C12N1) objCreate).LIZ();
        listenableFutureLIZ.LJIIJJI(new C135Q(listenableFutureLIZ, new C11U6<LiveReplayEntranceResponse>() { // from class: X.12N0
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                InterfaceC486570J6h interfaceC486570J6hR3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).r3();
                if (interfaceC486570J6hR3 != null) {
                    HashMap map = new HashMap();
                    map.put("error_msg", th.getMessage());
                    map.put("error_code", -1);
                    interfaceC486570J6hR3.LIZ(1, "ttlive_live_replay_setting_entrance_show_all", map);
                    interfaceC486570J6hR3.LIZ(1, "ttlive_live_replay_setting_entrance_show_error", map);
                }
            }

            @Override // X.C11U6
            public final void onSuccess(LiveReplayEntranceResponse liveReplayEntranceResponse) {
                Object objLIZIZ;
                LiveReplayEntranceResponse liveReplayEntranceResponse2 = liveReplayEntranceResponse;
                if (liveReplayEntranceResponse2 != null) {
                    C12N4 c12n410 = null;
                    if (liveReplayEntranceResponse2.enableLiveReplay == 1) {
                        ((Keva) this.LIZ.LLJIJIL.getValue()).storeBoolean("replay_entry_show", true);
                        C12N4 c12n411 = this.LIZ.LLJJ;
                        if (c12n411 != null) {
                            c12n410 = c12n411;
                        }
                        c12n410.LJFF(true);
                        this.LIZ.getClass();
                        LivePage.ZR("show");
                    } else {
                        ((Keva) this.LIZ.LLJIJIL.getValue()).storeBoolean("replay_entry_show", false);
                        C12N4 c12n412 = this.LIZ.LLJJ;
                        if (c12n412 != null) {
                            c12n410 = c12n412;
                        }
                        c12n410.LJFF(false);
                    }
                }
                InterfaceC486570J6h interfaceC486570J6hR3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).r3();
                if (interfaceC486570J6hR3 != null) {
                    HashMap map = new HashMap();
                    if (liveReplayEntranceResponse2 != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(liveReplayEntranceResponse2.enableLiveReplay);
                        sbLIZ4.append("");
                        objLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    } else {
                        objLIZIZ = -1;
                    }
                    map.put("live_replay_show", objLIZIZ);
                    interfaceC486570J6hR3.LIZ(0, "ttlive_live_replay_setting_entrance_show_all", map);
                }
            }
        }), ExecutorC1592406Li.LLILLJJLI);
    }
}
