package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.C0OIZ;
import X.C0OLO;
import X.C0OLV;
import X.C0OM1;
import X.C0OPQ;
import X.C0OPX;
import X.C0OSF;
import X.C0OWM;
import X.C0P4Z;
import X.C0PEM;
import X.C1250280idm;
import X.C1251150ifB;
import X.C13BV;
import X.C1558520qew;
import X.C1616706Ur;
import X.C1618770sE7;
import X.C1954807lC;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C497820Jfg;
import X.C605190NoT;
import X.C605900Npc;
import X.C605990Npl;
import X.C606010Npn;
import X.C617800OLa;
import X.C620650OVz;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC617060OIe;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.EnumC623310Ocb;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPageBarAssem extends BaseBulletinBarAssem implements InterfaceC623330Ocd {
    public final EnumC619890OTb LLJZ = EnumC619890OTb.PAGE_TITLE;
    public C0OLO LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public long LLLFF;
    public C605900Npc LLLFFI;
    public boolean LLLFZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJZ);
        }
        C605900Npc c605900Npc = this.LLLFFI;
        if (c605900Npc != null) {
            c605900Npc.LIZ();
        }
        this.LLLFFI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C605900Npc c605900Npc = this.LLLFFI;
        if (c605900Npc != null) {
            c605900Npc.LJIIIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C605900Npc c605900Npc = this.LLLFFI;
        if (c605900Npc != null) {
            c605900Npc.LJIIJ();
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem
    public final void Go(int i) {
        this.LLJJJJLIIL = i;
        C0OLO c0olo = this.LLJZIJLIL;
        if (c0olo != null) {
            if (this.LLJJJJ) {
                i += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            }
            c0olo.setMarginEnd(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View viewLJII;
        C0OLO c0olo;
        String str;
        String str2;
        Context context;
        Object parent;
        View view2;
        C427660Gpo bulletinPageBarInfoAvatarFromXml;
        super.onViewCreated(view);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        C0OM1 c0om1 = new C0OM1();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0OLV c0olvLo = Lo();
        if (c0olvLo == null || !c0olvLo.LLIZ) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS553S0100000_9(this, 21));
            arrayList.add(c1251150ifB);
        }
        C1250280idm c1250280idm = new C1250280idm();
        Context context2 = getContext();
        if (context2 != null) {
            c1250280idm.LIZJ = new C0OLO(context2);
            c1250280idm.LIZLLL = true;
            c1250280idm.LIZIZ = "bulletin_info_bar";
            arrayList.add(c1250280idm);
            Context context3 = getContext();
            if (context3 != null) {
                Vo(context3, arrayList2);
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_ellipsis_horizontal;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LIZIZ = "bulletin_see_more_bar";
                c1251150ifB2.LIZJ(new AwS553S0100000_9(this, 22));
                arrayList2.add(c1251150ifB2);
                c0om1.LIZLLL = true;
                c0om1.LIZLLL(arrayList);
                c0om1.LIZ(arrayList2);
                TuxNavBar tuxNavBar = this.LLJIJIL;
                if (tuxNavBar != null) {
                    tuxNavBar.setNavActions(c0om1);
                }
                TuxNavBar tuxNavBar2 = this.LLJIJIL;
                if (tuxNavBar2 != null) {
                    tuxNavBar2.setNavBackground(C1618770sE7.LIZ(R.attr.zp));
                }
                TuxNavBar tuxNavBar3 = this.LLJIJIL;
                if (tuxNavBar3 != null) {
                    viewLJII = tuxNavBar3.LJII("bulletin_info_bar");
                } else {
                    viewLJII = null;
                }
                if (viewLJII instanceof C0OLO) {
                    c0olo = (C0OLO) viewLJII;
                } else {
                    c0olo = null;
                }
                this.LLJZIJLIL = c0olo;
                if (c0olo != null && (bulletinPageBarInfoAvatarFromXml = c0olo.getBulletinPageBarInfoAvatarFromXml()) != null) {
                    C786410Ut5.T8(bulletinPageBarInfoAvatarFromXml, new ACListenerS144S0100000_9(this, 18));
                }
                So();
                if (!C1616706Ur.LIZ() && (context = getContext()) != null) {
                    TuxNavBar tuxNavBar4 = this.LLJIJIL;
                    if (tuxNavBar4 != null) {
                        parent = tuxNavBar4.getParent();
                    } else {
                        parent = null;
                    }
                    if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.topMargin = C497820Jfg.LIZJ(context);
                            C786410Ut5.W5(view2, marginLayoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                }
                AssemViewModel.asyncSubscribe$default(No(), new C2217381BqS() { // from class: X.0OLb
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0OKY) obj).LL;
                    }
                }, null, null, null, new AwS588S0100000_9(this, 14), 14, null);
                C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OLU
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Long.valueOf(((C0OKY) obj).LLIZ);
                    }
                }, null, new AwS623S0100000_9(this, 9), 6);
                AssemViewModel.asyncSubscribe$default(No(), new C2217381BqS() { // from class: X.0OLe
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0OKY) obj).LLILLJJLI;
                    }
                }, this, null, null, null, new AwS588S0100000_9(this, 16), 28, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("profileViewModel.selectSubscribe:");
                sbLIZ.append(No());
                sbLIZ.append(", ");
                sbLIZ.append(No().LLILLJJLI);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OLd
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0OKY) obj).LLILZ;
                    }
                }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 5), 4);
                C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OKa
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0OKY) obj).LLJJLIIIJLLLLLLLZ;
                    }
                }, null, new AwS623S0100000_9(this, 6), 6);
                Zo();
                ap();
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C606010Npn(this, null), 3);
                C0OLV c0olvLo2 = Lo();
                if (c0olvLo2 != null && c0olvLo2.LLILLL) {
                    if (No().getState().LL.LIZ() == null) {
                        C0OLV c0olvLo3 = Lo();
                        if (c0olvLo3 != null) {
                            str2 = c0olvLo3.LL;
                        } else {
                            str2 = null;
                        }
                        BulletinAccountEditResponse bulletinAccountEditResponseLIZ = C0OIZ.LIZ(str2);
                        if (bulletinAccountEditResponseLIZ != null) {
                            No().MQ2(bulletinAccountEditResponseLIZ, EnumC617060OIe.IDENTITY_CREATOR.getValue());
                        }
                    }
                    C0OLV c0olvLo4 = Lo();
                    if (c0olvLo4 != null && (str = c0olvLo4.LL) != null) {
                        C605900Npc c605900Npc = new C605900Npc(CastLongProtector.parseLong(str), new C605990Npl(this), LifecycleOwnerKt.getLifecycleScope(this));
                        this.LLLFFI = c605900Npc;
                        c605900Npc.LJII(1, -1, System.currentTimeMillis());
                        C605900Npc c605900Npc2 = this.LLLFFI;
                        if (c605900Npc2 != null) {
                            c605900Npc2.LJIIIZ();
                        }
                    }
                    BulletinProfileViewModel bulletinProfileViewModelNo = No();
                    bulletinProfileViewModelNo.getClass();
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinProfileViewModelNo), C0PEM.LIZJ, null, new C605190NoT(bulletinProfileViewModelNo, null), 2);
                } else {
                    No().RQ2(true);
                }
                No().NQ2();
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    public final void dp(String str, String str2) {
        C0OLV c0olvLo;
        String str3;
        long jLongValue;
        String str4;
        boolean z;
        Integer numValueOf;
        String str5;
        String str6;
        if (this.LLLF && (c0olvLo = Lo()) != null && (str3 = c0olvLo.LL) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://inbox/bulletin_board/profile");
            Bundle bundle = new Bundle();
            Long l = No().LLILLJJLI;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            bundle.putLong("bulletin_board_id", jLongValue);
            C0OLV c0olvLo2 = Lo();
            String str7 = "";
            if (c0olvLo2 == null || (str4 = c0olvLo2.LLILLJJLI) == null) {
                str4 = "";
            }
            C786410Ut5.LJJJI("previous_page", str4, bundle);
            C0OLV c0olvLo3 = Lo();
            if (c0olvLo3 != null) {
                z = c0olvLo3.LLILLL;
            } else {
                z = false;
            }
            bundle.putBoolean("enter_from_create", z);
            C0OLV c0olvLo4 = Lo();
            String str8 = null;
            if (c0olvLo4 != null) {
                numValueOf = Integer.valueOf(c0olvLo4.LLILZ);
            } else {
                numValueOf = null;
            }
            C786410Ut5.LJJJI("bulletin_account_status", String.valueOf(numValueOf), bundle);
            C0OLV c0olvLo5 = Lo();
            if (c0olvLo5 != null) {
                str5 = c0olvLo5.LLILZIL;
            } else {
                str5 = null;
            }
            C786410Ut5.LJJJI("conv_short_id", str5, bundle);
            C0OLV c0olvLo6 = Lo();
            if (c0olvLo6 != null) {
                str8 = c0olvLo6.LLILZLL;
            }
            C786410Ut5.LJJJI("msg_id", str8, bundle);
            C786410Ut5.LJJJI("profile_open_reason", str2, bundle);
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open(1, new C0P4Z(this, 3));
            C0OPQ c0opq = C0OPQ.LIZ;
            int iIE = No().IE();
            Pair[] pairArr = new Pair[2];
            C0OLV c0olvLo7 = Lo();
            if (c0olvLo7 != null && (str6 = c0olvLo7.LLILLJJLI) != null) {
                str7 = str6;
            }
            pairArr[0] = new Pair("previous_page", str7);
            pairArr[1] = new Pair("enter_method", str);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c0opq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
            c2344009Gk.LJIIIIZZ("channel_id", str3);
            c2344009Gk.LJIIIIZZ("previous_page", (String) mapLJIIIIZZ.get("previous_page"));
            c2344009Gk.LJIIIIZZ("enter_method", (String) mapLJIIIIZZ.get("enter_method"));
            c2344009Gk.LIZJ(iIE, "is_author");
            C20684815ws.LJIILLIIL("enter_bulletin_board_detail_page", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar == null) {
            return;
        }
        if (c620650OVz.LIZ()) {
            int i = C617800OLa.LIZ[enumC617880OLi.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C786410Ut5.LLLLZLLLI(tuxNavBar, 8);
                        return;
                    }
                    throw new C1954807lC();
                }
                interfaceC617820OLc.Nc(tuxNavBar, 150L, 0L, true, false);
                interfaceC617820OLc.vh(tuxNavBar, EnumC623310Ocb.UP, 150L, 0L, false);
                return;
            }
            return;
        }
        if (!c620650OVz.LIZJ()) {
            return;
        }
        int i2 = C617800OLa.LIZ[enumC617880OLi.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    C786410Ut5.LLLLZLLLI(tuxNavBar, 0);
                    C786410Ut5.C5(tuxNavBar, 1.0f);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxNavBar);
                    tuxNavBar.setTranslationY(0.0f);
                    return;
                }
                throw new C1954807lC();
            }
            interfaceC617820OLc.S7(tuxNavBar, 150L, 0L, false);
            interfaceC617820OLc.e6(tuxNavBar, EnumC623310Ocb.DOWN, 150L, 0L, false);
            return;
        }
        C786410Ut5.LLLLZLLLI(tuxNavBar, 0);
        C786410Ut5.C5(tuxNavBar, 0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxNavBar);
        tuxNavBar.setTranslationY(-tuxNavBar.getHeight());
    }
}
