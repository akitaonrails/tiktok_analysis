package com.ss.android.ugc.aweme.socialavatar.mixstudio.keva;

import X.AbstractC440540HPg;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C05YD;
import X.C09IC;
import X.C0C64;
import X.C0H6Q;
import X.C0HSG;
import X.C0HSY;
import X.C0HSZ;
import X.C0ID9;
import X.C0XQ7;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13BV;
import X.C1644806cI;
import X.C1908480zlO;
import X.C1910890zpH;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C428740GrY;
import X.C440560HPi;
import X.C440830HQj;
import X.C441120HRm;
import X.C441130HRn;
import X.C441260HSa;
import X.C441280HSc;
import X.C452501pT;
import X.C463030IDt;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1338240kve;
import X.InterfaceC441310HSf;
import X.InterfaceC443750Haf;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioEntranceControlImpl implements MixStudioEntranceControl {
    public static final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public static final int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public static final float LJII = 0.9444444f;
    public static final float LJIIIIZZ = 0.5277778f;
    public static final float LJIIIZ = -12.0f;
    public static final String LJIIJ = "excited";
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(671));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(670));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(278));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(279));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(277));

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final boolean LIZ() {
        C0HSG.LIZ.getClass();
        return (C0HSG.LIZIZ().getBoolean("typing_box_check_clicked", false) ^ true) && !C0HSG.LIZIZ().getBoolean("result_reviewed", false);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final void LIZIZ() {
        C0HSG.LIZ.getClass();
        Keva kevaLIZIZ = C0HSG.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sticker_panel_entrance_clicked_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLIZIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        C0HSG.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).setValue(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final void LIZLLL() {
        C0HSG.LIZ.getClass();
        C0HSG.LIZIZ().storeInt("typing_box_flip_consecutive_shown_times", C0HSG.LIZIZ().getInt("typing_box_flip_consecutive_shown_times", 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final void LJ() {
        C0HSG.LIZ.getClass();
        C0HSG.LIZIZ().storeBoolean("typing_box_check_clicked", true);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final LiveData<String> LJFF() {
        return Transformations.map(Transformations.distinctUntilChanged(IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIJ(null, null)), AFwS236S0000000_6.get$arr$(324));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final C05YD<Boolean> LJI() {
        C0HSG.LIZ.getClass();
        return C09IC.LIZIZ(C0HSG.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final boolean LJIIIZ() {
        C0HSG.LIZ.getClass();
        boolean z = !C0HSG.LIZIZ().getBoolean("imagine_studio_sticker_tab_red_dot", false);
        if (z) {
            C0HSG.LIZIZ().storeBoolean("imagine_studio_sticker_tab_red_dot", true);
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final void LJIIJ() {
        C0HSG.LIZ.getClass();
        C0HSG.LIZIZ().storeInt("typing_box_flip_clicked_times", C0HSG.LIZIZ().getInt("typing_box_flip_clicked_times", 0) + 1);
        C0HSG.LIZIZ().storeLong("typing_box_flip_clicked_timestamp", System.currentTimeMillis());
        C0HSG.LIZIZ().storeInt("typing_box_flip_consecutive_shown_times", 0);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final boolean LJIIJJI() {
        return C441280HSc.LIZ() && C1644806cI.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final String LJIILIIL() {
        return LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final boolean LIZJ(boolean z) {
        int iIntValue;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "imagine_studio_mvp", false) != 1 || !C1644806cI.LIZJ()) {
            return false;
        }
        C0HSG.LIZ.getClass();
        int i = C0HSG.LIZIZ().getInt("typing_box_flip_clicked_times", 0);
        int i2 = C0HSG.LIZIZ().getInt("typing_box_flip_consecutive_shown_times", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C0HSG.LIZIZ().getLong("typing_box_flip_clicked_timestamp", jCurrentTimeMillis);
        if (z) {
            if (i2 >= C0HSG.LIZJ) {
                return false;
            }
        } else {
            if (i >= 3) {
                return false;
            }
            long j2 = jCurrentTimeMillis - j;
            TimeUnit timeUnit = TimeUnit.DAYS;
            Integer num = C0HSG.LIZIZ.get(Integer.valueOf(i));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (j2 < timeUnit.toMillis(iIntValue)) {
                return false;
            }
        }
        if (C0H6Q.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final C0HSZ LJII(int i) {
        AbstractC440540HPg value;
        List<C440830HQj> value2;
        boolean z;
        C05YD<List<C440830HQj>> c05ydLJFF;
        C05YD<AbstractC440540HPg> taskStatus;
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LIZLLL.getValue();
        if (mixStudioStatusRepository != null && (taskStatus = mixStudioStatusRepository.getTaskStatus()) != null) {
            value = taskStatus.getValue();
        } else {
            value = null;
        }
        MixStudioStatusRepository mixStudioStatusRepository2 = (MixStudioStatusRepository) this.LIZLLL.getValue();
        if (mixStudioStatusRepository2 == null || (c05ydLJFF = mixStudioStatusRepository2.LJFF()) == null || (value2 = c05ydLJFF.getValue()) == null) {
            value2 = C13BV.INSTANCE;
        }
        C1910890zpH c1910890zpH = (C1910890zpH) this.LIZJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getEntranceStyle ");
        sbLIZ.append(value);
        sbLIZ.append(", ");
        sbLIZ.append(value2);
        c1910890zpH.LIZ("MixStudioEntranceControl", C2188811AlT.LIZIZ(sbLIZ));
        if (((value instanceof C441120HRm) && ((C441120HRm) value).LIZJ == i) || (((z = value instanceof C441130HRn)) && ((C441130HRn) value).LIZ == i && value2.isEmpty())) {
            return C0HSZ.GENERATING;
        }
        if (z && (!value2.isEmpty()) && ((C441130HRn) value).LIZ == i) {
            return C0HSZ.READY_TO_REVIEW;
        }
        if (value != null && C440560HPi.LIZ(value)) {
            return C0HSZ.ERROR;
        }
        C0HSG.LIZ.getClass();
        if (((Boolean) C09IC.LIZIZ(C0HSG.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())).getValue()).booleanValue()) {
            return C0HSZ.NEW;
        }
        return C0HSZ.IDLE;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final View LJIIIIZZ(Context context) {
        SmartImageView smartImageView;
        FrameLayout frameLayout = new FrameLayout(context);
        int i = LJFF;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        frameLayout.setBackground(c384050F3z.LIZ(context));
        String value = LJFF().getValue();
        if (value != null) {
            smartImageView = new SmartImageView(context);
            int i2 = LJI;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            layoutParams2.gravity = 8388627;
            C786410Ut5.G6(smartImageView, layoutParams2);
            C426750GoL.LJIIIZ(smartImageView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, null, false, 30);
            C426750GoL.LJIIL(smartImageView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), null, null, 29);
            C786410Ut5.Eb(smartImageView, LJIIIZ);
            LJIIZILJ(this, UriProtector.parse(value), smartImageView);
            smartImageView.setBackgroundColor(C960203pA.LIZ(R.attr.ee, context));
            smartImageView.setElevation(1.0f);
            smartImageView.setClipToOutline(true);
            smartImageView.setOutlineProvider(new C0ID9(22));
        } else {
            smartImageView = new SmartImageView(context);
            C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(i, i));
            LJIIZILJ(this, UriProtector.parse(MixStudioSettings.INSTANCE.typingBoxNoSAIcon()), smartImageView);
        }
        frameLayout.addView(smartImageView);
        SmartImageView smartImageView2 = new SmartImageView(context);
        C786410Ut5.G6(smartImageView2, new FrameLayout.LayoutParams(i, i));
        LJIIZILJ(this, UriProtector.parse(MixStudioSettings.INSTANCE.typingBoxAddCard()), smartImageView2);
        smartImageView2.setElevation(3.0f);
        frameLayout.addView(smartImageView2);
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0HSb] */
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final void LJIILJJIL(final Context context) {
        ((C1910890zpH) this.LIZJ.getValue()).LIZ("MixStudioEntranceControl", "register inapp push handler");
        C0HSY c0hsy = new C0HSY(new InterfaceC441310HSf() { // from class: X.0HSb
            @Override // X.InterfaceC441310HSf
            public final void onClick(String str) {
                SmartRouter.buildRoute(context, str).open();
            }
        });
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        c1908480zlO.LJ(c0hsy);
        c1908480zlO.LJIILL(c0hsy, c0hsy.LLILLL);
    }

    public final String LJIILL(int i) {
        C2252321DDq c2252321DDqLJIILIIL;
        if (i == 1) {
            InterfaceC443750Haf interfaceC443750Haf = (InterfaceC443750Haf) this.LJ.getValue();
            if (interfaceC443750Haf != null && (c2252321DDqLJIILIIL = interfaceC443750Haf.LJIILIIL()) != null) {
                return (String) c2252321DDqLJIILIIL.getValue();
            }
            return null;
        }
        return LJFF().getValue();
    }

    public static void LJIIZILJ(MixStudioEntranceControlImpl mixStudioEntranceControlImpl, Uri uri, SmartImageView smartImageView) {
        mixStudioEntranceControlImpl.getClass();
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
        c1331670kl3LJI.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJI.LJJ(smartImageView);
        c1331670kl3LJI.LJIIJ(new C463030IDt(2));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl
    public final View LJIIL(Context context, int i, int i2) {
        boolean z;
        List<C440830HQj> value;
        C440830HQj c440830HQj;
        StickerItem stickerItem;
        StickerBase stickerBase;
        StickerImage stickerImage;
        List<String> list;
        String str;
        StickerItem stickerItem2;
        StickerBase stickerBase2;
        StickerImage stickerImage2;
        List<String> list2;
        String str2;
        C05YD<List<C440830HQj>> c05ydLJFF;
        C0HSZ c0hszLJII = LJII(i);
        float f = i2;
        int i3 = (int) (LJII * f);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams);
        int iIntValue = 0;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        int i4 = C441260HSa.LIZ[c0hszLJII.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    if (i4 == 5) {
                        LJIILLIIL(context, frameLayout, false, i2, i);
                        int iFloatValue = (int) (((Number) this.LIZ.getValue()).floatValue() * f);
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zs, context);
                        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                        frameLayout2.setBackground(c384050F3z.LIZ(context));
                        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                        tuxIconView.setIconRes(R.raw.icon_exclamation_mark_fill);
                        tuxIconView.setTintColorRes(R.attr.ee);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                        layoutParams2.gravity = 17;
                        C786410Ut5.M6(tuxIconView, layoutParams2);
                        frameLayout2.addView(tuxIconView);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iFloatValue, iFloatValue, 8388661);
                        layoutParams3.setMarginEnd((int) (((Number) this.LIZIZ.getValue()).floatValue() * f));
                        frameLayout.addView(frameLayout2, layoutParams3);
                        return frameLayout;
                    }
                    throw new C1954807lC();
                }
                MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LIZLLL.getValue();
                if (mixStudioStatusRepository != null && (c05ydLJFF = mixStudioStatusRepository.LJFF()) != null) {
                    value = c05ydLJFF.getValue();
                } else {
                    value = null;
                }
                FrameLayout frameLayout3 = new FrameLayout(context);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i3, i3);
                layoutParams4.gravity = 17;
                C786410Ut5.a6(frameLayout3, layoutParams4);
                frameLayout3.setClipChildren(false);
                frameLayout3.setClipToPadding(false);
                if (value != null) {
                    if (value.size() >= 2) {
                        if (value != null) {
                            C440830HQj c440830HQj2 = (C440830HQj) ListProtector.get(value, 1);
                            if (c440830HQj2 != null && (stickerItem2 = c440830HQj2.LIZ) != null && (stickerBase2 = stickerItem2.stickerBase) != null && (stickerImage2 = stickerBase2.image) != null && (list2 = stickerImage2.urlList) != null && (str2 = (String) ListProtector.get(list2, 0)) != null) {
                                int i5 = (int) (0.06944445f * f);
                                SmartImageView smartImageViewLJIJ = LJIJ(i2, context, UriProtector.parse(str2));
                                C786410Ut5.Ab(smartImageViewLJIJ, -7.0f);
                                smartImageViewLJIJ.setElevation(2.0f);
                                C426750GoL.LJIIIZ(smartImageViewLJIJ, null, null, Integer.valueOf(i5), Integer.valueOf(i5), false, 19);
                                frameLayout3.addView(smartImageViewLJIJ);
                            }
                            if (value.size() >= 1 && value != null && (c440830HQj = (C440830HQj) ListProtector.get(value, 0)) != null && (stickerItem = c440830HQj.LIZ) != null && (stickerBase = stickerItem.stickerBase) != null && (stickerImage = stickerBase.image) != null && (list = stickerImage.urlList) != null && (str = (String) ListProtector.get(list, 0)) != null) {
                                SmartImageView smartImageViewLJIJ2 = LJIJ(i2, context, UriProtector.parse(str));
                                C786410Ut5.Ab(smartImageViewLJIJ2, 3.0f);
                                smartImageViewLJIJ2.setElevation(3.0f);
                                frameLayout3.addView(smartImageViewLJIJ2);
                            }
                        }
                    } else if (value != null) {
                        if (value.size() >= 1) {
                            SmartImageView smartImageViewLJIJ22 = LJIJ(i2, context, UriProtector.parse(str));
                            C786410Ut5.Ab(smartImageViewLJIJ22, 3.0f);
                            smartImageViewLJIJ22.setElevation(3.0f);
                            frameLayout3.addView(smartImageViewLJIJ22);
                        }
                    }
                }
                frameLayout.addView(frameLayout3);
                FrameLayout frameLayout4 = new FrameLayout(context);
                int iFloatValue2 = (int) (((Number) this.LIZ.getValue()).floatValue() * f);
                frameLayout4.setBackground(C428740GrY.LIZ(iFloatValue2 / 2.0f, context));
                TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
                tuxIconView2.setIconRes(R.raw.icon_tick_tiny_fill);
                tuxIconView2.setTintColorRes(R.attr.c95);
                frameLayout4.addView(tuxIconView2, new FrameLayout.LayoutParams(iFloatValue2, iFloatValue2, 17));
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iFloatValue2, iFloatValue2, 8388661);
                layoutParams5.setMarginEnd((int) (((Number) this.LIZIZ.getValue()).floatValue() * f));
                frameLayout.addView(frameLayout4, layoutParams5);
                return frameLayout;
            }
            C1295960jpS c1295960jpS = new C1295960jpS(context);
            C786410Ut5.s6(c1295960jpS, new FrameLayout.LayoutParams(-1, -1));
            c1295960jpS.setAnimationFromUrl(MixStudioSettings.INSTANCE.saPanelGeneratingBackground());
            c1295960jpS.playAnimation();
            frameLayout.addView(c1295960jpS);
            SmartImageView smartImageView = new SmartImageView(context);
            String strLJIILL = LJIILL(i);
            if (strLJIILL != null) {
                LJIIZILJ(this, UriProtector.parse(strLJIILL), smartImageView);
            }
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) (0.6944444f * f), (int) (0.8333333f * f));
            layoutParams6.gravity = 17;
            C786410Ut5.G6(smartImageView, layoutParams6);
            PathInterpolator pathInterpolator = new PathInterpolator(0.45f, 0.0f, 0.55f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smartImageView, "scaleX", 0.95f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(pathInterpolator);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(2);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(smartImageView, "scaleY", 0.95f, 1.0f);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setRepeatMode(2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(smartImageView, "rotation", -5.0f, 7.0f, -5.0f);
            objectAnimatorOfFloat3.setDuration(2500L);
            objectAnimatorOfFloat3.setInterpolator(pathInterpolator);
            objectAnimatorOfFloat3.setRepeatCount(-1);
            objectAnimatorOfFloat3.setRepeatMode(2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.start();
            frameLayout.addView(smartImageView);
            FrameLayout frameLayout5 = new FrameLayout(context);
            int iFloatValue3 = (int) (((Number) this.LIZ.getValue()).floatValue() * f);
            frameLayout5.setBackground(C428740GrY.LIZ(iFloatValue3 / 2.0f, context));
            TuxSpinner tuxSpinner = new TuxSpinner(context, null, 6, 0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxSpinner.LIZ(R.raw.icon_spinner_normal, iIntValue);
            int i6 = (int) (0.19444445f * f);
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(i6, i6);
            layoutParams7.gravity = 17;
            C786410Ut5.X6(tuxSpinner, layoutParams7);
            frameLayout5.addView(tuxSpinner);
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(iFloatValue3, iFloatValue3, 8388661);
            layoutParams8.setMarginEnd((int) (((Number) this.LIZIZ.getValue()).floatValue() * f));
            frameLayout.addView(frameLayout5, layoutParams8);
            return frameLayout;
        }
        if (c0hszLJII == C0HSZ.NEW) {
            z = true;
        } else {
            z = false;
        }
        LJIILLIIL(context, frameLayout, z, i2, i);
        return frameLayout;
    }

    public final SmartImageView LJIJ(int i, Context context, Uri uri) {
        SmartImageView smartImageView = new SmartImageView(context);
        LJIIZILJ(this, uri, smartImageView);
        smartImageView.setClipToOutline(true);
        smartImageView.setBackgroundColor(C960203pA.LIZ(R.attr.ee, context));
        C426750GoL.LJIIL(smartImageView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, 29);
        int i2 = (int) (i * 0.6111111f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        C786410Ut5.G6(smartImageView, layoutParams);
        smartImageView.setOutlineProvider(new C0ID9(23));
        return smartImageView;
    }

    public final void LJIILLIIL(Context context, FrameLayout frameLayout, boolean z, int i, int i2) {
        SmartImageView smartImageView = new SmartImageView(context);
        float f = i;
        int i3 = (int) (LJIIIIZZ * f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 8388659;
        C786410Ut5.G6(smartImageView, layoutParams);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_person_fill;
        c419910GdJ.LIZLLL = -855310;
        smartImageView.setPlaceholderImage(c419910GdJ.LIZ(context));
        C786410Ut5.Eb(smartImageView, LJIIIZ);
        C426750GoL.LJIIIZ(smartImageView, Integer.valueOf((int) (0.06944445f * f)), Integer.valueOf((int) (0.15277778f * f)), null, null, false, 28);
        C426750GoL.LJIIL(smartImageView, null, Integer.valueOf((int) (0.027777778f * f)), null, null, 29);
        String strLJIILL = LJIILL(i2);
        if (strLJIILL != null) {
            LJIIZILJ(this, UriProtector.parse(strLJIILL), smartImageView);
        }
        smartImageView.setBackgroundColor(C960203pA.LIZ(R.attr.ee, context));
        smartImageView.setElevation(3.0f);
        smartImageView.setClipToOutline(true);
        smartImageView.setOutlineProvider(new C0ID9(8));
        frameLayout.addView(smartImageView);
        SmartImageView smartImageView2 = new SmartImageView(context);
        LJIIZILJ(this, UriProtector.parse(MixStudioSettings.INSTANCE.typingBoxAddCard()), smartImageView2);
        C786410Ut5.G6(smartImageView2, new FrameLayout.LayoutParams(-1, -1));
        smartImageView2.setElevation(4.0f);
        frameLayout.addView(smartImageView2);
        if (z) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            int i4 = (int) (0.4722222f * f);
            int i5 = (int) (f * 0.22222222f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, i5);
            layoutParams2.gravity = 8388661;
            layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4)));
            C786410Ut5.R6(tuxTextView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(C960203pA.LIZ(R.attr.a04, context));
            gradientDrawable.setCornerRadius(i5);
            tuxTextView.setBackground(gradientDrawable);
            tuxTextView.setTextColorRes(R.attr.ee);
            tuxTextView.setText(2131837987);
            tuxTextView.setTuxFont(92);
            tuxTextView.setGravity(17);
            frameLayout.addView(tuxTextView);
        }
    }
}
