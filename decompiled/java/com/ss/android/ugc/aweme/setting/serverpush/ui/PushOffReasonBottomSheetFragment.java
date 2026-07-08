package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.AbstractC666100QAu;
import X.C098200Yq;
import X.C0OM1;
import X.C0TV8;
import X.C1251150ifB;
import X.C1260870iur;
import X.C1391190mJ3;
import X.C13LP;
import X.C1685300txQ;
import X.C1748470vbJ;
import X.C1749190vcT;
import X.C1749220vcW;
import X.C1749240vcY;
import X.C189200o6;
import X.C1909200zmY;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21578619ce;
import X.C2344009Gk;
import X.C343970De7;
import X.C786410Ut5;
import X.EnumC1749210vcV;
import X.InterfaceC1237370iIx;
import X.InterfaceC1750490veZ;
import X.InterfaceC1909210zmZ;
import X.InterfaceC344240DeY;
import Y.ACListenerS160S0100000_26;
import Y.ACallableS431S0100000_28;
import Y.AComparatorS31S0000000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReasonsData;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes27.dex */
public final class PushOffReasonBottomSheetFragment extends Fragment implements InterfaceC344240DeY, InterfaceC1909210zmZ {
    public static PushOffReasonsData LLJILLL = null;
    public static String LLJJ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOiohPiA+OTHELIOSogIGs5IGEDPTYkBik1GiAtOiA9Cio4PSA+Gy0pLDsVOiQrJCo9PA==";
    public C197039127h LL;
    public C1909200zmY LLILLJJLI;
    public WeakReference<InterfaceC1750490veZ> LLILZIL;
    public RecyclerView LLILZLL;
    public C0TV8 LLIZ;
    public C21578619ce LLIZLLLIL;
    public C1749190vcT LLJ;
    public C1749220vcW LLJI;
    public C1748470vbJ LLJIJIL;
    public String LLJILJIL;
    public String LLILLL = "";
    public final Set<Integer> LLILZ = new LinkedHashSet();
    public final C1749240vcY LLJILJILJ = new InterfaceC1237370iIx() { // from class: X.0vcY
        @Override // X.InterfaceC1237370iIx
        public final void LJJII(int i, CharSequence charSequence) {
            String string;
            boolean z;
            C21578619ce c21578619ce;
            PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment = this.LL;
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            pushOffReasonBottomSheetFragment.LLILLL = string;
            PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment2 = this.LL;
            C1749220vcW c1749220vcW = pushOffReasonBottomSheetFragment2.LLJI;
            if (c1749220vcW != null) {
                c1749220vcW.LJJII(i, pushOffReasonBottomSheetFragment2.LLILLL);
            }
            if (this.LL.LLILLL.length() > i) {
                z = true;
            } else {
                z = false;
            }
            C1749190vcT c1749190vcT = this.LL.LLJ;
            if (c1749190vcT != null) {
                c1749190vcT.LJFF(z);
            }
            C1748470vbJ c1748470vbJ = this.LL.LLJIJIL;
            if (c1748470vbJ != null) {
                c1748470vbJ.LJI(z);
            }
            if (z && (c21578619ce = this.LL.LLIZLLLIL) != null) {
                c21578619ce.smoothScrollTo(0, 500);
            }
            this.LL.MR();
        }
    };

