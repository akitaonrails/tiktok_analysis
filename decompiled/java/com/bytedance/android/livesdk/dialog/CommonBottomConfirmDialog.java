package com.bytedance.android.livesdk.dialog;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C16FS;
import X.C469840Ibe;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public final class CommonBottomConfirmDialog extends LiveBaseSheetDialog {
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public Function1<? super LiveBottomSheetDialog, Unit> LLJZ;
    public int LLJZIJLIL;
    public Function1<? super LiveBottomSheetDialog, Unit> LLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, X.C19GJ, X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7yOoPREJXWZbSGo7LpeDxXsSugebMrQbblQ18w52MVo=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/design/view/sheet/LiveBaseSheetDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/live/design/view/sheet/LiveBaseSheetDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            LifecycleAwareDialog lifecycleAwareDialog = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (LifecycleAwareDialog) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/live/design/view/sheet/LiveBaseSheetDialog", "show", null, objArr, lifecycleAwareDialog, c0wzw, true);
        }
        ((ArrayList) C469840Ibe.LIZ).add(this);
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        ((ArrayList) C469840Ibe.LIZ).remove(this);
    }

    public CommonBottomConfirmDialog(Context context) {
        super(context);
        this.LLJLLIL = R.layout.g0w;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        setContentView(this.LLJLLIL);
        TextView textView = (TextView) findViewById(R.id.yoe);
        if (textView != null && (i2 = this.LLJLILLLLZIIL) != 0) {
            textView.setText(C497740JfY.LJIJI(i2));
        }
        TextView textView2 = (TextView) findViewById(R.id.yod);
        if (textView2 != null && (i = this.LLJLL) != 0) {
            textView2.setText(C497740JfY.LJIJI(i));
        }
        C16FS c16fs = (C16FS) findViewById(R.id.yoc);
        if (c16fs != null) {
            int i3 = this.LLJLLL;
            if (i3 != 0) {
                c16fs.setText(C497740JfY.LJIJI(i3));
            }
            C786410Ut5.h8(c16fs, new ACListenerS161S0100000_27(this, 121));
        }
        C16FS c16fs2 = (C16FS) findViewById(R.id.yob);
        if (c16fs2 != null) {
            int i4 = this.LLJZIJLIL;
            if (i4 != 0) {
                c16fs2.setText(C497740JfY.LJIJI(i4));
            }
            C786410Ut5.h8(c16fs2, new ACListenerS161S0100000_27(this, 122));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, X.C19GU, android.app.Dialog
    public final void setTitle(int i) {
        this.LLJLILLLLZIIL = i;
    }
}
