package com.ss.android.ugc.aweme.im.ui;

import X.C098200Yq;
import X.C0I0B;
import X.C0QSJ;
import X.C1241040iOs;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C673150Qan;
import X.C687700QyG;
import X.C689050R1b;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import X.InterfaceC836760Ws6;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatHistorySearchAnalytics;
import com.ss.android.ugc.aweme.im.ui.scope.HistorySearchFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS58S1300000_19;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC836760Ws6
public final class IMHistorySearchFragment extends BaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhHELIOSZzo6ZgwBASYgPCo+MBw2KTcvIQkhKSIhLCEn";

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{HistorySearchFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HistorySearchFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HistorySearchFragmentScope.class);
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS241S0000000_10.get$arr$(97));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        String str = "";
        if (activity == null || (intent4 = activity.getIntent()) == null) {
            stringExtra = "";
        } else {
            try {
                stringExtra = intent4.getStringExtra("history_target_group_key");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        C19EG activity2 = getActivity();
        if (activity2 == null || (intent3 = activity2.getIntent()) == null) {
            stringExtra2 = "";
        } else {
            try {
                stringExtra2 = intent3.getStringExtra("enter_from_key");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
        }
        C19EG activity3 = getActivity();
        if (activity3 == null || (intent2 = activity3.getIntent()) == null) {
            stringExtra3 = "";
        } else {
            try {
                stringExtra3 = intent2.getStringExtra("chat_type_key");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
        }
        C19EG activity4 = getActivity();
        if (activity4 != null && (intent = activity4.getIntent()) != null) {
            try {
                String stringExtra4 = intent.getStringExtra("to_user_id_key");
                if (stringExtra4 != null) {
                    str = stringExtra4;
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        C1241040iOs c1241040iOs = new C1241040iOs(stringExtra2, stringExtra, stringExtra3, str);
        IIMChatHistorySearchAnalytics iIMChatHistorySearchAnalytics = (IIMChatHistorySearchAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMChatHistorySearchAnalytics.class, false, false, false, 14, null);
        if (iIMChatHistorySearchAnalytics != null) {
            iIMChatHistorySearchAnalytics.LIZ("ttsocial_chat_search_blank_page_enter", iIMChatHistorySearchAnalytics.LIZJ(stringExtra2, stringExtra3, stringExtra, str), C0I0B.LJFF.LIZIZ());
        }
        C723850SaN.LIZ(this, false, null, new AwS58S1300000_19(this, stringExtra, c1241040iOs, view, 2), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C689050R1b(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chn, viewGroup, false);
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
