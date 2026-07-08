package com.ss.android.ugc.aweme.translation.viewmodel;

import X.AbstractC1361510lXB;
import X.AnonymousClass1634;
import X.AnonymousClass1636;
import X.C0S5G;
import X.C0S5K;
import X.C0S5P;
import X.C0S5Z;
import X.C0SBA;
import X.C1055470dZZ;
import X.C161N;
import X.C161Q;
import X.C163A;
import X.C164B;
import X.C19719612Di;
import X.C20703515zt;
import X.C207107162n;
import X.C207118162y;
import X.C23250099c;
import X.C2788016c;
import X.C281430B1h;
import X.C305430By9;
import X.C709290Rrz;
import X.C710110RtJ;
import X.C710120RtK;
import X.C710130RtL;
import X.C710140RtM;
import X.C710150RtN;
import X.C710160RtO;
import X.C710210RtT;
import X.C715660S5k;
import X.EnumC207101162h;
import X.EnumC715590S5d;
import X.InterfaceC0148002o;
import X.InterfaceC715620S5g;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.commercialize.cla.service.CommerceCLAServiceImpl;
import com.ss.android.ugc.aweme.commercialize.cla.service.ICommerceCLAService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TranslationStatusViewModel extends FeedBaseViewModel<C0S5G> implements InterfaceC715620S5g {
    public static C0S5P LLILZIL;
    public final C207118162y LL = new C207118162y(ViewModelKt.getViewModelScope(this));
    public boolean LLILLJJLI;
    public String LLILLL;
    public int LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0S5G(C709290Rrz.LIZIZ, null, null, null, null, false, null, null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C1055470dZZ c1055470dZZLIZ;
        Object next;
        C161Q c161q;
        super.onPrepared();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C710210RtT(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C710120RtK(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C710130RtL(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C710140RtM(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C710150RtN(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C710110RtJ(this, null), 3);
        if (C281430B1h.LIZ()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C710160RtO(this, null), 3);
        }
        ICommerceCLAService iCommerceCLAServiceLIZIZ = CommerceCLAServiceImpl.LIZIZ();
        if (iCommerceCLAServiceLIZIZ == null || (c1055470dZZLIZ = iCommerceCLAServiceLIZIZ.LIZ()) == null) {
            return;
        }
        C20703515zt.LIZ.getClass();
        C161N c161n = C20703515zt.LIZIZ;
        EnumC207101162h enumC207101162h = EnumC207101162h.COMMERCE;
        c161n.LJIL(enumC207101162h, c1055470dZZLIZ, null);
        C0S5Z c0s5z = new C0S5Z(this);
        if (C305430By9.LIZ) {
            C207118162y c207118162y = this.LL;
            if (c207118162y.LJIJ().containsKey(enumC207101162h)) {
                List<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> list = c207118162y.LJIJJ().LIZ;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((AnonymousClass1636) it2.next()).LIZJ() == enumC207101162h) {
                            return;
                        }
                    }
                }
            }
            C20703515zt.LIZ.getClass();
            Iterator<T> it3 = C20703515zt.LIZIZ.LLFF().entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it3.next();
                    if (((Map.Entry) next).getKey() == enumC207101162h) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                Object first = ((Pair) entry.getValue()).getFirst();
                if ((first instanceof C161Q) && (c161q = (C161Q) first) != null) {
                    C207107162n c207107162n = new C207107162n(enumC207101162h, c161q);
                    ((ConcurrentHashMap) c207118162y.LJIL.getValue()).put(enumC207101162h, new Pair(c207107162n, new AnonymousClass1634(enumC207101162h, c207107162n, c161q, c0s5z)));
                    return;
                }
            }
            c207118162y.LJIJ().remove(enumC207101162h);
            C19719612Di.LJJIIJ(c207118162y.LJIJJ().LIZ, new AwS590S0100000_11(enumC207101162h, 440), true);
        }
    }

    @Override // X.InterfaceC715620S5g
    public final C0SBA Dk() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        if (!Intrinsics.LJFF(videoItemParams.getAweme().getAid(), this.LLILLL)) {
            this.LLILLL = videoItemParams.getAweme().getAid();
            C0S5P c0s5p = LLILZIL;
            if (c0s5p != null) {
                LLILZIL = null;
            }
            return C0S5G.LIZ(new C0S5G(C709290Rrz.LIZIZ, null, null, null, null, false, null, null, null), (C0S5P) this.LL.LJJIIJ(videoItemParams, c0s5p, null), null, null, null, null, false, null, null, null, 478);
        }
        return interfaceC0148002o;
    }

    public final void wQ2(EnumC715590S5d enumC715590S5d, boolean z, boolean z2) {
        C2788016c c2788016cLIZ;
        VideoItemParams item;
        Aweme aweme;
        if (z2 && enumC715590S5d == EnumC715590S5d.CLICK && (item = getItem()) != null && (aweme = item.getAweme()) != null) {
            c2788016cLIZ = C715660S5k.LIZ(aweme);
        } else {
            c2788016cLIZ = null;
        }
        if (z) {
            this.LL.LJIJJLI(enumC715590S5d);
        } else if (enumC715590S5d != EnumC715590S5d.DO_NOT_TRANSLATE_CHANGED && enumC715590S5d != EnumC715590S5d.COMBINE_ENTRANCE_MASTER_TOGGLE && (this.LL.LJJIIZI.getValue() instanceof C0S5K)) {
            this.LL.LJIIIIZZ(enumC715590S5d, false);
        }
        if (z2 && enumC715590S5d == EnumC715590S5d.CLICK) {
            setState(new AwS220S0300000_11(this, enumC715590S5d, c2788016cLIZ, 11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(boolean r11, X.EnumC715590S5d r12, java.lang.String r13, X.InterfaceC665370Q7z r14, X.C2788016c r15) {
        /*
            r10 = this;
            r3 = 2
            r4 = 1
            r9 = 0
            if (r13 != 0) goto L14
            if (r12 == 0) goto La1
            int[] r1 = X.C715580S5c.LIZ
            int r0 = r12.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L55
            if (r0 != r3) goto La1
            r13 = r9
        L14:
            if (r15 != 0) goto L28
            java.lang.Object r0 = r10.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L53
            X.016c r15 = X.C715660S5k.LIZ(r0)
        L28:
            r0 = 3
            X.006d[] r2 = new X.InterfaceC0241006d[r0]
            X.003X r1 = new X.003X
            r1.<init>()
            r0 = 0
            r2[r0] = r1
            if (r13 == 0) goto L51
            X.004T r0 = new X.004T
            r0.<init>(r13)
        L3a:
            r2[r4] = r0
            X.014e r4 = new X.014e
            if (r12 == 0) goto L5b
            int[] r1 = X.C715580S5c.LIZ
            int r0 = r12.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case -1: goto L5b;
                case 0: goto L4b;
                case 1: goto L58;
                case 2: goto L5e;
                case 3: goto L5b;
                case 4: goto L5b;
                case 5: goto L5b;
                case 6: goto L5b;
                case 7: goto L5b;
                case 8: goto L5b;
                case 9: goto L5b;
                case 10: goto L5b;
                default: goto L4b;
            }
        L4b:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L51:
            r0 = r9
            goto L3a
        L53:
            r15 = r9
            goto L28
        L55:
            java.lang.String r13 = "feed"
            goto L14
        L58:
            java.lang.String r5 = "click_button"
            goto L60
        L5b:
            java.lang.String r5 = ""
            goto L60
        L5e:
            java.lang.String r5 = "switch_toggle"
        L60:
            X.0S5d r0 = X.EnumC715590S5d.COMBINE_ENTRANCE_MASTER_TOGGLE
            if (r12 != r0) goto L91
            r6 = r9
        L65:
            if (r15 == 0) goto L8e
            java.lang.String r7 = r15.LIZ
            int r0 = r15.LIZIZ
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r0 = r15.LIZJ
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L75:
            r4.<init>(r5, r6, r7, r8, r9)
            r2[r3] = r4
            java.util.List r2 = X.C13LQ.LJIJI(r2)
            if (r11 == 0) goto L8b
            java.lang.Class<com.ss.android.ugc.aweme.cla.et.newet.ClickSeeTranslationEvent> r1 = com.ss.android.ugc.aweme.cla.et.newet.ClickSeeTranslationEvent.class
        L82:
            X.0175 r0 = new X.0175
            r0.<init>()
            X.C207069161b.LIZJ(r1, r14, r0, r2)
            return
        L8b:
            java.lang.Class<com.ss.android.ugc.aweme.cla.et.newet.ClickSeeOriginalEvent> r1 = com.ss.android.ugc.aweme.cla.et.newet.ClickSeeOriginalEvent.class
            goto L82
        L8e:
            r7 = r9
            r8 = r9
            goto L75
        L91:
            com.ss.android.ugc.aweme.service.ICaptionKevaService r0 = X.C746760TRa.LIZ()
            boolean r0 = r0.LJLILLLLZI()
            if (r0 == 0) goto L9e
            java.lang.String r6 = "on"
            goto L65
        L9e:
            java.lang.String r6 = "off"
            goto L65
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel.vQ2(boolean, X.0S5d, java.lang.String, X.0Q7z, X.016c):void");
    }
}
