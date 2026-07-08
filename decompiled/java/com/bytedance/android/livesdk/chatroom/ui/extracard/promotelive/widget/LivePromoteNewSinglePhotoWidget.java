package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import X.C19R6;
import X.C2187701Ajg;
import X.C500260Jjc;
import X.C786410Ut5;
import X.ViewTreeObserverOnGlobalLayoutListenerC521810KdH;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteNewSinglePhotoWidget extends LivePromoteParentWidget {
    public ViewTreeObserverOnGlobalLayoutListenerC521810KdH LLJJJJ;
    public C19R6 LLJJJJJIL;

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final int E1() {
        return R.layout.hjv;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final int F1() {
        return 1;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void O1(View view) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final boolean P1() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final boolean Q1() {
        return C500260Jjc.LJJIIZ(this.LLILZLL.bgImgUrl);
    }

    public LivePromoteNewSinglePhotoWidget(EncourageGoLiveCard encourageGoLiveCard) {
        super(encourageGoLiveCard);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        C19R6 c19r6;
        ViewTreeObserver viewTreeObserver;
        SpannableString spannableString;
        super.setContentView(view);
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_title);
            if (textView != null) {
                if (this.LLILZLL.title.length() == 0) {
                    C500260Jjc.LJIILIIL(textView);
                } else {
                    EncourageGoLiveCard encourageGoLiveCard = this.LLILZLL;
                    String str = encourageGoLiveCard.title;
                    String str2 = encourageGoLiveCard.diffColor;
                    int iLJJJ = a0.LJJJ(str, e3.e, 0, false, 6);
                    int iLJJJ2 = a0.LJJJ(str, e3.f, 0, false, 6);
                    if (iLJJJ2 > iLJJJ + 1 && iLJJJ > -1) {
                        spannableString = new SpannableString(u.LJJIFFI(u.LJJIFFI(str, e3.e, "", false), e3.f, "", false));
                        try {
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(Color.parseColor(str2)), iLJJJ, iLJJJ2 - 1, 18);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } else {
                        spannableString = new SpannableString(str);
                    }
                    textView.setText(spannableString);
                }
            }
            TextView textView2 = (TextView) view.findViewById(R.id.tv_sub_title);
            if (textView2 != null) {
                if (this.LLILZLL.subTitle.length() == 0) {
                    C500260Jjc.LJIILIIL(textView2);
                } else {
                    textView2.setText(this.LLILZLL.subTitle);
                }
            }
            c19r6 = (C19R6) view.findViewById(R.id.lo3);
        } else {
            c19r6 = null;
        }
        this.LLJJJJJIL = c19r6;
        H1(((GoLiveCardPicture) ListProtector.get(this.LLILZLL.pictures, 0)).url, this.LLJJJJJIL, ImageView.ScaleType.FIT_CENTER);
        this.LLJJJJ = new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(view, this, 1);
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH = this.LLJJJJ;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521810KdH);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521810KdH, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }
}
