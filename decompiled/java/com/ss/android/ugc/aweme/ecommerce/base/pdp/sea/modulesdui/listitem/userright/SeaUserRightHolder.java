package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright;

import X.C1755600vmo;
import X.C955603oQ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class SeaUserRightHolder extends PdpHolder<C955603oQ> {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public final Fragment LLJJIJIL;
    public TuxTextView LLJJJ;
    public int LLJJJIL;
    public final StringBuilder LLJJJJ;
    public final String LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH
    public final boolean W5() {
        return ((C955603oQ) this.LLILLJJLI).LLILLJJLI;
    }

    public final TuxTextView c6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ocd) : null;
            this.LLJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightHolder.rr(java.lang.Object):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaUserRightHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(0, C1755600vmo.LIZ(R.layout.axx, context, viewGroup, false, false), true);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJJ = new StringBuilder();
        this.LLJJJJJIL = CardStruct.IStatusCode.DEFAULT;
        new LinkedList();
    }
}
