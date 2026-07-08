package com.bytedance.android.livesdk.broadcast.preview.base;

import X.C09RD;
import X.C09RE;
import X.C1143680frq;
import X.C1148240fzC;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C20516015Pq;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C522050Kdf;
import X.C760180Trs;
import X.C770230UJh;
import X.C770490UKh;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC782830UnJ;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.effect.api.PreviewRevisionUnfoldBottomEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNoPermissionDisplaySwitch;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class PreviewToolBaseWidget extends PreviewWidget implements InterfaceC782830UnJ {
    public TuxTextView LLILZ;
    public ImageView LLILZIL;

    public long I1() {
        return 1000L;
    }

    public abstract Integer J1();

    public Integer L1() {
        return 0;
    }

    public String M1() {
        return "";
    }

    public boolean N1() {
        return false;
    }

    public abstract int O1();

    public String P1() {
        return "";
    }

    public String Q1() {
        return "";
    }

    public Integer R1() {
        return 0;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.i1w;
    }

    public abstract void onClick(View view);

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LJJLIIIJLLLLLLLZ() {
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel == null || dataChannel.gg0(PreviewMoreLessVisibilityChannel.class) == null) ? false : true;
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLILLIZIL() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return Intrinsics.LJFF(dataChannel.gg0(C770490UKh.class), Boolean.TRUE);
        }
        return false;
    }

    public final void U1() {
        if (LiveNoPermissionDisplaySwitch.INSTANCE.enable() && Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), Boolean.TRUE)) {
            return;
        }
        View view = getView();
        C500260Jjc.LLFFF(view != null ? view.findViewById(R.id.widget_red_dot) : null);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            Integer numR1 = R1();
            dataChannel.LC0(PreviewRevisionUnfoldBottomEvent.class, Integer.valueOf(numR1 != null ? numR1.intValue() : 0));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        Object objGg0 = this.dataChannel.gg0(LiveModeChannel.class);
        if (objGg0 != LiveMode.VIDEO) {
            if (!AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
                return;
            }
            if (objGg0 != LiveMode.SCREEN_RECORD && objGg0 != LiveMode.LIVE_VOICE && objGg0 != LiveMode.THIRD_PARTY) {
                return;
            }
        }
        C770230UJh.LIZ.getClass();
        C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ((C770230UJh.LIZIZ() - 28) / 5), getView());
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void E1() {
        super.E1();
        View view = getView();
        if (view != null) {
            V1(view);
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setMinTextSize(8.0f);
            }
            C500260Jjc.LJLIIIL(I1(), view, new AwS591S0100000_12(this, 238));
            q0.LJIJ(view, new C522050Kdf(this, 0));
        }
    }

    public final void H1() {
        View view = getView();
        C500260Jjc.LJIILIIL(view != null ? view.findViewById(R.id.widget_red_dot) : null);
    }

    public final boolean S1() {
        View viewFindViewById;
        View view = getView();
        return (view == null || (viewFindViewById = view.findViewById(R.id.widget_red_dot)) == null || viewFindViewById.getVisibility() != 0) ? false : true;
    }

    public static int G1(View view) {
        ViewParent parent;
        ViewGroup viewGroup = null;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        int i = 0;
        if (viewGroup != null) {
            Iterator<View> it2 = new C09RD(viewGroup).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                View view2 = (View) c09re.next();
                if (Intrinsics.LJFF(view2, view)) {
                    return i;
                }
                if (!(view2 instanceof C20516015Pq) && C500260Jjc.LJJJJIZL(view2)) {
                    i++;
                }
            }
        }
        return i;
    }

    public final void T1(ImageView imageView) {
        String strM1;
        Integer numL1;
        int i;
        if (C760180Trs.LJFF() && L1() != null && (((numL1 = L1()) == null || numL1.intValue() != 0) && (imageView instanceof TuxIconView))) {
            Integer numL12 = L1();
            if (numL12 != null) {
                int iIntValue = numL12.intValue();
                Integer numLIZJ = null;
                TuxIconView tuxIconView = (TuxIconView) imageView;
                if (tuxIconView != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = iIntValue;
                    if (!N1()) {
                        Context context = this.context;
                        if (context != null) {
                            numLIZJ = C1308910kAL.LIZJ(R.attr.exp, context);
                        }
                        c419910GdJ.LIZLLL = numLIZJ;
                    }
                    Integer numR1 = R1();
                    if (numR1 != null && numR1.intValue() == 4) {
                        i = 26;
                    } else {
                        i = 28;
                    }
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    tuxIconView.setTuxIcon(c419910GdJ);
                }
            }
        } else if (!TextUtils.isEmpty(Q1()) && C760180Trs.LJII() && (imageView instanceof TuxIconView)) {
            try {
                IHostTux iHostTux = (IHostTux) C1161920gLG.LIZJ(IHostTux.class);
                TuxIconView tuxIconView2 = (TuxIconView) imageView;
                String strQ1 = Q1();
                if (strQ1 == null) {
                    strQ1 = "";
                }
                if (!iHostTux.Xl2(tuxIconView2, strQ1, this.context, true) && (strM1 = M1()) != null) {
                    C1143680frq.LJII(imageView, Collections.singletonList(strM1));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else if (!TextUtils.isEmpty(M1()) && C760180Trs.LJFF()) {
            String strM12 = M1();
            if (strM12 != null) {
                C1143680frq.LJII(imageView, Collections.singletonList(strM12));
            }
        } else {
            Integer numJ1 = J1();
            if (numJ1 != null) {
                int iIntValue2 = numJ1.intValue();
                if (imageView != null) {
                    imageView.setImageResource(iIntValue2);
                }
            }
        }
        ImageView imageView2 = this.LLILZIL;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.ey_);
        }
        ImageView imageView3 = this.LLILZIL;
        if (imageView3 != null) {
            C500260Jjc.LLFFF(imageView3);
        }
    }

    public void V1(View view) {
        String strLJIJI;
        if (view != null || (view = getView()) != null) {
            this.LLILZIL = (ImageView) view.findViewById(R.id.widget_shadow_icon);
            T1((ImageView) view.findViewById(R.id.widget_icon));
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.z1c);
            this.LLILZ = tuxTextView;
            if (tuxTextView != null) {
                if (!TextUtils.isEmpty(P1())) {
                    strLJIJI = P1();
                } else {
                    try {
                        strLJIJI = C497740JfY.LJIJI(O1());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strLJIJI = "";
                    }
                }
                tuxTextView.setText(strLJIJI);
            }
            if (F1()) {
                ImageView imageView = (ImageView) view.findViewById(R.id.widget_icon);
                if (imageView != null) {
                    C786410Ut5.V4(imageView, 0.5f);
                }
                TuxTextView tuxTextView2 = this.LLILZ;
                if (tuxTextView2 != null) {
                    C786410Ut5.B5(tuxTextView2, 0.5f);
                }
            }
        }
    }
}
