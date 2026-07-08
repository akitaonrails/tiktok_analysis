package kotlin.jvm.internal;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C09AY;
import X.C0FNW;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1602160rnK;
import X.C1619980sG4;
import X.C1919207fS;
import X.C19614411oc;
import X.C350870DpF;
import X.C351220Dpo;
import X.C390290FRz;
import X.C390690FTn;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentSubtitleSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AFwS288S0000000_5 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(18);
    public final int $t;

    public static AFwS288S0000000_5 get$arr$(int i) {
        AFwS288S0000000_5 aFwS288S0000000_5 = (AFwS288S0000000_5) arr$.get(i);
        if (aFwS288S0000000_5 != null) {
            return aFwS288S0000000_5;
        }
        arr$.compareAndSet(i, null, new AFwS288S0000000_5(i));
        return (AFwS288S0000000_5) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS288S0000000_5(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        Drawable drawableInvoke;
        String string;
        int iIntValue;
        Resources resources;
        String string2;
        TextView textView;
        int iIntValue2;
        Resources resources2;
        String string3;
        Resources resources3;
        C19614411oc c19614411oc = (C19614411oc) obj;
        C390690FTn c390690FTn = (C390690FTn) obj2;
        C0FNW.LIZ.getClass();
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19614411oc);
        c19614411oc.setLayoutParams(layoutParams);
        float f = c390690FTn.LJIJJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19614411oc);
        c19614411oc.setScaleY(f);
        float f2 = c390690FTn.LJIJJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19614411oc);
        c19614411oc.setScaleX(f2);
        if (c390690FTn.LJJ) {
            int visibility = c19614411oc.getVisibility();
            c19614411oc.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c19614411oc);
        }
        LinearLayout linearLayout = new LinearLayout(c19614411oc.getContext());
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(c390690FTn.LIZ, c390690FTn.LIZIZ));
        linearLayout.setId(R.id.bgg);
        Function0<Drawable> function0 = c390690FTn.LIZJ;
        if (function0 != null) {
            linearLayout.setBackground(function0.invoke());
        }
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setLayoutDirection(C426750GoL.LIZLLL(linearLayout.getContext()) ? 1 : 0);
        int iIntValue3 = 0;
        linearLayout.setOrientation(0);
        C426750GoL.LJIIL(linearLayout, Integer.valueOf(C1919207fS.LJIIJJI()), Integer.valueOf(C1919207fS.LJIIJJI()), Integer.valueOf(((Number) C1919207fS.LJIIJJI.getValue()).intValue()), Integer.valueOf(C1919207fS.LJIIJJI()), 16);
        FrameLayout frameLayout = new FrameLayout(c19614411oc.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C1919207fS.LJFF(), C1919207fS.LJFF());
        layoutParams2.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams2);
        Function0<Drawable> function02 = c390690FTn.LJ;
        AttributeSet attributeSet = null;
        if (function02 != null) {
            drawableInvoke = function02.invoke();
        } else {
            drawableInvoke = null;
        }
        frameLayout.setBackground(drawableInvoke);
        final Function0<Unit> function03 = c390690FTn.LJIIL;
        if (function03 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0FTp
                {
                    super(1000L);
                }

                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    if (view != null) {
                        function03.invoke();
                    }
                }
            }, frameLayout);
        }
        linearLayout.addView(frameLayout);
        TuxIconView tuxIconView = new TuxIconView(c19614411oc.getContext(), attributeSet, iIntValue3, 6, false ? 1 : 0);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(c390690FTn.LIZLLL.getFirst())), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(c390690FTn.LIZLLL.getSecond())));
        layoutParams3.gravity = 17;
        C786410Ut5.M6(tuxIconView, layoutParams3);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = c390690FTn.LJFF;
        Integer num = c390690FTn.LJI;
        if (num != null) {
            c419910GdJ.LIZLLL = num;
        } else {
            c419910GdJ.LJ = Integer.valueOf(c390690FTn.LJII);
        }
        tuxIconView.setTuxIcon(c419910GdJ);
        frameLayout.addView(tuxIconView);
        LinearLayout linearLayout2 = new LinearLayout(c19614411oc.getContext());
        C786410Ut5.d6(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        C426750GoL.LJIIIZ(linearLayout2, Integer.valueOf(C1919207fS.LJIIJJI()), null, null, null, false, 30);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(8388611);
        linearLayout2.setLayoutDirection(C426750GoL.LIZLLL(linearLayout2.getContext()) ? 1 : 0);
        linearLayout.addView(linearLayout2);
        int i = 6;
        TuxTextView tuxTextView = new TuxTextView(c19614411oc.getContext(), false ? 1 : 0, i, iIntValue3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        layoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        layoutParams4.gravity = 17;
        C786410Ut5.R6(tuxTextView, layoutParams4);
        Activity activityLIZ = C1388190mED.LIZ(tuxTextView.getContext());
        String str = "";
        if (activityLIZ == null || (resources3 = activityLIZ.getResources()) == null || (string = resources3.getString(c390690FTn.LJIIIZ)) == null) {
            string = "";
        }
        tuxTextView.setText(string);
        Integer num2 = c390690FTn.LJIILJJIL;
        if (num2 != null) {
            tuxTextView.setTextColor(num2.intValue());
        } else {
            tuxTextView.setTextColorRes(c390690FTn.LJIILL);
        }
        tuxTextView.setTuxFont(c390690FTn.LJIILLIIL);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)));
        layoutParams5.gravity = 17;
        C786410Ut5.R6(tuxTextView, layoutParams5);
        linearLayout2.addView(tuxTextView);
        if (c390690FTn.LJIL) {
            Context context = c19614411oc.getContext();
            C390290FRz c390290FRz = new C390290FRz(context);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(144)), -2);
            layoutParams6.setMarginStart(C1919207fS.LIZIZ());
            layoutParams6.setMarginEnd(C1919207fS.LIZIZ());
            layoutParams6.topMargin = C1919207fS.LIZ();
            layoutParams6.gravity = 17;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c390290FRz);
            c390290FRz.setLayoutParams(layoutParams6);
            c390290FRz.setId(R.id.bgk);
            Activity activityLIZ2 = C1388190mED.LIZ(context);
            if (activityLIZ2 != null && (resources2 = activityLIZ2.getResources()) != null && (string3 = resources2.getString(c390690FTn.LJIIJ)) != null) {
                str = string3;
            }
            c390290FRz.setHint(str);
            c390290FRz.setGravity(17);
            c390290FRz.setFocusable(false);
            c390290FRz.setFocusableInTouchMode(false);
            String str2 = c390690FTn.LJIIJJI;
            if (str2 != null) {
                c390290FRz.setText(str2);
            }
            c390290FRz.setTuxFont(52);
            Integer numLIZJ = C1308910kAL.LIZJ(c390690FTn.LJIJ, context);
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            c390290FRz.setTextColor(iIntValue2);
            Integer numLIZJ2 = C1308910kAL.LIZJ(c390690FTn.LJIIZILJ, context);
            if (numLIZJ2 != null) {
                iIntValue3 = numLIZJ2.intValue();
            }
            c390290FRz.setHintTextColor(iIntValue3);
            textView = c390290FRz;
            if (c390690FTn.LJIJJLI) {
                c390290FRz.LLJ = true;
                textView = c390290FRz;
            }
        } else {
            Context context2 = c19614411oc.getContext();
            TuxTextView tuxTextView2 = new TuxTextView(context2, false ? 1 : 0, i, iIntValue3);
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(144)), -2);
            layoutParams7.setMarginStart(C1919207fS.LIZIZ());
            layoutParams7.setMarginEnd(C1919207fS.LIZIZ());
            layoutParams7.topMargin = C1919207fS.LIZ();
            layoutParams7.gravity = 17;
            C786410Ut5.R6(tuxTextView2, layoutParams7);
            tuxTextView2.setId(R.id.bgk);
            Activity activityLIZ3 = C1388190mED.LIZ(context2);
            if (activityLIZ3 != null && (resources = activityLIZ3.getResources()) != null && (string2 = resources.getString(c390690FTn.LJIIJ)) != null) {
                str = string2;
            }
            tuxTextView2.setHint(str);
            tuxTextView2.setGravity(17);
            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView2.setMaxLines(3);
            tuxTextView2.setFocusable(false);
            tuxTextView2.setFocusableInTouchMode(false);
            String str3 = c390690FTn.LJIIJJI;
            if (str3 != null) {
                tuxTextView2.setText(str3);
            }
            tuxTextView2.setTuxFont(52);
            Integer numLIZJ3 = C1308910kAL.LIZJ(c390690FTn.LJIJ, context2);
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            } else {
                iIntValue = 0;
            }
            tuxTextView2.setTextColor(iIntValue);
            Integer numLIZJ4 = C1308910kAL.LIZJ(c390690FTn.LJIIZILJ, context2);
            if (numLIZJ4 != null) {
                iIntValue3 = numLIZJ4.intValue();
            }
            tuxTextView2.setHintTextColor(iIntValue3);
            textView = tuxTextView2;
            if (C426750GoL.LIZLLL(context2)) {
                tuxTextView2.setTextDirection(1);
                tuxTextView2.setLayoutDirection(1);
                textView = tuxTextView2;
            }
        }
        C786410Ut5.W5(textView, new FrameLayout.LayoutParams(-2, ((Number) C1919207fS.LJIIJ.getValue()).intValue()));
        textView.setGravity(8388627);
        textView.setSingleLine(true);
        textView.setTextAlignment(16);
        linearLayout2.addView(textView);
        c19614411oc.addView(linearLayout);
        if (c390690FTn.LJJ) {
            C786410Ut5.W4(linearLayout, 0.6f);
            C0FNW.LIZ(c19614411oc, linearLayout, c390690FTn.LJIILIIL);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        ((Number) obj2).floatValue();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        return Boolean.valueOf(C351220Dpo.LLILLL((NLETrack) obj));
    }

    public static final Object invoke$11(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        NLESegment mainSegment;
        boolean z;
        NLEResourceNode effectSDKFile;
        NLETrack nLETrack = (NLETrack) obj;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj2;
        NLEResType resourceType = null;
        if (nLETrackSlot != null) {
            mainSegment = nLETrackSlot.getMainSegment();
        } else {
            mainSegment = null;
        }
        NLESegmentSubtitleSticker nLESegmentSubtitleStickerDynamicCast = NLESegmentSubtitleSticker.dynamicCast((NLENode) mainSegment);
        if (nLESegmentSubtitleStickerDynamicCast != null && (effectSDKFile = nLESegmentSubtitleStickerDynamicCast.getEffectSDKFile()) != null) {
            resourceType = effectSDKFile.getResourceType();
        }
        if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.STICKER && (resourceType == NLEResType.SUBTITLE_STICKER || resourceType == NLEResType.AUTOSUBTITLE_STICKER)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AFwS288S0000000_5 r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS288S0000000_5.invoke$12(kotlin.jvm.internal.AFwS288S0000000_5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$13(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        float f;
        float f2 = 0.0f;
        if (((Boolean) obj2).booleanValue()) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(obj, "alpha", f, f2).setDuration(200L);
        duration.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        return animatorSet;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$14(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$15(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        AnimatorSet animatorSet = new AnimatorSet();
        if (zBooleanValue) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            animatorSet.playTogether(objectAnimatorOfFloat);
            return animatorSet;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(Mp4ScreenVideoLoadTimeout.CONTROL);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIIZ());
        animatorSet.playTogether(objectAnimatorOfFloat2);
        return animatorSet;
    }

    public static final Object invoke$17(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        float f;
        float f2 = 0.0f;
        if (((Boolean) obj2).booleanValue()) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(obj, "alpha", f, f2).setDuration(200L);
        duration.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        return animatorSet;
    }

    public static final Object invoke$2(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        NLESegment mainSegment;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj2;
        if (nLETrackSlot != null) {
            mainSegment = nLETrackSlot.getMainSegment();
        } else {
            mainSegment = null;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
        boolean z = false;
        if (nLESegmentVideoDynamicCast != null && (nLESegmentVideoDynamicCast.getCrop() != null || nLESegmentVideoDynamicCast.getClip() != null)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj2;
        boolean z = false;
        if (nLETrackSlot != null && nLETrackSlot.getAIMatting() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AFwS288S0000000_5 r0, java.lang.Object r1, java.lang.Object r2) {
        /*
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r2 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r2
            if (r2 == 0) goto L10
            boolean r1 = X.C351220Dpo.LLD(r2)
            r0 = 1
            if (r1 != r0) goto L10
        Lb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L10:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS288S0000000_5.invoke$4(kotlin.jvm.internal.AFwS288S0000000_5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        VecNLEChromaChannelSPtr chromaChannels;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj2;
        if (nLETrackSlot != null && (chromaChannels = nLETrackSlot.getChromaChannels()) != null) {
            return Boolean.valueOf(!chromaChannels.isEmpty());
        }
        return null;
    }

    public static final Object invoke$6(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        VecNLEMaskSPtr masks;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj2;
        if (nLETrackSlot != null && (masks = nLETrackSlot.getMasks()) != null) {
            return Boolean.valueOf(!masks.isEmpty());
        }
        return null;
    }

    public static final Object invoke$7(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        boolean z;
        boolean z2;
        NLETrack nLETrack = (NLETrack) obj;
        boolean z3 = true;
        if (nLETrack.getTrackType() == NLETrackType.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        String extra = nLETrack.getExtra("AudioTrackType");
        if (!Intrinsics.LJFF(extra, "AUDIO_RECORD") && !Intrinsics.LJFF(extra, "DUB")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    public static final Object invoke$8(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        boolean z;
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO && !nLETrack.getMainTrack()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(AFwS288S0000000_5 aFwS288S0000000_5, Object obj, Object obj2) {
        boolean z;
        NLESegment mainSegment;
        boolean z2;
        NLETrack nLETrack = (NLETrack) obj;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj2;
        boolean z3 = false;
        if (!nLETrack.getMainTrack() && !Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN") && !Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "REVERSE_AUDIO")) {
            z = false;
        } else {
            z = true;
        }
        if (nLETrackSlot != null) {
            mainSegment = nLETrackSlot.getMainSegment();
        } else {
            mainSegment = null;
        }
        if (NLESegmentAudio.dynamicCast(mainSegment) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
