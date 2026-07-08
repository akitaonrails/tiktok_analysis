package com.ss.android.ugc.aweme.notification.open.component.cell;

import X.AbstractC1906850zil;
import X.C01GW;
import X.C0DTR;
import X.C1901810zad;
import X.C1901990zav;
import X.C1906660ziS;
import X.C1906880zio;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1906270zhp;
import X.InterfaceC1891350zJl;
import X.InterfaceC1906670ziT;
import X.ViewOnClickListenerC1906680ziU;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.notification.open.component.viewmodel.NoticeViewModel;
import com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder;
import com.ss.android.ugc.aweme.notification.vh.s;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseNoticeCell<ITEM extends C1901810zad, HOLDER extends s> extends PowerCell<ITEM> implements InterfaceC1906670ziT {
    public HOLDER LLILZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28((BaseNoticeCell) this, 322));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28((BaseNoticeCell) this, 323));
    public final boolean LLILLL = true;
    public final C01GW LLILZIL = C0DTR.LIZJ(new AwS572S0100000_28((BaseNoticeCell) this, 321));

    public abstract void I5(ITEM item);

    public abstract MTTemplateNotificationHolder L5(View view);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewOnClickListenerC1906680ziU viewOnClickListenerC1906680ziU = this.LLILZ;
        if (viewOnClickListenerC1906680ziU == null) {
            viewOnClickListenerC1906680ziU = null;
        }
        viewOnClickListenerC1906680ziU.onAttached();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ViewOnClickListenerC1906680ziU viewOnClickListenerC1906680ziU = this.LLILZ;
        if (viewOnClickListenerC1906680ziU == null) {
            viewOnClickListenerC1906680ziU = null;
        }
        viewOnClickListenerC1906680ziU.onDetached();
    }

    @Override // X.InterfaceC1906670ziT
    public final int s0() {
        return getLayoutPosition();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        NoticeViewModel noticeViewModel;
        Fragment fragment;
        C1901810zad c1901810zad = (C1901810zad) interfaceC1891350zJl;
        super.onBindItemView(c1901810zad);
        C1906880zio c1906880zio = C1906660ziS.LIZ;
        AbstractC1906850zil abstractC1906850zil = this.LLILZ;
        AbstractC1906850zil abstractC1906850zil2 = null;
        if (abstractC1906850zil == null) {
            abstractC1906850zil = null;
        }
        C1901990zav c1901990zav = (C1901990zav) this.LLILZIL.getValue();
        if (c1901990zav != null) {
            noticeViewModel = c1901990zav.LLILLJJLI;
        } else {
            noticeViewModel = null;
        }
        C1901990zav c1901990zav2 = (C1901990zav) this.LLILZIL.getValue();
        C1901990zav c1901990zav3 = (C1901990zav) this.LLILZIL.getValue();
        if (c1901990zav3 != null) {
            fragment = c1901990zav3.LL.LLIZLLLIL;
        } else {
            fragment = null;
        }
        abstractC1906850zil.mClickListener = c1901990zav2;
        abstractC1906850zil.vm = noticeViewModel;
        abstractC1906850zil.setLifecycleOwner(this);
        abstractC1906850zil.mFragment = fragment;
        C1906880zio c1906880zio2 = C1906660ziS.LIZ;
        if (c1906880zio2 != null) {
            abstractC1906850zil.applyNewStyle(c1906880zio2);
        }
        abstractC1906850zil.applyNewCover(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
        abstractC1906850zil.viewHolderPositionDelegate = this;
        AbstractC1906850zil abstractC1906850zil3 = this.LLILZ;
        if (abstractC1906850zil3 != null) {
            abstractC1906850zil2 = abstractC1906850zil3;
        }
        abstractC1906850zil2.bindNotice(c1901810zad.LL, getLayoutPosition(), EnumC1906270zhp.FRIENDS_TAB);
        I5(c1901810zad);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), getLayoutId(), viewGroup, false);
        this.LLILZ = L5(viewTd);
        return viewTd;
    }
}
