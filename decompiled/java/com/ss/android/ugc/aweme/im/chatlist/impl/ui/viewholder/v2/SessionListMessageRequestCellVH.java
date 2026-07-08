package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.AbstractC884010Ym7;
import X.C01GW;
import X.C0I0B;
import X.C0PEM;
import X.C0Z37;
import X.C0Z3M;
import X.C0Z3S;
import X.C0Z93;
import X.C0Z9D;
import X.C1322090kVb;
import X.C1360520lVa;
import X.C1697810uHb;
import X.C1AF0;
import X.C2296808zG;
import X.C23250099c;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426770GoN;
import X.C427660Gpo;
import X.C439870HMr;
import X.C452501pT;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.C876590Ya9;
import X.C880320YgA;
import X.C880330YgB;
import X.C880340YgC;
import X.C884190YmP;
import X.C885310YoD;
import X.C887710Ys5;
import X.C890610Ywl;
import X.C895200Z9y;
import X.EnumC885330YoF;
import X.InterfaceC1493505sz;
import X.InterfaceC1508640pMU;
import X.InterfaceC1891350zJl;
import X.InterfaceC888500YtM;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SessionListMessageRequestCellVH extends SessionListBaseVH<C0Z3S, C887710Ys5> implements C0Z37<C0Z3M>, InterfaceC1508640pMU {
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "SessionListMessageRequestCellVH";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final String b6() {
        return "message_request_cell_vh";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.C0Z9B
    public final List<View> M() {
        return (List) this.LLJLL.getValue();
    }

    public final C426770GoN e6() {
        return (C426770GoN) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void f6() {
        try {
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.uud);
            if (frameLayout != null) {
                C895200Z9y.LIZ(frameLayout);
            }
            C427660Gpo c427660Gpo = (C427660Gpo) this.LLIZ.getValue();
            if (c427660Gpo != null) {
                c427660Gpo.setBackground(null);
            }
            for (View view : C1697810uHb.LJIIJJI(this.itemView.findViewById(R.id.bir), this.itemView.findViewById(R.id.bkz))) {
                if (view != null) {
                    view.setBackground(null);
                }
            }
            if (frameLayout != null) {
                frameLayout.setLayerType(2, null);
            }
            if (c427660Gpo != null) {
                c427660Gpo.setLayerType(2, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "SessionListMessageRequestCellVH Failed to apply optimizeAvatarOverdraw");
        }
    }

    @Override // X.C0Z9B
    public final C0Z9D g3() {
        return (C0Z9D) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public final void onAttach() {
        super.onAttach();
        C0Z3S c0z3s = (C0Z3S) this.LLJJIJIIJIL;
        if (c0z3s != null) {
            C885310YoD c885310YoD = C885310YoD.LIZ;
            InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
            c885310YoD.getClass();
            Map<String, Set<EnumC885330YoF>> map = C885310YoD.LIZJ;
            Set<EnumC885330YoF> linkedHashSet = (Set) ((LinkedHashMap) map).get(c0z3s.getSessionId());
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                map.put(c0z3s.getSessionId(), linkedHashSet);
            }
            EnumC885330YoF enumC885330YoF = EnumC885330YoF.CHAT_SHOW;
            if (!linkedHashSet.contains(enumC885330YoF)) {
                linkedHashSet.add(enumC885330YoF);
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C884190YmP(interfaceC1493505szLIZIZ, c0z3s, null), 3);
            }
            C876590Ya9.LIZ.getClass();
            C876590Ya9.LIZJ();
        }
    }

    public SessionListMessageRequestCellVH(View view) {
        super(view);
        this.LLJJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 465));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 469));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 468));
        this.LLJL = c01gwLIZIZ;
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 466));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 464));
        this.LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 467));
        View view2 = (View) c01gwLIZIZ.getValue();
        if (view2 != null) {
            view2.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final void L5(InterfaceC888500YtM interfaceC888500YtM) {
        C1322090kVb c1322090kVb;
        Object avatar = ((C0Z3S) interfaceC888500YtM).getAvatar();
        if ((avatar instanceof Integer) && (c1322090kVb = (C1322090kVb) this.LLIZ.getValue()) != null) {
            c1322090kVb.setImageDrawable(C800330VaR.LIZIZ(c1322090kVb.getContext(), ((Number) avatar).intValue()));
        }
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C890610Ywl) interfaceC1891350zJl, i);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    /* JADX INFO: renamed from: d6 */
    public final void j7(InterfaceC888500YtM interfaceC888500YtM, int i) throws Throwable {
        int i2;
        C0Z3S c0z3s = (C0Z3S) interfaceC888500YtM;
        super.j7(c0z3s, i);
        View view = (View) this.LLJIJIL.getValue();
        if (view != null) {
            if (c0z3s.getPriority() > 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        TuxTextView tuxTextViewA6 = a6();
        if (tuxTextViewA6 != null) {
            tuxTextViewA6.setText(c0z3s.getName());
        }
        CharSequence content = c0z3s.getContent();
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZIZ(content);
        TuxTextView tuxTextViewX5 = X5();
        if (tuxTextViewX5 != null) {
            tuxTextViewX5.setText(c1360520lVa.LIZ);
        }
        if (c0z3s.isCheckEmoji()) {
            C439870HMr.LIZJ(X5(), null);
        }
        if (c0z3s.getShowRightArrow()) {
            View view2 = (View) this.LLJJL.getValue();
            if (view2 != null) {
                C339190DRl.LIZLLL(view2);
            }
        } else {
            View view3 = (View) this.LLJJL.getValue();
            if (view3 != null) {
                C339190DRl.LIZIZ(view3);
            }
        }
        AbstractC884010Ym7 sessionUnreadViewState = c0z3s.getSessionUnreadViewState();
        if (sessionUnreadViewState instanceof C880340YgC) {
            C426770GoN c426770GoNE6 = e6();
            if (c426770GoNE6 != null) {
                c426770GoNE6.setVariant(1);
            }
            C426770GoN c426770GoNE62 = e6();
            if (c426770GoNE62 != null) {
                C339190DRl.LIZLLL(c426770GoNE62);
            }
            C426770GoN c426770GoNE63 = e6();
            if (c426770GoNE63 != null) {
                c426770GoNE63.setCount(sessionUnreadViewState.getNum());
            }
        } else if (sessionUnreadViewState instanceof C880330YgB) {
            C426770GoN c426770GoNE64 = e6();
            if (c426770GoNE64 != null) {
                c426770GoNE64.setVariant(0);
            }
            C426770GoN c426770GoNE65 = e6();
            if (c426770GoNE65 != null) {
                C339190DRl.LIZLLL(c426770GoNE65);
            }
        } else {
            C426770GoN c426770GoNE66 = e6();
            if (c426770GoNE66 != null) {
                C339190DRl.LIZIZ(c426770GoNE66);
            }
        }
        if (C880320YgA.LIZ(c0z3s.getSessionUnreadViewState())) {
            TuxTextView tuxTextViewA62 = a6();
            if (tuxTextViewA62 != null) {
                tuxTextViewA62.setTuxFont(42);
            }
            TuxTextView tuxTextViewX52 = X5();
            if (tuxTextViewX52 != null) {
                tuxTextViewX52.setTuxFont(52);
                tuxTextViewX52.setTextColorRes(R.attr.a1h);
            }
        } else {
            TuxTextView tuxTextViewA63 = a6();
            if (tuxTextViewA63 != null) {
                tuxTextViewA63.setTuxFont(41);
            }
            TuxTextView tuxTextViewX53 = X5();
            if (tuxTextViewX53 != null) {
                tuxTextViewX53.setTuxFont(51);
                tuxTextViewX53.setTextColorRes(R.attr.nb);
            }
        }
        if (((Boolean) C0Z93.LJFF.getValue()).booleanValue()) {
            try {
                if (C0Z93.LIZJ()) {
                    View viewFindViewById = this.itemView.findViewById(R.id.y1z);
                    if (viewFindViewById != null) {
                        C895200Z9y.LIZ(viewFindViewById);
                    }
                    View viewFindViewById2 = this.itemView.findViewById(R.id.evm);
                    if (viewFindViewById2 != null) {
                        C895200Z9y.LIZ(viewFindViewById2);
                    }
                }
                if (C0Z93.LIZIZ()) {
                    f6();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "SessionListMessageRequestCellVH Failed to apply optimizations");
            }
        }
    }
}
