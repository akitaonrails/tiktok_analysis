package com.ss.android.ugc.aweme.detail.panel;

import X.C01GW;
import X.C0H9H;
import X.C0HTT;
import X.C0R9L;
import X.C0RF0;
import X.C0SOW;
import X.C0SR4;
import X.C0ST8;
import X.C0SY5;
import X.C13LP;
import X.C14LC;
import X.C20684815ws;
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
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.model.DataPoint;
import com.ss.android.ugc.aweme.service.IPhotoAnalyticsDetailService;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class PhotoAnalyticsDetailPanel extends DetailFragmentPanel {
    public final String A0;
    public FrameLayout B0;
    public FrameLayout C0;
    public TuxTextView D0;
    public TuxTextView E0;
    public C0SOW F0;
    public final C01GW G0;
    public final HashMap<Float, Boolean> H0;
    public final C01GW z0;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.B0 != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getFragment().getView();
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewGroup != null) {
            viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        C0H9H.LIZJ(C14LC.LJIILLIIL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), frameLayout);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.blh, frameLayout, false);
        this.C0 = (FrameLayout) viewTd.findViewById(R.id.az7);
        this.F0 = (C0SOW) viewTd.findViewById(R.id.g3k);
        this.D0 = (TuxTextView) viewTd.findViewById(R.id.az9);
        this.E0 = (TuxTextView) viewTd.findViewById(R.id.az8);
        View viewFindViewById = viewTd.findViewById(R.id.gbx);
        frameLayout.addView(viewTd);
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0s9T
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        TuxTextView tuxTextView = this.E0;
        if (tuxTextView != null) {
            tuxTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0s9U
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        TuxTextView tuxTextView2 = this.D0;
        if (tuxTextView2 != null) {
            tuxTextView2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0s9V
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        this.B0 = frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroy() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("content_type", "multi_photo");
        Aweme awemeO = o();
        c2344009Gk.LJIIIIZZ("group_id", awemeO != null ? awemeO.getGroupId() : null);
        C20684815ws.LJIILLIIL("detail_page_interacted", c2344009Gk.LIZ);
        super.onDestroy();
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class PhotoAnalyticsDetailViewHolder extends FullFeedVideoViewHolder {
        @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
        public final int LLLIIL() {
            return 3;
        }

        public PhotoAnalyticsDetailViewHolder(C0RF0 c0rf0) {
            super(c0rf0);
        }

        @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
        public final void LLLLILI(Aweme aweme) {
            super.LLLLILI(aweme);
            LJIIZILJ(true);
            Ft2(null);
        }
    }

    public final void F0(int i) {
        int iLIZJ;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null) {
            iLIZJ = C0ST8.LIZJ(awemeLJIIIIZZ);
        } else {
            iLIZJ = 0;
        }
        TuxTextView tuxTextView = this.D0;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("  /  ");
            sbLIZ.append(iLIZJ);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC728550Shx
    public final void G90(Pair<Integer, ? extends Aweme> pair) {
        String string;
        boolean z;
        super.G90(pair);
        C424280GkM c424280GkMLIZ = ((IPhotoAnalyticsDetailService) this.z0.getValue()).LIZ(getContext());
        int iLIZJ = 0;
        if (c424280GkMLIZ != null) {
            c424280GkMLIZ.setOnPointSelectedListener(new InterfaceC424290GkN() { // from class: X.0s9S
                @Override // X.InterfaceC424290GkN
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC424290GkN
                public final void LIZ(float f) {
                    int i = ((int) f) - 1;
                    C0SOW c0sow = this.LIZ.F0;
                    if (c0sow != null) {
                        c0sow.setSelectedIndex(i);
                    }
                }

                @Override // X.InterfaceC424290GkN
                public final void LIZJ(float f, float f2) {
                    IPhotosViewHolderType iPhotosViewHolderType;
                    int i = (int) f;
                    int i2 = i - 1;
                    C0SZ8 c0sz8LJLIL = this.LIZ.LJLIL();
                    if (c0sz8LJLIL != null && c0sz8LJLIL.LLZZZIL()) {
                        C0SZ8 c0sz8LJLIL2 = this.LIZ.LJLIL();
                        if ((c0sz8LJLIL2 instanceof IPhotosViewHolderType) && (iPhotosViewHolderType = (IPhotosViewHolderType) c0sz8LJLIL2) != null) {
                            iPhotosViewHolderType.setCurrentPlayPosition(i2);
                        }
                    }
                    this.LIZ.I0(new DataPoint(f * 1000.0f, f2));
                    this.LIZ.F0(i);
                }
            });
            FrameLayout frameLayout = this.C0;
            if (frameLayout != null) {
                frameLayout.addView(c424280GkMLIZ);
            }
            ArrayList arrayList = new ArrayList();
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("data")) != null) {
                float f = 1.0f;
                for (String str : a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6)) {
                    float f2 = 1000.0f * f;
                    arrayList.add(new DataPoint(f2, Math.abs(CastFloatProtector.parseFloat(str))));
                    c424280GkMLIZ.LIZ((int) f);
                    if (CastFloatProtector.parseFloat(str) >= 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.H0.put(Float.valueOf(f2), Boolean.valueOf(z));
                    f += 1.0f;
                }
                if (!arrayList.isEmpty()) {
                    c424280GkMLIZ.setPoints(arrayList);
                    I0((DataPoint) C13LP.LJJJJZI(arrayList));
                }
            }
        }
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(getContext());
        if (lifecycleOwnerLIZIZ != null) {
            C0SOW c0sow = this.F0;
            if (c0sow != null) {
                c0sow.LJIIIZ();
            }
            C0SOW c0sow2 = this.F0;
            if (c0sow2 != null) {
                c0sow2.setLifecycleOwner(lifecycleOwnerLIZIZ);
            }
            Aweme awemeLJIIIIZZ = LJIIIIZZ();
            if (awemeLJIIIIZZ != null) {
                iLIZJ = C0ST8.LIZJ(awemeLJIIIIZZ);
            }
            C0SOW c0sow3 = this.F0;
            if (c0sow3 != null) {
                c0sow3.setCount(iLIZJ);
            }
        }
        F0(1);
    }

    public final void I0(DataPoint dataPoint) {
        boolean zBooleanValue;
        String string;
        Boolean bool = this.H0.get(Float.valueOf(dataPoint.x));
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        float f = dataPoint.y;
        if (zBooleanValue) {
            int i = (int) (f * 100.0f);
            String str = this.A0;
            if (Intrinsics.LJFF(str, "retention")) {
                string = getContext().getString(2131830097, Integer.valueOf(i));
            } else if (Intrinsics.LJFF(str, "likes")) {
                string = getContext().getString(2131830095, Integer.valueOf(i));
            } else {
                return;
            }
            TuxTextView tuxTextView = this.E0;
            if (tuxTextView != null) {
                tuxTextView.setText(string);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.E0;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setText("-");
    }

    public PhotoAnalyticsDetailPanel(Bundle bundle, C2189821An6 c2189821An6) {
        String string;
        super(c2189821An6);
        this.z0 = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(96));
        if (bundle != null) {
            string = bundle.getString("metrics");
        } else {
            string = null;
        }
        this.A0 = string;
        this.G0 = C452501pT.LIZIZ(new AwS568S0100000_24(this, 257));
        this.H0 = new HashMap<>();
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
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.G0.getValue();
        if (baseScrollSwitchStateManager != null) {
            baseScrollSwitchStateManager.KQ2(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0Rxe
            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "photo_analytics_detail_adapter_vh";
            }

            @Override // X.C713370RyZ
            /* JADX INFO: renamed from: LJJLL */
            public final C711360RvK LJJLI() {
                return new C711360RvK(AFwS243S0000000_11.get$arr$(35));
            }

            @Override // X.C713370RyZ, X.C0SR4
            public final /* bridge */ /* synthetic */ C711420RvQ LJJLI() {
                return LJJLI();
            }
        };
    }
}
