package com.lynx.textra;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.textra.TTTextDefinition;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class JavaCanvasHelper {
    public Canvas canvas_;
    public int color_;
    public boolean is_bold_;
    public boolean is_italic_;
    public boolean is_underline_;
    public JavaFontManager mFontManager;
    public int stroke_color_;
    public float text_size_;
    public final Paint paint_ = new Paint();
    public Paint mPainter = new Paint();
    public char[] text_ = new char[20];

    public void clear() {
    }

    public void endPaint() {
    }

    public void startPaint() {
    }

    /* JADX INFO: renamed from: com.lynx.textra.JavaCanvasHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp;
        public static final /* synthetic */ int[] $SwitchMap$com$lynx$textra$TTTextDefinition$PathType;

        static {
            int[] iArr = new int[TTTextDefinition.PathType.values().length];
            $SwitchMap$com$lynx$textra$TTTextDefinition$PathType = iArr;
            try {
                iArr[TTTextDefinition.PathType.kLines.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$PathType[TTTextDefinition.PathType.kArc.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$PathType[TTTextDefinition.PathType.kBezier.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$PathType[TTTextDefinition.PathType.kMoveTo.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$PathType[TTTextDefinition.PathType.kMultiPath.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            int[] iArr2 = new int[TTTextDefinition.CanvasOp.values().length];
            $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp = iArr2;
            try {
                iArr2[TTTextDefinition.CanvasOp.kStartPaint.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kEndPaint.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kSave.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kRestore.ordinal()] = 4;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kClear.ordinal()] = 5;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kTranslate.ordinal()] = 6;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kScale.ordinal()] = 7;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kRotate.ordinal()] = 8;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kSkew.ordinal()] = 9;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kClipRect.ordinal()] = 10;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kClearRect.ordinal()] = 11;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kFillRect.ordinal()] = 12;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawArc.ordinal()] = 13;
            } catch (NoSuchFieldError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawLine.ordinal()] = 14;
            } catch (NoSuchFieldError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawOval.ordinal()] = 15;
            } catch (NoSuchFieldError e20) {
                TryCatchGuardChecker.doCheck(e20);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawPath.ordinal()] = 16;
            } catch (NoSuchFieldError e21) {
                TryCatchGuardChecker.doCheck(e21);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawRect.ordinal()] = 17;
            } catch (NoSuchFieldError e22) {
                TryCatchGuardChecker.doCheck(e22);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawText.ordinal()] = 18;
            } catch (NoSuchFieldError e23) {
                TryCatchGuardChecker.doCheck(e23);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawArcTo.ordinal()] = 19;
            } catch (NoSuchFieldError e24) {
                TryCatchGuardChecker.doCheck(e24);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawColor.ordinal()] = 20;
            } catch (NoSuchFieldError e25) {
                TryCatchGuardChecker.doCheck(e25);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawImage.ordinal()] = 21;
            } catch (NoSuchFieldError e26) {
                TryCatchGuardChecker.doCheck(e26);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawCircle.ordinal()] = 22;
            } catch (NoSuchFieldError e27) {
                TryCatchGuardChecker.doCheck(e27);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawGlyphs.ordinal()] = 23;
            } catch (NoSuchFieldError e28) {
                TryCatchGuardChecker.doCheck(e28);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawImageRect.ordinal()] = 24;
            } catch (NoSuchFieldError e29) {
                TryCatchGuardChecker.doCheck(e29);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawRunDelegate.ordinal()] = 25;
            } catch (NoSuchFieldError e30) {
                TryCatchGuardChecker.doCheck(e30);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawBackgroundDelegate.ordinal()] = 26;
            } catch (NoSuchFieldError e31) {
                TryCatchGuardChecker.doCheck(e31);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawBlockRegion.ordinal()] = 27;
            } catch (NoSuchFieldError e32) {
                TryCatchGuardChecker.doCheck(e32);
            }
            try {
                $SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[TTTextDefinition.CanvasOp.kDrawRoundRect.ordinal()] = 28;
            } catch (NoSuchFieldError e33) {
                TryCatchGuardChecker.doCheck(e33);
            }
        }
    }

    public void restore() {
        this.canvas_.restore();
    }

    public void save() {
        this.canvas_.save();
    }

    public JavaCanvasHelper(JavaFontManager javaFontManager) {
        this.mFontManager = null;
        this.mFontManager = javaFontManager;
    }

    public void clearRect(BBufferInputStream bBufferInputStream) {
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
    }

    public void clipRect(BBufferInputStream bBufferInputStream) {
        this.canvas_.clipRect(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
    }

    public void drawArc(BBufferInputStream bBufferInputStream) {
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        bBufferInputStream.readInt();
        ReadPaint(bBufferInputStream, this.paint_);
    }

    public void drawArcTo(BBufferInputStream bBufferInputStream) {
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        ReadPaint(bBufferInputStream, this.paint_);
    }

    public void drawBackgroundDelegate(BBufferInputStream bBufferInputStream) {
        bBufferInputStream.readInt();
        ReadPaint(bBufferInputStream, this.paint_);
    }

    public void drawCircle(BBufferInputStream bBufferInputStream) {
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        Paint paint = this.paint_;
        ReadPaint(bBufferInputStream, paint);
        paint.setColor(this.color_);
        int i = this.color_;
        if (i != 0) {
            if (this.stroke_color_ == i) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.canvas_.drawCircle(fDp2Px, fDp2Px2, fDp2Px3, paint);
                return;
            } else {
                paint.setStyle(Paint.Style.FILL);
                this.canvas_.drawCircle(fDp2Px, fDp2Px2, fDp2Px3, paint);
            }
        }
        if (this.stroke_color_ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.stroke_color_);
        this.canvas_.drawCircle(fDp2Px, fDp2Px2, fDp2Px3, paint);
    }

    public void drawColor(BBufferInputStream bBufferInputStream) {
        bBufferInputStream.readInt();
    }

    public void drawGlyphs(BBufferInputStream bBufferInputStream) {
        this.mFontManager.GetTypefaceByIndex(bBufferInputStream.readInt());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        int i = bBufferInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            bBufferInputStream.readShort();
            bBufferInputStream.readFloat();
            bBufferInputStream.readFloat();
        }
    }

    public void drawImage(BBufferInputStream bBufferInputStream) {
        int i = bBufferInputStream.readInt();
        byte[] bArr = new byte[i];
        bBufferInputStream.read(bArr, 0, i);
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px4 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        Paint paint = this.paint_;
        ReadPaint(bBufferInputStream, paint);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i);
        this.canvas_.drawBitmap(bitmapDecodeByteArray, new Rect(0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight()), new Rect((int) fDp2Px, (int) fDp2Px2, (int) fDp2Px3, (int) fDp2Px4), paint);
    }

    public void drawImgRect(BBufferInputStream bBufferInputStream) {
        int i = bBufferInputStream.readInt();
        byte[] bArr = new byte[i];
        bBufferInputStream.read(bArr, 0, i);
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px4 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px5 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px6 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px7 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px8 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        Paint paint = this.paint_;
        ReadPaint(bBufferInputStream, paint);
        this.canvas_.drawBitmap(BitmapFactory.decodeByteArray(bArr, 0, i), new Rect((int) fDp2Px, (int) fDp2Px2, (int) fDp2Px3, (int) fDp2Px4), new Rect((int) fDp2Px5, (int) fDp2Px6, (int) fDp2Px7, (int) fDp2Px8), paint);
    }

    public void drawLine(BBufferInputStream bBufferInputStream) {
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px4 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        Paint paint = this.paint_;
        ReadPaint(bBufferInputStream, paint);
        paint.setColor(this.color_);
        int i = this.color_;
        if (i != 0) {
            if (this.stroke_color_ == i) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.canvas_.drawLine(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, paint);
                return;
            } else {
                paint.setStyle(Paint.Style.FILL);
                this.canvas_.drawLine(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, paint);
            }
        }
        if (this.stroke_color_ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.stroke_color_);
        this.canvas_.drawLine(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, paint);
    }

    public void drawOval(BBufferInputStream bBufferInputStream) {
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        ReadPaint(bBufferInputStream, this.paint_);
    }

    public void drawPath(BBufferInputStream bBufferInputStream) {
        Path path = new Path();
        ReadPath(path, bBufferInputStream);
        path.close();
        Paint paint = this.paint_;
        ReadPaint(bBufferInputStream, paint);
        paint.setColor(this.color_);
        int i = this.color_;
        if (i != 0) {
            if (this.stroke_color_ == i) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.canvas_.drawPath(path, paint);
                return;
            } else {
                paint.setStyle(Paint.Style.FILL);
                this.canvas_.drawPath(path, paint);
            }
        }
        if (this.stroke_color_ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.stroke_color_);
        this.canvas_.drawPath(path, paint);
    }

    public void drawRect(BBufferInputStream bBufferInputStream) {
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px4 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        Paint paint = this.paint_;
        ReadPaint(bBufferInputStream, paint);
        paint.setColor(this.color_);
        int i = this.color_;
        if (i != 0) {
            if (this.stroke_color_ == i) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.canvas_.drawRect(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, paint);
                return;
            } else {
                paint.setStyle(Paint.Style.FILL);
                this.canvas_.drawRect(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, paint);
            }
        }
        if (this.stroke_color_ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.stroke_color_);
        this.canvas_.drawRect(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, paint);
    }

    public void drawRoundRect(BBufferInputStream bBufferInputStream) {
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px4 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px5 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        Paint paint = this.paint_;
        ReadPaint(bBufferInputStream, paint);
        paint.setColor(this.color_);
        int i = this.color_;
        if (i != 0) {
            if (this.stroke_color_ == i) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.canvas_.drawRoundRect(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, fDp2Px5, fDp2Px5, paint);
                return;
            } else {
                paint.setStyle(Paint.Style.FILL);
                this.canvas_.drawRoundRect(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, fDp2Px5, fDp2Px5, paint);
            }
        }
        if (this.stroke_color_ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.stroke_color_);
        this.canvas_.drawRoundRect(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, fDp2Px5, fDp2Px5, paint);
    }

    public void drawRunDelegate(BBufferInputStream bBufferInputStream) {
        bBufferInputStream.readInt();
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        ReadPaint(bBufferInputStream, this.paint_);
    }

    public void drawText(BBufferInputStream bBufferInputStream) {
        float f;
        JavaTypeface javaTypefaceGetTypefaceByIndex = this.mFontManager.GetTypefaceByIndex(bBufferInputStream.readInt());
        int i = bBufferInputStream.readInt();
        if (i > this.text_.length) {
            this.text_ = new char[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.text_[i2] = (char) bBufferInputStream.readShort();
        }
        while (i > 0 && this.text_[i - 1] < ' ') {
            i--;
        }
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        this.paint_.setTypeface(javaTypefaceGetTypefaceByIndex.mTypeface);
        Paint paint = this.paint_;
        ReadPaint(bBufferInputStream, paint);
        paint.setFakeBoldText(this.is_bold_);
        if (this.is_italic_) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        paint.setTextSkewX(f);
        paint.setColor(this.color_);
        int i3 = this.color_;
        if (i3 != 0) {
            if (this.stroke_color_ == i3) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.canvas_.drawText(this.text_, 0, i, fDp2Px, fDp2Px2, paint);
                return;
            } else {
                paint.setStyle(Paint.Style.FILL);
                this.canvas_.drawText(this.text_, 0, i, fDp2Px, fDp2Px2, paint);
            }
        }
        if (this.stroke_color_ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.stroke_color_);
        this.canvas_.drawText(this.text_, 0, i, fDp2Px, fDp2Px2, paint);
    }

    public void fillRect(BBufferInputStream bBufferInputStream) {
        int i = bBufferInputStream.readInt();
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px4 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.canvas_.drawRect(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, paint);
    }

    public void rotate(BBufferInputStream bBufferInputStream) {
        this.canvas_.rotate(bBufferInputStream.readFloat());
    }

    public void scale(BBufferInputStream bBufferInputStream) {
        this.canvas_.scale(bBufferInputStream.readFloat(), bBufferInputStream.readFloat());
    }

    public void skew(BBufferInputStream bBufferInputStream) {
        this.canvas_.skew(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
    }

    public void translate(BBufferInputStream bBufferInputStream) {
        this.canvas_.translate(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
    }

    public Paint ReadPaint(BBufferInputStream bBufferInputStream, Paint paint) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
        this.color_ = bBufferInputStream.readInt();
        this.stroke_color_ = bBufferInputStream.readInt();
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        this.text_size_ = fDp2Px;
        paint.setTextSize(fDp2Px);
        byte b = bBufferInputStream.readByte();
        if ((b & 4) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.is_bold_ = z;
        if ((b & 8) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.is_italic_ = z2;
        if ((b & 16) <= 0) {
            z3 = false;
        }
        this.is_underline_ = z3;
        return paint;
    }

    public void ReadPath(Path path, BBufferInputStream bBufferInputStream) {
        int i = AnonymousClass1.$SwitchMap$com$lynx$textra$TTTextDefinition$PathType[TTTextDefinition.GetPathType(bBufferInputStream.readInt()).ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            int i3 = bBufferInputStream.readInt();
                            while (i2 < i3) {
                                ReadPath(path, bBufferInputStream);
                                i2++;
                            }
                            return;
                        }
                        return;
                    }
                    path.moveTo(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
                    return;
                }
                int i4 = bBufferInputStream.readInt();
                PointF[] pointFArr = new PointF[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    pointFArr[i5] = new PointF(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
                }
                if (i4 == 2) {
                    PointF pointF = pointFArr[0];
                    float f = pointF.x;
                    float f2 = pointF.y;
                    PointF pointF2 = pointFArr[1];
                    path.quadTo(f, f2, pointF2.x, pointF2.y);
                    return;
                }
                if (i4 >= 3) {
                    PointF pointF3 = pointFArr[0];
                    float f3 = pointF3.x;
                    float f4 = pointF3.y;
                    PointF pointF4 = pointFArr[1];
                    float f5 = pointF4.x;
                    float f6 = pointF4.y;
                    PointF pointF5 = pointFArr[2];
                    path.cubicTo(f3, f4, f5, f6, pointF5.x, pointF5.y);
                    return;
                }
                return;
            }
            TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
            TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
            TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
            TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
            TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
            TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
            TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
            return;
        }
        int i6 = bBufferInputStream.readInt();
        while (i2 < i6) {
            path.lineTo(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
            i2++;
        }
    }

    public void drawBuffer(Canvas canvas, byte[] bArr) {
        this.canvas_ = canvas;
        BBufferInputStream bBufferInputStream = new BBufferInputStream(bArr);
        while (bBufferInputStream.available() > 0) {
            try {
                drawOp(TTTextDefinition.GetCanvasOp(bBufferInputStream.readByte()), bBufferInputStream);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
    }

    public void drawOp(TTTextDefinition.CanvasOp canvasOp, BBufferInputStream bBufferInputStream) {
        switch (AnonymousClass1.$SwitchMap$com$lynx$textra$TTTextDefinition$CanvasOp[canvasOp.ordinal()]) {
            case 1:
                startPaint();
                break;
            case 2:
                endPaint();
                break;
            case 3:
                save();
                break;
            case 4:
                restore();
                break;
            case 5:
                clear();
                break;
            case 6:
                translate(bBufferInputStream);
                break;
            case 7:
                scale(bBufferInputStream);
                break;
            case 8:
                rotate(bBufferInputStream);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                skew(bBufferInputStream);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                clipRect(bBufferInputStream);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                clearRect(bBufferInputStream);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                fillRect(bBufferInputStream);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                drawArc(bBufferInputStream);
                break;
            case 14:
                drawLine(bBufferInputStream);
                break;
            case 15:
                drawOval(bBufferInputStream);
                break;
            case 16:
                drawPath(bBufferInputStream);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                drawRect(bBufferInputStream);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                drawText(bBufferInputStream);
                break;
            case 19:
                drawArcTo(bBufferInputStream);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                drawColor(bBufferInputStream);
                break;
            case 21:
                drawImage(bBufferInputStream);
                break;
            case 22:
                drawCircle(bBufferInputStream);
                break;
            case 23:
                drawGlyphs(bBufferInputStream);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                drawImgRect(bBufferInputStream);
                break;
            case 25:
                drawRunDelegate(bBufferInputStream);
                break;
            case 26:
                drawBackgroundDelegate(bBufferInputStream);
                break;
            case 28:
                drawRoundRect(bBufferInputStream);
                break;
        }
    }
}
