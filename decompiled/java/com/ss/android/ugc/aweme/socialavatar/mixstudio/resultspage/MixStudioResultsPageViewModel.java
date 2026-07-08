package com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage;

import X.C01GW;
import X.C05YD;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0HKU;
import X.C0HQU;
import X.C0HQV;
import X.C0HRU;
import X.C0HRV;
import X.C0HRW;
import X.C0PEM;
import X.C10EU;
import X.C1220000hqw;
import X.C1372805Yw;
import X.C1373105Yz;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1559260qg8;
import X.C1910890zpH;
import X.C1DFB;
import X.C2252611DEt;
import X.C23250099c;
import X.C440440HOw;
import X.C440500HPc;
import X.C440830HQj;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1910860zpE;
import X.EnumC441640HTm;
import X.InterfaceC1364105Vn;
import X.InterfaceC440230HOb;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioResultsPageViewModel extends AssemViewModel<C0HQU> {
    public static final C1910890zpH LLILZIL = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.SOCIAL_AVATAR);
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C440500HPc.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(290));
    public final C736950SvV LLILLL;
    public final C01GW LLILZ;

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            r8 = this;
            X.0HQU r1 = new X.0HQU
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository r0 = r8.zQ2()
            if (r0 == 0) goto L16
            X.05YD r0 = r0.LJFF()
            if (r0 == 0) goto L16
            java.lang.Object r7 = r0.getValue()
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L18
        L16:
            X.13BV r7 = X.C13BV.INSTANCE
        L18:
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository r0 = r8.zQ2()
            if (r0 == 0) goto L4c
            X.05YD r0 = r0.getTaskStatus()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.getValue()
        L28:
            boolean r2 = r0 instanceof X.C441120HRm
            r6 = 0
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository r0 = r8.zQ2()
            if (r0 == 0) goto L4a
            X.05YD r0 = r0.LJIIJ()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != r3) goto L4a
        L44:
            r4 = 0
            r1.<init>(r2, r3, r4, r6, r7)
            return r1
        L4a:
            r3 = 0
            goto L44
        L4c:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel.defaultState():X.002o");
    }

    public final C440500HPc yQ2() {
        return (C440500HPc) this.LL.getValue();
    }

    public final MixStudioStatusRepository zQ2() {
        return (MixStudioStatusRepository) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MixStudioResultsPageViewModel() {
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 635);
        this.LLILLL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS236S0000000_6.get$arr$(326), null, null, null);
        this.LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(289));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFB c1dfb = C0PEM.LIZJ;
        C23250099c.LIZLLL(assemVMScope, c1dfb, null, new C0HRU(this, null), 2);
        C23250099c.LIZLLL(getAssemVMScope(), c1dfb, null, new C0HRV(this, null), 2);
        C23250099c.LIZLLL(getAssemVMScope(), c1dfb, null, new C0HRW(this, null), 2);
    }

    public final InterfaceC440230HOb<? extends List<C440440HOw>> xQ2() {
        C05YD<List<Pair<Integer, String>>> c05ydLJIIL;
        List<Pair<Integer, String>> value;
        MixStudioStatusRepository mixStudioStatusRepositoryZQ2 = zQ2();
        if (mixStudioStatusRepositoryZQ2 != null && (c05ydLJIIL = mixStudioStatusRepositoryZQ2.LJIIL()) != null && (value = c05ydLJIIL.getValue()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
            Iterator<Pair<Integer, String>> it2 = value.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSecond());
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() > 2) {
                    return new C1373105Yz(ViewModelKt.getViewModelScope(this), null, arrayList);
                }
                String str = (String) C13LP.LJJJLL(arrayList);
                return (C10EU.LJIIZILJ(str) || str == null) ? new C0HKU(ViewModelKt.getViewModelScope(this)) : new C1372805Yw(ViewModelKt.getViewModelScope(this), null, str);
            }
        }
        return new C0HKU(ViewModelKt.getViewModelScope(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(X.InterfaceC1364105Vn<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel.DQ2(X.05Vn):java.lang.Object");
    }

    public final Object FQ2(InterfaceC1364105Vn<? super StickerItem> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        withState(new AwS585S0100000_6(c2252611DEt, 185));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0HRZ
            if (r0 == 0) goto L64
            r4 = r6
            X.0HRZ r4 = (X.C0HRZ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L4f
            if (r0 != r3) goto L6a
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != r3) goto L62
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository r0 = r5.zQ2()
            if (r0 == 0) goto L3e
            X.05YD r0 = r0.LJFF()
            if (r0 == 0) goto L3e
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L40
        L3e:
            X.13BV r2 = X.C13BV.INSTANCE
        L40:
            kotlin.jvm.internal.AwS372S0200000_6 r1 = new kotlin.jvm.internal.AwS372S0200000_6
            r0 = 82
            r1.<init>(r5, r2, r0)
            r5.withState(r1)
        L4a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L4f:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository r1 = r5.zQ2()
            if (r1 == 0) goto L62
            r4.LLILLL = r3
            r0 = 0
            java.lang.Object r1 = r1.LJIILIIL(r0, r4)
            if (r1 != r2) goto L22
            return r2
        L62:
            r3 = 0
            goto L4a
        L64:
            X.0HRZ r4 = new X.0HRZ
            r4.<init>(r5, r6)
            goto L12
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    public final void CQ2(Context context, FragmentManager fragmentManager) {
        StickerItem stickerItem;
        C440830HQj c440830HQj = (C440830HQj) C13LP.LJJJLZIJ(getState().LLILLL, getState().LL);
        if (c440830HQj != null && (stickerItem = c440830HQj.LIZ) != null) {
            C0HQV c0hqv = C0HQV.LIZ;
            EnumC441640HTm enumC441640HTm = yQ2().LLIZLLLIL;
            c0hqv.getClass();
            C0HQV.LIZLLL(context, fragmentManager, stickerItem, enumC441640HTm);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(android.content.Context r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0HRX
            if (r0 == 0) goto L3b
            r3 = r9
            X.0HRX r3 = (X.C0HRX) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r6 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILZ
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L7f
            java.lang.Object r8 = r3.LL
            android.content.Context r8 = (android.content.Context) r8
            X.C155000ia.LIZIZ(r6)
        L26:
            com.ss.android.ugc.aweme.im.common.model.StickerItem r6 = (com.ss.android.ugc.aweme.im.common.model.StickerItem) r6
            if (r6 != 0) goto L41
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r6)
            r3.LL = r8
            r3.LLILZ = r0
            java.lang.Object r6 = r7.FQ2(r3)
            if (r6 != r2) goto L26
            return r2
        L3b:
            X.0HRX r3 = new X.0HRX
            r3.<init>(r7, r9)
            goto L12
        L41:
            X.0Hs7 r2 = new X.0Hs7
            r2.<init>()
            X.0HPc r0 = r7.yQ2()
            java.lang.String r1 = r0.LLJI
            java.lang.String r0 = "mix_studio_share_panel"
            r2.LIZ(r8, r6, r1, r0)
            com.ss.android.ugc.aweme.im.common.model.StickerBase r0 = r6.stickerBase
            if (r0 == 0) goto L74
            java.lang.Long r1 = r0.id
            java.lang.Integer r0 = r0.stickerType
            if (r1 == 0) goto L74
            if (r0 == 0) goto L74
            int r5 = r0.intValue()
            long r3 = r1.longValue()
            X.0HQV r2 = X.C0HQV.LIZ
            kotlin.jvm.internal.AwS585S0100000_6 r1 = new kotlin.jvm.internal.AwS585S0100000_6
            r0 = 184(0xb8, float:2.58E-43)
            r1.<init>(r7, r0)
            r2.getClass()
            X.C0HQV.LJ(r5, r3, r1)
        L74:
            X.0HQV r0 = X.C0HQV.LIZ
            r0.getClass()
            X.C0HQV.LIZ(r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel.EQ2(android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(android.view.View r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel.wQ2(android.view.View, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(android.content.Context r10, androidx.fragment.app.FragmentManager r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            r4 = r10
            r5 = r11
            boolean r0 = r12 instanceof X.C0HRT
            if (r0 == 0) goto L41
            r3 = r12
            X.0HRT r3 = (X.C0HRT) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L14:
            java.lang.Object r6 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILZIL
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L7c
            androidx.fragment.app.FragmentManager r5 = r3.LLILLJJLI
            java.lang.Object r4 = r3.LL
            android.content.Context r4 = (android.content.Context) r4
            X.C155000ia.LIZIZ(r6)
        L2a:
            com.ss.android.ugc.aweme.im.common.model.StickerItem r6 = (com.ss.android.ugc.aweme.im.common.model.StickerItem) r6
            if (r6 != 0) goto L47
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r6)
            r3.LL = r4
            r3.LLILLJJLI = r5
            r3.LLILZIL = r0
            java.lang.Object r6 = r9.FQ2(r3)
            if (r6 != r2) goto L2a
            return r2
        L41:
            X.0HRT r3 = new X.0HRT
            r3.<init>(r9, r12)
            goto L14
        L47:
            X.0zpH r2 = com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel.LLILZIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[openSharePanel] sticker: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "ResultsPageViewModel"
            r2.LIZ(r0, r1)
            com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareFragment r3 = new com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareFragment
            r3.<init>()
            X.0HPc r0 = r9.yQ2()
            X.0HTm r7 = r0.LLIZLLLIL
            X.0HSR r8 = new X.0HSR
            X.0HPc r0 = r9.yQ2()
            java.lang.String r1 = r0.LLJI
            java.lang.String r0 = "mix_studio_share_panel"
            r8.<init>(r1, r0)
            r3.UR(r4, r5, r6, r7, r8)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel.AQ2(android.content.Context, androidx.fragment.app.FragmentManager, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(X.EnumC440980HQy r18, X.EnumC441640HTm r19, X.EnumC440380HOq r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel.BQ2(X.0HQy, X.0HTm, X.0HOq, boolean):void");
    }
}
