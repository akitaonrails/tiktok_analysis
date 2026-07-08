package com.ss.android.ugc.aweme.detail.panel;

import X.C01GW;
import X.C0H9H;
import X.C0HTT;
import X.C0QBT;
import X.C0R9L;
import X.C0RF0;
import X.C0SR4;
import X.C11NJ;
import X.C11S5;
import X.C12P2;
import X.C14LC;
import X.C15438062q;
import X.C1701940uOG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C424280GkM;
import X.C452501pT;
import X.C713370RyZ;
import X.C714460S0u;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC424290GkN;
import X.InterfaceC424310GkP;
import Y.AfS142S0200000_6;
import Y.AfS175S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.model.DataPoint;
import com.ss.android.ugc.aweme.model.InsightTypeRequest;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.IAnalyticsDetailService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class AnalyticsDetailPanel extends DetailFragmentPanel {
    public final String A0;
    public final String B0;
    public final String C0;
    public final C11NJ D0;
    public RelativeLayout E0;
    public FrameLayout F0;
    public TuxTextView G0;
    public TuxTextView H0;
    public C12P2 I0;
    public InterfaceC424310GkP J0;
    public final C01GW K0;
    public final C01GW L0;
    public final HashMap<Float, Float> M0;
    public final C01GW z0;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.E0 != null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.F);
        ViewGroup viewGroup = (ViewGroup) getFragment().getView();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        if (viewGroup != null) {
            viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        C0H9H.LIZJ(C14LC.LJIILLIIL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), relativeLayout);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(relativeLayout.getContext()), R.layout.bkj, relativeLayout, false);
        this.F0 = (FrameLayout) viewTd.findViewById(R.id.az7);
        relativeLayout.addView(viewTd);
        if (viewGroup != null) {
            this.G0 = (TuxTextView) viewGroup.findViewById(R.id.az9);
            this.H0 = (TuxTextView) viewGroup.findViewById(R.id.az8);
            C12P2 c12p2 = (C12P2) viewGroup.findViewById(R.id.video_seek_bar);
            this.I0 = c12p2;
            if (c12p2 != null) {
                c12p2.setDisableSeekTouch(true);
            }
        }
        this.E0 = relativeLayout;
        C424280GkM c424280GkMLIZ = ((IAnalyticsDetailService) this.z0.getValue()).LIZ(getContext());
        this.J0 = c424280GkMLIZ;
        if (c424280GkMLIZ != null) {
            c424280GkMLIZ.setOnPointSelectedListener(new InterfaceC424290GkN() { // from class: X.0s9R
                @Override // X.InterfaceC424290GkN
                public final void LIZIZ() {
                    C12P2 c12p22 = this.LIZ.I0;
                    if (c12p22 != null) {
                        c12p22.setSeekBarShowType(2);
                    }
                }

                @Override // X.InterfaceC424290GkN
                public final void LIZ(float f) {
                    AnalyticsDetailPanel analyticsDetailPanel = this.LIZ;
                    float fF0 = f / analyticsDetailPanel.F0();
                    if (fF0 >= 0.0f && fF0 <= 100.0f) {
                        if (fF0 < 1.0f) {
                            fF0 *= 100.0f;
                        }
                        analyticsDetailPanel.getPlayerManager().seek(fF0);
                    }
                    C12P2 c12p22 = this.LIZ.I0;
                    if (c12p22 != null) {
                        c12p22.setProgress((f * 100) / r2.F0());
                    }
                    C12P2 c12p23 = this.LIZ.I0;
                    if (c12p23 != null) {
                        c12p23.setSeekBarShowType(0);
                    }
                }

                @Override // X.InterfaceC424290GkN
                public final void LIZJ(float f, float f2) {
                    C12P2 c12p22 = this.LIZ.I0;
                    if (c12p22 != null) {
                        c12p22.setProgress((100 * f) / r3.F0());
                    }
                    this.LIZ.M0((int) f);
                    this.LIZ.I0(f2);
                }
            });
            FrameLayout frameLayout = this.F0;
            if (frameLayout != null) {
                frameLayout.addView(c424280GkMLIZ);
            }
            SettingsManager.LIZLLL().getClass();
            String str = "video_retention_rate_history_7d";
            if (!SettingsManager.LIZ("enable_v2_insights_for_analytics_graph", false)) {
                String str2 = this.A0;
                if (!Intrinsics.LJFF(str2, "retention")) {
                    if (!Intrinsics.LJFF(str2, "likes")) {
                        return;
                    } else {
                        str = "video_like_distrubution_7d";
                    }
                }
                if (this.B0 != null) {
                    this.D0.LIZ(((IAnalyticsDetailService) this.z0.getValue()).LIZJ(Collections.singletonList(new InsightTypeRequest(str, this.B0))).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS142S0200000_6(this, c424280GkMLIZ, 1), new AfS175S0100000_6(this, 4)));
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(this.C0, CardStruct.IStatusCode.DEFAULT)) {
                String str3 = this.A0;
                if (!Intrinsics.LJFF(str3, "retention")) {
                    if (!Intrinsics.LJFF(str3, "likes")) {
                        return;
                    } else {
                        str = "video_like_distribution_7d";
                    }
                }
            } else {
                String str4 = this.A0;
                if (Intrinsics.LJFF(str4, "retention")) {
                    str = "video_retention_rate_realtime";
                } else if (!Intrinsics.LJFF(str4, "likes")) {
                    return;
                } else {
                    str = "video_like_distribution_realtime";
                }
            }
            if (this.B0 != null) {
                this.D0.LIZ(((IAnalyticsDetailService) this.z0.getValue()).LIZLLL(Collections.singletonList(new InsightTypeRequest(str, this.B0))).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS142S0200000_6(this, c424280GkMLIZ, 2), new AfS175S0100000_6(this, 5)));
            }
        }
    }

    public final int F0() {
        return ((Number) this.L0.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroy() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("content_type", "video");
        Aweme awemeO = o();
        c2344009Gk.LJIIIIZZ("group_id", awemeO != null ? awemeO.getGroupId() : null);
        C20684815ws.LJIILLIIL("detail_page_interacted", c2344009Gk.LIZ);
        super.onDestroy();
        this.D0.dispose();
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class AnalyticsDetailViewHolder extends FullFeedVideoViewHolder {
        @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
        public final int LLLIIL() {
            return 3;
        }

        public AnalyticsDetailViewHolder(C0RF0 c0rf0) {
            super(c0rf0);
        }

        @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
        public final void LLLLILI(Aweme aweme) {
            super.LLLLILI(aweme);
            LJIIZILJ(true);
            Ft2(null);
        }
    }

    public final void I0(float f) {
        String string;
        int i = (int) (f * 100.0f);
        String str = this.A0;
        if (Intrinsics.LJFF(str, "retention")) {
            string = getContext().getString(2131830097, Integer.valueOf(i));
        } else if (!Intrinsics.LJFF(str, "likes")) {
            return;
        } else {
            string = getContext().getString(2131830095, Integer.valueOf(i));
        }
        TuxTextView tuxTextView = this.H0;
        if (tuxTextView != null) {
            tuxTextView.setText(string);
        }
    }

    public final void L0(List<DataPoint> list) {
        this.M0.clear();
        HashMap<Float, Float> map = this.M0;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (DataPoint dataPoint : list) {
            Pair pair = new Pair(Float.valueOf(dataPoint.x), Float.valueOf(dataPoint.y));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        map.putAll(linkedHashMap);
    }

    public final void M0(int i) {
        boolean z;
        boolean z2 = true;
        if (F0() >= 3600) {
            z = true;
        } else {
            z = false;
        }
        String strLIZ = C0QBT.LIZ(i, z);
        int iF0 = F0();
        if (F0() < 3600) {
            z2 = false;
        }
        String strLIZ2 = C0QBT.LIZ(iF0, z2);
        TuxTextView tuxTextView = this.G0;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append("  /  ");
            sbLIZ.append(strLIZ2);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public AnalyticsDetailPanel(Bundle bundle, C2189821An6 c2189821An6) {
        String string;
        String string2;
        super(c2189821An6);
        this.z0 = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(95));
        if (bundle != null) {
            string = bundle.getString("metrics");
        } else {
            string = null;
        }
        this.A0 = string;
        if (bundle != null) {
            string2 = bundle.getString(FollowStatusChangeMethod.PARAM_UID);
        } else {
            string2 = null;
        }
        this.B0 = string2;
        this.C0 = bundle != null ? bundle.getString("is_realtime") : null;
        this.D0 = new C11NJ();
        this.K0 = C452501pT.LIZIZ(new AwS556S0100000_12(this, 415));
        this.L0 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 137));
        this.M0 = new HashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC581430MrF
    public final void He(int i, String str) {
        float fFloatValue;
        super.He(i, str);
        C12P2 c12p2 = this.I0;
        if (c12p2 != null && c12p2.getSeekBarShowType() == 2) {
            return;
        }
        InterfaceC424310GkP interfaceC424310GkP = this.J0;
        if (interfaceC424310GkP != null) {
            interfaceC424310GkP.LIZ(i);
        }
        M0(i);
        float f = i;
        Float f2 = this.M0.get(Float.valueOf(1000.0f * f));
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        I0(fFloatValue);
        C12P2 c12p22 = this.I0;
        if (c12p22 != null) {
            c12p22.setProgress((f * 100) / F0());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        String str = this.A0;
        if (Intrinsics.LJFF(str, "retention")) {
            string = getContext().getString(2131830098);
        } else if (Intrinsics.LJFF(str, "likes")) {
            string = getContext().getString(2131830096);
        } else {
            string = null;
        }
        H(string);
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.K0.getValue();
        if (baseScrollSwitchStateManager != null) {
            baseScrollSwitchStateManager.KQ2(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0Rxd
            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "analytics_detail_adapter_vh";
            }

            @Override // X.C713370RyZ
            /* JADX INFO: renamed from: LJJLL */
            public final C711360RvK LJJLI() {
                return new C711360RvK(AFwS243S0000000_11.get$arr$(34));
            }

            @Override // X.C713370RyZ, X.C0SR4
            public final /* bridge */ /* synthetic */ C711420RvQ LJJLI() {
                return LJJLI();
            }
        };
    }
}
