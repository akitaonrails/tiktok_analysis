package com.bytedance.android.livesdk.pip;

import X.C0IF5;
import X.C0INR;
import X.C0INS;
import X.C1161920gLG;
import X.C12ES;
import X.C16F5;
import X.C1A7G;
import X.C1A7I;
import X.C20441214yg;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500980Jkm;
import X.C749250TaF;
import X.C786410Ut5;
import X.InterfaceC480510Isr;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableIntelligentRotationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PipVideoViewContainDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSOCw8Zx86OBMlLSo8HiwpPgw8JjEtICEXISQgJig=";
    public long LL;
    public String LLILLJJLI;
    public FrameLayout LLILLL;
    public FrameLayout LLILZ;
    public View LLILZIL;
    public C0IF5 LLILZLL;
    public ViewGroup LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public C0INR LLJI;
    public int LLJIJIL;
    public String LLJILJIL = "";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    public final void MR() {
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(this.LLILLJJLI);
        if (interfaceC480510IsrLIZIZ != null) {
            int videoSize = interfaceC480510IsrLIZIZ.getVideoSize() & 65535;
            int videoSize2 = interfaceC480510IsrLIZIZ.getVideoSize() >> 16;
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ != null && TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable()) {
                Pair pair = (Pair) dataChannelLJ.gg0(C749250TaF.class);
                if (Intrinsics.LJFF(this.LLJILJIL, LiveMode.SCREEN_RECORD.logStreamingType) && pair != null) {
                    videoSize = ((Number) pair.getFirst()).intValue();
                    videoSize2 = ((Number) pair.getSecond()).intValue();
                }
            }
            this.LLILZIL = interfaceC480510IsrLIZIZ.getVideoView();
            C0IF5 c0if5 = this.LLILZLL;
            if (c0if5 != null) {
                c0if5.setVideoSize(videoSize, videoSize2);
            }
            C0IF5 c0if52 = this.LLILZLL;
            if (c0if52 != null) {
                c0if52.LIZJ(0, "pip");
            }
            interfaceC480510IsrLIZIZ.LJJJJL();
            interfaceC480510IsrLIZIZ.x0(this.LL);
            interfaceC480510IsrLIZIZ.y0(this.LLILZLL, this.LLILLJJLI);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hgg);
        c500980Jkm.LIZJ = R.style.aju;
        c500980Jkm.LIZIZ = 1;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJII = 17;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("live_mode")) == null) {
            string = "";
        }
        this.LLJILJIL = string;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C0INR c0inr = this.LLJI;
        if (c0inr != null) {
            c0inr.LIZJ.removeCallbacks(c0inr.LIZLLL);
            c0inr.LIZJ.removeCallbacks(c0inr.LJ);
        }
        this.LLJI = null;
        this.LLILLJJLI = null;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [X.0INQ] */
    public final void NR(int i, final Function0<Unit> function0) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LLJIJIL = i;
        C12ES.LJIILL(0, this.LLIZ);
        C12ES.LJIILL(8, this.LLILLL);
        FrameLayout frameLayout = this.LLILZ;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            FrameLayout frameLayout2 = this.LLILZ;
            if (frameLayout2 != null) {
                C786410Ut5.a6(frameLayout2, layoutParams);
            }
            FrameLayout frameLayout3 = this.LLILZ;
            if (frameLayout3 != null) {
                C786410Ut5.Kc(frameLayout3, 0.0f);
            }
            FrameLayout frameLayout4 = this.LLILZ;
            if (frameLayout4 != null) {
                C786410Ut5.fd(frameLayout4, 0.0f);
            }
        }
        View view = this.LLILZIL;
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.rightMargin = 0;
            marginLayoutParams2.bottomMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            if (view != null) {
                C786410Ut5.W5(view, layoutParams2);
                C786410Ut5.Jc(view, 0.0f);
                C786410Ut5.ed(view, 0.0f);
            }
        }
        ViewGroup viewGroup = this.LLIZ;
        if (viewGroup != null) {
            layoutParams3 = viewGroup.getLayoutParams();
        }
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.topMargin = 0;
            marginLayoutParams3.rightMargin = 0;
            marginLayoutParams3.bottomMargin = 0;
            marginLayoutParams3.leftMargin = 0;
            if (viewGroup != null) {
                C786410Ut5.X5(layoutParams3, viewGroup);
                C786410Ut5.Gc(0.0f, viewGroup);
                C786410Ut5.bd(0.0f, viewGroup);
            }
        }
        C20441214yg.LJIIIZ("picture_in_picture", " adapterPipLayout, ");
        FrameLayout frameLayout5 = this.LLILZ;
        if (frameLayout5 != null) {
            frameLayout5.measure(0, 0);
        }
        C16F5 c16f5 = this.LLIZLLLIL;
        if (c16f5 != null) {
            switch (i) {
                case 1:
                    c16f5.setText(C497740JfY.LJIJI(2131843784));
                    break;
                case 2:
                    c16f5.setText(C497740JfY.LJIJI(2131843782));
                    break;
                case 3:
                    c16f5.setText(C497740JfY.LJIJI(2131843785));
                    break;
                case 4:
                    c16f5.setText(C497740JfY.LJIJI(2131842396));
                    break;
                case 5:
                    c16f5.setText(C497740JfY.LJIJI(2131840715));
                    break;
                case 6:
                    c16f5.setText(C497740JfY.LJIJI(2131846521));
                    break;
                case 7:
                    c16f5.setText(C497740JfY.LJIJI(2131846521));
                    break;
                case 8:
                    c16f5.setText(C497740JfY.LJIJI(2131846521));
                    break;
            }
        }
        if (this.LLJI == null) {
            ?? r1 = new C0INS() { // from class: X.0INQ
                @Override // X.C0INS
                public final void LIZLLL() {
                    C20441214yg.LJIIIZ("picture_in_picture", "startCountDownTime onFinish() ");
                    this.LIZ.LLJI = null;
                    function0.invoke();
                }

                @Override // X.C0INS
                public final void LIZ(int i2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startCountDownTime start time length is ");
                    sbLIZ.append(i2);
                    C20441214yg.LJIIIZ("picture_in_picture", C2188811AlT.LIZIZ(sbLIZ));
                    C16F5 c16f52 = this.LIZ.LLJ;
                    if (c16f52 != null) {
                        c16f52.setText(C497740JfY.LJIJJ(2131843783, Integer.valueOf(i2)));
                    }
                }

                public final void LIZIZ(int i2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startCountDownTime start time length is ");
                    sbLIZ.append(i2);
                    C20441214yg.LJIIIZ("picture_in_picture", C2188811AlT.LIZIZ(sbLIZ));
                    C16F5 c16f52 = this.LIZ.LLJ;
                    if (c16f52 != null) {
                        c16f52.setText(C497740JfY.LJIJJ(2131843783, Integer.valueOf(i2)));
                    }
                }
            };
            C0INR c0inr = new C0INR(r1);
            this.LLJI = c0inr;
            r1.LIZIZ(c0inr.LIZ);
            C786410Ut5.LJLIIL(0L, c0inr.LIZJ, c0inr.LJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OR(int i, int i2) {
        View view;
        C0IF5 c0if5 = this.LLILZLL;
        if (c0if5 == 0) {
            return;
        }
        View videoView = null;
        if ((c0if5 instanceof View) && (view = (View) c0if5) != null && view.isShown()) {
            InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(this.LLILLJJLI);
            if (interfaceC480510IsrLIZIZ != null) {
                videoView = interfaceC480510IsrLIZIZ.getVideoView();
            }
            if (!Intrinsics.LJFF(videoView, c0if5)) {
                return;
            }
            int streamWidth = c0if5.getStreamWidth();
            int streamHeight = c0if5.getStreamHeight();
            int videoSize = interfaceC480510IsrLIZIZ.getVideoSize();
            int i3 = 65535 & videoSize;
            int i4 = videoSize >> 16;
            if (i3 != streamWidth || i4 != streamHeight) {
                c0if5.setVideoSize(i3, i4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0IF5, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? c1a7g;
        super.onViewCreated(view, bundle);
        this.LLILZ = (FrameLayout) view.findViewById(R.id.tqy);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.qhz);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.mx0);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.qhu);
        this.LLJ = (C16F5) view.findViewById(R.id.f04);
        Context context = getContext();
        if (context != null) {
            if (LiveUseSurfaceViewExperiment.INSTANCE.isEnable() && LivePipUseSurfaceViewSetting.INSTANCE.getValue()) {
                c1a7g = new C1A7I(context);
            } else {
                c1a7g = new C1A7G(context);
            }
            FrameLayout frameLayout = this.LLILLL;
            if (frameLayout != null) {
                C786410Ut5.LJJJLL(frameLayout);
            }
            ?? r0 = this.LLILLL;
            if (r0 != 0) {
                r0.addView(c1a7g);
            }
            this.LLILZLL = c1a7g;
        }
        MR();
    }
}
