package com.bytedance.touchpoint.core.pendant.base;

import X.C01GW;
import X.C0C64;
import X.C0SVC;
import X.C11NZ;
import X.C11S5;
import X.C12ES;
import X.C13LP;
import X.C15438062q;
import X.C1701940uOG;
import X.C1894320zOY;
import X.C1894330zOZ;
import X.C1896870zSf;
import X.C1897020zSu;
import X.C1897170zT9;
import X.C1898450zVD;
import X.C1898700zVc;
import X.C1898780zVk;
import X.C19322810ig;
import X.C19336110kp;
import X.C19336310kr;
import X.C786410Ut5;
import X.InterfaceC1898470zVF;
import Y.ACListenerS130S0200000_28;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS97S0200000_28;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.core.pendant.BaseTouchPointManager;
import com.bytedance.touchpoint.core.pendant.feed.lite.LiteFeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseTimerPendantManager<TASK> extends BaseTouchPointManager<TimerPendant> implements View.OnClickListener, InterfaceC1898470zVF<TASK> {
    public C1898700zVc LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public Bubble LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public Function0<Unit> LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public String LLJI = "";
    public final C1896870zSf LLJJIJI = new C1896870zSf();

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public boolean LJJIFFI() {
        return !(this instanceof LiteFeedTimerPendantManger);
    }

    public void LJJIIZI() {
    }

    public boolean LJJIJ() {
        return false;
    }

    public void LJJIJIIJIL() {
    }

    public void LJJIJLIJ() {
    }

    public abstract String LJJIZ();

    public String LJJJ() {
        return "";
    }

    public void LJJJJ(TaskEvent taskEvent) {
    }

    public void LJJJJI(boolean z) {
    }

    public void LJJJJJL() {
    }

    public void LJJJJLI() {
        this.LLJILLL = false;
    }

    public boolean LJJJJZ() {
        return true;
    }

    public void LJJJJZI(String str, String str2) {
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1898470zVF
    public final int LJI() {
        T t = this.LLILLL;
        if (t != 0) {
            return t.LIZ;
        }
        return 0;
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final C1898450zVD LJIIL() {
        String strLJIILL;
        String str;
        String str2;
        TimerPendant timerPendant = (TimerPendant) this.LLILLL;
        if (timerPendant == null || (strLJIILL = timerPendant.activityId) == null) {
            strLJIILL = LJIILL();
        }
        T t = this.LLILLL;
        TimerPendant timerPendant2 = (TimerPendant) t;
        String str3 = "";
        if (timerPendant2 == null || (str = timerPendant2.lottieFileZip) == null) {
            str = "";
        }
        TimerPendant timerPendant3 = (TimerPendant) t;
        if (timerPendant3 != null && (str2 = timerPendant3.lottieFileMd5) != null) {
            str3 = str2;
        }
        return new C1898450zVD(strLJIILL, str, str3, 0, 0);
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJJIIZ() {
        ViewGroup viewGroup;
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null && c1898700zVc.getParent() != null) {
            C1898700zVc c1898700zVc2 = this.LLIZ;
            ViewParent parent = c1898700zVc2 != null ? c1898700zVc2.getParent() : null;
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LLIZ, viewGroup);
            }
        }
        this.LLIZ = null;
        this.LLJILJILJ = 0;
        this.LLJ = 0;
        this.LLIZLLLIL = false;
        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
        C1894330zOZ.LIZ().LLJJIII = false;
    }

    public String LJJIL() {
        TimerPendant timerPendant = (TimerPendant) this.LLILLL;
        if (timerPendant != null) {
            return timerPendant.timerJumpLink;
        }
        return null;
    }

    public final String LJJJI() {
        int i = this.LLJ;
        if (i == 1) {
            return "fold";
        }
        C1898700zVc c1898700zVc = this.LLIZ;
        return (c1898700zVc == null || !c1898700zVc.LLJJJJJIL) ? (i == 0 && c1898700zVc != null && c1898700zVc.getResourceLoadSuccess()) ? "unfold" : "coin" : "claim";
    }

    public final Map<String, String> LJJJIL() {
        String str;
        T t = this.LLILLL;
        if (t == 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("touch_point_id", String.valueOf(t.LIZ));
        String str2 = t.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("touch_point_name", str2);
        linkedHashMap.put("launch_plan_id", String.valueOf(t.LIZJ));
        Map<String, String> map = t.LJ;
        if (map != null && (str = map.get("program_id")) != null) {
            linkedHashMap.put("program_id", str);
        }
        linkedHashMap.put("feed_widget_status", LJJJI());
        return linkedHashMap;
    }

    public final boolean LJJJJJ() {
        C1898700zVc c1898700zVc = this.LLIZ;
        return c1898700zVc != null && c1898700zVc.getVisibility() == 0;
    }

    public final void LJJJZ() {
        LJJJLZIJ(LJJJJZ(), true);
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final View LJIJ() {
        return this.LLIZ;
    }

    public final void LJJIJIIJI(Bubble bubble) {
        int i = bubble.bubbleType;
        if (i == 29 || i == 31) {
            this.LLJIJIL = null;
            C1898700zVc c1898700zVc = this.LLIZ;
            if (c1898700zVc != null) {
                c1898700zVc.LJIJ(true);
            }
            Function0<Unit> function0 = this.LLJJ;
            if (function0 != null) {
                function0.invoke();
            }
            this.LLJJ = null;
        }
        C11NZ.LJIJJLI(new C19336110kp(bubble, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336310kr(1));
    }

    public C1898700zVc LJJJJIZL(Context context) {
        return new C1898700zVc(context, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[PHI: r3
      0x0021: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:15:0x001f, B:13:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[PHI: r3
      0x0093: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:15:0x001f, B:17:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r16) {
        /*
            r15 = this;
            if (r16 == 0) goto L76
            X.0zVc r0 = r15.LLIZ
            r6 = 0
            if (r0 == 0) goto L76
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L76
            boolean r0 = r15.LLJJI
            if (r0 == 0) goto L12
            return
        L12:
            T extends X.0zNV r0 = r15.LLILLL
            com.bytedance.touchpoint.api.model.TimerPendant r0 = (com.bytedance.touchpoint.api.model.TimerPendant) r0
            java.lang.String r7 = ""
            if (r0 == 0) goto L1e
            java.lang.String r3 = r0.LIZIZ
            if (r3 != 0) goto L21
        L1e:
            r3 = r7
            if (r0 == 0) goto L93
        L21:
            java.lang.Boolean r0 = r0.needLoginGate
            if (r0 == 0) goto L93
            boolean r2 = r0.booleanValue()
        L29:
            T extends X.0zNV r4 = r15.LLILLL
            r1 = 0
            if (r4 == 0) goto L91
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LJ
            int r1 = r4.LIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L36:
            int r5 = r16.getId()
            r4 = 2131380752(0x7f0a4a10, float:1.8381802E38)
            if (r5 == r4) goto L77
            int r5 = r16.getId()
            r4 = 2131390631(0x7f0a70a7, float:1.8401839E38)
            if (r5 == r4) goto L77
            X.0zOY r5 = X.C1894320zOY.LIZ
            T extends X.0zNV r4 = r15.LLILLL
            if (r4 == 0) goto L50
            int r6 = r4.LIZ
        L50:
            java.lang.String r4 = r15.LJJIZ()
            if (r4 == 0) goto L57
            r7 = r4
        L57:
            int r8 = r15.LLJJIII
            java.lang.String r9 = r15.LJJJI()
            java.lang.String r10 = r15.LJJJ()
            r11 = 0
            java.lang.String r12 = r15.LLJI
            r12.toString()
            java.util.Map r13 = X.C1896850zSd.LIZJ()
            r14 = 64
            X.C1894320zOY.LJFF(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.LJJIJLIJ()
            r15.LJJJJL(r1, r3, r2, r0)
        L76:
            return
        L77:
            com.bytedance.touchpoint.api.model.Bubble r5 = r15.LLJIJIL
            if (r5 == 0) goto L76
            X.0zSu r4 = X.C1897020zSu.LIZ
            X.C1897020zSu.LIZJ(r5, r6)
            r15.LJJIJIIJI(r5)
            int r5 = r5.bubbleType
            r4 = 29
            if (r5 == r4) goto L76
            r4 = 31
            if (r5 == r4) goto L76
            r15.LJJJJL(r1, r3, r2, r0)
            return
        L91:
            r0 = r1
            goto L36
        L93:
            r2 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager.onClick(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173 A[PHI: r9
      0x0173: PHI (r9v7 java.lang.String) = (r9v0 java.lang.String), (r9v8 java.lang.String) binds: [B:80:0x0171, B:78:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177 A[PHI: r9
      0x0177: PHI (r9v6 java.lang.String) = (r9v0 java.lang.String), (r9v7 java.lang.String) binds: [B:80:0x0171, B:82:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a A[PHI: r9 r10
      0x017a: PHI (r9v1 java.lang.String) = (r9v6 java.lang.String), (r9v7 java.lang.String) binds: [B:84:0x0178, B:82:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r10v0 java.lang.String) = (r10v5 java.lang.String), (r10v6 java.lang.String) binds: [B:84:0x0178, B:82:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e A[PHI: r9 r10
      0x017e: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v6 java.lang.String) binds: [B:86:0x017c, B:84:0x0178] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r10v4 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:86:0x017c, B:84:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0181 A[PHI: r9 r10 r11
      0x0181: PHI (r9v4 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String) binds: [B:86:0x017c, B:88:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r10v3 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:86:0x017c, B:88:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r11v3 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:86:0x017c, B:88:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185 A[PHI: r9 r10 r11
      0x0185: PHI (r9v2 java.lang.String) = (r9v4 java.lang.String), (r9v5 java.lang.String) binds: [B:90:0x0183, B:88:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r10v1 java.lang.String) = (r10v3 java.lang.String), (r10v4 java.lang.String) binds: [B:90:0x0183, B:88:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r11v1 java.lang.String) = (r11v3 java.lang.String), (r11v4 java.lang.String) binds: [B:90:0x0183, B:88:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0zUz] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.content.Context r15, android.view.ViewGroup r16) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager.LJIIJJI(android.content.Context, android.view.ViewGroup):void");
    }

    public final void LJJJJLL(int i, boolean z) {
        String str;
        String str2;
        List arrayList;
        boolean z2;
        int i2;
        int i3;
        String str3;
        TimerPendant timerPendant;
        T t = this.LLILLL;
        if (t != 0 && this.LLJ == 0) {
            List arrayList2 = ((TimerPendant) t).textBGColors;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            if (arrayList2.isEmpty() || arrayList2.size() < 2) {
                TimerPendant timerPendant2 = (TimerPendant) this.LLILLL;
                if (timerPendant2 == null || (str = timerPendant2.textBGColor) == null) {
                    str = "#FFAF37";
                }
                arrayList2.add(str);
                TimerPendant timerPendant3 = (TimerPendant) this.LLILLL;
                if (timerPendant3 == null || (str2 = timerPendant3.textBGColor) == null) {
                    str2 = "#FFAF37";
                }
                arrayList2.add(str2);
            }
            TimerPendant timerPendant4 = (TimerPendant) this.LLILLL;
            if (timerPendant4 == null || (arrayList = timerPendant4.awardTextBGColor) == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.isEmpty() || arrayList.size() < 2) {
                arrayList.add("#FFAF37");
                arrayList.add("#FFAF37");
            }
            if (z || ((timerPendant = (TimerPendant) this.LLILLL) != null && Intrinsics.LJFF(timerPendant.showAwardText, Boolean.TRUE))) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1898700zVc c1898700zVc = this.LLIZ;
            if (c1898700zVc != null) {
                c1898700zVc.LLJJJJJIL = z2;
                if (z2) {
                    TextView coinTextView = c1898700zVc.getCoinTextView();
                    TimerPendant timerPendant5 = c1898700zVc.LLJZIJLIL;
                    if (timerPendant5 != null && Intrinsics.LJFF(timerPendant5.bottomTexShow, Boolean.TRUE)) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    C786410Ut5.LLIL(coinTextView, i3);
                    TextView coinTextView2 = c1898700zVc.getCoinTextView();
                    TimerPendant timerPendant6 = c1898700zVc.LLJZIJLIL;
                    if (timerPendant6 != null) {
                        str3 = timerPendant6.rewardText;
                    } else {
                        str3 = null;
                    }
                    coinTextView2.setText(str3);
                    c1898700zVc.getCoinTextView().setShadowLayer(1.0f, 3.0f, 3.0f, C0SVC.LIZIZ(C0SVC.LIZ, "#FF7C02"));
                    c1898700zVc.LLLJL = i;
                    TextView coinTextView3 = c1898700zVc.getCoinTextView();
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(C12ES.LIZJ(8.0f, c1898700zVc.getContext()));
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.valueOf(C0SVC.LIZIZ(C0SVC.LIZ, (String) it2.next())));
                    }
                    gradientDrawable.setColors(C13LP.LLII(arrayList3));
                    coinTextView3.setBackground(gradientDrawable);
                    c1898700zVc.LJJIIZI();
                } else {
                    TimerPendant timerPendant7 = c1898700zVc.LLJZIJLIL;
                    if (timerPendant7 != null && Intrinsics.LJFF(timerPendant7.bottomTexShow, Boolean.TRUE)) {
                        TextView coinTextView4 = c1898700zVc.getCoinTextView();
                        if (i > 0) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        C786410Ut5.LLIL(coinTextView4, i2);
                        c1898700zVc.getCoinTextView().setText(String.valueOf(i));
                        c1898700zVc.getCoinTextView().setShadowLayer(1.0f, 3.0f, 3.0f, C0SVC.LIZIZ(C0SVC.LIZ, "#FF7C02"));
                        c1898700zVc.LLLJL = i;
                        TextView coinTextView5 = c1898700zVc.getCoinTextView();
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setShape(0);
                        gradientDrawable2.setCornerRadius(C12ES.LIZJ(8.0f, c1898700zVc.getContext()));
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(Integer.valueOf(C0SVC.LIZIZ(C0SVC.LIZ, (String) it3.next())));
                        }
                        gradientDrawable2.setColors(C13LP.LLII(arrayList4));
                        coinTextView5.setBackground(gradientDrawable2);
                        c1898700zVc.LJJIIZI();
                    }
                }
                if (c1898700zVc.getShapeBubbleView().getVisibility() == 0) {
                    C786410Ut5.LLIL(c1898700zVc.getCoinTextView(), 8);
                }
            }
        }
    }

    public final void LJJJLIIL(Bubble bubble, boolean z) {
        String str;
        C1898700zVc c1898700zVc = this.LLIZ;
        int iIntValue = 0;
        if (c1898700zVc != null && c1898700zVc.LLJLL) {
            return;
        }
        this.LLJIJIL = bubble;
        if (c1898700zVc != null) {
            String str2 = bubble.LJII;
            if (str2 != null && str2.length() != 0) {
                str = bubble.LJII;
            } else {
                str = bubble.longContent;
            }
            if ((str != null || (str = bubble.longContent) != null) && str.length() != 0) {
                c1898700zVc.getShapeBubbleView().LIZ();
                c1898700zVc.getShapeBubbleView().setBubbleText(str);
                if (c1898700zVc.getShapeBubbleView().getVisibility() != 0) {
                    c1898700zVc.LJJIJ();
                } else {
                    c1898700zVc.LJIIL();
                }
                if (z) {
                    ARunnableS97S0200000_28 aRunnableS97S0200000_28 = c1898700zVc.LLJJJIL;
                    if (aRunnableS97S0200000_28 != null) {
                        HandlerHook.viewRemoveCallbacks(c1898700zVc.getShapeBubbleView(), aRunnableS97S0200000_28);
                    }
                    ARunnableS97S0200000_28 aRunnableS97S0200000_282 = new ARunnableS97S0200000_28(c1898700zVc, 40);
                    C19322810ig shapeBubbleView = c1898700zVc.getShapeBubbleView();
                    Integer num = bubble.showDuration;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    HandlerHook.viewPostDelay(shapeBubbleView, aRunnableS97S0200000_282, ((long) iIntValue) * 1000);
                    c1898700zVc.LLJJJIL = aRunnableS97S0200000_282;
                }
            }
        }
    }

    public void LJJJLZIJ(boolean z, boolean z2) {
        C1898700zVc c1898700zVc;
        int i;
        if (!LJJ()) {
            return;
        }
        if (!z2) {
            this.LLJJIII++;
        }
        int i2 = 8;
        if (LJJIJ()) {
            C1898700zVc c1898700zVc2 = this.LLIZ;
            if (c1898700zVc2 != null) {
                C786410Ut5.j2(c1898700zVc2, 8);
                return;
            }
            return;
        }
        if (z && ((c1898700zVc = this.LLIZ) == null || c1898700zVc.getVisibility() != 0 || z2 || !C0C64.LJIILLIIL().LJIIIZ(31744, "limit_pendant_touchpoint_show_monitor", true, false))) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            T t = this.LLILLL;
            if (t != 0) {
                i = t.LIZ;
            } else {
                i = 0;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("vv_cnt", String.valueOf(this.LLJJIII));
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJJJI());
            linkedHashMap.put("task_status", LJJJ());
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i, linkedHashMap, null, null, null, "");
        }
        C1898700zVc c1898700zVc3 = this.LLIZ;
        if (c1898700zVc3 != null) {
            if (z) {
                i2 = 0;
            }
            C786410Ut5.j2(c1898700zVc3, i2);
        }
        LJJJJI(z2);
    }

    public final void LJJLIIIIJ(int i, final int i2) {
        final C1898700zVc c1898700zVc;
        if (LJJ() && (c1898700zVc = this.LLIZ) != null && i >= 0 && i2 >= 0 && i <= i2 && c1898700zVc.LLJJIJIL <= i) {
            C786410Ut5.LLLLLILLIL(c1898700zVc.getProgressBarTimerView(), 0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1898700zVc.LLJJIJIL, i);
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(1000L);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zV5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        c1898700zVc.getProgressBarTimerView().LIZ(((Float) valueAnimator.getAnimatedValue()).floatValue() / i2);
                    }
                });
            } else {
                valueAnimatorOfFloat = null;
            }
            c1898700zVc.LLJJIJIL = i;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL(java.lang.Integer r14, java.lang.String r15, boolean r16, java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            r13 = this;
            java.lang.String r1 = r13.LJJIL()
            if (r1 != 0) goto L8
            java.lang.String r1 = ""
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r4 = 1
            if (r0 != 0) goto L78
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            java.lang.String r2 = "enter_from"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r2)
            if (r0 == 0) goto L21
            int r0 = r0.length()
            if (r0 != 0) goto L2d
        L21:
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r0 = r13.LJIILL()
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r0)
        L2d:
            java.lang.String r6 = r1.toString()
            if (r6 == 0) goto L78
            r5 = r14
            if (r5 == 0) goto L5f
            int r1 = r5.intValue()
            r0 = 51
            if (r1 != r0) goto L5f
            X.0zSf r3 = r13.LLJJIJI
            java.lang.String r1 = X.C1896850zSd.LIZLLL()
            java.util.Map r0 = r13.LJJJIL()
            java.util.Map r2 = X.C1896850zSd.LIZ(r6, r1, r0)
            r3.getClass()
            int r0 = r6.length()
            if (r0 == 0) goto L5f
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.LIZIZ = r0
            r3.LIZJ = r2
            r3.LIZ = r4
        L5f:
            android.view.ViewGroup r0 = r13.LL
            if (r0 == 0) goto L77
            android.content.Context r4 = r0.getContext()
            if (r4 == 0) goto L77
            X.0zNM r3 = X.C1893580zNM.LIZ
            r10 = 0
            r12 = 192(0xc0, float:2.69E-43)
            r9 = r17
            r8 = r16
            r7 = r15
            r11 = r10
            X.C1893580zNM.LJ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L77:
            return
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager.LJJJJL(java.lang.Integer, java.lang.String, boolean, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0158 A[PHI: r12
      0x0158: PHI (r12v1 java.lang.CharSequence) = 
      (r12v0 java.lang.CharSequence)
      (r12v2 java.lang.CharSequence)
      (r12v2 java.lang.CharSequence)
      (r12v2 java.lang.CharSequence)
     binds: [B:48:0x0085, B:50:0x008c, B:51:0x008e, B:53:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r4v13, types: [X.10ig] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJL(com.bytedance.touchpoint.api.model.Bubble r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager.LJJL(com.bytedance.touchpoint.api.model.Bubble, java.lang.String, java.lang.String, boolean):void");
    }

    public static void LJJLI(BaseTimerPendantManager baseTimerPendantManager, String str, Bubble bubble, boolean z, View.OnClickListener onClickListener) {
        C1898780zVk c1898780zVk;
        int iIntValue;
        int i;
        baseTimerPendantManager.getClass();
        if (bubble.bubbleType == 24 && !C1897170zT9.LIZIZ(bubble)) {
            return;
        }
        baseTimerPendantManager.LLJIJIL = bubble;
        C1898700zVc c1898700zVc = baseTimerPendantManager.LLIZ;
        if (c1898700zVc != null) {
            if (c1898700zVc.LLLLII == null) {
                c1898700zVc.LLLL = c1898700zVc.findViewById(R.id.nq2);
                c1898700zVc.LLLLII = (TextView) c1898700zVc.findViewById(R.id.nq4);
                View viewFindViewById = c1898700zVc.findViewById(R.id.e2f);
                c1898700zVc.LLLLIIIILLL = viewFindViewById;
                if (viewFindViewById != null) {
                    if (z) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    C786410Ut5.LJLLLLLL(i, viewFindViewById);
                }
                View view = c1898700zVc.LLLLIIIILLL;
                if (view != null) {
                    C786410Ut5.I7(new ACListenerS130S0200000_28(c1898700zVc, bubble, 66), view);
                }
            }
            View view2 = c1898700zVc.LLLL;
            if (view2 != null) {
                C786410Ut5.I7(onClickListener, view2);
            }
            TextView textView = c1898700zVc.LLLLII;
            if (textView != null) {
                String str2 = bubble.highlightContent;
                int iLIZIZ = C0SVC.LIZIZ(C0SVC.LIZ, "#FFAE0F");
                int length = str.length();
                CharSequence spannedString = str;
                spannedString = str;
                if (length != 0 && str2 != null) {
                    spannedString = str;
                    if (str2.length() != 0) {
                        boolean zLJJIIZI = a0.LJJIIZI(str, str2, false);
                        spannedString = str;
                        if (zLJJIIZI) {
                            int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
                            int length2 = str2.length() + iLJJJ;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) str);
                            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iLIZIZ), iLJJJ, length2, 33);
                            spannedString = new SpannedString(spannableStringBuilder);
                        }
                    }
                }
                textView.setText(spannedString);
            }
            View view3 = c1898700zVc.LLLL;
            if (view3 != null) {
                View longBubbleLayout = c1898700zVc.getLongBubbleLayout();
                Integer num = bubble.showDuration;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 5;
                }
                c1898780zVk = new C1898780zVk(c1898700zVc, longBubbleLayout, view3, iIntValue);
            } else {
                c1898780zVk = null;
            }
            c1898700zVc.LLLLIIL = c1898780zVk;
            if (c1898780zVk != null) {
                C786410Ut5.LJLLLLLL(4, c1898780zVk.LIZIZ);
                HandlerHook.viewPostDelay(c1898780zVk.LIZIZ, new ARunnableS128S0100000_28(c1898780zVk, 83), 1000L);
            }
        }
        if (bubble.bubbleType != 24) {
            return;
        }
        C1897170zT9.LIZ(bubble);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[PHI: r7
      0x0030: PHI (r7v1 java.lang.Integer) = (r7v0 java.lang.Integer), (r7v3 java.lang.Integer) binds: [B:13:0x001e, B:15:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJIJIL(com.bytedance.touchpoint.api.model.ProgressInfo r12, com.bytedance.touchpoint.api.model.TimeInfo r13, kotlin.jvm.internal.AwS572S0100000_28 r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r7 = 0
            r10 = r14
            r8 = r16
            r4 = r11
            if (r13 == 0) goto L1e
            java.lang.String r0 = r13.animationLottieName
            r5 = 0
            if (r0 == 0) goto L12
            int r0 = r0.length()
            if (r0 != 0) goto L32
        L12:
            if (r13 == 0) goto L1e
            java.lang.String r0 = r13.lottieName
            if (r0 == 0) goto L1e
            int r0 = r0.length()
            if (r0 != 0) goto L32
        L1e:
            if (r12 == 0) goto L30
            java.lang.Integer r7 = r12.awardAmount
            java.lang.Boolean r0 = r12.claimable
            if (r0 == 0) goto L30
            boolean r9 = r0.booleanValue()
        L2a:
            r6 = 1
            r5 = r15
            r4.LJJIJL(r5, r6, r7, r8, r9, r10)
        L2f:
            return
        L30:
            r9 = 0
            goto L2a
        L32:
            boolean r0 = r4.LJJ()
            if (r0 != 0) goto L39
            return
        L39:
            if (r13 == 0) goto L3f
            java.lang.String r0 = r13.status
            if (r0 != 0) goto L41
        L3f:
            java.lang.String r0 = ""
        L41:
            r4.LLJI = r0
            r4.LLJJ = r10
            X.0zVc r3 = r4.LLIZ
            if (r3 == 0) goto L5c
            boolean r2 = r3.LLJJJJJIL
            X.0zV3 r1 = new X.0zV3
            r0 = r4
            com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager r0 = (com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager) r0
            r1.<init>(r12, r13, r0, r8)
            X.0jzF r0 = r3.getBreathLottieView()
            X.C1898700zVc.LJIL(r0, r1)
            if (r2 != 0) goto L2f
        L5c:
            X.0zOY r2 = X.C1894320zOY.LIZ
            T extends X.0zNV r0 = r4.LLILLL
            if (r0 == 0) goto L64
            int r5 = r0.LIZ
        L64:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            int r0 = r4.LLJJIII
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "vv_cnt"
            r6.put(r0, r1)
            java.lang.String r1 = r4.LJJJI()
            java.lang.String r0 = "status"
            r6.put(r0, r1)
            if (r13 == 0) goto L81
            java.lang.String r7 = r13.status
        L81:
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "single_status"
            r6.put(r0, r1)
            java.lang.String r1 = "task_status"
            java.lang.String r0 = r4.LJJJ()
            r6.put(r1, r0)
            r7 = 0
            java.lang.String r10 = ""
            r2.getClass()
            r8 = r7
            r9 = r7
            X.C1894320zOY.LJIJJ(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager.LJJIJIL(com.bytedance.touchpoint.api.model.ProgressInfo, com.bytedance.touchpoint.api.model.TimeInfo, kotlin.jvm.internal.AwS572S0100000_28, boolean, boolean):void");
    }

    public void LJJIJL(boolean z, boolean z2, Integer num, boolean z3, boolean z4, Function0 function0) {
        boolean z5;
        if (!LJJ()) {
            return;
        }
        this.LLJI = "";
        this.LLJJ = function0;
        C1898700zVc c1898700zVc = this.LLIZ;
        int i = 0;
        if (c1898700zVc != null) {
            z5 = c1898700zVc.LLJJJJJIL;
            c1898700zVc.LJIILLIIL(z, z2, num, this.LLJ, z3, z4);
        } else {
            z5 = false;
        }
        if (z4 != z5) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            T t = this.LLILLL;
            if (t != 0) {
                i = t.LIZ;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("vv_cnt", String.valueOf(this.LLJJIII));
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJJJI());
            linkedHashMap.put("task_status", LJJJ());
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i, linkedHashMap, null, null, null, "");
        }
    }

    public void LIZLLL(int i, String str, String str2, String str3, boolean z, boolean z2, Bubble bubble) {
        C1897020zSu.LJ(this, i, str, str2, str3, z, z2);
    }
}
