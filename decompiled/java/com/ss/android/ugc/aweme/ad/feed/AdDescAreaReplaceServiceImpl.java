package com.ss.android.ugc.aweme.ad.feed;

import X.C1022820ciu;
import X.C14EU;
import X.C21415018rM;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C722950SXl;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ALAdapterS4S0300000_11;
import Y.ARunnableS44S0300000_11;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import android.text.style.StyleSpan;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.DescAreaInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class AdDescAreaReplaceServiceImpl implements IAdDescAreaReplaceService {
    public boolean LIZ;
    public ARunnableS44S0300000_11 LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public C21415018rM LIZLLL;
    public Aweme LJ;
    public Bitmap LJFF;
    public Function0<Boolean> LJI;
    public Function1<? super Integer, Unit> LJII;
    public Aweme LJIIIIZZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService
    public final void LIZIZ() {
        Aweme aweme = this.LJIIIIZZ;
        if (aweme == null || !AwemeExtKt.isDescAreaReplaceAd(aweme)) {
            return;
        }
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        this.LJII = null;
        this.LJIIIIZZ = null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService
    public final void LIZJ() {
        Aweme aweme = this.LJ;
        if (aweme == null || !AwemeExtKt.isDescAreaReplaceAd(aweme)) {
            return;
        }
        if (this.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resetDescAreaReplace: clearing replaced state, awemeId=");
            Aweme aweme2 = this.LJ;
            sbLIZ.append(aweme2 != null ? aweme2.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ARunnableS44S0300000_11 aRunnableS44S0300000_11 = this.LIZIZ;
        if (aRunnableS44S0300000_11 != null) {
            this.LIZJ.removeCallbacks(aRunnableS44S0300000_11);
        }
        this.LIZIZ = null;
        this.LIZ = false;
        this.LJFF = null;
        this.LJI = null;
        C21415018rM c21415018rM = this.LIZLLL;
        if (c21415018rM != null) {
            C786410Ut5.A5(c21415018rM, 1.0f);
        }
        this.LIZLLL = null;
        this.LJ = null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService
    public final boolean LJ() {
        Aweme aweme;
        boolean z = false;
        if (this.LIZ && (aweme = this.LJ) != null && AwemeExtKt.isDescAreaReplaceAd(aweme)) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isDescAreaReplaced: ");
        sbLIZ.append(z);
        sbLIZ.append(" (state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", switchOn=");
        Aweme aweme2 = this.LJ;
        sbLIZ.append(aweme2 != null ? Boolean.valueOf(AwemeExtKt.isDescAreaReplaceAd(aweme2)) : null);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService
    public final CharSequence LIZ(Aweme aweme) {
        DescAreaInfo descAreaInfo;
        String str;
        Context context;
        if (!LJ()) {
            return null;
        }
        if ((aweme == null && (aweme = this.LJ) == null) || (descAreaInfo = AwemeExtKt.getDescAreaInfo(aweme)) == null || (str = descAreaInfo.desc) == null) {
            return null;
        }
        String str2 = descAreaInfo.prefix;
        C21415018rM c21415018rM = this.LIZLLL;
        if (c21415018rM == null || (context = c21415018rM.getContext()) == null) {
            return null;
        }
        float f = context.getResources().getDisplayMetrics().density;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Bitmap bitmap = this.LJFF;
        if (bitmap != null) {
            final int i = (int) (14 * f);
            final BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, i, i);
            spannableStringBuilder.append((CharSequence) "\u200b");
            C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(bitmapDrawable, i) { // from class: X.0GVP
                public final Drawable LL;
                public final int LLILLJJLI;

                {
                    this.LL = bitmapDrawable;
                    this.LLILLJJLI = i;
                }

                @Override // android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                    if (fontMetricsInt != null) {
                        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                        fontMetricsInt.ascent = fontMetricsInt2.ascent;
                        fontMetricsInt.top = fontMetricsInt2.top;
                        fontMetricsInt.descent = fontMetricsInt2.descent;
                        fontMetricsInt.bottom = fontMetricsInt2.bottom;
                    }
                    return this.LLILLJJLI;
                }

                @Override // android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
                    canvas.save();
                    canvas.translate(f2, ((i4 + i6) - this.LL.getBounds().height()) / 2.0f);
                    this.LL.draw(canvas);
                    canvas.restore();
                }
            }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\u200b");
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(iLIZIZ) { // from class: X.0GVJ
                public final int LL;

                @Override // android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
                }

                {
                    this.LL = iLIZIZ;
                }

                @Override // android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                    return this.LL;
                }
            }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        if (str2 != null && str2.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\u200b");
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(iLIZIZ2) { // from class: X.0GVJ
                public final int LL;

                @Override // android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
                }

                {
                    this.LL = iLIZIZ2;
                }

                @Override // android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                    return this.LL;
                }
            }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    public final void LJII(Function0<Unit> function0) {
        DescAreaInfo descAreaInfo;
        C21415018rM c21415018rM = this.LIZLLL;
        if (c21415018rM == null) {
            return;
        }
        Function0<Boolean> function02 = this.LJI;
        int iIntValue = 0;
        if (function02 != null && function02.invoke().booleanValue()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c21415018rM, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.addListener(new ALAdapterS4S0300000_11(this, function0, c21415018rM, 1));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            return;
        }
        Aweme aweme = this.LJ;
        if (aweme != null && (descAreaInfo = AwemeExtKt.getDescAreaInfo(aweme)) != null) {
            Integer num = descAreaInfo.jumpType;
            if (num != null) {
                iIntValue = num.intValue();
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("comment_des_show", "refer");
                c1022820ciuLIZLLL.LIZIZ("full_desc_expand", "show_fail_reason");
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(iIntValue), "jump_type");
                c1022820ciuLIZLLL.LJII();
            }
        }
        LIZJ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onOpenCommentPanelEvent(C722950SXl c722950SXl) {
        Long creativeId;
        int iIntValue;
        Integer num;
        Aweme aweme = this.LJIIIIZZ;
        if (aweme == null) {
            return;
        }
        Long l = c722950SXl.LIZ;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            creativeId = awemeRawAd.getCreativeId();
        } else {
            creativeId = null;
        }
        if (Intrinsics.LJFF(l, creativeId)) {
            DescAreaInfo descAreaInfo = AwemeExtKt.getDescAreaInfo(aweme);
            if (descAreaInfo != null && (num = descAreaInfo.jumpType) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            Function1<? super Integer, Unit> function1 = this.LJII;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService
    public final void LJFF(Aweme aweme, boolean z) {
        DescAreaInfo descAreaInfo;
        int iIntValue;
        String str;
        String str2;
        if ((aweme == null && (aweme = this.LJ) == null) || (descAreaInfo = AwemeExtKt.getDescAreaInfo(aweme)) == null) {
            return;
        }
        Integer num = descAreaInfo.jumpType;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (z) {
            str = "otherclick";
        } else {
            str = "othershow";
        }
        if (iIntValue == 2) {
            str2 = "title_to_reviews";
        } else {
            str2 = "title_to_comments";
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", str, awemeRawAd);
        c1022820ciuLIZLLL.LIZJ(str2, "refer");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService
    public final void LJI(Aweme aweme, AwS590S0100000_11 awS590S0100000_11) {
        if (aweme != null && AwemeExtKt.isDescAreaReplaceAd(aweme)) {
            this.LJII = awS590S0100000_11;
            this.LJIIIIZZ = aweme;
            if (!EventBus.LIZLLL().LJIIJ(this)) {
                EventBus.LIZLLL().LJIJJ(this);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService
    public final void LIZLLL(Aweme aweme, C21415018rM c21415018rM, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        boolean z;
        String aid;
        String str;
        Long l;
        if (aweme != null && AwemeExtKt.isDescAreaReplaceAd(aweme)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryStartDescAreaReplace: awemeId=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            return;
        }
        LIZJ();
        DescAreaInfo descAreaInfo = AwemeExtKt.getDescAreaInfo(aweme);
        if (descAreaInfo != null && (str = descAreaInfo.desc) != null && str.length() != 0 && (l = descAreaInfo.showTime) != null) {
            long jLongValue = l.longValue();
            if (jLongValue <= 0) {
                return;
            }
            this.LIZLLL = c21415018rM;
            this.LJ = aweme;
            this.LJI = awS555S0100000_11;
            ARunnableS44S0300000_11 aRunnableS44S0300000_11 = new ARunnableS44S0300000_11(awS555S0100000_112, this, descAreaInfo, 17);
            this.LIZIZ = aRunnableS44S0300000_11;
            C786410Ut5.LJLIIL(jLongValue, this.LIZJ, aRunnableS44S0300000_11);
        }
    }
}
