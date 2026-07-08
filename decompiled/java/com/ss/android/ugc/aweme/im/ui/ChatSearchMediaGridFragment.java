package com.ss.android.ugc.aweme.im.ui;

import X.C06LJ;
import X.C098200Yq;
import X.C0OM1;
import X.C0QSJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC904370Zdr;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import X.InterfaceC836760Ws6;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailPageScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS18S2200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC836760Ws6
public final class ChatSearchMediaGridFragment extends BaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzo6HELIOSZgYkKDsALSQ+KiceLSElKAghISEKOy40JSAiPQ==";

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatDetailPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatDetailPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatDetailPageScope.class);
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
    public final void onViewCreated(View view, Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        EnumC904370Zdr next;
        Intent intent;
        Intent intent2;
        Intent intent3;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        String string = "";
        if (activity == null || (intent3 = activity.getIntent()) == null) {
            stringExtra = "";
        } else {
            try {
                stringExtra = intent3.getStringExtra("conversation_id");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        C19EG activity2 = getActivity();
        if (activity2 == null || (intent2 = activity2.getIntent()) == null) {
            stringExtra2 = "";
        } else {
            try {
                stringExtra2 = intent2.getStringExtra("user_id");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
        }
        C19EG activity3 = getActivity();
        if (activity3 == null || (intent = activity3.getIntent()) == null) {
            stringExtra3 = "";
        } else {
            try {
                stringExtra3 = intent.getStringExtra("media_type");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
        }
        Iterator<EnumC904370Zdr> it2 = EnumC904370Zdr.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.name(), stringExtra3)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC904370Zdr enumC904370Zdr = next;
        if (enumC904370Zdr == null) {
            enumC904370Zdr = EnumC904370Zdr.SHARED_VIDEOS;
        }
        int i = C06LJ.LIZ[enumC904370Zdr.ordinal()];
        if (i != 1) {
            if (i == 2) {
                string = getString(2131832150);
            }
        } else {
            string = getString(2131832155);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 594));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        C723850SaN.LIZ(this, false, null, new AwS18S2200000_2(this, stringExtra, stringExtra2, enumC904370Zdr, 0), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cho, viewGroup, false);
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
