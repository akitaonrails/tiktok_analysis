package com.ss.android.ugc.aweme.tako.botpage.components.videogeneration;

import X.AbstractC19994813Le;
import X.C03IT;
import X.C0DSB;
import X.C0ID9;
import X.C1004300cF2;
import X.C1153150g77;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13LP;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1004280cF0;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS21S1100000_16;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoGenCard;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class TakoVideoGenProgressAssem extends ReusedUISlotAssem<TakoVideoGenProgressAssem> implements InterfaceC712990Rxx<InterfaceC1004280cF0> {
    public static final Map<String, Integer> LLL = new LinkedHashMap();
    public static final Map<String, String> LLLF = new LinkedHashMap();
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public ValueAnimator LLJLL;
    public String LLJLLIL;
    public long LLJLLL;
    public ARunnableS21S1100000_16 LLJZ;
    public final BPEAHandler LLJZIJLIL = new BPEAHandler(Looper.getMainLooper());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.frf;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ARunnableS21S1100000_16 aRunnableS21S1100000_16 = this.LLJZ;
        if (aRunnableS21S1100000_16 != null) {
            this.LLJZIJLIL.removeCallbacks(aRunnableS21S1100000_16);
            this.LLJZ = null;
        }
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJLL = null;
        op();
        FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout != null) {
            C0DSB.LIZIZ(frameLayout);
        }
    }

    public final void op() {
        String str = this.LLJLLIL;
        if (str == null) {
            return;
        }
        Map<String, Integer> map = LLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_gen_");
        sbLIZ.append(str);
        map.remove(C2188811AlT.LIZIZ(sbLIZ));
        LLLF.remove(str);
    }

    public final void sp() {
        View view;
        ARunnableS21S1100000_16 aRunnableS21S1100000_16 = this.LLJZ;
        if (aRunnableS21S1100000_16 != null) {
            this.LLJZIJLIL.removeCallbacks(aRunnableS21S1100000_16);
            this.LLJZ = null;
        }
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJLL = null;
        FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout != null) {
            C0DSB.LIZIZ(frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
        Object parent = frameLayout2 != null ? frameLayout2.getParent() : null;
        if ((parent instanceof View) && (view = (View) parent) != null) {
            C0DSB.LIZIZ(view);
        }
        op();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        ARunnableS21S1100000_16 aRunnableS21S1100000_16 = this.LLJZ;
        if (aRunnableS21S1100000_16 != null) {
            this.LLJZIJLIL.removeCallbacks(aRunnableS21S1100000_16);
            this.LLJZ = null;
        }
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJLL = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FrameLayout frameLayout;
        final int color;
        boolean z;
        Drawable drawable;
        if (view instanceof FrameLayout) {
            frameLayout = (FrameLayout) view;
        } else {
            frameLayout = null;
        }
        this.LLJJLIIIJLLLLLLLZ = frameLayout;
        this.LLJL = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.tv_subtitle);
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.lxo);
        FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout2 != null) {
            if ((view.getContext().getResources().getConfiguration().uiMode & 48) == 32) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                final int[] iArr = {ColorProtector.parseColor("#433099"), ColorProtector.parseColor("#4F37B6"), ColorProtector.parseColor("#2240A5"), ColorProtector.parseColor("#0354BA"), ColorProtector.parseColor("#0149A0")};
                final float[] fArr = {0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
                final int[] iArr2 = {1291845632, 0, 0};
                final float[] fArr2 = {0.0f, 0.5f, 1.0f};
                final int color2 = ColorProtector.parseColor("#1F558BFF");
                final int color3 = ColorProtector.parseColor("#29E6E6E6");
                drawable = new Drawable(color2, color3, fArr, fArr2, iArr, iArr2) { // from class: X.0Eq0
                    public static final /* synthetic */ int LJIIJ = 0;
                    public final int[] LIZ;
                    public final float[] LIZIZ;
                    public final int[] LIZJ;
                    public final float[] LIZLLL;
                    public final int LJ;
                    public final int LJFF;
                    public final float LJI = C418440Gaw.LIZIZ(16);
                    public final Paint LJII;
                    public final Paint LJIIIIZZ;
                    public final RectF LJIIIZ;

                    @Override // android.graphics.drawable.Drawable
                    public final int getOpacity() {
                        return -3;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void draw(Canvas canvas) {
                        float strokeWidth = this.LJI - this.LJIIIIZZ.getStrokeWidth();
                        canvas.drawRoundRect(this.LJIIIZ, strokeWidth, strokeWidth, this.LJII);
                        canvas.drawRoundRect(this.LJIIIZ, strokeWidth, strokeWidth, this.LJIIIIZZ);
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void onBoundsChange(Rect rect) {
                        super.onBoundsChange(rect);
                        this.LJIIIZ.set(rect);
                        this.LJIIIZ.inset(this.LJIIIIZZ.getStrokeWidth(), this.LJIIIIZZ.getStrokeWidth());
                        float fWidth = rect.width();
                        float fHeight = rect.height();
                        this.LJII.setShader(new ComposeShader(new LinearGradient(0.0f, 0.0f, fWidth, 0.0f, this.LIZ, this.LIZIZ, Shader.TileMode.CLAMP), new LinearGradient(0.0f, 0.0f, 0.0f, fHeight, this.LIZJ, this.LIZLLL, Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY));
                        this.LJIIIIZZ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, fHeight, this.LJ, this.LJFF, Shader.TileMode.CLAMP));
                        invalidateSelf();
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void setAlpha(int i) {
                        this.LJII.setAlpha(i);
                        this.LJIIIIZZ.setAlpha(i);
                        invalidateSelf();
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void setColorFilter(ColorFilter colorFilter) {
                        this.LJII.setColorFilter(colorFilter);
                        this.LJIIIIZZ.setColorFilter(colorFilter);
                    }

                    {
                        this.LIZ = iArr;
                        this.LIZIZ = fArr;
                        this.LIZJ = iArr2;
                        this.LIZLLL = fArr2;
                        this.LJ = color2;
                        this.LJFF = color3;
                        Paint paint = new Paint(1);
                        paint.setStyle(Paint.Style.FILL);
                        this.LJII = paint;
                        Paint paint2 = new Paint(1);
                        paint2.setStyle(Paint.Style.STROKE);
                        paint2.setStrokeWidth(C418440Gaw.LIZIZ(1));
                        this.LJIIIIZZ = paint2;
                        this.LJIIIZ = new RectF();
                    }
                };
            } else {
                final int[] iArr3 = {ColorProtector.parseColor("#E1E2FF"), ColorProtector.parseColor("#CED2FF"), ColorProtector.parseColor("#CCDAFF"), ColorProtector.parseColor("#E2D4FF"), ColorProtector.parseColor("#C8E1FF")};
                final float[] fArr3 = {0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
                final int[] iArr4 = {1308622847, 16777215, 16777215};
                final float[] fArr4 = {0.0f, 0.5f, 1.0f};
                final int color4 = ColorProtector.parseColor("#1F558BFF");
                final int color5 = ColorProtector.parseColor("#1F666666");
                drawable = new Drawable(color4, color5, fArr3, fArr4, iArr3, iArr4) { // from class: X.0Eq0
                    public static final /* synthetic */ int LJIIJ = 0;
                    public final int[] LIZ;
                    public final float[] LIZIZ;
                    public final int[] LIZJ;
                    public final float[] LIZLLL;
                    public final int LJ;
                    public final int LJFF;
                    public final float LJI = C418440Gaw.LIZIZ(16);
                    public final Paint LJII;
                    public final Paint LJIIIIZZ;
                    public final RectF LJIIIZ;

                    @Override // android.graphics.drawable.Drawable
                    public final int getOpacity() {
                        return -3;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void draw(Canvas canvas) {
                        float strokeWidth = this.LJI - this.LJIIIIZZ.getStrokeWidth();
                        canvas.drawRoundRect(this.LJIIIZ, strokeWidth, strokeWidth, this.LJII);
                        canvas.drawRoundRect(this.LJIIIZ, strokeWidth, strokeWidth, this.LJIIIIZZ);
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void onBoundsChange(Rect rect) {
                        super.onBoundsChange(rect);
                        this.LJIIIZ.set(rect);
                        this.LJIIIZ.inset(this.LJIIIIZZ.getStrokeWidth(), this.LJIIIIZZ.getStrokeWidth());
                        float fWidth = rect.width();
                        float fHeight = rect.height();
                        this.LJII.setShader(new ComposeShader(new LinearGradient(0.0f, 0.0f, fWidth, 0.0f, this.LIZ, this.LIZIZ, Shader.TileMode.CLAMP), new LinearGradient(0.0f, 0.0f, 0.0f, fHeight, this.LIZJ, this.LIZLLL, Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY));
                        this.LJIIIIZZ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, fHeight, this.LJ, this.LJFF, Shader.TileMode.CLAMP));
                        invalidateSelf();
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void setAlpha(int i) {
                        this.LJII.setAlpha(i);
                        this.LJIIIIZZ.setAlpha(i);
                        invalidateSelf();
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void setColorFilter(ColorFilter colorFilter) {
                        this.LJII.setColorFilter(colorFilter);
                        this.LJIIIIZZ.setColorFilter(colorFilter);
                    }

                    {
                        this.LIZ = iArr3;
                        this.LIZIZ = fArr3;
                        this.LIZJ = iArr4;
                        this.LIZLLL = fArr4;
                        this.LJ = color4;
                        this.LJFF = color5;
                        Paint paint = new Paint(1);
                        paint.setStyle(Paint.Style.FILL);
                        this.LJII = paint;
                        Paint paint2 = new Paint(1);
                        paint2.setStyle(Paint.Style.STROKE);
                        paint2.setStrokeWidth(C418440Gaw.LIZIZ(1));
                        this.LJIIIIZZ = paint2;
                        this.LJIIIZ = new RectF();
                    }
                };
            }
            frameLayout2.setBackground(drawable);
        }
        FrameLayout frameLayout3 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout3 != null) {
            frameLayout3.setClipToOutline(true);
        }
        FrameLayout frameLayout4 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout4 != null) {
            frameLayout4.setOutlineProvider(new C0ID9(32));
        }
        View viewFindViewById = view.findViewById(R.id.s8q);
        if (viewFindViewById != null) {
            if ((view.getContext().getResources().getConfiguration().uiMode & 48) == 32) {
                color = ColorProtector.parseColor("#002C4D");
            } else {
                color = ColorProtector.parseColor("#E5F4FF");
            }
            viewFindViewById.setBackground(new Drawable(color) { // from class: X.0Eas
                public static final /* synthetic */ int LIZJ = 0;
                public final Paint LIZ;
                public final RectF LIZIZ;

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -3;
                }

                {
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    this.LIZ = paint;
                    this.LIZIZ = new RectF();
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    float fMin = Math.min(getBounds().width(), getBounds().height()) / 2.0f;
                    canvas.drawRoundRect(this.LIZIZ, fMin, fMin, this.LIZ);
                }

                @Override // android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
                    super.onBoundsChange(rect);
                    this.LIZIZ.set(rect);
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                    this.LIZ.setAlpha(i);
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.LIZ.setColorFilter(colorFilter);
                }
            });
        }
        View viewFindViewById2 = view.findViewById(R.id.s9b);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setBackground(new Drawable() { // from class: X.0Ear
                public final Paint LIZ;
                public final RectF LIZIZ;

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -3;
                }

                {
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    this.LIZ = paint;
                    this.LIZIZ = new RectF();
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    float fMin = Math.min(getBounds().width(), getBounds().height()) / 2.0f;
                    canvas.drawRoundRect(this.LIZIZ, fMin, fMin, this.LIZ);
                }

                @Override // android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
                    super.onBoundsChange(rect);
                    this.LIZIZ.set(rect);
                    this.LIZ.setShader(new LinearGradient(0.0f, 0.0f, rect.width(), 0.0f, new int[]{ColorProtector.parseColor("#31B0FF"), ColorProtector.parseColor("#00E0F5")}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                    this.LIZ.setAlpha(i);
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.LIZ.setColorFilter(colorFilter);
                }
            });
        }
        View viewFindViewById3 = view.findViewById(R.id.kc4);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOutlineProvider(new C0ID9(33));
            viewFindViewById3.setClipToOutline(true);
        }
        FrameLayout frameLayout5 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout5 != null) {
            C0DSB.LIZIZ(frameLayout5);
        }
        FrameLayout frameLayout6 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout6 != null) {
            frameLayout6.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0cF1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return true;
                }
            });
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1004280cF0 interfaceC1004280cF0) {
        TakoVideoGenCard takoVideoGenCard;
        String str;
        List<String> list;
        Object parent;
        View view;
        List<String> list2;
        String str2;
        SmartImageView smartImageView;
        String str3;
        InterfaceC1004280cF0 interfaceC1004280cF02 = interfaceC1004280cF0;
        String strLLJILJILJ = interfaceC1004280cF02.LLJILJILJ();
        ARunnableS21S1100000_16 aRunnableS21S1100000_16 = this.LLJZ;
        if (aRunnableS21S1100000_16 != null) {
            this.LLJZIJLIL.removeCallbacks(aRunnableS21S1100000_16);
            this.LLJZ = null;
        }
        this.LLJLLIL = strLLJILJILJ;
        this.LLJLLL = interfaceC1004280cF02.LLILZ();
        TakoMixFeed takoMixFeedLJJJJ = interfaceC1004280cF02.LJJJJ();
        if (takoMixFeedLJJJJ != null && takoMixFeedLJJJJ.videoGenCard != null) {
            if (C1004300cF2.LIZJ(takoMixFeedLJJJJ, this.LLJLLL)) {
                if (takoMixFeedLJJJJ != null) {
                    takoVideoGenCard = takoMixFeedLJJJJ.videoGenCard;
                } else {
                    takoVideoGenCard = null;
                }
                TuxTextView tuxTextView = this.LLJL;
                if (tuxTextView != null) {
                    if (takoVideoGenCard == null || (str3 = takoVideoGenCard.title) == null || str3.length() <= 0) {
                        str3 = "Generating your video...";
                    }
                    tuxTextView.setText(str3);
                }
                String str4 = this.LLJLLIL;
                if (str4 == null || (str = (String) ((LinkedHashMap) LLLF).get(str4)) == null) {
                    if (takoVideoGenCard == null || (list = takoVideoGenCard.generationDescList) == null || (str = (String) C13LP.LJLJJL(list, AbstractC19994813Le.Default)) == null) {
                        str = "This can take 2 mins";
                    }
                    String str5 = this.LLJLLIL;
                    if (str5 != null) {
                        LLLF.put(str5, str);
                    }
                }
                TuxTextView tuxTextView2 = this.LLJLIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(str);
                }
                SmartImageView smartImageView2 = this.LLJLILLLLZIIL;
                if (smartImageView2 != null) {
                    smartImageView2.setImageDrawable(new Drawable() { // from class: X.0Eaj
                        public final Paint LIZ;

                        @Override // android.graphics.drawable.Drawable
                        public final int getOpacity() {
                            return -3;
                        }

                        {
                            Paint paint = new Paint(1);
                            paint.setStyle(Paint.Style.FILL);
                            this.LIZ = paint;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            canvas.drawRect(getBounds(), this.LIZ);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void onBoundsChange(Rect rect) {
                            super.onBoundsChange(rect);
                            this.LIZ.setShader(new LinearGradient(0.0f, 0.0f, rect.width(), rect.height(), new int[]{ColorProtector.parseColor("#99DCF6"), ColorProtector.parseColor("#A8CCFE"), ColorProtector.parseColor("#99DCF6")}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                            invalidateSelf();
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i) {
                            this.LIZ.setAlpha(i);
                            invalidateSelf();
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.LIZ.setColorFilter(colorFilter);
                        }
                    });
                }
                if (takoVideoGenCard != null && (list2 = takoVideoGenCard.userImages) != null && (str2 = (String) C13LP.LJJJLL(list2)) != null && str2.length() != 0 && (smartImageView = this.LLJLILLLLZIIL) != null) {
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str2)));
                    c1331670kl3LJIIJ.LJJ(smartImageView);
                    c1331670kl3LJIIJ.LJJJIL = new C1338340kvo(smartImageView, "tako_video_gen_progress_thumb", str2, C2097608Jq.LJ());
                    c1331670kl3LJIIJ.LJIIJJI();
                }
                FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
                if (frameLayout != null) {
                    parent = frameLayout.getParent();
                } else {
                    parent = null;
                }
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    C0DSB.LIZJ(view);
                }
                FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
                if (frameLayout2 != null) {
                    C0DSB.LIZJ(frameLayout2);
                }
                FrameLayout frameLayout3 = this.LLJJLIIIJLLLLLLLZ;
                if (frameLayout3 != null) {
                    HandlerHook.viewPost(frameLayout3, new ARunnableS116S0100000_16(this, 251));
                }
                ARunnableS21S1100000_16 aRunnableS21S1100000_162 = this.LLJZ;
                if (aRunnableS21S1100000_162 != null) {
                    this.LLJZIJLIL.removeCallbacks(aRunnableS21S1100000_162);
                    this.LLJZ = null;
                }
                long j = 0;
                if (this.LLJLLL > 0) {
                    C1153150g77.LIZ.getClass();
                    long jLIZ = (C1153150g77.LIZ() * 1000) - (System.currentTimeMillis() - this.LLJLLL);
                    if (jLIZ >= 0) {
                        j = jLIZ;
                    }
                    ARunnableS21S1100000_16 aRunnableS21S1100000_163 = new ARunnableS21S1100000_16(this, this.LLJLLIL, 11);
                    this.LLJZ = aRunnableS21S1100000_163;
                    C786410Ut5.LJLIIL(j, this.LLJZIJLIL, aRunnableS21S1100000_163);
                    return;
                }
                return;
            }
            sp();
            return;
        }
        sp();
    }

    public final void tp(int i) {
        String str = this.LLJLLIL;
        if (str == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        Map<String, Integer> map = LLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_gen_");
        sbLIZ.append(str);
        map.put(C2188811AlT.LIZIZ(sbLIZ), numValueOf);
    }

    public final void up(int i) {
        View viewFindViewById;
        int width;
        FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
        ImageView imageView = null;
        if (frameLayout != null) {
            imageView = (ImageView) frameLayout.findViewById(R.id.s9b);
        }
        FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout2 != null && (viewFindViewById = frameLayout2.findViewById(R.id.s8q)) != null && imageView != null && (width = viewFindViewById.getWidth()) > 0) {
            int i2 = (int) ((width * i) / 100.0f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i2;
            C786410Ut5.c6(imageView, layoutParams);
            imageView.requestLayout();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1004280cF0 interfaceC1004280cF0) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1004280cF0 interfaceC1004280cF0) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
