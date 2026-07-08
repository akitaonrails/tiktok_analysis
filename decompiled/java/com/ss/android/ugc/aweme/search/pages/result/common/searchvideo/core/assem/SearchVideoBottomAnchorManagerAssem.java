package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C0QCK;
import X.C13LE;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C659520Ptu;
import X.C659990Puf;
import X.C660400PvK;
import X.C660610Pvf;
import X.C660840Pw2;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC660460PvQ;
import X.InterfaceC660500PvU;
import X.InterfaceC712990Rxx;
import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS96S0201000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoBottomAnchorManagerAssem extends ReusedUIContentAssem<SearchVideoBottomAnchorManagerAssem> implements InterfaceC712990Rxx<C659520Ptu>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final int LLJJJJ;
    public final C0QCK LLJJJJJIL;
    public int LLJJJJLIIL;
    public ValueAnimator LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchVideoBottomAnchorManagerAssem.class, "searchVideoHolderAbility", "getSearchVideoHolderAbility()Ltiktok/communication/LazyAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchVideoScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchVideoScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public SearchVideoBottomAnchorManagerAssem() {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJJJJ = R.id.cb3;
        this.LLJJJJJIL = new C0QCK(ISearchVideoHolderAbility.class);
    }

    public final void ep(int i) {
        int i2 = i - this.LLJJJJLIIL;
        if (i2 == 0) {
            return;
        }
        cp(i2, LJJIJL().findViewById(R.id.vqm));
        cp(i2, LJJIJL().findViewById(R.id.wm6));
        this.LLJJJJLIIL = i;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0QCK c0qck = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        c0qck.LIZ(this).LIZIZ(this, new AwS589S0100000_10(this, 221));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        ISearchVideoAnchorPriorityProtocol iSearchVideoAnchorPriorityProtocol;
        List<Integer> listYD2;
        C659520Ptu c659520Ptu2 = c659520Ptu;
        Iterator it2 = ((List) C659990Puf.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            List<Integer> listYD22 = ((ISearchVideoAnchorPriorityProtocol) it2.next()).yD2();
            if (listYD22 != null) {
                Iterator<Integer> it3 = listYD22.iterator();
                while (it3.hasNext()) {
                    View viewFindViewById = LJJIJL().findViewById(it3.next().intValue());
                    if (viewFindViewById != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById);
                    }
                }
            }
        }
        Object obj = C659990Puf.LIZIZ().get(c659520Ptu2.LLILLL);
        if ((obj instanceof ISearchVideoAnchorPriorityProtocol) && (iSearchVideoAnchorPriorityProtocol = (ISearchVideoAnchorPriorityProtocol) obj) != null && (listYD2 = iSearchVideoAnchorPriorityProtocol.yD2()) != null) {
            Iterator<Integer> it4 = listYD2.iterator();
            while (it4.hasNext()) {
                View viewFindViewById2 = LJJIJL().findViewById(it4.next().intValue());
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                }
            }
        }
        InterfaceC660500PvU interfaceC660500PvU = c659520Ptu2.LLILLL;
        if ((interfaceC660500PvU instanceof InterfaceC660460PvQ) && !Intrinsics.LJFF(interfaceC660500PvU, C660610Pvf.LIZ)) {
            int i = C660400PvK.LIZ;
            C660400PvK.LIZ(LJJIJL(), Integer.valueOf(this.LLJJJJ));
        } else {
            int i2 = C660400PvK.LIZ;
            C660400PvK.LIZ(LJJIJL(), null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    public static void cp(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i2 = marginLayoutParams.bottomMargin + i;
            if (i2 < 0) {
                i2 = 0;
            }
            marginLayoutParams.bottomMargin = i2;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public final void dp(C660840Pw2 c660840Pw2, AwS96S0201000_10 awS96S0201000_10) {
        ValueAnimator valueAnimator = this.LLJJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (c660840Pw2 == null) {
            awS96S0201000_10.invoke(0);
            return;
        }
        int currentTotalHeight = c660840Pw2.getCurrentTotalHeight();
        int secondLineCurrentHeight = currentTotalHeight - c660840Pw2.getSecondLineCurrentHeight();
        if (currentTotalHeight == secondLineCurrentHeight) {
            awS96S0201000_10.invoke(Integer.valueOf(secondLineCurrentHeight));
            return;
        }
        awS96S0201000_10.invoke(Integer.valueOf(currentTotalHeight));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(currentTotalHeight, secondLineCurrentHeight);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS260S0100000_10(awS96S0201000_10, 7));
        valueAnimatorOfInt.start();
        this.LLJJL = valueAnimatorOfInt;
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
