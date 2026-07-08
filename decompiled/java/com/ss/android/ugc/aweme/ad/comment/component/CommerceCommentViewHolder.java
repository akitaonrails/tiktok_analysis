package com.ss.android.ugc.aweme.ad.comment.component;

import X.AbstractC1049500dPw;
import X.AbstractC1066520drO;
import X.C1049590dQ5;
import X.C1049600dQ6;
import X.C1066490drL;
import X.C2019707vf;
import X.C988150boz;
import X.C988850bq7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceCommentViewHolder extends AbstractC1066520drO<C988150boz> implements View.OnClickListener, View.OnLongClickListener, Observer<AbstractC1049500dPw>, LifecycleEventObserver {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // X.AbstractC1066520drO
    public final void I5(C1066490drL c1066490drL) {
        throw null;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(AbstractC1049500dPw abstractC1049500dPw) {
        if (!(abstractC1049500dPw instanceof C1049600dQ6) && !(abstractC1049500dPw instanceof C1049590dQ5)) {
        } else {
            throw null;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view == null) {
            return false;
        }
        view.getContext().getResources().getString(2131850744);
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C2019707vf.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                throw null;
            }
        } else {
            C988850bq7.LIZJ(hashCode());
        }
    }
}
