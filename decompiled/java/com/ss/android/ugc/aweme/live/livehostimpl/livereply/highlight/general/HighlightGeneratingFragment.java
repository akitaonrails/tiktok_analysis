package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general;

import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C1835140xr6;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C343970De7;
import X.C452501pT;
import X.C485260J1g;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class HighlightGeneratingFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklPyohLTHELIOSUgMGE7ISIkJSY0IDFiLio9LTctJWEbISIkJSY0IDELLCE2OiQ4ICE0DjctLiI2JjE=";
    public final Map<String, String> LL;
    public SmartImageView LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public final C01GW LLILZLL;

    public HighlightGeneratingFragment() {
        this(null);
    }

    public final void MR() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
        C1835140xr6.LLILZIL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1835140xr6.LL.LJIIIIZZ(16778115);
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public HighlightGeneratingFragment(Map<String, String> map) {
        this.LL = map;
        this.LLILZ = "";
        this.LLILZIL = "";
        this.LLILZLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(98));
    }

    public final void NR(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = this.LL;
        String str6 = "";
        if (map == null || (str2 = map.get("anchor_id")) == null) {
            str2 = "";
        }
        linkedHashMap.put("anchor_id", str2);
        linkedHashMap.put("viewer_user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        Map<String, String> map2 = this.LL;
        if (map2 == null || (str3 = map2.get("room_id")) == null) {
            str3 = "";
        }
        linkedHashMap.put("room_id", str3);
        Map<String, String> map3 = this.LL;
        if (map3 == null || (str4 = map3.get("enter_from_page")) == null) {
            str4 = "";
        }
        linkedHashMap.put("enter_from_page", str4);
        Map<String, String> map4 = this.LL;
        if (map4 != null && (str5 = map4.get("enter_from")) != null) {
            str6 = str5;
        }
        linkedHashMap.put("enter_from", str6);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("click_type", str);
        C485260J1g.LIZ.getClass();
        C20684815ws.LJIILLIIL("livesdk_fans_highlight_generate_card", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.jn8);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 7), viewFindViewById);
        }
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.jmt);
        View viewFindViewById2 = view.findViewById(R.id.jn3);
        if (viewFindViewById2 != null) {
            viewFindViewById2.startAnimation((Animation) this.LLILZLL.getValue());
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1835140xr6 c1835140xr6 = C1835140xr6.LL;
        this.LLILLL = C1835140xr6.LIZJ(this.LLILZIL, new AwS641S0100000_27(this, 133));
        NR("show");
        DataChannelGlobal.LLILZ.BQ2(this, this, GeneralHighlightRoomEndEvent.class, new AwS606S0100000_27(this, 125));
        DataChannelGlobal.LLILZ.BQ2(this, this, GeneralHighlightDoneEvent.class, new AwS606S0100000_27(this, 126));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        Map<String, String> map = this.LL;
        String str3 = "";
        if (map == null || (str = map.get("room_id")) == null) {
            str = "";
        }
        this.LLILZ = str;
        Map<String, String> map2 = this.LL;
        if (map2 != null && (str2 = map2.get("fragment_id")) != null) {
            str3 = str2;
        }
        this.LLILZIL = str3;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dds, viewGroup, false);
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