    public final void MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.whh) : null;
            this.LL = (C197039127h) viewFindViewById;
        }
        ((C197039127h) viewFindViewById).setEnabled(this.LLILLL.length() > 0 || (this.LLILZ.isEmpty() ^ true));
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 592));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // X.InterfaceC1909210zmZ
    public final void cz1() {
        InterfaceC1750490veZ interfaceC1750490veZ;
        WeakReference<InterfaceC1750490veZ> weakReference = this.LLILZIL;
        if (weakReference != null && (interfaceC1750490veZ = weakReference.get()) != null) {
            interfaceC1750490veZ.r60(true);
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // X.InterfaceC1909210zmZ
    public final void sC() {
        InterfaceC1750490veZ interfaceC1750490veZ;
        WeakReference<InterfaceC1750490veZ> weakReference = this.LLILZIL;
        if (weakReference != null && (interfaceC1750490veZ = weakReference.get()) != null) {
            interfaceC1750490veZ.r60(false);
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1909200zmY c1909200zmY = this.LLILLJJLI;
        if (c1909200zmY != null) {
            c1909200zmY.LIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    public final void OR(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "push_setting_page");
        String str2 = LLJJ;
        PushOffReasonsData pushOffReasonsData = null;
        if (str2 == null) {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("label", str2);
        c2344009Gk.LJIIIIZZ("click_method", str);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        PushOffReasonsData pushOffReasonsData2 = LLJILLL;
        if (pushOffReasonsData2 != null) {
            pushOffReasonsData = pushOffReasonsData2;
        }
        for (PushOffReason pushOffReason : C13LP.LJLLLL(new AComparatorS31S0000000_12(1), pushOffReasonsData.reasonsList)) {
            if (this.LLILZ.contains(Integer.valueOf(pushOffReason.category))) {
                stringBuffer.append(pushOffReason.reason);
                stringBuffer.append(",");
                stringBuffer2.append(pushOffReason.category);
                stringBuffer2.append(",");
            }
        }
        if (this.LLILLL.length() > 0) {
            stringBuffer.append(this.LLILLL);
            c2344009Gk.LJFF("other_reason", this.LLILLL);
        } else if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        c2344009Gk.LJFF("text", stringBuffer.toString());
        if (stringBuffer2.length() > 0) {
            stringBuffer2.deleteCharAt(stringBuffer2.length() - 1);
            c2344009Gk.LJFF("selected_reason", stringBuffer2.toString());
        }
        C20684815ws.LJIILLIIL("push_feedback_pop_up_click", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJILJIL = getString(2131837533);
    }

    public final void NR(int i, boolean z) {
        if (z) {
            if (!this.LLILZ.contains(Integer.valueOf(i))) {
                this.LLILZ.add(Integer.valueOf(i));
                MR();
                return;
            }
            return;
        }
        if (!this.LLILZ.contains(Integer.valueOf(i))) {
            return;
        }
        this.LLILZ.remove(Integer.valueOf(i));
        MR();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0iur, X.0zmY] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ?? r0 = new C1260870iur<AbstractC666100QAu<BaseResponse>, InterfaceC1909210zmZ>() { // from class: X.0zmY
            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                BaseResponse baseResponse;
                K k;
                T t = this.LL;
                if (t == 0 || (baseResponse = (BaseResponse) t.getData()) == null || (k = this.LLILLJJLI) == 0) {
                    return;
                }
                if (baseResponse.status_code == 0) {
                    ((InterfaceC1909210zmZ) k).cz1();
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("status_code: ");
                sbLIZ.append(baseResponse.status_code);
                C2188811AlT.LIZIZ(sbLIZ);
                ((InterfaceC1909210zmZ) k).sC();
            }

            {
                LJIIJ(new AbstractC666100QAu<BaseResponse>() { // from class: X.0zmU
                    @Override // X.AbstractC666100QAu
                    public final boolean checkParams(Object... objArr) {
                        return true;
                    }

                    @Override // X.AbstractC666100QAu
                    public final boolean sendRequest(Object... objArr) {
                        if (!super.sendRequest(objArr)) {
                            return false;
                        }
                        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS431S0100000_28(objArr, 4), 0);
                        return true;
                    }
                });
            }

            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                K k = this.LLILLJJLI;
                if (k != 0) {
                    exc.getMessage();
                    ((InterfaceC1909210zmZ) k).sC();
                }
            }
        };
        this.LLILLJJLI = r0;
        r0.LLILLJJLI = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C21578619ce c21578619ce;
        TextView textView;
        TextView textView2;
        C1748470vbJ c1748470vbJ;
        C1749220vcW c1749220vcW;
        C1749190vcT c1749190vcT;
        C197039127h c197039127h;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f6w, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd != null) {
            c21578619ce = (C21578619ce) viewTd.findViewById(R.id.u3e);
        } else {
            c21578619ce = null;
        }
        this.LLIZLLLIL = c21578619ce;
        if (viewTd != null) {
            textView = (TextView) viewTd.findViewById(R.id.title);
        } else {
            textView = null;
        }
        String str = "";
        if (textView != null) {
            PushOffReasonsData pushOffReasonsData = LLJILLL;
            if (pushOffReasonsData == null) {
                pushOffReasonsData = null;
            }
            String str2 = pushOffReasonsData.title;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        if (viewTd != null) {
            textView2 = (TextView) viewTd.findViewById(R.id.fof);
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            PushOffReasonsData pushOffReasonsData2 = LLJILLL;
            if (pushOffReasonsData2 == null) {
                pushOffReasonsData2 = null;
            }
            String str3 = pushOffReasonsData2.description;
            if (str3 != null) {
                str = str3;
            }
            textView2.setText(str);
        }
        Context context = getContext();
        if (context != null) {
            c1748470vbJ = new C1748470vbJ(context, null, 6);
            c1748470vbJ.LJIIJ(getString(2131837535));
            c1748470vbJ.LLIZLLLIL = 200;
            c1748470vbJ.LJIIIIZZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        } else {
            c1748470vbJ = null;
        }
        this.LLJIJIL = c1748470vbJ;
        Context context2 = getContext();
        if (context2 != null) {
            c1749220vcW = new C1749220vcW(context2);
        } else {
            c1749220vcW = null;
        }
        this.LLJI = c1749220vcW;
        if (viewTd != null) {
            c1749190vcT = (C1749190vcT) viewTd.findViewById(R.id.ks0);
        } else {
            c1749190vcT = null;
        }
        this.LLJ = c1749190vcT;
        C1749190vcT c1749190vcT2 = this.LLJ;
        if (c1749190vcT2 != null) {
            c1749190vcT2.LJII(getString(2131837534));
            c1749190vcT2.setFormField(this.LLJIJIL);
            c1749190vcT2.LIZIZ(EnumC1749210vcV.HEADER);
            c1749190vcT2.LJIIIIZZ(this.LLJI);
            c1749190vcT2.LJ(getString(2131837532));
            c1749190vcT2.LIZJ(this.LLJILJIL);
            C1748470vbJ c1748470vbJ2 = this.LLJIJIL;
            if (c1748470vbJ2 != null) {
                c1748470vbJ2.setTuxFieldContentCallback(this.LLJILJILJ);
            }
        }
        if (viewTd != null) {
            c197039127h = (C197039127h) viewTd.findViewById(R.id.whh);
        } else {
            c197039127h = null;
        }
        this.LLILZLL = (RecyclerView) viewTd.findViewById(R.id.j26);
        Context context3 = getContext();
        if (context3 != null) {
            PushOffReasonsData pushOffReasonsData3 = LLJILLL;
            if (pushOffReasonsData3 == null) {
                pushOffReasonsData3 = null;
            }
            this.LLIZ = new C0TV8(context3, new ArrayList(pushOffReasonsData3.reasonsList));
            RecyclerView recyclerView = this.LLILZLL;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                recyclerView.setAdapter(this.LLIZ);
            }
            C0TV8 c0tv8 = this.LLIZ;
            if (c0tv8 != null) {
                c0tv8.LLILLL = this;
            }
        }
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS160S0100000_26(this, 40));
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
