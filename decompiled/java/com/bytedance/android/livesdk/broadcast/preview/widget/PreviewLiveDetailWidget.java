package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0UQK;
import X.C0WZX;
import X.C16G6;
import X.C20441214yg;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C21626919kR;
import X.C2204961BRm;
import X.C292401Bi;
import X.C416760GVu;
import X.C426750GoL;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786120Usc;
import X.C786410Ut5;
import X.ViewOnFocusChangeListenerC785970UsN;
import Y.ACListenerS116S0200000_12;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveDetailWidget extends PreviewWidget {
    public LiveEditText LLILZIL;
    public LiveIconView LLILZLL;
    public View LLIZ;
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 181));
    public String LLIZLLLIL = "";
    public long LLJ = -1;
    public final C786120Usc LLJI = new C786120Usc(this, 5);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i23;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        this.dataChannel.EQ2(this, PreviewTitleChannel.class, new AwS591S0100000_12(this, 279));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZIL = (LiveEditText) findViewById(R.id.y3o);
        this.LLILZLL = (LiveIconView) findViewById(R.id.gq0);
        this.LLIZ = findViewById(R.id.y0p);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, PreviewHideKeyboardEvent.class, new AwS591S0100000_12(this, 280));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, LiveModeChannel.class, new AwS591S0100000_12(this, 281));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 282));
        }
        LivePreviewComponentsSimplifyTypeSetting livePreviewComponentsSimplifyTypeSetting = LivePreviewComponentsSimplifyTypeSetting.INSTANCE;
        if (!livePreviewComponentsSimplifyTypeSetting.inExperiment()) {
            LiveEditText liveEditText = this.LLILZIL;
            if (liveEditText == null) {
                liveEditText = null;
            }
            liveEditText.setMinHeight((int) C497740JfY.LIZIZ(70.0f));
            LiveEditText liveEditText2 = this.LLILZIL;
            (liveEditText2 != null ? liveEditText2 : null).setMaxLines(3);
            return;
        }
        LiveIconView liveIconView = this.LLILZLL;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C786410Ut5.LLJJIJIL(liveIconView, 0);
        G1();
        if (livePreviewComponentsSimplifyTypeSetting.showFullLiveGoalBtn()) {
            LiveEditText liveEditText3 = this.LLILZIL;
            if (liveEditText3 == null) {
                liveEditText3 = null;
            }
            C426750GoL.LJIIIZ(liveEditText3, Integer.valueOf((int) C497740JfY.LIZIZ(12.0f)), 0, 0, 0, false, 16);
        }
        View view = this.LLIZ;
        if (view == null) {
            view = null;
        }
        C500260Jjc.LJLIIIL(500L, view, new AwS591S0100000_12(this, 283));
        LiveEditText liveEditText4 = this.LLILZIL;
        if (liveEditText4 == null) {
            liveEditText4 = null;
        }
        liveEditText4.setMinHeight(0);
        LiveEditText liveEditText5 = this.LLILZIL;
        if (liveEditText5 == null) {
            liveEditText5 = null;
        }
        liveEditText5.setMaxLines(1);
        if (livePreviewComponentsSimplifyTypeSetting.needShadowForTitle()) {
            float fLIZIZ = (int) C497740JfY.LIZIZ(1.0f);
            LiveEditText liveEditText6 = this.LLILZIL;
            (liveEditText6 != null ? liveEditText6 : null).setShadowLayer(fLIZIZ, 0.0f, fLIZIZ, C497740JfY.LJFF(R.color.aah));
        }
    }

    public final ImageSpan G1() {
        C20743516Fd c20743516FdLIZLLL;
        BitmapDrawable bitmapDrawable;
        boolean zLJJ = C497740JfY.LJJ();
        boolean zLIZJ = C0UQK.LIZJ(this.dataChannel);
        if (zLIZJ) {
            c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.d3d, this.context);
            if (c20743516FdLIZLLL == null) {
                return null;
            }
            c20743516FdLIZLLL.setTint(C497740JfY.LJFF(R.color.f569bc));
        } else {
            c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.e6q, this.context);
            if (c20743516FdLIZLLL == null) {
                return null;
            }
            c20743516FdLIZLLL.setTint(C497740JfY.LJFF(R.color.be));
            c20743516FdLIZLLL.LJ(0.6666667f);
        }
        if (zLIZJ) {
            if (zLJJ) {
                C16G6.LIZIZ(c20743516FdLIZLLL, 1);
                c20743516FdLIZLLL.setAutoMirrored(true);
            }
            c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(12.0f), (int) C497740JfY.LIZIZ(12.0f));
        } else {
            c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(24.0f), (int) C497740JfY.LIZIZ(16.0f));
        }
        if ((c20743516FdLIZLLL instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) c20743516FdLIZLLL) != null) {
            bitmapDrawable.setGravity(zLJJ ? 3 : 5);
        }
        if (LivePreviewComponentsSimplifyTypeSetting.INSTANCE.needShadowForTitle()) {
            float fLIZIZ = (int) C497740JfY.LIZIZ(1.0f);
            LiveIconView liveIconView = this.LLILZLL;
            if (liveIconView == null) {
                liveIconView = null;
            }
            liveIconView.LJI(fLIZIZ, 0.0f, fLIZIZ, C497740JfY.LJFF(R.color.aah));
        }
        LiveIconView liveIconView2 = this.LLILZLL;
        (liveIconView2 != null ? liveIconView2 : null).setIcon(c20743516FdLIZLLL);
        return new C416760GVu(c20743516FdLIZLLL);
    }

    public final void H1(String str) {
        C20441214yg.LIZIZ("SimplifySheet", "Title Receive: " + str);
        if (str == null) {
            return;
        }
        LiveEditText liveEditText = null;
        if (a0.LJJJIL(str)) {
            LiveEditText liveEditText2 = this.LLILZIL;
            if (liveEditText2 == null) {
                liveEditText2 = null;
            }
            liveEditText2.setHint(2131842001);
        } else {
            LiveEditText liveEditText3 = this.LLILZIL;
            if (liveEditText3 == null) {
                liveEditText3 = null;
            }
            liveEditText3.setHint("");
        }
        LiveEditText liveEditText4 = this.LLILZIL;
        if (liveEditText4 == null) {
            liveEditText4 = null;
        }
        if (liveEditText4.isFocused()) {
            LiveEditText liveEditText5 = this.LLILZIL;
            if (liveEditText5 == null) {
                liveEditText5 = null;
            }
            if (!TextUtils.isEmpty(String.valueOf(C2204961BRm.LLLFZ(liveEditText5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoXPrRM20YF4DTC149RpKzZ", null))))) {
                LiveEditText liveEditText6 = this.LLILZIL;
                if (liveEditText6 != null) {
                    liveEditText = liveEditText6;
                }
                liveEditText.setText(str);
                return;
            }
        }
        SpannableString spannableString = new SpannableString(str);
        LiveEditText liveEditText7 = this.LLILZIL;
        if (liveEditText7 != null) {
            liveEditText = liveEditText7;
        }
        liveEditText.setText(spannableString);
    }

    public final void I1(RoomCreateInfo roomCreateInfo, LiveMode liveMode) {
        String str;
        String str2;
        LiveEditText liveEditText = this.LLILZIL;
        LiveEditText liveEditText2 = null;
        if (liveEditText == null) {
            liveEditText = null;
        }
        liveEditText.setTextSize(1, 17.0f);
        if (C0UQK.LIZIZ(roomCreateInfo)) {
            str = roomCreateInfo.mLiveEventInfo.title;
        } else {
            str = "";
        }
        if (str.length() > 0) {
            liveEditText.setClickable(false);
            liveEditText.setFocusable(false);
            liveEditText.setFocusableInTouchMode(false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (C497740JfY.LJJ()) {
                if (C21626919kR.LIZLLL.LIZ(str.length(), str)) {
                    spannableStringBuilder.append((CharSequence) str);
                } else {
                    spannableStringBuilder.append((CharSequence) str);
                }
            } else if (C21626919kR.LIZJ.LIZ(str.length(), str)) {
                spannableStringBuilder.append((CharSequence) str);
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
            liveEditText.setText(spannableStringBuilder);
            C786410Ut5.j8(liveEditText, new ACListenerS116S0200000_12(this, roomCreateInfo, 17));
            return;
        }
        liveEditText.setTextDirection(2);
        liveEditText.addTextChangedListener(this.LLJI);
        liveEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC785970UsN(this, liveEditText, 0));
        LiveEditText liveEditText3 = this.LLILZIL;
        if (liveEditText3 != null) {
            liveEditText2 = liveEditText3;
        }
        liveEditText2.setHint(2131842001);
        if (liveMode == LiveMode.LIVE_VOICE && C500260Jjc.LJJIIZ(roomCreateInfo.voiceTitle)) {
            str2 = roomCreateInfo.voiceTitle;
        } else {
            str2 = roomCreateInfo.mTitle;
        }
        H1(str2);
    }
}
