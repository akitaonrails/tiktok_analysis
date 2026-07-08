package com.ss.android.ugc.aweme.comment.widgets;

import X.C0RD4;
import X.C1349800lEI;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseCommentWidget extends Widget implements Observer<C0RD4> {
    public Aweme LLIZLLLIL;
    public C1349800lEI LLJ;

    public void LJIILLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final Aweme LJIILL() {
        Aweme aweme = this.LLIZLLLIL;
        if (aweme != null) {
            return aweme;
        }
        return null;
    }

    public final boolean LJIIZILJ() {
        return this.LLIZLLLIL != null;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        LJIILLIIL();
        DataCenter dataCenter = this.LLILZ;
        dataCenter.yQ2("comment_visible", this, true);
        dataCenter.yQ2("comment_aweme_and_params", this, true);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        this.LLILZ.AQ2(this);
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: LJIJ, reason: merged with bridge method [inline-methods] */
    public void onChanged(C0RD4 c0rd4) {
        Aweme aweme;
        C1349800lEI c1349800lEI;
        String str = c0rd4.LIZ;
        int iHashCode = str.hashCode();
        Object obj = null;
        if (iHashCode != 278836882) {
            if (iHashCode == 2016314694 && str.equals("comment_aweme_and_params")) {
                Object obj2 = c0rd4.LIZIZ;
                if (obj2 == null) {
                    obj2 = null;
                }
                Pair pair = (Pair) obj2;
                if (pair != null && (aweme = (Aweme) pair.getFirst()) != null) {
                    this.LLIZLLLIL = aweme;
                    Object obj3 = c0rd4.LIZIZ;
                    if (obj3 != null) {
                        obj = obj3;
                    }
                    Pair pair2 = (Pair) obj;
                    if (pair2 != null && (c1349800lEI = (C1349800lEI) pair2.getSecond()) != null) {
                        this.LLJ = c1349800lEI;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!str.equals("comment_visible")) {
            return;
        }
        Object obj4 = c0rd4.LIZIZ;
        if (obj4 != null) {
            obj = obj4;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        bool.booleanValue();
    }
}
