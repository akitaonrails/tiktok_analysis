package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.C0JFK;
import X.C0JFN;
import X.C0URX;
import X.C1086800eO6;
import X.C16F5;
import X.C16FS;
import X.C19322110iZ;
import X.C20484615Do;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C946050aj5;
import X.C946060aj6;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.OnlySetDrawGuessStartGameEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessRoundDurationChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.model.DrawGuessChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessStartDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzHELIOSElJiF9LDctPigmLTY/Zzo6ZgE+KDgUPSA/OhwnKTc4DSYyJCor";
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public C16FS LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final AwS586S0100000_7 LLIZ = new AwS586S0100000_7(this, 121);

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C16FS MR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vyf) : null;
            this.LLILZ = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final void NR() {
        if (this.isViewValid) {
            C0JFN c0jfn = C0JFN.LIZ;
            AwS586S0100000_7 awS586S0100000_7 = this.LLIZ;
            c0jfn.getClass();
            if (C0JFN.LJI(this, awS586S0100000_7) || C0JFN.LJ(this, this.dataChannel, this.LLIZ)) {
                return;
            }
            if (C500260Jjc.LJLLJ(Boolean.valueOf(C1086800eO6.LIZJ), new AwS251S0300000_7((Fragment) this, (Fragment) this.dataChannel, (DataChannel) this.LLIZ, (Function1<? super Boolean, Unit>) 24)) || C0JFN.LJII(this, this.dataChannel, this.LLIZ)) {
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(OnlySetDrawGuessStartGameEvent.class);
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.zW(DrawGuessIsCountingDownRoundStart.class, Boolean.TRUE);
            }
            this.LLILZLL = true;
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5q);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        C20484615Do c20484615DoLIZJ = C19322110iZ.LIZJ(getView());
        if (c20484615DoLIZJ != null) {
            c20484615DoLIZJ.LIZ(1);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    public final void OR(DrawGuessWord drawGuessWord) {
        if (drawGuessWord == null) {
            return;
        }
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.j9t);
            } else {
                viewFindViewById = null;
            }
            this.LL = (C16F5) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView != null) {
            textView.setText(drawGuessWord.word);
        }
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
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        C946060aj6 c946060aj6LIZ2;
        C946050aj5 c946050aj5LIZIZ2;
        super.onDismiss(dialogInterface);
        if (this.LLILZLL) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (c946060aj6LIZ2 = C0URX.LIZ(dataChannel, DrawGuessChannel.class)) != null && (c946050aj5LIZIZ2 = c946060aj6LIZ2.LIZIZ()) != null) {
                c946050aj5LIZIZ2.LIZIZ(1);
                return;
            }
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (c946060aj6LIZ = C0URX.LIZ(dataChannel2, DrawGuessChannel.class)) == null || (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) == null) {
            return;
        }
        c946050aj5LIZIZ.LIZIZ(2);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, DrawGuessRoundDurationChannel.class, new C0JFK(this));
        }
    }
}
