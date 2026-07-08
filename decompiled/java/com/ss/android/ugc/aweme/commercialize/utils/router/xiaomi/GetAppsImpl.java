package com.ss.android.ugc.aweme.commercialize.utils.router.xiaomi;

import X.C098200Yq;
import X.C09FT;
import X.C1017160cZm;
import X.C1021940chU;
import X.C1046320dKo;
import X.C189200o6;
import X.C21627319kV;
import X.C418440Gaw;
import X.C419890GdH;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import Y.ARunnableS85S0200000_16;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import android.view.ContextThemeWrapper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.api.IGetApps;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.MiniCardModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public final class GetAppsImpl implements IGetApps {
    @Override // com.ss.android.ugc.aweme.api.IGetApps
    public final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String xiaomiSupplementalInfo;
        MiniCardModel miniCardModel;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (xiaomiSupplementalInfo = awemeRawAd.getXiaomiSupplementalInfo()) == null || xiaomiSupplementalInfo.length() == 0) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (miniCardModel = awemeRawAd2.getMiniCardModel()) != null && miniCardModel.getDeviceEffectScopeType() == 1) {
            return C1021940chU.LIZIZ;
        }
        return C1021940chU.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0chh] */
    @Override // com.ss.android.ugc.aweme.api.IGetApps
    public final void LIZLLL(final Context context) {
        final C1021940chU c1021940chU = C1021940chU.LIZ;
        if (context != null) {
            try {
                final ?? r1 = new C09FT() { // from class: X.0chh
                    @Override // X.C09FT
                    public final void LIZ(Bundle bundle) {
                        if (bundle != null) {
                            C0CAU.LIZIZ(new ARunnableS85S0200000_16(c1021940chU, bundle, 34));
                        }
                    }
                };
                new Runnable(context, r1) { // from class: X.09FS
                    public final WeakReference<Context> LL;
                    public final WeakReference<C09FT> LLILLJJLI;

                    public final void LIZ() {
                        Object c098200Yq;
                        try {
                            Context context2 = this.LL.get();
                            if (context2 == null) {
                                return;
                            }
                            ContentResolver contentResolver = context2.getContentResolver();
                            Uri uri = UriProtector.parse("content://com.xiaomi.discover.external");
                            Bundle bundle = new Bundle();
                            C844470XAv.LIZ.getClass();
                            C786410Ut5.LJJJI("callerPackage", C844470XAv.LIZ().getPackageName(), bundle);
                            c098200Yq = null;
                            Bundle bundleLJJIJL = C2204961BRm.LJJIJL(contentResolver, uri, "miniCardEnable", null, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOA8orfBpL+IwOLg6xTUzGfG3mNWXD7Np+sytYQaWwzEYdnjqN", null));
                            C09FT c09ft = this.LLILLJJLI.get();
                            if (c09ft != null) {
                                c09ft.LIZ(bundleLJJIJL);
                                c098200Yq = Unit.LIZ;
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("QueryMarketAbilityTask@61f7.run");
                        try {
                            try {
                                LIZ();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C09FT c09ft = this.LLILLJJLI.get();
                                if (c09ft != null) {
                                    c09ft.LIZ(null);
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("QueryMarketAbilityTask@61f7.run");
                    }

                    {
                        this.LL = new WeakReference<>(context);
                        this.LLILLJJLI = new WeakReference<>(r1);
                    }
                }.run();
                c1021940chU.getClass();
                C189200o6.m2constructorimpl(Boolean.valueOf(C1021940chU.LIZ(context)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IGetApps
    public final void LJ(Context context, Aweme aweme) {
        C1046320dKo.LIZ.getClass();
        C1046320dKo.LIZ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.api.IGetApps
    public final SpannableStringBuilder LIZIZ(final Context context, Aweme aweme, CharSequence charSequence) {
        boolean z;
        String xiaomiSupplementalInfo;
        if (aweme == null || !LIZJ(aweme) || context == null) {
            return null;
        }
        final boolean z2 = true;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = !z;
        final String str = "";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (z3) {
            spannableStringBuilder.append((CharSequence) "[divider]");
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.bif);
            if (drawableLIZIZ != null) {
                drawableLIZIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
            C786410Ut5.q2(spannableStringBuilder, new C419890GdH(drawableLIZIZ, 2), 0, 9, 33);
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "[xiaomi_card]");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (xiaomiSupplementalInfo = awemeRawAd.getXiaomiSupplementalInfo()) != null) {
            str = xiaomiSupplementalInfo;
        }
        if (!C444960Hcc.LIZJ(context) && !C21627319kV.LIZJ().LIZLLL(aweme.getDesc())) {
            z2 = false;
        }
        C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(context, str, z2) { // from class: X.0GXF
            public final String LL;
            public final boolean LLILLJJLI;
            public int LLILLL;
            public final TuxIconDrawable LLILZ;
            public final Rect LLILZIL;
            public final Paint.FontMetricsInt LLILZLL;

            public final int LIZ(Paint paint) {
                this.LLILZIL.setEmpty();
                String str2 = this.LL;
                paint.getTextBounds(str2, 0, str2.length(), this.LLILZIL);
                this.LLILLL = this.LLILZIL.width();
                return this.LLILZIL.width() + this.LLILZ.LIZJ() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            }

            {
                this.LL = str;
                this.LLILLJJLI = z2;
                Paint paint = new Paint();
                this.LLILZIL = new Rect();
                paint.setTextSize((13.0f * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, new ContextThemeWrapper(context, R.style.y0));
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_right_fill_ltr;
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZLLL = numLIZJ;
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
                this.LLILZ = tuxIconDrawableLIZ;
                this.LLILZLL = new Paint.FontMetricsInt();
            }

            @Override // android.text.style.ReplacementSpan
            public final int getSize(Paint paint, CharSequence charSequence2, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return LIZ(paint);
            }

            @Override // android.text.style.ReplacementSpan
            public final void draw(Canvas canvas, CharSequence charSequence2, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                float fLIZJ;
                if (this.LLILLL == 0) {
                    LIZ(paint);
                }
                int i6 = this.LLILLL;
                if (this.LLILLJJLI) {
                    f += this.LLILZ.LIZJ();
                }
                canvas.drawText(this.LL, f, i4, paint);
                int iSave = canvas.save();
                try {
                    paint.getFontMetricsInt(this.LLILZLL);
                    int iLIZIZ = ((i5 + i3) - this.LLILZ.LIZIZ()) / 2;
                    if (this.LLILLJJLI) {
                        fLIZJ = f - this.LLILZ.LIZJ();
                    } else {
                        fLIZJ = f + i6;
                    }
                    canvas.translate(fLIZJ, iLIZIZ);
                    this.LLILZ.draw(canvas);
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        }, length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.ss.android.ugc.aweme.api.IGetApps
    public final void LIZ(Aweme aweme, Map map, String str, String str2) {
        C1017160cZm.LIZ(aweme, map, str, false);
    }
}
