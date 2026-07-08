package com.ss.android.ugc.aweme.ad.feed.dialog;

import X.C01GW;
import X.C098200Yq;
import X.C1064520doA;
import X.C1064970dot;
import X.C11NJ;
import X.C11S5;
import X.C1389890mGx;
import X.C13BV;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C312900COi;
import X.C339140DRg;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1064920doo;
import Y.AfS185S0100000_16;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdDislikeSubReasonV2Dialog extends GlobalHookDialogFragment implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQoZyk2LSFiLSYyHELIOSJCorZwk2LSENLQs6OyklIioAPSceLC4gJysaews6KSkjLg==";
    public RecyclerView LL;
    public TuxIconView LLILLJJLI;
    public C197039127h LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public boolean LLIZ;
    public C339140DRg LLJ;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 59));
    public final C11NJ LLIZLLLIL = new C11NJ();
    public final List<String> LLJI = new ArrayList();
    public final float LLJILJILJ = 100.0f;

    public final void PR() {
        AdDislikeInfo dislikeInfo;
        InterfaceC1064920doo callback;
        this.LLIZ = true;
        dismiss();
        C1064970dot c1064970dotNR = NR();
        if (c1064970dotNR != null && (callback = c1064970dotNR.getCallback()) != null) {
            callback.onDismiss();
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            C1064970dot c1064970dotNR2 = NR();
            c1389890mGx.LJIIJ((c1064970dotNR2 == null || (dislikeInfo = c1064970dotNR2.getDislikeInfo()) == null) ? null : dislikeInfo.toastText);
            c1389890mGx.LJIIJJI();
        }
        C1064520doA value = C1064520doA.LIZ.getValue();
        C13BV c13bv = C13BV.INSTANCE;
        AFwS300S0000000_16 aFwS300S0000000_16 = AFwS300S0000000_16.get$arr$(4);
        value.getClass();
        C1064520doA.LIZ(c13bv, 2, aFwS300S0000000_16);
    }

    public final C197039127h MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cty) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1064970dot NR() {
        return (C1064970dot) this.LLILZLL.getValue();
    }

    public final RecyclerView OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tva) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        String aid;
        String adId;
        String creativeId;
        String logExtra;
        String roomId;
        InterfaceC1064920doo callback;
        AdDislikeInfo dislikeInfo;
        AdDislikeInfo dislikeInfo2;
        InterfaceC1064920doo callback2;
        if (view == null) {
            return;
        }
        int id = view.getId();
        String str = null;
        if (id == R.id.lc0) {
            this.LLIZ = true;
            dismiss();
            C1064520doA value = C1064520doA.LIZ.getValue();
            C13BV c13bv = C13BV.INSTANCE;
            AFwS300S0000000_16 aFwS300S0000000_16 = AFwS300S0000000_16.get$arr$(2);
            value.getClass();
            C1064520doA.LIZ(c13bv, 0, aFwS300S0000000_16);
            C1064970dot c1064970dotNR = NR();
            if (c1064970dotNR != null && (callback2 = c1064970dotNR.getCallback()) != null) {
                callback2.onDismiss();
            }
            C19EG activity = getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                C1064970dot c1064970dotNR2 = NR();
                if (c1064970dotNR2 != null && (dislikeInfo2 = c1064970dotNR2.getDislikeInfo()) != null) {
                    str = dislikeInfo2.toastText;
                }
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
            C20684815ws.onEventV3("cancel_subcategory");
            return;
        }
        if (id != R.id.cty) {
            return;
        }
        List<String> list = this.LLJI;
        C1064970dot c1064970dotNR3 = NR();
        if (c1064970dotNR3 != null && (dislikeInfo = c1064970dotNR3.getDislikeInfo()) != null) {
            str = dislikeInfo.toastText;
        }
        if (list == null || str == null) {
            return;
        }
        this.LLIZ = false;
        dismiss();
        C1064970dot c1064970dotNR4 = NR();
        if (c1064970dotNR4 != null && (callback = c1064970dotNR4.getCallback()) != null) {
            callback.onDismiss();
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity2);
            c1389890mGx2.LJIIJ(str);
            c1389890mGx2.LJIIJJI();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reasons_v2", list);
        C11NJ c11nj = this.LLIZLLLIL;
        DislikeReasonApi.LIZ.getClass();
        DislikeReasonApi dislikeReasonApiLIZ = C312900COi.LIZ();
        C1064970dot c1064970dotNR5 = NR();
        String str2 = "";
        if (c1064970dotNR5 == null || (aid = c1064970dotNR5.getAid()) == null) {
            aid = "";
        }
        C1064970dot c1064970dotNR6 = NR();
        if (c1064970dotNR6 == null || (adId = c1064970dotNR6.getAdId()) == null) {
            adId = "";
        }
        C1064970dot c1064970dotNR7 = NR();
        if (c1064970dotNR7 == null || (creativeId = c1064970dotNR7.getCreativeId()) == null) {
            creativeId = "";
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        C1064970dot c1064970dotNR8 = NR();
        if (c1064970dotNR8 == null || (logExtra = c1064970dotNR8.getLogExtra()) == null) {
            logExtra = "";
        }
        C1064970dot c1064970dotNR9 = NR();
        if (c1064970dotNR9 != null && (roomId = c1064970dotNR9.getRoomId()) != null) {
            str2 = roomId;
        }
        c11nj.LIZ(dislikeReasonApiLIZ.submitReason(aid, adId, creativeId, strJ3, logExtra, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 6), new AfS185S0100000_16(this, 7)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.i7);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        AdDislikeInfo dislikeInfo;
        InterfaceC1064920doo callback;
        super.onDismiss(dialogInterface);
        if (this.LLIZ) {
            C1064970dot c1064970dotNR = NR();
            if (c1064970dotNR != null && (callback = c1064970dotNR.getCallback()) != null) {
                callback.onDismiss();
            }
            C20684815ws.onEventV3("cancel_subcategory");
            C19EG activity = getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                C1064970dot c1064970dotNR2 = NR();
                if (c1064970dotNR2 != null && (dislikeInfo = c1064970dotNR2.getDislikeInfo()) != null) {
                    str = dislikeInfo.toastText;
                } else {
                    str = null;
                }
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        C1064520doA value = C1064520doA.LIZ.getValue();
        C13BV c13bv = C13BV.INSTANCE;
        AFwS300S0000000_16 aFwS300S0000000_16 = AFwS300S0000000_16.get$arr$(3);
        value.getClass();
        C1064520doA.LIZ(c13bv, 1, aFwS300S0000000_16);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.dialog.FeedAdDislikeSubReasonV2Dialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bmg, viewGroup, false);
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
