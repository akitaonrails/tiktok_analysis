package com.bytedance.android.livesdk.topeffect;

import X.AbstractC1552040qUU;
import X.C1078480eAg;
import X.C1084640eKc;
import X.C1087380eP2;
import X.C1119920fFW;
import X.C1133830fbx;
import X.C1161920gLG;
import X.C16F5;
import X.C19724012Fa;
import X.C2670011o;
import X.C454590Hs9;
import X.InterfaceC1087400eP4;
import X.InterfaceC2280931EPr;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import com.bytedance.android.livesdk.dataChannel.TopEffectEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSetting;
import com.bytedance.android.livesdk.message.proto.GeckoAttr;
import com.bytedance.android.livesdk.message.proto.ResourceAttr;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveTopAlphaVideoWidget extends LiveRecyclableWidget {
    public C1087380eP2 LL;
    public FrameLayout LLILLJJLI;
    public Object LLILZ;
    public final ILiveGiftDelegatePlayerService LLILLL = (ILiveGiftDelegatePlayerService) C1161920gLG.LIZJ(ILiveGiftDelegatePlayerService.class);
    public String LLILZIL = "";
    public final C1084640eKc LLILZLL = new InterfaceC2280931EPr() { // from class: X.0eKc
        @Override // X.InterfaceC2280931EPr
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC2280931EPr
        public final void LJII() {
        }

        @Override // X.InterfaceC2280931EPr
        public final void onStart() {
        }

        @Override // X.InterfaceC2280931EPr
        public final void onStop() {
        }

        @Override // X.InterfaceC2280931EPr
        public final void onEnd() {
            this.LIZ.hide();
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
        }

        @Override // X.InterfaceC2280931EPr
        public final void LIZ(int i, String str, boolean z) {
            String str2;
            this.LIZ.hide();
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
            if (z) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dynamic_effect_message_play_failed");
                if (C500260Jjc.LJIIZILJ(this.LIZ.dataChannel)) {
                    str2 = "anchor";
                } else {
                    str2 = "user";
                }
                c474500IjALIZ.LJJII(str2, "user_type");
                c474500IjALIZ.LJJII(this.LIZ.LLILZIL, Scene.SCENE_SERVICE);
                c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
                c474500IjALIZ.LJJII(str, "detail_error");
                c474500IjALIZ.LIZ();
            }
        }
    };

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2s;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1087380eP2 c1087380eP2 = this.LL;
        if (c1087380eP2 != null) {
            c1087380eP2.LIZ = false;
        }
        Object obj = this.LLILZ;
        if (obj != null) {
            this.LLILLL.tryCancel(obj);
            this.LLILLL.clearMasks(this.LLILZ);
        }
        this.LLILZ = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILLJJLI = (FrameLayout) getView();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.LL = new C1087380eP2();
        this.dataChannel.BQ2(this, TopEffectEvent.class, new AwS596S0100000_17(this, 249));
        if (LiveWidgetMinLoadSetting.INSTANCE.enableTopEffect() && objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C1078480eAg) {
                    Object obj2 = ((C1078480eAg) obj).LIZ;
                    if (obj2 instanceof PrivilegeDynamicEffectMessage) {
                        z1((PrivilegeDynamicEffectMessage) obj2);
                    }
                }
            }
        }
    }

    public final void x1(PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage) {
        int i;
        for (PrivilegeDynamicEffectMessage.Placeholder placeholder : privilegeDynamicEffectMessage.placeholderList) {
            int i2 = 1;
            if (placeholder.placeType == 1) {
                FrameLayout frameLayout = new FrameLayout(this.context);
                PrivilegeDynamicEffectMessage.FontStyle fontStyle = placeholder.fontStyle;
                if (fontStyle != null) {
                    C2670011o c2670011oY1 = y1(placeholder);
                    c2670011oY1.setMaxLines(Integer.MAX_VALUE);
                    c2670011oY1.measure(View.MeasureSpec.makeMeasureSpec(placeholder.targetWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(1920, 1073741824));
                    c2670011oY1.layout(0, 0, placeholder.targetWidth, 1920);
                    if (c2670011oY1.getLineCount() > fontStyle.maxLines) {
                        fontStyle.fontSize = (int) (((double) fontStyle.fontSize) * 0.9d);
                    }
                    C2670011o c2670011oY12 = y1(placeholder);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    PrivilegeDynamicEffectMessage.FontStyle fontStyle2 = placeholder.fontStyle;
                    if (fontStyle2 != null) {
                        int i3 = fontStyle2.verticalAlign;
                        if (i3 != 1) {
                            if (i3 != 2 && i3 == 3) {
                                i = 80;
                            } else {
                                i = 16;
                            }
                        } else {
                            i = 48;
                        }
                        int i4 = fontStyle2.horizontalAlign;
                        if (i4 != 1) {
                            if (i4 != 2 && i4 == 3) {
                                i2 = 8388613;
                            }
                        } else {
                            i2 = 8388611;
                        }
                        layoutParams.gravity = i2 | i;
                    }
                    frameLayout.addView(c2670011oY12, layoutParams);
                }
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(placeholder.targetWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(placeholder.targetHeight, 1073741824));
                frameLayout.layout(0, 0, placeholder.targetWidth, placeholder.targetHeight);
                this.LLILLL.setImageMask(this.LLILZ, placeholder.targetImage, C19724012Fa.LIZ(frameLayout, Bitmap.Config.ARGB_8888), 1.0f);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.011o, X.16F5, android.view.View, android.widget.TextView] */
    public final C2670011o y1(final PrivilegeDynamicEffectMessage.Placeholder placeholder) {
        String str;
        final Context context = this.context;
        ?? r5 = new C16F5(context) { // from class: X.011o
            @Override // android.widget.TextView, android.view.View
            public final void onDraw(Canvas canvas) {
                float f;
                PrivilegeDynamicEffectMessage.FontStyle fontStyle = placeholder.fontStyle;
                if (fontStyle != null) {
                    if (fontStyle.enableShadow) {
                        for (PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig shadowConfig : fontStyle.shadowConfigList) {
                            setTextColor(0);
                            float f2 = shadowConfig.shadowRadius;
                            if (C454590Hs9.LIZ(getContext())) {
                                f = shadowConfig.shadowDx * (-1.0f);
                            } else {
                                f = shadowConfig.shadowDx;
                            }
                            setShadowLayer(f2, f, shadowConfig.shadowDy, ColorProtector.parseColor(shadowConfig.shadowColor));
                            super.onDraw(canvas);
                        }
                        setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    if (fontStyle.enableStroke) {
                        for (PrivilegeDynamicEffectMessage.FontStyle.StrokeConfig strokeConfig : fontStyle.strokeConfigList) {
                            getPaint().setStyle(Paint.Style.STROKE);
                            getPaint().setStrokeWidth(strokeConfig.strokeWidth);
                            setTextColor(ColorProtector.parseColor(strokeConfig.strokeColor));
                            super.onDraw(canvas);
                        }
                    }
                    getPaint().setStyle(Paint.Style.FILL);
                    setTextColor(ColorProtector.parseColor(fontStyle.fontColor));
                    super.onDraw(canvas);
                }
            }
        };
        r5.setIncludeFontPadding(false);
        r5.setGravity(1);
        PrivilegeDynamicEffectMessage.Placeholder.ImagePadding imagePadding = placeholder.imagePadding;
        if (imagePadding != null) {
            if (C454590Hs9.LIZ(r5.getContext())) {
                r5.setPadding(imagePadding.rightPadding, imagePadding.topPadding, imagePadding.leftPadding, imagePadding.bottomPadding);
            } else {
                r5.setPadding(imagePadding.leftPadding, imagePadding.topPadding, imagePadding.rightPadding, imagePadding.bottomPadding);
            }
        }
        Text text = placeholder.text;
        if (text != null) {
            str = text.defaultPattern;
        } else {
            str = null;
        }
        r5.setText(C1133830fbx.LJIILIIL(text, str).toString());
        PrivilegeDynamicEffectMessage.FontStyle fontStyle = placeholder.fontStyle;
        if (fontStyle != null) {
            r5.setMaxLines(fontStyle.maxLines);
            int i = fontStyle.weight;
            if (i != 4) {
                if (i != 6) {
                    if (i != 7) {
                        C1119920fFW.LIZLLL(r5.getContext(), r5.getPaint(), 6, OppoPermissionPopupMaskDelayExp.DEFAULT);
                    } else {
                        C1119920fFW.LIZLLL(r5.getContext(), r5.getPaint(), 6, OppoPermissionPopupMaskDelayExp.DEFAULT);
                    }
                } else {
                    C1119920fFW.LIZLLL(r5.getContext(), r5.getPaint(), 6, 500);
                }
            } else {
                C1119920fFW.LIZLLL(r5.getContext(), r5.getPaint(), 6, 400);
            }
            r5.setTextSize(0, fontStyle.fontSize);
        }
        return r5;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0eP1] */
    public final void z1(final PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage) {
        GeckoAttr geckoAttr;
        String str;
        String str2;
        GeckoAttr geckoAttr2;
        if (privilegeDynamicEffectMessage.effectType != 1) {
            return;
        }
        show();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C1087380eP2 c1087380eP2 = this.LL;
        if (c1087380eP2 != null) {
            final ?? r3 = new InterfaceC1087400eP4() { // from class: X.0eP1
                /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[PHI: r1
                  0x0035: PHI (r1v22 java.lang.String) = (r1v4 java.lang.String), (r1v23 java.lang.String) binds: [B:20:0x0033, B:18:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[PHI: r1
                  0x003d: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v22 java.lang.String), (r1v22 java.lang.String) binds: [B:20:0x0033, B:22:0x0037, B:24:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
                @Override // X.InterfaceC1087400eP4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage r13) {
                    /*
                        Method dump skipped, instruction units count: 321
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1087370eP1.LIZ(com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage):void");
                }

                @Override // X.InterfaceC1087400eP4
                public final void LIZIZ(PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage2) {
                    String str3;
                    EnumC1087550ePJ.INSTANCE.onMessageFinish();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dynamic_effect_message_resource_download");
                    if (C500260Jjc.LJIIZILJ(this.LIZ.dataChannel)) {
                        str3 = "anchor";
                    } else {
                        str3 = "user";
                    }
                    c474500IjALIZ.LJJII(str3, "user_type");
                    c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "duration");
                    c474500IjALIZ.LJJII(Boolean.FALSE, "is_success");
                    c474500IjALIZ.LJJII(privilegeDynamicEffectMessage2.scene, Scene.SCENE_SERVICE);
                    c474500IjALIZ.LIZ();
                }
            };
            ResourceAttr resourceAttr = privilegeDynamicEffectMessage.resourceAttr;
            if (resourceAttr != null && resourceAttr.resourceLocation == 1 && resourceAttr.geckoAttr != null) {
                IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                String str3 = "";
                if (iHostResource != null) {
                    ResourceAttr resourceAttr2 = privilegeDynamicEffectMessage.resourceAttr;
                    if (resourceAttr2 == null || (geckoAttr2 = resourceAttr2.geckoAttr) == null || (str2 = geckoAttr2.geckoChannel) == null) {
                        str2 = "";
                    }
                    if (iHostResource.u61(str2)) {
                        if (c1087380eP2.LIZ) {
                            r3.LIZ(privilegeDynamicEffectMessage);
                            return;
                        }
                        return;
                    }
                }
                IHostResource iHostResource2 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                if (iHostResource2 == null) {
                    return;
                }
                ResourceAttr resourceAttr3 = privilegeDynamicEffectMessage.resourceAttr;
                if (resourceAttr3 != null && (geckoAttr = resourceAttr3.geckoAttr) != null && (str = geckoAttr.geckoChannel) != null) {
                    str3 = str;
                }
                iHostResource2.nd1(new AbstractC1552040qUU() { // from class: X.0eP3
                    @Override // X.AbstractC1552040qUU
                    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                        C1087380eP2 c1087380eP22 = c1087380eP2;
                        if (c1087380eP22.LIZ) {
                            C500260Jjc.LJJLIIIJILLIZJL(new AwS261S0300000_17(c1087380eP22, r3, privilegeDynamicEffectMessage, 6));
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIL(long j, UpdatePackage updatePackage) {
                        C1087380eP2 c1087380eP22 = c1087380eP2;
                        if (c1087380eP22.LIZ) {
                            C500260Jjc.LJJLIIIJILLIZJL(new AwS261S0300000_17(c1087380eP22, r3, privilegeDynamicEffectMessage, 7));
                        }
                    }
                }, str3);
                return;
            }
            if (!c1087380eP2.LIZ) {
                return;
            }
            r3.LIZIZ(privilegeDynamicEffectMessage);
        }
    }
}
