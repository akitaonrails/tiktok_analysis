package com.ss.android.ugc.aweme.im.ui.gradient;

import X.AbstractC422350GhF;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C0ZXL;
import X.C0ZXS;
import X.C0ZXT;
import X.C0ZXU;
import X.C0ZXV;
import X.C0ZXY;
import X.C0ZXZ;
import X.C0ZY3;
import X.C0ZY6;
import X.C0ZYD;
import X.C13LE;
import X.C1619106Vp;
import X.C1954807lC;
import X.C2188811AlT;
import X.C23250099c;
import X.C416140GTk;
import X.C416150GTl;
import X.C416160GTm;
import X.C422310GhB;
import X.C422330GhD;
import X.C422360GhG;
import X.C422380GhI;
import X.C426750GoL;
import X.C452501pT;
import X.C462630ICf;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RuntimeShader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.ss.android.ugc.aweme.utils.IChatCustomizeImageLoadHelper;
import com.ss.android.ugc.aweme.views.InterceptingConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessageBubbleUtils implements IIMMessageBubbleService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(270));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(271));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(274));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(272));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(273));

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final C422360GhG LJIIIIZZ() {
        C462630ICf c462630ICf = (C462630ICf) this.LIZ.getValue();
        return new C422360GhG(new C422380GhI(c462630ICf.LIZLLL), c462630ICf.LIZJ, c462630ICf.LIZIZ, c462630ICf.LIZ);
    }

    public static InterceptingConstraintLayout LJIILL(View view) {
        InterceptingConstraintLayout interceptingConstraintLayout;
        if ((view instanceof InterceptingConstraintLayout) && (interceptingConstraintLayout = (InterceptingConstraintLayout) view) != null) {
            return interceptingConstraintLayout;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(view.getClass()).LJI());
        sbLIZ.append(": view must be the root skeleton view");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final C0ZXS LIZIZ(MessageBubbleStyle messageBubbleStyle) {
        C0ZXT c0zxt = (C0ZXT) this.LIZLLL.getValue();
        C462630ICf c462630ICf = (C462630ICf) this.LIZIZ.getValue();
        return LJIILIIL(messageBubbleStyle, c0zxt, new C422360GhG(new C422380GhI(c462630ICf.LIZLLL), c462630ICf.LIZJ, c462630ICf.LIZIZ, c462630ICf.LIZ));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final C0ZXS LIZLLL(MessageBubbleStyle messageBubbleStyle) {
        return LJIIL(messageBubbleStyle, (C0ZXT) this.LIZJ.getValue(), LJIIIIZZ());
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final C0ZXS LJ(MessageBubbleStyle messageBubbleStyle) {
        C0ZXT c0zxt = (C0ZXT) this.LIZLLL.getValue();
        C462630ICf c462630ICf = (C462630ICf) this.LIZIZ.getValue();
        return LJIIL(messageBubbleStyle, c0zxt, new C422360GhG(new C422380GhI(c462630ICf.LIZLLL), c462630ICf.LIZJ, c462630ICf.LIZIZ, c462630ICf.LIZ));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final C0ZXS LJI(MessageBubbleStyle messageBubbleStyle) {
        return LJIILIIL(messageBubbleStyle, (C0ZXT) this.LIZJ.getValue(), LJIIIIZZ());
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final View LJFF(View view, boolean z) {
        int i;
        InterceptingConstraintLayout interceptingConstraintLayoutLJIILL = LJIILL(view);
        if (!z) {
            i = R.id.eu1;
        } else {
            i = R.id.k_e;
        }
        return interceptingConstraintLayoutLJIILL.findViewById(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0ZXS LJIIL(com.ss.android.ugc.aweme.models.MessageBubbleStyle r14, X.C0ZXT r15, X.C422360GhG r16) {
        /*
            r13 = this;
            r5 = 0
            if (r14 == 0) goto L81
            X.06Vp r0 = com.ss.android.ugc.aweme.utils.IChatCustomizeHelper.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.utils.IChatCustomizeHelper r0 = X.C1619106Vp.LIZ()
            r3 = 1
            if (r0 == 0) goto L81
            boolean r0 = r0.isSupportShowCustomization()
            if (r0 != r3) goto L81
        L15:
            X.0ZXS r4 = new X.0ZXS
            X.01GW r0 = r13.LJ
            java.lang.Object r2 = r0.getValue()
            X.0ZXR r2 = (X.C0ZXR) r2
            X.0ZXZ r1 = new X.0ZXZ
            r0 = 2131100619(0x7f0603cb, float:1.7813625E38)
            r6 = r16
            r1.<init>(r0, r6)
            r4.<init>(r15, r2, r1, r5)
            if (r3 == 0) goto L83
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r0 = com.ss.android.ugc.aweme.models.MessageBubbleStyle.LIZIZ(r14, r5)
            com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting$BubbleLayoutSetting r1 = com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting.LIZ()
            int r2 = r1.voiceCompensationDP
            if (r2 < 0) goto L59
            float r1 = r0.top
            float r3 = (float) r2
            float r1 = r1 - r3
            r2 = 0
            float r6 = java.lang.Math.max(r1, r2)
            float r1 = r15.LIZIZ
            float r6 = r6 + r1
            float r1 = r0.bottom
            float r1 = r1 - r3
            float r3 = java.lang.Math.max(r1, r2)
            float r1 = r15.LIZLLL
            float r3 = r3 + r1
            float r2 = r0.left
            float r1 = r0.right
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r0 = new com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData
            r0.<init>(r6, r2, r3, r1)
        L59:
            X.0ZXS r2 = new X.0ZXS
            float r9 = r0.left
            float r11 = r0.right
            float r10 = r0.top
            float r12 = r0.bottom
            X.0ZXT r7 = new X.0ZXT
            r8 = 1
            r7.<init>(r8, r9, r10, r11, r12)
            X.0ZXR r6 = new X.0ZXR
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData r0 = r14.data
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$ImageSize r3 = r0.imageSize
            float r0 = r3.width
            int r1 = (int) r0
            float r0 = r3.height
            int r0 = (int) r0
            r6.<init>(r1, r0)
            X.0ZXU r0 = new X.0ZXU
            r0.<init>(r14, r4)
            r2.<init>(r7, r6, r0, r5)
            return r2
        L81:
            r3 = 0
            goto L15
        L83:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ui.gradient.IMMessageBubbleUtils.LJIIL(com.ss.android.ugc.aweme.models.MessageBubbleStyle, X.0ZXT, X.0GhG):X.0ZXS");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0ZXS LJIILIIL(com.ss.android.ugc.aweme.models.MessageBubbleStyle r14, X.C0ZXT r15, X.C422360GhG r16) {
        /*
            r13 = this;
            r6 = 1
            r5 = 0
            if (r14 == 0) goto L4b
            X.06Vp r0 = com.ss.android.ugc.aweme.utils.IChatCustomizeHelper.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.utils.IChatCustomizeHelper r0 = X.C1619106Vp.LIZ()
            if (r0 == 0) goto L4b
            boolean r0 = r0.isSupportShowCustomization()
            if (r0 != r6) goto L4b
            r7 = 1
        L16:
            X.01GW r0 = r13.LJ
            java.lang.Object r3 = r0.getValue()
            X.0ZXR r3 = (X.C0ZXR) r3
            com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting$BubbleAGSLSetting r0 = com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting.LIZ()
            java.util.List<java.lang.String> r1 = r0.colors
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            goto L33
        L4b:
            r7 = 0
            goto L16
        L4d:
            com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting$BubbleAGSLSetting r0 = com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting.LIZ()
            java.util.List<java.lang.Float> r2 = r0.ratio
            com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting$BubbleAGSLSetting r0 = com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting.LIZ()
            boolean r1 = r0.isDiagonal
            X.0ZXV r0 = new X.0ZXV
            r8 = r16
            r0.<init>(r4, r2, r1, r8)
            X.0ZXS r4 = new X.0ZXS
            r4.<init>(r15, r3, r0, r5)
            if (r7 == 0) goto Lba
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r0 = com.ss.android.ugc.aweme.models.MessageBubbleStyle.LIZIZ(r14, r6)
            com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting$BubbleLayoutSetting r1 = com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting.LIZ()
            int r2 = r1.voiceCompensationDP
            if (r2 < 0) goto L92
            float r1 = r0.top
            float r3 = (float) r2
            float r1 = r1 - r3
            r2 = 0
            float r1 = java.lang.Math.max(r1, r2)
            float r6 = r15.LIZIZ
            float r6 = r6 + r1
            float r1 = r0.bottom
            float r1 = r1 - r3
            float r3 = java.lang.Math.max(r1, r2)
            float r1 = r15.LIZLLL
            float r3 = r3 + r1
            float r2 = r0.left
            float r1 = r0.right
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData r0 = new com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$MessageBubbleInsetsData
            r0.<init>(r6, r2, r3, r1)
        L92:
            X.0ZXS r2 = new X.0ZXS
            float r9 = r0.left
            float r11 = r0.right
            float r10 = r0.top
            float r12 = r0.bottom
            X.0ZXT r7 = new X.0ZXT
            r8 = 1
            r7.<init>(r8, r9, r10, r11, r12)
            X.0ZXR r6 = new X.0ZXR
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData r0 = r14.data
            com.ss.android.ugc.aweme.models.MessageBubbleStyle$MessageBubbleStyleData$ImageSize r3 = r0.imageSize
            float r0 = r3.width
            int r1 = (int) r0
            float r0 = r3.height
            int r0 = (int) r0
            r6.<init>(r1, r0)
            X.0ZXU r0 = new X.0ZXU
            r0.<init>(r14, r4)
            r2.<init>(r7, r6, r0, r5)
            return r2
        Lba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ui.gradient.IMMessageBubbleUtils.LJIILIIL(com.ss.android.ugc.aweme.models.MessageBubbleStyle, X.0ZXT, X.0GhG):X.0ZXS");
    }

    public static void LJIILJJIL(View view, C0ZXS c0zxs, Function0 function0, C0ZY6 c0zy6) {
        View viewLIZ;
        Object tag;
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ == null || !iChatCustomizeHelperLIZ.isSupportShowCustomization() || (viewLIZ = c0zy6.LIZ(view, false)) == null || (tag = viewLIZ.getTag(R.id.bot)) == null) {
            return;
        }
        C0ZXL c0zxl = c0zxs.LIZJ;
        if ((c0zxl instanceof C0ZXU) && Intrinsics.LJFF(tag, ((C0ZXU) c0zxl).LIZ.resourceId)) {
            return;
        }
        function0.invoke();
        viewLIZ.setTag(R.id.bot, null);
        viewLIZ.setBackground(null);
    }

    public final boolean LJIILLIIL(View view, MessageBubbleStyle messageBubbleStyle, boolean z, Function0<Unit> function0) {
        Drawable loadedDrawable;
        InterceptingConstraintLayout interceptingConstraintLayoutLJIILL = LJIILL(view);
        boolean z2 = false;
        View viewLJFF = LJFF(interceptingConstraintLayoutLJIILL, false);
        if (viewLJFF == null) {
            return false;
        }
        IChatCustomizeImageLoadHelper.LIZ.getClass();
        IChatCustomizeImageLoadHelper iChatCustomizeImageLoadHelperLIZ = C0ZYD.LIZ();
        if (iChatCustomizeImageLoadHelperLIZ != null && (loadedDrawable = iChatCustomizeImageLoadHelperLIZ.getLoadedDrawable(messageBubbleStyle, z)) != null) {
            z2 = true;
            View viewLJFF2 = LJFF(interceptingConstraintLayoutLJIILL, true);
            if (viewLJFF2 != null) {
                viewLJFF2.setBackground(null);
            }
            viewLJFF.setBackground(loadedDrawable);
            viewLJFF.setTag(R.id.bot, messageBubbleStyle.resourceId);
            function0.invoke();
        }
        return z2;
    }

    public static void LJIIJ(View view, C0ZXS c0zxs, boolean z, boolean z2, C0ZY6 c0zy6) {
        C422360GhG c422360GhG;
        View viewLIZ;
        View viewLIZ2 = c0zy6.LIZ(view, false);
        if (viewLIZ2 == null) {
            return;
        }
        Drawable background = viewLIZ2.getBackground();
        C0ZXL c0zxl = c0zxs.LIZJ;
        if (!(c0zxl instanceof C0ZXV)) {
            if (!(c0zxl instanceof C0ZXY)) {
                if (c0zxl instanceof C0ZXZ) {
                    if (c0zxl instanceof C0ZXZ) {
                        c422360GhG = ((C0ZXZ) c0zxl).LIZIZ;
                    } else {
                        return;
                    }
                } else {
                    if (c0zxl instanceof C0ZXU) {
                        if (z2) {
                            return;
                        }
                        IChatCustomizeImageLoadHelper.LIZ.getClass();
                        IChatCustomizeImageLoadHelper iChatCustomizeImageLoadHelperLIZ = C0ZYD.LIZ();
                        if ((iChatCustomizeImageLoadHelperLIZ != null && iChatCustomizeImageLoadHelperLIZ.canSkipDefaultLoad(((C0ZXU) c0zxl).LIZ)) || (viewLIZ = c0zy6.LIZ(view, false)) == null) {
                            return;
                        }
                        C0ZXU c0zxu = (C0ZXU) c0zxl;
                        if (Intrinsics.LJFF(viewLIZ.getTag(R.id.bot), c0zxu.LIZ.resourceId)) {
                            return;
                        }
                        LJIIJ(view, c0zxu.LIZIZ, z, true, c0zy6);
                        return;
                    }
                    throw new C1954807lC();
                }
            } else {
                c422360GhG = ((C0ZXY) c0zxl).LIZIZ;
            }
            if (background instanceof C416140GTk) {
                C416140GTk c416140GTk = (C416140GTk) background;
                c416140GTk.LJI.setColor(c0zxl.LIZ(view.getContext()));
                c416140GTk.LIZIZ(c422360GhG, z, c0zxs.LIZLLL);
            } else {
                C416140GTk c416140GTk2 = new C416140GTk(view.getContext());
                c416140GTk2.LJI.setColor(c0zxs.LIZJ.LIZ(view.getContext()));
                c416140GTk2.LIZIZ(c422360GhG, z, c0zxs.LIZLLL);
                viewLIZ2.setBackground(c416140GTk2);
            }
        }
    }

    public static void LJIIJJI(View view, C0ZXS c0zxs, boolean z, boolean z2, C0ZY6 c0zy6) {
        C422360GhG c422360GhG;
        View viewLIZ;
        View viewLIZ2 = c0zy6.LIZ(view, false);
        if (viewLIZ2 == null) {
            return;
        }
        Drawable background = viewLIZ2.getBackground();
        C0ZXL c0zxl = c0zxs.LIZJ;
        if (c0zxl instanceof C0ZXV) {
            if (!IMMessageBubbleAGSLSetting.LIZ().forceDisableAGSL && Build.VERSION.SDK_INT >= 33) {
                if (background instanceof C422310GhB) {
                    C422310GhB c422310GhB = (C422310GhB) background;
                    C0ZXV c0zxv = (C0ZXV) c0zxl;
                    c422310GhB.LIZIZ(c0zxv.LIZLLL, z, c0zxs.LIZLLL);
                    c422310GhB.LJI(c0zxv.LIZ, c0zxv.LIZIZ, c0zxv.LIZJ);
                    return;
                }
                C422310GhB c422310GhB2 = new C422310GhB(view.getContext());
                C0ZXV c0zxv2 = (C0ZXV) c0zxl;
                c422310GhB2.LIZIZ(c0zxv2.LIZLLL, z, c0zxs.LIZLLL);
                c422310GhB2.LJI(c0zxv2.LIZ, c0zxv2.LIZIZ, c0zxv2.LIZJ);
                viewLIZ2.setBackground(c422310GhB2);
                return;
            }
            if (background instanceof C416160GTm) {
                C416160GTm c416160GTm = (C416160GTm) background;
                C0ZXV c0zxv3 = (C0ZXV) c0zxl;
                c416160GTm.LIZIZ(c0zxv3.LIZLLL, z, c0zxs.LIZLLL);
                List<Integer> list = c0zxv3.LIZ;
                List<Float> list2 = c0zxv3.LIZIZ;
                boolean z3 = c0zxv3.LIZJ;
                C422330GhD c422330GhD = c416160GTm.LJI;
                if (c422330GhD == null) {
                    return;
                }
                c422330GhD.LIZIZ(list, list2, z3);
                return;
            }
            C416160GTm c416160GTm2 = new C416160GTm(view.getContext());
            C0ZXV c0zxv4 = (C0ZXV) c0zxl;
            c416160GTm2.LIZIZ(c0zxv4.LIZLLL, z, c0zxs.LIZLLL);
            List<Integer> list3 = c0zxv4.LIZ;
            List<Float> list4 = c0zxv4.LIZIZ;
            boolean z4 = c0zxv4.LIZJ;
            C422330GhD c422330GhD2 = c416160GTm2.LJI;
            if (c422330GhD2 != null) {
                c422330GhD2.LIZIZ(list3, list4, z4);
            }
            viewLIZ2.setBackground(c416160GTm2);
            return;
        }
        if (!(c0zxl instanceof C0ZXY)) {
            if (c0zxl instanceof C0ZXZ) {
                if (!(c0zxl instanceof C0ZXZ)) {
                    return;
                } else {
                    c422360GhG = ((C0ZXZ) c0zxl).LIZIZ;
                }
            } else {
                if (c0zxl instanceof C0ZXU) {
                    if (z2) {
                        return;
                    }
                    IChatCustomizeImageLoadHelper.LIZ.getClass();
                    IChatCustomizeImageLoadHelper iChatCustomizeImageLoadHelperLIZ = C0ZYD.LIZ();
                    if ((iChatCustomizeImageLoadHelperLIZ != null && iChatCustomizeImageLoadHelperLIZ.canSkipDefaultLoad(((C0ZXU) c0zxl).LIZ)) || (viewLIZ = c0zy6.LIZ(view, false)) == null) {
                        return;
                    }
                    C0ZXU c0zxu = (C0ZXU) c0zxl;
                    if (Intrinsics.LJFF(viewLIZ.getTag(R.id.bot), c0zxu.LIZ.resourceId)) {
                        return;
                    }
                    LJIIJJI(view, c0zxu.LIZIZ, z, true, c0zy6);
                    return;
                }
                throw new C1954807lC();
            }
        } else {
            c422360GhG = ((C0ZXY) c0zxl).LIZIZ;
        }
        if (background instanceof C416150GTl) {
            ((AbstractC422350GhF) background).LIZIZ(c422360GhG, z, c0zxs.LIZLLL);
            return;
        }
        final Context context = view.getContext();
        final int iLIZ = c0zxs.LIZJ.LIZ(view.getContext());
        AbstractC422350GhF abstractC422350GhF = new AbstractC422350GhF(context, iLIZ) { // from class: X.0GTl
            public final Context LJFF;
            public final Paint LJI;

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                if (C426750GoL.LIZLLL(this.LJFF)) {
                    canvas.drawPath(this.LIZLLL, this.LJI);
                    return;
                }
                int iSave = canvas.save();
                try {
                    canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
                    canvas.drawPath(this.LIZLLL, this.LJI);
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }

            {
                this.LJFF = context;
                Paint paint = new Paint();
                paint.setColor(iLIZ);
                this.LJI = paint;
            }
        };
        abstractC422350GhF.LIZIZ(c422360GhG, z, c0zxs.LIZLLL);
        viewLIZ2.setBackground(abstractC422350GhF);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final void LIZJ(View view, double d, double d2, int i, int i2) {
        C416160GTm c416160GTm;
        C422310GhB c422310GhB;
        if (!IMMessageBubbleAGSLSetting.LIZ().forceDisableAGSL && Build.VERSION.SDK_INT >= 33) {
            Drawable background = view.getBackground();
            if ((background instanceof C422310GhB) && (c422310GhB = (C422310GhB) background) != null) {
                double d3 = i;
                double d4 = i2;
                RuntimeShader runtimeShader = c422310GhB.LJIIIIZZ;
                runtimeShader.setFloatUniform("screenHeight", (float) d);
                runtimeShader.setFloatUniform("screenWidth", (float) d2);
                runtimeShader.setFloatUniform("topPos", (float) d4);
                runtimeShader.setFloatUniform("leftPos", (float) d3);
                C422330GhD c422330GhD = c422310GhB.LJIIJJI;
                if (c422330GhD != null) {
                    c422330GhD.LIZ = d;
                    c422330GhD.LIZIZ = d2;
                }
                c422310GhB.LJIIL = d;
                c422310GhB.LJIILIIL = d4;
                c422310GhB.LJIILJJIL = d3;
                c422310GhB.invalidateSelf();
                return;
            }
            return;
        }
        Drawable background2 = view.getBackground();
        if (!(background2 instanceof C416160GTm) || (c416160GTm = (C416160GTm) background2) == null) {
            return;
        }
        double d5 = i;
        double d6 = i2;
        c416160GTm.LJII = d;
        C422330GhD c422330GhD2 = c416160GTm.LJI;
        if (c422330GhD2 != null) {
            c422330GhD2.LIZ = d;
            c422330GhD2.LIZIZ = d2;
        }
        c416160GTm.LJIIIZ = d5;
        c416160GTm.LJIIIIZZ = d6;
        c416160GTm.invalidateSelf();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final AnonymousClass0956 LIZ(View view, C0ZXS c0zxs, boolean z, LifecycleCoroutineScope lifecycleCoroutineScope, Function0 function0, Function1 function1, C0ZY6 c0zy6) {
        LJIILJJIL(view, c0zxs, function0, c0zy6);
        LJIIJJI(view, c0zxs, z, false, c0zy6);
        C0ZXL c0zxl = c0zxs.LIZJ;
        if (c0zxl instanceof C0ZXU) {
            return LJIIIZ(view, lifecycleCoroutineScope, true, ((C0ZXU) c0zxl).LIZ, function0, function1, c0zy6);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService
    public final AnonymousClass0956 LJII(View view, C0ZXS c0zxs, boolean z, LifecycleCoroutineScope lifecycleCoroutineScope, Function0 function0, Function1 function1, C0ZY6 c0zy6) {
        LJIILJJIL(view, c0zxs, function0, c0zy6);
        LJIIJ(view, c0zxs, z, false, c0zy6);
        C0ZXL c0zxl = c0zxs.LIZJ;
        if (c0zxl instanceof C0ZXU) {
            return LJIIIZ(view, lifecycleCoroutineScope, false, ((C0ZXU) c0zxl).LIZ, function0, function1, c0zy6);
        }
        return null;
    }

    public final AnonymousClass0956 LJIIIZ(View view, LifecycleCoroutineScope lifecycleCoroutineScope, boolean z, MessageBubbleStyle messageBubbleStyle, Function0 function0, Function1 function1, C0ZY6 c0zy6) {
        if (c0zy6 != null) {
            boolean z2 = false;
            View viewLIZ = c0zy6.LIZ(view, false);
            if (viewLIZ != null) {
                if (!(z ^ C426750GoL.LIZLLL(view.getContext())) && !messageBubbleStyle.data.disableFlip) {
                    z2 = true;
                }
                if (LJIILLIIL(view, messageBubbleStyle, z2, function0)) {
                    return null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(messageBubbleStyle.resourceId);
                sbLIZ.append("#loading");
                viewLIZ.setTag(R.id.bot, C2188811AlT.LIZIZ(sbLIZ));
                return C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C0ZY3(messageBubbleStyle, view, z2, function1, this, function0, c0zy6, viewLIZ, null), 2);
            }
        }
        return null;
    }
}
