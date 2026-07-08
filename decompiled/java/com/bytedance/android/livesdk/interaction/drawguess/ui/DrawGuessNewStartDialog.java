package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.C01GW;
import X.C0J1R;
import X.C0JFO;
import X.C0UO0;
import X.C0URX;
import X.C0WZX;
import X.C16F5;
import X.C19322110iZ;
import X.C19EH;
import X.C19U0;
import X.C19U1;
import X.C20484615Do;
import X.C2204961BRm;
import X.C292401Bi;
import X.C475510Ikn;
import X.C482260Ivg;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C946050aj5;
import X.C946060aj6;
import X.InterfaceC1584740rLE;
import X.InterfaceC19323110ij;
import Y.ACListenerS142S0100000_7;
import Y.AfS43S1100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessDismissStartDialogEvent;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessNewStartDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.bytedance.android.livesdk.model.DrawGuessChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessNewStartDialog extends LiveDialogFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzElHELIOSJiF9LDctPigmLTY/Zzo6ZgE+KDgUPSA/OgE2PxY4KD0nDCwtJSA0";
    public ConstraintLayout LL;
    public C16F5 LLILLJJLI;
    public FrameLayout LLILLL;
    public View LLILZ;
    public C19U1 LLILZIL;
    public final C01GW LLILZLL = C292401Bi.LIZ(new AwS551S0100000_7(this, 68));
    public final C01GW LLIZ = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(52));
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final DrawGuessStartFragment MR() {
        return (DrawGuessStartFragment) this.LLILZLL.getValue();
    }

    public final C19U1 NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wya) : null;
            this.LLILZIL = (C19U1) viewFindViewById;
        }
        return (C19U1) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5r);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 48;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        if (this.LLJI) {
            Context context = getContext();
            Object objH2 = context != null ? C786410Ut5.H2(context, "input_method") : null;
            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                View view = getView();
                inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
            }
        }
        C20484615Do c20484615DoLIZJ = C19322110iZ.LIZJ(getView());
        if (c20484615DoLIZJ != null) {
            c20484615DoLIZJ.LIZ(1);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final C19U0 OR(int i) {
        TextView textView;
        C19U0 c19u0NewTab = NR().newTab();
        c19u0NewTab.LIZJ(R.layout.gd6);
        View view = c19u0NewTab.LJFF;
        if (view != null && (textView = (TextView) view.findViewById(R.id.wy6)) != null) {
            textView.setText(i);
        }
        return c19u0NewTab;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel, DrawGuessChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean z;
        RoomAuthStatus roomAuthStatus;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("argument_is_from_round_summary"));
        } else {
            boolValueOf = null;
        }
        this.LLJ = C500260Jjc.LJJJI(boolValueOf);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            boolValueOf2 = Boolean.valueOf(arguments2.getBoolean("argument_is_custom_next_word"));
        } else {
            boolValueOf2 = null;
        }
        this.LLIZLLLIL = C500260Jjc.LJJJI(boolValueOf2);
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.dataChannel);
        int i = 0;
        if (roomLJJLIIIIJ != null && (roomAuthStatus = roomLJJLIIIIJ.getRoomAuthStatus()) != null && roomAuthStatus.pictionarypermission == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.LLIZLLLIL) {
            C500260Jjc.LLFFF(NR());
            NR().addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0JFF
                @Override // X.InterfaceC1586460rO0
                public final void ih(C19U0 c19u0) {
                }

                @Override // X.InterfaceC1586460rO0
                public final void Oq(C19U0 c19u0) {
                    TextView textView;
                    if (this.LL.isViewValid) {
                        View view2 = c19u0.LJFF;
                        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.wy6)) != null) {
                            C439101nJ.LJFF(textView, R.color.da);
                        }
                        int i2 = c19u0.LJ;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                DrawGuessNewStartDialog drawGuessNewStartDialog = this.LL;
                                C19EH c19ehLJIIJ = drawGuessNewStartDialog.getChildFragmentManager().LJIIJ();
                                c19ehLJIIJ.LJJIFFI((Fragment) drawGuessNewStartDialog.LLIZ.getValue());
                                c19ehLJIIJ.LJIILL(drawGuessNewStartDialog.MR());
                                c19ehLJIIJ.LJIIIZ();
                                DrawGuessStartFragment drawGuessStartFragmentMR = drawGuessNewStartDialog.MR();
                                drawGuessStartFragmentMR.LLJJI = false;
                                LiveEditText liveEditTextPR = drawGuessStartFragmentMR.PR();
                                if (liveEditTextPR != null) {
                                    C500260Jjc.LJIILJJIL(liveEditTextPR);
                                }
                                Fragment fragment = (Fragment) drawGuessNewStartDialog.LLIZ.getValue();
                                fragment.getClass();
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_freely_panel_show");
                                c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(fragment));
                                C0JFO.LIZ(c474500IjALIZ);
                                c474500IjALIZ.LIZ();
                                return;
                            }
                            return;
                        }
                        DrawGuessNewStartDialog drawGuessNewStartDialog2 = this.LL;
                        C19EH c19ehLJIIJ2 = drawGuessNewStartDialog2.getChildFragmentManager().LJIIJ();
                        c19ehLJIIJ2.LJJIFFI(drawGuessNewStartDialog2.MR());
                        c19ehLJIIJ2.LJIILL((Fragment) drawGuessNewStartDialog2.LLIZ.getValue());
                        c19ehLJIIJ2.LJIIIZ();
                        drawGuessNewStartDialog2.MR().getClass();
                        drawGuessNewStartDialog2.LLIZ.getValue().getClass();
                    }
                }

                @Override // X.InterfaceC1586460rO0
                public final void Yn(C19U0 c19u0) {
                    View view2;
                    TextView textView;
                    if (this.LL.isViewValid && (view2 = c19u0.LJFF) != null && (textView = (TextView) view2.findViewById(R.id.wy6)) != null) {
                        C439101nJ.LJFF(textView, R.color.di);
                    }
                }
            });
            NR().addTab(OR(2131841390), true);
            NR().addTab(OR(2131841391), false);
            Fragment[] fragmentArr = {this.LLIZ.getValue(), MR()};
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            do {
                c19ehLJIIJ.LIZIZ(R.id.iiv, fragmentArr[i]);
                i++;
            } while (i < 2);
            c19ehLJIIJ.LJIIIZ();
        } else {
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.y1z);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (ConstraintLayout) viewFindViewById2;
            }
            C500260Jjc.LLFFF(viewFindViewById2);
            if (this.LLIZLLLIL) {
                View viewFindViewById3 = this.LLILLJJLI;
                if (viewFindViewById3 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById3 = view3.findViewById(R.id.title);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLILLJJLI = (C16F5) viewFindViewById3;
                }
                ((TextView) viewFindViewById3).setText(2131841395);
                if (this.LLJ) {
                    View viewFindViewById4 = this.LLILLL;
                    if (viewFindViewById4 == null) {
                        View view4 = getView();
                        if (view4 != null) {
                            viewFindViewById4 = view4.findViewById(R.id.bmy);
                        } else {
                            viewFindViewById4 = null;
                        }
                        this.LLILLL = (FrameLayout) viewFindViewById4;
                    }
                    C500260Jjc.LLFFF(viewFindViewById4);
                    View viewFindViewById5 = this.LLILLL;
                    if (viewFindViewById5 == null) {
                        View view5 = getView();
                        if (view5 != null) {
                            viewFindViewById5 = view5.findViewById(R.id.bmy);
                        } else {
                            viewFindViewById5 = null;
                        }
                        this.LLILLL = (FrameLayout) viewFindViewById5;
                    }
                    C786410Ut5.O7((FrameLayout) viewFindViewById5, new ACListenerS142S0100000_7(this, 74));
                }
            }
            Fragment[] fragmentArr2 = {MR()};
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ2.LIZIZ(R.id.iiv, fragmentArr2[0]);
            c19ehLJIIJ2.LJIIIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, DrawGuessDismissStartDialogEvent.class, new AwS586S0100000_7(this, 120));
        }
        View view6 = this.LLILZ;
        if (view6 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById = view7.findViewById(R.id.uvy);
            }
            this.LLILZ = viewFindViewById;
            view6 = viewFindViewById;
        }
        C500260Jjc.LJIILIIL(view6);
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        this.LLJI = z;
        DrawGuessStartFragment drawGuessStartFragmentMR = MR();
        drawGuessStartFragmentMR.LLJILJIL = z;
        if (z) {
            ValueAnimator valueAnimator = drawGuessStartFragmentMR.LLJJIJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            drawGuessStartFragmentMR.LLJIJIL = String.valueOf(C2204961BRm.LLLFZ(drawGuessStartFragmentMR.PR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl4iQ5gQpOwecRDs/gq5lfS27hzRCufHFDtUYeU+muc61pcf9u4X0jRpGUeVoQEsU=", null)));
            C0JFO.LJIIIIZZ(C475510Ikn.LJ(drawGuessStartFragmentMR), drawGuessStartFragmentMR.LLJIJIL, drawGuessStartFragmentMR.LLJJ);
            drawGuessStartFragmentMR.UR(true);
            drawGuessStartFragmentMR.PR().setText("");
        } else {
            String string = a0.LJLIIIL(String.valueOf(C2204961BRm.LLLFZ(drawGuessStartFragmentMR.PR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl4iQ5gQpOwecRDs/gq5lfS27hzRCufHFDtUYeU+muc61pcf9u4X0jRpGUeVoQEsU=", null)))).toString();
            drawGuessStartFragmentMR.LLJJIII = true;
            LiveEditText liveEditTextPR = drawGuessStartFragmentMR.PR();
            if (a0.LJJJIL(string)) {
                string = drawGuessStartFragmentMR.LLJIJIL;
            }
            liveEditTextPR.setText(string);
            drawGuessStartFragmentMR.PR().clearFocus();
            C500260Jjc.LLFFF(drawGuessStartFragmentMR.RR());
            drawGuessStartFragmentMR.RR().LJ();
            String strValueOf = String.valueOf(C2204961BRm.LLLFZ(drawGuessStartFragmentMR.PR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl4iQ5gQpOwecRDs/gq5lfS27hzRCufHFDtUYeU+muc61pcf9u4X0jRpGUeVoQEsU=", null)));
            ((DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class)).reviewWord(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(drawGuessStartFragmentMR)), strValueOf).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(drawGuessStartFragmentMR)).LJJLL(new AfS43S1100000_7(drawGuessStartFragmentMR, strValueOf, 5), new AfS43S1100000_7(drawGuessStartFragmentMR, strValueOf, 6));
        }
        drawGuessStartFragmentMR.LLJILJILJ = true;
    }
}
