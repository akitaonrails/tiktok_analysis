package com.ss.android.ugc.aweme.fangroup.fragment;

import X.C00G7;
import X.C098200Yq;
import X.C0I0B;
import X.C0OM1;
import X.C0QSJ;
import X.C0ZY9;
import X.C1230370i7f;
import X.C1231130i8t;
import X.C1231150i8v;
import X.C1251150ifB;
import X.C1528205ya;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1994707rd;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.FanGroupJoinPanelScope;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinCheckResult;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS190S0400000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupJoinPanelFragment extends BaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtJyghJzA8ZyHELIOSkhKSIhLCEnZgMtJwghJzA8AyA6JhUtJyo/DjctLiI2JjE=";
    public String LLIZ = "close_page";
    public ViewGroup LLIZLLLIL;
    public View LLJ;
    public C1231150i8v LLJI;
    public GroupJoinResponse LLJIJIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FanGroupJoinPanelScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FanGroupJoinPanelScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FanGroupJoinPanelScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        String str2;
        super.onDestroy();
        C1231150i8v c1231150i8v = this.LLJI;
        if (c1231150i8v != null) {
            String etGroupType = c1231150i8v.getEtGroupType();
            String str3 = "";
            if (etGroupType == null) {
                etGroupType = "";
            }
            C1528205ya c1528205ya = C1528205ya.LIZJ;
            String conversationId = c1231150i8v.getConversationId();
            Map<String, String> extraMap = c1231150i8v.getExtraMap();
            if (extraMap == null || (str = extraMap.get("enter_from")) == null) {
                str = "";
            }
            String enterMethod = c1231150i8v.getEnterMethod();
            if (enterMethod == null) {
                Map<String, String> extraMap2 = c1231150i8v.getExtraMap();
                if (extraMap2 != null && (str2 = extraMap2.get("enter_method")) != null) {
                    str3 = str2;
                }
            } else {
                str3 = enterMethod;
            }
            String value = C0ZY9.FAN_GROUP.getValue();
            GroupJoinResponse groupJoinResponse = this.LLJIJIL;
            c1528205ya.LJJIIJ(C0I0B.LJFF.LIZIZ(), groupJoinResponse != null ? groupJoinResponse.actionType : null, conversationId, str, str3, value, etGroupType, this.LLIZ);
        }
    }

    public final void SR(boolean z) {
        String str;
        String str2;
        String etGroupType;
        List<GroupJoinCheckResult> list;
        String enterMethod;
        String enterMethod2;
        Map<String, String> extraMap;
        C1231150i8v c1231150i8v = this.LLJI;
        String str3 = "";
        if (c1231150i8v == null || (extraMap = c1231150i8v.getExtraMap()) == null || (str = extraMap.get("enter_from")) == null) {
            str = "";
        }
        if (!Intrinsics.LJFF(str, "profile_card")) {
            str2 = "";
        } else {
            str2 = "fan_group";
        }
        C1231150i8v c1231150i8v2 = this.LLJI;
        String conversationId = null;
        if (c1231150i8v2 != null) {
            etGroupType = c1231150i8v2.getEtGroupType();
        } else {
            etGroupType = null;
        }
        GroupJoinResponse groupJoinResponse = this.LLJIJIL;
        if (groupJoinResponse != null) {
            list = groupJoinResponse.result;
        } else {
            list = null;
        }
        boolean zContains = ((List) C1231130i8t.LIZ(list).getSecond()).contains(Integer.valueOf(C00G7.AUDIT_SWITCH.getValue()));
        if (z) {
            C1231150i8v c1231150i8v3 = this.LLJI;
            if (c1231150i8v3 == null || (enterMethod2 = c1231150i8v3.getEnterMethod()) == null) {
                enterMethod2 = "";
            }
            C1231150i8v c1231150i8v4 = this.LLJI;
            if (c1231150i8v4 != null) {
                conversationId = c1231150i8v4.getConversationId();
            }
            Boolean boolValueOf = Boolean.valueOf(zContains);
            if (etGroupType != null) {
                str3 = etGroupType;
            }
            C1230370i7f.LIZJ(boolValueOf, enterMethod2, "", conversationId, str3, str2, true, new Pair("enter_from", str));
            return;
        }
        C1231150i8v c1231150i8v5 = this.LLJI;
        if (c1231150i8v5 == null || (enterMethod = c1231150i8v5.getEnterMethod()) == null) {
            enterMethod = "";
        }
        C1231150i8v c1231150i8v6 = this.LLJI;
        if (c1231150i8v6 != null) {
            conversationId = c1231150i8v6.getConversationId();
        }
        Boolean boolValueOf2 = Boolean.valueOf(zContains);
        if (etGroupType != null) {
            str3 = etGroupType;
        }
        C1230370i7f.LIZLLL(boolValueOf2, enterMethod, "", conversationId, str3, str2, true, new Pair("enter_from", str));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        C1231150i8v c1231150i8v;
        Bundle arguments;
        GroupJoinResponse groupJoinResponse;
        Context context;
        int i;
        Integer numValueOf;
        int i2;
        int i3;
        super.onViewCreated(view, bundle);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("join_panel_params");
        } else {
            serializable = null;
        }
        if ((serializable instanceof C1231150i8v) && (c1231150i8v = (C1231150i8v) serializable) != null && (arguments = getArguments()) != null && (groupJoinResponse = (GroupJoinResponse) arguments.getParcelable("join_panel_join_group_resp")) != null) {
            this.LLJI = c1231150i8v;
            this.LLJIJIL = groupJoinResponse;
            this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.hn1);
            C723850SaN.LIZ(this, false, null, new AwS228S0300000_19(this, c1231150i8v, groupJoinResponse, 11), 3);
            TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.hn2);
            tuxNavBar.setNavActions(new C0OM1());
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 1414));
            tuxNavBar.LIZ(c1251150ifB);
            C197039127h c197039127h = (C197039127h) view.findViewById(R.id.hmy);
            c197039127h.setText(groupJoinResponse.btnText);
            Integer num = groupJoinResponse.btnStatus;
            int value = EnumC1994707rd.DISABLE.getValue();
            if (num != null && num.intValue() == value) {
                c197039127h.setSupportClickWhenDisable(false);
                c197039127h.setEnabled(false);
            }
            C786410Ut5.I7(new AbS190S0400000_19(c197039127h, this, groupJoinResponse, c1231150i8v, 1), c197039127h);
            List<GroupJoinCheckResult> list = groupJoinResponse.result;
            ViewGroup viewGroup = this.LLIZLLLIL;
            if (viewGroup != null && list != null) {
                for (GroupJoinCheckResult groupJoinCheckResult : list) {
                    String str = groupJoinCheckResult.checkMessage;
                    if (str != null && str.length() != 0 && (context = getContext()) != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        boolean z = groupJoinCheckResult.pass;
                        if (z) {
                            i = R.raw.icon_tick_fill;
                        } else {
                            i = R.raw.icon_lock;
                        }
                        c419910GdJ.LIZ = i;
                        if (z) {
                            numValueOf = Integer.valueOf(R.attr.a1v);
                        } else {
                            numValueOf = Integer.valueOf(R.attr.a1k);
                        }
                        c419910GdJ.LJ = numValueOf;
                        LinearLayout linearLayout = new LinearLayout(getContext());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                        linearLayout.setGravity(48);
                        C786410Ut5.d6(linearLayout, layoutParams);
                        linearLayout.setOrientation(0);
                        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))));
                        tuxIconView.setTuxIcon(c419910GdJ);
                        linearLayout.addView(tuxIconView);
                        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                        tuxTextView.setText(groupJoinCheckResult.checkMessage);
                        if (groupJoinCheckResult.pass) {
                            i2 = R.attr.a1h;
                        } else {
                            i2 = R.attr.a1k;
                        }
                        tuxTextView.setTextColorRes(i2);
                        if (groupJoinCheckResult.pass) {
                            i3 = 42;
                        } else {
                            i3 = 41;
                        }
                        tuxTextView.setTuxFont(i3);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        C786410Ut5.R6(tuxTextView, layoutParams2);
                        linearLayout.addView(tuxTextView);
                        viewGroup.addView(linearLayout);
                    }
                }
            }
            SR(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ci9, viewGroup, false);
        this.LLJ = viewTd;
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
