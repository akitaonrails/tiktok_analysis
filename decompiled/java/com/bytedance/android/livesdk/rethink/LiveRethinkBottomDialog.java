package com.bytedance.android.livesdk.rethink;

import X.C1114540f6q;
import X.C16F5;
import X.C16FS;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRethinkBottomDialog extends LiveBottomSheetDialog {
    public ViewGroup LLJJJIL;
    public C16F5 LLJJJJ;
    public C16FS LLJJJJJIL;
    public C16FS LLJJJJLIIL;
    public final CharSequence LLJJL;
    public final Function1<? super DialogInterface, Unit> LLJJLIIIJLLLLLLLZ;
    public final Function1<? super DialogInterface, Unit> LLJL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        if (C497740JfY.LJIL()) {
            i = R.layout.ga7;
        } else {
            i = R.layout.ga8;
        }
        setContentView(i);
        this.LLJJJIL = (ViewGroup) findViewById(R.id.te8);
        if (!C497740JfY.LJIL() && (viewGroup = this.LLJJJIL) != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            layoutParams.height = C497740JfY.LJIILL();
        }
        this.LLJJJJ = (C16F5) findViewById(R.id.zf0);
        this.LLJJJJJIL = (C16FS) findViewById(R.id.riu);
        this.LLJJJJLIIL = (C16FS) findViewById(R.id.gnd);
        CharSequence charSequence = this.LLJJL;
        if (charSequence != null) {
            C16F5 c16f5 = this.LLJJJJ;
            if (c16f5 != null) {
                c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            }
            C16F5 c16f52 = this.LLJJJJ;
            if (c16f52 != null) {
                c16f52.setText(charSequence);
            }
        }
        C16FS c16fs = this.LLJJJJJIL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS152S0100000_17(this, 87));
        }
        C16FS c16fs2 = this.LLJJJJLIIL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS152S0100000_17(this, 88));
        }
        setCancelable(false);
    }

    public LiveRethinkBottomDialog(Context context, C1114540f6q c1114540f6q) {
        super(context, 0);
        this.LLJJLIIIJLLLLLLLZ = AFwS254S0000000_17.get$arr$(88);
        this.LLJL = AFwS254S0000000_17.get$arr$(87);
        this.LLJJL = c1114540f6q.LIZJ;
        this.LLJJLIIIJLLLLLLLZ = c1114540f6q.LIZLLL;
        this.LLJL = c1114540f6q.LJ;
    }
}
