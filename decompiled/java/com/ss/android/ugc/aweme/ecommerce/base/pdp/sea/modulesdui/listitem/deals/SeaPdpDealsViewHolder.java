package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals;

import X.C01GW;
import X.C13LE;
import X.C1743750vTh;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C418440Gaw;
import X.C449420Hjo;
import X.C452501pT;
import X.C736702uD;
import X.C814420VxA;
import X.InterfaceC1010403xG;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes36.dex */
public final class SeaPdpDealsViewHolder extends AbsFullSpanVH<C736702uD> implements InterfaceC1010403xG {
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final C01GW LLJJIJIL;
    public final View LLJJJ;
    public final TuxTextView LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final HorizontalScrollView LLJJJJJIL;
    public final LinearLayout LLJJJJLIIL;
    public C449420Hjo LLJJL;
    public final LinkedList<C449420Hjo> LLJJLIIIJLLLLLLLZ;
    public final List<C449420Hjo> LLJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        if (!this.LLJL.isEmpty()) {
            c6().ES2(this);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        if (!this.LLJL.isEmpty()) {
            c6().wS2(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C449420Hjo c449420Hjo;
        try {
            c6().ES2(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1743750vTh.LIZ(this);
        ((ArrayList) this.LLJL).clear();
        this.LLJJLIIIJLLLLLLLZ.clear();
        LinearLayout linearLayout = this.LLJJJJLIIL;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if ((childAt instanceof C449420Hjo) && (c449420Hjo = (C449420Hjo) childAt) != null) {
                c449420Hjo.LLIZLLLIL.LJJJJLI();
            }
        }
        C449420Hjo c449420Hjo2 = this.LLJJL;
        if (c449420Hjo2 != null) {
            c449420Hjo2.LLIZLLLIL.LJJJJLI();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpDealsViewHolder(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.aw3, context, viewGroup, false, true));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 62));
        this.LLJJJ = this.itemView.findViewById(R.id.ji7);
        this.LLJJJIL = (TuxTextView) this.itemView.findViewById(R.id.title);
        this.LLJJJJ = (TuxTextView) this.itemView.findViewById(R.id.fws);
        this.LLJJJJJIL = (HorizontalScrollView) this.itemView.findViewById(R.id.jt7);
        this.LLJJJJLIIL = (LinearLayout) this.itemView.findViewById(R.id.nc9);
        this.LLJJLIIIJLLLLLLLZ = new LinkedList<>();
        this.LLJL = new ArrayList();
    }

    @Override // X.InterfaceC1010403xG
    public final void LJLI(long j) {
        for (C449420Hjo c449420Hjo : (ArrayList) this.LLJL) {
            if (c449420Hjo.LLIZLLLIL.getVisibility() == 0) {
                c449420Hjo.LLIZLLLIL.LJJJJLL();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:284:0x0731, code lost:
    
        if (r10.intValue() == r7) goto L285;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cf A[PHI: r20
      0x02cf: PHI (r20v17 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabel>) = 
      (r20v5 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabel>)
      (r20v18 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabel>)
     binds: [B:142:0x02cd, B:140:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0544 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.1Ddq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.AttributeSet, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v14 */
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
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 2433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals.SeaPdpDealsViewHolder.rr(java.lang.Object):void");
    }
}
