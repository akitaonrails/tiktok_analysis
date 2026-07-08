package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.AnonymousClass0206;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0J1N;
import X.C0TDF;
import X.C0UO0;
import X.C1143680frq;
import X.C11NZ;
import X.C11PQ;
import X.C11RD;
import X.C1338270kvh;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C20736316Cj;
import X.C418440Gaw;
import X.C419890GdH;
import X.C452501pT;
import X.C475510Ikn;
import X.C515801zg;
import X.C743540TEq;
import X.C743550TEr;
import X.C743580TEu;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS147S0100000_12;
import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import Y.AkS471S0100000_7;
import Y.AkS475S0100000_12;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDualDeviceQRCodeCacheSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceQRCodeFragment extends BaseFragment {
    public static final C01GW<Integer> LLJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(72));
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyAdGww8LCAKOy40JSAiPQ==";
    public int LLILLJJLI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 254));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 255));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 256));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 258));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 257));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(123));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(122));

    public final String OR() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C786410Ut5.j4(getString(2131842988), Arrays.copyOf(new Object[]{getString(2131842994)}, 1)));
        stringBuffer.append("\n");
        stringBuffer.append(C786410Ut5.j4(getString(2131842989), Arrays.copyOf(new Object[]{getString(2131842995), getString(2131842996)}, 2)));
        stringBuffer.append("\n");
        stringBuffer.append(C786410Ut5.j4(getString(2131842990), Arrays.copyOf(new Object[]{getString(2131842997)}, 1)));
        return stringBuffer.toString();
    }

    public final SpannableStringBuilder PR() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(2131842994);
        SpannableStringBuilder spannableStringBuilderNR = NR(C786410Ut5.j4(getString(2131842988), Arrays.copyOf(new Object[]{string}, 1)), string);
        RR(spannableStringBuilderNR, "ttlive_icon_person_bold.png", "{icon}");
        spannableStringBuilder.append((CharSequence) spannableStringBuilderNR);
        spannableStringBuilder.append((CharSequence) "\n");
        String string2 = getString(2131842995);
        String string3 = getString(2131842996);
        SpannableStringBuilder spannableStringBuilderNR2 = NR(C786410Ut5.j4(getString(2131842989), Arrays.copyOf(new Object[]{string2, string3}, 2)), string2, string3);
        RR(spannableStringBuilderNR2, "ttlive_icon_lines_horizon.png", "{icon1}");
        RR(spannableStringBuilderNR2, "ttlive_icon_qr_code.png", "{icon2}");
        spannableStringBuilder.append((CharSequence) spannableStringBuilderNR2);
        spannableStringBuilder.append((CharSequence) "\n");
        String string4 = getString(2131842997);
        SpannableStringBuilder spannableStringBuilderNR3 = NR(C786410Ut5.j4(getString(2131842990), Arrays.copyOf(new Object[]{string4}, 1)), string4);
        RR(spannableStringBuilderNR3, "ttlive_icon_scan.png", "{icon}");
        spannableStringBuilder.append((CharSequence) spannableStringBuilderNR3);
        spannableStringBuilder.append((CharSequence) "\n");
        return spannableStringBuilder;
    }

    public final long getRoomId() {
        return ((Number) this.LLIZ.getValue()).longValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C743540TEq.LJIIJJI(getRoomId(), 2020, Integer.valueOf(this.LLILLJJLI), null, 16);
    }

    public static SpannableStringBuilder NR(CharSequence charSequence, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (String str : strArr) {
            int iLJJJ = a0.LJJJ(charSequence, str, 0, false, 6);
            if (iLJJJ >= 0) {
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, str.length() + iLJJJ, 33);
            }
        }
        return spannableStringBuilder;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            TextView textView = (TextView) this.LLILZLL.getValue();
            if (textView != null) {
                C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
                ((C0J1N) C743580TEu.LIZIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZJ(textView))).LIZ(new AfS148S0200000_12(textView, this, 2), new C09JN() { // from class: X.012j
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView2$1$2");
                        C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
                        C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView2$1$2");
                    }
                });
                if (C743580TEu.LIZIZ()) {
                    C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "use cache tips");
                } else {
                    C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "generate tips");
                }
            }
            TextView textView2 = (TextView) this.LLILZIL.getValue();
            if (textView2 != null) {
                ((C0J1N) C11NZ.LJJJJZ(1).LJJJJZI(new AkS475S0100000_12(this, 1)).LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZJ(textView2))).LIZ(new AfS148S0200000_12(textView2, this, 3), new C515801zg(textView2, this, 1));
            }
            View viewFindViewById = view.findViewById(R.id.ypn);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 22), viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.ypo);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 24), viewFindViewById2);
            }
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ != null) {
                C743550TEr.LIZ(new AfS181S0100000_12(this, 12), new C09JN() { // from class: X.012k
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView2$5$2");
                        C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
                        C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView2$5$2");
                    }
                }, this, dataChannelLJ);
            }
            ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 13), new C09JN() { // from class: X.012m
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView2$7");
                    C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView2$7");
                }
            });
            return;
        }
        TextView textView3 = (TextView) this.LLILZIL.getValue();
        if (textView3 != null) {
            if (LiveDualDeviceQRCodeCacheSetting.INSTANCE.isExperimentGroup()) {
                C11PQ<SpannableStringBuilder> c11pq2 = C743580TEu.LIZ;
                ((C0J1N) C743580TEu.LIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZJ(textView3))).LIZ(new AfS148S0200000_12(textView3, this, 4), new C09JN() { // from class: X.012l
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView$1$2");
                        C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
                        C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView$1$2");
                    }
                });
                if (C743580TEu.LIZJ(this)) {
                    C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "use cache intro");
                } else {
                    C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "generate intro");
                }
            } else {
                ((C0J1N) C11NZ.LJJJJZ(1).LJJJJZI(new AkS475S0100000_12(this, 2)).LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZJ(textView3))).LIZ(new AfS148S0200000_12(textView3, this, 5), new C515801zg(textView3, this, 2));
            }
        }
        TextView textView4 = (TextView) this.LLILZLL.getValue();
        if (textView4 != null) {
            if (LiveDualDeviceQRCodeCacheSetting.INSTANCE.isExperimentGroup()) {
                C11PQ<SpannableStringBuilder> c11pq3 = C743580TEu.LIZ;
                ((C0J1N) C743580TEu.LIZIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZJ(textView4))).LIZ(new AfS148S0200000_12(textView4, this, 6), new C09JN() { // from class: X.012n
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView$2$2");
                        C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
                        C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView$2$2");
                    }
                });
                if (C743580TEu.LIZIZ()) {
                    C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "use cache tips");
                } else {
                    C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "generate tips");
                }
            } else {
                ((C0J1N) C11NZ.LJJJJZ(1).LJJJJZI(new AkS471S0100000_7(this, 0)).LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZJ(textView4))).LIZ(new AfS148S0200000_12(textView4, this, 1), new C515801zg(textView4, this, 0));
            }
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 8), new C09JN() { // from class: X.012i
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView$5");
                C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView$5");
            }
        });
    }

    public final void RR(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        Drawable drawableLIZ = C1143680frq.LIZ("tiktok_live_game_demand_2", str);
        if (drawableLIZ != null) {
            drawableLIZ.setTint(C20736316Cj.LIZIZ(R.attr.ezt, getContext()));
            drawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, str2, 0, false, 6);
            if (iLJJJ != -1) {
                C786410Ut5.q2(spannableStringBuilder, new C419890GdH(drawableLIZ, 2), iLJJJ, str2.length() + iLJJJ, 33);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.gig, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.gif, viewGroup, false);
        }
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
