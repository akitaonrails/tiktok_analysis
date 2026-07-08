package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols;

import X.C01GW;
import X.C1308910kAL;
import X.C1509305vX;
import X.C1559260qg8;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C458640Hyg;
import X.C462510IBt;
import X.C723590SZx;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C909290Zln;
import Y.ACListenerS56S1200000_14;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.experiment.IMOperateBtnColorAB;
import com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VoiceTranscribeIcon;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VoiceTranscribeText;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DMVoiceMessageSideTranscriptButtonUISlot extends ReusedSkeletonUISlotAssem<DMVoiceMessageSideTranscriptButtonUISlot, MessageLeftIconState> {
    public final C1559260qg8 LLJLLIL;
    public final C01GW LLJLLL;
    public View LLJZ;
    public TuxIconView LLJZIJLIL;
    public Animator LLL;
    public final C01GW LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cqf;
    }

    public DMVoiceMessageSideTranscriptButtonUISlot() {
        super(C462510IBt.LIZ);
        this.LLJLLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 803));
        this.LLLF = C1509305vX.LIZ(new AwS558S0100000_14(this, 804));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        Animator animator = this.LLL;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
        SkeletonLayoutCellAbility skeletonLayoutCellAbility = (SkeletonLayoutCellAbility) this.LLLF.getValue();
        if (skeletonLayoutCellAbility != null) {
            skeletonLayoutCellAbility.dM(view);
        }
    }

    public final void Bp(View view, C869590Y9l c869590Y9l) {
        String str;
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.LJLLLLLL(0, view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LLL = objectAnimatorOfFloat;
        if (((C457780HxI) this.LLJLLIL.getValue()).LL instanceof C909290Zln) {
            str = "private";
        } else {
            str = "group";
        }
        C786410Ut5.I7(new ACListenerS56S1200000_14((Object) this, (Context) str, (String) c869590Y9l, (Map<String, String>) 1), view);
        C458640Hyg.LIZLLL(c869590Y9l.getMsgId(), "continuous_voice_icon", ((C457780HxI) this.LLJLLIL.getValue()).LL.getConversationId(), str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void tp(C869590Y9l c869590Y9l, MessageLeftIconState messageLeftIconState) {
        Integer numLIZJ;
        Integer numLIZJ2;
        Animator animator = this.LLL;
        if (animator != null) {
            animator.cancel();
        }
        boolean zLJFF = Intrinsics.LJFF(messageLeftIconState, VoiceTranscribeIcon.INSTANCE);
        int i = R.attr.a1j;
        if (zLJFF) {
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJLLL.getValue());
            TuxIconView tuxIconView = this.LLJZIJLIL;
            if (tuxIconView == null) {
                tuxIconView = new TuxIconView(LJJIJL().getContext(), null, 0, 6, null);
                C786410Ut5.x5(tuxIconView, 0.0f);
                C786410Ut5.M6(tuxIconView, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                Context context = getContext();
                if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context)) != null) {
                    final int iIntValue = numLIZJ2.intValue();
                    tuxIconView.setBackground(new Drawable(iIntValue) { // from class: X.0Eer
                        public final Paint LIZ;
                        public final Path LIZIZ;

                        @Override // android.graphics.drawable.Drawable
                        @InterfaceC1294060jmO
                        public final int getOpacity() {
                            return -1;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i2) {
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                        }

                        {
                            Paint paint = new Paint();
                            paint.setStyle(Paint.Style.FILL);
                            paint.setColor(iIntValue);
                            this.LIZ = paint;
                            this.LIZIZ = new Path();
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            float fWidth = getBounds().width();
                            float fHeight = getBounds().height();
                            Path path = this.LIZIZ;
                            path.reset();
                            if (fWidth > fHeight) {
                                float f = 2;
                                float f2 = fHeight / f;
                                path.moveTo(f2, fHeight);
                                float f3 = f * f2;
                                path.arcTo(0.0f, 0.0f, f3, fHeight, 90.0f, 180.0f, true);
                                path.lineTo(fWidth - f2, 0.0f);
                                path.arcTo(fWidth - f3, 0.0f, fWidth, fHeight, 270.0f, 180.0f, true);
                                path.lineTo(f2, fHeight);
                            } else {
                                float f4 = 2;
                                float f5 = fWidth / f4;
                                path.moveTo(0.0f, f5);
                                float f6 = f4 * f5;
                                path.arcTo(0.0f, 0.0f, fWidth, f6, 180.0f, 180.0f, true);
                                path.lineTo(fWidth, fHeight - f5);
                                path = path;
                                path.arcTo(0.0f, fHeight - f6, fWidth, fHeight, 0.0f, 180.0f, true);
                                path.lineTo(0.0f, f5);
                            }
                            path.close();
                            canvas.drawPath(this.LIZIZ, this.LIZ);
                        }
                    });
                    tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    if (!IMOperateBtnColorAB.INSTANCE.isEnabled()) {
                        i = R.attr.a1h;
                    }
                    tuxIconView.setTintColorRes(i);
                    tuxIconView.setIconRes(R.raw.icon_bubble_wave);
                    ((ViewGroup) this.LLJLLL.getValue()).addView(tuxIconView);
                    this.LLJZIJLIL = tuxIconView;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Bp(tuxIconView, c869590Y9l);
            View view = this.LLJZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(messageLeftIconState, VoiceTranscribeText.INSTANCE)) {
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJLLL.getValue());
            View view2 = this.LLJZ;
            View view3 = view2;
            if (view2 == null) {
                FrameLayout frameLayout = new FrameLayout(LJJIJL().getContext());
                C786410Ut5.U4(frameLayout, 0.0f);
                C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-2, -2));
                Context context2 = getContext();
                if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context2)) != null) {
                    final int iIntValue2 = numLIZJ.intValue();
                    frameLayout.setBackground(new Drawable(iIntValue2) { // from class: X.0Eer
                        public final Paint LIZ;
                        public final Path LIZIZ;

                        @Override // android.graphics.drawable.Drawable
                        @InterfaceC1294060jmO
                        public final int getOpacity() {
                            return -1;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i2) {
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                        }

                        {
                            Paint paint = new Paint();
                            paint.setStyle(Paint.Style.FILL);
                            paint.setColor(iIntValue2);
                            this.LIZ = paint;
                            this.LIZIZ = new Path();
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            float fWidth = getBounds().width();
                            float fHeight = getBounds().height();
                            Path path = this.LIZIZ;
                            path.reset();
                            if (fWidth > fHeight) {
                                float f = 2;
                                float f2 = fHeight / f;
                                path.moveTo(f2, fHeight);
                                float f3 = f * f2;
                                path.arcTo(0.0f, 0.0f, f3, fHeight, 90.0f, 180.0f, true);
                                path.lineTo(fWidth - f2, 0.0f);
                                path.arcTo(fWidth - f3, 0.0f, fWidth, fHeight, 270.0f, 180.0f, true);
                                path.lineTo(f2, fHeight);
                            } else {
                                float f4 = 2;
                                float f5 = fWidth / f4;
                                path.moveTo(0.0f, f5);
                                float f6 = f4 * f5;
                                path.arcTo(0.0f, 0.0f, fWidth, f6, 180.0f, 180.0f, true);
                                path.lineTo(fWidth, fHeight - f5);
                                path = path;
                                path.arcTo(0.0f, fHeight - f6, fWidth, fHeight, 0.0f, 180.0f, true);
                                path.lineTo(0.0f, f5);
                            }
                            path.close();
                            canvas.drawPath(this.LIZIZ, this.LIZ);
                        }
                    });
                    frameLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    TuxTextView tuxTextView = new TuxTextView(LJJIJL().getContext(), null, 6, 0);
                    tuxTextView.setTuxFont(62);
                    if (!IMOperateBtnColorAB.INSTANCE.isEnabled()) {
                        i = R.attr.a1k;
                    }
                    tuxTextView.setTextColorRes(i);
                    tuxTextView.setText(2131832170);
                    frameLayout.addView(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
                    ((ViewGroup) this.LLJLLL.getValue()).addView(frameLayout);
                    this.LLJZ = frameLayout;
                    view3 = frameLayout;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Bp(view3, c869590Y9l);
            TuxIconView tuxIconView2 = this.LLJZIJLIL;
            if (tuxIconView2 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, tuxIconView2);
            return;
        }
        C786410Ut5.LJZ(8, (FrameLayout) this.LLJLLL.getValue());
    }
}
