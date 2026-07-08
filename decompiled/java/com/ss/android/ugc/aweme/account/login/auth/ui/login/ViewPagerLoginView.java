package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.AbstractC19309710gZ;
import X.C1687890u1b;
import X.C1687920u1e;
import X.C1687930u1f;
import X.C19293810e0;
import X.C19310510gh;
import X.C20094213jo;
import X.C444890HcV;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC19311410gq;
import X.InterfaceC19312510h1;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import Y.ARunnableS39S0101000_28;
import Y.ARunnableS97S0200000_28;
import Y.AsS54S0100000_28;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.ViewPagerLoginView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import p5a.a;
import u4.q0;

/* JADX INFO: loaded from: classes29.dex */
public final class ViewPagerLoginView extends AbstractC19309710gZ {
    public final boolean LJIILIIL;

    public final int LJIIIZ() {
        return Math.min(this.LIZ.LIZ(this.LJIILIIL), this.LIZLLL.size());
    }

    @Override // X.AbstractC19309710gZ
    public final void LJI() {
        super.LJI();
        if (!this.LJIILIIL) {
            LIZLLL();
        } else {
            if (C19293810e0.LJIIJ()) {
                return;
            }
            LIZLLL();
        }
    }

    public final SpannableStringBuilder LJIIIIZZ(int i, int i2) {
        String string = this.LIZIZ.getString(i2);
        String string2 = this.LIZIZ.getString(i, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
        if (iLJJJ >= 0) {
            final int iLIZ = C960203pA.LIZ(R.attr.a04, this.LIZIZ);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iLIZ) { // from class: com.ss.android.ugc.aweme.account.login.auth.ui.login.ViewPagerLoginView$getBottomText$1
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(82);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                }
            }, iLJJJ, string.length() + iLJJJ, 34);
        }
        return spannableStringBuilder;
    }

    public ViewPagerLoginView(InterfaceC19312510h1 interfaceC19312510h1, BaseActivity baseActivity, View view, boolean z, List<? extends C1687890u1b> list) {
        super(interfaceC19312510h1, baseActivity, view, list);
        this.LJIILIIL = z;
        LIZIZ().addOnScrollListener(new AsS54S0100000_28(this, 6));
        LIZIZ().setLayoutManager(new LinearLayoutManager(baseActivity));
        LIZIZ().setClipChildren(false);
        ArrayList arrayList = new ArrayList(list.subList(0, LJIIIZ()));
        this.LJIIJ = new C19310510gh(new ArrayList(arrayList), LJIIIZ(), z, LIZJ());
        IPrevLoginPlatformService iPrevLoginPlatformService = (IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class);
        AObserverS230S0100000_28 aObserverS230S0100000_28 = new AObserverS230S0100000_28(this, 116);
        iPrevLoginPlatformService.getPlatform().observe(this.LIZIZ, aObserverS230S0100000_28);
        C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS97S0200000_28(iPrevLoginPlatformService, aObserverS230S0100000_28, 54));
        LIZIZ().setAdapter(LIZ());
        if (list.size() > interfaceC19312510h1.LIZ(z)) {
            if (LIZJ().xQ2()) {
                arrayList.add(new C1687930u1f(new View.OnClickListener() { // from class: X.10ge
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                }));
            } else {
                arrayList.add(new C1687920u1e(new View.OnClickListener() { // from class: X.10gf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                }));
            }
            interfaceC19312510h1.LJFF(false);
        }
        TuxTextView tuxTextView = (TuxTextView) this.LJIIIIZZ.getValue();
        TuxTextView tuxTextView2 = (TuxTextView) this.LJIIIZ.getValue();
        tuxTextView.setOnTouchListener(new a(0.5f, 150L));
        if (z) {
            tuxTextView.setText(LJIIIIZZ(2131829349, 2131829350));
            C786410Ut5.h9(tuxTextView, new ACListenerS162S0100000_28(this, 224));
        } else {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            LIZIZ().setLayoutManager(new LinearLayoutManager(baseActivity));
            C786410Ut5.h9(tuxTextView, new ACListenerS162S0100000_28(this, 226));
            tuxTextView.setText(LJIIIIZZ(2131829308, 2131829309));
        }
        q0.LJIJ(tuxTextView, new C20094213jo() { // from class: X.10gd
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setRoleDescription(this.LIZ.LIZIZ.getString(2131823161));
            }
        });
        if (!z || !C19293810e0.LJIIJ()) {
            LIZLLL();
        }
        LIZ().LLILZIL = new InterfaceC19311410gq() { // from class: X.10gc
            @Override // X.InterfaceC19311410gq
            public final void LIZ() {
                C20684815ws.onEventV3("signup_channel_unfold");
                C19310510gh c19310510ghLIZ = this.LIZ.LIZ();
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, this.LIZ.LIZLLL.size() - this.LIZ.LJIIIZ());
                ViewPagerLoginView viewPagerLoginView = this.LIZ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
                Iterator<Integer> it2 = intRangeLJIILJJIL.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((AbstractC2098408Jy) it2).nextInt() + viewPagerLoginView.LJIIIZ()));
                }
                c19310510ghLIZ.LLILZLL.clear();
                c19310510ghLIZ.LLILZLL.addAll(arrayList2);
                ArrayList arrayList3 = new ArrayList(this.LIZ.LIZLLL);
                this.LIZ.LIZ.LJFF(true);
                this.LIZ.LIZ.LIZLLL();
                this.LIZ.LIZ().LLLI(arrayList3);
                HandlerHook.viewPostDelay(this.LIZ.LIZIZ(), new ARunnableS39S0101000_28(Math.max(arrayList3.size() - 1, 0), this.LIZ, 8), 300L);
            }
        };
        LIZ().LLLI(arrayList);
    }
}
