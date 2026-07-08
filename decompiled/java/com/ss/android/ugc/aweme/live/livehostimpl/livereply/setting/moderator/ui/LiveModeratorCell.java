package com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C13LE;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C751680TeA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveModeratorCell extends PowerCell<C751680TeA> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveModeratorCell.class, "liveModeratorListViewModel", "getLiveModeratorListViewModel()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/setting/moderator/data/LiveModeratorListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LiveModeratorCell.class, "liveReplySettingViewModel", "getLiveReplySettingViewModel()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/setting/viewmodel/LiveReplySettingViewModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public LiveModeratorCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveModeratorListViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 566);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(129);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 552), awS571S0100000_27, AFwS216S0000000_27.get$arr$(146), new AwS571S0100000_27((C03K6) this, 542), new AwS571S0100000_27((C03K6) this, 553), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 556), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 559), null, new AwS571S0100000_27((C03K6) this, 562));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27((C03K6) this, 538);
            AwS571S0100000_27 awS571S0100000_273 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 540);
            AwS571S0100000_27 awS571S0100000_274 = new AwS571S0100000_27(c19719912DlLIZ, 543);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS571S0100000_272, 23));
            AwS571S0100000_27 awS571S0100000_275 = new AwS571S0100000_27(c01gwLIZIZ, 548);
            AwS571S0100000_27 awS571S0100000_276 = new AwS571S0100000_27(c01gwLIZIZ, 551);
            AwS571S0100000_27 awS571S0100000_277 = new AwS571S0100000_27(c01gwLIZIZ, 554);
            AwS571S0100000_27 awS571S0100000_278 = new AwS571S0100000_27(c01gwLIZIZ, 557);
            AwS571S0100000_27 awS571S0100000_279 = new AwS571S0100000_27(c01gwLIZIZ, 560);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS571S0100000_274, awS571S0100000_27, new C452080Ho6(), awS571S0100000_275, awS571S0100000_276, awS571S0100000_273, aFwS269S0000000_27, awS571S0100000_277, awS571S0100000_278, awS571S0100000_279);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 563), awS571S0100000_27, AFwS216S0000000_27.get$arr$(145), new AwS571S0100000_27((C03K6) this, 569), new AwS571S0100000_27((C03K6) this, 571), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 573), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 575), null, new AwS571S0100000_27((C03K6) this, 577));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 578), awS571S0100000_27, AFwS216S0000000_27.get$arr$(147), new AwS571S0100000_27((C03K6) this, 580), new AwS571S0100000_27((C03K6) this, 582), new AwS571S0100000_27((C03K6) this, 585), aFwS269S0000000_27, null, null, new AwS571S0100000_27((C03K6) this, 587));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LiveReplySettingViewModel.class);
        AwS571S0100000_27 awS571S0100000_2710 = new AwS571S0100000_27(c19719912DlLIZ2, 533);
        AFwS269S0000000_27 aFwS269S0000000_272 = AFwS269S0000000_27.get$arr$(128);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ2, 537), awS571S0100000_2710, AFwS216S0000000_27.get$arr$(144), new AwS571S0100000_27((C03K6) this, 541), new AwS571S0100000_27((C03K6) this, 544), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 546), aFwS269S0000000_272, new AwS571S0100000_27((C03K6) this, 549), null, new AwS571S0100000_27((C03K6) this, 555));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS571S0100000_27 awS571S0100000_2711 = new AwS571S0100000_27((C03K6) this, 558);
            AwS571S0100000_27 awS571S0100000_2712 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 561);
            AwS571S0100000_27 awS571S0100000_2713 = new AwS571S0100000_27(c19719912DlLIZ2, 564);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS571S0100000_2711, 24));
            AwS571S0100000_27 awS571S0100000_2714 = new AwS571S0100000_27(c01gwLIZIZ2, 568);
            AwS571S0100000_27 awS571S0100000_2715 = new AwS571S0100000_27(c01gwLIZIZ2, 570);
            AwS571S0100000_27 awS571S0100000_2716 = new AwS571S0100000_27(c01gwLIZIZ2, 572);
            AwS571S0100000_27 awS571S0100000_2717 = new AwS571S0100000_27(c01gwLIZIZ2, 574);
            AwS571S0100000_27 awS571S0100000_2718 = new AwS571S0100000_27(c01gwLIZIZ2, 576);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS571S0100000_2713, awS571S0100000_2710, new C452080Ho6(), awS571S0100000_2714, awS571S0100000_2715, awS571S0100000_2712, aFwS269S0000000_272, awS571S0100000_2716, awS571S0100000_2717, awS571S0100000_2718);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ2, 579), awS571S0100000_2710, AFwS216S0000000_27.get$arr$(148), new AwS571S0100000_27((C03K6) this, 581), new AwS571S0100000_27((C03K6) this, 583), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 584), aFwS269S0000000_272, new AwS571S0100000_27((C03K6) this, 586), null, new AwS571S0100000_27((C03K6) this, 534));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ2, 536), awS571S0100000_2710, AFwS216S0000000_27.get$arr$(143), new AwS571S0100000_27((C03K6) this, 539), new AwS571S0100000_27((C03K6) this, 545), new AwS571S0100000_27((C03K6) this, 547), aFwS269S0000000_272, null, null, new AwS571S0100000_27((C03K6) this, 550));
        }
        this.LLILLJJLI = assemVMLazy2;
        this.LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 535));
        this.LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 567));
        this.LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 565));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C751680TeA r5) {
        /*
            r4 = this;
            X.0JBN r1 = X.C1819620xS4.LIZ()
            X.0zJl r0 = r4.getItem()
            X.0TeA r0 = (X.C751680TeA) r0
            r3 = 0
            if (r0 == 0) goto L89
            X.0Tce r0 = r0.LL
            if (r0 == 0) goto L89
            com.bytedance.android.live.base.model.ImageModel r0 = r0.LJ
        L13:
            X.0kZf r1 = r1.LJIIIZ(r0)
            X.01GW r0 = r4.LLILLL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r1.LJJI(r0)
            X.01GW r0 = r4.LLILZ
            java.lang.Object r2 = r0.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            X.0zJl r0 = r4.getItem()
            X.0TeA r0 = (X.C751680TeA) r0
            if (r0 == 0) goto L87
            X.0Tce r0 = r0.LL
            if (r0 == 0) goto L87
            java.lang.String r1 = r0.LIZLLL
        L38:
            X.0zJl r0 = r4.getItem()
            X.0TeA r0 = (X.C751680TeA) r0
            if (r0 == 0) goto L46
            X.0Tce r0 = r0.LL
            if (r0 == 0) goto L46
            java.lang.String r3 = r0.LIZJ
        L46:
            java.lang.String r0 = X.C0KVU.LIZIZ(r1, r3)
            r2.setText(r0)
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r2 = r0.getValue()
            X.18qq r2 = (X.C21411818qq) r2
            X.0Tce r0 = r5.LL
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r0.LJIIIZ
            if (r1 == 0) goto L85
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L85
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L85
        L70:
            r2.setChecked(r1)
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r2 = r0.getValue()
            X.18qq r2 = (X.C21411818qq) r2
            X.0yck r1 = new X.0yck
            r0 = 1
            r1.<init>(r4, r0)
            X.C786410Ut5.C7(r2, r1)
            return
        L85:
            r1 = 0
            goto L70
        L87:
            r1 = r3
            goto L38
        L89:
            r0 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.ui.LiveModeratorCell.onBindItemView(X.0TeA):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Object obj;
        Integer num;
        C751680TeA c751680TeA = (C751680TeA) interfaceC1891350zJl;
        boolean z = true;
        if ((!list.isEmpty()) && (obj = ListProtector.get(list, 0)) != null) {
            if ((obj instanceof Integer) && Intrinsics.LJFF(obj, 1)) {
                C21411818qq c21411818qq = (C21411818qq) this.LLILZIL.getValue();
                Map<Integer, Integer> map = c751680TeA.LL.LJIIIZ;
                if (map == null || (num = map.get(17)) == null || num.intValue() != 1) {
                    z = false;
                }
                c21411818qq.setChecked(z);
                return;
            }
            onBindItemView(c751680TeA);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.deh, false, 4, null);
    }
}
