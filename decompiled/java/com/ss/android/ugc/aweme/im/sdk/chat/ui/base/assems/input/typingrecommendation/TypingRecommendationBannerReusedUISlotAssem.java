package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation;

import X.AnonymousClass0956;
import X.C019F;
import X.C09R3;
import X.C0ZHB;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1713806nQ;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C451310Hmr;
import X.C453470HqL;
import X.C453480HqM;
import X.C453490HqN;
import X.C724750Sbp;
import X.C814420VxA;
import X.C899980ZSi;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC453160Hpq;
import X.InterfaceC453460HqK;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatnotice.feature.suggestedstickers.TypingRecommendationStickerDataVM;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingRecommendationBannerReusedUISlotAssem extends ReusedUISlotAssem<TypingRecommendationBannerReusedUISlotAssem> implements InterfaceC712990Rxx<C899980ZSi> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public C453470HqL LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public AnonymousClass0956 LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TypingRecommendationBannerReusedUISlotAssem.class, "stickerDataVM", "getStickerDataVM()Lcom/ss/android/ugc/aweme/chatnotice/feature/suggestedstickers/TypingRecommendationStickerDataVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TypingRecommendationBannerReusedUISlotAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TypingRecommendationBannerReusedUISlotAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TypingRecommendationStickerDataVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 284), AFwS236S0000000_6.get$arr$(155), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 285), AFwS236S0000000_6.get$arr$(156), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.csg;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        int iIntValue;
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            C453470HqL c453470HqL = new C453470HqL(viewGroup.getContext(), null, 14);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c453470HqL);
            c453470HqL.setLayoutParams(layoutParams);
            Integer numValueOf = Integer.valueOf(C451310Hmr.LIZ().itemHeightDp);
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 72;
            }
            c453470HqL.setStickerItemSize(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)))));
            c453470HqL.setAnimationDisabled(true);
            c453470HqL.setDeferAnimationPlayback(true);
            viewGroup.addView(c453470HqL);
            this.LLJLIL = c453470HqL;
            AnonymousClass0956 anonymousClass0956 = this.LLJLILLLLZIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJLILLLLZIIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C453480HqM(this, null), 3);
            AnonymousClass0956 anonymousClass09562 = this.LLJLL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LLJLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C453490HqN(this, null), 3);
        }
    }

    public final void op(C1713806nQ c1713806nQ) {
        boolean z;
        String str;
        InterfaceC453460HqK interfaceC453460HqK;
        InterfaceC453160Hpq interfaceC453160Hpq;
        List<StickerItem> list;
        C453470HqL c453470HqL = this.LLJLIL;
        if (c453470HqL == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBanner: data=");
        int size = 0;
        if (c1713806nQ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", stickerCount=");
        if (c1713806nQ != null && (list = c1713806nQ.LIZ) != null) {
            size = list.size();
        }
        sbLIZ.append(size);
        sbLIZ.append(", qsid=");
        if (c1713806nQ != null) {
            str = c1713806nQ.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1713806nQ == null || c1713806nQ.LIZ.isEmpty() || (interfaceC453460HqK = c1713806nQ.LIZJ) == null || (interfaceC453160Hpq = c1713806nQ.LIZLLL) == null) {
            return;
        }
        c453470HqL.LIZJ(c1713806nQ.LIZ, c1713806nQ.LIZIZ, interfaceC453460HqK, interfaceC453160Hpq);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C899980ZSi c899980ZSi) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind: stickerData=");
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        if (((TypingRecommendationStickerDataVM) assemVMLazy.getValue()).LLILLJJLI.getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        op((C1713806nQ) ((TypingRecommendationStickerDataVM) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLJJLI.getValue());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C899980ZSi c899980ZSi) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C899980ZSi c899980ZSi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
