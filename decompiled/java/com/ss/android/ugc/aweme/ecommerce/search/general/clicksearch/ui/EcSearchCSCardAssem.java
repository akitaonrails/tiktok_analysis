package com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch.ui;

import X.C0DXR;
import X.C0PQI;
import X.C0PQX;
import X.C0PVA;
import X.C0Q3E;
import X.C0QRC;
import X.C418440Gaw;
import X.C814420VxA;
import X.EnumC1986407qI;
import X.EnumC645610PTz;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchCSCardAssem extends ReusedUISlotAssem<EcSearchCSCardAssem> implements InterfaceC712990Rxx<C0PQI>, View.OnAttachStateChangeListener {
    public RecyclerView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C0PQI LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final ValueAnimator LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.boj;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public EcSearchCSCardAssem() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(194)));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS260S0100000_10(this, 0));
        this.LLJLL = valueAnimatorOfInt;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004d A[PHI: r2
      0x004d: PHI (r2v5 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:36:0x004b, B:34:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005e A[PHI: r2 r4
      0x005e: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String) binds: [B:36:0x004b, B:43:0x0058, B:45:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String), (r4v3 java.lang.String) binds: [B:36:0x004b, B:43:0x0058, B:45:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(android.view.View r7) {
        /*
            r6 = this;
            boolean r0 = r6.LLJLILLLLZIIL
            if (r0 == 0) goto L5
            return
        L5:
            X.0PQI r0 = r6.LLJLIL
            if (r0 == 0) goto La1
            X.0PQX r0 = r0.LL
            if (r0 == 0) goto La1
            X.0QRC<com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse> r0 = r0.LJI
            if (r0 == 0) goto La1
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse r0 = (com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse) r0
            if (r0 == 0) goto La1
            java.util.List<com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord> r0 = r0.wordsList
            if (r0 == 0) goto La1
            int r5 = r0.size()
        L1f:
            X.0PQI r0 = r6.LLJLIL
            java.lang.String r4 = ""
            if (r0 == 0) goto L3d
            X.0PQX r0 = r0.LL
            if (r0 == 0) goto L3d
            X.0QRC<com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse> r0 = r0.LJI
            if (r0 == 0) goto L3d
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse r0 = (com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse) r0
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r0.logPbBean
            if (r0 == 0) goto L3d
            java.lang.String r3 = r0.getImprId()
            if (r3 != 0) goto L3e
        L3d:
            r3 = r4
        L3e:
            X.0PQI r1 = r6.LLJLIL
            if (r1 == 0) goto L4a
            X.0PQX r0 = r1.LL
            if (r0 == 0) goto L4a
            java.lang.String r2 = r0.LIZJ
            if (r2 != 0) goto L4d
        L4a:
            r2 = r4
            if (r1 == 0) goto L5e
        L4d:
            X.0PQX r0 = r1.LL
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.LJ
            if (r0 == 0) goto L56
            r4 = r0
        L56:
            X.0PQX r0 = r1.LL
            if (r0 == 0) goto L5e
            X.0PTz r1 = r0.LIZ
            if (r1 != 0) goto L60
        L5e:
            X.0PTz r1 = X.EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD
        L60:
            android.view.View r0 = r6.LLJL
            if (r0 == 0) goto L9f
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = X.C0Q3E.LIZ(r0)
        L68:
            java.util.Map r2 = X.C0PRU.LIZ(r3, r2, r4, r1, r0)
            java.lang.String r1 = "words_num"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r2.put(r1, r0)
            X.0pL7 r0 = X.C1507790pL7.LIZ
            r0.getClass()
            java.lang.String r0 = "trending_show"
            X.C1507790pL7.LIZJ(r0, r2)
            android.view.View r1 = r6.LLJL
            if (r1 == 0) goto L9b
            android.animation.ValueAnimator r0 = r6.LLJLL
            r0.start()
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
        L9b:
            r0 = 1
            r6.LLJLILLLLZIIL = r0
            return
        L9f:
            r0 = 0
            goto L68
        La1:
            r5 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch.ui.EcSearchCSCardAssem.onViewAttachedToWindow(android.view.View):void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = view;
        view.addOnAttachStateChangeListener(this);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.f_o);
        this.LLJJLIIIJLLLLLLLZ = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new WrapGridLayoutManager(2, 1, view.getContext(), false));
        RecyclerView recyclerView3 = this.LLJJLIIIJLLLLLLLZ;
        if (recyclerView3 != null) {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.addItemDecoration(new C0DXR() { // from class: X.0DWf
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                boolean zLIZJ = C444960Hcc.LIZJ(view2.getContext());
                int childAdapterPosition = recyclerView4.getChildAdapterPosition(view2);
                if (childAdapterPosition > 1) {
                    rect.top = this.LL;
                }
                int i = childAdapterPosition % 2;
                if (i == 0) {
                    if (zLIZJ) {
                        rect.left = this.LL / 2;
                        return;
                    } else {
                        rect.right = this.LL / 2;
                        return;
                    }
                }
                if (i != 1) {
                    return;
                }
                if (zLIZJ) {
                    rect.right = this.LL / 2;
                } else {
                    rect.left = this.LL / 2;
                }
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (this.LLJLL.isRunning()) {
            this.LLJLL.cancel();
            View view2 = this.LLJL;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(194));
            }
            View view3 = this.LLJL;
            if (view3 != null) {
                view3.requestLayout();
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0PQI c0pqi) {
        EcClickSearchResponse ecClickSearchResponse;
        List<EcClickSearchWord> list;
        String imprId;
        String str;
        EcClickSearchResponse ecClickSearchResponse2;
        LogPbBean logPbBean;
        C0PQI c0pqi2 = c0pqi;
        if (!Intrinsics.LJFF(c0pqi2, this.LLJLIL)) {
            this.LLJLILLLLZIIL = false;
        }
        this.LLJLIL = c0pqi2;
        C0QRC<EcClickSearchResponse> c0qrc = c0pqi2.LL.LJI;
        ISearchContextAbility iSearchContextAbilityLIZ = null;
        if (c0qrc != null && (ecClickSearchResponse = c0qrc.LIZIZ) != null && (list = ecClickSearchResponse.wordsList) != null && (!list.isEmpty())) {
            RecyclerView recyclerView = this.LLJJLIIIJLLLLLLLZ;
            if (recyclerView == null) {
                recyclerView = null;
            }
            C0PVA c0pva = new C0PVA();
            C0QRC<EcClickSearchResponse> c0qrc2 = c0pqi2.LL.LJI;
            String str2 = "";
            if (c0qrc2 == null || (ecClickSearchResponse2 = c0qrc2.LIZIZ) == null || (logPbBean = ecClickSearchResponse2.logPbBean) == null || (imprId = logPbBean.getImprId()) == null) {
                imprId = "";
            }
            C0PQX c0pqx = c0pqi2.LL;
            String str3 = c0pqx.LIZJ;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c0pqx.LJ;
            if (str4 != null) {
                str2 = str4;
            }
            EnumC645610PTz enumC645610PTz = c0pqx.LIZ;
            if (enumC645610PTz == null) {
                enumC645610PTz = EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD;
            }
            View view = this.LLJL;
            if (view != null) {
                iSearchContextAbilityLIZ = C0Q3E.LIZ(view);
            }
            c0pva.LL = list;
            c0pva.LLILLJJLI = imprId;
            c0pva.LLILLL = str3;
            c0pva.LLILZ = str2;
            c0pva.LLILZLL = enumC645610PTz;
            c0pva.LLIZ = iSearchContextAbilityLIZ;
            for (EcClickSearchWord ecClickSearchWord : list) {
                if (ecClickSearchWord == null || (str = ecClickSearchWord.imageUrl) == null || str.length() == 0) {
                    c0pva.LLILZIL = EnumC1986407qI.TEXT;
                }
            }
            c0pva.notifyDataSetChanged();
            recyclerView.setAdapter(c0pva);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0PQI c0pqi) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0PQI c0pqi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
