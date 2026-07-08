package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C011Z;
import X.C0I7D;
import X.C0UQX;
import X.C1324720kZq;
import X.C16F5;
import X.C20736316Cj;
import X.C748880TZe;
import X.C754410TiZ;
import X.C754420Tia;
import X.C754430Tib;
import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.PreviewCoverEditVisibilityChannel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverSelectDialog;
import com.bytedance.android.livesdk.dataChannel.UpdateCoverEvent;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewCoverEditWidget extends PreviewWidget {
    public PreviewCoverSelectDialog LLILZ;
    public C0I7D LLILZIL;
    public C16F5 LLILZLL;
    public C754410TiZ LLIZLLLIL;
    public String LLJ;
    public View LLJI;
    public C1324720kZq LLJIJIL;
    public C16F5 LLJILJIL;
    public boolean LLIZ = true;
    public final C754430Tib LLJILJILJ = C754430Tib.LL;
    public final C754420Tia LLJILLL = new InputFilter() { // from class: X.0Tia
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            boolean z;
            C0I7D c0i7d;
            C0I7D c0i7d2;
            int length = spanned.length();
            if (length >= 32) {
                z = true;
            } else {
                z = false;
            }
            int i5 = length - (i4 - i3);
            int i6 = i2 - i;
            int i7 = i5 + i6;
            if (i7 > 0) {
                C0I7D c0i7d3 = this.LL.LLILZIL;
                if ((c0i7d3 == null || c0i7d3.getGravity() != 17) && (c0i7d2 = this.LL.LLILZIL) != null) {
                    c0i7d2.setGravity(17);
                }
                if (length <= 0) {
                    this.LL.H1(true);
                }
            } else {
                C0I7D c0i7d4 = this.LL.LLILZIL;
                if ((c0i7d4 == null || c0i7d4.getGravity() != 16) && (c0i7d = this.LL.LLILZIL) != null) {
                    c0i7d.setGravity(16);
                }
                this.LL.H1(false);
            }
            if (z && i6 > 0) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
                return "";
            }
            if (i7 > 32) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
                int i8 = 32 - i5;
                if (i8 <= 0) {
                    return "";
                }
                return charSequence.subSequence(i, i8 + i);
            }
            return null;
        }
    };

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hh_;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return false;
    }

    public final void G1() {
        FragmentManager fragmentManager;
        PreviewCoverSelectDialog previewCoverSelectDialog;
        if (this.LLILZ == null) {
            this.LLILZ = new PreviewCoverSelectDialog();
        }
        C0I7D c0i7d = this.LLILZIL;
        if (c0i7d != null) {
            KeyBoardUtil.LIZJ(this.context, c0i7d);
        }
        C0I7D c0i7d2 = this.LLILZIL;
        if (c0i7d2 != null) {
            c0i7d2.clearFocus();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (previewCoverSelectDialog = this.LLILZ) != null) {
            previewCoverSelectDialog.show(fragmentManager, "PreviewCoverSelectDialog");
        }
        C0UQX.LJIJJ(this.dataChannel);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C0I7D c0i7d = this.LLILZIL;
        if (c0i7d != null) {
            KeyBoardUtil.LIZJ(this.context, c0i7d);
        }
        C754410TiZ c754410TiZ = this.LLIZLLLIL;
        if (c754410TiZ != null) {
            c754410TiZ.LJIIIZ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0355  */
    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShow() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCoverEditWidget.onShow():void");
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, PreviewCoverEditVisibilityChannel.class, new AwS591S0100000_12(this, 261));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, UpdateCoverEvent.class, new AwS591S0100000_12(this, 262));
        }
    }

    public final void H1(boolean z) {
        if (z) {
            C16F5 c16f5 = this.LLILZLL;
            if (c16f5 != null) {
                c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.f00, getContext()));
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LLILZLL;
        if (c16f52 == null) {
            return;
        }
        c16f52.setTextColor(C20736316Cj.LIZIZ(R.attr.exr, getContext()));
    }

    public final void I1(String str) {
        if (str == null) {
            return;
        }
        if (str.length() == 0) {
            C0I7D c0i7d = this.LLILZIL;
            if (c0i7d != null) {
                c0i7d.setGravity(16);
            }
            C0I7D c0i7d2 = this.LLILZIL;
            if (c0i7d2 != null) {
                c0i7d2.setText(new StringBuilder(""));
            }
            C0I7D c0i7d3 = this.LLILZIL;
            if (c0i7d3 != null) {
                c0i7d3.setHint(2131840910);
                return;
            }
            return;
        }
        C0I7D c0i7d4 = this.LLILZIL;
        if (c0i7d4 != null) {
            c0i7d4.setGravity(17);
        }
        C0I7D c0i7d5 = this.LLILZIL;
        if (c0i7d5 == null) {
            return;
        }
        c0i7d5.setText(str);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }
}
